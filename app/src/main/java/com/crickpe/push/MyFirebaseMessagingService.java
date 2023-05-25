package com.crickpe.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.crickpe.C1188R;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0017J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\"\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0004H\u0003R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/push/MyFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "matchId", "", "getMatchId", "()Ljava/lang/String;", "setMatchId", "(Ljava/lang/String;)V", "referalCode", "getReferalCode", "setReferalCode", "handleIntent", "", "intent", "Landroid/content/Intent;", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "sendNotification", "title", "messageBody", "open", "Companion", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyFirebaseMessagingService.kt */
public final class MyFirebaseMessagingService extends FirebaseMessagingService {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = " FirebaseMessaging";
    private static int count;
    private String matchId = "";
    private String referalCode = "";

    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
    }

    public final String getReferalCode() {
        return this.referalCode;
    }

    public final void setReferalCode(String str) {
        this.referalCode = str;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        this.matchId = str;
    }

    public void handleIntent(Intent intent) {
        try {
            Intrinsics.checkNotNull(intent);
            if (intent.getExtras() != null) {
                RemoteMessage.Builder builder = new RemoteMessage.Builder("MessagingService");
                Bundle extras = intent.getExtras();
                Intrinsics.checkNotNull(extras);
                for (String str : extras.keySet()) {
                    Intrinsics.checkNotNull(str);
                    Bundle extras2 = intent.getExtras();
                    Intrinsics.checkNotNull(extras2);
                    builder.addData(str, String.valueOf(extras2.get(str)));
                }
                RemoteMessage build = builder.build();
                Intrinsics.checkNotNullExpressionValue(build, "builder.build()");
                try {
                    if (build.getData().containsKey("matchId")) {
                        this.matchId = build.getData().get("matchId");
                        RemoteMessage.Notification notification = build.getNotification();
                        Intrinsics.checkNotNull(notification);
                        sendNotification(notification.getTitle(), build, "contest");
                    } else if (build.getData().containsKey("referalCode")) {
                        String str2 = build.getData().get("referalCode");
                        this.referalCode = str2;
                        Log.v("TESTTT", String.valueOf(str2));
                        RemoteMessage.Notification notification2 = build.getNotification();
                        Intrinsics.checkNotNull(notification2);
                        sendNotification(notification2.getTitle(), build, "contest_detail");
                    } else {
                        RemoteMessage.Notification notification3 = build.getNotification();
                        Intrinsics.checkNotNull(notification3);
                        sendNotification(notification3.getTitle(), build, "");
                    }
                } catch (Exception e) {
                    Log.v(TAG, "Error: " + e);
                }
            }
        } catch (Exception unused) {
        }
    }

    private final void sendNotification(String str, RemoteMessage remoteMessage, String str2) {
        String str3 = str2;
        Log.v("FIREBASE_NOTIFy", new Gson().toJson((Object) remoteMessage));
        Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
        intent.addFlags(67108864);
        if (!Intrinsics.areEqual((Object) String.valueOf(this.referalCode), (Object) "") && !Intrinsics.areEqual((Object) String.valueOf(this.referalCode), (Object) "null")) {
            intent.putExtra("open", str3);
            intent.putExtra("referalCode", remoteMessage.getData().get("referalCode"));
            String str4 = this.referalCode;
            Intrinsics.checkNotNull(str4);
            UserManager.saveCode(str4);
        }
        if (!Intrinsics.areEqual((Object) String.valueOf(this.matchId), (Object) "") && !Intrinsics.areEqual((Object) String.valueOf(this.matchId), (Object) "null")) {
            intent.putExtra("open", str3);
            intent.putExtra("matchId", String.valueOf(remoteMessage.getData().get("matchId")));
            UserManager.saveCode("null");
            UserManager.INSTANCE.saveMatchId(String.valueOf(this.matchId));
        }
        PendingIntent activity = PendingIntent.getActivity(this, (int) System.currentTimeMillis(), intent, 67108864);
        Object systemService = getApplicationContext().getSystemService("notification");
        if (systemService != null) {
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel("1234", "CHANNEL_NAME", 4);
                notificationChannel.setLightColor(-7829368);
                notificationChannel.enableLights(true);
                notificationChannel.setDescription("CHANNEL_SIREN_DESCRIPTION");
                if (Intrinsics.areEqual((Object) String.valueOf(this.referalCode), (Object) "") || Intrinsics.areEqual((Object) String.valueOf(this.referalCode), (Object) "null")) {
                    notificationChannel.setSound(Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/2131886083"), new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
                    notificationManager.createNotificationChannel(notificationChannel);
                } else {
                    notificationChannel.setSound(Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/2131886083"), new AudioAttributes.Builder().setContentType(4).setUsage(5).build());
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), "1234");
            String str5 = null;
            if (Intrinsics.areEqual((Object) String.valueOf(this.referalCode), (Object) "") || Intrinsics.areEqual((Object) String.valueOf(this.referalCode), (Object) "null")) {
                NotificationCompat.Builder contentTitle = builder.setAutoCancel(true).setWhen(System.currentTimeMillis()).setSmallIcon((int) C1188R.mipmap.app_icon).setContentTitle(getString(C1188R.string.app_name));
                RemoteMessage.Notification notification = remoteMessage.getNotification();
                if (notification != null) {
                    str5 = notification.getBody();
                }
                contentTitle.setContentText(String.valueOf(str5)).setVibrate(new long[]{0, 500, 1000}).setDefaults(4).setSound(Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/2131886083")).setContentIntent(activity);
            } else {
                NotificationCompat.Builder contentTitle2 = builder.setAutoCancel(true).setWhen(System.currentTimeMillis()).setSmallIcon((int) C1188R.mipmap.app_icon).setContentTitle(getString(C1188R.string.app_name));
                RemoteMessage.Notification notification2 = remoteMessage.getNotification();
                if (notification2 != null) {
                    str5 = notification2.getBody();
                }
                contentTitle2.setContentText(String.valueOf(str5)).setVibrate(new long[]{0, 500, 1000}).setDefaults(4).setSound(Uri.parse("android.resource://" + getApplicationContext().getPackageName() + "/2131886083")).setContentIntent(activity);
            }
            notificationManager.notify(count, builder.build());
            count++;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }

    @Metadata(mo48221d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, mo48222d2 = {"Lcom/crickpe/push/MyFirebaseMessagingService$Companion;", "", "()V", "TAG", "", "count", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyFirebaseMessagingService.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
