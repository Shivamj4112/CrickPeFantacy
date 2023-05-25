package com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/Contact;", "", "name", "", "mobileNo", "(Ljava/lang/String;Ljava/lang/String;)V", "getMobileNo", "()Ljava/lang/String;", "setMobileNo", "(Ljava/lang/String;)V", "getName", "setName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Contact.kt */
public final class Contact {
    private String mobileNo;
    private String name;

    public static /* synthetic */ Contact copy$default(Contact contact, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contact.name;
        }
        if ((i & 2) != 0) {
            str2 = contact.mobileNo;
        }
        return contact.copy(str, str2);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.mobileNo;
    }

    public final Contact copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        return new Contact(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Contact)) {
            return false;
        }
        Contact contact = (Contact) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) contact.name) && Intrinsics.areEqual((Object) this.mobileNo, (Object) contact.mobileNo);
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + this.mobileNo.hashCode();
    }

    public String toString() {
        return "Contact(name=" + this.name + ", mobileNo=" + this.mobileNo + ')';
    }

    public Contact(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "mobileNo");
        this.name = str;
        this.mobileNo = str2;
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
}
