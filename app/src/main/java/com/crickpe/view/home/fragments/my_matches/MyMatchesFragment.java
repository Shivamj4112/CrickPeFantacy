package com.crickpe.view.home.fragments.my_matches;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.adapters.MyCompletedMatchesAdapter;
import com.crickpe.view.detail.adapters.MyCurrentMatchesAdapter;
import com.crickpe.view.home.HomeActivity;
import com.crickpe.view.home.HomeViewModel;
import com.crickpe.view.home.adapters.MyUpcomingMatchesAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u001dH\u0002J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!H\u0016J\u001a\u0010\"\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010%\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u0002\n\u0000R.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000¨\u0006&"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/my_matches/MyMatchesFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/MyCurrentMatchesAdapter;", "click", "", "getClick", "()I", "setClick", "(I)V", "completedMatchesAdapter", "Lcom/crickpe/view/detail/adapters/MyCompletedMatchesAdapter;", "instance", "matchesList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "Lkotlin/collections/ArrayList;", "getMatchesList", "()Ljava/util/ArrayList;", "setMatchesList", "(Ljava/util/ArrayList;)V", "upcomingMatchesAdapter", "Lcom/crickpe/view/home/adapters/MyUpcomingMatchesAdapter;", "viewModel", "Lcom/crickpe/view/home/HomeViewModel;", "getFragmentLayoutResId", "listeners", "", "observeData", "onClick", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyMatchesFragment.kt */
public final class MyMatchesFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private MyCurrentMatchesAdapter adapter;
    private int click;
    private MyCompletedMatchesAdapter completedMatchesAdapter;
    private MyMatchesFragment instance;
    private ArrayList<MyMatchesModel> matchesList;
    private MyUpcomingMatchesAdapter upcomingMatchesAdapter;
    private HomeViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyMatchesFragment.kt */
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
        return C1188R.C1193layout.fragment_my_matches;
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

    public final int getClick() {
        return this.click;
    }

    public final void setClick(int i) {
        this.click = i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.instance = this;
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCurrentMatches)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvUpcomingMatches)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCompleteMatches)).setOnClickListener(onClickListener);
        this.viewModel = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(C1188R.string.my_matches);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.my_matches)");
            ((HomeActivity) activity).setTitleBar(string);
            HomeViewModel homeViewModel = this.viewModel;
            if (homeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel = null;
            }
            homeViewModel.getMatchesApi(Constants.LIVE);
            listeners();
            observeData();
            setAdapter();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.home.HomeActivity");
    }

    private final void listeners() {
        ((SwipeRefreshLayout) _$_findCachedViewById(C1188R.C1192id.swipeRv)).setOnRefreshListener(new MyMatchesFragment$$ExternalSyntheticLambda1(this));
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.btnJoin)).setOnClickListener(new MyMatchesFragment$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-0  reason: not valid java name */
    public static final void m3718listeners$lambda0(MyMatchesFragment myMatchesFragment) {
        Intrinsics.checkNotNullParameter(myMatchesFragment, "this$0");
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) myMatchesFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        int i = myMatchesFragment.click;
        HomeViewModel homeViewModel = null;
        if (i == 0) {
            HomeViewModel homeViewModel2 = myMatchesFragment.viewModel;
            if (homeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                homeViewModel = homeViewModel2;
            }
            homeViewModel.getMatchesApi(Constants.LIVE);
        } else if (i != 1) {
            HomeViewModel homeViewModel3 = myMatchesFragment.viewModel;
            if (homeViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                homeViewModel = homeViewModel3;
            }
            homeViewModel.getMatchesApi(Constants.COMPLETED);
        } else {
            HomeViewModel homeViewModel4 = myMatchesFragment.viewModel;
            if (homeViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                homeViewModel = homeViewModel4;
            }
            homeViewModel.getMatchesApi(Constants.UPCOMING);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-1  reason: not valid java name */
    public static final void m3719listeners$lambda1(MyMatchesFragment myMatchesFragment, View view) {
        Intrinsics.checkNotNullParameter(myMatchesFragment, "this$0");
        Intent intent = new Intent(new Intent(myMatchesFragment.getContext(), DetailActivity.class));
        intent.putExtra("open", Constants.UPCOMING);
        Context context = myMatchesFragment.getContext();
        if (context != null) {
            context.startActivity(intent);
        }
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
        mymatches.observe(viewLifecycleOwner, new MyMatchesFragment$$ExternalSyntheticLambda0(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.crickpe.view.detail.adapters.MyCurrentMatchesAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: com.crickpe.view.home.adapters.MyUpcomingMatchesAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: com.crickpe.view.detail.adapters.MyCompletedMatchesAdapter} */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3720observeData$lambda2(MyMatchesFragment r5, ApiResponseHandler r6) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r6 != 0) goto L_0x0008
            return
        L_0x0008:
            com.crickpe.utils.apiHandling.Status r0 = r6.getStatus()
            int[] r1 = com.crickpe.view.home.fragments.my_matches.MyMatchesFragment.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            java.lang.String r1 = "progressBar"
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L_0x0087
            r4 = 2
            if (r0 == r4) goto L_0x0047
            r6 = 3
            if (r0 == r6) goto L_0x0022
            goto L_0x01da
        L_0x0022:
            int r6 = com.crickpe.C1188R.C1192id.swipeRv
            android.view.View r6 = r5._$_findCachedViewById(r6)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r6 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r6
            if (r6 == 0) goto L_0x0033
            boolean r6 = r6.isRefreshing()
            if (r6 != 0) goto L_0x0033
            r2 = 1
        L_0x0033:
            if (r2 == 0) goto L_0x01da
            int r6 = com.crickpe.C1188R.C1192id.progressBar
            android.view.View r5 = r5._$_findCachedViewById(r6)
            android.widget.ProgressBar r5 = (android.widget.ProgressBar) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)
            android.view.View r5 = (android.view.View) r5
            com.crickpe.utils.CommonMethodsKt.visible(r5)
            goto L_0x01da
        L_0x0047:
            int r0 = com.crickpe.C1188R.C1192id.progressBar
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.view.View r0 = (android.view.View) r0
            com.crickpe.utils.CommonMethodsKt.hide(r0)
            int r0 = com.crickpe.C1188R.C1192id.swipeRv
            android.view.View r0 = r5._$_findCachedViewById(r0)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            if (r0 != 0) goto L_0x0062
            goto L_0x0065
        L_0x0062:
            r0.setRefreshing(r2)
        L_0x0065:
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            java.lang.String r1 = "requireActivity()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            com.crickpe.utils.apiHandling.AppError r1 = r6.getError()
            r5.handleApiError(r0, r1)
            com.google.gson.Gson r5 = new com.google.gson.Gson
            r5.<init>()
            java.lang.String r5 = r5.toJson((java.lang.Object) r6)
            java.lang.String r6 = "ERROR"
            android.util.Log.v(r6, r5)
            goto L_0x01da
        L_0x0087:
            int r0 = com.crickpe.C1188R.C1192id.swipeRv
            android.view.View r0 = r5._$_findCachedViewById(r0)
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) r0
            if (r0 != 0) goto L_0x0092
            goto L_0x0095
        L_0x0092:
            r0.setRefreshing(r2)
        L_0x0095:
            java.lang.Object r6 = r6.getData()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r0 = com.crickpe.C1188R.C1192id.progressBar
            android.view.View r0 = r5._$_findCachedViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.view.View r0 = (android.view.View) r0
            com.crickpe.utils.CommonMethodsKt.hide(r0)
            if (r6 == 0) goto L_0x01da
            java.util.ArrayList<com.crickpe.view.home.fragments.my_matches.MyMatchesModel> r0 = r5.matchesList
            if (r0 == 0) goto L_0x00b4
            r0.clear()
        L_0x00b4:
            r5.matchesList = r6
            int r0 = r5.click
            r1 = 0
            java.lang.String r2 = "btnJoin"
            java.lang.String r4 = "rlNoData"
            if (r0 == 0) goto L_0x0180
            if (r0 == r3) goto L_0x0121
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x00ff
            com.crickpe.view.detail.adapters.MyCompletedMatchesAdapter r6 = r5.completedMatchesAdapter
            if (r6 != 0) goto L_0x00d4
            java.lang.String r6 = "completedMatchesAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            goto L_0x00d5
        L_0x00d4:
            r1 = r6
        L_0x00d5:
            java.util.ArrayList<com.crickpe.view.home.fragments.my_matches.MyMatchesModel> r6 = r5.matchesList
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r1.addList(r3, r6)
            int r6 = com.crickpe.C1188R.C1192id.rlNoData
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            android.view.View r6 = (android.view.View) r6
            com.crickpe.utils.CommonMethodsKt.hide(r6)
            int r6 = com.crickpe.C1188R.C1192id.btnJoin
            android.view.View r5 = r5._$_findCachedViewById(r6)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            android.view.View r5 = (android.view.View) r5
            com.crickpe.utils.CommonMethodsKt.hide(r5)
            goto L_0x01da
        L_0x00ff:
            int r6 = com.crickpe.C1188R.C1192id.rlNoData
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            android.view.View r6 = (android.view.View) r6
            com.crickpe.utils.CommonMethodsKt.visible(r6)
            int r6 = com.crickpe.C1188R.C1192id.btnJoin
            android.view.View r5 = r5._$_findCachedViewById(r6)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            android.view.View r5 = (android.view.View) r5
            com.crickpe.utils.CommonMethodsKt.visible(r5)
            goto L_0x01da
        L_0x0121:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x015f
            com.crickpe.view.home.adapters.MyUpcomingMatchesAdapter r6 = r5.upcomingMatchesAdapter
            if (r6 != 0) goto L_0x0134
            java.lang.String r6 = "upcomingMatchesAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            goto L_0x0135
        L_0x0134:
            r1 = r6
        L_0x0135:
            java.util.ArrayList<com.crickpe.view.home.fragments.my_matches.MyMatchesModel> r6 = r5.matchesList
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            r1.addList(r3, r6)
            int r6 = com.crickpe.C1188R.C1192id.rlNoData
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            android.view.View r6 = (android.view.View) r6
            com.crickpe.utils.CommonMethodsKt.hide(r6)
            int r6 = com.crickpe.C1188R.C1192id.btnJoin
            android.view.View r5 = r5._$_findCachedViewById(r6)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            android.view.View r5 = (android.view.View) r5
            com.crickpe.utils.CommonMethodsKt.hide(r5)
            goto L_0x01da
        L_0x015f:
            int r6 = com.crickpe.C1188R.C1192id.rlNoData
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            android.view.View r6 = (android.view.View) r6
            com.crickpe.utils.CommonMethodsKt.visible(r6)
            int r6 = com.crickpe.C1188R.C1192id.btnJoin
            android.view.View r5 = r5._$_findCachedViewById(r6)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            android.view.View r5 = (android.view.View) r5
            com.crickpe.utils.CommonMethodsKt.visible(r5)
            goto L_0x01da
        L_0x0180:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x01ba
            com.crickpe.view.detail.adapters.MyCurrentMatchesAdapter r6 = r5.adapter
            if (r6 != 0) goto L_0x0193
            java.lang.String r6 = "adapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            goto L_0x0194
        L_0x0193:
            r1 = r6
        L_0x0194:
            java.util.ArrayList<com.crickpe.view.home.fragments.my_matches.MyMatchesModel> r6 = r5.matchesList
            r1.addList(r3, r6)
            int r6 = com.crickpe.C1188R.C1192id.rlNoData
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            android.view.View r6 = (android.view.View) r6
            com.crickpe.utils.CommonMethodsKt.hide(r6)
            int r6 = com.crickpe.C1188R.C1192id.btnJoin
            android.view.View r5 = r5._$_findCachedViewById(r6)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            android.view.View r5 = (android.view.View) r5
            com.crickpe.utils.CommonMethodsKt.hide(r5)
            goto L_0x01da
        L_0x01ba:
            int r6 = com.crickpe.C1188R.C1192id.rlNoData
            android.view.View r6 = r5._$_findCachedViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            android.view.View r6 = (android.view.View) r6
            com.crickpe.utils.CommonMethodsKt.visible(r6)
            int r6 = com.crickpe.C1188R.C1192id.btnJoin
            android.view.View r5 = r5._$_findCachedViewById(r6)
            android.widget.RelativeLayout r5 = (android.widget.RelativeLayout) r5
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)
            android.view.View r5 = (android.view.View) r5
            com.crickpe.utils.CommonMethodsKt.visible(r5)
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.home.fragments.my_matches.MyMatchesFragment.m3720observeData$lambda2(com.crickpe.view.home.fragments.my_matches.MyMatchesFragment, com.crickpe.utils.apiHandling.ApiResponseHandler):void");
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        HomeViewModel homeViewModel = null;
        if (id == C1188R.C1192id.tvCompleteMatches) {
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCurrentMatches)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCurrent)).setBackground(getResources().getDrawable(C1188R.C1190drawable.circle_bg_grey_light));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvUpcomingMatches)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlUpcoming)).setBackground(getResources().getDrawable(C1188R.C1190drawable.circle_bg_grey_light));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCompleteMatches)).setTextColor(getResources().getColor(C1188R.C1189color.white));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCompleted)).setBackground(getResources().getDrawable(C1188R.C1190drawable.circle_bg_appcolor));
            ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivLive);
            Intrinsics.checkNotNullExpressionValue(imageView, "ivLive");
            CommonMethodsKt.hide(imageView);
            ImageView imageView2 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivUpcoming);
            Intrinsics.checkNotNullExpressionValue(imageView2, "ivUpcoming");
            CommonMethodsKt.hide(imageView2);
            ImageView imageView3 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivCompleted);
            Intrinsics.checkNotNullExpressionValue(imageView3, "ivCompleted");
            CommonMethodsKt.visible(imageView3);
            HomeViewModel homeViewModel2 = this.viewModel;
            if (homeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                homeViewModel = homeViewModel2;
            }
            homeViewModel.getMatchesApi(Constants.COMPLETED);
            this.click = 2;
            setAdapter();
        } else if (id == C1188R.C1192id.tvCurrentMatches) {
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCurrentMatches)).setTextColor(getResources().getColor(C1188R.C1189color.white));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCurrent)).setBackground(getResources().getDrawable(C1188R.C1190drawable.circle_bg_appcolor));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvUpcomingMatches)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlUpcoming)).setBackground(getResources().getDrawable(C1188R.C1190drawable.circle_bg_grey_light));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCompleteMatches)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCompleted)).setBackground(getResources().getDrawable(C1188R.C1190drawable.circle_bg_grey_light));
            ImageView imageView4 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivLive);
            Intrinsics.checkNotNullExpressionValue(imageView4, "ivLive");
            CommonMethodsKt.visible(imageView4);
            ImageView imageView5 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivUpcoming);
            Intrinsics.checkNotNullExpressionValue(imageView5, "ivUpcoming");
            CommonMethodsKt.hide(imageView5);
            ImageView imageView6 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivCompleted);
            Intrinsics.checkNotNullExpressionValue(imageView6, "ivCompleted");
            CommonMethodsKt.hide(imageView6);
            HomeViewModel homeViewModel3 = this.viewModel;
            if (homeViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                homeViewModel = homeViewModel3;
            }
            homeViewModel.getMatchesApi(Constants.LIVE);
            this.click = 0;
            setAdapter();
        } else if (id == C1188R.C1192id.tvUpcomingMatches) {
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCurrentMatches)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCurrent)).setBackground(getResources().getDrawable(C1188R.C1190drawable.circle_bg_grey_light));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvUpcomingMatches)).setTextColor(getResources().getColor(C1188R.C1189color.white));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlUpcoming)).setBackground(getResources().getDrawable(C1188R.C1190drawable.circle_bg_appcolor));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCompleteMatches)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCompleted)).setBackground(getResources().getDrawable(C1188R.C1190drawable.circle_bg_grey_light));
            ImageView imageView7 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivLive);
            Intrinsics.checkNotNullExpressionValue(imageView7, "ivLive");
            CommonMethodsKt.hide(imageView7);
            ImageView imageView8 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivUpcoming);
            Intrinsics.checkNotNullExpressionValue(imageView8, "ivUpcoming");
            CommonMethodsKt.visible(imageView8);
            ImageView imageView9 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivCompleted);
            Intrinsics.checkNotNullExpressionValue(imageView9, "ivCompleted");
            CommonMethodsKt.hide(imageView9);
            HomeViewModel homeViewModel4 = this.viewModel;
            if (homeViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                homeViewModel = homeViewModel4;
            }
            homeViewModel.getMatchesApi(Constants.UPCOMING);
            this.click = 1;
            setAdapter();
        }
    }

    private final void setAdapter() {
        int i = this.click;
        RecyclerView.Adapter adapter2 = null;
        if (i == 0) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            this.adapter = new MyCurrentMatchesAdapter(requireActivity);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches);
            if (recyclerView != null) {
                MyCurrentMatchesAdapter myCurrentMatchesAdapter = this.adapter;
                if (myCurrentMatchesAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    myCurrentMatchesAdapter = null;
                }
                recyclerView.setAdapter(myCurrentMatchesAdapter);
            }
            ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches);
            RecyclerView.Adapter adapter3 = this.adapter;
            if (adapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                adapter2 = adapter3;
            }
            recyclerView2.setAdapter(adapter2);
        } else if (i != 1) {
            this.completedMatchesAdapter = new MyCompletedMatchesAdapter();
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches);
            if (recyclerView3 != null) {
                MyCompletedMatchesAdapter myCompletedMatchesAdapter = this.completedMatchesAdapter;
                if (myCompletedMatchesAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("completedMatchesAdapter");
                    myCompletedMatchesAdapter = null;
                }
                recyclerView3.setAdapter(myCompletedMatchesAdapter);
            }
            ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches);
            RecyclerView.Adapter adapter4 = this.completedMatchesAdapter;
            if (adapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("completedMatchesAdapter");
            } else {
                adapter2 = adapter4;
            }
            recyclerView4.setAdapter(adapter2);
        } else {
            FragmentActivity requireActivity2 = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
            this.upcomingMatchesAdapter = new MyUpcomingMatchesAdapter(requireActivity2);
            RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches);
            if (recyclerView5 != null) {
                MyUpcomingMatchesAdapter myUpcomingMatchesAdapter = this.upcomingMatchesAdapter;
                if (myUpcomingMatchesAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("upcomingMatchesAdapter");
                    myUpcomingMatchesAdapter = null;
                }
                recyclerView5.setAdapter(myUpcomingMatchesAdapter);
            }
            ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
            RecyclerView recyclerView6 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyMatches);
            RecyclerView.Adapter adapter5 = this.upcomingMatchesAdapter;
            if (adapter5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("upcomingMatchesAdapter");
            } else {
                adapter2 = adapter5;
            }
            recyclerView6.setAdapter(adapter2);
        }
    }
}
