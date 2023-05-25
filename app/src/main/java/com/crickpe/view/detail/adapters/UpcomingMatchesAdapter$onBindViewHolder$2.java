package com.crickpe.view.detail.adapters;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.adapters.UpcomingMatchesAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¨\u0006\u0007"}, mo48222d2 = {"com/crickpe/view/detail/adapters/UpcomingMatchesAdapter$onBindViewHolder$2", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UpcomingMatchesAdapter.kt */
public final class UpcomingMatchesAdapter$onBindViewHolder$2 extends CountDownTimer {
    final /* synthetic */ UpcomingMatchesAdapter.MyViewHolder $holder;
    final /* synthetic */ UpcomingMatchesAdapter this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UpcomingMatchesAdapter$onBindViewHolder$2(UpcomingMatchesAdapter.MyViewHolder myViewHolder, UpcomingMatchesAdapter upcomingMatchesAdapter, long j) {
        super(j, 1000);
        this.$holder = myViewHolder;
        this.this$0 = upcomingMatchesAdapter;
    }

    public void onTick(long j) {
        long j2 = (long) 60;
        long j3 = j2 * 1000;
        long j4 = j2 * j3;
        long j5 = ((long) 24) * j4;
        try {
            long j6 = j / j5;
            long j7 = j % j5;
            long j8 = j7 / j4;
            long j9 = j7 % j4;
            long j10 = j9 / j3;
            long j11 = (j9 % j3) / 1000;
            if (j6 >= 2) {
                ((TextView) this.$holder.itemView.findViewById(C1188R.C1192id.tvTimeRemaining)).setText(j6 + " days");
                return;
            }
            if (Intrinsics.areEqual((Object) String.valueOf(j6), (Object) "0")) {
                if (!Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
                    if (Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0") || !Intrinsics.areEqual((Object) String.valueOf(j10), (Object) "0")) {
                        ((TextView) this.$holder.itemView.findViewById(C1188R.C1192id.tvTimeRemaining)).setText(j8 + "h " + j10 + 'm');
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append(j8);
                    sb.append('h');
                    ((TextView) this.$holder.itemView.findViewById(C1188R.C1192id.tvTimeRemaining)).setText(sb.toString());
                    return;
                }
            }
            if (Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
                if (!Intrinsics.areEqual((Object) String.valueOf(j10), (Object) "0")) {
                    ((TextView) this.$holder.itemView.findViewById(C1188R.C1192id.tvTimeRemaining)).setText(j10 + "m " + j11 + 's');
                    return;
                }
            }
            if (!Intrinsics.areEqual((Object) String.valueOf(j10), (Object) "0") || !Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
                if (!Intrinsics.areEqual((Object) String.valueOf(j6), (Object) "0")) {
                    if (!Intrinsics.areEqual((Object) String.valueOf(j8), (Object) "0")) {
                        ((TextView) this.$holder.itemView.findViewById(C1188R.C1192id.tvTimeRemaining)).setText(j6 + "d " + j8 + "h ");
                        return;
                    }
                }
                ((TextView) this.$holder.itemView.findViewById(C1188R.C1192id.tvTimeRemaining)).setText(j6 + "d " + j8 + "h " + j10 + "m " + j11 + 's');
                return;
            }
            ((TextView) this.$holder.itemView.findViewById(C1188R.C1192id.tvTimeRemaining)).setText(j11 + " s");
        } catch (Exception unused) {
        }
    }

    public void onFinish() {
        this.this$0.getOnItemClicked().onTimeFinish();
        ((TextView) this.$holder.itemView.findViewById(C1188R.C1192id.tvTimeRemaining)).setText("0s");
    }
}
