package com.crickpe.view.home;

import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo48221d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo48222d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "invoke"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeActivity.kt */
final class HomeActivity$fetchContacts$5 extends Lambda implements Function0<ArrayList<ContactRequest>> {
    final /* synthetic */ HomeActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeActivity$fetchContacts$5(HomeActivity homeActivity) {
        super(0);
        this.this$0 = homeActivity;
    }

    public final ArrayList<ContactRequest> invoke() {
        return CommonMethodsKt.getContactList(this.this$0);
    }
}
