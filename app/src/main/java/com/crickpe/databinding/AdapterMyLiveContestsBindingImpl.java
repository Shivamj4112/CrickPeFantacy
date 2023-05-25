package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.MyContestModel;

public class AdapterMyLiveContestsBindingImpl extends AdapterMyLiveContestsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView1;
    private final TextView mboundView2;
    private final TextView mboundView3;
    private final TextView mboundView4;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.flBorder, 6);
        sparseIntArray.put(C1188R.C1192id.tvEntry, 7);
        sparseIntArray.put(C1188R.C1192id.ivContest, 8);
        sparseIntArray.put(C1188R.C1192id.tvName, 9);
        sparseIntArray.put(C1188R.C1192id.llwinningAmount, 10);
        sparseIntArray.put(C1188R.C1192id.tvJoin, 11);
        sparseIntArray.put(C1188R.C1192id.tvJoinWith, 12);
        sparseIntArray.put(C1188R.C1192id.llTeamSequencee, 13);
        sparseIntArray.put(C1188R.C1192id.tvTeamSequence, 14);
        sparseIntArray.put(C1188R.C1192id.ivContestType, 15);
    }

    public AdapterMyLiveContestsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 16, sIncludes, sViewsWithIds));
    }

    private AdapterMyLiveContestsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[6], objArr[8], objArr[15], objArr[13], objArr[10], objArr[0], objArr[7], objArr[11], objArr[12], objArr[9], objArr[5], objArr[14]);
        this.mDirtyFlags = -1;
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = objArr[3];
        this.mboundView3 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[4];
        this.mboundView4 = textView4;
        textView4.setTag((Object) null);
        this.onItemClick.setTag((Object) null);
        this.tvRejected.setTag((Object) null);
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
        float f;
        boolean z;
        int i2;
        float f2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        MyContestModel myContestModel = this.mModel;
        String str = null;
        float f3 = 0.0f;
        boolean z2 = 0;
        int i3 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i3 != 0) {
            if (myContestModel != null) {
                int firstWinnerAmount = myContestModel.getFirstWinnerAmount();
                int entryFee = myContestModel.getEntryFee();
                f3 = myContestModel.getWinningPercentage();
                boolean isReject = myContestModel.isReject();
                f2 = myContestModel.getWinningAmount();
                boolean z3 = isReject;
                z = entryFee;
                i2 = firstWinnerAmount;
                z2 = z3;
            } else {
                f2 = 0.0f;
                i2 = 0;
                z = false;
            }
            if (i3 != 0) {
                j |= z2 ? 8 : 4;
            }
            String string = z2 ? this.tvRejected.getResources().getString(C1188R.string.no_one_joined) : "";
            z2 = z;
            i = i2;
            str = string;
            float f4 = f3;
            f3 = f2;
            f = f4;
        } else {
            f = 0.0f;
            i = 0;
        }
        if ((j & 3) != 0) {
            BindingAdapters.setNumber(this.mboundView1, z2 ? 1.0d : 0.0d);
            BindingAdapters.setNumber(this.mboundView2, (double) f3);
            BindingAdapters.setNumber(this.mboundView3, (double) i);
            BindingAdapters.setWithoutDecimalPtsPer(this.mboundView4, (double) f);
            TextViewBindingAdapter.setText(this.tvRejected, str);
        }
    }
}
