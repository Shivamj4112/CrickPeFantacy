package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;

public abstract class AdapterSelectedContactBinding extends ViewDataBinding {
    public final ConstraintLayout constrainLayout;
    public final ImageView ivUnselect;
    @Bindable
    protected ContactRequest mModel;
    public final TextView tvName;

    public abstract void setModel(ContactRequest contactRequest);

    protected AdapterSelectedContactBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.constrainLayout = constraintLayout;
        this.ivUnselect = imageView;
        this.tvName = textView;
    }

    public ContactRequest getModel() {
        return this.mModel;
    }

    public static AdapterSelectedContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSelectedContactBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterSelectedContactBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_selected_contact, viewGroup, z, obj);
    }

    public static AdapterSelectedContactBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSelectedContactBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterSelectedContactBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_selected_contact, (ViewGroup) null, false, obj);
    }

    public static AdapterSelectedContactBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSelectedContactBinding bind(View view, Object obj) {
        return (AdapterSelectedContactBinding) bind(obj, view, C1188R.C1193layout.adapter_selected_contact);
    }
}
