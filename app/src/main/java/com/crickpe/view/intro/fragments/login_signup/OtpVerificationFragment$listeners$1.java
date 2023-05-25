package com.crickpe.view.intro.fragments.login_signup;

import com.crickpe.utils.Common;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, mo48222d2 = {"com/crickpe/view/intro/fragments/login_signup/OtpVerificationFragment$listeners$1", "Lcom/crickpe/utils/Common$OTPListener;", "onOTPReceived", "", "extractedOTP", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: OtpVerificationFragment.kt */
public final class OtpVerificationFragment$listeners$1 implements Common.OTPListener {
    final /* synthetic */ OtpVerificationFragment this$0;

    OtpVerificationFragment$listeners$1(OtpVerificationFragment otpVerificationFragment) {
        this.this$0 = otpVerificationFragment;
    }

    public void onOTPReceived(String str) {
        Intrinsics.checkNotNullParameter(str, "extractedOTP");
        this.this$0.otpReal = str;
        this.this$0.fillOtp();
    }
}
