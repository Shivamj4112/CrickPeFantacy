package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.settings.models.ProfileModelNew;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class FragmentProfileBinding extends ViewDataBinding {
    public final LayoutAvatarBinding avatars;
    public final CardView cvPenProfile;
    public final ImageView imageView9;
    public final ImageView ivSettings;
    public final LinearLayout llCareerStats;
    public final LinearLayout llKyc;
    public final LinearLayout llProfile;
    @Bindable
    protected ProfileModelNew mVm;
    public final CircleImageView profileImage;
    public final ProgressBar progressBar;
    public final ProgressBar progressBarProfile;
    public final RecyclerView rvRecentMatchs;
    public final TextView tvCreerStats;
    public final TextView tvJoinIndiawin;
    public final TextView tvJoinIndiawinVal;
    public final TextView tvKyc;
    public final TextView tvName;
    public final TextView tvNoData;
    public final TextView tvUpcoming;

    public abstract void setVm(ProfileModelNew profileModelNew);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentProfileBinding(Object obj, View view, int i, LayoutAvatarBinding layoutAvatarBinding, CardView cardView, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, CircleImageView circleImageView, ProgressBar progressBar2, ProgressBar progressBar3, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        super(obj, view, i);
        this.avatars = layoutAvatarBinding;
        this.cvPenProfile = cardView;
        this.imageView9 = imageView;
        this.ivSettings = imageView2;
        this.llCareerStats = linearLayout;
        this.llKyc = linearLayout2;
        this.llProfile = linearLayout3;
        this.profileImage = circleImageView;
        this.progressBar = progressBar2;
        this.progressBarProfile = progressBar3;
        this.rvRecentMatchs = recyclerView;
        this.tvCreerStats = textView;
        this.tvJoinIndiawin = textView2;
        this.tvJoinIndiawinVal = textView3;
        this.tvKyc = textView4;
        this.tvName = textView5;
        this.tvNoData = textView6;
        this.tvUpcoming = textView7;
    }

    public ProfileModelNew getVm() {
        return this.mVm;
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_profile, viewGroup, z, obj);
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_profile, (ViewGroup) null, false, obj);
    }

    public static FragmentProfileBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileBinding bind(View view, Object obj) {
        return (FragmentProfileBinding) bind(obj, view, C1188R.C1193layout.fragment_profile);
    }
}
