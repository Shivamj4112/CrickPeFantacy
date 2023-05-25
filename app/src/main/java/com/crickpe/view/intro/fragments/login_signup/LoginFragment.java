package com.crickpe.view.intro.fragments.login_signup;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.p004os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.WebViewActivity;
import com.crickpe.view.intro.IntroViewModel;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.Credentials;
import com.google.android.gms.auth.api.credentials.CredentialsClient;
import com.google.android.gms.auth.api.credentials.CredentialsOptions;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0015\u001a\u00020\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0007H\u0016J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0016H\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0002J\"\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%H\u0016J\u0012\u0010&\u001a\u00020\u00162\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010'\u001a\u00020*H\u0016J\u0010\u0010+\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0007H\u0016J\b\u0010,\u001a\u00020\u0016H\u0016J\u001a\u0010-\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010/\u001a\u0004\u0018\u00010\u00112\u0006\u00100\u001a\u00020\u0011J\b\u00101\u001a\u00020\u0016H\u0002J\b\u00102\u001a\u00020\u0016H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\u00110\u00110\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u0002\n\u0000¨\u00063"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/login_signup/LoginFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "Lcom/google/android/gms/common/api/GoogleApiClient$OnConnectionFailedListener;", "()V", "RC_HINT", "", "isCheckedTerms", "", "()Z", "setCheckedTerms", "(Z)V", "mCredentialsApiClient", "Lcom/google/android/gms/common/api/GoogleApiClient;", "requestPermissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "kotlin.jvm.PlatformType", "viewModel", "Lcom/crickpe/view/intro/IntroViewModel;", "callAPi", "", "checkValidation", "getFragmentLayoutResId", "isValidPhoneNumber", "target", "", "listeners", "observeData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "view", "Landroid/view/View;", "onConnected", "p0", "Landroid/os/Bundle;", "onConnectionFailed", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionSuspended", "onPause", "onViewCreated", "savedInstanceState", "removeLeadingZeros", "num", "showHint", "smsPermissionRequest", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LoginFragment.kt */
public final class LoginFragment extends BaseFragment implements View.OnClickListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
    private int RC_HINT = 1000;
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private boolean isCheckedTerms = true;
    private GoogleApiClient mCredentialsApiClient;
    private final ActivityResultLauncher<String> requestPermissionLauncher;
    private IntroViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: LoginFragment.kt */
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
        return C1188R.C1193layout.fragment_login;
    }

    public void onConnected(Bundle bundle) {
    }

    public void onConnectionFailed(ConnectionResult connectionResult) {
        Intrinsics.checkNotNullParameter(connectionResult, "p0");
    }

    public void onConnectionSuspended(int i) {
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public LoginFragment() {
        ActivityResultLauncher<String> registerForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new LoginFragment$$ExternalSyntheticLambda4(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…callAPi()\n        }\n    }");
        this.requestPermissionLauncher = registerForActivityResult;
    }

    public final boolean isCheckedTerms() {
        return this.isCheckedTerms;
    }

    public final void setCheckedTerms(boolean z) {
        this.isCheckedTerms = z;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        listeners();
        IntroViewModel introViewModel = (IntroViewModel) new ViewModelProvider(this).get(IntroViewModel.class);
        this.viewModel = introViewModel;
        if (introViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            introViewModel = null;
        }
        introViewModel.getSettingsApi();
        observeData();
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etMobileNumber)).addTextChangedListener(new LoginFragment$onViewCreated$1());
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etMobileNumber)).setOnEditorActionListener(new LoginFragment$$ExternalSyntheticLambda3(this));
        showHint();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final boolean m3777onViewCreated$lambda0(LoginFragment loginFragment, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(loginFragment, "this$0");
        if (i != 6) {
            return false;
        }
        Context requireContext = loginFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        CommonMethodsKt.hideKeyboard(requireContext, (EditText) loginFragment._$_findCachedViewById(C1188R.C1192id.etMobileNumber));
        loginFragment.checkValidation();
        return true;
    }

    public final void callAPi() {
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setEnabled(false);
        HashMap hashMap = new HashMap();
        hashMap.put("mobileNo", ((EditText) _$_findCachedViewById(C1188R.C1192id.etMobileNumber)).getText().toString());
        IntroViewModel introViewModel = this.viewModel;
        if (introViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            introViewModel = null;
        }
        introViewModel.apiLogin(hashMap);
    }

    public final String removeLeadingZeros(String str) {
        Intrinsics.checkNotNullParameter(str, "num");
        int length = str.toString().length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != '0') {
                String substring = str.toString().substring(i);
                Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                return substring;
            }
        }
        return "0";
    }

    /* access modifiers changed from: private */
    /* renamed from: requestPermissionLauncher$lambda-1  reason: not valid java name */
    public static final void m3778requestPermissionLauncher$lambda1(LoginFragment loginFragment, Boolean bool) {
        Intrinsics.checkNotNullParameter(loginFragment, "this$0");
        Intrinsics.checkNotNullExpressionValue(bool, "isGranted");
        if (bool.booleanValue()) {
            Log.v("PERMISSION", "PERMISSION GRANTED");
            loginFragment.callAPi();
            return;
        }
        Log.v("PERMISSION", "PERMISSION NOT GRANTED");
        loginFragment.callAPi();
    }

    private final void smsPermissionRequest() {
        this.requestPermissionLauncher.launch("android.permission.RECEIVE_SMS");
    }

    public void onPause() {
        super.onPause();
        GoogleApiClient googleApiClient = this.mCredentialsApiClient;
        if (googleApiClient != null) {
            googleApiClient.stopAutoManage(requireActivity());
        }
        GoogleApiClient googleApiClient2 = this.mCredentialsApiClient;
        if (googleApiClient2 != null) {
            googleApiClient2.disconnect();
        }
    }

    private final void showHint() {
        try {
            this.mCredentialsApiClient = new GoogleApiClient.Builder(requireContext()).addConnectionCallbacks(this).enableAutoManage(requireActivity(), this).addApi(Auth.CREDENTIALS_API).build();
            HintRequest build = new HintRequest.Builder().setPhoneNumberIdentifierSupported(true).build();
            Intrinsics.checkNotNullExpressionValue(build, "Builder().setPhoneNumber…\n                .build()");
            CredentialsOptions build2 = new CredentialsOptions.Builder().forceEnableSaveDialog().build();
            Intrinsics.checkNotNullExpressionValue(build2, "Builder()\n              …\n                .build()");
            CredentialsClient client = Credentials.getClient((Activity) requireActivity(), build2);
            Intrinsics.checkNotNullExpressionValue(client, "getClient(requireActivity(), options)");
            PendingIntent hintPickerIntent = client.getHintPickerIntent(build);
            Intrinsics.checkNotNullExpressionValue(hintPickerIntent, "credentialsClient.getHintPickerIntent(hintRequest)");
            try {
                startIntentSenderForResult(hintPickerIntent.getIntentSender(), this.RC_HINT, (Intent) null, 0, 0, 0, new Bundle());
            } catch (IntentSender.SendIntentException e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            Log.v("ExceptionShow", e2.toString());
        }
    }

    private final void listeners() {
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setOnClickListener(onClickListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etMobileNumber)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTerms)).setOnClickListener(onClickListener);
        ((CheckBox) _$_findCachedViewById(C1188R.C1192id.checkbox)).setOnCheckedChangeListener(new LoginFragment$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-2  reason: not valid java name */
    public static final void m3774listeners$lambda2(LoginFragment loginFragment, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(loginFragment, "this$0");
        loginFragment.isCheckedTerms = z;
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id == C1188R.C1192id.tvContinue) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            CommonMethodsKt.hideKeyboard(requireContext, (EditText) _$_findCachedViewById(C1188R.C1192id.etMobileNumber));
            checkValidation();
        } else if (id == C1188R.C1192id.tvTerms) {
            Intent intent = new Intent(requireActivity(), WebViewActivity.class);
            intent.putExtra("web_url", Constants.TERMS_URL);
            intent.putExtra("title", "Terms and Conditions");
            startActivity(intent);
        }
    }

    private final void observeData() {
        IntroViewModel introViewModel = this.viewModel;
        IntroViewModel introViewModel2 = null;
        if (introViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            introViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<SettingsModel>> settingsApi = introViewModel.getSettingsApi();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        settingsApi.observe(viewLifecycleOwner, new LoginFragment$$ExternalSyntheticLambda0());
        IntroViewModel introViewModel3 = this.viewModel;
        if (introViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            introViewModel2 = introViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<User>> login = introViewModel2.getLogin();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        login.observe(viewLifecycleOwner2, new LoginFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-3  reason: not valid java name */
    public static final void m3775observeData$lambda3(ApiResponseHandler apiResponseHandler) {
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                SettingsModel settingsModel = (SettingsModel) apiResponseHandler.getData();
                if (settingsModel != null) {
                    UserManager.INSTANCE.saveAppSettings(settingsModel);
                }
            } else if (i == 2) {
                Log.i("ERROR", new Gson().toJson((Object) apiResponseHandler.getMessage()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-4  reason: not valid java name */
    public static final void m3776observeData$lambda4(LoginFragment loginFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(loginFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ((TextView) loginFragment._$_findCachedViewById(C1188R.C1192id.tvContinue)).setEnabled(true);
                loginFragment.showToast("OTP sent successfully");
                if (apiResponseHandler.getData() != null) {
                    UserManager.INSTANCE.saveProfile((User) apiResponseHandler.getData());
                    Log.v("KYCHOME5_LOGIN", String.valueOf(((User) apiResponseHandler.getData()).getKycStatus()));
                    if (((User) apiResponseHandler.getData()).getOtpCode() != null) {
                        FragmentKt.findNavController(loginFragment).navigate((int) C1188R.C1192id.action_loginFragment_to_otpVerificationFragment, BundleKt.bundleOf(TuplesKt.m276to("otp", StringsKt.trim((CharSequence) ((User) apiResponseHandler.getData()).getOtpCode().toString()).toString()), TuplesKt.m276to("mobile", ((EditText) loginFragment._$_findCachedViewById(C1188R.C1192id.etMobileNumber)).getText().toString())));
                        return;
                    }
                    FragmentKt.findNavController(loginFragment).navigate((int) C1188R.C1192id.action_loginFragment_to_otpVerificationFragment, BundleKt.bundleOf(TuplesKt.m276to("mobile", ((EditText) loginFragment._$_findCachedViewById(C1188R.C1192id.etMobileNumber)).getText().toString())));
                    return;
                }
                FragmentKt.findNavController(loginFragment).navigate((int) C1188R.C1192id.action_loginFragment_to_otpVerificationFragment, BundleKt.bundleOf(TuplesKt.m276to("mobile", ((EditText) loginFragment._$_findCachedViewById(C1188R.C1192id.etMobileNumber)).getText().toString())));
            } else if (i == 2) {
                ((TextView) loginFragment._$_findCachedViewById(C1188R.C1192id.tvContinue)).setEnabled(true);
                FragmentActivity requireActivity = loginFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                loginFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ((TextView) loginFragment._$_findCachedViewById(C1188R.C1192id.tvContinue)).setEnabled(false);
            }
        }
    }

    private final boolean isValidPhoneNumber(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() < 6 || charSequence.length() > 10) {
            return false;
        }
        return Patterns.PHONE.matcher(charSequence).matches();
    }

    private final void checkValidation() {
        String obj = ((EditText) _$_findCachedViewById(C1188R.C1192id.etMobileNumber)).getText().toString();
        CharSequence charSequence = obj;
        if (charSequence.length() == 0) {
            showToast("Please enter your mobile number");
        } else if (!isValidPhoneNumber(charSequence)) {
            showToast("Please enter valid mobile number");
        } else if (obj.length() > 10) {
            showToast("Please enter valid mobile number");
        } else if (!((CheckBox) _$_findCachedViewById(C1188R.C1192id.ageCheck)).isChecked()) {
            showToast("Please confirm that you are of 18+ age");
        } else if (!this.isCheckedTerms) {
            showToast("Please accept terms and conditions");
        } else {
            callAPi();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == this.RC_HINT && i2 == -1) {
            Credential credential = intent != null ? (Credential) intent.getParcelableExtra(Credential.EXTRA_KEY) : null;
            if (credential != null) {
                String id = credential.getId();
                Intrinsics.checkNotNullExpressionValue(id, "credential.id");
                if (StringsKt.startsWith$default(id, "0", false, 2, (Object) null)) {
                    String id2 = credential.getId();
                    Intrinsics.checkNotNullExpressionValue(id2, "credential.id");
                    String substring = id2.substring(1, credential.getId().length());
                    Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    ((EditText) _$_findCachedViewById(C1188R.C1192id.etMobileNumber)).setText(substring);
                } else if (StringsKt.startsWith$default(credential.getId().toString(), "+91", false, 2, (Object) null)) {
                    String id3 = credential.getId();
                    Intrinsics.checkNotNullExpressionValue(id3, "credential.id");
                    String substring2 = id3.substring(3, credential.getId().length());
                    Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    ((EditText) _$_findCachedViewById(C1188R.C1192id.etMobileNumber)).setText(substring2);
                } else if (StringsKt.startsWith$default(credential.getId().toString(), "91", false, 2, (Object) null)) {
                    String id4 = credential.getId();
                    Intrinsics.checkNotNullExpressionValue(id4, "credential.id");
                    String substring3 = id4.substring(2, credential.getId().length());
                    Intrinsics.checkNotNullExpressionValue(substring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    ((EditText) _$_findCachedViewById(C1188R.C1192id.etMobileNumber)).setText(substring3);
                }
            }
        }
    }
}
