package com.crickpe.view.detail.fragments.settings;

import androidx.lifecycle.Observer;
import com.crickpe.utils.apiHandling.ApiResponseHandler;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SettingsFragment$$ExternalSyntheticLambda5 implements Observer {
    public final /* synthetic */ SettingsFragment f$0;

    public /* synthetic */ SettingsFragment$$ExternalSyntheticLambda5(SettingsFragment settingsFragment) {
        this.f$0 = settingsFragment;
    }

    public final void onChanged(Object obj) {
        SettingsFragment.m3627observeData$lambda5(this.f$0, (ApiResponseHandler) obj);
    }
}
