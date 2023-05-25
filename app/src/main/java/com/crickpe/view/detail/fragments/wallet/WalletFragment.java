package com.crickpe.view.detail.fragments.wallet;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplitude.p014id.FileIdentityStorage;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.databinding.FragmentWalletBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.WalletHistoryAdapter;
import com.crickpe.view.detail.fragments.settings.models.ProfileModelNew;
import com.crickpe.view.detail.fragments.wallet.models.Transaction;
import com.crickpe.view.detail.fragments.wallet.models.WalletModal;
import com.crickpe.view.detail.fragments.wallet.my_banks_list.BankDetails;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001eH\u0002J\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u0007H\u0016J\b\u0010\"\u001a\u00020\u001eH\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\u0010\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u001eH\u0002J\b\u0010(\u001a\u00020\u001eH\u0016J\u001a\u0010)\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020\u001eH\u0002J \u0010-\u001a\u00020\u001e2\u0016\u0010.\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR*\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000¨\u0006/"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/WalletFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/WalletHistoryAdapter;", "bankListSize", "", "getBankListSize", "()I", "setBankListSize", "(I)V", "binding", "Lcom/crickpe/databinding/FragmentWalletBinding;", "moreData", "", "page", "getPage", "setPage", "transactions", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/wallet/models/Transaction;", "Lkotlin/collections/ArrayList;", "getTransactions", "()Ljava/util/ArrayList;", "setTransactions", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "checkAadharPan", "", "checkAadharPan2", "checkPan", "getFragmentLayoutResId", "listener", "observeData", "onClick", "view", "Landroid/view/View;", "onRecyclerViewScrolled", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setPagination", "transactionList", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WalletFragment.kt */
public final class WalletFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private WalletHistoryAdapter adapter;
    private int bankListSize;
    private FragmentWalletBinding binding;
    private boolean moreData;
    private int page = 1;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WalletFragment.kt */
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
        return C1188R.C1193layout.fragment_wallet;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final int getBankListSize() {
        return this.bankListSize;
    }

    public final void setBankListSize(int i) {
        this.bankListSize = i;
    }

    public final int getPage() {
        return this.page;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public final void setTransactions(ArrayList<Transaction> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.transactions = arrayList;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getResources().getString(C1188R.string.wallet);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.wallet)");
            ((DetailActivity) activity).setTopBar(string, true, false, false, false, false, false, false);
            this.page = 1;
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getWalletTransection(this.page);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.binding = FragmentWalletBinding.bind(view);
        DetailViewModel detailViewModel = this.viewModel;
        String str = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getProfileApi();
        DetailViewModel detailViewModel2 = this.viewModel;
        if (detailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel2 = null;
        }
        detailViewModel2.getBanksList();
        listener();
        setAdapter();
        observeData();
        if (UserManager.INSTANCE.getUserProfile() != null) {
            try {
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                User userProfile = UserManager.INSTANCE.getUserProfile();
                CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.WALLET_LISTING);
                Bundle bundle2 = new Bundle();
                User userProfile2 = UserManager.INSTANCE.getUserProfile();
                if (userProfile2 != null) {
                    str = userProfile2.get_id();
                }
                bundle2.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str));
                ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.WALLET_LISTING, bundle2);
            } catch (Exception e) {
                Log.e("Analytics", e.toString());
            }
        }
    }

    private final void listener() {
        View.OnClickListener onClickListener = this;
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlTopup)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlWithdraw)).setOnClickListener(onClickListener);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id == C1188R.C1192id.rlTopup) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_topUpFragment);
        } else if (id == C1188R.C1192id.rlWithdraw) {
            checkAadharPan();
        }
    }

    private final void checkAadharPan() {
        try {
            User userProfile = UserManager.INSTANCE.getUserProfile();
            Intrinsics.checkNotNull(userProfile);
            if (userProfile.getKycStatus() != 1) {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_kycFragment2);
                return;
            }
            User userProfile2 = UserManager.INSTANCE.getUserProfile();
            Intrinsics.checkNotNull(userProfile2);
            if (userProfile2.getPanStatus() != 1) {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_verifyWithdrawFragment);
            } else if (this.bankListSize <= 0) {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_verifyWithdrawFragment);
            } else {
                User userProfile3 = UserManager.INSTANCE.getUserProfile();
                if (Intrinsics.areEqual((Object) String.valueOf(userProfile3 != null ? userProfile3.get_id() : null), (Object) Constants.PROFILE_ID)) {
                    User userProfile4 = UserManager.INSTANCE.getUserProfile();
                    Intrinsics.checkNotNull(userProfile4);
                    if (userProfile4.getKycStatus() != 1) {
                        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_withdrawFragment);
                        return;
                    }
                }
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_withdrawFragment);
            }
        } catch (Exception e) {
            Log.e("checkAadharPan", e.toString());
        }
    }

    private final void checkAadharPan2() {
        User userProfile = UserManager.INSTANCE.getUserProfile();
        Intrinsics.checkNotNull(userProfile);
        if (userProfile.getPanStatus() != 1) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_verifyWithdrawFragment);
        } else if (this.bankListSize <= 0) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_verifyWithdrawFragment);
        } else {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_withdrawFragment);
        }
    }

    private final void checkPan() {
        User userProfile = UserManager.INSTANCE.getUserProfile();
        Intrinsics.checkNotNull(userProfile);
        if (userProfile.getPanStatus() != 1) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_verifyWithdrawFragment);
        } else {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_walletFragment_to_withdrawFragment);
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ProfileModelNew>> getUserProfle = detailViewModel.getGetUserProfle();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getUserProfle.observe(viewLifecycleOwner, new WalletFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<WalletModal>> getWalletTransaction = detailViewModel3.getGetWalletTransaction();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getWalletTransaction.observe(viewLifecycleOwner2, new WalletFragment$$ExternalSyntheticLambda1(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel4;
        }
        SingleLiveEvent<ApiResponseHandler<BankDetails>> getBankLists = detailViewModel2.getGetBankLists();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        getBankLists.observe(viewLifecycleOwner3, new WalletFragment$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3658observeData$lambda0(WalletFragment walletFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(walletFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProfileModelNew profileModelNew = (ProfileModelNew) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) walletFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (profileModelNew != null) {
                    UserManager.INSTANCE.saveProfile(profileModelNew.getUserProfile());
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = walletFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                walletFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar2 = (ProgressBar) walletFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) walletFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3659observeData$lambda1(WalletFragment walletFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(walletFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                FragmentWalletBinding fragmentWalletBinding = walletFragment.binding;
                Intrinsics.checkNotNull(fragmentWalletBinding);
                ProgressBar progressBar = fragmentWalletBinding.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding!!.progressBar");
                CommonMethodsKt.hide(progressBar);
                WalletModal walletModal = (WalletModal) apiResponseHandler.getData();
                if (walletModal != null) {
                    try {
                        FragmentWalletBinding fragmentWalletBinding2 = walletFragment.binding;
                        Intrinsics.checkNotNull(fragmentWalletBinding2);
                        fragmentWalletBinding2.setModel(walletModal);
                        if (walletModal.getTransactionList().size() > 0) {
                            ArrayList<Transaction> transactionList = walletModal.getTransactionList();
                            walletFragment.transactions = transactionList;
                            walletFragment.setPagination(transactionList);
                        }
                    } catch (Exception e) {
                        Log.v("getWalletTransaction", e.toString());
                    }
                }
            } else if (i == 2) {
                FragmentWalletBinding fragmentWalletBinding3 = walletFragment.binding;
                Intrinsics.checkNotNull(fragmentWalletBinding3);
                ProgressBar progressBar2 = fragmentWalletBinding3.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "binding!!.progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = walletFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                walletFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                FragmentWalletBinding fragmentWalletBinding4 = walletFragment.binding;
                Intrinsics.checkNotNull(fragmentWalletBinding4);
                ProgressBar progressBar3 = fragmentWalletBinding4.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "binding!!.progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3660observeData$lambda2(WalletFragment walletFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(walletFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) walletFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                BankDetails bankDetails = (BankDetails) apiResponseHandler.getData();
                if (bankDetails != null) {
                    walletFragment.bankListSize = bankDetails.size();
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) walletFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = walletFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                walletFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) walletFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new WalletHistoryAdapter(requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWalletHistory);
        WalletHistoryAdapter walletHistoryAdapter = null;
        if (recyclerView != null) {
            WalletHistoryAdapter walletHistoryAdapter2 = this.adapter;
            if (walletHistoryAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                walletHistoryAdapter2 = null;
            }
            recyclerView.setAdapter(walletHistoryAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWalletHistory)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvWalletHistory);
        WalletHistoryAdapter walletHistoryAdapter3 = this.adapter;
        if (walletHistoryAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            walletHistoryAdapter = walletHistoryAdapter3;
        }
        recyclerView2.setAdapter(walletHistoryAdapter);
        onRecyclerViewScrolled();
    }

    private final void setPagination(ArrayList<Transaction> arrayList) {
        boolean z = true;
        if (this.page == 1) {
            if (arrayList.isEmpty()) {
                Log.v("MORE_DATA", "NO");
            } else {
                Log.v("MORE_DATA", "YES");
            }
        }
        boolean z2 = this.page == 1;
        WalletHistoryAdapter walletHistoryAdapter = this.adapter;
        if (walletHistoryAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            walletHistoryAdapter = null;
        }
        walletHistoryAdapter.addList(z2, arrayList);
        if (arrayList.size() < 10) {
            z = false;
        }
        this.moreData = z;
    }

    private final void onRecyclerViewScrolled() {
        ((NestedScrollView) _$_findCachedViewById(C1188R.C1192id.nestedScrollView)).setOnScrollChangeListener(new WalletFragment$$ExternalSyntheticLambda3(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: onRecyclerViewScrolled$lambda-3  reason: not valid java name */
    public static final void m3661onRecyclerViewScrolled$lambda3(WalletFragment walletFragment, NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(walletFragment, "this$0");
        Intrinsics.checkNotNullParameter(nestedScrollView, "v");
        if (nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1) != null && i2 >= nestedScrollView.getChildAt(nestedScrollView.getChildCount() - 1).getMeasuredHeight() - nestedScrollView.getMeasuredHeight() && i2 > i4 && walletFragment.moreData) {
            walletFragment.page++;
            DetailViewModel detailViewModel = walletFragment.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getWalletTransection(walletFragment.page);
        }
    }
}
