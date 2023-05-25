package com.crickpe.view.detail.fragments.create_contest.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/models/User;", "", "mobileNo", "", "profilePic", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMobileNo", "()Ljava/lang/String;", "getName", "getProfilePic", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: User.kt */
public final class User {
    private final String mobileNo;
    private final String name;
    private final String profilePic;

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.mobileNo;
        }
        if ((i & 2) != 0) {
            str2 = user.profilePic;
        }
        if ((i & 4) != 0) {
            str3 = user.name;
        }
        return user.copy(str, str2, str3);
    }

    public final String component1() {
        return this.mobileNo;
    }

    public final String component2() {
        return this.profilePic;
    }

    public final String component3() {
        return this.name;
    }

    public final User copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "mobileNo");
        Intrinsics.checkNotNullParameter(str2, "profilePic");
        Intrinsics.checkNotNullParameter(str3, "name");
        return new User(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof User)) {
            return false;
        }
        User user = (User) obj;
        return Intrinsics.areEqual((Object) this.mobileNo, (Object) user.mobileNo) && Intrinsics.areEqual((Object) this.profilePic, (Object) user.profilePic) && Intrinsics.areEqual((Object) this.name, (Object) user.name);
    }

    public int hashCode() {
        return (((this.mobileNo.hashCode() * 31) + this.profilePic.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "User(mobileNo=" + this.mobileNo + ", profilePic=" + this.profilePic + ", name=" + this.name + ')';
    }

    public User(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "mobileNo");
        Intrinsics.checkNotNullParameter(str2, "profilePic");
        Intrinsics.checkNotNullParameter(str3, "name");
        this.mobileNo = str;
        this.profilePic = str2;
        this.name = str3;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final String getName() {
        return this.name;
    }
}
