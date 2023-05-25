package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.wallet.models.WalletModal;

public abstract class FragmentWalletBinding extends ViewDataBinding {
    public final ImageView imageView10;
    public final ImageView imageView11;
    public final CardView linearLayout5;
    public final LinearLayout linearLayout9;
    public final LinearLayout llJoin;
    @Bindable
    protected WalletModal mModel;
    public final NestedScrollView nestedScrollView;
    public final ProgressBar progressBar;
    public final RelativeLayout rlTopup;
    public final RelativeLayout rlWithdraw;
    public final RecyclerView rvWalletHistory;
    public final TextView tvJoinContest;
    public final TextView tvNoData;
    public final TextView tvUpcoming;
    public final TextView tvWithdraw;

    public abstract void setModel(WalletModal walletModal);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentWalletBinding(Object obj, View view, int i, ImageView imageView, ImageView imageView2, CardView cardView, LinearLayout linearLayout, LinearLayout linearLayout2, NestedScrollView nestedScrollView2, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        super(obj, view, i);
        this.imageView10 = imageView;
        this.imageView11 = imageView2;
        this.linearLayout5 = cardView;
        this.linearLayout9 = linearLayout;
        this.llJoin = linearLayout2;
        this.nestedScrollView = nestedScrollView2;
        this.progressBar = progressBar2;
        this.rlTopup = relativeLayout;
        this.rlWithdraw = relativeLayout2;
        this.rvWalletHistory = recyclerView;
        this.tvJoinContest = textView;
        this.tvNoData = textView2;
        this.tvUpcoming = textView3;
        this.tvWithdraw = textView4;
    }

    public WalletModal getModel() {
        return this.mModel;
    }

    public static FragmentWalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentWalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentWalletBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_wallet, viewGroup, z, obj);
    }

    public static FragmentWalletBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentWalletBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentWalletBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_wallet, (ViewGroup) null, false, obj);
    }

    public static FragmentWalletBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentWalletBinding bind(View view, Object obj) {
        return (FragmentWalletBinding) bind(obj, view, C1188R.C1193layout.fragment_wallet);
    }
}
