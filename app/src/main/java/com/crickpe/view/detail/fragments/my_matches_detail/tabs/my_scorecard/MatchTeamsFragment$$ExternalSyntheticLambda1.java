package com.crickpe.view.detail.fragments.my_matches_detail.tabs.my_scorecard;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class MatchTeamsFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ MatchTeamsFragment f$0;

    public /* synthetic */ MatchTeamsFragment$$ExternalSyntheticLambda1(MatchTeamsFragment matchTeamsFragment) {
        this.f$0 = matchTeamsFragment;
    }

    public final void onChanged(Object obj) {
        MatchTeamsFragment.m3576observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
