package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayerFilter;

public class AdapterFilterTopPlayersBindingImpl extends AdapterFilterTopPlayersBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public AdapterFilterTopPlayersBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 3, sIncludes, sViewsWithIds));
    }

    private AdapterFilterTopPlayersBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[2], objArr[1]);
        this.mDirtyFlags = -1;
        this.imageView8.setTag((Object) null);
        ConstraintLayout constraintLayout = objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag((Object) null);
        this.tvFilterTite.setTag((Object) null);
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
        setModel((TopPlayerFilter) obj);
        return true;
    }

    public void setModel(TopPlayerFilter topPlayerFilter) {
        this.mModel = topPlayerFilter;
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
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        TopPlayerFilter topPlayerFilter = this.mModel;
        boolean z = false;
        Drawable drawable = null;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            if (topPlayerFilter != null) {
                String filterName = topPlayerFilter.getFilterName();
                z = topPlayerFilter.isSelected();
                str = filterName;
            } else {
                str = null;
            }
            if (i != 0) {
                j |= z ? 8 : 4;
            }
            if (z) {
                drawable = AppCompatResources.getDrawable(this.imageView8.getContext(), C1188R.C1190drawable.player_selected_check);
            }
        } else {
            str = null;
        }
        if ((j & 3) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.imageView8, drawable);
            TextViewBindingAdapter.setText(this.tvFilterTite, str);
        }
    }
}
