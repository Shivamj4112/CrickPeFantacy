package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;

public class AdapterMyContestsBindingImpl extends AdapterMyContestsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView1;
    private final TextView mboundView4;
    private final ProgressBar mboundView5;
    private final TextView mboundView6;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.flBorderMyContest, 7);
        sparseIntArray.put(C1188R.C1192id.llTop, 8);
        sparseIntArray.put(C1188R.C1192id.ivContest, 9);
        sparseIntArray.put(C1188R.C1192id.tvName, 10);
        sparseIntArray.put(C1188R.C1192id.rlMyContest, 11);
        sparseIntArray.put(C1188R.C1192id.llEntry, 12);
        sparseIntArray.put(C1188R.C1192id.tvEntry, 13);
        sparseIntArray.put(C1188R.C1192id.llPrize, 14);
        sparseIntArray.put(C1188R.C1192id.tvMyPrice, 15);
        sparseIntArray.put(C1188R.C1192id.tvMyTraining, 16);
        sparseIntArray.put(C1188R.C1192id.rlPricing, 17);
        sparseIntArray.put(C1188R.C1192id.llwinningAmount, 18);
        sparseIntArray.put(C1188R.C1192id.tvMyGlory, 19);
        sparseIntArray.put(C1188R.C1192id.llWinPercentagee, 20);
        sparseIntArray.put(C1188R.C1192id.llProgress, 21);
        sparseIntArray.put(C1188R.C1192id.tvJoin, 22);
        sparseIntArray.put(C1188R.C1192id.tvJoinWith, 23);
        sparseIntArray.put(C1188R.C1192id.llTeamSequence, 24);
        sparseIntArray.put(C1188R.C1192id.tvTeamSequence, 25);
        sparseIntArray.put(C1188R.C1192id.ivContestType, 26);
    }

    public AdapterMyContestsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 27, sIncludes, sViewsWithIds));
    }

    private AdapterMyContestsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[7], objArr[9], objArr[26], objArr[12], objArr[14], objArr[21], objArr[24], objArr[8], objArr[20], objArr[18], objArr[0], objArr[11], objArr[17], objArr[3], objArr[2], objArr[13], objArr[22], objArr[23], objArr[19], objArr[15], objArr[16], objArr[10], objArr[25]);
        this.mDirtyFlags = -1;
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[4];
        this.mboundView4 = textView2;
        textView2.setTag((Object) null);
        ProgressBar progressBar = objArr[5];
        this.mboundView5 = progressBar;
        progressBar.setTag((Object) null);
        TextView textView3 = objArr[6];
        this.mboundView6 = textView3;
        textView3.setTag((Object) null);
        this.onItemClick.setTag((Object) null);
        this.rvMainWinnAmount.setTag((Object) null);
        this.tvAmount.setTag((Object) null);
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
        float f;
        int i4;
        int i5;
        float f2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        TopContestModel topContestModel = this.mModel;
        String str = null;
        float f3 = 0.0f;
        int i6 = 0;
        int i7 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i7 != 0) {
            if (topContestModel != null) {
                f2 = topContestModel.getWinningPercentage();
                i5 = topContestModel.getJoinedUserCount();
                int totalSpots = topContestModel.getTotalSpots();
                i = topContestModel.getFirstWinnerAmount();
                i4 = topContestModel.getEntryFee();
                i6 = totalSpots;
                f3 = topContestModel.getWinningAmount();
            } else {
                f2 = 0.0f;
                i5 = 0;
                i = 0;
                i4 = 0;
            }
            String num = Integer.toString(i6);
            String str2 = (Integer.toString(i6 - (i6 - i5)) + "/") + num;
            float f4 = f3;
            f3 = f2;
            f = f4;
            i2 = i5;
            i3 = i6;
            i6 = i4;
            str = str2 + " spots";
        } else {
            f = 0.0f;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        if (i7 != 0) {
            BindingAdapters.setNumber(this.mboundView1, (double) i6);
            BindingAdapters.setWithoutDecimalPtsPer(this.mboundView4, (double) f3);
            this.mboundView5.setMax(i3);
            this.mboundView5.setProgress(i2);
            TextViewBindingAdapter.setText(this.mboundView6, str);
            BindingAdapters.setNumber(this.rvMainWinnAmount, (double) i);
            BindingAdapters.setNumber(this.tvAmount, (double) f);
        }
    }
}
