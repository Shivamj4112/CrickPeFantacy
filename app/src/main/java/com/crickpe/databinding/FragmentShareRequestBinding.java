package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.viethoa.RecyclerViewFastScroller;

public abstract class FragmentShareRequestBinding extends ViewDataBinding {
    public final EditText etSearch;
    public final RecyclerViewFastScroller fastScroller;
    public final ImageView ivBack;
    public final RelativeLayout rlBody;
    public final RecyclerView rvContacts;
    public final TextView tvDone;
    public final TextView tvTitle;

    protected FragmentShareRequestBinding(Object obj, View view, int i, EditText editText, RecyclerViewFastScroller recyclerViewFastScroller, ImageView imageView, RelativeLayout relativeLayout, RecyclerView recyclerView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.etSearch = editText;
        this.fastScroller = recyclerViewFastScroller;
        this.ivBack = imageView;
        this.rlBody = relativeLayout;
        this.rvContacts = recyclerView;
        this.tvDone = textView;
        this.tvTitle = textView2;
    }

    public static FragmentShareRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentShareRequestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentShareRequestBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_share_request, viewGroup, z, obj);
    }

    public static FragmentShareRequestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentShareRequestBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentShareRequestBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_share_request, (ViewGroup) null, false, obj);
    }

    public static FragmentShareRequestBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentShareRequestBinding bind(View view, Object obj) {
        return (FragmentShareRequestBinding) bind(obj, view, C1188R.C1193layout.fragment_share_request);
    }
}
