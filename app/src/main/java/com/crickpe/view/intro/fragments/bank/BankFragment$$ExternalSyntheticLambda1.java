package com.crickpe.view.intro.fragments.bank;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BankFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ BankFragment f$0;

    public /* synthetic */ BankFragment$$ExternalSyntheticLambda1(BankFragment bankFragment) {
        this.f$0 = bankFragment;
    }

    public final void onChanged(Object obj) {
        BankFragment.m3754observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
