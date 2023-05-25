package com.crickpe.view.detail.fragments.my_matches_detail.tabs.leadereboard;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.leaderboard.LeaderboardModel;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.LeaderboardAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020\u001bH\u0016J\b\u0010#\u001a\u00020$H\u0002J\u0018\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\u001bH\u0016J\b\u0010(\u001a\u00020$H\u0002J\u001a\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u0010.\u001a\u00020$H\u0002J \u0010/\u001a\u00020$2\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0002X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001a\u001a\u00020\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u000e\u0010 \u001a\u00020!X.¢\u0006\u0002\n\u0000¨\u00060"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/leadereboard/LeaderboardFragment;", "Lcom/crickpe/base/BaseFragment;", "Lcom/crickpe/view/detail/adapters/LeaderboardAdapter$OnClick;", "onClick", "(Lcom/crickpe/view/detail/adapters/LeaderboardAdapter$OnClick;)V", "contestId", "", "getContestId", "()Ljava/lang/String;", "setContestId", "(Ljava/lang/String;)V", "data", "Ljava/util/ArrayList;", "Lcom/crickpe/data/leaderboard/LeaderboardModel;", "Lkotlin/collections/ArrayList;", "getData", "()Ljava/util/ArrayList;", "setData", "(Ljava/util/ArrayList;)V", "leaderboardAdapter", "Lcom/crickpe/view/detail/adapters/LeaderboardAdapter;", "moreData", "", "getOnClick", "()Lcom/crickpe/view/detail/adapters/LeaderboardAdapter$OnClick;", "setOnClick", "page", "", "getPage", "()I", "setPage", "(I)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "observeData", "", "onItemClick", "leaderboardModel", "position", "onRecyclerViewScrolled", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setPagination", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LeaderboardFragment.kt */
public final class LeaderboardFragment extends BaseFragment implements LeaderboardAdapter.OnClick {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private String contestId;
    private ArrayList<LeaderboardModel> data;
    private LeaderboardAdapter leaderboardAdapter;
    /* access modifiers changed from: private */
    public boolean moreData;
    private LeaderboardAdapter.OnClick onClick;
    private int page;
    /* access modifiers changed from: private */
    public DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: LeaderboardFragment.kt */
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
        return C1188R.C1193layout.fragment_leaderboard;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public LeaderboardFragment(LeaderboardAdapter.OnClick onClick2) {
        Intrinsics.checkNotNullParameter(onClick2, "onClick");
        this.onClick = onClick2;
        this.contestId = "";
        this.page = 1;
        this.data = new ArrayList<>();
    }

    public final LeaderboardAdapter.OnClick getOnClick() {
        return this.onClick;
    }

    public final void setOnClick(LeaderboardAdapter.OnClick onClick2) {
        Intrinsics.checkNotNullParameter(onClick2, "<set-?>");
        this.onClick = onClick2;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final void setContestId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contestId = str;
    }

