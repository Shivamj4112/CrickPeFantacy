package com.crickpe.view.detail.fragments.my_matches_detail;

import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/ResultData;", "", "msg", "", "(Ljava/lang/String;)V", "getMsg", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LiveScoreModel.kt */
public final class ResultData {
    private final String msg;

    public static /* synthetic */ ResultData copy$default(ResultData resultData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resultData.msg;
        }
        return resultData.copy(str);
    }

    public final String component1() {
        return this.msg;
    }

    public final ResultData copy(String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        return new ResultData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ResultData) && Intrinsics.areEqual((Object) this.msg, (Object) ((ResultData) obj).msg);
    }

    public int hashCode() {
        return this.msg.hashCode();
    }

    public String toString() {
        return "ResultData(msg=" + this.msg + ')';
    }

    public ResultData(String str) {
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_MESSAGE);
        this.msg = str;
    }

    public final String getMsg() {
        return this.msg;
    }
}
