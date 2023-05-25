package com.crickpe.view.intro.fragments;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.crickpe.view.detail.fragments.profile.KycDetails;
import com.crickpe.view.intro.fragments.kyc.models.State;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\bR\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0006\u0012\u0006\u0010 \u001a\u00020\u0006\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020\u0010\u0012\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0002\u0010&J\t\u0010S\u001a\u00020\u0003HÆ\u0003J\t\u0010T\u001a\u00020\u0003HÆ\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00105J\t\u0010V\u001a\u00020\u0010HÆ\u0003J\t\u0010W\u001a\u00020\u0010HÆ\u0003J\t\u0010X\u001a\u00020\u0003HÆ\u0003J\t\u0010Y\u001a\u00020\u0003HÆ\u0003J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\t\u0010\\\u001a\u00020\u0003HÆ\u0003J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0010HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010b\u001a\u00020\u0003HÆ\u0003J\t\u0010c\u001a\u00020\u0006HÆ\u0003J\t\u0010d\u001a\u00020\u0006HÆ\u0003J\t\u0010e\u001a\u00020\u0006HÆ\u0003J\t\u0010f\u001a\u00020\u0003HÆ\u0003J\t\u0010g\u001a\u00020#HÆ\u0003J\t\u0010h\u001a\u00020\u0010HÆ\u0003J\t\u0010i\u001a\u00020\u0006HÆ\u0003J\t\u0010j\u001a\u00020\u0006HÆ\u0003J\t\u0010k\u001a\u00020\u0003HÆ\u0003J\t\u0010l\u001a\u00020\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010n\u001a\u00020\u0003HÆ\u0003J\t\u0010o\u001a\u00020\fHÆ\u0003J\t\u0010p\u001a\u00020\u0003HÆ\u0003JÂ\u0002\u0010q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00062\b\b\u0002\u0010\u001f\u001a\u00020\u00062\b\b\u0002\u0010 \u001a\u00020\u00062\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u00102\b\b\u0002\u0010%\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010rJ\t\u0010s\u001a\u00020\u0006HÖ\u0001J\u0013\u0010t\u001a\u00020\u00102\b\u0010u\u001a\u0004\u0018\u00010vHÖ\u0003J\t\u0010w\u001a\u00020\u0006HÖ\u0001J\t\u0010x\u001a\u00020\u0003HÖ\u0001J\u0019\u0010y\u001a\u00020z2\u0006\u0010{\u001a\u00020|2\u0006\u0010}\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0016\u0010!\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u001e\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u00101\"\u0004\b2\u00103R\u0016\u0010\u0011\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u00104R\u0016\u0010\u0012\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00104R\u0016\u0010$\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u00104R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b\u000f\u00105R\u001e\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u00104\"\u0004\b7\u00108R \u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010(\"\u0004\b:\u0010;R\u0016\u0010\"\u001a\u00020#8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001e\u0010\u001f\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00103R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010(\"\u0004\bB\u0010;R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010(R\u001e\u0010 \u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00101\"\u0004\bE\u00103R\u001e\u0010\u0015\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010(\"\u0004\bG\u0010;R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010(R\u0016\u0010\u001d\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010(R\u0016\u0010%\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010(R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010(¨\u0006~"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/User;", "Landroid/os/Parcelable;", "_id", "", "name", "gender", "", "email", "mobileNo", "otpCode", "status", "totalAmount", "", "accessToken", "profilePic", "isNewProfile", "", "isBlocked", "isDeleted", "createdAt", "updatedAt", "phone_number", "state", "Lcom/crickpe/view/intro/fragments/kyc/models/State;", "deviceType", "deviceId", "deviceToken", "isSelected", "joiningBonusMessage", "referBy", "isBankVerified", "kycStatus", "panStatus", "dateOfBirth", "kycDetails", "Lcom/crickpe/view/detail/fragments/profile/KycDetails;", "isFakeUser", "skillScore", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/intro/fragments/kyc/models/State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Lcom/crickpe/view/detail/fragments/profile/KycDetails;ZI)V", "get_id", "()Ljava/lang/String;", "getAccessToken", "getCreatedAt", "getDateOfBirth", "getDeviceId", "getDeviceToken", "getDeviceType", "getEmail", "getGender", "()I", "setBankVerified", "(I)V", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "setSelected", "(Z)V", "getJoiningBonusMessage", "setJoiningBonusMessage", "(Ljava/lang/String;)V", "getKycDetails", "()Lcom/crickpe/view/detail/fragments/profile/KycDetails;", "getKycStatus", "setKycStatus", "getMobileNo", "getName", "setName", "getOtpCode", "getPanStatus", "setPanStatus", "getPhone_number", "setPhone_number", "getProfilePic", "getReferBy", "getSkillScore", "getState", "()Lcom/crickpe/view/intro/fragments/kyc/models/State;", "getStatus", "getTotalAmount", "()D", "setTotalAmount", "(D)V", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/intro/fragments/kyc/models/State;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;Lcom/crickpe/view/detail/fragments/profile/KycDetails;ZI)Lcom/crickpe/view/intro/fragments/User;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: User.kt */
public final class User implements Parcelable {
    public static final Parcelable.Creator<User> CREATOR = new Creator();
    @SerializedName("_id")
    private final String _id;
    @SerializedName("accessToken")
    private final String accessToken;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("dateOfBirth")
    private final String dateOfBirth;
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
    @SerializedName("isBankVerified")
    private int isBankVerified;
    @SerializedName("isBlocked")
    private final boolean isBlocked;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("isFakeUser")
    private final boolean isFakeUser;
    @SerializedName("isNewProfile")
    private final Boolean isNewProfile;
    @SerializedName("isSelected")
    private boolean isSelected;
    @SerializedName("joiningBonusMessage")
    private String joiningBonusMessage;
    @SerializedName("kycDetails")
    private final KycDetails kycDetails;
    @SerializedName("kycStatus")
    private int kycStatus;
    @SerializedName("mobileNo")
    private final String mobileNo;
    @SerializedName("name")
    private String name;
    @SerializedName("otpCode")
    private final String otpCode;
    @SerializedName("panStatus")
    private int panStatus;
    @SerializedName("phone_number")
    private String phone_number;
    @SerializedName("profilePic")
    private final String profilePic;
    @SerializedName("referBy")
    private final String referBy;
    @SerializedName("skillScore")
    private final int skillScore;
    @SerializedName("state")
    private final State state;
    @SerializedName("status")
    private final String status;
    @SerializedName("totalAmount")
    private double totalAmount;
    @SerializedName("updatedAt")
    private final String updatedAt;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: User.kt */
    public static final class Creator implements Parcelable.Creator<User> {
        public final User createFromParcel(Parcel parcel) {
            Boolean bool;
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            double readDouble = parcel.readDouble();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            State state = null;
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            if (parcel.readInt() != 0) {
                state = State.CREATOR.createFromParcel(parcel2);
            }
            return new User(readString, readString2, readInt, readString3, readString4, readString5, readString6, readDouble, readString7, readString8, bool, z, z2, readString9, readString10, readString11, state, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), KycDetails.CREATOR.createFromParcel(parcel2), parcel.readInt() != 0, parcel.readInt());
        }

