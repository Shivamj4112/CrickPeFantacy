package com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.WinningsAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/winnings/WinningsFragment;", "Lcom/crickpe/base/BaseFragment;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/WinningsAdapter;", "contestId", "", "getContestId", "()Ljava/lang/String;", "setContestId", "(Ljava/lang/String;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "observeData", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WinningsFragment.kt */
public final class WinningsFragment extends BaseFragment {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private WinningsAdapter adapter;
    private String contestId = "";
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WinningsFragment.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            iArr[Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getFragmentLayoutResId() {
        return C1188R.C1193layout.fragment_winnings;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final void setContestId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contestId = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        if (getArguments() != null) {
            this.contestId = String.valueOf(requireArguments().getString("contestId"));
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getContestWinnings(this.contestId);
            Log.v("contestId---->", this.contestId);
        }
        ((SwipeRefreshLayout) _$_findCachedViewById(C1188R.C1192id.swipeRv)).setOnRefreshListener(new WinningsFragment$$ExternalSyntheticLambda0(this));
        setAdapter();
        observeData();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m3581onViewCreated$lambda0(WinningsFragment winningsFragment) {
        Intrinsics.checkNotNullParameter(winningsFragment, "this$0");
        if (!Intrinsics.areEqual((Object) winningsFragment.contestId, (Object) "")) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) winningsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            DetailViewModel detailViewModel = winningsFragment.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getContestWinnings(winningsFragment.contestId);
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ContestWinningsModel>> contestWinnings = detailViewModel.getContestWinnings();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        contestWinnings.observe(viewLifecycleOwner, new WinningsFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3580observeData$lambda1(WinningsFragment winningsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(winningsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) winningsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                ProgressBar progressBar = (ProgressBar) winningsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ContestWinningsModel contestWinningsModel = (ContestWinningsModel) apiResponseHandler.getData();
                if (contestWinningsModel != null) {
                    if (contestWinningsModel.getWinning().size() == 0) {
                        RelativeLayout relativeLayout = (RelativeLayout) winningsFragment._$_findCachedViewById(C1188R.C1192id.relativeLayout3);
                        Intrinsics.checkNotNullExpressionValue(relativeLayout, "relativeLayout3");
                        CommonMethodsKt.hide(relativeLayout);
                    }
                    if (contestWinningsModel.getContest().getContestType().getTypeId() == 4) {
                        ((TextView) winningsFragment._$_findCachedViewById(C1188R.C1192id.tvPoolPrize)).setText(winningsFragment.getString(C1188R.string.glory));
                        ((TextView) winningsFragment._$_findCachedViewById(C1188R.C1192id.tvJoiningFee)).setText(winningsFragment.getString(C1188R.string.free));
                        ((TextView) winningsFragment._$_findCachedViewById(C1188R.C1192id.tvSpots)).setText(String.valueOf(contestWinningsModel.getContest().getTotalSpots()));
                        return;
                    }
                    WinningsAdapter winningsAdapter = winningsFragment.adapter;
                    if (winningsAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        winningsAdapter = null;
                    }
                    winningsAdapter.addList(true, contestWinningsModel.getWinning());
                    ((TextView) winningsFragment._$_findCachedViewById(C1188R.C1192id.tvPoolPrize)).setText(winningsFragment.numDifferentiation((double) contestWinningsModel.getContest().getWinningAmount()));
                    ((TextView) winningsFragment._$_findCachedViewById(C1188R.C1192id.tvSpots)).setText(String.valueOf(contestWinningsModel.getContest().getTotalSpots()));
                    ((TextView) winningsFragment._$_findCachedViewById(C1188R.C1192id.tvJoiningFee)).setText(winningsFragment.numDifferentiation((double) contestWinningsModel.getContest().getEntryFee()));
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = winningsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                winningsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) winningsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) winningsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) winningsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                    z = false;
                }
                if (z) {
                    ProgressBar progressBar3 = (ProgressBar) winningsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new WinningsAdapter(requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnings);
        WinningsAdapter winningsAdapter = null;
        if (recyclerView != null) {
            WinningsAdapter winningsAdapter2 = this.adapter;
            if (winningsAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                winningsAdapter2 = null;
            }
            recyclerView.setAdapter(winningsAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnings)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnings);
        WinningsAdapter winningsAdapter3 = this.adapter;
        if (winningsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            winningsAdapter = winningsAdapter3;
        }
        recyclerView2.setAdapter(winningsAdapter);
    }
}
