package com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J;\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/InviteSentModel;", "", "name", "", "mobileNo", "createdBy", "contestId", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContestId", "()Ljava/lang/String;", "getCreatedBy", "getMobileNo", "getName", "getUserId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: InviteSentModel.kt */
public final class InviteSentModel {
    private final String contestId;
    private final String createdBy;
    private final String mobileNo;
    private final String name;
    private final String userId;

    public static /* synthetic */ InviteSentModel copy$default(InviteSentModel inviteSentModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inviteSentModel.name;
        }
        if ((i & 2) != 0) {
            str2 = inviteSentModel.mobileNo;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = inviteSentModel.createdBy;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = inviteSentModel.contestId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = inviteSentModel.userId;
        }
        return inviteSentModel.copy(str, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.mobileNo;
    }

    public final String component3() {
        return this.createdBy;
    }

    public final String component4() {
        return this.contestId;
    }

    public final String component5() {
        return this.userId;
    }

    public final InviteSentModel copy(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        Intrinsics.checkNotNullParameter(str3, "createdBy");
        Intrinsics.checkNotNullParameter(str4, "contestId");
        Intrinsics.checkNotNullParameter(str5, "userId");
        return new InviteSentModel(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InviteSentModel)) {
            return false;
        }
        InviteSentModel inviteSentModel = (InviteSentModel) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) inviteSentModel.name) && Intrinsics.areEqual((Object) this.mobileNo, (Object) inviteSentModel.mobileNo) && Intrinsics.areEqual((Object) this.createdBy, (Object) inviteSentModel.createdBy) && Intrinsics.areEqual((Object) this.contestId, (Object) inviteSentModel.contestId) && Intrinsics.areEqual((Object) this.userId, (Object) inviteSentModel.userId);
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.mobileNo.hashCode()) * 31) + this.createdBy.hashCode()) * 31) + this.contestId.hashCode()) * 31) + this.userId.hashCode();
    }

    public String toString() {
        return "InviteSentModel(name=" + this.name + ", mobileNo=" + this.mobileNo + ", createdBy=" + this.createdBy + ", contestId=" + this.contestId + ", userId=" + this.userId + ')';
    }

    public InviteSentModel(String str, String str2, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        Intrinsics.checkNotNullParameter(str3, "createdBy");
        Intrinsics.checkNotNullParameter(str4, "contestId");
        Intrinsics.checkNotNullParameter(str5, "userId");
        this.name = str;
        this.mobileNo = str2;
        this.createdBy = str3;
        this.contestId = str4;
        this.userId = str5;
    }

    public final String getName() {
        return this.name;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final String getCreatedBy() {
        return this.createdBy;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final String getUserId() {
        return this.userId;
    }
}
