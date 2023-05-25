package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.settings.models.RecentlyPlayed;
import com.crickpe.view.detail.fragments.settings.models.Team1;
import com.crickpe.view.home.fragments.my_matches.Team2;

public class AdapterRecentMatchBindingImpl extends AdapterRecentMatchBinding {
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
        sparseIntArray.put(C1188R.C1192id.relativeLayout7, 5);
        sparseIntArray.put(C1188R.C1192id.ivTeam1Flag, 6);
        sparseIntArray.put(C1188R.C1192id.ivTeam2Flag, 7);
        sparseIntArray.put(C1188R.C1192id.timeLayout, 8);
        sparseIntArray.put(C1188R.C1192id.tvTimeRemaining, 9);
        sparseIntArray.put(C1188R.C1192id.view3, 10);
        sparseIntArray.put(C1188R.C1192id.linearLayout15, 11);
    }

    public AdapterRecentMatchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdapterRecentMatchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[6], objArr[7], objArr[11], objArr[0], objArr[5], objArr[1], objArr[4], objArr[8], objArr[9], objArr[10]);
        this.mDirtyFlags = -1;
        this.llTop.setTag((Object) null);
        TextView textView = objArr[2];
        this.mboundView2 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[3];
        this.mboundView3 = textView2;
        textView2.setTag((Object) null);
        this.textView17.setTag((Object) null);
        this.textView19.setTag((Object) null);
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
        setModel((RecentlyPlayed) obj);
        return true;
    }

    public void setModel(RecentlyPlayed recentlyPlayed) {
        this.mModel = recentlyPlayed;
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
        String str2;
        Team1 team1;
        Team2 team2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        RecentlyPlayed recentlyPlayed = this.mModel;
        double d = 0.0d;
        String str3 = null;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            if (recentlyPlayed != null) {
                team2 = recentlyPlayed.getTeam2();
                team1 = recentlyPlayed.getTeam1();
                str = recentlyPlayed.getName();
                d = recentlyPlayed.getMegaPrize();
            } else {
                team2 = null;
                team1 = null;
                str = null;
            }
            str2 = team2 != null ? team2.getCode() : null;
            if (team1 != null) {
                str3 = team1.getCode();
            }
        } else {
            str2 = null;
            str = null;
        }
        if (i != 0) {
            TextViewBindingAdapter.setText(this.mboundView2, str3);
            TextViewBindingAdapter.setText(this.mboundView3, str2);
            TextViewBindingAdapter.setText(this.textView17, str);
            BindingAdapters.setNumber(this.textView19, d);
        }
    }
}
