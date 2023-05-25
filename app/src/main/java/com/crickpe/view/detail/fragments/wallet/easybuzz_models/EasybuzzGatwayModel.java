package com.crickpe.view.detail.fragments.wallet.easybuzz_models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0006¨\u0006\u0011"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/easybuzz_models/EasybuzzGatwayModel;", "", "key", "", "isSandboxEasebuzz", "(Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "getKey", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: EasybuzzGatwayModel.kt */
public final class EasybuzzGatwayModel {
    private final String isSandboxEasebuzz;
    private final String key;

    public static /* synthetic */ EasybuzzGatwayModel copy$default(EasybuzzGatwayModel easybuzzGatwayModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = easybuzzGatwayModel.key;
        }
        if ((i & 2) != 0) {
            str2 = easybuzzGatwayModel.isSandboxEasebuzz;
        }
        return easybuzzGatwayModel.copy(str, str2);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.isSandboxEasebuzz;
    }

    public final EasybuzzGatwayModel copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "isSandboxEasebuzz");
        return new EasybuzzGatwayModel(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EasybuzzGatwayModel)) {
            return false;
        }
        EasybuzzGatwayModel easybuzzGatwayModel = (EasybuzzGatwayModel) obj;
        return Intrinsics.areEqual((Object) this.key, (Object) easybuzzGatwayModel.key) && Intrinsics.areEqual((Object) this.isSandboxEasebuzz, (Object) easybuzzGatwayModel.isSandboxEasebuzz);
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + this.isSandboxEasebuzz.hashCode();
    }

    public String toString() {
        return "EasybuzzGatwayModel(key=" + this.key + ", isSandboxEasebuzz=" + this.isSandboxEasebuzz + ')';
    }

    public EasybuzzGatwayModel(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "isSandboxEasebuzz");
        this.key = str;
        this.isSandboxEasebuzz = str2;
    }

    public final String getKey() {
        return this.key;
    }

    public final String isSandboxEasebuzz() {
        return this.isSandboxEasebuzz;
    }
}
