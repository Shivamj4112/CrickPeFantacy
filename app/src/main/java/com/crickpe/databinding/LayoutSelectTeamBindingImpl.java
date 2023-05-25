package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Players;

public class LayoutSelectTeamBindingImpl extends LayoutSelectTeamBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView3;
    private final TextView mboundView4;
    private final TextView mboundView5;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.imagesLayout, 7);
        sparseIntArray.put(C1188R.C1192id.ivPlayer, 8);
        sparseIntArray.put(C1188R.C1192id.ivRole, 9);
        sparseIntArray.put(C1188R.C1192id.ivIsPlaying, 10);
        sparseIntArray.put(C1188R.C1192id.ivIsPlayingNot, 11);
        sparseIntArray.put(C1188R.C1192id.ivFlag, 12);
        sparseIntArray.put(C1188R.C1192id.tvpoints, 13);
        sparseIntArray.put(C1188R.C1192id.points, 14);
        sparseIntArray.put(C1188R.C1192id.tvBattingStyle, 15);
        sparseIntArray.put(C1188R.C1192id.rlBowlingStyle, 16);
        sparseIntArray.put(C1188R.C1192id.ivBowlingStyle, 17);
        sparseIntArray.put(C1188R.C1192id.tvBowlingStyle, 18);
        sparseIntArray.put(C1188R.C1192id.rlCup1, 19);
        sparseIntArray.put(C1188R.C1192id.ivCup1, 20);
        sparseIntArray.put(C1188R.C1192id.rlCup2, 21);
        sparseIntArray.put(C1188R.C1192id.ivCup2, 22);
        sparseIntArray.put(C1188R.C1192id.rlCup3, 23);
        sparseIntArray.put(C1188R.C1192id.ivCup3, 24);
        sparseIntArray.put(C1188R.C1192id.rlCup4, 25);
        sparseIntArray.put(C1188R.C1192id.ivCup4, 26);
        sparseIntArray.put(C1188R.C1192id.rlCup5, 27);
        sparseIntArray.put(C1188R.C1192id.ivCup5, 28);
        sparseIntArray.put(C1188R.C1192id.tvAnnouced, 29);
        sparseIntArray.put(C1188R.C1192id.tvSeeAll, 30);
    }

    public LayoutSelectTeamBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 31, sIncludes, sViewsWithIds));
    }

    private LayoutSelectTeamBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[6], objArr[7], objArr[17], objArr[20], objArr[22], objArr[24], objArr[26], objArr[28], objArr[12], objArr[10], objArr[11], objArr[8], objArr[9], objArr[0], objArr[14], objArr[1], objArr[16], objArr[19], objArr[21], objArr[23], objArr[25], objArr[27], objArr[29], objArr[15], objArr[18], objArr[30], objArr[2], objArr[13]);
        this.mDirtyFlags = -1;
        this.checkbox.setTag((Object) null);
        TextView textView = objArr[3];
        this.mboundView3 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[4];
        this.mboundView4 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = objArr[5];
        this.mboundView5 = textView3;
        textView3.setTag((Object) null);
        this.onItemClick.setTag((Object) null);
        this.relativeLayout.setTag((Object) null);
        this.tvTeamCode.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int i, Object obj) {
        if (2 != i) {
            return false;
        }
        setModel((Players) obj);
        return true;
    }

    public void setModel(Players players) {
        this.mModel = players;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r11v4, types: [java.lang.String] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.mDirtyFlags     // Catch:{ all -> 0x00a2 }
            r2 = 0
            r15.mDirtyFlags = r2     // Catch:{ all -> 0x00a2 }
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            com.crickpe.view.detail.fragments.create_own_team.create_team.Players r4 = r15.mModel
            r5 = 3
            long r7 = r0 & r5
            r9 = 0
            r10 = 0
            r11 = 0
            int r12 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x0076
            if (r4 == 0) goto L_0x0030
            float r9 = r4.getPlayerSelPercentage()
            java.lang.String r7 = r4.getName()
            com.crickpe.view.detail.fragments.create_own_team.create_team.Team r8 = r4.getTeam()
            float r10 = r4.getCreditPoints()
            boolean r4 = r4.isSelected()
            r14 = r10
            r10 = r4
            r4 = r9
            r9 = r14
            goto L_0x0033
        L_0x0030:
            r7 = r11
            r8 = r7
            r4 = 0
        L_0x0033:
            if (r12 == 0) goto L_0x0043
            if (r10 == 0) goto L_0x003d
            r12 = 8
            long r0 = r0 | r12
            r12 = 32
            goto L_0x0042
        L_0x003d:
            r12 = 4
            long r0 = r0 | r12
            r12 = 16
        L_0x0042:
            long r0 = r0 | r12
        L_0x0043:
            if (r8 == 0) goto L_0x0049
            java.lang.String r11 = r8.getCode()
        L_0x0049:
            java.lang.String r8 = java.lang.Float.toString(r9)
            android.widget.ImageView r9 = r15.checkbox
            android.content.Context r9 = r9.getContext()
            if (r10 == 0) goto L_0x0059
            r12 = 2131165638(0x7f0701c6, float:1.7945499E38)
            goto L_0x005c
        L_0x0059:
            r12 = 2131165823(0x7f07027f, float:1.7945874E38)
        L_0x005c:
            android.graphics.drawable.Drawable r9 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r9, r12)
            if (r10 == 0) goto L_0x0068
            android.widget.RelativeLayout r10 = r15.relativeLayout
            r12 = 2131034256(0x7f050090, float:1.7679024E38)
            goto L_0x006d
        L_0x0068:
            android.widget.RelativeLayout r10 = r15.relativeLayout
            r12 = 2131034182(0x7f050046, float:1.7678874E38)
        L_0x006d:
            int r10 = getColorFromResource(r10, r12)
            r14 = r9
            r9 = r4
            r4 = r11
            r11 = r14
            goto L_0x0079
        L_0x0076:
            r4 = r11
            r7 = r4
            r8 = r7
        L_0x0079:
            long r0 = r0 & r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x00a1
            android.widget.ImageView r0 = r15.checkbox
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(r0, r11)
            android.widget.TextView r0 = r15.mboundView3
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r7)
            android.widget.TextView r0 = r15.mboundView4
            double r1 = (double) r9
            com.crickpe.utils.recycler.BindingAdapters.setWithoutDecimalPtsPer(r0, r1)
            android.widget.TextView r0 = r15.mboundView5
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r8)
            android.widget.RelativeLayout r0 = r15.relativeLayout
            android.graphics.drawable.ColorDrawable r1 = androidx.databinding.adapters.Converters.convertColorToDrawable(r10)
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(r0, r1)
            android.widget.TextView r0 = r15.tvTeamCode
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
        L_0x00a1:
            return
        L_0x00a2:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x00a2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.LayoutSelectTeamBindingImpl.executeBindings():void");
    }
}
