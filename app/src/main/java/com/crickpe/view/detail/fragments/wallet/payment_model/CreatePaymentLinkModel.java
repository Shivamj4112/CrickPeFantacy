package com.crickpe.view.detail.fragments.wallet.payment_model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/payment_model/CreatePaymentLinkModel;", "", "action", "", "cf_payment_id", "", "channel", "data", "Lcom/crickpe/view/detail/fragments/wallet/payment_model/Data;", "payment_amount", "payment_method", "orderId", "(Ljava/lang/String;ILjava/lang/String;Lcom/crickpe/view/detail/fragments/wallet/payment_model/Data;ILjava/lang/String;Ljava/lang/String;)V", "getAction", "()Ljava/lang/String;", "getCf_payment_id", "()I", "getChannel", "getData", "()Lcom/crickpe/view/detail/fragments/wallet/payment_model/Data;", "getOrderId", "getPayment_amount", "getPayment_method", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CreatePaymentLinkModel.kt */
public final class CreatePaymentLinkModel {
    private final String action;
    private final int cf_payment_id;
    private final String channel;
    private final Data data;
    private final String orderId;
    private final int payment_amount;
    private final String payment_method;

    public static /* synthetic */ CreatePaymentLinkModel copy$default(CreatePaymentLinkModel createPaymentLinkModel, String str, int i, String str2, Data data2, int i2, String str3, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = createPaymentLinkModel.action;
        }
        if ((i3 & 2) != 0) {
            i = createPaymentLinkModel.cf_payment_id;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = createPaymentLinkModel.channel;
        }
        String str5 = str2;
        if ((i3 & 8) != 0) {
            data2 = createPaymentLinkModel.data;
        }
        Data data3 = data2;
        if ((i3 & 16) != 0) {
            i2 = createPaymentLinkModel.payment_amount;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            str3 = createPaymentLinkModel.payment_method;
        }
        String str6 = str3;
        if ((i3 & 64) != 0) {
            str4 = createPaymentLinkModel.orderId;
        }
        return createPaymentLinkModel.copy(str, i4, str5, data3, i5, str6, str4);
    }

    public final String component1() {
        return this.action;
    }

    public final int component2() {
        return this.cf_payment_id;
    }

    public final String component3() {
        return this.channel;
    }

    public final Data component4() {
        return this.data;
    }

    public final int component5() {
        return this.payment_amount;
    }

    public final String component6() {
        return this.payment_method;
    }

    public final String component7() {
        return this.orderId;
    }

    public final CreatePaymentLinkModel copy(String str, int i, String str2, Data data2, int i2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "action");
        Intrinsics.checkNotNullParameter(str2, "channel");
        Intrinsics.checkNotNullParameter(data2, "data");
        Intrinsics.checkNotNullParameter(str3, "payment_method");
        String str5 = str4;
        Intrinsics.checkNotNullParameter(str5, "orderId");
        return new CreatePaymentLinkModel(str, i, str2, data2, i2, str3, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreatePaymentLinkModel)) {
            return false;
        }
        CreatePaymentLinkModel createPaymentLinkModel = (CreatePaymentLinkModel) obj;
        return Intrinsics.areEqual((Object) this.action, (Object) createPaymentLinkModel.action) && this.cf_payment_id == createPaymentLinkModel.cf_payment_id && Intrinsics.areEqual((Object) this.channel, (Object) createPaymentLinkModel.channel) && Intrinsics.areEqual((Object) this.data, (Object) createPaymentLinkModel.data) && this.payment_amount == createPaymentLinkModel.payment_amount && Intrinsics.areEqual((Object) this.payment_method, (Object) createPaymentLinkModel.payment_method) && Intrinsics.areEqual((Object) this.orderId, (Object) createPaymentLinkModel.orderId);
    }

    public int hashCode() {
        return (((((((((((this.action.hashCode() * 31) + this.cf_payment_id) * 31) + this.channel.hashCode()) * 31) + this.data.hashCode()) * 31) + this.payment_amount) * 31) + this.payment_method.hashCode()) * 31) + this.orderId.hashCode();
    }

    public String toString() {
        return "CreatePaymentLinkModel(action=" + this.action + ", cf_payment_id=" + this.cf_payment_id + ", channel=" + this.channel + ", data=" + this.data + ", payment_amount=" + this.payment_amount + ", payment_method=" + this.payment_method + ", orderId=" + this.orderId + ')';
    }

    public CreatePaymentLinkModel(String str, int i, String str2, Data data2, int i2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "action");
        Intrinsics.checkNotNullParameter(str2, "channel");
        Intrinsics.checkNotNullParameter(data2, "data");
        Intrinsics.checkNotNullParameter(str3, "payment_method");
        Intrinsics.checkNotNullParameter(str4, "orderId");
        this.action = str;
        this.cf_payment_id = i;
        this.channel = str2;
        this.data = data2;
        this.payment_amount = i2;
        this.payment_method = str3;
        this.orderId = str4;
    }

    public final String getAction() {
        return this.action;
    }

    public final int getCf_payment_id() {
        return this.cf_payment_id;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final Data getData() {
        return this.data;
    }

    public final int getPayment_amount() {
        return this.payment_amount;
    }

    public final String getPayment_method() {
        return this.payment_method;
    }

    public final String getOrderId() {
        return this.orderId;
    }
}
