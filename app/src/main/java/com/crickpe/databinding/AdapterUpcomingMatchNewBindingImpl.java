package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;

public class AdapterUpcomingMatchNewBindingImpl extends AdapterUpcomingMatchNewBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.rlTop, 1);
        sparseIntArray.put(C1188R.C1192id.ivVipTag, 2);
        sparseIntArray.put(C1188R.C1192id.textView17, 3);
        sparseIntArray.put(C1188R.C1192id.relativeLayout7, 4);
        sparseIntArray.put(C1188R.C1192id.ivTeam1Flag, 5);
        sparseIntArray.put(C1188R.C1192id.tvTeamCode1, 6);
        sparseIntArray.put(C1188R.C1192id.ivTeam2Flag, 7);
        sparseIntArray.put(C1188R.C1192id.tvTeamCode2, 8);
        sparseIntArray.put(C1188R.C1192id.timeLayout, 9);
        sparseIntArray.put(C1188R.C1192id.ivTime, 10);
        sparseIntArray.put(C1188R.C1192id.tvTimeRemaining, 11);
        sparseIntArray.put(C1188R.C1192id.view3, 12);
        sparseIntArray.put(C1188R.C1192id.linearLayout15, 13);
        sparseIntArray.put(C1188R.C1192id.textView19, 14);
        sparseIntArray.put(C1188R.C1192id.ivInfoMatch, 15);
    }

    public AdapterUpcomingMatchNewBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 16, sIncludes, sViewsWithIds));
    }

    private AdapterUpcomingMatchNewBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[15], objArr[5], objArr[7], objArr[10], objArr[2], objArr[13], objArr[0], objArr[4], objArr[1], objArr[3], objArr[14], objArr[9], objArr[6], objArr[8], objArr[11], objArr[12]);
        this.mDirtyFlags = -1;
        this.llTop.setTag((Object) null);
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
        setModel((UpcomingMatchModel) obj);
        return true;
    }

    public void setModel(UpcomingMatchModel upcomingMatchModel) {
        this.mModel = upcomingMatchModel;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0;
        }
    }
}
