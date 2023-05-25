package com.crickpe.view.detail.fragments.recent_earning;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class RecentEarningsFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ RecentEarningsFragment f$0;

    public /* synthetic */ RecentEarningsFragment$$ExternalSyntheticLambda0(RecentEarningsFragment recentEarningsFragment) {
        this.f$0 = recentEarningsFragment;
    }

    public final void onChanged(Object obj) {
        RecentEarningsFragment.m3604observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
