package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public final class ActivityWebviewBinding implements ViewBinding {
    public final ImageView ivBack;
    public final ImageView ivVideoPlayer;
    public final ProgressBar progressBarWeb;
    public final RelativeLayout rlTop;
    public final RelativeLayout rlVideo;
    private final ConstraintLayout rootView;
    public final TextView tvTitle;
    public final VideoView videoPlayerView;
    public final WebView webView;
    public final YouTubePlayerView youtubePlayerView;

    private ActivityWebviewBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, ProgressBar progressBar, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView, VideoView videoView, WebView webView2, YouTubePlayerView youTubePlayerView) {
        this.rootView = constraintLayout;
        this.ivBack = imageView;
        this.ivVideoPlayer = imageView2;
        this.progressBarWeb = progressBar;
        this.rlTop = relativeLayout;
        this.rlVideo = relativeLayout2;
        this.tvTitle = textView;
        this.videoPlayerView = videoView;
        this.webView = webView2;
        this.youtubePlayerView = youTubePlayerView;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ActivityWebviewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityWebviewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.activity_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityWebviewBinding bind(View view) {
        int i = C1188R.C1192id.ivBack;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivBack);
        if (imageView != null) {
            i = C1188R.C1192id.ivVideoPlayer;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivVideoPlayer);
            if (imageView2 != null) {
                i = C1188R.C1192id.progressBarWeb;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBarWeb);
                if (progressBar != null) {
                    i = C1188R.C1192id.rlTop;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlTop);
                    if (relativeLayout != null) {
                        i = C1188R.C1192id.rlVideo;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlVideo);
                        if (relativeLayout2 != null) {
                            i = C1188R.C1192id.tvTitle;
                            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvTitle);
                            if (textView != null) {
                                i = C1188R.C1192id.videoPlayerView;
                                VideoView videoView = (VideoView) ViewBindings.findChildViewById(view, C1188R.C1192id.videoPlayerView);
                                if (videoView != null) {
                                    i = C1188R.C1192id.webView;
                                    WebView webView2 = (WebView) ViewBindings.findChildViewById(view, C1188R.C1192id.webView);
                                    if (webView2 != null) {
                                        i = C1188R.C1192id.youtubePlayerView;
                                        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) ViewBindings.findChildViewById(view, C1188R.C1192id.youtubePlayerView);
                                        if (youTubePlayerView != null) {
                                            return new ActivityWebviewBinding((ConstraintLayout) view, imageView, imageView2, progressBar, relativeLayout, relativeLayout2, textView, videoView, webView2, youTubePlayerView);
                                        }
                                    }
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
