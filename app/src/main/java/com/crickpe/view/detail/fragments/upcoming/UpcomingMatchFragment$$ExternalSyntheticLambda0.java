package com.crickpe.view.detail.fragments.upcoming;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class UpcomingMatchFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ UpcomingMatchFragment f$0;

    public /* synthetic */ UpcomingMatchFragment$$ExternalSyntheticLambda0(UpcomingMatchFragment upcomingMatchFragment) {
        this.f$0 = upcomingMatchFragment;
    }

    public final void onChanged(Object obj) {
        UpcomingMatchFragment.m3635observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
