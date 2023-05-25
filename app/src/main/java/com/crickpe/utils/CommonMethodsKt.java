package com.crickpe.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.MimeTypeMap;
import android.widget.DatePicker;
import android.widget.TextView;
import androidx.autofill.HintConstants;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.amplitude.core.events.Identify;
import com.appsflyer.AppsFlyerLib;
import com.bumptech.glide.load.Key;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.microsoft.appcenter.crashes.ingestion.models.ErrorAttachmentLog;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import java.math.RoundingMode;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import zendesk.messaging.android.internal.conversationscreen.TimeConstants;

@Metadata(mo48221d1 = {"\u0000¶\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r\u001a \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002\u001a&\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r\u001a\u0010\u0010\u001b\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u001d\u001a\u0018\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0007\u001a\u000e\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#\u001a\u000e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0001\u001a\u000e\u0010&\u001a\u00020\r2\u0006\u0010'\u001a\u00020\r\u001a\u000e\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020#\u001a\u000e\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,\u001a#\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0.2\u0006\u0010/\u001a\u0002002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u00101\u001a\u0010\u00102\u001a\u0004\u0018\u00010\r2\u0006\u00103\u001a\u00020#\u001a\u000e\u00104\u001a\u00020\u00012\u0006\u0010+\u001a\u00020,\u001a\u0018\u00105\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u00106\u001a\u0004\u0018\u000107\u001a\u0010\u00108\u001a\u0002002\u0006\u00109\u001a\u00020\rH\u0002\u001a\u000e\u0010:\u001a\u0002002\u0006\u0010;\u001a\u00020\r\u001a\u001a\u0010<\u001a\u0004\u0018\u00010\r2\u0006\u0010=\u001a\u00020\r2\u0006\u0010>\u001a\u00020\rH\u0007\u001a\u000e\u0010?\u001a\u00020\r2\u0006\u0010@\u001a\u00020A\u001a\u0010\u0010B\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010,\u001a\"\u0010C\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010D\u001a\u00020E2\b\u00106\u001a\u0004\u0018\u000107\u001a\u000e\u0010F\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r\u001a\u000e\u0010H\u001a\u00020\r2\u0006\u0010G\u001a\u00020\r\u001a\u000e\u0010I\u001a\u00020\r2\u0006\u0010@\u001a\u00020A\u001a\u0016\u0010J\u001a\u00020\u00102\u0006\u0010K\u001a\u00020L2\u0006\u0010@\u001a\u00020A\u001a\u0016\u0010M\u001a\u00020\u00102\u0006\u0010K\u001a\u00020L2\u0006\u0010@\u001a\u00020A\u001a\u0016\u0010N\u001a\u00020\u00102\u0006\u0010K\u001a\u00020L2\u0006\u0010@\u001a\u00020A\u001a\n\u0010O\u001a\u00020\r*\u00020\r\u001a\n\u0010P\u001a\u00020\r*\u00020\r\u001a\u0012\u0010Q\u001a\u00020\u0010*\u00020\u00142\u0006\u0010R\u001a\u00020\r\u001a[\u0010S\u001a\u00020T\"\u0004\b\u0000\u0010U*\u00020V2\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00100X2\u0012\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0X2'\u0010Z\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020 0\u001f¢\u0006\f\b\\\u0012\b\bG\u0012\u0004\b\b(]\u0012\u0004\u0012\u0002HU0[\u001a\u0012\u0010^\u001a\u00020\u0001*\u00020\u00142\u0006\u0010_\u001a\u00020\u001d\u001a\n\u0010`\u001a\u00020\u0010*\u000207\u001a\u0012\u0010a\u001a\u000207*\u00020b2\u0006\u0010c\u001a\u00020\u0001\u001a\n\u0010d\u001a\u00020\u0010*\u000207\u001a\u0012\u0010e\u001a\u00020\u0010*\u00020\u00142\u0006\u0010f\u001a\u00020\r\u001a,\u0010g\u001a\u00020\u0010*\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010c\u001a\u00020\u00012\u0006\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u000200\u001a,\u0010m\u001a\u00020\u0010*\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010c\u001a\u00020\u00012\u0006\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u000200\u001a\u0012\u0010n\u001a\u00020\u0010*\u00020\u00142\u0006\u0010f\u001a\u00020\r\u001a,\u0010o\u001a\u00020\u0010*\u00020h2\u0006\u0010i\u001a\u00020j2\u0006\u0010c\u001a\u00020\u00012\u0006\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u000200\u001a\u0012\u0010p\u001a\u00020\u0010*\u00020\u00142\u0006\u00109\u001a\u00020\r\u001a\u0012\u0010q\u001a\u00020\u0010*\u00020\u00142\u0006\u0010r\u001a\u00020\r\u001a\f\u0010s\u001a\u0004\u0018\u00010\r*\u00020#\u001a\n\u0010t\u001a\u00020\u0010*\u000207\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000\"\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006u"}, mo48222d2 = {"DAY_MILLIS", "", "HOUR_MILLIS", "MINUTE_MILLIS", "SECOND_MILLIS", "SWIPE_THRESHOLD", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "getSimpleDateFormat", "()Ljava/text/SimpleDateFormat;", "setSimpleDateFormat", "(Ljava/text/SimpleDateFormat;)V", "UpperCase", "", "str", "alertDialog", "", "title", "body", "context", "Landroid/content/Context;", "callAppsFlyer", "requireActivity", "Landroidx/fragment/app/FragmentActivity;", "id", "eventIdName", "eventName", "currencyFormatter", "amount", "", "getContactList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "getDateString", "time", "", "getEmoji", "unicode", "getExtension", "fileName", "getFormattedDateFromTimestamp", "timestampInMilliSeconds", "getHeight", "activity", "Landroid/app/Activity;", "getImagePickerOptions", "", "boolean", "", "(ZLandroid/content/Context;)[Ljava/lang/String;", "getTimeAgo", "timeF", "getWidth", "hideKeyboard", "view", "Landroid/view/View;", "isValidEmail", "email", "isValidPasswordFormat", "password", "modifyDateLayout", "strDate", "stringFormat", "numDifferentiation", "value", "", "openSettingDialog", "pickDateBoth", "listener", "Lcom/crickpe/utils/DateSelectorListener;", "printInitialOnly", "name", "printInitials", "setFormat", "setNumberWithDecimal", "textView", "Landroid/widget/TextView;", "setNumberWithoutDec", "setNumberWithoutDecimal", "capitalize", "capitalizeWords", "dialPhone", "phoneNumber", "executeAsyncTask", "Lkotlinx/coroutines/Job;", "R", "Lkotlinx/coroutines/CoroutineScope;", "onPreExecute", "Lkotlin/Function0;", "doInBackground", "onPostExecute", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "result", "getInDP", "sizeInDP", "hide", "inflate", "Landroid/view/ViewGroup;", "containerId", "invisible", "openBrowser", "url", "openFragment", "Landroidx/fragment/app/FragmentManager;", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "addToBackStack", "openFragmentWithoutAnim", "openUrl", "replace", "sendEmail", "shareLink", "msg", "timeAgo", "visible", "app_release"}, mo48223k = 2, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CommonMethods.kt */
public final class CommonMethodsKt {
    private static final int DAY_MILLIS = 86400000;
    private static final int HOUR_MILLIS = 3600000;
    private static final int MINUTE_MILLIS = 60000;
    private static final int SECOND_MILLIS = 1000;
    public static final int SWIPE_THRESHOLD = 100;
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM, yyyy", Locale.ENGLISH);

    public static final String UpperCase(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        return str;
    }

    public static final <R> Job executeAsyncTask(CoroutineScope coroutineScope, Function0<Unit> function0, Function0<? extends ArrayList<ContactRequest>> function02, Function1<? super ArrayList<ContactRequest>, ? extends R> function1) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(function0, "onPreExecute");
        Intrinsics.checkNotNullParameter(function02, "doInBackground");
        Intrinsics.checkNotNullParameter(function1, "onPostExecute");
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CommonMethodsKt$executeAsyncTask$1(function0, function1, function02, (Continuation<? super CommonMethodsKt$executeAsyncTask$1>) null), 3, (Object) null);
    }

    public static final void setNumberWithoutDec(TextView textView, double d) {
        String str;
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            double abs = Math.abs(d);
            if (abs >= 1.0E7d) {
                abs /= (double) 10000000;
                str = "Cr";
            } else if (abs >= 100000.0d) {
                abs /= (double) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
                str = "Lakh";
            } else {
                str = " ";
            }
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(abs);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
            textView.setText(8377 + format + str);
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    public static final String setFormat(double d) {
        try {
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(d);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(value)");
            return format;
        } catch (Exception e) {
            Log.v("setFormattt", e.toString());
            return "";
        }
    }

    public static final SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }

    public static final void setSimpleDateFormat(SimpleDateFormat simpleDateFormat2) {
        Intrinsics.checkNotNullParameter(simpleDateFormat2, "<set-?>");
        simpleDateFormat = simpleDateFormat2;
    }

    public static final String getDateString(long j) {
        String format = simpleDateFormat.format(Long.valueOf(j * 1000));
        Intrinsics.checkNotNullExpressionValue(format, "simpleDateFormat.format(time * 1000L)");
        return format;
    }

    public static final boolean isValidPasswordFormat(String str) {
        Intrinsics.checkNotNullParameter(str, HintConstants.AUTOFILL_HINT_PASSWORD);
        return Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z])(?=.*[.@#$%^&+=])(?=\\S+$).{8,}$").matcher(str).matches();
    }

    public static final String[] getImagePickerOptions(boolean z, Context context) {
        Intrinsics.checkNotNull(context);
        String[] strArr = {context.getString(C1188R.string.image_utils_dialog_camera), context.getString(C1188R.string.image_utils_dialog_gallery), context.getString(17039360)};
        if (!z) {
            return strArr;
        }
        return new String[]{context.getString(C1188R.string.image_utils_dialog_camera), context.getString(C1188R.string.image_utils_dialog_gallery), context.getString(C1188R.string.choose_avatar), context.getString(17039360)};
    }

    public static final ArrayList<ContactRequest> getContactList(Context context) {
        ArrayList<ContactRequest> arrayList = new ArrayList<>();
        ContentResolver contentResolver = context != null ? context.getContentResolver() : null;
        Intrinsics.checkNotNull(contentResolver);
        Cursor query = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, (String[]) null, (String) null, (String[]) null, (String) null);
        if ((query != null ? query.getCount() : 0) > 0) {
            while (query != null && query.moveToNext()) {
                String string = query.getString(query.getColumnIndex("_id"));
                Intrinsics.checkNotNullExpressionValue(string, "cur.getString(\n         …ntacts._ID)\n            )");
                String string2 = query.getString(query.getColumnIndex("display_name"));
                if (query.getInt(query.getColumnIndex("has_phone_number")) > 0) {
                    Cursor query2 = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, (String[]) null, "contact_id = ?", new String[]{string}, (String) null);
                    while (true) {
                        if (!(query2 != null && query2.moveToNext())) {
                            break;
                        }
                        String string3 = query2.getString(query2.getColumnIndex("data1"));
                        Intrinsics.checkNotNullExpressionValue(string3, "pCur.getString(\n        …  )\n                    )");
                        arrayList.add(new ContactRequest(string2 == null ? "N/A" : string2, StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(StringsKt.replace$default(string3, Identify.UNSET_VALUE, "", false, 4, (Object) null), "(", "", false, 4, (Object) null), ")", "", false, 4, (Object) null), " ", "", false, 4, (Object) null), false));
                    }
                    if (query2 != null) {
                        query2.close();
                    }
                }
            }
        }
        if (query != null) {
            query.close();
        }
        return arrayList;
    }

    public static final int getHeight(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = activity.getDisplay();
            if (display != null) {
                display.getRealMetrics(displayMetrics);
            }
        } else {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        return getInDP(activity, (float) displayMetrics.heightPixels);
    }

    public static final View inflate(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "from(context).inflate(containerId, this, false)");
        return inflate;
    }

    public static final int getWidth(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (Build.VERSION.SDK_INT >= 30) {
            Display display = activity.getDisplay();
            if (display != null) {
                display.getRealMetrics(displayMetrics);
            }
        } else {
            activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        }
        return getInDP(activity, (float) displayMetrics.widthPixels);
    }

    public static final String getExtension(String str) {
        Intrinsics.checkNotNullParameter(str, "fileName");
        try {
            String encode = URLEncoder.encode(str, Key.STRING_CHARSET_NAME);
            Intrinsics.checkNotNullExpressionValue(encode, "encode(fileName, \"UTF-8\")");
            str = StringsKt.replace$default(encode, "+", "%20", false, 4, (Object) null);
        } catch (Exception unused) {
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        Intrinsics.checkNotNullExpressionValue(fileExtensionFromUrl, "getFileExtensionFromUrl(encoded)");
        String lowerCase = fileExtensionFromUrl.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        return lowerCase;
    }

    public static final void openSettingDialog(Activity activity) {
        if (activity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setMessage(C1188R.string.denied_permission).setCancelable(false).setPositiveButton(C1188R.string.goto_settings, new CommonMethodsKt$$ExternalSyntheticLambda0(activity)).setNegativeButton(activity.getString(C1188R.string.cancel), new CommonMethodsKt$$ExternalSyntheticLambda1());
            builder.create().show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: openSettingDialog$lambda-0  reason: not valid java name */
    public static final void m3411openSettingDialog$lambda0(Activity activity, DialogInterface dialogInterface, int i) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", activity.getPackageName(), (String) null));
        activity.startActivityForResult(intent, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: openSettingDialog$lambda-1  reason: not valid java name */
    public static final void m3412openSettingDialog$lambda1(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private static final void alertDialog(String str, String str2, Context context) {
        Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_kyc_alert);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvBody);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvTitle);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(C1188R.C1192id.tvNo);
                if (findViewById3 != null) {
                    textView2.setText(str);
                    textView.setText(str2);
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    window.setBackgroundDrawableResource(17170445);
                    window.setLayout(-1, -2);
                    ((TextView) findViewById3).setOnClickListener(new CommonMethodsKt$$ExternalSyntheticLambda2(dialog));
                    dialog.show();
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: alertDialog$lambda-2  reason: not valid java name */
    public static final void m3410alertDialog$lambda2(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    public static final void setNumberWithoutDecimal(TextView textView, double d) {
        String str;
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            double abs = Math.abs(d);
            if (abs >= 1.0E7d) {
                abs /= (double) 10000000;
                str = " Crore";
            } else if (abs >= 100000.0d) {
                abs /= (double) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
                str = " Lakhs";
            } else {
                str = " ";
            }
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(abs);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
            textView.setText(8377 + format + str);
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    public static final String printInitials(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        try {
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
        } catch (Exception unused) {
            return str;
        }
    }

    public static final String printInitialOnly(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        Object[] array = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return ((String[]) array)[0];
    }

    public static final void setNumberWithDecimal(TextView textView, double d) {
        String str;
        Intrinsics.checkNotNullParameter(textView, "textView");
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
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###.##");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(abs);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
            textView.setText(8377 + format + str);
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    public static final String timeAgo(long j) {
        return getTimeAgo(j);
    }

    public static final String getFormattedDateFromTimestamp(long j) {
        TimeZone timeZone = TimeZone.getDefault();
        return String.valueOf(getTimeAgo(new Date(j - ((long) timeZone.getOffset(GregorianCalendar.getInstance(timeZone).getTimeInMillis()))).getTime()));
    }

    public static final String getTimeAgo(long j) {
        long j2 = j < 1000000000000L ? ((long) 1000) * j : j;
        long currentTimeMillis = System.currentTimeMillis();
        long j3 = (j2 > currentTimeMillis || j2 <= 0) ? j2 - currentTimeMillis : currentTimeMillis - j2;
        if (j3 < TimeConstants.ONE_MINUTE_DIFFERENCE) {
            return "just now";
        }
        if (j3 < 120000) {
            return "a minute ago";
        }
        if (j3 < 3000000) {
            return (j3 / ((long) MINUTE_MILLIS)) + " minutes ago";
        } else if (j3 < 5400000) {
            return "an hour ago";
        } else {
            if (j3 < 86400000) {
                return (j3 / ((long) HOUR_MILLIS)) + " hours ago";
            } else if (j3 < 172800000) {
                return "yesterday";
            } else {
                return String.valueOf(new SimpleDateFormat("MMM d, yyyy").format(Long.valueOf(j)));
            }
        }
    }

    public static final String currencyFormatter(float f) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        Intrinsics.checkNotNullExpressionValue(currencyInstance, "getCurrencyInstance(Locale(\"en\", \"IN\"))");
        return currencyInstance.format(Float.valueOf(f));
    }

    public static final String numDifferentiation(double d) {
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
                return str2 + str;
            }
        } catch (Exception e2) {
            e = e2;
            str = str2;
            Log.v("numDifferentiation", e.toString());
            return str2 + str;
        }
        return str2 + str;
    }

    public static final int getInDP(Context context, float f) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static final void openBrowser(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, ImagesContract.URL);
        try {
            if (!StringsKt.startsWith$default(str, "https://", false, 2, (Object) null) && !StringsKt.startsWith$default(str, "http://", false, 2, (Object) null)) {
                str = "http://" + str;
            }
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void openFragment$default(FragmentManager fragmentManager, Fragment fragment, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        openFragment(fragmentManager, fragment, i, str, z);
    }

    public static final void openFragment(FragmentManager fragmentManager, Fragment fragment, int i, String str, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "tag");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        beginTransaction.setCustomAnimations(C1188R.anim.slide_in_right, C1188R.anim.slide_out_left, C1188R.anim.slide_in_left, C1188R.anim.slide_out_right);
        beginTransaction.add(i, fragment, str);
        if (z) {
            beginTransaction.addToBackStack(str);
        }
        beginTransaction.commit();
    }

    public static final String getEmoji(int i) {
        char[] chars = Character.toChars(i);
        Intrinsics.checkNotNullExpressionValue(chars, "toChars(unicode)");
        return new String(chars);
    }

    public static /* synthetic */ void openFragmentWithoutAnim$default(FragmentManager fragmentManager, Fragment fragment, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        openFragmentWithoutAnim(fragmentManager, fragment, i, str, z);
    }

    public static final void openFragmentWithoutAnim(FragmentManager fragmentManager, Fragment fragment, int i, String str, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "tag");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        beginTransaction.add(i, fragment, str);
        if (z) {
            beginTransaction.addToBackStack(str);
        }
        beginTransaction.commit();
    }

    public static /* synthetic */ void replace$default(FragmentManager fragmentManager, Fragment fragment, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        replace(fragmentManager, fragment, i, str, z);
    }

    public static final void replace(FragmentManager fragmentManager, Fragment fragment, int i, String str, boolean z) {
        Intrinsics.checkNotNullParameter(fragmentManager, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(str, "tag");
        FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(beginTransaction, "beginTransaction()");
        beginTransaction.replace(i, fragment, str);
        if (z) {
            beginTransaction.addToBackStack(str);
        }
        beginTransaction.commit();
    }

    public static final void hide(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public static final void visible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public static final void invisible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    public static final void hideKeyboard(Context context, View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(view != null ? view.getWindowToken() : null, 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    public static final void openUrl(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, ImagesContract.URL);
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e) {
            Log.v("exp", e.toString());
        }
    }

    public static final String capitalize(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(str.length() > 0) || str.length() <= 1) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        String upperCase = substring.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        sb.append(upperCase);
        String substring2 = str.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "this as java.lang.String).substring(startIndex)");
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault()");
        String lowerCase = substring2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        sb.append(lowerCase);
        return sb.toString();
    }

    public static final String capitalizeWords(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Iterable<String> split$default = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null);
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(split$default, 10));
        for (String lowerCase : split$default) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String lowerCase2 = lowerCase.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            arrayList.add(capitalize(lowerCase2));
        }
        return CollectionsKt.joinToString$default((List) arrayList, " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public static final void sendEmail(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, "email");
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:" + str));
        context.startActivity(intent);
    }

    private static final boolean isValidEmail(String str) {
        Pattern compile = Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        Intrinsics.checkNotNullExpressionValue(compile, "EMAIL_ADDRESS");
        return compile.matcher(str).matches();
    }

    public static final void dialPhone(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, HintConstants.AUTOFILL_HINT_PHONE_NUMBER);
        try {
            context.startActivity(new Intent("android.intent.action.DIAL", Uri.fromParts("tel", str, (String) null)));
        } catch (Exception e) {
            Log.v("exp", e.toString());
        }
    }

    public static final void callAppsFlyer(FragmentActivity fragmentActivity, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "requireActivity");
        Intrinsics.checkNotNullParameter(str, CommonProperties.f597ID);
        Intrinsics.checkNotNullParameter(str2, "eventIdName");
        Intrinsics.checkNotNullParameter(str3, "eventName");
        HashMap hashMap = new HashMap();
        if (!Intrinsics.areEqual((Object) str2, (Object) "")) {
            hashMap.put(str2, str);
        }
        AppsFlyerLib.getInstance().logEvent(fragmentActivity.getApplicationContext(), str3, hashMap, new CommonMethodsKt$callAppsFlyer$1());
    }

    public static final void shareLink(Context context, String str) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType(ErrorAttachmentLog.CONTENT_TYPE_TEXT_PLAIN);
            context.startActivity(intent.addFlags(536870912));
        } catch (Exception unused) {
        }
    }

    public static final void pickDateBoth(Context context, DateSelectorListener dateSelectorListener, View view) {
        Intrinsics.checkNotNullParameter(dateSelectorListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        Calendar instance = Calendar.getInstance(TimeZone.getDefault());
        Intrinsics.checkNotNull(context);
        DatePickerDialog datePickerDialog = new DatePickerDialog(context, new CommonMethodsKt$$ExternalSyntheticLambda3(dateSelectorListener, view), instance.get(1), instance.get(2), instance.get(5));
        datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis() - Constants.INSTANCE.getMILIS_18_Y());
        datePickerDialog.show();
    }

    /* access modifiers changed from: private */
    /* renamed from: pickDateBoth$lambda-4  reason: not valid java name */
    public static final void m3413pickDateBoth$lambda4(DateSelectorListener dateSelectorListener, View view, DatePicker datePicker, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(dateSelectorListener, "$listener");
        String valueOf = String.valueOf(i3);
        int i4 = i2 + 1;
        String valueOf2 = String.valueOf(i4);
        if (i3 < 10) {
            valueOf = '0' + valueOf;
        }
        if (i4 < 10) {
            valueOf2 = '0' + valueOf2;
        }
        dateSelectorListener.onDateSelected(valueOf + '-' + valueOf2 + '-' + i, view);
    }

    public static final String modifyDateLayout(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "strDate");
        Intrinsics.checkNotNullParameter(str2, "stringFormat");
        String replace$default = StringsKt.replace$default(StringsKt.replace$default(str, ExifInterface.GPS_DIRECTION_TRUE, " ", false, 4, (Object) null), "Z", "", false, 4, (Object) null);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        try {
            Date parse = simpleDateFormat2.parse(replace$default);
            Intrinsics.checkNotNullExpressionValue(parse, "oldFormatter.parse(inputDate)");
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(str2);
            simpleDateFormat3.setTimeZone(TimeZone.getDefault());
            String format = simpleDateFormat3.format(parse);
            Intrinsics.checkNotNullExpressionValue(format, "newFormatter.format(value)");
            return format;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
