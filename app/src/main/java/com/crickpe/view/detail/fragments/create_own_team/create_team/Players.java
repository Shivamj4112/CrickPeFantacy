package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002BÙ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u001b\u001a\u00020\t\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#¢\u0006\u0002\u0010$J\t\u0010K\u001a\u00020\u0004HÆ\u0003J\t\u0010L\u001a\u00020\u0010HÆ\u0003J\t\u0010M\u001a\u00020\u0012HÆ\u0003J\t\u0010N\u001a\u00020\u0012HÆ\u0003J\t\u0010O\u001a\u00020\u0010HÆ\u0003J\t\u0010P\u001a\u00020\u0010HÆ\u0003J\t\u0010Q\u001a\u00020\u0012HÆ\u0003J\t\u0010R\u001a\u00020\tHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\t\u0010T\u001a\u00020\tHÆ\u0003J\t\u0010U\u001a\u00020\tHÆ\u0003J\t\u0010V\u001a\u00020\u0004HÆ\u0003J\t\u0010W\u001a\u00020\u001dHÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u001d\u0010Y\u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#HÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\t\u0010[\u001a\u00020\tHÆ\u0003J\t\u0010\\\u001a\u00020\u0004HÆ\u0003J\t\u0010]\u001a\u00020\u0004HÆ\u0003J\t\u0010^\u001a\u00020\u0004HÆ\u0003J\t\u0010_\u001a\u00020\u0004HÆ\u0003J\t\u0010`\u001a\u00020\tHÆ\u0003Jý\u0001\u0010a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\t2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001a\u001a\u00020\t2\b\b\u0002\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u001c\b\u0002\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#HÆ\u0001J\t\u0010b\u001a\u00020cHÖ\u0001J\u0013\u0010d\u001a\u00020\t2\b\u0010e\u001a\u0004\u0018\u00010fHÖ\u0003J\t\u0010g\u001a\u00020cHÖ\u0001J\t\u0010h\u001a\u00020\u0004HÖ\u0001J\u0019\u0010i\u001a\u00020j2\u0006\u0010k\u001a\u00020l2\u0006\u0010m\u001a\u00020cHÖ\u0001R\u0016\u0010\n\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R \u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0014\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R \u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010&R\u001e\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010,\"\u0004\b6\u00107R\u001e\u0010\u0017\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010,\"\u0004\b8\u00107R\u001e\u0010\u001b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010,\"\u0004\b9\u00107R*\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\"\u0018\u00010!j\n\u0012\u0004\u0012\u00020\"\u0018\u0001`#8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010&R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010&R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010&R\u0016\u0010\u0013\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u00100R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010,R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0016\u0010\u0016\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00100R\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010&R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010.R\u0016\u0010\u0015\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010.¨\u0006n"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "Landroid/os/Parcelable;", "Lcom/crickpe/utils/recycler/AbstractModel;", "teamId", "", "playerId", "role", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Role;", "captain", "", "batting_style", "name", "playerRole", "imageUrl", "playing_xi", "totalEarning", "", "creditPoints", "", "playerSelPercentage", "captainSelPercentage", "viceCaptainSelPercentage", "selectionPercentage", "isSelected", "bowling_style", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BowlingStyle;", "isCaptainSelected", "isVCaptainSelected", "team", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;", "fantasyPoint", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/FantasyPoint;", "lastPlayedMatches", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/LastPlayedMatches;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Role;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZDFFDDFZLcom/crickpe/view/detail/fragments/create_own_team/create_team/BowlingStyle;ZZLcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;Lcom/crickpe/view/detail/fragments/create_own_team/create_team/FantasyPoint;Ljava/util/ArrayList;)V", "getBatting_style", "()Ljava/lang/String;", "getBowling_style", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BowlingStyle;", "setBowling_style", "(Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BowlingStyle;)V", "getCaptain", "()Z", "getCaptainSelPercentage", "()D", "getCreditPoints", "()F", "getFantasyPoint", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/FantasyPoint;", "setFantasyPoint", "(Lcom/crickpe/view/detail/fragments/create_own_team/create_team/FantasyPoint;)V", "getImageUrl", "setCaptainSelected", "(Z)V", "setSelected", "setVCaptainSelected", "getLastPlayedMatches", "()Ljava/util/ArrayList;", "getName", "getPlayerId", "getPlayerRole", "getPlayerSelPercentage", "getPlaying_xi", "getRole", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Role;", "getSelectionPercentage", "getTeam", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;", "setTeam", "(Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Team;)V", "getTeamId", "getTotalEarning", "getViceCaptainSelPercentage", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersModel.kt */
public final class Players extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<Players> CREATOR = new Creator();
    @SerializedName("batting_style")
    private final String batting_style;
    @SerializedName("bowling_style")
    private BowlingStyle bowling_style;
    @SerializedName("captain")
    private final boolean captain;
    @SerializedName("captainSelPercentage")
    private final double captainSelPercentage;
    @SerializedName("creditPoints")
    private final float creditPoints;
    @SerializedName("fantasyPoint")
    private FantasyPoint fantasyPoint;
    @SerializedName("imageUrl")
    private final String imageUrl;
    @SerializedName("isCaptainSelected")
    private boolean isCaptainSelected;
    @SerializedName("isSelected")
    private boolean isSelected;
    @SerializedName("isVCaptainSelected")
    private boolean isVCaptainSelected;
    @SerializedName("lastPlayedMatches")
    private final ArrayList<LastPlayedMatches> lastPlayedMatches;
    @SerializedName("name")
    private final String name;
    @SerializedName("playerId")
    private final String playerId;
    @SerializedName("playerRole")
    private final String playerRole;
    @SerializedName("playerSelPercentage")
    private final float playerSelPercentage;
    @SerializedName("playing_xi")
    private final boolean playing_xi;
    @SerializedName("role")
    private final Role role;
    @SerializedName("selectionPercentage")
    private final float selectionPercentage;
    @SerializedName("team")
    private Team team;
    @SerializedName("teamId")
    private final String teamId;
    @SerializedName("totalEarning")
    private final double totalEarning;
    @SerializedName("viceCaptainSelPercentage")
    private final double viceCaptainSelPercentage;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersModel.kt */
    public static final class Creator implements Parcelable.Creator<Players> {
        public final Players createFromParcel(Parcel parcel) {
            float f;
            ArrayList arrayList;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Role createFromParcel = Role.CREATOR.createFromParcel(parcel2);
            boolean z = parcel.readInt() != 0;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            double readDouble = parcel.readDouble();
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            double readDouble2 = parcel.readDouble();
            double readDouble3 = parcel.readDouble();
            float readFloat3 = parcel.readFloat();
            boolean z3 = parcel.readInt() != 0;
            BowlingStyle createFromParcel2 = parcel.readInt() == 0 ? null : BowlingStyle.CREATOR.createFromParcel(parcel2);
            boolean z4 = parcel.readInt() != 0;
            boolean z5 = parcel.readInt() != 0;
            Team createFromParcel3 = Team.CREATOR.createFromParcel(parcel2);
            FantasyPoint createFromParcel4 = parcel.readInt() == 0 ? null : FantasyPoint.CREATOR.createFromParcel(parcel2);
            if (parcel.readInt() == 0) {
                arrayList = null;
                f = readFloat2;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                f = readFloat2;
                int i = 0;
                while (i != readInt) {
                    arrayList2.add(LastPlayedMatches.CREATOR.createFromParcel(parcel2));
                    i++;
                    readInt = readInt;
                }
                arrayList = arrayList2;
            }
            return new Players(readString, readString2, createFromParcel, z, readString3, readString4, readString5, readString6, z2, readDouble, readFloat, f, readDouble2, readDouble3, readFloat3, z3, createFromParcel2, z4, z5, createFromParcel3, createFromParcel4, arrayList);
        }

        public final Players[] newArray(int i) {
            return new Players[i];
        }
    }

    public static /* synthetic */ Players copy$default(Players players, String str, String str2, Role role2, boolean z, String str3, String str4, String str5, String str6, boolean z2, double d, float f, float f2, double d2, double d3, float f3, boolean z3, BowlingStyle bowlingStyle, boolean z4, boolean z5, Team team2, FantasyPoint fantasyPoint2, ArrayList arrayList, int i, Object obj) {
        Players players2 = players;
        int i2 = i;
        return players.copy((i2 & 1) != 0 ? players2.teamId : str, (i2 & 2) != 0 ? players2.playerId : str2, (i2 & 4) != 0 ? players2.role : role2, (i2 & 8) != 0 ? players2.captain : z, (i2 & 16) != 0 ? players2.batting_style : str3, (i2 & 32) != 0 ? players2.name : str4, (i2 & 64) != 0 ? players2.playerRole : str5, (i2 & 128) != 0 ? players2.imageUrl : str6, (i2 & 256) != 0 ? players2.playing_xi : z2, (i2 & 512) != 0 ? players2.totalEarning : d, (i2 & 1024) != 0 ? players2.creditPoints : f, (i2 & 2048) != 0 ? players2.playerSelPercentage : f2, (i2 & 4096) != 0 ? players2.captainSelPercentage : d2, (i2 & 8192) != 0 ? players2.viceCaptainSelPercentage : d3, (i2 & 16384) != 0 ? players2.selectionPercentage : f3, (32768 & i2) != 0 ? players2.isSelected : z3, (i2 & 65536) != 0 ? players2.bowling_style : bowlingStyle, (i2 & 131072) != 0 ? players2.isCaptainSelected : z4, (i2 & 262144) != 0 ? players2.isVCaptainSelected : z5, (i2 & 524288) != 0 ? players2.team : team2, (i2 & 1048576) != 0 ? players2.fantasyPoint : fantasyPoint2, (i2 & 2097152) != 0 ? players2.lastPlayedMatches : arrayList);
    }

    public final String component1() {
        return this.teamId;
    }

    public final double component10() {
        return this.totalEarning;
    }

    public final float component11() {
        return this.creditPoints;
    }

    public final float component12() {
        return this.playerSelPercentage;
    }

    public final double component13() {
        return this.captainSelPercentage;
    }

    public final double component14() {
        return this.viceCaptainSelPercentage;
    }

    public final float component15() {
        return this.selectionPercentage;
    }

    public final boolean component16() {
        return this.isSelected;
    }

    public final BowlingStyle component17() {
        return this.bowling_style;
    }

    public final boolean component18() {
        return this.isCaptainSelected;
    }

    public final boolean component19() {
        return this.isVCaptainSelected;
    }

    public final String component2() {
        return this.playerId;
    }

    public final Team component20() {
        return this.team;
    }

    public final FantasyPoint component21() {
        return this.fantasyPoint;
    }

    public final ArrayList<LastPlayedMatches> component22() {
        return this.lastPlayedMatches;
    }

    public final Role component3() {
        return this.role;
    }

    public final boolean component4() {
        return this.captain;
    }

    public final String component5() {
        return this.batting_style;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.playerRole;
    }

    public final String component8() {
        return this.imageUrl;
    }

    public final boolean component9() {
        return this.playing_xi;
    }

    public final Players copy(String str, String str2, Role role2, boolean z, String str3, String str4, String str5, String str6, boolean z2, double d, float f, float f2, double d2, double d3, float f3, boolean z3, BowlingStyle bowlingStyle, boolean z4, boolean z5, Team team2, FantasyPoint fantasyPoint2, ArrayList<LastPlayedMatches> arrayList) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "teamId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        Intrinsics.checkNotNullParameter(role2, "role");
        Intrinsics.checkNotNullParameter(str3, "batting_style");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(str5, "playerRole");
        Intrinsics.checkNotNullParameter(str6, "imageUrl");
        Intrinsics.checkNotNullParameter(team2, "team");
        return new Players(str7, str2, role2, z, str3, str4, str5, str6, z2, d, f, f2, d2, d3, f3, z3, bowlingStyle, z4, z5, team2, fantasyPoint2, arrayList);
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
        return Intrinsics.areEqual((Object) this.teamId, (Object) players.teamId) && Intrinsics.areEqual((Object) this.playerId, (Object) players.playerId) && Intrinsics.areEqual((Object) this.role, (Object) players.role) && this.captain == players.captain && Intrinsics.areEqual((Object) this.batting_style, (Object) players.batting_style) && Intrinsics.areEqual((Object) this.name, (Object) players.name) && Intrinsics.areEqual((Object) this.playerRole, (Object) players.playerRole) && Intrinsics.areEqual((Object) this.imageUrl, (Object) players.imageUrl) && this.playing_xi == players.playing_xi && Intrinsics.areEqual((Object) Double.valueOf(this.totalEarning), (Object) Double.valueOf(players.totalEarning)) && Intrinsics.areEqual((Object) Float.valueOf(this.creditPoints), (Object) Float.valueOf(players.creditPoints)) && Intrinsics.areEqual((Object) Float.valueOf(this.playerSelPercentage), (Object) Float.valueOf(players.playerSelPercentage)) && Intrinsics.areEqual((Object) Double.valueOf(this.captainSelPercentage), (Object) Double.valueOf(players.captainSelPercentage)) && Intrinsics.areEqual((Object) Double.valueOf(this.viceCaptainSelPercentage), (Object) Double.valueOf(players.viceCaptainSelPercentage)) && Intrinsics.areEqual((Object) Float.valueOf(this.selectionPercentage), (Object) Float.valueOf(players.selectionPercentage)) && this.isSelected == players.isSelected && Intrinsics.areEqual((Object) this.bowling_style, (Object) players.bowling_style) && this.isCaptainSelected == players.isCaptainSelected && this.isVCaptainSelected == players.isVCaptainSelected && Intrinsics.areEqual((Object) this.team, (Object) players.team) && Intrinsics.areEqual((Object) this.fantasyPoint, (Object) players.fantasyPoint) && Intrinsics.areEqual((Object) this.lastPlayedMatches, (Object) players.lastPlayedMatches);
    }

    public int hashCode() {
        int hashCode = ((((this.teamId.hashCode() * 31) + this.playerId.hashCode()) * 31) + this.role.hashCode()) * 31;
        boolean z = this.captain;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int hashCode2 = (((((((((hashCode + (z ? 1 : 0)) * 31) + this.batting_style.hashCode()) * 31) + this.name.hashCode()) * 31) + this.playerRole.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
        boolean z3 = this.playing_xi;
        if (z3) {
            z3 = true;
        }
        int m = (((((((((((((hashCode2 + (z3 ? 1 : 0)) * 31) + Double.doubleToLongBits(this.totalEarning)) * 31) + Float.floatToIntBits(this.creditPoints)) * 31) + Float.floatToIntBits(this.playerSelPercentage)) * 31) + Double.doubleToLongBits(this.captainSelPercentage)) * 31) + Double.doubleToLongBits(this.viceCaptainSelPercentage)) * 31) + Float.floatToIntBits(this.selectionPercentage)) * 31;
        boolean z4 = this.isSelected;
        if (z4) {
            z4 = true;
        }
        int i = (m + (z4 ? 1 : 0)) * 31;
        BowlingStyle bowlingStyle = this.bowling_style;
        int i2 = 0;
        int hashCode3 = (i + (bowlingStyle == null ? 0 : bowlingStyle.hashCode())) * 31;
        boolean z5 = this.isCaptainSelected;
        if (z5) {
            z5 = true;
        }
        int i3 = (hashCode3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.isVCaptainSelected;
        if (!z6) {
            z2 = z6;
        }
        int hashCode4 = (((i3 + (z2 ? 1 : 0)) * 31) + this.team.hashCode()) * 31;
        FantasyPoint fantasyPoint2 = this.fantasyPoint;
        int hashCode5 = (hashCode4 + (fantasyPoint2 == null ? 0 : fantasyPoint2.hashCode())) * 31;
        ArrayList<LastPlayedMatches> arrayList = this.lastPlayedMatches;
        if (arrayList != null) {
            i2 = arrayList.hashCode();
        }
        return hashCode5 + i2;
    }

    public String toString() {
        return "Players(teamId=" + this.teamId + ", playerId=" + this.playerId + ", role=" + this.role + ", captain=" + this.captain + ", batting_style=" + this.batting_style + ", name=" + this.name + ", playerRole=" + this.playerRole + ", imageUrl=" + this.imageUrl + ", playing_xi=" + this.playing_xi + ", totalEarning=" + this.totalEarning + ", creditPoints=" + this.creditPoints + ", playerSelPercentage=" + this.playerSelPercentage + ", captainSelPercentage=" + this.captainSelPercentage + ", viceCaptainSelPercentage=" + this.viceCaptainSelPercentage + ", selectionPercentage=" + this.selectionPercentage + ", isSelected=" + this.isSelected + ", bowling_style=" + this.bowling_style + ", isCaptainSelected=" + this.isCaptainSelected + ", isVCaptainSelected=" + this.isVCaptainSelected + ", team=" + this.team + ", fantasyPoint=" + this.fantasyPoint + ", lastPlayedMatches=" + this.lastPlayedMatches + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.teamId);
        parcel.writeString(this.playerId);
        this.role.writeToParcel(parcel, i);
        parcel.writeInt(this.captain ? 1 : 0);
        parcel.writeString(this.batting_style);
        parcel.writeString(this.name);
        parcel.writeString(this.playerRole);
        parcel.writeString(this.imageUrl);
        parcel.writeInt(this.playing_xi ? 1 : 0);
        parcel.writeDouble(this.totalEarning);
        parcel.writeFloat(this.creditPoints);
        parcel.writeFloat(this.playerSelPercentage);
        parcel.writeDouble(this.captainSelPercentage);
        parcel.writeDouble(this.viceCaptainSelPercentage);
        parcel.writeFloat(this.selectionPercentage);
        parcel.writeInt(this.isSelected ? 1 : 0);
        BowlingStyle bowlingStyle = this.bowling_style;
        if (bowlingStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bowlingStyle.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isCaptainSelected ? 1 : 0);
        parcel.writeInt(this.isVCaptainSelected ? 1 : 0);
        this.team.writeToParcel(parcel, i);
        FantasyPoint fantasyPoint2 = this.fantasyPoint;
        if (fantasyPoint2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fantasyPoint2.writeToParcel(parcel, i);
        }
        ArrayList<LastPlayedMatches> arrayList = this.lastPlayedMatches;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<LastPlayedMatches> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Players(String r30, String r31, Role r32, boolean r33, String r34, String r35, String r36, String r37, boolean r38, double r39, float r41, float r42, double r43, double r45, float r47, boolean r48, BowlingStyle r49, boolean r50, boolean r51, Team r52, FantasyPoint r53, ArrayList r54, int r55, kotlin.jvm.internal.DefaultConstructorMarker r56) {
        /*
            r29 = this;
            r0 = r55
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x000a
            r1 = 0
            r13 = r1
            goto L_0x000c
        L_0x000a:
            r13 = r39
        L_0x000c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r15 = 0
            goto L_0x0015
        L_0x0013:
            r15 = r41
        L_0x0015:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L_0x001e
            r23 = r2
            goto L_0x0020
        L_0x001e:
            r23 = r49
        L_0x0020:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0029
            r1 = 0
            r24 = 0
            goto L_0x002b
        L_0x0029:
            r24 = r50
        L_0x002b:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0033
            r27 = r2
            goto L_0x0035
        L_0x0033:
            r27 = r53
        L_0x0035:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x003d
            r28 = r2
            goto L_0x003f
        L_0x003d:
            r28 = r54
        L_0x003f:
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r16 = r42
            r17 = r43
            r19 = r45
            r21 = r47
            r22 = r48
            r25 = r51
            r26 = r52
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.create_own_team.create_team.Players.<init>(java.lang.String, java.lang.String, com.crickpe.view.detail.fragments.create_own_team.create_team.Role, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, double, float, float, double, double, float, boolean, com.crickpe.view.detail.fragments.create_own_team.create_team.BowlingStyle, boolean, boolean, com.crickpe.view.detail.fragments.create_own_team.create_team.Team, com.crickpe.view.detail.fragments.create_own_team.create_team.FantasyPoint, java.util.ArrayList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final Role getRole() {
        return this.role;
    }

    public final boolean getCaptain() {
        return this.captain;
    }

    public final String getBatting_style() {
        return this.batting_style;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlayerRole() {
        return this.playerRole;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final boolean getPlaying_xi() {
        return this.playing_xi;
    }

    public final double getTotalEarning() {
        return this.totalEarning;
    }

    public final float getCreditPoints() {
        return this.creditPoints;
    }

    public final float getPlayerSelPercentage() {
        return this.playerSelPercentage;
    }

    public final double getCaptainSelPercentage() {
        return this.captainSelPercentage;
    }

    public final double getViceCaptainSelPercentage() {
        return this.viceCaptainSelPercentage;
    }

    public final float getSelectionPercentage() {
        return this.selectionPercentage;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final BowlingStyle getBowling_style() {
        return this.bowling_style;
    }

    public final void setBowling_style(BowlingStyle bowlingStyle) {
        this.bowling_style = bowlingStyle;
    }

    public final boolean isCaptainSelected() {
        return this.isCaptainSelected;
    }

    public final void setCaptainSelected(boolean z) {
        this.isCaptainSelected = z;
    }

    public final boolean isVCaptainSelected() {
        return this.isVCaptainSelected;
    }

    public final void setVCaptainSelected(boolean z) {
        this.isVCaptainSelected = z;
    }

    public final Team getTeam() {
        return this.team;
    }

    public final void setTeam(Team team2) {
        Intrinsics.checkNotNullParameter(team2, "<set-?>");
        this.team = team2;
    }

    public final FantasyPoint getFantasyPoint() {
        return this.fantasyPoint;
    }

    public final void setFantasyPoint(FantasyPoint fantasyPoint2) {
        this.fantasyPoint = fantasyPoint2;
    }

    public final ArrayList<LastPlayedMatches> getLastPlayedMatches() {
        return this.lastPlayedMatches;
    }

    public Players(String str, String str2, Role role2, boolean z, String str3, String str4, String str5, String str6, boolean z2, double d, float f, float f2, double d2, double d3, float f3, boolean z3, BowlingStyle bowlingStyle, boolean z4, boolean z5, Team team2, FantasyPoint fantasyPoint2, ArrayList<LastPlayedMatches> arrayList) {
        String str7 = str4;
        String str8 = str5;
        String str9 = str6;
        Team team3 = team2;
        Intrinsics.checkNotNullParameter(str, "teamId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        Intrinsics.checkNotNullParameter(role2, "role");
        Intrinsics.checkNotNullParameter(str3, "batting_style");
        Intrinsics.checkNotNullParameter(str7, "name");
        Intrinsics.checkNotNullParameter(str8, "playerRole");
        Intrinsics.checkNotNullParameter(str9, "imageUrl");
        Intrinsics.checkNotNullParameter(team3, "team");
        this.teamId = str;
        this.playerId = str2;
        this.role = role2;
        this.captain = z;
        this.batting_style = str3;
        this.name = str7;
        this.playerRole = str8;
        this.imageUrl = str9;
        this.playing_xi = z2;
        this.totalEarning = d;
        this.creditPoints = f;
        this.playerSelPercentage = f2;
        this.captainSelPercentage = d2;
        this.viceCaptainSelPercentage = d3;
        this.selectionPercentage = f3;
        this.isSelected = z3;
        this.bowling_style = bowlingStyle;
        this.isCaptainSelected = z4;
        this.isVCaptainSelected = z5;
        this.team = team3;
        this.fantasyPoint = fantasyPoint2;
        this.lastPlayedMatches = arrayList;
    }
}
