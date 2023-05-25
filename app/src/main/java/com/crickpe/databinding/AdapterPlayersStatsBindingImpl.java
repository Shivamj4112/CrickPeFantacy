package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.Match;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.Team1;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.Team2;

public class AdapterPlayersStatsBindingImpl extends AdapterPlayersStatsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
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
        sparseIntArray.put(C1188R.C1192id.llTopBar, 4);
        sparseIntArray.put(C1188R.C1192id.tvDate, 5);
        sparseIntArray.put(C1188R.C1192id.relativeLayout7, 6);
        sparseIntArray.put(C1188R.C1192id.ivTeam1Flag, 7);
        sparseIntArray.put(C1188R.C1192id.tvTimeRemaining, 8);
        sparseIntArray.put(C1188R.C1192id.ivTeam2Flag, 9);
    }

    public AdapterPlayersStatsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private AdapterPlayersStatsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[7], objArr[9], objArr[4], objArr[6], objArr[5], objArr[8]);
        this.mDirtyFlags = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag((Object) null);
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
        setModel((PlayerStat) obj);
        return true;
    }

    public void setModel(PlayerStat playerStat) {
        this.mModel = playerStat;
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
        Match match;
        Team1 team1;
        Team2 team2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        PlayerStat playerStat = this.mModel;
        double d = 0.0d;
        String str2 = null;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            if (playerStat != null) {
                match = playerStat.getMatch();
                d = playerStat.getAmount();
            } else {
                match = null;
            }
            if (match != null) {
                team1 = match.getTeam1();
                team2 = match.getTeam2();
            } else {
                team2 = null;
                team1 = null;
            }
            String code = team1 != null ? team1.getCode() : null;
            if (team2 != null) {
                str2 = team2.getCode();
            }
            str = str2;
            str2 = code;
        } else {
            str = null;
        }
        if (i != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, str2);
            TextViewBindingAdapter.setText(this.mboundView2, str);
            BindingAdapters.setNumberWithoutDec(this.mboundView3, d);
        }
    }
}
