package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentSplashBinding implements ViewBinding {
    public final RelativeLayout rlInternet;
    public final RelativeLayout rlProgress;
    private final RelativeLayout rootView;
    public final TextView tvInternet;
    public final TextView tvOkay;
    public final VideoView vidView;

    private FragmentSplashBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, TextView textView, TextView textView2, VideoView videoView) {
        this.rootView = relativeLayout;
        this.rlInternet = relativeLayout2;
        this.rlProgress = relativeLayout3;
        this.tvInternet = textView;
        this.tvOkay = textView2;
        this.vidView = videoView;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentSplashBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_splash, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentSplashBinding bind(View view) {
        int i = C1188R.C1192id.rlInternet;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlInternet);
        if (relativeLayout != null) {
            i = C1188R.C1192id.rlProgress;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlProgress);
            if (relativeLayout2 != null) {
                i = C1188R.C1192id.tvInternet;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvInternet);
                if (textView != null) {
                    i = C1188R.C1192id.tvOkay;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvOkay);
                    if (textView2 != null) {
                        i = C1188R.C1192id.vidView;
                        VideoView videoView = (VideoView) ViewBindings.findChildViewById(view, C1188R.C1192id.vidView);
                        if (videoView != null) {
                            return new FragmentSplashBinding((RelativeLayout) view, relativeLayout, relativeLayout2, textView, textView2, videoView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
