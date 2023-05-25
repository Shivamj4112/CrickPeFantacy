package com.crickpe.view.home.fragments.my_matches;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/my_matches/BatsmanNonStriker;", "", "player_player_key", "", "name", "ball", "", "run", "(Ljava/lang/String;Ljava/lang/String;II)V", "getBall", "()I", "getName", "()Ljava/lang/String;", "getPlayer_player_key", "getRun", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyMatchesModel.kt */
public final class BatsmanNonStriker {
    private final int ball;
    private final String name;
    private final String player_player_key;
    private final int run;

    public static /* synthetic */ BatsmanNonStriker copy$default(BatsmanNonStriker batsmanNonStriker, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = batsmanNonStriker.player_player_key;
        }
        if ((i3 & 2) != 0) {
            str2 = batsmanNonStriker.name;
        }
        if ((i3 & 4) != 0) {
            i = batsmanNonStriker.ball;
        }
        if ((i3 & 8) != 0) {
            i2 = batsmanNonStriker.run;
        }
        return batsmanNonStriker.copy(str, str2, i, i2);
    }

    public final String component1() {
        return this.player_player_key;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.ball;
    }

    public final int component4() {
        return this.run;
    }

    public final BatsmanNonStriker copy(String str, String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "player_player_key");
        Intrinsics.checkNotNullParameter(str2, "name");
        return new BatsmanNonStriker(str, str2, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BatsmanNonStriker)) {
            return false;
        }
        BatsmanNonStriker batsmanNonStriker = (BatsmanNonStriker) obj;
        return Intrinsics.areEqual((Object) this.player_player_key, (Object) batsmanNonStriker.player_player_key) && Intrinsics.areEqual((Object) this.name, (Object) batsmanNonStriker.name) && this.ball == batsmanNonStriker.ball && this.run == batsmanNonStriker.run;
    }

    public int hashCode() {
        return (((((this.player_player_key.hashCode() * 31) + this.name.hashCode()) * 31) + this.ball) * 31) + this.run;
    }

    public String toString() {
        return "BatsmanNonStriker(player_player_key=" + this.player_player_key + ", name=" + this.name + ", ball=" + this.ball + ", run=" + this.run + ')';
    }

    public BatsmanNonStriker(String str, String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "player_player_key");
        Intrinsics.checkNotNullParameter(str2, "name");
        this.player_player_key = str;
        this.name = str2;
        this.ball = i;
        this.run = i2;
    }

    public final String getPlayer_player_key() {
        return this.player_player_key;
    }

    public final String getName() {
        return this.name;
    }

    public final int getBall() {
        return this.ball;
    }

    public final int getRun() {
        return this.run;
    }
}
