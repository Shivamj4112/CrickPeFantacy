package com.crickpe.view.home.adapters;

import android.os.CountDownTimer;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import com.crickpe.C1188R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(mo48221d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, mo48222d2 = {"com/crickpe/view/home/adapters/MyUpcomingMatchesAdapter$printDifferenceDateForHours$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyUpcomingMatchesAdapter.kt */
public final class MyUpcomingMatchesAdapter$printDifferenceDateForHours$1 extends CountDownTimer {
    final /* synthetic */ TextView $tvUpcomingTime;
    final /* synthetic */ MyUpcomingMatchesAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MyUpcomingMatchesAdapter$printDifferenceDateForHours$1(Ref.LongRef longRef, TextView textView, MyUpcomingMatchesAdapter myUpcomingMatchesAdapter) {
        super(longRef.element, 1000);
        this.$tvUpcomingTime = textView;
        this.this$0 = myUpcomingMatchesAdapter;
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
            TextView textView = this.$tvUpcomingTime;
            textView.setText(j6 + " days");
        } else if (!Intrinsics.areEqual((Object) String.valueOf(j6), (Object) "0") || Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
            if (Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0") && !Intrinsics.areEqual((Object) String.valueOf(j10), (Object) "0")) {
                TextView textView2 = this.$tvUpcomingTime;
                textView2.setText(j10 + "m " + j11 + 's');
            } else if (Intrinsics.areEqual((Object) String.valueOf(j10), (Object) "0") && Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
                TextView textView3 = this.$tvUpcomingTime;
                textView3.setText(j11 + " s");
            } else if (Intrinsics.areEqual((Object) String.valueOf(j6), (Object) "0") || Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
                TextView textView4 = this.$tvUpcomingTime;
                textView4.setText(j6 + "d " + j8 + "h " + j10 + "m " + j11 + 's');
            } else {
                TextView textView5 = this.$tvUpcomingTime;
                textView5.setText(j6 + "d " + j8 + "h ");
            }
        } else if (Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0") || !Intrinsics.areEqual((Object) String.valueOf(j10), (Object) "0")) {
            TextView textView6 = this.$tvUpcomingTime;
            textView6.setText(j8 + "h " + j10 + 'm');
        } else {
            TextView textView7 = this.$tvUpcomingTime;
            StringBuilder sb = new StringBuilder();
            sb.append(j8);
            sb.append('h');
            textView7.setText(sb.toString());
        }
    }

    public void onFinish() {
        this.$tvUpcomingTime.setText("0s");
        this.$tvUpcomingTime.setTextColor(AppCompatResources.getColorStateList(this.this$0.getContext(), C1188R.C1189color.red));
    }
}
