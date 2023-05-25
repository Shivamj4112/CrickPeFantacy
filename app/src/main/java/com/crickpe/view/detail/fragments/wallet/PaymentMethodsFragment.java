package com.crickpe.view.detail.fragments.wallet;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.TopupAmountAdapter;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001a\u001a\u00020\u0014H\u0016J\u001a\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J \u0010\u001e\u001a\u00020\u00142\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/PaymentMethodsFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/TopupAmountAdapter$OnClickAmount;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/TopupAmountAdapter;", "list2", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getList2", "()Ljava/util/ArrayList;", "setList2", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "observeData", "", "onClick", "view", "Landroid/view/View;", "onItemClicked", "amount", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PaymentMethodsFragment.kt */
public final class PaymentMethodsFragment extends BaseFragment implements View.OnClickListener, TopupAmountAdapter.OnClickAmount {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private TopupAmountAdapter adapter;
    private ArrayList<String> list2 = new ArrayList<>();
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PaymentMethodsFragment.kt */
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
        return C1188R.C1193layout.fragment_topup;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final ArrayList<String> getList2() {
        return this.list2;
    }

    public final void setList2(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.list2 = arrayList;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getResources().getString(C1188R.string.wallet);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.wallet)");
            ((DetailActivity) activity).setTopBar(string, true, false, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.list2.add("500");
        this.list2.add("1000");
        this.list2.add("2000");
        this.list2.add("3000");
        this.list2.add("4000");
        this.list2.add("5000");
        this.list2.add("6000");
        this.list2.add("7000");
        setAdapter(this.list2);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        view.getId();
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<UpcomingMatchModel>>> getUpcomingMatches = detailViewModel.getGetUpcomingMatches();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getUpcomingMatches.observe(viewLifecycleOwner, new PaymentMethodsFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3637observeData$lambda0(PaymentMethodsFragment paymentMethodsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(paymentMethodsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
            } else if (i == 2) {
                FragmentActivity requireActivity = paymentMethodsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                paymentMethodsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            }
        }
    }

    private final void setAdapter(ArrayList<String> arrayList) {
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopupAmount)).setLayoutManager(new GridLayoutManager(requireActivity(), 4));
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new TopupAmountAdapter(requireActivity, this);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopupAmount);
        TopupAmountAdapter topupAmountAdapter = null;
        if (recyclerView != null) {
            TopupAmountAdapter topupAmountAdapter2 = this.adapter;
            if (topupAmountAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                topupAmountAdapter2 = null;
            }
            recyclerView.setAdapter(topupAmountAdapter2);
        }
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopupAmount);
        TopupAmountAdapter topupAmountAdapter3 = this.adapter;
        if (topupAmountAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            topupAmountAdapter3 = null;
        }
        recyclerView2.setAdapter(topupAmountAdapter3);
        TopupAmountAdapter topupAmountAdapter4 = this.adapter;
        if (topupAmountAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            topupAmountAdapter = topupAmountAdapter4;
        }
        topupAmountAdapter.addList(true, arrayList);
    }

    public void onItemClicked(String str) {
        Intrinsics.checkNotNullParameter(str, "amount");
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).setText(str.toString());
    }
}
