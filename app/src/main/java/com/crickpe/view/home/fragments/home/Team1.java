package com.crickpe.view.home.fragments.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\""}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/home/Team1;", "Landroid/os/Parcelable;", "teamId", "", "teamName", "code", "countryCode", "teamIconUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCountryCode", "getTeamIconUrl", "getTeamId", "getTeamName", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeDataModel.kt */
public final class Team1 implements Parcelable {
    public static final Parcelable.Creator<Team1> CREATOR = new Creator();
    @SerializedName("code")
    private final String code;
    @SerializedName("countryCode")
    private final String countryCode;
    @SerializedName("teamIconUrl")
    private final String teamIconUrl;
    @SerializedName("teamId")
    private final String teamId;
    @SerializedName("teamName")
    private final String teamName;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: HomeDataModel.kt */
    public static final class Creator implements Parcelable.Creator<Team1> {
        public final Team1 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Team1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Team1[] newArray(int i) {
            return new Team1[i];
        }
    }

    public static /* synthetic */ Team1 copy$default(Team1 team1, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = team1.teamId;
        }
        if ((i & 2) != 0) {
            str2 = team1.teamName;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = team1.code;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = team1.countryCode;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = team1.teamIconUrl;
        }
        return team1.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.teamId;
    }

    public final String component2() {
        return this.teamName;
    }

    public final String component3() {
        return this.code;
    }

    public final String component4() {
        return this.countryCode;
    }

    public final String component5() {
        return this.teamIconUrl;
    }

    public final Team1 copy(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        Intrinsics.checkNotNullParameter(str2, "teamName");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, "countryCode");
        Intrinsics.checkNotNullParameter(str5, "teamIconUrl");
        return new Team1(str, str2, str3, str4, str5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Team1)) {
            return false;
        }
        Team1 team1 = (Team1) obj;
        return Intrinsics.areEqual((Object) this.teamId, (Object) team1.teamId) && Intrinsics.areEqual((Object) this.teamName, (Object) team1.teamName) && Intrinsics.areEqual((Object) this.code, (Object) team1.code) && Intrinsics.areEqual((Object) this.countryCode, (Object) team1.countryCode) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) team1.teamIconUrl);
    }

    public int hashCode() {
        return (((((((this.teamId.hashCode() * 31) + this.teamName.hashCode()) * 31) + this.code.hashCode()) * 31) + this.countryCode.hashCode()) * 31) + this.teamIconUrl.hashCode();
    }

    public String toString() {
        return "Team1(teamId=" + this.teamId + ", teamName=" + this.teamName + ", code=" + this.code + ", countryCode=" + this.countryCode + ", teamIconUrl=" + this.teamIconUrl + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.teamId);
        parcel.writeString(this.teamName);
        parcel.writeString(this.code);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.teamIconUrl);
    }

    public Team1(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        Intrinsics.checkNotNullParameter(str2, "teamName");
        Intrinsics.checkNotNullParameter(str3, "code");
        Intrinsics.checkNotNullParameter(str4, "countryCode");
        Intrinsics.checkNotNullParameter(str5, "teamIconUrl");
        this.teamId = str;
        this.teamName = str2;
        this.code = str3;
        this.countryCode = str4;
        this.teamIconUrl = str5;
    }

    public final String getTeamId() {
        return this.teamId;
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
