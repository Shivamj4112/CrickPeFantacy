package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/TeamnInfo;", "", "key", "", "code", "name", "country_code", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getCountry_code", "getKey", "getName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TeamnInfo.kt */
public final class TeamnInfo {
    private final String code;
    private final String country_code;
    private final String key;
    private final String name;

    public static /* synthetic */ TeamnInfo copy$default(TeamnInfo teamnInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = teamnInfo.key;
        }
        if ((i & 2) != 0) {
            str2 = teamnInfo.code;
        }
        if ((i & 4) != 0) {
            str3 = teamnInfo.name;
        }
        if ((i & 8) != 0) {
            str4 = teamnInfo.country_code;
        }
        return teamnInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.code;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.country_code;
    }

    public final TeamnInfo copy(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "country_code");
        return new TeamnInfo(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TeamnInfo)) {
            return false;
        }
        TeamnInfo teamnInfo = (TeamnInfo) obj;
        return Intrinsics.areEqual((Object) this.key, (Object) teamnInfo.key) && Intrinsics.areEqual((Object) this.code, (Object) teamnInfo.code) && Intrinsics.areEqual((Object) this.name, (Object) teamnInfo.name) && Intrinsics.areEqual((Object) this.country_code, (Object) teamnInfo.country_code);
    }

    public int hashCode() {
        return (((((this.key.hashCode() * 31) + this.code.hashCode()) * 31) + this.name.hashCode()) * 31) + this.country_code.hashCode();
    }

    public String toString() {
        return "TeamnInfo(key=" + this.key + ", code=" + this.code + ", name=" + this.name + ", country_code=" + this.country_code + ')';
    }

    public TeamnInfo(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "code");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "country_code");
        this.key = str;
        this.code = str2;
        this.name = str3;
        this.country_code = str4;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getName() {
        return this.name;
    }

    public final String getCountry_code() {
        return this.country_code;
    }
}
