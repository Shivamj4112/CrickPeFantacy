package com.crickpe.view.home.fragments.rewards;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
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
import com.amplitude.p014id.FileIdentityStorage;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.RewardPlayerRequest;
import com.crickpe.databinding.FragmentRewardsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.AppError;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.adapters.FlagListAdapter;
import com.crickpe.view.detail.adapters.MyRewardAdapter;
import com.crickpe.view.detail.adapters.PlayerStatsAdapter;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerRewardModel;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel;
import com.crickpe.view.home.HomeActivity;
import com.crickpe.view.home.HomeViewModel;
import com.crickpe.view.home.adapters.DialogAdapter;
import com.crickpe.view.home.adapters.PlayersDialogAdapter;
import com.crickpe.view.home.adapters.TrackRewardsAdapter;
import com.crickpe.view.home.fragments.home.HomeDataModel;
import com.crickpe.view.home.fragments.rewards.my_reward_model.MyRewardModelItem;
import com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.kyc.models.TeamCountryData;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u000201H\u0002J\b\u0010f\u001a\u00020dH\u0002J\b\u0010g\u001a\u000201H\u0016J\b\u0010h\u001a\u00020dH\u0002J\b\u0010i\u001a\u00020dH\u0002J\b\u0010j\u001a\u00020dH\u0003J\u0010\u0010k\u001a\u00020d2\u0006\u0010l\u001a\u00020mH\u0016J \u0010n\u001a\u00020d2\u0006\u0010o\u001a\u00020p2\u0006\u0010e\u001a\u0002012\u0006\u0010q\u001a\u00020 H\u0016J \u0010r\u001a\u00020d2\u0006\u0010o\u001a\u00020p2\u0006\u0010e\u001a\u0002012\u0006\u0010q\u001a\u00020\fH\u0016J\b\u0010s\u001a\u00020dH\u0002J\b\u0010t\u001a\u00020dH\u0016J\u0018\u0010A\u001a\u00020d2\u0006\u0010u\u001a\u00020v2\u0006\u0010e\u001a\u000201H\u0016J\u001a\u0010w\u001a\u00020d2\u0006\u0010l\u001a\u00020m2\b\u0010x\u001a\u0004\u0018\u00010yH\u0017J\b\u0010z\u001a\u00020dH\u0002J&\u0010{\u001a\u00020d2\b\u0010|\u001a\u0004\u0018\u00010}2\b\u0010~\u001a\u0004\u0018\u00010}2\b\u0010\u001a\u0004\u0018\u00010}H\u0002J\t\u0010\u0001\u001a\u00020dH\u0002J(\u0010\u0001\u001a\u00020d2\t\u0010\u0001\u001a\u0004\u0018\u00010}2\b\u0010|\u001a\u0004\u0018\u00010}2\b\u0010\u001a\u0004\u0018\u00010}H\u0002J\u0013\u0010\u0001\u001a\u00020d2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\"\u0010\u0001\u001a\u00020d2\u0017\u0010\u0001\u001a\u0012\u0012\u0004\u0012\u00020v0:j\b\u0012\u0004\u0012\u00020v`<H\u0002J\u0013\u0010\u0001\u001a\u00020d2\b\u0010\u0001\u001a\u00030\u0001H\u0002J\t\u0010\u0001\u001a\u00020dH\u0002J\t\u0010\u0001\u001a\u00020dH\u0002J\t\u0010\u0001\u001a\u00020dH\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001a\"\u0004\b/\u0010\u001cR\u001a\u00100\u001a\u000201X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u00020 X\u000e¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X.¢\u0006\u0002\n\u0000R*\u00109\u001a\u0012\u0012\u0004\u0012\u00020;0:j\b\u0012\u0004\u0012\u00020;`<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010A\u001a\u00020 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\"\"\u0004\bC\u0010$R\u001a\u0010D\u001a\u000201X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00103\"\u0004\bF\u00105R\u001a\u0010G\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\u000e\"\u0004\bI\u0010\u0010R\u001a\u0010J\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u000e\"\u0004\bL\u0010\u0010R\u001a\u0010M\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\u000e\"\u0004\bO\u0010\u0010R\u000e\u0010P\u001a\u00020QX.¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX.¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX.¢\u0006\u0002\n\u0000R\u001c\u0010V\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010\u0014\"\u0004\bX\u0010\u0016R\u001a\u0010Y\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010\u000e\"\u0004\b[\u0010\u0010R\u001a\u0010\\\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u000e\"\u0004\b^\u0010\u0010R\u000e\u0010_\u001a\u00020`X.¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020bX.¢\u0006\u0002\n\u0000¨\u0006\u0001"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/rewards/RewardsFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/home/adapters/DialogAdapter$OnCountryDialog;", "Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$OnItemClicked;", "Lcom/crickpe/view/home/adapters/TrackRewardsAdapter$OnItemClicked;", "()V", "amplitude", "Lcom/amplitude/android/Amplitude;", "binding", "Lcom/crickpe/databinding/FragmentRewardsBinding;", "countryId", "", "getCountryId", "()Ljava/lang/String;", "setCountryId", "(Ljava/lang/String;)V", "countryPopUp", "Landroid/app/Dialog;", "getCountryPopUp", "()Landroid/app/Dialog;", "setCountryPopUp", "(Landroid/app/Dialog;)V", "delay", "", "getDelay", "()J", "setDelay", "(J)V", "dialogAdapter", "Lcom/crickpe/view/home/adapters/DialogAdapter;", "fromDialog", "", "getFromDialog", "()Z", "setFromDialog", "(Z)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "inputFinishChecker", "Ljava/lang/Runnable;", "last_text_edit", "getLast_text_edit", "setLast_text_edit", "lowAmount", "", "getLowAmount", "()I", "setLowAmount", "(I)V", "moreData", "myRewardAdapter", "Lcom/crickpe/view/detail/adapters/MyRewardAdapter;", "myRewardlist", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/rewards/my_reward_model/MyRewardModelItem;", "Lkotlin/collections/ArrayList;", "getMyRewardlist", "()Ljava/util/ArrayList;", "setMyRewardlist", "(Ljava/util/ArrayList;)V", "onTrackerClick", "getOnTrackerClick", "setOnTrackerClick", "page", "getPage", "setPage", "playerId", "getPlayerId", "setPlayerId", "playerIdTemp", "getPlayerIdTemp", "setPlayerIdTemp", "playerName", "getPlayerName", "setPlayerName", "playerStatsAdapter", "Lcom/crickpe/view/detail/adapters/PlayerStatsAdapter;", "playerTeamFlags", "Lcom/crickpe/view/detail/adapters/FlagListAdapter;", "playersDialogAdapter", "Lcom/crickpe/view/home/adapters/PlayersDialogAdapter;", "playersPopup", "getPlayersPopup", "setPlayersPopup", "rewardAmount", "getRewardAmount", "setRewardAmount", "rewardAmountStr", "getRewardAmountStr", "setRewardAmountStr", "trackerAdapter", "Lcom/crickpe/view/home/adapters/TrackRewardsAdapter;", "viewModel", "Lcom/crickpe/view/home/HomeViewModel;", "changeColor", "", "position", "countryDialog", "getFragmentLayoutResId", "insufficientDialog", "listeners", "observeData", "onClick", "view", "Landroid/view/View;", "onCountryClick", "teamCountryData", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "from", "onItemClicked", "onRecyclerViewScrolled", "onResume", "trackerModel", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/TrackerModel;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "playerPopup", "removeBg", "withoutBg", "Landroid/widget/RelativeLayout;", "withoutBg0", "withoutBg1", "setAdapter", "setBg", "withBg", "setDialogAdapter", "rvDialog", "Landroidx/recyclerview/widget/RecyclerView;", "setPagination", "data", "setPlayersDialogAdapter", "setRewardAdapter", "successReward", "updateReward", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RewardsFragment.kt */
public final class RewardsFragment extends BaseFragment implements View.OnClickListener, DialogAdapter.OnCountryDialog, PlayersDialogAdapter.OnItemClicked, TrackRewardsAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Amplitude amplitude;
    /* access modifiers changed from: private */
    public FragmentRewardsBinding binding;
    private String countryId = "";
    private Dialog countryPopUp;
    private long delay = 1000;
    private DialogAdapter dialogAdapter;
    private boolean fromDialog;
    private Handler handler;
    /* access modifiers changed from: private */
    public final Runnable inputFinishChecker;
    private long last_text_edit;
    private int lowAmount;
    private boolean moreData;
    private MyRewardAdapter myRewardAdapter;
    private ArrayList<MyRewardModelItem> myRewardlist = new ArrayList<>();
    private boolean onTrackerClick;
    private int page = 1;
    private String playerId = "";
    private String playerIdTemp = "";
    private String playerName = "";
    private PlayerStatsAdapter playerStatsAdapter;
    private FlagListAdapter playerTeamFlags;
    private PlayersDialogAdapter playersDialogAdapter;
    private Dialog playersPopup;
    private String rewardAmount = "0";
    private String rewardAmountStr = "0";
    private TrackRewardsAdapter trackerAdapter;
    private HomeViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: RewardsFragment.kt */
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
        return C1188R.C1193layout.fragment_rewards;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public RewardsFragment() {
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        this.handler = new Handler(myLooper);
        this.inputFinishChecker = new RewardsFragment$$ExternalSyntheticLambda0(this);
    }

    public final String getRewardAmountStr() {
        return this.rewardAmountStr;
    }

    public final void setRewardAmountStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rewardAmountStr = str;
    }

    public final String getPlayerIdTemp() {
        return this.playerIdTemp;
    }

    public final void setPlayerIdTemp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.playerIdTemp = str;
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

    public final String getCountryId() {
        return this.countryId;
    }

    public final void setCountryId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.countryId = str;
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

    public final String getRewardAmount() {
        return this.rewardAmount;
    }

    public final void setRewardAmount(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.rewardAmount = str;
    }

    public final int getPage() {
        return this.page;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final boolean getOnTrackerClick() {
        return this.onTrackerClick;
    }

    public final void setOnTrackerClick(boolean z) {
        this.onTrackerClick = z;
    }

    public final ArrayList<MyRewardModelItem> getMyRewardlist() {
        return this.myRewardlist;
    }

    public final void setMyRewardlist(ArrayList<MyRewardModelItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.myRewardlist = arrayList;
    }

    public final int getLowAmount() {
        return this.lowAmount;
    }

    public final void setLowAmount(int i) {
        this.lowAmount = i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((HomeActivity) activity).resetTitleBar();
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                String string = getString(C1188R.string.rewards);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.rewards)");
                ((HomeActivity) activity2).setTitleBar(string);
                FragmentRewardsBinding bind = FragmentRewardsBinding.bind(view);
                Intrinsics.checkNotNullExpressionValue(bind, "bind(view)");
                this.binding = bind;
                this.viewModel = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
                countryDialog();
                playerPopup();
                HomeViewModel homeViewModel = this.viewModel;
                HomeViewModel homeViewModel2 = null;
                if (homeViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    homeViewModel = null;
                }
                homeViewModel.getTeamsCountryApi();
                HomeViewModel homeViewModel3 = this.viewModel;
                if (homeViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    homeViewModel3 = null;
                }
                homeViewModel3.getPlayersTracker(this.page);
                HomeViewModel homeViewModel4 = this.viewModel;
                if (homeViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    homeViewModel2 = homeViewModel4;
                }
                homeViewModel2.getMyRewards();
                observeData();
                listeners();
                setAdapter();
                setRewardAdapter();
                Context applicationContext = requireActivity().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
                Configuration configuration = r2;
                Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
                this.amplitude = new Amplitude(configuration);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.home.HomeActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.home.HomeActivity");
    }

    public void onResume() {
        super.onResume();
        HomeViewModel homeViewModel = this.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.getHomeDataApi();
    }

    private final void onRecyclerViewScrolled() {
        ((NestedScrollView) _$_findCachedViewById(C1188R.C1192id.nestedScrollView)).setOnScrollChangeListener(new RewardsFragment$$ExternalSyntheticLambda9(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: onRecyclerViewScrolled$lambda-0  reason: not valid java name */
    public static final void m3742onRecyclerViewScrolled$lambda0(RewardsFragment rewardsFragment, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        Intrinsics.checkNotNullParameter(nestedScrollView, "v");
        if (nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1) != null && i2 >= nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1).getMeasuredHeight() - nestedScrollView.getMeasuredHeight() && i2 > i4 && rewardsFragment.moreData) {
            rewardsFragment.page++;
            HomeViewModel homeViewModel = rewardsFragment.viewModel;
            if (homeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel = null;
            }
            homeViewModel.getPlayersTracker(rewardsFragment.page);
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
                textView.setOnClickListener(new RewardsFragment$$ExternalSyntheticLambda14(dialog, this));
                ((TextView) findViewById2).setOnClickListener(new RewardsFragment$$ExternalSyntheticLambda15(dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: insufficientDialog$lambda-1  reason: not valid java name */
    public static final void m3730insufficientDialog$lambda1(Dialog dialog, RewardsFragment rewardsFragment, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        dialog.dismiss();
        Intent intent = new Intent(new Intent(rewardsFragment.requireActivity(), DetailActivity.class));
        intent.putExtra("open", "topUp");
        intent.putExtra("amount", rewardsFragment.lowAmount);
        rewardsFragment.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: insufficientDialog$lambda-2  reason: not valid java name */
    public static final void m3731insufficientDialog$lambda2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        switch (view.getId()) {
            case C1188R.C1192id.llbutton:
                if (Integer.parseInt(this.rewardAmount) == 0) {
                    String string = getResources().getString(C1188R.string.please_enter_amount_to_reward);
                    Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…e_enter_amount_to_reward)");
                    showToast(string);
                    return;
                } else if (Integer.parseInt(this.rewardAmount) < 100) {
                    String string2 = getResources().getString(C1188R.string.min_invalid_amount_reward);
                    Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…in_invalid_amount_reward)");
                    showToast(string2);
                    return;
                } else if (Integer.parseInt(this.rewardAmount) > 10000) {
                    String string3 = getResources().getString(C1188R.string.max_invalid_amount_reward);
                    Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.st…ax_invalid_amount_reward)");
                    showToast(string3);
                    return;
                } else {
                    successReward();
                    return;
                }
            case C1188R.C1192id.rlCountry:
                Dialog dialog = this.countryPopUp;
                Intrinsics.checkNotNull(dialog);
                dialog.show();
                return;
            case C1188R.C1192id.rlFifty:
                setBg((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFifty), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlOneFifty));
                this.rewardAmount = "100";
                updateReward();
                return;
            case C1188R.C1192id.rlHundred:
                setBg((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFifty), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlOneFifty));
                this.rewardAmount = "250";
                updateReward();
                return;
            case C1188R.C1192id.rlOneFifty:
                setBg((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlOneFifty), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFifty));
                this.rewardAmount = "1000";
                updateReward();
                return;
            case C1188R.C1192id.rlPayReward:
                changeColor(0);
                return;
            case C1188R.C1192id.rlRewardPlayer:
                if (Intrinsics.areEqual((Object) this.countryId, (Object) "")) {
                    showToast("Please select country");
                    return;
                }
                Dialog dialog2 = this.playersPopup;
                Intrinsics.checkNotNull(dialog2);
                dialog2.show();
                return;
            case C1188R.C1192id.rlUserRewards:
                HomeViewModel homeViewModel = null;
                try {
                    if (UserManager.INSTANCE.getUserProfile() != null) {
                        FragmentActivity requireActivity = requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                        User userProfile = UserManager.INSTANCE.getUserProfile();
                        CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_REWARD_TRACKER);
                        Bundle bundle = new Bundle();
                        User userProfile2 = UserManager.INSTANCE.getUserProfile();
                        bundle.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(userProfile2 != null ? userProfile2.get_id() : null));
                        ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_REWARD_TRACKER, bundle);
                        Amplitude amplitude2 = this.amplitude;
                        if (amplitude2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                            amplitude2 = null;
                        }
                        com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_REWARD_TRACKER, (Map) null, (EventOptions) null, 6, (Object) null);
                    }
                } catch (Exception e) {
                    Log.e("Analytics", e.toString());
                }
                FragmentActivity requireActivity2 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
                CommonMethodsKt.hideKeyboard(requireActivity2, (ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.rlUserRewards));
                HomeViewModel homeViewModel2 = this.viewModel;
                if (homeViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    homeViewModel = homeViewModel2;
                }
                homeViewModel.getMyRewards();
                changeColor(1);
                return;
            case C1188R.C1192id.tvShowHistory:
                Intent intent = new Intent(new Intent(requireActivity(), DetailActivity.class));
                intent.putExtra("open", "reward_given");
                startActivity(intent);
                return;
            default:
                return;
        }
    }

    private final void updateReward() {
        FragmentRewardsBinding fragmentRewardsBinding = this.binding;
        FragmentRewardsBinding fragmentRewardsBinding2 = null;
        if (fragmentRewardsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding = null;
        }
        fragmentRewardsBinding.etRewardAmount.setText(this.rewardAmount);
        FragmentRewardsBinding fragmentRewardsBinding3 = this.binding;
        if (fragmentRewardsBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding3 = null;
        }
        EditText editText = fragmentRewardsBinding3.etRewardAmount;
        FragmentRewardsBinding fragmentRewardsBinding4 = this.binding;
        if (fragmentRewardsBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentRewardsBinding2 = fragmentRewardsBinding4;
        }
        editText.setSelection(fragmentRewardsBinding2.etRewardAmount.length());
    }

    private final void successReward() {
        Amplitude amplitude2 = this.amplitude;
        if (amplitude2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("amplitude");
            amplitude2 = null;
        }
        com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_PLAYER_REWARDED, (Map) null, (EventOptions) null, 6, (Object) null);
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        dialog.setContentView(C1188R.C1193layout.dialog_rewarding);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvYes);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvBodyText);
            if (findViewById2 != null) {
                ((TextView) findViewById2).setText("You are rewarding " + this.playerName + " from your wallet balance.");
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawableResource(17170445);
                window.setLayout(-1, -2);
                textView.setOnClickListener(new RewardsFragment$$ExternalSyntheticLambda10(this, dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: successReward$lambda-3  reason: not valid java name */
    public static final void m3744successReward$lambda3(RewardsFragment rewardsFragment, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        rewardsFragment.lowAmount = (int) (((double) Integer.parseInt(rewardsFragment.rewardAmount)) - ApplicationActivity.Companion.getWalletBalance());
        if (((double) Integer.parseInt(rewardsFragment.rewardAmount)) <= ApplicationActivity.Companion.getWalletBalance()) {
            rewardsFragment.rewardAmountStr = String.valueOf(Integer.parseInt(rewardsFragment.rewardAmount));
            RewardPlayerRequest rewardPlayerRequest = new RewardPlayerRequest(rewardsFragment.rewardAmountStr, rewardsFragment.playerId);
            if (UserManager.INSTANCE.getAppSettings() != null) {
                SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                Intrinsics.checkNotNull(appSettings);
                HomeViewModel homeViewModel = null;
                if (Intrinsics.areEqual((Object) appSettings.getOnGivingRewardKycChecks(), (Object) "true")) {
                    User userProfile = UserManager.INSTANCE.getUserProfile();
                    Intrinsics.checkNotNull(userProfile);
                    if (userProfile.getKycStatus() == 0) {
                        Intent intent = new Intent(new Intent(rewardsFragment.requireActivity(), DetailActivity.class));
                        intent.putExtra("open", "kyc");
                        rewardsFragment.startActivity(intent);
                        return;
                    }
                    HomeViewModel homeViewModel2 = rewardsFragment.viewModel;
                    if (homeViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        homeViewModel = homeViewModel2;
                    }
                    homeViewModel.rewardPlayer(rewardPlayerRequest);
                    dialog.dismiss();
                    return;
                }
                HomeViewModel homeViewModel3 = rewardsFragment.viewModel;
                if (homeViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    homeViewModel = homeViewModel3;
                }
                homeViewModel.rewardPlayer(rewardPlayerRequest);
                dialog.dismiss();
                return;
            }
            return;
        }
        dialog.dismiss();
        rewardsFragment.insufficientDialog();
    }

    private final void setBg(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3) {
        Intrinsics.checkNotNull(relativeLayout);
        relativeLayout.setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.rectangle_grey_appborder));
        Intrinsics.checkNotNull(relativeLayout2);
        relativeLayout2.setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.rectangle_grey));
        Intrinsics.checkNotNull(relativeLayout3);
        relativeLayout3.setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.rectangle_grey));
    }

    /* access modifiers changed from: private */
    public final void removeBg(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3) {
        Intrinsics.checkNotNull(relativeLayout);
        relativeLayout.setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.rectangle_grey));
        Intrinsics.checkNotNull(relativeLayout2);
        relativeLayout2.setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.rectangle_grey));
        Intrinsics.checkNotNull(relativeLayout3);
        relativeLayout3.setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.rectangle_grey));
    }

    private final void setAdapter() {
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayerStats)).setNestedScrollingEnabled(false);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.playerStatsAdapter = new PlayerStatsAdapter(requireActivity);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayerStats)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayerStats);
        PlayerStatsAdapter playerStatsAdapter2 = this.playerStatsAdapter;
        FlagListAdapter flagListAdapter = null;
        if (playerStatsAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerStatsAdapter");
            playerStatsAdapter2 = null;
        }
        recyclerView.setAdapter(playerStatsAdapter2);
        onRecyclerViewScrolled();
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyRewards)).setNestedScrollingEnabled(false);
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
        this.myRewardAdapter = new MyRewardAdapter(requireActivity2);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyRewards)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyRewards);
        MyRewardAdapter myRewardAdapter2 = this.myRewardAdapter;
        if (myRewardAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myRewardAdapter");
            myRewardAdapter2 = null;
        }
        recyclerView2.setAdapter(myRewardAdapter2);
        FragmentActivity requireActivity3 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity()");
        this.playerTeamFlags = new FlagListAdapter(requireActivity3);
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFlags);
        FlagListAdapter flagListAdapter2 = this.playerTeamFlags;
        if (flagListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerTeamFlags");
        } else {
            flagListAdapter = flagListAdapter2;
        }
        recyclerView3.setAdapter(flagListAdapter);
    }

    private final void setPagination(ArrayList<TrackerModel> arrayList) {
        boolean z = true;
        if (this.page == 1) {
            if (arrayList.isEmpty()) {
                Log.v("MORE_DATA", "NO");
            } else {
                Log.v("MORE_DATA", "YES");
            }
        }
        boolean z2 = this.page == 1;
        TrackRewardsAdapter trackRewardsAdapter = this.trackerAdapter;
        if (trackRewardsAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackerAdapter");
            trackRewardsAdapter = null;
        }
        trackRewardsAdapter.addList(z2, arrayList);
        if (arrayList.size() < 10) {
            z = false;
        }
        this.moreData = z;
    }

    private final void changeColor(int i) {
        if (i == 0) {
            ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.rlPayReward)).setBackgroundResource(C1188R.C1190drawable.rectangle_xxxxx);
            ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.rlUserRewards)).setBackgroundResource(0);
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPayReward)).setTextColor(AppCompatResources.getColorStateList(requireActivity(), C1188R.C1189color.app_color_one));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvUserRewards)).setTextColor(AppCompatResources.getColorStateList(requireActivity(), C1188R.C1189color.white));
            NestedScrollView nestedScrollView = (NestedScrollView) _$_findCachedViewById(C1188R.C1192id.nestedScrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView, "nestedScrollView");
            CommonMethodsKt.hide(nestedScrollView);
            NestedScrollView nestedScrollView2 = (NestedScrollView) _$_findCachedViewById(C1188R.C1192id.scrollView);
            Intrinsics.checkNotNullExpressionValue(nestedScrollView2, "scrollView");
            CommonMethodsKt.visible(nestedScrollView2);
            return;
        }
        ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.rlUserRewards)).setBackgroundResource(C1188R.C1190drawable.rectangle_xxxxx);
        ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.rlPayReward)).setBackgroundResource(0);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvUserRewards)).setTextColor(AppCompatResources.getColorStateList(requireActivity(), C1188R.C1189color.app_color_one));
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPayReward)).setTextColor(AppCompatResources.getColorStateList(requireActivity(), C1188R.C1189color.white));
        if (this.myRewardlist.size() > 0) {
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlTopMyRewards);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlTopMyRewards");
            CommonMethodsKt.visible(relativeLayout);
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlUserReward);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlUserReward");
            CommonMethodsKt.visible(relativeLayout2);
        }
        NestedScrollView nestedScrollView3 = (NestedScrollView) _$_findCachedViewById(C1188R.C1192id.nestedScrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView3, "nestedScrollView");
        CommonMethodsKt.visible(nestedScrollView3);
        NestedScrollView nestedScrollView4 = (NestedScrollView) _$_findCachedViewById(C1188R.C1192id.scrollView);
        Intrinsics.checkNotNullExpressionValue(nestedScrollView4, "scrollView");
        CommonMethodsKt.hide(nestedScrollView4);
    }

    public final long getDelay() {
        return this.delay;
    }

    public final void setDelay(long j) {
        this.delay = j;
    }

    public final long getLast_text_edit() {
        return this.last_text_edit;
    }

    public final void setLast_text_edit(long j) {
        this.last_text_edit = j;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final void setHandler(Handler handler2) {
        Intrinsics.checkNotNullParameter(handler2, "<set-?>");
        this.handler = handler2;
    }

    /* access modifiers changed from: private */
    /* renamed from: inputFinishChecker$lambda-4  reason: not valid java name */
    public static final void m3729inputFinishChecker$lambda4(RewardsFragment rewardsFragment) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        if (System.currentTimeMillis() <= (rewardsFragment.last_text_edit + rewardsFragment.delay) - ((long) 500)) {
            return;
        }
        if (Intrinsics.areEqual((Object) rewardsFragment.rewardAmount, (Object) "1000")) {
            rewardsFragment.setBg((RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlOneFifty), (RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlFifty));
        } else if (Intrinsics.areEqual((Object) rewardsFragment.rewardAmount, (Object) "250")) {
            rewardsFragment.setBg((RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlFifty), (RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlOneFifty));
        } else if (Intrinsics.areEqual((Object) rewardsFragment.rewardAmount, (Object) "100")) {
            rewardsFragment.setBg((RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlFifty), (RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlOneFifty));
        } else {
            rewardsFragment.removeBg((RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlOneFifty), (RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.rlFifty));
        }
    }

    private final void listeners() {
        View.OnClickListener onClickListener = this;
        ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.rlPayReward)).setOnClickListener(onClickListener);
        ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.rlUserRewards)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCountry)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlRewardPlayer)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvShowHistory)).setOnClickListener(onClickListener);
        FragmentRewardsBinding fragmentRewardsBinding = this.binding;
        FragmentRewardsBinding fragmentRewardsBinding2 = null;
        if (fragmentRewardsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding = null;
        }
        fragmentRewardsBinding.rlFifty.setOnClickListener(onClickListener);
        FragmentRewardsBinding fragmentRewardsBinding3 = this.binding;
        if (fragmentRewardsBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding3 = null;
        }
        fragmentRewardsBinding3.rlHundred.setOnClickListener(onClickListener);
        FragmentRewardsBinding fragmentRewardsBinding4 = this.binding;
        if (fragmentRewardsBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding4 = null;
        }
        fragmentRewardsBinding4.rlOneFifty.setOnClickListener(onClickListener);
        FragmentRewardsBinding fragmentRewardsBinding5 = this.binding;
        if (fragmentRewardsBinding5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding5 = null;
        }
        fragmentRewardsBinding5.llbutton.setOnClickListener(onClickListener);
        FragmentRewardsBinding fragmentRewardsBinding6 = this.binding;
        if (fragmentRewardsBinding6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding6 = null;
        }
        fragmentRewardsBinding6.swipeData.setOnRefreshListener(new RewardsFragment$$ExternalSyntheticLambda11(this));
        FragmentRewardsBinding fragmentRewardsBinding7 = this.binding;
        if (fragmentRewardsBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding7 = null;
        }
        fragmentRewardsBinding7.etRewardAmount.setOnEditorActionListener(new RewardsFragment$$ExternalSyntheticLambda12(this));
        FragmentRewardsBinding fragmentRewardsBinding8 = this.binding;
        if (fragmentRewardsBinding8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding8 = null;
        }
        fragmentRewardsBinding8.etRewardAmount.addTextChangedListener(new RewardsFragment$listeners$3(this));
        FragmentRewardsBinding fragmentRewardsBinding9 = this.binding;
        if (fragmentRewardsBinding9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            fragmentRewardsBinding2 = fragmentRewardsBinding9;
        }
        fragmentRewardsBinding2.etRewardAmount.setOnEditorActionListener(new RewardsFragment$$ExternalSyntheticLambda13(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-5  reason: not valid java name */
    public static final void m3732listeners$lambda5(RewardsFragment rewardsFragment) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        FragmentRewardsBinding fragmentRewardsBinding = rewardsFragment.binding;
        HomeViewModel homeViewModel = null;
        if (fragmentRewardsBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            fragmentRewardsBinding = null;
        }
        fragmentRewardsBinding.swipeData.setRefreshing(true);
        HomeViewModel homeViewModel2 = rewardsFragment.viewModel;
        if (homeViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel2 = null;
        }
        homeViewModel2.getPlayersTracker(rewardsFragment.page);
        HomeViewModel homeViewModel3 = rewardsFragment.viewModel;
        if (homeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            homeViewModel = homeViewModel3;
        }
        homeViewModel.getMyRewards();
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-6  reason: not valid java name */
    public static final boolean m3733listeners$lambda6(RewardsFragment rewardsFragment, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        if (i != 6) {
            return false;
        }
        if (Integer.parseInt(rewardsFragment.rewardAmount) == 0) {
            String string = rewardsFragment.getResources().getString(C1188R.string.please_enter_amount_to_reward);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…e_enter_amount_to_reward)");
            rewardsFragment.showToast(string);
            return true;
        } else if (Integer.parseInt(rewardsFragment.rewardAmount) < 100) {
            String string2 = rewardsFragment.getResources().getString(C1188R.string.min_invalid_amount_reward);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…in_invalid_amount_reward)");
            rewardsFragment.showToast(string2);
            return true;
        } else if (Integer.parseInt(rewardsFragment.rewardAmount) > 10000) {
            String string3 = rewardsFragment.getResources().getString(C1188R.string.max_invalid_amount_reward);
            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.st…ax_invalid_amount_reward)");
            rewardsFragment.showToast(string3);
            return true;
        } else {
            rewardsFragment.successReward();
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-7  reason: not valid java name */
    public static final boolean m3734listeners$lambda7(RewardsFragment rewardsFragment, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        if (i != 6) {
            return false;
        }
        Context requireContext = rewardsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        CommonMethodsKt.hideKeyboard(requireContext, (EditText) rewardsFragment._$_findCachedViewById(C1188R.C1192id.etRewardAmount));
        return true;
    }

    private final void setRewardAdapter() {
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvUserRewards)).setNestedScrollingEnabled(false);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.trackerAdapter = new TrackRewardsAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvUserRewards);
        TrackRewardsAdapter trackRewardsAdapter = null;
        if (recyclerView != null) {
            TrackRewardsAdapter trackRewardsAdapter2 = this.trackerAdapter;
            if (trackRewardsAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("trackerAdapter");
                trackRewardsAdapter2 = null;
            }
            recyclerView.setAdapter(trackRewardsAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvUserRewards)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvUserRewards);
        TrackRewardsAdapter trackRewardsAdapter3 = this.trackerAdapter;
        if (trackRewardsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("trackerAdapter");
        } else {
            trackRewardsAdapter = trackRewardsAdapter3;
        }
        recyclerView2.setAdapter(trackRewardsAdapter);
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
        View findViewById = dialog4.findViewById(C1188R.C1192id.tvTitle);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            Dialog dialog5 = this.countryPopUp;
            Intrinsics.checkNotNull(dialog5);
            View findViewById2 = dialog5.findViewById(C1188R.C1192id.tvSelect);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                Dialog dialog6 = this.countryPopUp;
                Intrinsics.checkNotNull(dialog6);
                View findViewById3 = dialog6.findViewById(C1188R.C1192id.rvDialog);
                if (findViewById3 != null) {
                    RecyclerView recyclerView = (RecyclerView) findViewById3;
                    Dialog dialog7 = this.countryPopUp;
                    Intrinsics.checkNotNull(dialog7);
                    View findViewById4 = dialog7.findViewById(C1188R.C1192id.ivCloseCountry);
                    if (findViewById4 != null) {
                        ImageView imageView = (ImageView) findViewById4;
                        imageView.setOnClickListener(this);
                        Dialog dialog8 = this.countryPopUp;
                        Intrinsics.checkNotNull(dialog8);
                        Window window = dialog8.getWindow();
                        Intrinsics.checkNotNull(window);
                        window.setBackgroundDrawableResource(17170445);
                        textView.setText("Select Country");
                        window.setLayout(-1, -1);
                        setDialogAdapter(recyclerView);
                        imageView.setOnClickListener(new RewardsFragment$$ExternalSyntheticLambda7(this));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: countryDialog$lambda-8  reason: not valid java name */
    public static final void m3728countryDialog$lambda8(RewardsFragment rewardsFragment, View view) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        Dialog dialog = rewardsFragment.countryPopUp;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
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
        View findViewById = dialog4.findViewById(C1188R.C1192id.tvTitle);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            Dialog dialog5 = this.playersPopup;
            Intrinsics.checkNotNull(dialog5);
            View findViewById2 = dialog5.findViewById(C1188R.C1192id.tvSelect);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                Dialog dialog6 = this.playersPopup;
                Intrinsics.checkNotNull(dialog6);
                View findViewById3 = dialog6.findViewById(C1188R.C1192id.rvDialog);
                if (findViewById3 != null) {
                    RecyclerView recyclerView = (RecyclerView) findViewById3;
                    Dialog dialog7 = this.playersPopup;
                    Intrinsics.checkNotNull(dialog7);
                    View findViewById4 = dialog7.findViewById(C1188R.C1192id.ivCloseCountry);
                    if (findViewById4 != null) {
                        Dialog dialog8 = this.playersPopup;
                        Intrinsics.checkNotNull(dialog8);
                        Window window = dialog8.getWindow();
                        Intrinsics.checkNotNull(window);
                        window.setBackgroundDrawableResource(17170445);
                        textView.setText("Select Player");
                        window.setLayout(-1, -1);
                        setPlayersDialogAdapter(recyclerView);
                        ((ImageView) findViewById4).setOnClickListener(new RewardsFragment$$ExternalSyntheticLambda8(this));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: playerPopup$lambda-9  reason: not valid java name */
    public static final void m3743playerPopup$lambda9(RewardsFragment rewardsFragment, View view) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        Dialog dialog = rewardsFragment.playersPopup;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
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

    private final void observeData() {
        HomeViewModel homeViewModel = this.viewModel;
        HomeViewModel homeViewModel2 = null;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getCountryData = homeViewModel.getGetCountryData();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getCountryData.observe(viewLifecycleOwner, new RewardsFragment$$ExternalSyntheticLambda16(this));
        HomeViewModel homeViewModel3 = this.viewModel;
        if (homeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getPlayerData = homeViewModel3.getGetPlayerData();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getPlayerData.observe(viewLifecycleOwner2, new RewardsFragment$$ExternalSyntheticLambda1(this));
        HomeViewModel homeViewModel4 = this.viewModel;
        if (homeViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<PlayerStatsModel>> playerStats = homeViewModel4.getPlayerStats();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        playerStats.observe(viewLifecycleOwner3, new RewardsFragment$$ExternalSyntheticLambda2(this));
        HomeViewModel homeViewModel5 = this.viewModel;
        if (homeViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel5 = null;
        }
        SingleLiveEvent<ApiResponseHandler<PlayerRewardModel>> playerReward = homeViewModel5.getPlayerReward();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        playerReward.observe(viewLifecycleOwner4, new RewardsFragment$$ExternalSyntheticLambda3(this));
        HomeViewModel homeViewModel6 = this.viewModel;
        if (homeViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel6 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<MyRewardModelItem>>> getMyReward = homeViewModel6.getGetMyReward();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "viewLifecycleOwner");
        getMyReward.observe(viewLifecycleOwner5, new RewardsFragment$$ExternalSyntheticLambda4(this));
        HomeViewModel homeViewModel7 = this.viewModel;
        if (homeViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel7 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TrackerModel>>> getPlayerTracker = homeViewModel7.getGetPlayerTracker();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "viewLifecycleOwner");
        getPlayerTracker.observe(viewLifecycleOwner6, new RewardsFragment$$ExternalSyntheticLambda5(this));
        HomeViewModel homeViewModel8 = this.viewModel;
        if (homeViewModel8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            homeViewModel2 = homeViewModel8;
        }
        SingleLiveEvent<ApiResponseHandler<HomeDataModel>> getHomeDataApi = homeViewModel2.getGetHomeDataApi();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "viewLifecycleOwner");
        getHomeDataApi.observe(viewLifecycleOwner7, new RewardsFragment$$ExternalSyntheticLambda6(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-10  reason: not valid java name */
    public static final void m3735observeData$lambda10(RewardsFragment rewardsFragment, ApiResponseHandler apiResponseHandler) {
        RewardsFragment rewardsFragment2 = rewardsFragment;
        ApiResponseHandler apiResponseHandler2 = apiResponseHandler;
        Intrinsics.checkNotNullParameter(rewardsFragment2, "this$0");
        if (apiResponseHandler2 != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                FragmentRewardsBinding fragmentRewardsBinding = rewardsFragment2.binding;
                HomeViewModel homeViewModel = null;
                if (fragmentRewardsBinding == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentRewardsBinding = null;
                }
                fragmentRewardsBinding.swipeData.setRefreshing(false);
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    Log.v("DATATAAT", new Gson().toJson((Object) arrayList));
                    try {
                        DialogAdapter dialogAdapter2 = rewardsFragment2.dialogAdapter;
                        if (dialogAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
                            dialogAdapter2 = null;
                        }
                        dialogAdapter2.addList(true, arrayList);
                        if (!arrayList.isEmpty()) {
                            if (ApplicationActivity.Companion.getSelectedTeam() == null || rewardsFragment2.fromDialog) {
                                Object obj = arrayList.get(0);
                                Intrinsics.checkNotNullExpressionValue(obj, "data[0]");
                                DefaultImpls.onCountryClick$default(rewardsFragment2, (TeamCountryData) obj, -1, false, 4, (Object) null);
                            } else {
                                TeamCountryData selectedTeam = ApplicationActivity.Companion.getSelectedTeam();
                                Intrinsics.checkNotNull(selectedTeam);
                                DefaultImpls.onCountryClick$default(rewardsFragment2, selectedTeam, 0, false, 4, (Object) null);
                            }
                            if (!Intrinsics.areEqual((Object) rewardsFragment2.countryId, (Object) "")) {
                                HomeViewModel homeViewModel2 = rewardsFragment2.viewModel;
                                if (homeViewModel2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                } else {
                                    homeViewModel = homeViewModel2;
                                }
                                homeViewModel.getPlayersByTeamId(rewardsFragment2.countryId);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = rewardsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                rewardsFragment2.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler2));
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.crickpe.view.home.adapters.PlayersDialogAdapter} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [com.crickpe.databinding.FragmentRewardsBinding] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: observeData$lambda-11  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3736observeData$lambda11(RewardsFragment r5, ApiResponseHandler r6) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            if (r6 != 0) goto L_0x0008
            return
        L_0x0008:
            com.crickpe.utils.apiHandling.Status r0 = r6.getStatus()
            int[] r1 = com.crickpe.view.home.fragments.rewards.RewardsFragment.WhenMappings.$EnumSwitchMapping$0
            int r0 = r0.ordinal()
            r0 = r1[r0]
            java.lang.String r1 = "binding"
            r2 = 0
            r3 = 1
            r4 = 0
            if (r0 == r3) goto L_0x004f
            r3 = 2
            if (r0 == r3) goto L_0x0020
            goto L_0x00b4
        L_0x0020:
            com.crickpe.databinding.FragmentRewardsBinding r0 = r5.binding
            if (r0 != 0) goto L_0x0028
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x0029
        L_0x0028:
            r2 = r0
        L_0x0029:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r2.swipeData
            r0.setRefreshing(r4)
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
            goto L_0x00b4
        L_0x004f:
            java.lang.Object r6 = r6.getData()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            com.crickpe.databinding.FragmentRewardsBinding r0 = r5.binding
            if (r0 != 0) goto L_0x005d
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            r0 = r2
        L_0x005d:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r0.swipeData
            r0.setRefreshing(r4)
            if (r6 == 0) goto L_0x00b4
            com.crickpe.view.home.adapters.PlayersDialogAdapter r0 = r5.playersDialogAdapter     // Catch:{ Exception -> 0x00a7 }
            if (r0 != 0) goto L_0x006e
            java.lang.String r0 = "playersDialogAdapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x006f
        L_0x006e:
            r2 = r0
        L_0x006f:
            r2.addList(r3, r6)     // Catch:{ Exception -> 0x00a7 }
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x00a7 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x00a7 }
            r0 = r0 ^ r3
            if (r0 == 0) goto L_0x00b4
            com.crickpe.view.ApplicationActivity$Companion r0 = com.crickpe.view.ApplicationActivity.Companion     // Catch:{ Exception -> 0x00a7 }
            com.crickpe.view.intro.fragments.kyc.models.TeamCountryData r0 = r0.getSelectedRandomPlayer()     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0097
            boolean r0 = r5.fromDialog     // Catch:{ Exception -> 0x00a7 }
            if (r0 != 0) goto L_0x0097
            com.crickpe.view.ApplicationActivity$Companion r6 = com.crickpe.view.ApplicationActivity.Companion     // Catch:{ Exception -> 0x00a7 }
            com.crickpe.view.intro.fragments.kyc.models.TeamCountryData r6 = r6.getSelectedRandomPlayer()     // Catch:{ Exception -> 0x00a7 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch:{ Exception -> 0x00a7 }
            r5.onItemClicked(r6, r4, r1)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00b4
        L_0x0097:
            java.lang.Object r6 = r6.get(r4)     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r0 = "data[0]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)     // Catch:{ Exception -> 0x00a7 }
            com.crickpe.view.intro.fragments.kyc.models.TeamCountryData r6 = (com.crickpe.view.intro.fragments.kyc.models.TeamCountryData) r6     // Catch:{ Exception -> 0x00a7 }
            r0 = -1
            r5.onItemClicked(r6, r0, r1)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x00b4
        L_0x00a7:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            java.lang.String r6 = "APIIICREER"
            android.util.Log.v(r6, r5)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.home.fragments.rewards.RewardsFragment.m3736observeData$lambda11(com.crickpe.view.home.fragments.rewards.RewardsFragment, com.crickpe.utils.apiHandling.ApiResponseHandler):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.crickpe.view.detail.adapters.FlagListAdapter} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3, types: [com.crickpe.databinding.FragmentRewardsBinding] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: observeData$lambda-12  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3737observeData$lambda12(RewardsFragment r19, ApiResponseHandler r20) {
        /*
            r1 = r19
            r0 = r20
            java.lang.String r2 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            if (r0 != 0) goto L_0x000c
            return
        L_0x000c:
            com.crickpe.utils.apiHandling.Status r2 = r20.getStatus()
            int[] r3 = com.crickpe.view.home.fragments.rewards.RewardsFragment.WhenMappings.$EnumSwitchMapping$0
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            r4 = 0
            java.lang.String r5 = "binding"
            r6 = 0
            if (r2 == r3) goto L_0x0054
            r3 = 2
            if (r2 == r3) goto L_0x0024
            goto L_0x02dd
        L_0x0024:
            com.crickpe.databinding.FragmentRewardsBinding r2 = r1.binding
            if (r2 != 0) goto L_0x002c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            goto L_0x002d
        L_0x002c:
            r6 = r2
        L_0x002d:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r6.swipeData
            r2.setRefreshing(r4)
            androidx.fragment.app.FragmentActivity r2 = r19.requireActivity()
            java.lang.String r3 = "requireActivity()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            android.app.Activity r2 = (android.app.Activity) r2
            com.crickpe.utils.apiHandling.AppError r3 = r20.getError()
            r1.handleApiError(r2, r3)
            com.google.gson.Gson r1 = new com.google.gson.Gson
            r1.<init>()
            java.lang.String r0 = r1.toJson((java.lang.Object) r0)
            java.lang.String r1 = "ERROR"
            android.util.Log.v(r1, r0)
            goto L_0x02dd
        L_0x0054:
            com.crickpe.databinding.FragmentRewardsBinding r2 = r1.binding
            if (r2 != 0) goto L_0x005c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r2 = r6
        L_0x005c:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r2 = r2.swipeData
            r2.setRefreshing(r4)
            java.lang.Object r0 = r20.getData()
            r2 = r0
            com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel r2 = (com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel) r2
            if (r2 == 0) goto L_0x02dd
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x0072
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x0072:
            r0.setModel(r2)     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Player r0 = r2.getPlayer()     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.FantasyPoints r0 = r0.getFantasyPoint()     // Catch:{ Exception -> 0x02d3 }
            if (r0 == 0) goto L_0x00b2
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x0087
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x0087:
            android.widget.TextView r0 = r0.tvLifetimeEarnings     // Catch:{ Exception -> 0x02d3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d3 }
            r7.<init>()     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r8 = "LIFETIME EARNINGS ("
            r7.append(r8)     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Player r8 = r2.getPlayer()     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.FantasyPoints r8 = r8.getFantasyPoint()     // Catch:{ Exception -> 0x02d3 }
            float r8 = r8.getTotalFantasyPoints()     // Catch:{ Exception -> 0x02d3 }
            int r8 = (int) r8     // Catch:{ Exception -> 0x02d3 }
            r7.append(r8)     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r8 = " POINTS)"
            r7.append(r8)     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x02d3 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x02d3 }
            r0.setText(r7)     // Catch:{ Exception -> 0x02d3 }
            goto L_0x00c3
        L_0x00b2:
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x00ba
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x00ba:
            android.widget.TextView r0 = r0.tvLifetimeEarnings     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r7 = "LIFETIME EARNINGS (0 POINTS)"
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x02d3 }
            r0.setText(r7)     // Catch:{ Exception -> 0x02d3 }
        L_0x00c3:
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x00cb
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x00cb:
            android.widget.TextView r0 = r0.tvRewardPlayer     // Catch:{ Exception -> 0x02d3 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x02d3 }
            r7.<init>()     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r8 = "to "
            r7.append(r8)     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r8 = r1.playerName     // Catch:{ Exception -> 0x02d3 }
            r7.append(r8)     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x02d3 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x02d3 }
            r0.setText(r7)     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.view.detail.adapters.PlayerStatsAdapter r0 = r1.playerStatsAdapter     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r7 = "playerStatsAdapter"
            if (r0 != 0) goto L_0x00ef
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x00ef:
            java.util.ArrayList r0 = r0.getBatterScoreList()     // Catch:{ Exception -> 0x02d3 }
            r0.clear()     // Catch:{ Exception -> 0x02d3 }
            java.util.ArrayList r0 = r2.getPlayerStats()     // Catch:{ Exception -> 0x02d3 }
            java.lang.String r8 = "binding.linearLayout16"
            java.lang.String r9 = "binding.textView21"
            java.lang.String r10 = "binding.rlPlayerStat"
            java.lang.String r11 = "binding.rlNoData"
            if (r0 == 0) goto L_0x0274
            java.util.ArrayList r0 = r2.getPlayerStats()     // Catch:{ Exception -> 0x02d3 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x02d3 }
            if (r0 <= 0) goto L_0x022b
            com.crickpe.view.detail.adapters.PlayerStatsAdapter r0 = r1.playerStatsAdapter     // Catch:{ Exception -> 0x0221 }
            if (r0 != 0) goto L_0x0116
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)     // Catch:{ Exception -> 0x0221 }
            r0 = r6
        L_0x0116:
            java.util.ArrayList r7 = r2.getPlayerStats()     // Catch:{ Exception -> 0x0221 }
            r0.addList(r7)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x0221 }
            if (r0 != 0) goto L_0x0125
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x0221 }
            r0 = r6
        L_0x0125:
            android.widget.TextView r0 = r0.team1Name     // Catch:{ Exception -> 0x0221 }
            java.util.ArrayList r7 = r2.getPlayerStats()     // Catch:{ Exception -> 0x0221 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat r7 = (com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat) r7     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Match r7 = r7.getMatch()     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Team1 r7 = r7.getTeam1()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r7 = r7.getCode()     // Catch:{ Exception -> 0x0221 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x0221 }
            r0.setText(r7)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x0221 }
            if (r0 != 0) goto L_0x014a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x0221 }
            r0 = r6
        L_0x014a:
            android.widget.TextView r0 = r0.team2Name     // Catch:{ Exception -> 0x0221 }
            java.util.ArrayList r7 = r2.getPlayerStats()     // Catch:{ Exception -> 0x0221 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat r7 = (com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat) r7     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Match r7 = r7.getMatch()     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Team2 r7 = r7.getTeam2()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r7 = r7.getCode()     // Catch:{ Exception -> 0x0221 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x0221 }
            r0.setText(r7)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x0221 }
            if (r0 != 0) goto L_0x016f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x0221 }
            r0 = r6
        L_0x016f:
            android.widget.TextView r0 = r0.tvRank     // Catch:{ Exception -> 0x0221 }
            java.util.ArrayList r7 = r2.getPlayerStats()     // Catch:{ Exception -> 0x0221 }
            java.lang.Object r7 = r7.get(r4)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat r7 = (com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat) r7     // Catch:{ Exception -> 0x0221 }
            float r7 = r7.getFantasyPoints()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x0221 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x0221 }
            r0.setText(r7)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x0221 }
            if (r0 != 0) goto L_0x0190
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x0221 }
            r0 = r6
        L_0x0190:
            de.hdodenhof.circleimageview.CircleImageView r0 = r0.ivTeam1Flag     // Catch:{ Exception -> 0x0221 }
            java.lang.String r7 = "binding.ivTeam1Flag"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)     // Catch:{ Exception -> 0x0221 }
            r12 = r0
            android.widget.ImageView r12 = (android.widget.ImageView) r12     // Catch:{ Exception -> 0x0221 }
            java.util.ArrayList r0 = r2.getPlayerStats()     // Catch:{ Exception -> 0x0221 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat r0 = (com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat) r0     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Match r0 = r0.getMatch()     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Team1 r0 = r0.getTeam1()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r0 = r0.getTeamIconUrl()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r7 = ""
            if (r0 != 0) goto L_0x01b6
            r13 = r7
            goto L_0x01b7
        L_0x01b6:
            r13 = r0
        L_0x01b7:
            r14 = 2131165585(0x7f070191, float:1.7945391E38)
            r15 = 0
            r16 = 4
            r17 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x0221 }
            if (r0 != 0) goto L_0x01ca
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x0221 }
            r0 = r6
        L_0x01ca:
            de.hdodenhof.circleimageview.CircleImageView r0 = r0.ivTeam2Flag     // Catch:{ Exception -> 0x0221 }
            java.lang.String r12 = "binding.ivTeam2Flag"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r12)     // Catch:{ Exception -> 0x0221 }
            r13 = r0
            android.widget.ImageView r13 = (android.widget.ImageView) r13     // Catch:{ Exception -> 0x0221 }
            java.util.ArrayList r0 = r2.getPlayerStats()     // Catch:{ Exception -> 0x0221 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat r0 = (com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat) r0     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Match r0 = r0.getMatch()     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Team2 r0 = r0.getTeam2()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r0 = r0.getTeamIconUrl()     // Catch:{ Exception -> 0x0221 }
            if (r0 != 0) goto L_0x01ee
            r14 = r7
            goto L_0x01ef
        L_0x01ee:
            r14 = r0
        L_0x01ef:
            r15 = 2131165585(0x7f070191, float:1.7945391E38)
            r16 = 0
            r17 = 4
            r18 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r13, r14, r15, r16, r17, r18)     // Catch:{ Exception -> 0x0221 }
            java.util.ArrayList r0 = r2.getPlayerStats()     // Catch:{ Exception -> 0x0221 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat r0 = (com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat) r0     // Catch:{ Exception -> 0x0221 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Match r0 = r0.getMatch()     // Catch:{ Exception -> 0x0221 }
            long r12 = r0.getStartAtIST()     // Catch:{ Exception -> 0x0221 }
            java.lang.String r0 = r1.getDateString2(r12)     // Catch:{ Exception -> 0x0221 }
            com.crickpe.databinding.FragmentRewardsBinding r4 = r1.binding     // Catch:{ Exception -> 0x0221 }
            if (r4 != 0) goto L_0x0219
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x0221 }
            r4 = r6
        L_0x0219:
            android.widget.TextView r4 = r4.tvTime     // Catch:{ Exception -> 0x0221 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0221 }
            r4.setText(r0)     // Catch:{ Exception -> 0x0221 }
            goto L_0x022b
        L_0x0221:
            r0 = move-exception
            java.lang.String r4 = "playerStats"
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x02d3 }
            android.util.Log.v(r4, r0)     // Catch:{ Exception -> 0x02d3 }
        L_0x022b:
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x0233
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x0233:
            android.widget.RelativeLayout r0 = r0.rlNoData     // Catch:{ Exception -> 0x02d3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r11)     // Catch:{ Exception -> 0x02d3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x0245
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x0245:
            android.widget.RelativeLayout r0 = r0.rlPlayerStat     // Catch:{ Exception -> 0x02d3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)     // Catch:{ Exception -> 0x02d3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x0257
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x0257:
            android.widget.TextView r0 = r0.textView21     // Catch:{ Exception -> 0x02d3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)     // Catch:{ Exception -> 0x02d3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x0269
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x0269:
            android.widget.LinearLayout r0 = r0.linearLayout16     // Catch:{ Exception -> 0x02d3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r8)     // Catch:{ Exception -> 0x02d3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x02d3 }
            goto L_0x02bc
        L_0x0274:
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x027c
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x027c:
            android.widget.RelativeLayout r0 = r0.rlNoData     // Catch:{ Exception -> 0x02d3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r11)     // Catch:{ Exception -> 0x02d3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x028e
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x028e:
            android.widget.RelativeLayout r0 = r0.rlPlayerStat     // Catch:{ Exception -> 0x02d3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r10)     // Catch:{ Exception -> 0x02d3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x02a0
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x02a0:
            android.widget.TextView r0 = r0.textView21     // Catch:{ Exception -> 0x02d3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r9)     // Catch:{ Exception -> 0x02d3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.databinding.FragmentRewardsBinding r0 = r1.binding     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x02b2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)     // Catch:{ Exception -> 0x02d3 }
            r0 = r6
        L_0x02b2:
            android.widget.LinearLayout r0 = r0.linearLayout16     // Catch:{ Exception -> 0x02d3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r8)     // Catch:{ Exception -> 0x02d3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x02d3 }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x02d3 }
        L_0x02bc:
            com.crickpe.view.detail.adapters.FlagListAdapter r0 = r1.playerTeamFlags     // Catch:{ Exception -> 0x02d3 }
            if (r0 != 0) goto L_0x02c6
            java.lang.String r0 = "playerTeamFlags"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch:{ Exception -> 0x02d3 }
            goto L_0x02c7
        L_0x02c6:
            r6 = r0
        L_0x02c7:
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Player r0 = r2.getPlayer()     // Catch:{ Exception -> 0x02d3 }
            java.util.List r0 = r0.getTeams()     // Catch:{ Exception -> 0x02d3 }
            r6.addList(r3, r0)     // Catch:{ Exception -> 0x02d3 }
            goto L_0x02dd
        L_0x02d3:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "CRASH"
            android.util.Log.v(r1, r0)
        L_0x02dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.home.fragments.rewards.RewardsFragment.m3737observeData$lambda12(com.crickpe.view.home.fragments.rewards.RewardsFragment, com.crickpe.utils.apiHandling.ApiResponseHandler):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-13  reason: not valid java name */
    public static final void m3738observeData$lambda13(RewardsFragment rewardsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            FragmentRewardsBinding fragmentRewardsBinding = null;
            if (i == 1) {
                FragmentRewardsBinding fragmentRewardsBinding2 = rewardsFragment.binding;
                if (fragmentRewardsBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentRewardsBinding2 = null;
                }
                ProgressBar progressBar = fragmentRewardsBinding2.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBar");
                CommonMethodsKt.hide(progressBar);
                PlayerRewardModel playerRewardModel = (PlayerRewardModel) apiResponseHandler.getData();
                FragmentRewardsBinding fragmentRewardsBinding3 = rewardsFragment.binding;
                if (fragmentRewardsBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentRewardsBinding3 = null;
                }
                fragmentRewardsBinding3.swipeData.setRefreshing(false);
                String string = rewardsFragment.requireActivity().getString(C1188R.string.player_rewared_successfully);
                Intrinsics.checkNotNullExpressionValue(string, "requireActivity().getStr…yer_rewared_successfully)");
                rewardsFragment.showToast(string);
                try {
                    HashMap hashMap = new HashMap();
                    hashMap.put(AFInAppEventParameterName.REVENUE, rewardsFragment.rewardAmount.toString());
                    AppsFlyerLib.getInstance().logEvent(rewardsFragment.requireActivity().getApplicationContext(), Constants.EVENT_PLAYER_REWARDED, hashMap, new RewardsFragment$observeData$4$1());
                    Bundle bundle = new Bundle();
                    bundle.putString("revenue", rewardsFragment.rewardAmount.toString());
                    ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_PLAYER_REWARDED, bundle);
                } catch (Exception e) {
                    Log.e("Analytics", e.toString());
                }
                if (playerRewardModel != null) {
                    FragmentRewardsBinding fragmentRewardsBinding4 = rewardsFragment.binding;
                    if (fragmentRewardsBinding4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentRewardsBinding = fragmentRewardsBinding4;
                    }
                    fragmentRewardsBinding.etRewardAmount.setText("");
                    UserManager.INSTANCE.saveCertificate(playerRewardModel.getCertificateUrl());
                    Intent intent = new Intent(new Intent(rewardsFragment.requireActivity(), DetailActivity.class));
                    intent.putExtra("open", "certificate");
                    rewardsFragment.startActivity(intent);
                }
            } else if (i == 2) {
                FragmentRewardsBinding fragmentRewardsBinding5 = rewardsFragment.binding;
                if (fragmentRewardsBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentRewardsBinding5 = null;
                }
                fragmentRewardsBinding5.swipeData.setRefreshing(false);
                FragmentActivity requireActivity = rewardsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                rewardsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                FragmentRewardsBinding fragmentRewardsBinding6 = rewardsFragment.binding;
                if (fragmentRewardsBinding6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentRewardsBinding = fragmentRewardsBinding6;
                }
                ProgressBar progressBar2 = fragmentRewardsBinding.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "binding.progressBar");
                CommonMethodsKt.hide(progressBar2);
                if ((apiResponseHandler.getError() instanceof AppError.ApiError) && Intrinsics.areEqual((Object) ((AppError.ApiError) apiResponseHandler.getError()).getStatusCode(), (Object) "400") && Intrinsics.areEqual((Object) ((AppError.ApiError) apiResponseHandler.getError()).getMessage(), (Object) "You have Insufficient balance!")) {
                    rewardsFragment.insufficientDialog();
                }
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            } else if (i == 3) {
                FragmentRewardsBinding fragmentRewardsBinding7 = rewardsFragment.binding;
                if (fragmentRewardsBinding7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentRewardsBinding7 = null;
                }
                if (!fragmentRewardsBinding7.swipeData.isRefreshing()) {
                    FragmentRewardsBinding fragmentRewardsBinding8 = rewardsFragment.binding;
                    if (fragmentRewardsBinding8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentRewardsBinding = fragmentRewardsBinding8;
                    }
                    ProgressBar progressBar3 = fragmentRewardsBinding.progressBar;
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "binding.progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.crickpe.view.detail.adapters.MyRewardAdapter} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2 */
    /* JADX WARNING: type inference failed for: r6v3, types: [com.crickpe.databinding.FragmentRewardsBinding] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5, types: [com.crickpe.databinding.FragmentRewardsBinding] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: observeData$lambda-14  reason: not valid java name */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m3739observeData$lambda14(RewardsFragment r7, ApiResponseHandler r8) {
        /*
            java.lang.String r0 = "e_getMyReward"
            java.lang.String r1 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            if (r8 != 0) goto L_0x000a
            return
        L_0x000a:
            com.crickpe.utils.apiHandling.Status r1 = r8.getStatus()
            int[] r2 = com.crickpe.view.home.fragments.rewards.RewardsFragment.WhenMappings.$EnumSwitchMapping$0
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 1
            r3 = 0
            java.lang.String r4 = "binding.progressBar"
            java.lang.String r5 = "binding"
            r6 = 0
            if (r1 == r2) goto L_0x008d
            r0 = 2
            if (r1 == r0) goto L_0x004c
            r8 = 3
            if (r1 == r8) goto L_0x0027
            goto L_0x00f1
        L_0x0027:
            com.crickpe.databinding.FragmentRewardsBinding r8 = r7.binding
            if (r8 != 0) goto L_0x002f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r8 = r6
        L_0x002f:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r8 = r8.swipeData
            boolean r8 = r8.isRefreshing()
            if (r8 != 0) goto L_0x00f1
            com.crickpe.databinding.FragmentRewardsBinding r7 = r7.binding
            if (r7 != 0) goto L_0x003f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            goto L_0x0040
        L_0x003f:
            r6 = r7
        L_0x0040:
            android.widget.ProgressBar r7 = r6.progressBar
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            android.view.View r7 = (android.view.View) r7
            com.crickpe.utils.CommonMethodsKt.visible(r7)
            goto L_0x00f1
        L_0x004c:
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            java.lang.String r1 = "requireActivity()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            android.app.Activity r0 = (android.app.Activity) r0
            com.crickpe.utils.apiHandling.AppError r1 = r8.getError()
            r7.handleApiError(r0, r1)
            com.crickpe.databinding.FragmentRewardsBinding r0 = r7.binding
            if (r0 != 0) goto L_0x0066
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r0 = r6
        L_0x0066:
            android.widget.ProgressBar r0 = r0.progressBar
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            android.view.View r0 = (android.view.View) r0
            com.crickpe.utils.CommonMethodsKt.hide(r0)
            com.crickpe.databinding.FragmentRewardsBinding r7 = r7.binding
            if (r7 != 0) goto L_0x0078
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            goto L_0x0079
        L_0x0078:
            r6 = r7
        L_0x0079:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r7 = r6.swipeData
            r7.setRefreshing(r3)
            com.google.gson.Gson r7 = new com.google.gson.Gson
            r7.<init>()
            java.lang.String r7 = r7.toJson((java.lang.Object) r8)
            java.lang.String r8 = "ERROR"
            android.util.Log.v(r8, r7)
            goto L_0x00f1
        L_0x008d:
            com.crickpe.databinding.FragmentRewardsBinding r1 = r7.binding
            if (r1 != 0) goto L_0x0095
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r1 = r6
        L_0x0095:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r1 = r1.swipeData
            r1.setRefreshing(r3)
            com.crickpe.databinding.FragmentRewardsBinding r1 = r7.binding
            if (r1 != 0) goto L_0x00a2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r5)
            r1 = r6
        L_0x00a2:
            android.widget.ProgressBar r1 = r1.progressBar
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            android.view.View r1 = (android.view.View) r1
            com.crickpe.utils.CommonMethodsKt.hide(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r7.myRewardlist = r1
            java.lang.Object r8 = r8.getData()
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00e9 }
            android.util.Log.v(r0, r1)     // Catch:{ Exception -> 0x00e9 }
            if (r8 == 0) goto L_0x00f1
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x00e9 }
            r1.<init>()     // Catch:{ Exception -> 0x00e9 }
            r7.myRewardlist = r1     // Catch:{ Exception -> 0x00e9 }
            com.crickpe.view.detail.adapters.MyRewardAdapter r1 = r7.myRewardAdapter     // Catch:{ Exception -> 0x00e9 }
            java.lang.String r2 = "myRewardAdapter"
            if (r1 != 0) goto L_0x00d3
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ Exception -> 0x00e9 }
            r1 = r6
        L_0x00d3:
            java.util.ArrayList r1 = r1.getBatterScoreList()     // Catch:{ Exception -> 0x00e9 }
            r1.clear()     // Catch:{ Exception -> 0x00e9 }
            com.crickpe.view.detail.adapters.MyRewardAdapter r1 = r7.myRewardAdapter     // Catch:{ Exception -> 0x00e9 }
            if (r1 != 0) goto L_0x00e2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00e3
        L_0x00e2:
            r6 = r1
        L_0x00e3:
            r6.addList(r8)     // Catch:{ Exception -> 0x00e9 }
            r7.myRewardlist = r8     // Catch:{ Exception -> 0x00e9 }
            goto L_0x00f1
        L_0x00e9:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r0, r7)
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.home.fragments.rewards.RewardsFragment.m3739observeData$lambda14(com.crickpe.view.home.fragments.rewards.RewardsFragment, com.crickpe.utils.apiHandling.ApiResponseHandler):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-15  reason: not valid java name */
    public static final void m3740observeData$lambda15(RewardsFragment rewardsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            FragmentRewardsBinding fragmentRewardsBinding = null;
            if (i == 1) {
                FragmentRewardsBinding fragmentRewardsBinding2 = rewardsFragment.binding;
                if (fragmentRewardsBinding2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentRewardsBinding2 = null;
                }
                ProgressBar progressBar = fragmentRewardsBinding2.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding.progressBar");
                CommonMethodsKt.hide(progressBar);
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                FragmentRewardsBinding fragmentRewardsBinding3 = rewardsFragment.binding;
                if (fragmentRewardsBinding3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentRewardsBinding = fragmentRewardsBinding3;
                }
                fragmentRewardsBinding.swipeData.setRefreshing(false);
                if (arrayList != null) {
                    try {
                        rewardsFragment.setPagination(arrayList);
                    } catch (Exception e) {
                        Log.v("E_GetPlayerReward", e.toString());
                    }
                }
            } else if (i == 2) {
                FragmentRewardsBinding fragmentRewardsBinding4 = rewardsFragment.binding;
                if (fragmentRewardsBinding4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentRewardsBinding4 = null;
                }
                fragmentRewardsBinding4.swipeData.setRefreshing(false);
                FragmentActivity requireActivity = rewardsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                rewardsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                FragmentRewardsBinding fragmentRewardsBinding5 = rewardsFragment.binding;
                if (fragmentRewardsBinding5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                } else {
                    fragmentRewardsBinding = fragmentRewardsBinding5;
                }
                ProgressBar progressBar2 = fragmentRewardsBinding.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "binding.progressBar");
                CommonMethodsKt.hide(progressBar2);
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            } else if (i == 3) {
                FragmentRewardsBinding fragmentRewardsBinding6 = rewardsFragment.binding;
                if (fragmentRewardsBinding6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    fragmentRewardsBinding6 = null;
                }
                if (!fragmentRewardsBinding6.swipeData.isRefreshing()) {
                    FragmentRewardsBinding fragmentRewardsBinding7 = rewardsFragment.binding;
                    if (fragmentRewardsBinding7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                    } else {
                        fragmentRewardsBinding = fragmentRewardsBinding7;
                    }
                    ProgressBar progressBar3 = fragmentRewardsBinding.progressBar;
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "binding.progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-16  reason: not valid java name */
    public static final void m3741observeData$lambda16(RewardsFragment rewardsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(rewardsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                HomeDataModel homeDataModel = (HomeDataModel) apiResponseHandler.getData();
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                if (homeDataModel != null) {
                    try {
                        User userProfile = UserManager.INSTANCE.getUserProfile();
                        if (userProfile != null) {
                            userProfile.setTotalAmount((double) ((int) homeDataModel.getUserInfo().getTotalAmount()));
                        }
                        double d = 0.0d;
                        ApplicationActivity.Companion.setWalletBalance(userProfile != null ? userProfile.getTotalAmount() : 0.0d);
                        HomeActivity homeActivity = (HomeActivity) rewardsFragment.requireActivity();
                        if (userProfile != null) {
                            d = userProfile.getTotalAmount();
                        }
                        homeActivity.showWalletBal(d);
                    } catch (Exception e) {
                        Log.v("getHomeDataApi", e.toString());
                    }
                }
                ProgressBar progressBar = (ProgressBar) rewardsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
            } else if (i == 2) {
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) rewardsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                Log.v("getHomeDataApi_ERROR", new Gson().toJson((Object) apiResponseHandler.getError()));
            } else if (i == 3) {
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) rewardsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                    z = false;
                }
                if (z) {
                    ProgressBar progressBar3 = (ProgressBar) rewardsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    public void onTrackerClick(TrackerModel trackerModel, int i) {
        Intrinsics.checkNotNullParameter(trackerModel, "trackerModel");
        TeamCountryData teamCountryData = new TeamCountryData(trackerModel.getTeamInfo().get_id(), trackerModel.getTeamInfo().getName(), trackerModel.getTeamInfo().getTeamIconUrl(), trackerModel.getTeamInfo().getImageUrl());
        this.playerName = trackerModel.getName();
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvName)).setText(trackerModel.getName());
        this.playerId = trackerModel.getPlayerId();
        this.countryId = trackerModel.getTeamInfo().get_id();
        this.onTrackerClick = true;
        DefaultImpls.onCountryClick$default(this, teamCountryData, i, false, 4, (Object) null);
        changeColor(0);
    }

    public final boolean getFromDialog() {
        return this.fromDialog;
    }

    public final void setFromDialog(boolean z) {
        this.fromDialog = z;
    }

    public void onCountryClick(TeamCountryData teamCountryData, int i, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(teamCountryData, "teamCountryData");
        this.countryId = teamCountryData.get_id();
        this.fromDialog = z;
        if (!this.onTrackerClick) {
            this.playerId = "";
        }
        Dialog dialog = this.countryPopUp;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTeam)).setText(teamCountryData.getName());
        DialogAdapter dialogAdapter2 = null;
        if (!Intrinsics.areEqual((Object) this.countryId, (Object) "")) {
            HomeViewModel homeViewModel = this.viewModel;
            if (homeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel = null;
            }
            homeViewModel.getPlayersByTeamId(this.countryId);
        }
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.flag);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "flag");
        ImageView imageView = circleImageView;
        String teamIconUrl = teamCountryData.getTeamIconUrl();
        if (teamIconUrl == null) {
            str = "";
        } else {
            str = teamIconUrl;
        }
        ExtensionsKt.loadImage$default(imageView, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
        if (!Intrinsics.areEqual((Object) this.countryId, (Object) "")) {
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
    }

    public void onItemClicked(TeamCountryData teamCountryData, int i, String str) {
        String str2;
        String str3;
        String str4 = str;
        Intrinsics.checkNotNullParameter(teamCountryData, "teamCountryData");
        Intrinsics.checkNotNullParameter(str4, "from");
        if (Intrinsics.areEqual((Object) str4, (Object) "adapter")) {
            this.playerId = teamCountryData.get_id();
        }
        Dialog dialog = this.playersPopup;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.onTrackerClick = false;
        PlayersDialogAdapter playersDialogAdapter2 = null;
        if (Intrinsics.areEqual((Object) this.playerId, (Object) "")) {
            HomeViewModel homeViewModel = this.viewModel;
            if (homeViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                homeViewModel = null;
            }
            homeViewModel.getPlayersStat(teamCountryData.get_id());
            this.playerName = teamCountryData.getName();
            this.playerId = teamCountryData.get_id();
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvName)).setText(teamCountryData.getName());
            CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivPlayerImage);
            Intrinsics.checkNotNullExpressionValue(circleImageView, "ivPlayerImage");
            ImageView imageView = circleImageView;
            String imageUrl = teamCountryData.getImageUrl();
            if (imageUrl == null) {
                str3 = "";
            } else {
                str3 = imageUrl;
            }
            ExtensionsKt.loadImage$default(imageView, str3, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
            PlayersDialogAdapter playersDialogAdapter3 = this.playersDialogAdapter;
            if (playersDialogAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                playersDialogAdapter3 = null;
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList = new ArrayList();
            for (Object next : playersDialogAdapter3.getPlayersList()) {
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
        } else {
            PlayersDialogAdapter playersDialogAdapter6 = this.playersDialogAdapter;
            if (playersDialogAdapter6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                playersDialogAdapter6 = null;
            }
            HashSet hashSet2 = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object next2 : playersDialogAdapter6.getPlayersList()) {
                TeamCountryData teamCountryData3 = (TeamCountryData) next2;
                if (Intrinsics.areEqual((Object) teamCountryData3.get_id(), (Object) this.playerId)) {
                    PlayersDialogAdapter playersDialogAdapter7 = this.playersDialogAdapter;
                    if (playersDialogAdapter7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                        playersDialogAdapter7 = null;
                    }
                    PlayersDialogAdapter playersDialogAdapter8 = this.playersDialogAdapter;
                    if (playersDialogAdapter8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                        playersDialogAdapter8 = null;
                    }
                    playersDialogAdapter7.setSelectedPosition(playersDialogAdapter8.getPlayersList().indexOf(teamCountryData3));
                    HomeViewModel homeViewModel2 = this.viewModel;
                    if (homeViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        homeViewModel2 = null;
                    }
                    homeViewModel2.getPlayersStat(teamCountryData3.get_id());
                    this.playerIdTemp = teamCountryData3.get_id();
                    this.playerName = teamCountryData3.getName();
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvName)).setText(teamCountryData3.getName());
                    CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivPlayerImage);
                    Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivPlayerImage");
                    ImageView imageView2 = circleImageView2;
                    String imageUrl2 = teamCountryData3.getImageUrl();
                    if (imageUrl2 == null) {
                        str2 = "";
                    } else {
                        str2 = imageUrl2;
                    }
                    ExtensionsKt.loadImage$default(imageView2, str2, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                }
                if (hashSet2.add(Unit.INSTANCE)) {
                    arrayList2.add(next2);
                }
            }
            List list2 = arrayList2;
        }
        PlayersDialogAdapter playersDialogAdapter9 = this.playersDialogAdapter;
        if (playersDialogAdapter9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
        } else {
            playersDialogAdapter2 = playersDialogAdapter9;
        }
        playersDialogAdapter2.notifyDataSetChanged();
    }
}
