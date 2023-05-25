package com.crickpe.view.home.adapters;

import android.os.Handler;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.home.adapters.TrackRewardsAdapter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\f"}, mo48222d2 = {"com/crickpe/view/home/adapters/TrackRewardsAdapter$onBindViewHolder$listener$1", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "onProgressChanged", "", "seekBar", "Landroid/widget/SeekBar;", "progress", "", "fromUser", "", "onStartTrackingTouch", "onStopTrackingTouch", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TrackRewardsAdapter.kt */
public final class TrackRewardsAdapter$onBindViewHolder$listener$1 implements SeekBar.OnSeekBarChangeListener {
    final /* synthetic */ TrackRewardsAdapter.ViewHolder $holder;

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
    }

    TrackRewardsAdapter$onBindViewHolder$listener$1(TrackRewardsAdapter.ViewHolder viewHolder) {
        this.$holder = viewHolder;
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        new Handler().postDelayed(new C1215xb0f6aef9(this.$holder), 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: onProgressChanged$lambda-0  reason: not valid java name */
    public static final void m3693onProgressChanged$lambda0(TrackRewardsAdapter.ViewHolder viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "$holder");
        int progress = ((SeekBar) viewHolder.itemView.findViewById(C1188R.C1192id.seekBar)).getProgress();
        SeekBar seekBar = (SeekBar) viewHolder.itemView.findViewById(C1188R.C1192id.seekBar);
        Intrinsics.checkNotNull(seekBar);
        int width = (progress * (seekBar.getWidth() - (((SeekBar) viewHolder.itemView.findViewById(C1188R.C1192id.seekBar)).getThumbOffset() * 2))) / ((SeekBar) viewHolder.itemView.findViewById(C1188R.C1192id.seekBar)).getMax();
        TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.textView);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.textView");
        BindingAdapters.setNumber(textView, (double) ((SeekBar) viewHolder.itemView.findViewById(C1188R.C1192id.seekBar)).getProgress());
        float x = ((SeekBar) viewHolder.itemView.findViewById(C1188R.C1192id.seekBar)).getX() + ((float) width) + ((float) (((SeekBar) viewHolder.itemView.findViewById(C1188R.C1192id.seekBar)).getThumbOffset() / 2));
        ((LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llText)).setX(x);
        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivThumb)).setX(x);
    }
}
