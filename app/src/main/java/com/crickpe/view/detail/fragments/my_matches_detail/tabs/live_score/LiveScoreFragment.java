package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
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
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.LiveScoreAdapter;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.ScorecardModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u001a\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/LiveScoreFragment;", "Lcom/crickpe/base/BaseFragment;", "()V", "liveScoreAdapter", "Lcom/crickpe/view/detail/adapters/LiveScoreAdapter;", "matchId", "", "getMatchId", "()Ljava/lang/String;", "setMatchId", "(Ljava/lang/String;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "observeData", "", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LiveScoreFragment.kt */
public final class LiveScoreFragment extends BaseFragment {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private LiveScoreAdapter liveScoreAdapter;
    private String matchId = "";
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: LiveScoreFragment.kt */
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
        return C1188R.C1193layout.fragment_livescore;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        setAdapter();
        if (getArguments() != null) {
            String valueOf = String.valueOf(requireArguments().getString("matchId"));
            this.matchId = valueOf;
            Log.v(PrefsManager.MATCH_ID, valueOf);
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getScoreCardApi(this.matchId);
        }
        ((SwipeRefreshLayout) _$_findCachedViewById(C1188R.C1192id.swipeRv)).setOnRefreshListener(new LiveScoreFragment$$ExternalSyntheticLambda0(this));
        observeData();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m3575onViewCreated$lambda0(LiveScoreFragment liveScoreFragment) {
        Intrinsics.checkNotNullParameter(liveScoreFragment, "this$0");
        if (!Intrinsics.areEqual((Object) liveScoreFragment.matchId, (Object) "")) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) liveScoreFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            DetailViewModel detailViewModel = liveScoreFragment.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getScoreCardApi(liveScoreFragment.matchId);
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ScorecardModel>> scorecard = detailViewModel.getScorecard();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        scorecard.observe(viewLifecycleOwner, new LiveScoreFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3574observeData$lambda1(LiveScoreFragment liveScoreFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(liveScoreFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) liveScoreFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                ProgressBar progressBar = (ProgressBar) liveScoreFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ScorecardModel scorecardModel = (ScorecardModel) apiResponseHandler.getData();
                if (scorecardModel == null) {
                    return;
                }
                if (scorecardModel.getInningsArr().size() > 0) {
                    LiveScoreAdapter liveScoreAdapter2 = liveScoreFragment.liveScoreAdapter;
                    if (liveScoreAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("liveScoreAdapter");
                        liveScoreAdapter2 = null;
                    }
                    liveScoreAdapter2.addList(true, scorecardModel.getInningsArr());
                    ImageView imageView = (ImageView) liveScoreFragment._$_findCachedViewById(C1188R.C1192id.noDataImage);
                    Intrinsics.checkNotNullExpressionValue(imageView, "noDataImage");
                    CommonMethodsKt.hide(imageView);
                    return;
                }
                ImageView imageView2 = (ImageView) liveScoreFragment._$_findCachedViewById(C1188R.C1192id.noDataImage);
                Intrinsics.checkNotNullExpressionValue(imageView2, "noDataImage");
                CommonMethodsKt.visible(imageView2);
            } else if (i == 2) {
                FragmentActivity requireActivity = liveScoreFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                liveScoreFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ErROR", String.valueOf(apiResponseHandler.getData()));
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) liveScoreFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) liveScoreFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) liveScoreFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                    z = false;
                }
                if (z) {
                    ProgressBar progressBar3 = (ProgressBar) liveScoreFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.liveScoreAdapter = new LiveScoreAdapter(requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLivescore);
        LiveScoreAdapter liveScoreAdapter2 = null;
        if (recyclerView != null) {
            LiveScoreAdapter liveScoreAdapter3 = this.liveScoreAdapter;
            if (liveScoreAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("liveScoreAdapter");
                liveScoreAdapter3 = null;
            }
            recyclerView.setAdapter(liveScoreAdapter3);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLivescore)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLivescore);
        LiveScoreAdapter liveScoreAdapter4 = this.liveScoreAdapter;
        if (liveScoreAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveScoreAdapter");
        } else {
            liveScoreAdapter2 = liveScoreAdapter4;
        }
        recyclerView2.setAdapter(liveScoreAdapter2);
    }
}
