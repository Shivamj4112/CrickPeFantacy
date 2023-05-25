package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/FantasyPoint;", "Landroid/os/Parcelable;", "matchCount", "", "totalFantasyPoints", "", "(IF)V", "getMatchCount", "()I", "getTotalFantasyPoints", "()F", "component1", "component2", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: FantasyPoint.kt */
public final class FantasyPoint implements Parcelable {
    public static final Parcelable.Creator<FantasyPoint> CREATOR = new Creator();
    @SerializedName("matchCount")
    private final int matchCount;
    @SerializedName("totalFantasyPoints")
    private final float totalFantasyPoints;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: FantasyPoint.kt */
    public static final class Creator implements Parcelable.Creator<FantasyPoint> {
        public final FantasyPoint createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FantasyPoint(parcel.readInt(), parcel.readFloat());
        }

        public final FantasyPoint[] newArray(int i) {
            return new FantasyPoint[i];
        }
    }

    public static /* synthetic */ FantasyPoint copy$default(FantasyPoint fantasyPoint, int i, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fantasyPoint.matchCount;
        }
        if ((i2 & 2) != 0) {
            f = fantasyPoint.totalFantasyPoints;
        }
        return fantasyPoint.copy(i, f);
    }

    public final int component1() {
        return this.matchCount;
    }

    public final float component2() {
        return this.totalFantasyPoints;
    }

    public final FantasyPoint copy(int i, float f) {
        return new FantasyPoint(i, f);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FantasyPoint)) {
            return false;
        }
        FantasyPoint fantasyPoint = (FantasyPoint) obj;
        return this.matchCount == fantasyPoint.matchCount && Intrinsics.areEqual((Object) Float.valueOf(this.totalFantasyPoints), (Object) Float.valueOf(fantasyPoint.totalFantasyPoints));
    }

    public int hashCode() {
        return (this.matchCount * 31) + Float.floatToIntBits(this.totalFantasyPoints);
    }

    public String toString() {
        return "FantasyPoint(matchCount=" + this.matchCount + ", totalFantasyPoints=" + this.totalFantasyPoints + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.matchCount);
        parcel.writeFloat(this.totalFantasyPoints);
    }

    public FantasyPoint(int i, float f) {
        this.matchCount = i;
        this.totalFantasyPoints = f;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FantasyPoint(int i, float f, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? 0.0f : f);
    }

    public final int getMatchCount() {
        return this.matchCount;
    }

    public final float getTotalFantasyPoints() {
        return this.totalFantasyPoints;
    }
}
