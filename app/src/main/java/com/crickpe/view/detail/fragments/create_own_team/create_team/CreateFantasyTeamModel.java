package com.crickpe.view.detail.fragments.create_own_team.create_team;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b \b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0012HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003J\t\u0010*\u001a\u00020\fHÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J}\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u0012HÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001aR\u0016\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0017¨\u00062"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateFantasyTeamModel;", "", "userId", "", "matchId", "contestId", "players", "", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "totalFantasyPoints", "", "isBlocked", "", "isDeleted", "_id", "createdAt", "updatedAt", "__v", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getContestId", "getCreatedAt", "()Z", "getMatchId", "getPlayers", "()Ljava/util/List;", "getTotalFantasyPoints", "()F", "getUpdatedAt", "getUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CreateFantasyTeamModel.kt */
public final class CreateFantasyTeamModel {
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("contestId")
    private final String contestId;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("isBlocked")
    private final boolean isBlocked;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("matchId")
    private final String matchId;
    @SerializedName("players")
    private final List<Players> players;
    @SerializedName("totalFantasyPoints")
    private final float totalFantasyPoints;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("userId")
    private final String userId;

    public static /* synthetic */ CreateFantasyTeamModel copy$default(CreateFantasyTeamModel createFantasyTeamModel, String str, String str2, String str3, List list, float f, boolean z, boolean z2, String str4, String str5, String str6, int i, int i2, Object obj) {
        CreateFantasyTeamModel createFantasyTeamModel2 = createFantasyTeamModel;
        int i3 = i2;
        return createFantasyTeamModel.copy((i3 & 1) != 0 ? createFantasyTeamModel2.userId : str, (i3 & 2) != 0 ? createFantasyTeamModel2.matchId : str2, (i3 & 4) != 0 ? createFantasyTeamModel2.contestId : str3, (i3 & 8) != 0 ? createFantasyTeamModel2.players : list, (i3 & 16) != 0 ? createFantasyTeamModel2.totalFantasyPoints : f, (i3 & 32) != 0 ? createFantasyTeamModel2.isBlocked : z, (i3 & 64) != 0 ? createFantasyTeamModel2.isDeleted : z2, (i3 & 128) != 0 ? createFantasyTeamModel2._id : str4, (i3 & 256) != 0 ? createFantasyTeamModel2.createdAt : str5, (i3 & 512) != 0 ? createFantasyTeamModel2.updatedAt : str6, (i3 & 1024) != 0 ? createFantasyTeamModel2.__v : i);
    }

    public final String component1() {
        return this.userId;
    }

    public final String component10() {
        return this.updatedAt;
    }

    public final int component11() {
        return this.__v;
    }

    public final String component2() {
        return this.matchId;
    }

    public final String component3() {
        return this.contestId;
    }

    public final List<Players> component4() {
        return this.players;
    }

    public final float component5() {
        return this.totalFantasyPoints;
    }

    public final boolean component6() {
        return this.isBlocked;
    }

    public final boolean component7() {
        return this.isDeleted;
    }

    public final String component8() {
        return this._id;
    }

    public final String component9() {
        return this.createdAt;
    }

    public final CreateFantasyTeamModel copy(String str, String str2, String str3, List<Players> list, float f, boolean z, boolean z2, String str4, String str5, String str6, int i) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "contestId");
        List<Players> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "players");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "_id");
        String str9 = str5;
        Intrinsics.checkNotNullParameter(str9, "createdAt");
        String str10 = str6;
        Intrinsics.checkNotNullParameter(str10, "updatedAt");
        return new CreateFantasyTeamModel(str, str2, str7, list2, f, z, z2, str8, str9, str10, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateFantasyTeamModel)) {
            return false;
        }
        CreateFantasyTeamModel createFantasyTeamModel = (CreateFantasyTeamModel) obj;
        return Intrinsics.areEqual((Object) this.userId, (Object) createFantasyTeamModel.userId) && Intrinsics.areEqual((Object) this.matchId, (Object) createFantasyTeamModel.matchId) && Intrinsics.areEqual((Object) this.contestId, (Object) createFantasyTeamModel.contestId) && Intrinsics.areEqual((Object) this.players, (Object) createFantasyTeamModel.players) && Intrinsics.areEqual((Object) Float.valueOf(this.totalFantasyPoints), (Object) Float.valueOf(createFantasyTeamModel.totalFantasyPoints)) && this.isBlocked == createFantasyTeamModel.isBlocked && this.isDeleted == createFantasyTeamModel.isDeleted && Intrinsics.areEqual((Object) this._id, (Object) createFantasyTeamModel._id) && Intrinsics.areEqual((Object) this.createdAt, (Object) createFantasyTeamModel.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) createFantasyTeamModel.updatedAt) && this.__v == createFantasyTeamModel.__v;
    }

    public int hashCode() {
        int hashCode = ((((((((this.userId.hashCode() * 31) + this.matchId.hashCode()) * 31) + this.contestId.hashCode()) * 31) + this.players.hashCode()) * 31) + Float.floatToIntBits(this.totalFantasyPoints)) * 31;
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
        return ((((((((i + (z2 ? 1 : 0)) * 31) + this._id.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v;
    }

    public String toString() {
        return "CreateFantasyTeamModel(userId=" + this.userId + ", matchId=" + this.matchId + ", contestId=" + this.contestId + ", players=" + this.players + ", totalFantasyPoints=" + this.totalFantasyPoints + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", _id=" + this._id + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ')';
    }

    public CreateFantasyTeamModel(String str, String str2, String str3, List<Players> list, float f, boolean z, boolean z2, String str4, String str5, String str6, int i) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(str3, "contestId");
        Intrinsics.checkNotNullParameter(list, "players");
        Intrinsics.checkNotNullParameter(str4, "_id");
        Intrinsics.checkNotNullParameter(str5, "createdAt");
        Intrinsics.checkNotNullParameter(str6, "updatedAt");
        this.userId = str;
        this.matchId = str2;
        this.contestId = str3;
        this.players = list;
        this.totalFantasyPoints = f;
        this.isBlocked = z;
        this.isDeleted = z2;
        this._id = str4;
        this.createdAt = str5;
        this.updatedAt = str6;
        this.__v = i;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final List<Players> getPlayers() {
        return this.players;
    }

    public final float getTotalFantasyPoints() {
        return this.totalFantasyPoints;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final String get_id() {
        return this._id;
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
}
