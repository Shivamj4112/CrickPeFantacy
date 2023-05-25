package com.crickpe.view.detail.fragments.create_contest;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.p004os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.PlayersCountAdapter;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u00106\u001a\u00020'H\u0016J\b\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010<\u001a\u0002082\u0006\u0010=\u001a\u00020!H\u0016J\b\u0010>\u001a\u000208H\u0016J\u001a\u0010?\u001a\u0002082\u0006\u0010:\u001a\u00020;2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010B\u001a\u000208H\u0002J\b\u0010C\u001a\u000208H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\u001e\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010#\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001a\u0010&\u001a\u00020'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R\u000e\u0010/\u001a\u000200X.¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X.¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u00020'X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010)\"\u0004\b5\u0010+¨\u0006D"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/CreateContestFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/PlayersCountAdapter$OnItemClicked;", "()V", "delay", "", "getDelay", "()J", "setDelay", "(J)V", "fantasyTeamId", "", "getFantasyTeamId", "()Ljava/lang/String;", "setFantasyTeamId", "(Ljava/lang/String;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "isMultiplePlayer", "", "()Z", "setMultiplePlayer", "(Z)V", "last_text_edit", "getLast_text_edit", "setLast_text_edit", "list2", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/NumberOfPlayersModel;", "Lkotlin/collections/ArrayList;", "matchId", "getMatchId", "setMatchId", "myTeamSize", "", "getMyTeamSize", "()I", "setMyTeamSize", "(I)V", "numberOfPlayer", "getNumberOfPlayer", "setNumberOfPlayer", "numberofPlayersAdapter", "Lcom/crickpe/view/detail/adapters/PlayersCountAdapter;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "winningAmount", "getWinningAmount", "setWinningAmount", "getFragmentLayoutResId", "observeData", "", "onClick", "view", "Landroid/view/View;", "onItemClicked", "fa", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setWinningAdapter", "textWatcher", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CreateContestFragment.kt */
public final class CreateContestFragment extends BaseFragment implements View.OnClickListener, PlayersCountAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private long delay = 1000;
    private String fantasyTeamId = "";
    private Handler handler = new Handler();
    private boolean isMultiplePlayer;
    private long last_text_edit;
    private ArrayList<NumberOfPlayersModel> list2 = new ArrayList<>();
    private String matchId = "";
    private int myTeamSize;
    private int numberOfPlayer;
    private PlayersCountAdapter numberofPlayersAdapter;
    /* access modifiers changed from: private */
    public DetailViewModel viewModel;
    private int winningAmount;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: CreateContestFragment.kt */
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
        return C1188R.C1193layout.fragment_create_contest;
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

    public final int getWinningAmount() {
        return this.winningAmount;
    }

    public final void setWinningAmount(int i) {
        this.winningAmount = i;
    }

    public final boolean isMultiplePlayer() {
        return this.isMultiplePlayer;
    }

    public final void setMultiplePlayer(boolean z) {
        this.isMultiplePlayer = z;
    }

    public final int getNumberOfPlayer() {
        return this.numberOfPlayer;
    }

    public final void setNumberOfPlayer(int i) {
        this.numberOfPlayer = i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateContest)).setOnClickListener(onClickListener);
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llAllowMultiUserAllow)).setOnClickListener(onClickListener);
        textWatcher();
        observeData();
    }

    public void onResume() {
        super.onResume();
        if (getArguments() != null) {
            this.matchId = String.valueOf(requireArguments().getString("matchId"));
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getFantasyTeamByMatchApi(this.matchId);
        }
        this.list2 = new ArrayList<>();
        setWinningAdapter();
    }

    private final void setWinningAdapter() {
        int i;
        this.list2.clear();
        for (int i2 = 0; i2 < 10; i2++) {
            if (i2 != 0) {
                this.list2.add(new NumberOfPlayersModel(i2 + 1, false));
            }
        }
        if ((!this.list2.isEmpty()) && (i = this.numberOfPlayer) != 0) {
            this.list2.get(i - 2).setSelected(true);
        }
        if (this.isMultiplePlayer) {
            ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivMultipleUser)).setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_circle_green));
        } else {
            ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivMultipleUser)).setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_circle_green_border));
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.numberofPlayersAdapter = new PlayersCountAdapter(this, requireActivity);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        linearLayoutManager.setStackFromEnd(false);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayersAmounts)).setLayoutManager(linearLayoutManager);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvPlayersAmounts);
        PlayersCountAdapter playersCountAdapter = this.numberofPlayersAdapter;
        PlayersCountAdapter playersCountAdapter2 = null;
        if (playersCountAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberofPlayersAdapter");
            playersCountAdapter = null;
        }
        recyclerView.setAdapter(playersCountAdapter);
        PlayersCountAdapter playersCountAdapter3 = this.numberofPlayersAdapter;
        if (playersCountAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("numberofPlayersAdapter");
        } else {
            playersCountAdapter2 = playersCountAdapter3;
        }
        playersCountAdapter2.addList(this.list2);
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

    private final void textWatcher() {
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).addTextChangedListener(new CreateContestFragment$textWatcher$1(this));
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
        getCalculateWin.observe(viewLifecycleOwner, new CreateContestFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getFantasyTeam = detailViewModel2.getGetFantasyTeam();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getFantasyTeam.observe(viewLifecycleOwner2, new CreateContestFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3499observeData$lambda0(CreateContestFragment createContestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(createContestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                RelativeLayout relativeLayout = (RelativeLayout) createContestFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlProgress");
                CommonMethodsKt.hide(relativeLayout);
                CalculateWinModel calculateWinModel = (CalculateWinModel) apiResponseHandler.getData();
                if (calculateWinModel != null) {
                    ((TextView) createContestFragment._$_findCachedViewById(C1188R.C1192id.tvWinningAmount)).setText(String.valueOf(calculateWinModel.getPrizePool()));
                    createContestFragment.winningAmount = calculateWinModel.getPrizePool();
                }
            } else if (i == 2) {
                RelativeLayout relativeLayout2 = (RelativeLayout) createContestFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlProgress");
                CommonMethodsKt.hide(relativeLayout2);
                FragmentActivity requireActivity = createContestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                createContestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", String.valueOf(apiResponseHandler.getError()));
            } else if (i == 3) {
                RelativeLayout relativeLayout3 = (RelativeLayout) createContestFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout3, "rlProgress");
                CommonMethodsKt.visible(relativeLayout3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3500observeData$lambda2(CreateContestFragment createContestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(createContestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    createContestFragment.myTeamSize = arrayList.size();
                    new Handler(Looper.getMainLooper()).post(new CreateContestFragment$$ExternalSyntheticLambda2(arrayList, createContestFragment));
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = createContestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                createContestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2$lambda-1  reason: not valid java name */
    public static final void m3501observeData$lambda2$lambda1(ArrayList arrayList, CreateContestFragment createContestFragment) {
        Intrinsics.checkNotNullParameter(createContestFragment, "this$0");
        if (arrayList.size() > 0) {
            createContestFragment.fantasyTeamId = ((FantasyTeamListModel) arrayList.get(0)).get_id();
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id == C1188R.C1192id.llAllowMultiUserAllow) {
            if (((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).hasFocus()) {
                ((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).clearFocus();
            }
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            CommonMethodsKt.hideKeyboard(requireActivity, (EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee));
            if (this.isMultiplePlayer) {
                this.isMultiplePlayer = false;
                ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivMultipleUser)).setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_circle_green_border));
                return;
            }
            this.isMultiplePlayer = true;
            ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivMultipleUser)).setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_circle_green));
        } else if (id == C1188R.C1192id.tvCreateContest && ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlProgress)).getVisibility() != 0) {
            if (((EditText) _$_findCachedViewById(C1188R.C1192id.etContestName)).getText().toString().length() == 0) {
                String string = requireActivity().getString(C1188R.string.please_enter_contest_name);
                Intrinsics.checkNotNullExpressionValue(string, "requireActivity().getStr…lease_enter_contest_name)");
                showToast(string);
                return;
            }
            if (((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).getText().toString().length() == 0) {
                String string2 = requireActivity().getString(C1188R.string.please_enter_entry_fee);
                Intrinsics.checkNotNullExpressionValue(string2, "requireActivity().getStr…g.please_enter_entry_fee)");
                showToast(string2);
            } else if (Integer.parseInt(((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).getText().toString()) < 10) {
                String string3 = requireActivity().getString(C1188R.string.min_entry_fee);
                Intrinsics.checkNotNullExpressionValue(string3, "requireActivity().getStr…g(R.string.min_entry_fee)");
                showToast(string3);
            } else if (Integer.parseInt(((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).getText().toString()) > 10000) {
                String string4 = requireActivity().getString(C1188R.string.max_entry_fee);
                Intrinsics.checkNotNullExpressionValue(string4, "requireActivity().getStr…g(R.string.max_entry_fee)");
                showToast(string4);
            } else if (this.numberOfPlayer == 0) {
                String string5 = requireActivity().getString(C1188R.string.please_select_number_of_players);
                Intrinsics.checkNotNullExpressionValue(string5, "requireActivity().getStr…select_number_of_players)");
                showToast(string5);
            } else if (this.winningAmount != 0) {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_createContestFragment_to_selectWinnersFragment, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("entryFee", StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).getText().toString()).toString()), TuplesKt.m276to("teams", Integer.valueOf(this.numberOfPlayer)), TuplesKt.m276to("name", StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etContestName)).getText().toString()).toString()), TuplesKt.m276to("winning_amount", String.valueOf(this.winningAmount)), TuplesKt.m276to("isMultipleTeamAllowed", Boolean.valueOf(this.isMultiplePlayer)), TuplesKt.m276to("from", "create_contest")));
            }
        }
    }

    public void onItemClicked(NumberOfPlayersModel numberOfPlayersModel) {
        Intrinsics.checkNotNullParameter(numberOfPlayersModel, "fa");
        this.numberOfPlayer = numberOfPlayersModel.getCount();
        if (((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).hasFocus()) {
            ((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).clearFocus();
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        CommonMethodsKt.hideKeyboard(requireActivity, (EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee));
        try {
            if (this.numberOfPlayer != 0 && !Intrinsics.areEqual((Object) ((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).getText().toString(), (Object) "")) {
                DetailViewModel detailViewModel = this.viewModel;
                if (detailViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel = null;
                }
                detailViewModel.getCalculateWinApi(String.valueOf(this.numberOfPlayer), StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etEntryFee)).getText().toString()).toString(), "");
            }
        } catch (Exception unused) {
        }
    }
}
