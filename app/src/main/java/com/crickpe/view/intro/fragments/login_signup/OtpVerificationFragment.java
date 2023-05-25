package com.crickpe.view.intro.fragments.login_signup;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.p004os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import com.amplitude.p014id.FileIdentityStorage;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.GenericTextWatcher;
import com.crickpe.utils.SMSListener;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.home.HomeActivity;
import com.crickpe.view.intro.IntroViewModel;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0014H\u0002J\b\u0010\u001f\u001a\u00020\u0019H\u0002J\b\u0010 \u001a\u00020\u0019H\u0002J\u0010\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0019H\u0016J\u001a\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010#2\u0006\u0010'\u001a\u00020\u0006H\u0016J\u001a\u0010(\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020#2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0010\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020-H\u0002J\b\u0010.\u001a\u00020\u0019H\u0002J\u0010\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u00020\u001cH\u0002J\b\u00101\u001a\u00020\u0019H\u0002J\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u001403*\u00020\u00142\u0006\u00104\u001a\u00020\u001cH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X.¢\u0006\u0002\n\u0000¨\u00065"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/login_signup/OtpVerificationFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Landroid/view/View$OnFocusChangeListener;", "()V", "condition", "", "getCondition", "()Z", "setCondition", "(Z)V", "downTimer", "Landroid/os/CountDownTimer;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "mobile", "", "otpReal", "viewModel", "Lcom/crickpe/view/intro/IntroViewModel;", "callVerifyApi", "", "fillOtp", "getFragmentLayoutResId", "", "hitApiLive", "otp", "listeners", "observeData", "onClick", "view", "Landroid/view/View;", "onDetach", "onFocusChange", "v", "hasFocus", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setSelectionEdittext", "editText", "Landroid/widget/EditText;", "startHandler", "startTimer", "sec", "stopHandler", "chunked", "", "size", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: OtpVerificationFragment.kt */
public final class OtpVerificationFragment extends BaseFragment implements View.OnClickListener, View.OnFocusChangeListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private boolean condition;
    private CountDownTimer downTimer;
    private Handler handler;
    private String mobile = "";
    /* access modifiers changed from: private */
    public String otpReal = "";
    private IntroViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: OtpVerificationFragment.kt */
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
        return C1188R.C1193layout.fragment_otp_verification;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        EditText editText = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_one);
        Intrinsics.checkNotNullExpressionValue(editText, "otp_textbox_one");
        EditText editText2 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_two);
        Intrinsics.checkNotNullExpressionValue(editText2, "otp_textbox_two");
        EditText editText3 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_three);
        Intrinsics.checkNotNullExpressionValue(editText3, "otp_textbox_three");
        EditText editText4 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_four);
        Intrinsics.checkNotNullExpressionValue(editText4, "otp_textbox_four");
        EditText editText5 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_five);
        Intrinsics.checkNotNullExpressionValue(editText5, "otp_textbox_five");
        EditText editText6 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_six);
        Intrinsics.checkNotNullExpressionValue(editText6, "otp_textbox_six");
        EditText editText7 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_seven);
        Intrinsics.checkNotNullExpressionValue(editText7, "otp_textbox_seven");
        EditText[] editTextArr = {editText, editText2, editText3, editText4, editText5, editText6, editText7};
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_one)).addTextChangedListener(new GenericTextWatcher((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_one), editTextArr));
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_two)).addTextChangedListener(new GenericTextWatcher((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_two), editTextArr));
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_three)).addTextChangedListener(new GenericTextWatcher((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_three), editTextArr));
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_four)).addTextChangedListener(new GenericTextWatcher((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_four), editTextArr));
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_five)).addTextChangedListener(new GenericTextWatcher((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_five), editTextArr));
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_six)).addTextChangedListener(new GenericTextWatcher((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_six), editTextArr));
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_seven)).addTextChangedListener(new GenericTextWatcher((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_seven), editTextArr));
        if (getArguments() != null) {
            this.otpReal = String.valueOf(requireArguments().getString("otp"));
            this.mobile = String.valueOf(requireArguments().getString("mobile"));
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvMobileNo)).setText("+91 " + this.mobile);
            if (!Intrinsics.areEqual((Object) this.otpReal, (Object) "null")) {
                fillOtp();
            }
        }
        LifecycleOwnerKt.getLifecycleScope(this).launchWhenCreated(new OtpVerificationFragment$onViewCreated$1(this, (Continuation<? super OtpVerificationFragment$onViewCreated$1>) null));
        listeners();
        this.viewModel = (IntroViewModel) new ViewModelProvider(this).get(IntroViewModel.class);
        observeData();
        View.OnFocusChangeListener onFocusChangeListener = this;
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_one)).setOnFocusChangeListener(onFocusChangeListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_two)).setOnFocusChangeListener(onFocusChangeListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_three)).setOnFocusChangeListener(onFocusChangeListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_four)).setOnFocusChangeListener(onFocusChangeListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_five)).setOnFocusChangeListener(onFocusChangeListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_six)).setOnFocusChangeListener(onFocusChangeListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_seven)).setOnFocusChangeListener(onFocusChangeListener);
    }

    public void onFocusChange(View view, boolean z) {
        if (z) {
            EditText editText = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_one);
            Intrinsics.checkNotNullExpressionValue(editText, "otp_textbox_one");
            setSelectionEdittext(editText);
            EditText editText2 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_two);
            Intrinsics.checkNotNullExpressionValue(editText2, "otp_textbox_two");
            setSelectionEdittext(editText2);
            EditText editText3 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_three);
            Intrinsics.checkNotNullExpressionValue(editText3, "otp_textbox_three");
            setSelectionEdittext(editText3);
            EditText editText4 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_four);
            Intrinsics.checkNotNullExpressionValue(editText4, "otp_textbox_four");
            setSelectionEdittext(editText4);
            EditText editText5 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_five);
            Intrinsics.checkNotNullExpressionValue(editText5, "otp_textbox_five");
            setSelectionEdittext(editText5);
            EditText editText6 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_six);
            Intrinsics.checkNotNullExpressionValue(editText6, "otp_textbox_six");
            setSelectionEdittext(editText6);
            EditText editText7 = (EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_seven);
            Intrinsics.checkNotNullExpressionValue(editText7, "otp_textbox_seven");
            setSelectionEdittext(editText7);
        }
    }

    private final void setSelectionEdittext(EditText editText) {
        if (editText != null) {
            try {
                editText.setSelection(editText.length());
            } catch (Exception e) {
                Log.v("setSelectionEdittext", e.toString());
            }
        }
    }

    private final void listeners() {
        SMSListener.Companion.bindListener(new OtpVerificationFragment$listeners$1(this));
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvVerify)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvResend)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvMobileNo)).setOnClickListener(onClickListener);
    }

    private final void observeData() {
        IntroViewModel introViewModel = this.viewModel;
        IntroViewModel introViewModel2 = null;
        if (introViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            introViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<User>> login = introViewModel.getLogin();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        login.observe(viewLifecycleOwner, new OtpVerificationFragment$$ExternalSyntheticLambda1(this));
        IntroViewModel introViewModel3 = this.viewModel;
        if (introViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            introViewModel2 = introViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<User>> submitOTP = introViewModel2.getSubmitOTP();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        submitOTP.observe(viewLifecycleOwner2, new OtpVerificationFragment$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3780observeData$lambda0(OtpVerificationFragment otpVerificationFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(otpVerificationFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i != 1) {
                if (i == 2) {
                    FragmentActivity requireActivity = otpVerificationFragment.requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    otpVerificationFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                }
            } else if (apiResponseHandler.getData() != null) {
                if (((User) apiResponseHandler.getData()).getOtpCode() != null) {
                    otpVerificationFragment.otpReal = StringsKt.trim((CharSequence) ((User) apiResponseHandler.getData()).getOtpCode().toString()).toString();
                    otpVerificationFragment.fillOtp();
                }
                otpVerificationFragment.showToast("OTP sent successfully");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3781observeData$lambda2(OtpVerificationFragment otpVerificationFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(otpVerificationFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                User user = (User) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (user != null) {
                    try {
                        UserManager userManager = UserManager.INSTANCE;
                        userManager.saveToken("Bearer " + ((User) apiResponseHandler.getData()).getAccessToken());
                        FragmentActivity requireActivity = otpVerificationFragment.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                        CommonMethodsKt.callAppsFlyer(requireActivity, user.get_id().toString(), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_LOGIN);
                        Bundle bundle = new Bundle();
                        bundle.putString(FileIdentityStorage.USER_ID_KEY, user.get_id().toString());
                        ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_LOGIN, bundle);
                        Boolean isNewProfile = user.isNewProfile();
                        Intrinsics.checkNotNull(isNewProfile);
                        if (isNewProfile.booleanValue()) {
                            FragmentKt.findNavController(otpVerificationFragment).navigate((int) C1188R.C1192id.action_otpVerificationFragment_to_profileSetUpFragment, BundleKt.bundleOf(TuplesKt.m276to("_id", user.get_id().toString())));
                        } else {
                            otpVerificationFragment.startActivity(new Intent(otpVerificationFragment.requireActivity(), HomeActivity.class));
                        }
                    } catch (Exception e) {
                        Log.v("Excption", e.toString());
                    }
                    UserManager.INSTANCE.saveProfile(user);
                    Log.v("Excption", String.valueOf(user.getKycStatus()));
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity2 = otpVerificationFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
                otpVerificationFragment.handleApiError(requireActivity2, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    public void onDetach() {
        super.onDetach();
        CountDownTimer countDownTimer = this.downTimer;
        if (countDownTimer != null) {
            Intrinsics.checkNotNull(countDownTimer);
            countDownTimer.cancel();
        }
    }

    /* access modifiers changed from: private */
    public final void startTimer(int i) {
        CountDownTimer otpVerificationFragment$startTimer$1 = new OtpVerificationFragment$startTimer$1(this, (long) (i * 1000));
        this.downTimer = otpVerificationFragment$startTimer$1;
        Intrinsics.checkNotNull(otpVerificationFragment$startTimer$1);
        otpVerificationFragment$startTimer$1.start();
    }

    private final void callVerifyApi() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_one)).getText());
            sb.append(((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_two)).getText());
            sb.append(((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_three)).getText());
            sb.append(((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_four)).getText());
            sb.append(((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_five)).getText());
            sb.append(((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_six)).getText());
            sb.append(((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_seven)).getText());
            String sb2 = sb.toString();
            this.otpReal = sb2;
            if (sb2.length() < 7) {
                showToast("Incorrect OTP");
            } else if (this.mobile.length() >= 10) {
                stopHandler();
                hitApiLive(sb2);
            } else {
                showToast("Please Enter 10 digit Mobile Number");
            }
        } catch (Exception e) {
            Log.v("callVerifyApi", e.toString());
        }
    }

    private final void hitApiLive(String str) {
        HashMap hashMap = new HashMap();
        Map map = hashMap;
        map.put("mobileNo", this.mobile.toString());
        map.put("otpCode", str);
        IntroViewModel introViewModel = this.viewModel;
        if (introViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            introViewModel = null;
        }
        introViewModel.apiSubmitOtp(hashMap);
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final void setHandler(Handler handler2) {
        this.handler = handler2;
    }

    public final boolean getCondition() {
        return this.condition;
    }

    public final void setCondition(boolean z) {
        this.condition = z;
    }

    private final void startHandler() {
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_one)).setText("");
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_two)).setText("");
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_three)).setText("");
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_four)).setText("");
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_five)).setText("");
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_six)).setText("");
        ((EditText) _$_findCachedViewById(C1188R.C1192id.otp_textbox_seven)).setText("");
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        Handler handler2 = new Handler(myLooper);
        this.handler = handler2;
        handler2.postDelayed(new OtpVerificationFragment$$ExternalSyntheticLambda0(this), 1000);
    }

    /* access modifiers changed from: private */
    /* renamed from: startHandler$lambda-3  reason: not valid java name */
    public static final void m3782startHandler$lambda3(OtpVerificationFragment otpVerificationFragment) {
        String str;
        Intrinsics.checkNotNullParameter(otpVerificationFragment, "this$0");
        if (!otpVerificationFragment.condition && (str = otpVerificationFragment.otpReal) != null) {
            List<String> chunked = otpVerificationFragment.chunked(str, 1);
            int size = chunked.size();
            for (int i = 0; i < size; i++) {
                try {
                    ((EditText) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.otp_textbox_one)).setText(chunked.get(0).toString());
                    ((EditText) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.otp_textbox_two)).setText(chunked.get(1).toString());
                    ((EditText) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.otp_textbox_three)).setText(chunked.get(2).toString());
                    ((EditText) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.otp_textbox_four)).setText(chunked.get(3).toString());
                    ((EditText) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.otp_textbox_five)).setText(chunked.get(4).toString());
                    ((EditText) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.otp_textbox_six)).setText(chunked.get(5).toString());
                    ((EditText) otpVerificationFragment._$_findCachedViewById(C1188R.C1192id.otp_textbox_seven)).setText(chunked.get(6).toString());
                } catch (Exception unused) {
                }
            }
            otpVerificationFragment.callVerifyApi();
        }
    }

    private final void stopHandler() {
        this.condition = true;
    }

    /* access modifiers changed from: private */
    public final void fillOtp() {
        startHandler();
    }

    private final List<String> chunked(String str, int i) {
        Iterable until = RangesKt.until(0, str.length() / i);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            String substring = str.substring(nextInt * i, (nextInt + 1) * i);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(substring);
        }
        return (List) arrayList;
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id == C1188R.C1192id.tvMobileNo) {
            FragmentKt.findNavController(this).popBackStack();
        } else if (id == C1188R.C1192id.tvResend) {
            HashMap hashMap = new HashMap();
            hashMap.put("mobileNo", this.mobile.toString());
            IntroViewModel introViewModel = this.viewModel;
            if (introViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                introViewModel = null;
            }
            introViewModel.apiLogin(hashMap);
            TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTimeLapse);
            Intrinsics.checkNotNullExpressionValue(textView, "tvTimeLapse");
            CommonMethodsKt.visible(textView);
            startTimer(30);
            TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvResend);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvResend");
            CommonMethodsKt.hide(textView2);
        } else if (id == C1188R.C1192id.tvVerify) {
            callVerifyApi();
        }
    }
}
