package com.crickpe.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;

public class AdapterTopContestsBindingImpl extends AdapterTopContestsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView6;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.flBorderContest, 9);
        sparseIntArray.put(C1188R.C1192id.ivVipTag, 10);
        sparseIntArray.put(C1188R.C1192id.f418ll, 11);
        sparseIntArray.put(C1188R.C1192id.ivContest, 12);
        sparseIntArray.put(C1188R.C1192id.tvNamee, 13);
        sparseIntArray.put(C1188R.C1192id.rlPrice, 14);
        sparseIntArray.put(C1188R.C1192id.llPrize, 15);
        sparseIntArray.put(C1188R.C1192id.tvPrice, 16);
        sparseIntArray.put(C1188R.C1192id.tvTraining, 17);
        sparseIntArray.put(C1188R.C1192id.rlBottom, 18);
        sparseIntArray.put(C1188R.C1192id.llwinningAmount, 19);
        sparseIntArray.put(C1188R.C1192id.tvGlory, 20);
        sparseIntArray.put(C1188R.C1192id.llWinPercentage, 21);
        sparseIntArray.put(C1188R.C1192id.llProgress, 22);
        sparseIntArray.put(C1188R.C1192id.ivContestType, 23);
    }

    public AdapterTopContestsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 24, sIncludes, sViewsWithIds));
    }

    private AdapterTopContestsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[1], objArr[9], objArr[12], objArr[23], objArr[10], objArr[11], objArr[15], objArr[22], objArr[21], objArr[19], objArr[4], objArr[7], objArr[18], objArr[14], objArr[8], objArr[2], objArr[3], objArr[5], objArr[20], objArr[13], objArr[16], objArr[17]);
        this.mDirtyFlags = -1;
        this.cvContest.setTag((Object) null);
        this.fee.setTag((Object) null);
        TextView textView = objArr[6];
        this.mboundView6 = textView;
        textView.setTag((Object) null);
        this.megaAmount.setTag((Object) null);
        this.progressBar.setTag((Object) null);
        this.spotLeft.setTag((Object) null);
        this.tvFee.setTag((Object) null);
        this.tvFee2.setTag((Object) null);
        this.tvFirstWinningAmount.setTag((Object) null);
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
        setModel((TopContestModel) obj);
        return true;
    }

    public void setModel(TopContestModel topContestModel) {
        this.mModel = topContestModel;
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
        int i2;
        int i3;
        String str;
        float f;
        int i4;
        int i5;
        float f2;
        int i6;
        Resources resources;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        TopContestModel topContestModel = this.mModel;
        String str2 = null;
        float f3 = 0.0f;
        boolean z = false;
        int i7 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i7 != 0) {
            if (topContestModel != null) {
                float winningPercentage = topContestModel.getWinningPercentage();
                z = topContestModel.getCanJoinContest();
                i2 = topContestModel.getJoinedUserCount();
                i5 = topContestModel.getTotalSpots();
                i4 = topContestModel.getFirstWinnerAmount();
                i = topContestModel.getEntryFee();
                float f4 = winningPercentage;
                f3 = topContestModel.getWinningAmount();
                f2 = f4;
            } else {
                f2 = 0.0f;
                i2 = 0;
                i5 = 0;
                i4 = 0;
                i = 0;
            }
            if (i7 != 0) {
                j |= z ? 8 : 4;
            }
            if (z) {
                resources = this.fee.getResources();
                i6 = C1188R.string.joining_fee;
            } else {
                resources = this.fee.getResources();
                i6 = C1188R.string.entry;
            }
            String string = resources.getString(i6);
            String num = Integer.toString(i5);
            str = ((Integer.toString(i5 - (i5 - i2)) + "/") + num) + " spots";
            i3 = i4;
            str2 = string;
            z = i5;
            float f5 = f3;
            f3 = f2;
            f = f5;
        } else {
            str = null;
            f = 0.0f;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        if ((j & 3) != 0) {
            TextViewBindingAdapter.setText(this.fee, str2);
            BindingAdapters.setWithoutDecimalPtsPer(this.mboundView6, (double) f3);
            BindingAdapters.setNumber(this.megaAmount, (double) f);
            this.progressBar.setMax(z ? 1 : 0);
            this.progressBar.setProgress(i2);
            TextViewBindingAdapter.setText(this.spotLeft, str);
            double d = (double) i;
            BindingAdapters.setNumber(this.tvFee, d);
            BindingAdapters.setNumber(this.tvFee2, d);
            BindingAdapters.setNumber(this.tvFirstWinningAmount, (double) i3);
        }
    }
}
