package com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\u0019\u0010(\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0012HÆ\u0003Jo\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001J\u0013\u0010-\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\bHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\bHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0017\"\u0004\b\u001a\u0010\u0019R&\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00067"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "Landroid/os/Parcelable;", "_id", "", "isAlreadyJoin", "", "isSelected", "sequence", "", "playersCountArr", "", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/PlayersCountArr;", "players", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamPlayers;", "Lkotlin/collections/ArrayList;", "fantasyTeamId", "totalFantasyPoints", "", "(Ljava/lang/String;ZZILjava/util/List;Ljava/util/ArrayList;Ljava/lang/String;D)V", "get_id", "()Ljava/lang/String;", "getFantasyTeamId", "()Z", "setAlreadyJoin", "(Z)V", "setSelected", "getPlayers", "()Ljava/util/ArrayList;", "getPlayersCountArr", "()Ljava/util/List;", "getSequence", "()I", "getTotalFantasyPoints", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: FantasyTeamListModel.kt */
public final class FantasyTeamListModel implements Parcelable {
    public static final Parcelable.Creator<FantasyTeamListModel> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("fantasyTeamId")
    private final String fantasyTeamId;
    @SerializedName("isAlreadyJoin")
    private boolean isAlreadyJoin;
    @SerializedName("isSelected")
    private boolean isSelected;
    @SerializedName("players")
    private final ArrayList<FantasyTeamPlayers> players;
    @SerializedName("playersCountArr")
    private final List<PlayersCountArr> playersCountArr;
    @SerializedName("sequence")
    private final int sequence;
    @SerializedName("totalFantasyPoints")
    private final double totalFantasyPoints;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: FantasyTeamListModel.kt */
    public static final class Creator implements Parcelable.Creator<FantasyTeamListModel> {
        public final FantasyTeamListModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(PlayersCountArr.CREATOR.createFromParcel(parcel));
            }
            List list = arrayList;
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i2 = 0; i2 != readInt3; i2++) {
                arrayList2.add(FantasyTeamPlayers.CREATOR.createFromParcel(parcel));
            }
            return new FantasyTeamListModel(readString, z, z2, readInt, list, arrayList2, parcel.readString(), parcel.readDouble());
        }

        public final FantasyTeamListModel[] newArray(int i) {
            return new FantasyTeamListModel[i];
        }
    }

    public static /* synthetic */ FantasyTeamListModel copy$default(FantasyTeamListModel fantasyTeamListModel, String str, boolean z, boolean z2, int i, List list, ArrayList arrayList, String str2, double d, int i2, Object obj) {
        FantasyTeamListModel fantasyTeamListModel2 = fantasyTeamListModel;
        int i3 = i2;
        return fantasyTeamListModel.copy((i3 & 1) != 0 ? fantasyTeamListModel2._id : str, (i3 & 2) != 0 ? fantasyTeamListModel2.isAlreadyJoin : z, (i3 & 4) != 0 ? fantasyTeamListModel2.isSelected : z2, (i3 & 8) != 0 ? fantasyTeamListModel2.sequence : i, (i3 & 16) != 0 ? fantasyTeamListModel2.playersCountArr : list, (i3 & 32) != 0 ? fantasyTeamListModel2.players : arrayList, (i3 & 64) != 0 ? fantasyTeamListModel2.fantasyTeamId : str2, (i3 & 128) != 0 ? fantasyTeamListModel2.totalFantasyPoints : d);
    }

    public final String component1() {
        return this._id;
    }

    public final boolean component2() {
        return this.isAlreadyJoin;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final int component4() {
        return this.sequence;
    }

    public final List<PlayersCountArr> component5() {
        return this.playersCountArr;
    }

    public final ArrayList<FantasyTeamPlayers> component6() {
        return this.players;
    }

    public final String component7() {
        return this.fantasyTeamId;
    }

    public final double component8() {
        return this.totalFantasyPoints;
    }

    public final FantasyTeamListModel copy(String str, boolean z, boolean z2, int i, List<PlayersCountArr> list, ArrayList<FantasyTeamPlayers> arrayList, String str2, double d) {
        Intrinsics.checkNotNullParameter(str, "_id");
        List<PlayersCountArr> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "playersCountArr");
        ArrayList<FantasyTeamPlayers> arrayList2 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList2, "players");
        String str3 = str2;
        Intrinsics.checkNotNullParameter(str3, "fantasyTeamId");
        return new FantasyTeamListModel(str, z, z2, i, list2, arrayList2, str3, d);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyTeamListModel)) {
            return false;
        }
        FantasyTeamListModel fantasyTeamListModel = (FantasyTeamListModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) fantasyTeamListModel._id) && this.isAlreadyJoin == fantasyTeamListModel.isAlreadyJoin && this.isSelected == fantasyTeamListModel.isSelected && this.sequence == fantasyTeamListModel.sequence && Intrinsics.areEqual((Object) this.playersCountArr, (Object) fantasyTeamListModel.playersCountArr) && Intrinsics.areEqual((Object) this.players, (Object) fantasyTeamListModel.players) && Intrinsics.areEqual((Object) this.fantasyTeamId, (Object) fantasyTeamListModel.fantasyTeamId) && Intrinsics.areEqual((Object) Double.valueOf(this.totalFantasyPoints), (Object) Double.valueOf(fantasyTeamListModel.totalFantasyPoints));
    }

    public int hashCode() {
        int hashCode = this._id.hashCode() * 31;
        boolean z = this.isAlreadyJoin;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isSelected;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((((i + (z2 ? 1 : 0)) * 31) + this.sequence) * 31) + this.playersCountArr.hashCode()) * 31) + this.players.hashCode()) * 31) + this.fantasyTeamId.hashCode()) * 31) + Double.doubleToLongBits(this.totalFantasyPoints);
    }

    public String toString() {
        return "FantasyTeamListModel(_id=" + this._id + ", isAlreadyJoin=" + this.isAlreadyJoin + ", isSelected=" + this.isSelected + ", sequence=" + this.sequence + ", playersCountArr=" + this.playersCountArr + ", players=" + this.players + ", fantasyTeamId=" + this.fantasyTeamId + ", totalFantasyPoints=" + this.totalFantasyPoints + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeInt(this.isAlreadyJoin ? 1 : 0);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeInt(this.sequence);
        List<PlayersCountArr> list = this.playersCountArr;
        parcel.writeInt(list.size());
        for (PlayersCountArr writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        ArrayList<FantasyTeamPlayers> arrayList = this.players;
        parcel.writeInt(arrayList.size());
        Iterator<FantasyTeamPlayers> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.fantasyTeamId);
        parcel.writeDouble(this.totalFantasyPoints);
    }

    public FantasyTeamListModel(String str, boolean z, boolean z2, int i, List<PlayersCountArr> list, ArrayList<FantasyTeamPlayers> arrayList, String str2, double d) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(list, "playersCountArr");
        Intrinsics.checkNotNullParameter(arrayList, "players");
        Intrinsics.checkNotNullParameter(str2, "fantasyTeamId");
        this._id = str;
        this.isAlreadyJoin = z;
        this.isSelected = z2;
        this.sequence = i;
        this.playersCountArr = list;
        this.players = arrayList;
        this.fantasyTeamId = str2;
        this.totalFantasyPoints = d;
    }

    public final String get_id() {
        return this._id;
    }

    public final boolean isAlreadyJoin() {
        return this.isAlreadyJoin;
    }

    public final void setAlreadyJoin(boolean z) {
        this.isAlreadyJoin = z;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final int getSequence() {
        return this.sequence;
    }

    public final List<PlayersCountArr> getPlayersCountArr() {
        return this.playersCountArr;
    }

    public final ArrayList<FantasyTeamPlayers> getPlayers() {
        return this.players;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }

    public final double getTotalFantasyPoints() {
        return this.totalFantasyPoints;
    }
}
