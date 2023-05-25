package com.crickpe.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/data/WithdrawRequest;", "", "amount", "", "transferMode", "userBankId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "getTransferMode", "getUserBankId", "setUserBankId", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WithdrawRequest.kt */
public final class WithdrawRequest {
    private final String amount;
    private final String transferMode;
    private String userBankId;

    public static /* synthetic */ WithdrawRequest copy$default(WithdrawRequest withdrawRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = withdrawRequest.amount;
        }
        if ((i & 2) != 0) {
            str2 = withdrawRequest.transferMode;
        }
        if ((i & 4) != 0) {
            str3 = withdrawRequest.userBankId;
        }
        return withdrawRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.amount;
    }

    public final String component2() {
        return this.transferMode;
    }

    public final String component3() {
        return this.userBankId;
    }

    public final WithdrawRequest copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, "transferMode");
        Intrinsics.checkNotNullParameter(str3, "userBankId");
        return new WithdrawRequest(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WithdrawRequest)) {
            return false;
        }
        WithdrawRequest withdrawRequest = (WithdrawRequest) obj;
        return Intrinsics.areEqual((Object) this.amount, (Object) withdrawRequest.amount) && Intrinsics.areEqual((Object) this.transferMode, (Object) withdrawRequest.transferMode) && Intrinsics.areEqual((Object) this.userBankId, (Object) withdrawRequest.userBankId);
    }

    public int hashCode() {
        return (((this.amount.hashCode() * 31) + this.transferMode.hashCode()) * 31) + this.userBankId.hashCode();
    }

    public String toString() {
        return "WithdrawRequest(amount=" + this.amount + ", transferMode=" + this.transferMode + ", userBankId=" + this.userBankId + ')';
    }

    public WithdrawRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "amount");
        Intrinsics.checkNotNullParameter(str2, "transferMode");
        Intrinsics.checkNotNullParameter(str3, "userBankId");
        this.amount = str;
        this.transferMode = str2;
        this.userBankId = str3;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getTransferMode() {
        return this.transferMode;
    }

    public final String getUserBankId() {
        return this.userBankId;
    }

    public final void setUserBankId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userBankId = str;
    }
}
