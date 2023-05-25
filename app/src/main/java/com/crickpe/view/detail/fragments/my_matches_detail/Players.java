package com.crickpe.view.detail.fragments.my_matches_detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Team;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\t\u00107\u001a\u00020\u0011HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\t\u00109\u001a\u00020\u0015HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u001aHÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\bHÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J\t\u0010C\u001a\u00020\nHÆ\u0003J\t\u0010D\u001a\u00020\nHÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J³\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001J\t\u0010G\u001a\u00020HHÖ\u0001J\u0013\u0010I\u001a\u00020\n2\b\u0010J\u001a\u0004\u0018\u00010KHÖ\u0003J\t\u0010L\u001a\u00020HHÖ\u0001J\t\u0010M\u001a\u00020\u0003HÖ\u0001J\u0019\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020HHÖ\u0001R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001dR\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001dR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001dR\u0016\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\"R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010\u0019\u001a\u00020\u001a8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\u001d¨\u0006S"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/Players;", "Landroid/os/Parcelable;", "teamId", "", "playerId", "teamKey", "playerKey", "role", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Role;", "captain", "", "keeper", "playing_xi", "_id", "fantasyPoints", "", "matchFantasyPoints", "Lcom/crickpe/view/detail/fragments/my_matches_detail/MatchFantasyPoints;", "player", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Player;", "amount", "", "imageUrl", "name", "batting_style", "team", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/my_matches_detail/Role;ZZZLjava/lang/String;FLcom/crickpe/view/detail/fragments/my_matches_detail/MatchFantasyPoints;Lcom/crickpe/view/detail/fragments/my_matches_detail/Player;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;)V", "get_id", "()Ljava/lang/String;", "getAmount", "()D", "getBatting_style", "getCaptain", "()Z", "getFantasyPoints", "()F", "getImageUrl", "getKeeper", "getMatchFantasyPoints", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/MatchFantasyPoints;", "getName", "getPlayer", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/Player;", "getPlayerId", "getPlayerKey", "getPlaying_xi", "getRole", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/Role;", "getTeam", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;", "getTeamId", "getTeamKey", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersPotModel.kt */
public final class Players implements Parcelable {
    public static final Parcelable.Creator<Players> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("amount")
    private final double amount;
    @SerializedName("batting_style")
    private final String batting_style;
    @SerializedName("captain")
    private final boolean captain;
    @SerializedName("fantasyPoints")
    private final float fantasyPoints;
    @SerializedName("imageUrl")
    private final String imageUrl;
    @SerializedName("keeper")
    private final boolean keeper;
    @SerializedName("matchFantasyPoints")
    private final MatchFantasyPoints matchFantasyPoints;
    @SerializedName("name")
    private final String name;
    @SerializedName("player")
    private final Player player;
    @SerializedName("playerId")
    private final String playerId;
    @SerializedName("playerKey")
    private final String playerKey;
    @SerializedName("playing_xi")
    private final boolean playing_xi;
    @SerializedName("role")
    private final Role role;
    @SerializedName("team")
    private final Team team;
    @SerializedName("teamId")
    private final String teamId;
    @SerializedName("teamKey")
    private final String teamKey;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersPotModel.kt */
    public static final class Creator implements Parcelable.Creator<Players> {
        public final Players createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            return new Players(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), Role.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readFloat(), MatchFantasyPoints.CREATOR.createFromParcel(parcel2), Player.CREATOR.createFromParcel(parcel2), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), Team.CREATOR.createFromParcel(parcel2));
        }

        public final Players[] newArray(int i) {
            return new Players[i];
        }
    }

    public static /* synthetic */ Players copy$default(Players players, String str, String str2, String str3, String str4, Role role2, boolean z, boolean z2, boolean z3, String str5, float f, MatchFantasyPoints matchFantasyPoints2, Player player2, double d, String str6, String str7, String str8, Team team2, int i, Object obj) {
        Players players2 = players;
        int i2 = i;
        return players.copy((i2 & 1) != 0 ? players2.teamId : str, (i2 & 2) != 0 ? players2.playerId : str2, (i2 & 4) != 0 ? players2.teamKey : str3, (i2 & 8) != 0 ? players2.playerKey : str4, (i2 & 16) != 0 ? players2.role : role2, (i2 & 32) != 0 ? players2.captain : z, (i2 & 64) != 0 ? players2.keeper : z2, (i2 & 128) != 0 ? players2.playing_xi : z3, (i2 & 256) != 0 ? players2._id : str5, (i2 & 512) != 0 ? players2.fantasyPoints : f, (i2 & 1024) != 0 ? players2.matchFantasyPoints : matchFantasyPoints2, (i2 & 2048) != 0 ? players2.player : player2, (i2 & 4096) != 0 ? players2.amount : d, (i2 & 8192) != 0 ? players2.imageUrl : str6, (i2 & 16384) != 0 ? players2.name : str7, (i2 & 32768) != 0 ? players2.batting_style : str8, (i2 & 65536) != 0 ? players2.team : team2);
    }

    public final String component1() {
        return this.teamId;
    }

    public final float component10() {
        return this.fantasyPoints;
    }

    public final MatchFantasyPoints component11() {
        return this.matchFantasyPoints;
    }

    public final Player component12() {
        return this.player;
    }

    public final double component13() {
        return this.amount;
    }

    public final String component14() {
        return this.imageUrl;
    }

    public final String component15() {
        return this.name;
    }

    public final String component16() {
        return this.batting_style;
    }

    public final Team component17() {
        return this.team;
    }

    public final String component2() {
        return this.playerId;
    }

    public final String component3() {
        return this.teamKey;
    }

    public final String component4() {
        return this.playerKey;
    }

    public final Role component5() {
        return this.role;
    }

    public final boolean component6() {
        return this.captain;
    }

    public final boolean component7() {
        return this.keeper;
    }

    public final boolean component8() {
        return this.playing_xi;
    }

    public final String component9() {
        return this._id;
    }

    public final Players copy(String str, String str2, String str3, String str4, Role role2, boolean z, boolean z2, boolean z3, String str5, float f, MatchFantasyPoints matchFantasyPoints2, Player player2, double d, String str6, String str7, String str8, Team team2) {
        String str9 = str;
        Intrinsics.checkNotNullParameter(str9, "teamId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        Intrinsics.checkNotNullParameter(str3, "teamKey");
        Intrinsics.checkNotNullParameter(str4, "playerKey");
        Intrinsics.checkNotNullParameter(role2, "role");
        Intrinsics.checkNotNullParameter(str5, "_id");
        Intrinsics.checkNotNullParameter(matchFantasyPoints2, "matchFantasyPoints");
        Intrinsics.checkNotNullParameter(player2, "player");
        Intrinsics.checkNotNullParameter(str6, "imageUrl");
        Intrinsics.checkNotNullParameter(str7, "name");
        Intrinsics.checkNotNullParameter(str8, "batting_style");
        Intrinsics.checkNotNullParameter(team2, "team");
        return new Players(str9, str2, str3, str4, role2, z, z2, z3, str5, f, matchFantasyPoints2, player2, d, str6, str7, str8, team2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Players)) {
            return false;
        }
        Players players = (Players) obj;
        return Intrinsics.areEqual((Object) this.teamId, (Object) players.teamId) && Intrinsics.areEqual((Object) this.playerId, (Object) players.playerId) && Intrinsics.areEqual((Object) this.teamKey, (Object) players.teamKey) && Intrinsics.areEqual((Object) this.playerKey, (Object) players.playerKey) && Intrinsics.areEqual((Object) this.role, (Object) players.role) && this.captain == players.captain && this.keeper == players.keeper && this.playing_xi == players.playing_xi && Intrinsics.areEqual((Object) this._id, (Object) players._id) && Intrinsics.areEqual((Object) Float.valueOf(this.fantasyPoints), (Object) Float.valueOf(players.fantasyPoints)) && Intrinsics.areEqual((Object) this.matchFantasyPoints, (Object) players.matchFantasyPoints) && Intrinsics.areEqual((Object) this.player, (Object) players.player) && Intrinsics.areEqual((Object) Double.valueOf(this.amount), (Object) Double.valueOf(players.amount)) && Intrinsics.areEqual((Object) this.imageUrl, (Object) players.imageUrl) && Intrinsics.areEqual((Object) this.name, (Object) players.name) && Intrinsics.areEqual((Object) this.batting_style, (Object) players.batting_style) && Intrinsics.areEqual((Object) this.team, (Object) players.team);
    }

    public int hashCode() {
        int hashCode = ((((((((this.teamId.hashCode() * 31) + this.playerId.hashCode()) * 31) + this.teamKey.hashCode()) * 31) + this.playerKey.hashCode()) * 31) + this.role.hashCode()) * 31;
        boolean z = this.captain;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.keeper;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.playing_xi;
        if (!z4) {
            z2 = z4;
        }
        return ((((((((((((((((((i2 + (z2 ? 1 : 0)) * 31) + this._id.hashCode()) * 31) + Float.floatToIntBits(this.fantasyPoints)) * 31) + this.matchFantasyPoints.hashCode()) * 31) + this.player.hashCode()) * 31) + Double.doubleToLongBits(this.amount)) * 31) + this.imageUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.batting_style.hashCode()) * 31) + this.team.hashCode();
    }

    public String toString() {
        return "Players(teamId=" + this.teamId + ", playerId=" + this.playerId + ", teamKey=" + this.teamKey + ", playerKey=" + this.playerKey + ", role=" + this.role + ", captain=" + this.captain + ", keeper=" + this.keeper + ", playing_xi=" + this.playing_xi + ", _id=" + this._id + ", fantasyPoints=" + this.fantasyPoints + ", matchFantasyPoints=" + this.matchFantasyPoints + ", player=" + this.player + ", amount=" + this.amount + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", batting_style=" + this.batting_style + ", team=" + this.team + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.teamId);
        parcel.writeString(this.playerId);
        parcel.writeString(this.teamKey);
        parcel.writeString(this.playerKey);
        this.role.writeToParcel(parcel, i);
        parcel.writeInt(this.captain ? 1 : 0);
        parcel.writeInt(this.keeper ? 1 : 0);
        parcel.writeInt(this.playing_xi ? 1 : 0);
        parcel.writeString(this._id);
        parcel.writeFloat(this.fantasyPoints);
        this.matchFantasyPoints.writeToParcel(parcel, i);
        this.player.writeToParcel(parcel, i);
        parcel.writeDouble(this.amount);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.batting_style);
        this.team.writeToParcel(parcel, i);
    }

    public Players(String str, String str2, String str3, String str4, Role role2, boolean z, boolean z2, boolean z3, String str5, float f, MatchFantasyPoints matchFantasyPoints2, Player player2, double d, String str6, String str7, String str8, Team team2) {
        String str9 = str2;
        String str10 = str3;
        String str11 = str4;
        Role role3 = role2;
        String str12 = str5;
        MatchFantasyPoints matchFantasyPoints3 = matchFantasyPoints2;
        Player player3 = player2;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        Team team3 = team2;
        Intrinsics.checkNotNullParameter(str, "teamId");
        Intrinsics.checkNotNullParameter(str9, "playerId");
        Intrinsics.checkNotNullParameter(str10, "teamKey");
        Intrinsics.checkNotNullParameter(str11, "playerKey");
        Intrinsics.checkNotNullParameter(role3, "role");
        Intrinsics.checkNotNullParameter(str12, "_id");
        Intrinsics.checkNotNullParameter(matchFantasyPoints3, "matchFantasyPoints");
        Intrinsics.checkNotNullParameter(player3, "player");
        Intrinsics.checkNotNullParameter(str13, "imageUrl");
        Intrinsics.checkNotNullParameter(str14, "name");
        Intrinsics.checkNotNullParameter(str15, "batting_style");
        Intrinsics.checkNotNullParameter(team3, "team");
        this.teamId = str;
        this.playerId = str9;
        this.teamKey = str10;
        this.playerKey = str11;
        this.role = role3;
        this.captain = z;
        this.keeper = z2;
        this.playing_xi = z3;
        this._id = str12;
        this.fantasyPoints = f;
        this.matchFantasyPoints = matchFantasyPoints3;
        this.player = player3;
        this.amount = d;
        this.imageUrl = str13;
        this.name = str14;
        this.batting_style = str15;
        this.team = team3;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final String getTeamKey() {
        return this.teamKey;
    }

    public final String getPlayerKey() {
        return this.playerKey;
    }

    public final Role getRole() {
        return this.role;
    }

    public final boolean getCaptain() {
        return this.captain;
    }

    public final boolean getKeeper() {
        return this.keeper;
    }

    public final boolean getPlaying_xi() {
        return this.playing_xi;
    }

    public final String get_id() {
        return this._id;
    }

    public final float getFantasyPoints() {
        return this.fantasyPoints;
    }

    public final MatchFantasyPoints getMatchFantasyPoints() {
        return this.matchFantasyPoints;
    }

    public final Player getPlayer() {
        return this.player;
    }

    public final double getAmount() {
        return this.amount;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getBatting_style() {
        return this.batting_style;
    }

    public final Team getTeam() {
        return this.team;
    }
}
