package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayersModel;

public class FragmentTopPlayersBindingImpl extends FragmentTopPlayersBinding {
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
        sparseIntArray.put(C1188R.C1192id.rlFilter, 1);
        sparseIntArray.put(C1188R.C1192id.filter, 2);
        sparseIntArray.put(C1188R.C1192id.rvFilter, 3);
        sparseIntArray.put(C1188R.C1192id.relativeLayout9, 4);
        sparseIntArray.put(C1188R.C1192id.tvEarnings, 5);
        sparseIntArray.put(C1188R.C1192id.rvTopPlayers, 6);
        sparseIntArray.put(C1188R.C1192id.progressBar, 7);
    }

    public FragmentTopPlayersBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 8, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentTopPlayersBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[2], objArr[7], objArr[4], objArr[1], objArr[3], objArr[6], objArr[5]);
        this.mDirtyFlags = -1;
        this.container.setTag((Object) null);
        View view2 = view;
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
        setModel((TopPlayersModel) obj);
        return true;
    }

    public void setModel(TopPlayersModel topPlayersModel) {
        this.mModel = topPlayersModel;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0;
        }
    }
}
