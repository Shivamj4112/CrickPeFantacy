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
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings.Winning;

public abstract class AdapterWinningsBinding extends ViewDataBinding {
    public final ImageView ivCrown;
    @Bindable
    protected Winning mModel;
    public final RelativeLayout onItemClick;
    public final TextView tvRank;
    public final View view2;

    public abstract void setModel(Winning winning);

    protected AdapterWinningsBinding(Object obj, View view, int i, ImageView imageView, RelativeLayout relativeLayout, TextView textView, View view3) {
        super(obj, view, i);
        this.ivCrown = imageView;
        this.onItemClick = relativeLayout;
        this.tvRank = textView;
        this.view2 = view3;
    }

    public Winning getModel() {
        return this.mModel;
    }

    public static AdapterWinningsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinningsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterWinningsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_winnings, viewGroup, z, obj);
    }

    public static AdapterWinningsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinningsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterWinningsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_winnings, (ViewGroup) null, false, obj);
    }

    public static AdapterWinningsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinningsBinding bind(View view, Object obj) {
        return (AdapterWinningsBinding) bind(obj, view, C1188R.C1193layout.adapter_winnings);
    }
}
