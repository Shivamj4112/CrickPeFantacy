package com.crickpe.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/data/RecentEarningModel;", "Landroid/os/Parcelable;", "sample", "", "(Ljava/lang/String;)V", "getSample", "()Ljava/lang/String;", "setSample", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RecentEarningModel.kt */
public final class RecentEarningModel implements Parcelable {
    public static final Parcelable.Creator<RecentEarningModel> CREATOR = new Creator();
    @SerializedName("sample")
    private String sample;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: RecentEarningModel.kt */
    public static final class Creator implements Parcelable.Creator<RecentEarningModel> {
        public final RecentEarningModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RecentEarningModel(parcel.readString());
        }

        public final RecentEarningModel[] newArray(int i) {
            return new RecentEarningModel[i];
        }
    }

    public static /* synthetic */ RecentEarningModel copy$default(RecentEarningModel recentEarningModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recentEarningModel.sample;
        }
        return recentEarningModel.copy(str);
    }

    public final String component1() {
        return this.sample;
    }

    public final RecentEarningModel copy(String str) {
        return new RecentEarningModel(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecentEarningModel) && Intrinsics.areEqual((Object) this.sample, (Object) ((RecentEarningModel) obj).sample);
    }

    public int hashCode() {
        String str = this.sample;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "RecentEarningModel(sample=" + this.sample + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.sample);
    }

    public RecentEarningModel(String str) {
        this.sample = str;
    }

    public final String getSample() {
        return this.sample;
    }

    public final void setSample(String str) {
        this.sample = str;
    }
}
