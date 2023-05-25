package com.crickpe.view.detail.fragments.create_contest;

import android.util.Log;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;
import com.crickpe.view.intro.fragments.User;
import com.google.gson.Gson;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(mo48221d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, mo48222d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "invoke"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ShareContestFragment.kt */
final class ShareContestFragment$fetchContacts$6 extends Lambda implements Function1<ArrayList<ContactRequest>, Unit> {
    final /* synthetic */ ShareContestFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ShareContestFragment$fetchContacts$6(ShareContestFragment shareContestFragment) {
        super(1);
        this.this$0 = shareContestFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ArrayList<ContactRequest>) (ArrayList) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ArrayList<ContactRequest> arrayList) {
        Object obj;
        Intrinsics.checkNotNullParameter(arrayList, "it");
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            obj = null;
            if (i >= size) {
                break;
            }
            User userProfile = UserManager.INSTANCE.getUserProfile();
            if (userProfile != null) {
                obj = userProfile.getMobileNo();
            }
            if (!Intrinsics.areEqual(obj, (Object) arrayList.get(i).getMobileNo())) {
                arrayList2.add(arrayList.get(i));
            }
            i++;
        }
        String json = new Gson().toJson((Object) arrayList2);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(contactList)");
        UserManager.INSTANCE.saveContacts(json);
        Log.v("SAVEEEE4", json);
        ArrayList<ContactRequest> contactListMain = this.this$0.getContactListMain();
        Boolean valueOf = contactListMain != null ? Boolean.valueOf(!contactListMain.isEmpty()) : null;
        Intrinsics.checkNotNull(valueOf);
        if (valueOf.booleanValue()) {
            ArrayList<ContactRequest> contactListMain2 = this.this$0.getContactListMain();
            Intrinsics.checkNotNull(contactListMain2);
            if (!Intrinsics.areEqual((Object) contactListMain2, (Object) arrayList2)) {
                this.this$0.setContactListMain(arrayList2);
                ArrayList<ContactRequest> contactListMain3 = this.this$0.getContactListMain();
                if (contactListMain3 != null) {
                    obj = Integer.valueOf(contactListMain3.size());
                }
                Log.v("List_Updated2", String.valueOf(obj));
            }
        }
    }
}
