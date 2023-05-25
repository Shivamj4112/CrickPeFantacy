package com.crickpe.view.detail.fragments.create_own_team;

import android.os.Bundle;
import android.text.Editable;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.p004os.BundleKt;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amplitude.p014id.FileIdentityStorage;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.MyContestAdapter;
import com.crickpe.view.detail.adapters.TopContestAdapter;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchFragment;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.home.adapters.MyTeamsAdapter;
import com.crickpe.view.home.fragments.home.HomeDataModel;
import com.crickpe.view.home.fragments.home.Team1;
import com.crickpe.view.home.fragments.home.Team2;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0006\u00108\u001a\u000209J\b\u0010:\u001a\u00020.H\u0016J\b\u0010;\u001a\u00020<H\u0002J\u0010\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u00020\fH\u0002J\b\u0010?\u001a\u00020<H\u0002J\u0010\u0010@\u001a\u00020<2\u0006\u0010A\u001a\u00020\fH\u0016J\b\u0010B\u001a\u00020<H\u0002J\u0010\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020EH\u0016J\u0010\u0010F\u001a\u00020<2\u0006\u0010>\u001a\u00020\fH\u0016J\u0010\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020\u0019H\u0016J\u0010\u0010H\u001a\u00020<2\u0006\u0010>\u001a\u00020\fH\u0016J\b\u0010I\u001a\u00020<H\u0016J\u0018\u0010J\u001a\u00020<2\u0006\u0010G\u001a\u00020\u00192\u0006\u0010K\u001a\u00020.H\u0016J\u001a\u0010L\u001a\u00020<2\u0006\u0010D\u001a\u00020E2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\b\u0010O\u001a\u00020<H\u0002J&\u0010P\u001a\u00020<2\u0006\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020R2\u0006\u0010U\u001a\u00020RJ\u001e\u0010V\u001a\u00020<*\u00020E2\u0006\u0010W\u001a\u00020.2\b\b\u0002\u0010X\u001a\u00020YH\u0002R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R*\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u000bj\b\u0012\u0004\u0012\u00020\u0019`\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R*\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R\u001a\u0010\u001f\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R*\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u0011R\u001c\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X.¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020.X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u000e\u00103\u001a\u00020.X\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X.¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X.¢\u0006\u0002\n\u0000¨\u0006Z"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/ContestFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/TopContestAdapter$OnItemClicked;", "Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnItemClicked;", "Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnUpdate;", "Lcom/crickpe/view/detail/adapters/MyContestAdapter$MyContestClick;", "()V", "adapterMyContest", "Lcom/crickpe/view/detail/adapters/MyContestAdapter;", "allContest", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "Lkotlin/collections/ArrayList;", "getAllContest", "()Ljava/util/ArrayList;", "setAllContest", "(Ljava/util/ArrayList;)V", "fantasyTeamId", "", "getFantasyTeamId", "()Ljava/lang/String;", "setFantasyTeamId", "(Ljava/lang/String;)V", "fantasyTeamList", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "getFantasyTeamList", "setFantasyTeamList", "filterContestList", "getFilterContestList", "setFilterContestList", "matchId", "getMatchId", "setMatchId", "myContestList", "getMyContestList", "setMyContestList", "myProfile", "Lcom/crickpe/view/intro/fragments/User;", "getMyProfile", "()Lcom/crickpe/view/intro/fragments/User;", "setMyProfile", "(Lcom/crickpe/view/intro/fragments/User;)V", "myTeamsAdapter", "Lcom/crickpe/view/home/adapters/MyTeamsAdapter;", "tabPosition", "", "getTabPosition", "()I", "setTabPosition", "(I)V", "teamSize", "topContestAdapter", "Lcom/crickpe/view/detail/adapters/TopContestAdapter;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "backHandle", "", "getFragmentLayoutResId", "handleClick", "", "joinContestFun", "topContestModel", "listener", "myContestClick", "myContestModels", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClicked", "data", "onPriceClicked", "onResume", "onTeamUpate", "action", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setTextColor", "colorTv", "Landroid/widget/TextView;", "fadeTv1", "fadeTv2", "fadeTv3", "fadeVisibility", "visibility", "duration", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestFragment.kt */
public final class ContestFragment extends BaseFragment implements View.OnClickListener, TopContestAdapter.OnItemClicked, MyTeamsAdapter.OnItemClicked, MyTeamsAdapter.OnUpdate, MyContestAdapter.MyContestClick {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private MyContestAdapter adapterMyContest;
    private ArrayList<TopContestModel> allContest = new ArrayList<>();
    private String fantasyTeamId = "";
    private ArrayList<FantasyTeamListModel> fantasyTeamList = new ArrayList<>();
    private ArrayList<TopContestModel> filterContestList = new ArrayList<>();
    private String matchId = "";
    private ArrayList<TopContestModel> myContestList = new ArrayList<>();
    private User myProfile;
    private MyTeamsAdapter myTeamsAdapter;
    private int tabPosition;
    private int teamSize;
    private TopContestAdapter topContestAdapter;
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestFragment.kt */
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
        return C1188R.C1193layout.fragment_contest;
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

    public final User getMyProfile() {
        return this.myProfile;
    }

    public final void setMyProfile(User user) {
        this.myProfile = user;
    }

    public final int getTabPosition() {
        return this.tabPosition;
    }

    public final void setTabPosition(int i) {
        this.tabPosition = i;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }

    public final void setFantasyTeamId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fantasyTeamId = str;
    }

    public final ArrayList<TopContestModel> getAllContest() {
        return this.allContest;
    }

    public final void setAllContest(ArrayList<TopContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.allContest = arrayList;
    }

    public final ArrayList<FantasyTeamListModel> getFantasyTeamList() {
        return this.fantasyTeamList;
    }

    public final void setFantasyTeamList(ArrayList<FantasyTeamListModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.fantasyTeamList = arrayList;
    }

    public final ArrayList<TopContestModel> getMyContestList() {
        return this.myContestList;
    }

    public final void setMyContestList(ArrayList<TopContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.myContestList = arrayList;
    }

    public final ArrayList<TopContestModel> getFilterContestList() {
        return this.filterContestList;
    }

    public final void setFilterContestList(ArrayList<TopContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.filterContestList = arrayList;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.myTeamsAdapter = new MyTeamsAdapter(this, this, requireActivity);
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
        this.topContestAdapter = new TopContestAdapter(this, requireActivity2);
        FragmentActivity requireActivity3 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity()");
        this.adapterMyContest = new MyContestAdapter(this, requireActivity3);
        this.allContest = new ArrayList<>();
        this.fantasyTeamList = new ArrayList<>();
        this.myContestList = new ArrayList<>();
        listener();
        observeData();
        if (UserManager.INSTANCE.getUserProfile() != null) {
            try {
                FragmentActivity requireActivity4 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity4, "requireActivity()");
                User userProfile = UserManager.INSTANCE.getUserProfile();
                String str = null;
                CommonMethodsKt.callAppsFlyer(requireActivity4, FileIdentityStorage.USER_ID_KEY, String.valueOf(userProfile != null ? userProfile.get_id() : null), Constants.EVENT_OPEN_CONTEST);
                Bundle bundle2 = new Bundle();
                User userProfile2 = UserManager.INSTANCE.getUserProfile();
                if (userProfile2 != null) {
                    str = userProfile2.get_id();
                }
                bundle2.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str));
                ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_OPEN_CONTEST, bundle2);
            } catch (Exception e) {
                Log.e("Analytics", e.toString());
            }
        }
    }

    public void myContestClick(TopContestModel topContestModel) {
        Intrinsics.checkNotNullParameter(topContestModel, "myContestModels");
        Log.v("myContestClick", new Gson().toJson((Object) topContestModel));
        try {
            if (topContestModel.getContestType().getTypeId() == 1) {
                Bundle bundle = new Bundle();
                bundle.putString("referalCode", topContestModel.getReferalCode());
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_privateContestDetailFragment, bundle);
                return;
            }
            Bundle bundle2 = new Bundle();
            String json = new Gson().toJson((Object) topContestModel);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(myContestModels)");
            bundle2.putString(PrefsManager.CONTEST_DATA, json);
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_contestDetailFragment2, bundle2);
        } catch (Exception e) {
            Log.v("Exception", e.toString());
        }
    }

    public void onPriceClicked(TopContestModel topContestModel) {
        Intrinsics.checkNotNullParameter(topContestModel, "topContestModel");
        try {
            if (!topContestModel.getCanJoinContest()) {
                String string = getResources().getString(C1188R.string.contest_already_joined);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…g.contest_already_joined)");
                showToast(string);
            } else if (UserManager.INSTANCE.getAppSettings() != null) {
                SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                Intrinsics.checkNotNull(appSettings);
                if (Intrinsics.areEqual((Object) appSettings.getOnJoiningMatchKycChecks(), (Object) "true")) {
                    User userProfile = UserManager.INSTANCE.getUserProfile();
                    Intrinsics.checkNotNull(userProfile);
                    if (userProfile.getKycStatus() != 1) {
                        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_kycFragment22);
                    } else {
                        joinContestFun(topContestModel);
                    }
                } else {
                    User userProfile2 = UserManager.INSTANCE.getUserProfile();
                    if (Intrinsics.areEqual((Object) String.valueOf(userProfile2 != null ? userProfile2.get_id() : null), (Object) Constants.PROFILE_ID)) {
                        User userProfile3 = UserManager.INSTANCE.getUserProfile();
                        Intrinsics.checkNotNull(userProfile3);
                        if (userProfile3.getKycStatus() != 1) {
                            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_kycFragment22);
                            return;
                        }
                    }
                    joinContestFun(topContestModel);
                }
            }
        } catch (Exception e) {
            Log.v("Exception", e.toString());
        }
    }

    private final void joinContestFun(TopContestModel topContestModel) {
        if (this.teamSize >= 1) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_selectTeamFragment, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("entryFee", String.valueOf(topContestModel.getEntryFee())), TuplesKt.m276to("contestId", topContestModel.get_id()), TuplesKt.m276to("contestTypeId", String.valueOf(topContestModel.getContestType().getTypeId())), TuplesKt.m276to("referCode", topContestModel.getReferalCode())));
            return;
        }
        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createTeamFragment2, BundleKt.bundleOf(TuplesKt.m276to("referCode", topContestModel.getReferalCode()), TuplesKt.m276to("contestId", topContestModel.get_id()), TuplesKt.m276to("matchId", topContestModel.getMatchId()), TuplesKt.m276to("entryFee", String.valueOf(topContestModel.getEntryFee()))));
    }

    public void onItemClicked(TopContestModel topContestModel) {
        Intrinsics.checkNotNullParameter(topContestModel, "topContestModel");
        try {
            if (topContestModel.getContestType().getTypeId() == 1) {
                Bundle bundle = new Bundle();
                bundle.putString("referalCode", topContestModel.getReferalCode());
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_privateContestDetailFragment, bundle);
                return;
            }
            Bundle bundle2 = new Bundle();
            String json = new Gson().toJson((Object) topContestModel);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(topContestModel)");
            bundle2.putString(PrefsManager.CONTEST_DATA, json);
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_contestDetailFragment2, bundle2);
        } catch (Exception e) {
            Log.v("Exception", e.toString());
        }
    }

    public void onItemClicked(FantasyTeamListModel fantasyTeamListModel) {
        Intrinsics.checkNotNullParameter(fantasyTeamListModel, "data");
        String json = new Gson().toJson((Object) fantasyTeamListModel);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(data)");
        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_myTeamsDetailFragment, BundleKt.bundleOf(TuplesKt.m276to("from", "Contest"), TuplesKt.m276to("TEAM", json)));
    }

    public void onTeamUpate(FantasyTeamListModel fantasyTeamListModel, int i) {
        Intrinsics.checkNotNullParameter(fantasyTeamListModel, "data");
        if (i == 0) {
            String json = new Gson().toJson((Object) fantasyTeamListModel);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(data)");
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createTeamFragment2, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("from", "update_team"), TuplesKt.m276to("TEAM", json)));
            return;
        }
        String json2 = new Gson().toJson((Object) fantasyTeamListModel);
        Intrinsics.checkNotNullExpressionValue(json2, "Gson().toJson(data)");
        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createTeamFragment2, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("from", "copy_team"), TuplesKt.m276to("TEAM", json2)));
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("", false, true, true, false, false, false, true);
            ApplicationActivity.Companion.setCounting(0);
            ApplicationActivity.Companion.setCredit(100.0f);
            ApplicationActivity.Companion.setBatsmanCount(0);
            ApplicationActivity.Companion.setBowlerCount(0);
            ApplicationActivity.Companion.setWkCount(0);
            ApplicationActivity.Companion.setAllRounderCount(0);
            ApplicationActivity.Companion.getSelectedPlayers().clear();
            DetailViewModel detailViewModel = null;
            ApplicationActivity.Companion.setTeam1((Team1) null);
            ApplicationActivity.Companion.setTeam2((Team2) null);
            ApplicationActivity.Companion.setTeamOneCount(0);
            ApplicationActivity.Companion.setTeamTwoCount(0);
            DetailViewModel detailViewModel2 = this.viewModel;
            if (detailViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel2;
            }
            detailViewModel.getHomeDataApi();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        String str = null;
        boolean z = true;
        switch (view.getId()) {
            case C1188R.C1192id.joinContests:
                LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.rlNoData);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "rlNoData");
                CommonMethodsKt.hide(linearLayout);
                this.tabPosition = 0;
                if (this.allContest.size() <= 0) {
                    DetailViewModel detailViewModel = this.viewModel;
                    if (detailViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        detailViewModel = null;
                    }
                    detailViewModel.getTopContest(this.matchId);
                    setAdapter();
                }
                handleClick();
                UserManager.INSTANCE.saveClick(0);
                return;
            case C1188R.C1192id.myContests:
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.rlNoData);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "rlNoData");
                CommonMethodsKt.hide(linearLayout2);
                this.tabPosition = 2;
                if (this.myContestList.size() <= 0) {
                    DetailViewModel detailViewModel2 = this.viewModel;
                    if (detailViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        detailViewModel2 = null;
                    }
                    detailViewModel2.getMyContest(this.matchId);
                    setAdapter();
                }
                handleClick();
                UserManager.INSTANCE.saveClick(2);
                ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.constraintJoinPool);
                Intrinsics.checkNotNullExpressionValue(constraintLayout, "constraintJoinPool");
                CommonMethodsKt.hide(constraintLayout);
                return;
            case C1188R.C1192id.myTeams:
                LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.rlNoData);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "rlNoData");
                CommonMethodsKt.hide(linearLayout3);
                this.tabPosition = 1;
                DetailViewModel detailViewModel3 = this.viewModel;
                if (detailViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel3 = null;
                }
                detailViewModel3.getFantasyTeamByMatchApi(this.matchId);
                setAdapter();
                handleClick();
                UserManager.INSTANCE.saveClick(1);
                ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.constraintJoinPool);
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "constraintJoinPool");
                CommonMethodsKt.hide(constraintLayout2);
                return;
            case C1188R.C1192id.rlCreateTeam:
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createTeamFragment2, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("from", Constants.EVENT_CREATE_TEAM)));
                UserManager.INSTANCE.saveClick(1);
                return;
            case C1188R.C1192id.tvAll:
                LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.rlNoData);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "rlNoData");
                CommonMethodsKt.hide(linearLayout4);
                TopContestAdapter topContestAdapter2 = this.topContestAdapter;
                if (topContestAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("topContestAdapter");
                    topContestAdapter2 = null;
                }
                topContestAdapter2.addList(true, this.allContest);
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAll);
                Intrinsics.checkNotNullExpressionValue(textView, "tvAll");
                TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvMega);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvMega");
                TextView textView3 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvFriendsPool);
                Intrinsics.checkNotNullExpressionValue(textView3, "tvFriendsPool");
                TextView textView4 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvOneOne);
                Intrinsics.checkNotNullExpressionValue(textView4, "tvOneOne");
                setTextColor(textView, textView2, textView3, textView4);
                ConstraintLayout constraintLayout3 = (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.constraintJoinPool);
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "constraintJoinPool");
                CommonMethodsKt.hide(constraintLayout3);
                return;
            case C1188R.C1192id.tvCreateContest:
                if (UserManager.INSTANCE.getAppSettings() != null) {
                    SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                    Intrinsics.checkNotNull(appSettings);
                    if (Intrinsics.areEqual((Object) appSettings.getOnJoiningMatchKycChecks(), (Object) "true")) {
                        User userProfile = UserManager.INSTANCE.getUserProfile();
                        Intrinsics.checkNotNull(userProfile);
                        if (userProfile.getKycStatus() != 1) {
                            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_kycFragment22);
                            return;
                        }
                        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createContestFragment, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("myTeamSize", Integer.valueOf(this.teamSize)), TuplesKt.m276to("fantasyTeamId", this.fantasyTeamId)));
                        UserManager.INSTANCE.saveClick(0);
                        return;
                    }
                    User userProfile2 = UserManager.INSTANCE.getUserProfile();
                    if (userProfile2 != null) {
                        str = userProfile2.get_id();
                    }
                    if (Intrinsics.areEqual((Object) String.valueOf(str), (Object) Constants.PROFILE_ID)) {
                        User userProfile3 = UserManager.INSTANCE.getUserProfile();
                        Intrinsics.checkNotNull(userProfile3);
                        if (userProfile3.getKycStatus() != 1) {
                            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_kycFragment22);
                            return;
                        }
                    }
                    FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createContestFragment, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("myTeamSize", Integer.valueOf(this.teamSize)), TuplesKt.m276to("fantasyTeamId", this.fantasyTeamId)));
                    UserManager.INSTANCE.saveClick(0);
                    return;
                }
                return;
            case C1188R.C1192id.tvCreateTeam:
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createTeamFragment2, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("from", Constants.EVENT_CREATE_TEAM)));
                UserManager.INSTANCE.saveClick(0);
                return;
            case C1188R.C1192id.tvFriendsPool:
                try {
                    LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.rlNoData);
                    Intrinsics.checkNotNullExpressionValue(linearLayout5, "rlNoData");
                    CommonMethodsKt.hide(linearLayout5);
                    this.filterContestList = new ArrayList<>();
                    int size = this.allContest.size();
                    for (int i = 0; i < size; i++) {
                        if (this.allContest.get(i).getContestType().getTypeId() == 1) {
                            this.filterContestList.add(this.allContest.get(i));
                        }
                    }
                    TopContestAdapter topContestAdapter3 = this.topContestAdapter;
                    if (topContestAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topContestAdapter");
                        topContestAdapter3 = null;
                    }
                    topContestAdapter3.addList(true, this.filterContestList);
                    TextView textView5 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvFriendsPool);
                    Intrinsics.checkNotNullExpressionValue(textView5, "tvFriendsPool");
                    TextView textView6 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvMega);
                    Intrinsics.checkNotNullExpressionValue(textView6, "tvMega");
                    TextView textView7 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAll);
                    Intrinsics.checkNotNullExpressionValue(textView7, "tvAll");
                    TextView textView8 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvOneOne);
                    Intrinsics.checkNotNullExpressionValue(textView8, "tvOneOne");
                    setTextColor(textView5, textView6, textView7, textView8);
                    ConstraintLayout constraintLayout4 = (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.constraintJoinPool);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout4, "constraintJoinPool");
                    CommonMethodsKt.visible(constraintLayout4);
                    return;
                } catch (Exception e) {
                    Log.v("TEST", e.toString());
                    return;
                }
            case C1188R.C1192id.tvJoinPool:
                Editable text = ((EditText) _$_findCachedViewById(C1188R.C1192id.etReferCode)).getText();
                Intrinsics.checkNotNullExpressionValue(text, "etReferCode.text");
                if (text.length() != 0) {
                    z = false;
                }
                if (z) {
                    String string = getResources().getString(C1188R.string.please_enter_refer_code);
                    Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st….please_enter_refer_code)");
                    showToast(string);
                    return;
                }
                DetailViewModel detailViewModel4 = this.viewModel;
                if (detailViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel4 = null;
                }
                detailViewModel4.getContestDetailApiByCode(StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etReferCode)).getText().toString()).toString());
                return;
            case C1188R.C1192id.tvMega:
                LinearLayout linearLayout6 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.rlNoData);
                Intrinsics.checkNotNullExpressionValue(linearLayout6, "rlNoData");
                CommonMethodsKt.hide(linearLayout6);
                this.filterContestList = new ArrayList<>();
                int size2 = this.allContest.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    try {
                        if (this.allContest.get(i2).getContestType().getTypeId() == 2) {
                            this.filterContestList.add(this.allContest.get(i2));
                            TopContestAdapter topContestAdapter4 = this.topContestAdapter;
                            if (topContestAdapter4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("topContestAdapter");
                                topContestAdapter4 = null;
                            }
                            topContestAdapter4.addList(true, this.filterContestList);
                        }
                    } catch (Exception e2) {
                        Log.v("TEST", e2.toString());
                    }
                }
                TextView textView9 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvMega);
                Intrinsics.checkNotNullExpressionValue(textView9, "tvMega");
                TextView textView10 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAll);
                Intrinsics.checkNotNullExpressionValue(textView10, "tvAll");
                TextView textView11 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvFriendsPool);
                Intrinsics.checkNotNullExpressionValue(textView11, "tvFriendsPool");
                TextView textView12 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvOneOne);
                Intrinsics.checkNotNullExpressionValue(textView12, "tvOneOne");
                setTextColor(textView9, textView10, textView11, textView12);
                ConstraintLayout constraintLayout5 = (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.constraintJoinPool);
                Intrinsics.checkNotNullExpressionValue(constraintLayout5, "constraintJoinPool");
                CommonMethodsKt.hide(constraintLayout5);
                return;
            case C1188R.C1192id.tvOneOne:
                try {
                    LinearLayout linearLayout7 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.rlNoData);
                    Intrinsics.checkNotNullExpressionValue(linearLayout7, "rlNoData");
                    CommonMethodsKt.hide(linearLayout7);
                    this.filterContestList = new ArrayList<>();
                    int size3 = this.allContest.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        if (this.allContest.get(i3).getContestType().getTypeId() == 3) {
                            this.filterContestList.add(this.allContest.get(i3));
                        }
                    }
                    TopContestAdapter topContestAdapter5 = this.topContestAdapter;
                    if (topContestAdapter5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topContestAdapter");
                        topContestAdapter5 = null;
                    }
                    topContestAdapter5.addList(true, this.filterContestList);
                    TextView textView13 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvOneOne);
                    Intrinsics.checkNotNullExpressionValue(textView13, "tvOneOne");
                    TextView textView14 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvMega);
                    Intrinsics.checkNotNullExpressionValue(textView14, "tvMega");
                    TextView textView15 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvFriendsPool);
                    Intrinsics.checkNotNullExpressionValue(textView15, "tvFriendsPool");
                    TextView textView16 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAll);
                    Intrinsics.checkNotNullExpressionValue(textView16, "tvAll");
                    setTextColor(textView13, textView14, textView15, textView16);
                    ConstraintLayout constraintLayout6 = (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.constraintJoinPool);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout6, "constraintJoinPool");
                    CommonMethodsKt.hide(constraintLayout6);
                    return;
                } catch (Exception e3) {
                    Log.v("Excetpion", e3.toString());
                    return;
                }
            default:
                return;
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TopContestModel>>> getTopContests = detailViewModel.getGetTopContests();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getTopContests.observe(viewLifecycleOwner, new ContestFragment$$ExternalSyntheticLambda2(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getFantasyTeam = detailViewModel3.getGetFantasyTeam();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getFantasyTeam.observe(viewLifecycleOwner2, new ContestFragment$$ExternalSyntheticLambda3(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TopContestModel>>> getMyContests = detailViewModel4.getGetMyContests();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        getMyContests.observe(viewLifecycleOwner3, new ContestFragment$$ExternalSyntheticLambda4(this));
        DetailViewModel detailViewModel5 = this.viewModel;
        if (detailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel5 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ContestDetailModel>> contestDetailModel = detailViewModel5.getContestDetailModel();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        contestDetailModel.observe(viewLifecycleOwner4, new ContestFragment$$ExternalSyntheticLambda5(this));
        DetailViewModel detailViewModel6 = this.viewModel;
        if (detailViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel6;
        }
        SingleLiveEvent<ApiResponseHandler<HomeDataModel>> getHomeDataApi = detailViewModel2.getGetHomeDataApi();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "viewLifecycleOwner");
        getHomeDataApi.observe(viewLifecycleOwner5, new ContestFragment$$ExternalSyntheticLambda6(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3520observeData$lambda0(ContestFragment contestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(contestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList<TopContestModel> arrayList = (ArrayList) apiResponseHandler.getData();
                if (((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).isRefreshing()) {
                    ((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).setRefreshing(false);
                }
                ProgressBar progressBar = (ProgressBar) contestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (arrayList != null) {
                    TopContestAdapter topContestAdapter2 = contestFragment.topContestAdapter;
                    TopContestAdapter topContestAdapter3 = null;
                    if (topContestAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topContestAdapter");
                        topContestAdapter2 = null;
                    }
                    topContestAdapter2.addList(true, arrayList);
                    TopContestAdapter topContestAdapter4 = contestFragment.topContestAdapter;
                    if (topContestAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topContestAdapter");
                    } else {
                        topContestAdapter3 = topContestAdapter4;
                    }
                    topContestAdapter3.notifyDataSetChanged();
                    contestFragment.allContest = arrayList;
                    LinearLayout linearLayout = (LinearLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.rlNoData);
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "rlNoData");
                    CommonMethodsKt.hide(linearLayout);
                }
                if (contestFragment.allContest.size() == 0 && contestFragment.tabPosition == 0) {
                    LinearLayout linearLayout2 = (LinearLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.rlNoData);
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "rlNoData");
                    CommonMethodsKt.visible(linearLayout2);
                    ((TextView) contestFragment._$_findCachedViewById(C1188R.C1192id.tvNoData)).setText(contestFragment.getString(C1188R.string.there_is_no_contest_yet));
                }
            } else if (i == 2) {
                if (((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).isRefreshing()) {
                    ((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) contestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = contestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                contestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3 && !((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).isRefreshing()) {
                ProgressBar progressBar3 = (ProgressBar) contestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3521observeData$lambda1(ContestFragment contestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(contestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                if (((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).isRefreshing()) {
                    ((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).setRefreshing(false);
                }
                ProgressBar progressBar = (ProgressBar) contestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                contestFragment.fantasyTeamList.clear();
                ArrayList<FantasyTeamListModel> arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    int size = arrayList.size();
                    contestFragment.teamSize = size;
                    if (size > 0) {
                        contestFragment.fantasyTeamList = arrayList;
                        contestFragment.fantasyTeamId = arrayList.get(0).get_id();
                        if (contestFragment.tabPosition == 1) {
                            MyTeamsAdapter myTeamsAdapter2 = contestFragment.myTeamsAdapter;
                            if (myTeamsAdapter2 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("myTeamsAdapter");
                                myTeamsAdapter2 = null;
                            }
                            myTeamsAdapter2.addList(true, arrayList);
                        }
                        LinearLayout linearLayout = (LinearLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.rlNoData);
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "rlNoData");
                        CommonMethodsKt.hide(linearLayout);
                    } else if (contestFragment.tabPosition == 1) {
                        LinearLayout linearLayout2 = (LinearLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.rlNoData);
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "rlNoData");
                        CommonMethodsKt.visible(linearLayout2);
                        ((TextView) contestFragment._$_findCachedViewById(C1188R.C1192id.tvNoData)).setText(contestFragment.getString(C1188R.string.you_have_not_created_a_team_yet));
                    }
                }
            } else if (i == 2) {
                if (((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).isRefreshing()) {
                    ((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) contestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = contestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                contestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3 && !((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).isRefreshing()) {
                ProgressBar progressBar3 = (ProgressBar) contestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3522observeData$lambda2(ContestFragment contestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(contestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                if (((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).isRefreshing()) {
                    ((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).setRefreshing(false);
                }
                contestFragment.myContestList.clear();
                ProgressBar progressBar = (ProgressBar) contestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ArrayList<TopContestModel> arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList == null) {
                    return;
                }
                if (arrayList.size() > 0) {
                    contestFragment.myContestList = arrayList;
                    LinearLayout linearLayout = (LinearLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.rlNoData);
                    Intrinsics.checkNotNullExpressionValue(linearLayout, "rlNoData");
                    CommonMethodsKt.hide(linearLayout);
                    MyContestAdapter myContestAdapter = contestFragment.adapterMyContest;
                    if (myContestAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapterMyContest");
                        myContestAdapter = null;
                    }
                    myContestAdapter.addList(true, arrayList);
                } else if (contestFragment.tabPosition == 2) {
                    LinearLayout linearLayout2 = (LinearLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.rlNoData);
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "rlNoData");
                    CommonMethodsKt.visible(linearLayout2);
                    ((TextView) contestFragment._$_findCachedViewById(C1188R.C1192id.tvNoData)).setText(contestFragment.getString(C1188R.string.you_have_not_joined_a_contest_yet));
                }
            } else if (i == 2) {
                if (((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).isRefreshing()) {
                    ((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) contestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = contestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                contestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3 && !((SwipeRefreshLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.swipeRefresh)).isRefreshing()) {
                ProgressBar progressBar3 = (ProgressBar) contestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-3  reason: not valid java name */
    public static final void m3523observeData$lambda3(ContestFragment contestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(contestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ContestDetailModel contestDetailModel = (ContestDetailModel) apiResponseHandler.getData();
                if (contestDetailModel != null) {
                    try {
                        ConstraintLayout constraintLayout = (ConstraintLayout) contestFragment._$_findCachedViewById(C1188R.C1192id.constraintJoinPool);
                        Intrinsics.checkNotNullExpressionValue(constraintLayout, "constraintJoinPool");
                        CommonMethodsKt.hide(constraintLayout);
                        ((EditText) contestFragment._$_findCachedViewById(C1188R.C1192id.etReferCode)).setText("");
                        Bundle bundle = new Bundle();
                        String json = new Gson().toJson((Object) contestDetailModel);
                        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(data)");
                        bundle.putString(PrefsManager.CONTEST_DATA, json);
                        bundle.putInt("team_size", contestFragment.teamSize);
                        bundle.putString("team_id", contestFragment.fantasyTeamId);
                        FragmentKt.findNavController(contestFragment).navigate((int) C1188R.C1192id.action_contestFragment_to_joinContestDetailFragment, bundle);
                    } catch (Exception e) {
                        Log.e("contestdetail", e.toString());
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = contestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                contestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-4  reason: not valid java name */
    public static final void m3524observeData$lambda4(ContestFragment contestFragment, ApiResponseHandler apiResponseHandler) {
        HomeDataModel homeDataModel;
        Intrinsics.checkNotNullParameter(contestFragment, "this$0");
        if (apiResponseHandler != null) {
            if (WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()] == 1 && (homeDataModel = (HomeDataModel) apiResponseHandler.getData()) != null) {
                try {
                    User userProfile = UserManager.INSTANCE.getUserProfile();
                    if (userProfile != null) {
                        userProfile.setTotalAmount((double) ((int) homeDataModel.getUserInfo().getTotalAmount()));
                    }
                    double d = 0.0d;
                    ApplicationActivity.Companion.setWalletBalance(userProfile != null ? userProfile.getTotalAmount() : 0.0d);
                    DetailActivity detailActivity = (DetailActivity) contestFragment.requireActivity();
                    if (userProfile != null) {
                        d = userProfile.getTotalAmount();
                    }
                    detailActivity.showWalletBal(d);
                } catch (Exception e) {
                    Log.v("getHomeDataApi", e.toString());
                }
            }
        }
    }

    private final void listener() {
        if (UserManager.INSTANCE.getMatchId() != null) {
            this.matchId = UserManager.INSTANCE.getMatchId();
        }
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.joinContests)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.myContests)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.myTeams)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCreateTeam)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateTeam)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateContest)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvAll)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvMega)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvFriendsPool)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvJoinPool)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvOneOne)).setOnClickListener(onClickListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etReferCode)).setOnEditorActionListener(new ContestFragment$$ExternalSyntheticLambda0(this));
        if (UserManager.INSTANCE.getUserProfile() != null) {
            this.myProfile = UserManager.INSTANCE.getUserProfile();
        }
        UserManager.INSTANCE.getClick();
        this.tabPosition = UserManager.INSTANCE.getClick();
        setAdapter();
        int i = this.tabPosition;
        DetailViewModel detailViewModel = null;
        if (i == 0) {
            this.tabPosition = 0;
            DetailViewModel detailViewModel2 = this.viewModel;
            if (detailViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel2 = null;
            }
            detailViewModel2.getFantasyTeamByMatchApi(this.matchId);
            DetailViewModel detailViewModel3 = this.viewModel;
            if (detailViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel3;
            }
            detailViewModel.getTopContest(this.matchId);
            handleClick();
        } else if (i == 1) {
            this.tabPosition = 1;
            DetailViewModel detailViewModel4 = this.viewModel;
            if (detailViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel4;
            }
            detailViewModel.getFantasyTeamByMatchApi(this.matchId);
            handleClick();
        } else if (i == 2) {
            this.tabPosition = 2;
            DetailViewModel detailViewModel5 = this.viewModel;
            if (detailViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel5;
            }
            detailViewModel.getMyContest(this.matchId);
            handleClick();
        }
        ((SwipeRefreshLayout) _$_findCachedViewById(C1188R.C1192id.swipeRefresh)).setOnRefreshListener(new ContestFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listener$lambda-5  reason: not valid java name */
    public static final boolean m3518listener$lambda5(ContestFragment contestFragment, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(contestFragment, "this$0");
        boolean z = false;
        if (i != 6) {
            return false;
        }
        Editable text = ((EditText) contestFragment._$_findCachedViewById(C1188R.C1192id.etReferCode)).getText();
        Intrinsics.checkNotNullExpressionValue(text, "etReferCode.text");
        if (text.length() == 0) {
            z = true;
        }
        if (z) {
            String string = contestFragment.getResources().getString(C1188R.string.please_enter_refer_code);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st….please_enter_refer_code)");
            contestFragment.showToast(string);
        } else {
            DetailViewModel detailViewModel = contestFragment.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getContestDetailApiByCode(StringsKt.trim((CharSequence) ((EditText) contestFragment._$_findCachedViewById(C1188R.C1192id.etReferCode)).getText().toString()).toString());
        }
        FragmentActivity requireActivity = contestFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        CommonMethodsKt.hideKeyboard(requireActivity, (EditText) contestFragment._$_findCachedViewById(C1188R.C1192id.etReferCode));
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: listener$lambda-6  reason: not valid java name */
    public static final void m3519listener$lambda6(ContestFragment contestFragment) {
        Intrinsics.checkNotNullParameter(contestFragment, "this$0");
        int i = contestFragment.tabPosition;
        DetailViewModel detailViewModel = null;
        if (i == 0) {
            DetailViewModel detailViewModel2 = contestFragment.viewModel;
            if (detailViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel2;
            }
            detailViewModel.getTopContest(contestFragment.matchId);
        } else if (i == 1) {
            DetailViewModel detailViewModel3 = contestFragment.viewModel;
            if (detailViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel3;
            }
            detailViewModel.getFantasyTeamByMatchApi(contestFragment.matchId);
        } else {
            DetailViewModel detailViewModel4 = contestFragment.viewModel;
            if (detailViewModel4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel4;
            }
            detailViewModel.getMyContest(contestFragment.matchId);
        }
    }

    public final void setTextColor(TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        Intrinsics.checkNotNullParameter(textView, "colorTv");
        Intrinsics.checkNotNullParameter(textView2, "fadeTv1");
        Intrinsics.checkNotNullParameter(textView3, "fadeTv2");
        Intrinsics.checkNotNullParameter(textView4, "fadeTv3");
        textView.setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.app_color_one));
        textView2.setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.grey_new));
        textView3.setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.grey_new));
        textView4.setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.grey_new));
    }

    static /* synthetic */ void fadeVisibility$default(ContestFragment contestFragment, View view, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = 300;
        }
        contestFragment.fadeVisibility(view, i, j);
    }

    private final void fadeVisibility(View view, int i, long j) {
        Transition fade = new Fade();
        fade.setDuration(j);
        fade.addTarget(view);
        ViewParent parent = view.getParent();
        if (parent != null) {
            TransitionManager.beginDelayedTransition((ViewGroup) parent, fade);
            view.setVisibility(i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
    }

    private final void handleClick() {
        int i = this.tabPosition;
        if (i == 0) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llCreate);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llCreate");
            CommonMethodsKt.visible(linearLayout);
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCreateTeam);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlCreateTeam");
            CommonMethodsKt.hide(relativeLayout);
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llSortBy);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llSortBy");
            CommonMethodsKt.visible(linearLayout2);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyTeams);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rvMyTeams");
            CommonMethodsKt.hide(recyclerView);
            RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyContest);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "rvMyContest");
            CommonMethodsKt.hide(recyclerView2);
            NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C1188R.C1192id.nestedScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "nestedScrollView");
            fadeVisibility$default(this, nestedScrollView, 0, 0, 2, (Object) null);
            ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivJoinContest);
            Intrinsics.checkNotNullExpressionValue(imageView, "ivJoinContest");
            CommonMethodsKt.visible(imageView);
            ImageView imageView2 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivMyteams);
            Intrinsics.checkNotNullExpressionValue(imageView2, "ivMyteams");
            CommonMethodsKt.hide(imageView2);
            ImageView imageView3 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivMyContest);
            Intrinsics.checkNotNullExpressionValue(imageView3, "ivMyContest");
            CommonMethodsKt.hide(imageView3);
            ((TextView) _$_findCachedViewById(C1188R.C1192id.joinContests)).setTextColor(getResources().getColor(C1188R.C1189color.white));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.myTeams)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.myContests)).setTextColor(ContextCompat.getColor(requireActivity(), C1188R.C1189color.grey));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlJoinContest)).setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.circle_bg_appcolor));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlMyTeams)).setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.circle_bg_grey_light));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlMyContest)).setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.circle_bg_grey_light));
        } else if (i == 1) {
            LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llCreate);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "llCreate");
            CommonMethodsKt.hide(linearLayout3);
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCreateTeam);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlCreateTeam");
            CommonMethodsKt.visible(relativeLayout2);
            LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llSortBy);
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "llSortBy");
            CommonMethodsKt.hide(linearLayout4);
            NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(C1188R.C1192id.nestedScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "nestedScrollView");
            CommonMethodsKt.hide(nestedScrollView2);
            RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyTeams);
            Intrinsics.checkNotNullExpressionValue(recyclerView3, "rvMyTeams");
            fadeVisibility$default(this, recyclerView3, 0, 0, 2, (Object) null);
            RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyContest);
            Intrinsics.checkNotNullExpressionValue(recyclerView4, "rvMyContest");
            CommonMethodsKt.hide(recyclerView4);
            ImageView imageView4 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivJoinContest);
            Intrinsics.checkNotNullExpressionValue(imageView4, "ivJoinContest");
            CommonMethodsKt.hide(imageView4);
            ImageView imageView5 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivMyteams);
            Intrinsics.checkNotNullExpressionValue(imageView5, "ivMyteams");
            CommonMethodsKt.visible(imageView5);
            ImageView imageView6 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivMyContest);
            Intrinsics.checkNotNullExpressionValue(imageView6, "ivMyContest");
            CommonMethodsKt.hide(imageView6);
            ((TextView) _$_findCachedViewById(C1188R.C1192id.joinContests)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.myTeams)).setTextColor(getResources().getColor(C1188R.C1189color.white));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.myContests)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlJoinContest)).setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.circle_bg_grey_light));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlMyTeams)).setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.circle_bg_appcolor));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlMyContest)).setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.circle_bg_grey_light));
        } else if (i == 2) {
            LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llCreate);
            Intrinsics.checkNotNullExpressionValue(linearLayout5, "llCreate");
            CommonMethodsKt.hide(linearLayout5);
            RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCreateTeam);
            Intrinsics.checkNotNullExpressionValue(relativeLayout3, "rlCreateTeam");
            CommonMethodsKt.hide(relativeLayout3);
            LinearLayout linearLayout6 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llSortBy);
            Intrinsics.checkNotNullExpressionValue(linearLayout6, "llSortBy");
            CommonMethodsKt.hide(linearLayout6);
            NestedScrollView nestedScrollView3 = (NestedScrollView) _$_findCachedViewById(C1188R.C1192id.nestedScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView3, "nestedScrollView");
            CommonMethodsKt.hide(nestedScrollView3);
            RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyTeams);
            Intrinsics.checkNotNullExpressionValue(recyclerView5, "rvMyTeams");
            CommonMethodsKt.hide(recyclerView5);
            RecyclerView recyclerView6 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyContest);
            Intrinsics.checkNotNullExpressionValue(recyclerView6, "rvMyContest");
            fadeVisibility$default(this, recyclerView6, 0, 0, 2, (Object) null);
            ImageView imageView7 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivJoinContest);
            Intrinsics.checkNotNullExpressionValue(imageView7, "ivJoinContest");
            CommonMethodsKt.hide(imageView7);
            ImageView imageView8 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivMyteams);
            Intrinsics.checkNotNullExpressionValue(imageView8, "ivMyteams");
            CommonMethodsKt.hide(imageView8);
            ImageView imageView9 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivMyContest);
            Intrinsics.checkNotNullExpressionValue(imageView9, "ivMyContest");
            CommonMethodsKt.visible(imageView9);
            ((TextView) _$_findCachedViewById(C1188R.C1192id.joinContests)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.myTeams)).setTextColor(getResources().getColor(C1188R.C1189color.grey));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.myContests)).setTextColor(getResources().getColor(C1188R.C1189color.white));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlJoinContest)).setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.circle_bg_grey_light));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlMyTeams)).setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.circle_bg_grey_light));
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlMyContest)).setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.circle_bg_appcolor));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.crickpe.view.detail.adapters.TopContestAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.crickpe.view.home.adapters.MyTeamsAdapter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.crickpe.view.detail.adapters.MyContestAdapter} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setAdapter() {
        /*
            r7 = this;
            int r0 = r7.tabPosition
            r1 = 0
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x00b2
            if (r0 == r2) goto L_0x005e
            int r0 = com.crickpe.C1188R.C1192id.rvMyContest
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.String r4 = "adapterMyContest"
            if (r0 != 0) goto L_0x0016
            goto L_0x0023
        L_0x0016:
            com.crickpe.view.detail.adapters.MyContestAdapter r5 = r7.adapterMyContest
            if (r5 != 0) goto L_0x001e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r5 = r3
        L_0x001e:
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = (androidx.recyclerview.widget.RecyclerView.Adapter) r5
            r0.setAdapter(r5)
        L_0x0023:
            int r0 = com.crickpe.C1188R.C1192id.rvMyContest
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r6 = r7.getContext()
            r5.<init>(r6, r2, r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r5
            r0.setLayoutManager(r5)
            int r0 = com.crickpe.C1188R.C1192id.rvMyContest
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            com.crickpe.view.detail.adapters.MyContestAdapter r1 = r7.adapterMyContest
            if (r1 != 0) goto L_0x0049
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r1 = r3
        L_0x0049:
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = (androidx.recyclerview.widget.RecyclerView.Adapter) r1
            r0.setAdapter(r1)
            com.crickpe.view.detail.adapters.MyContestAdapter r0 = r7.adapterMyContest
            if (r0 != 0) goto L_0x0056
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            goto L_0x0057
        L_0x0056:
            r3 = r0
        L_0x0057:
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
            r3.setStateRestorationPolicy(r0)
            goto L_0x0105
        L_0x005e:
            int r0 = com.crickpe.C1188R.C1192id.rvMyTeams
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.String r4 = "myTeamsAdapter"
            if (r0 != 0) goto L_0x006b
            goto L_0x0078
        L_0x006b:
            com.crickpe.view.home.adapters.MyTeamsAdapter r5 = r7.myTeamsAdapter
            if (r5 != 0) goto L_0x0073
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r5 = r3
        L_0x0073:
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = (androidx.recyclerview.widget.RecyclerView.Adapter) r5
            r0.setAdapter(r5)
        L_0x0078:
            int r0 = com.crickpe.C1188R.C1192id.rvMyTeams
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r6 = r7.getContext()
            r5.<init>(r6, r2, r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r5
            r0.setLayoutManager(r5)
            int r0 = com.crickpe.C1188R.C1192id.rvMyTeams
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            com.crickpe.view.home.adapters.MyTeamsAdapter r1 = r7.myTeamsAdapter
            if (r1 != 0) goto L_0x009e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r1 = r3
        L_0x009e:
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = (androidx.recyclerview.widget.RecyclerView.Adapter) r1
            r0.setAdapter(r1)
            com.crickpe.view.home.adapters.MyTeamsAdapter r0 = r7.myTeamsAdapter
            if (r0 != 0) goto L_0x00ab
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            goto L_0x00ac
        L_0x00ab:
            r3 = r0
        L_0x00ac:
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
            r3.setStateRestorationPolicy(r0)
            goto L_0x0105
        L_0x00b2:
            int r0 = com.crickpe.C1188R.C1192id.rvTopContest
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            java.lang.String r4 = "topContestAdapter"
            if (r0 != 0) goto L_0x00bf
            goto L_0x00cc
        L_0x00bf:
            com.crickpe.view.detail.adapters.TopContestAdapter r5 = r7.topContestAdapter
            if (r5 != 0) goto L_0x00c7
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r5 = r3
        L_0x00c7:
            androidx.recyclerview.widget.RecyclerView$Adapter r5 = (androidx.recyclerview.widget.RecyclerView.Adapter) r5
            r0.setAdapter(r5)
        L_0x00cc:
            int r0 = com.crickpe.C1188R.C1192id.rvTopContest
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.LinearLayoutManager r5 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r6 = r7.getContext()
            r5.<init>(r6, r2, r1)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r5 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r5
            r0.setLayoutManager(r5)
            int r0 = com.crickpe.C1188R.C1192id.rvTopContest
            android.view.View r0 = r7._$_findCachedViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            com.crickpe.view.detail.adapters.TopContestAdapter r1 = r7.topContestAdapter
            if (r1 != 0) goto L_0x00f2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            r1 = r3
        L_0x00f2:
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = (androidx.recyclerview.widget.RecyclerView.Adapter) r1
            r0.setAdapter(r1)
            com.crickpe.view.detail.adapters.TopContestAdapter r0 = r7.topContestAdapter
            if (r0 != 0) goto L_0x00ff
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            goto L_0x0100
        L_0x00ff:
            r3 = r0
        L_0x0100:
            androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY
            r3.setStateRestorationPolicy(r0)
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.create_own_team.ContestFragment.setAdapter():void");
    }

    public final boolean backHandle() {
        UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
        if (Intrinsics.areEqual((Object) match != null ? match.getFrom() : null, (Object) UpcomingMatchFragment.Companion.getTAG())) {
            FragmentKt.findNavController(this).popBackStack();
            return false;
        }
        UserManager.INSTANCE.saveClick(0);
        FragmentKt.findNavController(this).popBackStack();
        return true;
    }
}
