package com.crickpe.view.detail.fragments.player_reward_fragment.models;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bI\b\b\u0018\u00002\u00020\u0001Bÿ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0011\u0012\u0006\u0010\u001b\u001a\u00020\u0011\u0012\u0006\u0010\u001c\u001a\u00020\u0011\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\u0011\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u0006\u0010&\u001a\u00020\u000b\u0012\u0006\u0010'\u001a\u00020\u0011\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0014¢\u0006\u0002\u0010*J\t\u0010P\u001a\u00020\u0003HÆ\u0003J\t\u0010Q\u001a\u00020\u0011HÆ\u0003J\t\u0010R\u001a\u00020\u000bHÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014HÆ\u0003J\t\u0010T\u001a\u00020\u000bHÆ\u0003J\t\u0010U\u001a\u00020\u0017HÆ\u0003J\u000f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014HÆ\u0003J\t\u0010W\u001a\u00020\u000bHÆ\u0003J\t\u0010X\u001a\u00020\u0011HÆ\u0003J\t\u0010Y\u001a\u00020\u0011HÆ\u0003J\t\u0010Z\u001a\u00020\u0011HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0011HÆ\u0003J\t\u0010]\u001a\u00020\u0011HÆ\u0003J\t\u0010^\u001a\u00020\tHÆ\u0003J\t\u0010_\u001a\u00020!HÆ\u0003J\t\u0010`\u001a\u00020#HÆ\u0003J\t\u0010a\u001a\u00020#HÆ\u0003J\t\u0010b\u001a\u00020\u000bHÆ\u0003J\t\u0010c\u001a\u00020\u000bHÆ\u0003J\t\u0010d\u001a\u00020\u0011HÆ\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020)0\u0014HÆ\u0003J\t\u0010f\u001a\u00020\u0007HÆ\u0003J\t\u0010g\u001a\u00020\tHÆ\u0003J\t\u0010h\u001a\u00020\u000bHÆ\u0003J\t\u0010i\u001a\u00020\u000bHÆ\u0003J\t\u0010j\u001a\u00020\u000bHÆ\u0003J\t\u0010k\u001a\u00020\u000bHÆ\u0003J\t\u0010l\u001a\u00020\u000bHÆ\u0003J½\u0002\u0010m\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\u00112\b\b\u0002\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020\u00112\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0014HÆ\u0001J\u0013\u0010n\u001a\u00020#2\b\u0010o\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010p\u001a\u00020\u0011HÖ\u0001J\t\u0010q\u001a\u00020\u000bHÖ\u0001R\u0011\u0010'\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010%\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b2\u0010.R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b7\u0010,R\u0011\u0010\u001e\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b8\u0010,R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b9\u0010.R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010:R\u0011\u0010$\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\b$\u0010:R\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b;\u0010.R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b<\u0010.R\u0011\u0010\u000f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b=\u0010.R\u0011\u0010\r\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b>\u0010.R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u001d\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bF\u0010.R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014¢\u0006\b\n\u0000\u001a\u0004\bG\u0010ER\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0014¢\u0006\b\n\u0000\u001a\u0004\bH\u0010ER\u0011\u0010\u001a\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bI\u0010,R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0011\u0010\u001f\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bL\u0010KR\u0011\u0010\u001b\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bM\u0010,R\u0011\u0010\u001c\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bN\u0010,R\u0011\u0010&\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\bO\u0010.¨\u0006r"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Player;", "", "role", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Role;", "nationality", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Nationality;", "fantasyPoint", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/FantasyPoints;", "totalFantasyPoints", "", "_id", "", "key", "name", "jersey_name", "legal_name", "gender", "", "seasonalRole", "roles", "", "batting_style", "bowling_style", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/BowlingStyle;", "skills", "imageUrl", "totalEarning", "totalRewardEarning", "uniqueFanCount", "rank", "iccRanking", "totalPotEarning", "creditPoints", "", "isBlocked", "", "isDeleted", "createdAt", "updatedAt", "__v", "teams", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Teams;", "(Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Role;Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Nationality;Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/FantasyPoints;FLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/BowlingStyle;Ljava/util/List;Ljava/lang/String;IIIIIFDZZLjava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getBatting_style", "getBowling_style", "()Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/BowlingStyle;", "getCreatedAt", "getCreditPoints", "()D", "getFantasyPoint", "()Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/FantasyPoints;", "getGender", "getIccRanking", "getImageUrl", "()Z", "getJersey_name", "getKey", "getLegal_name", "getName", "getNationality", "()Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Nationality;", "getRank", "getRole", "()Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Role;", "getRoles", "()Ljava/util/List;", "getSeasonalRole", "getSkills", "getTeams", "getTotalEarning", "getTotalFantasyPoints", "()F", "getTotalPotEarning", "getTotalRewardEarning", "getUniqueFanCount", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Player.kt */
public final class Player {
    private final int __v;
    private final String _id;
    private final String batting_style;
    private final BowlingStyle bowling_style;
    private final String createdAt;
    private final double creditPoints;
    private final FantasyPoints fantasyPoint;
    private final int gender;
    private final int iccRanking;
    private final String imageUrl;
    private final boolean isBlocked;
    private final boolean isDeleted;
    private final String jersey_name;
    private final String key;
    private final String legal_name;
    private final String name;
    private final Nationality nationality;
    private final int rank;
    private final Role role;
    private final List<String> roles;
    private final String seasonalRole;
    private final List<String> skills;
    private final List<Teams> teams;
    private final int totalEarning;
    private final float totalFantasyPoints;
    private final float totalPotEarning;
    private final int totalRewardEarning;
    private final int uniqueFanCount;
    private final String updatedAt;

    public static /* synthetic */ Player copy$default(Player player, Role role2, Nationality nationality2, FantasyPoints fantasyPoints, float f, String str, String str2, String str3, String str4, String str5, int i, String str6, List list, String str7, BowlingStyle bowlingStyle, List list2, String str8, int i2, int i3, int i4, int i5, int i6, float f2, double d, boolean z, boolean z2, String str9, String str10, int i7, List list3, int i8, Object obj) {
        Player player2 = player;
        int i9 = i8;
        return player.copy((i9 & 1) != 0 ? player2.role : role2, (i9 & 2) != 0 ? player2.nationality : nationality2, (i9 & 4) != 0 ? player2.fantasyPoint : fantasyPoints, (i9 & 8) != 0 ? player2.totalFantasyPoints : f, (i9 & 16) != 0 ? player2._id : str, (i9 & 32) != 0 ? player2.key : str2, (i9 & 64) != 0 ? player2.name : str3, (i9 & 128) != 0 ? player2.jersey_name : str4, (i9 & 256) != 0 ? player2.legal_name : str5, (i9 & 512) != 0 ? player2.gender : i, (i9 & 1024) != 0 ? player2.seasonalRole : str6, (i9 & 2048) != 0 ? player2.roles : list, (i9 & 4096) != 0 ? player2.batting_style : str7, (i9 & 8192) != 0 ? player2.bowling_style : bowlingStyle, (i9 & 16384) != 0 ? player2.skills : list2, (i9 & 32768) != 0 ? player2.imageUrl : str8, (i9 & 65536) != 0 ? player2.totalEarning : i2, (i9 & 131072) != 0 ? player2.totalRewardEarning : i3, (i9 & 262144) != 0 ? player2.uniqueFanCount : i4, (i9 & 524288) != 0 ? player2.rank : i5, (i9 & 1048576) != 0 ? player2.iccRanking : i6, (i9 & 2097152) != 0 ? player2.totalPotEarning : f2, (i9 & 4194304) != 0 ? player2.creditPoints : d, (i9 & 8388608) != 0 ? player2.isBlocked : z, (16777216 & i9) != 0 ? player2.isDeleted : z2, (i9 & 33554432) != 0 ? player2.createdAt : str9, (i9 & 67108864) != 0 ? player2.updatedAt : str10, (i9 & 134217728) != 0 ? player2.__v : i7, (i9 & 268435456) != 0 ? player2.teams : list3);
    }

    public final Role component1() {
        return this.role;
    }

    public final int component10() {
        return this.gender;
    }

    public final String component11() {
        return this.seasonalRole;
    }

    public final List<String> component12() {
        return this.roles;
    }

    public final String component13() {
        return this.batting_style;
    }

    public final BowlingStyle component14() {
        return this.bowling_style;
    }

    public final List<String> component15() {
        return this.skills;
    }

    public final String component16() {
        return this.imageUrl;
    }

    public final int component17() {
        return this.totalEarning;
    }

    public final int component18() {
        return this.totalRewardEarning;
    }

    public final int component19() {
        return this.uniqueFanCount;
    }

    public final Nationality component2() {
        return this.nationality;
    }

    public final int component20() {
        return this.rank;
    }

    public final int component21() {
        return this.iccRanking;
    }

    public final float component22() {
        return this.totalPotEarning;
    }

    public final double component23() {
        return this.creditPoints;
    }

    public final boolean component24() {
        return this.isBlocked;
    }

    public final boolean component25() {
        return this.isDeleted;
    }

    public final String component26() {
        return this.createdAt;
    }

    public final String component27() {
        return this.updatedAt;
    }

    public final int component28() {
        return this.__v;
    }

    public final List<Teams> component29() {
        return this.teams;
    }

    public final FantasyPoints component3() {
        return this.fantasyPoint;
    }

    public final float component4() {
        return this.totalFantasyPoints;
    }

    public final String component5() {
        return this._id;
    }

    public final String component6() {
        return this.key;
    }

    public final String component7() {
        return this.name;
    }

    public final String component8() {
        return this.jersey_name;
    }

    public final String component9() {
        return this.legal_name;
    }

    public final Player copy(Role role2, Nationality nationality2, FantasyPoints fantasyPoints, float f, String str, String str2, String str3, String str4, String str5, int i, String str6, List<String> list, String str7, BowlingStyle bowlingStyle, List<String> list2, String str8, int i2, int i3, int i4, int i5, int i6, float f2, double d, boolean z, boolean z2, String str9, String str10, int i7, List<Teams> list3) {
        Role role3 = role2;
        Intrinsics.checkNotNullParameter(role3, "role");
        Intrinsics.checkNotNullParameter(nationality2, "nationality");
        Intrinsics.checkNotNullParameter(fantasyPoints, "fantasyPoint");
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "key");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "jersey_name");
        Intrinsics.checkNotNullParameter(str5, "legal_name");
        Intrinsics.checkNotNullParameter(str6, "seasonalRole");
        Intrinsics.checkNotNullParameter(list, "roles");
        Intrinsics.checkNotNullParameter(str7, "batting_style");
        Intrinsics.checkNotNullParameter(bowlingStyle, "bowling_style");
        Intrinsics.checkNotNullParameter(list2, "skills");
        Intrinsics.checkNotNullParameter(str8, "imageUrl");
        Intrinsics.checkNotNullParameter(str9, "createdAt");
        Intrinsics.checkNotNullParameter(str10, "updatedAt");
        Intrinsics.checkNotNullParameter(list3, "teams");
        return new Player(role3, nationality2, fantasyPoints, f, str, str2, str3, str4, str5, i, str6, list, str7, bowlingStyle, list2, str8, i2, i3, i4, i5, i6, f2, d, z, z2, str9, str10, i7, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Player)) {
            return false;
        }
        Player player = (Player) obj;
        return Intrinsics.areEqual((Object) this.role, (Object) player.role) && Intrinsics.areEqual((Object) this.nationality, (Object) player.nationality) && Intrinsics.areEqual((Object) this.fantasyPoint, (Object) player.fantasyPoint) && Intrinsics.areEqual((Object) Float.valueOf(this.totalFantasyPoints), (Object) Float.valueOf(player.totalFantasyPoints)) && Intrinsics.areEqual((Object) this._id, (Object) player._id) && Intrinsics.areEqual((Object) this.key, (Object) player.key) && Intrinsics.areEqual((Object) this.name, (Object) player.name) && Intrinsics.areEqual((Object) this.jersey_name, (Object) player.jersey_name) && Intrinsics.areEqual((Object) this.legal_name, (Object) player.legal_name) && this.gender == player.gender && Intrinsics.areEqual((Object) this.seasonalRole, (Object) player.seasonalRole) && Intrinsics.areEqual((Object) this.roles, (Object) player.roles) && Intrinsics.areEqual((Object) this.batting_style, (Object) player.batting_style) && Intrinsics.areEqual((Object) this.bowling_style, (Object) player.bowling_style) && Intrinsics.areEqual((Object) this.skills, (Object) player.skills) && Intrinsics.areEqual((Object) this.imageUrl, (Object) player.imageUrl) && this.totalEarning == player.totalEarning && this.totalRewardEarning == player.totalRewardEarning && this.uniqueFanCount == player.uniqueFanCount && this.rank == player.rank && this.iccRanking == player.iccRanking && Intrinsics.areEqual((Object) Float.valueOf(this.totalPotEarning), (Object) Float.valueOf(player.totalPotEarning)) && Intrinsics.areEqual((Object) Double.valueOf(this.creditPoints), (Object) Double.valueOf(player.creditPoints)) && this.isBlocked == player.isBlocked && this.isDeleted == player.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) player.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) player.updatedAt) && this.__v == player.__v && Intrinsics.areEqual((Object) this.teams, (Object) player.teams);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((((((((((this.role.hashCode() * 31) + this.nationality.hashCode()) * 31) + this.fantasyPoint.hashCode()) * 31) + Float.floatToIntBits(this.totalFantasyPoints)) * 31) + this._id.hashCode()) * 31) + this.key.hashCode()) * 31) + this.name.hashCode()) * 31) + this.jersey_name.hashCode()) * 31) + this.legal_name.hashCode()) * 31) + this.gender) * 31) + this.seasonalRole.hashCode()) * 31) + this.roles.hashCode()) * 31) + this.batting_style.hashCode()) * 31) + this.bowling_style.hashCode()) * 31) + this.skills.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.totalEarning) * 31) + this.totalRewardEarning) * 31) + this.uniqueFanCount) * 31) + this.rank) * 31) + this.iccRanking) * 31) + Float.floatToIntBits(this.totalPotEarning)) * 31) + Double.doubleToLongBits(this.creditPoints)) * 31;
        boolean z = this.isBlocked;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isDeleted;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((i + (z2 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v) * 31) + this.teams.hashCode();
    }

    public String toString() {
        return "Player(role=" + this.role + ", nationality=" + this.nationality + ", fantasyPoint=" + this.fantasyPoint + ", totalFantasyPoints=" + this.totalFantasyPoints + ", _id=" + this._id + ", key=" + this.key + ", name=" + this.name + ", jersey_name=" + this.jersey_name + ", legal_name=" + this.legal_name + ", gender=" + this.gender + ", seasonalRole=" + this.seasonalRole + ", roles=" + this.roles + ", batting_style=" + this.batting_style + ", bowling_style=" + this.bowling_style + ", skills=" + this.skills + ", imageUrl=" + this.imageUrl + ", totalEarning=" + this.totalEarning + ", totalRewardEarning=" + this.totalRewardEarning + ", uniqueFanCount=" + this.uniqueFanCount + ", rank=" + this.rank + ", iccRanking=" + this.iccRanking + ", totalPotEarning=" + this.totalPotEarning + ", creditPoints=" + this.creditPoints + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", teams=" + this.teams + ')';
    }

    public Player(Role role2, Nationality nationality2, FantasyPoints fantasyPoints, float f, String str, String str2, String str3, String str4, String str5, int i, String str6, List<String> list, String str7, BowlingStyle bowlingStyle, List<String> list2, String str8, int i2, int i3, int i4, int i5, int i6, float f2, double d, boolean z, boolean z2, String str9, String str10, int i7, List<Teams> list3) {
        Role role3 = role2;
        Nationality nationality3 = nationality2;
        FantasyPoints fantasyPoints2 = fantasyPoints;
        String str11 = str;
        String str12 = str2;
        String str13 = str3;
        String str14 = str4;
        String str15 = str5;
        String str16 = str6;
        List<String> list4 = list;
        String str17 = str7;
        BowlingStyle bowlingStyle2 = bowlingStyle;
        List<String> list5 = list2;
        String str18 = str8;
        String str19 = str10;
        Intrinsics.checkNotNullParameter(role3, "role");
        Intrinsics.checkNotNullParameter(nationality3, "nationality");
        Intrinsics.checkNotNullParameter(fantasyPoints2, "fantasyPoint");
        Intrinsics.checkNotNullParameter(str11, "_id");
        Intrinsics.checkNotNullParameter(str12, "key");
        Intrinsics.checkNotNullParameter(str13, "name");
        Intrinsics.checkNotNullParameter(str14, "jersey_name");
        Intrinsics.checkNotNullParameter(str15, "legal_name");
        Intrinsics.checkNotNullParameter(str16, "seasonalRole");
        Intrinsics.checkNotNullParameter(list4, "roles");
        Intrinsics.checkNotNullParameter(str17, "batting_style");
        Intrinsics.checkNotNullParameter(bowlingStyle2, "bowling_style");
        Intrinsics.checkNotNullParameter(list5, "skills");
        Intrinsics.checkNotNullParameter(str18, "imageUrl");
        Intrinsics.checkNotNullParameter(str9, "createdAt");
        Intrinsics.checkNotNullParameter(str10, "updatedAt");
        Intrinsics.checkNotNullParameter(list3, "teams");
        this.role = role3;
        this.nationality = nationality3;
        this.fantasyPoint = fantasyPoints2;
        this.totalFantasyPoints = f;
        this._id = str11;
        this.key = str12;
        this.name = str13;
        this.jersey_name = str14;
        this.legal_name = str15;
        this.gender = i;
        this.seasonalRole = str16;
        this.roles = list4;
        this.batting_style = str17;
        this.bowling_style = bowlingStyle2;
        this.skills = list5;
        this.imageUrl = str18;
        this.totalEarning = i2;
        this.totalRewardEarning = i3;
        this.uniqueFanCount = i4;
        this.rank = i5;
        this.iccRanking = i6;
        this.totalPotEarning = f2;
        this.creditPoints = d;
        this.isBlocked = z;
        this.isDeleted = z2;
        this.createdAt = str9;
        this.updatedAt = str10;
        this.__v = i7;
        this.teams = list3;
    }

    public final Role getRole() {
        return this.role;
    }

    public final Nationality getNationality() {
        return this.nationality;
    }

    public final FantasyPoints getFantasyPoint() {
        return this.fantasyPoint;
    }

    public final float getTotalFantasyPoints() {
        return this.totalFantasyPoints;
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

    public final String getJersey_name() {
        return this.jersey_name;
    }

    public final String getLegal_name() {
        return this.legal_name;
    }

    public final int getGender() {
        return this.gender;
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

    public final BowlingStyle getBowling_style() {
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

    public final int getTotalRewardEarning() {
        return this.totalRewardEarning;
    }

    public final int getUniqueFanCount() {
        return this.uniqueFanCount;
    }

    public final int getRank() {
        return this.rank;
    }

    public final int getIccRanking() {
        return this.iccRanking;
    }

    public final float getTotalPotEarning() {
        return this.totalPotEarning;
    }

    public final double getCreditPoints() {
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

    public final int get__v() {
        return this.__v;
    }

    public final List<Teams> getTeams() {
        return this.teams;
    }
}
