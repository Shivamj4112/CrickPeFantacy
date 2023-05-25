package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class DialogBottomBinding implements ViewBinding {
    public final LinearLayout llConfirm;

    /* renamed from: np */
    public final NumberPicker f457np;
    private final LinearLayout rootView;

    private DialogBottomBinding(LinearLayout linearLayout, LinearLayout linearLayout2, NumberPicker numberPicker) {
        this.rootView = linearLayout;
        this.llConfirm = linearLayout2;
        this.f457np = numberPicker;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogBottomBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogBottomBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_bottom, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogBottomBinding bind(View view) {
        int i = C1188R.C1192id.llConfirm;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.llConfirm);
        if (linearLayout != null) {
            i = C1188R.C1192id.f419np;
            NumberPicker numberPicker = (NumberPicker) ViewBindings.findChildViewById(view, C1188R.C1192id.f419np);
            if (numberPicker != null) {
                return new DialogBottomBinding((LinearLayout) view, linearLayout, numberPicker);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
