package com.crickpe.view.home.fragments.winner;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.home.HomeActivity;
import com.crickpe.view.home.HomeViewModel;
import com.crickpe.view.home.adapters.WinnersAdapter;
import com.crickpe.view.home.fragments.winner.models.MegaWinnersM;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u001a\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/winner/WinnerFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/home/adapters/WinnersAdapter$OnclickWinners;", "()V", "adapter", "Lcom/crickpe/view/home/adapters/WinnersAdapter;", "viewModel", "Lcom/crickpe/view/home/HomeViewModel;", "getFragmentLayoutResId", "", "observeData", "", "onClick", "view", "Landroid/view/View;", "onItemClick", "megaWinnerModel", "Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setMegaWinnersAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WinnerFragment.kt */
public final class WinnerFragment extends BaseFragment implements View.OnClickListener, WinnersAdapter.OnclickWinners {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private WinnersAdapter adapter;
    private HomeViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WinnerFragment.kt */
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
        return C1188R.C1193layout.fragment_winner;
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        HomeViewModel homeViewModel = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
        this.viewModel = homeViewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.getMegaWinnerApi("1");
        setMegaWinnersAdapter();
        observeData();
    }

    private final void observeData() {
        HomeViewModel homeViewModel = this.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<MegaWinnersM>>> getMegaWinners = homeViewModel.getGetMegaWinners();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getMegaWinners.observe(viewLifecycleOwner, new WinnerFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3746observeData$lambda0(WinnerFragment winnerFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(winnerFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                Collection collection = arrayList;
                if (!(collection == null || collection.isEmpty())) {
                    RelativeLayout relativeLayout = (RelativeLayout) winnerFragment._$_findCachedViewById(C1188R.C1192id.rlNoData);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlNoData");
                    CommonMethodsKt.hide(relativeLayout);
                    WinnersAdapter winnersAdapter = winnerFragment.adapter;
                    if (winnersAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        winnersAdapter = null;
                    }
                    winnersAdapter.addList(true, arrayList);
                } else {
                    RelativeLayout relativeLayout2 = (RelativeLayout) winnerFragment._$_findCachedViewById(C1188R.C1192id.rlNoData);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlNoData");
                    CommonMethodsKt.visible(relativeLayout2);
                }
                ProgressBar progressBar = (ProgressBar) winnerFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) winnerFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                Log.v("getHomeDataApi_ERROR", new Gson().toJson((Object) apiResponseHandler.getError()));
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) winnerFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setMegaWinnersAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new WinnersAdapter(requireActivity, this);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinners);
        WinnersAdapter winnersAdapter = null;
        if (recyclerView != null) {
            WinnersAdapter winnersAdapter2 = this.adapter;
            if (winnersAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                winnersAdapter2 = null;
            }
            recyclerView.setAdapter(winnersAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinners)).setLayoutManager(new LinearLayoutManager(requireActivity()));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWinners);
        WinnersAdapter winnersAdapter3 = this.adapter;
        if (winnersAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            winnersAdapter = winnersAdapter3;
        }
        recyclerView2.setAdapter(winnersAdapter);
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getString(C1188R.string.winners);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.winners)");
            ((HomeActivity) activity).setTitleBar(string);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.home.HomeActivity");
    }

    public void onItemClick(MegaWinnersM megaWinnersM) {
        Intrinsics.checkNotNullParameter(megaWinnersM, "megaWinnerModel");
        UserManager.INSTANCE.saveMegaWinner(megaWinnersM);
        Intent intent = new Intent(new Intent(requireActivity(), DetailActivity.class));
        intent.putExtra("open", "winners_detail");
        startActivity(intent);
    }
}
