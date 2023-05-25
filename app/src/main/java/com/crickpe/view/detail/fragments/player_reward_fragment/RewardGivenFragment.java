package com.crickpe.view.detail.fragments.player_reward_fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.MyRewardAdapter;
import com.crickpe.view.home.fragments.rewards.my_reward_model.MyRewardModelItem;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016J\b\u0010\u0010\u001a\u00020\u000bH\u0016J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/RewardGivenFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "myRewardAdapter", "Lcom/crickpe/view/detail/adapters/MyRewardAdapter;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "observers", "", "onClick", "view", "Landroid/view/View;", "onDetach", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RewardGivenFragment.kt */
public final class RewardGivenFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private MyRewardAdapter myRewardAdapter;
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: RewardGivenFragment.kt */
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
        return C1188R.C1193layout.fragment_reward_given;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        DetailViewModel detailViewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.viewModel = detailViewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getMyRewards();
        observers();
        setAdapter();
    }

    private final void setAdapter() {
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyRewards)).setNestedScrollingEnabled(false);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.myRewardAdapter = new MyRewardAdapter(requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyRewards);
        MyRewardAdapter myRewardAdapter2 = null;
        if (recyclerView != null) {
            MyRewardAdapter myRewardAdapter3 = this.myRewardAdapter;
            if (myRewardAdapter3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("myRewardAdapter");
                myRewardAdapter3 = null;
            }
            recyclerView.setAdapter(myRewardAdapter3);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyRewards)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvMyRewards);
        MyRewardAdapter myRewardAdapter4 = this.myRewardAdapter;
        if (myRewardAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("myRewardAdapter");
        } else {
            myRewardAdapter2 = myRewardAdapter4;
        }
        recyclerView2.setAdapter(myRewardAdapter2);
    }

    private final void observers() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<MyRewardModelItem>>> getMyReward = detailViewModel.getGetMyReward();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getMyReward.observe(viewLifecycleOwner, new RewardGivenFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observers$lambda-0  reason: not valid java name */
    public static final void m3597observers$lambda0(RewardGivenFragment rewardGivenFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(rewardGivenFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    try {
                        MyRewardAdapter myRewardAdapter2 = rewardGivenFragment.myRewardAdapter;
                        if (myRewardAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("myRewardAdapter");
                            myRewardAdapter2 = null;
                        }
                        myRewardAdapter2.addList(arrayList);
                    } catch (Exception unused) {
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = rewardGivenFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                rewardGivenFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ERROR", new Gson().toJson((Object) apiResponseHandler));
            }
        }
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("Reward History", true, false, false, false, false, false, false);
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                ((DetailActivity) activity2).showDownloadIcon(false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onDetach() {
        super.onDetach();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).showDownloadIcon(false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        view.getId();
    }
}
