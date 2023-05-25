package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LiveScoreFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ LiveScoreFragment f$0;

    public /* synthetic */ LiveScoreFragment$$ExternalSyntheticLambda1(LiveScoreFragment liveScoreFragment) {
        this.f$0 = liveScoreFragment;
    }

    public final void onChanged(Object obj) {
        LiveScoreFragment.m3574observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
