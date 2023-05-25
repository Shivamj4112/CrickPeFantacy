package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;

public abstract class AdapterUpcomingMatchesBinding extends ViewDataBinding {
    public final CardView cvUpcomingMatches;
    @Bindable
    protected MyMatchesModel mModel;
    public final TextView tvContestPrice;
    public final TextView tvMatchName;
    public final TextView tvUpcomingTime;

    public abstract void setModel(MyMatchesModel myMatchesModel);

    protected AdapterUpcomingMatchesBinding(Object obj, View view, int i, CardView cardView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.cvUpcomingMatches = cardView;
        this.tvContestPrice = textView;
        this.tvMatchName = textView2;
        this.tvUpcomingTime = textView3;
    }

    public MyMatchesModel getModel() {
        return this.mModel;
    }

    public static AdapterUpcomingMatchesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUpcomingMatchesBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterUpcomingMatchesBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_upcoming_matches, viewGroup, z, obj);
    }

    public static AdapterUpcomingMatchesBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUpcomingMatchesBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterUpcomingMatchesBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_upcoming_matches, (ViewGroup) null, false, obj);
    }

    public static AdapterUpcomingMatchesBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterUpcomingMatchesBinding bind(View view, Object obj) {
        return (AdapterUpcomingMatchesBinding) bind(obj, view, C1188R.C1193layout.adapter_upcoming_matches);
    }
}
