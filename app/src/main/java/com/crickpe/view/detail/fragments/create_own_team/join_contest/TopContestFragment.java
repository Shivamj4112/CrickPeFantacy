package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.app.Dialog;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
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
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.TopContestAdapter;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u0019H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\bH\u0002J\b\u0010\"\u001a\u00020\u001eH\u0002J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u000fH\u0016J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010'\u001a\u00020\u000fH\u0016J\u001a\u0010)\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020%2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u001eH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR*\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000¨\u0006-"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/TopContestAdapter$OnItemClicked;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/TopContestAdapter;", "fantasyTeamId", "", "getFantasyTeamId", "()Ljava/lang/String;", "setFantasyTeamId", "(Ljava/lang/String;)V", "list", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "Lkotlin/collections/ArrayList;", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "matchId", "getMatchId", "setMatchId", "myTeamSize", "", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "joinContestDialog", "", "joinContestDialogA", "contestIdd", "entryFee", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClicked", "topContestModel", "onPriceClicked", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopContestFragment.kt */
public final class TopContestFragment extends BaseFragment implements View.OnClickListener, TopContestAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private TopContestAdapter adapter;
    private String fantasyTeamId = "";
    private ArrayList<TopContestModel> list = new ArrayList<>();
    private String matchId = "";
    private int myTeamSize;
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopContestFragment.kt */
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
        return C1188R.C1193layout.fragment_top_contest;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final ArrayList<TopContestModel> getList() {
        return this.list;
    }

    public final void setList(ArrayList<TopContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list = arrayList;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
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
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvJoinContest)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateContest)).setOnClickListener(onClickListener);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        if (UserManager.INSTANCE.getMatch() != null) {
            UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
            Intrinsics.checkNotNull(match);
            this.matchId = match.get_id();
        }
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getFantasyTeamByMatchApi(this.matchId);
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        detailViewModel2.getTopContest(this.matchId);
        setAdapter();
        observeData();
        String code = UserManager.INSTANCE.getCode();
        if (!Intrinsics.areEqual((Object) code, (Object) "null")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("referalCode", code);
            bundle2.putString("from", "top");
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_privateContestDetailFragment, bundle2);
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
        getTopContests.observe(viewLifecycleOwner, new TopContestFragment$$ExternalSyntheticLambda3(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getFantasyTeam = detailViewModel2.getGetFantasyTeam();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getFantasyTeam.observe(viewLifecycleOwner2, new TopContestFragment$$ExternalSyntheticLambda4(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3556observeData$lambda0(TopContestFragment topContestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(topContestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList<TopContestModel> arrayList = (ArrayList) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) topContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (arrayList != null) {
                    TopContestAdapter topContestAdapter = topContestFragment.adapter;
                    if (topContestAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        topContestAdapter = null;
                    }
                    topContestAdapter.addList(true, arrayList);
                    topContestFragment.list = arrayList;
                }
                if (topContestFragment.list.size() == 0) {
                    TextView textView = (TextView) topContestFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                    Intrinsics.checkNotNullExpressionValue(textView, "tvNoData");
                    CommonMethodsKt.visible(textView);
                }
                Log.v("getTopContests", new Gson().toJson(apiResponseHandler.getData()));
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) topContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = topContestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                topContestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) topContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3557observeData$lambda1(TopContestFragment topContestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(topContestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    int size = arrayList.size();
                    topContestFragment.myTeamSize = size;
                    if (size > 0) {
                        topContestFragment.fantasyTeamId = ((FantasyTeamListModel) arrayList.get(0)).get_id();
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = topContestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                topContestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new TopContestAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopContest);
        TopContestAdapter topContestAdapter = null;
        if (recyclerView != null) {
            TopContestAdapter topContestAdapter2 = this.adapter;
            if (topContestAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                topContestAdapter2 = null;
            }
            recyclerView.setAdapter(topContestAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopContest)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopContest);
        TopContestAdapter topContestAdapter3 = this.adapter;
        if (topContestAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            topContestAdapter = topContestAdapter3;
        }
        recyclerView2.setAdapter(topContestAdapter);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id == C1188R.C1192id.tvCreateContest) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createContestFragment, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("myTeamSize", Integer.valueOf(this.myTeamSize)), TuplesKt.m276to("fantasyTeamId", this.fantasyTeamId)));
        } else if (id == C1188R.C1192id.tvJoinContest) {
            joinContestDialog();
        }
    }

    private final void joinContestDialog() {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        dialog.setContentView(C1188R.C1193layout.dialog_join_contest);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvJoinPool);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvCreateContest);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(C1188R.C1192id.etReferCode);
                if (findViewById3 != null) {
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    window.setLayout(-1, -2);
                    textView.setOnClickListener(new TopContestFragment$$ExternalSyntheticLambda0((EditText) findViewById3, this, dialog));
                    textView2.setOnClickListener(new TopContestFragment$$ExternalSyntheticLambda1(this, dialog));
                    dialog.show();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.EditText");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: joinContestDialog$lambda-2  reason: not valid java name */
    public static final void m3553joinContestDialog$lambda2(EditText editText, TopContestFragment topContestFragment, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(editText, "$etReferCode");
        Intrinsics.checkNotNullParameter(topContestFragment, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Editable text = editText.getText();
        Intrinsics.checkNotNullExpressionValue(text, "etReferCode.text");
        if (text.length() == 0) {
            String string = topContestFragment.getResources().getString(C1188R.string.please_enter_refer_code);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st….please_enter_refer_code)");
            topContestFragment.showToast(string);
            return;
        }
        DetailViewModel detailViewModel = topContestFragment.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getContestDetailApiByCode(StringsKt.trim((CharSequence) editText.getText().toString()).toString());
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: joinContestDialog$lambda-3  reason: not valid java name */
    public static final void m3554joinContestDialog$lambda3(TopContestFragment topContestFragment, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(topContestFragment, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        FragmentKt.findNavController(topContestFragment).navigate((int) C1188R.C1192id.action_contestFragment_to_createContestFragment, BundleKt.bundleOf(TuplesKt.m276to("matchId", topContestFragment.matchId), TuplesKt.m276to("myTeamSize", Integer.valueOf(topContestFragment.myTeamSize)), TuplesKt.m276to("fantasyTeamId", topContestFragment.fantasyTeamId)));
        dialog.dismiss();
    }

    public void onPriceClicked(TopContestModel topContestModel) {
        Intrinsics.checkNotNullParameter(topContestModel, "topContestModel");
        Log.v("TEST", "NOTCALL");
    }

    public void onItemClicked(TopContestModel topContestModel) {
        Intrinsics.checkNotNullParameter(topContestModel, "topContestModel");
        Bundle bundleOf = BundleKt.bundleOf(TuplesKt.m276to("contestId", StringsKt.trim((CharSequence) topContestModel.get_id()).toString()), TuplesKt.m276to("matchId", topContestModel.getMatchId()), TuplesKt.m276to("entryFee", String.valueOf(topContestModel.getEntryFee())));
        if (this.myTeamSize == 1) {
            joinContestDialogA(StringsKt.trim((CharSequence) topContestModel.get_id()).toString(), String.valueOf(topContestModel.getEntryFee()));
        } else {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createTeamFragment2, bundleOf);
        }
    }

    private final void joinContestDialogA(String str, String str2) {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        dialog.setContentView(C1188R.C1193layout.dialog_join_contest_confirmation);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvEntryFee);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvToPay);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(C1188R.C1192id.tvJoinContest);
                if (findViewById3 != null) {
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    textView.setText(8377 + str2);
                    textView2.setText(8377 + str2);
                    window.setLayout(-1, -2);
                    ((TextView) findViewById3).setOnClickListener(new TopContestFragment$$ExternalSyntheticLambda2(dialog));
                    dialog.show();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: joinContestDialogA$lambda-4  reason: not valid java name */
    public static final void m3555joinContestDialogA$lambda4(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }
}
