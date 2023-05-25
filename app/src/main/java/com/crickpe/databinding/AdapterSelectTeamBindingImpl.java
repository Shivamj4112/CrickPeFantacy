package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;

public class AdapterSelectTeamBindingImpl extends AdapterSelectTeamBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.rlItemLayout, 1);
        sparseIntArray.put(C1188R.C1192id.topBar, 2);
        sparseIntArray.put(C1188R.C1192id.tvTeamSequence, 3);
        sparseIntArray.put(C1188R.C1192id.tvAlreadySelected, 4);
        sparseIntArray.put(C1188R.C1192id.points, 5);
        sparseIntArray.put(C1188R.C1192id.tvPoints, 6);
        sparseIntArray.put(C1188R.C1192id.playerImageOne, 7);
        sparseIntArray.put(C1188R.C1192id.tvCaptain, 8);
        sparseIntArray.put(C1188R.C1192id.tvCaptainName, 9);
        sparseIntArray.put(C1188R.C1192id.playerImageTwo, 10);
        sparseIntArray.put(C1188R.C1192id.tvVCaptainName, 11);
        sparseIntArray.put(C1188R.C1192id.llBottom, 12);
        sparseIntArray.put(C1188R.C1192id.tvWk, 13);
        sparseIntArray.put(C1188R.C1192id.tvBat, 14);
        sparseIntArray.put(C1188R.C1192id.tvAR, 15);
        sparseIntArray.put(C1188R.C1192id.tvBowl, 16);
        sparseIntArray.put(C1188R.C1192id.radioBtn, 17);
        sparseIntArray.put(C1188R.C1192id.ivTeamSelection, 18);
    }

    public AdapterSelectTeamBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 19, sIncludes, sViewsWithIds));
    }

    private AdapterSelectTeamBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[18], objArr[12], objArr[7], objArr[10], objArr[5], objArr[17], objArr[1], objArr[2], objArr[15], objArr[4], objArr[14], objArr[16], objArr[8], objArr[9], objArr[6], objArr[3], objArr[11], objArr[13]);
        this.mDirtyFlags = -1;
        LinearLayout linearLayout = objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
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
        setModel((FantasyTeamListModel) obj);
        return true;
    }

    public void setModel(FantasyTeamListModel fantasyTeamListModel) {
        this.mModel = fantasyTeamListModel;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0;
        }
    }
}
