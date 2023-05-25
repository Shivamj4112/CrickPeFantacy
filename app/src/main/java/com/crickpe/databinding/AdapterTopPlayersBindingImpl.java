package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.top_players.models.Result;

public class AdapterTopPlayersBindingImpl extends AdapterTopPlayersBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.view, 2);
        sparseIntArray.put(C1188R.C1192id.onItemClick, 3);
        sparseIntArray.put(C1188R.C1192id.ivCrown, 4);
        sparseIntArray.put(C1188R.C1192id.tvRank, 5);
        sparseIntArray.put(C1188R.C1192id.rlBody, 6);
        sparseIntArray.put(C1188R.C1192id.llProfile, 7);
        sparseIntArray.put(C1188R.C1192id.imagesLayout, 8);
        sparseIntArray.put(C1188R.C1192id.ivPlayer, 9);
        sparseIntArray.put(C1188R.C1192id.ivRole, 10);
        sparseIntArray.put(C1188R.C1192id.tvName, 11);
        sparseIntArray.put(C1188R.C1192id.rvFlags, 12);
        sparseIntArray.put(C1188R.C1192id.points, 13);
        sparseIntArray.put(C1188R.C1192id.view2, 14);
        sparseIntArray.put(C1188R.C1192id.llEarnings, 15);
    }

    public AdapterTopPlayersBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 16, sIncludes, sViewsWithIds));
    }

    private AdapterTopPlayersBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[8], objArr[4], objArr[9], objArr[10], objArr[15], objArr[7], objArr[3], objArr[13], objArr[6], objArr[12], objArr[11], objArr[5], objArr[1], objArr[2], objArr[14]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.tvTotalAmountt.setTag((Object) null);
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
        setModel((Result) obj);
        return true;
    }

    public void setModel(Result result) {
        this.mModel = result;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        Result result = this.mModel;
        double d = 0.0d;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (!(i == 0 || result == null)) {
            d = result.getTotalAmount();
        }
        if (i != 0) {
            BindingAdapters.setNumberWithoutDec(this.tvTotalAmountt, d);
        }
    }
}
