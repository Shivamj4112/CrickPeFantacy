package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.FantasyTeams;

public class AdapterSequenceBindingImpl extends AdapterSequenceBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public AdapterSequenceBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 1, sIncludes, sViewsWithIds));
    }

    private AdapterSequenceBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0]);
        this.mDirtyFlags = -1;
        this.tvLabel.setTag((Object) null);
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
        setModel((FantasyTeams) obj);
        return true;
    }

    public void setModel(FantasyTeams fantasyTeams) {
        this.mModel = fantasyTeams;
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
        long j2;
        long j3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        FantasyTeams fantasyTeams = this.mModel;
        Drawable drawable = null;
        int i2 = 0;
        int i3 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i3 != 0) {
            if (fantasyTeams != null) {
                i = fantasyTeams.getAmount();
            } else {
                i = 0;
            }
            if (i > 0) {
                i2 = 1;
            }
            if (i3 != 0) {
                if (i2 != 0) {
                    j3 = j | 8;
                    j2 = 32;
                } else {
                    j3 = j | 4;
                    j2 = 16;
                }
                j = j3 | j2;
            }
            drawable = AppCompatResources.getDrawable(this.tvLabel.getContext(), i2 != 0 ? C1188R.C1190drawable.circle_bg_appcolor : C1188R.C1190drawable.circle_grey_border);
            i2 = getColorFromResource(this.tvLabel, i2 != 0 ? C1188R.C1189color.white : C1188R.C1189color.black);
        }
        if ((j & 3) != 0) {
            ViewBindingAdapter.setBackground(this.tvLabel, drawable);
            this.tvLabel.setTextColor(i2);
        }
    }
}
