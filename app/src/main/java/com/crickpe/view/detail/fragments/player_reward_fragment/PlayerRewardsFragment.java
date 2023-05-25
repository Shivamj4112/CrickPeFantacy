package com.crickpe.view.detail.fragments.player_reward_fragment;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.EditProfileRequest;
import com.crickpe.data.RewardPlayerRequest;
import com.crickpe.databinding.FragmentPlayerRewardsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.PlayerStatsAdapter;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerRewardModel;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel;
import com.crickpe.view.home.adapters.DialogAdapter;
import com.crickpe.view.home.adapters.PlayersDialogAdapter;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.kyc.models.State;
import com.crickpe.view.intro.fragments.kyc.models.TeamCountryData;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0010\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0002J\b\u0010N\u001a\u00020KH\u0002J\b\u0010O\u001a\u00020MH\u0016J\b\u0010P\u001a\u00020KH\u0002J\b\u0010Q\u001a\u00020KH\u0002J\b\u0010R\u001a\u00020KH\u0003J\u0010\u0010S\u001a\u00020K2\u0006\u0010T\u001a\u00020UH\u0016J \u0010V\u001a\u00020K2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020M2\u0006\u0010Z\u001a\u00020%H\u0016J \u0010[\u001a\u00020K2\u0006\u0010W\u001a\u00020X2\u0006\u0010Y\u001a\u00020M2\u0006\u0010Z\u001a\u00020\tH\u0016J\b\u0010\\\u001a\u00020KH\u0016J\u001a\u0010]\u001a\u00020K2\u0006\u0010T\u001a\u00020U2\b\u0010^\u001a\u0004\u0018\u00010_H\u0017J\b\u0010`\u001a\u00020KH\u0002J&\u0010a\u001a\u00020K2\b\u0010b\u001a\u0004\u0018\u00010c2\b\u0010d\u001a\u0004\u0018\u00010c2\b\u0010e\u001a\u0004\u0018\u00010cH\u0002J\b\u0010f\u001a\u00020KH\u0002J&\u0010g\u001a\u00020K2\b\u0010h\u001a\u0004\u0018\u00010c2\b\u0010b\u001a\u0004\u0018\u00010c2\b\u0010e\u001a\u0004\u0018\u00010cH\u0002J\u0010\u0010i\u001a\u00020K2\u0006\u0010j\u001a\u00020kH\u0002J\u0010\u0010l\u001a\u00020K2\u0006\u0010j\u001a\u00020kH\u0002J\b\u0010m\u001a\u00020KH\u0002J\b\u0010n\u001a\u00020KH\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u00020%X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010&\"\u0004\b'\u0010(R\u001a\u0010)\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010,\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000b\"\u0004\b.\u0010\rR\u001a\u0010/\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000b\"\u0004\b1\u0010\rR\u000e\u00102\u001a\u000203X.¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000205X.¢\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0011\"\u0004\b8\u0010\u0013R\u001a\u00109\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u000b\"\u0004\b;\u0010\rR\u001c\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020IX.¢\u0006\u0002\n\u0000¨\u0006o"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/PlayerRewardsFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/home/adapters/DialogAdapter$OnCountryDialog;", "Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$OnItemClicked;", "()V", "binding", "Lcom/crickpe/databinding/FragmentPlayerRewardsBinding;", "countryId", "", "getCountryId", "()Ljava/lang/String;", "setCountryId", "(Ljava/lang/String;)V", "countryPopUp", "Landroid/app/Dialog;", "getCountryPopUp", "()Landroid/app/Dialog;", "setCountryPopUp", "(Landroid/app/Dialog;)V", "delay", "", "getDelay", "()J", "setDelay", "(J)V", "dialogAdapter", "Lcom/crickpe/view/home/adapters/DialogAdapter;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "inputFinishChecker", "Ljava/lang/Runnable;", "isFirst", "", "()Z", "setFirst", "(Z)V", "last_text_edit", "getLast_text_edit", "setLast_text_edit", "playerId", "getPlayerId", "setPlayerId", "playerName", "getPlayerName", "setPlayerName", "playerStatsAdapter", "Lcom/crickpe/view/detail/adapters/PlayerStatsAdapter;", "playersDialogAdapter", "Lcom/crickpe/view/home/adapters/PlayersDialogAdapter;", "playersPopup", "getPlayersPopup", "setPlayersPopup", "rewardAmount", "getRewardAmount", "setRewardAmount", "rewardPlayerData", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/RewardPlayerData;", "getRewardPlayerData", "()Lcom/crickpe/view/detail/fragments/player_reward_fragment/RewardPlayerData;", "setRewardPlayerData", "(Lcom/crickpe/view/detail/fragments/player_reward_fragment/RewardPlayerData;)V", "userProfile", "Lcom/crickpe/view/intro/fragments/User;", "getUserProfile", "()Lcom/crickpe/view/intro/fragments/User;", "setUserProfile", "(Lcom/crickpe/view/intro/fragments/User;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "callProfileApi", "", "i", "", "countryDialog", "getFragmentLayoutResId", "insufficientDialog", "listners", "observeData", "onClick", "view", "Landroid/view/View;", "onCountryClick", "teamCountryData", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "position", "from", "onItemClicked", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "playerPopup", "removeBg", "withoutBg", "Landroid/widget/RelativeLayout;", "withoutBg0", "withoutBg1", "setAdapter", "setBg", "withBg", "setDialogAdapter", "rvDialog", "Landroidx/recyclerview/widget/RecyclerView;", "setPlayersDialogAdapter", "successReward", "updateReward", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayerRewardsFragment.kt */
public final class PlayerRewardsFragment extends BaseFragment implements View.OnClickListener, DialogAdapter.OnCountryDialog, PlayersDialogAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    /* access modifiers changed from: private */
    public FragmentPlayerRewardsBinding binding;
    private String countryId = "";
    private Dialog countryPopUp;
    private long delay = 1000;
    private DialogAdapter dialogAdapter;
    private Handler handler;
    /* access modifiers changed from: private */
    public final Runnable inputFinishChecker;
    private boolean isFirst;
    private long last_text_edit;
    private String playerId = "";
    private String playerName = "";
    private PlayerStatsAdapter playerStatsAdapter;
    private PlayersDialogAdapter playersDialogAdapter;
    private Dialog playersPopup;
    private String rewardAmount = "0";
    private RewardPlayerData rewardPlayerData;
    private User userProfile;
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayerRewardsFragment.kt */
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
        return C1188R.C1193layout.fragment_player_rewards;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public PlayerRewardsFragment() {
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        this.handler = new Handler(myLooper);
        this.inputFinishChecker = new PlayerRewardsFragment$$ExternalSyntheticLambda0(this);
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

    public final RewardPlayerData getRewardPlayerData() {
        return this.rewardPlayerData;
    }

    public final void setRewardPlayerData(RewardPlayerData rewardPlayerData2) {
        this.rewardPlayerData = rewardPlayerData2;
    }

    public final boolean isFirst() {
        return this.isFirst;
    }

    public final void setFirst(boolean z) {
        this.isFirst = z;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentPlayerRewardsBinding.bind(view);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.rewardPlayerData = UserManager.INSTANCE.getRewardPlayerData();
        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding = this.binding;
        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding);
        fragmentPlayerRewardsBinding.etRewardAmount.setText("");
        RewardPlayerData rewardPlayerData2 = this.rewardPlayerData;
        DetailViewModel detailViewModel = null;
        if (rewardPlayerData2 != null) {
            this.isFirst = true;
            try {
                Log.v("REWARD_DATA", String.valueOf(rewardPlayerData2));
                DetailViewModel detailViewModel2 = this.viewModel;
                if (detailViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel2 = null;
                }
                RewardPlayerData rewardPlayerData3 = this.rewardPlayerData;
                Intrinsics.checkNotNull(rewardPlayerData3);
                detailViewModel2.getPlayersStat(rewardPlayerData3.getPlayerId());
                RewardPlayerData rewardPlayerData4 = this.rewardPlayerData;
                Intrinsics.checkNotNull(rewardPlayerData4);
                this.playerId = rewardPlayerData4.getPlayerId();
                RewardPlayerData rewardPlayerData5 = this.rewardPlayerData;
                Intrinsics.checkNotNull(rewardPlayerData5);
                this.countryId = rewardPlayerData5.getCountryId();
                RewardPlayerData rewardPlayerData6 = this.rewardPlayerData;
                Intrinsics.checkNotNull(rewardPlayerData6);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTeam)).setText(rewardPlayerData6.getCountryName());
                RewardPlayerData rewardPlayerData7 = this.rewardPlayerData;
                Intrinsics.checkNotNull(rewardPlayerData7);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvName)).setText(rewardPlayerData7.getPlayerName());
                RewardPlayerData rewardPlayerData8 = this.rewardPlayerData;
                Intrinsics.checkNotNull(rewardPlayerData8);
                this.playerName = rewardPlayerData8.getPlayerName();
                if (!Intrinsics.areEqual((Object) this.countryId, (Object) "")) {
                    DetailViewModel detailViewModel3 = this.viewModel;
                    if (detailViewModel3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        detailViewModel3 = null;
                    }
                    detailViewModel3.getPlayersByTeamId(this.countryId);
                }
                RequestManager with = Glide.with(requireActivity());
                StringBuilder sb = new StringBuilder();
                SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                sb.append(appSettings != null ? appSettings.getImageBaseUrl() : null);
                RewardPlayerData rewardPlayerData9 = this.rewardPlayerData;
                Intrinsics.checkNotNull(rewardPlayerData9);
                sb.append(rewardPlayerData9.getFlagImage());
                with.load(sb.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.flag_placeholder)).into((ImageView) (CircleImageView) _$_findCachedViewById(C1188R.C1192id.flag));
                RequestManager with2 = Glide.with(requireActivity());
                StringBuilder sb2 = new StringBuilder();
                SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                sb2.append(appSettings2 != null ? appSettings2.getImageBaseUrl() : null);
                RewardPlayerData rewardPlayerData10 = this.rewardPlayerData;
                Intrinsics.checkNotNull(rewardPlayerData10);
                sb2.append(rewardPlayerData10.getPlayerImage());
                with2.load(sb2.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivPlayerImage));
            } catch (Exception e) {
                Log.v("REWARD_DATA", e.toString());
            }
        }
        countryDialog();
        playerPopup();
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel = detailViewModel4;
        }
        detailViewModel.getTeamsCountryApi();
        observeData();
        listners();
        setAdapter();
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
                        textView.setText(getString(C1188R.string.select_country));
                        window.setLayout(-1, -1);
                        setDialogAdapter(recyclerView);
                        textView2.setOnClickListener(new PlayerRewardsFragment$$ExternalSyntheticLambda6(this));
                        imageView.setOnClickListener(new PlayerRewardsFragment$$ExternalSyntheticLambda7(this));
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
    /* renamed from: countryDialog$lambda-0  reason: not valid java name */
    public static final void m3584countryDialog$lambda0(PlayerRewardsFragment playerRewardsFragment, View view) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        Dialog dialog = playerRewardsFragment.countryPopUp;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
        if (!Intrinsics.areEqual((Object) playerRewardsFragment.countryId, (Object) "")) {
            DetailViewModel detailViewModel = playerRewardsFragment.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getPlayersByTeamId(playerRewardsFragment.countryId);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: countryDialog$lambda-1  reason: not valid java name */
    public static final void m3585countryDialog$lambda1(PlayerRewardsFragment playerRewardsFragment, View view) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        Dialog dialog = playerRewardsFragment.countryPopUp;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
    }

    private final void setDialogAdapter(RecyclerView recyclerView) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        RewardPlayerData rewardPlayerData2 = this.rewardPlayerData;
        Intrinsics.checkNotNull(rewardPlayerData2);
        DialogAdapter dialogAdapter2 = new DialogAdapter(this, requireActivity, rewardPlayerData2.getSelectedCountryPosition());
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
        RewardPlayerData rewardPlayerData2 = this.rewardPlayerData;
        Intrinsics.checkNotNull(rewardPlayerData2);
        PlayersDialogAdapter playersDialogAdapter2 = new PlayersDialogAdapter(this, requireActivity, rewardPlayerData2.getSelectedPlayerPosition());
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
                        textView2.setOnClickListener(new PlayerRewardsFragment$$ExternalSyntheticLambda4(this));
                        ((ImageView) findViewById4).setOnClickListener(new PlayerRewardsFragment$$ExternalSyntheticLambda5(this));
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
    /* renamed from: playerPopup$lambda-2  reason: not valid java name */
    public static final void m3594playerPopup$lambda2(PlayerRewardsFragment playerRewardsFragment, View view) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        Dialog dialog = playerRewardsFragment.playersPopup;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: playerPopup$lambda-3  reason: not valid java name */
    public static final void m3595playerPopup$lambda3(PlayerRewardsFragment playerRewardsFragment, View view) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        Dialog dialog = playerRewardsFragment.playersPopup;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getCountryData = detailViewModel.getGetCountryData();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getCountryData.observe(viewLifecycleOwner, new PlayerRewardsFragment$$ExternalSyntheticLambda12(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getPlayerData = detailViewModel3.getGetPlayerData();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getPlayerData.observe(viewLifecycleOwner2, new PlayerRewardsFragment$$ExternalSyntheticLambda1(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<PlayerStatsModel>> playerStats = detailViewModel4.getPlayerStats();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        playerStats.observe(viewLifecycleOwner3, new PlayerRewardsFragment$$ExternalSyntheticLambda2(this));
        DetailViewModel detailViewModel5 = this.viewModel;
        if (detailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel5;
        }
        SingleLiveEvent<ApiResponseHandler<PlayerRewardModel>> playerReward = detailViewModel2.getPlayerReward();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        playerReward.observe(viewLifecycleOwner4, new PlayerRewardsFragment$$ExternalSyntheticLambda3(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-5  reason: not valid java name */
    public static final void m3590observeData$lambda5(PlayerRewardsFragment playerRewardsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    Log.v("DATATAAT", new Gson().toJson((Object) arrayList));
                    DialogAdapter dialogAdapter2 = null;
                    try {
                        DialogAdapter dialogAdapter3 = playerRewardsFragment.dialogAdapter;
                        if (dialogAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
                            dialogAdapter3 = null;
                        }
                        dialogAdapter3.addList(true, arrayList);
                    } catch (Exception unused) {
                    }
                    DialogAdapter dialogAdapter4 = playerRewardsFragment.dialogAdapter;
                    if (dialogAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
                        dialogAdapter4 = null;
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next : dialogAdapter4.getProductsList()) {
                        TeamCountryData teamCountryData = (TeamCountryData) next;
                        if (Intrinsics.areEqual((Object) teamCountryData.get_id(), (Object) playerRewardsFragment.countryId)) {
                            DialogAdapter dialogAdapter5 = playerRewardsFragment.dialogAdapter;
                            if (dialogAdapter5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
                                dialogAdapter5 = null;
                            }
                            DialogAdapter dialogAdapter6 = playerRewardsFragment.dialogAdapter;
                            if (dialogAdapter6 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
                                dialogAdapter6 = null;
                            }
                            dialogAdapter5.setSelectedPosition(dialogAdapter6.getProductsList().indexOf(teamCountryData));
                        }
                        if (hashSet.add(Unit.INSTANCE)) {
                            arrayList2.add(next);
                        }
                    }
                    List list = arrayList2;
                    DialogAdapter dialogAdapter7 = playerRewardsFragment.dialogAdapter;
                    if (dialogAdapter7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dialogAdapter");
                    } else {
                        dialogAdapter2 = dialogAdapter7;
                    }
                    dialogAdapter2.notifyDataSetChanged();
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = playerRewardsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                playerRewardsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-7  reason: not valid java name */
    public static final void m3591observeData$lambda7(PlayerRewardsFragment playerRewardsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    try {
                        PlayersDialogAdapter playersDialogAdapter2 = playerRewardsFragment.playersDialogAdapter;
                        if (playersDialogAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                            playersDialogAdapter2 = null;
                        }
                        playersDialogAdapter2.addList(true, arrayList);
                        if (!arrayList.isEmpty()) {
                            Object obj = arrayList.get(0);
                            Intrinsics.checkNotNullExpressionValue(obj, "data[0]");
                            playerRewardsFragment.onItemClicked((TeamCountryData) obj, -1, "");
                        }
                        PlayersDialogAdapter playersDialogAdapter3 = playerRewardsFragment.playersDialogAdapter;
                        if (playersDialogAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                            playersDialogAdapter3 = null;
                        }
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object next : playersDialogAdapter3.getPlayersList()) {
                            TeamCountryData teamCountryData = (TeamCountryData) next;
                            String str = teamCountryData.get_id();
                            RewardPlayerData rewardPlayerData2 = playerRewardsFragment.rewardPlayerData;
                            if (Intrinsics.areEqual((Object) str, (Object) rewardPlayerData2 != null ? rewardPlayerData2.getPlayerId() : null)) {
                                PlayersDialogAdapter playersDialogAdapter4 = playerRewardsFragment.playersDialogAdapter;
                                if (playersDialogAdapter4 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                                    playersDialogAdapter4 = null;
                                }
                                PlayersDialogAdapter playersDialogAdapter5 = playerRewardsFragment.playersDialogAdapter;
                                if (playersDialogAdapter5 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
                                    playersDialogAdapter5 = null;
                                }
                                playersDialogAdapter4.setSelectedPosition(playersDialogAdapter5.getPlayersList().indexOf(teamCountryData));
                            }
                            if (hashSet.add(Unit.INSTANCE)) {
                                arrayList2.add(next);
                            }
                        }
                        List list = arrayList2;
                    } catch (Exception unused) {
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = playerRewardsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                playerRewardsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-8  reason: not valid java name */
    public static final void m3592observeData$lambda8(PlayerRewardsFragment playerRewardsFragment, ApiResponseHandler apiResponseHandler) {
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        PlayerRewardsFragment playerRewardsFragment2 = playerRewardsFragment;
        ApiResponseHandler apiResponseHandler2 = apiResponseHandler;
        Intrinsics.checkNotNullParameter(playerRewardsFragment2, "this$0");
        if (apiResponseHandler2 != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                PlayerStatsModel playerStatsModel = (PlayerStatsModel) apiResponseHandler.getData();
                if (playerStatsModel != null) {
                    FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding = playerRewardsFragment2.binding;
                    Intrinsics.checkNotNull(fragmentPlayerRewardsBinding);
                    fragmentPlayerRewardsBinding.setModel(playerStatsModel);
                    FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding2 = playerRewardsFragment2.binding;
                    Intrinsics.checkNotNull(fragmentPlayerRewardsBinding2);
                    fragmentPlayerRewardsBinding2.tvTime.setText(playerRewardsFragment2.modifyDateLayout(playerStatsModel.getPlayer().getCreatedAt(), "dd MMM, yy"));
                    FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding3 = playerRewardsFragment2.binding;
                    Intrinsics.checkNotNull(fragmentPlayerRewardsBinding3);
                    fragmentPlayerRewardsBinding3.tvRewardPlayer.setText("Pay " + playerRewardsFragment2.playerName);
                    if (playerStatsModel.getPlayerStats() == null) {
                        return;
                    }
                    if (playerStatsModel.getPlayerStats().size() > 0) {
                        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding4 = playerRewardsFragment2.binding;
                        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding4);
                        CircleImageView circleImageView = fragmentPlayerRewardsBinding4.ivTeam1Flag;
                        Intrinsics.checkNotNullExpressionValue(circleImageView, "binding!!.ivTeam1Flag");
                        ImageView imageView = circleImageView;
                        String teamIconUrl = playerStatsModel.getPlayerStats().get(0).getMatch().getTeam1().getTeamIconUrl();
                        ExtensionsKt.loadImage$default(imageView, teamIconUrl == null ? "" : teamIconUrl, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding5 = playerRewardsFragment2.binding;
                        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding5);
                        CircleImageView circleImageView2 = fragmentPlayerRewardsBinding5.ivTeam2Flag;
                        Intrinsics.checkNotNullExpressionValue(circleImageView2, "binding!!.ivTeam2Flag");
                        ImageView imageView2 = circleImageView2;
                        String teamIconUrl2 = playerStatsModel.getPlayerStats().get(0).getMatch().getTeam2().getTeamIconUrl();
                        if (teamIconUrl2 == null) {
                            str = "";
                        } else {
                            str = teamIconUrl2;
                        }
                        ExtensionsKt.loadImage$default(imageView2, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                        PlayerStatsAdapter playerStatsAdapter2 = playerRewardsFragment2.playerStatsAdapter;
                        PlayerStatsAdapter playerStatsAdapter3 = null;
                        if (playerStatsAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("playerStatsAdapter");
                            playerStatsAdapter2 = null;
                        }
                        playerStatsAdapter2.getBatterScoreList().clear();
                        PlayerStatsAdapter playerStatsAdapter4 = playerRewardsFragment2.playerStatsAdapter;
                        if (playerStatsAdapter4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("playerStatsAdapter");
                        } else {
                            playerStatsAdapter3 = playerStatsAdapter4;
                        }
                        playerStatsAdapter3.addList(playerStatsModel.getPlayerStats());
                        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding6 = playerRewardsFragment2.binding;
                        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding6);
                        TextView textView = fragmentPlayerRewardsBinding6.team1Name;
                        String code = playerStatsModel.getPlayerStats().get(0).getMatch().getTeam1().getCode();
                        if (code != null) {
                            charSequence = code;
                        } else {
                            charSequence = "";
                        }
                        textView.setText(charSequence);
                        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding7 = playerRewardsFragment2.binding;
                        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding7);
                        TextView textView2 = fragmentPlayerRewardsBinding7.team2Name;
                        String code2 = playerStatsModel.getPlayerStats().get(0).getMatch().getTeam2().getCode();
                        if (code2 != null) {
                            charSequence2 = code2;
                        } else {
                            charSequence2 = "";
                        }
                        textView2.setText(charSequence2);
                        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding8 = playerRewardsFragment2.binding;
                        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding8);
                        fragmentPlayerRewardsBinding8.tvRank.setText(String.valueOf(playerStatsModel.getPlayerStats().get(0).getFantasyPoints()));
                        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding9 = playerRewardsFragment2.binding;
                        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding9);
                        RelativeLayout relativeLayout = fragmentPlayerRewardsBinding9.rlNoData;
                        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding!!.rlNoData");
                        CommonMethodsKt.hide(relativeLayout);
                        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding10 = playerRewardsFragment2.binding;
                        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding10);
                        RelativeLayout relativeLayout2 = fragmentPlayerRewardsBinding10.rlPlayerStat;
                        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "binding!!.rlPlayerStat");
                        CommonMethodsKt.visible(relativeLayout2);
                        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding11 = playerRewardsFragment2.binding;
                        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding11);
                        TextView textView3 = fragmentPlayerRewardsBinding11.textView21;
                        Intrinsics.checkNotNullExpressionValue(textView3, "binding!!.textView21");
                        CommonMethodsKt.visible(textView3);
                        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding12 = playerRewardsFragment2.binding;
                        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding12);
                        LinearLayout linearLayout = fragmentPlayerRewardsBinding12.linearLayout16;
                        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding!!.linearLayout16");
                        CommonMethodsKt.visible(linearLayout);
                        return;
                    }
                    FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding13 = playerRewardsFragment2.binding;
                    Intrinsics.checkNotNull(fragmentPlayerRewardsBinding13);
                    RelativeLayout relativeLayout3 = fragmentPlayerRewardsBinding13.rlNoData;
                    Intrinsics.checkNotNullExpressionValue(relativeLayout3, "binding!!.rlNoData");
                    CommonMethodsKt.hide(relativeLayout3);
                    FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding14 = playerRewardsFragment2.binding;
                    Intrinsics.checkNotNull(fragmentPlayerRewardsBinding14);
                    RelativeLayout relativeLayout4 = fragmentPlayerRewardsBinding14.rlPlayerStat;
                    Intrinsics.checkNotNullExpressionValue(relativeLayout4, "binding!!.rlPlayerStat");
                    CommonMethodsKt.hide(relativeLayout4);
                    FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding15 = playerRewardsFragment2.binding;
                    Intrinsics.checkNotNull(fragmentPlayerRewardsBinding15);
                    TextView textView4 = fragmentPlayerRewardsBinding15.textView21;
                    Intrinsics.checkNotNullExpressionValue(textView4, "binding!!.textView21");
                    CommonMethodsKt.hide(textView4);
                    FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding16 = playerRewardsFragment2.binding;
                    Intrinsics.checkNotNull(fragmentPlayerRewardsBinding16);
                    LinearLayout linearLayout2 = fragmentPlayerRewardsBinding16.linearLayout16;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding!!.linearLayout16");
                    CommonMethodsKt.hide(linearLayout2);
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = playerRewardsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                playerRewardsFragment2.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler2));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-9  reason: not valid java name */
    public static final void m3593observeData$lambda9(PlayerRewardsFragment playerRewardsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding = playerRewardsFragment.binding;
                Intrinsics.checkNotNull(fragmentPlayerRewardsBinding);
                ProgressBar progressBar = fragmentPlayerRewardsBinding.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding!!.progressBar");
                CommonMethodsKt.hide(progressBar);
                PlayerRewardModel playerRewardModel = (PlayerRewardModel) apiResponseHandler.getData();
                Log.v("giveplayerReward", String.valueOf(playerRewardModel));
                if (playerRewardModel != null) {
                    try {
                        UserManager.INSTANCE.saveCertificate(playerRewardModel.getCertificateUrl());
                        FragmentKt.findNavController(playerRewardsFragment).navigate((int) C1188R.C1192id.action_playerRewardsFragment_to_rewardCertificateFragment);
                    } catch (Exception e) {
                        Log.v("giveplayerRewarde", e.toString());
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = playerRewardsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                playerRewardsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding2 = playerRewardsFragment.binding;
                Intrinsics.checkNotNull(fragmentPlayerRewardsBinding2);
                ProgressBar progressBar2 = fragmentPlayerRewardsBinding2.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "binding!!.progressBar");
                CommonMethodsKt.hide(progressBar2);
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            } else if (i == 3) {
                FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding3 = playerRewardsFragment.binding;
                Intrinsics.checkNotNull(fragmentPlayerRewardsBinding3);
                ProgressBar progressBar3 = fragmentPlayerRewardsBinding3.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "binding!!.progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    public final User getUserProfile() {
        return this.userProfile;
    }

    public final void setUserProfile(User user) {
        this.userProfile = user;
    }

    private final void callProfileApi(int i) {
        State state;
        this.userProfile = UserManager.INSTANCE.getUserProfile();
        User user = this.userProfile;
        DetailViewModel detailViewModel = null;
        String valueOf = String.valueOf(user != null ? user.getName() : null);
        User user2 = this.userProfile;
        String valueOf2 = String.valueOf(user2 != null ? user2.getEmail() : null);
        User user3 = this.userProfile;
        EditProfileRequest editProfileRequest = new EditProfileRequest(valueOf, valueOf2, i, String.valueOf((user3 == null || (state = user3.getState()) == null) ? null : state.getStateId()), (String) null, 16, (DefaultConstructorMarker) null);
        DetailViewModel detailViewModel2 = this.viewModel;
        if (detailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel = detailViewModel2;
        }
        detailViewModel.updateProfileApi(editProfileRequest);
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
    /* renamed from: inputFinishChecker$lambda-10  reason: not valid java name */
    public static final void m3586inputFinishChecker$lambda10(PlayerRewardsFragment playerRewardsFragment) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        if (System.currentTimeMillis() <= (playerRewardsFragment.last_text_edit + playerRewardsFragment.delay) - ((long) 500)) {
            return;
        }
        if (Intrinsics.areEqual((Object) playerRewardsFragment.rewardAmount, (Object) "150")) {
            playerRewardsFragment.setBg((RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlOneFifty), (RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlFifty));
        } else if (Intrinsics.areEqual((Object) playerRewardsFragment.rewardAmount, (Object) "100")) {
            playerRewardsFragment.setBg((RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlFifty), (RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlOneFifty));
        } else if (Intrinsics.areEqual((Object) playerRewardsFragment.rewardAmount, (Object) "50")) {
            playerRewardsFragment.setBg((RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlFifty), (RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlOneFifty));
        } else {
            playerRewardsFragment.removeBg((RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlOneFifty), (RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) playerRewardsFragment._$_findCachedViewById(C1188R.C1192id.rlFifty));
        }
    }

    private final void listners() {
        View.OnClickListener onClickListener = this;
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlCountry)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlRewardPlayer)).setOnClickListener(onClickListener);
        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding = this.binding;
        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding);
        fragmentPlayerRewardsBinding.rlFifty.setOnClickListener(onClickListener);
        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding2 = this.binding;
        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding2);
        fragmentPlayerRewardsBinding2.rlHundred.setOnClickListener(onClickListener);
        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding3 = this.binding;
        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding3);
        fragmentPlayerRewardsBinding3.rlOneFifty.setOnClickListener(onClickListener);
        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding4 = this.binding;
        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding4);
        fragmentPlayerRewardsBinding4.tvRewardPlayer.setOnClickListener(onClickListener);
        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding5 = this.binding;
        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding5);
        fragmentPlayerRewardsBinding5.etRewardAmount.setOnEditorActionListener(new PlayerRewardsFragment$$ExternalSyntheticLambda11(this));
        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding6 = this.binding;
        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding6);
        fragmentPlayerRewardsBinding6.etRewardAmount.addTextChangedListener(new PlayerRewardsFragment$listners$2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listners$lambda-11  reason: not valid java name */
    public static final boolean m3589listners$lambda11(PlayerRewardsFragment playerRewardsFragment, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        if (i != 6) {
            return false;
        }
        Context requireContext = playerRewardsFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding = playerRewardsFragment.binding;
        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding);
        CommonMethodsKt.hideKeyboard(requireContext, fragmentPlayerRewardsBinding.etRewardAmount);
        return true;
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

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        switch (view.getId()) {
            case C1188R.C1192id.rlCountry:
                Dialog dialog = this.countryPopUp;
                Intrinsics.checkNotNull(dialog);
                dialog.show();
                return;
            case C1188R.C1192id.rlFifty:
                setBg((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFifty), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlOneFifty));
                this.rewardAmount = "50";
                updateReward();
                return;
            case C1188R.C1192id.rlHundred:
                setBg((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFifty), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlOneFifty));
                this.rewardAmount = "100";
                updateReward();
                return;
            case C1188R.C1192id.rlOneFifty:
                setBg((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlOneFifty), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFifty));
                this.rewardAmount = "150";
                updateReward();
                return;
            case C1188R.C1192id.rlRewardPlayer:
                if (Intrinsics.areEqual((Object) this.countryId, (Object) "")) {
                    showToast("Please select country");
                } else {
                    Dialog dialog2 = this.playersPopup;
                    Intrinsics.checkNotNull(dialog2);
                    dialog2.show();
                }
                this.isFirst = false;
                return;
            case C1188R.C1192id.tvRewardPlayer:
                if (Integer.parseInt(this.rewardAmount) == 0) {
                    String string = getString(C1188R.string.please_enter_amount_to_reward);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.please_enter_amount_to_reward)");
                    showToast(string);
                    return;
                }
                successReward();
                return;
            default:
                return;
        }
    }

    private final void updateReward() {
        FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding = this.binding;
        Intrinsics.checkNotNull(fragmentPlayerRewardsBinding);
        fragmentPlayerRewardsBinding.etRewardAmount.setText(this.rewardAmount);
    }

    private final void successReward() {
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
                textView.setOnClickListener(new PlayerRewardsFragment$$ExternalSyntheticLambda8(this, dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: successReward$lambda-12  reason: not valid java name */
    public static final void m3596successReward$lambda12(PlayerRewardsFragment playerRewardsFragment, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Log.v("RewardAmount", String.valueOf((double) Integer.parseInt(playerRewardsFragment.rewardAmount)));
        Log.v("WalletAmont", String.valueOf(ApplicationActivity.Companion.getWalletBalance()));
        if (((double) Integer.parseInt(playerRewardsFragment.rewardAmount)) < ApplicationActivity.Companion.getWalletBalance()) {
            new RewardPlayerRequest(playerRewardsFragment.rewardAmount, playerRewardsFragment.playerId);
            UserManager.INSTANCE.getAppSettings();
            return;
        }
        dialog.dismiss();
        playerRewardsFragment.insufficientDialog();
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
                textView.setOnClickListener(new PlayerRewardsFragment$$ExternalSyntheticLambda9(dialog, this));
                ((TextView) findViewById2).setOnClickListener(new PlayerRewardsFragment$$ExternalSyntheticLambda10(dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: insufficientDialog$lambda-13  reason: not valid java name */
    public static final void m3587insufficientDialog$lambda13(Dialog dialog, PlayerRewardsFragment playerRewardsFragment, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(playerRewardsFragment, "this$0");
        dialog.dismiss();
        FragmentKt.findNavController(playerRewardsFragment).navigate((int) C1188R.C1192id.action_playerRewardsFragment_to_topUpFragment);
    }

    /* access modifiers changed from: private */
    /* renamed from: insufficientDialog$lambda-14  reason: not valid java name */
    public static final void m3588insufficientDialog$lambda14(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("Reward Player", true, false, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    private final void setBg(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3) {
        Intrinsics.checkNotNull(relativeLayout);
        relativeLayout.setBackground(ContextCompat.getDrawable(requireActivity(), C1188R.C1190drawable.rectangle_grey_appborder));
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
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayerStats);
        PlayerStatsAdapter playerStatsAdapter2 = null;
        if (recyclerView != null) {
            PlayerStatsAdapter playerStatsAdapter3 = this.playerStatsAdapter;
            if (playerStatsAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playerStatsAdapter");
                playerStatsAdapter3 = null;
            }
            recyclerView.setAdapter(playerStatsAdapter3);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayerStats)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayerStats);
        PlayerStatsAdapter playerStatsAdapter4 = this.playerStatsAdapter;
        if (playerStatsAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("playerStatsAdapter");
        } else {
            playerStatsAdapter2 = playerStatsAdapter4;
        }
        recyclerView2.setAdapter(playerStatsAdapter2);
    }

    public void onCountryClick(TeamCountryData teamCountryData, int i, boolean z) {
        String str;
        Intrinsics.checkNotNullParameter(teamCountryData, "teamCountryData");
        this.countryId = teamCountryData.get_id();
        this.isFirst = false;
        Dialog dialog = this.countryPopUp;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTeam)).setText(teamCountryData.getName());
        DialogAdapter dialogAdapter2 = null;
        if (!Intrinsics.areEqual((Object) this.countryId, (Object) "")) {
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getPlayersByTeamId(this.countryId);
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
        Intrinsics.checkNotNullParameter(teamCountryData, "teamCountryData");
        Intrinsics.checkNotNullParameter(str, "from");
        Dialog dialog = this.playersPopup;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (!this.isFirst) {
            DetailViewModel detailViewModel = this.viewModel;
            PlayersDialogAdapter playersDialogAdapter2 = null;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getPlayersStat(teamCountryData.get_id());
            this.playerName = teamCountryData.getName();
            this.playerId = teamCountryData.get_id();
            FragmentPlayerRewardsBinding fragmentPlayerRewardsBinding = this.binding;
            Intrinsics.checkNotNull(fragmentPlayerRewardsBinding);
            fragmentPlayerRewardsBinding.tvName.setText(teamCountryData.getName());
            CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivPlayerImage);
            Intrinsics.checkNotNullExpressionValue(circleImageView, "ivPlayerImage");
            ImageView imageView = circleImageView;
            String imageUrl = teamCountryData.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            ExtensionsKt.loadImage$default(imageView, imageUrl, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
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
            PlayersDialogAdapter playersDialogAdapter6 = this.playersDialogAdapter;
            if (playersDialogAdapter6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("playersDialogAdapter");
            } else {
                playersDialogAdapter2 = playersDialogAdapter6;
            }
            playersDialogAdapter2.notifyDataSetChanged();
        }
        Log.v("Player_selected", teamCountryData.getName());
    }
}
