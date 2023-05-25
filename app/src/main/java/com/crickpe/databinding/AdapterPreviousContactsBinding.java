package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_contest.models.PreviousContactsModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterPreviousContactsBinding extends ViewDataBinding {
    public final CircleImageView ivContact;
    @Bindable
    protected PreviousContactsModel mModel;

    public abstract void setModel(PreviousContactsModel previousContactsModel);

    protected AdapterPreviousContactsBinding(Object obj, View view, int i, CircleImageView circleImageView) {
        super(obj, view, i);
        this.ivContact = circleImageView;
    }

    public PreviousContactsModel getModel() {
        return this.mModel;
    }

    public static AdapterPreviousContactsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterPreviousContactsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterPreviousContactsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_previous_contacts, viewGroup, z, obj);
    }

    public static AdapterPreviousContactsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterPreviousContactsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterPreviousContactsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_previous_contacts, (ViewGroup) null, false, obj);
    }

    public static AdapterPreviousContactsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterPreviousContactsBinding bind(View view, Object obj) {
        return (AdapterPreviousContactsBinding) bind(obj, view, C1188R.C1193layout.adapter_previous_contacts);
    }
}
