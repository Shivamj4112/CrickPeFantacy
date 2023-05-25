package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.p004os.BundleKt;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.amplitude.android.Amplitude;
import com.amplitude.android.Configuration;
import com.amplitude.android.TrackingOptions;
import com.amplitude.core.LoggerProvider;
import com.amplitude.core.ServerZone;
import com.amplitude.core.StorageProvider;
import com.amplitude.core.events.EventOptions;
import com.amplitude.core.events.IngestionMetadata;
import com.amplitude.core.events.Plan;
import com.amplitude.p014id.FileIdentityStorage;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.CommonRequestBody;
import com.crickpe.data.CreateContestRequest;
import com.crickpe.data.CreateFantasyTeamRequest;
import com.crickpe.data.JoinContestBody;
import com.crickpe.data.JoinContestWithCodeBody;
import com.crickpe.data.UpdateTeamBody;
import com.crickpe.databinding.FragmentCreateTeamBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.AppError;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.WebViewActivity;
import com.crickpe.view.detail.fragments.create_own_team.create_team.BattingFragment;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.detail.fragments.select_team.model.WalletInfoModel;
import com.crickpe.view.home.adapters.CaptainVcAdapter;
import com.crickpe.view.home.adapters.HomeTabAdapter;
import com.crickpe.view.home.fragments.home.Team1;
import com.crickpe.view.home.fragments.home.Team2;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.tabs.TabLayout;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000Ì\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010Y\u001a\u00020Z2\u0006\u0010[\u001a\u00020\bH\u0002J\u0006\u0010\\\u001a\u00020;J\b\u0010]\u001a\u00020%H\u0016J\b\u0010^\u001a\u00020ZH\u0002J\b\u0010_\u001a\u00020ZH\u0002J\u0006\u0010`\u001a\u00020ZJ\u0010\u0010a\u001a\u00020Z2\u0006\u0010b\u001a\u00020cH\u0002J\b\u0010d\u001a\u00020ZH\u0002J\u0012\u0010e\u001a\u00020Z2\b\u0010f\u001a\u0004\u0018\u00010gH\u0002J\u0010\u0010h\u001a\u00020Z2\u0006\u0010i\u001a\u00020jH\u0016J\b\u0010k\u001a\u00020ZH\u0016J\u0010\u0010l\u001a\u00020Z2\u0006\u0010[\u001a\u00020\bH\u0016J\u0018\u0010m\u001a\u00020Z2\u0006\u0010[\u001a\u00020\b2\u0006\u0010n\u001a\u00020\u0011H\u0016J\u001a\u0010o\u001a\u00020Z2\u0006\u0010i\u001a\u00020j2\b\u0010f\u001a\u0004\u0018\u00010gH\u0016J$\u0010p\u001a\u00020Z2\u001a\u0010q\u001a\u0016\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\b\u0018\u0001`\tH\u0002J(\u0010r\u001a\u00020Z2\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020H0\u0007j\b\u0012\u0004\u0012\u00020H`\t2\u0006\u0010s\u001a\u00020\u0011H\u0002J\b\u0010t\u001a\u00020ZH\u0002J\u0010\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020xH\u0002J \u0010y\u001a\u00020Z2\u0006\u0010z\u001a\u00020j2\u0006\u0010[\u001a\u00020\b2\u0006\u0010{\u001a\u00020|H\u0002J\b\u0010}\u001a\u00020ZH\u0002J\b\u0010~\u001a\u00020ZH\u0002J\u000e\u0010\u001a\u00020Z2\u0006\u0010s\u001a\u00020\u0011R\u001e\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u000e\u0010*\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020+X.¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u001a\u00104\u001a\u000205X.¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010<\"\u0004\b=\u0010>R\u001a\u0010?\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010'\"\u0004\bA\u0010)R\u001a\u0010B\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR*\u0010G\u001a\u0012\u0012\u0004\u0012\u00020H0\u0007j\b\u0012\u0004\u0012\u00020H`\tX.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u000e\u0010M\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u000e¢\u0006\u0002\n\u0000R*\u0010P\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0007j\b\u0012\u0004\u0012\u00020\u0011`\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010J\"\u0004\bR\u0010LR\u000e\u0010S\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020WX.¢\u0006\u0002\n\u0000R\u001e\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0001"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateTeamFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BattingFragment$FragmentPlayer;", "Lcom/crickpe/view/home/adapters/CaptainVcAdapter$OnItemClicked;", "()V", "allRounderList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "Lkotlin/collections/ArrayList;", "amplitude", "Lcom/amplitude/android/Amplitude;", "batsmanList", "binding", "Lcom/crickpe/databinding/FragmentCreateTeamBinding;", "bowlerList", "captainId", "", "captainImage", "captainName", "captainVcAdapter", "Lcom/crickpe/view/home/adapters/CaptainVcAdapter;", "contestId", "createFantasyTeamModel", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateFantasyTeamModel;", "getCreateFantasyTeamModel", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateFantasyTeamModel;", "setCreateFantasyTeamModel", "(Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateFantasyTeamModel;)V", "entryFee", "fantasyTeamListModelUpdate", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "getFantasyTeamListModelUpdate", "()Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "setFantasyTeamListModelUpdate", "(Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;)V", "filterTeam", "", "getFilterTeam", "()I", "setFilterTeam", "(I)V", "fragment1", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BattingFragment;", "fragment2", "fragment3", "fragment4", "from", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "homeTabAdapter", "Lcom/crickpe/view/home/adapters/HomeTabAdapter;", "getHomeTabAdapter", "()Lcom/crickpe/view/home/adapters/HomeTabAdapter;", "setHomeTabAdapter", "(Lcom/crickpe/view/home/adapters/HomeTabAdapter;)V", "isFilter", "", "()Z", "setFilter", "(Z)V", "lowAmount", "getLowAmount", "setLowAmount", "matchId", "getMatchId", "()Ljava/lang/String;", "setMatchId", "(Ljava/lang/String;)V", "playersInfo", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/PlayersInfo;", "getPlayersInfo", "()Ljava/util/ArrayList;", "setPlayersInfo", "(Ljava/util/ArrayList;)V", "referCode", "revenue", "", "teamsIds", "getTeamsIds", "setTeamsIds", "vcaptainId", "vcaptainImage", "vcaptainName", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "wkList", "addLayout", "", "players", "backHandle", "getFragmentLayoutResId", "initPager", "insufficientDialog", "isVisibleCheck", "joinContestDialog", "data", "Lcom/crickpe/view/detail/fragments/select_team/model/WalletInfoModel;", "listeners", "observeData", "savedInstanceState", "Landroid/os/Bundle;", "onClick", "view", "Landroid/view/View;", "onDetach", "onItemClicked", "onSelectionCaptainVC", "selection", "onViewCreated", "setAdapter", "list", "setData", "filter", "setFilterRadio", "setImageButtonStateNew", "Landroid/graphics/drawable/StateListDrawable;", "mContext", "Landroid/content/Context;", "setPlayerOnGround", "layout", "layoutContainer", "Landroid/widget/LinearLayout;", "setTabTitle", "successBack", "updateData", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CreateTeamFragment.kt */
public final class CreateTeamFragment extends BaseFragment implements View.OnClickListener, BattingFragment.FragmentPlayer, CaptainVcAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ArrayList<Players> allRounderList = new ArrayList<>();
    private Amplitude amplitude;
    private ArrayList<Players> batsmanList = new ArrayList<>();
    private FragmentCreateTeamBinding binding;
    private ArrayList<Players> bowlerList = new ArrayList<>();
    private String captainId = "";
    private String captainImage = "";
    private String captainName = "";
    private CaptainVcAdapter captainVcAdapter;
    private String contestId = "";
    private CreateFantasyTeamModel createFantasyTeamModel;
    private String entryFee = "";
    private FantasyTeamListModel fantasyTeamListModelUpdate;
    private int filterTeam;
    private BattingFragment fragment1;
    private BattingFragment fragment2;
    private BattingFragment fragment3;
    private BattingFragment fragment4;
    private String from = "";
    private final Handler handler = new Handler(Looper.getMainLooper());
    public HomeTabAdapter homeTabAdapter;
    private boolean isFilter;
    private int lowAmount;
    private String matchId = "";
    public ArrayList<PlayersInfo> playersInfo;
    private String referCode = "";
    private double revenue;
    private ArrayList<String> teamsIds = new ArrayList<>();
    private String vcaptainId = "";
    private String vcaptainImage = "";
    private String vcaptainName = "";
    private DetailViewModel viewModel;
    private ArrayList<Players> wkList = new ArrayList<>();

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: CreateTeamFragment.kt */
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
        return C1188R.C1193layout.fragment_create_team;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final int getFilterTeam() {
        return this.filterTeam;
    }

    public final void setFilterTeam(int i) {
        this.filterTeam = i;
    }

    public final boolean isFilter() {
        return this.isFilter;
    }

    public final void setFilter(boolean z) {
        this.isFilter = z;
    }

    public final ArrayList<PlayersInfo> getPlayersInfo() {
        ArrayList<PlayersInfo> arrayList = this.playersInfo;
        if (arrayList != null) {
            return arrayList;
        }
        Intrinsics.throwUninitializedPropertyAccessException("playersInfo");
        return null;
    }

    public final void setPlayersInfo(ArrayList<PlayersInfo> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersInfo = arrayList;
    }

    public final HomeTabAdapter getHomeTabAdapter() {
        HomeTabAdapter homeTabAdapter2 = this.homeTabAdapter;
        if (homeTabAdapter2 != null) {
            return homeTabAdapter2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("homeTabAdapter");
        return null;
    }

    public final void setHomeTabAdapter(HomeTabAdapter homeTabAdapter2) {
        Intrinsics.checkNotNullParameter(homeTabAdapter2, "<set-?>");
        this.homeTabAdapter = homeTabAdapter2;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
    }

    public final FantasyTeamListModel getFantasyTeamListModelUpdate() {
        return this.fantasyTeamListModelUpdate;
    }

    public final void setFantasyTeamListModelUpdate(FantasyTeamListModel fantasyTeamListModel) {
        this.fantasyTeamListModelUpdate = fantasyTeamListModel;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final CreateFantasyTeamModel getCreateFantasyTeamModel() {
        return this.createFantasyTeamModel;
    }

    public final void setCreateFantasyTeamModel(CreateFantasyTeamModel createFantasyTeamModel2) {
        this.createFantasyTeamModel = createFantasyTeamModel2;
    }

    public final ArrayList<String> getTeamsIds() {
        return this.teamsIds;
    }

    public final void setTeamsIds(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.teamsIds = arrayList;
    }

    public final int getLowAmount() {
        return this.lowAmount;
    }

    public final void setLowAmount(int i) {
        this.lowAmount = i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String string;
        SavedStateHandle savedStateHandle;
        MutableLiveData liveData;
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentCreateTeamBinding.bind(view);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        Log.v("currentTabPosition1", String.valueOf(ApplicationActivity.Companion.getCurrentTabPosition()));
        this.teamsIds = new ArrayList<>();
        NavBackStackEntry currentBackStackEntry = FragmentKt.findNavController(this).getCurrentBackStackEntry();
        if (!(currentBackStackEntry == null || (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) == null || (liveData = savedStateHandle.getLiveData("from")) == null)) {
            liveData.observe(getViewLifecycleOwner(), new CreateTeamFragment$$ExternalSyntheticLambda1(this));
        }
        if (getArguments() != null) {
            this.contestId = String.valueOf(requireArguments().getString("contestId"));
            this.matchId = String.valueOf(requireArguments().getString("matchId"));
            this.entryFee = String.valueOf(requireArguments().getString("entryFee"));
            this.from = String.valueOf(requireArguments().getString("from"));
            this.referCode = String.valueOf(requireArguments().getString("referCode"));
            this.fantasyTeamListModelUpdate = (FantasyTeamListModel) new Gson().fromJson(String.valueOf(requireArguments().getString("TEAM")), FantasyTeamListModel.class);
            Log.e("Entery_feees", this.entryFee);
        }
        if (Intrinsics.areEqual((Object) this.from, (Object) "update_team")) {
            string = getResources().getString(C1188R.string.update_team);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.update_team)");
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle)).setText(getResources().getString(C1188R.string.update_team));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateFantacyTeam)).setText(getResources().getString(C1188R.string.update_team));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPreviewGround)).setEnabled(true);
        } else if (Intrinsics.areEqual((Object) this.from, (Object) "copy_team")) {
            string = getResources().getString(C1188R.string.create_team);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.create_team)");
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle)).setText(getResources().getString(C1188R.string.create_team));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateFantacyTeam)).setText(getResources().getString(C1188R.string.create_team));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPreviewGround)).setEnabled(true);
        } else {
            string = getResources().getString(C1188R.string.create_team);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.create_team)");
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle)).setText(getResources().getString(C1188R.string.create_team));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateFantacyTeam)).setText(getResources().getString(C1188R.string.create_team));
        }
        String str = string;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar(str, false, false, false, false, false, false, false);
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getPlayersByMatch(this.matchId);
            listeners();
            observeData(bundle);
            Context applicationContext = requireActivity().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
            Configuration configuration = r2;
            Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
            this.amplitude = new Amplitude(configuration);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m3547onViewCreated$lambda0(CreateTeamFragment createTeamFragment, String str) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        if (str != null) {
            DetailViewModel detailViewModel = null;
            if (Intrinsics.areEqual((Object) str, (Object) Constants.EVENT_JOIN_CONTEST)) {
                ArrayList<String> arrayList = createTeamFragment.teamsIds;
                CreateFantasyTeamModel createFantasyTeamModel2 = createTeamFragment.createFantasyTeamModel;
                arrayList.add(String.valueOf(createFantasyTeamModel2 != null ? createFantasyTeamModel2.get_id() : null));
                JoinContestBody joinContestBody = new JoinContestBody(createTeamFragment.contestId, createTeamFragment.teamsIds);
                DetailViewModel detailViewModel2 = createTeamFragment.viewModel;
                if (detailViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel = detailViewModel2;
                }
                detailViewModel.joinContestApi(joinContestBody);
            } else if (Intrinsics.areEqual((Object) str, (Object) "create_contest")) {
                CreateContestRequest contestData = UserManager.INSTANCE.getContestData();
                Intrinsics.checkNotNull(contestData);
                String matchId2 = contestData.getMatchId();
                CreateContestRequest contestData2 = UserManager.INSTANCE.getContestData();
                Intrinsics.checkNotNull(contestData2);
                String name = contestData2.getName();
                CreateContestRequest contestData3 = UserManager.INSTANCE.getContestData();
                Intrinsics.checkNotNull(contestData3);
                String totalSpots = contestData3.getTotalSpots();
                CreateContestRequest contestData4 = UserManager.INSTANCE.getContestData();
                Intrinsics.checkNotNull(contestData4);
                String entryFee2 = contestData4.getEntryFee();
                CreateContestRequest contestData5 = UserManager.INSTANCE.getContestData();
                Intrinsics.checkNotNull(contestData5);
                String noOfWinner = contestData5.getNoOfWinner();
                CreateContestRequest contestData6 = UserManager.INSTANCE.getContestData();
                Intrinsics.checkNotNull(contestData6);
                boolean isMultipleTeamAllowed = contestData6.isMultipleTeamAllowed();
                CreateFantasyTeamModel createFantasyTeamModel3 = createTeamFragment.createFantasyTeamModel;
                Intrinsics.checkNotNull(createFantasyTeamModel3);
                CreateContestRequest createContestRequest = new CreateContestRequest(matchId2, name, totalSpots, entryFee2, noOfWinner, isMultipleTeamAllowed, createFantasyTeamModel3.get_id());
                DetailViewModel detailViewModel3 = createTeamFragment.viewModel;
                if (detailViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel = detailViewModel3;
                }
                detailViewModel.createContestApi(createContestRequest);
            } else {
                Log.v("Elseee", str.toString());
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        ApplicationActivity.Companion.setCounting(0);
        ApplicationActivity.Companion.setCredit(100.0f);
        ApplicationActivity.Companion.setBatsmanCount(0);
        ApplicationActivity.Companion.setBowlerCount(0);
        ApplicationActivity.Companion.setWkCount(0);
        ApplicationActivity.Companion.setAllRounderCount(0);
        ApplicationActivity.Companion.setTeam1((Team1) null);
        ApplicationActivity.Companion.setTeam2((Team2) null);
        ApplicationActivity.Companion.setTeamOneCount(0);
        ApplicationActivity.Companion.setTeamTwoCount(0);
        ApplicationActivity.Companion.setCurrentTabPosition(0);
    }

    public void onItemClicked(Players players) {
        Intrinsics.checkNotNullParameter(players, "players");
        try {
            setTabTitle();
            if (ApplicationActivity.Companion.getCounting() > 10) {
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue);
                Intrinsics.checkNotNullExpressionValue(textView, "tvContinue");
                CommonMethodsKt.visible(textView);
                return;
            }
            TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvContinue");
            CommonMethodsKt.hide(textView2);
        } catch (Exception e) {
            Log.v("SELECT_PLAYER", e.toString());
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        switch (view.getId()) {
            case C1188R.C1192id.ivCancel:
                this.isFilter = false;
                RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPlayersFilter);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlPlayersFilter");
                CommonMethodsKt.hide(relativeLayout);
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_out_down);
                Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_out_down)");
                ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPlayersFilter)).startAnimation(loadAnimation);
                return;
            case C1188R.C1192id.ivFilter:
                isVisibleCheck();
                return;
            case C1188R.C1192id.rlBoth:
                this.filterTeam = 0;
                if (ApplicationActivity.Companion.getTeam2() != null) {
                    updateData("");
                    return;
                }
                return;
            case C1188R.C1192id.rlPTS:
                Intent intent = new Intent(requireActivity(), WebViewActivity.class);
                intent.putExtra("web_url", Constants.POINT_SYSTEM_URL);
                intent.putExtra("title", "Point System");
                startActivity(intent);
                return;
            case C1188R.C1192id.rlTeam1:
                this.filterTeam = 1;
                if (ApplicationActivity.Companion.getTeam1() != null) {
                    Team1 team1 = ApplicationActivity.Companion.getTeam1();
                    Intrinsics.checkNotNull(team1);
                    updateData(team1.getTeamId());
                    return;
                }
                return;
            case C1188R.C1192id.rlTeam2:
                this.filterTeam = 2;
                if (ApplicationActivity.Companion.getTeam2() != null) {
                    Team2 team2 = ApplicationActivity.Companion.getTeam2();
                    Intrinsics.checkNotNull(team2);
                    updateData(team2.getTeamId());
                    return;
                }
                return;
            case C1188R.C1192id.tvCreateFantacyTeam:
                try {
                    ArrayList arrayList = new ArrayList();
                    int size = ApplicationActivity.Companion.getSelectedPlayers().size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(new CreateFantasyTeamRequest(ApplicationActivity.Companion.getSelectedPlayers().get(i).getTeamId(), ApplicationActivity.Companion.getSelectedPlayers().get(i).getPlayerId()));
                    }
                    CommonRequestBody commonRequestBody = new CommonRequestBody(this.matchId, arrayList, this.captainId, this.vcaptainId);
                    DetailViewModel detailViewModel = null;
                    if (Intrinsics.areEqual((Object) this.from, (Object) "update_team")) {
                        UpdateTeamBody updateTeamBody = new UpdateTeamBody(arrayList, this.captainId, this.vcaptainId);
                        DetailViewModel detailViewModel2 = this.viewModel;
                        if (detailViewModel2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            detailViewModel = detailViewModel2;
                        }
                        FantasyTeamListModel fantasyTeamListModel = this.fantasyTeamListModelUpdate;
                        Intrinsics.checkNotNull(fantasyTeamListModel);
                        detailViewModel.editFantasyTeam(fantasyTeamListModel.get_id(), updateTeamBody);
                        return;
                    } else if (!Intrinsics.areEqual((Object) this.contestId, (Object) "null")) {
                        if (this.createFantasyTeamModel == null) {
                            DetailViewModel detailViewModel3 = this.viewModel;
                            if (detailViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                detailViewModel3 = null;
                            }
                            detailViewModel3.createFantasyTeam(commonRequestBody);
                        }
                        DetailViewModel detailViewModel4 = this.viewModel;
                        if (detailViewModel4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            detailViewModel = detailViewModel4;
                        }
                        detailViewModel.getWalletinfo(this.contestId, "1");
                        return;
                    } else {
                        DetailViewModel detailViewModel5 = this.viewModel;
                        if (detailViewModel5 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        } else {
                            detailViewModel = detailViewModel5;
                        }
                        detailViewModel.createFantasyTeam(commonRequestBody);
                        return;
                    }
                } catch (Exception unused) {
                    Log.v("Exception", "CREATE_TEAM");
                    return;
                }
            default:
                return;
        }
    }

    public final void updateData(String str) {
        Intrinsics.checkNotNullParameter(str, "filter");
        this.batsmanList.clear();
        this.bowlerList.clear();
        this.wkList.clear();
        this.allRounderList.clear();
        int size = getPlayersInfo().size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual((Object) str, (Object) "")) {
                int roleId = getPlayersInfo().get(i).getRoleId();
                if (roleId == 1) {
                    int size2 = getPlayersInfo().get(i).getPlayers().size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        if (Intrinsics.areEqual((Object) str, (Object) getPlayersInfo().get(i).getPlayers().get(i2).getTeamId())) {
                            this.batsmanList.add(getPlayersInfo().get(i).getPlayers().get(i2));
                        }
                    }
                } else if (roleId == 2) {
                    int size3 = getPlayersInfo().get(i).getPlayers().size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        if (Intrinsics.areEqual((Object) str, (Object) getPlayersInfo().get(i).getPlayers().get(i3).getTeamId())) {
                            this.bowlerList.add(getPlayersInfo().get(i).getPlayers().get(i3));
                        }
                    }
                } else if (roleId != 3) {
                    int size4 = getPlayersInfo().get(i).getPlayers().size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        if (Intrinsics.areEqual((Object) str, (Object) getPlayersInfo().get(i).getPlayers().get(i4).getTeamId())) {
                            this.allRounderList.add(getPlayersInfo().get(i).getPlayers().get(i4));
                        }
                    }
                } else {
                    int size5 = getPlayersInfo().get(i).getPlayers().size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (Intrinsics.areEqual((Object) str, (Object) getPlayersInfo().get(i).getPlayers().get(i5).getTeamId())) {
                            this.wkList.add(getPlayersInfo().get(i).getPlayers().get(i5));
                        }
                    }
                }
            } else {
                int roleId2 = getPlayersInfo().get(i).getRoleId();
                if (roleId2 == 1) {
                    int size6 = getPlayersInfo().get(i).getPlayers().size();
                    for (int i6 = 0; i6 < size6; i6++) {
                        this.batsmanList.add(getPlayersInfo().get(i).getPlayers().get(i6));
                    }
                } else if (roleId2 == 2) {
                    int size7 = getPlayersInfo().get(i).getPlayers().size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        this.bowlerList.add(getPlayersInfo().get(i).getPlayers().get(i7));
                    }
                } else if (roleId2 != 3) {
                    int size8 = getPlayersInfo().get(i).getPlayers().size();
                    for (int i8 = 0; i8 < size8; i8++) {
                        this.allRounderList.add(getPlayersInfo().get(i).getPlayers().get(i8));
                    }
                } else {
                    int size9 = getPlayersInfo().get(i).getPlayers().size();
                    for (int i9 = 0; i9 < size9; i9++) {
                        this.wkList.add(getPlayersInfo().get(i).getPlayers().get(i9));
                    }
                }
            }
        }
        getHomeTabAdapter().notifyDataSetChanged();
        isVisibleCheck();
        setFilterRadio();
        BattingFragment battingFragment = this.fragment1;
        BattingFragment battingFragment2 = null;
        if (battingFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment1");
            battingFragment = null;
        }
        battingFragment.updateData(this.batsmanList);
        BattingFragment battingFragment3 = this.fragment2;
        if (battingFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment2");
            battingFragment3 = null;
        }
        battingFragment3.updateData(this.bowlerList);
        BattingFragment battingFragment4 = this.fragment3;
        if (battingFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment3");
            battingFragment4 = null;
        }
        battingFragment4.updateData(this.wkList);
        BattingFragment battingFragment5 = this.fragment4;
        if (battingFragment5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment4");
        } else {
            battingFragment2 = battingFragment5;
        }
        battingFragment2.updateData(this.allRounderList);
    }

    private final void setFilterRadio() {
        int i = this.filterTeam;
        if (i == 1) {
            ((RadioButton) _$_findCachedViewById(C1188R.C1192id.rbTeam3)).setChecked(false);
            ((RadioButton) _$_findCachedViewById(C1188R.C1192id.rbTeam2)).setChecked(false);
            ((RadioButton) _$_findCachedViewById(C1188R.C1192id.rbTeam1)).setChecked(true);
        } else if (i != 2) {
            ((RadioButton) _$_findCachedViewById(C1188R.C1192id.rbTeam3)).setChecked(true);
            ((RadioButton) _$_findCachedViewById(C1188R.C1192id.rbTeam2)).setChecked(false);
            ((RadioButton) _$_findCachedViewById(C1188R.C1192id.rbTeam1)).setChecked(false);
        } else {
            ((RadioButton) _$_findCachedViewById(C1188R.C1192id.rbTeam3)).setChecked(false);
            ((RadioButton) _$_findCachedViewById(C1188R.C1192id.rbTeam2)).setChecked(true);
            ((RadioButton) _$_findCachedViewById(C1188R.C1192id.rbTeam1)).setChecked(false);
        }
    }

    public final void isVisibleCheck() {
        if (!this.isFilter) {
            this.isFilter = true;
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPlayersFilter);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlPlayersFilter");
            CommonMethodsKt.visible(relativeLayout);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_in_up);
            Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_in_up)");
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPlayersFilter)).startAnimation(loadAnimation);
            return;
        }
        this.isFilter = false;
        RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPlayersFilter);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlPlayersFilter");
        CommonMethodsKt.hide(relativeLayout2);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_out_down);
        Intrinsics.checkNotNullExpressionValue(loadAnimation2, "loadAnimation(context, R.anim.slide_out_down)");
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPlayersFilter)).startAnimation(loadAnimation2);
    }

    private final void listeners() {
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlTeam1)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlTeam2)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlBoth)).setOnClickListener(onClickListener);
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivCancel)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPTS)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateFantacyTeam)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda2(this));
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivBack)).setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda3(this));
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPreview)).setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda4(this));
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPreviewGround)).setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda5(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-1  reason: not valid java name */
    public static final void m3535listeners$lambda1(CreateTeamFragment createTeamFragment, View view) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        FragmentActivity activity = createTeamFragment.getActivity();
        if (activity != null) {
            DetailActivity.setTopBar$default((DetailActivity) activity, "", false, true, false, false, true, false, false, 192, (Object) null);
            createTeamFragment.setAdapter(ApplicationActivity.Companion.getSelectedPlayers());
            ConstraintLayout constraintLayout = (ConstraintLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.clCaptainVC);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "clCaptainVC");
            CommonMethodsKt.visible(constraintLayout);
            if (UserManager.INSTANCE.getUserProfile() != null) {
                try {
                    FragmentActivity requireActivity = createTeamFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    User userProfile = UserManager.INSTANCE.getUserProfile();
                    String str = null;
                    CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_CREATE_TEAM_SELECT_CAPTAIN);
                    Bundle bundle = new Bundle();
                    User userProfile2 = UserManager.INSTANCE.getUserProfile();
                    if (userProfile2 != null) {
                        str = userProfile2.get_id();
                    }
                    bundle.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str));
                    ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_CREATE_TEAM_SELECT_CAPTAIN, bundle);
                } catch (Exception e) {
                    Log.e("Analytics", e.toString());
                }
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(createTeamFragment.getContext(), C1188R.anim.slide_in_up);
            Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_in_up)");
            ((ConstraintLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.clCaptainVC)).startAnimation(loadAnimation);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-2  reason: not valid java name */
    public static final void m3536listeners$lambda2(CreateTeamFragment createTeamFragment, View view) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        if (ApplicationActivity.Companion.getCounting() > 0) {
            createTeamFragment.successBack();
        } else {
            createTeamFragment.requireActivity().onBackPressed();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-3  reason: not valid java name */
    public static final void m3537listeners$lambda3(CreateTeamFragment createTeamFragment, View view) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        if (ApplicationActivity.Companion.getCounting() > 0) {
            FragmentActivity activity = createTeamFragment.getActivity();
            if (activity != null) {
                DetailActivity.setTopBar$default((DetailActivity) activity, "", false, true, false, false, true, false, false, 192, (Object) null);
                ((LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llContainerWk)).removeAllViews();
                ((LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llContainerBat)).removeAllViews();
                ((LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llContainerBowlers)).removeAllViews();
                ((LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llContainerAllRound)).removeAllViews();
                RelativeLayout relativeLayout = (RelativeLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlGroundLayout");
                CommonMethodsKt.visible(relativeLayout);
                Animation loadAnimation = AnimationUtils.loadAnimation(createTeamFragment.getContext(), C1188R.anim.slide_in_up);
                Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_in_up)");
                ((RelativeLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.rlGroundLayout)).startAnimation(loadAnimation);
                LinearLayout linearLayout = (LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llTopView);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "llTopView");
                CommonMethodsKt.hide(linearLayout);
                TextView textView = (TextView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.tvCreateFantacyTeam);
                Intrinsics.checkNotNullExpressionValue(textView, "tvCreateFantacyTeam");
                CommonMethodsKt.hide(textView);
                int size = ApplicationActivity.Companion.getSelectedPlayers().size();
                for (int i = 0; i < size; i++) {
                    int roleId = ApplicationActivity.Companion.getSelectedPlayers().get(i).getRole().getRoleId();
                    if (roleId == 1) {
                        Players players = ApplicationActivity.Companion.getSelectedPlayers().get(i);
                        Intrinsics.checkNotNullExpressionValue(players, "selectedPlayers[i]");
                        createTeamFragment.addLayout(players);
                    } else if (roleId == 2) {
                        Players players2 = ApplicationActivity.Companion.getSelectedPlayers().get(i);
                        Intrinsics.checkNotNullExpressionValue(players2, "selectedPlayers[i]");
                        createTeamFragment.addLayout(players2);
                    } else if (roleId != 3) {
                        Players players3 = ApplicationActivity.Companion.getSelectedPlayers().get(i);
                        Intrinsics.checkNotNullExpressionValue(players3, "selectedPlayers[i]");
                        createTeamFragment.addLayout(players3);
                    } else {
                        Players players4 = ApplicationActivity.Companion.getSelectedPlayers().get(i);
                        Intrinsics.checkNotNullExpressionValue(players4, "selectedPlayers[i]");
                        createTeamFragment.addLayout(players4);
                    }
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-4  reason: not valid java name */
    public static final void m3538listeners$lambda4(CreateTeamFragment createTeamFragment, View view) {
        String str;
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        try {
            CaptainVcAdapter captainVcAdapter2 = createTeamFragment.captainVcAdapter;
            if (captainVcAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captainVcAdapter");
                captainVcAdapter2 = null;
            }
            int size = captainVcAdapter2.getPlayersList().size();
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                CaptainVcAdapter captainVcAdapter3 = createTeamFragment.captainVcAdapter;
                if (captainVcAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("captainVcAdapter");
                    captainVcAdapter3 = null;
                }
                if (captainVcAdapter3.getPlayersList().get(i).isCaptainSelected()) {
                    z = true;
                }
                CaptainVcAdapter captainVcAdapter4 = createTeamFragment.captainVcAdapter;
                if (captainVcAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("captainVcAdapter");
                    captainVcAdapter4 = null;
                }
                if (captainVcAdapter4.getPlayersList().get(i).isVCaptainSelected()) {
                    z2 = true;
                }
            }
            if (!z) {
                String string = createTeamFragment.getString(C1188R.string.choose_captain);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.choose_captain)");
                createTeamFragment.showToast(string);
            } else if (!z2) {
                String string2 = createTeamFragment.getString(C1188R.string.choose_v_captain);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.choose_v_captain)");
                createTeamFragment.showToast(string2);
            } else {
                ((LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llContainerWk)).removeAllViews();
                ((LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llContainerBat)).removeAllViews();
                ((LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llContainerBowlers)).removeAllViews();
                ((LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llContainerAllRound)).removeAllViews();
                TextView textView = (TextView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.tvCreateFantacyTeam);
                Intrinsics.checkNotNullExpressionValue(textView, "tvCreateFantacyTeam");
                CommonMethodsKt.visible(textView);
                LinearLayout linearLayout = (LinearLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.llTopView);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "llTopView");
                CommonMethodsKt.visible(linearLayout);
                ((TextView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.tvVCaptainn)).setText(createTeamFragment.vcaptainName);
                ((TextView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.tvCaptainn)).setText(createTeamFragment.captainName);
                CircleImageView circleImageView = (CircleImageView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.ivCaptain);
                Intrinsics.checkNotNullExpressionValue(circleImageView, "ivCaptain");
                ImageView imageView = circleImageView;
                String str2 = createTeamFragment.captainImage;
                ExtensionsKt.loadImage$default(imageView, str2 == null ? "" : str2, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                CircleImageView circleImageView2 = (CircleImageView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.ivVCaptain);
                Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivVCaptain");
                ImageView imageView2 = circleImageView2;
                String str3 = createTeamFragment.vcaptainImage;
                if (str3 == null) {
                    str = "";
                } else {
                    str = str3;
                }
                ExtensionsKt.loadImage$default(imageView2, str, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                RelativeLayout relativeLayout = (RelativeLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlGroundLayout");
                CommonMethodsKt.visible(relativeLayout);
                int size2 = ApplicationActivity.Companion.getSelectedPlayers().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    int roleId = ApplicationActivity.Companion.getSelectedPlayers().get(i2).getRole().getRoleId();
                    if (roleId == 1) {
                        Players players = ApplicationActivity.Companion.getSelectedPlayers().get(i2);
                        Intrinsics.checkNotNullExpressionValue(players, "selectedPlayers[i]");
                        createTeamFragment.addLayout(players);
                    } else if (roleId == 2) {
                        Players players2 = ApplicationActivity.Companion.getSelectedPlayers().get(i2);
                        Intrinsics.checkNotNullExpressionValue(players2, "selectedPlayers[i]");
                        createTeamFragment.addLayout(players2);
                    } else if (roleId != 3) {
                        Players players3 = ApplicationActivity.Companion.getSelectedPlayers().get(i2);
                        Intrinsics.checkNotNullExpressionValue(players3, "selectedPlayers[i]");
                        createTeamFragment.addLayout(players3);
                    } else {
                        Players players4 = ApplicationActivity.Companion.getSelectedPlayers().get(i2);
                        Intrinsics.checkNotNullExpressionValue(players4, "selectedPlayers[i]");
                        createTeamFragment.addLayout(players4);
                    }
                }
            }
        } catch (Exception e) {
            Log.e("tvPreviewGround", e.toString());
        }
    }

    public void onSelectionCaptainVC(Players players, String str) {
        Intrinsics.checkNotNullParameter(players, "players");
        Intrinsics.checkNotNullParameter(str, "selection");
        try {
            String str2 = null;
            if (Intrinsics.areEqual((Object) str, (Object) "c")) {
                this.captainId = players.getPlayerId();
                this.captainName = players.getName();
                StringBuilder sb = new StringBuilder();
                SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                if (appSettings != null) {
                    str2 = appSettings.getImageBaseUrl();
                }
                sb.append(str2);
                sb.append(players.getImageUrl());
                this.captainImage = sb.toString();
            } else {
                this.vcaptainId = players.getPlayerId();
                this.vcaptainName = players.getName();
                StringBuilder sb2 = new StringBuilder();
                SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                if (appSettings2 != null) {
                    str2 = appSettings2.getImageBaseUrl();
                }
                sb2.append(str2);
                sb2.append(players.getImageUrl());
                this.vcaptainImage = sb2.toString();
            }
            if (!Intrinsics.areEqual((Object) this.captainName, (Object) "") && !Intrinsics.areEqual((Object) this.vcaptainName, (Object) "")) {
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvPreviewGround);
                Intrinsics.checkNotNullExpressionValue(textView, "tvPreviewGround");
                CommonMethodsKt.visible(textView);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPreviewGround)).setEnabled(true);
            }
        } catch (Exception e) {
            Log.v("onSelectionCaptainVC", e.toString());
        }
    }

    private final void joinContestDialog(WalletInfoModel walletInfoModel) {
        Dialog dialog;
        Log.v("joinContestDialog", new Gson().toJson((Object) walletInfoModel));
        Dialog dialog2 = new Dialog(requireActivity());
        dialog2.requestWindowFeature(1);
        dialog2.setCancelable(true);
        dialog2.setContentView(C1188R.C1193layout.dialog_join_contest_confirmation);
        View findViewById = dialog2.findViewById(C1188R.C1192id.tvEntryFee);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog2.findViewById(C1188R.C1192id.tvRemainingBal);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog2.findViewById(C1188R.C1192id.tvWalletBalance);
                if (findViewById3 != null) {
                    TextView textView3 = (TextView) findViewById3;
                    View findViewById4 = dialog2.findViewById(C1188R.C1192id.tvToPay);
                    if (findViewById4 != null) {
                        TextView textView4 = (TextView) findViewById4;
                        View findViewById5 = dialog2.findViewById(C1188R.C1192id.rlWalletBalance);
                        if (findViewById5 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) findViewById5;
                            View findViewById6 = dialog2.findViewById(C1188R.C1192id.rlTopupNeeded);
                            if (findViewById6 != null) {
                                RelativeLayout relativeLayout2 = (RelativeLayout) findViewById6;
                                View findViewById7 = dialog2.findViewById(C1188R.C1192id.tvJoinContest);
                                if (findViewById7 != null) {
                                    TextView textView5 = (TextView) findViewById7;
                                    Window window = dialog2.getWindow();
                                    Intrinsics.checkNotNull(window);
                                    Ref.IntRef intRef = new Ref.IntRef();
                                    try {
                                        String format = CommonMethodsKt.setFormat(walletInfoModel.getTotalWalletAmount());
                                        String format2 = CommonMethodsKt.setFormat(walletInfoModel.getEntryFee());
                                        String format3 = CommonMethodsKt.setFormat(walletInfoModel.getRemaingWalletBalance());
                                        StringBuilder sb = new StringBuilder();
                                        dialog = dialog2;
                                        try {
                                            sb.append(8377);
                                            sb.append(format2);
                                            textView.setText(sb.toString());
                                            textView3.setText(8377 + format);
                                            this.revenue = walletInfoModel.getTotalWalletAmount();
                                            if (walletInfoModel.getRemaingWalletBalance() < 0.0d) {
                                                CommonMethodsKt.hide(relativeLayout);
                                                CommonMethodsKt.visible(relativeLayout2);
                                                textView5.setText(getString(C1188R.string.add_money));
                                            } else {
                                                CommonMethodsKt.visible(relativeLayout);
                                                CommonMethodsKt.hide(relativeLayout2);
                                                textView5.setText(getString(C1188R.string.join_contest));
                                                textView2.setText(8377 + format3);
                                                textView2.setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.black));
                                            }
                                            intRef.element = ((int) walletInfoModel.getTotalWalletAmount()) - ((int) walletInfoModel.getEntryFee());
                                            String format4 = CommonMethodsKt.setFormat((double) Math.abs(intRef.element));
                                            textView4.setText(8377 + format4);
                                        } catch (Exception e) {
                                            e = e;
                                            Log.v("joinContestDialog", e.toString());
                                            window.setLayout(-1, -2);
                                            Dialog dialog3 = dialog;
                                            textView5.setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda8(dialog3, walletInfoModel, this, intRef));
                                            dialog3.show();
                                            return;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        dialog = dialog2;
                                        Log.v("joinContestDialog", e.toString());
                                        window.setLayout(-1, -2);
                                        Dialog dialog32 = dialog;
                                        textView5.setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda8(dialog32, walletInfoModel, this, intRef));
                                        dialog32.show();
                                        return;
                                    }
                                    window.setLayout(-1, -2);
                                    Dialog dialog322 = dialog;
                                    textView5.setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda8(dialog322, walletInfoModel, this, intRef));
                                    dialog322.show();
                                    return;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.RelativeLayout");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: joinContestDialog$lambda-5  reason: not valid java name */
    public static final void m3534joinContestDialog$lambda5(Dialog dialog, WalletInfoModel walletInfoModel, CreateTeamFragment createTeamFragment, Ref.IntRef intRef, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(walletInfoModel, "$data");
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        Intrinsics.checkNotNullParameter(intRef, "$topupNeeded");
        dialog.dismiss();
        if (walletInfoModel.getRemaingWalletBalance() < 0.0d) {
            FragmentKt.findNavController(createTeamFragment).navigate((int) C1188R.C1192id.action_createTeamFragment_to_topUpFragment, BundleKt.bundleOf(TuplesKt.m276to("from", Constants.EVENT_JOIN_CONTEST), TuplesKt.m276to("topup_amount", String.valueOf(Math.abs(intRef.element)))));
            return;
        }
        DetailViewModel detailViewModel = null;
        if (Intrinsics.areEqual((Object) createTeamFragment.from, (Object) "join_contest_with_refer_code")) {
            CreateFantasyTeamModel createFantasyTeamModel2 = createTeamFragment.createFantasyTeamModel;
            JoinContestWithCodeBody joinContestWithCodeBody = new JoinContestWithCodeBody(String.valueOf(createFantasyTeamModel2 != null ? createFantasyTeamModel2.get_id() : null), createTeamFragment.referCode);
            DetailViewModel detailViewModel2 = createTeamFragment.viewModel;
            if (detailViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel2;
            }
            detailViewModel.joinContestWithCodeApi(joinContestWithCodeBody);
            return;
        }
        createTeamFragment.teamsIds.clear();
        ArrayList<String> arrayList = createTeamFragment.teamsIds;
        CreateFantasyTeamModel createFantasyTeamModel3 = createTeamFragment.createFantasyTeamModel;
        arrayList.add(String.valueOf(createFantasyTeamModel3 != null ? createFantasyTeamModel3.get_id() : null));
        JoinContestBody joinContestBody = new JoinContestBody(createTeamFragment.contestId, createTeamFragment.teamsIds);
        DetailViewModel detailViewModel3 = createTeamFragment.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel = detailViewModel3;
        }
        detailViewModel.joinContestApi(joinContestBody);
    }

    public final boolean backHandle() {
        SavedStateHandle savedStateHandle;
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlGroundLayout");
        boolean z = true;
        if (relativeLayout.getVisibility() == 0) {
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlGroundLayout");
            CommonMethodsKt.hide(relativeLayout2);
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_out_down);
            Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_out_down)");
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout)).startAnimation(loadAnimation);
            ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clCaptainVC);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "clCaptainVC");
            if (constraintLayout.getVisibility() != 0) {
                z = false;
            }
            if (!z) {
                if (Intrinsics.areEqual((Object) this.from, (Object) "update_team")) {
                    FragmentActivity activity = getActivity();
                    if (activity != null) {
                        String string = getResources().getString(C1188R.string.update_team);
                        Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.update_team)");
                        ((DetailActivity) activity).setTopBar(string, false, false, false, false, false, false, false);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
                    }
                } else {
                    FragmentActivity activity2 = getActivity();
                    if (activity2 != null) {
                        String string2 = getResources().getString(C1188R.string.create_team);
                        Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.create_team)");
                        ((DetailActivity) activity2).setTopBar(string2, false, false, false, false, false, false, false);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
                    }
                }
            }
        } else {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clCaptainVC);
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "clCaptainVC");
            if (constraintLayout2.getVisibility() == 0) {
                this.captainName = "";
                this.vcaptainName = "";
                RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
                Intrinsics.checkNotNullExpressionValue(relativeLayout3, "rlGroundLayout");
                if (relativeLayout3.getVisibility() != 0) {
                    z = false;
                }
                if (!z) {
                    if (Intrinsics.areEqual((Object) this.from, (Object) "update_team")) {
                        FragmentActivity activity3 = getActivity();
                        if (activity3 != null) {
                            String string3 = getResources().getString(C1188R.string.update_team);
                            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.update_team)");
                            ((DetailActivity) activity3).setTopBar(string3, false, false, false, false, false, false, false);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
                        }
                    } else {
                        FragmentActivity activity4 = getActivity();
                        if (activity4 != null) {
                            String string4 = getResources().getString(C1188R.string.create_team);
                            Intrinsics.checkNotNullExpressionValue(string4, "resources.getString(R.string.create_team)");
                            ((DetailActivity) activity4).setTopBar(string4, false, false, false, false, false, false, false);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
                        }
                    }
                }
                ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clCaptainVC);
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "clCaptainVC");
                CommonMethodsKt.hide(constraintLayout3);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_out_down);
                Intrinsics.checkNotNullExpressionValue(loadAnimation2, "loadAnimation(context, R.anim.slide_out_down)");
                ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clCaptainVC)).startAnimation(loadAnimation2);
            } else if (Intrinsics.areEqual((Object) this.from, (Object) "update_team") || Intrinsics.areEqual((Object) this.from, (Object) Constants.EVENT_CREATE_TEAM)) {
                Bundle bundle = new Bundle();
                bundle.putString("from", "team");
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_createTeamFragment_to_contestFragment, bundle);
            } else {
                NavBackStackEntry previousBackStackEntry = FragmentKt.findNavController(this).getPreviousBackStackEntry();
                if (previousBackStackEntry == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null) {
                    return true;
                }
                savedStateHandle.set("from", "back_press");
                return true;
            }
        }
        return false;
    }

    private final void successBack() {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_discard_team);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvYes);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvNo);
            if (findViewById2 != null) {
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawableResource(17170445);
                window.setLayout(-1, -2);
                textView.setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda6(dialog, this));
                ((TextView) findViewById2).setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda7(dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: successBack$lambda-6  reason: not valid java name */
    public static final void m3548successBack$lambda6(Dialog dialog, CreateTeamFragment createTeamFragment, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        dialog.dismiss();
        createTeamFragment.requireActivity().onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: successBack$lambda-7  reason: not valid java name */
    public static final void m3549successBack$lambda7(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void addLayout(Players players) {
        int roleId = players.getRole().getRoleId();
        if (roleId == 1) {
            View inflate = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBat), false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(requireActivity())\n…d, llContainerBat, false)");
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBat);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llContainerBat");
            setPlayerOnGround(inflate, players, linearLayout);
        } else if (roleId == 2) {
            View inflate2 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBowlers), false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "from(requireActivity())\n…lContainerBowlers, false)");
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBowlers);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llContainerBowlers");
            setPlayerOnGround(inflate2, players, linearLayout2);
        } else if (roleId == 3) {
            View inflate3 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerWk), false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "from(requireActivity())\n…nd, llContainerWk, false)");
            LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerWk);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "llContainerWk");
            setPlayerOnGround(inflate3, players, linearLayout3);
        } else if (roleId == 4) {
            View inflate4 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerAllRound), false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "from(requireActivity())\n…ContainerAllRound, false)");
            LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerAllRound);
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "llContainerAllRound");
            setPlayerOnGround(inflate4, players, linearLayout4);
        }
    }

    private final void setPlayerOnGround(View view, Players players, LinearLayout linearLayout) {
        View findViewById = view.findViewById(C1188R.C1192id.ivPlayer);
        if (findViewById != null) {
            ImageView imageView = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C1188R.C1192id.tvName);
            if (findViewById2 != null) {
                TextView textView = (TextView) findViewById2;
                View findViewById3 = view.findViewById(C1188R.C1192id.tvType);
                if (findViewById3 != null) {
                    TextView textView2 = (TextView) findViewById3;
                    View view2 = textView2;
                    CommonMethodsKt.hide(view2);
                    if (players.isCaptainSelected()) {
                        String string = requireContext().getString(C1188R.string.f424c);
                        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getString(R.string.c)");
                        textView2.setText(string);
                        CommonMethodsKt.visible(view2);
                    } else if (players.isVCaptainSelected()) {
                        String string2 = requireContext().getString(C1188R.string.f428vc);
                        Intrinsics.checkNotNullExpressionValue(string2, "requireContext().getString(R.string.vc)");
                        textView2.setText(string2);
                        CommonMethodsKt.visible(view2);
                    } else {
                        CommonMethodsKt.hide(view2);
                    }
                    textView.setText(printInitials(players.getName()));
                    String imageUrl = players.getImageUrl();
                    if (imageUrl == null) {
                        imageUrl = "";
                    }
                    ExtensionsKt.loadImage(imageView, imageUrl, C1188R.C1190drawable.profile_placeholder, true);
                    linearLayout.addView(view);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
    }

    private final void setAdapter(ArrayList<Players> arrayList) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.captainVcAdapter = new CaptainVcAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvSelectCaptain);
        CaptainVcAdapter captainVcAdapter2 = null;
        if (recyclerView != null) {
            CaptainVcAdapter captainVcAdapter3 = this.captainVcAdapter;
            if (captainVcAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("captainVcAdapter");
                captainVcAdapter3 = null;
            }
            recyclerView.setAdapter(captainVcAdapter3);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvSelectCaptain)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvSelectCaptain);
        CaptainVcAdapter captainVcAdapter4 = this.captainVcAdapter;
        if (captainVcAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("captainVcAdapter");
            captainVcAdapter4 = null;
        }
        recyclerView2.setAdapter(captainVcAdapter4);
        CaptainVcAdapter captainVcAdapter5 = this.captainVcAdapter;
        if (captainVcAdapter5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("captainVcAdapter");
        } else {
            captainVcAdapter2 = captainVcAdapter5;
        }
        Intrinsics.checkNotNull(arrayList);
        captainVcAdapter2.addList(true, arrayList);
    }

    private final void observeData(Bundle bundle) {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<PlayersModel>> getPlayersByMatchId = detailViewModel.getGetPlayersByMatchId();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressi0000000onValue(viewLifecycleOwner, "viewLifecycleOwner");
        getPlayersByMatchId.observe(viewLifecycleOwner, new CreateTeamFragment$$ExternalSyntheticLambda0(this, bundle));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<CreateFantasyTeamModel>> createFantasy = detailViewModel3.getCreateFantasy();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        createFantasy.observe(viewLifecycleOwner2, new CreateTeamFragment$$ExternalSyntheticLambda9(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<JoinContestModel>> joinContest = detailViewModel4.getJoinContest();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        joinContest.observe(viewLifecycleOwner3, new CreateTeamFragment$$ExternalSyntheticLambda10(this));
        DetailViewModel detailViewModel5 = this.viewModel;
        if (detailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel5 = null;
        }
        SingleLiveEvent<ApiResponseHandler<Contest>> createContest = detailViewModel5.getCreateContest();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        createContest.observe(viewLifecycleOwner4, new CreateTeamFragment$$ExternalSyntheticLambda11(this));
        DetailViewModel detailViewModel6 = this.viewModel;
        if (detailViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel6;
        }
        SingleLiveEvent<ApiResponseHandler<WalletInfoModel>> walletInfo = detailViewModel2.getWalletInfo();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "viewLifecycleOwner");
        walletInfo.observe(viewLifecycleOwner5, new CreateTeamFragment$$ExternalSyntheticLambda12(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-8  reason: not valid java name */
    public static final void m3546observeData$lambda8(CreateTeamFragment createTeamFragment, Bundle bundle, ApiResponseHandler apiResponseHandler) {
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                createTeamFragment.setPlayersInfo(new ArrayList());
                PlayersModel playersModel = (PlayersModel) apiResponseHandler.getData();
                FragmentCreateTeamBinding fragmentCreateTeamBinding = createTeamFragment.binding;
                Intrinsics.checkNotNull(fragmentCreateTeamBinding);
                ProgressBar progressBar = fragmentCreateTeamBinding.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding!!.progressBar");
                CommonMethodsKt.hide(progressBar);
                if (playersModel != null) {
                    FragmentCreateTeamBinding fragmentCreateTeamBinding2 = createTeamFragment.binding;
                    Intrinsics.checkNotNull(fragmentCreateTeamBinding2);
                    fragmentCreateTeamBinding2.setVm(playersModel.getMatch());
                    if (playersModel.getMatch().getTeam1() != null) {
                        ApplicationActivity.Companion.setTeam1(playersModel.getMatch().getTeam1());
                        CircleImageView circleImageView = (CircleImageView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.ivFlagTeam1);
                        Intrinsics.checkNotNullExpressionValue(circleImageView, "ivFlagTeam1");
                        ImageView imageView = circleImageView;
                        Team1 team1 = ApplicationActivity.Companion.getTeam1();
                        Intrinsics.checkNotNull(team1);
                        String teamIconUrl = team1.getTeamIconUrl();
                        if (teamIconUrl == null) {
                            str3 = "";
                        } else {
                            str3 = teamIconUrl;
                        }
                        ExtensionsKt.loadImage$default(imageView, str3, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                        CircleImageView circleImageView2 = (CircleImageView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.ivFlagBothTeam1);
                        Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivFlagBothTeam1");
                        ImageView imageView2 = circleImageView2;
                        Team1 team12 = ApplicationActivity.Companion.getTeam1();
                        Intrinsics.checkNotNull(team12);
                        String teamIconUrl2 = team12.getTeamIconUrl();
                        if (teamIconUrl2 == null) {
                            str4 = "";
                        } else {
                            str4 = teamIconUrl2;
                        }
                        ExtensionsKt.loadImage$default(imageView2, str4, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                        Team1 team13 = ApplicationActivity.Companion.getTeam1();
                        Intrinsics.checkNotNull(team13);
                        ((TextView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.filterTeamOne)).setText(team13.getTeamName());
                    }
                    if (playersModel.getMatch().getTeam2() != null) {
                        ApplicationActivity.Companion.setTeam2(playersModel.getMatch().getTeam2());
                        CircleImageView circleImageView3 = (CircleImageView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.ivFlagTeam2);
                        Intrinsics.checkNotNullExpressionValue(circleImageView3, "ivFlagTeam2");
                        ImageView imageView3 = circleImageView3;
                        Team2 team2 = ApplicationActivity.Companion.getTeam2();
                        Intrinsics.checkNotNull(team2);
                        String teamIconUrl3 = team2.getTeamIconUrl();
                        if (teamIconUrl3 == null) {
                            str = "";
                        } else {
                            str = teamIconUrl3;
                        }
                        ExtensionsKt.loadImage$default(imageView3, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                        CircleImageView circleImageView4 = (CircleImageView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.ivFlagBothTeam2);
                        Intrinsics.checkNotNullExpressionValue(circleImageView4, "ivFlagBothTeam2");
                        ImageView imageView4 = circleImageView4;
                        Team2 team22 = ApplicationActivity.Companion.getTeam2();
                        Intrinsics.checkNotNull(team22);
                        String teamIconUrl4 = team22.getTeamIconUrl();
                        if (teamIconUrl4 == null) {
                            str2 = "";
                        } else {
                            str2 = teamIconUrl4;
                        }
                        ExtensionsKt.loadImage$default(imageView4, str2, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                        Team2 team23 = ApplicationActivity.Companion.getTeam2();
                        Intrinsics.checkNotNull(team23);
                        ((TextView) createTeamFragment._$_findCachedViewById(C1188R.C1192id.filterTeamTwo)).setText(team23.getTeamName());
                    }
                    createTeamFragment.setPlayersInfo(playersModel.getPlayersInfo());
                    createTeamFragment.filterTeam = 0;
                    if (bundle == null) {
                        createTeamFragment.setData(createTeamFragment.getPlayersInfo(), "");
                    }
                }
            } else if (i == 2) {
                FragmentCreateTeamBinding fragmentCreateTeamBinding3 = createTeamFragment.binding;
                Intrinsics.checkNotNull(fragmentCreateTeamBinding3);
                ProgressBar progressBar2 = fragmentCreateTeamBinding3.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "binding!!.progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = createTeamFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                createTeamFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                FragmentCreateTeamBinding fragmentCreateTeamBinding4 = createTeamFragment.binding;
                Intrinsics.checkNotNull(fragmentCreateTeamBinding4);
                ProgressBar progressBar3 = fragmentCreateTeamBinding4.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "binding!!.progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: observeData$lambda-12  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3539observeData$lambda12(CreateTeamFragment r17, ApiResponseHandler r18) {
        /*
            r1 = r17
            java.lang.String r0 = "team_id"
            java.lang.String r2 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            if (r18 != 0) goto L_0x000c
            return
        L_0x000c:
            com.crickpe.utils.apiHandling.Status r2 = r18.getStatus()
            int[] r3 = com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            java.lang.String r4 = "requireActivity()"
            java.lang.String r5 = "rlProgressTeam"
            if (r2 == r3) goto L_0x0075
            r0 = 2
            if (r2 == r0) goto L_0x0039
            r0 = 3
            if (r2 == r0) goto L_0x0027
            goto L_0x0237
        L_0x0027:
            int r0 = com.crickpe.C1188R.C1192id.rlProgressTeam
            android.view.View r0 = r1._$_findCachedViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.view.View r0 = (android.view.View) r0
            com.crickpe.utils.CommonMethodsKt.visible(r0)
            goto L_0x0237
        L_0x0039:
            int r0 = com.crickpe.C1188R.C1192id.rlProgressTeam
            android.view.View r0 = r1._$_findCachedViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.view.View r0 = (android.view.View) r0
            com.crickpe.utils.CommonMethodsKt.hide(r0)
            com.crickpe.utils.apiHandling.AppError r0 = r18.getError()
            boolean r0 = r0 instanceof com.crickpe.utils.apiHandling.AppError.ApiError
            if (r0 == 0) goto L_0x0237
            com.crickpe.utils.apiHandling.AppError r0 = r18.getError()
            com.crickpe.utils.apiHandling.AppError$ApiError r0 = (com.crickpe.utils.apiHandling.AppError.ApiError) r0
            java.lang.String r0 = r0.getStatusCode()
            java.lang.String r2 = "400"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x0237
            androidx.fragment.app.FragmentActivity r0 = r17.requireActivity()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            android.app.Activity r0 = (android.app.Activity) r0
            com.crickpe.utils.apiHandling.AppError r2 = r18.getError()
            r1.handleApiError(r0, r2)
            goto L_0x0237
        L_0x0075:
            java.lang.Object r2 = r18.getData()
            com.crickpe.view.detail.fragments.create_own_team.create_team.CreateFantasyTeamModel r2 = (com.crickpe.view.detail.fragments.create_own_team.create_team.CreateFantasyTeamModel) r2
            r1.createFantasyTeamModel = r2
            if (r2 == 0) goto L_0x0237
            java.lang.String r2 = r1.from
            int r3 = r2.hashCode()
            r6 = 200(0xc8, double:9.9E-322)
            r8 = 0
            switch(r3) {
                case -573450221: goto L_0x0203;
                case -493578304: goto L_0x016f;
                case -127287087: goto L_0x00c4;
                case 1505668327: goto L_0x008d;
                default: goto L_0x008b;
            }
        L_0x008b:
            goto L_0x0237
        L_0x008d:
            java.lang.String r0 = "copy_team"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0097
            goto L_0x0237
        L_0x0097:
            int r0 = com.crickpe.C1188R.C1192id.rlProgressTeam
            android.view.View r0 = r1._$_findCachedViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.view.View r0 = (android.view.View) r0
            com.crickpe.utils.CommonMethodsKt.hide(r0)
            r0 = 2131951840(0x7f1300e0, float:1.9540106E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "getString(R.string.fanta…team_copied_successfully)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.showToast(r0)
            android.os.Handler r0 = r1.handler
            com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment$$ExternalSyntheticLambda17 r2 = new com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment$$ExternalSyntheticLambda17
            r2.<init>(r1)
            r0.postDelayed(r2, r6)
            goto L_0x0237
        L_0x00c4:
            java.lang.String r0 = "create_contest"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x00ce
            goto L_0x0237
        L_0x00ce:
            com.crickpe.data.CreateContestRequest r2 = new com.crickpe.data.CreateContestRequest
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.data.CreateContestRequest r0 = r0.getContestData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r10 = r0.getMatchId()
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.data.CreateContestRequest r0 = r0.getContestData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r11 = r0.getName()
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.data.CreateContestRequest r0 = r0.getContestData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r12 = r0.getTotalSpots()
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.data.CreateContestRequest r0 = r0.getContestData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r13 = r0.getEntryFee()
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.data.CreateContestRequest r0 = r0.getContestData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r14 = r0.getNoOfWinner()
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.data.CreateContestRequest r0 = r0.getContestData()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r15 = r0.isMultipleTeamAllowed()
            com.crickpe.view.detail.fragments.create_own_team.create_team.CreateFantasyTeamModel r0 = r1.createFantasyTeamModel
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            java.lang.String r16 = r0.get_id()
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE     // Catch:{ Exception -> 0x0155 }
            com.crickpe.data.CreateContestRequest r0 = r0.getContestData()     // Catch:{ Exception -> 0x0155 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch:{ Exception -> 0x0155 }
            java.lang.String r0 = r0.getEntryFee()     // Catch:{ Exception -> 0x0155 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0155 }
            double r3 = (double) r0     // Catch:{ Exception -> 0x0155 }
            com.crickpe.view.ApplicationActivity$Companion r0 = com.crickpe.view.ApplicationActivity.Companion     // Catch:{ Exception -> 0x0155 }
            double r5 = r0.getWalletBalance()     // Catch:{ Exception -> 0x0155 }
            double r3 = r3 - r5
            int r0 = (int) r3     // Catch:{ Exception -> 0x0155 }
            r1.lowAmount = r0     // Catch:{ Exception -> 0x0155 }
            if (r0 <= 0) goto L_0x015f
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE     // Catch:{ Exception -> 0x0155 }
            int r3 = r1.lowAmount     // Catch:{ Exception -> 0x0155 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0155 }
            r0.saveLowAmount(r3)     // Catch:{ Exception -> 0x0155 }
            goto L_0x015f
        L_0x0155:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "changeNavDestination2"
            android.util.Log.v(r3, r0)
        L_0x015f:
            com.crickpe.view.detail.DetailViewModel r0 = r1.viewModel
            if (r0 != 0) goto L_0x0169
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L_0x016a
        L_0x0169:
            r8 = r0
        L_0x016a:
            r8.createContestApi(r2)
            goto L_0x0237
        L_0x016f:
            java.lang.String r3 = "create_team"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0179
            goto L_0x0237
        L_0x0179:
            int r2 = com.crickpe.C1188R.C1192id.rlProgressTeam
            android.view.View r2 = r1._$_findCachedViewById(r2)
            android.widget.RelativeLayout r2 = (android.widget.RelativeLayout) r2
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)
            android.view.View r2 = (android.view.View) r2
            com.crickpe.utils.CommonMethodsKt.hide(r2)
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ Exception -> 0x01dd }
            r2.<init>()     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r5 = r18.getData()     // Catch:{ Exception -> 0x01dd }
            com.crickpe.view.detail.fragments.create_own_team.create_team.CreateFantasyTeamModel r5 = (com.crickpe.view.detail.fragments.create_own_team.create_team.CreateFantasyTeamModel) r5     // Catch:{ Exception -> 0x01dd }
            if (r5 == 0) goto L_0x019b
            java.lang.String r5 = r5.get_id()     // Catch:{ Exception -> 0x01dd }
            goto L_0x019c
        L_0x019b:
            r5 = r8
        L_0x019c:
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x01dd }
            r2.putString(r0, r5)     // Catch:{ Exception -> 0x01dd }
            com.crickpe.view.ApplicationActivity$Companion r5 = com.crickpe.view.ApplicationActivity.Companion     // Catch:{ Exception -> 0x01dd }
            com.google.firebase.analytics.FirebaseAnalytics r5 = r5.getMFirebaseAnalytics()     // Catch:{ Exception -> 0x01dd }
            r5.logEvent(r3, r2)     // Catch:{ Exception -> 0x01dd }
            com.amplitude.android.Amplitude r2 = r1.amplitude     // Catch:{ Exception -> 0x01dd }
            if (r2 != 0) goto L_0x01b6
            java.lang.String r2 = "amplitude"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ Exception -> 0x01dd }
            r2 = r8
        L_0x01b6:
            r9 = r2
            com.amplitude.core.Amplitude r9 = (com.amplitude.core.Amplitude) r9     // Catch:{ Exception -> 0x01dd }
            java.lang.String r10 = "create_team"
            r11 = 0
            r12 = 0
            r13 = 6
            r14 = 0
            com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) r9, (java.lang.String) r10, (java.util.Map) r11, (com.amplitude.core.events.EventOptions) r12, (int) r13, (java.lang.Object) r14)     // Catch:{ Exception -> 0x01dd }
            androidx.fragment.app.FragmentActivity r2 = r17.requireActivity()     // Catch:{ Exception -> 0x01dd }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)     // Catch:{ Exception -> 0x01dd }
            java.lang.Object r4 = r18.getData()     // Catch:{ Exception -> 0x01dd }
            com.crickpe.view.detail.fragments.create_own_team.create_team.CreateFantasyTeamModel r4 = (com.crickpe.view.detail.fragments.create_own_team.create_team.CreateFantasyTeamModel) r4     // Catch:{ Exception -> 0x01dd }
            if (r4 == 0) goto L_0x01d5
            java.lang.String r8 = r4.get_id()     // Catch:{ Exception -> 0x01dd }
        L_0x01d5:
            java.lang.String r4 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x01dd }
            com.crickpe.utils.CommonMethodsKt.callAppsFlyer(r2, r4, r0, r3)     // Catch:{ Exception -> 0x01dd }
            goto L_0x01e7
        L_0x01dd:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "Analytics"
            android.util.Log.e(r2, r0)
        L_0x01e7:
            r0 = 2131951841(0x7f1300e1, float:1.9540108E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "getString(R.string.fanta…eam_created_successfully)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.showToast(r0)
            android.os.Handler r0 = r1.handler
            com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment$$ExternalSyntheticLambda15 r2 = new com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment$$ExternalSyntheticLambda15
            r2.<init>(r1)
            r0.postDelayed(r2, r6)
            goto L_0x0237
        L_0x0203:
            java.lang.String r0 = "update_team"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x020c
            goto L_0x0237
        L_0x020c:
            int r0 = com.crickpe.C1188R.C1192id.rlProgressTeam
            android.view.View r0 = r1._$_findCachedViewById(r0)
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)
            android.view.View r0 = (android.view.View) r0
            com.crickpe.utils.CommonMethodsKt.hide(r0)
            r0 = 2131951842(0x7f1300e2, float:1.954011E38)
            java.lang.String r0 = r1.getString(r0)
            java.lang.String r2 = "getString(R.string.fanta…eam_updated_successfully)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r1.showToast(r0)
            android.os.Handler r0 = r1.handler
            com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment$$ExternalSyntheticLambda16 r2 = new com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment$$ExternalSyntheticLambda16
            r2.<init>(r1)
            r0.postDelayed(r2, r6)
        L_0x0237:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment.m3539observeData$lambda12(com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment, com.crickpe.utils.apiHandling.ApiResponseHandler):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-12$lambda-9  reason: not valid java name */
    public static final void m3542observeData$lambda12$lambda9(CreateTeamFragment createTeamFragment) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        FragmentKt.findNavController(createTeamFragment).navigate((int) C1188R.C1192id.action_createTeamFragment_to_contestFragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-12$lambda-10  reason: not valid java name */
    public static final void m3540observeData$lambda12$lambda10(CreateTeamFragment createTeamFragment) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        FragmentKt.findNavController(createTeamFragment).navigate((int) C1188R.C1192id.action_createTeamFragment_to_contestFragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-12$lambda-11  reason: not valid java name */
    public static final void m3541observeData$lambda12$lambda11(CreateTeamFragment createTeamFragment) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        FragmentKt.findNavController(createTeamFragment).navigate((int) C1188R.C1192id.action_createTeamFragment_to_contestFragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-13  reason: not valid java name */
    public static final void m3543observeData$lambda13(CreateTeamFragment createTeamFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                JoinContestModel joinContestModel = (JoinContestModel) apiResponseHandler.getData();
                RelativeLayout relativeLayout = (RelativeLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.rlProgressTeam);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlProgressTeam");
                CommonMethodsKt.hide(relativeLayout);
                ProgressBar progressBar = (ProgressBar) createTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (joinContestModel != null) {
                    try {
                        Amplitude amplitude2 = createTeamFragment.amplitude;
                        if (amplitude2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                            amplitude2 = null;
                        }
                        com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_JOIN_CONTEST, (Map) null, (EventOptions) null, 6, (Object) null);
                        HashMap hashMap = new HashMap();
                        hashMap.put(AFInAppEventParameterName.REVENUE, String.valueOf(createTeamFragment.revenue));
                        AppsFlyerLib.getInstance().logEvent(createTeamFragment.requireActivity().getApplicationContext(), Constants.EVENT_JOIN_CONTEST, hashMap, new CreateTeamFragment$observeData$3$1());
                        Bundle bundle = new Bundle();
                        bundle.putString("revenue", String.valueOf(createTeamFragment.revenue));
                        ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_JOIN_CONTEST, bundle);
                    } catch (Exception e) {
                        Log.e("Analytics", e.toString());
                    }
                    String string = createTeamFragment.getString(C1188R.string.contest_join_successfully);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.contest_join_successfully)");
                    createTeamFragment.showToast(string);
                    FragmentKt.findNavController(createTeamFragment).navigate((int) C1188R.C1192id.action_createTeamFragment_to_contestFragment);
                }
            } else if (i == 2) {
                if (Intrinsics.areEqual((Object) String.valueOf(apiResponseHandler.getError()), (Object) "ApiError(message=Insufficient Balance!)")) {
                    createTeamFragment.insufficientDialog();
                    Log.v("APIIIII", "joinContest");
                }
                RelativeLayout relativeLayout2 = (RelativeLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.rlProgressTeam);
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlProgressTeam");
                CommonMethodsKt.hide(relativeLayout2);
                ProgressBar progressBar2 = (ProgressBar) createTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                if (apiResponseHandler.getError() instanceof AppError.ApiError) {
                    FragmentActivity requireActivity = createTeamFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    createTeamFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                }
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) createTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-14  reason: not valid java name */
    public static final void m3544observeData$lambda14(CreateTeamFragment createTeamFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                RelativeLayout relativeLayout = (RelativeLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.rlProgressTeam);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlProgressTeam");
                CommonMethodsKt.hide(relativeLayout);
                ProgressBar progressBar = (ProgressBar) createTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                Contest contest = (Contest) apiResponseHandler.getData();
                if (contest != null) {
                    Bundle bundle = new Bundle();
                    String json = new Gson().toJson((Object) contest);
                    Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(data)");
                    bundle.putString(PrefsManager.CONTEST_DATA, json);
                    bundle.putString("from", "create");
                    try {
                        Amplitude amplitude2 = createTeamFragment.amplitude;
                        if (amplitude2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                            amplitude2 = null;
                        }
                        com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_JOIN_CONTEST, (Map) null, (EventOptions) null, 6, (Object) null);
                        HashMap hashMap = new HashMap();
                        hashMap.put(AFInAppEventParameterName.REVENUE, String.valueOf(contest.getEntryFee()));
                        AppsFlyerLib.getInstance().logEvent(createTeamFragment.requireActivity().getApplicationContext(), Constants.EVENT_JOIN_CONTEST, hashMap, new CreateTeamFragment$observeData$4$1());
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("revenue", String.valueOf(contest.getEntryFee()));
                        ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_JOIN_CONTEST, bundle2);
                    } catch (Exception e) {
                        Log.e("Analytics", e.toString());
                    }
                    FragmentKt.findNavController(createTeamFragment).navigate((int) C1188R.C1192id.action_createTeamFragment_to_shareContestFragment, bundle);
                }
            } else if (i == 2) {
                RelativeLayout relativeLayout2 = (RelativeLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.rlProgressTeam);
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlProgressTeam");
                CommonMethodsKt.hide(relativeLayout2);
                ProgressBar progressBar2 = (ProgressBar) createTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                if ((apiResponseHandler.getError() instanceof AppError.ApiError) && Intrinsics.areEqual((Object) ((AppError.ApiError) apiResponseHandler.getError()).getStatusCode(), (Object) "400") && Intrinsics.areEqual((Object) ((AppError.ApiError) apiResponseHandler.getError()).getMessage(), (Object) "Insufficient Balance!")) {
                    createTeamFragment.insufficientDialog();
                }
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) createTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-15  reason: not valid java name */
    public static final void m3545observeData$lambda15(CreateTeamFragment createTeamFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                WalletInfoModel walletInfoModel = (WalletInfoModel) apiResponseHandler.getData();
                RelativeLayout relativeLayout = (RelativeLayout) createTeamFragment._$_findCachedViewById(C1188R.C1192id.rlProgressTeam);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlProgressTeam");
                CommonMethodsKt.hide(relativeLayout);
                ProgressBar progressBar = (ProgressBar) createTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (walletInfoModel != null) {
                    createTeamFragment.joinContestDialog(walletInfoModel);
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) createTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) createTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setData(ArrayList<PlayersInfo> arrayList, String str) {
        this.batsmanList = new ArrayList<>();
        this.bowlerList = new ArrayList<>();
        this.wkList = new ArrayList<>();
        this.allRounderList = new ArrayList<>();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (Intrinsics.areEqual((Object) this.from, (Object) "update_team")) {
                int size2 = arrayList.get(i).getPlayers().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    FantasyTeamListModel fantasyTeamListModel = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel);
                    int size3 = fantasyTeamListModel.getPlayers().size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        String playerId = arrayList.get(i).getPlayers().get(i2).getPlayerId();
                        FantasyTeamListModel fantasyTeamListModel2 = this.fantasyTeamListModelUpdate;
                        Intrinsics.checkNotNull(fantasyTeamListModel2);
                        if (Intrinsics.areEqual((Object) playerId, (Object) fantasyTeamListModel2.getPlayers().get(i3).getPlayerId())) {
                            ApplicationActivity.Companion.getSelectedPlayers().add(arrayList.get(i).getPlayers().get(i2));
                        }
                    }
                }
            } else if (Intrinsics.areEqual((Object) this.from, (Object) "copy_team")) {
                int size4 = arrayList.get(i).getPlayers().size();
                for (int i4 = 0; i4 < size4; i4++) {
                    FantasyTeamListModel fantasyTeamListModel3 = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel3);
                    int size5 = fantasyTeamListModel3.getPlayers().size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        String playerId2 = arrayList.get(i).getPlayers().get(i4).getPlayerId();
                        FantasyTeamListModel fantasyTeamListModel4 = this.fantasyTeamListModelUpdate;
                        Intrinsics.checkNotNull(fantasyTeamListModel4);
                        if (Intrinsics.areEqual((Object) playerId2, (Object) fantasyTeamListModel4.getPlayers().get(i5).getPlayerId())) {
                            ApplicationActivity.Companion.getSelectedPlayers().add(arrayList.get(i).getPlayers().get(i4));
                        }
                    }
                }
            }
            if (!Intrinsics.areEqual((Object) str, (Object) "")) {
                int roleId = arrayList.get(i).getRoleId();
                if (roleId == 1) {
                    int size6 = arrayList.get(i).getPlayers().size();
                    for (int i6 = 0; i6 < size6; i6++) {
                        if (Intrinsics.areEqual((Object) str, (Object) arrayList.get(i).getPlayers().get(i6).getTeamId())) {
                            this.batsmanList.add(arrayList.get(i).getPlayers().get(i6));
                        }
                    }
                } else if (roleId == 2) {
                    int size7 = arrayList.get(i).getPlayers().size();
                    for (int i7 = 0; i7 < size7; i7++) {
                        if (Intrinsics.areEqual((Object) str, (Object) arrayList.get(i).getPlayers().get(i7).getTeamId())) {
                            this.bowlerList.add(arrayList.get(i).getPlayers().get(i7));
                        }
                    }
                } else if (roleId != 3) {
                    int size8 = arrayList.get(i).getPlayers().size();
                    for (int i8 = 0; i8 < size8; i8++) {
                        if (Intrinsics.areEqual((Object) str, (Object) arrayList.get(i).getPlayers().get(i8).getTeamId())) {
                            this.allRounderList.add(arrayList.get(i).getPlayers().get(i8));
                        }
                    }
                } else {
                    int size9 = arrayList.get(i).getPlayers().size();
                    for (int i9 = 0; i9 < size9; i9++) {
                        if (Intrinsics.areEqual((Object) str, (Object) arrayList.get(i).getPlayers().get(i9).getTeamId())) {
                            this.wkList.add(arrayList.get(i).getPlayers().get(i9));
                        }
                    }
                }
            } else {
                int roleId2 = arrayList.get(i).getRoleId();
                if (roleId2 == 1) {
                    int size10 = arrayList.get(i).getPlayers().size();
                    for (int i10 = 0; i10 < size10; i10++) {
                        this.batsmanList.add(arrayList.get(i).getPlayers().get(i10));
                    }
                } else if (roleId2 == 2) {
                    int size11 = arrayList.get(i).getPlayers().size();
                    for (int i11 = 0; i11 < size11; i11++) {
                        this.bowlerList.add(arrayList.get(i).getPlayers().get(i11));
                    }
                } else if (roleId2 != 3) {
                    int size12 = arrayList.get(i).getPlayers().size();
                    for (int i12 = 0; i12 < size12; i12++) {
                        this.allRounderList.add(arrayList.get(i).getPlayers().get(i12));
                    }
                } else {
                    int size13 = arrayList.get(i).getPlayers().size();
                    for (int i13 = 0; i13 < size13; i13++) {
                        this.wkList.add(arrayList.get(i).getPlayers().get(i13));
                    }
                }
            }
        }
        setFilterRadio();
        initPager();
    }

    private final void insufficientDialog() {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_insufficient_balance);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvYes);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvNo);
            if (findViewById2 != null) {
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawableResource(17170445);
                window.setLayout(-1, -2);
                textView.setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda13(dialog, this));
                ((TextView) findViewById2).setOnClickListener(new CreateTeamFragment$$ExternalSyntheticLambda14(dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: insufficientDialog$lambda-16  reason: not valid java name */
    public static final void m3532insufficientDialog$lambda16(Dialog dialog, CreateTeamFragment createTeamFragment, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(createTeamFragment, "this$0");
        dialog.dismiss();
        FragmentKt.findNavController(createTeamFragment).navigate((int) C1188R.C1192id.action_createTeamFragment_to_topUpFragment, BundleKt.bundleOf(TuplesKt.m276to("from", "create_contest")));
    }

    /* access modifiers changed from: private */
    /* renamed from: insufficientDialog$lambda-17  reason: not valid java name */
    public static final void m3533insufficientDialog$lambda17(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void setTabTitle() {
        Log.v("Counting", String.valueOf(ApplicationActivity.Companion.getCounting()));
        if (Intrinsics.areEqual((Object) this.from, (Object) "update_team") || Intrinsics.areEqual((Object) this.from, (Object) "copy_team")) {
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress1)).setProgress(100);
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress2)).setProgress(100);
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress3)).setProgress(100);
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress4)).setProgress(100);
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress5)).setProgress(100);
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress6)).setProgress(100);
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress7)).setProgress(100);
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress8)).setProgress(100);
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress9)).setProgress(100);
            ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress10)).setProgress(100);
        }
        switch (ApplicationActivity.Companion.getCounting()) {
            case 0:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress1)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount1)).setText("");
                break;
            case 1:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress1)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount1)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress2)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount2)).setText("");
                break;
            case 2:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress2)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount2)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount1)).setText("");
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress3)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount3)).setText("");
                break;
            case 3:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress3)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount3)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount2)).setText("");
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress4)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount4)).setText("");
                break;
            case 4:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress4)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount4)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount3)).setText("");
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress5)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount5)).setText("");
                break;
            case 5:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress5)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount5)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount4)).setText("");
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress6)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount6)).setText("");
                break;
            case 6:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress6)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount6)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount5)).setText("");
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress7)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount7)).setText("");
                break;
            case 7:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress7)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount7)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount6)).setText("");
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress8)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount8)).setText("");
                break;
            case 8:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress8)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount8)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount7)).setText("");
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress9)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount9)).setText("");
                break;
            case 9:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress9)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount9)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount8)).setText("");
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress10)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount10)).setText("");
                break;
            case 10:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress10)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount10)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount9)).setText("");
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress11)).setProgress(0);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount11)).setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.black));
                break;
            case 11:
                ((ProgressBar) _$_findCachedViewById(C1188R.C1192id.progress11)).setProgress(100);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount11)).setText(String.valueOf(ApplicationActivity.Companion.getCounting()));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount11)).setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.white));
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCount10)).setText("");
                break;
        }
        ((TextView) _$_findCachedViewById(C1188R.C1192id.teamOne)).setText(String.valueOf(ApplicationActivity.Companion.getTeamOneCount()));
        ((TextView) _$_findCachedViewById(C1188R.C1192id.teamTwo)).setText(String.valueOf(ApplicationActivity.Companion.getTeamTwoCount()));
        int currentTabPosition = ApplicationActivity.Companion.getCurrentTabPosition();
        if (currentTabPosition == 0) {
            TabLayout.Tab tabAt = ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).getTabAt(ApplicationActivity.Companion.getCurrentTabPosition());
            Intrinsics.checkNotNull(tabAt);
            tabAt.setText((CharSequence) getString(C1188R.string.bat) + '(' + ApplicationActivity.Companion.getBatsmanCount() + ')');
        } else if (currentTabPosition == 1) {
            TabLayout.Tab tabAt2 = ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).getTabAt(ApplicationActivity.Companion.getCurrentTabPosition());
            Intrinsics.checkNotNull(tabAt2);
            tabAt2.setText((CharSequence) getString(C1188R.string.bowl) + '(' + ApplicationActivity.Companion.getBowlerCount() + ')');
        } else if (currentTabPosition != 2) {
            TabLayout.Tab tabAt3 = ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).getTabAt(ApplicationActivity.Companion.getCurrentTabPosition());
            Intrinsics.checkNotNull(tabAt3);
            tabAt3.setText((CharSequence) getString(C1188R.string.all) + '(' + ApplicationActivity.Companion.getAllRounderCount() + ')');
        } else {
            TabLayout.Tab tabAt4 = ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).getTabAt(ApplicationActivity.Companion.getCurrentTabPosition());
            Intrinsics.checkNotNull(tabAt4);
            tabAt4.setText((CharSequence) getString(C1188R.string.wicket_keeper) + '(' + ApplicationActivity.Companion.getWkCount() + ')');
        }
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPlayerSelected)).setText(ApplicationActivity.Companion.getCounting() + "/11");
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreditLeft)).setText(String.valueOf(roundOffDecimal(ApplicationActivity.Companion.getCredit())));
    }

    private final StateListDrawable setImageButtonStateNew(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842913}, ContextCompat.getDrawable(context, C1188R.C1190drawable.tab_bg_normal_blue));
        stateListDrawable.addState(new int[]{-16842913}, ContextCompat.getDrawable(context, C1188R.C1190drawable.tab_bg_normal));
        return stateListDrawable;
    }

    private final void initPager() {
        if (((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)) != null) {
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).removeAllTabs();
        }
        if (Intrinsics.areEqual((Object) this.from, (Object) "update_team") || Intrinsics.areEqual((Object) this.from, (Object) "copy_team")) {
            ApplicationActivity.Companion.setCounting(0);
            ApplicationActivity.Companion.setBatsmanCount(0);
            ApplicationActivity.Companion.setBowlerCount(0);
            ApplicationActivity.Companion.setWkCount(0);
            ApplicationActivity.Companion.setAllRounderCount(0);
            TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue);
            Intrinsics.checkNotNullExpressionValue(textView, "tvContinue");
            CommonMethodsKt.visible(textView);
            TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvPreview);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvPreview");
            CommonMethodsKt.visible(textView2);
            FantasyTeamListModel fantasyTeamListModel = this.fantasyTeamListModelUpdate;
            Intrinsics.checkNotNull(fantasyTeamListModel);
            int size = fantasyTeamListModel.getPlayers().size();
            for (int i = 0; i < size; i++) {
                int size2 = ApplicationActivity.Companion.getSelectedPlayers().size();
                for (int i2 = 0; i2 < size2; i2++) {
                    FantasyTeamListModel fantasyTeamListModel2 = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel2);
                    if (fantasyTeamListModel2.getPlayers().get(i).isFantasyCaptain()) {
                        FantasyTeamListModel fantasyTeamListModel3 = this.fantasyTeamListModelUpdate;
                        Intrinsics.checkNotNull(fantasyTeamListModel3);
                        if (Intrinsics.areEqual((Object) fantasyTeamListModel3.getPlayers().get(i).getPlayerId(), (Object) ApplicationActivity.Companion.getSelectedPlayers().get(i2).getPlayerId())) {
                            ApplicationActivity.Companion.getSelectedPlayers().get(i2).setCaptainSelected(true);
                            FantasyTeamListModel fantasyTeamListModel4 = this.fantasyTeamListModelUpdate;
                            Intrinsics.checkNotNull(fantasyTeamListModel4);
                            this.captainId = fantasyTeamListModel4.getPlayers().get(i).getPlayerId();
                            FantasyTeamListModel fantasyTeamListModel5 = this.fantasyTeamListModelUpdate;
                            Intrinsics.checkNotNull(fantasyTeamListModel5);
                            this.captainName = fantasyTeamListModel5.getPlayers().get(i).getName();
                            FantasyTeamListModel fantasyTeamListModel6 = this.fantasyTeamListModelUpdate;
                            Intrinsics.checkNotNull(fantasyTeamListModel6);
                            this.captainImage = fantasyTeamListModel6.getPlayers().get(i).getImageUrl();
                        }
                    }
                    FantasyTeamListModel fantasyTeamListModel7 = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel7);
                    if (fantasyTeamListModel7.getPlayers().get(i).isFantasyViceCaptain()) {
                        FantasyTeamListModel fantasyTeamListModel8 = this.fantasyTeamListModelUpdate;
                        Intrinsics.checkNotNull(fantasyTeamListModel8);
                        if (Intrinsics.areEqual((Object) fantasyTeamListModel8.getPlayers().get(i).getPlayerId(), (Object) ApplicationActivity.Companion.getSelectedPlayers().get(i2).getPlayerId())) {
                            ApplicationActivity.Companion.getSelectedPlayers().get(i2).setVCaptainSelected(true);
                            FantasyTeamListModel fantasyTeamListModel9 = this.fantasyTeamListModelUpdate;
                            Intrinsics.checkNotNull(fantasyTeamListModel9);
                            this.vcaptainId = fantasyTeamListModel9.getPlayers().get(i).getPlayerId();
                            FantasyTeamListModel fantasyTeamListModel10 = this.fantasyTeamListModelUpdate;
                            Intrinsics.checkNotNull(fantasyTeamListModel10);
                            this.vcaptainName = fantasyTeamListModel10.getPlayers().get(i).getName();
                            FantasyTeamListModel fantasyTeamListModel11 = this.fantasyTeamListModelUpdate;
                            Intrinsics.checkNotNull(fantasyTeamListModel11);
                            this.vcaptainImage = fantasyTeamListModel11.getPlayers().get(i).getImageUrl();
                        }
                    }
                }
                FantasyTeamListModel fantasyTeamListModel12 = this.fantasyTeamListModelUpdate;
                Intrinsics.checkNotNull(fantasyTeamListModel12);
                String str = fantasyTeamListModel12.getPlayers().get(i).getTeam().get_id();
                Team1 team1 = ApplicationActivity.Companion.getTeam1();
                Intrinsics.checkNotNull(team1);
                if (Intrinsics.areEqual((Object) str, (Object) team1.getTeamId())) {
                    ApplicationActivity.Companion companion = ApplicationActivity.Companion;
                    companion.setTeamOneCount(companion.getTeamOneCount() + 1);
                } else {
                    FantasyTeamListModel fantasyTeamListModel13 = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel13);
                    String str2 = fantasyTeamListModel13.getPlayers().get(i).getTeam().get_id();
                    Team2 team2 = ApplicationActivity.Companion.getTeam2();
                    Intrinsics.checkNotNull(team2);
                    if (Intrinsics.areEqual((Object) str2, (Object) team2.getTeamId())) {
                        ApplicationActivity.Companion companion2 = ApplicationActivity.Companion;
                        companion2.setTeamTwoCount(companion2.getTeamTwoCount() + 1);
                    }
                }
                int size3 = this.batsmanList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    FantasyTeamListModel fantasyTeamListModel14 = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel14);
                    if (Intrinsics.areEqual((Object) fantasyTeamListModel14.getPlayers().get(i).getPlayerId(), (Object) this.batsmanList.get(i3).getPlayerId())) {
                        this.batsmanList.get(i3).setSelected(true);
                        ApplicationActivity.Companion companion3 = ApplicationActivity.Companion;
                        companion3.setBatsmanCount(companion3.getBatsmanCount() + 1);
                        ApplicationActivity.Companion companion4 = ApplicationActivity.Companion;
                        companion4.setCounting(companion4.getCounting() + 1);
                    }
                }
                int size4 = this.bowlerList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    FantasyTeamListModel fantasyTeamListModel15 = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel15);
                    if (Intrinsics.areEqual((Object) fantasyTeamListModel15.getPlayers().get(i).getPlayerId(), (Object) this.bowlerList.get(i4).getPlayerId())) {
                        this.bowlerList.get(i4).setSelected(true);
                        ApplicationActivity.Companion companion5 = ApplicationActivity.Companion;
                        companion5.setBowlerCount(companion5.getBowlerCount() + 1);
                        ApplicationActivity.Companion companion6 = ApplicationActivity.Companion;
                        companion6.setCounting(companion6.getCounting() + 1);
                    }
                }
                int size5 = this.wkList.size();
                for (int i5 = 0; i5 < size5; i5++) {
                    FantasyTeamListModel fantasyTeamListModel16 = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel16);
                    if (Intrinsics.areEqual((Object) fantasyTeamListModel16.getPlayers().get(i).getPlayerId(), (Object) this.wkList.get(i5).getPlayerId())) {
                        this.wkList.get(i5).setSelected(true);
                        ApplicationActivity.Companion companion7 = ApplicationActivity.Companion;
                        companion7.setCounting(companion7.getCounting() + 1);
                        ApplicationActivity.Companion companion8 = ApplicationActivity.Companion;
                        companion8.setWkCount(companion8.getWkCount() + 1);
                    }
                }
                int size6 = this.allRounderList.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    FantasyTeamListModel fantasyTeamListModel17 = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel17);
                    if (Intrinsics.areEqual((Object) fantasyTeamListModel17.getPlayers().get(i).getPlayerId(), (Object) this.allRounderList.get(i6).getPlayerId())) {
                        this.allRounderList.get(i6).setSelected(true);
                        ApplicationActivity.Companion companion9 = ApplicationActivity.Companion;
                        companion9.setCounting(companion9.getCounting() + 1);
                        ApplicationActivity.Companion companion10 = ApplicationActivity.Companion;
                        companion10.setAllRounderCount(companion10.getAllRounderCount() + 1);
                    }
                }
            }
            try {
                FantasyTeamListModel fantasyTeamListModel18 = this.fantasyTeamListModelUpdate;
                Intrinsics.checkNotNull(fantasyTeamListModel18);
                int size7 = fantasyTeamListModel18.getPlayersCountArr().size();
                for (int i7 = 0; i7 < size7; i7++) {
                    FantasyTeamListModel fantasyTeamListModel19 = this.fantasyTeamListModelUpdate;
                    Intrinsics.checkNotNull(fantasyTeamListModel19);
                    int roleId = fantasyTeamListModel19.getPlayersCountArr().get(i7).getRoleId();
                    if (roleId == 1) {
                        ApplicationActivity.Companion companion11 = ApplicationActivity.Companion;
                        FantasyTeamListModel fantasyTeamListModel20 = this.fantasyTeamListModelUpdate;
                        Intrinsics.checkNotNull(fantasyTeamListModel20);
                        companion11.setBatsmanCount(fantasyTeamListModel20.getPlayersCountArr().get(i7).getCount());
                    } else if (roleId == 2) {
                        ApplicationActivity.Companion companion12 = ApplicationActivity.Companion;
                        FantasyTeamListModel fantasyTeamListModel21 = this.fantasyTeamListModelUpdate;
                        Intrinsics.checkNotNull(fantasyTeamListModel21);
                        companion12.setBowlerCount(fantasyTeamListModel21.getPlayersCountArr().get(i7).getCount());
                    } else if (roleId == 3) {
                        ApplicationActivity.Companion companion13 = ApplicationActivity.Companion;
                        FantasyTeamListModel fantasyTeamListModel22 = this.fantasyTeamListModelUpdate;
                        Intrinsics.checkNotNull(fantasyTeamListModel22);
                        companion13.setWkCount(fantasyTeamListModel22.getPlayersCountArr().get(i7).getCount());
                    } else if (roleId == 4) {
                        ApplicationActivity.Companion companion14 = ApplicationActivity.Companion;
                        FantasyTeamListModel fantasyTeamListModel23 = this.fantasyTeamListModelUpdate;
                        Intrinsics.checkNotNull(fantasyTeamListModel23);
                        companion14.setAllRounderCount(fantasyTeamListModel23.getPlayersCountArr().get(i7).getCount());
                    }
                }
            } catch (Exception e) {
                Log.v("CreateTeamFrag_Update", e.toString());
            }
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.bat) + '(' + ApplicationActivity.Companion.getBatsmanCount() + ')'));
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.bowl) + '(' + ApplicationActivity.Companion.getBowlerCount() + ')'));
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.wicket_keeper) + '(' + ApplicationActivity.Companion.getWkCount() + ')'));
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.all) + '(' + ApplicationActivity.Companion.getAllRounderCount() + ')'));
        } else {
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.bat)));
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.bowl) + "(0)"));
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.wicket_keeper) + "(0)"));
            ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).addTab(((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).newTab().setText((CharSequence) getString(C1188R.string.all) + "(0)"));
            ((ViewPager) _$_findCachedViewById(C1188R.C1192id.viewPager)).setCurrentItem(ApplicationActivity.Companion.getCurrentTabPosition());
            TabLayout.Tab tabAt = ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).getTabAt(ApplicationActivity.Companion.getCurrentTabPosition());
            Intrinsics.checkNotNull(tabAt);
            tabAt.select();
        }
        setTabTitle();
        int tabCount = ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).getTabCount();
        int i8 = 0;
        while (i8 < tabCount) {
            View childAt = ((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)).getChildAt(0);
            if (childAt != null) {
                View childAt2 = ((ViewGroup) childAt).getChildAt(i8);
                Intrinsics.checkNotNullExpressionValue(childAt2, "tabLayout.getChildAt(0) … ViewGroup).getChildAt(i)");
                childAt2.requestLayout();
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                ViewCompat.setBackground(childAt2, setImageButtonStateNew(requireContext));
                ViewCompat.setPaddingRelative(childAt2, childAt2.getPaddingStart(), childAt2.getPaddingTop(), childAt2.getPaddingEnd(), childAt2.getPaddingBottom());
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                if (layoutParams != null) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(12, 0, 12, 0);
                    childAt2.requestLayout();
                    i8++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        ArrayList arrayList = new ArrayList();
        BattingFragment.FragmentPlayer fragmentPlayer = this;
        DetailViewModel detailViewModel = this.viewModel;
        BattingFragment battingFragment = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        this.fragment1 = new BattingFragment(fragmentPlayer, detailViewModel, this);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("arraylist", this.batsmanList);
        bundle.putString("title", getResources().getString(C1188R.string.select_batter_title));
        BattingFragment battingFragment2 = this.fragment1;
        if (battingFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment1");
            battingFragment2 = null;
        }
        battingFragment2.setArguments(bundle);
        BattingFragment battingFragment3 = this.fragment1;
        if (battingFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment1");
            battingFragment3 = null;
        }
        arrayList.add(battingFragment3);
        DetailViewModel detailViewModel2 = this.viewModel;
        if (detailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel2 = null;
        }
        this.fragment2 = new BattingFragment(fragmentPlayer, detailViewModel2, this);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelableArrayList("arraylist", this.bowlerList);
        bundle2.putString("title", getResources().getString(C1188R.string.select_bowler_title));
        BattingFragment battingFragment4 = this.fragment2;
        if (battingFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment2");
            battingFragment4 = null;
        }
        battingFragment4.setArguments(bundle2);
        BattingFragment battingFragment5 = this.fragment2;
        if (battingFragment5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment2");
            battingFragment5 = null;
        }
        arrayList.add(battingFragment5);
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        this.fragment3 = new BattingFragment(fragmentPlayer, detailViewModel3, this);
        Bundle bundle3 = new Bundle();
        bundle3.putParcelableArrayList("arraylist", this.wkList);
        bundle3.putString("title", getResources().getString(C1188R.string.select_wk_title));
        BattingFragment battingFragment6 = this.fragment3;
        if (battingFragment6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment3");
            battingFragment6 = null;
        }
        battingFragment6.setArguments(bundle3);
        BattingFragment battingFragment7 = this.fragment3;
        if (battingFragment7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment3");
            battingFragment7 = null;
        }
        arrayList.add(battingFragment7);
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel4 = null;
        }
        this.fragment4 = new BattingFragment(fragmentPlayer, detailViewModel4, this);
        Bundle bundle4 = new Bundle();
        bundle4.putParcelableArrayList("arraylist", this.allRounderList);
        bundle4.putString("title", getResources().getString(C1188R.string.select_all_title));
        BattingFragment battingFragment8 = this.fragment4;
        if (battingFragment8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment4");
            battingFragment8 = null;
        }
        battingFragment8.setArguments(bundle4);
        BattingFragment battingFragment9 = this.fragment4;
        if (battingFragment9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("fragment4");
        } else {
            battingFragment = battingFragment9;
        }
        arrayList.add(battingFragment);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        setHomeTabAdapter(new HomeTabAdapter(childFragmentManager, arrayList));
        ((ViewPager) _$_findCachedViewById(C1188R.C1192id.viewPager)).setAdapter(getHomeTabAdapter());
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C1188R.C1192id.viewPager);
        Intrinsics.checkNotNull(viewPager);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener((TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout)));
        ((ViewPager) _$_findCachedViewById(C1188R.C1192id.viewPager)).setOffscreenPageLimit(3);
        TabLayout tabLayout = (TabLayout) _$_findCachedViewById(C1188R.C1192id.tabLayout);
        Intrinsics.checkNotNull(tabLayout);
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new CreateTeamFragment$initPager$1(this));
    }
}
