package com.crickpe.view.detail.fragments.profile;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ProfileFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ ProfileFragment f$0;

    public /* synthetic */ ProfileFragment$$ExternalSyntheticLambda1(ProfileFragment profileFragment) {
        this.f$0 = profileFragment;
    }

    public final void onChanged(Object obj) {
        ProfileFragment.m3600observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
