package com.crickpe.view.detail.fragments.create_contest;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SelectWinnersFragment$$ExternalSyntheticLambda1 implements Observer {
    public final /* synthetic */ SelectWinnersFragment f$0;

    public /* synthetic */ SelectWinnersFragment$$ExternalSyntheticLambda1(SelectWinnersFragment selectWinnersFragment) {
        this.f$0 = selectWinnersFragment;
    }

    public final void onChanged(Object obj) {
        SelectWinnersFragment.m3503observeData$lambda2(this.f$0, (ApiResponseHandler) obj);
    }
}
