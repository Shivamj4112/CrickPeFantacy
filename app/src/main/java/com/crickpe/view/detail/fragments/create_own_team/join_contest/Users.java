package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b2\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\n¢\u0006\u0002\u0010\u0018J\t\u0010,\u001a\u00020\u0004HÆ\u0003J\t\u0010-\u001a\u00020\u000fHÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0004HÆ\u0003J\t\u00100\u001a\u00020\u0004HÆ\u0003J\t\u00101\u001a\u00020\nHÆ\u0003J\t\u00102\u001a\u00020\u0004HÆ\u0003J\t\u00103\u001a\u00020\u0004HÆ\u0003J\t\u00104\u001a\u00020\u0004HÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\u0004HÆ\u0003J\t\u00107\u001a\u00020\u0004HÆ\u0003J\t\u00108\u001a\u00020\u0004HÆ\u0003J\t\u00109\u001a\u00020\u0004HÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\t\u0010;\u001a\u00020\u0004HÆ\u0003J\t\u0010<\u001a\u00020\nHÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J½\u0001\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\nHÆ\u0001J\t\u0010?\u001a\u00020\nHÖ\u0001J\u0013\u0010@\u001a\u00020\u000f2\b\u0010A\u001a\u0004\u0018\u00010BHÖ\u0003J\t\u0010C\u001a\u00020\nHÖ\u0001J\t\u0010D\u001a\u00020\u0004HÖ\u0001J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0013\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0014\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\u0016\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\u0017\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010$R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010$R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0016\u0010\u0015\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\r\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0016\u0010\u0012\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001a¨\u0006J"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Users;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "_id", "", "mobileNo", "deviceType", "deviceId", "deviceToken", "otpCode", "", "profilePic", "walletAmount", "status", "isDeleted", "", "isBlocked", "createdAt", "updatedAt", "__v", "accessToken", "name", "email", "gender", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IIZZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getAccessToken", "getCreatedAt", "getDeviceId", "getDeviceToken", "getDeviceType", "getEmail", "getGender", "()Z", "getMobileNo", "getName", "getOtpCode", "getProfilePic", "getStatus", "getUpdatedAt", "getWalletAmount", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestDetailModel.kt */
public final class Users extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<Users> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("accessToken")
    private final String accessToken;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("deviceId")
    private final String deviceId;
    @SerializedName("deviceToken")
    private final String deviceToken;
    @SerializedName("deviceType")
    private final String deviceType;
    @SerializedName("email")
    private final String email;
    @SerializedName("gender")
    private final int gender;
    @SerializedName("isBlocked")
    private final boolean isBlocked;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("mobileNo")
    private final String mobileNo;
    @SerializedName("name")
    private final String name;
    @SerializedName("otpCode")
    private final int otpCode;
    @SerializedName("profilePic")
    private final String profilePic;
    @SerializedName("status")
    private final int status;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("walletAmount")
    private final int walletAmount;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestDetailModel.kt */
    public static final class Creator implements Parcelable.Creator<Users> {
        public final Users createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new Users(readString, readString2, readString3, readString4, readString5, readInt, readString6, readInt2, readInt3, z2, z, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        public final Users[] newArray(int i) {
            return new Users[i];
        }
    }

    public static /* synthetic */ Users copy$default(Users users, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, boolean z, boolean z2, String str7, String str8, int i4, String str9, String str10, String str11, int i5, int i6, Object obj) {
        Users users2 = users;
        int i7 = i6;
        return users.copy((i7 & 1) != 0 ? users2._id : str, (i7 & 2) != 0 ? users2.mobileNo : str2, (i7 & 4) != 0 ? users2.deviceType : str3, (i7 & 8) != 0 ? users2.deviceId : str4, (i7 & 16) != 0 ? users2.deviceToken : str5, (i7 & 32) != 0 ? users2.otpCode : i, (i7 & 64) != 0 ? users2.profilePic : str6, (i7 & 128) != 0 ? users2.walletAmount : i2, (i7 & 256) != 0 ? users2.status : i3, (i7 & 512) != 0 ? users2.isDeleted : z, (i7 & 1024) != 0 ? users2.isBlocked : z2, (i7 & 2048) != 0 ? users2.createdAt : str7, (i7 & 4096) != 0 ? users2.updatedAt : str8, (i7 & 8192) != 0 ? users2.__v : i4, (i7 & 16384) != 0 ? users2.accessToken : str9, (i7 & 32768) != 0 ? users2.name : str10, (i7 & 65536) != 0 ? users2.email : str11, (i7 & 131072) != 0 ? users2.gender : i5);
    }

    public final String component1() {
        return this._id;
    }

    public final boolean component10() {
        return this.isDeleted;
    }

    public final boolean component11() {
        return this.isBlocked;
    }

    public final String component12() {
        return this.createdAt;
    }

    public final String component13() {
        return this.updatedAt;
    }

    public final int component14() {
        return this.__v;
    }

    public final String component15() {
        return this.accessToken;
    }

    public final String component16() {
        return this.name;
    }

    public final String component17() {
        return this.email;
    }

    public final int component18() {
        return this.gender;
    }

    public final String component2() {
        return this.mobileNo;
    }

    public final String component3() {
        return this.deviceType;
    }

    public final String component4() {
        return this.deviceId;
    }

    public final String component5() {
        return this.deviceToken;
    }

    public final int component6() {
        return this.otpCode;
    }

    public final String component7() {
        return this.profilePic;
    }

    public final int component8() {
        return this.walletAmount;
    }

    public final int component9() {
        return this.status;
    }

    public final Users copy(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, boolean z, boolean z2, String str7, String str8, int i4, String str9, String str10, String str11, int i5) {
        String str12 = str;
        Intrinsics.checkNotNullParameter(str12, "_id");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        Intrinsics.checkNotNullParameter(str3, "deviceType");
        Intrinsics.checkNotNullParameter(str4, "deviceId");
        Intrinsics.checkNotNullParameter(str5, "deviceToken");
        Intrinsics.checkNotNullParameter(str6, "profilePic");
        Intrinsics.checkNotNullParameter(str7, "createdAt");
        Intrinsics.checkNotNullParameter(str8, "updatedAt");
        Intrinsics.checkNotNullParameter(str9, "accessToken");
        Intrinsics.checkNotNullParameter(str10, "name");
        Intrinsics.checkNotNullParameter(str11, "email");
        return new Users(str12, str2, str3, str4, str5, i, str6, i2, i3, z, z2, str7, str8, i4, str9, str10, str11, i5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Users)) {
            return false;
        }
        Users users = (Users) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) users._id) && Intrinsics.areEqual((Object) this.mobileNo, (Object) users.mobileNo) && Intrinsics.areEqual((Object) this.deviceType, (Object) users.deviceType) && Intrinsics.areEqual((Object) this.deviceId, (Object) users.deviceId) && Intrinsics.areEqual((Object) this.deviceToken, (Object) users.deviceToken) && this.otpCode == users.otpCode && Intrinsics.areEqual((Object) this.profilePic, (Object) users.profilePic) && this.walletAmount == users.walletAmount && this.status == users.status && this.isDeleted == users.isDeleted && this.isBlocked == users.isBlocked && Intrinsics.areEqual((Object) this.createdAt, (Object) users.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) users.updatedAt) && this.__v == users.__v && Intrinsics.areEqual((Object) this.accessToken, (Object) users.accessToken) && Intrinsics.areEqual((Object) this.name, (Object) users.name) && Intrinsics.areEqual((Object) this.email, (Object) users.email) && this.gender == users.gender;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this._id.hashCode() * 31) + this.mobileNo.hashCode()) * 31) + this.deviceType.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceToken.hashCode()) * 31) + this.otpCode) * 31) + this.profilePic.hashCode()) * 31) + this.walletAmount) * 31) + this.status) * 31;
        boolean z = this.isDeleted;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isBlocked;
        if (!z3) {
            z2 = z3;
        }
        return ((((((((((((((i + (z2 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v) * 31) + this.accessToken.hashCode()) * 31) + this.name.hashCode()) * 31) + this.email.hashCode()) * 31) + this.gender;
    }

    public String toString() {
        return "Users(_id=" + this._id + ", mobileNo=" + this.mobileNo + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceToken=" + this.deviceToken + ", otpCode=" + this.otpCode + ", profilePic=" + this.profilePic + ", walletAmount=" + this.walletAmount + ", status=" + this.status + ", isDeleted=" + this.isDeleted + ", isBlocked=" + this.isBlocked + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", accessToken=" + this.accessToken + ", name=" + this.name + ", email=" + this.email + ", gender=" + this.gender + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.mobileNo);
        parcel.writeString(this.deviceType);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.deviceToken);
        parcel.writeInt(this.otpCode);
        parcel.writeString(this.profilePic);
        parcel.writeInt(this.walletAmount);
        parcel.writeInt(this.status);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.__v);
        parcel.writeString(this.accessToken);
        parcel.writeString(this.name);
        parcel.writeString(this.email);
        parcel.writeInt(this.gender);
    }

    public final String get_id() {
        return this._id;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceToken() {
        return this.deviceToken;
    }

    public final int getOtpCode() {
        return this.otpCode;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final int getWalletAmount() {
        return this.walletAmount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int get__v() {
        return this.__v;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getName() {
        return this.name;
    }

    public final String getEmail() {
        return this.email;
    }

    public final int getGender() {
        return this.gender;
    }

    public Users(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, int i3, boolean z, boolean z2, String str7, String str8, int i4, String str9, String str10, String str11, int i5) {
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        String str18 = str9;
        String str19 = str10;
        String str20 = str11;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        Intrinsics.checkNotNullParameter(str12, "deviceType");
        Intrinsics.checkNotNullParameter(str13, "deviceId");
        Intrinsics.checkNotNullParameter(str14, "deviceToken");
        Intrinsics.checkNotNullParameter(str15, "profilePic");
        Intrinsics.checkNotNullParameter(str16, "createdAt");
        Intrinsics.checkNotNullParameter(str17, "updatedAt");
        Intrinsics.checkNotNullParameter(str18, "accessToken");
        Intrinsics.checkNotNullParameter(str19, "name");
        Intrinsics.checkNotNullParameter(str20, "email");
        this._id = str;
        this.mobileNo = str2;
        this.deviceType = str12;
        this.deviceId = str13;
        this.deviceToken = str14;
        this.otpCode = i;
        this.profilePic = str15;
        this.walletAmount = i2;
        this.status = i3;
        this.isDeleted = z;
        this.isBlocked = z2;
        this.createdAt = str16;
        this.updatedAt = str17;
        this.__v = i4;
        this.accessToken = str18;
        this.name = str19;
        this.email = str20;
        this.gender = i5;
    }
}
