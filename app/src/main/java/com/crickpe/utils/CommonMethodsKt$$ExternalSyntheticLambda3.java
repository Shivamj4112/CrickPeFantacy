package com.crickpe.utils;

import android.app.DatePickerDialog;
import android.view.View;
import android.widget.DatePicker;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CommonMethodsKt$$ExternalSyntheticLambda3 implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ DateSelectorListener f$0;
    public final /* synthetic */ View f$1;

    public /* synthetic */ CommonMethodsKt$$ExternalSyntheticLambda3(DateSelectorListener dateSelectorListener, View view) {
        this.f$0 = dateSelectorListener;
        this.f$1 = view;
    }

    public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
        CommonMethodsKt.m3413pickDateBoth$lambda4(this.f$0, this.f$1, datePicker, i, i2, i3);
    }
}
