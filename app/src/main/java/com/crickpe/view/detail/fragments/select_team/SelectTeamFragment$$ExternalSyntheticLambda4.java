package com.crickpe.view.detail.fragments.select_team;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SelectTeamFragment$$ExternalSyntheticLambda4 implements Observer {
    public final /* synthetic */ SelectTeamFragment f$0;

    public /* synthetic */ SelectTeamFragment$$ExternalSyntheticLambda4(SelectTeamFragment selectTeamFragment) {
        this.f$0 = selectTeamFragment;
    }

    public final void onChanged(Object obj) {
        SelectTeamFragment.m3613observeData$lambda2(this.f$0, (ApiResponseHandler) obj);
    }
}
