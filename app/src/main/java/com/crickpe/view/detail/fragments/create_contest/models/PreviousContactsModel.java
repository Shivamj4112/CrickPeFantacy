package com.crickpe.view.detail.fragments.create_contest.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001d"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/models/PreviousContactsModel;", "", "_id", "", "userId", "contestId", "user", "Lcom/crickpe/view/detail/fragments/create_contest/models/User;", "isSelected", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_contest/models/User;Z)V", "get_id", "()Ljava/lang/String;", "getContestId", "()Z", "getUser", "()Lcom/crickpe/view/detail/fragments/create_contest/models/User;", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PreviousContactsModel.kt */
public final class PreviousContactsModel {
    private final String _id;
    private final String contestId;
    private final boolean isSelected;
    private final User user;
    private final String userId;

    public static /* synthetic */ PreviousContactsModel copy$default(PreviousContactsModel previousContactsModel, String str, String str2, String str3, User user2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = previousContactsModel._id;
        }
        if ((i & 2) != 0) {
            str2 = previousContactsModel.userId;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = previousContactsModel.contestId;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            user2 = previousContactsModel.user;
        }
        User user3 = user2;
        if ((i & 16) != 0) {
            z = previousContactsModel.isSelected;
        }
        return previousContactsModel.copy(str, str4, str5, user3, z);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.contestId;
    }

    public final User component4() {
        return this.user;
    }

    public final boolean component5() {
        return this.isSelected;
    }

    public final PreviousContactsModel copy(String str, String str2, String str3, User user2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "contestId");
        Intrinsics.checkNotNullParameter(user2, "user");
        return new PreviousContactsModel(str, str2, str3, user2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviousContactsModel)) {
            return false;
        }
        PreviousContactsModel previousContactsModel = (PreviousContactsModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) previousContactsModel._id) && Intrinsics.areEqual((Object) this.userId, (Object) previousContactsModel.userId) && Intrinsics.areEqual((Object) this.contestId, (Object) previousContactsModel.contestId) && Intrinsics.areEqual((Object) this.user, (Object) previousContactsModel.user) && this.isSelected == previousContactsModel.isSelected;
    }

    public int hashCode() {
        int hashCode = ((((((this._id.hashCode() * 31) + this.userId.hashCode()) * 31) + this.contestId.hashCode()) * 31) + this.user.hashCode()) * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "PreviousContactsModel(_id=" + this._id + ", userId=" + this.userId + ", contestId=" + this.contestId + ", user=" + this.user + ", isSelected=" + this.isSelected + ')';
    }

    public PreviousContactsModel(String str, String str2, String str3, User user2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "contestId");
        Intrinsics.checkNotNullParameter(user2, "user");
        this._id = str;
        this.userId = str2;
        this.contestId = str3;
        this.user = user2;
        this.isSelected = z;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final User getUser() {
        return this.user;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }
}
