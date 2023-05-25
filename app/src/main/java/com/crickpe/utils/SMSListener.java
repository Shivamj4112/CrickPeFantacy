package com.crickpe.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import com.crickpe.utils.Common;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

@Metadata(mo48221d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/utils/SMSListener;", "Landroid/content/BroadcastReceiver;", "()V", "abcd", "", "getAbcd", "()Ljava/lang/String;", "setAbcd", "(Ljava/lang/String;)V", "b", "", "getB", "()Ljava/lang/Boolean;", "setB", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "Companion", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SMSListener.kt */
public final class SMSListener extends BroadcastReceiver {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static Common.OTPListener mListener;
    private String abcd = "";

    /* renamed from: b */
    private Boolean f462b;

    public final Boolean getB() {
        return this.f462b;
    }

    public final void setB(Boolean bool) {
        this.f462b = bool;
    }

    public final String getAbcd() {
        return this.abcd;
    }

    public final void setAbcd(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.abcd = str;
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle extras = intent.getExtras();
        Intrinsics.checkNotNull(extras);
        Object[] objArr = (Object[]) extras.get("pdus");
        Intrinsics.checkNotNull(objArr);
        for (Object obj : objArr) {
            String messageBody = SmsMessage.createFromPdu((byte[]) obj).getMessageBody();
            Intrinsics.checkNotNullExpressionValue(messageBody, "messageBody");
            this.abcd = new Regex("[^0-9]").replace((CharSequence) messageBody, "");
        }
    }

    @Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/utils/SMSListener$Companion;", "", "()V", "mListener", "Lcom/crickpe/utils/Common$OTPListener;", "bindListener", "", "listener", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SMSListener.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void bindListener(Common.OTPListener oTPListener) {
            SMSListener.mListener = oTPListener;
        }
    }
}
