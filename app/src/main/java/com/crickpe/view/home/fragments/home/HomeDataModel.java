package com.crickpe.view.home.fragments.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.intro.fragments.User;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0015HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/home/HomeDataModel;", "Landroid/os/Parcelable;", "userInfo", "Lcom/crickpe/view/intro/fragments/User;", "randomTeamAndPlayer", "Lcom/crickpe/view/home/fragments/home/RandomTeam;", "upcomingMatches", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "(Lcom/crickpe/view/intro/fragments/User;Lcom/crickpe/view/home/fragments/home/RandomTeam;Ljava/util/ArrayList;)V", "getRandomTeamAndPlayer", "()Lcom/crickpe/view/home/fragments/home/RandomTeam;", "getUpcomingMatches", "()Ljava/util/ArrayList;", "getUserInfo", "()Lcom/crickpe/view/intro/fragments/User;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeDataModel.kt */
public final class HomeDataModel implements Parcelable {
    public static final Parcelable.Creator<HomeDataModel> CREATOR = new Creator();
    @SerializedName("randomTeamAndPlayer")
    private final RandomTeam randomTeamAndPlayer;
    @SerializedName("upcomingMatches")
    private final ArrayList<UpcomingMatchModel> upcomingMatches;
    @SerializedName("userInfo")
    private final User userInfo;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: HomeDataModel.kt */
    public static final class Creator implements Parcelable.Creator<HomeDataModel> {
        public final HomeDataModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            User createFromParcel = User.CREATOR.createFromParcel(parcel);
            RandomTeam createFromParcel2 = parcel.readInt() == 0 ? null : RandomTeam.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(UpcomingMatchModel.CREATOR.createFromParcel(parcel));
            }
            return new HomeDataModel(createFromParcel, createFromParcel2, arrayList);
        }

        public final HomeDataModel[] newArray(int i) {
            return new HomeDataModel[i];
        }
    }

    public static /* synthetic */ HomeDataModel copy$default(HomeDataModel homeDataModel, User user, RandomTeam randomTeam, ArrayList<UpcomingMatchModel> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            user = homeDataModel.userInfo;
        }
        if ((i & 2) != 0) {
            randomTeam = homeDataModel.randomTeamAndPlayer;
        }
        if ((i & 4) != 0) {
            arrayList = homeDataModel.upcomingMatches;
        }
        return homeDataModel.copy(user, randomTeam, arrayList);
    }

    public final User component1() {
        return this.userInfo;
    }

    public final RandomTeam component2() {
        return this.randomTeamAndPlayer;
    }

    public final ArrayList<UpcomingMatchModel> component3() {
        return this.upcomingMatches;
    }

    public final HomeDataModel copy(User user, RandomTeam randomTeam, ArrayList<UpcomingMatchModel> arrayList) {
        Intrinsics.checkNotNullParameter(user, "userInfo");
        Intrinsics.checkNotNullParameter(arrayList, "upcomingMatches");
        return new HomeDataModel(user, randomTeam, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeDataModel)) {
            return false;
        }
        HomeDataModel homeDataModel = (HomeDataModel) obj;
        return Intrinsics.areEqual((Object) this.userInfo, (Object) homeDataModel.userInfo) && Intrinsics.areEqual((Object) this.randomTeamAndPlayer, (Object) homeDataModel.randomTeamAndPlayer) && Intrinsics.areEqual((Object) this.upcomingMatches, (Object) homeDataModel.upcomingMatches);
    }

    public int hashCode() {
        int hashCode = this.userInfo.hashCode() * 31;
        RandomTeam randomTeam = this.randomTeamAndPlayer;
        return ((hashCode + (randomTeam == null ? 0 : randomTeam.hashCode())) * 31) + this.upcomingMatches.hashCode();
    }

    public String toString() {
        return "HomeDataModel(userInfo=" + this.userInfo + ", randomTeamAndPlayer=" + this.randomTeamAndPlayer + ", upcomingMatches=" + this.upcomingMatches + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.userInfo.writeToParcel(parcel, i);
        RandomTeam randomTeam = this.randomTeamAndPlayer;
        if (randomTeam == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            randomTeam.writeToParcel(parcel, i);
        }
        ArrayList<UpcomingMatchModel> arrayList = this.upcomingMatches;
        parcel.writeInt(arrayList.size());
        Iterator<UpcomingMatchModel> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public HomeDataModel(User user, RandomTeam randomTeam, ArrayList<UpcomingMatchModel> arrayList) {
        Intrinsics.checkNotNullParameter(user, "userInfo");
        Intrinsics.checkNotNullParameter(arrayList, "upcomingMatches");
        this.userInfo = user;
        this.randomTeamAndPlayer = randomTeam;
        this.upcomingMatches = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HomeDataModel(User user, RandomTeam randomTeam, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(user, (i & 2) != 0 ? null : randomTeam, arrayList);
    }

    public final User getUserInfo() {
        return this.userInfo;
    }

    public final RandomTeam getRandomTeamAndPlayer() {
        return this.randomTeamAndPlayer;
    }

    public final ArrayList<UpcomingMatchModel> getUpcomingMatches() {
        return this.upcomingMatches;
    }
}
