package com.crickpe.utils;

import androidx.lifecycle.Observer;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SingleLiveEvent$$ExternalSyntheticLambda0 implements Observer {
    public final /* synthetic */ SingleLiveEvent f$0;
    public final /* synthetic */ Observer f$1;

    public /* synthetic */ SingleLiveEvent$$ExternalSyntheticLambda0(SingleLiveEvent singleLiveEvent, Observer observer) {
        this.f$0 = singleLiveEvent;
        this.f$1 = observer;
    }

    public final void onChanged(Object obj) {
        SingleLiveEvent.m3422observe$lambda0(this.f$0, this.f$1, obj);
    }
}
