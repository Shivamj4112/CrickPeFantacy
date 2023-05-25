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
import com.crickpe.view.detail.fragments.create_own_team.create_team.Team;
import com.crickpe.view.detail.fragments.my_matches_detail.Players;

public class AdapterPlayersPotBindingImpl extends AdapterPlayersPotBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView5;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.view, 6);
        sparseIntArray.put(C1188R.C1192id.llProfile, 7);
        sparseIntArray.put(C1188R.C1192id.imagesLayout, 8);
        sparseIntArray.put(C1188R.C1192id.ivRole, 9);
        sparseIntArray.put(C1188R.C1192id.llname, 10);
        sparseIntArray.put(C1188R.C1192id.battingStyle, 11);
        sparseIntArray.put(C1188R.C1192id.view2, 12);
    }

    public AdapterPlayersPotBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private AdapterPlayersPotBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[11], objArr[8], objArr[1], objArr[9], objArr[2], objArr[7], objArr[10], objArr[0], objArr[3], objArr[4], objArr[6], objArr[12]);
        this.mDirtyFlags = -1;
        this.ivPlayer.setTag((Object) null);
        this.ivTeamFlag.setTag((Object) null);
        TextView textView = objArr[5];
        this.mboundView5 = textView;
        textView.setTag((Object) null);
        this.onItemClick.setTag((Object) null);
        this.tvName.setTag((Object) null);
        this.tvPoints.setTag((Object) null);
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
        setModel((Players) obj);
        return true;
    }

    public void setModel(Players players) {
        this.mModel = players;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        double d;
        String str;
        float f;
        String str2;
        String str3;
        double d2;
        Team team;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        Players players = this.mModel;
        boolean z = false;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            if (players != null) {
                str2 = players.getImageUrl();
                f = players.getFantasyPoints();
                str = players.getName();
                team = players.getTeam();
                d2 = players.getAmount();
            } else {
                d2 = 0.0d;
                str2 = null;
                str = null;
                team = null;
                f = 0.0f;
            }
            if (team != null) {
                str3 = team.getTeamIconUrl();
            } else {
                str3 = null;
            }
            if (str3 != null) {
                z = true;
            }
            if (i != 0) {
                j |= z ? 8 : 4;
            }
            d = d2;
        } else {
            d = 0.0d;
            str3 = null;
            str2 = null;
            str = null;
            f = 0.0f;
        }
        int i2 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i2 == 0) {
            str3 = null;
        } else if (!z) {
            str3 = "";
        }
        if (i2 != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.ivPlayer, str2, (Drawable) null);
            BindingAdapters.setImageUrl(this.ivTeamFlag, str3, (Drawable) null);
            BindingAdapters.setNumber(this.mboundView5, d);
            TextViewBindingAdapter.setText(this.tvName, str);
            BindingAdapters.setWithDecimalPts(this.tvPoints, (double) f);
        }
    }
}
