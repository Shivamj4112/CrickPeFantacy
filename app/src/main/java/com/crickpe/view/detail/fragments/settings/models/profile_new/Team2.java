package com.crickpe.view.detail.fragments.settings.models.profile_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Team2;", "Landroid/os/Parcelable;", "teamName", "", "code", "countryCode", "teamIconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCountryCode", "getTeamIconUrl", "getTeamName", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Team2.kt */
public final class Team2 implements Parcelable {
    public static final Parcelable.Creator<Team2> CREATOR = new Creator();
    @SerializedName("code")
    private final String code;
    @SerializedName("countryCode")
    private final String countryCode;
    @SerializedName("teamIconUrl")
    private final String teamIconUrl;
    @SerializedName("teamName")
    private final String teamName;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: Team2.kt */
    public static final class Creator implements Parcelable.Creator<Team2> {
        public final Team2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Team2(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Team2[] newArray(int i) {
            return new Team2[i];
        }
    }

    public static /* synthetic */ Team2 copy$default(Team2 team2, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = team2.teamName;
        }
        if ((i & 2) != 0) {
            str2 = team2.code;
        }
        if ((i & 4) != 0) {
            str3 = team2.countryCode;
        }
        if ((i & 8) != 0) {
            str4 = team2.teamIconUrl;
        }
        return team2.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.teamName;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.countryCode;
    }

    public final String component4() {
        return this.teamIconUrl;
    }

    public final Team2 copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "teamName");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "countryCode");
        Intrinsics.checkNotNullParameter(str4, "teamIconUrl");
        return new Team2(str, str2, str3, str4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Team2)) {
            return false;
        }
        Team2 team2 = (Team2) obj;
        return Intrinsics.areEqual((Object) this.teamName, (Object) team2.teamName) && Intrinsics.areEqual((Object) this.code, (Object) team2.code) && Intrinsics.areEqual((Object) this.countryCode, (Object) team2.countryCode) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) team2.teamIconUrl);
    }

    public int hashCode() {
        return (((((this.teamName.hashCode() * 31) + this.code.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.teamIconUrl.hashCode();
    }

    public String toString() {
        return "Team2(teamName=" + this.teamName + ", code=" + this.code + ", countryCode=" + this.countryCode + ", teamIconUrl=" + this.teamIconUrl + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.teamName);
        parcel.writeString(this.code);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.teamIconUrl);
    }

    public Team2(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "teamName");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "countryCode");
        Intrinsics.checkNotNullParameter(str4, "teamIconUrl");
        this.teamName = str;
        this.code = str2;
        this.countryCode = str3;
        this.teamIconUrl = str4;
    }

    public final String getTeamName() {
        return this.teamName;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getCountryCode() {
        return this.countryCode;
    }

    public final String getTeamIconUrl() {
        return this.teamIconUrl;
    }
}
