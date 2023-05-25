package com.crickpe.view.detail;

import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.crickpe.C1188R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo48222d2 = {"com/crickpe/view/detail/DetailActivity$printDifferenceDateForHours$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: DetailActivity.kt */
public final class DetailActivity$printDifferenceDateForHours$1 extends CountDownTimer {
    final /* synthetic */ TextView $tvTimeRemaining;
    final /* synthetic */ DetailActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DetailActivity$printDifferenceDateForHours$1(long j, TextView textView, DetailActivity detailActivity) {
        super(j, 1000);
        this.$tvTimeRemaining = textView;
        this.this$0 = detailActivity;
    }

    public void onTick(long j) {
        long j2 = (long) 60;
        long j3 = j2 * 1000;
        long j4 = j2 * j3;
        long j5 = ((long) 24) * j4;
        long j6 = j / j5;
        long j7 = j % j5;
        long j8 = j7 / j4;
        long j9 = j7 % j4;
        long j10 = j9 / j3;
        long j11 = (j9 % j3) / 1000;
        if (j6 >= 2) {
            TextView textView = this.$tvTimeRemaining;
            textView.setText(j6 + " days");
        } else if (!Intrinsics.areEqual((Object) String.valueOf(j6), (Object) "0") || Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
            if (Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0") && !Intrinsics.areEqual((Object) String.valueOf(j10), (Object) "0")) {
                TextView textView2 = this.$tvTimeRemaining;
                textView2.setText(j10 + "m " + j11 + 's');
            } else if (Intrinsics.areEqual((Object) String.valueOf(j10), (Object) "0") && Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
                TextView textView3 = this.$tvTimeRemaining;
                textView3.setText(j11 + " s");
            } else if (Intrinsics.areEqual((Object) String.valueOf(j6), (Object) "0") || Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
                TextView textView4 = this.$tvTimeRemaining;
                textView4.setText(j6 + "d " + j8 + "h " + j10 + "m " + j11 + 's');
            } else {
                TextView textView5 = this.$tvTimeRemaining;
                textView5.setText(j6 + "d " + j8 + "h ");
            }
        } else if (Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0") || !Intrinsics.areEqual((Object) String.valueOf(j10), (Object) "0")) {
            TextView textView6 = this.$tvTimeRemaining;
            textView6.setText(j8 + "h " + j10 + 'm');
        } else {
            TextView textView7 = this.$tvTimeRemaining;
            StringBuilder sb = new StringBuilder();
            sb.append(j8);
            sb.append('h');
            textView7.setText(sb.toString());
        }
    }

    public void onFinish() {
        ((TextView) this.this$0._$_findCachedViewById(C1188R.C1192id.tvTime)).setText("0s");
        ((TextView) this.this$0._$_findCachedViewById(C1188R.C1192id.tvTime)).setTextColor(AppCompatResources.getColorStateList(this.this$0, C1188R.C1189color.red));
    }
}
