package com.crickpe.view.detail.fragments.create_own_team.my_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/ContestType;", "Landroid/os/Parcelable;", "typeId", "", "typeName", "", "(ILjava/lang/String;)V", "getTypeId", "()I", "getTypeName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyContestModel.kt */
public final class ContestType implements Parcelable {
    public static final Parcelable.Creator<ContestType> CREATOR = new Creator();
    @SerializedName("typeId")
    private final int typeId;
    @SerializedName("typeName")
    private final String typeName;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyContestModel.kt */
    public static final class Creator implements Parcelable.Creator<ContestType> {
        public final ContestType createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContestType(parcel.readInt(), parcel.readString());
        }

        public final ContestType[] newArray(int i) {
            return new ContestType[i];
        }
    }

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

    public int describeContents() {
        return 0;
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

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.typeId);
        parcel.writeString(this.typeName);
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
