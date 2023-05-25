package com.crickpe.utils.apiHandling;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ8\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/ApiResponse;", "T", "", "statusCode", "", "msg", "", "data", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getMsg", "()Ljava/lang/String;", "getStatusCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Object;)Lcom/crickpe/utils/apiHandling/ApiResponse;", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ApiResponse.kt */
public final class ApiResponse<T> {
    private final T data;
    private final String msg;
    private final Integer statusCode;

    public ApiResponse() {
        this((Integer) null, (String) null, (Object) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ApiResponse copy$default(ApiResponse apiResponse, Integer num, String str, T t, int i, Object obj) {
        if ((i & 1) != 0) {
            num = apiResponse.statusCode;
        }
        if ((i & 2) != 0) {
            str = apiResponse.msg;
        }
        if ((i & 4) != 0) {
            t = apiResponse.data;
        }
        return apiResponse.copy(num, str, t);
    }

    public final Integer component1() {
        return this.statusCode;
    }

    public final String component2() {
        return this.msg;
    }

    public final T component3() {
        return this.data;
    }

    public final ApiResponse<T> copy(Integer num, String str, T t) {
        return new ApiResponse<>(num, str, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        return Intrinsics.areEqual((Object) this.statusCode, (Object) apiResponse.statusCode) && Intrinsics.areEqual((Object) this.msg, (Object) apiResponse.msg) && Intrinsics.areEqual((Object) this.data, (Object) apiResponse.data);
    }

    public int hashCode() {
        Integer num = this.statusCode;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.msg;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t = this.data;
        if (t != null) {
            i = t.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ApiResponse(statusCode=" + this.statusCode + ", msg=" + this.msg + ", data=" + this.data + ')';
    }

    public ApiResponse(Integer num, String str, T t) {
        this.statusCode = num;
        this.msg = str;
        this.data = t;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApiResponse(Integer num, String str, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : obj);
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final T getData() {
        return this.data;
    }
}
