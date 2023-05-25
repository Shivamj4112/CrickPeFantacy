package com.crickpe.view.detail.fragments.settings.models.profile_new;

import androidx.autofill.HintConstants;
import com.amplitude.android.TrackingOptions;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\fHÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\fHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006+"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/profile_new/KycDetails;", "", "care_of", "", "gender", "country", "full_name", "dob", "house", "city", "state", "aadhaar_number", "", "client_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAadhaar_number", "()I", "getCare_of", "()Ljava/lang/String;", "getCity", "getClient_id", "getCountry", "getDob", "getFull_name", "getGender", "getHouse", "getState", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: KycDetails.kt */
public final class KycDetails {
    @SerializedName("aadhaar_number")
    private final int aadhaar_number;
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

    public static /* synthetic */ KycDetails copy$default(KycDetails kycDetails, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9, int i2, Object obj) {
        KycDetails kycDetails2 = kycDetails;
        int i3 = i2;
        return kycDetails.copy((i3 & 1) != 0 ? kycDetails2.care_of : str, (i3 & 2) != 0 ? kycDetails2.gender : str2, (i3 & 4) != 0 ? kycDetails2.country : str3, (i3 & 8) != 0 ? kycDetails2.full_name : str4, (i3 & 16) != 0 ? kycDetails2.dob : str5, (i3 & 32) != 0 ? kycDetails2.house : str6, (i3 & 64) != 0 ? kycDetails2.city : str7, (i3 & 128) != 0 ? kycDetails2.state : str8, (i3 & 256) != 0 ? kycDetails2.aadhaar_number : i, (i3 & 512) != 0 ? kycDetails2.client_id : str9);
    }

    public final String component1() {
        return this.care_of;
    }

    public final String component10() {
        return this.client_id;
    }

    public final String component2() {
        return this.gender;
    }

    public final String component3() {
        return this.country;
    }

    public final String component4() {
        return this.full_name;
    }

    public final String component5() {
        return this.dob;
    }

    public final String component6() {
        return this.house;
    }

    public final String component7() {
        return this.city;
    }

    public final String component8() {
        return this.state;
    }

    public final int component9() {
        return this.aadhaar_number;
    }

    public final KycDetails copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9) {
        Intrinsics.checkNotNullParameter(str, "care_of");
        Intrinsics.checkNotNullParameter(str2, HintConstants.AUTOFILL_HINT_GENDER);
        Intrinsics.checkNotNullParameter(str3, TrackingOptions.AMP_TRACKING_OPTION_COUNTRY);
        String str10 = str4;
        Intrinsics.checkNotNullParameter(str10, "full_name");
        String str11 = str5;
        Intrinsics.checkNotNullParameter(str11, "dob");
        String str12 = str6;
        Intrinsics.checkNotNullParameter(str12, "house");
        String str13 = str7;
        Intrinsics.checkNotNullParameter(str13, TrackingOptions.AMP_TRACKING_OPTION_CITY);
        String str14 = str8;
        Intrinsics.checkNotNullParameter(str14, "state");
        String str15 = str9;
        Intrinsics.checkNotNullParameter(str15, "client_id");
        return new KycDetails(str, str2, str3, str10, str11, str12, str13, str14, i, str15);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycDetails)) {
            return false;
        }
        KycDetails kycDetails = (KycDetails) obj;
        return Intrinsics.areEqual((Object) this.care_of, (Object) kycDetails.care_of) && Intrinsics.areEqual((Object) this.gender, (Object) kycDetails.gender) && Intrinsics.areEqual((Object) this.country, (Object) kycDetails.country) && Intrinsics.areEqual((Object) this.full_name, (Object) kycDetails.full_name) && Intrinsics.areEqual((Object) this.dob, (Object) kycDetails.dob) && Intrinsics.areEqual((Object) this.house, (Object) kycDetails.house) && Intrinsics.areEqual((Object) this.city, (Object) kycDetails.city) && Intrinsics.areEqual((Object) this.state, (Object) kycDetails.state) && this.aadhaar_number == kycDetails.aadhaar_number && Intrinsics.areEqual((Object) this.client_id, (Object) kycDetails.client_id);
    }

    public int hashCode() {
        return (((((((((((((((((this.care_of.hashCode() * 31) + this.gender.hashCode()) * 31) + this.country.hashCode()) * 31) + this.full_name.hashCode()) * 31) + this.dob.hashCode()) * 31) + this.house.hashCode()) * 31) + this.city.hashCode()) * 31) + this.state.hashCode()) * 31) + this.aadhaar_number) * 31) + this.client_id.hashCode();
    }

    public String toString() {
        return "KycDetails(care_of=" + this.care_of + ", gender=" + this.gender + ", country=" + this.country + ", full_name=" + this.full_name + ", dob=" + this.dob + ", house=" + this.house + ", city=" + this.city + ", state=" + this.state + ", aadhaar_number=" + this.aadhaar_number + ", client_id=" + this.client_id + ')';
    }

    public KycDetails(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, String str9) {
        Intrinsics.checkNotNullParameter(str, "care_of");
        Intrinsics.checkNotNullParameter(str2, HintConstants.AUTOFILL_HINT_GENDER);
        Intrinsics.checkNotNullParameter(str3, TrackingOptions.AMP_TRACKING_OPTION_COUNTRY);
        Intrinsics.checkNotNullParameter(str4, "full_name");
        Intrinsics.checkNotNullParameter(str5, "dob");
        Intrinsics.checkNotNullParameter(str6, "house");
        Intrinsics.checkNotNullParameter(str7, TrackingOptions.AMP_TRACKING_OPTION_CITY);
        Intrinsics.checkNotNullParameter(str8, "state");
        Intrinsics.checkNotNullParameter(str9, "client_id");
        this.care_of = str;
        this.gender = str2;
        this.country = str3;
        this.full_name = str4;
        this.dob = str5;
        this.house = str6;
        this.city = str7;
        this.state = str8;
        this.aadhaar_number = i;
        this.client_id = str9;
    }

    public final String getCare_of() {
        return this.care_of;
    }

    public final String getGender() {
        return this.gender;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getFull_name() {
        return this.full_name;
    }

    public final String getDob() {
        return this.dob;
    }

    public final String getHouse() {
        return this.house;
    }

    public final String getCity() {
        return this.city;
    }

    public final String getState() {
        return this.state;
    }

    public final int getAadhaar_number() {
        return this.aadhaar_number;
    }

    public final String getClient_id() {
        return this.client_id;
    }
}
