package com.crickpe.utils;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, mo48222d2 = {"Lcom/crickpe/utils/NetworkErrors;", "", "()V", "ERROR_CHECK_NETWORK_CONNECTION", "", "NETWORK_DATA_NULL", "NETWORK_ERROR", "NETWORK_ERROR_TIMEOUT", "NETWORK_ERROR_UNKNOWN", "UNABLE_TODO_OPERATION_WO_INTERNET", "UNABLE_TO_RESOLVE_HOST", "isNetworkError", "", "msg", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: NetworkErrors.kt */
public final class NetworkErrors {
    public static final String ERROR_CHECK_NETWORK_CONNECTION = "Check network connection.";
    public static final NetworkErrors INSTANCE = new NetworkErrors();
    public static final String NETWORK_DATA_NULL = "Network data is null";
    public static final String NETWORK_ERROR = "Please connect to Internet!";
    public static final String NETWORK_ERROR_TIMEOUT = "Network timeout";
    public static final String NETWORK_ERROR_UNKNOWN = "Unknown network error";
    public static final String UNABLE_TODO_OPERATION_WO_INTERNET = "Can't do that operation without an internet connection";
    public static final String UNABLE_TO_RESOLVE_HOST = "Unable to resolve host";

    private NetworkErrors() {
    }

    public final boolean isNetworkError(String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return StringsKt.contains$default((CharSequence) str, (CharSequence) UNABLE_TO_RESOLVE_HOST, false, 2, (Object) null);
    }
}
