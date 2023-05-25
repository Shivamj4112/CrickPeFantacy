package com.crickpe.view.detail.fragments.player_reward_fragment.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0001HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/BowlingStyle;", "", "arm", "", "pace", "bowling_type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getArm", "()Ljava/lang/String;", "getBowling_type", "()Ljava/lang/Object;", "getPace", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BowlingStyle.kt */
public final class BowlingStyle {
    private final String arm;
    private final Object bowling_type;
    private final String pace;

    public static /* synthetic */ BowlingStyle copy$default(BowlingStyle bowlingStyle, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = bowlingStyle.arm;
        }
        if ((i & 2) != 0) {
            str2 = bowlingStyle.pace;
        }
        if ((i & 4) != 0) {
            obj = bowlingStyle.bowling_type;
        }
        return bowlingStyle.copy(str, str2, obj);
    }

    public final String component1() {
        return this.arm;
    }

    public final String component2() {
        return this.pace;
    }

    public final Object component3() {
        return this.bowling_type;
    }

    public final BowlingStyle copy(String str, String str2, Object obj) {
        Intrinsics.checkNotNullParameter(str, "arm");
        Intrinsics.checkNotNullParameter(str2, "pace");
        Intrinsics.checkNotNullParameter(obj, "bowling_type");
        return new BowlingStyle(str, str2, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BowlingStyle)) {
            return false;
        }
        BowlingStyle bowlingStyle = (BowlingStyle) obj;
        return Intrinsics.areEqual((Object) this.arm, (Object) bowlingStyle.arm) && Intrinsics.areEqual((Object) this.pace, (Object) bowlingStyle.pace) && Intrinsics.areEqual(this.bowling_type, bowlingStyle.bowling_type);
    }

    public int hashCode() {
        return (((this.arm.hashCode() * 31) + this.pace.hashCode()) * 31) + this.bowling_type.hashCode();
    }

    public String toString() {
        return "BowlingStyle(arm=" + this.arm + ", pace=" + this.pace + ", bowling_type=" + this.bowling_type + ')';
    }

    public BowlingStyle(String str, String str2, Object obj) {
        Intrinsics.checkNotNullParameter(str, "arm");
        Intrinsics.checkNotNullParameter(str2, "pace");
        Intrinsics.checkNotNullParameter(obj, "bowling_type");
        this.arm = str;
        this.pace = str2;
        this.bowling_type = obj;
    }

    public final String getArm() {
        return this.arm;
    }

    public final String getPace() {
        return this.pace;
    }

    public final Object getBowling_type() {
        return this.bowling_type;
    }
}
