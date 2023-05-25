package com.crickpe.view.detail.fragments.my_matches_detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/Nationality;", "Landroid/os/Parcelable;", "shortCode", "", "code", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getName", "getShortCode", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersPotModel.kt */
public final class Nationality implements Parcelable {
    public static final Parcelable.Creator<Nationality> CREATOR = new Creator();
    @SerializedName("code")
    private final String code;
    @SerializedName("name")
    private final String name;
    @SerializedName("shortCode")
    private final String shortCode;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersPotModel.kt */
    public static final class Creator implements Parcelable.Creator<Nationality> {
        public final Nationality createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Nationality(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Nationality[] newArray(int i) {
            return new Nationality[i];
        }
    }

    public static /* synthetic */ Nationality copy$default(Nationality nationality, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nationality.shortCode;
        }
        if ((i & 2) != 0) {
            str2 = nationality.code;
        }
        if ((i & 4) != 0) {
            str3 = nationality.name;
        }
        return nationality.copy(str, str2, str3);
    }

    public final String component1() {
        return this.shortCode;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.name;
    }

    public final Nationality copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "shortCode");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "name");
        return new Nationality(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nationality)) {
            return false;
        }
        Nationality nationality = (Nationality) obj;
        return Intrinsics.areEqual((Object) this.shortCode, (Object) nationality.shortCode) && Intrinsics.areEqual((Object) this.code, (Object) nationality.code) && Intrinsics.areEqual((Object) this.name, (Object) nationality.name);
    }

    public int hashCode() {
        return (((this.shortCode.hashCode() * 31) + this.code.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "Nationality(shortCode=" + this.shortCode + ", code=" + this.code + ", name=" + this.name + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.shortCode);
        parcel.writeString(this.code);
        parcel.writeString(this.name);
    }

    public Nationality(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "shortCode");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "name");
        this.shortCode = str;
        this.code = str2;
        this.name = str3;
    }

    public final String getShortCode() {
        return this.shortCode;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }
}
