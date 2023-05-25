package com.crickpe.view.intro.fragments.kyc;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\tH\u0002J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001a\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/kyc/AadharOtpVerificationFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "id_number", "", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "alertDialog", "", "name", "callVerifyApi", "getFragmentLayoutResId", "", "listeners", "observeData", "onClick", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AadharOtpVerificationFragment.kt */
public final class AadharOtpVerificationFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private String id_number = "";
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: AadharOtpVerificationFragment.kt */
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
        return C1188R.C1193layout.fragment_aadhar_otp_verification;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.id_number = String.valueOf(requireArguments().getString("id_number"));
        }
        listeners();
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        observeData();
    }

    private final void listeners() {
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvVerify)).setOnClickListener(this);
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<User>> submitAadharOtp = detailViewModel.getSubmitAadharOtp();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        submitAadharOtp.observe(viewLifecycleOwner, new AadharOtpVerificationFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3757observeData$lambda0(AadharOtpVerificationFragment aadharOtpVerificationFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(aadharOtpVerificationFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                User user = (User) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) aadharOtpVerificationFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (user != null) {
                    UserManager.INSTANCE.saveProfile(user);
                    Log.v("KYCHOME5_AADHAR", String.valueOf(user.getKycStatus()));
                    aadharOtpVerificationFragment.alertDialog(user.getName());
                    return;
                }
                aadharOtpVerificationFragment.showToast("Kyc not updated");
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) aadharOtpVerificationFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = aadharOtpVerificationFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                aadharOtpVerificationFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) aadharOtpVerificationFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void alertDialog(String str) {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_kyc_alert);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvBody);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvTitle);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(C1188R.C1192id.tvNo);
                if (findViewById3 != null) {
                    textView2.setText(getString(C1188R.string.kyc_completed_));
                    textView.setText(getString(C1188R.string.details_updated_as_per_kyc));
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    window.setBackgroundDrawableResource(17170445);
                    window.setLayout(-1, -2);
                    ((TextView) findViewById3).setOnClickListener(new AadharOtpVerificationFragment$$ExternalSyntheticLambda0(dialog, this));
                    dialog.show();
                    ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    CommonMethodsKt.hide(progressBar);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: alertDialog$lambda-1  reason: not valid java name */
    public static final void m3756alertDialog$lambda1(Dialog dialog, AadharOtpVerificationFragment aadharOtpVerificationFragment, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(aadharOtpVerificationFragment, "this$0");
        dialog.dismiss();
        String string = aadharOtpVerificationFragment.getString(C1188R.string.kyc_submitted);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.kyc_submitted)");
        aadharOtpVerificationFragment.showToast(string);
        aadharOtpVerificationFragment.requireActivity().onBackPressed();
        aadharOtpVerificationFragment.requireActivity().onBackPressed();
    }

    private final void callVerifyApi() {
        String obj = StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etOTP)).getText().toString()).toString();
        if (Intrinsics.areEqual((Object) obj, (Object) "")) {
            showToast("Please enter OTP");
        } else if (obj.length() < 6) {
            showToast("Please enter valid OTP");
        } else {
            HashMap hashMap = new HashMap();
            Map map = hashMap;
            map.put("id_number", this.id_number);
            map.put("otp", StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etOTP)).getText().toString()).toString());
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.submitAadharOTP(hashMap);
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.tvVerify) {
            callVerifyApi();
        }
    }
}
