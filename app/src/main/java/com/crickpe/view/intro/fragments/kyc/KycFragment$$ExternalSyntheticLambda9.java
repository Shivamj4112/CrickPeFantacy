package com.crickpe.view.intro.fragments.kyc;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class KycFragment$$ExternalSyntheticLambda9 implements Observer {
    public final /* synthetic */ KycFragment f$0;

    public /* synthetic */ KycFragment$$ExternalSyntheticLambda9(KycFragment kycFragment) {
        this.f$0 = kycFragment;
    }

    public final void onChanged(Object obj) {
        KycFragment.m3768observeData$lambda9(this.f$0, (ApiResponseHandler) obj);
    }
}
