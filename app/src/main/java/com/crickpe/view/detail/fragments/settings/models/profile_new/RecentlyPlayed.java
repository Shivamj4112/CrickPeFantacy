package com.crickpe.view.detail.fragments.settings.models.profile_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\f\u0012\u0006\u0010\u0018\u001a\u00020\f\u0012\u0006\u0010\u0019\u001a\u00020\f\u0012\u0006\u0010\u001a\u001a\u00020\f\u0012\u0006\u0010\u001b\u001a\u00020\f¢\u0006\u0002\u0010\u001cJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\fHÆ\u0003J\t\u00109\u001a\u00020\u0010HÆ\u0003J\t\u0010:\u001a\u00020\u0012HÆ\u0003J\t\u0010;\u001a\u00020\u0014HÆ\u0003J\t\u0010<\u001a\u00020\u0016HÆ\u0003J\t\u0010=\u001a\u00020\fHÆ\u0003J\t\u0010>\u001a\u00020\fHÆ\u0003J\t\u0010?\u001a\u00020\fHÆ\u0003J\t\u0010@\u001a\u00020\fHÆ\u0003J\t\u0010A\u001a\u00020\fHÆ\u0003J\t\u0010B\u001a\u00020\u0005HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\fHÆ\u0003J\t\u0010I\u001a\u00020\fHÆ\u0003JÇ\u0001\u0010J\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\f2\b\b\u0002\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\fHÆ\u0001J\t\u0010K\u001a\u00020\fHÖ\u0001J\u0013\u0010L\u001a\u00020M2\b\u0010N\u001a\u0004\u0018\u00010OHÖ\u0003J\t\u0010P\u001a\u00020\fHÖ\u0001J\t\u0010Q\u001a\u00020\u0003HÖ\u0001J\u0019\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u000e\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0016\u0010\u001a\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0016\u0010\u0019\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0016\u0010\u0017\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010 R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u001b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010 R\u0016\u0010\u0018\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010 ¨\u0006W"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/profile_new/RecentlyPlayed;", "Landroid/os/Parcelable;", "_id", "", "livescoresInfo", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/LivescoresInfo;", "key", "title", "name", "shortName", "format", "startAtIST", "", "estimatedEndDate", "matchStatus", "venue", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Venue;", "result", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Result;", "team1", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Team1;", "team2", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Team2;", "participants", "youWon", "myFantasyTeamCount", "megaPrize", "winningPercentage", "(Ljava/lang/String;Lcom/crickpe/view/detail/fragments/settings/models/profile_new/LivescoresInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILcom/crickpe/view/detail/fragments/settings/models/profile_new/Venue;Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Result;Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Team1;Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Team2;IIIII)V", "get_id", "()Ljava/lang/String;", "getEstimatedEndDate", "()I", "getFormat", "getKey", "getLivescoresInfo", "()Lcom/crickpe/view/detail/fragments/settings/models/profile_new/LivescoresInfo;", "getMatchStatus", "getMegaPrize", "getMyFantasyTeamCount", "getName", "getParticipants", "getResult", "()Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Result;", "getShortName", "getStartAtIST", "getTeam1", "()Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Team1;", "getTeam2", "()Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Team2;", "getTitle", "getVenue", "()Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Venue;", "getWinningPercentage", "getYouWon", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RecentlyPlayed.kt */
public final class RecentlyPlayed implements Parcelable {
    public static final Parcelable.Creator<RecentlyPlayed> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("estimatedEndDate")
    private final int estimatedEndDate;
    @SerializedName("format")
    private final String format;
    @SerializedName("key")
    private final String key;
    @SerializedName("livescoresInfo")
    private final LivescoresInfo livescoresInfo;
    @SerializedName("matchStatus")
    private final int matchStatus;
    @SerializedName("megaPrize")
    private final int megaPrize;
    @SerializedName("myFantasyTeamCount")
    private final int myFantasyTeamCount;
    @SerializedName("name")
    private final String name;
    @SerializedName("participants")
    private final int participants;
    @SerializedName("result")
    private final Result result;
    @SerializedName("shortName")
    private final String shortName;
    @SerializedName("startAtIST")
    private final int startAtIST;
    @SerializedName("team1")
    private final Team1 team1;
    @SerializedName("team2")
    private final Team2 team2;
    @SerializedName("title")
    private final String title;
    @SerializedName("venue")
    private final Venue venue;
    @SerializedName("winningPercentage")
    private final int winningPercentage;
    @SerializedName("youWon")
    private final int youWon;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: RecentlyPlayed.kt */
    public static final class Creator implements Parcelable.Creator<RecentlyPlayed> {
        public final RecentlyPlayed createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            RecentlyPlayed recentlyPlayed = r2;
            RecentlyPlayed recentlyPlayed2 = new RecentlyPlayed(parcel.readString(), LivescoresInfo.CREATOR.createFromParcel(parcel2), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), Venue.CREATOR.createFromParcel(parcel2), Result.CREATOR.createFromParcel(parcel2), Team1.CREATOR.createFromParcel(parcel2), Team2.CREATOR.createFromParcel(parcel2), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            return recentlyPlayed;
        }

