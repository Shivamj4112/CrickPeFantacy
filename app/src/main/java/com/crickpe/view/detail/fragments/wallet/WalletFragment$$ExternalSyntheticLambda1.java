package com.crickpe.view.detail.fragments.wallet;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WalletFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ WalletFragment f$0;

    public /* synthetic */ WalletFragment$$ExternalSyntheticLambda1(WalletFragment walletFragment) {
        this.f$0 = walletFragment;
    }

    public final void onChanged(Object obj) {
        WalletFragment.m3659observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
