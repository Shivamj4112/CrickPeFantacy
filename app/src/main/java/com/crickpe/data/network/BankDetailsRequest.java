package com.crickpe.data.network;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo48222d2 = {"Lcom/crickpe/data/network/BankDetailsRequest;", "", "account_number", "", "ifsc", "(Ljava/lang/String;Ljava/lang/String;)V", "getAccount_number", "()Ljava/lang/String;", "getIfsc", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BankDetailsRequest.kt */
public final class BankDetailsRequest {
    private final String account_number;
    private final String ifsc;

    public static /* synthetic */ BankDetailsRequest copy$default(BankDetailsRequest bankDetailsRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankDetailsRequest.account_number;
        }
        if ((i & 2) != 0) {
            str2 = bankDetailsRequest.ifsc;
        }
        return bankDetailsRequest.copy(str, str2);
    }

    public final String component1() {
        return this.account_number;
    }

    public final String component2() {
        return this.ifsc;
    }

    public final BankDetailsRequest copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "account_number");
        Intrinsics.checkNotNullParameter(str2, "ifsc");
        return new BankDetailsRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankDetailsRequest)) {
            return false;
        }
        BankDetailsRequest bankDetailsRequest = (BankDetailsRequest) obj;
        return Intrinsics.areEqual((Object) this.account_number, (Object) bankDetailsRequest.account_number) && Intrinsics.areEqual((Object) this.ifsc, (Object) bankDetailsRequest.ifsc);
    }

    public int hashCode() {
        return (this.account_number.hashCode() * 31) + this.ifsc.hashCode();
    }

    public String toString() {
        return "BankDetailsRequest(account_number=" + this.account_number + ", ifsc=" + this.ifsc + ')';
    }

    public BankDetailsRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "account_number");
        Intrinsics.checkNotNullParameter(str2, "ifsc");
        this.account_number = str;
        this.ifsc = str2;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getIfsc() {
        return this.ifsc;
    }
}
