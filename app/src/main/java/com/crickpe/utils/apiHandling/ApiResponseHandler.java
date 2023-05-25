package com.crickpe.utils.apiHandling;

import androidx.core.app.NotificationCompat;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 #*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001#B/\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tHÆ\u0003JB\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/ApiResponseHandler;", "T", "Lcom/crickpe/utils/recycler/AbstractModel;", "status", "Lcom/crickpe/utils/apiHandling/Status;", "data", "error", "Lcom/crickpe/utils/apiHandling/AppError;", "message", "", "(Lcom/crickpe/utils/apiHandling/Status;Ljava/lang/Object;Lcom/crickpe/utils/apiHandling/AppError;Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Lcom/crickpe/utils/apiHandling/AppError;", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getStatus", "()Lcom/crickpe/utils/apiHandling/Status;", "component1", "component2", "component3", "component4", "copy", "(Lcom/crickpe/utils/apiHandling/Status;Ljava/lang/Object;Lcom/crickpe/utils/apiHandling/AppError;Ljava/lang/String;)Lcom/crickpe/utils/apiHandling/ApiResponseHandler;", "equals", "", "other", "", "hashCode", "", "toString", "Companion", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ApiResponseHandler.kt */
public final class ApiResponseHandler<T> extends AbstractModel {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final T data;
    private final AppError error;
    private String message;
    private final Status status;

    public static /* synthetic */ ApiResponseHandler copy$default(ApiResponseHandler apiResponseHandler, Status status2, T t, AppError appError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            status2 = apiResponseHandler.status;
        }
        if ((i & 2) != 0) {
            t = apiResponseHandler.data;
        }
        if ((i & 4) != 0) {
            appError = apiResponseHandler.error;
        }
        if ((i & 8) != 0) {
            str = apiResponseHandler.message;
        }
        return apiResponseHandler.copy(status2, t, appError, str);
    }

    public final Status component1() {
        return this.status;
    }

    public final T component2() {
        return this.data;
    }

    public final AppError component3() {
        return this.error;
    }

    public final String component4() {
        return this.message;
    }

    public final ApiResponseHandler<T> copy(Status status2, T t, AppError appError, String str) {
        Intrinsics.checkNotNullParameter(status2, NotificationCompat.CATEGORY_STATUS);
        return new ApiResponseHandler<>(status2, t, appError, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponseHandler)) {
            return false;
        }
        ApiResponseHandler apiResponseHandler = (ApiResponseHandler) obj;
        return this.status == apiResponseHandler.status && Intrinsics.areEqual((Object) this.data, (Object) apiResponseHandler.data) && Intrinsics.areEqual((Object) this.error, (Object) apiResponseHandler.error) && Intrinsics.areEqual((Object) this.message, (Object) apiResponseHandler.message);
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        T t = this.data;
        int i = 0;
        int hashCode2 = (hashCode + (t == null ? 0 : t.hashCode())) * 31;
        AppError appError = this.error;
        int hashCode3 = (hashCode2 + (appError == null ? 0 : appError.hashCode())) * 31;
        String str = this.message;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "ApiResponseHandler(status=" + this.status + ", data=" + this.data + ", error=" + this.error + ", message=" + this.message + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiResponseHandler(Status status2, Object obj, AppError appError, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(status2, obj, (i & 4) != 0 ? null : appError, (i & 8) != 0 ? null : str);
    }

    public final Status getStatus() {
        return this.status;
    }

    public final T getData() {
        return this.data;
    }

    public final AppError getError() {
        return this.error;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public ApiResponseHandler(Status status2, T t, AppError appError, String str) {
        Intrinsics.checkNotNullParameter(status2, NotificationCompat.CATEGORY_STATUS);
        this.status = status2;
        this.data = t;
        this.error = appError;
        this.message = str;
    }

    @Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\u0006\u0010\u0003\u001a\u00020\u0006J\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J/\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u0001H\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/ApiResponseHandler$Companion;", "", "()V", "error", "Lcom/crickpe/utils/apiHandling/ApiResponseHandler;", "T", "Lcom/crickpe/utils/apiHandling/AppError;", "loading", "success", "data", "message", "", "(Ljava/lang/Object;Ljava/lang/String;)Lcom/crickpe/utils/apiHandling/ApiResponseHandler;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ApiResponseHandler.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ ApiResponseHandler success$default(Companion companion, Object obj, String str, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            return companion.success(obj, str);
        }

        public final <T> ApiResponseHandler<T> success(T t, String str) {
            return new ApiResponseHandler(Status.SUCCESS, t, (AppError) null, str, 4, (DefaultConstructorMarker) null);
        }

        public final <T> ApiResponseHandler<T> error(AppError appError) {
            Intrinsics.checkNotNullParameter(appError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
            return new ApiResponseHandler(Status.ERROR, (Object) null, appError, (String) null, 8, (DefaultConstructorMarker) null);
        }

        public final <T> ApiResponseHandler<T> loading() {
            return new ApiResponseHandler(Status.LOADING, (Object) null, (AppError) null, (String) null, 8, (DefaultConstructorMarker) null);
        }
    }
}
