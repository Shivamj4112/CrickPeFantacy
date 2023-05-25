package com.crickpe.view.detail.fragments.profile;

import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/profile/CareerStats;", "", "contests", "", "matches", "series", "wins", "skillScore", "(IIIII)V", "getContests", "()I", "getMatches", "getSeries", "getSkillScore", "getWins", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileModel.kt */
public final class CareerStats {
    private final int contests;
    private final int matches;
    private final int series;
    private final int skillScore;
    private final int wins;

    public static /* synthetic */ CareerStats copy$default(CareerStats careerStats, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = careerStats.contests;
        }
        if ((i6 & 2) != 0) {
            i2 = careerStats.matches;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = careerStats.series;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = careerStats.wins;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = careerStats.skillScore;
        }
        return careerStats.copy(i, i7, i8, i9, i5);
    }

    public final int component1() {
        return this.contests;
    }

    public final int component2() {
        return this.matches;
    }

    public final int component3() {
        return this.series;
    }

    public final int component4() {
        return this.wins;
    }

    public final int component5() {
        return this.skillScore;
    }

    public final CareerStats copy(int i, int i2, int i3, int i4, int i5) {
        return new CareerStats(i, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CareerStats)) {
            return false;
        }
        CareerStats careerStats = (CareerStats) obj;
        return this.contests == careerStats.contests && this.matches == careerStats.matches && this.series == careerStats.series && this.wins == careerStats.wins && this.skillScore == careerStats.skillScore;
    }

    public int hashCode() {
        return (((((((this.contests * 31) + this.matches) * 31) + this.series) * 31) + this.wins) * 31) + this.skillScore;
    }

    public String toString() {
        return "CareerStats(contests=" + this.contests + ", matches=" + this.matches + ", series=" + this.series + ", wins=" + this.wins + ", skillScore=" + this.skillScore + ')';
    }

    public CareerStats(int i, int i2, int i3, int i4, int i5) {
        this.contests = i;
        this.matches = i2;
        this.series = i3;
        this.wins = i4;
        this.skillScore = i5;
    }

    public final int getContests() {
        return this.contests;
    }

    public final int getMatches() {
        return this.matches;
    }

    public final int getSeries() {
        return this.series;
    }

    public final int getWins() {
        return this.wins;
    }

    public final int getSkillScore() {
        return this.skillScore;
    }
}
