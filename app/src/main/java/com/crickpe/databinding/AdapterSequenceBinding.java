package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.FantasyTeams;

public abstract class AdapterSequenceBinding extends ViewDataBinding {
    @Bindable
    protected FantasyTeams mModel;
    public final TextView tvLabel;

    public abstract void setModel(FantasyTeams fantasyTeams);

    protected AdapterSequenceBinding(Object obj, View view, int i, TextView textView) {
        super(obj, view, i);
        this.tvLabel = textView;
    }

    public FantasyTeams getModel() {
        return this.mModel;
    }

    public static AdapterSequenceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSequenceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterSequenceBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_sequence, viewGroup, z, obj);
    }

    public static AdapterSequenceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSequenceBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterSequenceBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_sequence, (ViewGroup) null, false, obj);
    }

    public static AdapterSequenceBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterSequenceBinding bind(View view, Object obj) {
        return (AdapterSequenceBinding) bind(obj, view, C1188R.C1193layout.adapter_sequence);
    }
}
