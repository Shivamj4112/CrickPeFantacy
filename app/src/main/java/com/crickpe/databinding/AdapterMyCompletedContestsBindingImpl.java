package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.MyContestModel;

public class AdapterMyCompletedContestsBindingImpl extends AdapterMyCompletedContestsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView1;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.flBorderCompleted, 4);
        sparseIntArray.put(C1188R.C1192id.ivContest, 5);
        sparseIntArray.put(C1188R.C1192id.tvName, 6);
        sparseIntArray.put(C1188R.C1192id.tvEntry, 7);
        sparseIntArray.put(C1188R.C1192id.tvIwon, 8);
        sparseIntArray.put(C1188R.C1192id.ivDuck, 9);
        sparseIntArray.put(C1188R.C1192id.bottomLayout, 10);
        sparseIntArray.put(C1188R.C1192id.rvSequence, 11);
        sparseIntArray.put(C1188R.C1192id.ivContestTypee, 12);
    }

    public AdapterMyCompletedContestsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private AdapterMyCompletedContestsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[10], objArr[4], objArr[5], objArr[12], objArr[9], objArr[0], objArr[11], objArr[7], objArr[8], objArr[6], objArr[3], objArr[2]);
        this.mDirtyFlags = -1;
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        this.onItemClick.setTag((Object) null);
        this.tvRejectedMatch.setTag((Object) null);
        this.tvTotalAmount.setTag((Object) null);
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
        setModel((MyContestModel) obj);
        return true;
    }

    public void setModel(MyContestModel myContestModel) {
        this.mModel = myContestModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        int i;
        boolean z;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        MyContestModel myContestModel = this.mModel;
        float f = 0.0f;
        boolean z2 = 0;
        int i2 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (myContestModel != null) {
                int entryFee = myContestModel.getEntryFee();
                boolean isReject = myContestModel.isReject();
                f = myContestModel.getWinningAmount();
                z = entryFee;
                z2 = isReject;
            } else {
                z = false;
            }
            if (i2 != 0) {
                j |= z2 ? 8 : 4;
            }
            TextView textView = this.tvRejectedMatch;
            int i3 = z2 ? C1188R.C1189color.red_dark : C1188R.C1189color.app_color_one;
            z2 = z;
            i = getColorFromResource(textView, i3);
        } else {
            i = 0;
        }
        if ((j & 3) != 0) {
            BindingAdapters.setNumber(this.mboundView1, z2 ? 1.0d : 0.0d);
            this.tvRejectedMatch.setTextColor(i);
            BindingAdapters.setNumber(this.tvTotalAmount, (double) f);
        }
    }
}
