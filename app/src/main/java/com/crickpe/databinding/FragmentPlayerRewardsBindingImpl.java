package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel;

public class FragmentPlayerRewardsBindingImpl extends FragmentPlayerRewardsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView2;
    private final TextView mboundView3;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.linearLayout12, 4);
        sparseIntArray.put(C1188R.C1192id.rlPayReward, 5);
        sparseIntArray.put(C1188R.C1192id.tvPayReward, 6);
        sparseIntArray.put(C1188R.C1192id.rlUserRewards, 7);
        sparseIntArray.put(C1188R.C1192id.tvUserRewards, 8);
        sparseIntArray.put(C1188R.C1192id.scrollView, 9);
        sparseIntArray.put(C1188R.C1192id.linearLayout13, 10);
        sparseIntArray.put(C1188R.C1192id.rlCountry, 11);
        sparseIntArray.put(C1188R.C1192id.flag, 12);
        sparseIntArray.put(C1188R.C1192id.tvTeam, 13);
        sparseIntArray.put(C1188R.C1192id.rlRewardPlayer, 14);
        sparseIntArray.put(C1188R.C1192id.ivPlayerImage, 15);
        sparseIntArray.put(C1188R.C1192id.tvName, 16);
        sparseIntArray.put(C1188R.C1192id.rlTop, 17);
        sparseIntArray.put(C1188R.C1192id.view, 18);
        sparseIntArray.put(C1188R.C1192id.linearLayout16, 19);
        sparseIntArray.put(C1188R.C1192id.tvTime, 20);
        sparseIntArray.put(C1188R.C1192id.relativeLayout7, 21);
        sparseIntArray.put(C1188R.C1192id.ivTeam1Flag, 22);
        sparseIntArray.put(C1188R.C1192id.team1Name, 23);
        sparseIntArray.put(C1188R.C1192id.ivTeam2Flag, 24);
        sparseIntArray.put(C1188R.C1192id.team2Name, 25);
        sparseIntArray.put(C1188R.C1192id.tvRank, 26);
        sparseIntArray.put(C1188R.C1192id.textView20, 27);
        sparseIntArray.put(C1188R.C1192id.linearLayout14, 28);
        sparseIntArray.put(C1188R.C1192id.rlFifty, 29);
        sparseIntArray.put(C1188R.C1192id.tvFifty, 30);
        sparseIntArray.put(C1188R.C1192id.rlHundred, 31);
        sparseIntArray.put(C1188R.C1192id.tvHundred, 32);
        sparseIntArray.put(C1188R.C1192id.rlOneFifty, 33);
        sparseIntArray.put(C1188R.C1192id.tvOneFifty, 34);
        sparseIntArray.put(C1188R.C1192id.etRewardAmount, 35);
        sparseIntArray.put(C1188R.C1192id.currencySymbol, 36);
        sparseIntArray.put(C1188R.C1192id.tvRewardPlayer, 37);
        sparseIntArray.put(C1188R.C1192id.textView21, 38);
        sparseIntArray.put(C1188R.C1192id.rlPlayerStat, 39);
        sparseIntArray.put(C1188R.C1192id.llTopBar, 40);
        sparseIntArray.put(C1188R.C1192id.view1, 41);
        sparseIntArray.put(C1188R.C1192id.rvPlayerStats, 42);
        sparseIntArray.put(C1188R.C1192id.rlNoData, 43);
        sparseIntArray.put(C1188R.C1192id.imageView12, 44);
        sparseIntArray.put(C1188R.C1192id.progressBar, 45);
    }

    public FragmentPlayerRewardsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 46, sIncludes, sViewsWithIds));
    }

    private FragmentPlayerRewardsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[36], objArr[35], objArr[12], objArr[44], objArr[1], objArr[15], objArr[22], objArr[24], objArr[4], objArr[10], objArr[28], objArr[19], objArr[40], objArr[0], objArr[45], objArr[21], objArr[11], objArr[29], objArr[31], objArr[43], objArr[33], objArr[5], objArr[39], objArr[14], objArr[17], objArr[7], objArr[42], objArr[9], objArr[23], objArr[25], objArr[27], objArr[38], objArr[30], objArr[32], objArr[16], objArr[34], objArr[6], objArr[26], objArr[37], objArr[13], objArr[20], objArr[8], objArr[18], objArr[41]);
        this.mDirtyFlags = -1;
        this.ivPlayer.setTag((Object) null);
        TextView textView = objArr[2];
        this.mboundView2 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[3];
        this.mboundView3 = textView2;
        textView2.setTag((Object) null);
        this.navHostHome.setTag((Object) null);
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
        setModel((PlayerStatsModel) obj);
        return true;
    }

    public void setModel(PlayerStatsModel playerStatsModel) {
        this.mModel = playerStatsModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch:{ all -> 0x0042 }
            r2 = 0
            r8.mDirtyFlags = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r8)     // Catch:{ all -> 0x0042 }
            com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel r4 = r8.mModel
            r5 = 0
            r6 = 3
            long r0 = r0 & r6
            r6 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x002a
            if (r4 == 0) goto L_0x001a
            com.crickpe.view.detail.fragments.player_reward_fragment.models.Player r0 = r4.getPlayer()
            goto L_0x001b
        L_0x001a:
            r0 = r6
        L_0x001b:
            if (r0 == 0) goto L_0x002a
            int r5 = r0.getTotalEarning()
            java.lang.String r1 = r0.getImageUrl()
            java.lang.String r0 = r0.getName()
            goto L_0x002c
        L_0x002a:
            r0 = r6
            r1 = r0
        L_0x002c:
            if (r7 == 0) goto L_0x0041
            android.widget.ImageView r2 = r8.ivPlayer
            r3 = r6
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            com.crickpe.utils.recycler.BindingAdapters.setImageUrl(r2, r1, r6)
            android.widget.TextView r1 = r8.mboundView2
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r1, r0)
            android.widget.TextView r0 = r8.mboundView3
            double r1 = (double) r5
            com.crickpe.utils.recycler.BindingAdapters.setNumber(r0, r1)
        L_0x0041:
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.FragmentPlayerRewardsBindingImpl.executeBindings():void");
    }
}
