package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;

public class FragmentSelectTeamBindingImpl extends FragmentSelectTeamBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LayoutSelectedPalyerPreviewBinding mboundView0;
    private final ConstraintLayout mboundView01;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.rvFantasyTeams, 2);
        sparseIntArray.put(C1188R.C1192id.linearLayout17, 3);
        sparseIntArray.put(C1188R.C1192id.tvCreateTeamm, 4);
        sparseIntArray.put(C1188R.C1192id.tvJoin, 5);
        sparseIntArray.put(C1188R.C1192id.progressBar, 6);
    }

    public FragmentSelectTeamBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 7, sIncludes, sViewsWithIds));
    }

    private FragmentSelectTeamBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[3], objArr[6], objArr[2], objArr[4], objArr[5]);
        this.mDirtyFlags = -1;
        View view2 = objArr[1];
        this.mboundView0 = view2 != null ? LayoutSelectedPalyerPreviewBinding.bind(view2) : null;
        ConstraintLayout constraintLayout = objArr[0];
        this.mboundView01 = constraintLayout;
        constraintLayout.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1;
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

    /* access modifiers changed from: protected */
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0;
        }
    }
}
