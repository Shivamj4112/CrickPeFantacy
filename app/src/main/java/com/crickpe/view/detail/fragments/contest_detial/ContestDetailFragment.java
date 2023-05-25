package com.crickpe.view.detail.fragments.contest_detial;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.p004os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplitude.android.Amplitude;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.databinding.FragmentContestDetailBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.WinningsAdapter;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings.ContestWinningsModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
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
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010(\u001a\u00020\u001aH\u0016J\b\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0016J\b\u0010.\u001a\u00020*H\u0016J\u001a\u0010/\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\b\u00102\u001a\u00020*H\u0002J\b\u00103\u001a\u00020*H\u0002J\b\u00104\u001a\u00020*H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00110 j\b\u0012\u0004\u0012\u00020\u0011`!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000¨\u00065"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_detial/ContestDetailFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/WinningsAdapter;", "amplitude", "Lcom/amplitude/android/Amplitude;", "binding", "Lcom/crickpe/databinding/FragmentContestDetailBinding;", "contestDataModel", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "getContestDataModel", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "setContestDataModel", "(Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;)V", "fantasyTeamId", "", "getFantasyTeamId", "()Ljava/lang/String;", "setFantasyTeamId", "(Ljava/lang/String;)V", "matchId", "getMatchId", "setMatchId", "myTeamSize", "", "getMyTeamSize", "()I", "setMyTeamSize", "(I)V", "teamsIds", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTeamsIds", "()Ljava/util/ArrayList;", "setTeamsIds", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "observeData", "", "onClick", "view", "Landroid/view/View;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "otherContests", "setAdapter", "trainingContest", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestDetailFragment.kt */
public final class ContestDetailFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private WinningsAdapter adapter;
    private Amplitude amplitude;
    private FragmentContestDetailBinding binding;
    private TopContestModel contestDataModel;
    private String fantasyTeamId = "";
    private String matchId = "";
    private int myTeamSize;
    private ArrayList<String> teamsIds = new ArrayList<>();
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestDetailFragment.kt */
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
        return C1188R.C1193layout.fragment_contest_detail;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final int getMyTeamSize() {
        return this.myTeamSize;
    }

    public final void setMyTeamSize(int i) {
        this.myTeamSize = i;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }

    public final void setFantasyTeamId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fantasyTeamId = str;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
    }

    public final TopContestModel getContestDataModel() {
        return this.contestDataModel;
    }

    public final void setContestDataModel(TopContestModel topContestModel) {
        this.contestDataModel = topContestModel;
    }

    public final ArrayList<String> getTeamsIds() {
        return this.teamsIds;
    }

    public final void setTeamsIds(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.teamsIds = arrayList;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("", false, true, false, false, false, false, true);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentContestDetailBinding.bind(view);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.teamsIds = new ArrayList<>();
        setAdapter();
        if (UserManager.INSTANCE.getMatch() != null) {
            UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
            Intrinsics.checkNotNull(match);
            this.matchId = match.get_id();
        }
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvFee)).setOnClickListener(this);
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getFantasyTeamByMatchApi(this.matchId);
        if (getArguments() != null) {
            TopContestModel topContestModel = (TopContestModel) new Gson().fromJson(requireArguments().getString(PrefsManager.CONTEST_DATA), TopContestModel.class);
            this.contestDataModel = topContestModel;
            if (topContestModel != null) {
                FragmentContestDetailBinding fragmentContestDetailBinding = this.binding;
                Intrinsics.checkNotNull(fragmentContestDetailBinding);
                fragmentContestDetailBinding.setModel(this.contestDataModel);
                DetailViewModel detailViewModel3 = this.viewModel;
                if (detailViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel2 = detailViewModel3;
                }
                TopContestModel topContestModel2 = this.contestDataModel;
                Intrinsics.checkNotNull(topContestModel2);
                detailViewModel2.getContestWinnings(topContestModel2.get_id());
                FragmentContestDetailBinding fragmentContestDetailBinding2 = this.binding;
                Intrinsics.checkNotNull(fragmentContestDetailBinding2);
                LinearLayout linearLayout = fragmentContestDetailBinding2.llProgress;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding!!.llProgress");
                CommonMethodsKt.hide(linearLayout);
                try {
                    TopContestModel topContestModel3 = this.contestDataModel;
                    Intrinsics.checkNotNull(topContestModel3);
                    topContestModel3.getTotalSpots();
                    TopContestModel topContestModel4 = this.contestDataModel;
                    Intrinsics.checkNotNull(topContestModel4);
                    topContestModel4.getJoinedUserCount();
                    TopContestModel topContestModel5 = this.contestDataModel;
                    Intrinsics.checkNotNull(topContestModel5);
                    int typeId = topContestModel5.getContestType().getTypeId();
                    if (typeId == 1) {
                        otherContests();
                        DrawableCompat.setTint(((TextView) _$_findCachedViewById(C1188R.C1192id.tvFee)).getBackground(), ContextCompat.getColor(requireActivity(), C1188R.C1189color.red_dark_l));
                        FragmentContestDetailBinding fragmentContestDetailBinding3 = this.binding;
                        Intrinsics.checkNotNull(fragmentContestDetailBinding3);
                        LinearLayout linearLayout2 = fragmentContestDetailBinding3.llProgress;
                        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding!!.llProgress");
                        CommonMethodsKt.visible(linearLayout2);
                        TopContestModel topContestModel6 = this.contestDataModel;
                        Intrinsics.checkNotNull(topContestModel6);
                        if (topContestModel6.getUser() != null) {
                            RequestManager with = Glide.with(requireActivity());
                            TopContestModel topContestModel7 = this.contestDataModel;
                            Intrinsics.checkNotNull(topContestModel7);
                            with.load(topContestModel7.getUser().getProfilePic()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivContest));
                        }
                        FragmentContestDetailBinding fragmentContestDetailBinding4 = this.binding;
                        Intrinsics.checkNotNull(fragmentContestDetailBinding4);
                        fragmentContestDetailBinding4.ivContestType.setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_private_contest));
                        FragmentContestDetailBinding fragmentContestDetailBinding5 = this.binding;
                        Intrinsics.checkNotNull(fragmentContestDetailBinding5);
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(fragmentContestDetailBinding5.ivContestType, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{0.2f, 1.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.2f})});
                        Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…                        )");
                        ofPropertyValuesHolder.setDuration(800);
                        ofPropertyValuesHolder.setRepeatCount(-1);
                        ofPropertyValuesHolder.setRepeatMode(2);
                        ofPropertyValuesHolder.start();
                    } else if (typeId == 2) {
                        otherContests();
                        ((CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
                        FragmentContestDetailBinding fragmentContestDetailBinding6 = this.binding;
                        Intrinsics.checkNotNull(fragmentContestDetailBinding6);
                        fragmentContestDetailBinding6.ivContestType.setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_mega_contest));
                        DrawableCompat.setTint(((TextView) _$_findCachedViewById(C1188R.C1192id.tvFee)).getBackground(), ContextCompat.getColor(requireActivity(), C1188R.C1189color.green));
                    } else if (typeId != 4) {
                        otherContests();
                        DrawableCompat.setTint(((TextView) _$_findCachedViewById(C1188R.C1192id.tvFee)).getBackground(), ContextCompat.getColor(requireActivity(), C1188R.C1189color.yellow));
                        FragmentContestDetailBinding fragmentContestDetailBinding7 = this.binding;
                        Intrinsics.checkNotNull(fragmentContestDetailBinding7);
                        LinearLayout linearLayout3 = fragmentContestDetailBinding7.llProgress;
                        Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding!!.llProgress");
                        CommonMethodsKt.hide(linearLayout3);
                        ((CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_one_one);
                        FragmentContestDetailBinding fragmentContestDetailBinding8 = this.binding;
                        Intrinsics.checkNotNull(fragmentContestDetailBinding8);
                        fragmentContestDetailBinding8.ivContestType.setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_one_one_contest));
                    } else {
                        trainingContest();
                        ((CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.training_icon);
                        FragmentContestDetailBinding fragmentContestDetailBinding9 = this.binding;
                        Intrinsics.checkNotNull(fragmentContestDetailBinding9);
                        fragmentContestDetailBinding9.ivContestType.setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_training_contest));
                        DrawableCompat.setTint(((TextView) _$_findCachedViewById(C1188R.C1192id.tvFee)).getBackground(), ContextCompat.getColor(requireActivity(), C1188R.C1189color.app_color_one));
                    }
                    TopContestModel topContestModel8 = this.contestDataModel;
                    Intrinsics.checkNotNull(topContestModel8);
                    Log.v("CAN_JOIN", String.valueOf(topContestModel8.getCanJoinContest()));
                    TopContestModel topContestModel9 = this.contestDataModel;
                    Intrinsics.checkNotNull(topContestModel9);
                    if (topContestModel9.getCanJoinContest()) {
                        TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvFee);
                        Intrinsics.checkNotNullExpressionValue(textView, "tvFee");
                        CommonMethodsKt.visible(textView);
                        TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvFee2);
                        Intrinsics.checkNotNullExpressionValue(textView2, "tvFee2");
                        CommonMethodsKt.hide(textView2);
                    } else {
                        TextView textView3 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvFee);
                        Intrinsics.checkNotNullExpressionValue(textView3, "tvFee");
                        CommonMethodsKt.hide(textView3);
                        TextView textView4 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvFee2);
                        Intrinsics.checkNotNullExpressionValue(textView4, "tvFee2");
                        CommonMethodsKt.visible(textView4);
                    }
                } catch (Exception e) {
                    Log.v("contestDataModel", e.toString());
                }
            }
        }
        observeData();
    }

    private final void otherContests() {
        FragmentContestDetailBinding fragmentContestDetailBinding = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding);
        TextView textView = fragmentContestDetailBinding.tvMGlory;
        Intrinsics.checkNotNullExpressionValue(textView, "binding!!.tvMGlory");
        CommonMethodsKt.hide(textView);
        FragmentContestDetailBinding fragmentContestDetailBinding2 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding2);
        TextView textView2 = fragmentContestDetailBinding2.tvTraining;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding!!.tvTraining");
        CommonMethodsKt.hide(textView2);
        FragmentContestDetailBinding fragmentContestDetailBinding3 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding3);
        LinearLayout linearLayout = fragmentContestDetailBinding3.llTraining;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding!!.llTraining");
        CommonMethodsKt.hide(linearLayout);
        FragmentContestDetailBinding fragmentContestDetailBinding4 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding4);
        TextView textView3 = fragmentContestDetailBinding4.megaAmount;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding!!.megaAmount");
        CommonMethodsKt.visible(textView3);
        FragmentContestDetailBinding fragmentContestDetailBinding5 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding5);
        TextView textView4 = fragmentContestDetailBinding5.tvPrice;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding!!.tvPrice");
        CommonMethodsKt.visible(textView4);
        FragmentContestDetailBinding fragmentContestDetailBinding6 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding6);
        TextView textView5 = fragmentContestDetailBinding6.tvmWinningAmount;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding!!.tvmWinningAmount");
        CommonMethodsKt.visible(textView5);
        FragmentContestDetailBinding fragmentContestDetailBinding7 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding7);
        LinearLayout linearLayout2 = fragmentContestDetailBinding7.llWiningPercentage;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding!!.llWiningPercentage");
        CommonMethodsKt.visible(linearLayout2);
        FragmentContestDetailBinding fragmentContestDetailBinding8 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding8);
        ConstraintLayout constraintLayout = fragmentContestDetailBinding8.constrainWinning;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding!!.constrainWinning");
        CommonMethodsKt.visible(constraintLayout);
    }

    private final void trainingContest() {
        FragmentContestDetailBinding fragmentContestDetailBinding = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding);
        TextView textView = fragmentContestDetailBinding.tvMGlory;
        Intrinsics.checkNotNullExpressionValue(textView, "binding!!.tvMGlory");
        CommonMethodsKt.visible(textView);
        FragmentContestDetailBinding fragmentContestDetailBinding2 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding2);
        TextView textView2 = fragmentContestDetailBinding2.tvTraining;
        Intrinsics.checkNotNullExpressionValue(textView2, "binding!!.tvTraining");
        CommonMethodsKt.visible(textView2);
        FragmentContestDetailBinding fragmentContestDetailBinding3 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding3);
        LinearLayout linearLayout = fragmentContestDetailBinding3.llTraining;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "binding!!.llTraining");
        CommonMethodsKt.visible(linearLayout);
        FragmentContestDetailBinding fragmentContestDetailBinding4 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding4);
        TextView textView3 = fragmentContestDetailBinding4.tvPrice;
        Intrinsics.checkNotNullExpressionValue(textView3, "binding!!.tvPrice");
        CommonMethodsKt.hide(textView3);
        FragmentContestDetailBinding fragmentContestDetailBinding5 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding5);
        LinearLayout linearLayout2 = fragmentContestDetailBinding5.llWiningPercentage;
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding!!.llWiningPercentage");
        CommonMethodsKt.hide(linearLayout2);
        FragmentContestDetailBinding fragmentContestDetailBinding6 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding6);
        TextView textView4 = fragmentContestDetailBinding6.tvmWinningAmount;
        Intrinsics.checkNotNullExpressionValue(textView4, "binding!!.tvmWinningAmount");
        CommonMethodsKt.hide(textView4);
        FragmentContestDetailBinding fragmentContestDetailBinding7 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding7);
        TextView textView5 = fragmentContestDetailBinding7.megaAmount;
        Intrinsics.checkNotNullExpressionValue(textView5, "binding!!.megaAmount");
        CommonMethodsKt.hide(textView5);
        FragmentContestDetailBinding fragmentContestDetailBinding8 = this.binding;
        Intrinsics.checkNotNull(fragmentContestDetailBinding8);
        ConstraintLayout constraintLayout = fragmentContestDetailBinding8.constrainWinning;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding!!.constrainWinning");
        CommonMethodsKt.hide(constraintLayout);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.tvFee) {
            TopContestModel topContestModel = this.contestDataModel;
            Intrinsics.checkNotNull(topContestModel);
            if (topContestModel.getCanJoinContest()) {
                TopContestModel topContestModel2 = this.contestDataModel;
                Intrinsics.checkNotNull(topContestModel2);
                TopContestModel topContestModel3 = this.contestDataModel;
                Intrinsics.checkNotNull(topContestModel3);
                TopContestModel topContestModel4 = this.contestDataModel;
                Intrinsics.checkNotNull(topContestModel4);
                TopContestModel topContestModel5 = this.contestDataModel;
                Intrinsics.checkNotNull(topContestModel5);
                TopContestModel topContestModel6 = this.contestDataModel;
                Intrinsics.checkNotNull(topContestModel6);
                Bundle bundleOf = BundleKt.bundleOf(TuplesKt.m276to("referCode", topContestModel2.getReferalCode()), TuplesKt.m276to("contestId", topContestModel3.get_id()), TuplesKt.m276to("contestTypeId", String.valueOf(topContestModel4.getContestType().getTypeId())), TuplesKt.m276to("matchId", topContestModel5.getMatchId()), TuplesKt.m276to("entryFee", String.valueOf(topContestModel6.getEntryFee())));
                String str = null;
                if (this.myTeamSize >= 1) {
                    if (UserManager.INSTANCE.getAppSettings() != null) {
                        SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                        Intrinsics.checkNotNull(appSettings);
                        if (Intrinsics.areEqual((Object) appSettings.getOnJoiningMatchKycChecks(), (Object) "true")) {
                            User userProfile = UserManager.INSTANCE.getUserProfile();
                            Intrinsics.checkNotNull(userProfile);
                            if (userProfile.getKycStatus() != 1) {
                                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestDetailFragment_to_kycFragment2);
                            } else {
                                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestDetailFragment2_to_selectTeamFragment, bundleOf);
                            }
                        } else {
                            User userProfile2 = UserManager.INSTANCE.getUserProfile();
                            if (userProfile2 != null) {
                                str = userProfile2.get_id();
                            }
                            if (Intrinsics.areEqual((Object) String.valueOf(str), (Object) Constants.PROFILE_ID)) {
                                User userProfile3 = UserManager.INSTANCE.getUserProfile();
                                Intrinsics.checkNotNull(userProfile3);
                                if (userProfile3.getKycStatus() != 1) {
                                    FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestDetailFragment_to_kycFragment2);
                                    return;
                                }
                            }
                            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestDetailFragment2_to_selectTeamFragment, bundleOf);
                        }
                    }
                } else if (UserManager.INSTANCE.getAppSettings() != null) {
                    SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                    Intrinsics.checkNotNull(appSettings2);
                    if (Intrinsics.areEqual((Object) appSettings2.getOnJoiningMatchKycChecks(), (Object) "true")) {
                        User userProfile4 = UserManager.INSTANCE.getUserProfile();
                        Intrinsics.checkNotNull(userProfile4);
                        if (userProfile4.getKycStatus() != 1) {
                            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestDetailFragment_to_kycFragment2);
                        } else {
                            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestDetailFragment2_to_createTeamFragment, bundleOf);
                        }
                    } else {
                        User userProfile5 = UserManager.INSTANCE.getUserProfile();
                        if (userProfile5 != null) {
                            str = userProfile5.get_id();
                        }
                        if (Intrinsics.areEqual((Object) String.valueOf(str), (Object) Constants.PROFILE_ID)) {
                            User userProfile6 = UserManager.INSTANCE.getUserProfile();
                            Intrinsics.checkNotNull(userProfile6);
                            if (userProfile6.getKycStatus() != 1) {
                                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestDetailFragment_to_kycFragment2);
                                return;
                            }
                        }
                        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestDetailFragment2_to_createTeamFragment, bundleOf);
                    }
                }
            } else {
                String string = getResources().getString(C1188R.string.contest_already_joined);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…g.contest_already_joined)");
                showToast(string);
            }
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getFantasyTeam = detailViewModel.getGetFantasyTeam();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getFantasyTeam.observe(viewLifecycleOwner, new ContestDetailFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<ContestWinningsModel>> contestWinnings = detailViewModel2.getContestWinnings();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        contestWinnings.observe(viewLifecycleOwner2, new ContestDetailFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3487observeData$lambda0(ContestDetailFragment contestDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(contestDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    int size = arrayList.size();
                    contestDetailFragment.myTeamSize = size;
                    if (size > 0) {
                        String str = ((FantasyTeamListModel) arrayList.get(0)).get_id();
                        contestDetailFragment.fantasyTeamId = str;
                        contestDetailFragment.teamsIds.add(str);
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = contestDetailFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                contestDetailFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3488observeData$lambda1(ContestDetailFragment contestDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(contestDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) contestDetailFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ContestWinningsModel contestWinningsModel = (ContestWinningsModel) apiResponseHandler.getData();
                if (contestWinningsModel != null) {
                    if (contestWinningsModel.getWinning().size() == 0) {
                        RelativeLayout relativeLayout = (RelativeLayout) contestDetailFragment._$_findCachedViewById(C1188R.C1192id.relativeLayout3);
                        Intrinsics.checkNotNullExpressionValue(relativeLayout, "relativeLayout3");
                        CommonMethodsKt.hide(relativeLayout);
                    }
                    WinningsAdapter winningsAdapter = contestDetailFragment.adapter;
                    if (winningsAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        winningsAdapter = null;
                    }
                    winningsAdapter.addList(true, contestWinningsModel.getWinning());
                    ((TextView) contestDetailFragment._$_findCachedViewById(C1188R.C1192id.tvPoolPrize)).setText(contestDetailFragment.numDifferentiation((double) contestWinningsModel.getContest().getWinningAmount()));
                    ((TextView) contestDetailFragment._$_findCachedViewById(C1188R.C1192id.tvSpots)).setText(String.valueOf(contestWinningsModel.getContest().getTotalSpots()));
                    ((TextView) contestDetailFragment._$_findCachedViewById(C1188R.C1192id.tvJoiningFee)).setText(contestDetailFragment.numDifferentiation((double) contestWinningsModel.getContest().getEntryFee()));
                    if (contestWinningsModel.getContest().getContestType() != null) {
                        int typeId = contestWinningsModel.getContest().getContestType().getTypeId();
                        if (typeId == 1) {
                            FragmentContestDetailBinding fragmentContestDetailBinding = contestDetailFragment.binding;
                            Intrinsics.checkNotNull(fragmentContestDetailBinding);
                            fragmentContestDetailBinding.ivContestType.setImageDrawable(AppCompatResources.getDrawable(contestDetailFragment.requireActivity(), C1188R.C1190drawable.icon_private_contest));
                        } else if (typeId == 2) {
                            FragmentContestDetailBinding fragmentContestDetailBinding2 = contestDetailFragment.binding;
                            Intrinsics.checkNotNull(fragmentContestDetailBinding2);
                            fragmentContestDetailBinding2.ivContestType.setImageDrawable(AppCompatResources.getDrawable(contestDetailFragment.requireActivity(), C1188R.C1190drawable.icon_mega_contest));
                        } else if (typeId != 4) {
                            FragmentContestDetailBinding fragmentContestDetailBinding3 = contestDetailFragment.binding;
                            Intrinsics.checkNotNull(fragmentContestDetailBinding3);
                            fragmentContestDetailBinding3.ivContestType.setImageDrawable(AppCompatResources.getDrawable(contestDetailFragment.requireActivity(), C1188R.C1190drawable.icon_one_one_contest));
                        } else {
                            FragmentContestDetailBinding fragmentContestDetailBinding4 = contestDetailFragment.binding;
                            Intrinsics.checkNotNull(fragmentContestDetailBinding4);
                            fragmentContestDetailBinding4.ivContestType.setImageDrawable(AppCompatResources.getDrawable(contestDetailFragment.requireActivity(), C1188R.C1190drawable.icon_training_contest));
                        }
                    } else {
                        FragmentContestDetailBinding fragmentContestDetailBinding5 = contestDetailFragment.binding;
                        Intrinsics.checkNotNull(fragmentContestDetailBinding5);
                        fragmentContestDetailBinding5.ivContestType.setImageDrawable(AppCompatResources.getDrawable(contestDetailFragment.requireActivity(), C1188R.C1190drawable.icon_mega_contest));
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = contestDetailFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                contestDetailFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar2 = (ProgressBar) contestDetailFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) contestDetailFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new WinningsAdapter(requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnings);
        WinningsAdapter winningsAdapter = null;
        if (recyclerView != null) {
            WinningsAdapter winningsAdapter2 = this.adapter;
            if (winningsAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                winningsAdapter2 = null;
            }
            recyclerView.setAdapter(winningsAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnings)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnings);
        WinningsAdapter winningsAdapter3 = this.adapter;
        if (winningsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            winningsAdapter = winningsAdapter3;
        }
        recyclerView2.setAdapter(winningsAdapter);
    }
}
