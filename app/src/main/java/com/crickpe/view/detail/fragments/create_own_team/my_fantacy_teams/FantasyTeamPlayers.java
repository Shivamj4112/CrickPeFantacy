package com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Team;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bH\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0005\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\f\u0012\u0006\u0010#\u001a\u00020\f\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0010(\u001a\u00020)¢\u0006\u0002\u0010*J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0003HÆ\u0003J\t\u0010R\u001a\u00020\u0012HÆ\u0003J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0017HÆ\u0003J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u001dHÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\t\u0010`\u001a\u00020\fHÆ\u0003J\t\u0010a\u001a\u00020\fHÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\t\u0010d\u001a\u00020\u0003HÆ\u0003J\t\u0010e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aHÆ\u0003J\t\u0010g\u001a\u00020)HÆ\u0003J\t\u0010h\u001a\u00020\bHÆ\u0003J\t\u0010i\u001a\u00020\u0003HÆ\u0003J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\fHÆ\u0003J\t\u0010l\u001a\u00020\fHÆ\u0003J\t\u0010m\u001a\u00020\u0003HÆ\u0003JÑ\u0002\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00052\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\f2\b\b\u0002\u0010#\u001a\u00020\f2\b\b\u0002\u0010$\u001a\u00020\u00032\b\b\u0002\u0010%\u001a\u00020\u00032\b\b\u0002\u0010&\u001a\u00020\u00032\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a2\b\b\u0002\u0010(\u001a\u00020)HÆ\u0001J\t\u0010o\u001a\u00020\u0005HÖ\u0001J\u0013\u0010p\u001a\u00020\f2\b\u0010q\u001a\u0004\u0018\u00010rHÖ\u0003J\t\u0010s\u001a\u00020\u0005HÖ\u0001J\t\u0010t\u001a\u00020\u0003HÖ\u0001J\u0019\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020x2\u0006\u0010y\u001a\u00020\u0005HÖ\u0001R\u0016\u0010&\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0016\u0010\u001b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0016\u0010$\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010,R\u0016\u0010!\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00103R\u0016\u0010\u0015\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0016\u0010\u001f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0016\u0010\"\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u00108R\u0016\u0010#\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u00108R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u00108R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u00108R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010,R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010,R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010,R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010,R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010,R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u00106R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010,R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u0010,R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010ER\u0016\u0010(\u001a\u00020)8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010,R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010ER\u0016\u0010 \u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00106R\u0016\u0010%\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010,R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010,¨\u0006z"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamPlayers;", "Landroid/os/Parcelable;", "userId", "", "roleId", "", "roleName", "fantasyPoints", "", "teamId", "playerId", "isFantasyCaptain", "", "isFantasyViceCaptain", "_id", "key", "name", "role", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Role;", "jersey_name", "legal_name", "gender", "nationality", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Nationality;", "seasonalRole", "roles", "", "batting_style", "bowling_style", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Bowling_style;", "skills", "imageUrl", "totalEarning", "creditPoints", "isBlocked", "isDeleted", "createdAt", "updatedAt", "__v", "teams", "team", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;", "(Ljava/lang/String;ILjava/lang/String;FLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Role;Ljava/lang/String;Ljava/lang/String;ILcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Nationality;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Bowling_style;Ljava/util/List;Ljava/lang/String;IFZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;)V", "get__v", "()Ljava/lang/String;", "get_id", "getBatting_style", "getBowling_style", "()Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Bowling_style;", "getCreatedAt", "getCreditPoints", "()F", "getFantasyPoints", "getGender", "()I", "getImageUrl", "()Z", "getJersey_name", "getKey", "getLegal_name", "getName", "getNationality", "()Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Nationality;", "getPlayerId", "getRole", "()Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/Role;", "getRoleId", "getRoleName", "getRoles", "()Ljava/util/List;", "getSeasonalRole", "getSkills", "getTeam", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;", "getTeamId", "getTeams", "getTotalEarning", "getUpdatedAt", "getUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: FantasyTeamListModel.kt */
public final class FantasyTeamPlayers implements Parcelable {
    public static final Parcelable.Creator<FantasyTeamPlayers> CREATOR = new Creator();
    @SerializedName("__v")
    private final String __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("batting_style")
    private final String batting_style;
    @SerializedName("bowling_style")
    private final Bowling_style bowling_style;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("creditPoints")
    private final float creditPoints;
    @SerializedName("fantasyPoints")
    private final float fantasyPoints;
    @SerializedName("gender")
    private final int gender;
    @SerializedName("imageUrl")
    private final String imageUrl;
    @SerializedName("isBlocked")
    private final boolean isBlocked;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("isFantasyCaptain")
    private final boolean isFantasyCaptain;
    @SerializedName("isFantasyViceCaptain")
    private final boolean isFantasyViceCaptain;
    @SerializedName("jersey_name")
    private final String jersey_name;
    @SerializedName("key")
    private final String key;
    @SerializedName("legal_name")
    private final String legal_name;
    @SerializedName("name")
    private final String name;
    @SerializedName("nationality")
    private final Nationality nationality;
    @SerializedName("playerId")
    private final String playerId;
    @SerializedName("role")
    private final Role role;
    @SerializedName("roleId")
    private final int roleId;
    @SerializedName("roleName")
    private final String roleName;
    @SerializedName("roles")
    private final List<String> roles;
    @SerializedName("seasonalRole")
    private final String seasonalRole;
    @SerializedName("skills")
    private final List<String> skills;
    @SerializedName("team")
    private final Team team;
    @SerializedName("teamId")
    private final String teamId;
    @SerializedName("teams")
    private final List<String> teams;
    @SerializedName("totalEarning")
    private final int totalEarning;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("userId")
    private final String userId;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: FantasyTeamListModel.kt */
    public static final class Creator implements Parcelable.Creator<FantasyTeamPlayers> {
        public final FantasyTeamPlayers createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            return new FantasyTeamPlayers(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readFloat(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), Role.CREATOR.createFromParcel(parcel2), parcel.readString(), parcel.readString(), parcel.readInt(), Nationality.CREATOR.createFromParcel(parcel2), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), Bowling_style.CREATOR.createFromParcel(parcel2), parcel.createStringArrayList(), parcel.readString(), parcel.readInt(), parcel.readFloat(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), Team.CREATOR.createFromParcel(parcel2));
        }

        public final FantasyTeamPlayers[] newArray(int i) {
            return new FantasyTeamPlayers[i];
        }
    }

    public static /* synthetic */ FantasyTeamPlayers copy$default(FantasyTeamPlayers fantasyTeamPlayers, String str, int i, String str2, float f, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, Role role2, String str8, String str9, int i2, Nationality nationality2, String str10, List list, String str11, Bowling_style bowling_style2, List list2, String str12, int i3, float f2, boolean z3, boolean z4, String str13, String str14, String str15, List list3, Team team2, int i4, Object obj) {
        FantasyTeamPlayers fantasyTeamPlayers2 = fantasyTeamPlayers;
        int i5 = i4;
        return fantasyTeamPlayers.copy((i5 & 1) != 0 ? fantasyTeamPlayers2.userId : str, (i5 & 2) != 0 ? fantasyTeamPlayers2.roleId : i, (i5 & 4) != 0 ? fantasyTeamPlayers2.roleName : str2, (i5 & 8) != 0 ? fantasyTeamPlayers2.fantasyPoints : f, (i5 & 16) != 0 ? fantasyTeamPlayers2.teamId : str3, (i5 & 32) != 0 ? fantasyTeamPlayers2.playerId : str4, (i5 & 64) != 0 ? fantasyTeamPlayers2.isFantasyCaptain : z, (i5 & 128) != 0 ? fantasyTeamPlayers2.isFantasyViceCaptain : z2, (i5 & 256) != 0 ? fantasyTeamPlayers2._id : str5, (i5 & 512) != 0 ? fantasyTeamPlayers2.key : str6, (i5 & 1024) != 0 ? fantasyTeamPlayers2.name : str7, (i5 & 2048) != 0 ? fantasyTeamPlayers2.role : role2, (i5 & 4096) != 0 ? fantasyTeamPlayers2.jersey_name : str8, (i5 & 8192) != 0 ? fantasyTeamPlayers2.legal_name : str9, (i5 & 16384) != 0 ? fantasyTeamPlayers2.gender : i2, (i5 & 32768) != 0 ? fantasyTeamPlayers2.nationality : nationality2, (i5 & 65536) != 0 ? fantasyTeamPlayers2.seasonalRole : str10, (i5 & 131072) != 0 ? fantasyTeamPlayers2.roles : list, (i5 & 262144) != 0 ? fantasyTeamPlayers2.batting_style : str11, (i5 & 524288) != 0 ? fantasyTeamPlayers2.bowling_style : bowling_style2, (i5 & 1048576) != 0 ? fantasyTeamPlayers2.skills : list2, (i5 & 2097152) != 0 ? fantasyTeamPlayers2.imageUrl : str12, (i5 & 4194304) != 0 ? fantasyTeamPlayers2.totalEarning : i3, (i5 & 8388608) != 0 ? fantasyTeamPlayers2.creditPoints : f2, (i5 & 16777216) != 0 ? fantasyTeamPlayers2.isBlocked : z3, (i5 & 33554432) != 0 ? fantasyTeamPlayers2.isDeleted : z4, (i5 & 67108864) != 0 ? fantasyTeamPlayers2.createdAt : str13, (i5 & 134217728) != 0 ? fantasyTeamPlayers2.updatedAt : str14, (i5 & 268435456) != 0 ? fantasyTeamPlayers2.__v : str15, (i5 & 536870912) != 0 ? fantasyTeamPlayers2.teams : list3, (i5 & BasicMeasure.EXACTLY) != 0 ? fantasyTeamPlayers2.team : team2);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component10() {
        return this.key;
    }

    public final String component11() {
        return this.name;
    }

    public final Role component12() {
        return this.role;
    }

    public final String component13() {
        return this.jersey_name;
    }

    public final String component14() {
        return this.legal_name;
    }

    public final int component15() {
        return this.gender;
    }

    public final Nationality component16() {
        return this.nationality;
    }

    public final String component17() {
        return this.seasonalRole;
    }

    public final List<String> component18() {
        return this.roles;
    }

    public final String component19() {
        return this.batting_style;
    }

    public final int component2() {
        return this.roleId;
    }

    public final Bowling_style component20() {
        return this.bowling_style;
    }

    public final List<String> component21() {
        return this.skills;
    }

    public final String component22() {
        return this.imageUrl;
    }

    public final int component23() {
        return this.totalEarning;
    }

    public final float component24() {
        return this.creditPoints;
    }

    public final boolean component25() {
        return this.isBlocked;
    }

    public final boolean component26() {
        return this.isDeleted;
    }

    public final String component27() {
        return this.createdAt;
    }

    public final String component28() {
        return this.updatedAt;
    }

    public final String component29() {
        return this.__v;
    }

    public final String component3() {
        return this.roleName;
    }

    public final List<String> component30() {
        return this.teams;
    }

    public final Team component31() {
        return this.team;
    }

    public final float component4() {
        return this.fantasyPoints;
    }

    public final String component5() {
        return this.teamId;
    }

    public final String component6() {
        return this.playerId;
    }

    public final boolean component7() {
        return this.isFantasyCaptain;
    }

    public final boolean component8() {
        return this.isFantasyViceCaptain;
    }

    public final String component9() {
        return this._id;
    }

    public final FantasyTeamPlayers copy(String str, int i, String str2, float f, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, Role role2, String str8, String str9, int i2, Nationality nationality2, String str10, List<String> list, String str11, Bowling_style bowling_style2, List<String> list2, String str12, int i3, float f2, boolean z3, boolean z4, String str13, String str14, String str15, List<String> list3, Team team2) {
        String str16 = str;
        Intrinsics.checkNotNullParameter(str16, "userId");
        Intrinsics.checkNotNullParameter(str2, "roleName");
        Intrinsics.checkNotNullParameter(str3, "teamId");
        Intrinsics.checkNotNullParameter(str4, "playerId");
        Intrinsics.checkNotNullParameter(str5, "_id");
        Intrinsics.checkNotNullParameter(str6, "key");
        Intrinsics.checkNotNullParameter(str7, "name");
        Intrinsics.checkNotNullParameter(role2, "role");
        Intrinsics.checkNotNullParameter(str8, "jersey_name");
        Intrinsics.checkNotNullParameter(str9, "legal_name");
        Intrinsics.checkNotNullParameter(nationality2, "nationality");
        Intrinsics.checkNotNullParameter(str10, "seasonalRole");
        Intrinsics.checkNotNullParameter(list, "roles");
        Intrinsics.checkNotNullParameter(str11, "batting_style");
        Intrinsics.checkNotNullParameter(bowling_style2, "bowling_style");
        Intrinsics.checkNotNullParameter(list2, "skills");
        Intrinsics.checkNotNullParameter(str12, "imageUrl");
        Intrinsics.checkNotNullParameter(str13, "createdAt");
        Intrinsics.checkNotNullParameter(str14, "updatedAt");
        Intrinsics.checkNotNullParameter(str15, "__v");
        Intrinsics.checkNotNullParameter(list3, "teams");
        Intrinsics.checkNotNullParameter(team2, "team");
        return new FantasyTeamPlayers(str16, i, str2, f, str3, str4, z, z2, str5, str6, str7, role2, str8, str9, i2, nationality2, str10, list, str11, bowling_style2, list2, str12, i3, f2, z3, z4, str13, str14, str15, list3, team2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyTeamPlayers)) {
            return false;
        }
        FantasyTeamPlayers fantasyTeamPlayers = (FantasyTeamPlayers) obj;
        return Intrinsics.areEqual((Object) this.userId, (Object) fantasyTeamPlayers.userId) && this.roleId == fantasyTeamPlayers.roleId && Intrinsics.areEqual((Object) this.roleName, (Object) fantasyTeamPlayers.roleName) && Intrinsics.areEqual((Object) Float.valueOf(this.fantasyPoints), (Object) Float.valueOf(fantasyTeamPlayers.fantasyPoints)) && Intrinsics.areEqual((Object) this.teamId, (Object) fantasyTeamPlayers.teamId) && Intrinsics.areEqual((Object) this.playerId, (Object) fantasyTeamPlayers.playerId) && this.isFantasyCaptain == fantasyTeamPlayers.isFantasyCaptain && this.isFantasyViceCaptain == fantasyTeamPlayers.isFantasyViceCaptain && Intrinsics.areEqual((Object) this._id, (Object) fantasyTeamPlayers._id) && Intrinsics.areEqual((Object) this.key, (Object) fantasyTeamPlayers.key) && Intrinsics.areEqual((Object) this.name, (Object) fantasyTeamPlayers.name) && Intrinsics.areEqual((Object) this.role, (Object) fantasyTeamPlayers.role) && Intrinsics.areEqual((Object) this.jersey_name, (Object) fantasyTeamPlayers.jersey_name) && Intrinsics.areEqual((Object) this.legal_name, (Object) fantasyTeamPlayers.legal_name) && this.gender == fantasyTeamPlayers.gender && Intrinsics.areEqual((Object) this.nationality, (Object) fantasyTeamPlayers.nationality) && Intrinsics.areEqual((Object) this.seasonalRole, (Object) fantasyTeamPlayers.seasonalRole) && Intrinsics.areEqual((Object) this.roles, (Object) fantasyTeamPlayers.roles) && Intrinsics.areEqual((Object) this.batting_style, (Object) fantasyTeamPlayers.batting_style) && Intrinsics.areEqual((Object) this.bowling_style, (Object) fantasyTeamPlayers.bowling_style) && Intrinsics.areEqual((Object) this.skills, (Object) fantasyTeamPlayers.skills) && Intrinsics.areEqual((Object) this.imageUrl, (Object) fantasyTeamPlayers.imageUrl) && this.totalEarning == fantasyTeamPlayers.totalEarning && Intrinsics.areEqual((Object) Float.valueOf(this.creditPoints), (Object) Float.valueOf(fantasyTeamPlayers.creditPoints)) && this.isBlocked == fantasyTeamPlayers.isBlocked && this.isDeleted == fantasyTeamPlayers.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) fantasyTeamPlayers.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) fantasyTeamPlayers.updatedAt) && Intrinsics.areEqual((Object) this.__v, (Object) fantasyTeamPlayers.__v) && Intrinsics.areEqual((Object) this.teams, (Object) fantasyTeamPlayers.teams) && Intrinsics.areEqual((Object) this.team, (Object) fantasyTeamPlayers.team);
    }

    public int hashCode() {
        int hashCode = ((((((((((this.userId.hashCode() * 31) + this.roleId) * 31) + this.roleName.hashCode()) * 31) + Float.floatToIntBits(this.fantasyPoints)) * 31) + this.teamId.hashCode()) * 31) + this.playerId.hashCode()) * 31;
        boolean z = this.isFantasyCaptain;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isFantasyViceCaptain;
        if (z3) {
            z3 = true;
        }
        int hashCode2 = (((((((((((((((((((((((((((((((((i + (z3 ? 1 : 0)) * 31) + this._id.hashCode()) * 31) + this.key.hashCode()) * 31) + this.name.hashCode()) * 31) + this.role.hashCode()) * 31) + this.jersey_name.hashCode()) * 31) + this.legal_name.hashCode()) * 31) + this.gender) * 31) + this.nationality.hashCode()) * 31) + this.seasonalRole.hashCode()) * 31) + this.roles.hashCode()) * 31) + this.batting_style.hashCode()) * 31) + this.bowling_style.hashCode()) * 31) + this.skills.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.totalEarning) * 31) + Float.floatToIntBits(this.creditPoints)) * 31;
        boolean z4 = this.isBlocked;
        if (z4) {
            z4 = true;
        }
        int i2 = (hashCode2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.isDeleted;
        if (!z5) {
            z2 = z5;
        }
        return ((((((((((i2 + (z2 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v.hashCode()) * 31) + this.teams.hashCode()) * 31) + this.team.hashCode();
    }

    public String toString() {
        return "FantasyTeamPlayers(userId=" + this.userId + ", roleId=" + this.roleId + ", roleName=" + this.roleName + ", fantasyPoints=" + this.fantasyPoints + ", teamId=" + this.teamId + ", playerId=" + this.playerId + ", isFantasyCaptain=" + this.isFantasyCaptain + ", isFantasyViceCaptain=" + this.isFantasyViceCaptain + ", _id=" + this._id + ", key=" + this.key + ", name=" + this.name + ", role=" + this.role + ", jersey_name=" + this.jersey_name + ", legal_name=" + this.legal_name + ", gender=" + this.gender + ", nationality=" + this.nationality + ", seasonalRole=" + this.seasonalRole + ", roles=" + this.roles + ", batting_style=" + this.batting_style + ", bowling_style=" + this.bowling_style + ", skills=" + this.skills + ", imageUrl=" + this.imageUrl + ", totalEarning=" + this.totalEarning + ", creditPoints=" + this.creditPoints + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", teams=" + this.teams + ", team=" + this.team + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.userId);
        parcel.writeInt(this.roleId);
        parcel.writeString(this.roleName);
        parcel.writeFloat(this.fantasyPoints);
        parcel.writeString(this.teamId);
        parcel.writeString(this.playerId);
        parcel.writeInt(this.isFantasyCaptain ? 1 : 0);
        parcel.writeInt(this.isFantasyViceCaptain ? 1 : 0);
        parcel.writeString(this._id);
        parcel.writeString(this.key);
        parcel.writeString(this.name);
        this.role.writeToParcel(parcel, i);
        parcel.writeString(this.jersey_name);
        parcel.writeString(this.legal_name);
        parcel.writeInt(this.gender);
        this.nationality.writeToParcel(parcel, i);
        parcel.writeString(this.seasonalRole);
        parcel.writeStringList(this.roles);
        parcel.writeString(this.batting_style);
        this.bowling_style.writeToParcel(parcel, i);
        parcel.writeStringList(this.skills);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.totalEarning);
        parcel.writeFloat(this.creditPoints);
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeString(this.__v);
        parcel.writeStringList(this.teams);
        this.team.writeToParcel(parcel, i);
    }

    public FantasyTeamPlayers(String str, int i, String str2, float f, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, Role role2, String str8, String str9, int i2, Nationality nationality2, String str10, List<String> list, String str11, Bowling_style bowling_style2, List<String> list2, String str12, int i3, float f2, boolean z3, boolean z4, String str13, String str14, String str15, List<String> list3, Team team2) {
        String str16 = str;
        String str17 = str2;
        String str18 = str3;
        String str19 = str4;
        String str20 = str5;
        String str21 = str6;
        String str22 = str7;
        Role role3 = role2;
        String str23 = str8;
        String str24 = str9;
        Nationality nationality3 = nationality2;
        String str25 = str10;
        List<String> list4 = list;
        String str26 = str11;
        List<String> list5 = list2;
        Intrinsics.checkNotNullParameter(str16, "userId");
        Intrinsics.checkNotNullParameter(str17, "roleName");
        Intrinsics.checkNotNullParameter(str18, "teamId");
        Intrinsics.checkNotNullParameter(str19, "playerId");
        Intrinsics.checkNotNullParameter(str20, "_id");
        Intrinsics.checkNotNullParameter(str21, "key");
        Intrinsics.checkNotNullParameter(str22, "name");
        Intrinsics.checkNotNullParameter(role3, "role");
        Intrinsics.checkNotNullParameter(str23, "jersey_name");
        Intrinsics.checkNotNullParameter(str24, "legal_name");
        Intrinsics.checkNotNullParameter(nationality3, "nationality");
        Intrinsics.checkNotNullParameter(str25, "seasonalRole");
        Intrinsics.checkNotNullParameter(list4, "roles");
        Intrinsics.checkNotNullParameter(str26, "batting_style");
        Intrinsics.checkNotNullParameter(bowling_style2, "bowling_style");
        Intrinsics.checkNotNullParameter(list2, "skills");
        Intrinsics.checkNotNullParameter(str12, "imageUrl");
        Intrinsics.checkNotNullParameter(str13, "createdAt");
        Intrinsics.checkNotNullParameter(str14, "updatedAt");
        Intrinsics.checkNotNullParameter(str15, "__v");
        Intrinsics.checkNotNullParameter(list3, "teams");
        Intrinsics.checkNotNullParameter(team2, "team");
        this.userId = str16;
        this.roleId = i;
        this.roleName = str17;
        this.fantasyPoints = f;
        this.teamId = str18;
        this.playerId = str19;
        this.isFantasyCaptain = z;
        this.isFantasyViceCaptain = z2;
        this._id = str20;
        this.key = str21;
        this.name = str22;
        this.role = role3;
        this.jersey_name = str23;
        this.legal_name = str24;
        this.gender = i2;
        this.nationality = nationality3;
        this.seasonalRole = str25;
        this.roles = list4;
        this.batting_style = str26;
        this.bowling_style = bowling_style2;
        this.skills = list2;
        this.imageUrl = str12;
        this.totalEarning = i3;
        this.creditPoints = f2;
        this.isBlocked = z3;
        this.isDeleted = z4;
        this.createdAt = str13;
        this.updatedAt = str14;
        this.__v = str15;
        this.teams = list3;
        this.team = team2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FantasyTeamPlayers(String str, int i, String str2, float f, String str3, String str4, boolean z, boolean z2, String str5, String str6, String str7, Role role2, String str8, String str9, int i2, Nationality nationality2, String str10, List list, String str11, Bowling_style bowling_style2, List list2, String str12, int i3, float f2, boolean z3, boolean z4, String str13, String str14, String str15, List list3, Team team2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, f, str3, str4, z, z2, str5, str6, str7, role2, str8, str9, i2, nationality2, str10, list, str11, bowling_style2, list2, (i4 & 2097152) != 0 ? "" : str12, i3, f2, z3, z4, str13, str14, str15, list3, team2);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final int getRoleId() {
        return this.roleId;
    }

    public final String getRoleName() {
        return this.roleName;
    }

    public final float getFantasyPoints() {
        return this.fantasyPoints;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final boolean isFantasyCaptain() {
        return this.isFantasyCaptain;
    }

    public final boolean isFantasyViceCaptain() {
        return this.isFantasyViceCaptain;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final Role getRole() {
        return this.role;
    }

    public final String getJersey_name() {
        return this.jersey_name;
    }

    public final String getLegal_name() {
        return this.legal_name;
    }

    public final int getGender() {
        return this.gender;
    }

    public final Nationality getNationality() {
        return this.nationality;
    }

    public final String getSeasonalRole() {
        return this.seasonalRole;
    }

    public final List<String> getRoles() {
        return this.roles;
    }

    public final String getBatting_style() {
        return this.batting_style;
    }

    public final Bowling_style getBowling_style() {
        return this.bowling_style;
    }

    public final List<String> getSkills() {
        return this.skills;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getTotalEarning() {
        return this.totalEarning;
    }

    public final float getCreditPoints() {
        return this.creditPoints;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String get__v() {
        return this.__v;
    }

    public final List<String> getTeams() {
        return this.teams;
    }

    public final Team getTeam() {
        return this.team;
    }
}
