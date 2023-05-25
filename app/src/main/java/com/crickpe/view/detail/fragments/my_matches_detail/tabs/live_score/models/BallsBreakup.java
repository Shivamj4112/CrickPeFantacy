package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models;

import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BallsBreakup;", "", "dot_balls", "", "wides", "no_balls", "fours", "sixes", "(IIIII)V", "getDot_balls", "()I", "getFours", "getNo_balls", "getSixes", "getWides", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BallsBreakup.kt */
public final class BallsBreakup {
    private final int dot_balls;
    private final int fours;
    private final int no_balls;
    private final int sixes;
    private final int wides;

    public static /* synthetic */ BallsBreakup copy$default(BallsBreakup ballsBreakup, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = ballsBreakup.dot_balls;
        }
        if ((i6 & 2) != 0) {
            i2 = ballsBreakup.wides;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = ballsBreakup.no_balls;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = ballsBreakup.fours;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = ballsBreakup.sixes;
        }
        return ballsBreakup.copy(i, i7, i8, i9, i5);
    }

    public final int component1() {
        return this.dot_balls;
    }

    public final int component2() {
        return this.wides;
    }

    public final int component3() {
        return this.no_balls;
    }

    public final int component4() {
        return this.fours;
    }

    public final int component5() {
        return this.sixes;
    }

    public final BallsBreakup copy(int i, int i2, int i3, int i4, int i5) {
        return new BallsBreakup(i, i2, i3, i4, i5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BallsBreakup)) {
            return false;
        }
        BallsBreakup ballsBreakup = (BallsBreakup) obj;
        return this.dot_balls == ballsBreakup.dot_balls && this.wides == ballsBreakup.wides && this.no_balls == ballsBreakup.no_balls && this.fours == ballsBreakup.fours && this.sixes == ballsBreakup.sixes;
    }

    public int hashCode() {
        return (((((((this.dot_balls * 31) + this.wides) * 31) + this.no_balls) * 31) + this.fours) * 31) + this.sixes;
    }

    public String toString() {
        return "BallsBreakup(dot_balls=" + this.dot_balls + ", wides=" + this.wides + ", no_balls=" + this.no_balls + ", fours=" + this.fours + ", sixes=" + this.sixes + ')';
    }

    public BallsBreakup(int i, int i2, int i3, int i4, int i5) {
        this.dot_balls = i;
        this.wides = i2;
        this.no_balls = i3;
        this.fours = i4;
        this.sixes = i5;
    }

    public final int getDot_balls() {
        return this.dot_balls;
    }

    public final int getWides() {
        return this.wides;
    }

    public final int getNo_balls() {
        return this.no_balls;
    }

    public final int getFours() {
        return this.fours;
    }

    public final int getSixes() {
        return this.sixes;
    }
}
