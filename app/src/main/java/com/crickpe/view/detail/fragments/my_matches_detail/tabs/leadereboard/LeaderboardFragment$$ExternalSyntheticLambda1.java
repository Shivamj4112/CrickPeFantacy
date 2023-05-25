package com.crickpe.view.detail.fragments.my_matches_detail.tabs.leadereboard;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class LeaderboardFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ LeaderboardFragment f$0;

    public /* synthetic */ LeaderboardFragment$$ExternalSyntheticLambda1(LeaderboardFragment leaderboardFragment) {
        this.f$0 = leaderboardFragment;
    }

    public final void onChanged(Object obj) {
        LeaderboardFragment.m3572observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
