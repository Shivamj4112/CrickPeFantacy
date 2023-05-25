package com.crickpe.databinding;

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
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;

public class FragmentJoinContestDetailBindingImpl extends FragmentJoinContestDetailBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private final TextView mboundView3;
    private final TextView mboundView4;
    private final TextView mboundView5;
    private final ProgressBar mboundView6;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.cvTop, 8);
        sparseIntArray.put(C1188R.C1192id.f418ll, 9);
        sparseIntArray.put(C1188R.C1192id.ivContest, 10);
        sparseIntArray.put(C1188R.C1192id.rlEntry, 11);
        sparseIntArray.put(C1188R.C1192id.fee, 12);
        sparseIntArray.put(C1188R.C1192id.tvPrice, 13);
        sparseIntArray.put(C1188R.C1192id.megaAmount, 14);
        sparseIntArray.put(C1188R.C1192id.llwinningAmount, 15);
        sparseIntArray.put(C1188R.C1192id.llProgress, 16);
        sparseIntArray.put(C1188R.C1192id.ivContestType, 17);
        sparseIntArray.put(C1188R.C1192id.tvwinnings, 18);
        sparseIntArray.put(C1188R.C1192id.linearLayout8, 19);
        sparseIntArray.put(C1188R.C1192id.prizePool, 20);
        sparseIntArray.put(C1188R.C1192id.tvPoolPrize, 21);
        sparseIntArray.put(C1188R.C1192id.spots, 22);
        sparseIntArray.put(C1188R.C1192id.tvSpots, 23);
        sparseIntArray.put(C1188R.C1192id.joiningFee, 24);
        sparseIntArray.put(C1188R.C1192id.tvJoiningFee, 25);
        sparseIntArray.put(C1188R.C1192id.relativeLayout3, 26);
        sparseIntArray.put(C1188R.C1192id.rvWinnings, 27);
        sparseIntArray.put(C1188R.C1192id.progressBar, 28);
    }

    public FragmentJoinContestDetailBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 29, sIncludes, sViewsWithIds));
    }

    private FragmentJoinContestDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[8], objArr[12], objArr[10], objArr[17], objArr[24], objArr[19], objArr[9], objArr[16], objArr[15], objArr[14], objArr[20], objArr[28], objArr[26], objArr[11], objArr[27], objArr[22], objArr[2], objArr[25], objArr[1], objArr[21], objArr[13], objArr[7], objArr[23], objArr[18]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        TextView textView = objArr[3];
        this.mboundView3 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[4];
        this.mboundView4 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = objArr[5];
        this.mboundView5 = textView3;
        textView3.setTag((Object) null);
        ProgressBar progressBar = objArr[6];
        this.mboundView6 = progressBar;
        progressBar.setTag((Object) null);
        this.tvFee.setTag((Object) null);
        this.tvName.setTag((Object) null);
        this.tvSpotLeft.setTag((Object) null);
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
        setModel((ContestDetailModel) obj);
        return true;
    }

    public void setModel(ContestDetailModel contestDetailModel) {
        this.mModel = contestDetailModel;
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
        int i;
        int i2;
        int i3;
        String str2;
        int i4;
        float f;
        int i5;
        int i6;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ContestDetailModel contestDetailModel = this.mModel;
        float f2 = 0.0f;
        String str3 = null;
        int i7 = 0;
        int i8 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i8 != 0) {
            Contest contest = contestDetailModel != null ? contestDetailModel.getContest() : null;
            if (contest != null) {
                i5 = contest.getJoinedUserCount();
                f = contest.getWinningAmount();
                i4 = contest.getFirstWinnerAmount();
                int totalSpots = contest.getTotalSpots();
                String name = contest.getName();
                float winningPercentage = contest.getWinningPercentage();
                i6 = contest.getEntryFee();
                i7 = totalSpots;
                float f3 = winningPercentage;
                str3 = name;
                f2 = f3;
            } else {
                i6 = 0;
                i5 = 0;
                f = 0.0f;
                i4 = 0;
            }
            String num = Integer.toString(i7);
            str = ((Integer.toString(i7 - (i7 - i5)) + "/") + num) + " spots";
            int i9 = i4;
            i = i6;
            str2 = str3;
            str3 = Float.toString(f2) + "%";
            f2 = f;
            i2 = i5;
            i3 = i7;
            i7 = i9;
        } else {
            str2 = null;
            str = null;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        if (i8 != 0) {
            BindingAdapters.setNumber(this.mboundView3, (double) f2);
            BindingAdapters.setNumber(this.mboundView4, (double) i7);
            TextViewBindingAdapter.setText(this.mboundView5, str3);
            this.mboundView6.setMax(i3);
            this.mboundView6.setProgress(i2);
            BindingAdapters.setNumber(this.tvFee, (double) i);
            TextViewBindingAdapter.setText(this.tvName, str2);
            TextViewBindingAdapter.setText(this.tvSpotLeft, str);
        }
    }
}
