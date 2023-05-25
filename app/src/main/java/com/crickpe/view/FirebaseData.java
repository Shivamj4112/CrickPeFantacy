package com.crickpe.view;

import com.google.firebase.database.PropertyName;
import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/view/FirebaseData;", "", "()V", "appVersionInfo", "", "getAppVersionInfo", "()Ljava/lang/Integer;", "setAppVersionInfo", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isForceUpdate", "", "()Ljava/lang/Boolean;", "setForceUpdate", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "notification", "Lcom/crickpe/view/NotificationData;", "getNotification", "()Lcom/crickpe/view/NotificationData;", "setNotification", "(Lcom/crickpe/view/NotificationData;)V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: FirebaseData.kt */
public final class FirebaseData {
    @PropertyName("appVersionInfo")
    private Integer appVersionInfo = 0;
    @PropertyName("isForceUpdate")
    private Boolean isForceUpdate = false;
    @PropertyName("Notification")
    private NotificationData notification;

    public final Boolean isForceUpdate() {
        return this.isForceUpdate;
    }

    public final void setForceUpdate(Boolean bool) {
        this.isForceUpdate = bool;
    }

    public final Integer getAppVersionInfo() {
        return this.appVersionInfo;
    }

    public final void setAppVersionInfo(Integer num) {
        this.appVersionInfo = num;
    }

    public final NotificationData getNotification() {
        return this.notification;
    }

    public final void setNotification(NotificationData notificationData) {
        this.notification = notificationData;
    }
}
