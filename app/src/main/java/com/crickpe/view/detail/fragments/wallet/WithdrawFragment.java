package com.crickpe.view.detail.fragments.wallet;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.p004os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import com.amplitude.android.Amplitude;
import com.amplitude.android.Configuration;
import com.amplitude.android.TrackingOptions;
import com.amplitude.core.LoggerProvider;
import com.amplitude.core.ServerZone;
import com.amplitude.core.StorageProvider;
import com.amplitude.core.events.EventOptions;
import com.amplitude.core.events.IngestionMetadata;
import com.amplitude.core.events.Plan;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.TopUpRequest;
import com.crickpe.data.WithdrawRequest;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.BankLinkedAdapter;
import com.crickpe.view.detail.fragments.wallet.my_banks_list.BankDetails;
import com.crickpe.view.detail.fragments.wallet.my_banks_list.BankDetailsItem;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u0010H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020\u001fH\u0002J\u0010\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u001fH\u0016J\u001a\u0010(\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020\u001fH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000¨\u0006,"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/WithdrawFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/BankLinkedAdapter$OnItemClicked;", "()V", "amountStr", "", "getAmountStr", "()Ljava/lang/String;", "setAmountStr", "(Ljava/lang/String;)V", "amplitude", "Lcom/amplitude/android/Amplitude;", "bankAccountAdapter", "Lcom/crickpe/view/detail/adapters/BankLinkedAdapter;", "maxAmount", "", "getMaxAmount", "()I", "setMaxAmount", "(I)V", "minAmount", "getMinAmount", "setMinAmount", "userBankid", "getUserBankid", "setUserBankid", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "listeners", "", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClicked", "bank", "Lcom/crickpe/view/detail/fragments/wallet/my_banks_list/BankDetailsItem;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WithdrawFragment.kt */
public final class WithdrawFragment extends BaseFragment implements View.OnClickListener, BankLinkedAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private String amountStr = "";
    private Amplitude amplitude;
    private BankLinkedAdapter bankAccountAdapter;
    private int maxAmount;
    private int minAmount;
    private String userBankid = "";
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WithdrawFragment.kt */
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
        return C1188R.C1193layout.fragment_withdraw;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getAmountStr() {
        return this.amountStr;
    }

    public final void setAmountStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amountStr = str;
    }

    public final String getUserBankid() {
        return this.userBankid;
    }

    public final void setUserBankid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userBankid = str;
    }

    public final int getMinAmount() {
        return this.minAmount;
    }

    public final void setMinAmount(int i) {
        this.minAmount = i;
    }

    public final int getMaxAmount() {
        return this.maxAmount;
    }

    public final void setMaxAmount(int i) {
        this.maxAmount = i;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getResources().getString(C1188R.string.withdraw);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.withdraw)");
            ((DetailActivity) activity).setTopBar(string, true, false, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        observeData();
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getBanksList();
        setAdapter();
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
        Configuration configuration = r3;
        Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
        this.amplitude = new Amplitude(configuration);
        SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
        if ((appSettings != null ? appSettings.getMinWithdrawalAmount() : null) != null) {
            SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
            String minWithdrawalAmount = appSettings2 != null ? appSettings2.getMinWithdrawalAmount() : null;
            Intrinsics.checkNotNull(minWithdrawalAmount);
            this.minAmount = Integer.parseInt(minWithdrawalAmount);
        }
        SettingsModel appSettings3 = UserManager.INSTANCE.getAppSettings();
        if ((appSettings3 != null ? appSettings3.getMaxWithdrawalAmount() : null) != null) {
            SettingsModel appSettings4 = UserManager.INSTANCE.getAppSettings();
            String maxWithdrawalAmount = appSettings4 != null ? appSettings4.getMaxWithdrawalAmount() : null;
            Intrinsics.checkNotNull(maxWithdrawalAmount);
            this.maxAmount = Integer.parseInt(maxWithdrawalAmount);
        }
        listeners();
    }

    private final void listeners() {
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvSubmit)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvAddAccount)).setOnClickListener(onClickListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).addTextChangedListener(new WithdrawFragment$listeners$1(this));
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<TopUpRequest>> withdrawAmount = detailViewModel.getWithdrawAmount();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        withdrawAmount.observe(viewLifecycleOwner, new WithdrawFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<BankDetails>> getBankLists = detailViewModel2.getGetBankLists();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getBankLists.observe(viewLifecycleOwner2, new WithdrawFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3665observeData$lambda0(WithdrawFragment withdrawFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(withdrawFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) withdrawFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                String string = withdrawFragment.getString(C1188R.string.amount_has_been_successfully_withdrawn);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.amoun…n_successfully_withdrawn)");
                withdrawFragment.showToast(string);
                try {
                    Bundle bundle = new Bundle();
                    bundle.putString("revenue", withdrawFragment.amountStr);
                    ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_WALLET_WITHDRAW, bundle);
                    HashMap hashMap = new HashMap();
                    hashMap.put(AFInAppEventParameterName.REVENUE, withdrawFragment.amountStr);
                    AppsFlyerLib.getInstance().logEvent(withdrawFragment.requireActivity().getApplicationContext(), Constants.EVENT_WALLET_WITHDRAW, hashMap, new WithdrawFragment$observeData$1$1());
                    Amplitude amplitude2 = withdrawFragment.amplitude;
                    if (amplitude2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                        amplitude2 = null;
                    }
                    com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_WALLET_WITHDRAW, (Map) null, (EventOptions) null, 6, (Object) null);
                } catch (Exception e) {
                    Log.e("withdrawAmount", e.toString());
                }
                FragmentKt.findNavController(withdrawFragment).popBackStack();
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) withdrawFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = withdrawFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                withdrawFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) withdrawFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3666observeData$lambda1(WithdrawFragment withdrawFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(withdrawFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) withdrawFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                BankDetails bankDetails = (BankDetails) apiResponseHandler.getData();
                if (bankDetails != null) {
                    BankLinkedAdapter bankLinkedAdapter = withdrawFragment.bankAccountAdapter;
                    if (bankLinkedAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("bankAccountAdapter");
                        bankLinkedAdapter = null;
                    }
                    bankLinkedAdapter.addList(true, bankDetails);
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) withdrawFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = withdrawFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                withdrawFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) withdrawFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.bankAccountAdapter = new BankLinkedAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvBankAccounts);
        BankLinkedAdapter bankLinkedAdapter = null;
        if (recyclerView != null) {
            BankLinkedAdapter bankLinkedAdapter2 = this.bankAccountAdapter;
            if (bankLinkedAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bankAccountAdapter");
                bankLinkedAdapter2 = null;
            }
            recyclerView.setAdapter(bankLinkedAdapter2);
        }
        BankLinkedAdapter bankLinkedAdapter3 = this.bankAccountAdapter;
        if (bankLinkedAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bankAccountAdapter");
        } else {
            bankLinkedAdapter = bankLinkedAdapter3;
        }
        bankLinkedAdapter.setStateRestorationPolicy(RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id == C1188R.C1192id.tvAddAccount) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_withdrawFragment_to_bankFragment, BundleKt.bundleOf(TuplesKt.m276to("from", "withdraw")));
        } else if (id == C1188R.C1192id.tvSubmit) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            CommonMethodsKt.hideKeyboard(requireActivity, (TextView) _$_findCachedViewById(C1188R.C1192id.tvSubmit));
            String obj = StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).getText().toString()).toString();
            this.amountStr = obj;
            if (Intrinsics.areEqual((Object) obj, (Object) "")) {
                String string = getResources().getString(C1188R.string.enter_amount);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.enter_amount)");
                showToast(string);
            } else if (Integer.parseInt(this.amountStr) < this.minAmount) {
                showToast("Minimum amount for withdraw up is ₹" + this.minAmount);
            } else if (Integer.parseInt(this.amountStr) > this.maxAmount) {
                showToast("Maximum amount for withdraw up is ₹" + this.maxAmount);
            } else if (Intrinsics.areEqual((Object) this.userBankid, (Object) "")) {
                String string2 = getResources().getString(C1188R.string.please_select_bank);
                Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.please_select_bank)");
                showToast(string2);
            } else {
                WithdrawRequest withdrawRequest = new WithdrawRequest(String.valueOf(Integer.parseInt(this.amountStr)), Constants.BANK_ACCOUNT, this.userBankid);
                DetailViewModel detailViewModel = this.viewModel;
                if (detailViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel = null;
                }
                detailViewModel.withdrawAmountEaseBuzz(withdrawRequest);
            }
        }
    }

    public void onItemClicked(BankDetailsItem bankDetailsItem) {
        String str;
        Intrinsics.checkNotNullParameter(bankDetailsItem, "bank");
        if (bankDetailsItem.get_id() != null) {
            try {
                str = bankDetailsItem.get_id();
            } catch (Exception unused) {
                str = "";
            }
            this.userBankid = str;
        }
    }
}
