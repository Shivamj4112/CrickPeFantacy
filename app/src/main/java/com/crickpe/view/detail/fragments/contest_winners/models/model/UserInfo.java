package com.crickpe.view.detail.fragments.contest_winners.models.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_winners/models/model/UserInfo;", "", "_id", "", "profilePic", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getName", "getProfilePic", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UserInfo.kt */
public final class UserInfo {
    private final String _id;
    private final String name;
    private final String profilePic;

    public static /* synthetic */ UserInfo copy$default(UserInfo userInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userInfo._id;
        }
        if ((i & 2) != 0) {
            str2 = userInfo.profilePic;
        }
        if ((i & 4) != 0) {
            str3 = userInfo.name;
        }
        return userInfo.copy(str, str2, str3);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.profilePic;
    }

    public final String component3() {
        return this.name;
    }

    public final UserInfo copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "profilePic");
        Intrinsics.checkNotNullParameter(str3, "name");
        return new UserInfo(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) userInfo._id) && Intrinsics.areEqual((Object) this.profilePic, (Object) userInfo.profilePic) && Intrinsics.areEqual((Object) this.name, (Object) userInfo.name);
    }

    public int hashCode() {
        return (((this._id.hashCode() * 31) + this.profilePic.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "UserInfo(_id=" + this._id + ", profilePic=" + this.profilePic + ", name=" + this.name + ')';
    }

    public UserInfo(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "profilePic");
        Intrinsics.checkNotNullParameter(str3, "name");
        this._id = str;
        this.profilePic = str2;
        this.name = str3;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final String getName() {
        return this.name;
    }
}
