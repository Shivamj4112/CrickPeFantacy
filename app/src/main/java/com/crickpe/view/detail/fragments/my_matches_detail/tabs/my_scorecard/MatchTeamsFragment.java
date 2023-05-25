package com.crickpe.view.detail.fragments.my_matches_detail.tabs.my_scorecard;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.ContestTeamAdapter;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamPlayers;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010$\u001a\u00020\nH\u0016J\b\u0010%\u001a\u00020&H\u0002J\u0010\u0010\u0004\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0016J\u0018\u0010)\u001a\u00020&2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\nH\u0016J\u001a\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\b\u00100\u001a\u00020&H\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u0006R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X.¢\u0006\u0002\n\u0000¨\u00061"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/my_scorecard/MatchTeamsFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnItemClicked;", "onClick", "Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnClick;", "(Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnClick;)V", "adapter", "Lcom/crickpe/view/detail/adapters/ContestTeamAdapter;", "clickItem", "", "getClickItem", "()I", "setClickItem", "(I)V", "contestId", "", "getContestId", "()Ljava/lang/String;", "setContestId", "(Ljava/lang/String;)V", "matchId", "getMatchId", "setMatchId", "getOnClick", "()Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnClick;", "setOnClick", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamPlayers;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "observeData", "", "view", "Landroid/view/View;", "onItemClicked", "data", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "adapterPosition", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MatchTeamsFragment.kt */
public final class MatchTeamsFragment extends BaseFragment implements View.OnClickListener, ContestTeamAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ContestTeamAdapter adapter;
    private int clickItem;
    private String contestId;
    private String matchId;
    private ContestTeamAdapter.OnClick onClick;
    private ArrayList<FantasyTeamPlayers> playersList;
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MatchTeamsFragment.kt */
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
        return C1188R.C1193layout.fragment_match_teams;
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public MatchTeamsFragment(ContestTeamAdapter.OnClick onClick2) {
        Intrinsics.checkNotNullParameter(onClick2, "onClick");
        this.onClick = onClick2;
        this.matchId = "";
        this.playersList = new ArrayList<>();
        this.contestId = "";
    }

    public final ContestTeamAdapter.OnClick getOnClick() {
        return this.onClick;
    }

    public final void setOnClick(ContestTeamAdapter.OnClick onClick2) {
        Intrinsics.checkNotNullParameter(onClick2, "<set-?>");
        this.onClick = onClick2;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
    }

    public final ArrayList<FantasyTeamPlayers> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<FantasyTeamPlayers> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final void setContestId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contestId = str;
    }

    public final int getClickItem() {
        return this.clickItem;
    }

    public final void setClickItem(int i) {
        this.clickItem = i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        setAdapter();
        if (getArguments() != null) {
            this.contestId = String.valueOf(requireArguments().getString("contestId"));
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getContestTeam(this.contestId);
        }
        ((SwipeRefreshLayout) _$_findCachedViewById(C1188R.C1192id.swipeRv)).setOnRefreshListener(new MatchTeamsFragment$$ExternalSyntheticLambda0(this));
        observeData();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m3577onViewCreated$lambda0(MatchTeamsFragment matchTeamsFragment) {
        Intrinsics.checkNotNullParameter(matchTeamsFragment, "this$0");
        if (!Intrinsics.areEqual((Object) matchTeamsFragment.contestId, (Object) "")) {
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) matchTeamsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(true);
            }
            DetailViewModel detailViewModel = matchTeamsFragment.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getContestTeam(matchTeamsFragment.contestId);
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getContestTeam = detailViewModel.getGetContestTeam();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getContestTeam.observe(viewLifecycleOwner, new MatchTeamsFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3576observeData$lambda1(MatchTeamsFragment matchTeamsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(matchTeamsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) matchTeamsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout != null) {
                    swipeRefreshLayout.setRefreshing(false);
                }
                ProgressBar progressBar = (ProgressBar) matchTeamsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (arrayList != null) {
                    ContestTeamAdapter contestTeamAdapter = matchTeamsFragment.adapter;
                    ContestTeamAdapter contestTeamAdapter2 = null;
                    if (contestTeamAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        contestTeamAdapter = null;
                    }
                    contestTeamAdapter.getFantasyTeamListModels().clear();
                    ContestTeamAdapter contestTeamAdapter3 = matchTeamsFragment.adapter;
                    if (contestTeamAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        contestTeamAdapter2 = contestTeamAdapter3;
                    }
                    contestTeamAdapter2.addList(true, arrayList);
                    RecyclerView.LayoutManager layoutManager = ((RecyclerView) matchTeamsFragment._$_findCachedViewById(C1188R.C1192id.rvFantasyTeams)).getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.scrollToPosition(matchTeamsFragment.clickItem);
                    }
                }
            } else if (i == 2) {
                SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) matchTeamsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(false);
                }
                ProgressBar progressBar2 = (ProgressBar) matchTeamsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = matchTeamsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                matchTeamsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) matchTeamsFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
                if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                    z = false;
                }
                if (z) {
                    ProgressBar progressBar3 = (ProgressBar) matchTeamsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                    CommonMethodsKt.visible(progressBar3);
                }
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new ContestTeamAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFantasyTeams);
        ContestTeamAdapter contestTeamAdapter = null;
        if (recyclerView != null) {
            ContestTeamAdapter contestTeamAdapter2 = this.adapter;
            if (contestTeamAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                contestTeamAdapter2 = null;
            }
            recyclerView.setAdapter(contestTeamAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFantasyTeams)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFantasyTeams);
        ContestTeamAdapter contestTeamAdapter3 = this.adapter;
        if (contestTeamAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            contestTeamAdapter = contestTeamAdapter3;
        }
        recyclerView2.setAdapter(contestTeamAdapter);
    }

    public void onItemClicked(FantasyTeamListModel fantasyTeamListModel, int i) {
        Intrinsics.checkNotNullParameter(fantasyTeamListModel, "data");
        this.onClick.onTeamClick(fantasyTeamListModel, i);
        this.clickItem = i;
    }
}
