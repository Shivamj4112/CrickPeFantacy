package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel;

public class AdapterUserRewardsBindingImpl extends AdapterUserRewardsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private final TextView mboundView1;
    private final TextView mboundView2;
    private final TextView mboundView3;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.rlTop, 4);
        sparseIntArray.put(C1188R.C1192id.llProfile, 5);
        sparseIntArray.put(C1188R.C1192id.ivPlayer, 6);
        sparseIntArray.put(C1188R.C1192id.tvRank, 7);
        sparseIntArray.put(C1188R.C1192id.llRanking, 8);
        sparseIntArray.put(C1188R.C1192id.tvRewardBy, 9);
        sparseIntArray.put(C1188R.C1192id.view, 10);
        sparseIntArray.put(C1188R.C1192id.tvHighestPays, 11);
        sparseIntArray.put(C1188R.C1192id.tvHighest, 12);
        sparseIntArray.put(C1188R.C1192id.llPLayers, 13);
        sparseIntArray.put(C1188R.C1192id.llFirstHighest, 14);
        sparseIntArray.put(C1188R.C1192id.ivFirst, 15);
        sparseIntArray.put(C1188R.C1192id.tvPlayer1Name, 16);
        sparseIntArray.put(C1188R.C1192id.llSecondHighest, 17);
        sparseIntArray.put(C1188R.C1192id.ivSecond, 18);
        sparseIntArray.put(C1188R.C1192id.tvPlayer2Name, 19);
        sparseIntArray.put(C1188R.C1192id.ivUser, 20);
        sparseIntArray.put(C1188R.C1192id.tvMyRank, 21);
        sparseIntArray.put(C1188R.C1192id.llRewardPlayer, 22);
        sparseIntArray.put(C1188R.C1192id.llCarReward, 23);
        sparseIntArray.put(C1188R.C1192id.llTextView27, 24);
        sparseIntArray.put(C1188R.C1192id.tvRewardValueBal, 25);
        sparseIntArray.put(C1188R.C1192id.textView30, 26);
        sparseIntArray.put(C1188R.C1192id.textView29, 27);
        sparseIntArray.put(C1188R.C1192id.tvCarName, 28);
        sparseIntArray.put(C1188R.C1192id.textView28, 29);
        sparseIntArray.put(C1188R.C1192id.seekBar, 30);
        sparseIntArray.put(C1188R.C1192id.ivThumb, 31);
        sparseIntArray.put(C1188R.C1192id.llText, 32);
        sparseIntArray.put(C1188R.C1192id.textView, 33);
        sparseIntArray.put(C1188R.C1192id.tvTotal, 34);
        sparseIntArray.put(C1188R.C1192id.rlTopPlayer, 35);
        sparseIntArray.put(C1188R.C1192id.ivTopPlayer, 36);
    }

    public AdapterUserRewardsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 37, sIncludes, sViewsWithIds));
    }

    private AdapterUserRewardsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[15], objArr[6], objArr[18], objArr[31], objArr[36], objArr[20], objArr[23], objArr[14], objArr[13], objArr[5], objArr[8], objArr[22], objArr[17], objArr[32], objArr[24], objArr[4], objArr[35], objArr[30], objArr[33], objArr[29], objArr[27], objArr[26], objArr[28], objArr[12], objArr[11], objArr[21], objArr[16], objArr[19], objArr[7], objArr[9], objArr[25], objArr[34], objArr[10]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = objArr[3];
        this.mboundView3 = textView3;
        textView3.setTag((Object) null);
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
        setModel((TrackerModel) obj);
        return true;
    }

    public void setModel(TrackerModel trackerModel) {
        this.mModel = trackerModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.mDirtyFlags     // Catch:{ all -> 0x0087 }
            r2 = 0
            r15.mDirtyFlags = r2     // Catch:{ all -> 0x0087 }
            monitor-exit(r15)     // Catch:{ all -> 0x0087 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r4 = r15.mModel
            r5 = 3
            long r7 = r0 & r5
            r9 = 32
            r11 = 0
            r12 = 0
            int r13 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x004a
            if (r4 == 0) goto L_0x0025
            com.crickpe.view.home.fragments.rewards.tracker_model.UserReward r7 = r4.getUserReward()
            java.lang.String r8 = r4.getName()
            int r4 = r4.getTotalRewardEarning()
            goto L_0x0028
        L_0x0025:
            r7 = r12
            r8 = r7
            r4 = 0
        L_0x0028:
            if (r7 == 0) goto L_0x002b
            r11 = 1
        L_0x002b:
            if (r13 == 0) goto L_0x003a
            if (r11 == 0) goto L_0x0034
            r13 = 8
            long r0 = r0 | r13
            long r0 = r0 | r9
            goto L_0x003a
        L_0x0034:
            r13 = 4
            long r0 = r0 | r13
            r13 = 16
            long r0 = r0 | r13
        L_0x003a:
            android.widget.TextView r13 = r15.mboundView3
            if (r11 == 0) goto L_0x0042
            r14 = 2131034168(0x7f050038, float:1.7678846E38)
            goto L_0x0045
        L_0x0042:
            r14 = 2131034261(0x7f050095, float:1.7679035E38)
        L_0x0045:
            int r13 = getColorFromResource(r13, r14)
            goto L_0x004e
        L_0x004a:
            r7 = r12
            r8 = r7
            r4 = 0
            r13 = 0
        L_0x004e:
            long r9 = r9 & r0
            int r14 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0062
            if (r7 == 0) goto L_0x005a
            com.crickpe.view.home.fragments.rewards.tracker_model.Users r7 = r7.getUserInfo()
            goto L_0x005b
        L_0x005a:
            r7 = r12
        L_0x005b:
            if (r7 == 0) goto L_0x0062
            java.lang.String r7 = r7.getName()
            goto L_0x0063
        L_0x0062:
            r7 = r12
        L_0x0063:
            long r0 = r0 & r5
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x006f
            if (r11 == 0) goto L_0x006c
            r12 = r7
            goto L_0x006f
        L_0x006c:
            java.lang.String r0 = "me"
            r12 = r0
        L_0x006f:
            if (r5 == 0) goto L_0x0086
            android.widget.TextView r0 = r15.mboundView1
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r8)
            android.widget.TextView r0 = r15.mboundView2
            double r1 = (double) r4
            com.crickpe.utils.recycler.BindingAdapters.setNumber(r0, r1)
            android.widget.TextView r0 = r15.mboundView3
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r12)
            android.widget.TextView r0 = r15.mboundView3
            r0.setTextColor(r13)
        L_0x0086:
            return
        L_0x0087:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0087 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.AdapterUserRewardsBindingImpl.executeBindings():void");
    }
}
