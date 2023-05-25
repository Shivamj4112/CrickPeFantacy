package com.crickpe.view.detail.fragments.contest_winners;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.databinding.FragmentContestWinnerBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.ContestWinnerFilterAdapter;
import com.crickpe.view.detail.adapters.MegaWinnerAmountAdapter;
import com.crickpe.view.detail.adapters.WinnerListAdapter;
import com.crickpe.view.detail.fragments.contest_winners.models.model.ContestDetailWinnersModel;
import com.crickpe.view.detail.fragments.contest_winners.models.model.MegaContestAmtModel;
import com.crickpe.view.detail.fragments.contest_winners.models.model.WinnerFilter;
import com.crickpe.view.detail.fragments.contest_winners.models.model.WinnersList;
import com.crickpe.view.home.fragments.winner.models.MegaWinnersM;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u00101\u001a\u00020\u0019H\u0016J\b\u00102\u001a\u000203H\u0002J\u0010\u00104\u001a\u0002032\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u0002032\u0006\u0010\u0010\u001a\u000208H\u0016J\u0010\u00107\u001a\u0002032\u0006\u00109\u001a\u00020\"H\u0016J\b\u0010:\u001a\u000203H\u0002J\b\u0010;\u001a\u000203H\u0016J\u000e\u0010<\u001a\u00020\u00172\u0006\u0010=\u001a\u00020>J\u001a\u0010?\u001a\u0002032\u0006\u00105\u001a\u0002062\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010B\u001a\u000203H\u0002J \u0010C\u001a\u0002032\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000b\"\u0004\b \u0010\rR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X.¢\u0006\u0002\n\u0000R*\u0010)\u001a\u0012\u0012\u0004\u0012\u00020+0*j\b\u0012\u0004\u0012\u00020+`,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100¨\u0006E"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_winners/ContestWinnersFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter$OnClickAmount;", "Lcom/crickpe/view/detail/adapters/ContestWinnerFilterAdapter$OnItemClicked;", "()V", "binding", "Lcom/crickpe/databinding/FragmentContestWinnerBinding;", "filterId", "", "getFilterId", "()Ljava/lang/String;", "setFilterId", "(Ljava/lang/String;)V", "megaWinnerAmountAdapter", "Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter;", "megaWinnerModel", "Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;", "getMegaWinnerModel", "()Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;", "setMegaWinnerModel", "(Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;)V", "moreData", "", "page", "", "getPage", "()I", "setPage", "(I)V", "playerFilter", "getPlayerFilter", "setPlayerFilter", "selectedFilter", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/WinnerFilter;", "topPlayerFilterAdapter", "Lcom/crickpe/view/detail/adapters/ContestWinnerFilterAdapter;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "winnerListAdapter", "Lcom/crickpe/view/detail/adapters/WinnerListAdapter;", "winnersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/WinnersList;", "Lkotlin/collections/ArrayList;", "getWinnersList", "()Ljava/util/ArrayList;", "setWinnersList", "(Ljava/util/ArrayList;)V", "getFragmentLayoutResId", "observeData", "", "onClick", "view", "Landroid/view/View;", "onItemClicked", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/MegaContestAmtModel;", "fa", "onRecyclerViewScrolled", "onResume", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setPagination", "data", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestWinnersFragment.kt */
public final class ContestWinnersFragment extends BaseFragment implements View.OnClickListener, MegaWinnerAmountAdapter.OnClickAmount, ContestWinnerFilterAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private FragmentContestWinnerBinding binding;
    private String filterId = "";
    private MegaWinnerAmountAdapter megaWinnerAmountAdapter;
    private MegaWinnersM megaWinnerModel = UserManager.INSTANCE.getMegaWinner();
    /* access modifiers changed from: private */
    public boolean moreData;
    private int page = 1;
    private String playerFilter = "";
    private WinnerFilter selectedFilter;
    private ContestWinnerFilterAdapter topPlayerFilterAdapter;
    /* access modifiers changed from: private */
    public DetailViewModel viewModel;
    private WinnerListAdapter winnerListAdapter;
    private ArrayList<WinnersList> winnersList = new ArrayList<>();

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestWinnersFragment.kt */
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
        return C1188R.C1193layout.fragment_contest_winner;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final int getPage() {
        return this.page;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final ArrayList<WinnersList> getWinnersList() {
        return this.winnersList;
    }

    public final void setWinnersList(ArrayList<WinnersList> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.winnersList = arrayList;
    }

    public final MegaWinnersM getMegaWinnerModel() {
        return this.megaWinnerModel;
    }

    public final void setMegaWinnerModel(MegaWinnersM megaWinnersM) {
        this.megaWinnerModel = megaWinnersM;
    }

    public final String getFilterId() {
        return this.filterId;
    }

    public final void setFilterId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filterId = str;
    }

    public final String getPlayerFilter() {
        return this.playerFilter;
    }

    public final void setPlayerFilter(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.playerFilter = str;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getResources().getString(C1188R.string.mega_contest_winner);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.mega_contest_winner)");
            ((DetailActivity) activity).setTopBar(string, true, false, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0035, code lost:
        r3 = r3.getContest();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(View r6, android.os.Bundle r7) {
        /*
            r5 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            super.onViewCreated(r6, r7)
            com.crickpe.databinding.FragmentContestWinnerBinding r6 = com.crickpe.databinding.FragmentContestWinnerBinding.bind(r6)
            r5.binding = r6
            androidx.lifecycle.ViewModelProvider r6 = new androidx.lifecycle.ViewModelProvider
            r7 = r5
            androidx.lifecycle.ViewModelStoreOwner r7 = (androidx.lifecycle.ViewModelStoreOwner) r7
            r6.<init>(r7)
            java.lang.Class<com.crickpe.view.detail.DetailViewModel> r7 = com.crickpe.view.detail.DetailViewModel.class
            androidx.lifecycle.ViewModel r6 = r6.get(r7)
            com.crickpe.view.detail.DetailViewModel r6 = (com.crickpe.view.detail.DetailViewModel) r6
            r5.viewModel = r6
            com.crickpe.view.home.fragments.winner.models.MegaWinnersM r7 = r5.megaWinnerModel
            if (r7 == 0) goto L_0x0078
            java.lang.String r7 = "viewModel"
            java.lang.String r0 = "megaWinnerModel"
            r1 = 0
            if (r6 != 0) goto L_0x002f
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)     // Catch:{ Exception -> 0x0070 }
            r6 = r1
        L_0x002f:
            int r2 = r5.page     // Catch:{ Exception -> 0x0070 }
            com.crickpe.view.home.fragments.winner.models.MegaWinnersM r3 = r5.megaWinnerModel     // Catch:{ Exception -> 0x0070 }
            if (r3 == 0) goto L_0x0040
            com.crickpe.view.home.fragments.winner.models.Contest r3 = r3.getContest()     // Catch:{ Exception -> 0x0070 }
            if (r3 == 0) goto L_0x0040
            java.lang.String r3 = r3.get_id()     // Catch:{ Exception -> 0x0070 }
            goto L_0x0041
        L_0x0040:
            r3 = r1
        L_0x0041:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x0070 }
            java.lang.String r4 = r5.playerFilter     // Catch:{ Exception -> 0x0070 }
            r6.getContestWinnerDetailApi(r2, r3, r4)     // Catch:{ Exception -> 0x0070 }
            com.crickpe.view.detail.DetailViewModel r6 = r5.viewModel     // Catch:{ Exception -> 0x0070 }
            if (r6 != 0) goto L_0x0052
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r7)     // Catch:{ Exception -> 0x0070 }
            r6 = r1
        L_0x0052:
            com.crickpe.view.home.fragments.winner.models.MegaWinnersM r7 = r5.megaWinnerModel     // Catch:{ Exception -> 0x0070 }
            if (r7 == 0) goto L_0x005a
            java.lang.String r1 = r7.get_id()     // Catch:{ Exception -> 0x0070 }
        L_0x005a:
            java.lang.String r7 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0070 }
            r6.getMegaContestAmountApi(r7)     // Catch:{ Exception -> 0x0070 }
            com.google.gson.Gson r6 = new com.google.gson.Gson     // Catch:{ Exception -> 0x0070 }
            r6.<init>()     // Catch:{ Exception -> 0x0070 }
            com.crickpe.view.home.fragments.winner.models.MegaWinnersM r7 = r5.megaWinnerModel     // Catch:{ Exception -> 0x0070 }
            java.lang.String r6 = r6.toJson((java.lang.Object) r7)     // Catch:{ Exception -> 0x0070 }
            android.util.Log.v(r0, r6)     // Catch:{ Exception -> 0x0070 }
            goto L_0x0078
        L_0x0070:
            r6 = move-exception
            java.lang.String r6 = r6.toString()
            android.util.Log.v(r0, r6)
        L_0x0078:
            com.crickpe.databinding.FragmentContestWinnerBinding r6 = r5.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            android.widget.ImageView r6 = r6.ivFiler
            r7 = r5
            android.view.View$OnClickListener r7 = (android.view.View.OnClickListener) r7
            r6.setOnClickListener(r7)
            r5.observeData()
            r5.setAdapter()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.contest_winners.ContestWinnersFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ContestDetailWinnersModel>> getContestWinnerDetails = detailViewModel.getGetContestWinnerDetails();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getContestWinnerDetails.observe(viewLifecycleOwner, new ContestWinnersFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<MegaContestAmtModel>>> getMegaContestAmount = detailViewModel2.getGetMegaContestAmount();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getMegaContestAmount.observe(viewLifecycleOwner2, new ContestWinnersFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3496observeData$lambda0(ContestWinnersFragment contestWinnersFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(contestWinnersFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ContestDetailWinnersModel contestDetailWinnersModel = (ContestDetailWinnersModel) apiResponseHandler.getData();
                if (contestDetailWinnersModel != null) {
                    FragmentContestWinnerBinding fragmentContestWinnerBinding = contestWinnersFragment.binding;
                    Intrinsics.checkNotNull(fragmentContestWinnerBinding);
                    fragmentContestWinnerBinding.setModel(contestDetailWinnersModel);
                    if (contestDetailWinnersModel.getWinners().getWinnersList().size() > 0) {
                        ArrayList<WinnersList> winnersList2 = contestDetailWinnersModel.getWinners().getWinnersList();
                        contestWinnersFragment.winnersList = winnersList2;
                        contestWinnersFragment.setPagination(winnersList2);
                        ContestWinnerFilterAdapter contestWinnerFilterAdapter = contestWinnersFragment.topPlayerFilterAdapter;
                        ContestWinnerFilterAdapter contestWinnerFilterAdapter2 = null;
                        if (contestWinnerFilterAdapter == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
                            contestWinnerFilterAdapter = null;
                        }
                        contestWinnerFilterAdapter.getFilterModel().clear();
                        ContestWinnerFilterAdapter contestWinnerFilterAdapter3 = contestWinnersFragment.topPlayerFilterAdapter;
                        if (contestWinnerFilterAdapter3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
                        } else {
                            contestWinnerFilterAdapter2 = contestWinnerFilterAdapter3;
                        }
                        contestWinnerFilterAdapter2.addList(contestDetailWinnersModel.getWinnerFilters(), contestWinnersFragment.selectedFilter);
                    }
                }
                ProgressBar progressBar = (ProgressBar) contestWinnersFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
            } else if (i == 2) {
                FragmentActivity requireActivity = contestWinnersFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                contestWinnersFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar2 = (ProgressBar) contestWinnersFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                Log.v("getContestWinnerDetails", new Gson().toJson((Object) apiResponseHandler.getError()));
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) contestWinnersFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3497observeData$lambda1(ContestWinnersFragment contestWinnersFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(contestWinnersFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    contestWinnersFragment.filterId = ((MegaContestAmtModel) arrayList.get(0)).get_id();
                    MegaWinnerAmountAdapter megaWinnerAmountAdapter2 = contestWinnersFragment.megaWinnerAmountAdapter;
                    if (megaWinnerAmountAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("megaWinnerAmountAdapter");
                        megaWinnerAmountAdapter2 = null;
                    }
                    megaWinnerAmountAdapter2.addList(true, arrayList);
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = contestWinnersFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                contestWinnersFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("getMegaContestAmount", new Gson().toJson((Object) apiResponseHandler.getError()));
            }
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.ivFiler) {
            FragmentContestWinnerBinding fragmentContestWinnerBinding = this.binding;
            Intrinsics.checkNotNull(fragmentContestWinnerBinding);
            RelativeLayout relativeLayout = fragmentContestWinnerBinding.rlFilterContest;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding!!.rlFilterContest");
            if (relativeLayout.getVisibility() == 0) {
                FragmentContestWinnerBinding fragmentContestWinnerBinding2 = this.binding;
                Intrinsics.checkNotNull(fragmentContestWinnerBinding2);
                RelativeLayout relativeLayout2 = fragmentContestWinnerBinding2.rlFilterContest;
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "binding!!.rlFilterContest");
                CommonMethodsKt.hide(relativeLayout2);
                return;
            }
            FragmentContestWinnerBinding fragmentContestWinnerBinding3 = this.binding;
            Intrinsics.checkNotNull(fragmentContestWinnerBinding3);
            RelativeLayout relativeLayout3 = fragmentContestWinnerBinding3.rlFilterContest;
            Intrinsics.checkNotNullExpressionValue(relativeLayout3, "binding!!.rlFilterContest");
            CommonMethodsKt.visible(relativeLayout3);
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.winnerListAdapter = new WinnerListAdapter(requireActivity, false);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnersList);
        ContestWinnerFilterAdapter contestWinnerFilterAdapter = null;
        if (recyclerView != null) {
            WinnerListAdapter winnerListAdapter2 = this.winnerListAdapter;
            if (winnerListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("winnerListAdapter");
                winnerListAdapter2 = null;
            }
            recyclerView.setAdapter(winnerListAdapter2);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnersList);
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        }
        RecyclerView recyclerView3 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnersList);
        if (recyclerView3 != null) {
            WinnerListAdapter winnerListAdapter3 = this.winnerListAdapter;
            if (winnerListAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("winnerListAdapter");
                winnerListAdapter3 = null;
            }
            recyclerView3.setAdapter(winnerListAdapter3);
        }
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
        this.megaWinnerAmountAdapter = new MegaWinnerAmountAdapter(requireActivity2, this);
        RecyclerView recyclerView4 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.recyclerView);
        if (recyclerView4 != null) {
            MegaWinnerAmountAdapter megaWinnerAmountAdapter2 = this.megaWinnerAmountAdapter;
            if (megaWinnerAmountAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("megaWinnerAmountAdapter");
                megaWinnerAmountAdapter2 = null;
            }
            recyclerView4.setAdapter(megaWinnerAmountAdapter2);
        }
        RecyclerView recyclerView5 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.recyclerView);
        if (recyclerView5 != null) {
            recyclerView5.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        }
        RecyclerView recyclerView6 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.recyclerView);
        if (recyclerView6 != null) {
            MegaWinnerAmountAdapter megaWinnerAmountAdapter3 = this.megaWinnerAmountAdapter;
            if (megaWinnerAmountAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("megaWinnerAmountAdapter");
                megaWinnerAmountAdapter3 = null;
            }
            recyclerView6.setAdapter(megaWinnerAmountAdapter3);
        }
        FragmentActivity requireActivity3 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity3, "requireActivity()");
        this.topPlayerFilterAdapter = new ContestWinnerFilterAdapter(this, requireActivity3);
        FragmentContestWinnerBinding fragmentContestWinnerBinding = this.binding;
        Intrinsics.checkNotNull(fragmentContestWinnerBinding);
        RecyclerView recyclerView7 = fragmentContestWinnerBinding.rvFilterWinners;
        ContestWinnerFilterAdapter contestWinnerFilterAdapter2 = this.topPlayerFilterAdapter;
        if (contestWinnerFilterAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
            contestWinnerFilterAdapter2 = null;
        }
        recyclerView7.setAdapter(contestWinnerFilterAdapter2);
        FragmentContestWinnerBinding fragmentContestWinnerBinding2 = this.binding;
        Intrinsics.checkNotNull(fragmentContestWinnerBinding2);
        fragmentContestWinnerBinding2.rvFilterWinners.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        FragmentContestWinnerBinding fragmentContestWinnerBinding3 = this.binding;
        Intrinsics.checkNotNull(fragmentContestWinnerBinding3);
        RecyclerView recyclerView8 = fragmentContestWinnerBinding3.rvFilterWinners;
        ContestWinnerFilterAdapter contestWinnerFilterAdapter3 = this.topPlayerFilterAdapter;
        if (contestWinnerFilterAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
        } else {
            contestWinnerFilterAdapter = contestWinnerFilterAdapter3;
        }
        recyclerView8.setAdapter(contestWinnerFilterAdapter);
        onRecyclerViewScrolled();
    }

    private final void setPagination(ArrayList<WinnersList> arrayList) {
        boolean z = true;
        if (this.page == 1) {
            if (arrayList.isEmpty()) {
                Log.v("MORE_DATA", "NO");
            } else {
                Log.v("MORE_DATA", "YES");
            }
        }
        boolean z2 = this.page == 1;
        WinnerListAdapter winnerListAdapter2 = this.winnerListAdapter;
        if (winnerListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("winnerListAdapter");
            winnerListAdapter2 = null;
        }
        winnerListAdapter2.addList(z2, this.winnersList);
        if (arrayList.size() != 10) {
            z = false;
        }
        this.moreData = z;
    }

    private final void onRecyclerViewScrolled() {
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinnersList)).addOnScrollListener(new ContestWinnersFragment$onRecyclerViewScrolled$1(this));
    }

    public void onItemClicked(MegaContestAmtModel megaContestAmtModel) {
        Intrinsics.checkNotNullParameter(megaContestAmtModel, "megaWinnerModel");
        this.page = 0;
        this.filterId = megaContestAmtModel.get_id();
        WinnerListAdapter winnerListAdapter2 = this.winnerListAdapter;
        DetailViewModel detailViewModel = null;
        if (winnerListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("winnerListAdapter");
            winnerListAdapter2 = null;
        }
        winnerListAdapter2.getPlayersList().clear();
        DetailViewModel detailViewModel2 = this.viewModel;
        if (detailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel = detailViewModel2;
        }
        detailViewModel.getContestWinnerDetailApi(1, megaContestAmtModel.get_id(), "");
    }

    public void onItemClicked(WinnerFilter winnerFilter) {
        Intrinsics.checkNotNullParameter(winnerFilter, "fa");
        WinnerListAdapter winnerListAdapter2 = this.winnerListAdapter;
        DetailViewModel detailViewModel = null;
        if (winnerListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("winnerListAdapter");
            winnerListAdapter2 = null;
        }
        winnerListAdapter2.getPlayersList().clear();
        this.selectedFilter = winnerFilter;
        this.page = 0;
        FragmentContestWinnerBinding fragmentContestWinnerBinding = this.binding;
        Intrinsics.checkNotNull(fragmentContestWinnerBinding);
        RelativeLayout relativeLayout = fragmentContestWinnerBinding.rlFilterContest;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding!!.rlFilterContest");
        CommonMethodsKt.hide(relativeLayout);
        this.playerFilter = String.valueOf(winnerFilter.getFilterId());
        DetailViewModel detailViewModel2 = this.viewModel;
        if (detailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel = detailViewModel2;
        }
        detailViewModel.getContestWinnerDetailApi(this.page, this.filterId, String.valueOf(winnerFilter.getFilterId()));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "event");
        if (motionEvent.getAction() != 4) {
            return false;
        }
        System.out.println("TOuch outside the dialog ******************** ");
        return false;
    }
}
