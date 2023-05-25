package com.crickpe.data.models;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003R\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, mo48222d2 = {"Lcom/crickpe/data/models/ApiResponse;", "T", "", "()V", "data", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "msg", "", "getMsg", "()Ljava/lang/String;", "status", "", "getStatus", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ApiResponse.kt */
public final class ApiResponse<T> {
    private final T data;
    @SerializedName(alternate = {"msg"}, value = "message")
    private final String msg;
    @SerializedName(alternate = {"statusCode"}, value = "success")
    private final Boolean status;

    public final Boolean getStatus() {
        return this.status;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final T getData() {
        return this.data;
    }
}
