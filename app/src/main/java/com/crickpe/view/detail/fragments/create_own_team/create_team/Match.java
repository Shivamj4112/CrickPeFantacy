package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.home.fragments.home.Team1;
import com.crickpe.view.home.fragments.home.Team2;
import com.crickpe.view.home.fragments.home.Venue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u000eHÆ\u0003JY\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+HÖ\u0003J\t\u0010,\u001a\u00020'HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\u0019\u0010.\u001a\u00020/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020'HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00063"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Match;", "Landroid/os/Parcelable;", "_id", "", "matchDesc", "matchFormat", "matchType", "venue", "Lcom/crickpe/view/home/fragments/home/Venue;", "team1", "Lcom/crickpe/view/home/fragments/home/Team1;", "team2", "Lcom/crickpe/view/home/fragments/home/Team2;", "playing_xi", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/DataReview;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/home/fragments/home/Venue;Lcom/crickpe/view/home/fragments/home/Team1;Lcom/crickpe/view/home/fragments/home/Team2;Lcom/crickpe/view/detail/fragments/create_own_team/create_team/DataReview;)V", "get_id", "()Ljava/lang/String;", "getMatchDesc", "getMatchFormat", "getMatchType", "getPlaying_xi", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/DataReview;", "getTeam1", "()Lcom/crickpe/view/home/fragments/home/Team1;", "getTeam2", "()Lcom/crickpe/view/home/fragments/home/Team2;", "getVenue", "()Lcom/crickpe/view/home/fragments/home/Venue;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersModel.kt */
public final class Match implements Parcelable {
    public static final Parcelable.Creator<Match> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("matchDesc")
    private final String matchDesc;
    @SerializedName("matchFormat")
    private final String matchFormat;
    @SerializedName("matchType")
    private final String matchType;
    @SerializedName("playing_xi")
    private final DataReview playing_xi;
    @SerializedName("team1")
    private final Team1 team1;
    @SerializedName("team2")
    private final Team2 team2;
    @SerializedName("venue")
    private final Venue venue;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersModel.kt */
    public static final class Creator implements Parcelable.Creator<Match> {
        public final Match createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Match(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Venue.CREATOR.createFromParcel(parcel), Team1.CREATOR.createFromParcel(parcel), Team2.CREATOR.createFromParcel(parcel), DataReview.CREATOR.createFromParcel(parcel));
        }

        public final Match[] newArray(int i) {
            return new Match[i];
        }
    }

    public static /* synthetic */ Match copy$default(Match match, String str, String str2, String str3, String str4, Venue venue2, Team1 team12, Team2 team22, DataReview dataReview, int i, Object obj) {
        Match match2 = match;
        int i2 = i;
        return match.copy((i2 & 1) != 0 ? match2._id : str, (i2 & 2) != 0 ? match2.matchDesc : str2, (i2 & 4) != 0 ? match2.matchFormat : str3, (i2 & 8) != 0 ? match2.matchType : str4, (i2 & 16) != 0 ? match2.venue : venue2, (i2 & 32) != 0 ? match2.team1 : team12, (i2 & 64) != 0 ? match2.team2 : team22, (i2 & 128) != 0 ? match2.playing_xi : dataReview);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.matchDesc;
    }

    public final String component3() {
        return this.matchFormat;
    }

    public final String component4() {
        return this.matchType;
    }

    public final Venue component5() {
        return this.venue;
    }

    public final Team1 component6() {
        return this.team1;
    }

    public final Team2 component7() {
        return this.team2;
    }

    public final DataReview component8() {
        return this.playing_xi;
    }

    public final Match copy(String str, String str2, String str3, String str4, Venue venue2, Team1 team12, Team2 team22, DataReview dataReview) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchDesc");
        Intrinsics.checkNotNullParameter(str3, "matchFormat");
        Intrinsics.checkNotNullParameter(str4, "matchType");
        Intrinsics.checkNotNullParameter(venue2, "venue");
        Team1 team13 = team12;
        Intrinsics.checkNotNullParameter(team13, "team1");
        Team2 team23 = team22;
        Intrinsics.checkNotNullParameter(team23, "team2");
        DataReview dataReview2 = dataReview;
        Intrinsics.checkNotNullParameter(dataReview2, "playing_xi");
        return new Match(str, str2, str3, str4, venue2, team13, team23, dataReview2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Match)) {
            return false;
        }
        Match match = (Match) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) match._id) && Intrinsics.areEqual((Object) this.matchDesc, (Object) match.matchDesc) && Intrinsics.areEqual((Object) this.matchFormat, (Object) match.matchFormat) && Intrinsics.areEqual((Object) this.matchType, (Object) match.matchType) && Intrinsics.areEqual((Object) this.venue, (Object) match.venue) && Intrinsics.areEqual((Object) this.team1, (Object) match.team1) && Intrinsics.areEqual((Object) this.team2, (Object) match.team2) && Intrinsics.areEqual((Object) this.playing_xi, (Object) match.playing_xi);
    }

    public int hashCode() {
        return (((((((((((((this._id.hashCode() * 31) + this.matchDesc.hashCode()) * 31) + this.matchFormat.hashCode()) * 31) + this.matchType.hashCode()) * 31) + this.venue.hashCode()) * 31) + this.team1.hashCode()) * 31) + this.team2.hashCode()) * 31) + this.playing_xi.hashCode();
    }

    public String toString() {
        return "Match(_id=" + this._id + ", matchDesc=" + this.matchDesc + ", matchFormat=" + this.matchFormat + ", matchType=" + this.matchType + ", venue=" + this.venue + ", team1=" + this.team1 + ", team2=" + this.team2 + ", playing_xi=" + this.playing_xi + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.matchDesc);
        parcel.writeString(this.matchFormat);
        parcel.writeString(this.matchType);
        this.venue.writeToParcel(parcel, i);
        this.team1.writeToParcel(parcel, i);
        this.team2.writeToParcel(parcel, i);
        this.playing_xi.writeToParcel(parcel, i);
    }

    public Match(String str, String str2, String str3, String str4, Venue venue2, Team1 team12, Team2 team22, DataReview dataReview) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchDesc");
        Intrinsics.checkNotNullParameter(str3, "matchFormat");
        Intrinsics.checkNotNullParameter(str4, "matchType");
        Intrinsics.checkNotNullParameter(venue2, "venue");
        Intrinsics.checkNotNullParameter(team12, "team1");
        Intrinsics.checkNotNullParameter(team22, "team2");
        Intrinsics.checkNotNullParameter(dataReview, "playing_xi");
        this._id = str;
        this.matchDesc = str2;
        this.matchFormat = str3;
        this.matchType = str4;
        this.venue = venue2;
        this.team1 = team12;
        this.team2 = team22;
        this.playing_xi = dataReview;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getMatchDesc() {
        return this.matchDesc;
    }

    public final String getMatchFormat() {
        return this.matchFormat;
    }

    public final String getMatchType() {
        return this.matchType;
    }

    public final Venue getVenue() {
        return this.venue;
    }

    public final Team1 getTeam1() {
        return this.team1;
    }

    public final Team2 getTeam2() {
        return this.team2;
    }

    public final DataReview getPlaying_xi() {
        return this.playing_xi;
    }
}
