package com.crickpe.utils.apiHandling;

import android.util.Log;
import com.crickpe.utils.apiHandling.AppError;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(mo48221d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u001f\u0010\n\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0012"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/RetrofitUtils;", "", "()V", "apiError", "Lcom/crickpe/utils/apiHandling/AppError;", "errorBody", "Lokhttp3/ResponseBody;", "apiFailure", "t", "", "getApiError", "message", "", "responseCode", "", "(Ljava/lang/String;Ljava/lang/Integer;)Lcom/crickpe/utils/apiHandling/AppError;", "messageFromErrorBody", "Lcom/crickpe/utils/apiHandling/ErrorCode;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RetrofitUtils.kt */
public final class RetrofitUtils {
    public static final RetrofitUtils INSTANCE = new RetrofitUtils();

    private RetrofitUtils() {
    }

    private final ErrorCode messageFromErrorBody(ResponseBody responseBody) {
        if (responseBody != null) {
            try {
                JSONObject jSONObject = new JSONObject(responseBody.string());
                ErrorCode errorCode = new ErrorCode((String) null, (String) null, 3, (DefaultConstructorMarker) null);
                if (jSONObject.has("message")) {
                    errorCode.setMessage(jSONObject.getString("message"));
                }
                if (jSONObject.has("statusCode")) {
                    errorCode.setStatusCode(jSONObject.getString("statusCode"));
                }
                return errorCode;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public final AppError apiFailure(Throwable th) {
        String localizedMessage = th != null ? th.getLocalizedMessage() : null;
        if (localizedMessage == null) {
            localizedMessage = "";
        }
        return new AppError.ApiFailure(localizedMessage);
    }

    public final AppError apiError(ResponseBody responseBody) {
        String str;
        ErrorCode messageFromErrorBody = messageFromErrorBody(responseBody);
        String str2 = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(messageFromErrorBody != null ? messageFromErrorBody.getStatusCode() : null);
            sb.append("<->");
            sb.append(messageFromErrorBody != null ? messageFromErrorBody.getMessage() : null);
            Log.v("ERRORAPI", sb.toString());
        } catch (Exception e) {
            Log.v("EXC", e.toString());
        }
        if (messageFromErrorBody == null || (str = messageFromErrorBody.getMessage()) == null) {
            str = "";
        }
        if (messageFromErrorBody != null) {
            str2 = messageFromErrorBody.getStatusCode();
        }
        return new AppError.ApiError(str, String.valueOf(str2));
    }

    public final AppError getApiError(String str, Integer num) {
        if (num != null && num.intValue() == 401) {
            if (str == null) {
                str = "";
            }
            return new AppError.ApiUnAuthorized(str);
        }
        if (str == null) {
            str = "";
        }
        return new AppError.ApiError(str, "");
    }
}
