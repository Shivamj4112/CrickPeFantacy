package com.crickpe.view.detail.fragments.select_team;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.p004os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplitude.android.Amplitude;
import com.amplitude.android.Configuration;
import com.amplitude.android.TrackingOptions;
import com.amplitude.core.LoggerProvider;
import com.amplitude.core.ServerZone;
import com.amplitude.core.StorageProvider;
import com.amplitude.core.events.EventOptions;
import com.amplitude.core.events.IngestionMetadata;
import com.amplitude.core.events.Plan;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.CreateContestRequest;
import com.crickpe.data.JoinContestBody;
import com.crickpe.databinding.FragmentSelectTeamBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.SelectTeamAdapter;
import com.crickpe.view.detail.fragments.create_own_team.create_team.JoinContestModel;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamIdsModelItem;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamPlayers;
import com.crickpe.view.detail.fragments.select_team.model.WalletInfoModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.home.fragments.home.Team1;
import com.crickpe.view.home.fragments.home.Team2;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
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

@Metadata(mo48221d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u00106\u001a\u0002072\u0006\u0010)\u001a\u00020*H\u0002J\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u00020\u0015H\u0016J\b\u0010;\u001a\u000207H\u0002J\u0010\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u000207H\u0002J\u0010\u0010@\u001a\u0002072\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010C\u001a\u0002072\u0006\u0010D\u001a\u00020EH\u0016J\b\u0010F\u001a\u000207H\u0016J\u0010\u0010G\u001a\u0002072\u0006\u0010D\u001a\u00020EH\u0016J\u001a\u0010H\u001a\u0002072\u0006\u0010A\u001a\u00020B2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\u0010\u0010K\u001a\u0002072\u0006\u0010=\u001a\u00020EH\u0002J\b\u0010L\u001a\u000207H\u0002J\u001e\u0010M\u001a\u0002072\u0006\u0010N\u001a\u00020B2\u0006\u0010)\u001a\u00020*2\u0006\u0010O\u001a\u00020PR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R\u001e\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"X.¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0017\"\u0004\b%\u0010\u0019R\u001a\u0010&\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R.\u0010)\u001a\u0016\u0012\u0004\u0012\u00020*\u0018\u00010 j\n\u0012\u0004\u0012\u00020*\u0018\u0001`\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u000e¢\u0006\u0002\n\u0000R*\u00101\u001a\u0012\u0012\u0004\u0012\u00020\f0 j\b\u0012\u0004\u0012\u00020\f`\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010,\"\u0004\b3\u0010.R\u000e\u00104\u001a\u000205X.¢\u0006\u0002\n\u0000¨\u0006Q"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/select_team/SelectTeamFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/SelectTeamAdapter$OnItemClicked;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/SelectTeamAdapter;", "amplitude", "Lcom/amplitude/android/Amplitude;", "binding", "Lcom/crickpe/databinding/FragmentSelectTeamBinding;", "contestId", "", "getContestId", "()Ljava/lang/String;", "setContestId", "(Ljava/lang/String;)V", "contestTypeId", "getContestTypeId", "setContestTypeId", "count", "", "getCount", "()I", "setCount", "(I)V", "entryFee", "fantasyTeamId_", "from", "getFrom", "setFrom", "joniedTeamIds", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamIdsModelItem;", "Lkotlin/collections/ArrayList;", "lowAmount", "getLowAmount", "setLowAmount", "matchId", "getMatchId", "setMatchId", "players", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamPlayers;", "getPlayers", "()Ljava/util/ArrayList;", "setPlayers", "(Ljava/util/ArrayList;)V", "revenue", "", "teamsIds", "getTeamsIds", "setTeamsIds", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "addLayout", "", "backHandle", "", "getFragmentLayoutResId", "insufficientDialog", "joinContestDialog", "data", "Lcom/crickpe/view/detail/fragments/select_team/model/WalletInfoModel;", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClicked", "fa", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "onResume", "onRootClicked", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "openBottomSheet", "setAdapter", "setLayout", "layout", "layoutContainer", "Landroid/widget/LinearLayout;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SelectTeamFragment.kt */
public final class SelectTeamFragment extends BaseFragment implements View.OnClickListener, SelectTeamAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private SelectTeamAdapter adapter;
    private Amplitude amplitude;
    private FragmentSelectTeamBinding binding;
    private String contestId = "";
    private String contestTypeId = "";
    private int count;
    private String entryFee = "";
    private String fantasyTeamId_ = "";
    private String from = "";
    private ArrayList<FantasyTeamIdsModelItem> joniedTeamIds;
    private int lowAmount;
    private String matchId = "";
    private ArrayList<FantasyTeamPlayers> players;
    private double revenue;
    private ArrayList<String> teamsIds = new ArrayList<>();
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SelectTeamFragment.kt */
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
        return C1188R.C1193layout.fragment_select_team;
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

    public final String getContestId() {
        return this.contestId;
    }

    public final void setContestId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contestId = str;
    }

    public final String getContestTypeId() {
        return this.contestTypeId;
    }

    public final void setContestTypeId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contestTypeId = str;
    }

    public final String getFrom() {
        return this.from;
    }

    public final void setFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.from = str;
    }

    public final ArrayList<FantasyTeamPlayers> getPlayers() {
        return this.players;
    }

    public final void setPlayers(ArrayList<FantasyTeamPlayers> arrayList) {
        this.players = arrayList;
    }

    public final ArrayList<String> getTeamsIds() {
        return this.teamsIds;
    }

    public final void setTeamsIds(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.teamsIds = arrayList;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final int getLowAmount() {
        return this.lowAmount;
    }

    public final void setLowAmount(int i) {
        this.lowAmount = i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        SavedStateHandle savedStateHandle;
        MutableLiveData liveData;
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.binding = FragmentSelectTeamBinding.bind(view);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
        Configuration configuration = r2;
        Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
        this.amplitude = new Amplitude(configuration);
        NavBackStackEntry currentBackStackEntry = FragmentKt.findNavController(this).getCurrentBackStackEntry();
        if (!(currentBackStackEntry == null || (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) == null || (liveData = savedStateHandle.getLiveData("from")) == null)) {
            liveData.observe(getViewLifecycleOwner(), new SelectTeamFragment$$ExternalSyntheticLambda9(this));
        }
        if (UserManager.INSTANCE.getMatch() != null) {
            UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
            Intrinsics.checkNotNull(match);
            this.matchId = match.get_id();
        }
        if (getArguments() != null) {
            this.contestId = String.valueOf(requireArguments().getString("contestId"));
            this.contestTypeId = String.valueOf(requireArguments().getString("contestTypeId"));
            this.matchId = String.valueOf(requireArguments().getString("matchId"));
            this.entryFee = String.valueOf(requireArguments().getString("entryFee"));
            this.from = String.valueOf(requireArguments().getString("from"));
        }
        DetailViewModel detailViewModel = null;
        if (!Intrinsics.areEqual((Object) this.contestId, (Object) "null")) {
            DetailViewModel detailViewModel2 = this.viewModel;
            if (detailViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel2;
            }
            detailViewModel.getFantasyTeamByContestApi(this.contestId);
        } else {
            DetailViewModel detailViewModel3 = this.viewModel;
            if (detailViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel3;
            }
            detailViewModel.getFantasyTeamByMatchApi(this.matchId);
        }
        this.joniedTeamIds = new ArrayList<>();
        setAdapter();
        observeData();
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateTeamm)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvJoin)).setOnClickListener(onClickListener);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m3618onViewCreated$lambda0(SelectTeamFragment selectTeamFragment, String str) {
        Intrinsics.checkNotNullParameter(selectTeamFragment, "this$0");
        if (str != null) {
            DetailViewModel detailViewModel = null;
            if (Intrinsics.areEqual((Object) str, (Object) Constants.EVENT_JOIN_CONTEST)) {
                try {
                    JoinContestBody joinContestBody = new JoinContestBody(selectTeamFragment.contestId, selectTeamFragment.teamsIds);
                    DetailViewModel detailViewModel2 = selectTeamFragment.viewModel;
                    if (detailViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        detailViewModel = detailViewModel2;
                    }
                    detailViewModel.joinContestApi(joinContestBody);
                } catch (Exception e) {
                    Log.v("JOIN_CONTEST", e.toString());
                }
            } else if (Intrinsics.areEqual((Object) str, (Object) "create_contest")) {
                try {
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
                    CreateContestRequest createContestRequest = new CreateContestRequest(matchId2, name, totalSpots, entryFee2, noOfWinner, contestData6.isMultipleTeamAllowed(), selectTeamFragment.fantasyTeamId_);
                    DetailViewModel detailViewModel3 = selectTeamFragment.viewModel;
                    if (detailViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        detailViewModel = detailViewModel3;
                    }
                    detailViewModel.createContestApi(createContestRequest);
                } catch (Exception e2) {
                    Log.w("CREATE_CONTEST", e2.toString());
                }
            } else {
                Log.v("DATAA", str);
                selectTeamFragment.teamsIds.clear();
                ((TextView) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.tvJoin)).setAlpha(0.5f);
                ((TextView) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.tvJoin)).setEnabled(false);
            }
        } else {
            Log.v("DATAA", "null");
        }
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("", false, true, false, false, false, false, true);
            try {
                boolean z = false;
                ApplicationActivity.Companion.setCounting(0);
                ApplicationActivity.Companion.setCredit(100.0f);
                ApplicationActivity.Companion.setBatsmanCount(0);
                ApplicationActivity.Companion.setBowlerCount(0);
                ApplicationActivity.Companion.setWkCount(0);
                ApplicationActivity.Companion.setAllRounderCount(0);
                ApplicationActivity.Companion.setSelectedPlayers(new ArrayList());
                ApplicationActivity.Companion.setTeam1((Team1) null);
                ApplicationActivity.Companion.setTeam2((Team2) null);
                ApplicationActivity.Companion.setTeamOneCount(0);
                ApplicationActivity.Companion.setTeamTwoCount(0);
                if (this.fantasyTeamId_.length() > 0) {
                    z = true;
                }
                if (z) {
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvJoin)).setAlpha(1.0f);
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvJoin)).setEnabled(true);
                }
            } catch (Exception e) {
                Log.v("Selectteam", e.toString());
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamIdsModelItem>>> getFantasyTeamIds = detailViewModel.getGetFantasyTeamIds();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getFantasyTeamIds.observe(viewLifecycleOwner, new SelectTeamFragment$$ExternalSyntheticLambda3(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getFantasyTeam = detailViewModel3.getGetFantasyTeam();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getFantasyTeam.observe(viewLifecycleOwner2, new SelectTeamFragment$$ExternalSyntheticLambda4(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<JoinContestModel>> joinContest = detailViewModel4.getJoinContest();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        joinContest.observe(viewLifecycleOwner3, new SelectTeamFragment$$ExternalSyntheticLambda5(this));
        DetailViewModel detailViewModel5 = this.viewModel;
        if (detailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel5 = null;
        }
        SingleLiveEvent<ApiResponseHandler<Contest>> createContest = detailViewModel5.getCreateContest();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        createContest.observe(viewLifecycleOwner4, new SelectTeamFragment$$ExternalSyntheticLambda6(this));
        DetailViewModel detailViewModel6 = this.viewModel;
        if (detailViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel6 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamPlayers>>> fantasyTeamById = detailViewModel6.getFantasyTeamById();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "viewLifecycleOwner");
        fantasyTeamById.observe(viewLifecycleOwner5, new SelectTeamFragment$$ExternalSyntheticLambda7());
        DetailViewModel detailViewModel7 = this.viewModel;
        if (detailViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel7;
        }
        SingleLiveEvent<ApiResponseHandler<WalletInfoModel>> walletInfo = detailViewModel2.getWalletInfo();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "viewLifecycleOwner");
        walletInfo.observe(viewLifecycleOwner6, new SelectTeamFragment$$ExternalSyntheticLambda8(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3612observeData$lambda1(SelectTeamFragment selectTeamFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(selectTeamFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList<FantasyTeamIdsModelItem> arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    selectTeamFragment.joniedTeamIds = arrayList;
                    DetailViewModel detailViewModel = selectTeamFragment.viewModel;
                    if (detailViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        detailViewModel = null;
                    }
                    detailViewModel.getFantasyTeamByMatchApi(selectTeamFragment.matchId);
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = selectTeamFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                selectTeamFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3613observeData$lambda2(SelectTeamFragment selectTeamFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(selectTeamFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    ArrayList<FantasyTeamIdsModelItem> arrayList2 = selectTeamFragment.joniedTeamIds;
                    SelectTeamAdapter selectTeamAdapter = null;
                    if (arrayList2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("joniedTeamIds");
                        arrayList2 = null;
                    }
                    Log.v("JOINED_TEAMSS", String.valueOf(arrayList2.size()));
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ArrayList<FantasyTeamIdsModelItem> arrayList3 = selectTeamFragment.joniedTeamIds;
                        if (arrayList3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("joniedTeamIds");
                            arrayList3 = null;
                        }
                        int size2 = arrayList3.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            String fantasyTeamId = ((FantasyTeamListModel) arrayList.get(i2)).getFantasyTeamId();
                            ArrayList<FantasyTeamIdsModelItem> arrayList4 = selectTeamFragment.joniedTeamIds;
                            if (arrayList4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("joniedTeamIds");
                                arrayList4 = null;
                            }
                            if (Intrinsics.areEqual((Object) fantasyTeamId, (Object) arrayList4.get(i3).getFantasyTeamId())) {
                                ((FantasyTeamListModel) arrayList.get(i2)).setAlreadyJoin(true);
                                ((FantasyTeamListModel) arrayList.get(i2)).setSelected(true);
                                selectTeamFragment.count++;
                            }
                        }
                    }
                    SelectTeamAdapter selectTeamAdapter2 = selectTeamFragment.adapter;
                    if (selectTeamAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        selectTeamAdapter = selectTeamAdapter2;
                    }
                    selectTeamAdapter.addList(true, arrayList, selectTeamFragment.count, selectTeamFragment.contestTypeId);
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = selectTeamFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                selectTeamFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-3  reason: not valid java name */
    public static final void m3614observeData$lambda3(SelectTeamFragment selectTeamFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(selectTeamFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                JoinContestModel joinContestModel = (JoinContestModel) apiResponseHandler.getData();
                if (joinContestModel != null) {
                    ProgressBar progressBar = (ProgressBar) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    CommonMethodsKt.hide(progressBar);
                    Amplitude amplitude2 = null;
                    try {
                        Amplitude amplitude3 = selectTeamFragment.amplitude;
                        if (amplitude3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                            amplitude3 = null;
                        }
                        com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude3, Constants.EVENT_JOIN_CONTEST, (Map) null, (EventOptions) null, 6, (Object) null);
                        HashMap hashMap = new HashMap();
                        hashMap.put(AFInAppEventParameterName.REVENUE, String.valueOf(selectTeamFragment.revenue));
                        AppsFlyerLib.getInstance().logEvent(selectTeamFragment.requireActivity().getApplicationContext(), Constants.EVENT_JOIN_CONTEST, hashMap, new SelectTeamFragment$observeData$3$1());
                        Bundle bundle = new Bundle();
                        bundle.putString("revenue", String.valueOf(selectTeamFragment.revenue));
                        ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_JOIN_CONTEST, bundle);
                        Log.v("REVENUEE", String.valueOf(selectTeamFragment.revenue));
                    } catch (Exception e) {
                        Log.e("Analytics", e.toString());
                    }
                    String string = selectTeamFragment.getString(C1188R.string.contest_join_successfully);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.contest_join_successfully)");
                    selectTeamFragment.showToast(string);
                    FragmentKt.findNavController(selectTeamFragment).navigate((int) C1188R.C1192id.action_selectTeamFragment_to_contestFragment);
                    Amplitude amplitude4 = selectTeamFragment.amplitude;
                    if (amplitude4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                    } else {
                        amplitude2 = amplitude4;
                    }
                    com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_JOIN_CONTEST, (Map) null, (EventOptions) null, 6, (Object) null);
                    FragmentActivity requireActivity = selectTeamFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    CommonMethodsKt.callAppsFlyer(requireActivity, joinContestModel.getContestId(), "contest_id", Constants.EVENT_JOIN_CONTEST);
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                if (Intrinsics.areEqual((Object) String.valueOf(apiResponseHandler.getError()), (Object) "ApiError(message=Insufficient Balance!)")) {
                    selectTeamFragment.insufficientDialog();
                    return;
                }
                FragmentActivity requireActivity2 = selectTeamFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
                selectTeamFragment.handleApiError(requireActivity2, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-4  reason: not valid java name */
    public static final void m3615observeData$lambda4(SelectTeamFragment selectTeamFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(selectTeamFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                Contest contest = (Contest) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (contest != null) {
                    try {
                        Amplitude amplitude2 = selectTeamFragment.amplitude;
                        if (amplitude2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                            amplitude2 = null;
                        }
                        com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_JOIN_CONTEST, (Map) null, (EventOptions) null, 6, (Object) null);
                        HashMap hashMap = new HashMap();
                        hashMap.put(AFInAppEventParameterName.REVENUE, String.valueOf(contest.getEntryFee()));
                        AppsFlyerLib.getInstance().logEvent(selectTeamFragment.requireActivity().getApplicationContext(), Constants.EVENT_JOIN_CONTEST, hashMap, new SelectTeamFragment$observeData$4$1());
                        Bundle bundle = new Bundle();
                        bundle.putString("revenue", String.valueOf(contest.getEntryFee()));
                        ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_JOIN_CONTEST, bundle);
                    } catch (Exception e) {
                        Log.e("Analytics", e.toString());
                    }
                    Bundle bundle2 = new Bundle();
                    String json = new Gson().toJson((Object) contest);
                    Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(data)");
                    bundle2.putString(PrefsManager.CONTEST_DATA, json);
                    bundle2.putString("from", "create");
                    FragmentKt.findNavController(selectTeamFragment).navigate((int) C1188R.C1192id.action_selectTeamFragment_to_shareContestFragment, bundle2);
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                if (Intrinsics.areEqual((Object) String.valueOf(apiResponseHandler.getError()), (Object) "ApiError(message=Insufficient Balance!)")) {
                    selectTeamFragment.insufficientDialog();
                    return;
                }
                FragmentActivity requireActivity = selectTeamFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                selectTeamFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-5  reason: not valid java name */
    public static final void m3616observeData$lambda5(ApiResponseHandler apiResponseHandler) {
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
            } else if (i == 2) {
                Log.v("ErROR", String.valueOf(apiResponseHandler.getData()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-6  reason: not valid java name */
    public static final void m3617observeData$lambda6(SelectTeamFragment selectTeamFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(selectTeamFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                WalletInfoModel walletInfoModel = (WalletInfoModel) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (walletInfoModel != null) {
                    selectTeamFragment.joinContestDialog(walletInfoModel);
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) selectTeamFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
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
                    CommonMethodsKt.hide((TextView) findViewById2);
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
                            if (fantasyTeamPlayers.getName() != null) {
                                textView2.setText(printInitials(fantasyTeamPlayers.getName()));
                            } else {
                                textView2.setText("");
                            }
                            RequestManager with = Glide.with(requireActivity());
                            StringBuilder sb = new StringBuilder();
                            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                            Intrinsics.checkNotNull(appSettings);
                            sb.append(appSettings.getImageBaseUrl());
                            sb.append(fantasyTeamPlayers.getImageUrl());
                            with.load(sb.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into(imageView);
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
                textView.setOnClickListener(new SelectTeamFragment$$ExternalSyntheticLambda1(dialog, this));
                ((TextView) findViewById2).setOnClickListener(new SelectTeamFragment$$ExternalSyntheticLambda2(dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: insufficientDialog$lambda-7  reason: not valid java name */
    public static final void m3609insufficientDialog$lambda7(Dialog dialog, SelectTeamFragment selectTeamFragment, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(selectTeamFragment, "this$0");
        dialog.dismiss();
        Bundle bundle = new Bundle();
        bundle.putString("from", "create_contest");
        FragmentKt.findNavController(selectTeamFragment).navigate((int) C1188R.C1192id.action_selectTeamFragment_to_topUpFragment, bundle);
    }

    /* access modifiers changed from: private */
    /* renamed from: insufficientDialog$lambda-8  reason: not valid java name */
    public static final void m3610insufficientDialog$lambda8(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id == C1188R.C1192id.tvCreateTeamm) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_selectTeamFragment_to_createTeamFragment2, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("contestId", this.contestId), TuplesKt.m276to("from", this.from)));
        } else if (id == C1188R.C1192id.tvJoin) {
            DetailViewModel detailViewModel = null;
            if (Intrinsics.areEqual((Object) this.from, (Object) "create_contest")) {
                double walletBalance = ApplicationActivity.Companion.getWalletBalance();
                CreateContestRequest contestData = UserManager.INSTANCE.getContestData();
                Intrinsics.checkNotNull(contestData);
                if (walletBalance >= ((double) Integer.parseInt(contestData.getEntryFee()))) {
                    CreateContestRequest contestData2 = UserManager.INSTANCE.getContestData();
                    Intrinsics.checkNotNull(contestData2);
                    String matchId2 = contestData2.getMatchId();
                    CreateContestRequest contestData3 = UserManager.INSTANCE.getContestData();
                    Intrinsics.checkNotNull(contestData3);
                    String name = contestData3.getName();
                    CreateContestRequest contestData4 = UserManager.INSTANCE.getContestData();
                    Intrinsics.checkNotNull(contestData4);
                    String totalSpots = contestData4.getTotalSpots();
                    CreateContestRequest contestData5 = UserManager.INSTANCE.getContestData();
                    Intrinsics.checkNotNull(contestData5);
                    String entryFee2 = contestData5.getEntryFee();
                    CreateContestRequest contestData6 = UserManager.INSTANCE.getContestData();
                    Intrinsics.checkNotNull(contestData6);
                    String noOfWinner = contestData6.getNoOfWinner();
                    CreateContestRequest contestData7 = UserManager.INSTANCE.getContestData();
                    Intrinsics.checkNotNull(contestData7);
                    CreateContestRequest createContestRequest = new CreateContestRequest(matchId2, name, totalSpots, entryFee2, noOfWinner, contestData7.isMultipleTeamAllowed(), this.fantasyTeamId_);
                    DetailViewModel detailViewModel2 = this.viewModel;
                    if (detailViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        detailViewModel = detailViewModel2;
                    }
                    detailViewModel.createContestApi(createContestRequest);
                } else if (Intrinsics.areEqual((Object) this.contestId, (Object) "null")) {
                    try {
                        CreateContestRequest contestData8 = UserManager.INSTANCE.getContestData();
                        Intrinsics.checkNotNull(contestData8);
                        int parseInt = (int) (((double) Integer.parseInt(contestData8.getEntryFee())) - ApplicationActivity.Companion.getWalletBalance());
                        this.lowAmount = parseInt;
                        Log.v("tvJoinn", String.valueOf(parseInt));
                        if (this.lowAmount > 0) {
                            UserManager.INSTANCE.saveLowAmount(String.valueOf(this.lowAmount));
                        }
                    } catch (Exception e) {
                        Log.v("tvJoinn", e.toString());
                    }
                    insufficientDialog();
                } else if (this.teamsIds.size() > 0) {
                    DetailViewModel detailViewModel3 = this.viewModel;
                    if (detailViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        detailViewModel = detailViewModel3;
                    }
                    detailViewModel.getWalletinfo(this.contestId, String.valueOf(this.teamsIds.size()));
                } else {
                    showToast("Please select team");
                }
            } else if (Intrinsics.areEqual((Object) this.contestId, (Object) "null")) {
                insufficientDialog();
            } else if (this.teamsIds.size() > 0) {
                DetailViewModel detailViewModel4 = this.viewModel;
                if (detailViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel = detailViewModel4;
                }
                detailViewModel.getWalletinfo(this.contestId, String.valueOf(this.teamsIds.size()));
            } else {
                showToast("Please select team");
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new SelectTeamAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFantasyTeams);
        SelectTeamAdapter selectTeamAdapter = null;
        if (recyclerView != null) {
            SelectTeamAdapter selectTeamAdapter2 = this.adapter;
            if (selectTeamAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                selectTeamAdapter2 = null;
            }
            recyclerView.setAdapter(selectTeamAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFantasyTeams)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFantasyTeams);
        SelectTeamAdapter selectTeamAdapter3 = this.adapter;
        if (selectTeamAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            selectTeamAdapter3 = null;
        }
        recyclerView2.setAdapter(selectTeamAdapter3);
        SelectTeamAdapter selectTeamAdapter4 = this.adapter;
        if (selectTeamAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            selectTeamAdapter = selectTeamAdapter4;
        }
        selectTeamAdapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
    }

    public void onItemClicked(FantasyTeamListModel fantasyTeamListModel) {
        Intrinsics.checkNotNullParameter(fantasyTeamListModel, "fa");
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvJoin)).setAlpha(1.0f);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvJoin)).setEnabled(true);
        if (Intrinsics.areEqual((Object) this.contestTypeId, (Object) "2")) {
            this.fantasyTeamId_ = fantasyTeamListModel.get_id();
            if (fantasyTeamListModel.isSelected()) {
                this.teamsIds.add(this.fantasyTeamId_);
            } else {
                this.teamsIds.remove(this.fantasyTeamId_);
            }
        } else {
            this.teamsIds.clear();
            String str = fantasyTeamListModel.get_id();
            this.fantasyTeamId_ = str;
            this.teamsIds.add(str);
        }
        Log.v("fantasyTeamId_", new Gson().toJson((Object) this.teamsIds));
    }

    public void onRootClicked(FantasyTeamListModel fantasyTeamListModel) {
        Intrinsics.checkNotNullParameter(fantasyTeamListModel, "fa");
        openBottomSheet(fantasyTeamListModel);
    }

    private final void openBottomSheet(FantasyTeamListModel fantasyTeamListModel) {
        String str;
        String str2;
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerWk)).removeAllViews();
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBat)).removeAllViews();
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBowlers)).removeAllViews();
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerAllRound)).removeAllViews();
        this.players = fantasyTeamListModel.getPlayers();
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlGroundLayout");
        CommonMethodsKt.visible(relativeLayout);
        TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTotalPoints);
        Intrinsics.checkNotNullExpressionValue(textView, "tvTotalPoints");
        CommonMethodsKt.hide(textView);
        TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateFantacyTeam);
        Intrinsics.checkNotNullExpressionValue(textView2, "tvCreateFantacyTeam");
        CommonMethodsKt.hide(textView2);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_in_up);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_in_up)");
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout)).startAnimation(loadAnimation);
        ArrayList<FantasyTeamPlayers> arrayList = this.players;
        Intrinsics.checkNotNull(arrayList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ArrayList<FantasyTeamPlayers> arrayList2 = this.players;
            Intrinsics.checkNotNull(arrayList2);
            if (arrayList2.get(i).isFantasyCaptain()) {
                ArrayList<FantasyTeamPlayers> arrayList3 = this.players;
                Intrinsics.checkNotNull(arrayList3);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCaptainn)).setText(arrayList3.get(i).getName());
                CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivCaptain);
                Intrinsics.checkNotNullExpressionValue(circleImageView, "ivCaptain");
                ImageView imageView = circleImageView;
                ArrayList<FantasyTeamPlayers> arrayList4 = this.players;
                Intrinsics.checkNotNull(arrayList4);
                String imageUrl = arrayList4.get(i).getImageUrl();
                if (imageUrl == null) {
                    str2 = "";
                } else {
                    str2 = imageUrl;
                }
                ExtensionsKt.loadImage$default(imageView, str2, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
            }
            ArrayList<FantasyTeamPlayers> arrayList5 = this.players;
            Intrinsics.checkNotNull(arrayList5);
            if (arrayList5.get(i).isFantasyViceCaptain()) {
                ArrayList<FantasyTeamPlayers> arrayList6 = this.players;
                Intrinsics.checkNotNull(arrayList6);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvVCaptainn)).setText(arrayList6.get(i).getName());
                CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivVCaptain);
                Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivVCaptain");
                ImageView imageView2 = circleImageView2;
                ArrayList<FantasyTeamPlayers> arrayList7 = this.players;
                Intrinsics.checkNotNull(arrayList7);
                String imageUrl2 = arrayList7.get(i).getImageUrl();
                if (imageUrl2 == null) {
                    str = "";
                } else {
                    str = imageUrl2;
                }
                ExtensionsKt.loadImage$default(imageView2, str, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
            }
            ArrayList<FantasyTeamPlayers> arrayList8 = this.players;
            Intrinsics.checkNotNull(arrayList8);
            int roleId = arrayList8.get(i).getRole().getRoleId();
            if (roleId == 1) {
                ArrayList<FantasyTeamPlayers> arrayList9 = this.players;
                Intrinsics.checkNotNull(arrayList9);
                FantasyTeamPlayers fantasyTeamPlayers = arrayList9.get(i);
                Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers, "players!![i]");
                addLayout(fantasyTeamPlayers);
            } else if (roleId == 2) {
                ArrayList<FantasyTeamPlayers> arrayList10 = this.players;
                Intrinsics.checkNotNull(arrayList10);
                FantasyTeamPlayers fantasyTeamPlayers2 = arrayList10.get(i);
                Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers2, "players!![i]");
                addLayout(fantasyTeamPlayers2);
            } else if (roleId != 3) {
                ArrayList<FantasyTeamPlayers> arrayList11 = this.players;
                Intrinsics.checkNotNull(arrayList11);
                FantasyTeamPlayers fantasyTeamPlayers3 = arrayList11.get(i);
                Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers3, "players!![i]");
                addLayout(fantasyTeamPlayers3);
            } else {
                ArrayList<FantasyTeamPlayers> arrayList12 = this.players;
                Intrinsics.checkNotNull(arrayList12);
                FantasyTeamPlayers fantasyTeamPlayers4 = arrayList12.get(i);
                Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers4, "players!![i]");
                addLayout(fantasyTeamPlayers4);
            }
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
                                        this.revenue = walletInfoModel.getTotalWalletAmount();
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
                                            textView5.setOnClickListener(new SelectTeamFragment$$ExternalSyntheticLambda0(dialog3, this, walletInfoModel, intRef));
                                            dialog3.show();
                                            return;
                                        }
                                    } catch (Exception e2) {
                                        e = e2;
                                        dialog = dialog2;
                                        Log.v("joinContestDialog", e.toString());
                                        window.setLayout(-1, -2);
                                        Dialog dialog32 = dialog;
                                        textView5.setOnClickListener(new SelectTeamFragment$$ExternalSyntheticLambda0(dialog32, this, walletInfoModel, intRef));
                                        dialog32.show();
                                        return;
                                    }
                                    window.setLayout(-1, -2);
                                    Dialog dialog322 = dialog;
                                    textView5.setOnClickListener(new SelectTeamFragment$$ExternalSyntheticLambda0(dialog322, this, walletInfoModel, intRef));
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
    /* renamed from: joinContestDialog$lambda-9  reason: not valid java name */
    public static final void m3611joinContestDialog$lambda9(Dialog dialog, SelectTeamFragment selectTeamFragment, WalletInfoModel walletInfoModel, Ref.IntRef intRef, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(selectTeamFragment, "this$0");
        Intrinsics.checkNotNullParameter(walletInfoModel, "$data");
        Intrinsics.checkNotNullParameter(intRef, "$topupNeeded");
        dialog.dismiss();
        if (selectTeamFragment.fantasyTeamId_ != null) {
            JoinContestBody joinContestBody = new JoinContestBody(selectTeamFragment.contestId, selectTeamFragment.teamsIds);
            Log.v("CONTEST_JOIN", new Gson().toJson((Object) joinContestBody));
            if (walletInfoModel.getRemaingWalletBalance() < 0.0d) {
                Bundle bundle = new Bundle();
                bundle.putString("from", Constants.EVENT_JOIN_CONTEST);
                bundle.putString("topup_amount", String.valueOf(Math.abs(intRef.element)));
                FragmentKt.findNavController(selectTeamFragment).navigate((int) C1188R.C1192id.action_selectTeamFragment_to_topUpFragment, bundle);
                return;
            }
            DetailViewModel detailViewModel = selectTeamFragment.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.joinContestApi(joinContestBody);
            return;
        }
        selectTeamFragment.showToast("Fantasy team id can't be empty");
    }

    public final boolean backHandle() {
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlGroundLayout");
        if (!(relativeLayout.getVisibility() == 0)) {
            return true;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlGroundLayout");
        CommonMethodsKt.hide(relativeLayout2);
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_out_down);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_out_down)");
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlGroundLayout)).startAnimation(loadAnimation);
        return false;
    }
}
