package com.crickpe.view.detail.fragments.my_matches_detail;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.leaderboard.LeaderboardModel;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.ContestTeamAdapter;
import com.crickpe.view.detail.adapters.LeaderboardAdapter;
import com.crickpe.view.detail.adapters.PlayersPotAdapter;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamPlayers;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.leadereboard.LeaderboardFragment;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.LiveScoreFragment;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.my_scorecard.MatchTeamsFragment;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings.WinningsFragment;
import com.crickpe.view.home.adapters.HomeTabAdapter;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010G\u001a\u00020H2\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010I\u001a\u00020HH\u0002J\u0006\u0010J\u001a\u00020\tJ\b\u0010K\u001a\u00020\u0015H\u0016J\b\u0010L\u001a\u00020HH\u0002J\b\u0010M\u001a\u00020HH\u0002J\b\u0010N\u001a\u00020HH\u0002J\u0010\u0010O\u001a\u00020H2\u0006\u0010P\u001a\u00020QH\u0016J\u0018\u0010R\u001a\u00020H2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0015H\u0016J\b\u0010V\u001a\u00020HH\u0016J\u0018\u0010W\u001a\u00020H2\u0006\u0010X\u001a\u00020Y2\u0006\u0010U\u001a\u00020\u0015H\u0016J\u001a\u0010Z\u001a\u00020H2\u0006\u0010P\u001a\u00020Q2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010]\u001a\u00020HH\u0002J\u0010\u0010^\u001a\u00020H2\u0006\u0010_\u001a\u00020`H\u0002J\u001e\u0010a\u001a\u00020H2\u0006\u0010b\u001a\u00020Q2\u0006\u0010:\u001a\u00020;2\u0006\u0010c\u001a\u00020dJ\u0010\u0010e\u001a\u00020H2\u0006\u0010_\u001a\u00020fH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0004¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0011\"\u0004\b9\u0010\u0013R.\u0010:\u001a\u0016\u0012\u0004\u0012\u00020;\u0018\u00010&j\n\u0012\u0004\u0012\u00020;\u0018\u0001`(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010B\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0011\"\u0004\bD\u0010\u0013R\u000e\u0010E\u001a\u00020FX.¢\u0006\u0002\n\u0000¨\u0006g"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/MatchDetailFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/LeaderboardAdapter$OnClick;", "Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnClick;", "()V", "adapterPlayersPotAdapter", "Lcom/crickpe/view/detail/adapters/PlayersPotAdapter;", "apiCalled", "", "getApiCalled", "()Z", "setApiCalled", "(Z)V", "contestId", "", "getContestId", "()Ljava/lang/String;", "setContestId", "(Ljava/lang/String;)V", "contestTypeId", "", "getContestTypeId", "()I", "setContestTypeId", "(I)V", "currentTabPosition", "getCurrentTabPosition", "setCurrentTabPosition", "fragment1", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/winnings/WinningsFragment;", "fragment2", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/leadereboard/LeaderboardFragment;", "fragment3", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/LiveScoreFragment;", "fragment4", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/my_scorecard/MatchTeamsFragment;", "listFragment", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "liveMatchData", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "getLiveMatchData", "()Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "setLiveMatchData", "(Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;)V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "mRunnableTask", "Ljava/lang/Runnable;", "matchId", "getMatchId", "setMatchId", "players", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamPlayers;", "getPlayers", "()Ljava/util/ArrayList;", "setPlayers", "(Ljava/util/ArrayList;)V", "playersPotData", "Lcom/crickpe/view/detail/fragments/my_matches_detail/PlayersPotModel;", "totalFantasyPoints", "getTotalFantasyPoints", "setTotalFantasyPoints", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "addLayout", "", "addList", "backHandle", "getFragmentLayoutResId", "initPager", "listeners", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClick", "leaderboardModel", "Lcom/crickpe/data/leaderboard/LeaderboardModel;", "position", "onResume", "onTeamClick", "fantasyTeamListModel", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter2", "setData", "data", "Lcom/crickpe/view/detail/fragments/my_matches_detail/MyMatchDetailModel;", "setLayout", "layout", "layoutContainer", "Landroid/widget/LinearLayout;", "setLiveScoreData", "Lcom/crickpe/view/detail/fragments/my_matches_detail/LiveScoreModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MatchDetailFragment.kt */
public final class MatchDetailFragment extends BaseFragment implements View.OnClickListener, LeaderboardAdapter.OnClick, ContestTeamAdapter.OnClick {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private PlayersPotAdapter adapterPlayersPotAdapter;
    private boolean apiCalled;
    private String contestId = "";
    private int contestTypeId;
    private int currentTabPosition;
    private WinningsFragment fragment1;
    private LeaderboardFragment fragment2;
    private LiveScoreFragment fragment3;
    private MatchTeamsFragment fragment4;
    private ArrayList<Fragment> listFragment = new ArrayList<>();
    private MyMatchesModel liveMatchData;
    private Handler mHandler;
    private final Runnable mRunnableTask;
    private String matchId = "";
    private ArrayList<FantasyTeamPlayers> players;
    private PlayersPotModel playersPotData;
    private String totalFantasyPoints = "";
    /* access modifiers changed from: private */
    public DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MatchDetailFragment.kt */
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
        return C1188R.C1193layout.fragment_match_detail;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MatchDetailFragment() {
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        this.mHandler = new Handler(myLooper);
        this.mRunnableTask = new MatchDetailFragment$mRunnableTask$1(this);
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final void setContestId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contestId = str;
    }

    public final String getTotalFantasyPoints() {
        return this.totalFantasyPoints;
    }

    public final void setTotalFantasyPoints(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.totalFantasyPoints = str;
    }

    public final int getContestTypeId() {
        return this.contestTypeId;
    }

    public final void setContestTypeId(int i) {
        this.contestTypeId = i;
    }

    public final int getCurrentTabPosition() {
        return this.currentTabPosition;
    }

    public final void setCurrentTabPosition(int i) {
        this.currentTabPosition = i;
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

    public final MyMatchesModel getLiveMatchData() {
        return this.liveMatchData;
    }

    public final void setLiveMatchData(MyMatchesModel myMatchesModel) {
        this.liveMatchData = myMatchesModel;
    }

    public final ArrayList<FantasyTeamPlayers> getPlayers() {
        return this.players;
    }

    public final void setPlayers(ArrayList<FantasyTeamPlayers> arrayList) {
        this.players = arrayList;
    }

    public void onResume() {
        super.onResume();
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) _$_findCachedViewById(C1188R.C1192id.shimmer_view_container);
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "shimmer_view_container");
        CommonMethodsKt.visible(shimmerFrameLayout);
        ((ShimmerFrameLayout) _$_findCachedViewById(C1188R.C1192id.shimmer_view_container)).startShimmerAnimation();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        listeners();
        setAdapter2();
        if (UserManager.INSTANCE.getLiveMatch() != null) {
            this.liveMatchData = UserManager.INSTANCE.getLiveMatch();
        }
        if (!Intrinsics.areEqual((Object) UserManager.INSTANCE.getMatchId(), (Object) "null")) {
            this.matchId = UserManager.INSTANCE.getMatchId();
        }
        DetailViewModel detailViewModel = null;
        if (getArguments() != null) {
            PlayersPotModel playersPotModel = (PlayersPotModel) new Gson().fromJson(requireArguments().getString("PLAYERS_POT_DATA"), PlayersPotModel.class);
            this.playersPotData = playersPotModel;
            if (playersPotModel != null) {
                TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout);
                Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
                CommonMethodsKt.hide(tabLayout);
                ViewPager viewPager = (ViewPager) _$_findCachedViewById(C1188R.C1192id.viewPager);
                Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
                CommonMethodsKt.hide(viewPager);
                CardView cardView = (CardView) _$_findCachedViewById(C1188R.C1192id.cvPlayersPot);
                Intrinsics.checkNotNullExpressionValue(cardView, "cvPlayersPot");
                CommonMethodsKt.hide(cardView);
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.layoutPlayersPot);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "layoutPlayersPot");
                CommonMethodsKt.visible(linearLayout);
                PlayersPotModel playersPotModel2 = this.playersPotData;
                Intrinsics.checkNotNull(playersPotModel2);
                if (playersPotModel2.getPlayers().size() > 0) {
                    LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llNoPot);
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "llNoPot");
                    CommonMethodsKt.hide(linearLayout2);
                    PlayersPotAdapter playersPotAdapter = this.adapterPlayersPotAdapter;
                    if (playersPotAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapterPlayersPotAdapter");
                        playersPotAdapter = null;
                    }
                    PlayersPotModel playersPotModel3 = this.playersPotData;
                    Intrinsics.checkNotNull(playersPotModel3);
                    playersPotAdapter.addList(true, playersPotModel3.getPlayers());
                } else {
                    LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llNoPot);
                    Intrinsics.checkNotNullExpressionValue(linearLayout3, "llNoPot");
                    CommonMethodsKt.visible(linearLayout3);
                    RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.onItemClick);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout, "onItemClick");
                    CommonMethodsKt.hide(relativeLayout);
                }
            }
            String string = requireArguments().getString("contestId", "");
            Intrinsics.checkNotNullExpressionValue(string, "requireArguments().getString(\"contestId\", \"\")");
            this.contestId = string;
            this.contestTypeId = requireArguments().getInt("contestTypeId", 0);
            initPager();
            Log.v("TEST", String.valueOf(this.contestTypeId));
            if (this.contestTypeId == 2) {
                CardView cardView2 = (CardView) _$_findCachedViewById(C1188R.C1192id.cvPlayersPot);
                Intrinsics.checkNotNullExpressionValue(cardView2, "cvPlayersPot");
                CommonMethodsKt.visible(cardView2);
            } else {
                CardView cardView3 = (CardView) _$_findCachedViewById(C1188R.C1192id.cvPlayersPot);
                Intrinsics.checkNotNullExpressionValue(cardView3, "cvPlayersPot");
                CommonMethodsKt.hide(cardView3);
            }
        } else {
            Log.v("ARGUMENT_NULL", "NULL");
        }
        DetailViewModel detailViewModel2 = this.viewModel;
        if (detailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel2 = null;
        }
        detailViewModel2.getMatchDetailApi(this.matchId);
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel = detailViewModel3;
        }
        detailViewModel.getPlayersPotApi(this.matchId);
        observeData();
    }

    private final void listeners() {
        try {
            if (UserManager.INSTANCE.getClick() != 2) {
                this.mHandler.postDelayed(this.mRunnableTask, 20000);
            }
        } catch (Exception e) {
            Log.v("mRunnableTask", e.toString());
        }
        ((CardView) _$_findCachedViewById(C1188R.C1192id.cvPlayersPot)).setOnClickListener(this);
    }

    public final boolean backHandle() {
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlGroundLayout");
        if (relativeLayout.getVisibility() == 0) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMatch);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llMatch");
            CommonMethodsKt.visible(linearLayout);
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlGroundLayout");
            CommonMethodsKt.hide(relativeLayout2);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_out_down);
            Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_out_down)");
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout)).startAnimation(loadAnimation);
            return false;
        }
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.layoutPlayersPot);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "layoutPlayersPot");
        if (!(linearLayout2.getVisibility() == 0) || Intrinsics.areEqual((Object) this.contestId, (Object) "")) {
            this.mHandler.removeCallbacksAndMessages((Object) null);
            return true;
        }
        CardView cardView = (CardView) _$_findCachedViewById(C1188R.C1192id.cvPlayersPot);
        Intrinsics.checkNotNullExpressionValue(cardView, "cvPlayersPot");
        CommonMethodsKt.visible(cardView);
        TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout);
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        CommonMethodsKt.visible(tabLayout);
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C1188R.C1192id.viewPager);
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        CommonMethodsKt.visible(viewPager);
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.layoutPlayersPot);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "layoutPlayersPot");
        CommonMethodsKt.hide(linearLayout3);
        return false;
    }

    private final void initPager() {
        ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).removeAllTabs();
        if (this.contestTypeId != 4) {
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.winnings)));
        }
        ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.leaderboard)));
        ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.scoreboard)));
        ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.my_team)));
        if (this.listFragment.isEmpty()) {
            addList();
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        ((ViewPager) _$_findCachedViewById(C1188R.C1192id.viewPager)).setAdapter(new HomeTabAdapter(childFragmentManager, this.listFragment));
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C1188R.C1192id.viewPager);
        Intrinsics.checkNotNull(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)));
        TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout);
        Intrinsics.checkNotNull(tabLayout);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new MatchDetailFragment$initPager$1(this));
    }

    private final void addList() {
        MatchTeamsFragment matchTeamsFragment = null;
        if (this.contestTypeId != 4) {
            this.fragment1 = new WinningsFragment();
            Bundle bundle = new Bundle();
            bundle.putString("contestId", this.contestId);
            WinningsFragment winningsFragment = this.fragment1;
            if (winningsFragment == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragment1");
                winningsFragment = null;
            }
            winningsFragment.setArguments(bundle);
            ArrayList<Fragment> arrayList = this.listFragment;
            WinningsFragment winningsFragment2 = this.fragment1;
            if (winningsFragment2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("fragment1");
                winningsFragment2 = null;
            }
            arrayList.add(winningsFragment2);
        }
        this.fragment2 = new LeaderboardFragment(this);
        Bundle bundle2 = new Bundle();
        bundle2.putString("contestId", this.contestId);
        LeaderboardFragment leaderboardFragment = this.fragment2;
        if (leaderboardFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment2");
            leaderboardFragment = null;
        }
        leaderboardFragment.setArguments(bundle2);
        ArrayList<Fragment> arrayList2 = this.listFragment;
        LeaderboardFragment leaderboardFragment2 = this.fragment2;
        if (leaderboardFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment2");
            leaderboardFragment2 = null;
        }
        arrayList2.add(leaderboardFragment2);
        this.fragment3 = new LiveScoreFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putString("matchId", this.matchId);
        LiveScoreFragment liveScoreFragment = this.fragment3;
        if (liveScoreFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment3");
            liveScoreFragment = null;
        }
        liveScoreFragment.setArguments(bundle3);
        ArrayList<Fragment> arrayList3 = this.listFragment;
        LiveScoreFragment liveScoreFragment2 = this.fragment3;
        if (liveScoreFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment3");
            liveScoreFragment2 = null;
        }
        arrayList3.add(liveScoreFragment2);
        this.fragment4 = new MatchTeamsFragment(this);
        Bundle bundle4 = new Bundle();
        bundle4.putString("contestId", this.contestId);
        MatchTeamsFragment matchTeamsFragment2 = this.fragment4;
        if (matchTeamsFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment4");
            matchTeamsFragment2 = null;
        }
        matchTeamsFragment2.setArguments(bundle4);
        ArrayList<Fragment> arrayList4 = this.listFragment;
        MatchTeamsFragment matchTeamsFragment3 = this.fragment4;
        if (matchTeamsFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment4");
        } else {
            matchTeamsFragment = matchTeamsFragment3;
        }
        arrayList4.add(matchTeamsFragment);
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamPlayers>>> fantasyTeamById = detailViewModel.getFantasyTeamById();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        fantasyTeamById.observe(viewLifecycleOwner, new MatchDetailFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<MyMatchDetailModel>> myMatchesdetail = detailViewModel3.getMyMatchesdetail();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        myMatchesdetail.observe(viewLifecycleOwner2, new MatchDetailFragment$$ExternalSyntheticLambda1(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<PlayersPotModel>> playersPot = detailViewModel4.getPlayersPot();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        playersPot.observe(viewLifecycleOwner3, new MatchDetailFragment$$ExternalSyntheticLambda2(this));
        DetailViewModel detailViewModel5 = this.viewModel;
        if (detailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel5;
        }
        SingleLiveEvent<ApiResponseHandler<LiveScoreModel>> liveScore = detailViewModel2.getLiveScore();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        liveScore.observe(viewLifecycleOwner4, new MatchDetailFragment$$ExternalSyntheticLambda3(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3562observeData$lambda0(MatchDetailFragment matchDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(matchDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList<FantasyTeamPlayers> arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    ((LinearLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.llContainerWk)).removeAllViews();
                    ((LinearLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.llContainerBat)).removeAllViews();
                    ((LinearLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.llContainerBowlers)).removeAllViews();
                    ((LinearLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.llContainerAllRound)).removeAllViews();
                    try {
                        matchDetailFragment.players = arrayList;
                        RelativeLayout relativeLayout = (RelativeLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
                        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlGroundLayout");
                        CommonMethodsKt.visible(relativeLayout);
                        TextView textView = (TextView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.tvTotalPoints);
                        Intrinsics.checkNotNullExpressionValue(textView, "tvTotalPoints");
                        CommonMethodsKt.visible(textView);
                        ((TextView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.tvTotalPoints)).setText(matchDetailFragment.totalFantasyPoints + " pts");
                        LinearLayout linearLayout = (LinearLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.llMatch);
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "llMatch");
                        CommonMethodsKt.hide(linearLayout);
                        TextView textView2 = (TextView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.tvCreateFantacyTeam);
                        Intrinsics.checkNotNullExpressionValue(textView2, "tvCreateFantacyTeam");
                        CommonMethodsKt.hide(textView2);
                        Animation loadAnimation = AnimationUtils.loadAnimation(matchDetailFragment.getContext(), C1188R.anim.slide_in_up);
                        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_in_up)");
                        ((RelativeLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.rlGroundLayout)).startAnimation(loadAnimation);
                        ArrayList<FantasyTeamPlayers> arrayList2 = matchDetailFragment.players;
                        Intrinsics.checkNotNull(arrayList2);
                        int size = arrayList2.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ArrayList<FantasyTeamPlayers> arrayList3 = matchDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList3);
                            String str = "";
                            if (arrayList3.get(i2).isFantasyCaptain()) {
                                ArrayList<FantasyTeamPlayers> arrayList4 = matchDetailFragment.players;
                                Intrinsics.checkNotNull(arrayList4);
                                ((TextView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.tvCaptainn)).setText(arrayList4.get(i2).getName());
                                CircleImageView circleImageView = (CircleImageView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.ivCaptain);
                                Intrinsics.checkNotNullExpressionValue(circleImageView, "ivCaptain");
                                ImageView imageView = circleImageView;
                                ArrayList<FantasyTeamPlayers> arrayList5 = matchDetailFragment.players;
                                Intrinsics.checkNotNull(arrayList5);
                                String imageUrl = arrayList5.get(i2).getImageUrl();
                                if (imageUrl == null) {
                                    imageUrl = str;
                                }
                                ExtensionsKt.loadImage(imageView, imageUrl, C1188R.C1190drawable.profile_placeholder, true);
                            }
                            ArrayList<FantasyTeamPlayers> arrayList6 = matchDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList6);
                            if (arrayList6.get(i2).isFantasyViceCaptain()) {
                                ArrayList<FantasyTeamPlayers> arrayList7 = matchDetailFragment.players;
                                Intrinsics.checkNotNull(arrayList7);
                                ((TextView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.tvVCaptainn)).setText(arrayList7.get(i2).getName());
                                CircleImageView circleImageView2 = (CircleImageView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.ivVCaptain);
                                Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivVCaptain");
                                ImageView imageView2 = circleImageView2;
                                ArrayList<FantasyTeamPlayers> arrayList8 = matchDetailFragment.players;
                                Intrinsics.checkNotNull(arrayList8);
                                String imageUrl2 = arrayList8.get(i2).getImageUrl();
                                if (imageUrl2 != null) {
                                    str = imageUrl2;
                                }
                                ExtensionsKt.loadImage(imageView2, str, C1188R.C1190drawable.profile_placeholder, true);
                            }
                            ArrayList<FantasyTeamPlayers> arrayList9 = matchDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList9);
                            int roleId = arrayList9.get(i2).getRole().getRoleId();
                            if (roleId == 1) {
                                ArrayList<FantasyTeamPlayers> arrayList10 = matchDetailFragment.players;
                                Intrinsics.checkNotNull(arrayList10);
                                FantasyTeamPlayers fantasyTeamPlayers = arrayList10.get(i2);
                                Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers, "players!![i]");
                                matchDetailFragment.addLayout(fantasyTeamPlayers);
                            } else if (roleId == 2) {
                                ArrayList<FantasyTeamPlayers> arrayList11 = matchDetailFragment.players;
                                Intrinsics.checkNotNull(arrayList11);
                                FantasyTeamPlayers fantasyTeamPlayers2 = arrayList11.get(i2);
                                Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers2, "players!![i]");
                                matchDetailFragment.addLayout(fantasyTeamPlayers2);
                            } else if (roleId != 3) {
                                ArrayList<FantasyTeamPlayers> arrayList12 = matchDetailFragment.players;
                                Intrinsics.checkNotNull(arrayList12);
                                FantasyTeamPlayers fantasyTeamPlayers3 = arrayList12.get(i2);
                                Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers3, "players!![i]");
                                matchDetailFragment.addLayout(fantasyTeamPlayers3);
                            } else {
                                ArrayList<FantasyTeamPlayers> arrayList13 = matchDetailFragment.players;
                                Intrinsics.checkNotNull(arrayList13);
                                FantasyTeamPlayers fantasyTeamPlayers4 = arrayList13.get(i2);
                                Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers4, "players!![i]");
                                matchDetailFragment.addLayout(fantasyTeamPlayers4);
                            }
                        }
                    } catch (Exception e) {
                        Log.v("EXCEPTION", e.toString());
                    }
                }
            } else if (i == 2) {
                Log.v("ErROR", String.valueOf(apiResponseHandler.getData()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3563observeData$lambda1(MatchDetailFragment matchDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(matchDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                matchDetailFragment.apiCalled = true;
                MyMatchDetailModel myMatchDetailModel = (MyMatchDetailModel) apiResponseHandler.getData();
                if (myMatchDetailModel != null) {
                    matchDetailFragment.setData(myMatchDetailModel);
                }
                ((ShimmerFrameLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container)).stopShimmerAnimation();
                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container);
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "shimmer_view_container");
                CommonMethodsKt.hide(shimmerFrameLayout);
            } else if (i == 2) {
                ((ShimmerFrameLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container)).stopShimmerAnimation();
                ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container);
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout2, "shimmer_view_container");
                CommonMethodsKt.hide(shimmerFrameLayout2);
            } else if (i == 3) {
                ((ShimmerFrameLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container)).startShimmerAnimation();
                ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.shimmer_view_container);
                Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout3, "shimmer_view_container");
                CommonMethodsKt.visible(shimmerFrameLayout3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3564observeData$lambda2(MatchDetailFragment matchDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(matchDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                PlayersPotModel playersPotModel = (PlayersPotModel) apiResponseHandler.getData();
                if (playersPotModel != null) {
                    try {
                        matchDetailFragment.playersPotData = playersPotModel;
                        ((TextView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.tvPointss)).setText(matchDetailFragment.numDifferentiation(playersPotModel.getTotalEarning()));
                        PlayersPotModel playersPotModel2 = matchDetailFragment.playersPotData;
                        Intrinsics.checkNotNull(playersPotModel2);
                        if (playersPotModel2.getPlayers().size() > 0) {
                            RelativeLayout relativeLayout = (RelativeLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerOne);
                            Intrinsics.checkNotNullExpressionValue(relativeLayout, "playerOne");
                            CommonMethodsKt.visible(relativeLayout);
                            PlayersPotModel playersPotModel3 = matchDetailFragment.playersPotData;
                            Intrinsics.checkNotNull(playersPotModel3);
                            ((TextView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerName1)).setText(playersPotModel3.getPlayers().get(0).getName());
                            RequestManager with = Glide.with((Fragment) matchDetailFragment);
                            StringBuilder sb = new StringBuilder();
                            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                            String str = null;
                            sb.append(appSettings != null ? appSettings.getImageBaseUrl() : null);
                            PlayersPotModel playersPotModel4 = matchDetailFragment.playersPotData;
                            Intrinsics.checkNotNull(playersPotModel4);
                            sb.append(playersPotModel4.getPlayers().get(0).getImageUrl());
                            with.load(sb.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerImageOne));
                            PlayersPotModel playersPotModel5 = matchDetailFragment.playersPotData;
                            Intrinsics.checkNotNull(playersPotModel5);
                            if (playersPotModel5.getPlayers().size() > 1) {
                                RelativeLayout relativeLayout2 = (RelativeLayout) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerSecond);
                                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "playerSecond");
                                CommonMethodsKt.visible(relativeLayout2);
                                PlayersPotModel playersPotModel6 = matchDetailFragment.playersPotData;
                                Intrinsics.checkNotNull(playersPotModel6);
                                ((TextView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerName2)).setText(playersPotModel6.getPlayers().get(1).getName());
                                RequestManager with2 = Glide.with((Fragment) matchDetailFragment);
                                StringBuilder sb2 = new StringBuilder();
                                SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                                if (appSettings2 != null) {
                                    str = appSettings2.getImageBaseUrl();
                                }
                                sb2.append(str);
                                PlayersPotModel playersPotModel7 = matchDetailFragment.playersPotData;
                                Intrinsics.checkNotNull(playersPotModel7);
                                sb2.append(playersPotModel7.getPlayers().get(1).getImageUrl());
                                with2.load(sb2.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) matchDetailFragment._$_findCachedViewById(C1188R.C1192id.playerImageTwo));
                            }
                        }
                    } catch (Exception e) {
                        Log.v("EXCEPTION", e.toString());
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = matchDetailFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                matchDetailFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-3  reason: not valid java name */
    public static final void m3565observeData$lambda3(MatchDetailFragment matchDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(matchDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            if (WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()] == 1) {
                matchDetailFragment.apiCalled = true;
                LiveScoreModel liveScoreModel = (LiveScoreModel) apiResponseHandler.getData();
                if (liveScoreModel != null) {
                    try {
                        matchDetailFragment.setLiveScoreData(liveScoreModel);
                    } catch (Exception e) {
                        Log.v("Exception", e.toString());
                    }
                }
            }
        }
    }

    private final void addLayout(FantasyTeamPlayers fantasyTeamPlayers) {
        int roleId = fantasyTeamPlayers.getRole().getRoleId();
        if (roleId == 1) {
            View inflate = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBat), false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(requireActivity())\n…d, llContainerBat, false)");
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBat);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llContainerBat");
            setLayout(inflate, fantasyTeamPlayers, linearLayout);
        } else if (roleId == 2) {
            View inflate2 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBowlers), false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "from(requireActivity())\n…lContainerBowlers, false)");
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBowlers);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llContainerBowlers");
            setLayout(inflate2, fantasyTeamPlayers, linearLayout2);
        } else if (roleId == 3) {
            View inflate3 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerWk), false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "from(requireActivity())\n…nd, llContainerWk, false)");
            LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerWk);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "llContainerWk");
            setLayout(inflate3, fantasyTeamPlayers, linearLayout3);
        } else if (roleId == 4) {
            View inflate4 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerAllRound), false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "from(requireActivity())\n…ContainerAllRound, false)");
            LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerAllRound);
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "llContainerAllRound");
            setLayout(inflate4, fantasyTeamPlayers, linearLayout4);
        }
    }

    public final void setLayout(View view, FantasyTeamPlayers fantasyTeamPlayers, LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(view, "layout");
        Intrinsics.checkNotNullParameter(fantasyTeamPlayers, "players");
        Intrinsics.checkNotNullParameter(linearLayout, "layoutContainer");
        try {
            View findViewById = view.findViewById(C1188R.C1192id.ivPlayer);
            if (findViewById != null) {
                ImageView imageView = (ImageView) findViewById;
                View findViewById2 = view.findViewById(C1188R.C1192id.tvPoints);
                if (findViewById2 != null) {
                    ((TextView) findViewById2).setText(((int) fantasyTeamPlayers.getFantasyPoints()) + ' ' + getResources().getString(C1188R.string.pts));
                    View findViewById3 = view.findViewById(C1188R.C1192id.tvType);
                    if (findViewById3 != null) {
                        TextView textView = (TextView) findViewById3;
                        if (fantasyTeamPlayers.isFantasyCaptain()) {
                            String string = requireContext().getString(C1188R.string.f424c);
                            Intrinsics.checkNotNullExpressionValue(string, "requireContext().getString(R.string.c)");
                            textView.setText(string);
                            CommonMethodsKt.visible(textView);
                        } else if (fantasyTeamPlayers.isFantasyViceCaptain()) {
                            String string2 = requireContext().getString(C1188R.string.f428vc);
                            Intrinsics.checkNotNullExpressionValue(string2, "requireContext().getString(R.string.vc)");
                            textView.setText(string2);
                            CommonMethodsKt.visible(textView);
                        } else {
                            CommonMethodsKt.hide(textView);
                        }
                        View findViewById4 = view.findViewById(C1188R.C1192id.tvName);
                        if (findViewById4 != null) {
                            TextView textView2 = (TextView) findViewById4;
                            String str = "";
                            if (fantasyTeamPlayers.getName() != null) {
                                textView2.setText(printInitials(fantasyTeamPlayers.getName()));
                            } else {
                                textView2.setText(str);
                            }
                            String imageUrl = fantasyTeamPlayers.getImageUrl();
                            if (imageUrl != null) {
                                str = imageUrl;
                            }
                            ExtensionsKt.loadImage(imageView, str, C1188R.C1190drawable.profile_placeholder, true);
                            linearLayout.addView(view);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        } catch (Exception e) {
            Log.v("setLayouttt", e.toString());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setData(MyMatchDetailModel r22) {
        /*
            r21 = this;
            r1 = r21
            java.lang.String r2 = ""
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()
            if (r0 == 0) goto L_0x0661
            r3 = 41
            r4 = 40
            r5 = 1
            r6 = 0
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r0 = r0.getInnings()     // Catch:{ Exception -> 0x047c }
            int r0 = r0.size()     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = "ivTeam1Flag"
            r8 = 47
            if (r0 <= r5) goto L_0x0331
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r0 = r0.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r0 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r0     // Catch:{ Exception -> 0x047c }
            java.lang.String r0 = r0.getTeamIconUrl()     // Catch:{ Exception -> 0x047c }
            if (r0 == 0) goto L_0x0049
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r0 = r0.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r0 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r0     // Catch:{ Exception -> 0x047c }
            java.lang.String r0 = r0.getTeamIconUrl()     // Catch:{ Exception -> 0x047c }
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            java.lang.String r9 = r9.getTeamIconUrl()     // Catch:{ Exception -> 0x047c }
            if (r9 == 0) goto L_0x0071
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            java.lang.String r9 = r9.getTeamIconUrl()     // Catch:{ Exception -> 0x047c }
            goto L_0x0072
        L_0x0071:
            r9 = r2
        L_0x0072:
            androidx.fragment.app.FragmentActivity r10 = r21.getActivity()     // Catch:{ Exception -> 0x047c }
            java.lang.String r11 = "null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity"
            if (r10 == 0) goto L_0x032b
            com.crickpe.view.detail.DetailActivity r10 = (com.crickpe.view.detail.DetailActivity) r10     // Catch:{ Exception -> 0x047c }
            r10.setImageDynamically(r0, r9)     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r0.<init>()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            java.lang.String r9 = r9.getCode()     // Catch:{ Exception -> 0x047c }
            r0.append(r9)     // Catch:{ Exception -> 0x047c }
            java.lang.String r9 = " vs "
            r0.append(r9)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            java.lang.String r9 = r9.getCode()     // Catch:{ Exception -> 0x047c }
            r0.append(r9)     // Catch:{ Exception -> 0x047c }
            java.lang.String r13 = r0.toString()     // Catch:{ Exception -> 0x047c }
            androidx.fragment.app.FragmentActivity r0 = r21.getActivity()     // Catch:{ Exception -> 0x047c }
            if (r0 == 0) goto L_0x0325
            r12 = r0
            com.crickpe.view.detail.DetailActivity r12 = (com.crickpe.view.detail.DetailActivity) r12     // Catch:{ Exception -> 0x047c }
            r14 = 1
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r12.setTopBar(r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x047c }
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE     // Catch:{ Exception -> 0x047c }
            int r0 = r0.getContestClick()     // Catch:{ Exception -> 0x047c }
            java.lang.String r9 = "llMatchCompleted"
            java.lang.String r10 = "llMatchLive"
            if (r0 != 0) goto L_0x00fb
            int r0 = com.crickpe.C1188R.C1192id.llMatchLive     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x047c }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x047c }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.llMatchCompleted     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x047c }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x047c }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x047c }
        L_0x00fb:
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE     // Catch:{ Exception -> 0x047c }
            int r0 = r0.getContestClick()     // Catch:{ Exception -> 0x047c }
            r11 = 2
            if (r0 != r11) goto L_0x0124
            int r0 = com.crickpe.C1188R.C1192id.llMatchCompleted     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x047c }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x047c }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.llMatchLive     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x047c }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x047c }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x047c }
        L_0x0124:
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r0 = r0.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r0 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r0     // Catch:{ Exception -> 0x047c }
            java.lang.String r0 = r0.getCode()     // Catch:{ Exception -> 0x047c }
            int r9 = com.crickpe.C1188R.C1192id.tvT2Name     // Catch:{ Exception -> 0x047c }
            android.view.View r9 = r1._$_findCachedViewById(r9)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x047c }
            r9.setText(r0)     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r0.<init>()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            int r9 = r9.getRuns()     // Catch:{ Exception -> 0x047c }
            r0.append(r9)     // Catch:{ Exception -> 0x047c }
            r0.append(r8)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r5)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            int r9 = r9.getWickets()     // Catch:{ Exception -> 0x047c }
            r0.append(r9)     // Catch:{ Exception -> 0x047c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x047c }
            int r9 = com.crickpe.C1188R.C1192id.tvScoreTeam2     // Catch:{ Exception -> 0x047c }
            android.view.View r9 = r1._$_findCachedViewById(r9)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r9 = (android.widget.TextView) r9     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x047c }
            r9.setText(r0)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.ivTeam2Flag     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.String r9 = "ivTeam2Flag"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)     // Catch:{ Exception -> 0x047c }
            r10 = r0
            android.widget.ImageView r10 = (android.widget.ImageView) r10     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r0 = r0.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r0 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r0     // Catch:{ Exception -> 0x047c }
            java.lang.String r0 = r0.getTeamIconUrl()     // Catch:{ Exception -> 0x047c }
            if (r0 != 0) goto L_0x01ac
            r11 = r2
            goto L_0x01ad
        L_0x01ac:
            r11 = r0
        L_0x01ad:
            r12 = 2131165585(0x7f070191, float:1.7945391E38)
            r13 = 0
            r14 = 4
            r15 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvOversT2     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r9.<init>()     // Catch:{ Exception -> 0x047c }
            r9.append(r4)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r10 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r10 = r10.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r10 = r10.get(r5)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r10 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r10     // Catch:{ Exception -> 0x047c }
            double r10 = r10.getOvers()     // Catch:{ Exception -> 0x047c }
            r9.append(r10)     // Catch:{ Exception -> 0x047c }
            r9.append(r3)     // Catch:{ Exception -> 0x047c }
            java.lang.String r9 = r9.toString()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Exception -> 0x047c }
            r0.setText(r9)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.ivTeam1Flag     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x047c }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)     // Catch:{ Exception -> 0x047c }
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r0 = r0.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r0 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r0     // Catch:{ Exception -> 0x047c }
            java.lang.String r0 = r0.getTeamIconUrl()     // Catch:{ Exception -> 0x047c }
            if (r0 != 0) goto L_0x020b
            r10 = r2
            goto L_0x020c
        L_0x020b:
            r10 = r0
        L_0x020c:
            r11 = 2131165585(0x7f070191, float:1.7945391E38)
            r12 = 0
            r13 = 4
            r14 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvT1Name     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r7 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r7 = r7.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r7 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r7     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.getCode()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvT1Score     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r7.<init>()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            int r9 = r9.getRuns()     // Catch:{ Exception -> 0x047c }
            r7.append(r9)     // Catch:{ Exception -> 0x047c }
            r7.append(r8)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            int r9 = r9.getWickets()     // Catch:{ Exception -> 0x047c }
            r7.append(r9)     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvT1Overs     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r7.<init>()     // Catch:{ Exception -> 0x047c }
            r7.append(r4)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            double r9 = r9.getOvers()     // Catch:{ Exception -> 0x047c }
            r7.append(r9)     // Catch:{ Exception -> 0x047c }
            r7.append(r3)     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvBowlerName     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r7 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Bowler r7 = r7.getBowler()     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.getName()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvBowlerStat     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r7.<init>()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Bowler r9 = r9.getBowler()     // Catch:{ Exception -> 0x047c }
            int r9 = r9.getWickets()     // Catch:{ Exception -> 0x047c }
            r7.append(r9)     // Catch:{ Exception -> 0x047c }
            r7.append(r8)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r8 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Bowler r8 = r8.getBowler()     // Catch:{ Exception -> 0x047c }
            int r8 = r8.getRun()     // Catch:{ Exception -> 0x047c }
            r7.append(r8)     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvBowlerOver     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r7.<init>()     // Catch:{ Exception -> 0x047c }
            r7.append(r4)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r8 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Bowler r8 = r8.getBowler()     // Catch:{ Exception -> 0x047c }
            double r8 = r8.getOvers()     // Catch:{ Exception -> 0x047c }
            r7.append(r8)     // Catch:{ Exception -> 0x047c }
            r7.append(r3)     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            goto L_0x0486
        L_0x0325:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x047c }
            r0.<init>(r11)     // Catch:{ Exception -> 0x047c }
            throw r0     // Catch:{ Exception -> 0x047c }
        L_0x032b:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x047c }
            r0.<init>(r11)     // Catch:{ Exception -> 0x047c }
            throw r0     // Catch:{ Exception -> 0x047c }
        L_0x0331:
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r0 = r0.getInnings()     // Catch:{ Exception -> 0x047c }
            int r0 = r0.size()     // Catch:{ Exception -> 0x047c }
            if (r0 != r5) goto L_0x0486
            int r0 = com.crickpe.C1188R.C1192id.ivTeam1Flag     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x047c }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)     // Catch:{ Exception -> 0x047c }
            r9 = r0
            android.widget.ImageView r9 = (android.widget.ImageView) r9     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r0 = r0.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r0 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r0     // Catch:{ Exception -> 0x047c }
            java.lang.String r0 = r0.getTeamIconUrl()     // Catch:{ Exception -> 0x047c }
            if (r0 != 0) goto L_0x0363
            r10 = r2
            goto L_0x0364
        L_0x0363:
            r10 = r0
        L_0x0364:
            r11 = 2131165585(0x7f070191, float:1.7945391E38)
            r12 = 0
            r13 = 4
            r14 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvT1Name     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r7 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r7 = r7.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r7 = r7.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r7 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r7     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.getCode()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvT1Score     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r7.<init>()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            int r9 = r9.getRuns()     // Catch:{ Exception -> 0x047c }
            r7.append(r9)     // Catch:{ Exception -> 0x047c }
            r7.append(r8)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            int r9 = r9.getWickets()     // Catch:{ Exception -> 0x047c }
            r7.append(r9)     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvT1Overs     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r7.<init>()     // Catch:{ Exception -> 0x047c }
            r7.append(r4)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            java.util.ArrayList r9 = r9.getInnings()     // Catch:{ Exception -> 0x047c }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r9 = (com.crickpe.view.detail.fragments.my_matches_detail.Innings) r9     // Catch:{ Exception -> 0x047c }
            double r9 = r9.getOvers()     // Catch:{ Exception -> 0x047c }
            r7.append(r9)     // Catch:{ Exception -> 0x047c }
            r7.append(r3)     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvBowlerName     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r7 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Bowler r7 = r7.getBowler()     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.getName()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvBowlerStat     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r7.<init>()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r9 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Bowler r9 = r9.getBowler()     // Catch:{ Exception -> 0x047c }
            int r9 = r9.getWickets()     // Catch:{ Exception -> 0x047c }
            r7.append(r9)     // Catch:{ Exception -> 0x047c }
            r7.append(r8)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r8 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Bowler r8 = r8.getBowler()     // Catch:{ Exception -> 0x047c }
            int r8 = r8.getRun()     // Catch:{ Exception -> 0x047c }
            r7.append(r8)     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            int r0 = com.crickpe.C1188R.C1192id.tvBowlerOver     // Catch:{ Exception -> 0x047c }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x047c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x047c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x047c }
            r7.<init>()     // Catch:{ Exception -> 0x047c }
            r7.append(r4)     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r8 = r22.getLiveScore()     // Catch:{ Exception -> 0x047c }
            com.crickpe.view.detail.fragments.my_matches_detail.Bowler r8 = r8.getBowler()     // Catch:{ Exception -> 0x047c }
            double r8 = r8.getOvers()     // Catch:{ Exception -> 0x047c }
            r7.append(r8)     // Catch:{ Exception -> 0x047c }
            r7.append(r3)     // Catch:{ Exception -> 0x047c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x047c }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x047c }
            r0.setText(r7)     // Catch:{ Exception -> 0x047c }
            goto L_0x0486
        L_0x047c:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "liveScore.innings"
            android.util.Log.v(r7, r0)
        L_0x0486:
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x04ef }
            com.crickpe.view.detail.fragments.my_matches_detail.BatsmanNonStriker r0 = r0.getBatsmanNonStriker()     // Catch:{ Exception -> 0x04ef }
            if (r0 == 0) goto L_0x04f9
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x04ef }
            com.crickpe.view.detail.fragments.my_matches_detail.BatsmanNonStriker r0 = r0.getBatsmanNonStriker()     // Catch:{ Exception -> 0x04ef }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x04ef }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x04ef }
            int r7 = r0.length()     // Catch:{ Exception -> 0x04ef }
            if (r7 != 0) goto L_0x04a6
            r7 = 1
            goto L_0x04a7
        L_0x04a6:
            r7 = 0
        L_0x04a7:
            if (r7 == 0) goto L_0x04aa
            r0 = r2
        L_0x04aa:
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x04ef }
            int r7 = com.crickpe.C1188R.C1192id.tvBatsman1     // Catch:{ Exception -> 0x04ef }
            android.view.View r7 = r1._$_findCachedViewById(r7)     // Catch:{ Exception -> 0x04ef }
            android.widget.TextView r7 = (android.widget.TextView) r7     // Catch:{ Exception -> 0x04ef }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04ef }
            r8.<init>()     // Catch:{ Exception -> 0x04ef }
            r8.append(r0)     // Catch:{ Exception -> 0x04ef }
            r0 = 32
            r8.append(r0)     // Catch:{ Exception -> 0x04ef }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x04ef }
            com.crickpe.view.detail.fragments.my_matches_detail.BatsmanNonStriker r0 = r0.getBatsmanNonStriker()     // Catch:{ Exception -> 0x04ef }
            int r0 = r0.getRun()     // Catch:{ Exception -> 0x04ef }
            r8.append(r0)     // Catch:{ Exception -> 0x04ef }
            r8.append(r4)     // Catch:{ Exception -> 0x04ef }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x04ef }
            com.crickpe.view.detail.fragments.my_matches_detail.BatsmanNonStriker r0 = r0.getBatsmanNonStriker()     // Catch:{ Exception -> 0x04ef }
            int r0 = r0.getBall()     // Catch:{ Exception -> 0x04ef }
            r8.append(r0)     // Catch:{ Exception -> 0x04ef }
            r8.append(r3)     // Catch:{ Exception -> 0x04ef }
            java.lang.String r0 = r8.toString()     // Catch:{ Exception -> 0x04ef }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x04ef }
            r7.setText(r0)     // Catch:{ Exception -> 0x04ef }
            goto L_0x04f9
        L_0x04ef:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r7 = "batsmanNonStriker"
            android.util.Log.v(r7, r0)
        L_0x04f9:
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x0563 }
            com.crickpe.view.detail.fragments.my_matches_detail.BatsmanStriker r0 = r0.getBatsmanStriker()     // Catch:{ Exception -> 0x0563 }
            if (r0 == 0) goto L_0x056d
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x0563 }
            com.crickpe.view.detail.fragments.my_matches_detail.BatsmanStriker r0 = r0.getBatsmanStriker()     // Catch:{ Exception -> 0x0563 }
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0563 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0563 }
            int r7 = r0.length()     // Catch:{ Exception -> 0x0563 }
            if (r7 != 0) goto L_0x0519
            r7 = 1
            goto L_0x051a
        L_0x0519:
            r7 = 0
        L_0x051a:
            if (r7 == 0) goto L_0x051d
            goto L_0x051e
        L_0x051d:
            r2 = r0
        L_0x051e:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0563 }
            int r0 = com.crickpe.C1188R.C1192id.tvBatsman2     // Catch:{ Exception -> 0x0563 }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x0563 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x0563 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0563 }
            r7.<init>()     // Catch:{ Exception -> 0x0563 }
            r7.append(r2)     // Catch:{ Exception -> 0x0563 }
            java.lang.String r2 = "* "
            r7.append(r2)     // Catch:{ Exception -> 0x0563 }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r2 = r22.getLiveScore()     // Catch:{ Exception -> 0x0563 }
            com.crickpe.view.detail.fragments.my_matches_detail.BatsmanStriker r2 = r2.getBatsmanStriker()     // Catch:{ Exception -> 0x0563 }
            int r2 = r2.getRun()     // Catch:{ Exception -> 0x0563 }
            r7.append(r2)     // Catch:{ Exception -> 0x0563 }
            r7.append(r4)     // Catch:{ Exception -> 0x0563 }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r2 = r22.getLiveScore()     // Catch:{ Exception -> 0x0563 }
            com.crickpe.view.detail.fragments.my_matches_detail.BatsmanStriker r2 = r2.getBatsmanStriker()     // Catch:{ Exception -> 0x0563 }
            int r2 = r2.getBall()     // Catch:{ Exception -> 0x0563 }
            r7.append(r2)     // Catch:{ Exception -> 0x0563 }
            r7.append(r3)     // Catch:{ Exception -> 0x0563 }
            java.lang.String r2 = r7.toString()     // Catch:{ Exception -> 0x0563 }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x0563 }
            r0.setText(r2)     // Catch:{ Exception -> 0x0563 }
            goto L_0x056d
        L_0x0563:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "batsmanStriker"
            android.util.Log.v(r2, r0)
        L_0x056d:
            int r0 = com.crickpe.C1188R.C1192id.llBallsContainer     // Catch:{ Exception -> 0x0657 }
            android.view.View r0 = r1._$_findCachedViewById(r0)     // Catch:{ Exception -> 0x0657 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x0657 }
            r0.removeAllViews()     // Catch:{ Exception -> 0x0657 }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x0657 }
            java.util.ArrayList r0 = r0.getBalls()     // Catch:{ Exception -> 0x0657 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0657 }
            r2 = 0
        L_0x0585:
            java.lang.String r3 = "from(requireActivity())\n… llBallsContainer, false)"
            r4 = 2131492899(0x7f0c0023, float:1.8609263E38)
            if (r2 >= r0) goto L_0x060f
            androidx.fragment.app.FragmentActivity r7 = r21.requireActivity()     // Catch:{ Exception -> 0x0657 }
            android.content.Context r7 = (android.content.Context) r7     // Catch:{ Exception -> 0x0657 }
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)     // Catch:{ Exception -> 0x0657 }
            int r8 = com.crickpe.C1188R.C1192id.llBallsContainer     // Catch:{ Exception -> 0x0657 }
            android.view.View r8 = r1._$_findCachedViewById(r8)     // Catch:{ Exception -> 0x0657 }
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8     // Catch:{ Exception -> 0x0657 }
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8     // Catch:{ Exception -> 0x0657 }
            android.view.View r4 = r7.inflate(r4, r8, r6)     // Catch:{ Exception -> 0x0657 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)     // Catch:{ Exception -> 0x0657 }
            r3 = 2131297733(0x7f0905c5, float:1.821342E38)
            android.view.View r3 = r4.findViewById(r3)     // Catch:{ Exception -> 0x0657 }
            if (r3 == 0) goto L_0x0607
            android.widget.TextView r3 = (android.widget.TextView) r3     // Catch:{ Exception -> 0x0657 }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r7 = r22.getLiveScore()     // Catch:{ Exception -> 0x0657 }
            java.util.ArrayList r7 = r7.getBalls()     // Catch:{ Exception -> 0x0657 }
            java.lang.Object r7 = r7.get(r2)     // Catch:{ Exception -> 0x0657 }
            com.crickpe.view.detail.fragments.my_matches_detail.Balls r7 = (com.crickpe.view.detail.fragments.my_matches_detail.Balls) r7     // Catch:{ Exception -> 0x0657 }
            java.lang.String r7 = r7.getLabel()     // Catch:{ Exception -> 0x0657 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0657 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x0657 }
            r3.setText(r7)     // Catch:{ Exception -> 0x0657 }
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r7 = r22.getLiveScore()     // Catch:{ Exception -> 0x0657 }
            java.util.ArrayList r7 = r7.getBalls()     // Catch:{ Exception -> 0x0657 }
            int r7 = r7.size()     // Catch:{ Exception -> 0x0657 }
            int r7 = r7 - r5
            if (r2 != r7) goto L_0x05f8
            androidx.fragment.app.FragmentActivity r7 = r21.requireActivity()     // Catch:{ Exception -> 0x0657 }
            r8 = 2131165508(0x7f070144, float:1.7945235E38)
            android.graphics.drawable.Drawable r7 = r7.getDrawable(r8)     // Catch:{ Exception -> 0x0657 }
            r3.setBackground(r7)     // Catch:{ Exception -> 0x0657 }
            android.content.res.Resources r7 = r21.getResources()     // Catch:{ Exception -> 0x0657 }
            r8 = 2131034939(0x7f05033b, float:1.768041E38)
            int r7 = r7.getColor(r8)     // Catch:{ Exception -> 0x0657 }
            r3.setTextColor(r7)     // Catch:{ Exception -> 0x0657 }
        L_0x05f8:
            int r3 = com.crickpe.C1188R.C1192id.llBallsContainer     // Catch:{ Exception -> 0x0657 }
            android.view.View r3 = r1._$_findCachedViewById(r3)     // Catch:{ Exception -> 0x0657 }
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3     // Catch:{ Exception -> 0x0657 }
            r3.addView(r4)     // Catch:{ Exception -> 0x0657 }
            int r2 = r2 + 1
            goto L_0x0585
        L_0x0607:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0657 }
            java.lang.String r2 = "null cannot be cast to non-null type android.widget.TextView"
            r0.<init>(r2)     // Catch:{ Exception -> 0x0657 }
            throw r0     // Catch:{ Exception -> 0x0657 }
        L_0x060f:
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x0657 }
            java.util.ArrayList r0 = r0.getBalls()     // Catch:{ Exception -> 0x0657 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0657 }
            r2 = 6
            if (r0 >= r2) goto L_0x0661
            com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel r0 = r22.getLiveScore()     // Catch:{ Exception -> 0x0657 }
            java.util.ArrayList r0 = r0.getBalls()     // Catch:{ Exception -> 0x0657 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0657 }
            int r2 = r2 - r0
            r0 = 0
        L_0x062c:
            if (r0 >= r2) goto L_0x0661
            androidx.fragment.app.FragmentActivity r5 = r21.requireActivity()     // Catch:{ Exception -> 0x0657 }
            android.content.Context r5 = (android.content.Context) r5     // Catch:{ Exception -> 0x0657 }
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)     // Catch:{ Exception -> 0x0657 }
            int r7 = com.crickpe.C1188R.C1192id.llBallsContainer     // Catch:{ Exception -> 0x0657 }
            android.view.View r7 = r1._$_findCachedViewById(r7)     // Catch:{ Exception -> 0x0657 }
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7     // Catch:{ Exception -> 0x0657 }
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7     // Catch:{ Exception -> 0x0657 }
            android.view.View r5 = r5.inflate(r4, r7, r6)     // Catch:{ Exception -> 0x0657 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r3)     // Catch:{ Exception -> 0x0657 }
            int r7 = com.crickpe.C1188R.C1192id.llBallsContainer     // Catch:{ Exception -> 0x0657 }
            android.view.View r7 = r1._$_findCachedViewById(r7)     // Catch:{ Exception -> 0x0657 }
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7     // Catch:{ Exception -> 0x0657 }
            r7.addView(r5)     // Catch:{ Exception -> 0x0657 }
            int r0 = r0 + 1
            goto L_0x062c
        L_0x0657:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "liveScore.balls"
            android.util.Log.v(r2, r0)
        L_0x0661:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.my_matches_detail.MatchDetailFragment.setData(com.crickpe.view.detail.fragments.my_matches_detail.MyMatchDetailModel):void");
    }

    private final void setLiveScoreData(LiveScoreModel liveScoreModel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        try {
            if (liveScoreModel.getInnings().size() > 1) {
                if (liveScoreModel.getInnings().get(0).getTeamIconUrl() != null) {
                    str2 = liveScoreModel.getInnings().get(0).getTeamIconUrl();
                } else {
                    str2 = "";
                }
                if (liveScoreModel.getInnings().get(1).getTeamIconUrl() != null) {
                    str3 = liveScoreModel.getInnings().get(1).getTeamIconUrl();
                } else {
                    str3 = "";
                }
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    ((DetailActivity) activity).setImageDynamically(str2, str3);
                    String str6 = liveScoreModel.getInnings().get(0).getCode() + " vs " + liveScoreModel.getInnings().get(1).getCode();
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        ((DetailActivity) activity2).setTopBar(str6, true, false, false, false, false, false, false);
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
                        if (teamIconUrl == null) {
                            str4 = "";
                        } else {
                            str4 = teamIconUrl;
                        }
                        ExtensionsKt.loadImage$default(imageView, str4, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append('(');
                        sb2.append(liveScoreModel.getInnings().get(1).getOvers());
                        sb2.append(')');
                        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvOversT2)).setText(sb2.toString());
                        CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam1Flag);
                        Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivTeam1Flag");
                        ImageView imageView2 = circleImageView2;
                        String teamIconUrl2 = liveScoreModel.getInnings().get(0).getTeamIconUrl();
                        if (teamIconUrl2 == null) {
                            str5 = "";
                        } else {
                            str5 = teamIconUrl2;
                        }
                        ExtensionsKt.loadImage$default(imageView2, str5, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
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
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
                }
            } else if (liveScoreModel.getInnings().size() == 1) {
                CircleImageView circleImageView3 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam1Flag);
                Intrinsics.checkNotNullExpressionValue(circleImageView3, "ivTeam1Flag");
                ImageView imageView3 = circleImageView3;
                String teamIconUrl3 = liveScoreModel.getInnings().get(0).getTeamIconUrl();
                if (teamIconUrl3 == null) {
                    str = "";
                } else {
                    str = teamIconUrl3;
                }
                ExtensionsKt.loadImage$default(imageView3, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
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
            Log.v("Exception_2", e.toString());
        }
        try {
            if (liveScoreModel.getBatsmanNonStriker() != null) {
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBatsman1)).setText(liveScoreModel.getBatsmanNonStriker().getName() + ' ' + liveScoreModel.getBatsmanNonStriker().getRun() + '(' + liveScoreModel.getBatsmanNonStriker().getBall() + ')');
            }
        } catch (Exception e2) {
            Log.v("Exception_2", e2.toString());
        }
        try {
            if (liveScoreModel.getBatsmanStriker() != null) {
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvBatsman2)).setText(liveScoreModel.getBatsmanStriker().getName() + "* " + liveScoreModel.getBatsmanStriker().getRun() + '(' + liveScoreModel.getBatsmanStriker().getBall() + ')');
            }
        } catch (Exception e3) {
            Log.v("Exception_2", e3.toString());
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
                    TextView textView = (TextView) findViewById;
                    textView.setText(liveScoreModel.getBalls().get(i).getLabel().toString());
                    if (i == liveScoreModel.getBalls().size() - 1) {
                        textView.setBackground(requireActivity().getDrawable(C1188R.C1190drawable.circle_bg_appcolor));
                        textView.setTextColor(getResources().getColor(C1188R.C1189color.white));
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
            Log.v("Exception_2", e4.toString());
        }
    }

    private final void setAdapter2() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapterPlayersPotAdapter = new PlayersPotAdapter(requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayersPot);
        PlayersPotAdapter playersPotAdapter = null;
        if (recyclerView != null) {
            PlayersPotAdapter playersPotAdapter2 = this.adapterPlayersPotAdapter;
            if (playersPotAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapterPlayersPotAdapter");
                playersPotAdapter2 = null;
            }
            recyclerView.setAdapter(playersPotAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayersPot)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayersPot);
        PlayersPotAdapter playersPotAdapter3 = this.adapterPlayersPotAdapter;
        if (playersPotAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapterPlayersPotAdapter");
        } else {
            playersPotAdapter = playersPotAdapter3;
        }
        recyclerView2.setAdapter(playersPotAdapter);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.cvPlayersPot) {
            TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout);
            Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
            CommonMethodsKt.hide(tabLayout);
            ViewPager viewPager = (ViewPager) _$_findCachedViewById(C1188R.C1192id.viewPager);
            Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
            CommonMethodsKt.hide(viewPager);
            CardView cardView = (CardView) _$_findCachedViewById(C1188R.C1192id.cvPlayersPot);
            Intrinsics.checkNotNullExpressionValue(cardView, "cvPlayersPot");
            CommonMethodsKt.hide(cardView);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.layoutPlayersPot);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "layoutPlayersPot");
            CommonMethodsKt.visible(linearLayout);
            PlayersPotModel playersPotModel = this.playersPotData;
            if (playersPotModel != null) {
                Intrinsics.checkNotNull(playersPotModel);
                if (playersPotModel.getPlayers().size() > 0) {
                    LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llNoPot);
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "llNoPot");
                    CommonMethodsKt.hide(linearLayout2);
                    PlayersPotAdapter playersPotAdapter = this.adapterPlayersPotAdapter;
                    if (playersPotAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapterPlayersPotAdapter");
                        playersPotAdapter = null;
                    }
                    PlayersPotModel playersPotModel2 = this.playersPotData;
                    Intrinsics.checkNotNull(playersPotModel2);
                    playersPotAdapter.addList(true, playersPotModel2.getPlayers());
                    return;
                }
                RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.onItemClick);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "onItemClick");
                CommonMethodsKt.hide(relativeLayout);
                LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llNoPot);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "llNoPot");
                CommonMethodsKt.visible(linearLayout3);
            }
        }
    }

    public void onItemClick(LeaderboardModel leaderboardModel, int i) {
        Intrinsics.checkNotNullParameter(leaderboardModel, "leaderboardModel");
        this.totalFantasyPoints = String.valueOf((int) leaderboardModel.getTotalFantasyPoint());
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getFantasyTeam(leaderboardModel.getFantasyTeamId());
    }

    public void onTeamClick(FantasyTeamListModel fantasyTeamListModel, int i) {
        Intrinsics.checkNotNullParameter(fantasyTeamListModel, "fantasyTeamListModel");
        this.totalFantasyPoints = String.valueOf((int) fantasyTeamListModel.getTotalFantasyPoints());
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getFantasyTeam(fantasyTeamListModel.getFantasyTeamId());
    }
}
