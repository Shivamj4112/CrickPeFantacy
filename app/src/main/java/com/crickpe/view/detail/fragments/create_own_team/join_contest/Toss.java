package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Toss;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "called", "", "winner", "elected", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCalled", "()Ljava/lang/String;", "getElected", "getWinner", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestDetailModel.kt */
public final class Toss extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<Toss> CREATOR = new Creator();
    @SerializedName("called")
    private final String called;
    @SerializedName("elected")
    private final String elected;
    @SerializedName("winner")
    private final String winner;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestDetailModel.kt */
    public static final class Creator implements Parcelable.Creator<Toss> {
        public final Toss createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Toss(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Toss[] newArray(int i) {
            return new Toss[i];
        }
    }

    public static /* synthetic */ Toss copy$default(Toss toss, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = toss.called;
        }
        if ((i & 2) != 0) {
            str2 = toss.winner;
        }
        if ((i & 4) != 0) {
            str3 = toss.elected;
        }
        return toss.copy(str, str2, str3);
    }

    public final String component1() {
        return this.called;
    }

    public final String component2() {
        return this.winner;
    }

    public final String component3() {
        return this.elected;
    }

    public final Toss copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "called");
        Intrinsics.checkNotNullParameter(str2, "winner");
        Intrinsics.checkNotNullParameter(str3, "elected");
        return new Toss(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toss)) {
            return false;
        }
        Toss toss = (Toss) obj;
        return Intrinsics.areEqual((Object) this.called, (Object) toss.called) && Intrinsics.areEqual((Object) this.winner, (Object) toss.winner) && Intrinsics.areEqual((Object) this.elected, (Object) toss.elected);
    }

    public int hashCode() {
        return (((this.called.hashCode() * 31) + this.winner.hashCode()) * 31) + this.elected.hashCode();
    }

    public String toString() {
        return "Toss(called=" + this.called + ", winner=" + this.winner + ", elected=" + this.elected + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.called);
        parcel.writeString(this.winner);
        parcel.writeString(this.elected);
    }

    public final String getCalled() {
        return this.called;
    }

    public final String getWinner() {
        return this.winner;
    }

    public final String getElected() {
        return this.elected;
    }

    public Toss(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "called");
        Intrinsics.checkNotNullParameter(str2, "winner");
        Intrinsics.checkNotNullParameter(str3, "elected");
        this.called = str;
        this.winner = str2;
        this.elected = str3;
    }
}
