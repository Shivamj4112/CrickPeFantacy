package com.crickpe.view.detail.fragments.create_own_team.my_contest;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
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
import com.crickpe.view.detail.adapters.MyContestAdapter;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/MyContestAdapter$MyContestClick;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/MyContestAdapter;", "matchId", "", "getMatchId", "()Ljava/lang/String;", "setMatchId", "(Ljava/lang/String;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "myContestClick", "", "model", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "observeData", "onClick", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyContestFragment.kt */
public final class MyContestFragment extends BaseFragment implements View.OnClickListener, MyContestAdapter.MyContestClick {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private MyContestAdapter adapter;
    private String matchId = "";
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyContestFragment.kt */
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
        return C1188R.C1193layout.fragment_my_contest;
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
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

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        if (UserManager.INSTANCE.getMatch() != null) {
            UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
            Intrinsics.checkNotNull(match);
            this.matchId = match.get_id();
        }
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getMyContest(this.matchId);
        setAdapter();
        observeData();
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<TopContestModel>>> getMyContests = detailViewModel.getGetMyContests();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getMyContests.observe(viewLifecycleOwner, new MyContestFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3558observeData$lambda0(MyContestFragment myContestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(myContestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) myContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList == null) {
                    return;
                }
                if (arrayList.size() > 0) {
                    MyContestAdapter myContestAdapter = myContestFragment.adapter;
                    if (myContestAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        myContestAdapter = null;
                    }
                    myContestAdapter.addList(true, arrayList);
                    return;
                }
                TextView textView = (TextView) myContestFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                Intrinsics.checkNotNullExpressionValue(textView, "tvNoData");
                CommonMethodsKt.visible(textView);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) myContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = myContestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                myContestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) myContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new MyContestAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyContest);
        MyContestAdapter myContestAdapter = null;
        if (recyclerView != null) {
            MyContestAdapter myContestAdapter2 = this.adapter;
            if (myContestAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                myContestAdapter2 = null;
            }
            recyclerView.setAdapter(myContestAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyContest)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyContest);
        MyContestAdapter myContestAdapter3 = this.adapter;
        if (myContestAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            myContestAdapter = myContestAdapter3;
        }
        recyclerView2.setAdapter(myContestAdapter);
    }

    public void myContestClick(TopContestModel topContestModel) {
        Intrinsics.checkNotNullParameter(topContestModel, "model");
        try {
            Bundle bundle = new Bundle();
            bundle.putString("referalCode", topContestModel.getReferalCode());
            bundle.putString("from", "my_contest");
            bundle.putString("contestId", topContestModel.get_id());
            UserManager.INSTANCE.saveMatchId(topContestModel.getFantasyTeams().get(0).getMatchId());
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_matchDetailFragment, bundle);
        } catch (Exception e) {
            Log.v("Exception", e.toString());
        }
    }
}
