package com.crickpe.view.intro.fragments.kyc.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/kyc/models/SubmitAadharModel;", "", "if_number", "", "otp_sent", "client_id", "", "(ZZLjava/lang/String;)V", "getClient_id", "()Ljava/lang/String;", "getIf_number", "()Z", "getOtp_sent", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SubmitAadharModel.kt */
public final class SubmitAadharModel {
    private final String client_id;
    private final boolean if_number;
    private final boolean otp_sent;

    public static /* synthetic */ SubmitAadharModel copy$default(SubmitAadharModel submitAadharModel, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = submitAadharModel.if_number;
        }
        if ((i & 2) != 0) {
            z2 = submitAadharModel.otp_sent;
        }
        if ((i & 4) != 0) {
            str = submitAadharModel.client_id;
        }
        return submitAadharModel.copy(z, z2, str);
    }

    public final boolean component1() {
        return this.if_number;
    }

    public final boolean component2() {
        return this.otp_sent;
    }

    public final String component3() {
        return this.client_id;
    }

    public final SubmitAadharModel copy(boolean z, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(str, "client_id");
        return new SubmitAadharModel(z, z2, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitAadharModel)) {
            return false;
        }
        SubmitAadharModel submitAadharModel = (SubmitAadharModel) obj;
        return this.if_number == submitAadharModel.if_number && this.otp_sent == submitAadharModel.otp_sent && Intrinsics.areEqual((Object) this.client_id, (Object) submitAadharModel.client_id);
    }

    public int hashCode() {
        boolean z = this.if_number;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.otp_sent;
        if (!z3) {
            z2 = z3;
        }
        return ((i + (z2 ? 1 : 0)) * 31) + this.client_id.hashCode();
    }

    public String toString() {
        return "SubmitAadharModel(if_number=" + this.if_number + ", otp_sent=" + this.otp_sent + ", client_id=" + this.client_id + ')';
    }

    public SubmitAadharModel(boolean z, boolean z2, String str) {
        Intrinsics.checkNotNullParameter(str, "client_id");
        this.if_number = z;
        this.otp_sent = z2;
        this.client_id = str;
    }

    public final boolean getIf_number() {
        return this.if_number;
    }

    public final boolean getOtp_sent() {
        return this.otp_sent;
    }

    public final String getClient_id() {
        return this.client_id;
    }
}
