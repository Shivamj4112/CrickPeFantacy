package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;

public class FragmentReferToEarnBindingImpl extends FragmentReferToEarnBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final NestedScrollView mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public boolean setVariable(int i, Object obj) {
        return true;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.ivCertificate, 1);
        sparseIntArray.put(C1188R.C1192id.textView27, 2);
        sparseIntArray.put(C1188R.C1192id.textView31, 3);
        sparseIntArray.put(C1188R.C1192id.linearLayout20, 4);
        sparseIntArray.put(C1188R.C1192id.ivPin, 5);
        sparseIntArray.put(C1188R.C1192id.ivNote, 6);
        sparseIntArray.put(C1188R.C1192id.ivWallet, 7);
        sparseIntArray.put(C1188R.C1192id.linearLayout19, 8);
        sparseIntArray.put(C1188R.C1192id.ivShareWhatsapp, 9);
        sparseIntArray.put(C1188R.C1192id.rlShare, 10);
        sparseIntArray.put(C1188R.C1192id.progressBar, 11);
    }

    public FragmentReferToEarnBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FragmentReferToEarnBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[1], objArr[6], objArr[5], objArr[9], objArr[7], objArr[8], objArr[4], objArr[11], objArr[10], objArr[2], objArr[3]);
        this.mDirtyFlags = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.mboundView0 = nestedScrollView;
        nestedScrollView.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 1;
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

    /* access modifiers changed from: protected */
    public void executeBindings() {
        synchronized (this) {
            this.mDirtyFlags = 0;
        }
    }
}
