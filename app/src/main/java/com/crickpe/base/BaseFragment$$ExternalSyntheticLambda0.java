package com.crickpe.base;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class BaseFragment$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ View f$1;

    public /* synthetic */ BaseFragment$$ExternalSyntheticLambda0(Function1 function1, View view) {
        this.f$0 = function1;
        this.f$1 = view;
    }

    public final void onClick(View view) {
        BaseFragment.m3405showSnackbar$lambda0(this.f$0, this.f$1, view);
    }
}
