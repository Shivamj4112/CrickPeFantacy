package com.crickpe.view.intro.fragments.bank;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import com.amplitude.p014id.FileIdentityStorage;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0017J\u001a\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/bank/BankFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "callingFragment", "", "getCallingFragment", "()Ljava/lang/String;", "setCallingFragment", "(Ljava/lang/String;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "backHandle", "", "getFragmentLayoutResId", "", "observeData", "onClick", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BankFragment.kt */
public final class BankFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private String callingFragment = "";
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: BankFragment.kt */
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

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m3755onViewCreated$lambda0(View view) {
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
        return C1188R.C1193layout.fragment_bank;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getCallingFragment() {
        return this.callingFragment;
    }

    public final void setCallingFragment(String str) {
        this.callingFragment = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        if (requireArguments() != null) {
            this.callingFragment = String.valueOf(requireArguments().getString("from"));
        }
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setOnClickListener(this);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlBankProgress)).setOnClickListener(new BankFragment$$ExternalSyntheticLambda0());
        observeData();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            DetailActivity detailActivity = (DetailActivity) activity;
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                ((DetailActivity) activity2).setTopBar("Bank Verification", true, false, false, false, false, false, false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<User>> submitBank = detailViewModel.getSubmitBank();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        submitBank.observe(viewLifecycleOwner, new BankFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3754observeData$lambda1(BankFragment bankFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(bankFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                User user = (User) apiResponseHandler.getData();
                try {
                    User userProfile = UserManager.INSTANCE.getUserProfile();
                    if (userProfile != null) {
                        userProfile.setBankVerified(1);
                    }
                    if (UserManager.INSTANCE.getUserProfile() != null) {
                        FragmentActivity requireActivity = bankFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                        User userProfile2 = UserManager.INSTANCE.getUserProfile();
                        String str = null;
                        CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile2 != null ? userProfile2.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_BANK_VERIFY);
                        Bundle bundle = new Bundle();
                        User userProfile3 = UserManager.INSTANCE.getUserProfile();
                        if (userProfile3 != null) {
                            str = userProfile3.get_id();
                        }
                        bundle.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str));
                        ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_BANK_VERIFY, bundle);
                    }
                    RelativeLayout relativeLayout = (RelativeLayout) bankFragment._$_findCachedViewById(C1188R.C1192id.rlBankProgress);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlBankProgress");
                    CommonMethodsKt.hide(relativeLayout);
                } catch (Exception unused) {
                    User userProfile4 = UserManager.INSTANCE.getUserProfile();
                    if (userProfile4 != null) {
                        userProfile4.setBankVerified(1);
                    }
                }
                String string = bankFragment.getString(C1188R.string.bank_verified_done);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.bank_verified_done)");
                bankFragment.showToast(string);
                bankFragment.backHandle();
            } else if (i == 2) {
                FragmentActivity requireActivity2 = bankFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
                bankFragment.handleApiErrorDialog(requireActivity2, apiResponseHandler.getError());
                RelativeLayout relativeLayout2 = (RelativeLayout) bankFragment._$_findCachedViewById(C1188R.C1192id.rlBankProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlBankProgress");
                CommonMethodsKt.hide(relativeLayout2);
            } else if (i == 3) {
                RelativeLayout relativeLayout3 = (RelativeLayout) bankFragment._$_findCachedViewById(C1188R.C1192id.rlBankProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout3, "rlBankProgress");
                CommonMethodsKt.visible(relativeLayout3);
            }
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.tvContinue) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            CommonMethodsKt.hideKeyboard(requireActivity, (TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue));
            if (Intrinsics.areEqual((Object) ((EditText) _$_findCachedViewById(C1188R.C1192id.etAccountNumber)).getText().toString(), (Object) "")) {
                String string = getString(C1188R.string.enter_account_number);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.enter_account_number)");
                showToast(string);
            } else if (Intrinsics.areEqual((Object) ((EditText) _$_findCachedViewById(C1188R.C1192id.etIfscNumber)).getText().toString(), (Object) "")) {
                String string2 = getString(C1188R.string.enter_ifsc_number);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.enter_ifsc_number)");
                showToast(string2);
            } else if (((EditText) _$_findCachedViewById(C1188R.C1192id.etIfscNumber)).getText().toString().length() < 10) {
                String string3 = getString(C1188R.string.enter_correct_ifsc);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.enter_correct_ifsc)");
                showToast(string3);
            } else {
                HashMap hashMap = new HashMap();
                Map map = hashMap;
                map.put("accountNumber", StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etAccountNumber)).getText().toString()).toString());
                map.put("ifsc", StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etIfscNumber)).getText().toString()).toString());
                map.put("verificationType", Constants.BANK_ACCOUNT);
                Log.v("MAPPPP", new Gson().toJson((Object) hashMap));
                DetailViewModel detailViewModel = this.viewModel;
                if (detailViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel = null;
                }
                detailViewModel.submitBankDetail(hashMap);
            }
        }
    }

    public final void backHandle() {
        try {
            if (Intrinsics.areEqual((Object) this.callingFragment, (Object) "verification")) {
                FragmentKt.findNavController(this).popBackStack();
                FragmentKt.findNavController(this).popBackStack();
                return;
            }
            FragmentKt.findNavController(this).popBackStack();
        } catch (Exception e) {
            Log.v("BACK_ISSUE", e.toString());
            FragmentKt.findNavController(this).popBackStack();
        }
    }
}
