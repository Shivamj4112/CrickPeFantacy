package com.crickpe.view.detail.fragments.create_contest;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p004os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.CreateContestRequest;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.WinnersCountAdapter;
import com.crickpe.view.detail.adapters.WinnersRankAdapter;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0014H\u0016J\b\u0010/\u001a\u00020-H\u0002J\u0010\u00100\u001a\u00020-2\u0006\u00101\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020-2\u0006\u00104\u001a\u00020\u0017H\u0016J\b\u00105\u001a\u00020-H\u0016J\u001a\u00106\u001a\u00020-2\u0006\u00101\u001a\u0002022\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u00109\u001a\u00020-H\u0002J\b\u0010:\u001a\u00020-H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0013j\b\u0012\u0004\u0012\u00020\u0017`\u0015X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u000e\u0010\u001b\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\n\"\u0004\b\u001e\u0010\fR\u001a\u0010\u001f\u001a\u00020\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010\fR\u000e\u0010+\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006;"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/SelectWinnersFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/WinnersCountAdapter$OnItemClicked;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/WinnersCountAdapter;", "entryFee", "", "getEntryFee", "()Ljava/lang/String;", "setEntryFee", "(Ljava/lang/String;)V", "fantasyTeamId", "getFantasyTeamId", "setFantasyTeamId", "isMultipleTeamAllowed", "", "list", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "list2", "Lcom/crickpe/view/detail/fragments/create_contest/NumberOfWinnersModel;", "matchId", "getMatchId", "setMatchId", "myTeamSize", "name", "getName", "setName", "teams", "getTeams", "()I", "setTeams", "(I)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "winnersRanksAdapter", "Lcom/crickpe/view/detail/adapters/WinnersRankAdapter;", "winningAmount", "getWinningAmount", "setWinningAmount", "winningNo", "callApi", "", "getFragmentLayoutResId", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClicked", "fa", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setWinningAdapter", "setWinningRanks", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SelectWinnersFragment.kt */
public final class SelectWinnersFragment extends BaseFragment implements View.OnClickListener, WinnersCountAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private WinnersCountAdapter adapter;
    private String entryFee = "";
    private String fantasyTeamId = "";
    private boolean isMultipleTeamAllowed;
    private ArrayList<Integer> list = new ArrayList<>();
    private ArrayList<NumberOfWinnersModel> list2 = new ArrayList<>();
    private String matchId = "";
    private int myTeamSize;
    private String name = "";
    private int teams;
    private DetailViewModel viewModel;
    private WinnersRankAdapter winnersRanksAdapter;
    private String winningAmount = "";
    private int winningNo;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SelectWinnersFragment.kt */
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
        return C1188R.C1193layout.fragment_select_winners;
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

    public final String getEntryFee() {
        return this.entryFee;
    }

    public final void setEntryFee(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.entryFee = str;
    }

    public final int getTeams() {
        return this.teams;
    }

    public final void setTeams(int i) {
        this.teams = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getWinningAmount() {
        return this.winningAmount;
    }

    public final void setWinningAmount(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.winningAmount = str;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }

    public final void setFantasyTeamId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fantasyTeamId = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        if (getArguments() != null) {
            this.matchId = String.valueOf(requireArguments().getString("matchId"));
            this.entryFee = String.valueOf(requireArguments().getString("entryFee"));
            this.teams = requireArguments().getInt("teams");
            this.name = String.valueOf(requireArguments().getString("name"));
            this.winningAmount = String.valueOf(requireArguments().getString("winning_amount"));
            this.isMultipleTeamAllowed = requireArguments().getBoolean("isMultipleTeamAllowed", false);
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getFantasyTeamByMatchApi(this.matchId);
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvWinningAmount)).setText(numDifferentiation(toDouble(this.winningAmount)));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvEntry)).setText(String.valueOf(numDifferentiation(toDouble(this.entryFee))));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContestSize)).setText(String.valueOf(this.teams));
        }
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateContest)).setOnClickListener(this);
        setWinningAdapter();
        observeData();
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("", false, true, true, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    private final void setWinningAdapter() {
        this.list = new ArrayList<>();
        this.list2 = new ArrayList<>();
        this.list.add(1);
        this.list.add(2);
        this.list.add(3);
        this.list.add(4);
        this.list.add(5);
        this.list.add(7);
        this.list.add(10);
        this.list.add(25);
        this.list.add(50);
        this.list.add(100);
        this.list.add(Integer.valueOf(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION));
        this.list.add(500);
        this.list.add(1000);
        this.list.add(2500);
        this.list.add(5000);
        this.list.add(10000);
        int size = this.list.size();
        for (int i = 0; i < size; i++) {
            if (this.list.get(i).intValue() * 2 <= this.teams) {
                Integer num = this.list.get(i);
                Intrinsics.checkNotNullExpressionValue(num, "list[i]");
                this.list2.add(new NumberOfWinnersModel(num.intValue(), false));
            }
        }
        CollectionsKt.reverse(this.list2);
        this.list2.get(0).setSelected(true);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new WinnersCountAdapter(this, requireActivity);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        linearLayoutManager.setStackFromEnd(false);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinningAmounts)).setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinningAmounts);
        WinnersCountAdapter winnersCountAdapter = this.adapter;
        WinnersCountAdapter winnersCountAdapter2 = null;
        if (winnersCountAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            winnersCountAdapter = null;
        }
        recyclerView.setAdapter(winnersCountAdapter);
        WinnersCountAdapter winnersCountAdapter3 = this.adapter;
        if (winnersCountAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            winnersCountAdapter2 = winnersCountAdapter3;
        }
        winnersCountAdapter2.addList(this.list2);
        int count = ((NumberOfWinnersModel) CollectionsKt.first(this.list2)).getCount();
        this.winningNo = count;
        String valueOf = String.valueOf(count * 2);
        if (this.winningNo == 1) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llFewerWinners);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llFewerWinners");
            CommonMethodsKt.hide(linearLayout);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llFewerWinners);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llFewerWinners");
            CommonMethodsKt.visible(linearLayout2);
        }
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvFewerWinner)).setText(getResources().getString(C1188R.string.there_will_be_fewer_winners_if_less_than_) + ' ' + valueOf + " teams join");
        callApi();
        setWinningRanks();
    }

    private final void setWinningRanks() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.winnersRanksAdapter = new WinnersRankAdapter(requireActivity);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, false);
        linearLayoutManager.setStackFromEnd(false);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvRanks)).setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvRanks);
        WinnersRankAdapter winnersRankAdapter = this.winnersRanksAdapter;
        if (winnersRankAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("winnersRanksAdapter");
            winnersRankAdapter = null;
        }
        recyclerView.setAdapter(winnersRankAdapter);
    }

    private final void callApi() {
        Log.v("callApi->", this.teams + " Fee" + this.entryFee + " Winners" + this.winningNo);
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getCalculateWinApi(String.valueOf(this.teams), this.entryFee, String.valueOf(this.winningNo));
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<CalculateWinModel>> getCalculateWin = detailViewModel.getGetCalculateWin();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getCalculateWin.observe(viewLifecycleOwner, new SelectWinnersFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getFantasyTeam = detailViewModel2.getGetFantasyTeam();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getFantasyTeam.observe(viewLifecycleOwner2, new SelectWinnersFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3502observeData$lambda0(SelectWinnersFragment selectWinnersFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(selectWinnersFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                CalculateWinModel calculateWinModel = (CalculateWinModel) apiResponseHandler.getData();
                Log.v("getCalculateWin2", new Gson().toJson((Object) calculateWinModel));
                if (calculateWinModel != null) {
                    WinnersRankAdapter winnersRankAdapter = selectWinnersFragment.winnersRanksAdapter;
                    if (winnersRankAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("winnersRanksAdapter");
                        winnersRankAdapter = null;
                    }
                    winnersRankAdapter.addList(calculateWinModel.getTeamWinnings());
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = selectWinnersFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                selectWinnersFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("getCalculateWin", "ERROR");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3503observeData$lambda2(SelectWinnersFragment selectWinnersFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(selectWinnersFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    selectWinnersFragment.myTeamSize = arrayList.size();
                    new Handler(Looper.getMainLooper()).post(new SelectWinnersFragment$$ExternalSyntheticLambda2(arrayList, selectWinnersFragment));
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = selectWinnersFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                selectWinnersFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2$lambda-1  reason: not valid java name */
    public static final void m3504observeData$lambda2$lambda1(ArrayList arrayList, SelectWinnersFragment selectWinnersFragment) {
        Intrinsics.checkNotNullParameter(selectWinnersFragment, "this$0");
        if (arrayList.size() > 0) {
            selectWinnersFragment.fantasyTeamId = ((FantasyTeamListModel) arrayList.get(0)).get_id();
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        UserManager.INSTANCE.saveContestData(new CreateContestRequest(this.matchId, this.name, String.valueOf(this.teams), this.entryFee, String.valueOf(this.winningNo), this.isMultipleTeamAllowed, ""));
        if (view.getId() == C1188R.C1192id.tvCreateContest) {
            Bundle bundleOf = BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("contestTypeId", "1"), TuplesKt.m276to("entryFee", StringsKt.trim((CharSequence) this.entryFee).toString()), TuplesKt.m276to("from", "create_contest"));
            if (this.myTeamSize >= 1) {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_selectWinnersFragment_to_selectTeamFragment, bundleOf);
            } else {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_selectWinnersFragment_to_createTeamFragment, bundleOf);
            }
        }
    }

    public void onItemClicked(NumberOfWinnersModel numberOfWinnersModel) {
        Intrinsics.checkNotNullParameter(numberOfWinnersModel, "fa");
        int count = numberOfWinnersModel.getCount();
        this.winningNo = count;
        if (count == 1) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llFewerWinners);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llFewerWinners");
            CommonMethodsKt.hide(linearLayout);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llFewerWinners);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llFewerWinners");
            CommonMethodsKt.visible(linearLayout2);
        }
        String valueOf = String.valueOf(this.winningNo * 2);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvFewerWinner)).setText(getResources().getString(C1188R.string.there_will_be_fewer_winners_if_less_than_) + ' ' + valueOf + " teams join");
        callApi();
    }
}
