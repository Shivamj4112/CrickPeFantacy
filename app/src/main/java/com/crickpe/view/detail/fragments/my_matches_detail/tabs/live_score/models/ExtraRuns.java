package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models;

import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003JE\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/ExtraRuns;", "", "extra", "", "bye", "leg_bye", "wide", "no_ball", "penalty", "(IIIIII)V", "getBye", "()I", "getExtra", "getLeg_bye", "getNo_ball", "getPenalty", "getWide", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ExtraRuns.kt */
public final class ExtraRuns {
    private final int bye;
    private final int extra;
    private final int leg_bye;
    private final int no_ball;
    private final int penalty;
    private final int wide;

    public static /* synthetic */ ExtraRuns copy$default(ExtraRuns extraRuns, int i, int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i = extraRuns.extra;
        }
        if ((i7 & 2) != 0) {
            i2 = extraRuns.bye;
        }
        int i8 = i2;
        if ((i7 & 4) != 0) {
            i3 = extraRuns.leg_bye;
        }
        int i9 = i3;
        if ((i7 & 8) != 0) {
            i4 = extraRuns.wide;
        }
        int i10 = i4;
        if ((i7 & 16) != 0) {
            i5 = extraRuns.no_ball;
        }
        int i11 = i5;
        if ((i7 & 32) != 0) {
            i6 = extraRuns.penalty;
        }
        return extraRuns.copy(i, i8, i9, i10, i11, i6);
    }

    public final int component1() {
        return this.extra;
    }

    public final int component2() {
        return this.bye;
    }

    public final int component3() {
        return this.leg_bye;
    }

    public final int component4() {
        return this.wide;
    }

    public final int component5() {
        return this.no_ball;
    }

    public final int component6() {
        return this.penalty;
    }

    public final ExtraRuns copy(int i, int i2, int i3, int i4, int i5, int i6) {
        return new ExtraRuns(i, i2, i3, i4, i5, i6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtraRuns)) {
            return false;
        }
        ExtraRuns extraRuns = (ExtraRuns) obj;
        return this.extra == extraRuns.extra && this.bye == extraRuns.bye && this.leg_bye == extraRuns.leg_bye && this.wide == extraRuns.wide && this.no_ball == extraRuns.no_ball && this.penalty == extraRuns.penalty;
    }

    public int hashCode() {
        return (((((((((this.extra * 31) + this.bye) * 31) + this.leg_bye) * 31) + this.wide) * 31) + this.no_ball) * 31) + this.penalty;
    }

    public String toString() {
        return "ExtraRuns(extra=" + this.extra + ", bye=" + this.bye + ", leg_bye=" + this.leg_bye + ", wide=" + this.wide + ", no_ball=" + this.no_ball + ", penalty=" + this.penalty + ')';
    }

    public ExtraRuns(int i, int i2, int i3, int i4, int i5, int i6) {
        this.extra = i;
        this.bye = i2;
        this.leg_bye = i3;
        this.wide = i4;
        this.no_ball = i5;
        this.penalty = i6;
    }

    public final int getExtra() {
        return this.extra;
    }

    public final int getBye() {
        return this.bye;
    }

    public final int getLeg_bye() {
        return this.leg_bye;
    }

    public final int getWide() {
        return this.wide;
    }

    public final int getNo_ball() {
        return this.no_ball;
    }

    public final int getPenalty() {
        return this.penalty;
    }
}
