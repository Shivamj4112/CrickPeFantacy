package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/Score;", "", "runs", "", "balls", "fours", "sixes", "dot_balls", "run_rate", "", "(IIIIID)V", "getBalls", "()I", "getDot_balls", "getFours", "getRun_rate", "()D", "getRuns", "getSixes", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Score.kt */
public final class Score {
    private final int balls;
    private final int dot_balls;
    private final int fours;
    private final double run_rate;
    private final int runs;
    private final int sixes;

    public static /* synthetic */ Score copy$default(Score score, int i, int i2, int i3, int i4, int i5, double d, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = score.runs;
        }
        if ((i6 & 2) != 0) {
            i2 = score.balls;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = score.fours;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = score.sixes;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = score.dot_balls;
        }
        int i10 = i5;
        if ((i6 & 32) != 0) {
            d = score.run_rate;
        }
        return score.copy(i, i7, i8, i9, i10, d);
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
        return this.run_rate;
    }

    public final Score copy(int i, int i2, int i3, int i4, int i5, double d) {
        return new Score(i, i2, i3, i4, i5, d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Score)) {
            return false;
        }
        Score score = (Score) obj;
        return this.runs == score.runs && this.balls == score.balls && this.fours == score.fours && this.sixes == score.sixes && this.dot_balls == score.dot_balls && Intrinsics.areEqual((Object) Double.valueOf(this.run_rate), (Object) Double.valueOf(score.run_rate));
    }

    public int hashCode() {
        return (((((((((this.runs * 31) + this.balls) * 31) + this.fours) * 31) + this.sixes) * 31) + this.dot_balls) * 31) + Double.doubleToLongBits(this.run_rate);
    }

    public String toString() {
        return "Score(runs=" + this.runs + ", balls=" + this.balls + ", fours=" + this.fours + ", sixes=" + this.sixes + ", dot_balls=" + this.dot_balls + ", run_rate=" + this.run_rate + ')';
    }

    public Score(int i, int i2, int i3, int i4, int i5, double d) {
        this.runs = i;
        this.balls = i2;
        this.fours = i3;
        this.sixes = i4;
        this.dot_balls = i5;
        this.run_rate = d;
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

    public final double getRun_rate() {
        return this.run_rate;
    }
}
