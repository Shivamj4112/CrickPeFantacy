package com.crickpe.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;

public class FragmentContestDetailBindingImpl extends FragmentContestDetailBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private final TextView mboundView7;
    private final ProgressBar mboundView8;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.cvTop, 10);
        sparseIntArray.put(C1188R.C1192id.f418ll, 11);
        sparseIntArray.put(C1188R.C1192id.ivContest, 12);
        sparseIntArray.put(C1188R.C1192id.rlEntry, 13);
        sparseIntArray.put(C1188R.C1192id.llPrize, 14);
        sparseIntArray.put(C1188R.C1192id.tvPrice, 15);
        sparseIntArray.put(C1188R.C1192id.tvTraining, 16);
        sparseIntArray.put(C1188R.C1192id.llwinningAmount, 17);
        sparseIntArray.put(C1188R.C1192id.tvMGlory, 18);
        sparseIntArray.put(C1188R.C1192id.llWiningPercentage, 19);
        sparseIntArray.put(C1188R.C1192id.llProgress, 20);
        sparseIntArray.put(C1188R.C1192id.ivContestType, 21);
        sparseIntArray.put(C1188R.C1192id.tvwinnings, 22);
        sparseIntArray.put(C1188R.C1192id.constrainWinning, 23);
        sparseIntArray.put(C1188R.C1192id.linearLayout8, 24);
        sparseIntArray.put(C1188R.C1192id.prizePool, 25);
        sparseIntArray.put(C1188R.C1192id.tvPoolPrize, 26);
        sparseIntArray.put(C1188R.C1192id.spots, 27);
        sparseIntArray.put(C1188R.C1192id.tvSpots, 28);
        sparseIntArray.put(C1188R.C1192id.joiningFee, 29);
        sparseIntArray.put(C1188R.C1192id.tvJoiningFee, 30);
        sparseIntArray.put(C1188R.C1192id.relativeLayout3, 31);
        sparseIntArray.put(C1188R.C1192id.rvWinnings, 32);
        sparseIntArray.put(C1188R.C1192id.llTraining, 33);
        sparseIntArray.put(C1188R.C1192id.progressBar, 34);
    }

    public FragmentContestDetailBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 35, sIncludes, sViewsWithIds));
    }

    private FragmentContestDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[23], objArr[10], objArr[2], objArr[12], objArr[21], objArr[29], objArr[24], objArr[11], objArr[14], objArr[20], objArr[33], objArr[19], objArr[17], objArr[5], objArr[25], objArr[34], objArr[31], objArr[13], objArr[32], objArr[27], objArr[3], objArr[4], objArr[30], objArr[18], objArr[1], objArr[26], objArr[15], objArr[9], objArr[28], objArr[16], objArr[6], objArr[22]);
        this.mDirtyFlags = -1;
        this.fee.setTag((Object) null);
        RelativeLayout relativeLayout = objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        TextView textView = objArr[7];
        this.mboundView7 = textView;
        textView.setTag((Object) null);
        ProgressBar progressBar = objArr[8];
        this.mboundView8 = progressBar;
        progressBar.setTag((Object) null);
        this.megaAmount.setTag((Object) null);
        this.tvFee.setTag((Object) null);
        this.tvFee2.setTag((Object) null);
        this.tvName.setTag((Object) null);
        this.tvSpotLeft.setTag((Object) null);
        this.tvmWinningAmount.setTag((Object) null);
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
        float f;
        int i3;
        String str;
        String str2;
        int i4;
        int i5;
        int i6;
        Resources resources;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        TopContestModel topContestModel = this.mModel;
        float f2 = 0.0f;
        String str3 = null;
        boolean z = 0;
        int i7 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i7 != 0) {
            if (topContestModel != null) {
                f2 = topContestModel.getWinningPercentage();
                int firstWinnerAmount = topContestModel.getFirstWinnerAmount();
                f = topContestModel.getWinningAmount();
                str3 = topContestModel.getName();
                boolean canJoinContest = topContestModel.getCanJoinContest();
                i = topContestModel.getJoinedUserCount();
                i4 = topContestModel.getTotalSpots();
                i5 = topContestModel.getEntryFee();
                int i8 = firstWinnerAmount;
                z = canJoinContest;
                i2 = i8;
            } else {
                i5 = 0;
                f = 0.0f;
                i2 = 0;
                i = 0;
                i4 = 0;
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
            String num = Integer.toString(i4);
            str = ((Integer.toString(i4 - (i4 - i)) + "/") + num) + " spots";
            i3 = i5;
            str2 = str3;
            str3 = string;
            z = i4;
        } else {
            str2 = null;
            str = null;
            i3 = 0;
            f = 0.0f;
            i2 = 0;
            i = 0;
        }
        if ((j & 3) != 0) {
            TextViewBindingAdapter.setText(this.fee, str3);
            BindingAdapters.setWithoutDecimalPtsPer(this.mboundView7, (double) f2);
            this.mboundView8.setMax((int) z);
            this.mboundView8.setProgress(i);
            BindingAdapters.setNumber(this.megaAmount, (double) f);
            double d = (double) i3;
            BindingAdapters.setNumber(this.tvFee, d);
            BindingAdapters.setNumber(this.tvFee2, d);
            TextViewBindingAdapter.setText(this.tvName, str2);
            TextViewBindingAdapter.setText(this.tvSpotLeft, str);
            BindingAdapters.setNumber(this.tvmWinningAmount, (double) i2);
        }
    }
}
