package com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000e¨\u0006\u001a"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "", "name", "", "mobileNo", "isSelected", "", "(Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "setSelected", "(Z)V", "getMobileNo", "()Ljava/lang/String;", "setMobileNo", "(Ljava/lang/String;)V", "getName", "setName", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContactRequest.kt */
public final class ContactRequest {
    private boolean isSelected;
    private String mobileNo;
    private String name;

    public ContactRequest() {
        this((String) null, (String) null, false, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ContactRequest copy$default(ContactRequest contactRequest, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contactRequest.name;
        }
        if ((i & 2) != 0) {
            str2 = contactRequest.mobileNo;
        }
        if ((i & 4) != 0) {
            z = contactRequest.isSelected;
        }
        return contactRequest.copy(str, str2, z);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.mobileNo;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final ContactRequest copy(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        return new ContactRequest(str, str2, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactRequest)) {
            return false;
        }
        ContactRequest contactRequest = (ContactRequest) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) contactRequest.name) && Intrinsics.areEqual((Object) this.mobileNo, (Object) contactRequest.mobileNo) && this.isSelected == contactRequest.isSelected;
    }

    public int hashCode() {
        int hashCode = ((this.name.hashCode() * 31) + this.mobileNo.hashCode()) * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "ContactRequest(name=" + this.name + ", mobileNo=" + this.mobileNo + ", isSelected=" + this.isSelected + ')';
    }

    public ContactRequest(String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        this.name = str;
        this.mobileNo = str2;
        this.isSelected = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContactRequest(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getMobileNo() {
        return this.mobileNo;
    }

    public final void setMobileNo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.mobileNo = str;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
