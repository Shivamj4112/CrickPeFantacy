package com.crickpe.view.detail.fragments.contest_detial;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class ContestDetailFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ ContestDetailFragment f$0;

    public /* synthetic */ ContestDetailFragment$$ExternalSyntheticLambda1(ContestDetailFragment contestDetailFragment) {
        this.f$0 = contestDetailFragment;
    }

    public final void onChanged(Object obj) {
        ContestDetailFragment.m3488observeData$lambda1(this.f$0, (ApiResponseHandler) obj);
    }
}
