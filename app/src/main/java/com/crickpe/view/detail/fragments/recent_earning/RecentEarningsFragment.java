package com.crickpe.view.detail.fragments.recent_earning;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.adapters.RecentEarningsAdapter;
import com.crickpe.view.home.HomeViewModel;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u001a\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/recent_earning/RecentEarningsFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "completedMatchesAdapter", "Lcom/crickpe/view/detail/adapters/RecentEarningsAdapter;", "instance", "matchesList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "Lkotlin/collections/ArrayList;", "getMatchesList", "()Ljava/util/ArrayList;", "setMatchesList", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/crickpe/view/home/HomeViewModel;", "getFragmentLayoutResId", "", "listeners", "", "observeData", "onClick", "view", "Landroid/view/View;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RecentEarningsFragment.kt */
public final class RecentEarningsFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private RecentEarningsAdapter completedMatchesAdapter;
    private RecentEarningsFragment instance;
    private ArrayList<MyMatchesModel> matchesList;
    private HomeViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: RecentEarningsFragment.kt */
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
        return C1188R.C1193layout.fragment_recent_earning;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final ArrayList<MyMatchesModel> getMatchesList() {
        return this.matchesList;
    }

    public final void setMatchesList(ArrayList<MyMatchesModel> arrayList) {
        this.matchesList = arrayList;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("Recent Earnings", true, false, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.instance = this;
        HomeViewModel homeViewModel = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
        this.viewModel = homeViewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.getMatchesApi(Constants.COMPLETED);
        listeners();
        observeData();
        setAdapter();
    }

    private final void listeners() {
        ((SwipeRefreshLayout) _$_findCachedViewById(C1188R.C1192id.swipeRv)).setOnRefreshListener(new RecentEarningsFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-0  reason: not valid java name */
    public static final void m3603listeners$lambda0(RecentEarningsFragment recentEarningsFragment) {
        Intrinsics.checkNotNullParameter(recentEarningsFragment, "this$0");
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        HomeViewModel homeViewModel = recentEarningsFragment.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.getMatchesApi(Constants.COMPLETED);
    }

    private final void observeData() {
        HomeViewModel homeViewModel = this.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<MyMatchesModel>>> mymatches = homeViewModel.getMymatches();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        mymatches.observe(viewLifecycleOwner, new RecentEarningsFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3604observeData$lambda1(RecentEarningsFragment recentEarningsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(recentEarningsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                ArrayList<MyMatchesModel> arrayList = (ArrayList) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (arrayList != null) {
                    ArrayList<MyMatchesModel> arrayList2 = recentEarningsFragment.matchesList;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                    }
                    recentEarningsFragment.matchesList = arrayList;
                    Intrinsics.checkNotNull(arrayList);
                    if (arrayList.size() > 0) {
                        RecentEarningsAdapter recentEarningsAdapter = recentEarningsFragment.completedMatchesAdapter;
                        if (recentEarningsAdapter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("completedMatchesAdapter");
                            recentEarningsAdapter = null;
                        }
                        ArrayList<MyMatchesModel> arrayList3 = recentEarningsFragment.matchesList;
                        Intrinsics.checkNotNull(arrayList3);
                        recentEarningsAdapter.addList(true, arrayList3);
                        TextView textView = (TextView) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                        Intrinsics.checkNotNullExpressionValue(textView, "tvNoData");
                        CommonMethodsKt.hide(textView);
                        return;
                    }
                    TextView textView2 = (TextView) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                    Intrinsics.checkNotNullExpressionValue(textView2, "tvNoData");
                    CommonMethodsKt.visible(textView2);
                    ((TextView) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.tvNoData)).setText(recentEarningsFragment.requireActivity().getResources().getString(C1188R.string.no_recently_matches_played_yet));
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                FragmentActivity requireActivity = recentEarningsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                recentEarningsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            } else if (i == 3) {
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                    z = false;
                }
                if (z) {
                    ProgressBar progressBar3 = (ProgressBar) recentEarningsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        view.getId();
    }

    private final void setAdapter() {
        this.completedMatchesAdapter = new RecentEarningsAdapter();
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches);
        RecentEarningsAdapter recentEarningsAdapter = null;
        if (recyclerView != null) {
            RecentEarningsAdapter recentEarningsAdapter2 = this.completedMatchesAdapter;
            if (recentEarningsAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("completedMatchesAdapter");
                recentEarningsAdapter2 = null;
            }
            recyclerView.setAdapter(recentEarningsAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches);
        RecentEarningsAdapter recentEarningsAdapter3 = this.completedMatchesAdapter;
        if (recentEarningsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("completedMatchesAdapter");
        } else {
            recentEarningsAdapter = recentEarningsAdapter3;
        }
        recyclerView2.setAdapter(recentEarningsAdapter);
    }
}
