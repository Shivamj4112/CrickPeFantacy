package com.crickpe.push;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.crickpe.C1188R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Calendar;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\bH\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\f"}, mo48222d2 = {"Lcom/crickpe/push/MessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "TAG", "", "handleNow", "", "notificationData", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MessagingService.kt */
public final class MessagingService extends FirebaseMessagingService {
    private final String TAG = "NOTIFICATION:: ";

    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        String str = this.TAG;
        Log.d(str, "From: " + remoteMessage.getFrom());
        String str2 = this.TAG;
        Log.v(str2, "onMessageReceived: " + remoteMessage.getData().get("referalCode"));
        Map<String, String> data = remoteMessage.getData();
        Intrinsics.checkNotNullExpressionValue(data, "remoteMessage.data");
        if (!data.isEmpty()) {
            String str3 = this.TAG;
            Log.d(str3, "Message data payload: " + remoteMessage.getData());
            Map<String, String> data2 = remoteMessage.getData();
            Intrinsics.checkNotNullExpressionValue(data2, "remoteMessage.data");
            handleNow(data2);
        }
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        if (notification != null) {
            String str4 = this.TAG;
            Log.d(str4, "Message Notification Body: " + notification.getBody());
            Map<String, String> data3 = remoteMessage.getData();
            Intrinsics.checkNotNullExpressionValue(data3, "remoteMessage.data");
            handleNow(data3);
        }
    }

    private final void handleNow(Map<String, String> map) {
        NotificationCompat.Builder vibrate = new NotificationCompat.Builder((Context) this, getString(C1188R.string.default_notification_channel_id)).setContentTitle(map.get("title")).setContentText(map.get("body")).setLargeIcon(BitmapFactory.decodeResource(getResources(), C1188R.mipmap.app_icon)).setAutoCancel(true).setVibrate(new long[]{0, 500, 1000});
        Intrinsics.checkNotNullExpressionValue(vibrate, "Builder(this,getString(R…ongArrayOf(0, 500, 1000))");
        if (Build.VERSION.SDK_INT >= 21) {
            vibrate.setSmallIcon((int) C1188R.mipmap.app_icon);
        } else {
            vibrate.setSmallIcon((int) C1188R.mipmap.app_icon);
        }
        Object systemService = getSystemService("notification");
        if (systemService != null) {
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                NotificationChannel notificationChannel = new NotificationChannel(getString(C1188R.string.default_notification_channel_id), getText(C1188R.string.app_name), 4);
                notificationChannel.setLightColor(-7829368);
                notificationChannel.enableLights(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            notificationManager.notify((int) Calendar.getInstance().getTimeInMillis(), vibrate.build());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
    }
}
