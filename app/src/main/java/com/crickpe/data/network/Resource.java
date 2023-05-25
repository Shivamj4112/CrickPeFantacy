package com.crickpe.data.network;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0003\u0010\u0011\u0012B+\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bR\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0001\u0003\u0013\u0014\u0015¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/data/network/Resource;", "T", "", "data", "msg", "", "status", "Lcom/crickpe/data/network/Status;", "(Ljava/lang/Object;Ljava/lang/String;Lcom/crickpe/data/network/Status;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "getStatus", "()Lcom/crickpe/data/network/Status;", "Error", "NetworkError", "Success", "Lcom/crickpe/data/network/Resource$Success;", "Lcom/crickpe/data/network/Resource$Error;", "Lcom/crickpe/data/network/Resource$NetworkError;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Resource.kt */
public abstract class Resource<T> {
    private final T data;
    private final String msg;
    private final Status status;

    public /* synthetic */ Resource(Object obj, String str, Status status2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, str, status2);
    }

    private Resource(T t, String str, Status status2) {
        this.data = t;
        this.msg = str;
        this.status = status2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Resource(Object obj, String str, Status status2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : status2, (DefaultConstructorMarker) null);
    }

    public final T getData() {
        return this.data;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final Status getStatus() {
        return this.status;
    }

    @Metadata(mo48221d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, mo48222d2 = {"Lcom/crickpe/data/network/Resource$Success;", "T", "Lcom/crickpe/data/network/Resource;", "data", "msg", "", "status", "Lcom/crickpe/data/network/Status;", "(Ljava/lang/Object;Ljava/lang/String;Lcom/crickpe/data/network/Status;)V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: Resource.kt */
    public static final class Success<T> extends Resource<T> {
        public Success(T t, String str, Status status) {
            super(t, str, status, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/data/network/Resource$Error;", "T", "Lcom/crickpe/data/network/Resource;", "message", "", "status", "Lcom/crickpe/data/network/Status;", "(Ljava/lang/String;Lcom/crickpe/data/network/Status;)V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: Resource.kt */
    public static final class Error<T> extends Resource<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Error(String str, Status status) {
            super((Object) null, str, status, 1, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "message");
            Intrinsics.checkNotNullParameter(status, NotificationCompat.CATEGORY_STATUS);
        }
    }

    @Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/data/network/Resource$NetworkError;", "T", "Lcom/crickpe/data/network/Resource;", "message", "", "status", "Lcom/crickpe/data/network/Status;", "(Ljava/lang/String;Lcom/crickpe/data/network/Status;)V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: Resource.kt */
    public static final class NetworkError<T> extends Resource<T> {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NetworkError(String str, Status status) {
            super((Object) null, str, status, 1, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "message");
            Intrinsics.checkNotNullParameter(status, NotificationCompat.CATEGORY_STATUS);
        }
    }
}
