package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.InningsArr;

public class AdapterLivescoreBarBindingImpl extends AdapterLivescoreBarBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final TextView mboundView1;
    private final TextView mboundView3;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.relativeLayout6, 5);
        sparseIntArray.put(C1188R.C1192id.ivDropdown, 6);
        sparseIntArray.put(C1188R.C1192id.view4, 7);
        sparseIntArray.put(C1188R.C1192id.llBody, 8);
        sparseIntArray.put(C1188R.C1192id.rlTop, 9);
        sparseIntArray.put(C1188R.C1192id.rlPlayer, 10);
        sparseIntArray.put(C1188R.C1192id.tvName, 11);
        sparseIntArray.put(C1188R.C1192id.rvScore, 12);
        sparseIntArray.put(C1188R.C1192id.extra, 13);
        sparseIntArray.put(C1188R.C1192id.tvExtras, 14);
        sparseIntArray.put(C1188R.C1192id.total, 15);
        sparseIntArray.put(C1188R.C1192id.tvTotalRuns, 16);
        sparseIntArray.put(C1188R.C1192id.tvTotal, 17);
        sparseIntArray.put(C1188R.C1192id.rlBowler, 18);
        sparseIntArray.put(C1188R.C1192id.rlBPlayer, 19);
        sparseIntArray.put(C1188R.C1192id.rvBowling, 20);
    }

    public AdapterLivescoreBarBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 21, sIncludes, sViewsWithIds));
    }

    private AdapterLivescoreBarBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[13], objArr[6], objArr[8], objArr[5], objArr[19], objArr[18], objArr[10], objArr[9], objArr[20], objArr[12], objArr[15], objArr[4], objArr[14], objArr[11], objArr[2], objArr[17], objArr[16], objArr[7]);
        this.mDirtyFlags = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag((Object) null);
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[3];
        this.mboundView3 = textView2;
        textView2.setTag((Object) null);
        this.tvExtraRuns.setTag((Object) null);
        this.tvScore.setTag((Object) null);
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
        setModel((InningsArr) obj);
        return true;
    }

    public void setModel(InningsArr inningsArr) {
        this.mModel = inningsArr;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.ExtraRuns} */
    /* JADX WARNING: type inference failed for: r7v1 */
    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: type inference failed for: r7v7 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r10 = this;
            monitor-enter(r10)
            long r0 = r10.mDirtyFlags     // Catch:{ all -> 0x00b5 }
            r2 = 0
            r10.mDirtyFlags = r2     // Catch:{ all -> 0x00b5 }
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.InningsArr r4 = r10.mModel
            r5 = 0
            r7 = 3
            long r0 = r0 & r7
            r7 = 0
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 == 0) goto L_0x009b
            if (r4 == 0) goto L_0x001f
            com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.TeamnInfo r0 = r4.getTeamnInfo()
            com.crickpe.view.detail.fragments.my_matches_detail.Innings r1 = r4.getInnings()
            goto L_0x0021
        L_0x001f:
            r0 = r7
            r1 = r0
        L_0x0021:
            if (r0 == 0) goto L_0x0028
            java.lang.String r0 = r0.getCode()
            goto L_0x0029
        L_0x0028:
            r0 = r7
        L_0x0029:
            r2 = 0
            if (r1 == 0) goto L_0x003d
            com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.ExtraRuns r7 = r1.getExtra_runs()
            int r3 = r1.getWickets()
            com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.Score r4 = r1.getScore()
            double r5 = r1.getOvers()
            goto L_0x003f
        L_0x003d:
            r4 = r7
            r3 = 0
        L_0x003f:
            if (r7 == 0) goto L_0x0046
            int r1 = r7.getExtra()
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            if (r4 == 0) goto L_0x004d
            int r2 = r4.getRuns()
        L_0x004d:
            java.lang.String r4 = java.lang.Double.toString(r5)
            java.lang.String r7 = java.lang.Integer.toString(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = "/"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "("
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = r4.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = ")"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r9 = r7
            r7 = r0
            r0 = r9
            goto L_0x009e
        L_0x009b:
            r0 = r7
            r1 = r0
            r2 = r1
        L_0x009e:
            if (r8 == 0) goto L_0x00b4
            android.widget.TextView r3 = r10.mboundView1
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r3, r7)
            android.widget.TextView r3 = r10.mboundView3
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r3, r2)
            android.widget.TextView r2 = r10.tvExtraRuns
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r2, r0)
            android.widget.TextView r0 = r10.tvScore
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r1)
        L_0x00b4:
            return
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00b5 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.AdapterLivescoreBarBindingImpl.executeBindings():void");
    }
}
