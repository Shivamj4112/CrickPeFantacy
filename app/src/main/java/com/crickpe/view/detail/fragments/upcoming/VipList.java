package com.crickpe.view.detail.fragments.upcoming;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.detail.fragments.contest_winners.models.model.Match$$ExternalSyntheticBackport0;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\fHÆ\u0003J\t\u0010)\u001a\u00020\fHÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\t\u0010+\u001a\u00020\fHÖ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\fHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001J\u0019\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\fHÖ\u0001R\u0016\u0010\r\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014¨\u00067"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/upcoming/VipList;", "Landroid/os/Parcelable;", "_id", "", "contestId", "matchId", "userId", "createdBy", "name", "mobileNo", "", "status", "", "__v", "createdAt", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JIILjava/lang/String;Ljava/lang/String;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getContestId", "getCreatedAt", "getCreatedBy", "getMatchId", "getMobileNo", "()J", "getName", "getStatus", "getUpdatedAt", "getUserId", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UpcomingMatchModel.kt */
public final class VipList implements Parcelable {
    public static final Parcelable.Creator<VipList> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("contestId")
    private final String contestId;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("createdBy")
    private final String createdBy;
    @SerializedName("matchId")
    private final String matchId;
    @SerializedName("mobileNo")
    private final long mobileNo;
    @SerializedName("name")
    private final String name;
    @SerializedName("status")
    private final int status;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("userId")
    private final String userId;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: UpcomingMatchModel.kt */
    public static final class Creator implements Parcelable.Creator<VipList> {
        public final VipList createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VipList(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public final VipList[] newArray(int i) {
            return new VipList[i];
        }
    }

    public static /* synthetic */ VipList copy$default(VipList vipList, String str, String str2, String str3, String str4, String str5, String str6, long j, int i, int i2, String str7, String str8, int i3, Object obj) {
        VipList vipList2 = vipList;
        int i4 = i3;
        return vipList.copy((i4 & 1) != 0 ? vipList2._id : str, (i4 & 2) != 0 ? vipList2.contestId : str2, (i4 & 4) != 0 ? vipList2.matchId : str3, (i4 & 8) != 0 ? vipList2.userId : str4, (i4 & 16) != 0 ? vipList2.createdBy : str5, (i4 & 32) != 0 ? vipList2.name : str6, (i4 & 64) != 0 ? vipList2.mobileNo : j, (i4 & 128) != 0 ? vipList2.status : i, (i4 & 256) != 0 ? vipList2.__v : i2, (i4 & 512) != 0 ? vipList2.createdAt : str7, (i4 & 1024) != 0 ? vipList2.updatedAt : str8);
    }

    public final String component1() {
        return this._id;
    }

    public final String component10() {
        return this.createdAt;
    }

    public final String component11() {
        return this.updatedAt;
    }

    public final String component2() {
        return this.contestId;
    }

    public final String component3() {
        return this.matchId;
    }

    public final String component4() {
        return this.userId;
    }

    public final String component5() {
        return this.createdBy;
    }

    public final String component6() {
        return this.name;
    }

    public final long component7() {
        return this.mobileNo;
    }

    public final int component8() {
        return this.status;
    }

    public final int component9() {
        return this.__v;
    }

    public final VipList copy(String str, String str2, String str3, String str4, String str5, String str6, long j, int i, int i2, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "_id");
        String str9 = str2;
        Intrinsics.checkNotNullParameter(str9, "contestId");
        String str10 = str3;
        Intrinsics.checkNotNullParameter(str10, "matchId");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, "userId");
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, "createdBy");
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, "name");
        String str14 = str7;
        Intrinsics.checkNotNullParameter(str14, "createdAt");
        String str15 = str8;
        Intrinsics.checkNotNullParameter(str15, "updatedAt");
        return new VipList(str, str9, str10, str11, str12, str13, j, i, i2, str14, str15);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipList)) {
            return false;
        }
        VipList vipList = (VipList) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) vipList._id) && Intrinsics.areEqual((Object) this.contestId, (Object) vipList.contestId) && Intrinsics.areEqual((Object) this.matchId, (Object) vipList.matchId) && Intrinsics.areEqual((Object) this.userId, (Object) vipList.userId) && Intrinsics.areEqual((Object) this.createdBy, (Object) vipList.createdBy) && Intrinsics.areEqual((Object) this.name, (Object) vipList.name) && this.mobileNo == vipList.mobileNo && this.status == vipList.status && this.__v == vipList.__v && Intrinsics.areEqual((Object) this.createdAt, (Object) vipList.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) vipList.updatedAt);
    }

    public int hashCode() {
        return (((((((((((((((((((this._id.hashCode() * 31) + this.contestId.hashCode()) * 31) + this.matchId.hashCode()) * 31) + this.userId.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.name.hashCode()) * 31) + Match$$ExternalSyntheticBackport0.m111m(this.mobileNo)) * 31) + this.status) * 31) + this.__v) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        return "VipList(_id=" + this._id + ", contestId=" + this.contestId + ", matchId=" + this.matchId + ", userId=" + this.userId + ", createdBy=" + this.createdBy + ", name=" + this.name + ", mobileNo=" + this.mobileNo + ", status=" + this.status + ", __v=" + this.__v + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.contestId);
        parcel.writeString(this.matchId);
        parcel.writeString(this.userId);
        parcel.writeString(this.createdBy);
        parcel.writeString(this.name);
        parcel.writeLong(this.mobileNo);
        parcel.writeInt(this.status);
        parcel.writeInt(this.__v);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
    }

    public VipList(String str, String str2, String str3, String str4, String str5, String str6, long j, int i, int i2, String str7, String str8) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "contestId");
        Intrinsics.checkNotNullParameter(str3, "matchId");
        Intrinsics.checkNotNullParameter(str4, "userId");
        Intrinsics.checkNotNullParameter(str5, "createdBy");
        Intrinsics.checkNotNullParameter(str6, "name");
        Intrinsics.checkNotNullParameter(str7, "createdAt");
        Intrinsics.checkNotNullParameter(str8, "updatedAt");
        this._id = str;
        this.contestId = str2;
        this.matchId = str3;
        this.userId = str4;
        this.createdBy = str5;
        this.name = str6;
        this.mobileNo = j;
        this.status = i;
        this.__v = i2;
        this.createdAt = str7;
        this.updatedAt = str8;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getName() {
        return this.name;
    }

    public final long getMobileNo() {
        return this.mobileNo;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int get__v() {
        return this.__v;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }
}
