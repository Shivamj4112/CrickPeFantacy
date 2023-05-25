package com.crickpe.view.detail.fragments.my_matches_detail;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class MatchDetailFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ MatchDetailFragment f$0;

    public /* synthetic */ MatchDetailFragment$$ExternalSyntheticLambda0(MatchDetailFragment matchDetailFragment) {
        this.f$0 = matchDetailFragment;
    }

    public final void onChanged(Object obj) {
        MatchDetailFragment.m3562observeData$lambda0(this.f$0, (ApiResponseHandler) obj);
    }
}
