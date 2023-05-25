package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BattingScore;", "", "runs", "", "balls", "fours", "sixes", "dot_balls", "strike_rate", "", "dismissal", "", "(IIIIIDLjava/lang/String;)V", "getBalls", "()I", "getDismissal", "()Ljava/lang/String;", "getDot_balls", "getFours", "getRuns", "getSixes", "getStrike_rate", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BattingScore.kt */
public final class BattingScore {
    private final int balls;
    private final String dismissal;
    private final int dot_balls;
    private final int fours;
    private final int runs;
    private final int sixes;
    private final double strike_rate;

    public static /* synthetic */ BattingScore copy$default(BattingScore battingScore, int i, int i2, int i3, int i4, int i5, double d, String str, int i6, Object obj) {
        BattingScore battingScore2 = battingScore;
        return battingScore.copy((i6 & 1) != 0 ? battingScore2.runs : i, (i6 & 2) != 0 ? battingScore2.balls : i2, (i6 & 4) != 0 ? battingScore2.fours : i3, (i6 & 8) != 0 ? battingScore2.sixes : i4, (i6 & 16) != 0 ? battingScore2.dot_balls : i5, (i6 & 32) != 0 ? battingScore2.strike_rate : d, (i6 & 64) != 0 ? battingScore2.dismissal : str);
    }

    public final int component1() {
        return this.runs;
    }

    public final int component2() {
        return this.balls;
    }

    public final int component3() {
        return this.fours;
    }

    public final int component4() {
        return this.sixes;
    }

    public final int component5() {
        return this.dot_balls;
    }

    public final double component6() {
        return this.strike_rate;
    }

    public final String component7() {
        return this.dismissal;
    }

    public final BattingScore copy(int i, int i2, int i3, int i4, int i5, double d, String str) {
        String str2 = str;
        Intrinsics.checkNotNullParameter(str2, "dismissal");
        return new BattingScore(i, i2, i3, i4, i5, d, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BattingScore)) {
            return false;
        }
        BattingScore battingScore = (BattingScore) obj;
        return this.runs == battingScore.runs && this.balls == battingScore.balls && this.fours == battingScore.fours && this.sixes == battingScore.sixes && this.dot_balls == battingScore.dot_balls && Intrinsics.areEqual((Object) Double.valueOf(this.strike_rate), (Object) Double.valueOf(battingScore.strike_rate)) && Intrinsics.areEqual((Object) this.dismissal, (Object) battingScore.dismissal);
    }

    public int hashCode() {
        return (((((((((((this.runs * 31) + this.balls) * 31) + this.fours) * 31) + this.sixes) * 31) + this.dot_balls) * 31) + Double.doubleToLongBits(this.strike_rate)) * 31) + this.dismissal.hashCode();
    }

    public String toString() {
        return "BattingScore(runs=" + this.runs + ", balls=" + this.balls + ", fours=" + this.fours + ", sixes=" + this.sixes + ", dot_balls=" + this.dot_balls + ", strike_rate=" + this.strike_rate + ", dismissal=" + this.dismissal + ')';
    }

    public BattingScore(int i, int i2, int i3, int i4, int i5, double d, String str) {
        Intrinsics.checkNotNullParameter(str, "dismissal");
        this.runs = i;
        this.balls = i2;
        this.fours = i3;
        this.sixes = i4;
        this.dot_balls = i5;
        this.strike_rate = d;
        this.dismissal = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BattingScore(int i, int i2, int i3, int i4, int i5, double d, String str, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, (i6 & 32) != 0 ? 0.0d : d, (i6 & 64) != 0 ? "" : str);
    }

    public final int getRuns() {
        return this.runs;
    }

    public final int getBalls() {
        return this.balls;
    }

    public final int getFours() {
        return this.fours;
    }

    public final int getSixes() {
        return this.sixes;
    }

    public final int getDot_balls() {
        return this.dot_balls;
    }

    public final double getStrike_rate() {
        return this.strike_rate;
    }

    public final String getDismissal() {
        return this.dismissal;
    }
}
