package com.crickpe.view.intro.fragments.kyc.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001f"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "Landroid/os/Parcelable;", "_id", "", "name", "teamIconUrl", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getImageUrl", "getName", "getTeamIconUrl", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AllStatesModel.kt */
public final class TeamCountryData implements Parcelable {
    public static final Parcelable.Creator<TeamCountryData> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("imageUrl")
    private final String imageUrl;
    @SerializedName("name")
    private final String name;
    @SerializedName("teamIconUrl")
    private final String teamIconUrl;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: AllStatesModel.kt */
    public static final class Creator implements Parcelable.Creator<TeamCountryData> {
        public final TeamCountryData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TeamCountryData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final TeamCountryData[] newArray(int i) {
            return new TeamCountryData[i];
        }
    }

    public static /* synthetic */ TeamCountryData copy$default(TeamCountryData teamCountryData, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teamCountryData._id;
        }
        if ((i & 2) != 0) {
            str2 = teamCountryData.name;
        }
        if ((i & 4) != 0) {
            str3 = teamCountryData.teamIconUrl;
        }
        if ((i & 8) != 0) {
            str4 = teamCountryData.imageUrl;
        }
        return teamCountryData.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.teamIconUrl;
    }

    public final String component4() {
        return this.imageUrl;
    }

    public final TeamCountryData copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        return new TeamCountryData(str, str2, str3, str4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamCountryData)) {
            return false;
        }
        TeamCountryData teamCountryData = (TeamCountryData) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) teamCountryData._id) && Intrinsics.areEqual((Object) this.name, (Object) teamCountryData.name) && Intrinsics.areEqual((Object) this.teamIconUrl, (Object) teamCountryData.teamIconUrl) && Intrinsics.areEqual((Object) this.imageUrl, (Object) teamCountryData.imageUrl);
    }

    public int hashCode() {
        int hashCode = ((this._id.hashCode() * 31) + this.name.hashCode()) * 31;
        String str = this.teamIconUrl;
        int i = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.imageUrl;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "TeamCountryData(_id=" + this._id + ", name=" + this.name + ", teamIconUrl=" + this.teamIconUrl + ", imageUrl=" + this.imageUrl + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.name);
        parcel.writeString(this.teamIconUrl);
        parcel.writeString(this.imageUrl);
    }

    public TeamCountryData(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        this._id = str;
        this.name = str2;
        this.teamIconUrl = str3;
        this.imageUrl = str4;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTeamIconUrl() {
        return this.teamIconUrl;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }
}
