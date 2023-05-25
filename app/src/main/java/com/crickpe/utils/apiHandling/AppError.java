package com.crickpe.utils.apiHandling;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0003\u0006\u0007\b¨\u0006\t"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/AppError;", "", "()V", "ApiError", "ApiFailure", "ApiUnAuthorized", "Lcom/crickpe/utils/apiHandling/AppError$ApiError;", "Lcom/crickpe/utils/apiHandling/AppError$ApiUnAuthorized;", "Lcom/crickpe/utils/apiHandling/AppError$ApiFailure;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AppError.kt */
public abstract class AppError {
    public /* synthetic */ AppError(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/AppError$ApiError;", "Lcom/crickpe/utils/apiHandling/AppError;", "message", "", "statusCode", "(Ljava/lang/String;Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getStatusCode", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: AppError.kt */
    public static final class ApiError extends AppError {
        private final String message;
        private final String statusCode;

        public static /* synthetic */ ApiError copy$default(ApiError apiError, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiError.message;
            }
            if ((i & 2) != 0) {
                str2 = apiError.statusCode;
            }
            return apiError.copy(str, str2);
        }

        public final String component1() {
            return this.message;
        }

        public final String component2() {
            return this.statusCode;
        }

        public final ApiError copy(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "message");
            Intrinsics.checkNotNullParameter(str2, "statusCode");
            return new ApiError(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ApiError)) {
                return false;
            }
            ApiError apiError = (ApiError) obj;
            return Intrinsics.areEqual((Object) this.message, (Object) apiError.message) && Intrinsics.areEqual((Object) this.statusCode, (Object) apiError.statusCode);
        }

        public int hashCode() {
            return (this.message.hashCode() * 31) + this.statusCode.hashCode();
        }

        public String toString() {
            return "ApiError(message=" + this.message + ", statusCode=" + this.statusCode + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ApiError(String str, String str2) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "message");
            Intrinsics.checkNotNullParameter(str2, "statusCode");
            this.message = str;
            this.statusCode = str2;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getStatusCode() {
            return this.statusCode;
        }
    }

    private AppError() {
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/AppError$ApiUnAuthorized;", "Lcom/crickpe/utils/apiHandling/AppError;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: AppError.kt */
    public static final class ApiUnAuthorized extends AppError {
        private final String message;

        public static /* synthetic */ ApiUnAuthorized copy$default(ApiUnAuthorized apiUnAuthorized, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiUnAuthorized.message;
            }
            return apiUnAuthorized.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final ApiUnAuthorized copy(String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new ApiUnAuthorized(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiUnAuthorized) && Intrinsics.areEqual((Object) this.message, (Object) ((ApiUnAuthorized) obj).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "ApiUnAuthorized(message=" + this.message + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ApiUnAuthorized(String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "message");
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/AppError$ApiFailure;", "Lcom/crickpe/utils/apiHandling/AppError;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: AppError.kt */
    public static final class ApiFailure extends AppError {
        private final String message;

        public static /* synthetic */ ApiFailure copy$default(ApiFailure apiFailure, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = apiFailure.message;
            }
            return apiFailure.copy(str);
        }

        public final String component1() {
            return this.message;
        }

        public final ApiFailure copy(String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            return new ApiFailure(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApiFailure) && Intrinsics.areEqual((Object) this.message, (Object) ((ApiFailure) obj).message);
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        public String toString() {
            return "ApiFailure(message=" + this.message + ')';
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ApiFailure(String str) {
            super((DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(str, "message");
            this.message = str;
        }

        public final String getMessage() {
            return this.message;
        }
    }
}
