package com.crickpe.data.leaderboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, mo48222d2 = {"Lcom/crickpe/data/leaderboard/PlayerInfo;", "Landroid/os/Parcelable;", "_id", "", "name", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getImageUrl", "getName", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LeaderboardModel.kt */
public final class PlayerInfo implements Parcelable {
    public static final Parcelable.Creator<PlayerInfo> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("imageUrl")
    private final String imageUrl;
    @SerializedName("name")
    private final String name;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: LeaderboardModel.kt */
    public static final class Creator implements Parcelable.Creator<PlayerInfo> {
        public final PlayerInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PlayerInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final PlayerInfo[] newArray(int i) {
            return new PlayerInfo[i];
        }
    }

    public static /* synthetic */ PlayerInfo copy$default(PlayerInfo playerInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = playerInfo._id;
        }
        if ((i & 2) != 0) {
            str2 = playerInfo.name;
        }
        if ((i & 4) != 0) {
            str3 = playerInfo.imageUrl;
        }
        return playerInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final PlayerInfo copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "imageUrl");
        return new PlayerInfo(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerInfo)) {
            return false;
        }
        PlayerInfo playerInfo = (PlayerInfo) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) playerInfo._id) && Intrinsics.areEqual((Object) this.name, (Object) playerInfo.name) && Intrinsics.areEqual((Object) this.imageUrl, (Object) playerInfo.imageUrl);
    }

    public int hashCode() {
        return (((this._id.hashCode() * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "PlayerInfo(_id=" + this._id + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.name);
        parcel.writeString(this.imageUrl);
    }

    public PlayerInfo(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "imageUrl");
        this._id = str;
        this.name = str2;
        this.imageUrl = str3;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }
}
