package com.crickpe.view.intro.fragments.splash;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import kotlin.jvm.internal.Ref;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SplashFragment$$ExternalSyntheticLambda0 implements OnSuccessListener {
    public final /* synthetic */ Ref.ObjectRef f$0;
    public final /* synthetic */ Ref.ObjectRef f$1;
    public final /* synthetic */ SplashFragment f$2;

    public /* synthetic */ SplashFragment$$ExternalSyntheticLambda0(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, SplashFragment splashFragment) {
        this.f$0 = objectRef;
        this.f$1 = objectRef2;
        this.f$2 = splashFragment;
    }

    public final void onSuccess(Object obj) {
        SplashFragment.m3789checkAuth$lambda9$lambda7(this.f$0, this.f$1, this.f$2, (PendingDynamicLinkData) obj);
    }
}
