package com.crickpe.databinding;

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
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;

public abstract class AdapterContactsBinding extends ViewDataBinding {
    public final ImageView checkbox;
    @Bindable
    protected ContactRequest mModel;
    public final RelativeLayout rlShortName;
    public final TextView tvFirstName;

    public abstract void setModel(ContactRequest contactRequest);

    protected AdapterContactsBinding(Object obj, View view, int i, ImageView imageView, RelativeLayout relativeLayout, TextView textView) {
        super(obj, view, i);
        this.checkbox = imageView;
        this.rlShortName = relativeLayout;
        this.tvFirstName = textView;
    }

    public ContactRequest getModel() {
        return this.mModel;
    }

    public static AdapterContactsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterContactsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterContactsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_contacts, viewGroup, z, obj);
    }

    public static AdapterContactsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterContactsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterContactsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_contacts, (ViewGroup) null, false, obj);
    }

    public static AdapterContactsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterContactsBinding bind(View view, Object obj) {
        return (AdapterContactsBinding) bind(obj, view, C1188R.C1193layout.adapter_contacts);
    }
}
