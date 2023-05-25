package com.crickpe.view.detail.fragments.profile;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.amplitude.android.TrackingOptions;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020%HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020%HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u00061"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/profile/KycDetails;", "Landroid/os/Parcelable;", "care_of", "", "aadhar_number", "client_id", "gender", "house", "city", "country", "state", "full_name", "dob", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAadhar_number", "()Ljava/lang/String;", "getCare_of", "getCity", "getClient_id", "getCountry", "getDob", "getFull_name", "getGender", "getHouse", "getState", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileModel.kt */
public final class KycDetails implements Parcelable {
    public static final Parcelable.Creator<KycDetails> CREATOR = new Creator();
    @SerializedName("aadhar_number")
    private final String aadhar_number;
    @SerializedName("care_of")
    private final String care_of;
    @SerializedName("city")
    private final String city;
    @SerializedName("client_id")
    private final String client_id;
    @SerializedName("country")
    private final String country;
    @SerializedName("dob")
    private final String dob;
    @SerializedName("full_name")
    private final String full_name;
    @SerializedName("gender")
    private final String gender;
    @SerializedName("house")
    private final String house;
    @SerializedName("state")
    private final String state;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ProfileModel.kt */
    public static final class Creator implements Parcelable.Creator<KycDetails> {
        public final KycDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new KycDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final KycDetails[] newArray(int i) {
            return new KycDetails[i];
        }
    }

    public KycDetails() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ KycDetails copy$default(KycDetails kycDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, Object obj) {
        KycDetails kycDetails2 = kycDetails;
        int i2 = i;
        return kycDetails.copy((i2 & 1) != 0 ? kycDetails2.care_of : str, (i2 & 2) != 0 ? kycDetails2.aadhar_number : str2, (i2 & 4) != 0 ? kycDetails2.client_id : str3, (i2 & 8) != 0 ? kycDetails2.gender : str4, (i2 & 16) != 0 ? kycDetails2.house : str5, (i2 & 32) != 0 ? kycDetails2.city : str6, (i2 & 64) != 0 ? kycDetails2.country : str7, (i2 & 128) != 0 ? kycDetails2.state : str8, (i2 & 256) != 0 ? kycDetails2.full_name : str9, (i2 & 512) != 0 ? kycDetails2.dob : str10);
    }

    public final String component1() {
        return this.care_of;
    }

    public final String component10() {
        return this.dob;
    }

    public final String component2() {
        return this.aadhar_number;
    }

    public final String component3() {
        return this.client_id;
    }

    public final String component4() {
        return this.gender;
    }

    public final String component5() {
        return this.house;
    }

    public final String component6() {
        return this.city;
    }

    public final String component7() {
        return this.country;
    }

    public final String component8() {
        return this.state;
    }

    public final String component9() {
        return this.full_name;
    }

