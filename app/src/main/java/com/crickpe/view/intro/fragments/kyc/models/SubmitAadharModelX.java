package com.crickpe.view.intro.fragments.kyc.models;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b\u0012\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\u0019\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bHÆ\u0003J\u0019\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bHÆ\u0003Jq\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b2\u0018\b\u0002\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R!\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R!\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00030\nj\b\u0012\u0004\u0012\u00020\u0003`\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000f¨\u0006%"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/kyc/models/SubmitAadharModelX;", "", "client_id", "", "token", "url", "type", "expiry_seconds", "", "idfySuccess", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "idfyFailure", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;)V", "getClient_id", "()Ljava/lang/String;", "getExpiry_seconds", "()I", "getIdfyFailure", "()Ljava/util/ArrayList;", "getIdfySuccess", "getToken", "getType", "getUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SubmitAadharModelX.kt */
public final class SubmitAadharModelX {
    private final String client_id;
    private final int expiry_seconds;
    private final ArrayList<String> idfyFailure;
    private final ArrayList<String> idfySuccess;
    private final String token;
    private final String type;
    private final String url;

    public static /* synthetic */ SubmitAadharModelX copy$default(SubmitAadharModelX submitAadharModelX, String str, String str2, String str3, String str4, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = submitAadharModelX.client_id;
        }
        if ((i2 & 2) != 0) {
            str2 = submitAadharModelX.token;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = submitAadharModelX.url;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            str4 = submitAadharModelX.type;
        }
        String str7 = str4;
        if ((i2 & 16) != 0) {
            i = submitAadharModelX.expiry_seconds;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            arrayList = submitAadharModelX.idfySuccess;
        }
        ArrayList<String> arrayList3 = arrayList;
        if ((i2 & 64) != 0) {
            arrayList2 = submitAadharModelX.idfyFailure;
        }
        return submitAadharModelX.copy(str, str5, str6, str7, i3, arrayList3, arrayList2);
    }

    public final String component1() {
        return this.client_id;
    }

    public final String component2() {
        return this.token;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.type;
    }

    public final int component5() {
        return this.expiry_seconds;
    }

    public final ArrayList<String> component6() {
        return this.idfySuccess;
    }

    public final ArrayList<String> component7() {
        return this.idfyFailure;
    }

    public final SubmitAadharModelX copy(String str, String str2, String str3, String str4, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "client_id");
        Intrinsics.checkNotNullParameter(str2, "token");
        Intrinsics.checkNotNullParameter(str4, "type");
        Intrinsics.checkNotNullParameter(arrayList, "idfySuccess");
        ArrayList<String> arrayList3 = arrayList2;
        Intrinsics.checkNotNullParameter(arrayList3, "idfyFailure");
        return new SubmitAadharModelX(str, str2, str3, str4, i, arrayList, arrayList3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SubmitAadharModelX)) {
            return false;
        }
        SubmitAadharModelX submitAadharModelX = (SubmitAadharModelX) obj;
        return Intrinsics.areEqual((Object) this.client_id, (Object) submitAadharModelX.client_id) && Intrinsics.areEqual((Object) this.token, (Object) submitAadharModelX.token) && Intrinsics.areEqual((Object) this.url, (Object) submitAadharModelX.url) && Intrinsics.areEqual((Object) this.type, (Object) submitAadharModelX.type) && this.expiry_seconds == submitAadharModelX.expiry_seconds && Intrinsics.areEqual((Object) this.idfySuccess, (Object) submitAadharModelX.idfySuccess) && Intrinsics.areEqual((Object) this.idfyFailure, (Object) submitAadharModelX.idfyFailure);
    }

    public int hashCode() {
        int hashCode = ((this.client_id.hashCode() * 31) + this.token.hashCode()) * 31;
        String str = this.url;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.type.hashCode()) * 31) + this.expiry_seconds) * 31) + this.idfySuccess.hashCode()) * 31) + this.idfyFailure.hashCode();
    }

    public String toString() {
        return "SubmitAadharModelX(client_id=" + this.client_id + ", token=" + this.token + ", url=" + this.url + ", type=" + this.type + ", expiry_seconds=" + this.expiry_seconds + ", idfySuccess=" + this.idfySuccess + ", idfyFailure=" + this.idfyFailure + ')';
    }

    public SubmitAadharModelX(String str, String str2, String str3, String str4, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Intrinsics.checkNotNullParameter(str, "client_id");
        Intrinsics.checkNotNullParameter(str2, "token");
        Intrinsics.checkNotNullParameter(str4, "type");
        Intrinsics.checkNotNullParameter(arrayList, "idfySuccess");
        Intrinsics.checkNotNullParameter(arrayList2, "idfyFailure");
        this.client_id = str;
        this.token = str2;
        this.url = str3;
        this.type = str4;
        this.expiry_seconds = i;
        this.idfySuccess = arrayList;
        this.idfyFailure = arrayList2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SubmitAadharModelX(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, str4, i, arrayList, arrayList2);
    }

    public final String getClient_id() {
        return this.client_id;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getType() {
        return this.type;
    }

    public final int getExpiry_seconds() {
        return this.expiry_seconds;
    }

    public final ArrayList<String> getIdfySuccess() {
        return this.idfySuccess;
    }

    public final ArrayList<String> getIdfyFailure() {
        return this.idfyFailure;
    }
}
