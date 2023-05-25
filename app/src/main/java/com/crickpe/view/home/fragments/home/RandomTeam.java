package com.crickpe.view.home.fragments.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.intro.fragments.kyc.models.TeamCountryData;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\f\u001a\u00020\rHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0019\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u001a"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/home/RandomTeam;", "Landroid/os/Parcelable;", "team", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "players", "(Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;)V", "getPlayers", "()Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "getTeam", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeDataModel.kt */
public final class RandomTeam implements Parcelable {
    public static final Parcelable.Creator<RandomTeam> CREATOR = new Creator();
    @SerializedName("players")
    private final TeamCountryData players;
    @SerializedName("team")
    private final TeamCountryData team;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: HomeDataModel.kt */
    public static final class Creator implements Parcelable.Creator<RandomTeam> {
        public final RandomTeam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RandomTeam(TeamCountryData.CREATOR.createFromParcel(parcel), TeamCountryData.CREATOR.createFromParcel(parcel));
        }

        public final RandomTeam[] newArray(int i) {
            return new RandomTeam[i];
        }
    }

    public static /* synthetic */ RandomTeam copy$default(RandomTeam randomTeam, TeamCountryData teamCountryData, TeamCountryData teamCountryData2, int i, Object obj) {
        if ((i & 1) != 0) {
            teamCountryData = randomTeam.team;
        }
        if ((i & 2) != 0) {
            teamCountryData2 = randomTeam.players;
        }
        return randomTeam.copy(teamCountryData, teamCountryData2);
    }

    public final TeamCountryData component1() {
        return this.team;
    }

    public final TeamCountryData component2() {
        return this.players;
    }

    public final RandomTeam copy(TeamCountryData teamCountryData, TeamCountryData teamCountryData2) {
        Intrinsics.checkNotNullParameter(teamCountryData, "team");
        Intrinsics.checkNotNullParameter(teamCountryData2, "players");
        return new RandomTeam(teamCountryData, teamCountryData2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RandomTeam)) {
            return false;
        }
        RandomTeam randomTeam = (RandomTeam) obj;
        return Intrinsics.areEqual((Object) this.team, (Object) randomTeam.team) && Intrinsics.areEqual((Object) this.players, (Object) randomTeam.players);
    }

    public int hashCode() {
        return (this.team.hashCode() * 31) + this.players.hashCode();
    }

    public String toString() {
        return "RandomTeam(team=" + this.team + ", players=" + this.players + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.team.writeToParcel(parcel, i);
        this.players.writeToParcel(parcel, i);
    }

    public RandomTeam(TeamCountryData teamCountryData, TeamCountryData teamCountryData2) {
        Intrinsics.checkNotNullParameter(teamCountryData, "team");
        Intrinsics.checkNotNullParameter(teamCountryData2, "players");
        this.team = teamCountryData;
        this.players = teamCountryData2;
    }

    public final TeamCountryData getTeam() {
        return this.team;
    }

    public final TeamCountryData getPlayers() {
        return this.players;
    }
}
