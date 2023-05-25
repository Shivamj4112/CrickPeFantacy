package com.crickpe.view.detail.fragments.wallet;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PaymentMethodsFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ PaymentMethodsFragment f$0;

    public /* synthetic */ PaymentMethodsFragment$$ExternalSyntheticLambda0(PaymentMethodsFragment paymentMethodsFragment) {
        this.f$0 = paymentMethodsFragment;
    }

    public final void onChanged(Object obj) {
        PaymentMethodsFragment.m3637observeData$lambda0(this.f$0, (ApiResponseHandler) obj);
    }
}
