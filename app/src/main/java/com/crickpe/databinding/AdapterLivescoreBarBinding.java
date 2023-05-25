package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.InningsArr;

public abstract class AdapterLivescoreBarBinding extends ViewDataBinding {
    public final TextView extra;
    public final ImageView ivDropdown;
    public final LinearLayout llBody;
    @Bindable
    protected InningsArr mModel;
    public final RelativeLayout relativeLayout6;
    public final RelativeLayout rlBPlayer;
    public final RelativeLayout rlBowler;
    public final RelativeLayout rlPlayer;
    public final RelativeLayout rlTop;
    public final RecyclerView rvBowling;
    public final RecyclerView rvScore;
    public final TextView total;
    public final TextView tvExtraRuns;
    public final TextView tvExtras;
    public final TextView tvName;
    public final TextView tvScore;
    public final TextView tvTotal;
    public final TextView tvTotalRuns;
    public final View view4;

    public abstract void setModel(InningsArr inningsArr);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected AdapterLivescoreBarBinding(Object obj, View view, int i, TextView textView, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, View view2) {
        super(obj, view, i);
        this.extra = textView;
        this.ivDropdown = imageView;
        this.llBody = linearLayout;
        this.relativeLayout6 = relativeLayout;
        this.rlBPlayer = relativeLayout2;
        this.rlBowler = relativeLayout3;
        this.rlPlayer = relativeLayout4;
        this.rlTop = relativeLayout5;
        this.rvBowling = recyclerView;
        this.rvScore = recyclerView2;
        this.total = textView2;
        this.tvExtraRuns = textView3;
        this.tvExtras = textView4;
        this.tvName = textView5;
        this.tvScore = textView6;
        this.tvTotal = textView7;
        this.tvTotalRuns = textView8;
        this.view4 = view2;
    }

    public InningsArr getModel() {
        return this.mModel;
    }

    public static AdapterLivescoreBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterLivescoreBarBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterLivescoreBarBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_livescore_bar, viewGroup, z, obj);
    }

    public static AdapterLivescoreBarBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterLivescoreBarBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterLivescoreBarBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_livescore_bar, (ViewGroup) null, false, obj);
    }

    public static AdapterLivescoreBarBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterLivescoreBarBinding bind(View view, Object obj) {
        return (AdapterLivescoreBarBinding) bind(obj, view, C1188R.C1193layout.adapter_livescore_bar);
    }
}
