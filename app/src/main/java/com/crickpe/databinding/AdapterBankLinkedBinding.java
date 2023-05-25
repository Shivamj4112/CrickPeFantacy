package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.wallet.my_banks_list.BankDetailsItem;

public abstract class AdapterBankLinkedBinding extends ViewDataBinding {
    public final ImageView checkbox;
    @Bindable
    protected BankDetailsItem mModel;
    public final ConstraintLayout onItemClick;
    public final RelativeLayout relativeLayout;
    public final TextView tvAccountName;
    public final TextView tvAccountNo;
    public final View view;

    public abstract void setModel(BankDetailsItem bankDetailsItem);

    protected AdapterBankLinkedBinding(Object obj, View view2, int i, ImageView imageView, ConstraintLayout constraintLayout, RelativeLayout relativeLayout2, TextView textView, TextView textView2, View view3) {
        super(obj, view2, i);
        this.checkbox = imageView;
        this.onItemClick = constraintLayout;
        this.relativeLayout = relativeLayout2;
        this.tvAccountName = textView;
        this.tvAccountNo = textView2;
        this.view = view3;
    }

    public BankDetailsItem getModel() {
        return this.mModel;
    }

    public static AdapterBankLinkedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBankLinkedBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterBankLinkedBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_bank_linked, viewGroup, z, obj);
    }

    public static AdapterBankLinkedBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBankLinkedBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterBankLinkedBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_bank_linked, (ViewGroup) null, false, obj);
    }

    public static AdapterBankLinkedBinding bind(View view2) {
        return bind(view2, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterBankLinkedBinding bind(View view2, Object obj) {
        return (AdapterBankLinkedBinding) bind(obj, view2, C1188R.C1193layout.adapter_bank_linked);
    }
}
