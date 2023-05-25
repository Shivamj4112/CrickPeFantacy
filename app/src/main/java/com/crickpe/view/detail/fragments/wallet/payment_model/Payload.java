package com.crickpe.view.detail.fragments.wallet.payment_model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/payment_model/Payload;", "", "bhim", "", "default", "gpay", "paytm", "phonepe", "web", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBhim", "()Ljava/lang/String;", "getDefault", "getGpay", "getPaytm", "getPhonepe", "getWeb", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Payload.kt */
public final class Payload {
    private final String bhim;

    /* renamed from: default  reason: not valid java name */
    private final String f845default;
    private final String gpay;
    private final String paytm;
    private final String phonepe;
    private final String web;

    public static /* synthetic */ Payload copy$default(Payload payload, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = payload.bhim;
        }
        if ((i & 2) != 0) {
            str2 = payload.f845default;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = payload.gpay;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = payload.paytm;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = payload.phonepe;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = payload.web;
        }
        return payload.copy(str, str7, str8, str9, str10, str6);
    }

    public final String component1() {
        return this.bhim;
    }

    public final String component2() {
        return this.f845default;
    }

    public final String component3() {
        return this.gpay;
    }

    public final String component4() {
        return this.paytm;
    }

    public final String component5() {
        return this.phonepe;
    }

    public final String component6() {
        return this.web;
    }

    public final Payload copy(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "bhim");
        Intrinsics.checkNotNullParameter(str2, "default");
        Intrinsics.checkNotNullParameter(str3, "gpay");
        Intrinsics.checkNotNullParameter(str4, "paytm");
        Intrinsics.checkNotNullParameter(str5, "phonepe");
        Intrinsics.checkNotNullParameter(str6, "web");
        return new Payload(str, str2, str3, str4, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Payload)) {
            return false;
        }
        Payload payload = (Payload) obj;
        return Intrinsics.areEqual((Object) this.bhim, (Object) payload.bhim) && Intrinsics.areEqual((Object) this.f845default, (Object) payload.f845default) && Intrinsics.areEqual((Object) this.gpay, (Object) payload.gpay) && Intrinsics.areEqual((Object) this.paytm, (Object) payload.paytm) && Intrinsics.areEqual((Object) this.phonepe, (Object) payload.phonepe) && Intrinsics.areEqual((Object) this.web, (Object) payload.web);
    }

    public int hashCode() {
        return (((((((((this.bhim.hashCode() * 31) + this.f845default.hashCode()) * 31) + this.gpay.hashCode()) * 31) + this.paytm.hashCode()) * 31) + this.phonepe.hashCode()) * 31) + this.web.hashCode();
    }

    public String toString() {
        return "Payload(bhim=" + this.bhim + ", default=" + this.f845default + ", gpay=" + this.gpay + ", paytm=" + this.paytm + ", phonepe=" + this.phonepe + ", web=" + this.web + ')';
    }

    public Payload(String str, String str2, String str3, String str4, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str, "bhim");
        Intrinsics.checkNotNullParameter(str2, "default");
        Intrinsics.checkNotNullParameter(str3, "gpay");
        Intrinsics.checkNotNullParameter(str4, "paytm");
        Intrinsics.checkNotNullParameter(str5, "phonepe");
        Intrinsics.checkNotNullParameter(str6, "web");
        this.bhim = str;
        this.f845default = str2;
        this.gpay = str3;
        this.paytm = str4;
        this.phonepe = str5;
        this.web = str6;
    }

    public final String getBhim() {
        return this.bhim;
    }

    public final String getDefault() {
        return this.f845default;
    }

    public final String getGpay() {
        return this.gpay;
    }

    public final String getPaytm() {
        return this.paytm;
    }

    public final String getPhonepe() {
        return this.phonepe;
    }

    public final String getWeb() {
        return this.web;
    }
}
