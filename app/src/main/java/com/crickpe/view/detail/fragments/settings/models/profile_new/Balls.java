package com.crickpe.view.detail.fragments.settings.models.profile_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Balls;", "Landroid/os/Parcelable;", "label", "", "_id", "", "(ILjava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getLabel", "()I", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Balls.kt */
public final class Balls implements Parcelable {
    public static final Parcelable.Creator<Balls> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("label")
    private final int label;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: Balls.kt */
    public static final class Creator implements Parcelable.Creator<Balls> {
        public final Balls createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Balls(parcel.readInt(), parcel.readString());
        }

        public final Balls[] newArray(int i) {
            return new Balls[i];
        }
    }

    public static /* synthetic */ Balls copy$default(Balls balls, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = balls.label;
        }
        if ((i2 & 2) != 0) {
            str = balls._id;
        }
        return balls.copy(i, str);
    }

    public final int component1() {
        return this.label;
    }

    public final String component2() {
        return this._id;
    }

    public final Balls copy(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "_id");
        return new Balls(i, str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Balls)) {
            return false;
        }
        Balls balls = (Balls) obj;
        return this.label == balls.label && Intrinsics.areEqual((Object) this._id, (Object) balls._id);
    }

    public int hashCode() {
        return (this.label * 31) + this._id.hashCode();
    }

    public String toString() {
        return "Balls(label=" + this.label + ", _id=" + this._id + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.label);
        parcel.writeString(this._id);
    }

    public Balls(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "_id");
        this.label = i;
        this._id = str;
    }

    public final int getLabel() {
        return this.label;
    }

    public final String get_id() {
        return this._id;
    }
}
