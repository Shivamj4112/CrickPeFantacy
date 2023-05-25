package com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
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
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.home.adapters.MyTeamsAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0018\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0011H\u0016J\u001a\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0013H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000¨\u0006!"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/MyTeamsFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnItemClicked;", "Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnUpdate;", "()V", "adapter", "Lcom/crickpe/view/home/adapters/MyTeamsAdapter;", "matchId", "", "getMatchId", "()Ljava/lang/String;", "setMatchId", "(Ljava/lang/String;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "observeData", "", "onClick", "view", "Landroid/view/View;", "onItemClicked", "data", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "onTeamUpate", "fa", "action", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyTeamsFragment.kt */
public final class MyTeamsFragment extends BaseFragment implements View.OnClickListener, MyTeamsAdapter.OnItemClicked, MyTeamsAdapter.OnUpdate {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private MyTeamsAdapter adapter;
    private String matchId = "";
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyTeamsFragment.kt */
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
        return C1188R.C1193layout.fragment_my_teams;
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
        detailViewModel.getFantasyTeamByMatchApi(this.matchId);
        setAdapter();
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCreateTeam)).setOnClickListener(this);
        observeData();
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getFantasyTeam = detailViewModel.getGetFantasyTeam();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getFantasyTeam.observe(viewLifecycleOwner, new MyTeamsFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3559observeData$lambda0(MyTeamsFragment myTeamsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(myTeamsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) myTeamsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (arrayList == null) {
                    return;
                }
                if (arrayList.size() > 0) {
                    Log.v("My_teams->", new Gson().toJson((Object) arrayList));
                    MyTeamsAdapter myTeamsAdapter = myTeamsFragment.adapter;
                    MyTeamsAdapter myTeamsAdapter2 = null;
                    if (myTeamsAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        myTeamsAdapter = null;
                    }
                    myTeamsAdapter.getTopContestModel().clear();
                    MyTeamsAdapter myTeamsAdapter3 = myTeamsFragment.adapter;
                    if (myTeamsAdapter3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        myTeamsAdapter2 = myTeamsAdapter3;
                    }
                    myTeamsAdapter2.addList(true, arrayList);
                    return;
                }
                TextView textView = (TextView) myTeamsFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                Intrinsics.checkNotNullExpressionValue(textView, "tvNoData");
                CommonMethodsKt.visible(textView);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) myTeamsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = myTeamsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                myTeamsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) myTeamsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.tvCreateTeam) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createTeamFragment2, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("from", Constants.EVENT_CREATE_TEAM)));
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new MyTeamsAdapter(this, this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFantasyTeams);
        MyTeamsAdapter myTeamsAdapter = null;
        if (recyclerView != null) {
            MyTeamsAdapter myTeamsAdapter2 = this.adapter;
            if (myTeamsAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                myTeamsAdapter2 = null;
            }
            recyclerView.setAdapter(myTeamsAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFantasyTeams)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvFantasyTeams);
        MyTeamsAdapter myTeamsAdapter3 = this.adapter;
        if (myTeamsAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            myTeamsAdapter = myTeamsAdapter3;
        }
        recyclerView2.setAdapter(myTeamsAdapter);
    }

    public void onItemClicked(FantasyTeamListModel fantasyTeamListModel) {
        Intrinsics.checkNotNullParameter(fantasyTeamListModel, "data");
        String json = new Gson().toJson((Object) fantasyTeamListModel);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(data)");
        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_myTeamsDetailFragment, BundleKt.bundleOf(TuplesKt.m276to("from", "update_team"), TuplesKt.m276to("TEAM", json)));
    }

    public void onTeamUpate(FantasyTeamListModel fantasyTeamListModel, int i) {
        Intrinsics.checkNotNullParameter(fantasyTeamListModel, "fa");
        String json = new Gson().toJson((Object) fantasyTeamListModel);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(fa)");
        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_contestFragment_to_createTeamFragment2, BundleKt.bundleOf(TuplesKt.m276to("matchId", this.matchId), TuplesKt.m276to("from", "update_team"), TuplesKt.m276to("TEAM", json)));
    }
}
