package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.data.leaderboard.LeaderboardModel;

public class AdapterLeaderboardBindingImpl extends AdapterLeaderboardBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.rlMain, 5);
        sparseIntArray.put(C1188R.C1192id.llProfile, 6);
        sparseIntArray.put(C1188R.C1192id.ivProfile, 7);
        sparseIntArray.put(C1188R.C1192id.tvPoints, 8);
        sparseIntArray.put(C1188R.C1192id.ivDotted, 9);
    }

    public AdapterLeaderboardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdapterLeaderboardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[9], objArr[7], objArr[6], objArr[5], objArr[3], objArr[2], objArr[8], objArr[1], objArr[4]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.tvAmount.setTag((Object) null);
        this.tvName.setTag((Object) null);
        this.tvRank.setTag((Object) null);
        this.tvTeam.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4;
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
        if (2 == i) {
            setModel((LeaderboardModel) obj);
        } else if (3 != i) {
            return false;
        } else {
            setPosi(((Integer) obj).intValue());
        }
        return true;
    }

    public void setModel(LeaderboardModel leaderboardModel) {
        this.mModel = leaderboardModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    public void setPosi(int i) {
        this.mPosi = i;
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        long j2;
        long j3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        LeaderboardModel leaderboardModel = this.mModel;
        String str = null;
        int i5 = 0;
        int i6 = ((j & 5) > 0 ? 1 : ((j & 5) == 0 ? 0 : -1));
        if (i6 != 0) {
            if (leaderboardModel != null) {
                i3 = leaderboardModel.getUserType();
                i4 = leaderboardModel.getSequence();
            } else {
                i4 = 0;
                i3 = 0;
            }
            if (i3 == 1) {
                i5 = 1;
            }
            str = "Team - T" + i4;
            if (i6 != 0) {
                if (i5 != 0) {
                    j3 = j | 16 | 64;
                    j2 = 256;
                } else {
                    j3 = j | 8 | 32;
                    j2 = 128;
                }
                j = j3 | j2;
            }
            TextView textView = this.tvName;
            i = i5 != 0 ? getColorFromResource(textView, C1188R.C1189color.grey_text) : getColorFromResource(textView, C1188R.C1189color.white);
            TextView textView2 = this.tvAmount;
            int colorFromResource = i5 != 0 ? getColorFromResource(textView2, C1188R.C1189color.app_color_one) : getColorFromResource(textView2, C1188R.C1189color.white);
            i2 = i5 != 0 ? getColorFromResource(this.tvRank, C1188R.C1189color.grey_text) : getColorFromResource(this.tvRank, C1188R.C1189color.white);
            i5 = colorFromResource;
        } else {
            i2 = 0;
            i = 0;
        }
        if ((j & 5) != 0) {
            this.tvAmount.setTextColor(i5);
            this.tvName.setTextColor(i);
            this.tvRank.setTextColor(i2);
            TextViewBindingAdapter.setText(this.tvTeam, str);
        }
    }
}
