package com.crickpe.databinding;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.wallet.models.Transaction;

public class AdapterWalletHistoryBindingImpl extends AdapterWalletHistoryBinding {
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
        sparseIntArray.put(C1188R.C1192id.rlBody, 4);
        sparseIntArray.put(C1188R.C1192id.tvId, 5);
        sparseIntArray.put(C1188R.C1192id.rlReference, 6);
        sparseIntArray.put(C1188R.C1192id.tvReference, 7);
        sparseIntArray.put(C1188R.C1192id.tvtds, 8);
        sparseIntArray.put(C1188R.C1192id.ivTransactionType, 9);
        sparseIntArray.put(C1188R.C1192id.tvDateTime, 10);
    }

    public AdapterWalletHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdapterWalletHistoryBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[9], objArr[4], objArr[6], objArr[3], objArr[10], objArr[5], objArr[2], objArr[7], objArr[1], objArr[8]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        this.tvAmount.setTag((Object) null);
        this.tvPrefix.setTag((Object) null);
        this.tvType.setTag((Object) null);
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
            setModel((Transaction) obj);
            return true;
        } else if (1 != i) {
            return false;
        } else {
            setContext((Context) obj);
            return true;
        }
    }

    public void setModel(Transaction transaction) {
        this.mModel = transaction;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    public void setContext(Context context) {
        this.mContext = context;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(1);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r15 = this;
            monitor-enter(r15)
            long r0 = r15.mDirtyFlags     // Catch:{ all -> 0x0047 }
            r2 = 0
            r15.mDirtyFlags = r2     // Catch:{ all -> 0x0047 }
            monitor-exit(r15)     // Catch:{ all -> 0x0047 }
            com.crickpe.view.detail.fragments.wallet.models.Transaction r4 = r15.mModel
            r5 = 0
            android.content.Context r7 = r15.mContext
            r8 = 7
            long r8 = r8 & r0
            r10 = 5
            r12 = 0
            int r13 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r13 == 0) goto L_0x002f
            long r8 = r0 & r10
            int r14 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0024
            if (r4 == 0) goto L_0x0024
            double r5 = r4.getAmount()
        L_0x0024:
            if (r4 == 0) goto L_0x002f
            java.lang.String r12 = r4.prefix(r7)
            java.lang.String r4 = r4.compareTopUp(r7)
            goto L_0x0030
        L_0x002f:
            r4 = r12
        L_0x0030:
            long r0 = r0 & r10
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x003a
            android.widget.TextView r0 = r15.tvAmount
            com.crickpe.utils.recycler.BindingAdapters.setNumber(r0, r5)
        L_0x003a:
            if (r13 == 0) goto L_0x0046
            android.widget.TextView r0 = r15.tvPrefix
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r12)
            android.widget.TextView r0 = r15.tvType
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
        L_0x0046:
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0047 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.AdapterWalletHistoryBindingImpl.executeBindings():void");
    }
}
