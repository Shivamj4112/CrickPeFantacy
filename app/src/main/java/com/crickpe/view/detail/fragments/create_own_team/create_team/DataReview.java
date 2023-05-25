package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\t\u0010\t\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\nHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/DataReview;", "Landroid/os/Parcelable;", "playing_xi", "", "(Z)V", "getPlaying_xi", "()Z", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: DataReview.kt */
public final class DataReview implements Parcelable {
    public static final Parcelable.Creator<DataReview> CREATOR = new Creator();
    @SerializedName("playing_xi")
    private final boolean playing_xi;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: DataReview.kt */
    public static final class Creator implements Parcelable.Creator<DataReview> {
        public final DataReview createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataReview(parcel.readInt() != 0);
        }

        public final DataReview[] newArray(int i) {
            return new DataReview[i];
        }
    }

    public static /* synthetic */ DataReview copy$default(DataReview dataReview, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = dataReview.playing_xi;
        }
        return dataReview.copy(z);
    }

    public final boolean component1() {
        return this.playing_xi;
    }

    public final DataReview copy(boolean z) {
        return new DataReview(z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DataReview) && this.playing_xi == ((DataReview) obj).playing_xi;
    }

    public int hashCode() {
        boolean z = this.playing_xi;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public String toString() {
        return "DataReview(playing_xi=" + this.playing_xi + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.playing_xi ? 1 : 0);
    }

    public DataReview(boolean z) {
        this.playing_xi = z;
    }

    public final boolean getPlaying_xi() {
        return this.playing_xi;
    }
}
