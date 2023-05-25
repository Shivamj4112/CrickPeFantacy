package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.contest_winners.models.model.WinnerFilter;

public abstract class AdapterFilterContestWinnersBinding extends ViewDataBinding {
    public final ImageView imageView8;
    @Bindable
    protected WinnerFilter mModel;
    public final TextView tvFilterTite;

    public abstract void setModel(WinnerFilter winnerFilter);

    protected AdapterFilterContestWinnersBinding(Object obj, View view, int i, ImageView imageView, TextView textView) {
        super(obj, view, i);
        this.imageView8 = imageView;
        this.tvFilterTite = textView;
    }

    public WinnerFilter getModel() {
        return this.mModel;
    }

    public static AdapterFilterContestWinnersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterFilterContestWinnersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterFilterContestWinnersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_filter_contest_winners, viewGroup, z, obj);
    }

    public static AdapterFilterContestWinnersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterFilterContestWinnersBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterFilterContestWinnersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_filter_contest_winners, (ViewGroup) null, false, obj);
    }

    public static AdapterFilterContestWinnersBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterFilterContestWinnersBinding bind(View view, Object obj) {
        return (AdapterFilterContestWinnersBinding) bind(obj, view, C1188R.C1193layout.adapter_filter_contest_winners);
    }
}
