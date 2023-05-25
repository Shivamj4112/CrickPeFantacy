package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterHomeLiveMachesBinding extends ViewDataBinding {
    public final CardView cvLivesocre;
    public final CircleImageView ivTeam1Flag;
    @Bindable
    protected MyMatchesModel mModel;
    public final RelativeLayout relativeLayout7;
    public final RelativeLayout rlLiveBox;
    public final TextView teamTwo;
    public final RelativeLayout textView17;
    public final LinearLayout textView18;
    public final TextView textView19;
    public final TextView tvTimeRemaining;

    public abstract void setModel(MyMatchesModel myMatchesModel);

    protected AdapterHomeLiveMachesBinding(Object obj, View view, int i, CardView cardView, CircleImageView circleImageView, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, RelativeLayout relativeLayout3, LinearLayout linearLayout, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cvLivesocre = cardView;
        this.ivTeam1Flag = circleImageView;
        this.relativeLayout7 = relativeLayout;
        this.rlLiveBox = relativeLayout2;
        this.teamTwo = textView;
        this.textView17 = relativeLayout3;
        this.textView18 = linearLayout;
        this.textView19 = textView2;
        this.tvTimeRemaining = textView3;
    }

    public MyMatchesModel getModel() {
        return this.mModel;
    }

    public static AdapterHomeLiveMachesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterHomeLiveMachesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterHomeLiveMachesBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_home_live_maches, viewGroup, z, obj);
    }

    public static AdapterHomeLiveMachesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterHomeLiveMachesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterHomeLiveMachesBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_home_live_maches, (ViewGroup) null, false, obj);
    }

    public static AdapterHomeLiveMachesBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterHomeLiveMachesBinding bind(View view, Object obj) {
        return (AdapterHomeLiveMachesBinding) bind(obj, view, C1188R.C1193layout.adapter_home_live_maches);
    }
}
