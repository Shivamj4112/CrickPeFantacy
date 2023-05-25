package com.crickpe.view.detail.fragments.top_players;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class TopPlayersFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ TopPlayersFragment f$0;

    public /* synthetic */ TopPlayersFragment$$ExternalSyntheticLambda1(TopPlayersFragment topPlayersFragment) {
        this.f$0 = topPlayersFragment;
    }

    public final void onChanged(Object obj) {
        TopPlayersFragment.m3634observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
