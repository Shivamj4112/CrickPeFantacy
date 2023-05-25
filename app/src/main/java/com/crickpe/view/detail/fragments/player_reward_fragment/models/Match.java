package com.crickpe.view.detail.fragments.player_reward_fragment.models;

import com.crickpe.view.detail.fragments.contest_winners.models.model.Match$$ExternalSyntheticBackport0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Match;", "", "name", "", "startAtIST", "", "team1", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Team1;", "team2", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Team2;", "(Ljava/lang/String;JLcom/crickpe/view/detail/fragments/player_reward_fragment/models/Team1;Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Team2;)V", "getName", "()Ljava/lang/String;", "getStartAtIST", "()J", "getTeam1", "()Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Team1;", "getTeam2", "()Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Team2;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Match.kt */
public final class Match {
    private final String name;
    private final long startAtIST;
    private final Team1 team1;
    private final Team2 team2;

    public static /* synthetic */ Match copy$default(Match match, String str, long j, Team1 team12, Team2 team22, int i, Object obj) {
        if ((i & 1) != 0) {
            str = match.name;
        }
        if ((i & 2) != 0) {
            j = match.startAtIST;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            team12 = match.team1;
        }
        Team1 team13 = team12;
        if ((i & 8) != 0) {
            team22 = match.team2;
        }
        return match.copy(str, j2, team13, team22);
    }

    public final String component1() {
        return this.name;
    }

    public final long component2() {
        return this.startAtIST;
    }

    public final Team1 component3() {
        return this.team1;
    }

    public final Team2 component4() {
        return this.team2;
    }

    public final Match copy(String str, long j, Team1 team12, Team2 team22) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(team12, "team1");
        Intrinsics.checkNotNullParameter(team22, "team2");
        return new Match(str, j, team12, team22);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Match)) {
            return false;
        }
        Match match = (Match) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) match.name) && this.startAtIST == match.startAtIST && Intrinsics.areEqual((Object) this.team1, (Object) match.team1) && Intrinsics.areEqual((Object) this.team2, (Object) match.team2);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + Match$$ExternalSyntheticBackport0.m111m(this.startAtIST)) * 31) + this.team1.hashCode()) * 31) + this.team2.hashCode();
    }

    public String toString() {
        return "Match(name=" + this.name + ", startAtIST=" + this.startAtIST + ", team1=" + this.team1 + ", team2=" + this.team2 + ')';
    }

    public Match(String str, long j, Team1 team12, Team2 team22) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(team12, "team1");
        Intrinsics.checkNotNullParameter(team22, "team2");
        this.name = str;
        this.startAtIST = j;
        this.team1 = team12;
        this.team2 = team22;
    }

    public final String getName() {
        return this.name;
    }

    public final long getStartAtIST() {
        return this.startAtIST;
    }

    public final Team1 getTeam1() {
        return this.team1;
    }

    public final Team2 getTeam2() {
        return this.team2;
    }
}
