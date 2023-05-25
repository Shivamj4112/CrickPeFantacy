package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/PlayersModel;", "Landroid/os/Parcelable;", "match", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Match;", "playersInfo", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/PlayersInfo;", "Lkotlin/collections/ArrayList;", "(Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Match;Ljava/util/ArrayList;)V", "getMatch", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Match;", "getPlayersInfo", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersModel.kt */
public final class PlayersModel implements Parcelable {
    public static final Parcelable.Creator<PlayersModel> CREATOR = new Creator();
    @SerializedName("match")
    private final Match match;
    @SerializedName("playersInfo")
    private final ArrayList<PlayersInfo> playersInfo;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersModel.kt */
    public static final class Creator implements Parcelable.Creator<PlayersModel> {
        public final PlayersModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Match createFromParcel = Match.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(PlayersInfo.CREATOR.createFromParcel(parcel));
            }
            return new PlayersModel(createFromParcel, arrayList);
        }

        public final PlayersModel[] newArray(int i) {
            return new PlayersModel[i];
        }
    }

    public static /* synthetic */ PlayersModel copy$default(PlayersModel playersModel, Match match2, ArrayList<PlayersInfo> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            match2 = playersModel.match;
        }
        if ((i & 2) != 0) {
            arrayList = playersModel.playersInfo;
        }
        return playersModel.copy(match2, arrayList);
    }

    public final Match component1() {
        return this.match;
    }

    public final ArrayList<PlayersInfo> component2() {
        return this.playersInfo;
    }

    public final PlayersModel copy(Match match2, ArrayList<PlayersInfo> arrayList) {
        Intrinsics.checkNotNullParameter(match2, "match");
        Intrinsics.checkNotNullParameter(arrayList, "playersInfo");
        return new PlayersModel(match2, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayersModel)) {
            return false;
        }
        PlayersModel playersModel = (PlayersModel) obj;
        return Intrinsics.areEqual((Object) this.match, (Object) playersModel.match) && Intrinsics.areEqual((Object) this.playersInfo, (Object) playersModel.playersInfo);
    }

    public int hashCode() {
        return (this.match.hashCode() * 31) + this.playersInfo.hashCode();
    }

    public String toString() {
        return "PlayersModel(match=" + this.match + ", playersInfo=" + this.playersInfo + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.match.writeToParcel(parcel, i);
        ArrayList<PlayersInfo> arrayList = this.playersInfo;
        parcel.writeInt(arrayList.size());
        Iterator<PlayersInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public PlayersModel(Match match2, ArrayList<PlayersInfo> arrayList) {
        Intrinsics.checkNotNullParameter(match2, "match");
        Intrinsics.checkNotNullParameter(arrayList, "playersInfo");
        this.match = match2;
        this.playersInfo = arrayList;
    }

    public final Match getMatch() {
        return this.match;
    }

    public final ArrayList<PlayersInfo> getPlayersInfo() {
        return this.playersInfo;
    }
}
