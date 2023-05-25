package com.crickpe.view.detail.fragments.my_matches_detail;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amplitude.android.Amplitude;
import com.amplitude.android.Configuration;
import com.amplitude.android.TrackingOptions;
import com.amplitude.core.LoggerProvider;
import com.amplitude.core.ServerZone;
import com.amplitude.core.StorageProvider;
import com.amplitude.core.events.EventOptions;
import com.amplitude.core.events.IngestionMetadata;
import com.amplitude.core.events.Plan;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.MyCompletedContestAdapter;
import com.crickpe.view.detail.adapters.MyLiveContestAdapter;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.MyContestModel;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010-\u001a\u00020\tJ\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u000201H\u0002J\u0010\u00103\u001a\u0002012\u0006\u00104\u001a\u000205H\u0016J\u0010\u00106\u001a\u0002012\u0006\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000201H\u0016J\u001a\u0010:\u001a\u0002012\u0006\u00104\u001a\u0002052\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u000201H\u0002J\b\u0010>\u001a\u000201H\u0002J\u0010\u0010?\u001a\u0002012\u0006\u0010@\u001a\u00020AH\u0002J\u0010\u0010B\u001a\u0002012\u0006\u0010@\u001a\u00020CH\u0003J\u0016\u0010D\u001a\u0002012\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020HR\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X.¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X.¢\u0006\u0002\n\u0000¨\u0006I"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/MyMatchDetailFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter$OnItemClicked;", "Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter$OnItemClicked;", "()V", "amplitude", "Lcom/amplitude/android/Amplitude;", "apiCalled", "", "getApiCalled", "()Z", "setApiCalled", "(Z)V", "apiHit", "getApiHit", "setApiHit", "liveMatchData", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "getLiveMatchData", "()Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "setLiveMatchData", "(Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;)V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "mRunnableTask", "Ljava/lang/Runnable;", "matchId", "", "getMatchId", "()Ljava/lang/String;", "setMatchId", "(Ljava/lang/String;)V", "myCompletedContestAdapter", "Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter;", "myLiveContestAdapter", "Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter;", "playersPotData", "Lcom/crickpe/view/detail/fragments/my_matches_detail/PlayersPotModel;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "backHandle", "getFragmentLayoutResId", "", "listeners", "", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClicked", "myContestModel", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestModel;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setCompletedAdapter", "setData", "data", "Lcom/crickpe/view/detail/fragments/my_matches_detail/MyMatchDetailModel;", "setLiveScoreData", "Lcom/crickpe/view/detail/fragments/my_matches_detail/LiveScoreModel;", "setNumber", "textView", "Landroid/widget/TextView;", "value", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyMatchDetailFragment.kt */
public final class MyMatchDetailFragment extends BaseFragment implements View.OnClickListener, MyLiveContestAdapter.OnItemClicked, MyCompletedContestAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Amplitude amplitude;
    private boolean apiCalled;
    private boolean apiHit;
    private MyMatchesModel liveMatchData;
    private Handler mHandler;
    private Runnable mRunnableTask;
    private String matchId = "";
    private MyCompletedContestAdapter myCompletedContestAdapter;
    private MyLiveContestAdapter myLiveContestAdapter;
    private PlayersPotModel playersPotData;
    /* access modifiers changed from: private */
    public DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyMatchDetailFragment.kt */
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
        return C1188R.C1193layout.fragment_my_match_detail;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MyMatchDetailFragment() {
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        this.mHandler = new Handler(myLooper);
        this.mRunnableTask = new MyMatchDetailFragment$mRunnableTask$1(this);
    }

    public final MyMatchesModel getLiveMatchData() {
        return this.liveMatchData;
    }

    public final void setLiveMatchData(MyMatchesModel myMatchesModel) {
        this.liveMatchData = myMatchesModel;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
    }

    public final Handler getMHandler() {
        return this.mHandler;
    }

    public final void setMHandler(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.mHandler = handler;
    }

    public final boolean getApiCalled() {
        return this.apiCalled;
    }

    public final void setApiCalled(boolean z) {
        this.apiCalled = z;
    }

    public final boolean getApiHit() {
        return this.apiHit;
    }

    public final void setApiHit(boolean z) {
        this.apiHit = z;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        if (UserManager.INSTANCE.getLiveMatch() != null) {
            this.liveMatchData = UserManager.INSTANCE.getLiveMatch();
        }
        if (!Intrinsics.areEqual((Object) UserManager.INSTANCE.getMatchId().toString(), (Object) "null")) {
            this.matchId = UserManager.INSTANCE.getMatchId();
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getMatchDetailApi(this.matchId);
        }
        setAdapter();
        setCompletedAdapter();
        listeners();
        observeData();
        this.apiHit = true;
    }

    public void onResume() {
        super.onResume();
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) _$_findCachedViewById(C1188R.C1192id.shimmer_view_container);
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "shimmer_view_container");
        CommonMethodsKt.visible(shimmerFrameLayout);
        ((ShimmerFrameLayout) _$_findCachedViewById(C1188R.C1192id.shimmer_view_container)).startShimmerAnimation();
    }

    private final void listeners() {
        ((CardView) _$_findCachedViewById(C1188R.C1192id.cvPlayersPot)).setOnClickListener(this);
        ((SwipeRefreshLayout) _$_findCachedViewById(C1188R.C1192id.swipeRv)).setOnRefreshListener(new MyMatchDetailFragment$$ExternalSyntheticLambda0(this));
        try {
            if (UserManager.INSTANCE.getClick() != 2) {
                this.mHandler.postDelayed(this.mRunnableTask, 20000);
            }
        } catch (Exception e) {
            Log.v("mRunnableTask", e.toString());
        }
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
        String str = Constants.EVENT_LIVE_MATCH;
        Configuration configuration = r4;
        Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
        this.amplitude = new Amplitude(configuration);
        try {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            String str2 = str;
            CommonMethodsKt.callAppsFlyer(requireActivity, this.matchId, "match_id", str2);
            Bundle bundle = new Bundle();
            bundle.putString("match_id", this.matchId.toString());
            ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(str2, bundle);
            Amplitude amplitude2 = this.amplitude;
            if (amplitude2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                amplitude2 = null;
            }
            com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_LIVE_MATCH, (Map) null, (EventOptions) null, 6, (Object) null);
        } catch (Exception e2) {
            Log.e("Analytics", e2.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-0  reason: not valid java name */
    public static final void m3568listeners$lambda0(MyMatchDetailFragment myMatchDetailFragment) {
        Intrinsics.checkNotNullParameter(myMatchDetailFragment, "this$0");
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        DetailViewModel detailViewModel = myMatchDetailFragment.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getLiveScoreApi(myMatchDetailFragment.matchId);
        DetailViewModel detailViewModel3 = myMatchDetailFragment.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        detailViewModel2.getPlayersPotApi(myMatchDetailFragment.matchId);
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<MyMatchDetailModel>> myMatchesdetail = detailViewModel.getMyMatchesdetail();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        myMatchesdetail.observe(viewLifecycleOwner, new MyMatchDetailFragment$$ExternalSyntheticLambda1(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<LiveScoreModel>> liveScore = detailViewModel3.getLiveScore();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        liveScore.observe(viewLifecycleOwner2, new MyMatchDetailFragment$$ExternalSyntheticLambda2(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel4;
        }
        SingleLiveEvent<ApiResponseHandler<PlayersPotModel>> playersPot = detailViewModel2.getPlayersPot();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        playersPot.observe(viewLifecycleOwner3, new MyMatchDetailFragment$$ExternalSyntheticLambda3(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3569observeData$lambda1(MyMatchDetailFragment myMatchDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(myMatchDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                Log.e("Apiii", "hit");
                myMatchDetailFragment.apiCalled = true;
                MyMatchDetailModel myMatchDetailModel = (MyMatchDetailModel) apiResponseHandler.getData();
                if (myMatchDetailModel != null) {
                    DetailViewModel detailViewModel = myMatchDetailFragment.viewModel;
                    if (detailViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        detailViewModel = null;
                    }
                    detailViewModel.getPlayersPotApi(myMatchDetailFragment.matchId);
                    myMatchDetailFragment.setData(myMatchDetailModel);
                }
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                ((ShimmerFrameLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container)).stopShimmerAnimation();
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container);
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "shimmer_view_container");
                CommonMethodsKt.hide(shimmerFrameLayout);
            } else if (i == 2) {
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                ((ShimmerFrameLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container)).stopShimmerAnimation();
                ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container);
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "shimmer_view_container");
                CommonMethodsKt.hide(shimmerFrameLayout2);
            } else if (i == 3) {
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                    z = false;
                }
                if (z && !myMatchDetailFragment.apiCalled) {
                    ((ShimmerFrameLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container)).startShimmerAnimation();
                    ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container);
                    Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout3, "shimmer_view_container");
                    CommonMethodsKt.visible(shimmerFrameLayout3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3570observeData$lambda2(MyMatchDetailFragment myMatchDetailFragment, ApiResponseHandler apiResponseHandler) {
        SwipeRefreshLayout swipeRefreshLayout;
        Intrinsics.checkNotNullParameter(myMatchDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                myMatchDetailFragment.apiCalled = true;
                LiveScoreModel liveScoreModel = (LiveScoreModel) apiResponseHandler.getData();
                if (liveScoreModel != null) {
                    myMatchDetailFragment.setLiveScoreData(liveScoreModel);
                }
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
            } else if (i == 2 && (swipeRefreshLayout = (SwipeRefreshLayout) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.swipeRv)) != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-3  reason: not valid java name */
    public static final void m3571observeData$lambda3(MyMatchDetailFragment myMatchDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(myMatchDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                PlayersPotModel playersPotModel = (PlayersPotModel) apiResponseHandler.getData();
                if (playersPotModel != null) {
                    try {
                        myMatchDetailFragment.playersPotData = playersPotModel;
                        ((TextView) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.tvPointss)).setText(myMatchDetailFragment.numDifferentiation(playersPotModel.getTotalEarning()));
                        if (playersPotModel.getPlayers().size() == 0) {
                            CardView cardView = (CardView) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.cvPlayersPot);
                            Intrinsics.checkNotNullExpressionValue(cardView, "cvPlayersPot");
                            CommonMethodsKt.hide(cardView);
                        } else {
                            CardView cardView2 = (CardView) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.cvPlayersPot);
                            Intrinsics.checkNotNullExpressionValue(cardView2, "cvPlayersPot");
                            CommonMethodsKt.visible(cardView2);
                        }
                        PlayersPotModel playersPotModel2 = myMatchDetailFragment.playersPotData;
                        Intrinsics.checkNotNull(playersPotModel2);
                        if (playersPotModel2.getPlayers().size() > 1) {
                            PlayersPotModel playersPotModel3 = myMatchDetailFragment.playersPotData;
                            Intrinsics.checkNotNull(playersPotModel3);
                            ((TextView) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerNameOne)).setText(playersPotModel3.getPlayers().get(0).getName());
                            RequestManager with = Glide.with((Fragment) myMatchDetailFragment);
                            StringBuilder sb = new StringBuilder();
                            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                            String str = null;
                            sb.append(appSettings != null ? appSettings.getImageBaseUrl() : null);
                            PlayersPotModel playersPotModel4 = myMatchDetailFragment.playersPotData;
                            Intrinsics.checkNotNull(playersPotModel4);
                            sb.append(playersPotModel4.getPlayers().get(0).getImageUrl());
                            with.load(sb.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerImageOne));
                            PlayersPotModel playersPotModel5 = myMatchDetailFragment.playersPotData;
                            Intrinsics.checkNotNull(playersPotModel5);
                            ((TextView) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerNameTwo)).setText(playersPotModel5.getPlayers().get(1).getName());
                            RequestManager with2 = Glide.with((Fragment) myMatchDetailFragment);
                            StringBuilder sb2 = new StringBuilder();
                            SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                            if (appSettings2 != null) {
                                str = appSettings2.getImageBaseUrl();
                            }
                            sb2.append(str);
                            PlayersPotModel playersPotModel6 = myMatchDetailFragment.playersPotData;
                            Intrinsics.checkNotNull(playersPotModel6);
                            sb2.append(playersPotModel6.getPlayers().get(1).getImageUrl());
                            with2.load(sb2.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) myMatchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerImageTwo));
                        }
                    } catch (Exception e) {
                        Log.v("PlayersPot", e.toString());
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = myMatchDetailFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                myMatchDetailFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    private final void setData(MyMatchDetailModel myMatchDetailModel) {
        CharSequence charSequence;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (myMatchDetailModel.getLiveScore() != null) {
            try {
                if (myMatchDetailModel.getLiveScore().getInnings().size() > 1) {
                    if (myMatchDetailModel.getLiveScore().getInnings().get(0).getTeamIconUrl() != null) {
                        str2 = myMatchDetailModel.getLiveScore().getInnings().get(0).getTeamIconUrl();
                    } else {
                        str2 = "";
                    }
                    if (myMatchDetailModel.getLiveScore().getInnings().get(1).getTeamIconUrl() != null) {
                        str3 = myMatchDetailModel.getLiveScore().getInnings().get(1).getTeamIconUrl();
                    } else {
                        str3 = "";
                    }
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        ((DetailActivity) activity).setImageDynamically(str2, str3);
                        String str6 = myMatchDetailModel.getLiveScore().getInnings().get(0).getCode() + " vs " + myMatchDetailModel.getLiveScore().getInnings().get(1).getCode();
                        FragmentActivity activity2 = getActivity();
                        if (activity2 != null) {
                            ((DetailActivity) activity2).setTopBar(str6, true, false, false, false, false, false, false);
                            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT2Name)).setText(myMatchDetailModel.getLiveScore().getInnings().get(1).getCode());
                            StringBuilder sb = new StringBuilder();
                            sb.append(myMatchDetailModel.getLiveScore().getInnings().get(1).getRuns());
                            sb.append('/');
                            sb.append(myMatchDetailModel.getLiveScore().getInnings().get(1).getWickets());
                            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvScoreTeam2)).setText(sb.toString());
                            CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam2Flag);
                            Intrinsics.checkNotNullExpressionValue(circleImageView, "ivTeam2Flag");
                            ImageView imageView = circleImageView;
                            String teamIconUrl = myMatchDetailModel.getLiveScore().getInnings().get(1).getTeamIconUrl();
                            if (teamIconUrl == null) {
                                str4 = "";
                            } else {
                                str4 = teamIconUrl;
                            }
                            ExtensionsKt.loadImage$default(imageView, str4, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append('(');
                            sb2.append(myMatchDetailModel.getLiveScore().getInnings().get(1).getOvers());
                            sb2.append(')');
                            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvOversT2)).setText(sb2.toString());
                            CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam1Flag);
                            Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivTeam1Flag");
                            ImageView imageView2 = circleImageView2;
                            String teamIconUrl2 = myMatchDetailModel.getLiveScore().getInnings().get(0).getTeamIconUrl();
                            if (teamIconUrl2 == null) {
                                str5 = "";
                            } else {
                                str5 = teamIconUrl2;
                            }
                            ExtensionsKt.loadImage$default(imageView2, str5, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Name)).setText(myMatchDetailModel.getLiveScore().getInnings().get(0).getCode());
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(myMatchDetailModel.getLiveScore().getInnings().get(0).getRuns());
                            sb3.append('/');
                            sb3.append(myMatchDetailModel.getLiveScore().getInnings().get(0).getWickets());
                            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Score)).setText(sb3.toString());
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append('(');
                            sb4.append(myMatchDetailModel.getLiveScore().getInnings().get(0).getOvers());
                            sb4.append(')');
                            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Overs)).setText(sb4.toString());
                            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerName)).setText(myMatchDetailModel.getLiveScore().getBowler().getName());
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(myMatchDetailModel.getLiveScore().getBowler().getWickets());
                            sb5.append('/');
                            sb5.append(myMatchDetailModel.getLiveScore().getBowler().getRun());
                            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerStat)).setText(sb5.toString());
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append('(');
                            sb6.append(myMatchDetailModel.getLiveScore().getBowler().getOvers());
                            sb6.append(')');
                            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerOver)).setText(sb6.toString());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
                    }
                } else if (myMatchDetailModel.getLiveScore().getInnings().size() == 1) {
                    CircleImageView circleImageView3 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam1Flag);
                    Intrinsics.checkNotNullExpressionValue(circleImageView3, "ivTeam1Flag");
                    ImageView imageView3 = circleImageView3;
                    String teamIconUrl3 = myMatchDetailModel.getLiveScore().getInnings().get(0).getTeamIconUrl();
                    if (teamIconUrl3 == null) {
                        str = "";
                    } else {
                        str = teamIconUrl3;
                    }
                    ExtensionsKt.loadImage$default(imageView3, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Name)).setText(myMatchDetailModel.getLiveScore().getInnings().get(0).getCode());
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(myMatchDetailModel.getLiveScore().getInnings().get(0).getRuns());
                    sb7.append('/');
                    sb7.append(myMatchDetailModel.getLiveScore().getInnings().get(0).getWickets());
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Score)).setText(sb7.toString());
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append('(');
                    sb8.append(myMatchDetailModel.getLiveScore().getInnings().get(0).getOvers());
                    sb8.append(')');
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Overs)).setText(sb8.toString());
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerName)).setText(myMatchDetailModel.getLiveScore().getBowler().getName());
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append(myMatchDetailModel.getLiveScore().getBowler().getWickets());
                    sb9.append('/');
                    sb9.append(myMatchDetailModel.getLiveScore().getBowler().getRun());
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerStat)).setText(sb9.toString());
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append('(');
                    sb10.append(myMatchDetailModel.getLiveScore().getBowler().getOvers());
                    sb10.append(')');
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerOver)).setText(sb10.toString());
                }
            } catch (Exception e) {
                Log.v("liveScore.innings", e.toString());
            }
            try {
                if (myMatchDetailModel.getLiveScore().getBatsmanNonStriker() != null) {
                    CharSequence name = myMatchDetailModel.getLiveScore().getBatsmanNonStriker().getName();
                    if (name.length() == 0) {
                        name = "";
                    }
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBatsman1)).setText(((String) name) + ' ' + myMatchDetailModel.getLiveScore().getBatsmanNonStriker().getRun() + '(' + myMatchDetailModel.getLiveScore().getBatsmanNonStriker().getBall() + ')');
                }
            } catch (Exception e2) {
                Log.v("batsmanNonStriker", e2.toString());
            }
            try {
                if (myMatchDetailModel.getLiveScore().getBatsmanStriker() != null) {
                    CharSequence name2 = myMatchDetailModel.getLiveScore().getBatsmanStriker().getName();
                    if (name2.length() == 0) {
                        name2 = "";
                    }
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBatsman2)).setText(((String) name2) + "* " + myMatchDetailModel.getLiveScore().getBatsmanStriker().getRun() + '(' + myMatchDetailModel.getLiveScore().getBatsmanStriker().getBall() + ')');
                }
            } catch (Exception e3) {
                Log.v("batsmanStriker", e3.toString());
            }
            try {
                ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer)).removeAllViews();
                int size = myMatchDetailModel.getLiveScore().getBalls().size();
                int i = 0;
                while (i < size) {
                    View inflate = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.adapter_ball_count, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer), false);
                    Intrinsics.checkNotNullExpressionValue(inflate, "from(requireActivity())\n… llBallsContainer, false)");
                    View findViewById = inflate.findViewById(C1188R.C1192id.tvBallLabel);
                    if (findViewById != null) {
                        TextView textView = (TextView) findViewById;
                        textView.setText(myMatchDetailModel.getLiveScore().getBalls().get(i).getLabel().toString());
                        if (i == myMatchDetailModel.getLiveScore().getBalls().size() - 1) {
                            textView.setBackground(requireActivity().getDrawable(C1188R.C1190drawable.circle_bg_appcolor));
                            textView.setTextColor(getResources().getColor(C1188R.C1189color.white));
                        }
                        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer)).addView(inflate);
                        i++;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                }
                if (myMatchDetailModel.getLiveScore().getBalls().size() < 6) {
                    int size2 = 6 - myMatchDetailModel.getLiveScore().getBalls().size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        View inflate2 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.adapter_ball_count, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer), false);
                        Intrinsics.checkNotNullExpressionValue(inflate2, "from(requireActivity())\n… llBallsContainer, false)");
                        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer)).addView(inflate2);
                    }
                }
            } catch (Exception e4) {
                Log.v("liveScore.balls", e4.toString());
            }
        }
        if (myMatchDetailModel.getContest().size() > 0) {
            MyLiveContestAdapter myLiveContestAdapter2 = this.myLiveContestAdapter;
            MyCompletedContestAdapter myCompletedContestAdapter2 = null;
            if (myLiveContestAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myLiveContestAdapter");
                myLiveContestAdapter2 = null;
            }
            myLiveContestAdapter2.addList(true, myMatchDetailModel.getContest());
            MyCompletedContestAdapter myCompletedContestAdapter3 = this.myCompletedContestAdapter;
            if (myCompletedContestAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myCompletedContestAdapter");
            } else {
                myCompletedContestAdapter2 = myCompletedContestAdapter3;
            }
            myCompletedContestAdapter2.addList(true, myMatchDetailModel.getContest());
            int size3 = myMatchDetailModel.getContest().size();
            double d = 0.0d;
            for (int i3 = 0; i3 < size3; i3++) {
                int size4 = myMatchDetailModel.getContest().get(i3).getFantasyTeams().size();
                for (int i4 = 0; i4 < size4; i4++) {
                    myMatchDetailModel.getContest().get(i3).getFantasyTeams().get(i4).getAmount();
                    d += (double) myMatchDetailModel.getContest().get(i3).getFantasyTeams().get(i4).getAmount();
                }
            }
            if (d > 0.0d) {
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llWon);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "llWon");
                CommonMethodsKt.visible(linearLayout);
                TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvYouWon);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvYouWon");
                setNumber(textView2, d);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llWon);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "llWon");
                CommonMethodsKt.hide(linearLayout2);
            }
            if (UserManager.INSTANCE.getContestClick() == 0) {
                RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopContest);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "rvTopContest");
                CommonMethodsKt.visible(recyclerView);
                RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvCompletedContest);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvCompletedContest");
                CommonMethodsKt.hide(recyclerView2);
                LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llWon);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "llWon");
                CommonMethodsKt.hide(linearLayout3);
                LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMatchLive);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "llMatchLive");
                CommonMethodsKt.visible(linearLayout4);
                LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMatchCompleted);
                Intrinsics.checkNotNullExpressionValue(linearLayout5, "llMatchCompleted");
                CommonMethodsKt.hide(linearLayout5);
            }
            if (UserManager.INSTANCE.getContestClick() == 2) {
                LinearLayout linearLayout6 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMatchCompleted);
                Intrinsics.checkNotNullExpressionValue(linearLayout6, "llMatchCompleted");
                CommonMethodsKt.visible(linearLayout6);
                RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvCompletedContest);
                Intrinsics.checkNotNullExpressionValue(recyclerView3, "rvCompletedContest");
                CommonMethodsKt.visible(recyclerView3);
                LinearLayout linearLayout7 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llLiveMatch);
                Intrinsics.checkNotNullExpressionValue(linearLayout7, "llLiveMatch");
                CommonMethodsKt.hide(linearLayout7);
                LinearLayout linearLayout8 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMatchLive);
                Intrinsics.checkNotNullExpressionValue(linearLayout8, "llMatchLive");
                CommonMethodsKt.hide(linearLayout8);
                RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopContest);
                Intrinsics.checkNotNullExpressionValue(recyclerView4, "rvTopContest");
                CommonMethodsKt.hide(recyclerView4);
            }
            if (myMatchDetailModel.getLiveScore() == null) {
                return;
            }
            if (myMatchDetailModel.getLiveScore().getResult() != null) {
                TextView textView3 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvMsg);
                String msg = myMatchDetailModel.getLiveScore().getResult().getMsg();
                if (msg != null) {
                    charSequence = msg;
                } else {
                    charSequence = "";
                }
                textView3.setText(charSequence);
                LinearLayout linearLayout9 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMsg);
                Intrinsics.checkNotNullExpressionValue(linearLayout9, "llMsg");
                CommonMethodsKt.visible(linearLayout9);
                LinearLayout linearLayout10 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llLiveMatch);
                Intrinsics.checkNotNullExpressionValue(linearLayout10, "llLiveMatch");
                CommonMethodsKt.hide(linearLayout10);
            } else if (myMatchDetailModel.getLiveScore().getPlayStatus() == null) {
                LinearLayout linearLayout11 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llLiveMatch);
                Intrinsics.checkNotNullExpressionValue(linearLayout11, "llLiveMatch");
                CommonMethodsKt.visible(linearLayout11);
                LinearLayout linearLayout12 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMsg);
                Intrinsics.checkNotNullExpressionValue(linearLayout12, "llMsg");
                CommonMethodsKt.hide(linearLayout12);
            } else {
                LinearLayout linearLayout13 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llLiveMatch);
                Intrinsics.checkNotNullExpressionValue(linearLayout13, "llLiveMatch");
                CommonMethodsKt.hide(linearLayout13);
                LinearLayout linearLayout14 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMsg);
                Intrinsics.checkNotNullExpressionValue(linearLayout14, "llMsg");
                CommonMethodsKt.visible(linearLayout14);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvMsg)).setText(myMatchDetailModel.getLiveScore().getPlayStatus().toString());
            }
        }
    }

    private final void setLiveScoreData(LiveScoreModel liveScoreModel) {
        String str = "";
        try {
            if (liveScoreModel.getInnings().size() > 1) {
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT2Name)).setText(liveScoreModel.getInnings().get(1).getCode());
                StringBuilder sb = new StringBuilder();
                sb.append(liveScoreModel.getInnings().get(1).getRuns());
                sb.append('/');
                sb.append(liveScoreModel.getInnings().get(1).getWickets());
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvScoreTeam2)).setText(sb.toString());
                CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam2Flag);
                Intrinsics.checkNotNullExpressionValue(circleImageView, "ivTeam2Flag");
                ImageView imageView = circleImageView;
                String teamIconUrl = liveScoreModel.getInnings().get(1).getTeamIconUrl();
                ExtensionsKt.loadImage$default(imageView, teamIconUrl == null ? str : teamIconUrl, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                StringBuilder sb2 = new StringBuilder();
                sb2.append('(');
                sb2.append(liveScoreModel.getInnings().get(1).getOvers());
                sb2.append(')');
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvOversT2)).setText(sb2.toString());
                CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam1Flag);
                Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivTeam1Flag");
                ImageView imageView2 = circleImageView2;
                String teamIconUrl2 = liveScoreModel.getInnings().get(0).getTeamIconUrl();
                ExtensionsKt.loadImage$default(imageView2, teamIconUrl2 == null ? str : teamIconUrl2, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Name)).setText(liveScoreModel.getInnings().get(0).getCode());
                StringBuilder sb3 = new StringBuilder();
                sb3.append(liveScoreModel.getInnings().get(0).getRuns());
                sb3.append('/');
                sb3.append(liveScoreModel.getInnings().get(0).getWickets());
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Score)).setText(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append('(');
                sb4.append(liveScoreModel.getInnings().get(0).getOvers());
                sb4.append(')');
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Overs)).setText(sb4.toString());
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerName)).setText(liveScoreModel.getBowler().getName());
                StringBuilder sb5 = new StringBuilder();
                sb5.append(liveScoreModel.getBowler().getWickets());
                sb5.append('/');
                sb5.append(liveScoreModel.getBowler().getRun());
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerStat)).setText(sb5.toString());
                StringBuilder sb6 = new StringBuilder();
                sb6.append('(');
                sb6.append(liveScoreModel.getBowler().getOvers());
                sb6.append(')');
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerOver)).setText(sb6.toString());
            } else if (liveScoreModel.getInnings().size() == 1) {
                CircleImageView circleImageView3 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam1Flag);
                Intrinsics.checkNotNullExpressionValue(circleImageView3, "ivTeam1Flag");
                ImageView imageView3 = circleImageView3;
                String teamIconUrl3 = liveScoreModel.getInnings().get(0).getTeamIconUrl();
                ExtensionsKt.loadImage$default(imageView3, teamIconUrl3 == null ? str : teamIconUrl3, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Name)).setText(liveScoreModel.getInnings().get(0).getCode());
                StringBuilder sb7 = new StringBuilder();
                sb7.append(liveScoreModel.getInnings().get(0).getRuns());
                sb7.append('/');
                sb7.append(liveScoreModel.getInnings().get(0).getWickets());
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Score)).setText(sb7.toString());
                StringBuilder sb8 = new StringBuilder();
                sb8.append('(');
                sb8.append(liveScoreModel.getInnings().get(0).getOvers());
                sb8.append(')');
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvT1Overs)).setText(sb8.toString());
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerName)).setText(liveScoreModel.getBowler().getName());
                StringBuilder sb9 = new StringBuilder();
                sb9.append(liveScoreModel.getBowler().getWickets());
                sb9.append('/');
                sb9.append(liveScoreModel.getBowler().getRun());
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerStat)).setText(sb9.toString());
                StringBuilder sb10 = new StringBuilder();
                sb10.append('(');
                sb10.append(liveScoreModel.getBowler().getOvers());
                sb10.append(')');
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBowlerOver)).setText(sb10.toString());
            }
        } catch (Exception e) {
            Log.v("Exception", e.toString());
        }
        try {
            if (liveScoreModel.getBatsmanNonStriker() != null) {
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvBatsman1);
                StringBuilder sb11 = new StringBuilder();
                String name = liveScoreModel.getBatsmanNonStriker().getName();
                if (name == null) {
                    name = str;
                }
                sb11.append(name);
                sb11.append(' ');
                sb11.append(liveScoreModel.getBatsmanNonStriker().getRun());
                sb11.append('(');
                sb11.append(liveScoreModel.getBatsmanNonStriker().getBall());
                sb11.append(')');
                textView.setText(sb11.toString());
            } else {
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBatsman1)).setText(" 0(0)");
            }
        } catch (Exception e2) {
            Log.v("Exception", e2.toString());
        }
        try {
            if (liveScoreModel.getBatsmanStriker() != null) {
                TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvBatsman2);
                StringBuilder sb12 = new StringBuilder();
                String name2 = liveScoreModel.getBatsmanStriker().getName();
                if (name2 != null) {
                    str = name2;
                }
                sb12.append(str);
                sb12.append("* ");
                sb12.append(liveScoreModel.getBatsmanStriker().getRun());
                sb12.append('(');
                sb12.append(liveScoreModel.getBatsmanStriker().getBall());
                sb12.append(')');
                textView2.setText(sb12.toString());
            } else {
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBatsman2)).setText(" 0(0)");
            }
        } catch (Exception e3) {
            Log.v("Exception", e3.toString());
        }
        try {
            ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer)).removeAllViews();
            int size = liveScoreModel.getBalls().size();
            int i = 0;
            while (i < size) {
                View inflate = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.adapter_ball_count, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer), false);
                Intrinsics.checkNotNullExpressionValue(inflate, "from(requireActivity())\n… llBallsContainer, false)");
                View findViewById = inflate.findViewById(C1188R.C1192id.tvBallLabel);
                if (findViewById != null) {
                    TextView textView3 = (TextView) findViewById;
                    textView3.setText(liveScoreModel.getBalls().get(i).getLabel().toString());
                    if (i == liveScoreModel.getBalls().size() - 1) {
                        textView3.setBackground(requireActivity().getDrawable(C1188R.C1190drawable.circle_bg_appcolor));
                        textView3.setTextColor(getResources().getColor(C1188R.C1189color.white));
                    }
                    ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer)).addView(inflate);
                    i++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
            }
            if (liveScoreModel.getBalls().size() < 6) {
                int size2 = 6 - liveScoreModel.getBalls().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    View inflate2 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.adapter_ball_count, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer), false);
                    Intrinsics.checkNotNullExpressionValue(inflate2, "from(requireActivity())\n… llBallsContainer, false)");
                    ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llBallsContainer)).addView(inflate2);
                }
            }
        } catch (Exception e4) {
            Log.v("Exception", e4.toString());
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.myLiveContestAdapter = new MyLiveContestAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopContest);
        MyLiveContestAdapter myLiveContestAdapter2 = null;
        if (recyclerView != null) {
            MyLiveContestAdapter myLiveContestAdapter3 = this.myLiveContestAdapter;
            if (myLiveContestAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myLiveContestAdapter");
                myLiveContestAdapter3 = null;
            }
            recyclerView.setAdapter(myLiveContestAdapter3);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopContest)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopContest);
        MyLiveContestAdapter myLiveContestAdapter4 = this.myLiveContestAdapter;
        if (myLiveContestAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myLiveContestAdapter");
        } else {
            myLiveContestAdapter2 = myLiveContestAdapter4;
        }
        recyclerView2.setAdapter(myLiveContestAdapter2);
    }

    private final void setCompletedAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.myCompletedContestAdapter = new MyCompletedContestAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvCompletedContest);
        MyCompletedContestAdapter myCompletedContestAdapter2 = null;
        if (recyclerView != null) {
            MyCompletedContestAdapter myCompletedContestAdapter3 = this.myCompletedContestAdapter;
            if (myCompletedContestAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myCompletedContestAdapter");
                myCompletedContestAdapter3 = null;
            }
            recyclerView.setAdapter(myCompletedContestAdapter3);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvCompletedContest)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvCompletedContest);
        MyCompletedContestAdapter myCompletedContestAdapter4 = this.myCompletedContestAdapter;
        if (myCompletedContestAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myCompletedContestAdapter");
        } else {
            myCompletedContestAdapter2 = myCompletedContestAdapter4;
        }
        recyclerView2.setAdapter(myCompletedContestAdapter2);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.cvPlayersPot) {
            this.mHandler.removeCallbacks(this.mRunnableTask);
            Bundle bundle = new Bundle();
            String json = new Gson().toJson((Object) this.playersPotData);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(playersPotData)");
            bundle.putString("PLAYERS_POT_DATA", json);
            try {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_myMatchDetailFragment_to_matchDetailFragment, bundle);
            } catch (Exception e) {
                Log.v("EXCEPTION2", e.toString());
            }
        }
    }

    public void onItemClicked(MyContestModel myContestModel) {
        Intrinsics.checkNotNullParameter(myContestModel, "myContestModel");
        this.mHandler.removeCallbacks(this.mRunnableTask);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("from", "my_contest");
            bundle.putString("contestId", myContestModel.get_id());
            bundle.putInt("contestTypeId", myContestModel.getContestType().getTypeId());
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_myMatchDetailFragment_to_matchDetailFragment, bundle);
        } catch (Exception e) {
            Log.v("EXCEPTION1", e.toString());
        }
    }

    public final boolean backHandle() {
        this.mHandler.removeCallbacksAndMessages((Object) null);
        return true;
    }

    public final void setNumber(TextView textView, double d) {
        String str;
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            double abs = Math.abs(d);
            if (abs >= 1.0E7d) {
                abs /= (double) 10000000;
                str = " Crores";
            } else if (abs >= 100000.0d) {
                abs /= (double) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
                str = " Lakhs";
            } else {
                str = " ";
            }
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###.##");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(abs);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
            textView.setText("You won ₹" + format + str);
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }
}
