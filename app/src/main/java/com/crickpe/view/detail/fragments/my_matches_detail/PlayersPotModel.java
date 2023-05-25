package com.crickpe.view.detail.fragments.my_matches_detail;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011HÖ\u0001R&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/PlayersPotModel;", "Landroid/os/Parcelable;", "totalEarning", "", "players", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Players;", "Lkotlin/collections/ArrayList;", "(DLjava/util/ArrayList;)V", "getPlayers", "()Ljava/util/ArrayList;", "getTotalEarning", "()D", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersPotModel.kt */
public final class PlayersPotModel implements Parcelable {
    public static final Parcelable.Creator<PlayersPotModel> CREATOR = new Creator();
    @SerializedName("players")
    private final ArrayList<Players> players;
    @SerializedName("totalEarning")
    private final double totalEarning;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersPotModel.kt */
    public static final class Creator implements Parcelable.Creator<PlayersPotModel> {
        public final PlayersPotModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            double readDouble = parcel.readDouble();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Players.CREATOR.createFromParcel(parcel));
            }
            return new PlayersPotModel(readDouble, arrayList);
        }

        public final PlayersPotModel[] newArray(int i) {
            return new PlayersPotModel[i];
        }
    }

    public static /* synthetic */ PlayersPotModel copy$default(PlayersPotModel playersPotModel, double d, ArrayList<Players> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            d = playersPotModel.totalEarning;
        }
        if ((i & 2) != 0) {
            arrayList = playersPotModel.players;
        }
        return playersPotModel.copy(d, arrayList);
    }

    public final double component1() {
        return this.totalEarning;
    }

    public final ArrayList<Players> component2() {
        return this.players;
    }

    public final PlayersPotModel copy(double d, ArrayList<Players> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "players");
        return new PlayersPotModel(d, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayersPotModel)) {
            return false;
        }
        PlayersPotModel playersPotModel = (PlayersPotModel) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.totalEarning), (Object) Double.valueOf(playersPotModel.totalEarning)) && Intrinsics.areEqual((Object) this.players, (Object) playersPotModel.players);
    }

    public int hashCode() {
        return (Double.doubleToLongBits(this.totalEarning) * 31) + this.players.hashCode();
    }

    public String toString() {
        return "PlayersPotModel(totalEarning=" + this.totalEarning + ", players=" + this.players + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeDouble(this.totalEarning);
        ArrayList<Players> arrayList = this.players;
        parcel.writeInt(arrayList.size());
        Iterator<Players> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public PlayersPotModel(double d, ArrayList<Players> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "players");
        this.totalEarning = d;
        this.players = arrayList;
    }

    public final double getTotalEarning() {
        return this.totalEarning;
    }

    public final ArrayList<Players> getPlayers() {
        return this.players;
    }
}
