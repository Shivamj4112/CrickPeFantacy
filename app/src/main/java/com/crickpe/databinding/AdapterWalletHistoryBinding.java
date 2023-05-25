package com.crickpe.databinding;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.wallet.models.Transaction;

public abstract class AdapterWalletHistoryBinding extends ViewDataBinding {
    public final ImageView ivTransactionType;
    @Bindable
    protected Context mContext;
    @Bindable
    protected Transaction mModel;
    public final RelativeLayout rlBody;
    public final RelativeLayout rlReference;
    public final TextView tvAmount;
    public final TextView tvDateTime;
    public final TextView tvId;
    public final TextView tvPrefix;
    public final TextView tvReference;
    public final TextView tvType;
    public final TextView tvtds;

    public abstract void setContext(Context context);

    public abstract void setModel(Transaction transaction);

    protected AdapterWalletHistoryBinding(Object obj, View view, int i, ImageView imageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.ivTransactionType = imageView;
        this.rlBody = relativeLayout;
        this.rlReference = relativeLayout2;
        this.tvAmount = textView;
        this.tvDateTime = textView2;
        this.tvId = textView3;
        this.tvPrefix = textView4;
        this.tvReference = textView5;
        this.tvType = textView6;
        this.tvtds = textView7;
    }

    public Transaction getModel() {
        return this.mModel;
    }

    public Context getContext() {
        return this.mContext;
    }

    public static AdapterWalletHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWalletHistoryBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterWalletHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_wallet_history, viewGroup, z, obj);
    }

    public static AdapterWalletHistoryBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWalletHistoryBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterWalletHistoryBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_wallet_history, (ViewGroup) null, false, obj);
    }

    public static AdapterWalletHistoryBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWalletHistoryBinding bind(View view, Object obj) {
        return (AdapterWalletHistoryBinding) bind(obj, view, C1188R.C1193layout.adapter_wallet_history);
    }
}
