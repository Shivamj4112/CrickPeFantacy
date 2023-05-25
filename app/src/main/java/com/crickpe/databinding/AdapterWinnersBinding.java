package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.home.fragments.winner.models.MegaWinnersM;

public abstract class AdapterWinnersBinding extends ViewDataBinding {
    public final CardView cvUpcomingMatches;
    @Bindable
    protected MegaWinnersM mModel;
    public final RecyclerView rvWinnersList;
    public final TextView tvContestPrice;
    public final TextView tvDate;
    public final TextView tvMatchName;
    public final TextView tvViewAllWinners;

    public abstract void setModel(MegaWinnersM megaWinnersM);

    protected AdapterWinnersBinding(Object obj, View view, int i, CardView cardView, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.cvUpcomingMatches = cardView;
        this.rvWinnersList = recyclerView;
        this.tvContestPrice = textView;
        this.tvDate = textView2;
        this.tvMatchName = textView3;
        this.tvViewAllWinners = textView4;
    }

    public MegaWinnersM getModel() {
        return this.mModel;
    }

    public static AdapterWinnersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinnersBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterWinnersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_winners, viewGroup, z, obj);
    }

    public static AdapterWinnersBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinnersBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterWinnersBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_winners, (ViewGroup) null, false, obj);
    }

    public static AdapterWinnersBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterWinnersBinding bind(View view, Object obj) {
        return (AdapterWinnersBinding) bind(obj, view, C1188R.C1193layout.adapter_winners);
    }
}
