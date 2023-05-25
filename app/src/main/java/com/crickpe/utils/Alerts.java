package com.crickpe.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.crickpe.C1188R;
import com.crickpe.databinding.ProgressLayoutBinding;
import com.crickpe.view.ApplicationActivity;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tJ+\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000eJ(\u0010\u000f\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J(\u0010\u0013\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\u0014\u001a\u00020\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/utils/Alerts;", "", "()V", "customDialog", "Landroid/app/AlertDialog;", "hideProgress", "", "sessionExpired", "message", "", "showLog", "isShown", "", "title", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "showMessage", "actionText", "listener", "Landroid/view/View$OnClickListener;", "showMessage2", "showProgress", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Alerts.kt */
public final class Alerts {
    public static final Alerts INSTANCE = new Alerts();
    private static AlertDialog customDialog;

    private Alerts() {
    }

    public static /* synthetic */ void sessionExpired$default(Alerts alerts, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        alerts.sessionExpired(str);
    }

    public final void sessionExpired(String str) {
        try {
            Context context = (Context) ApplicationActivity.Companion.getContext().get();
            if (context != null) {
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                if (str == null) {
                    builder.setTitle(context.getString(C1188R.string.session_expired));
                } else {
                    builder.setTitle(str);
                }
                builder.setCancelable(false);
                builder.setPositiveButton(context.getString(C1188R.string.f427ok), new Alerts$$ExternalSyntheticLambda0(context));
                builder.create();
                builder.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sessionExpired$lambda-2$lambda-1  reason: not valid java name */
    public static final void m3408sessionExpired$lambda2$lambda1(Context context, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(context, "$ctx");
        dialogInterface.dismiss();
        Intent intent = new Intent(context, ApplicationActivity.class);
        Bundle bundle = new Bundle();
        bundle.putBoolean("clear", true);
        Unit unit = Unit.INSTANCE;
        context.startActivity(intent.putExtra("data", bundle));
    }

    public static /* synthetic */ void showMessage$default(Alerts alerts, String str, String str2, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            onClickListener = null;
        }
        alerts.showMessage(str, str2, onClickListener);
    }

    public final void showMessage(String str, String str2, View.OnClickListener onClickListener) {
        CharSequence charSequence = str;
        boolean z = false;
        if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
            Object obj = ApplicationActivity.Companion.getContext().get();
            if (obj != null) {
                Snackbar make = Snackbar.make(((Activity) obj).findViewById(16908290), charSequence, -1);
                Intrinsics.checkNotNullExpressionValue(make, "make(\n            (Appli…ar.LENGTH_SHORT\n        )");
                CharSequence charSequence2 = str2;
                if (charSequence2 == null || StringsKt.isBlank(charSequence2)) {
                    z = true;
                }
                if (!z && onClickListener != null) {
                    make.setAction(charSequence2, onClickListener);
                }
                make.show();
                make.getDuration();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public static /* synthetic */ void showMessage2$default(Alerts alerts, String str, String str2, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            onClickListener = null;
        }
        alerts.showMessage2(str, str2, onClickListener);
    }

    public final void showMessage2(String str, String str2, View.OnClickListener onClickListener) {
        CharSequence charSequence = str;
        boolean z = false;
        if (!(charSequence == null || StringsKt.isBlank(charSequence))) {
            Object obj = ApplicationActivity.Companion.getContext().get();
            if (obj != null) {
                Snackbar make = Snackbar.make(((Activity) obj).findViewById(16908290), charSequence, -1);
                Intrinsics.checkNotNullExpressionValue(make, "make(\n            (Appli…ar.LENGTH_SHORT\n        )");
                CharSequence charSequence2 = str2;
                if (charSequence2 == null || StringsKt.isBlank(charSequence2)) {
                    z = true;
                }
                if (!z && onClickListener != null) {
                    make.setAction(charSequence2, onClickListener);
                }
                make.show();
                make.getDuration();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
        }
    }

    public final void showProgress() {
        Window window;
        hideProgress();
        AlertDialog.Builder builder = new AlertDialog.Builder((Context) ApplicationActivity.Companion.getContext().get());
        ProgressLayoutBinding inflate = ProgressLayoutBinding.inflate(LayoutInflater.from((Context) ApplicationActivity.Companion.getContext().get()), (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n               …      false\n            )");
        builder.setView(inflate.getRoot());
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        customDialog = create;
        if (!(create == null || (window = create.getWindow()) == null)) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        AlertDialog alertDialog = customDialog;
        if (alertDialog != null) {
            alertDialog.show();
        }
    }

    public final void hideProgress() {
        AlertDialog alertDialog;
        AlertDialog alertDialog2 = customDialog;
        if (alertDialog2 != null) {
            boolean z = true;
            if (alertDialog2 == null || !alertDialog2.isShowing()) {
                z = false;
            }
            if (z && (alertDialog = customDialog) != null) {
                alertDialog.dismiss();
            }
        }
    }

    public static /* synthetic */ void showLog$default(Alerts alerts, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = true;
        }
        alerts.showLog(bool, str, str2);
    }

    public final void showLog(Boolean bool, String str, String str2) {
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            Log.v("TAG", str2 + ": " + str);
        }
    }
}
