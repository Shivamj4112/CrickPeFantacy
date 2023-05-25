package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.Player;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel;
import java.util.ArrayList;

public class FragmentRewardsBindingImpl extends FragmentRewardsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView3;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.navHostHome, 8);
        sparseIntArray.put(C1188R.C1192id.linearLayout12, 9);
        sparseIntArray.put(C1188R.C1192id.rlPayReward, 10);
        sparseIntArray.put(C1188R.C1192id.tvPayReward, 11);
        sparseIntArray.put(C1188R.C1192id.rlUserRewards, 12);
        sparseIntArray.put(C1188R.C1192id.tvUserRewards, 13);
        sparseIntArray.put(C1188R.C1192id.scrollView, 14);
        sparseIntArray.put(C1188R.C1192id.linearLayout13, 15);
        sparseIntArray.put(C1188R.C1192id.rlCountry, 16);
        sparseIntArray.put(C1188R.C1192id.flag, 17);
        sparseIntArray.put(C1188R.C1192id.tvTeam, 18);
        sparseIntArray.put(C1188R.C1192id.rlRewardPlayer, 19);
        sparseIntArray.put(C1188R.C1192id.ivPlayerImage, 20);
        sparseIntArray.put(C1188R.C1192id.tvName, 21);
        sparseIntArray.put(C1188R.C1192id.rlTop, 22);
        sparseIntArray.put(C1188R.C1192id.rvFlags, 23);
        sparseIntArray.put(C1188R.C1192id.llRanking, 24);
        sparseIntArray.put(C1188R.C1192id.view, 25);
        sparseIntArray.put(C1188R.C1192id.rlLifeTimeEarning, 26);
        sparseIntArray.put(C1188R.C1192id.ivCash, 27);
        sparseIntArray.put(C1188R.C1192id.tvLifetimeEarnings, 28);
        sparseIntArray.put(C1188R.C1192id.ivHeart, 29);
        sparseIntArray.put(C1188R.C1192id.linearLayout16, 30);
        sparseIntArray.put(C1188R.C1192id.tvTime, 31);
        sparseIntArray.put(C1188R.C1192id.relativeLayout7, 32);
        sparseIntArray.put(C1188R.C1192id.ivTeam1Flag, 33);
        sparseIntArray.put(C1188R.C1192id.team1Name, 34);
        sparseIntArray.put(C1188R.C1192id.ivTeam2Flag, 35);
        sparseIntArray.put(C1188R.C1192id.team2Name, 36);
        sparseIntArray.put(C1188R.C1192id.tvReward, 37);
        sparseIntArray.put(C1188R.C1192id.linearLayoutReward, 38);
        sparseIntArray.put(C1188R.C1192id.rlFifty, 39);
        sparseIntArray.put(C1188R.C1192id.tvFifty, 40);
        sparseIntArray.put(C1188R.C1192id.rlHundred, 41);
        sparseIntArray.put(C1188R.C1192id.tvHundred, 42);
        sparseIntArray.put(C1188R.C1192id.rlOneFifty, 43);
        sparseIntArray.put(C1188R.C1192id.tvOneFifty, 44);
        sparseIntArray.put(C1188R.C1192id.etRewardAmount, 45);
        sparseIntArray.put(C1188R.C1192id.currencySymbol, 46);
        sparseIntArray.put(C1188R.C1192id.llbutton, 47);
        sparseIntArray.put(C1188R.C1192id.tvRewardPlayer, 48);
        sparseIntArray.put(C1188R.C1192id.textView21, 49);
        sparseIntArray.put(C1188R.C1192id.rlPlayerStat, 50);
        sparseIntArray.put(C1188R.C1192id.llTopBar, 51);
        sparseIntArray.put(C1188R.C1192id.view1, 52);
        sparseIntArray.put(C1188R.C1192id.rvPlayerStats, 53);
        sparseIntArray.put(C1188R.C1192id.rlNoData, 54);
        sparseIntArray.put(C1188R.C1192id.imageView12, 55);
        sparseIntArray.put(C1188R.C1192id.nestedScrollView, 56);
        sparseIntArray.put(C1188R.C1192id.rlTopMyRewards, 57);
        sparseIntArray.put(C1188R.C1192id.tvShowHistory, 58);
        sparseIntArray.put(C1188R.C1192id.rlUserReward, 59);
        sparseIntArray.put(C1188R.C1192id.llMyRewards, 60);
        sparseIntArray.put(C1188R.C1192id.rvMyRewards, 61);
        sparseIntArray.put(C1188R.C1192id.rvUserRewards, 62);
        sparseIntArray.put(C1188R.C1192id.progressBar, 63);
    }

    public FragmentRewardsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 64, sIncludes, sViewsWithIds));
    }

    private FragmentRewardsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[46], objArr[45], objArr[17], objArr[55], objArr[27], objArr[29], objArr[1], objArr[20], objArr[33], objArr[35], objArr[9], objArr[15], objArr[30], objArr[38], objArr[60], objArr[24], objArr[51], objArr[47], objArr[8], objArr[56], objArr[63], objArr[32], objArr[16], objArr[39], objArr[41], objArr[26], objArr[54], objArr[43], objArr[10], objArr[50], objArr[19], objArr[22], objArr[57], objArr[59], objArr[12], objArr[23], objArr[61], objArr[53], objArr[62], objArr[14], objArr[0], objArr[34], objArr[36], objArr[49], objArr[6], objArr[5], objArr[40], objArr[42], objArr[4], objArr[28], objArr[21], objArr[44], objArr[11], objArr[2], objArr[7], objArr[37], objArr[48], objArr[58], objArr[18], objArr[31], objArr[13], objArr[25], objArr[52]);
        this.mDirtyFlags = -1;
        this.ivPlayer.setTag((Object) null);
        TextView textView = objArr[3];
        this.mboundView3 = textView;
        textView.setTag((Object) null);
        this.swipeData.setTag((Object) null);
        this.tvAmount.setTag((Object) null);
        this.tvFanReward.setTag((Object) null);
        this.tvLifeTimeEarnings.setTag((Object) null);
        this.tvPlayerName.setTag((Object) null);
        this.tvRank.setTag((Object) null);
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
    public void executeBindings() {
        long j;
        String str;
        float f;
        String str2;
        String str3;
        String str4;
        ArrayList<PlayerStat> arrayList;
        Player player;
        float f2;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        PlayerStatsModel playerStatsModel = this.mModel;
        float f3 = 0.0f;
        int i4 = 0;
        int i5 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i5 != 0) {
            if (playerStatsModel != null) {
                player = playerStatsModel.getPlayer();
                arrayList = playerStatsModel.getPlayerStats();
            } else {
                player = null;
                arrayList = null;
            }
            if (player != null) {
                i3 = player.getUniqueFanCount();
                i2 = player.getRank();
                i = player.getTotalRewardEarning();
                str = player.getImageUrl();
                f2 = player.getTotalPotEarning();
                str4 = player.getName();
            } else {
                str4 = null;
                str = null;
                i3 = 0;
                i2 = 0;
                i = 0;
                f2 = 0.0f;
            }
            PlayerStat playerStat = arrayList != null ? (PlayerStat) getFromList(arrayList, 0) : null;
            String str5 = "FAN REWARDS (" + i3;
            String num = Integer.toString(i2);
            if (playerStat != null) {
                f3 = playerStat.getFantasyPoints();
            }
            str3 = str5 + " FANS)";
            str2 = "#" + num;
            i4 = i;
            f = f3;
            f3 = f2;
        } else {
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
            f = 0.0f;
        }
        if (i5 != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.ivPlayer, str, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView3, str2);
            BindingAdapters.setNumber(this.tvAmount, (double) i4);
            TextViewBindingAdapter.setText(this.tvFanReward, str3);
            BindingAdapters.setNumberWithoutDec(this.tvLifeTimeEarnings, (double) f3);
            TextViewBindingAdapter.setText(this.tvPlayerName, str4);
            BindingAdapters.setWithoutDecimalPts(this.tvRank, (double) f);
        }
    }
}
