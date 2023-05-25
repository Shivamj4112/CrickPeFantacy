package com.crickpe.view.detail.fragments.settings.models.profile_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\u0019\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006%"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Bowler;", "Landroid/os/Parcelable;", "player_player_key", "", "name", "wickets", "", "run", "overs", "", "(Ljava/lang/String;Ljava/lang/String;IID)V", "getName", "()Ljava/lang/String;", "getOvers", "()D", "getPlayer_player_key", "getRun", "()I", "getWickets", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Bowler.kt */
public final class Bowler implements Parcelable {
    public static final Parcelable.Creator<Bowler> CREATOR = new Creator();
    @SerializedName("name")
    private final String name;
    @SerializedName("overs")
    private final double overs;
    @SerializedName("player_key")
    private final String player_player_key;
    @SerializedName("run")
    private final int run;
    @SerializedName("wickets")
    private final int wickets;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: Bowler.kt */
    public static final class Creator implements Parcelable.Creator<Bowler> {
        public final Bowler createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Bowler(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readDouble());
        }

        public final Bowler[] newArray(int i) {
            return new Bowler[i];
        }
    }

    public static /* synthetic */ Bowler copy$default(Bowler bowler, String str, String str2, int i, int i2, double d, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bowler.player_player_key;
        }
        if ((i3 & 2) != 0) {
            str2 = bowler.name;
        }
        String str3 = str2;
        if ((i3 & 4) != 0) {
            i = bowler.wickets;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = bowler.run;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            d = bowler.overs;
        }
        return bowler.copy(str, str3, i4, i5, d);
    }

    public final String component1() {
        return this.player_player_key;
    }

    public final String component2() {
        return this.name;
    }

    public final int component3() {
        return this.wickets;
    }

    public final int component4() {
        return this.run;
    }

    public final double component5() {
        return this.overs;
    }

    public final Bowler copy(String str, String str2, int i, int i2, double d) {
        Intrinsics.checkNotNullParameter(str, "player_player_key");
        Intrinsics.checkNotNullParameter(str2, "name");
        return new Bowler(str, str2, i, i2, d);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Bowler)) {
            return false;
        }
        Bowler bowler = (Bowler) obj;
        return Intrinsics.areEqual((Object) this.player_player_key, (Object) bowler.player_player_key) && Intrinsics.areEqual((Object) this.name, (Object) bowler.name) && this.wickets == bowler.wickets && this.run == bowler.run && Intrinsics.areEqual((Object) Double.valueOf(this.overs), (Object) Double.valueOf(bowler.overs));
    }

    public int hashCode() {
        return (((((((this.player_player_key.hashCode() * 31) + this.name.hashCode()) * 31) + this.wickets) * 31) + this.run) * 31) + Double.doubleToLongBits(this.overs);
    }

    public String toString() {
        return "Bowler(player_player_key=" + this.player_player_key + ", name=" + this.name + ", wickets=" + this.wickets + ", run=" + this.run + ", overs=" + this.overs + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.player_player_key);
        parcel.writeString(this.name);
        parcel.writeInt(this.wickets);
        parcel.writeInt(this.run);
        parcel.writeDouble(this.overs);
    }

    public Bowler(String str, String str2, int i, int i2, double d) {
        Intrinsics.checkNotNullParameter(str, "player_player_key");
        Intrinsics.checkNotNullParameter(str2, "name");
        this.player_player_key = str;
        this.name = str2;
        this.wickets = i;
        this.run = i2;
        this.overs = d;
    }

    public final String getPlayer_player_key() {
        return this.player_player_key;
    }

    public final String getName() {
        return this.name;
    }

    public final int getWickets() {
        return this.wickets;
    }

    public final int getRun() {
        return this.run;
    }

    public final double getOvers() {
        return this.overs;
    }
}
