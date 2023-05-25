package com.crickpe.view.home.fragments.my_matches;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class MyMatchesFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ MyMatchesFragment f$0;

    public /* synthetic */ MyMatchesFragment$$ExternalSyntheticLambda0(MyMatchesFragment myMatchesFragment) {
        this.f$0 = myMatchesFragment;
    }

    public final void onChanged(Object obj) {
        MyMatchesFragment.m3720observeData$lambda2(this.f$0, (ApiResponseHandler) obj);
    }
}
