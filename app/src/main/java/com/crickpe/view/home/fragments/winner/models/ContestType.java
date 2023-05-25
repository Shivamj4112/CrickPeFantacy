package com.crickpe.view.home.fragments.winner.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/winner/models/ContestType;", "", "typeId", "", "typeName", "", "(ILjava/lang/String;)V", "getTypeId", "()I", "getTypeName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestType.kt */
public final class ContestType {
    private final int typeId;
    private final String typeName;

    public static /* synthetic */ ContestType copy$default(ContestType contestType, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contestType.typeId;
        }
        if ((i2 & 2) != 0) {
            str = contestType.typeName;
        }
        return contestType.copy(i, str);
    }

    public final int component1() {
        return this.typeId;
    }

    public final String component2() {
        return this.typeName;
    }

    public final ContestType copy(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "typeName");
        return new ContestType(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContestType)) {
            return false;
        }
        ContestType contestType = (ContestType) obj;
        return this.typeId == contestType.typeId && Intrinsics.areEqual((Object) this.typeName, (Object) contestType.typeName);
    }

    public int hashCode() {
        return (this.typeId * 31) + this.typeName.hashCode();
    }

    public String toString() {
        return "ContestType(typeId=" + this.typeId + ", typeName=" + this.typeName + ')';
    }

    public ContestType(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "typeName");
        this.typeId = i;
        this.typeName = str;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final String getTypeName() {
        return this.typeName;
    }
}
