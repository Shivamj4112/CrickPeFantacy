package com.crickpe.view.detail.fragments.create_own_team.my_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\f¢\u0006\u0002\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\fHÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\t\u0010,\u001a\u00020\fHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u000fHÆ\u0003J\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\fHÆ\u0001J\t\u00101\u001a\u00020\fHÖ\u0001J\u0013\u00102\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\fHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J\u0019\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\fHÖ\u0001R\u0016\u0010\u0013\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018¨\u0006<"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/FantasyTeams;", "Landroid/os/Parcelable;", "_id", "", "userId", "matchId", "players", "", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/Players;", "totalFantasyPoints", "", "sequence", "", "amount", "isBlocked", "", "isDeleted", "createdAt", "updatedAt", "__v", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FIIZZLjava/lang/String;Ljava/lang/String;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getAmount", "getCreatedAt", "()Z", "getMatchId", "getPlayers", "()Ljava/util/List;", "getSequence", "getTotalFantasyPoints", "()F", "getUpdatedAt", "getUserId", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyContestModel.kt */
public final class FantasyTeams implements Parcelable {
    public static final Parcelable.Creator<FantasyTeams> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("amount")
    private final int amount;
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
    @SerializedName("sequence")
    private final int sequence;
    @SerializedName("totalFantasyPoints")
    private final float totalFantasyPoints;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("userId")
    private final String userId;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyContestModel.kt */
    public static final class Creator implements Parcelable.Creator<FantasyTeams> {
        public final FantasyTeams createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Players.CREATOR.createFromParcel(parcel2));
            }
            return new FantasyTeams(readString, readString2, readString3, arrayList, parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final FantasyTeams[] newArray(int i) {
            return new FantasyTeams[i];
        }
    }

    public static /* synthetic */ FantasyTeams copy$default(FantasyTeams fantasyTeams, String str, String str2, String str3, List list, float f, int i, int i2, boolean z, boolean z2, String str4, String str5, int i3, int i4, Object obj) {
        FantasyTeams fantasyTeams2 = fantasyTeams;
        int i5 = i4;
        return fantasyTeams.copy((i5 & 1) != 0 ? fantasyTeams2._id : str, (i5 & 2) != 0 ? fantasyTeams2.userId : str2, (i5 & 4) != 0 ? fantasyTeams2.matchId : str3, (i5 & 8) != 0 ? fantasyTeams2.players : list, (i5 & 16) != 0 ? fantasyTeams2.totalFantasyPoints : f, (i5 & 32) != 0 ? fantasyTeams2.sequence : i, (i5 & 64) != 0 ? fantasyTeams2.amount : i2, (i5 & 128) != 0 ? fantasyTeams2.isBlocked : z, (i5 & 256) != 0 ? fantasyTeams2.isDeleted : z2, (i5 & 512) != 0 ? fantasyTeams2.createdAt : str4, (i5 & 1024) != 0 ? fantasyTeams2.updatedAt : str5, (i5 & 2048) != 0 ? fantasyTeams2.__v : i3);
    }

    public final String component1() {
        return this._id;
    }

    public final String component10() {
        return this.createdAt;
    }

    public final String component11() {
        return this.updatedAt;
    }

    public final int component12() {
        return this.__v;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.matchId;
    }

    public final List<Players> component4() {
        return this.players;
    }

    public final float component5() {
        return this.totalFantasyPoints;
    }

    public final int component6() {
        return this.sequence;
    }

    public final int component7() {
        return this.amount;
    }

    public final boolean component8() {
        return this.isBlocked;
    }

    public final boolean component9() {
        return this.isDeleted;
    }

    public final FantasyTeams copy(String str, String str2, String str3, List<Players> list, float f, int i, int i2, boolean z, boolean z2, String str4, String str5, int i3) {
        Intrinsics.checkNotNullParameter(str, "_id");
        String str6 = str2;
        Intrinsics.checkNotNullParameter(str6, "userId");
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "matchId");
        List<Players> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "players");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "createdAt");
        String str9 = str5;
        Intrinsics.checkNotNullParameter(str9, "updatedAt");
        return new FantasyTeams(str, str6, str7, list2, f, i, i2, z, z2, str8, str9, i3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyTeams)) {
            return false;
        }
        FantasyTeams fantasyTeams = (FantasyTeams) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) fantasyTeams._id) && Intrinsics.areEqual((Object) this.userId, (Object) fantasyTeams.userId) && Intrinsics.areEqual((Object) this.matchId, (Object) fantasyTeams.matchId) && Intrinsics.areEqual((Object) this.players, (Object) fantasyTeams.players) && Intrinsics.areEqual((Object) Float.valueOf(this.totalFantasyPoints), (Object) Float.valueOf(fantasyTeams.totalFantasyPoints)) && this.sequence == fantasyTeams.sequence && this.amount == fantasyTeams.amount && this.isBlocked == fantasyTeams.isBlocked && this.isDeleted == fantasyTeams.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) fantasyTeams.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) fantasyTeams.updatedAt) && this.__v == fantasyTeams.__v;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this._id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.matchId.hashCode()) * 31) + this.players.hashCode()) * 31) + Float.floatToIntBits(this.totalFantasyPoints)) * 31) + this.sequence) * 31) + this.amount) * 31;
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
        return ((((((i + (z2 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v;
    }

    public String toString() {
        return "FantasyTeams(_id=" + this._id + ", userId=" + this.userId + ", matchId=" + this.matchId + ", players=" + this.players + ", totalFantasyPoints=" + this.totalFantasyPoints + ", sequence=" + this.sequence + ", amount=" + this.amount + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.userId);
        parcel.writeString(this.matchId);
        List<Players> list = this.players;
        parcel.writeInt(list.size());
        for (Players writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeFloat(this.totalFantasyPoints);
        parcel.writeInt(this.sequence);
        parcel.writeInt(this.amount);
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.__v);
    }

    public FantasyTeams(String str, String str2, String str3, List<Players> list, float f, int i, int i2, boolean z, boolean z2, String str4, String str5, int i3) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "matchId");
        Intrinsics.checkNotNullParameter(list, "players");
        Intrinsics.checkNotNullParameter(str4, "createdAt");
        Intrinsics.checkNotNullParameter(str5, "updatedAt");
        this._id = str;
        this.userId = str2;
        this.matchId = str3;
        this.players = list;
        this.totalFantasyPoints = f;
        this.sequence = i;
        this.amount = i2;
        this.isBlocked = z;
        this.isDeleted = z2;
        this.createdAt = str4;
        this.updatedAt = str5;
        this.__v = i3;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final List<Players> getPlayers() {
        return this.players;
    }

    public final float getTotalFantasyPoints() {
        return this.totalFantasyPoints;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final int getAmount() {
        return this.amount;
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
}
