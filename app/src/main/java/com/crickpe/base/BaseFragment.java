package com.crickpe.base;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.crickpe.C1188R;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.apiHandling.AppError;
import com.crickpe.view.intro.IntroductoryActivity;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import zendesk.android.Zendesk;
import zendesk.android.messaging.Messaging;

@Metadata(mo48221d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ \u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u000e\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001e\u001a\u00020\u0014H'J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0007J\u001a\u0010#\u001a\u0004\u0018\u00010\u00192\u0006\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u0019H\u0007J\u000e\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u000e\u00101\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0019J\u000e\u00103\u001a\u00020\u00192\u0006\u00102\u001a\u00020\u0019J \u00104\u001a\u00020\u00172\u0006\u00105\u001a\u00020\u00012\b\b\u0002\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020\u0014J\u000e\u00108\u001a\u0002092\u0006\u0010:\u001a\u000209J<\u0010;\u001a\u00020\u00172\u0006\u0010<\u001a\u00020*2\u0006\u0010=\u001a\u00020\u00192\u0006\u0010>\u001a\u00020\u00142\b\u0010?\u001a\u0004\u0018\u00010@2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00170BJ\u000e\u0010C\u001a\u00020\u00172\u0006\u0010=\u001a\u00020@J\u000e\u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020\u0014J\u000e\u0010D\u001a\u00020(2\u0006\u0010E\u001a\u00020\u0019J\u000e\u0010F\u001a\u00020\u001c2\u0006\u0010E\u001a\u00020\u0014J\u0014\u0010G\u001a\u00020\u0019*\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JJ\u0014\u0010K\u001a\u00020\u0019*\u00020H2\b\u0010I\u001a\u0004\u0018\u00010JR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006L"}, mo48222d2 = {"Lcom/crickpe/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "simpleDateFormat2", "toast", "Landroid/widget/Toast;", "getToast", "()Landroid/widget/Toast;", "setToast", "(Landroid/widget/Toast;)V", "bitmapToFile", "Ljava/io/File;", "bitmap", "Landroid/graphics/Bitmap;", "convertToBitmap", "drawable", "Landroid/graphics/drawable/Drawable;", "widthPixels", "", "heightPixels", "errorDialog", "", "message", "", "getDateString", "time", "", "getDateString2", "getFragmentLayoutResId", "isOnline", "", "context", "Landroid/content/Context;", "modifyDateLayout", "inputDate", "datePattern", "numDifferentiation", "value", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "printInitials", "name", "printInitialsOnly", "replaceFragment", "fragment", "addBackStack", "fragmentContest", "roundOffDecimal", "", "number", "showSnackbar", "view", "msg", "length", "actionMessage", "", "action", "Lkotlin/Function1;", "showToast", "toDouble", "s", "toLong", "handleApiError", "Landroid/app/Activity;", "error", "Lcom/crickpe/utils/apiHandling/AppError;", "handleApiErrorDialog", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BaseFragment.kt */
public abstract class BaseFragment extends Fragment {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
    private final SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd MMM, yyyy", Locale.ENGLISH);
    private Toast toast;

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

    public abstract int getFragmentLayoutResId();

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final double toDouble(int i) {
        return (double) i;
    }

    public final long toLong(int i) {
        return (long) i;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(getFragmentLayoutResId(), viewGroup, false);
    }

    public final double toDouble(String str) {
        Intrinsics.checkNotNullParameter(str, "s");
        return Double.parseDouble(str);
    }

    public final float roundOffDecimal(float f) {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        decimalFormat.setRoundingMode(RoundingMode.CEILING);
        String format = decimalFormat.format(Float.valueOf(f));
        Intrinsics.checkNotNullExpressionValue(format, "df.format(number)");
        return Float.parseFloat(format);
    }

    public final boolean isOnline(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        if (systemService != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasTransport(0)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_CELLULAR");
                    return true;
                } else if (networkCapabilities.hasTransport(1)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_WIFI");
                    return true;
                } else if (networkCapabilities.hasTransport(3)) {
                    Log.i("Internet", "NetworkCapabilities.TRANSPORT_ETHERNET");
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }

    public final String getDateString(long j) {
        String format = this.simpleDateFormat.format(Long.valueOf(j * 1000));
        Intrinsics.checkNotNullExpressionValue(format, "simpleDateFormat.format(time * 1000L)");
        return format;
    }

    public final String getDateString2(long j) {
        String format = this.simpleDateFormat2.format(Long.valueOf(j * 1000));
        Intrinsics.checkNotNullExpressionValue(format, "simpleDateFormat2.format(time * 1000L)");
        return format;
    }

    public final String modifyDateLayout(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "inputDate");
        Intrinsics.checkNotNullParameter(str2, "datePattern");
        try {
            ZonedDateTime zonedDateTime = OffsetDateTime.parse(str).toZonedDateTime();
            Intrinsics.checkNotNullExpressionValue(zonedDateTime, "parse(date).toZonedDateTime()");
            String format = zonedDateTime.format(DateTimeFormatter.ofPattern(str2));
            Intrinsics.checkNotNullExpressionValue(format, "dateTime.format(formatter)");
            return format;
        } catch (Exception unused) {
            return "";
        }
    }

    public final String numDifferentiation(double d) {
        String str;
        String str2 = "";
        try {
            double abs = Math.abs(d);
            if (abs >= 1.0E7d) {
                abs /= (double) 10000000;
                str = " Crores";
            } else if (abs >= 100000.0d) {
                abs /= (double) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
                str = " Lakhs";
            } else {
                str = " ";
            }
            try {
                DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###.##");
                decimalFormat.setRoundingMode(RoundingMode.DOWN);
                String format = decimalFormat.format(abs);
                Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
                str2 = format;
            } catch (Exception e) {
                e = e;
                Log.v("numDifferentiation", e.toString());
                return 8377 + str2 + str;
            }
        } catch (Exception e2) {
            e = e2;
            str = str2;
            Log.v("numDifferentiation", e.toString());
            return 8377 + str2 + str;
        }
        return 8377 + str2 + str;
    }

    public final String printInitials(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Object[] array = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        String[] strArr = (String[]) array;
        String str2 = strArr[0];
        char charAt = str2.charAt(0);
        if (strArr.length <= 1) {
            return String.valueOf(str2);
        }
        String str3 = strArr[strArr.length - 1];
        return charAt + ' ' + str3;
    }

    public final String printInitialsOnly(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Object[] array = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return ((String[]) array)[0];
    }

    public final Bitmap convertToBitmap(Drawable drawable, int i, int i2) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        return createBitmap;
    }

    public final File bitmapToFile(Bitmap bitmap) {
        File file = null;
        try {
            file = new ContextWrapper(requireContext()).getDir("Images", 0);
            File file2 = new File(file, UUID.randomUUID() + ".jpg");
            try {
                OutputStream fileOutputStream = new FileOutputStream(file2);
                Intrinsics.checkNotNull(bitmap);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return file2;
            } catch (Exception e) {
                e = e;
                file = file2;
                e.printStackTrace();
                return file;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return file;
        }
    }

    public final void showSnackbar(View view, String str, int i, CharSequence charSequence, Function1<? super View, Unit> function1) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        Intrinsics.checkNotNullParameter(function1, "action");
        Snackbar make = Snackbar.make(view, (CharSequence) str, i);
        Intrinsics.checkNotNullExpressionValue(make, "make(view, msg, length)");
        if (charSequence != null) {
            make.setAction(charSequence, (View.OnClickListener) new BaseFragment$$ExternalSyntheticLambda0(function1, view)).show();
        } else {
            make.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showSnackbar$lambda-0  reason: not valid java name */
    public static final void m3405showSnackbar$lambda0(Function1 function1, View view, View view2) {
        Intrinsics.checkNotNullParameter(function1, "$action");
        Intrinsics.checkNotNullParameter(view, "$view");
        function1.invoke(view);
    }

    public final Toast getToast() {
        return this.toast;
    }

    public final void setToast(Toast toast2) {
        this.toast = toast2;
    }

    public final void showToast(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, NotificationCompat.CATEGORY_MESSAGE);
        Toast toast2 = this.toast;
        if (toast2 != null) {
            Intrinsics.checkNotNull(toast2);
            toast2.cancel();
        }
        Toast makeText = Toast.makeText(requireActivity(), charSequence.toString(), 0);
        this.toast = makeText;
        Intrinsics.checkNotNull(makeText);
        makeText.show();
    }

    private final void errorDialog(String str) {
        Dialog dialog = new Dialog(requireContext());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.error_dialog);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvYes);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvNo);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(C1188R.C1192id.tvTitle);
                if (findViewById3 != null) {
                    TextView textView3 = (TextView) findViewById3;
                    View findViewById4 = dialog.findViewById(C1188R.C1192id.tvbodyy);
                    if (findViewById4 != null) {
                        textView3.setText(getString(C1188R.string.oops));
                        ((TextView) findViewById4).setText(str);
                        Window window = dialog.getWindow();
                        Intrinsics.checkNotNull(window);
                        window.setBackgroundDrawableResource(17170445);
                        window.setLayout(-1, -2);
                        textView.setOnClickListener(new BaseFragment$$ExternalSyntheticLambda1(this, dialog));
                        textView2.setOnClickListener(new BaseFragment$$ExternalSyntheticLambda2(dialog));
                        dialog.show();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: errorDialog$lambda-1  reason: not valid java name */
    public static final void m3403errorDialog$lambda1(BaseFragment baseFragment, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(baseFragment, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Messaging messaging = Zendesk.Companion.getInstance().getMessaging();
        Context requireContext = baseFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        messaging.showMessaging(requireContext);
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: errorDialog$lambda-2  reason: not valid java name */
    public static final void m3404errorDialog$lambda2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public final String handleApiError(Activity activity, AppError appError) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Log.v("ERROR:: ", new Gson().toJson((Object) appError));
        if (appError instanceof AppError.ApiError) {
            AppError.ApiError apiError = (AppError.ApiError) appError;
            if (Intrinsics.areEqual((Object) apiError.getStatusCode(), (Object) "401")) {
                Intent intent = new Intent(activity, IntroductoryActivity.class);
                intent.putExtra("open", FirebaseAnalytics.Event.LOGIN);
                activity.startActivity(intent);
            }
            if (apiError.getMessage().length() > 0) {
                String message = apiError.getMessage();
                ExtensionsKt.showToast((Context) activity, (CharSequence) apiError.getMessage());
                return message;
            }
            String string = activity.getString(C1188R.string.something_went_wrong);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.something_went_wrong)");
            ExtensionsKt.showToast((Context) activity, (CharSequence) string);
        } else if (appError instanceof AppError.ApiFailure) {
            String string2 = activity.getString(C1188R.string.could_not_connect_to_server);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.could_not_connect_to_server)");
            String string3 = activity.getString(C1188R.string.could_not_connect_to_server);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.could_not_connect_to_server)");
            ExtensionsKt.showToast((Context) activity, (CharSequence) string3);
            return string2;
        } else if (appError instanceof AppError.ApiUnAuthorized) {
            Context context = activity;
            AppError.ApiUnAuthorized apiUnAuthorized = (AppError.ApiUnAuthorized) appError;
            ExtensionsKt.showToast(context, (CharSequence) apiUnAuthorized.getMessage());
            String message2 = apiUnAuthorized.getMessage();
            Intent intent2 = new Intent(context, IntroductoryActivity.class);
            intent2.putExtra("open", FirebaseAnalytics.Event.LOGIN);
            activity.startActivity(intent2);
            return message2;
        }
        return "";
    }

    public final String handleApiErrorDialog(Activity activity, AppError appError) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Log.v("ERROR:: ", new Gson().toJson((Object) appError));
        if (appError instanceof AppError.ApiError) {
            AppError.ApiError apiError = (AppError.ApiError) appError;
            if (Intrinsics.areEqual((Object) apiError.getStatusCode(), (Object) "401")) {
                Intent intent = new Intent(activity, IntroductoryActivity.class);
                intent.putExtra("open", FirebaseAnalytics.Event.LOGIN);
                activity.startActivity(intent);
            }
            if (apiError.getMessage().length() > 0) {
                String message = apiError.getMessage();
                errorDialog(message);
                return message;
            }
            String string = activity.getString(C1188R.string.something_went_wrong);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.something_went_wrong)");
            ExtensionsKt.showToast((Context) activity, (CharSequence) string);
        } else if (appError instanceof AppError.ApiFailure) {
            String string2 = activity.getString(C1188R.string.could_not_connect_to_server);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.could_not_connect_to_server)");
            String string3 = activity.getString(C1188R.string.could_not_connect_to_server);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.could_not_connect_to_server)");
            ExtensionsKt.showToast((Context) activity, (CharSequence) string3);
            return string2;
        } else if (appError instanceof AppError.ApiUnAuthorized) {
            Context context = activity;
            AppError.ApiUnAuthorized apiUnAuthorized = (AppError.ApiUnAuthorized) appError;
            ExtensionsKt.showToast(context, (CharSequence) apiUnAuthorized.getMessage());
            String message2 = apiUnAuthorized.getMessage();
            Intent intent2 = new Intent(context, IntroductoryActivity.class);
            intent2.putExtra("open", FirebaseAnalytics.Event.LOGIN);
            activity.startActivity(intent2);
            return message2;
        }
        return "";
    }

    public static /* synthetic */ void replaceFragment$default(BaseFragment baseFragment, Fragment fragment, boolean z, int i, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = true;
            }
            baseFragment.replaceFragment(fragment, z, i);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: replaceFragment");
    }

    public final void replaceFragment(Fragment fragment, boolean z, int i) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        String simpleName = fragment.getClass().getSimpleName();
        FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "requireActivity().supportFragmentManager");
        boolean popBackStackImmediate = supportFragmentManager.popBackStackImmediate(simpleName, 0);
        Fragment findFragmentByTag = requireActivity().getSupportFragmentManager().findFragmentByTag(simpleName);
        if (findFragmentByTag == null || (!popBackStackImmediate && !findFragmentByTag.isVisible())) {
            FragmentTransaction beginTransaction = requireActivity().getSupportFragmentManager().beginTransaction();
            Intrinsics.checkNotNullExpressionValue(beginTransaction, "requireActivity().suppor…anager.beginTransaction()");
            beginTransaction.replace(i, fragment, simpleName);
            if (z) {
                beginTransaction.addToBackStack(simpleName);
            }
            beginTransaction.commit();
        }
    }
}
