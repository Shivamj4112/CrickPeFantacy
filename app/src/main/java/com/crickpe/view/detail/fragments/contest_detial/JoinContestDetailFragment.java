package com.crickpe.view.detail.fragments.contest_detial;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
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
import com.amplitude.android.Configuration;
import com.amplitude.android.TrackingOptions;
import com.amplitude.core.LoggerProvider;
import com.amplitude.core.ServerZone;
import com.amplitude.core.StorageProvider;
import com.amplitude.core.events.IngestionMetadata;
import com.amplitude.core.events.Plan;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.databinding.FragmentJoinContestDetailBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.WinningsAdapter;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings.ContestWinningsModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010!\u001a\u00020\u001aH\u0016J\b\u0010\"\u001a\u00020#H\u0002J\u0010\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020#H\u0016J\u001a\u0010(\u001a\u00020#2\u0006\u0010%\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020#H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000¨\u0006,"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_detial/JoinContestDetailFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/WinningsAdapter;", "amplitude", "Lcom/amplitude/android/Amplitude;", "binding", "Lcom/crickpe/databinding/FragmentJoinContestDetailBinding;", "contestDetailModel", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestDetailModel;", "getContestDetailModel", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestDetailModel;", "setContestDetailModel", "(Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestDetailModel;)V", "fantasyTeamId", "", "getFantasyTeamId", "()Ljava/lang/String;", "setFantasyTeamId", "(Ljava/lang/String;)V", "matchId", "getMatchId", "setMatchId", "myTeamSize", "", "getMyTeamSize", "()I", "setMyTeamSize", "(I)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "observeData", "", "onClick", "view", "Landroid/view/View;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: JoinContestDetailFragment.kt */
public final class JoinContestDetailFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private WinningsAdapter adapter;
    private Amplitude amplitude;
    private FragmentJoinContestDetailBinding binding;
    private ContestDetailModel contestDetailModel;
    private String fantasyTeamId = "";
    private String matchId = "";
    private int myTeamSize;
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: JoinContestDetailFragment.kt */
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
        return C1188R.C1193layout.fragment_join_contest_detail;
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

    public final ContestDetailModel getContestDetailModel() {
        return this.contestDetailModel;
    }

    public final void setContestDetailModel(ContestDetailModel contestDetailModel2) {
        this.contestDetailModel = contestDetailModel2;
    }

    public void onResume() {
        Log.e("onResume", "JoinContestDetailFragment");
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("", false, true, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentJoinContestDetailBinding.bind(view);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        setAdapter();
        if (UserManager.INSTANCE.getMatch() != null) {
            UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
            Intrinsics.checkNotNull(match);
            this.matchId = match.get_id();
        }
        DetailViewModel detailViewModel = null;
        if (getArguments() != null) {
            ContestDetailModel contestDetailModel2 = (ContestDetailModel) new Gson().fromJson(requireArguments().getString(PrefsManager.CONTEST_DATA), ContestDetailModel.class);
            this.contestDetailModel = contestDetailModel2;
            if (contestDetailModel2 != null) {
                Intrinsics.checkNotNull(contestDetailModel2);
                if (contestDetailModel2.getContest() != null) {
                    FragmentJoinContestDetailBinding fragmentJoinContestDetailBinding = this.binding;
                    Intrinsics.checkNotNull(fragmentJoinContestDetailBinding);
                    fragmentJoinContestDetailBinding.setModel(this.contestDetailModel);
                    DetailViewModel detailViewModel2 = this.viewModel;
                    if (detailViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        detailViewModel2 = null;
                    }
                    ContestDetailModel contestDetailModel3 = this.contestDetailModel;
                    Intrinsics.checkNotNull(contestDetailModel3);
                    Contest contest = contestDetailModel3.getContest();
                    Intrinsics.checkNotNull(contest);
                    detailViewModel2.getContestWinnings(contest.get_id());
                    ContestDetailModel contestDetailModel4 = this.contestDetailModel;
                    Intrinsics.checkNotNull(contestDetailModel4);
                    this.matchId = contestDetailModel4.getContest().getMatchId();
                    try {
                        ContestDetailModel contestDetailModel5 = this.contestDetailModel;
                        Intrinsics.checkNotNull(contestDetailModel5);
                        contestDetailModel5.getContest().getTotalSpots();
                        ContestDetailModel contestDetailModel6 = this.contestDetailModel;
                        Intrinsics.checkNotNull(contestDetailModel6);
                        Contest contest2 = contestDetailModel6.getContest();
                        Intrinsics.checkNotNull(contest2);
                        contest2.getJoinedUserCount();
                        ContestDetailModel contestDetailModel7 = this.contestDetailModel;
                        Intrinsics.checkNotNull(contestDetailModel7);
                        int typeId = contestDetailModel7.getContest().getContestType().getTypeId();
                        if (typeId == 1) {
                            ContestDetailModel contestDetailModel8 = this.contestDetailModel;
                            Intrinsics.checkNotNull(contestDetailModel8);
                            if (contestDetailModel8.getContest().getUsers() != null) {
                                CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivContest);
                                Intrinsics.checkNotNullExpressionValue(circleImageView, "ivContest");
                                ImageView imageView = circleImageView;
                                ContestDetailModel contestDetailModel9 = this.contestDetailModel;
                                Intrinsics.checkNotNull(contestDetailModel9);
                                String profilePic = contestDetailModel9.getContest().getUsers().getProfilePic();
                                if (profilePic == null) {
                                    profilePic = "";
                                }
                                ExtensionsKt.loadImage$default(imageView, profilePic, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                            }
                            FragmentJoinContestDetailBinding fragmentJoinContestDetailBinding2 = this.binding;
                            Intrinsics.checkNotNull(fragmentJoinContestDetailBinding2);
                            fragmentJoinContestDetailBinding2.ivContestType.setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_private_contest));
                        } else if (typeId != 2) {
                            ((CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_one_one);
                            FragmentJoinContestDetailBinding fragmentJoinContestDetailBinding3 = this.binding;
                            Intrinsics.checkNotNull(fragmentJoinContestDetailBinding3);
                            fragmentJoinContestDetailBinding3.ivContestType.setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_one_one_contest));
                        } else {
                            ((CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
                            ((CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivContest)).setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_mega_contest));
                        }
                        TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvFee);
                        Intrinsics.checkNotNullExpressionValue(textView, "tvFee");
                        CommonMethodsKt.visible(textView);
                        DrawableCompat.setTint(((TextView) _$_findCachedViewById(C1188R.C1192id.tvFee)).getBackground(), ContextCompat.getColor(requireActivity(), C1188R.C1189color.red_dark_l));
                    } catch (Exception e) {
                        Log.v("Exception", e.toString());
                    }
                }
            }
        }
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel = detailViewModel3;
        }
        detailViewModel.getFantasyTeamByMatchApi(this.matchId);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
        Configuration configuration = r2;
        Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
        Amplitude amplitude2 = new Amplitude(configuration);
        this.amplitude = amplitude2;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvFee)).setOnClickListener(this);
        observeData();
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.tvFee) {
            ContestDetailModel contestDetailModel2 = this.contestDetailModel;
            Intrinsics.checkNotNull(contestDetailModel2);
            ContestDetailModel contestDetailModel3 = this.contestDetailModel;
            Intrinsics.checkNotNull(contestDetailModel3);
            ContestDetailModel contestDetailModel4 = this.contestDetailModel;
            Intrinsics.checkNotNull(contestDetailModel4);
            ContestDetailModel contestDetailModel5 = this.contestDetailModel;
            Intrinsics.checkNotNull(contestDetailModel5);
            Bundle bundleOf = BundleKt.bundleOf(TuplesKt.m276to("referCode", contestDetailModel2.getContest().getReferalCode()), TuplesKt.m276to("contestId", contestDetailModel3.getContest().get_id()), TuplesKt.m276to("matchId", contestDetailModel4.getContest().getMatchId()), TuplesKt.m276to("entryFee", String.valueOf(contestDetailModel5.getContest().getEntryFee())));
            if (this.myTeamSize >= 1) {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_joinContestDetailFragment_to_selectTeamFragment, bundleOf);
            } else {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_joinContestDetailFragment_to_createTeamFragment, bundleOf);
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
        getFantasyTeam.observe(viewLifecycleOwner, new JoinContestDetailFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<ContestWinningsModel>> contestWinnings = detailViewModel2.getContestWinnings();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        contestWinnings.observe(viewLifecycleOwner2, new JoinContestDetailFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3490observeData$lambda0(JoinContestDetailFragment joinContestDetailFragment, ApiResponseHandler apiResponseHandler) {
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(joinContestDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            if (WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()] == 1 && (arrayList = (ArrayList) apiResponseHandler.getData()) != null) {
                int size = arrayList.size();
                joinContestDetailFragment.myTeamSize = size;
                if (size > 0) {
                    joinContestDetailFragment.fantasyTeamId = ((FantasyTeamListModel) arrayList.get(0)).get_id();
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3491observeData$lambda1(JoinContestDetailFragment joinContestDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(joinContestDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) joinContestDetailFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ContestWinningsModel contestWinningsModel = (ContestWinningsModel) apiResponseHandler.getData();
                if (contestWinningsModel != null) {
                    if (contestWinningsModel.getWinning().size() == 0) {
                        RelativeLayout relativeLayout = (RelativeLayout) joinContestDetailFragment._$_findCachedViewById(C1188R.C1192id.relativeLayout3);
                        Intrinsics.checkNotNullExpressionValue(relativeLayout, "relativeLayout3");
                        CommonMethodsKt.hide(relativeLayout);
                    }
                    WinningsAdapter winningsAdapter = joinContestDetailFragment.adapter;
                    if (winningsAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        winningsAdapter = null;
                    }
                    winningsAdapter.addList(true, contestWinningsModel.getWinning());
                    ((TextView) joinContestDetailFragment._$_findCachedViewById(C1188R.C1192id.tvPoolPrize)).setText(joinContestDetailFragment.numDifferentiation((double) contestWinningsModel.getContest().getWinningAmount()));
                    ((TextView) joinContestDetailFragment._$_findCachedViewById(C1188R.C1192id.tvSpots)).setText(String.valueOf(contestWinningsModel.getContest().getTotalSpots()));
                    ((TextView) joinContestDetailFragment._$_findCachedViewById(C1188R.C1192id.tvJoiningFee)).setText(joinContestDetailFragment.numDifferentiation((double) contestWinningsModel.getContest().getEntryFee()));
                    FragmentJoinContestDetailBinding fragmentJoinContestDetailBinding = joinContestDetailFragment.binding;
                    Intrinsics.checkNotNull(fragmentJoinContestDetailBinding);
                    fragmentJoinContestDetailBinding.ivContestType.setImageDrawable(AppCompatResources.getDrawable(joinContestDetailFragment.requireActivity(), C1188R.C1190drawable.icon_private_contest));
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = joinContestDetailFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                joinContestDetailFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar2 = (ProgressBar) joinContestDetailFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) joinContestDetailFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
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
