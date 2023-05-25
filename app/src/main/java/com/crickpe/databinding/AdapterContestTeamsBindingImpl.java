package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;

public class AdapterContestTeamsBindingImpl extends AdapterContestTeamsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final CardView mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.topBar, 1);
        sparseIntArray.put(C1188R.C1192id.tvTeamSequence, 2);
        sparseIntArray.put(C1188R.C1192id.points, 3);
        sparseIntArray.put(C1188R.C1192id.tvPoints, 4);
        sparseIntArray.put(C1188R.C1192id.rlBackground, 5);
        sparseIntArray.put(C1188R.C1192id.playerImageOne, 6);
        sparseIntArray.put(C1188R.C1192id.tvCaptain, 7);
        sparseIntArray.put(C1188R.C1192id.tvCaptainName, 8);
        sparseIntArray.put(C1188R.C1192id.playerImageTwo, 9);
        sparseIntArray.put(C1188R.C1192id.tvVCaptainName, 10);
        sparseIntArray.put(C1188R.C1192id.llBottom, 11);
        sparseIntArray.put(C1188R.C1192id.tvWk, 12);
        sparseIntArray.put(C1188R.C1192id.tvBat, 13);
        sparseIntArray.put(C1188R.C1192id.tvAR, 14);
        sparseIntArray.put(C1188R.C1192id.tvBowl, 15);
    }

    public AdapterContestTeamsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 16, sIncludes, sViewsWithIds));
    }

    private AdapterContestTeamsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[11], objArr[6], objArr[9], objArr[3], objArr[5], objArr[1], objArr[14], objArr[13], objArr[15], objArr[7], objArr[8], objArr[4], objArr[2], objArr[10], objArr[12]);
        this.mDirtyFlags = -1;
        CardView cardView = objArr[0];
        this.mboundView0 = cardView;
        cardView.setTag((Object) null);
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