        public final User[] newArray(int i) {
            return new User[i];
        }
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, int i, String str3, String str4, String str5, String str6, double d, String str7, String str8, Boolean bool, boolean z, boolean z2, String str9, String str10, String str11, State state2, String str12, String str13, String str14, boolean z3, String str15, String str16, int i2, int i3, int i4, String str17, KycDetails kycDetails2, boolean z4, int i5, int i6, Object obj) {
        User user2 = user;
        int i7 = i6;
        return user.copy((i7 & 1) != 0 ? user2._id : str, (i7 & 2) != 0 ? user2.name : str2, (i7 & 4) != 0 ? user2.gender : i, (i7 & 8) != 0 ? user2.email : str3, (i7 & 16) != 0 ? user2.mobileNo : str4, (i7 & 32) != 0 ? user2.otpCode : str5, (i7 & 64) != 0 ? user2.status : str6, (i7 & 128) != 0 ? user2.totalAmount : d, (i7 & 256) != 0 ? user2.accessToken : str7, (i7 & 512) != 0 ? user2.profilePic : str8, (i7 & 1024) != 0 ? user2.isNewProfile : bool, (i7 & 2048) != 0 ? user2.isBlocked : z, (i7 & 4096) != 0 ? user2.isDeleted : z2, (i7 & 8192) != 0 ? user2.createdAt : str9, (i7 & 16384) != 0 ? user2.updatedAt : str10, (i7 & 32768) != 0 ? user2.phone_number : str11, (i7 & 65536) != 0 ? user2.state : state2, (i7 & 131072) != 0 ? user2.deviceType : str12, (i7 & 262144) != 0 ? user2.deviceId : str13, (i7 & 524288) != 0 ? user2.deviceToken : str14, (i7 & 1048576) != 0 ? user2.isSelected : z3, (i7 & 2097152) != 0 ? user2.joiningBonusMessage : str15, (i7 & 4194304) != 0 ? user2.referBy : str16, (i7 & 8388608) != 0 ? user2.isBankVerified : i2, (i7 & 16777216) != 0 ? user2.kycStatus : i3, (i7 & 33554432) != 0 ? user2.panStatus : i4, (i7 & 67108864) != 0 ? user2.dateOfBirth : str17, (i7 & 134217728) != 0 ? user2.kycDetails : kycDetails2, (i7 & 268435456) != 0 ? user2.isFakeUser : z4, (i7 & 536870912) != 0 ? user2.skillScore : i5);
    }

    public final String component1() {
        return this._id;
    }

    public final String component10() {
        return this.profilePic;
    }

    public final Boolean component11() {
        return this.isNewProfile;
    }

    public final boolean component12() {
        return this.isBlocked;
    }

    public final boolean component13() {
        return this.isDeleted;
    }

    public final String component14() {
        return this.createdAt;
    }

    public final String component15() {
        return this.updatedAt;
    }

    public final String component16() {
        return this.phone_number;
    }

    public final State component17() {
        return this.state;
    }

    public final String component18() {
        return this.deviceType;
    }

    public final String component19() {
        return this.deviceId;
    }

    public final String component2() {
        return this.name;
    }

    public final String component20() {
        return this.deviceToken;
    }

    public final boolean component21() {
        return this.isSelected;
    }

    public final String component22() {
        return this.joiningBonusMessage;
    }

    public final String component23() {
        return this.referBy;
    }

    public final int component24() {
        return this.isBankVerified;
    }

    public final int component25() {
        return this.kycStatus;
    }

    public final int component26() {
        return this.panStatus;
    }

    public final String component27() {
        return this.dateOfBirth;
    }

    public final KycDetails component28() {
        return this.kycDetails;
    }

    public final boolean component29() {
        return this.isFakeUser;
    }

    public final int component3() {
        return this.gender;
    }

    public final int component30() {
        return this.skillScore;
    }

    public final String component4() {
        return this.email;
    }

    public final String component5() {
        return this.mobileNo;
    }

    public final String component6() {
        return this.otpCode;
    }

    public final String component7() {
        return this.status;
    }

    public final double component8() {
        return this.totalAmount;
    }

    public final String component9() {
        return this.accessToken;
    }

    public final User copy(String str, String str2, int i, String str3, String str4, String str5, String str6, double d, String str7, String str8, Boolean bool, boolean z, boolean z2, String str9, String str10, String str11, State state2, String str12, String str13, String str14, boolean z3, String str15, String str16, int i2, int i3, int i4, String str17, KycDetails kycDetails2, boolean z4, int i5) {
        String str18 = str;
        Intrinsics.checkNotNullParameter(str18, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "email");
        Intrinsics.checkNotNullParameter(str4, "mobileNo");
        Intrinsics.checkNotNullParameter(str6, NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkNotNullParameter(str7, "accessToken");
        Intrinsics.checkNotNullParameter(str8, "profilePic");
        Intrinsics.checkNotNullParameter(str9, "createdAt");
        Intrinsics.checkNotNullParameter(str10, "updatedAt");
        Intrinsics.checkNotNullParameter(str11, "phone_number");
        Intrinsics.checkNotNullParameter(str12, "deviceType");
        Intrinsics.checkNotNullParameter(str13, "deviceId");
        Intrinsics.checkNotNullParameter(str14, "deviceToken");
        Intrinsics.checkNotNullParameter(str16, "referBy");
        Intrinsics.checkNotNullParameter(str17, "dateOfBirth");
        Intrinsics.checkNotNullParameter(kycDetails2, "kycDetails");
        return new User(str18, str2, i, str3, str4, str5, str6, d, str7, str8, bool, z, z2, str9, str10, str11, state2, str12, str13, str14, z3, str15, str16, i2, i3, i4, str17, kycDetails2, z4, i5);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) user._id) && Intrinsics.areEqual((Object) this.name, (Object) user.name) && this.gender == user.gender && Intrinsics.areEqual((Object) this.email, (Object) user.email) && Intrinsics.areEqual((Object) this.mobileNo, (Object) user.mobileNo) && Intrinsics.areEqual((Object) this.otpCode, (Object) user.otpCode) && Intrinsics.areEqual((Object) this.status, (Object) user.status) && Intrinsics.areEqual((Object) Double.valueOf(this.totalAmount), (Object) Double.valueOf(user.totalAmount)) && Intrinsics.areEqual((Object) this.accessToken, (Object) user.accessToken) && Intrinsics.areEqual((Object) this.profilePic, (Object) user.profilePic) && Intrinsics.areEqual((Object) this.isNewProfile, (Object) user.isNewProfile) && this.isBlocked == user.isBlocked && this.isDeleted == user.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) user.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) user.updatedAt) && Intrinsics.areEqual((Object) this.phone_number, (Object) user.phone_number) && Intrinsics.areEqual((Object) this.state, (Object) user.state) && Intrinsics.areEqual((Object) this.deviceType, (Object) user.deviceType) && Intrinsics.areEqual((Object) this.deviceId, (Object) user.deviceId) && Intrinsics.areEqual((Object) this.deviceToken, (Object) user.deviceToken) && this.isSelected == user.isSelected && Intrinsics.areEqual((Object) this.joiningBonusMessage, (Object) user.joiningBonusMessage) && Intrinsics.areEqual((Object) this.referBy, (Object) user.referBy) && this.isBankVerified == user.isBankVerified && this.kycStatus == user.kycStatus && this.panStatus == user.panStatus && Intrinsics.areEqual((Object) this.dateOfBirth, (Object) user.dateOfBirth) && Intrinsics.areEqual((Object) this.kycDetails, (Object) user.kycDetails) && this.isFakeUser == user.isFakeUser && this.skillScore == user.skillScore;
    }

    public int hashCode() {
        int hashCode = ((((((((this._id.hashCode() * 31) + this.name.hashCode()) * 31) + this.gender) * 31) + this.email.hashCode()) * 31) + this.mobileNo.hashCode()) * 31;
        String str = this.otpCode;
        int i = 0;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.status.hashCode()) * 31) + Double.doubleToLongBits(this.totalAmount)) * 31) + this.accessToken.hashCode()) * 31) + this.profilePic.hashCode()) * 31;
        Boolean bool = this.isNewProfile;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z = this.isBlocked;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isDeleted;
        if (z3) {
            z3 = true;
        }
        int hashCode4 = (((((((i2 + (z3 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.phone_number.hashCode()) * 31;
        State state2 = this.state;
        int hashCode5 = (((((((hashCode4 + (state2 == null ? 0 : state2.hashCode())) * 31) + this.deviceType.hashCode()) * 31) + this.deviceId.hashCode()) * 31) + this.deviceToken.hashCode()) * 31;
        boolean z4 = this.isSelected;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode5 + (z4 ? 1 : 0)) * 31;
        String str2 = this.joiningBonusMessage;
        if (str2 != null) {
            i = str2.hashCode();
        }
        int hashCode6 = (((((((((((((i3 + i) * 31) + this.referBy.hashCode()) * 31) + this.isBankVerified) * 31) + this.kycStatus) * 31) + this.panStatus) * 31) + this.dateOfBirth.hashCode()) * 31) + this.kycDetails.hashCode()) * 31;
        boolean z5 = this.isFakeUser;
        if (!z5) {
            z2 = z5;
        }
        return ((hashCode6 + (z2 ? 1 : 0)) * 31) + this.skillScore;
    }

    public String toString() {
        return "User(_id=" + this._id + ", name=" + this.name + ", gender=" + this.gender + ", email=" + this.email + ", mobileNo=" + this.mobileNo + ", otpCode=" + this.otpCode + ", status=" + this.status + ", totalAmount=" + this.totalAmount + ", accessToken=" + this.accessToken + ", profilePic=" + this.profilePic + ", isNewProfile=" + this.isNewProfile + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", phone_number=" + this.phone_number + ", state=" + this.state + ", deviceType=" + this.deviceType + ", deviceId=" + this.deviceId + ", deviceToken=" + this.deviceToken + ", isSelected=" + this.isSelected + ", joiningBonusMessage=" + this.joiningBonusMessage + ", referBy=" + this.referBy + ", isBankVerified=" + this.isBankVerified + ", kycStatus=" + this.kycStatus + ", panStatus=" + this.panStatus + ", dateOfBirth=" + this.dateOfBirth + ", kycDetails=" + this.kycDetails + ", isFakeUser=" + this.isFakeUser + ", skillScore=" + this.skillScore + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.name);
        parcel.writeInt(this.gender);
        parcel.writeString(this.email);
        parcel.writeString(this.mobileNo);
        parcel.writeString(this.otpCode);
        parcel.writeString(this.status);
        parcel.writeDouble(this.totalAmount);
        parcel.writeString(this.accessToken);
        parcel.writeString(this.profilePic);
        Boolean bool = this.isNewProfile;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeString(this.phone_number);
        State state2 = this.state;
        if (state2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            state2.writeToParcel(parcel, i);
        }
        parcel.writeString(this.deviceType);
        parcel.writeString(this.deviceId);
        parcel.writeString(this.deviceToken);
        parcel.writeInt(this.isSelected ? 1 : 0);
        parcel.writeString(this.joiningBonusMessage);
        parcel.writeString(this.referBy);
        parcel.writeInt(this.isBankVerified);
        parcel.writeInt(this.kycStatus);
        parcel.writeInt(this.panStatus);
        parcel.writeString(this.dateOfBirth);
        this.kycDetails.writeToParcel(parcel, i);
        parcel.writeInt(this.isFakeUser ? 1 : 0);
        parcel.writeInt(this.skillScore);
    }

    public User(String str, String str2, int i, String str3, String str4, String str5, String str6, double d, String str7, String str8, Boolean bool, boolean z, boolean z2, String str9, String str10, String str11, State state2, String str12, String str13, String str14, boolean z3, String str15, String str16, int i2, int i3, int i4, String str17, KycDetails kycDetails2, boolean z4, int i5) {
        String str18 = str;
        String str19 = str2;
        String str20 = str3;
        String str21 = str4;
        String str22 = str6;
        String str23 = str7;
        String str24 = str8;
        String str25 = str9;
        String str26 = str10;
        String str27 = str11;
        String str28 = str12;
        String str29 = str13;
        String str30 = str14;
        String str31 = str16;
        KycDetails kycDetails3 = kycDetails2;
        Intrinsics.checkNotNullParameter(str18, "_id");
        Intrinsics.checkNotNullParameter(str19, "name");
        Intrinsics.checkNotNullParameter(str20, "email");
        Intrinsics.checkNotNullParameter(str21, "mobileNo");
        Intrinsics.checkNotNullParameter(str22, NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkNotNullParameter(str23, "accessToken");
        Intrinsics.checkNotNullParameter(str24, "profilePic");
        Intrinsics.checkNotNullParameter(str25, "createdAt");
        Intrinsics.checkNotNullParameter(str26, "updatedAt");
        Intrinsics.checkNotNullParameter(str27, "phone_number");
        Intrinsics.checkNotNullParameter(str28, "deviceType");
        Intrinsics.checkNotNullParameter(str29, "deviceId");
        Intrinsics.checkNotNullParameter(str30, "deviceToken");
        Intrinsics.checkNotNullParameter(str31, "referBy");
        Intrinsics.checkNotNullParameter(str17, "dateOfBirth");
        KycDetails kycDetails4 = kycDetails2;
        Intrinsics.checkNotNullParameter(kycDetails4, "kycDetails");
        this._id = str18;
        this.name = str19;
        this.gender = i;
        this.email = str20;
        this.mobileNo = str21;
        this.otpCode = str5;
        this.status = str22;
        this.totalAmount = d;
        this.accessToken = str23;
        this.profilePic = str24;
        this.isNewProfile = bool;
        this.isBlocked = z;
        this.isDeleted = z2;
        this.createdAt = str25;
        this.updatedAt = str26;
        this.phone_number = str27;
        this.state = state2;
        this.deviceType = str28;
        this.deviceId = str29;
        this.deviceToken = str30;
        this.isSelected = z3;
        this.joiningBonusMessage = str15;
        this.referBy = str31;
        this.isBankVerified = i2;
        this.kycStatus = i3;
        this.panStatus = i4;
        this.dateOfBirth = str17;
        this.kycDetails = kycDetails4;
        this.isFakeUser = z4;
        this.skillScore = i5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ User(String str, String str2, int i, String str3, String str4, String str5, String str6, double d, String str7, String str8, Boolean bool, boolean z, boolean z2, String str9, String str10, String str11, State state2, String str12, String str13, String str14, boolean z3, String str15, String str16, int i2, int i3, int i4, String str17, KycDetails kycDetails2, boolean z4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i, str3, str4, (i6 & 32) != 0 ? null : str5, str6, d, str7, str8, bool, z, z2, str9, str10, str11, state2, str12, str13, str14, z3, (i6 & 2097152) != 0 ? null : str15, str16, i2, i3, i4, str17, kycDetails2, z4, i5);
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final int getGender() {
        return this.gender;
    }

    public final String getEmail() {
        return this.email;
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

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final void setTotalAmount(double d) {
        this.totalAmount = d;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final Boolean isNewProfile() {
        return this.isNewProfile;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getPhone_number() {
        return this.phone_number;
    }

    public final void setPhone_number(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phone_number = str;
    }

    public final State getState() {
        return this.state;
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

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final String getJoiningBonusMessage() {
        return this.joiningBonusMessage;
    }

    public final void setJoiningBonusMessage(String str) {
        this.joiningBonusMessage = str;
    }

    public final String getReferBy() {
        return this.referBy;
    }

    public final int isBankVerified() {
        return this.isBankVerified;
    }

    public final void setBankVerified(int i) {
        this.isBankVerified = i;
    }

    public final int getKycStatus() {
        return this.kycStatus;
    }

    public final void setKycStatus(int i) {
        this.kycStatus = i;
    }

    public final int getPanStatus() {
        return this.panStatus;
    }

    public final void setPanStatus(int i) {
        this.panStatus = i;
    }

    public final String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final KycDetails getKycDetails() {
        return this.kycDetails;
    }

    public final boolean isFakeUser() {
        return this.isFakeUser;
    }

    public final int getSkillScore() {
        return this.skillScore;
    }
}