    public final KycDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "care_of");
        Intrinsics.checkNotNullParameter(str2, "aadhar_number");
        Intrinsics.checkNotNullParameter(str3, "client_id");
        String str11 = str4;
        Intrinsics.checkNotNullParameter(str11, HintConstants.AUTOFILL_HINT_GENDER);
        String str12 = str5;
        Intrinsics.checkNotNullParameter(str12, "house");
        String str13 = str6;
        Intrinsics.checkNotNullParameter(str13, TrackingOptions.AMP_TRACKING_OPTION_CITY);
        String str14 = str7;
        Intrinsics.checkNotNullParameter(str14, TrackingOptions.AMP_TRACKING_OPTION_COUNTRY);
        String str15 = str8;
        Intrinsics.checkNotNullParameter(str15, "state");
        String str16 = str9;
        Intrinsics.checkNotNullParameter(str16, "full_name");
        String str17 = str10;
        Intrinsics.checkNotNullParameter(str17, "dob");
        return new KycDetails(str, str2, str3, str11, str12, str13, str14, str15, str16, str17);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDetails)) {
            return false;
        }
        KycDetails kycDetails = (KycDetails) obj;
        return Intrinsics.areEqual((Object) this.care_of, (Object) kycDetails.care_of) && Intrinsics.areEqual((Object) this.aadhar_number, (Object) kycDetails.aadhar_number) && Intrinsics.areEqual((Object) this.client_id, (Object) kycDetails.client_id) && Intrinsics.areEqual((Object) this.gender, (Object) kycDetails.gender) && Intrinsics.areEqual((Object) this.house, (Object) kycDetails.house) && Intrinsics.areEqual((Object) this.city, (Object) kycDetails.city) && Intrinsics.areEqual((Object) this.country, (Object) kycDetails.country) && Intrinsics.areEqual((Object) this.state, (Object) kycDetails.state) && Intrinsics.areEqual((Object) this.full_name, (Object) kycDetails.full_name) && Intrinsics.areEqual((Object) this.dob, (Object) kycDetails.dob);
    }

    public int hashCode() {
        return (((((((((((((((((this.care_of.hashCode() * 31) + this.aadhar_number.hashCode()) * 31) + this.client_id.hashCode()) * 31) + this.gender.hashCode()) * 31) + this.house.hashCode()) * 31) + this.city.hashCode()) * 31) + this.country.hashCode()) * 31) + this.state.hashCode()) * 31) + this.full_name.hashCode()) * 31) + this.dob.hashCode();
    }

    public String toString() {
        return "KycDetails(care_of=" + this.care_of + ", aadhar_number=" + this.aadhar_number + ", client_id=" + this.client_id + ", gender=" + this.gender + ", house=" + this.house + ", city=" + this.city + ", country=" + this.country + ", state=" + this.state + ", full_name=" + this.full_name + ", dob=" + this.dob + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.care_of);
        parcel.writeString(this.aadhar_number);
        parcel.writeString(this.client_id);
        parcel.writeString(this.gender);
        parcel.writeString(this.house);
        parcel.writeString(this.city);
        parcel.writeString(this.country);
        parcel.writeString(this.state);
        parcel.writeString(this.full_name);
        parcel.writeString(this.dob);
    }

    public KycDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        Intrinsics.checkNotNullParameter(str, "care_of");
        Intrinsics.checkNotNullParameter(str2, "aadhar_number");
        Intrinsics.checkNotNullParameter(str3, "client_id");
        Intrinsics.checkNotNullParameter(str4, HintConstants.AUTOFILL_HINT_GENDER);
        Intrinsics.checkNotNullParameter(str5, "house");
        Intrinsics.checkNotNullParameter(str6, TrackingOptions.AMP_TRACKING_OPTION_CITY);
        Intrinsics.checkNotNullParameter(str7, TrackingOptions.AMP_TRACKING_OPTION_COUNTRY);
        Intrinsics.checkNotNullParameter(str8, "state");
        Intrinsics.checkNotNullParameter(str9, "full_name");
        Intrinsics.checkNotNullParameter(str10, "dob");
        this.care_of = str;
        this.aadhar_number = str2;
        this.client_id = str3;
        this.gender = str4;
        this.house = str5;
        this.city = str6;
        this.country = str7;
        this.state = str8;
        this.full_name = str9;
        this.dob = str10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ KycDetails(String r12, String r13, String r14, String r15, String r16, String r17, String r18, String r19, String r20, String r21, int r22, DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000a
            r1 = r2
            goto L_0x000b
        L_0x000a:
            r1 = r12
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0012
        L_0x0011:
            r3 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r14
        L_0x0019:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001f
            r5 = r2
            goto L_0x0020
        L_0x001f:
            r5 = r15
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r16
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r17
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r18
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r19
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r20
        L_0x0048:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            r2 = r21
        L_0x004f:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.profile.KycDetails.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String getCare_of() {
        return this.care_of;
    }

    public final String getAadhar_number() {
        return this.aadhar_number;
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getHouse() {
        return this.house;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getState() {
        return this.state;
    }

    public final String getFull_name() {
        return this.full_name;
    }

    public final String getDob() {
        return this.dob;
    }
}
