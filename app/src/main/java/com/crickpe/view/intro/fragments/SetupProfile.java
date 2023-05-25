package com.crickpe.view.intro.fragments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0013\u0010\u001e\u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u001dHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006("}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/SetupProfile;", "Landroid/os/Parcelable;", "_id", "", "mobileNo", "otpCode", "status", "accessToken", "profilePic", "isNewProfile", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "get_id", "()Ljava/lang/String;", "getAccessToken", "()Z", "getMobileNo", "getOtpCode", "getProfilePic", "getStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SetupProfile.kt */
public final class SetupProfile implements Parcelable {
    public static final Parcelable.Creator<SetupProfile> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("accessToken")
    private final String accessToken;
    @SerializedName("isNewProfile")
    private final boolean isNewProfile;
    @SerializedName("mobileNo")
    private final String mobileNo;
    @SerializedName("otpCode")
    private final String otpCode;
    @SerializedName("profilePic")
    private final String profilePic;
    @SerializedName("status")
    private final String status;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SetupProfile.kt */
    public static final class Creator implements Parcelable.Creator<SetupProfile> {
        public final SetupProfile createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SetupProfile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        public final SetupProfile[] newArray(int i) {
            return new SetupProfile[i];
        }
    }

    public static /* synthetic */ SetupProfile copy$default(SetupProfile setupProfile, String str, String str2, String str3, String str4, String str5, String str6, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = setupProfile._id;
        }
        if ((i & 2) != 0) {
            str2 = setupProfile.mobileNo;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = setupProfile.otpCode;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = setupProfile.status;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = setupProfile.accessToken;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = setupProfile.profilePic;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            z = setupProfile.isNewProfile;
        }
        return setupProfile.copy(str, str7, str8, str9, str10, str11, z);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.mobileNo;
    }

    public final String component3() {
        return this.otpCode;
    }

    public final String component4() {
        return this.status;
    }

    public final String component5() {
        return this.accessToken;
    }

    public final String component6() {
        return this.profilePic;
    }

    public final boolean component7() {
        return this.isNewProfile;
    }

    public final SetupProfile copy(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        Intrinsics.checkNotNullParameter(str3, "otpCode");
        Intrinsics.checkNotNullParameter(str4, NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkNotNullParameter(str5, "accessToken");
        Intrinsics.checkNotNullParameter(str6, "profilePic");
        return new SetupProfile(str, str2, str3, str4, str5, str6, z);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetupProfile)) {
            return false;
        }
        SetupProfile setupProfile = (SetupProfile) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) setupProfile._id) && Intrinsics.areEqual((Object) this.mobileNo, (Object) setupProfile.mobileNo) && Intrinsics.areEqual((Object) this.otpCode, (Object) setupProfile.otpCode) && Intrinsics.areEqual((Object) this.status, (Object) setupProfile.status) && Intrinsics.areEqual((Object) this.accessToken, (Object) setupProfile.accessToken) && Intrinsics.areEqual((Object) this.profilePic, (Object) setupProfile.profilePic) && this.isNewProfile == setupProfile.isNewProfile;
    }

    public int hashCode() {
        int hashCode = ((((((((((this._id.hashCode() * 31) + this.mobileNo.hashCode()) * 31) + this.otpCode.hashCode()) * 31) + this.status.hashCode()) * 31) + this.accessToken.hashCode()) * 31) + this.profilePic.hashCode()) * 31;
        boolean z = this.isNewProfile;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "SetupProfile(_id=" + this._id + ", mobileNo=" + this.mobileNo + ", otpCode=" + this.otpCode + ", status=" + this.status + ", accessToken=" + this.accessToken + ", profilePic=" + this.profilePic + ", isNewProfile=" + this.isNewProfile + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.mobileNo);
        parcel.writeString(this.otpCode);
        parcel.writeString(this.status);
        parcel.writeString(this.accessToken);
        parcel.writeString(this.profilePic);
        parcel.writeInt(this.isNewProfile ? 1 : 0);
    }

    public SetupProfile(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        Intrinsics.checkNotNullParameter(str3, "otpCode");
        Intrinsics.checkNotNullParameter(str4, NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkNotNullParameter(str5, "accessToken");
        Intrinsics.checkNotNullParameter(str6, "profilePic");
        this._id = str;
        this.mobileNo = str2;
        this.otpCode = str3;
        this.status = str4;
        this.accessToken = str5;
        this.profilePic = str6;
        this.isNewProfile = z;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getOtpCode() {
        return this.otpCode;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final boolean isNewProfile() {
        return this.isNewProfile;
    }
}
