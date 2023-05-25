package com.crickpe.view.detail;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.crickpe.C1188R;
import com.crickpe.base.BaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\rH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo48222d2 = {"Lcom/crickpe/view/detail/WebViewActivity;", "Lcom/crickpe/base/BaseActivity;", "()V", "mediaControls", "Landroid/widget/MediaController;", "getMediaControls", "()Landroid/widget/MediaController;", "setMediaControls", "(Landroid/widget/MediaController;)V", "videoLink", "", "webUrl", "loadWebView", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "playVideo", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WebViewActivity.kt */
public final class WebViewActivity extends BaseActivity {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private MediaController mediaControls;
    private String videoLink = "";
    private String webUrl = "";

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final MediaController getMediaControls() {
        return this.mediaControls;
    }

    public final void setMediaControls(MediaController mediaController) {
        this.mediaControls = mediaController;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1188R.C1193layout.activity_webview);
        if (getIntent() != null) {
            this.webUrl = String.valueOf(getIntent().getStringExtra("web_url"));
            setTitle(String.valueOf(getIntent().getStringExtra("title")));
            String valueOf = String.valueOf(getIntent().getStringExtra("video_link"));
            this.videoLink = valueOf;
            if (!Intrinsics.areEqual((Object) valueOf, (Object) "null")) {
                playVideo();
            } else {
                loadWebView();
            }
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle)).setText(getTitle());
        }
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivBack)).setOnClickListener(new WebViewActivity$$ExternalSyntheticLambda0(this));
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivVideoPlayer)).setOnClickListener(new WebViewActivity$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-0  reason: not valid java name */
    public static final void m3437onCreate$lambda0(WebViewActivity webViewActivity, View view) {
        Intrinsics.checkNotNullParameter(webViewActivity, "this$0");
        webViewActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-1  reason: not valid java name */
    public static final void m3438onCreate$lambda1(WebViewActivity webViewActivity, View view) {
        Intrinsics.checkNotNullParameter(webViewActivity, "this$0");
        webViewActivity.onBackPressed();
    }

    private final void playVideo() {
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlVideo);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlVideo");
        visible(relativeLayout);
        MediaController mediaController = new MediaController(this);
        this.mediaControls = mediaController;
        mediaController.setAnchorView((VideoView) _$_findCachedViewById(C1188R.C1192id.videoPlayerView));
        ((VideoView) _$_findCachedViewById(C1188R.C1192id.videoPlayerView)).setMediaController(this.mediaControls);
        ((VideoView) _$_findCachedViewById(C1188R.C1192id.videoPlayerView)).setVideoPath(this.videoLink);
        ((VideoView) _$_findCachedViewById(C1188R.C1192id.videoPlayerView)).start();
        getWindow().setFlags(1024, 1024);
    }

    private final void loadWebView() {
        WebView webView = (WebView) _$_findCachedViewById(C1188R.C1192id.webView);
        Intrinsics.checkNotNullExpressionValue(webView, "webView");
        visible(webView);
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).getSettings().setJavaScriptEnabled(true);
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).getSettings().setLoadWithOverviewMode(true);
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).getSettings().setUseWideViewPort(true);
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).loadUrl(this.webUrl);
        ((WebView) _$_findCachedViewById(C1188R.C1192id.webView)).setWebViewClient(new WebViewActivity$loadWebView$1(this));
    }
}
