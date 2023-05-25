package com.crickpe.view.detail.fragments.wallet.payment_model;

import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0001HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u001a"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/payment_model/Data;", "", "url", "payload", "Lcom/crickpe/view/detail/fragments/wallet/payment_model/Payload;", "content_type", "method", "(Ljava/lang/Object;Lcom/crickpe/view/detail/fragments/wallet/payment_model/Payload;Ljava/lang/Object;Ljava/lang/Object;)V", "getContent_type", "()Ljava/lang/Object;", "getMethod", "getPayload", "()Lcom/crickpe/view/detail/fragments/wallet/payment_model/Payload;", "getUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Data.kt */
public final class Data {
    private final Object content_type;
    private final Object method;
    private final Payload payload;
    private final Object url;

    public static /* synthetic */ Data copy$default(Data data, Object obj, Payload payload2, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = data.url;
        }
        if ((i & 2) != 0) {
            payload2 = data.payload;
        }
        if ((i & 4) != 0) {
            obj2 = data.content_type;
        }
        if ((i & 8) != 0) {
            obj3 = data.method;
        }
        return data.copy(obj, payload2, obj2, obj3);
    }

    public final Object component1() {
        return this.url;
    }

    public final Payload component2() {
        return this.payload;
    }

    public final Object component3() {
        return this.content_type;
    }

    public final Object component4() {
        return this.method;
    }

    public final Data copy(Object obj, Payload payload2, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(obj, ImagesContract.URL);
        Intrinsics.checkNotNullParameter(payload2, "payload");
        Intrinsics.checkNotNullParameter(obj2, FirebaseAnalytics.Param.CONTENT_TYPE);
        Intrinsics.checkNotNullParameter(obj3, FirebaseAnalytics.Param.METHOD);
        return new Data(obj, payload2, obj2, obj3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Data)) {
            return false;
        }
        Data data = (Data) obj;
        return Intrinsics.areEqual(this.url, data.url) && Intrinsics.areEqual((Object) this.payload, (Object) data.payload) && Intrinsics.areEqual(this.content_type, data.content_type) && Intrinsics.areEqual(this.method, data.method);
    }

    public int hashCode() {
        return (((((this.url.hashCode() * 31) + this.payload.hashCode()) * 31) + this.content_type.hashCode()) * 31) + this.method.hashCode();
    }

    public String toString() {
        return "Data(url=" + this.url + ", payload=" + this.payload + ", content_type=" + this.content_type + ", method=" + this.method + ')';
    }

    public Data(Object obj, Payload payload2, Object obj2, Object obj3) {
        Intrinsics.checkNotNullParameter(obj, ImagesContract.URL);
        Intrinsics.checkNotNullParameter(payload2, "payload");
        Intrinsics.checkNotNullParameter(obj2, FirebaseAnalytics.Param.CONTENT_TYPE);
        Intrinsics.checkNotNullParameter(obj3, FirebaseAnalytics.Param.METHOD);
        this.url = obj;
        this.payload = payload2;
        this.content_type = obj2;
        this.method = obj3;
    }

    public final Object getUrl() {
        return this.url;
    }

    public final Payload getPayload() {
        return this.payload;
    }

    public final Object getContent_type() {
        return this.content_type;
    }

    public final Object getMethod() {
        return this.method;
    }
}
