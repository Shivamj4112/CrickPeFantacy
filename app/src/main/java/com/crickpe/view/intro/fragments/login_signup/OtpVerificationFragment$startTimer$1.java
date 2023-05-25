package com.crickpe.view.intro.fragments.login_signup;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.crickpe.C1188R;
import com.crickpe.utils.CommonMethodsKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

@Metadata(mo48221d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo48222d2 = {"com/crickpe/view/intro/fragments/login_signup/OtpVerificationFragment$startTimer$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: OtpVerificationFragment.kt */
public final class OtpVerificationFragment$startTimer$1 extends CountDownTimer {
    final /* synthetic */ OtpVerificationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OtpVerificationFragment$startTimer$1(OtpVerificationFragment otpVerificationFragment, long j) {
        super(j, 500);
        this.this$0 = otpVerificationFragment;
    }

    public void onTick(long j) {
        try {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            long j2 = (long) 60000;
            String format = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j / j2)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
            int i = (int) ((j % j2) / ((long) 1000));
            StringBuilder sb = new StringBuilder();
            sb.append(format);
            sb.append(':');
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(format, *args)");
            sb.append(format2);
            ((TextView) this.this$0._$_findCachedViewById(C1188R.C1192id.tvTimeLapse)).setText(sb.toString());
        } catch (Exception unused) {
        }
    }

    public void onFinish() {
        try {
            ((TextView) this.this$0._$_findCachedViewById(C1188R.C1192id.tvTimeLapse)).setText("00:00");
            TextView textView = (TextView) this.this$0._$_findCachedViewById(C1188R.C1192id.tvTimeLapse);
            Intrinsics.checkNotNullExpressionValue(textView, "tvTimeLapse");
            CommonMethodsKt.hide(textView);
            TextView textView2 = (TextView) this.this$0._$_findCachedViewById(C1188R.C1192id.tvResend);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvResend");
            CommonMethodsKt.visible(textView2);
        } catch (Exception unused) {
        }
    }
}
