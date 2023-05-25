package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006*"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BowlingScore;", "", "balls_breakup", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BallsBreakup;", "runs", "", "balls", "economy", "", "extras", "wickets", "maiden_overs", "overs", "", "(Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BallsBreakup;IIDIIIF)V", "getBalls", "()I", "getBalls_breakup", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BallsBreakup;", "getEconomy", "()D", "getExtras", "getMaiden_overs", "getOvers", "()F", "getRuns", "getWickets", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BowlingScore.kt */
public final class BowlingScore {
    private final int balls;
    private final BallsBreakup balls_breakup;
    private final double economy;
    private final int extras;
    private final int maiden_overs;
    private final float overs;
    private final int runs;
    private final int wickets;

    public static /* synthetic */ BowlingScore copy$default(BowlingScore bowlingScore, BallsBreakup ballsBreakup, int i, int i2, double d, int i3, int i4, int i5, float f, int i6, Object obj) {
        BowlingScore bowlingScore2 = bowlingScore;
        int i7 = i6;
        return bowlingScore.copy((i7 & 1) != 0 ? bowlingScore2.balls_breakup : ballsBreakup, (i7 & 2) != 0 ? bowlingScore2.runs : i, (i7 & 4) != 0 ? bowlingScore2.balls : i2, (i7 & 8) != 0 ? bowlingScore2.economy : d, (i7 & 16) != 0 ? bowlingScore2.extras : i3, (i7 & 32) != 0 ? bowlingScore2.wickets : i4, (i7 & 64) != 0 ? bowlingScore2.maiden_overs : i5, (i7 & 128) != 0 ? bowlingScore2.overs : f);
    }

    public final BallsBreakup component1() {
        return this.balls_breakup;
    }

    public final int component2() {
        return this.runs;
    }

    public final int component3() {
        return this.balls;
    }

    public final double component4() {
        return this.economy;
    }

    public final int component5() {
        return this.extras;
    }

    public final int component6() {
        return this.wickets;
    }

    public final int component7() {
        return this.maiden_overs;
    }

    public final float component8() {
        return this.overs;
    }

    public final BowlingScore copy(BallsBreakup ballsBreakup, int i, int i2, double d, int i3, int i4, int i5, float f) {
        Intrinsics.checkNotNullParameter(ballsBreakup, "balls_breakup");
        return new BowlingScore(ballsBreakup, i, i2, d, i3, i4, i5, f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BowlingScore)) {
            return false;
        }
        BowlingScore bowlingScore = (BowlingScore) obj;
        return Intrinsics.areEqual((Object) this.balls_breakup, (Object) bowlingScore.balls_breakup) && this.runs == bowlingScore.runs && this.balls == bowlingScore.balls && Intrinsics.areEqual((Object) Double.valueOf(this.economy), (Object) Double.valueOf(bowlingScore.economy)) && this.extras == bowlingScore.extras && this.wickets == bowlingScore.wickets && this.maiden_overs == bowlingScore.maiden_overs && Intrinsics.areEqual((Object) Float.valueOf(this.overs), (Object) Float.valueOf(bowlingScore.overs));
    }

    public int hashCode() {
        return (((((((((((((this.balls_breakup.hashCode() * 31) + this.runs) * 31) + this.balls) * 31) + Double.doubleToLongBits(this.economy)) * 31) + this.extras) * 31) + this.wickets) * 31) + this.maiden_overs) * 31) + Float.floatToIntBits(this.overs);
    }

    public String toString() {
        return "BowlingScore(balls_breakup=" + this.balls_breakup + ", runs=" + this.runs + ", balls=" + this.balls + ", economy=" + this.economy + ", extras=" + this.extras + ", wickets=" + this.wickets + ", maiden_overs=" + this.maiden_overs + ", overs=" + this.overs + ')';
    }

    public BowlingScore(BallsBreakup ballsBreakup, int i, int i2, double d, int i3, int i4, int i5, float f) {
        Intrinsics.checkNotNullParameter(ballsBreakup, "balls_breakup");
        this.balls_breakup = ballsBreakup;
        this.runs = i;
        this.balls = i2;
        this.economy = d;
        this.extras = i3;
        this.wickets = i4;
        this.maiden_overs = i5;
        this.overs = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BowlingScore(BallsBreakup ballsBreakup, int i, int i2, double d, int i3, int i4, int i5, float f, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(ballsBreakup, i, i2, (i6 & 8) != 0 ? 0.0d : d, i3, i4, i5, f);
    }

    public final BallsBreakup getBalls_breakup() {
        return this.balls_breakup;
    }

    public final int getRuns() {
        return this.runs;
    }

    public final int getBalls() {
        return this.balls;
    }

    public final double getEconomy() {
        return this.economy;
    }

    public final int getExtras() {
        return this.extras;
    }

    public final int getWickets() {
        return this.wickets;
    }

    public final int getMaiden_overs() {
        return this.maiden_overs;
    }

    public final float getOvers() {
        return this.overs;
    }
}
