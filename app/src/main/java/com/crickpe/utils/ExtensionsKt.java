package com.crickpe.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.intro.IntroductoryActivity;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.snackbar.Snackbar;
import com.microsoft.appcenter.crashes.ingestion.models.ErrorAttachmentLog;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Retrofit;

@Metadata(mo48221d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t\u001a\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f\u001a\u001d\u0010\r\u001a\u00020\u000e\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\b\u001a\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u001a\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a\u001a\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\f\u001a\u000e\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0007\u001a\n\u0010\"\u001a\u00020\u0017*\u00020#\u001a\n\u0010$\u001a\u00020\u0017*\u00020#\u001a\f\u0010%\u001a\u0004\u0018\u00010&*\u00020'\u001a\n\u0010(\u001a\u00020\u0014*\u00020\u0012\u001a5\u0010)\u001a\u00020\f*\u00020\u00122\b\b\u0001\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020,2\u0012\u0010-\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100.\"\u00020\u0010¢\u0006\u0002\u0010/\u001a\n\u00100\u001a\u00020\u0014*\u00020\u0012\u001a\n\u00101\u001a\u00020\u0007*\u00020\u0012\u001aM\u00102\u001a\u00020\u0017\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u0010*\u00020#2\b\b\u0002\u00103\u001a\u00020\u00142\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\u0019\b\n\u00106\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001707¢\u0006\u0002\b8H\bø\u0001\u0000\u001aC\u00102\u001a\u00020\u0017\"\n\b\u0000\u0010\u000f\u0018\u0001*\u00020\u0010*\u00020\u00122\n\b\u0002\u00104\u001a\u0004\u0018\u0001052\u0019\b\n\u00106\u001a\u0013\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001707¢\u0006\u0002\b8H\bø\u0001\u0000\u001a&\u00109\u001a\u00020\u0017*\u00020:2\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\u00142\b\b\u0002\u0010=\u001a\u00020\u0007H\u0000\u001a&\u0010>\u001a\u00020\u0017*\u00020:2\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\u00142\b\b\u0002\u0010=\u001a\u00020\u0007H\u0000\u001a&\u0010?\u001a\u00020\u0017*\u00020:2\u0006\u0010;\u001a\u00020\f2\u0006\u0010<\u001a\u00020\u00142\b\b\u0002\u0010=\u001a\u00020\u0007H\u0000\u001a\u001e\u0010@\u001a\u00020\u0017*\u00020A2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001707\u001a\u0012\u0010C\u001a\u00020\u0017*\u00020D2\u0006\u0010E\u001a\u00020\f\u001a\u0012\u0010F\u001a\u00020\u0017*\u00020\u00122\u0006\u0010E\u001a\u00020\t\u001a\u0014\u0010F\u001a\u00020\u0017*\u00020\u00122\b\b\u0001\u0010G\u001a\u00020\u0014\u001a\u0012\u0010F\u001a\u00020\u0017*\u00020\t2\u0006\u0010H\u001a\u00020#\u001a\u0016\u0010I\u001a\u00020\u0014*\u00020\u00122\b\b\u0001\u0010J\u001a\u00020\u0014H\u0007\u001a\n\u0010K\u001a\u00020L*\u00020\f\u001a\n\u0010M\u001a\u00020\u0017*\u00020#\u001a\u000e\u0010N\u001a\u0004\u0018\u00010L*\u0004\u0018\u00010\f\"\u001c\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u0002\u0007\n\u0005\b20\u0001¨\u0006O"}, mo48222d2 = {"toast", "Landroid/widget/Toast;", "getToast", "()Landroid/widget/Toast;", "setToast", "(Landroid/widget/Toast;)V", "isValidEmail", "", "target", "", "isValidEmailId", "email", "", "newIntent", "Landroid/content/Intent;", "T", "", "context", "Landroid/content/Context;", "pxFromDp", "", "dp", "setBaseUrl", "", "baseUrl", "retrofit", "Lretrofit2/Retrofit;", "toMultipart", "Lokhttp3/MultipartBody$Part;", "fileName", "path", "keyName", "toVisibility", "constraint", "forceLayoutToLTR", "Landroid/app/Activity;", "forceLayoutToRTL", "getCurrentNavigationFragment", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/FragmentManager;", "getHeight", "getStringByLocale", "stringRes", "locale", "Ljava/util/Locale;", "formatArgs", "", "(Landroid/content/Context;ILjava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "getWidth", "isNetworkConnected", "launchActivity", "requestCode", "options", "Landroid/os/Bundle;", "init", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "loadImage", "Landroid/widget/ImageView;", "url", "placeHolder", "isCompress", "loadImageWithouLoader", "loadPiccasso", "onChange", "Landroid/widget/EditText;", "cb", "onSnackbar", "Landroid/view/View;", "msg", "showToast", "resId", "activity", "themeColor", "themeAttrId", "toMediaRequestBody", "Lokhttp3/RequestBody;", "toStart", "toTextRequestBody", "app_release"}, mo48223k = 2, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Extensions.kt */
public final class ExtensionsKt {
    private static Toast toast;

    /* access modifiers changed from: private */
    /* renamed from: loadPiccasso$lambda-3  reason: not valid java name */
    public static final void m3417loadPiccasso$lambda3(Picasso picasso, Uri uri, Exception exc) {
    }

    public static final int toVisibility(boolean z) {
        return z ? 0 : 8;
    }

    public static final boolean isValidEmail(CharSequence charSequence) {
        return charSequence != null && Patterns.EMAIL_ADDRESS.matcher(charSequence).matches();
    }

    public static final void onSnackbar(View view, String str) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        Snackbar make = Snackbar.make(view, (CharSequence) str, 0);
        Intrinsics.checkNotNullExpressionValue(make, "make(\n        this, msg,…nackbar.LENGTH_LONG\n    )");
        make.setAction((CharSequence) "ok", (View.OnClickListener) new ExtensionsKt$$ExternalSyntheticLambda0(make));
        View view2 = make.getView();
        Intrinsics.checkNotNullExpressionValue(view2, "snackbar.view");
        view2.setBackgroundColor(Color.parseColor("#000000"));
        make.setActionTextColor(Color.parseColor("#000000"));
        make.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: onSnackbar$lambda-0  reason: not valid java name */
    public static final void m3418onSnackbar$lambda0(Snackbar snackbar, View view) {
        Intrinsics.checkNotNullParameter(snackbar, "$snackbar");
        snackbar.dismiss();
    }

    public static final RequestBody toTextRequestBody(String str) {
        if (str != null) {
            return RequestBody.Companion.create(str, MediaType.Companion.get(ErrorAttachmentLog.CONTENT_TYPE_TEXT_PLAIN));
        }
        return null;
    }

    public static final RequestBody toMediaRequestBody(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return RequestBody.Companion.create(str, MediaType.Companion.get("multipart/form-data"));
    }

    public static final MultipartBody.Part toMultipart(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        Intrinsics.checkNotNullParameter(str2, "path");
        Intrinsics.checkNotNullParameter(str3, "keyName");
        File file = new File(str2);
        return MultipartBody.Part.Companion.createFormData(str3, file.getName(), RequestBody.Companion.create(file, MediaType.Companion.get("image/*")));
    }

    public static final boolean isValidEmailId(String str) {
        Intrinsics.checkNotNullParameter(str, "email");
        return Pattern.compile("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$").matcher(str).matches();
    }

    public static final Fragment getCurrentNavigationFragment(FragmentManager fragmentManager) {
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Fragment primaryNavigationFragment = fragmentManager.getPrimaryNavigationFragment();
        if (primaryNavigationFragment == null || (childFragmentManager = primaryNavigationFragment.getChildFragmentManager()) == null || (fragments = childFragmentManager.getFragments()) == null) {
            return null;
        }
        return (Fragment) CollectionsKt.first(fragments);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        r1 = (r1 = r1.getResources()).getDisplayMetrics();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int pxFromDp(int r0, Context r1) {
        /*
            float r0 = (float) r0
            if (r1 == 0) goto L_0x0012
            android.content.res.Resources r1 = r1.getResources()
            if (r1 == 0) goto L_0x0012
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            if (r1 == 0) goto L_0x0012
            float r1 = r1.density
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.utils.ExtensionsKt.pxFromDp(int, android.content.Context):int");
    }

    public static final boolean isNetworkConnected(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public static final int getWidth(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.widthPixels;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public static final int getHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        if (systemService != null) {
            ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.heightPixels;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }

    public static final int themeColor(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{i});
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(\n…rrayOf(themeAttrId)\n    )");
        int color = obtainStyledAttributes.getColor(0, -65281);
        obtainStyledAttributes.recycle();
        return color;
    }

    public static final void toStart(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intent intent = new Intent(activity, IntroductoryActivity.class);
        intent.setFlags(268468224);
        intent.putExtra("openFragment", "login_sign_up");
        activity.startActivity(intent);
    }

    public static final void setBaseUrl(String str, Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(str, "baseUrl");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Field declaredField = Retrofit.class.getDeclaredField("baseUrl");
        declaredField.setAccessible(true);
        declaredField.set(retrofit, HttpUrl.Companion.parse(str));
    }

    public static final void forceLayoutToRTL(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.getWindow().getDecorView().setLayoutDirection(1);
    }

    public static final void forceLayoutToLTR(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.getWindow().getDecorView().setLayoutDirection(0);
    }

    public static /* synthetic */ void launchActivity$default(Activity activity, int i, Bundle bundle, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        if ((i2 & 4) != 0) {
            function1 = ExtensionsKt$launchActivity$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(function1, "init");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Class<Object> cls = Object.class;
        Class cls2 = cls;
        Intent intent = new Intent(activity, cls);
        function1.invoke(intent);
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static final void onChange(EditText editText, Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(editText, "<this>");
        Intrinsics.checkNotNullParameter(function1, "cb");
        editText.addTextChangedListener(new ExtensionsKt$onChange$1(function1));
    }

    public static final String getStringByLocale(Context context, int i, Locale locale, Object... objArr) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(objArr, "formatArgs");
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        configuration.setLocale(locale);
        String string = context.createConfigurationContext(configuration).getResources().getString(i, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(string, "createConfigurationConte…g(stringRes, *formatArgs)");
        return string;
    }

    public static /* synthetic */ void loadImage$default(ImageView imageView, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        loadImage(imageView, str, i, z);
    }

    public static final void loadImage(ImageView imageView, String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, ImagesContract.URL);
        try {
            String str2 = null;
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "http", false, 2, (Object) null)) {
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                    if (appSettings != null) {
                        str2 = appSettings.getImageBaseUrl();
                    }
                    sb.append(str2);
                    sb.append(str);
                    sb.append(Constants.COMPRESS_IMAGE);
                    str = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                    if (appSettings2 != null) {
                        str2 = appSettings2.getImageBaseUrl();
                    }
                    sb2.append(str2);
                    sb2.append(str);
                    str = sb2.toString();
                }
            }
            BaseRequestOptions error = ((RequestOptions) ((RequestOptions) new RequestOptions().centerCrop()).placeholder(i)).error(i);
            Intrinsics.checkNotNullExpressionValue(error, "RequestOptions()\n       …      .error(placeHolder)");
            Glide.with(imageView.getContext()).load(str).apply((BaseRequestOptions<?>) (RequestOptions) error).into(imageView);
        } catch (Exception e) {
            Log.v("loadImage", e.toString());
        }
    }

    public static /* synthetic */ void loadImageWithouLoader$default(ImageView imageView, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        loadImageWithouLoader(imageView, str, i, z);
    }

    public static final void loadImageWithouLoader(ImageView imageView, String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, ImagesContract.URL);
        try {
            String str2 = null;
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "http", false, 2, (Object) null)) {
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                    if (appSettings != null) {
                        str2 = appSettings.getImageBaseUrl();
                    }
                    sb.append(str2);
                    sb.append(str);
                    sb.append(Constants.COMPRESS_IMAGE);
                    str = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                    if (appSettings2 != null) {
                        str2 = appSettings2.getImageBaseUrl();
                    }
                    sb2.append(str2);
                    sb2.append(str);
                    str = sb2.toString();
                }
            }
            BaseRequestOptions error = ((RequestOptions) ((RequestOptions) new RequestOptions().centerCrop()).placeholder(i)).error(i);
            Intrinsics.checkNotNullExpressionValue(error, "RequestOptions()\n       …      .error(placeHolder)");
            ((RequestBuilder) Glide.with(imageView.getContext()).load(str).apply((BaseRequestOptions<?>) (RequestOptions) error).placeholder((int) C1188R.C1190drawable.progress_animation)).into(imageView);
        } catch (Exception e) {
            Log.v("loadImageWithouLoader", e.toString());
        }
    }

    public static /* synthetic */ void loadPiccasso$default(ImageView imageView, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        loadPiccasso(imageView, str, i, z);
    }

    public static final void loadPiccasso(ImageView imageView, String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(str, ImagesContract.URL);
        try {
            String str2 = null;
            if (!StringsKt.contains$default((CharSequence) str, (CharSequence) "http", false, 2, (Object) null)) {
                if (z) {
                    StringBuilder sb = new StringBuilder();
                    SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                    if (appSettings != null) {
                        str2 = appSettings.getImageBaseUrl();
                    }
                    sb.append(str2);
                    sb.append(str);
                    sb.append(Constants.COMPRESS_IMAGE);
                    str = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                    if (appSettings2 != null) {
                        str2 = appSettings2.getImageBaseUrl();
                    }
                    sb2.append(str2);
                    sb2.append(str);
                    str = sb2.toString();
                }
            }
            new Picasso.Builder(imageView.getContext()).listener(new ExtensionsKt$$ExternalSyntheticLambda1()).build().load(str).error(i).placeholder((int) C1188R.C1190drawable.progress_animation).into(imageView);
        } catch (Exception e) {
            Log.v("PICASSo", e.toString());
        }
    }

    public static final Toast getToast() {
        return toast;
    }

    public static final void setToast(Toast toast2) {
        toast = toast2;
    }

    public static final void showToast(CharSequence charSequence, Activity activity) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Toast toast2 = toast;
        if (toast2 != null) {
            Intrinsics.checkNotNull(toast2);
            toast2.cancel();
        }
        Toast makeText = Toast.makeText(activity, charSequence.toString(), 0);
        toast = makeText;
        Intrinsics.checkNotNull(makeText);
        makeText.show();
    }

    public static final void showToast(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Toast toast2 = toast;
        if (toast2 != null) {
            Intrinsics.checkNotNull(toast2);
            toast2.cancel();
        }
        Toast makeText = Toast.makeText(context, i, 0);
        toast = makeText;
        Intrinsics.checkNotNull(makeText);
        makeText.show();
    }

    public static final void showToast(Context context, CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, NotificationCompat.CATEGORY_MESSAGE);
        Toast toast2 = toast;
        if (toast2 != null) {
            Intrinsics.checkNotNull(toast2);
            toast2.cancel();
        }
        Toast makeText = Toast.makeText(context, charSequence.toString(), 0);
        toast = makeText;
        Intrinsics.checkNotNull(makeText);
        makeText.show();
    }

    public static /* synthetic */ void launchActivity$default(Context context, Bundle bundle, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            bundle = null;
        }
        if ((i & 2) != 0) {
            function1 = ExtensionsKt$launchActivity$2.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(function1, "init");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Class<Object> cls = Object.class;
        Class cls2 = cls;
        Intent intent = new Intent(context, cls);
        function1.invoke(intent);
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static final /* synthetic */ <T> Intent newIntent(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Class<Object> cls = Object.class;
        Class cls2 = cls;
        return new Intent(context, cls);
    }

    public static final /* synthetic */ <T> void launchActivity(Activity activity, int i, Bundle bundle, Function1<? super Intent, Unit> function1) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(function1, "init");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Class<Object> cls = Object.class;
        Class cls2 = cls;
        Intent intent = new Intent(activity, cls);
        function1.invoke(intent);
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, i, bundle);
        } else {
            activity.startActivityForResult(intent, i);
        }
    }

    public static final /* synthetic */ <T> void launchActivity(Context context, Bundle bundle, Function1<? super Intent, Unit> function1) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(function1, "init");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        Class<Object> cls = Object.class;
        Class cls2 = cls;
        Intent intent = new Intent(context, cls);
        function1.invoke(intent);
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }
}
