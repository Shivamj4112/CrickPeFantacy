package com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R!\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/SendInviteRequest;", "", "contestId", "", "matchId", "contacts", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/Contact;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getContacts", "()Ljava/util/ArrayList;", "getContestId", "()Ljava/lang/String;", "getMatchId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SendInviteRequest.kt */
public final class SendInviteRequest {
    private final ArrayList<Contact> contacts;
    private final String contestId;
    private final String matchId;

    public static /* synthetic */ SendInviteRequest copy$default(SendInviteRequest sendInviteRequest, String str, String str2, ArrayList<Contact> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendInviteRequest.contestId;
        }
        if ((i & 2) != 0) {
            str2 = sendInviteRequest.matchId;
        }
        if ((i & 4) != 0) {
            arrayList = sendInviteRequest.contacts;
        }
        return sendInviteRequest.copy(str, str2, arrayList);
    }

    public final String component1() {
        return this.contestId;
    }

    public final String component2() {
        return this.matchId;
    }

    public final ArrayList<Contact> component3() {
        return this.contacts;
    }

    public final SendInviteRequest copy(String str, String str2, ArrayList<Contact> arrayList) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(arrayList, "contacts");
        return new SendInviteRequest(str, str2, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendInviteRequest)) {
            return false;
        }
        SendInviteRequest sendInviteRequest = (SendInviteRequest) obj;
        return Intrinsics.areEqual((Object) this.contestId, (Object) sendInviteRequest.contestId) && Intrinsics.areEqual((Object) this.matchId, (Object) sendInviteRequest.matchId) && Intrinsics.areEqual((Object) this.contacts, (Object) sendInviteRequest.contacts);
    }

    public int hashCode() {
        return (((this.contestId.hashCode() * 31) + this.matchId.hashCode()) * 31) + this.contacts.hashCode();
    }

    public String toString() {
        return "SendInviteRequest(contestId=" + this.contestId + ", matchId=" + this.matchId + ", contacts=" + this.contacts + ')';
    }

    public SendInviteRequest(String str, String str2, ArrayList<Contact> arrayList) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(arrayList, "contacts");
        this.contestId = str;
        this.matchId = str2;
        this.contacts = arrayList;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final ArrayList<Contact> getContacts() {
        return this.contacts;
    }
}
