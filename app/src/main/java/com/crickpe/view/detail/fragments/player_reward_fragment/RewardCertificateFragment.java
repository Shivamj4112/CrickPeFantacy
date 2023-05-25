package com.crickpe.view.detail.fragments.player_reward_fragment;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\rH\u0016J-\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u00122\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u001f2\u0006\u0010 \u001a\u00020!H\u0016¢\u0006\u0002\u0010\"J\b\u0010#\u001a\u00020\rH\u0016J\u001a\u0010$\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\rH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000¨\u0006("}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/RewardCertificateFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "certificateUrl", "", "getCertificateUrl", "()Ljava/lang/String;", "setCertificateUrl", "(Ljava/lang/String;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "downloadFile", "", "context", "Landroid/content/Context;", "url", "getFragmentLayoutResId", "", "getLocalBitmapUri", "Landroid/net/Uri;", "imageView", "Landroid/widget/ImageView;", "listeners", "onClick", "view", "Landroid/view/View;", "onDetach", "onRequestPermissionsResult", "requestCode", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "shareImage", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RewardCertificateFragment.kt */
public final class RewardCertificateFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private String certificateUrl = "";
    private DetailViewModel viewModel;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getFragmentLayoutResId() {
        return C1188R.C1193layout.fragment_reward_certificate;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getCertificateUrl() {
        return this.certificateUrl;
    }

    public final void setCertificateUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.certificateUrl = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.certificateUrl = UserManager.INSTANCE.getCertificate();
        ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivCertificate);
        Intrinsics.checkNotNullExpressionValue(imageView, "ivCertificate");
        ExtensionsKt.loadPiccasso$default(imageView, this.certificateUrl, C1188R.C1190drawable.certificate_placeholder, false, 4, (Object) null);
        listeners();
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("Certificate", true, false, false, false, false, false, false);
            FragmentActivity activity2 = getActivity();
            if (activity2 != null) {
                ((DetailActivity) activity2).showDownloadIcon(true);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onDetach() {
        super.onDetach();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).showDownloadIcon(false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    private final void listeners() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            View.OnClickListener onClickListener = this;
            ((ImageView) ((DetailActivity) activity)._$_findCachedViewById(C1188R.C1192id.ivDownload)).setOnClickListener(onClickListener);
            ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llShare)).setOnClickListener(onClickListener);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id != C1188R.C1192id.ivDownload) {
            if (id == C1188R.C1192id.llShare) {
                shareImage();
            }
        } else if (ContextCompat.checkSelfPermission(requireActivity(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            ActivityCompat.requestPermissions(requireActivity(), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"}, 0);
        } else {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            StringBuilder sb = new StringBuilder();
            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
            Intrinsics.checkNotNull(appSettings);
            sb.append(appSettings.getImageBaseUrl());
            sb.append(this.certificateUrl);
            downloadFile(requireActivity, sb.toString());
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 0 && iArr[0] == 0 && iArr[1] == 0) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            StringBuilder sb = new StringBuilder();
            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
            Intrinsics.checkNotNull(appSettings);
            sb.append(appSettings.getImageBaseS3Url());
            sb.append(this.certificateUrl);
            downloadFile(requireActivity, sb.toString());
        }
    }

    private final void downloadFile(Context context, String str) {
        Object systemService = context.getSystemService("download");
        if (systemService != null) {
            Uri parse = Uri.parse(str);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(url)");
            List<String> pathSegments = parse.getPathSegments();
            Intrinsics.checkNotNullExpressionValue(pathSegments, "uri.pathSegments");
            DownloadManager.Request request = new DownloadManager.Request(parse);
            request.setTitle("");
            request.setDescription("Downloading");
            request.setNotificationVisibility(1);
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, (String) CollectionsKt.last(pathSegments));
            ((DownloadManager) systemService).enqueue(request);
            showToast("Downloading ...");
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.DownloadManager");
    }

    private final void shareImage() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                Method method = StrictMode.class.getMethod("disableDeathOnFileUriExposure", new Class[0]);
                Intrinsics.checkNotNullExpressionValue(method, "StrictMode::class.java.g…eDeathOnFileUriExposure\")");
                method.invoke((Object) null, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
        ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivCertificate);
        Intrinsics.checkNotNullExpressionValue(imageView, "ivCertificate");
        Uri localBitmapUri = getLocalBitmapUri(imageView);
        if (localBitmapUri != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.STREAM", localBitmapUri);
            intent.setType("image/*");
            requireActivity().startActivity(Intent.createChooser(intent, "Share Image"));
            return;
        }
        Log.v("Failed", "Sharing failed");
    }

    private final Uri getLocalBitmapUri(ImageView imageView) {
        if (!(imageView.getDrawable() instanceof BitmapDrawable)) {
            return null;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            try {
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                File file = new File(externalStoragePublicDirectory, "share_image_" + System.currentTimeMillis() + ".png");
                file.getParentFile().mkdirs();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
                fileOutputStream.close();
                return Uri.fromFile(file);
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        }
    }
}
