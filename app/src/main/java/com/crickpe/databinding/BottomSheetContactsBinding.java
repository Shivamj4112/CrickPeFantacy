package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;
import com.viethoa.RecyclerViewFastScroller;

public final class BottomSheetContactsBinding implements ViewBinding {
    public final EditText etSearch;
    public final RecyclerViewFastScroller fastScroller;
    public final ImageView ivBack;
    public final RelativeLayout rlBody;
    public final RelativeLayout rlContacts;
    private final RelativeLayout rootView;
    public final RecyclerView rvContacts;
    public final TextView tvDoneSheet;
    public final TextView tvTitle;

    private BottomSheetContactsBinding(RelativeLayout relativeLayout, EditText editText, RecyclerViewFastScroller recyclerViewFastScroller, ImageView imageView, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.etSearch = editText;
        this.fastScroller = recyclerViewFastScroller;
        this.ivBack = imageView;
        this.rlBody = relativeLayout2;
        this.rlContacts = relativeLayout3;
        this.rvContacts = recyclerView;
        this.tvDoneSheet = textView;
        this.tvTitle = textView2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static BottomSheetContactsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static BottomSheetContactsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.bottom_sheet_contacts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static BottomSheetContactsBinding bind(View view) {
        int i = C1188R.C1192id.etSearch;
        EditText editText = (EditText) ViewBindings.findChildViewById(view, C1188R.C1192id.etSearch);
        if (editText != null) {
            i = C1188R.C1192id.fast_scroller;
            RecyclerViewFastScroller recyclerViewFastScroller = (RecyclerViewFastScroller) ViewBindings.findChildViewById(view, C1188R.C1192id.fast_scroller);
            if (recyclerViewFastScroller != null) {
                i = C1188R.C1192id.ivBack;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivBack);
                if (imageView != null) {
                    i = C1188R.C1192id.rlBody;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlBody);
                    if (relativeLayout != null) {
                        RelativeLayout relativeLayout2 = (RelativeLayout) view;
                        i = C1188R.C1192id.rvContacts;
                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvContacts);
                        if (recyclerView != null) {
                            i = C1188R.C1192id.tvDoneSheet;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvDoneSheet);
                            if (textView != null) {
                                i = C1188R.C1192id.tvTitle;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvTitle);
                                if (textView2 != null) {
                                    return new BottomSheetContactsBinding(relativeLayout2, editText, recyclerViewFastScroller, imageView, relativeLayout, relativeLayout2, recyclerView, textView, textView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
