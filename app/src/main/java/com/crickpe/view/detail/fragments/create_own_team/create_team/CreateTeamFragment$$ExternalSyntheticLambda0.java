package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.os.Bundle;
import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CreateTeamFragment$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ CreateTeamFragment f$0;
    public final /* synthetic */ Bundle f$1;

    public /* synthetic */ CreateTeamFragment$$ExternalSyntheticLambda0(CreateTeamFragment createTeamFragment, Bundle bundle) {
        this.f$0 = createTeamFragment;
        this.f$1 = bundle;
    }

    public final void onChanged(Object obj) {
        CreateTeamFragment.m3546observeData$lambda8(this.f$0, this.f$1, (ApiResponseHandler) obj);
    }
}
