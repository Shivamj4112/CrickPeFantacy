package com.crickpe.utils;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.autofill.HintConstants;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n¨\u0006\u000e"}, mo48222d2 = {"Lcom/crickpe/utils/ValidatorUtils;", "", "()V", "hideSoftKeyboard", "", "activity", "Landroid/app/Activity;", "isEmailValid", "", "string", "", "isMobileValid", "validPassword", "password", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ValidatorUtils.kt */
public final class ValidatorUtils {
    public static final ValidatorUtils INSTANCE = new ValidatorUtils();

    private ValidatorUtils() {
    }

    public final boolean validPassword(String str) {
        Intrinsics.checkNotNullParameter(str, HintConstants.AUTOFILL_HINT_PASSWORD);
        Pattern compile = Pattern.compile("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@*#$%^&+=!])(?=\\S+$).{4,}$");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(passwordPattern)");
        Matcher matcher = compile.matcher(str);
        Intrinsics.checkNotNullExpressionValue(matcher, "pattern.matcher(password)");
        return matcher.matches();
    }

    public final boolean isEmailValid(String str) {
        Intrinsics.checkNotNullParameter(str, "string");
        return Pattern.compile("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z]{2,5})+").matcher(StringsKt.trim((CharSequence) str).toString()).matches();
    }

    public final boolean isMobileValid(String str) {
        Intrinsics.checkNotNullParameter(str, "string");
        return Pattern.compile("([0-9]{7,15})").matcher(StringsKt.trim((CharSequence) str).toString()).matches();
    }

    public final void hideSoftKeyboard(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Object systemService = activity.getSystemService("input_method");
        if (systemService != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }
}
