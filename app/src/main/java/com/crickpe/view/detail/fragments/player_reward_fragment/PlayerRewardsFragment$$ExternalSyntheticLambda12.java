package com.crickpe.view.detail.fragments.player_reward_fragment;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class PlayerRewardsFragment$$ExternalSyntheticLambda12 implements Observer {
    public final /* synthetic */ PlayerRewardsFragment f$0;

    public /* synthetic */ PlayerRewardsFragment$$ExternalSyntheticLambda12(PlayerRewardsFragment playerRewardsFragment) {
        this.f$0 = playerRewardsFragment;
    }

    public final void onChanged(Object obj) {
        PlayerRewardsFragment.m3590observeData$lambda5(this.f$0, (ApiResponseHandler) obj);
    }
}
