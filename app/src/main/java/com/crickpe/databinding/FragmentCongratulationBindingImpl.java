package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;

public class FragmentCongratulationBindingImpl extends FragmentCongratulationBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final NestedScrollView mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.tvInvitee, 3);
        sparseIntArray.put(C1188R.C1192id.llCopyCode, 4);
        sparseIntArray.put(C1188R.C1192id.llShareReferalCode, 5);
        sparseIntArray.put(C1188R.C1192id.tvShare, 6);
        sparseIntArray.put(C1188R.C1192id.llShareContestUrl, 7);
        sparseIntArray.put(C1188R.C1192id.tvContinue, 8);
    }

    public FragmentCongratulationBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 9, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentCongratulationBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[4], objArr[7], objArr[5], objArr[1], objArr[2], objArr[8], objArr[3], objArr[6]);
        this.mDirtyFlags = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.mboundView0 = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        this.tvContestCode.setTag((Object) null);
        this.tvContestLink.setTag((Object) null);
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
        setModel((Contest) obj);
        return true;
    }

    public void setModel(Contest contest) {
        this.mModel = contest;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        String str;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        Contest contest = this.mModel;
        String str2 = null;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i == 0 || contest == null) {
            str = null;
        } else {
            String contestUrl = contest.getContestUrl();
            str2 = contest.getReferalCode();
            str = contestUrl;
        }
        if (i != 0) {
            TextViewBindingAdapter.setText(this.tvContestCode, str2);
            TextViewBindingAdapter.setText(this.tvContestLink, str);
        }
    }
}
