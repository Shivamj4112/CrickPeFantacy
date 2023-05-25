package com.crickpe.view.home.fragments.home;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import com.appsflyer.AppsFlyerLib;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CirclePagerIndicatorDecoration;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.WebViewActivity;
import com.crickpe.view.detail.adapters.HomeLiveMachesAdapter;
import com.crickpe.view.detail.adapters.TopPlayersHomeAdapter;
import com.crickpe.view.detail.adapters.UpcomingMatchesAdapter;
import com.crickpe.view.detail.fragments.player_reward_fragment.RewardPlayerData;
import com.crickpe.view.detail.fragments.top_players.models.Result;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayerFilter;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayersModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.home.HomeActivity;
import com.crickpe.view.home.HomeViewModel;
import com.crickpe.view.home.adapters.BannerAdapter;
import com.crickpe.view.home.adapters.DialogAdapter;
import com.crickpe.view.home.adapters.PlayersDialogAdapter;
import com.crickpe.view.home.adapters.TopPlayerFilterAdapter;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.kyc.models.TeamCountryData;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.gson.Gson;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0005¢\u0006\u0002\u0010\bJ\b\u0010P\u001a\u00020QH\u0002J\b\u0010R\u001a\u00020QH\u0002J\b\u0010S\u001a\u00020QH\u0002J\b\u0010T\u001a\u00020>H\u0016J\u0010\u0010U\u001a\u00020Q2\u0006\u0010V\u001a\u00020\nH\u0002J\b\u0010W\u001a\u00020QH\u0002J\b\u0010X\u001a\u00020QH\u0002J\u0010\u0010Y\u001a\u00020Q2\u0006\u0010Z\u001a\u00020[H\u0016J \u0010\\\u001a\u00020Q2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020>2\u0006\u0010`\u001a\u00020\u001fH\u0016J\b\u0010a\u001a\u00020QH\u0016J\u0010\u0010b\u001a\u00020Q2\u0006\u0010c\u001a\u00020DH\u0016J\u0010\u0010b\u001a\u00020Q2\u0006\u0010d\u001a\u00020eH\u0016J\u0010\u0010b\u001a\u00020Q2\u0006\u0010f\u001a\u00020(H\u0016J \u0010b\u001a\u00020Q2\u0006\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020>2\u0006\u0010g\u001a\u00020\nH\u0016J\b\u0010h\u001a\u00020QH\u0017J\b\u0010i\u001a\u00020QH\u0016J\u001a\u0010j\u001a\u00020Q2\u0006\u0010Z\u001a\u00020[2\b\u0010k\u001a\u0004\u0018\u00010lH\u0017J\u000e\u0010m\u001a\u00020Q2\u0006\u0010n\u001a\u00020\nJ\b\u0010o\u001a\u00020QH\u0002J\b\u0010p\u001a\u00020QH\u0002J\u0010\u0010q\u001a\u00020Q2\u0006\u0010r\u001a\u00020sH\u0002J\u0010\u0010t\u001a\u00020Q2\u0006\u0010r\u001a\u00020sH\u0002J\u0016\u0010u\u001a\u00020Q2\f\u0010v\u001a\b\u0012\u0004\u0012\u00020w0'H\u0002J\b\u0010x\u001a\u00020QH\u0002R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\f\"\u0004\b1\u0010\u000eR\u001a\u00102\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\f\"\u0004\b4\u0010\u000eR\u001a\u00105\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR\u000e\u00108\u001a\u000209X.¢\u0006\u0002\n\u0000R\u001c\u0010:\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0015\"\u0004\b<\u0010\u0017R\u001a\u0010=\u001a\u00020>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0010\u0010C\u001a\u0004\u0018\u00010DX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u00020>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010@\"\u0004\bG\u0010BR\u000e\u0010H\u001a\u00020IX.¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020KX.¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020MX.¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX.¢\u0006\u0002\n\u0000¨\u0006y"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/home/HomeFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$OnItemClicked;", "Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter$OnItemClicked;", "Lcom/crickpe/view/home/adapters/DialogAdapter$OnCountryDialog;", "Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter$OnItemClicked;", "Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$OnItemClicked;", "()V", "countryId", "", "getCountryId", "()Ljava/lang/String;", "setCountryId", "(Ljava/lang/String;)V", "countryName", "getCountryName", "setCountryName", "countryPopUp", "Landroid/app/Dialog;", "getCountryPopUp", "()Landroid/app/Dialog;", "setCountryPopUp", "(Landroid/app/Dialog;)V", "deviceId", "dialogAdapter", "Lcom/crickpe/view/home/adapters/DialogAdapter;", "flagImage", "getFlagImage", "setFlagImage", "fromD", "", "getFromD", "()Z", "setFromD", "(Z)V", "liveMatchAdapter", "Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter;", "liveMatchList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "myTimer", "Landroid/os/CountDownTimer;", "getMyTimer", "()Landroid/os/CountDownTimer;", "setMyTimer", "(Landroid/os/CountDownTimer;)V", "playerId", "getPlayerId", "setPlayerId", "playerImage", "getPlayerImage", "setPlayerImage", "playerName", "getPlayerName", "setPlayerName", "playersDialogAdapter", "Lcom/crickpe/view/home/adapters/PlayersDialogAdapter;", "playersPopup", "getPlayersPopup", "setPlayersPopup", "selectedCountryPosition", "", "getSelectedCountryPosition", "()I", "setSelectedCountryPosition", "(I)V", "selectedFilter", "Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayerFilter;", "selectedPlayerPosition", "getSelectedPlayerPosition", "setSelectedPlayerPosition", "topPlayerFilterAdapter", "Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter;", "topPlayersAdapter", "Lcom/crickpe/view/detail/adapters/TopPlayersHomeAdapter;", "upcomingMatchesAdapter", "Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter;", "viewModel", "Lcom/crickpe/view/home/HomeViewModel;", "checkDeviceApi", "", "countryDialog", "dialogError", "getFragmentLayoutResId", "joiningBonusDialog", "title", "listeners", "observeData", "onClick", "view", "Landroid/view/View;", "onCountryClick", "teamCountryData", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "position", "fromDialog", "onDetach", "onItemClicked", "topPlayerFilter", "upcomingMatchModel", "Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "myMatchesModel", "from", "onResume", "onTimeFinish", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "playVideo", "videoLink", "playerPopup", "setAdapter", "setDialogAdapter", "rvDialog", "Landroidx/recyclerview/widget/RecyclerView;", "setPlayersDialogAdapter", "setTopPlayersAdapter", "players", "Lcom/crickpe/view/detail/fragments/top_players/models/Result;", "setUpcomingMatchAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeFragment.kt */
public final class HomeFragment extends BaseFragment implements View.OnClickListener, UpcomingMatchesAdapter.OnItemClicked, HomeLiveMachesAdapter.OnItemClicked, DialogAdapter.OnCountryDialog, TopPlayerFilterAdapter.OnItemClicked, PlayersDialogAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private String countryId = "";
    private String countryName = "";
    private Dialog countryPopUp;
    private String deviceId = "";
    private DialogAdapter dialogAdapter;
    private String flagImage = "";
    private boolean fromD;
    private HomeLiveMachesAdapter liveMatchAdapter;
    private ArrayList<MyMatchesModel> liveMatchList;
    private CountDownTimer myTimer;
    private String playerId = "";
    private String playerImage = "";
    private String playerName = "";
    private PlayersDialogAdapter playersDialogAdapter;
    private Dialog playersPopup;
    private int selectedCountryPosition;
    private TopPlayerFilter selectedFilter;
    private int selectedPlayerPosition;
    private TopPlayerFilterAdapter topPlayerFilterAdapter;
    private TopPlayersHomeAdapter topPlayersAdapter;
    private UpcomingMatchesAdapter upcomingMatchesAdapter;
    private HomeViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: HomeFragment.kt */
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
        return C1188R.C1193layout.fragment_home_new;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Dialog getCountryPopUp() {
        return this.countryPopUp;
    }

    public final void setCountryPopUp(Dialog dialog) {
        this.countryPopUp = dialog;
    }

    public final Dialog getPlayersPopup() {
        return this.playersPopup;
    }

    public final void setPlayersPopup(Dialog dialog) {
        this.playersPopup = dialog;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((HomeActivity) activity).resetTitleBar();
            String string = Settings.Secure.getString(requireActivity().getContentResolver(), "android_id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(\n            r…cure.ANDROID_ID\n        )");
            this.deviceId = string;
            User userProfile = UserManager.INSTANCE.getUserProfile();
            HomeViewModel homeViewModel = null;
            if ((userProfile != null ? userProfile.get_id() : null) != null) {
                AppsFlyerLib.getInstance().start(requireActivity().getApplicationContext());
                AppsFlyerLib instance = AppsFlyerLib.getInstance();
                User userProfile2 = UserManager.INSTANCE.getUserProfile();
                instance.setCustomerUserId(String.valueOf(userProfile2 != null ? userProfile2.get_id() : null));
                FirebaseAnalytics mFirebaseAnalytics = ApplicationActivity.Companion.getMFirebaseAnalytics();
                User userProfile3 = UserManager.INSTANCE.getUserProfile();
                mFirebaseAnalytics.setUserId(String.valueOf(userProfile3 != null ? userProfile3.get_id() : null));
            }
            this.viewModel = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
            countryDialog();
            playerPopup();
            HomeViewModel homeViewModel2 = this.viewModel;
            if (homeViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel2 = null;
            }
            homeViewModel2.getMatchesApi(Constants.LIVE);
            HomeViewModel homeViewModel3 = this.viewModel;
            if (homeViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel3 = null;
            }
            homeViewModel3.getNationalityApi();
            HomeViewModel homeViewModel4 = this.viewModel;
            if (homeViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel4 = null;
            }
            homeViewModel4.getTeamsCountryApi();
            HomeViewModel homeViewModel5 = this.viewModel;
            if (homeViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel5 = null;
            }
            homeViewModel5.topPlayersApi("", 1);
            HomeViewModel homeViewModel6 = this.viewModel;
            if (homeViewModel6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel6 = null;
            }
            homeViewModel6.getBannerApi();
            HomeViewModel homeViewModel7 = this.viewModel;
            if (homeViewModel7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel7 = null;
            }
            homeViewModel7.getSettingsApi();
            HomeViewModel homeViewModel8 = this.viewModel;
            if (homeViewModel8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                homeViewModel = homeViewModel8;
            }
            homeViewModel.getHomeDataApi();
            observeData();
            listeners();
            setAdapter();
            checkDeviceApi();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.home.HomeActivity");
    }

    private final void checkDeviceApi() {
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new HomeFragment$$ExternalSyntheticLambda14(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: checkDeviceApi$lambda-0  reason: not valid java name */
    public static final void m3701checkDeviceApi$lambda0(HomeFragment homeFragment, Task task) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        Intrinsics.checkNotNullParameter(task, "task");
        if (!task.isSuccessful()) {
            Log.w("TAG", "Fetching FCM registration token failed", task.getException());
            return;
        }
        String str = (String) task.getResult();
        HashMap hashMap = new HashMap();
        Map map = hashMap;
        map.put("deviceId", homeFragment.deviceId);
        map.put("deviceType", "android");
        map.put("deviceToken", str == null ? "" : str);
        UserManager userManager = UserManager.INSTANCE;
        if (str == null) {
            str = "";
        }
        userManager.saveFCMToken(str);
        HomeViewModel homeViewModel = homeFragment.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.checkDeviceApi(hashMap);
    }

    private final void listeners() {
        Log.v("listeners", "listeners");
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvUpcomingMatch)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvViewTopPlayers)).setOnClickListener(onClickListener);
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivFilterTopPlayers)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCurrentMatch)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCountry)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlRewardPlayer)).setOnClickListener(onClickListener);
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContinue)).setOnClickListener(onClickListener);
        ((NestedScrollView) _$_findCachedViewById(C1188R.C1192id.nestedScrollView)).setOnClickListener(onClickListener);
        ((SwipeRefreshLayout) _$_findCachedViewById(C1188R.C1192id.swipeRv)).setOnRefreshListener(new HomeFragment$$ExternalSyntheticLambda11(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-1  reason: not valid java name */
    public static final void m3707listeners$lambda1(HomeFragment homeFragment) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        RelativeLayout relativeLayout = (RelativeLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.rlFilter);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlFilter");
        CommonMethodsKt.hide(relativeLayout);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(true);
        }
        HomeViewModel homeViewModel = homeFragment.viewModel;
        HomeViewModel homeViewModel2 = null;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.getHomeDataApi();
        HomeViewModel homeViewModel3 = homeFragment.viewModel;
        if (homeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel3 = null;
        }
        homeViewModel3.getMatchesApi(Constants.LIVE);
        HomeViewModel homeViewModel4 = homeFragment.viewModel;
        if (homeViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel4 = null;
        }
        homeViewModel4.topPlayersApi("", 1);
        HomeViewModel homeViewModel5 = homeFragment.viewModel;
        if (homeViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel5 = null;
        }
        homeViewModel5.getSettingsApi();
        HomeViewModel homeViewModel6 = homeFragment.viewModel;
        if (homeViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            homeViewModel2 = homeViewModel6;
        }
        homeViewModel2.getBannerApi();
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        boolean z = true;
        switch (view.getId()) {
            case C1188R.C1192id.ivFilterTopPlayers:
                RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFilter);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlFilter");
                if (relativeLayout.getVisibility() != 0) {
                    z = false;
                }
                if (z) {
                    RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFilter);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlFilter");
                    CommonMethodsKt.hide(relativeLayout2);
                    return;
                }
                RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFilter);
                Intrinsics.checkNotNullExpressionValue(relativeLayout3, "rlFilter");
                CommonMethodsKt.visible(relativeLayout3);
                return;
            case C1188R.C1192id.llContinue:
                RewardPlayerData rewardPlayerData = new RewardPlayerData(this.countryId, this.countryName, this.playerId, this.playerName, this.flagImage, this.playerImage, this.selectedCountryPosition, this.selectedPlayerPosition);
                ApplicationActivity.Companion companion = ApplicationActivity.Companion;
                String str = this.countryId;
                String str2 = this.countryName;
                String str3 = this.flagImage;
                companion.setSelectedTeam(new TeamCountryData(str, str2, str3, str3));
                ApplicationActivity.Companion companion2 = ApplicationActivity.Companion;
                String str4 = this.playerId;
                String str5 = this.playerName;
                String str6 = this.playerImage;
                companion2.setSelectedRandomPlayer(new TeamCountryData(str4, str5, str6, str6));
                UserManager.INSTANCE.saveRewardPlayerData(rewardPlayerData);
                if (!Intrinsics.areEqual((Object) this.playerId, (Object) "")) {
                    HomeActivity homeActivity = (HomeActivity) getActivity();
                    Intrinsics.checkNotNull(homeActivity);
                    homeActivity.changeBottomNav("reward_fragment");
                    return;
                } else if (Intrinsics.areEqual((Object) this.countryId, (Object) "")) {
                    showToast("Please select country");
                    return;
                } else {
                    showToast("Please select player");
                    return;
                }
            case C1188R.C1192id.nestedScrollView:
                RelativeLayout relativeLayout4 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFilter);
                Intrinsics.checkNotNullExpressionValue(relativeLayout4, "rlFilter");
                if (relativeLayout4.getVisibility() != 0) {
                    z = false;
                }
                if (z) {
                    RelativeLayout relativeLayout5 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFilter);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout5, "rlFilter");
                    CommonMethodsKt.hide(relativeLayout5);
                    return;
                }
                return;
            case C1188R.C1192id.rlCountry:
                Dialog dialog = this.countryPopUp;
                Intrinsics.checkNotNull(dialog);
                dialog.show();
                return;
            case C1188R.C1192id.rlRewardPlayer:
                if (Intrinsics.areEqual((Object) this.countryId, (Object) "")) {
                    String string = getString(C1188R.string.please_select_country);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.please_select_country)");
                    showToast(string);
                    return;
                }
                Dialog dialog2 = this.playersPopup;
                Intrinsics.checkNotNull(dialog2);
                dialog2.show();
                return;
            case C1188R.C1192id.tvCurrentMatch:
                HomeActivity homeActivity2 = (HomeActivity) getActivity();
                Intrinsics.checkNotNull(homeActivity2);
                homeActivity2.changeBottomNav("my_matches_fragment");
                return;
            case C1188R.C1192id.tvUpcomingMatch:
                Intent intent = new Intent(new Intent(requireActivity(), DetailActivity.class));
                intent.putExtra("open", Constants.UPCOMING);
                startActivity(intent);
                return;
            case C1188R.C1192id.tvViewTopPlayers:
                Intent intent2 = new Intent(new Intent(requireActivity(), DetailActivity.class));
                intent2.putExtra("open", "top_players");
                startActivity(intent2);
                return;
            default:
                return;
        }
    }

    private final void countryDialog() {
        Dialog dialog = new Dialog(requireActivity());
        this.countryPopUp = dialog;
        Intrinsics.checkNotNull(dialog);
        dialog.requestWindowFeature(1);
        Dialog dialog2 = this.countryPopUp;
        Intrinsics.checkNotNull(dialog2);
        dialog2.setCancelable(false);
        Dialog dialog3 = this.countryPopUp;
        Intrinsics.checkNotNull(dialog3);
        dialog3.setContentView(C1188R.C1193layout.dialog_recycler_view);
        Dialog dialog4 = this.countryPopUp;
        Intrinsics.checkNotNull(dialog4);
        View findViewById = dialog4.findViewById(C1188R.C1192id.tvSelect);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            Dialog dialog5 = this.countryPopUp;
            Intrinsics.checkNotNull(dialog5);
            View findViewById2 = dialog5.findViewById(C1188R.C1192id.rvDialog);
            if (findViewById2 != null) {
                RecyclerView recyclerView = (RecyclerView) findViewById2;
                Dialog dialog6 = this.countryPopUp;
                Intrinsics.checkNotNull(dialog6);
                View findViewById3 = dialog6.findViewById(C1188R.C1192id.ivCloseCountry);
                if (findViewById3 != null) {
                    ImageView imageView = (ImageView) findViewById3;
                    Dialog dialog7 = this.countryPopUp;
                    Intrinsics.checkNotNull(dialog7);
                    View findViewById4 = dialog7.findViewById(C1188R.C1192id.tvTitle);
                    if (findViewById4 != null) {
                        imageView.setOnClickListener(this);
                        ((TextView) findViewById4).setText(getString(C1188R.string.select_country));
                        Dialog dialog8 = this.countryPopUp;
                        Intrinsics.checkNotNull(dialog8);
                        Window window = dialog8.getWindow();
                        Intrinsics.checkNotNull(window);
                        window.setBackgroundDrawableResource(17170445);
                        window.setLayout(-1, -1);
                        setDialogAdapter(recyclerView);
                        setUpcomingMatchAdapter();
                        textView.setOnClickListener(new HomeFragment$$ExternalSyntheticLambda9(this));
                        imageView.setOnClickListener(new HomeFragment$$ExternalSyntheticLambda10(this));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: countryDialog$lambda-2  reason: not valid java name */
    public static final void m3702countryDialog$lambda2(HomeFragment homeFragment, View view) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        Dialog dialog = homeFragment.countryPopUp;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
        if (!Intrinsics.areEqual((Object) homeFragment.countryId, (Object) "")) {
            HomeViewModel homeViewModel = homeFragment.viewModel;
            if (homeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel = null;
            }
            homeViewModel.getPlayersByTeamId(homeFragment.countryId);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: countryDialog$lambda-3  reason: not valid java name */
    public static final void m3703countryDialog$lambda3(HomeFragment homeFragment, View view) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        Dialog dialog = homeFragment.countryPopUp;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
    }

    private final void playerPopup() {
        Dialog dialog = new Dialog(requireActivity());
        this.playersPopup = dialog;
        Intrinsics.checkNotNull(dialog);
        dialog.requestWindowFeature(1);
        Dialog dialog2 = this.playersPopup;
        Intrinsics.checkNotNull(dialog2);
        dialog2.setCancelable(false);
        Dialog dialog3 = this.playersPopup;
        Intrinsics.checkNotNull(dialog3);
        dialog3.setContentView(C1188R.C1193layout.dialog_recycler_view);
        Dialog dialog4 = this.playersPopup;
        Intrinsics.checkNotNull(dialog4);
        View findViewById = dialog4.findViewById(C1188R.C1192id.tvSelect);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            Dialog dialog5 = this.playersPopup;
            Intrinsics.checkNotNull(dialog5);
            View findViewById2 = dialog5.findViewById(C1188R.C1192id.rvDialog);
            if (findViewById2 != null) {
                RecyclerView recyclerView = (RecyclerView) findViewById2;
                Dialog dialog6 = this.playersPopup;
                Intrinsics.checkNotNull(dialog6);
                View findViewById3 = dialog6.findViewById(C1188R.C1192id.tvTitle);
                if (findViewById3 != null) {
                    TextView textView2 = (TextView) findViewById3;
                    Dialog dialog7 = this.playersPopup;
                    Intrinsics.checkNotNull(dialog7);
                    View findViewById4 = dialog7.findViewById(C1188R.C1192id.ivCloseCountry);
                    if (findViewById4 != null) {
                        Dialog dialog8 = this.playersPopup;
                        Intrinsics.checkNotNull(dialog8);
                        Window window = dialog8.getWindow();
                        Intrinsics.checkNotNull(window);
                        textView2.setText(getString(C1188R.string.select_player));
                        window.setBackgroundDrawableResource(17170445);
                        window.setLayout(-1, -1);
                        setPlayersDialogAdapter(recyclerView);
                        textView.setOnClickListener(new HomeFragment$$ExternalSyntheticLambda12(this));
                        ((ImageView) findViewById4).setOnClickListener(new HomeFragment$$ExternalSyntheticLambda13(this));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: playerPopup$lambda-4  reason: not valid java name */
    public static final void m3716playerPopup$lambda4(HomeFragment homeFragment, View view) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        Dialog dialog = homeFragment.playersPopup;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
        Log.v("playerId->", homeFragment.playerId);
    }

    /* access modifiers changed from: private */
    /* renamed from: playerPopup$lambda-5  reason: not valid java name */
    public static final void m3717playerPopup$lambda5(HomeFragment homeFragment, View view) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        Dialog dialog = homeFragment.playersPopup;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
        Log.v("playerId->", homeFragment.playerId);
    }

    private final void setDialogAdapter(RecyclerView recyclerView) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        DialogAdapter dialogAdapter2 = new DialogAdapter(this, requireActivity, 0);
        this.dialogAdapter = dialogAdapter2;
        recyclerView.setAdapter(dialogAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        DialogAdapter dialogAdapter3 = this.dialogAdapter;
        if (dialogAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
            dialogAdapter3 = null;
        }
        recyclerView.setAdapter(dialogAdapter3);
    }

    private final void setPlayersDialogAdapter(RecyclerView recyclerView) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        PlayersDialogAdapter playersDialogAdapter2 = new PlayersDialogAdapter(this, requireActivity, 0);
        this.playersDialogAdapter = playersDialogAdapter2;
        recyclerView.setAdapter(playersDialogAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        PlayersDialogAdapter playersDialogAdapter3 = this.playersDialogAdapter;
        if (playersDialogAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
            playersDialogAdapter3 = null;
        }
        recyclerView.setAdapter(playersDialogAdapter3);
    }

    private final void dialogError() {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(C1188R.C1193layout.dialog_failed);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvBody);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvDone);
            if (findViewById2 != null) {
                textView.setText(getString(C1188R.string.restricted_app));
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawableResource(17170445);
                window.setLayout(-1, -2);
                ((TextView) findViewById2).setOnClickListener(new HomeFragment$$ExternalSyntheticLambda15(this, dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: dialogError$lambda-6  reason: not valid java name */
    public static final void m3704dialogError$lambda6(HomeFragment homeFragment, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        homeFragment.requireActivity().finishAffinity();
        dialog.dismiss();
    }

    private final void observeData() {
        HomeViewModel homeViewModel = this.viewModel;
        HomeViewModel homeViewModel2 = null;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<SettingsModel>> settingsApi = homeViewModel.getSettingsApi();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        settingsApi.observe(viewLifecycleOwner, new HomeFragment$$ExternalSyntheticLambda16());
        HomeViewModel homeViewModel3 = this.viewModel;
        if (homeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<BannerListModelItem>>> getBanner = homeViewModel3.getGetBanner();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getBanner.observe(viewLifecycleOwner2, new HomeFragment$$ExternalSyntheticLambda1(this));
        HomeViewModel homeViewModel4 = this.viewModel;
        if (homeViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<User>> checkDevice = homeViewModel4.getCheckDevice();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        checkDevice.observe(viewLifecycleOwner3, new HomeFragment$$ExternalSyntheticLambda2(this));
        HomeViewModel homeViewModel5 = this.viewModel;
        if (homeViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel5 = null;
        }
        SingleLiveEvent<ApiResponseHandler<TopPlayersModel>> topPlayers = homeViewModel5.getTopPlayers();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        topPlayers.observe(viewLifecycleOwner4, new HomeFragment$$ExternalSyntheticLambda3(this));
        HomeViewModel homeViewModel6 = this.viewModel;
        if (homeViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel6 = null;
        }
        SingleLiveEvent<ApiResponseHandler<HomeDataModel>> getHomeDataApi = homeViewModel6.getGetHomeDataApi();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "viewLifecycleOwner");
        getHomeDataApi.observe(viewLifecycleOwner5, new HomeFragment$$ExternalSyntheticLambda4(this));
        HomeViewModel homeViewModel7 = this.viewModel;
        if (homeViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel7 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<MyMatchesModel>>> mymatches = homeViewModel7.getMymatches();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "viewLifecycleOwner");
        mymatches.observe(viewLifecycleOwner6, new HomeFragment$$ExternalSyntheticLambda5(this));
        HomeViewModel homeViewModel8 = this.viewModel;
        if (homeViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel8 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getCountryData = homeViewModel8.getGetCountryData();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "viewLifecycleOwner");
        getCountryData.observe(viewLifecycleOwner7, new HomeFragment$$ExternalSyntheticLambda6(this));
        HomeViewModel homeViewModel9 = this.viewModel;
        if (homeViewModel9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            homeViewModel2 = homeViewModel9;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getPlayerData = homeViewModel2.getGetPlayerData();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "viewLifecycleOwner");
        getPlayerData.observe(viewLifecycleOwner8, new HomeFragment$$ExternalSyntheticLambda7(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-7  reason: not valid java name */
    public static final void m3713observeData$lambda7(ApiResponseHandler apiResponseHandler) {
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                SettingsModel settingsModel = (SettingsModel) apiResponseHandler.getData();
                if (settingsModel != null) {
                    UserManager.INSTANCE.saveAppSettings(settingsModel);
                    Log.v("listeners0", "listeners");
                }
            } else if (i == 2) {
                Log.i("ERROR", new Gson().toJson((Object) apiResponseHandler.getMessage()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-8  reason: not valid java name */
    public static final void m3714observeData$lambda8(HomeFragment homeFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    FragmentActivity requireActivity = homeFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    ((ViewPager) homeFragment._$_findCachedViewById(C1188R.C1192id.view_pager_banner)).setAdapter(new BannerAdapter(requireActivity, arrayList, homeFragment));
                    ViewPager viewPager = (ViewPager) homeFragment._$_findCachedViewById(C1188R.C1192id.view_pager_banner);
                    Intrinsics.checkNotNullExpressionValue(viewPager, "view_pager_banner");
                    ((WormDotsIndicator) homeFragment._$_findCachedViewById(C1188R.C1192id.worm_dot)).attachTo(viewPager);
                    Log.v("listeners1", "listeners");
                }
            } else if (i == 2) {
                Log.v("BANNER_ERROR", String.valueOf(apiResponseHandler.getError()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-9  reason: not valid java name */
    public static final void m3715observeData$lambda9(HomeFragment homeFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                Log.v("listeners2", "listeners");
                Log.v("checkDevice", "FCM_SEND_SUCCESSFULLY");
            } else if (i == 2) {
                FragmentActivity requireActivity = homeFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                homeFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("checkDevice", String.valueOf(apiResponseHandler.getError()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-10  reason: not valid java name */
    public static final void m3708observeData$lambda10(HomeFragment homeFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                Log.v("TOP", "Players");
                TopPlayersModel topPlayersModel = (TopPlayersModel) apiResponseHandler.getData();
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                ProgressBar progressBar = (ProgressBar) homeFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                Log.v("listeners3", "listeners");
                if (topPlayersModel != null) {
                    if (topPlayersModel.getResult().size() > 0) {
                        RecyclerView recyclerView = (RecyclerView) homeFragment._$_findCachedViewById(C1188R.C1192id.rvTopPlayers);
                        Intrinsics.checkNotNullExpressionValue(recyclerView, "rvTopPlayers");
                        CommonMethodsKt.visible(recyclerView);
                        RelativeLayout relativeLayout = (RelativeLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.relativeLayout10);
                        Intrinsics.checkNotNullExpressionValue(relativeLayout, "relativeLayout10");
                        CommonMethodsKt.visible(relativeLayout);
                    }
                    homeFragment.setTopPlayersAdapter(topPlayersModel.getResult());
                    TopPlayerFilterAdapter topPlayerFilterAdapter2 = homeFragment.topPlayerFilterAdapter;
                    TopPlayerFilterAdapter topPlayerFilterAdapter3 = null;
                    if (topPlayerFilterAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
                        topPlayerFilterAdapter2 = null;
                    }
                    topPlayerFilterAdapter2.getFilterModel().clear();
                    TopPlayerFilterAdapter topPlayerFilterAdapter4 = homeFragment.topPlayerFilterAdapter;
                    if (topPlayerFilterAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
                    } else {
                        topPlayerFilterAdapter3 = topPlayerFilterAdapter4;
                    }
                    topPlayerFilterAdapter3.addList(topPlayersModel.getTopPlayerFilters(), homeFragment.selectedFilter);
                    return;
                }
                RecyclerView recyclerView2 = (RecyclerView) homeFragment._$_findCachedViewById(C1188R.C1192id.rvTopPlayers);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvTopPlayers");
                CommonMethodsKt.hide(recyclerView2);
                RelativeLayout relativeLayout2 = (RelativeLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.relativeLayout10);
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "relativeLayout10");
                CommonMethodsKt.hide(relativeLayout2);
            } else if (i == 2) {
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) homeFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                Log.v("getHomeDataApi_ERROR", new Gson().toJson((Object) apiResponseHandler.getError()));
            } else if (i == 3) {
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                    z = false;
                }
                if (z) {
                    ProgressBar progressBar3 = (ProgressBar) homeFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-12  reason: not valid java name */
    public static final void m3709observeData$lambda12(HomeFragment homeFragment, ApiResponseHandler apiResponseHandler) {
        HomeFragment homeFragment2 = homeFragment;
        Intrinsics.checkNotNullParameter(homeFragment2, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                HomeDataModel homeDataModel = (HomeDataModel) apiResponseHandler.getData();
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) homeFragment2._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                Log.v("listeners4", "listeners");
                if (homeDataModel != null) {
                    try {
                        if (((HomeDataModel) apiResponseHandler.getData()).getUpcomingMatches().size() > 0) {
                            int size = ((HomeDataModel) apiResponseHandler.getData()).getUpcomingMatches().size();
                            for (int i2 = 0; i2 < size; i2++) {
                                if (((HomeDataModel) apiResponseHandler.getData()).getUpcomingMatches().get(i2).getStartAtIST() != null) {
                                    try {
                                        Long startAtIST = ((HomeDataModel) apiResponseHandler.getData()).getUpcomingMatches().get(i2).getStartAtIST();
                                        ((HomeDataModel) apiResponseHandler.getData()).getUpcomingMatches().get(i2).setRemainingTime(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault()).parse(startAtIST != null ? homeFragment2.getDateString(startAtIST.longValue()) : null).getTime() - Calendar.getInstance().getTime().getTime());
                                    } catch (Exception e) {
                                        Log.v("EXCEP", e.toString());
                                    }
                                } else {
                                    try {
                                        ((HomeDataModel) apiResponseHandler.getData()).getUpcomingMatches().get(i2).setRemainingTime(0);
                                    } catch (Exception e2) {
                                        Log.v("EXCEPP", e2.toString());
                                    }
                                }
                            }
                            UpcomingMatchesAdapter upcomingMatchesAdapter2 = homeFragment2.upcomingMatchesAdapter;
                            if (upcomingMatchesAdapter2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("upcomingMatchesAdapter");
                                upcomingMatchesAdapter2 = null;
                            }
                            upcomingMatchesAdapter2.addList(true, homeDataModel.getUpcomingMatches());
                            TextView textView = (TextView) homeFragment2._$_findCachedViewById(C1188R.C1192id.tvUpcomingMatch);
                            Intrinsics.checkNotNullExpressionValue(textView, "tvUpcomingMatch");
                            CommonMethodsKt.visible(textView);
                            RecyclerView recyclerView = (RecyclerView) homeFragment2._$_findCachedViewById(C1188R.C1192id.rvUpcomingMatch);
                            Intrinsics.checkNotNullExpressionValue(recyclerView, "rvUpcomingMatch");
                            CommonMethodsKt.visible(recyclerView);
                            LinearLayout linearLayout = (LinearLayout) homeFragment2._$_findCachedViewById(C1188R.C1192id.llUpcoming);
                            Intrinsics.checkNotNullExpressionValue(linearLayout, "llUpcoming");
                            CommonMethodsKt.visible(linearLayout);
                        } else {
                            TextView textView2 = (TextView) homeFragment2._$_findCachedViewById(C1188R.C1192id.tvUpcomingMatch);
                            Intrinsics.checkNotNullExpressionValue(textView2, "tvUpcomingMatch");
                            CommonMethodsKt.hide(textView2);
                            RecyclerView recyclerView2 = (RecyclerView) homeFragment2._$_findCachedViewById(C1188R.C1192id.rvUpcomingMatch);
                            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvUpcomingMatch");
                            CommonMethodsKt.hide(recyclerView2);
                            LinearLayout linearLayout2 = (LinearLayout) homeFragment2._$_findCachedViewById(C1188R.C1192id.llUpcoming);
                            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llUpcoming");
                            CommonMethodsKt.hide(linearLayout2);
                        }
                        if (homeDataModel.getRandomTeamAndPlayer() != null) {
                            ApplicationActivity.Companion.setSelectedTeam(homeDataModel.getRandomTeamAndPlayer().getTeam());
                            ApplicationActivity.Companion.setSelectedRandomPlayer(homeDataModel.getRandomTeamAndPlayer().getPlayers());
                            TeamCountryData selectedTeam = ApplicationActivity.Companion.getSelectedTeam();
                            Intrinsics.checkNotNull(selectedTeam);
                            DefaultImpls.onCountryClick$default(homeFragment2, selectedTeam, 0, false, 4, (Object) null);
                        }
                        User userProfile = UserManager.INSTANCE.getUserProfile();
                        if ((userProfile != null ? userProfile.getJoiningBonusMessage() : null) != null) {
                            homeFragment2.joiningBonusDialog(String.valueOf(userProfile.getJoiningBonusMessage()));
                            userProfile.setJoiningBonusMessage((String) null);
                        }
                        UserManager.INSTANCE.saveProfile(userProfile);
                        if (userProfile != null) {
                            userProfile.setTotalAmount((double) ((int) homeDataModel.getUserInfo().getTotalAmount()));
                        }
                        double d = 0.0d;
                        ApplicationActivity.Companion.setWalletBalance(userProfile != null ? userProfile.getTotalAmount() : 0.0d);
                        HomeActivity homeActivity = (HomeActivity) homeFragment.requireActivity();
                        if (userProfile != null) {
                            d = userProfile.getTotalAmount();
                        }
                        homeActivity.showWalletBal(d);
                    } catch (Exception e3) {
                        Log.v("getHomeDataApi", e3.toString());
                    }
                }
                ProgressBar progressBar = (ProgressBar) homeFragment2._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
            } else if (i == 2) {
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) homeFragment2._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) homeFragment2._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                Log.v("getHomeDataApi_ERROR", new Gson().toJson((Object) apiResponseHandler.getError()));
            } else if (i == 3) {
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) homeFragment2._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                    z = false;
                }
                if (z) {
                    ProgressBar progressBar3 = (ProgressBar) homeFragment2._$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-13  reason: not valid java name */
    public static final void m3710observeData$lambda13(HomeFragment homeFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList<MyMatchesModel> arrayList = (ArrayList) apiResponseHandler.getData();
                Log.v("listeners5", "listeners");
                if (arrayList == null) {
                    return;
                }
                if (arrayList.size() > 0) {
                    RelativeLayout relativeLayout = (RelativeLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.rlBanner);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlBanner");
                    CommonMethodsKt.hide(relativeLayout);
                    RelativeLayout relativeLayout2 = (RelativeLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.rlCurrentMatches);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlCurrentMatches");
                    CommonMethodsKt.visible(relativeLayout2);
                    homeFragment.liveMatchList = new ArrayList<>();
                    homeFragment.liveMatchList = arrayList;
                    HomeLiveMachesAdapter homeLiveMachesAdapter = homeFragment.liveMatchAdapter;
                    if (homeLiveMachesAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("liveMatchAdapter");
                        homeLiveMachesAdapter = null;
                    }
                    homeLiveMachesAdapter.addList(true, arrayList);
                    if (((RecyclerView) homeFragment._$_findCachedViewById(C1188R.C1192id.rvLiveMatch)).getItemDecorationCount() > 0) {
                        ((RecyclerView) homeFragment._$_findCachedViewById(C1188R.C1192id.rvLiveMatch)).removeItemDecorationAt(0);
                    }
                    if (arrayList.size() > 1) {
                        ((RecyclerView) homeFragment._$_findCachedViewById(C1188R.C1192id.rvLiveMatch)).addItemDecoration(new CirclePagerIndicatorDecoration());
                        return;
                    }
                    while (((RecyclerView) homeFragment._$_findCachedViewById(C1188R.C1192id.rvLiveMatch)).getItemDecorationCount() > 0) {
                        ((RecyclerView) homeFragment._$_findCachedViewById(C1188R.C1192id.rvLiveMatch)).removeItemDecorationAt(0);
                    }
                    return;
                }
                RelativeLayout relativeLayout3 = (RelativeLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.rlBanner);
                Intrinsics.checkNotNullExpressionValue(relativeLayout3, "rlBanner");
                CommonMethodsKt.visible(relativeLayout3);
                RelativeLayout relativeLayout4 = (RelativeLayout) homeFragment._$_findCachedViewById(C1188R.C1192id.rlCurrentMatches);
                Intrinsics.checkNotNullExpressionValue(relativeLayout4, "rlCurrentMatches");
                CommonMethodsKt.hide(relativeLayout4);
            } else if (i == 2) {
                FragmentActivity requireActivity = homeFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                homeFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-14  reason: not valid java name */
    public static final void m3711observeData$lambda14(HomeFragment homeFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                Log.v("listeners6", "listeners");
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    try {
                        DialogAdapter dialogAdapter2 = homeFragment.dialogAdapter;
                        if (dialogAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
                            dialogAdapter2 = null;
                        }
                        dialogAdapter2.addList(true, arrayList);
                        if (!arrayList.isEmpty()) {
                            Object obj = arrayList.get(0);
                            Intrinsics.checkNotNullExpressionValue(obj, "data[0]");
                            DefaultImpls.onCountryClick$default(homeFragment, (TeamCountryData) obj, 0, false, 4, (Object) null);
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = homeFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                homeFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-15  reason: not valid java name */
    public static final void m3712observeData$lambda15(HomeFragment homeFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                Log.v("listeners7", "listeners");
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    try {
                        PlayersDialogAdapter playersDialogAdapter2 = homeFragment.playersDialogAdapter;
                        if (playersDialogAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                            playersDialogAdapter2 = null;
                        }
                        playersDialogAdapter2.addList(true, arrayList);
                        if (!(!arrayList.isEmpty())) {
                            homeFragment.playerId = "";
                            homeFragment.playerName = "";
                            homeFragment.playerImage = "";
                            ((TextView) homeFragment._$_findCachedViewById(C1188R.C1192id.tvPlayerName)).setText(homeFragment.playerName);
                            CircleImageView circleImageView = (CircleImageView) homeFragment._$_findCachedViewById(C1188R.C1192id.ivPlayerImage);
                            Intrinsics.checkNotNullExpressionValue(circleImageView, "ivPlayerImage");
                            ExtensionsKt.loadImage$default(circleImageView, homeFragment.playerImage, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                        } else if (ApplicationActivity.Companion.getSelectedRandomPlayer() == null || homeFragment.fromD) {
                            Object obj = arrayList.get(0);
                            Intrinsics.checkNotNullExpressionValue(obj, "data[0]");
                            homeFragment.onItemClicked((TeamCountryData) obj, 0, "");
                        } else {
                            TeamCountryData selectedRandomPlayer = ApplicationActivity.Companion.getSelectedRandomPlayer();
                            Intrinsics.checkNotNull(selectedRandomPlayer);
                            homeFragment.onItemClicked(selectedRandomPlayer, 0, "");
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = homeFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                homeFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            }
        }
    }

    private final void setUpcomingMatchAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.upcomingMatchesAdapter = new UpcomingMatchesAdapter(requireActivity, this, true);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvUpcomingMatch);
        UpcomingMatchesAdapter upcomingMatchesAdapter2 = this.upcomingMatchesAdapter;
        UpcomingMatchesAdapter upcomingMatchesAdapter3 = null;
        if (upcomingMatchesAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upcomingMatchesAdapter");
            upcomingMatchesAdapter2 = null;
        }
        recyclerView.setAdapter(upcomingMatchesAdapter2);
        UpcomingMatchesAdapter upcomingMatchesAdapter4 = this.upcomingMatchesAdapter;
        if (upcomingMatchesAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upcomingMatchesAdapter");
        } else {
            upcomingMatchesAdapter3 = upcomingMatchesAdapter4;
        }
        upcomingMatchesAdapter3.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
    }

    private final void setTopPlayersAdapter(ArrayList<Result> arrayList) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.topPlayersAdapter = new TopPlayersHomeAdapter(requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopPlayers);
        TopPlayersHomeAdapter topPlayersHomeAdapter = this.topPlayersAdapter;
        TopPlayersHomeAdapter topPlayersHomeAdapter2 = null;
        if (topPlayersHomeAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayersAdapter");
            topPlayersHomeAdapter = null;
        }
        recyclerView.setAdapter(topPlayersHomeAdapter);
        TopPlayersHomeAdapter topPlayersHomeAdapter3 = this.topPlayersAdapter;
        if (topPlayersHomeAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayersAdapter");
        } else {
            topPlayersHomeAdapter2 = topPlayersHomeAdapter3;
        }
        topPlayersHomeAdapter2.addList(true, arrayList);
    }

    private final void setAdapter() {
        this.liveMatchAdapter = new HomeLiveMachesAdapter(this);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLiveMatch);
        HomeLiveMachesAdapter homeLiveMachesAdapter = this.liveMatchAdapter;
        TopPlayerFilterAdapter topPlayerFilterAdapter2 = null;
        if (homeLiveMachesAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveMatchAdapter");
            homeLiveMachesAdapter = null;
        }
        recyclerView.setAdapter(homeLiveMachesAdapter);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLiveMatch)).setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLiveMatch);
        HomeLiveMachesAdapter homeLiveMachesAdapter2 = this.liveMatchAdapter;
        if (homeLiveMachesAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("liveMatchAdapter");
            homeLiveMachesAdapter2 = null;
        }
        recyclerView2.setAdapter(homeLiveMachesAdapter2);
        new PagerSnapHelper().attachToRecyclerView((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLiveMatch));
        if (((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLiveMatch)).getItemDecorationCount() > 0) {
            ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvLiveMatch)).removeItemDecorationAt(0);
        }
        ArrayList<MyMatchesModel> arrayList = this.liveMatchList;
        if (arrayList != null) {
            Intrinsics.checkNotNull(arrayList);
            arrayList.size();
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.topPlayerFilterAdapter = new TopPlayerFilterAdapter(this, requireActivity);
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFilterTop);
        TopPlayerFilterAdapter topPlayerFilterAdapter3 = this.topPlayerFilterAdapter;
        if (topPlayerFilterAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
            topPlayerFilterAdapter3 = null;
        }
        recyclerView3.setAdapter(topPlayerFilterAdapter3);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFilterTop)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFilterTop);
        TopPlayerFilterAdapter topPlayerFilterAdapter4 = this.topPlayerFilterAdapter;
        if (topPlayerFilterAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
        } else {
            topPlayerFilterAdapter2 = topPlayerFilterAdapter4;
        }
        recyclerView4.setAdapter(topPlayerFilterAdapter2);
    }

    public void onResume() {
        super.onResume();
        User userProfile = UserManager.INSTANCE.getUserProfile();
        if (userProfile != null) {
            try {
                Glide.with((Fragment) this).load(userProfile.getProfilePic()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivProfile));
                Glide.with((Fragment) this).load(userProfile.getProfilePic()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) _$_findCachedViewById(C1188R.C1192id.profileImage));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvName)).setText(userProfile.getName().toString());
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAmount);
                Intrinsics.checkNotNullExpressionValue(textView, "tvAmount");
                BindingAdapters.setNumber(textView, userProfile.getTotalAmount());
            } catch (Exception e) {
                Log.v("OnResume", e.toString());
            }
        }
    }

    public void onItemClicked(UpcomingMatchModel upcomingMatchModel) {
        Intrinsics.checkNotNullParameter(upcomingMatchModel, "upcomingMatchModel");
        UserManager.INSTANCE.saveMatch(upcomingMatchModel);
        UserManager.INSTANCE.saveMatchId(upcomingMatchModel.get_id());
        UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
        if (match != null) {
            match.setFrom("HomeFragment");
        }
        Intent intent = new Intent(new Intent(getContext(), DetailActivity.class));
        intent.putExtra("open", "choose");
        requireActivity().startActivity(intent);
    }

    public void onDetach() {
        super.onDetach();
        CountDownTimer countDownTimer = this.myTimer;
        if (countDownTimer != null) {
            Intrinsics.checkNotNull(countDownTimer);
            countDownTimer.cancel();
            CountDownTimer countDownTimer2 = this.myTimer;
            Intrinsics.checkNotNull(countDownTimer2);
            countDownTimer2.onFinish();
        }
    }

    public final CountDownTimer getMyTimer() {
        return this.myTimer;
    }

    public final void setMyTimer(CountDownTimer countDownTimer) {
        this.myTimer = countDownTimer;
    }

    public void onTimeFinish() {
        Log.d("onTimeFinish", "HomeFragment");
    }

    public void onItemClicked(MyMatchesModel myMatchesModel) {
        Intrinsics.checkNotNullParameter(myMatchesModel, "myMatchesModel");
        Log.v("MATCHID", myMatchesModel.get_id());
        UserManager.INSTANCE.saveMatchId(myMatchesModel.get_id());
        UserManager.INSTANCE.saveLiveMatch(myMatchesModel);
        UserManager.INSTANCE.saveContestClick(0);
        Intent intent = new Intent(new Intent(requireActivity(), DetailActivity.class));
        intent.putExtra("open", "my_match_detail");
        intent.putExtra("matchId", myMatchesModel.get_id());
        requireActivity().startActivity(intent);
    }

    public final String getCountryId() {
        return this.countryId;
    }

    public final void setCountryId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryId = str;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final void setCountryName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryName = str;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final void setPlayerId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.playerId = str;
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final void setPlayerName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.playerName = str;
    }

    public final String getFlagImage() {
        return this.flagImage;
    }

    public final void setFlagImage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.flagImage = str;
    }

    public final String getPlayerImage() {
        return this.playerImage;
    }

    public final void setPlayerImage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.playerImage = str;
    }

    public final int getSelectedCountryPosition() {
        return this.selectedCountryPosition;
    }

    public final void setSelectedCountryPosition(int i) {
        this.selectedCountryPosition = i;
    }

    public final int getSelectedPlayerPosition() {
        return this.selectedPlayerPosition;
    }

    public final void setSelectedPlayerPosition(int i) {
        this.selectedPlayerPosition = i;
    }

    public final boolean getFromD() {
        return this.fromD;
    }

    public final void setFromD(boolean z) {
        this.fromD = z;
    }

    public void onCountryClick(TeamCountryData teamCountryData, int i, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(teamCountryData, "teamCountryData");
        this.selectedCountryPosition = i;
        this.fromD = z;
        this.countryId = teamCountryData.get_id();
        this.countryName = teamCountryData.getName();
        Dialog dialog = this.countryPopUp;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
        DialogAdapter dialogAdapter2 = null;
        if (!Intrinsics.areEqual((Object) this.countryId, (Object) "")) {
            HomeViewModel homeViewModel = this.viewModel;
            if (homeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel = null;
            }
            homeViewModel.getPlayersByTeamId(this.countryId);
        }
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCountryName)).setText(teamCountryData.getName());
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivFlagImage);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "ivFlagImage");
        ImageView imageView = circleImageView;
        String teamIconUrl = teamCountryData.getTeamIconUrl();
        if (teamIconUrl == null) {
            str = "";
        } else {
            str = teamIconUrl;
        }
        ExtensionsKt.loadImage$default(imageView, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
        if (teamCountryData.getTeamIconUrl() != null) {
            this.flagImage = teamCountryData.getTeamIconUrl().toString();
        } else {
            this.flagImage = "";
        }
        DialogAdapter dialogAdapter3 = this.dialogAdapter;
        if (dialogAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
            dialogAdapter3 = null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : dialogAdapter3.getProductsList()) {
            TeamCountryData teamCountryData2 = (TeamCountryData) next;
            if (Intrinsics.areEqual((Object) teamCountryData2.get_id(), (Object) this.countryId)) {
                DialogAdapter dialogAdapter4 = this.dialogAdapter;
                if (dialogAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
                    dialogAdapter4 = null;
                }
                DialogAdapter dialogAdapter5 = this.dialogAdapter;
                if (dialogAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
                    dialogAdapter5 = null;
                }
                dialogAdapter4.setSelectedPosition(dialogAdapter5.getProductsList().indexOf(teamCountryData2));
            }
            if (hashSet.add(Unit.INSTANCE)) {
                arrayList.add(next);
            }
        }
        List list = arrayList;
        DialogAdapter dialogAdapter6 = this.dialogAdapter;
        if (dialogAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
        } else {
            dialogAdapter2 = dialogAdapter6;
        }
        dialogAdapter2.notifyDataSetChanged();
    }

    public void onItemClicked(TeamCountryData teamCountryData, int i, String str) {
        Intrinsics.checkNotNullParameter(teamCountryData, "teamCountryData");
        Intrinsics.checkNotNullParameter(str, "from");
        this.selectedPlayerPosition = i;
        Dialog dialog = this.playersPopup;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.playerId = teamCountryData.get_id();
        this.playerName = teamCountryData.getName();
        this.playerImage = String.valueOf(teamCountryData.getImageUrl());
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPlayerName)).setText(teamCountryData.getName());
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivPlayerImage);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "ivPlayerImage");
        ImageView imageView = circleImageView;
        String imageUrl = teamCountryData.getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        ExtensionsKt.loadImage$default(imageView, imageUrl, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
        PlayersDialogAdapter playersDialogAdapter2 = this.playersDialogAdapter;
        PlayersDialogAdapter playersDialogAdapter3 = null;
        if (playersDialogAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
            playersDialogAdapter2 = null;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : playersDialogAdapter2.getPlayersList()) {
            TeamCountryData teamCountryData2 = (TeamCountryData) next;
            if (Intrinsics.areEqual((Object) teamCountryData2.get_id(), (Object) teamCountryData.get_id())) {
                PlayersDialogAdapter playersDialogAdapter4 = this.playersDialogAdapter;
                if (playersDialogAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                    playersDialogAdapter4 = null;
                }
                PlayersDialogAdapter playersDialogAdapter5 = this.playersDialogAdapter;
                if (playersDialogAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                    playersDialogAdapter5 = null;
                }
                playersDialogAdapter4.setSelectedPosition(playersDialogAdapter5.getPlayersList().indexOf(teamCountryData2));
            }
            if (hashSet.add(Unit.INSTANCE)) {
                arrayList.add(next);
            }
        }
        List list = arrayList;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setText("to " + this.playerName);
        PlayersDialogAdapter playersDialogAdapter6 = this.playersDialogAdapter;
        if (playersDialogAdapter6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
        } else {
            playersDialogAdapter3 = playersDialogAdapter6;
        }
        playersDialogAdapter3.notifyDataSetChanged();
    }

    public void onItemClicked(TopPlayerFilter topPlayerFilter) {
        Intrinsics.checkNotNullParameter(topPlayerFilter, "topPlayerFilter");
        this.selectedFilter = topPlayerFilter;
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFilter);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlFilter");
        CommonMethodsKt.hide(relativeLayout);
        HomeViewModel homeViewModel = this.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.topPlayersApi(String.valueOf(topPlayerFilter.getFilterId()), 1);
    }

    private final void joiningBonusDialog(String str) {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_bonus);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        View findViewById = dialog.findViewById(C1188R.C1192id.tvBody);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvDone);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(C1188R.C1192id.ivCancelDialog);
                if (findViewById3 != null) {
                    textView.setText(str);
                    Window window2 = dialog.getWindow();
                    Intrinsics.checkNotNull(window2);
                    window2.setBackgroundDrawableResource(17170445);
                    window2.setLayout(-1, -2);
                    textView2.setOnClickListener(new HomeFragment$$ExternalSyntheticLambda0(dialog, this));
                    ((ImageView) findViewById3).setOnClickListener(new HomeFragment$$ExternalSyntheticLambda8(dialog));
                    dialog.show();
                    ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    CommonMethodsKt.hide(progressBar);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: joiningBonusDialog$lambda-18  reason: not valid java name */
    public static final void m3705joiningBonusDialog$lambda18(Dialog dialog, HomeFragment homeFragment, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(homeFragment, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(new Intent(homeFragment.requireActivity(), DetailActivity.class));
        intent.putExtra("open", Constants.UPCOMING);
        homeFragment.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: joiningBonusDialog$lambda-19  reason: not valid java name */
    public static final void m3706joiningBonusDialog$lambda19(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public final void playVideo(String str) {
        Intrinsics.checkNotNullParameter(str, "videoLink");
        Log.v("VideoLinkkk", str);
        if (!Intrinsics.areEqual((Object) str, (Object) "null")) {
            Intent intent = new Intent(requireActivity(), WebViewActivity.class);
            intent.putExtra("video_link", str);
            intent.putExtra("title", "");
            startActivity(intent);
            return;
        }
        Log.v("Null_link", str);
    }
}
