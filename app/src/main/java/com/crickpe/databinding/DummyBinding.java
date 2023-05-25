package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.crickpe.C1188R;

public final class DummyBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView text1;

    private DummyBinding(TextView textView, TextView textView2) {
        this.rootView = textView;
        this.text1 = textView2;
    }

    public TextView getRoot() {
        return this.rootView;
    }

    public static DummyBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DummyBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dummy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DummyBinding bind(View view) {
        if (view != null) {
            TextView textView = (TextView) view;
            return new DummyBinding(textView, textView);
        }
        throw new NullPointerException("rootView");
    }
}
