package com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class WinningsFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ WinningsFragment f$0;

    public /* synthetic */ WinningsFragment$$ExternalSyntheticLambda1(WinningsFragment winningsFragment) {
        this.f$0 = winningsFragment;
    }

    public final void onChanged(Object obj) {
        WinningsFragment.m3580observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
