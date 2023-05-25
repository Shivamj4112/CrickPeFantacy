package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.wallet.models.Transactions;
import com.crickpe.view.detail.fragments.wallet.models.UserWallet;
import com.crickpe.view.detail.fragments.wallet.models.WalletModal;

public class FragmentWalletBindingImpl extends FragmentWalletBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView1;
    private final TextView mboundView2;
    private final TextView mboundView3;
    private final TextView mboundView4;
    private final TextView mboundView5;
    private final TextView mboundView6;
    private final TextView mboundView7;
    private final TextView mboundView8;
    private final TextView mboundView9;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.linearLayout5, 10);
        sparseIntArray.put(C1188R.C1192id.llJoin, 11);
        sparseIntArray.put(C1188R.C1192id.rlWithdraw, 12);
        sparseIntArray.put(C1188R.C1192id.imageView11, 13);
        sparseIntArray.put(C1188R.C1192id.tvWithdraw, 14);
        sparseIntArray.put(C1188R.C1192id.rlTopup, 15);
        sparseIntArray.put(C1188R.C1192id.imageView10, 16);
        sparseIntArray.put(C1188R.C1192id.tvJoinContest, 17);
        sparseIntArray.put(C1188R.C1192id.linearLayout9, 18);
        sparseIntArray.put(C1188R.C1192id.tvUpcoming, 19);
        sparseIntArray.put(C1188R.C1192id.rvWalletHistory, 20);
        sparseIntArray.put(C1188R.C1192id.progressBar, 21);
        sparseIntArray.put(C1188R.C1192id.tvNoData, 22);
    }

    public FragmentWalletBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 23, sIncludes, sViewsWithIds));
    }

    private FragmentWalletBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[16], objArr[13], objArr[10], objArr[18], objArr[11], objArr[0], objArr[21], objArr[15], objArr[12], objArr[20], objArr[17], objArr[22], objArr[19], objArr[14]);
        this.mDirtyFlags = -1;
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = objArr[3];
        this.mboundView3 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[4];
        this.mboundView4 = textView4;
        textView4.setTag((Object) null);
        TextView textView5 = objArr[5];
        this.mboundView5 = textView5;
        textView5.setTag((Object) null);
        TextView textView6 = objArr[6];
        this.mboundView6 = textView6;
        textView6.setTag((Object) null);
        TextView textView7 = objArr[7];
        this.mboundView7 = textView7;
        textView7.setTag((Object) null);
        TextView textView8 = objArr[8];
        this.mboundView8 = textView8;
        textView8.setTag((Object) null);
        TextView textView9 = objArr[9];
        this.mboundView9 = textView9;
        textView9.setTag((Object) null);
        this.nestedScrollView.setTag((Object) null);
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
        setModel((WalletModal) obj);
        return true;
    }

    public void setModel(WalletModal walletModal) {
        this.mModel = walletModal;
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
        double d2;
        double d3;
        double d4;
        double d5;
        Transactions transactions;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        WalletModal walletModal = this.mModel;
        double d6 = 0.0d;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            UserWallet userWallet = null;
            if (walletModal != null) {
                userWallet = walletModal.getUserWallet();
                transactions = walletModal.getTransactions();
            } else {
                transactions = null;
            }
            double totalAmount = userWallet != null ? userWallet.getTotalAmount() : 0.0d;
            if (transactions != null) {
                double winningAmount = transactions.getWinningAmount();
                d4 = transactions.getWithdrawAmount();
                d3 = transactions.getRewardAmount();
                d2 = transactions.getCashBackAmount();
                d = transactions.getTopUpAmount();
                double d7 = totalAmount;
                d5 = winningAmount;
                d6 = d7;
            } else {
                d4 = 0.0d;
                d3 = 0.0d;
                d2 = 0.0d;
                d = 0.0d;
                d6 = totalAmount;
                d5 = 0.0d;
            }
        } else {
            d5 = 0.0d;
            d4 = 0.0d;
            d3 = 0.0d;
            d2 = 0.0d;
            d = 0.0d;
        }
        if (i != 0) {
            BindingAdapters.setNumber(this.mboundView1, d6);
            BindingAdapters.setNumberWithoutDec(this.mboundView2, d);
            BindingAdapters.setNumberWithoutDec(this.mboundView3, d5);
            BindingAdapters.setNumberWithoutDec(this.mboundView4, d2);
            BindingAdapters.setNumberWithoutDec(this.mboundView5, d4);
            BindingAdapters.setNumberWithoutDec(this.mboundView6, d3);
            BindingAdapters.setNumberWithoutDec(this.mboundView7, d);
            BindingAdapters.setNumberWithoutDec(this.mboundView8, d5);
            BindingAdapters.setNumberWithoutDec(this.mboundView9, d2);
        }
    }
}
