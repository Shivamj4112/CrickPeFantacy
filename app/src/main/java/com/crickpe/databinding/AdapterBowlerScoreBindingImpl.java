package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BowlingOrder;

public class AdapterBowlerScoreBindingImpl extends AdapterBowlerScoreBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private final TextView mboundView1;
    private final TextView mboundView2;
    private final TextView mboundView3;
    private final TextView mboundView4;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.onItemClick, 5);
        sparseIntArray.put(C1188R.C1192id.view2, 6);
        sparseIntArray.put(C1188R.C1192id.rlPlayer, 7);
        sparseIntArray.put(C1188R.C1192id.tvName, 8);
        sparseIntArray.put(C1188R.C1192id.tvEconomy, 9);
    }

    public AdapterBowlerScoreBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private AdapterBowlerScoreBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[5], objArr[7], objArr[9], objArr[8], objArr[6]);
        this.mDirtyFlags = -1;
        LinearLayout linearLayout = objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = objArr[3];
        this.mboundView3 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[4];
        this.mboundView4 = textView4;
        textView4.setTag((Object) null);
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
        setModel((BowlingOrder) obj);
        return true;
    }

    public void setModel(BowlingOrder bowlingOrder) {
        this.mModel = bowlingOrder;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BowlingScore} */
    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: type inference failed for: r6v7 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.mDirtyFlags     // Catch:{ all -> 0x005d }
            r2 = 0
            r9.mDirtyFlags = r2     // Catch:{ all -> 0x005d }
            monitor-exit(r9)     // Catch:{ all -> 0x005d }
            com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BowlingOrder r4 = r9.mModel
            r5 = 0
            r6 = 3
            long r0 = r0 & r6
            r6 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x0043
            if (r4 == 0) goto L_0x0019
            com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BowlingScore r6 = r4.getBowlingScore()
        L_0x0019:
            r0 = 0
            if (r6 == 0) goto L_0x002d
            int r0 = r6.getWickets()
            float r5 = r6.getOvers()
            int r1 = r6.getMaiden_overs()
            int r2 = r6.getRuns()
            goto L_0x002f
        L_0x002d:
            r1 = 0
            r2 = 0
        L_0x002f:
            java.lang.String r6 = java.lang.Integer.toString(r0)
            java.lang.String r0 = java.lang.Float.toString(r5)
            java.lang.String r1 = java.lang.Integer.toString(r1)
            java.lang.String r2 = java.lang.Integer.toString(r2)
            r8 = r6
            r6 = r0
            r0 = r8
            goto L_0x0046
        L_0x0043:
            r0 = r6
            r1 = r0
            r2 = r1
        L_0x0046:
            if (r7 == 0) goto L_0x005c
            android.widget.TextView r3 = r9.mboundView1
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r3, r6)
            android.widget.TextView r3 = r9.mboundView2
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r3, r1)
            android.widget.TextView r1 = r9.mboundView3
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r1, r2)
            android.widget.TextView r1 = r9.mboundView4
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r1, r0)
        L_0x005c:
            return
        L_0x005d:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x005d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.AdapterBowlerScoreBindingImpl.executeBindings():void");
    }
}
