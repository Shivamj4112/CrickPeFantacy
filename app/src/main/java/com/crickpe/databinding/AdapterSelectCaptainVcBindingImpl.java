package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Players;

public class AdapterSelectCaptainVcBindingImpl extends AdapterSelectCaptainVcBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView4;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.relativeLayout, 5);
        sparseIntArray.put(C1188R.C1192id.imagesLayout, 6);
        sparseIntArray.put(C1188R.C1192id.ivRole, 7);
        sparseIntArray.put(C1188R.C1192id.tvPointsCaptainVc, 8);
        sparseIntArray.put(C1188R.C1192id.tvBattingStyle, 9);
        sparseIntArray.put(C1188R.C1192id.points, 10);
        sparseIntArray.put(C1188R.C1192id.llSelection, 11);
        sparseIntArray.put(C1188R.C1192id.twox, 12);
        sparseIntArray.put(C1188R.C1192id.tvCaptain, 13);
        sparseIntArray.put(C1188R.C1192id.selectionPercentage, 14);
        sparseIntArray.put(C1188R.C1192id.halfx, 15);
        sparseIntArray.put(C1188R.C1192id.tvVCaptain, 16);
        sparseIntArray.put(C1188R.C1192id.tvVcPer, 17);
    }

    public AdapterSelectCaptainVcBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 18, sIncludes, sViewsWithIds));
    }

    private AdapterSelectCaptainVcBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[15], objArr[6], objArr[3], objArr[1], objArr[7], objArr[11], objArr[10], objArr[5], objArr[14], objArr[9], objArr[13], objArr[8], objArr[2], objArr[16], objArr[17], objArr[12]);
        this.mDirtyFlags = -1;
        this.constrainTop.setTag((Object) null);
        this.ivFlag.setTag((Object) null);
        this.ivPlayerCVc.setTag((Object) null);
        TextView textView = objArr[4];
        this.mboundView4 = textView;
        textView.setTag((Object) null);
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

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.mDirtyFlags     // Catch:{ all -> 0x004f }
            r2 = 0
            r7.mDirtyFlags = r2     // Catch:{ all -> 0x004f }
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            com.crickpe.view.detail.fragments.create_own_team.create_team.Players r4 = r7.mModel
            r5 = 3
            long r0 = r0 & r5
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0031
            if (r4 == 0) goto L_0x0021
            java.lang.String r0 = r4.getImageUrl()
            java.lang.String r1 = r4.getName()
            com.crickpe.view.detail.fragments.create_own_team.create_team.Team r2 = r4.getTeam()
            goto L_0x0024
        L_0x0021:
            r0 = r5
            r1 = r0
            r2 = r1
        L_0x0024:
            if (r2 == 0) goto L_0x002f
            java.lang.String r3 = r2.getCode()
            java.lang.String r2 = r2.getTeamIconUrl()
            goto L_0x0035
        L_0x002f:
            r2 = r5
            goto L_0x0034
        L_0x0031:
            r0 = r5
            r1 = r0
            r2 = r1
        L_0x0034:
            r3 = r2
        L_0x0035:
            if (r6 == 0) goto L_0x004e
            de.hdodenhof.circleimageview.CircleImageView r4 = r7.ivFlag
            r6 = r5
            android.graphics.drawable.Drawable r6 = (android.graphics.drawable.Drawable) r6
            com.crickpe.utils.recycler.BindingAdapters.setImageUrl(r4, r2, r5)
            de.hdodenhof.circleimageview.CircleImageView r2 = r7.ivPlayerCVc
            com.crickpe.utils.recycler.BindingAdapters.setImageUrl(r2, r0, r5)
            android.widget.TextView r0 = r7.mboundView4
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r1)
            android.widget.TextView r0 = r7.tvTeamCode
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r3)
        L_0x004e:
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x004f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.AdapterSelectCaptainVcBindingImpl.executeBindings():void");
    }
}
