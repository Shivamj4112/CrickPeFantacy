package com.crickpe.view.intro.fragments.pan;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PanFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ PanFragment f$0;

    public /* synthetic */ PanFragment$$ExternalSyntheticLambda0(PanFragment panFragment) {
        this.f$0 = panFragment;
    }

    public final void onChanged(Object obj) {
        PanFragment.m3786observeData$lambda0(this.f$0, (ApiResponseHandler) obj);
    }
}