    public final int getPage() {
        return this.page;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final ArrayList<LeaderboardModel> getData() {
        return this.data;
    }

    public final void setData(ArrayList<LeaderboardModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.data = arrayList;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.page = 1;
        if (getArguments() != null) {
            this.contestId = String.valueOf(requireArguments().getString("contestId"));
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getContestLeaderboardApi(this.contestId, this.page);
        }
        ((SwipeRefreshLayout) _$_findCachedViewById(C1188R.C1192id.swipeRv)).setOnRefreshListener(new LeaderboardFragment$$ExternalSyntheticLambda0(this));
        setAdapter();
        observeData();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m3573onViewCreated$lambda0(LeaderboardFragment leaderboardFragment) {
        Intrinsics.checkNotNullParameter(leaderboardFragment, "this$0");
        if (!Intrinsics.areEqual((Object) leaderboardFragment.contestId, (Object) "")) {
            leaderboardFragment.page = 1;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            DetailViewModel detailViewModel = leaderboardFragment.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getContestLeaderboardApi(leaderboardFragment.contestId, leaderboardFragment.page);
        }
    }

    private final void setPagination(ArrayList<LeaderboardModel> arrayList) {
        boolean z = true;
        if (this.page == 1) {
            if (arrayList.isEmpty()) {
                Log.v("MORE_DATaaaA", "NO");
            } else {
                Log.v("MORE_DATaaaA", "YES");
            }
        }
        boolean z2 = this.page == 1;
        LeaderboardAdapter leaderboardAdapter2 = this.leaderboardAdapter;
        if (leaderboardAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leaderboardAdapter");
            leaderboardAdapter2 = null;
        }
        leaderboardAdapter2.addList(z2, arrayList);
        if (arrayList.size() < 10) {
            z = false;
        }
        this.moreData = z;
    }

    private final void onRecyclerViewScrolled() {
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLeaderboard)).addOnScrollListener(new LeaderboardFragment$onRecyclerViewScrolled$1(this));
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<LeaderboardModel>>> contestLeaderBoard = detailViewModel.getContestLeaderBoard();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        contestLeaderBoard.observe(viewLifecycleOwner, new LeaderboardFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3572observeData$lambda1(LeaderboardFragment leaderboardFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(leaderboardFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                ProgressBar progressBar = (ProgressBar) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                Object data2 = apiResponseHandler.getData();
                Intrinsics.checkNotNull(data2);
                ArrayList<LeaderboardModel> arrayList = (ArrayList) data2;
                leaderboardFragment.data = arrayList;
                if (arrayList != null) {
                    if (arrayList.size() > 0) {
                        ImageView imageView = (ImageView) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.noDataImage);
                        Intrinsics.checkNotNullExpressionValue(imageView, "noDataImage");
                        CommonMethodsKt.hide(imageView);
                        TextView textView = (TextView) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                        Intrinsics.checkNotNullExpressionValue(textView, "tvNoData");
                        CommonMethodsKt.hide(textView);
                        LinearLayout linearLayout = (LinearLayout) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.linearLayout8);
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "linearLayout8");
                        CommonMethodsKt.visible(linearLayout);
                    } else if (leaderboardFragment.page == 1) {
                        ImageView imageView2 = (ImageView) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.noDataImage);
                        Intrinsics.checkNotNullExpressionValue(imageView2, "noDataImage");
                        CommonMethodsKt.visible(imageView2);
                        TextView textView2 = (TextView) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                        Intrinsics.checkNotNullExpressionValue(textView2, "tvNoData");
                        CommonMethodsKt.visible(textView2);
                        LinearLayout linearLayout2 = (LinearLayout) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.linearLayout8);
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "linearLayout8");
                        CommonMethodsKt.hide(linearLayout2);
                    }
                    leaderboardFragment.setPagination(leaderboardFragment.data);
                    return;
                }
                ImageView imageView3 = (ImageView) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.noDataImage);
                Intrinsics.checkNotNullExpressionValue(imageView3, "noDataImage");
                CommonMethodsKt.visible(imageView3);
                TextView textView3 = (TextView) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                Intrinsics.checkNotNullExpressionValue(textView3, "tvNoData");
                CommonMethodsKt.visible(textView3);
                LinearLayout linearLayout3 = (LinearLayout) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.linearLayout8);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "linearLayout8");
                CommonMethodsKt.hide(linearLayout3);
            } else if (i == 2) {
                Log.v("Leader_b", String.valueOf(apiResponseHandler.getData()));
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                    z = false;
                }
                if (z) {
                    ProgressBar progressBar3 = (ProgressBar) leaderboardFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.leaderboardAdapter = new LeaderboardAdapter(requireActivity, this);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLeaderboard);
        LeaderboardAdapter leaderboardAdapter2 = null;
        if (recyclerView != null) {
            LeaderboardAdapter leaderboardAdapter3 = this.leaderboardAdapter;
            if (leaderboardAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("leaderboardAdapter");
                leaderboardAdapter3 = null;
            }
            recyclerView.setAdapter(leaderboardAdapter3);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLeaderboard)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLeaderboard);
        LeaderboardAdapter leaderboardAdapter4 = this.leaderboardAdapter;
        if (leaderboardAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("leaderboardAdapter");
        } else {
            leaderboardAdapter2 = leaderboardAdapter4;
        }
        recyclerView2.setAdapter(leaderboardAdapter2);
        onRecyclerViewScrolled();
    }

    public void onItemClick(LeaderboardModel leaderboardModel, int i) {
        Intrinsics.checkNotNullParameter(leaderboardModel, "leaderboardModel");
        this.onClick.onItemClick(leaderboardModel, i);
    }
}
