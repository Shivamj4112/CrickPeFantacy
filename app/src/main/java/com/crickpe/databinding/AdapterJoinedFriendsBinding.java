package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Joined;
import p019de.hdodenhof.circleimageview.CircleImageView;

public abstract class AdapterJoinedFriendsBinding extends ViewDataBinding {
    @Bindable
    protected Joined mModel;
    public final CircleImageView playerImageOne;
    public final TextView tvDateofJoin;
    public final TextView tvTeams;

    public abstract void setModel(Joined joined);

    protected AdapterJoinedFriendsBinding(Object obj, View view, int i, CircleImageView circleImageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.playerImageOne = circleImageView;
        this.tvDateofJoin = textView;
        this.tvTeams = textView2;
    }

    public Joined getModel() {
        return this.mModel;
    }

    public static AdapterJoinedFriendsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterJoinedFriendsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (AdapterJoinedFriendsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_joined_friends, viewGroup, z, obj);
    }

    public static AdapterJoinedFriendsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterJoinedFriendsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (AdapterJoinedFriendsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.adapter_joined_friends, (ViewGroup) null, false, obj);
    }

    public static AdapterJoinedFriendsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static AdapterJoinedFriendsBinding bind(View view, Object obj) {
        return (AdapterJoinedFriendsBinding) bind(obj, view, C1188R.C1193layout.adapter_joined_friends);
    }
}
