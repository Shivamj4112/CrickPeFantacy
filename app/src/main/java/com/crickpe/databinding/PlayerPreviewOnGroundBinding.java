package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class PlayerPreviewOnGroundBinding implements ViewBinding {
    public final ImageView ivPlayer;
    public final RelativeLayout rlBackground;
    private final LinearLayout rootView;
    public final TextView tvName;
    public final TextView tvPoints;
    public final TextView tvType;

    private PlayerPreviewOnGroundBinding(LinearLayout linearLayout, ImageView imageView, RelativeLayout relativeLayout, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = linearLayout;
        this.ivPlayer = imageView;
        this.rlBackground = relativeLayout;
        this.tvName = textView;
        this.tvPoints = textView2;
        this.tvType = textView3;
    }

    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static PlayerPreviewOnGroundBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static PlayerPreviewOnGroundBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.player_preview_on_ground, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static PlayerPreviewOnGroundBinding bind(View view) {
        int i = C1188R.C1192id.ivPlayer;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivPlayer);
        if (imageView != null) {
            i = C1188R.C1192id.rlBackground;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlBackground);
            if (relativeLayout != null) {
                i = C1188R.C1192id.tvName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvName);
                if (textView != null) {
                    i = C1188R.C1192id.tvPoints;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvPoints);
                    if (textView2 != null) {
                        i = C1188R.C1192id.tvType;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvType);
                        if (textView3 != null) {
                            return new PlayerPreviewOnGroundBinding((LinearLayout) view, imageView, relativeLayout, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