        public final RecentlyPlayed[] newArray(int i) {
            return new RecentlyPlayed[i];
        }
    }

    public static /* synthetic */ RecentlyPlayed copy$default(RecentlyPlayed recentlyPlayed, String str, LivescoresInfo livescoresInfo2, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, Venue venue2, Result result2, Team1 team12, Team2 team22, int i4, int i5, int i6, int i7, int i8, int i9, Object obj) {
        RecentlyPlayed recentlyPlayed2 = recentlyPlayed;
        int i10 = i9;
        return recentlyPlayed.copy((i10 & 1) != 0 ? recentlyPlayed2._id : str, (i10 & 2) != 0 ? recentlyPlayed2.livescoresInfo : livescoresInfo2, (i10 & 4) != 0 ? recentlyPlayed2.key : str2, (i10 & 8) != 0 ? recentlyPlayed2.title : str3, (i10 & 16) != 0 ? recentlyPlayed2.name : str4, (i10 & 32) != 0 ? recentlyPlayed2.shortName : str5, (i10 & 64) != 0 ? recentlyPlayed2.format : str6, (i10 & 128) != 0 ? recentlyPlayed2.startAtIST : i, (i10 & 256) != 0 ? recentlyPlayed2.estimatedEndDate : i2, (i10 & 512) != 0 ? recentlyPlayed2.matchStatus : i3, (i10 & 1024) != 0 ? recentlyPlayed2.venue : venue2, (i10 & 2048) != 0 ? recentlyPlayed2.result : result2, (i10 & 4096) != 0 ? recentlyPlayed2.team1 : team12, (i10 & 8192) != 0 ? recentlyPlayed2.team2 : team22, (i10 & 16384) != 0 ? recentlyPlayed2.participants : i4, (i10 & 32768) != 0 ? recentlyPlayed2.youWon : i5, (i10 & 65536) != 0 ? recentlyPlayed2.myFantasyTeamCount : i6, (i10 & 131072) != 0 ? recentlyPlayed2.megaPrize : i7, (i10 & 262144) != 0 ? recentlyPlayed2.winningPercentage : i8);
    }

    public final String component1() {
        return this._id;
    }

    public final int component10() {
        return this.matchStatus;
    }

    public final Venue component11() {
        return this.venue;
    }

    public final Result component12() {
        return this.result;
    }

    public final Team1 component13() {
        return this.team1;
    }

    public final Team2 component14() {
        return this.team2;
    }

    public final int component15() {
        return this.participants;
    }

    public final int component16() {
        return this.youWon;
    }

    public final int component17() {
        return this.myFantasyTeamCount;
    }

    public final int component18() {
        return this.megaPrize;
    }

    public final int component19() {
        return this.winningPercentage;
    }

    public final LivescoresInfo component2() {
        return this.livescoresInfo;
    }

    public final String component3() {
        return this.key;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.shortName;
    }

    public final String component7() {
        return this.format;
    }

    public final int component8() {
        return this.startAtIST;
    }

    public final int component9() {
        return this.estimatedEndDate;
    }

    public final RecentlyPlayed copy(String str, LivescoresInfo livescoresInfo2, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, Venue venue2, Result result2, Team1 team12, Team2 team22, int i4, int i5, int i6, int i7, int i8) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "_id");
        Intrinsics.checkNotNullParameter(livescoresInfo2, "livescoresInfo");
        Intrinsics.checkNotNullParameter(str2, "key");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(str5, "shortName");
        Intrinsics.checkNotNullParameter(str6, "format");
        Intrinsics.checkNotNullParameter(venue2, "venue");
        Intrinsics.checkNotNullParameter(result2, "result");
        Intrinsics.checkNotNullParameter(team12, "team1");
        Intrinsics.checkNotNullParameter(team22, "team2");
        return new RecentlyPlayed(str7, livescoresInfo2, str2, str3, str4, str5, str6, i, i2, i3, venue2, result2, team12, team22, i4, i5, i6, i7, i8);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecentlyPlayed)) {
            return false;
        }
        RecentlyPlayed recentlyPlayed = (RecentlyPlayed) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) recentlyPlayed._id) && Intrinsics.areEqual((Object) this.livescoresInfo, (Object) recentlyPlayed.livescoresInfo) && Intrinsics.areEqual((Object) this.key, (Object) recentlyPlayed.key) && Intrinsics.areEqual((Object) this.title, (Object) recentlyPlayed.title) && Intrinsics.areEqual((Object) this.name, (Object) recentlyPlayed.name) && Intrinsics.areEqual((Object) this.shortName, (Object) recentlyPlayed.shortName) && Intrinsics.areEqual((Object) this.format, (Object) recentlyPlayed.format) && this.startAtIST == recentlyPlayed.startAtIST && this.estimatedEndDate == recentlyPlayed.estimatedEndDate && this.matchStatus == recentlyPlayed.matchStatus && Intrinsics.areEqual((Object) this.venue, (Object) recentlyPlayed.venue) && Intrinsics.areEqual((Object) this.result, (Object) recentlyPlayed.result) && Intrinsics.areEqual((Object) this.team1, (Object) recentlyPlayed.team1) && Intrinsics.areEqual((Object) this.team2, (Object) recentlyPlayed.team2) && this.participants == recentlyPlayed.participants && this.youWon == recentlyPlayed.youWon && this.myFantasyTeamCount == recentlyPlayed.myFantasyTeamCount && this.megaPrize == recentlyPlayed.megaPrize && this.winningPercentage == recentlyPlayed.winningPercentage;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((this._id.hashCode() * 31) + this.livescoresInfo.hashCode()) * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.name.hashCode()) * 31) + this.shortName.hashCode()) * 31) + this.format.hashCode()) * 31) + this.startAtIST) * 31) + this.estimatedEndDate) * 31) + this.matchStatus) * 31) + this.venue.hashCode()) * 31) + this.result.hashCode()) * 31) + this.team1.hashCode()) * 31) + this.team2.hashCode()) * 31) + this.participants) * 31) + this.youWon) * 31) + this.myFantasyTeamCount) * 31) + this.megaPrize) * 31) + this.winningPercentage;
    }

    public String toString() {
        return "RecentlyPlayed(_id=" + this._id + ", livescoresInfo=" + this.livescoresInfo + ", key=" + this.key + ", title=" + this.title + ", name=" + this.name + ", shortName=" + this.shortName + ", format=" + this.format + ", startAtIST=" + this.startAtIST + ", estimatedEndDate=" + this.estimatedEndDate + ", matchStatus=" + this.matchStatus + ", venue=" + this.venue + ", result=" + this.result + ", team1=" + this.team1 + ", team2=" + this.team2 + ", participants=" + this.participants + ", youWon=" + this.youWon + ", myFantasyTeamCount=" + this.myFantasyTeamCount + ", megaPrize=" + this.megaPrize + ", winningPercentage=" + this.winningPercentage + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        this.livescoresInfo.writeToParcel(parcel, i);
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        parcel.writeString(this.name);
        parcel.writeString(this.shortName);
        parcel.writeString(this.format);
        parcel.writeInt(this.startAtIST);
        parcel.writeInt(this.estimatedEndDate);
        parcel.writeInt(this.matchStatus);
        this.venue.writeToParcel(parcel, i);
        this.result.writeToParcel(parcel, i);
        this.team1.writeToParcel(parcel, i);
        this.team2.writeToParcel(parcel, i);
        parcel.writeInt(this.participants);
        parcel.writeInt(this.youWon);
        parcel.writeInt(this.myFantasyTeamCount);
        parcel.writeInt(this.megaPrize);
        parcel.writeInt(this.winningPercentage);
    }

    public RecentlyPlayed(String str, LivescoresInfo livescoresInfo2, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, Venue venue2, Result result2, Team1 team12, Team2 team22, int i4, int i5, int i6, int i7, int i8) {
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        String str11 = str6;
        Venue venue3 = venue2;
        Result result3 = result2;
        Team1 team13 = team12;
        Team2 team23 = team22;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(livescoresInfo2, "livescoresInfo");
        Intrinsics.checkNotNullParameter(str7, "key");
        Intrinsics.checkNotNullParameter(str8, "title");
        Intrinsics.checkNotNullParameter(str9, "name");
        Intrinsics.checkNotNullParameter(str10, "shortName");
        Intrinsics.checkNotNullParameter(str11, "format");
        Intrinsics.checkNotNullParameter(venue3, "venue");
        Intrinsics.checkNotNullParameter(result3, "result");
        Intrinsics.checkNotNullParameter(team13, "team1");
        Intrinsics.checkNotNullParameter(team23, "team2");
        this._id = str;
        this.livescoresInfo = livescoresInfo2;
        this.key = str7;
        this.title = str8;
        this.name = str9;
        this.shortName = str10;
        this.format = str11;
        this.startAtIST = i;
        this.estimatedEndDate = i2;
        this.matchStatus = i3;
        this.venue = venue3;
        this.result = result3;
        this.team1 = team13;
        this.team2 = team23;
        this.participants = i4;
        this.youWon = i5;
        this.myFantasyTeamCount = i6;
        this.megaPrize = i7;
        this.winningPercentage = i8;
    }

    public final String get_id() {
        return this._id;
    }

    public final LivescoresInfo getLivescoresInfo() {
        return this.livescoresInfo;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final String getFormat() {
        return this.format;
    }

    public final int getStartAtIST() {
        return this.startAtIST;
    }

    public final int getEstimatedEndDate() {
        return this.estimatedEndDate;
    }

    public final int getMatchStatus() {
        return this.matchStatus;
    }

    public final Venue getVenue() {
        return this.venue;
    }

    public final Result getResult() {
        return this.result;
    }

    public final Team1 getTeam1() {
        return this.team1;
    }

    public final Team2 getTeam2() {
        return this.team2;
    }

    public final int getParticipants() {
        return this.participants;
    }

    public final int getYouWon() {
        return this.youWon;
    }

    public final int getMyFantasyTeamCount() {
        return this.myFantasyTeamCount;
    }

    public final int getMegaPrize() {
        return this.megaPrize;
    }

    public final int getWinningPercentage() {
        return this.winningPercentage;
    }
}
