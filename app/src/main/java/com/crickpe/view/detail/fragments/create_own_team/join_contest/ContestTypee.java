package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestTypee;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "typeId", "", "typeName", "", "(ILjava/lang/String;)V", "getTypeId", "()I", "getTypeName", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopContestModel.kt */
public final class ContestTypee extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<ContestTypee> CREATOR = new Creator();
    @SerializedName("typeId")
    private final int typeId;
    @SerializedName("typeName")
    private final String typeName;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopContestModel.kt */
    public static final class Creator implements Parcelable.Creator<ContestTypee> {
        public final ContestTypee createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContestTypee(parcel.readInt(), parcel.readString());
        }

        public final ContestTypee[] newArray(int i) {
            return new ContestTypee[i];
        }
    }

    public static /* synthetic */ ContestTypee copy$default(ContestTypee contestTypee, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = contestTypee.typeId;
        }
        if ((i2 & 2) != 0) {
            str = contestTypee.typeName;
        }
        return contestTypee.copy(i, str);
    }

    public final int component1() {
        return this.typeId;
    }

    public final String component2() {
        return this.typeName;
    }

    public final ContestTypee copy(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "typeName");
        return new ContestTypee(i, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContestTypee)) {
            return false;
        }
        ContestTypee contestTypee = (ContestTypee) obj;
        return this.typeId == contestTypee.typeId && Intrinsics.areEqual((Object) this.typeName, (Object) contestTypee.typeName);
    }

    public int hashCode() {
        return (this.typeId * 31) + this.typeName.hashCode();
    }

    public String toString() {
        return "ContestTypee(typeId=" + this.typeId + ", typeName=" + this.typeName + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.typeId);
        parcel.writeString(this.typeName);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContestTypee(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, str);
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public ContestTypee(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "typeName");
        this.typeId = i;
        this.typeName = str;
    }
}
