package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.wallet.my_banks_list.BankDetailsItem;

public class AdapterBankLinkedBindingImpl extends AdapterBankLinkedBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.view, 2);
        sparseIntArray.put(C1188R.C1192id.relativeLayout, 3);
        sparseIntArray.put(C1188R.C1192id.tvAccountName, 4);
        sparseIntArray.put(C1188R.C1192id.tvAccountNo, 5);
    }

    public AdapterBankLinkedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private AdapterBankLinkedBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[1], objArr[0], objArr[3], objArr[4], objArr[5], objArr[2]);
        this.mDirtyFlags = -1;
        this.checkbox.setTag((Object) null);
        this.onItemClick.setTag((Object) null);
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
        setModel((BankDetailsItem) obj);
        return true;
    }

    public void setModel(BankDetailsItem bankDetailsItem) {
        this.mModel = bankDetailsItem;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        BankDetailsItem bankDetailsItem = this.mModel;
        boolean z = false;
        Drawable drawable = null;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            if (bankDetailsItem != null) {
                z = bankDetailsItem.isSelected();
            }
            if (i != 0) {
                j |= z ? 8 : 4;
            }
            drawable = AppCompatResources.getDrawable(this.checkbox.getContext(), z ? C1188R.C1190drawable.ic_player_selected : C1188R.C1190drawable.player_unselected_check);
        }
        if ((j & 3) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.checkbox, drawable);
        }
    }
}
