package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;

public abstract class FragmentReferToEarnBinding extends ViewDataBinding {
    public final ImageView ivCertificate;
    public final ImageView ivNote;
    public final ImageView ivPin;
    public final ImageView ivShareWhatsapp;
    public final ImageView ivWallet;
    public final LinearLayout linearLayout19;
    public final LinearLayout linearLayout20;
    public final ProgressBar progressBar;
    public final RelativeLayout rlShare;
    public final TextView textView27;
    public final TextView textView31;

    protected FragmentReferToEarnBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar2, RelativeLayout relativeLayout, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.ivCertificate = imageView;
        this.ivNote = imageView2;
        this.ivPin = imageView3;
        this.ivShareWhatsapp = imageView4;
        this.ivWallet = imageView5;
        this.linearLayout19 = linearLayout;
        this.linearLayout20 = linearLayout2;
        this.progressBar = progressBar2;
        this.rlShare = relativeLayout;
        this.textView27 = textView;
        this.textView31 = textView2;
    }

    public static FragmentReferToEarnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentReferToEarnBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentReferToEarnBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_refer_to_earn, viewGroup, z, obj);
    }

    public static FragmentReferToEarnBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentReferToEarnBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentReferToEarnBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_refer_to_earn, (ViewGroup) null, false, obj);
    }

    public static FragmentReferToEarnBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentReferToEarnBinding bind(View view, Object obj) {
        return (FragmentReferToEarnBinding) bind(obj, view, C1188R.C1193layout.fragment_refer_to_earn);
    }
}
