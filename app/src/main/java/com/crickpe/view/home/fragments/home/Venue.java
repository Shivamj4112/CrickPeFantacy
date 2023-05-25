package com.crickpe.view.home.fragments.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/home/Venue;", "Landroid/os/Parcelable;", "venueName", "", "venueCity", "venueCountry", "venueTimezone", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVenueCity", "()Ljava/lang/String;", "getVenueCountry", "getVenueName", "getVenueTimezone", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeDataModel.kt */
public final class Venue implements Parcelable {
    public static final Parcelable.Creator<Venue> CREATOR = new Creator();
    @SerializedName("venueCity")
    private final String venueCity;
    @SerializedName("venueCountry")
    private final String venueCountry;
    @SerializedName("venueName")
    private final String venueName;
    @SerializedName("venueTimezone")
    private final String venueTimezone;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: HomeDataModel.kt */
    public static final class Creator implements Parcelable.Creator<Venue> {
        public final Venue createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Venue(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Venue[] newArray(int i) {
            return new Venue[i];
        }
    }

    public static /* synthetic */ Venue copy$default(Venue venue, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = venue.venueName;
        }
        if ((i & 2) != 0) {
            str2 = venue.venueCity;
        }
        if ((i & 4) != 0) {
            str3 = venue.venueCountry;
        }
        if ((i & 8) != 0) {
            str4 = venue.venueTimezone;
        }
        return venue.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.venueName;
    }

    public final String component2() {
        return this.venueCity;
    }

    public final String component3() {
        return this.venueCountry;
    }

    public final String component4() {
        return this.venueTimezone;
    }

    public final Venue copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "venueName");
        Intrinsics.checkNotNullParameter(str2, "venueCity");
        Intrinsics.checkNotNullParameter(str3, "venueCountry");
        Intrinsics.checkNotNullParameter(str4, "venueTimezone");
        return new Venue(str, str2, str3, str4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Venue)) {
            return false;
        }
        Venue venue = (Venue) obj;
        return Intrinsics.areEqual((Object) this.venueName, (Object) venue.venueName) && Intrinsics.areEqual((Object) this.venueCity, (Object) venue.venueCity) && Intrinsics.areEqual((Object) this.venueCountry, (Object) venue.venueCountry) && Intrinsics.areEqual((Object) this.venueTimezone, (Object) venue.venueTimezone);
    }

    public int hashCode() {
        return (((((this.venueName.hashCode() * 31) + this.venueCity.hashCode()) * 31) + this.venueCountry.hashCode()) * 31) + this.venueTimezone.hashCode();
    }

    public String toString() {
        return "Venue(venueName=" + this.venueName + ", venueCity=" + this.venueCity + ", venueCountry=" + this.venueCountry + ", venueTimezone=" + this.venueTimezone + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.venueName);
        parcel.writeString(this.venueCity);
        parcel.writeString(this.venueCountry);
        parcel.writeString(this.venueTimezone);
    }

    public Venue(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "venueName");
        Intrinsics.checkNotNullParameter(str2, "venueCity");
        Intrinsics.checkNotNullParameter(str3, "venueCountry");
        Intrinsics.checkNotNullParameter(str4, "venueTimezone");
        this.venueName = str;
        this.venueCity = str2;
        this.venueCountry = str3;
        this.venueTimezone = str4;
    }

    public final String getVenueName() {
        return this.venueName;
    }

    public final String getVenueCity() {
        return this.venueCity;
    }

    public final String getVenueCountry() {
        return this.venueCountry;
    }

    public final String getVenueTimezone() {
        return this.venueTimezone;
    }
}
