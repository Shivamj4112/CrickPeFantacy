package com.crickpe.view.home;

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
/* compiled from: HomeActivity.kt */
final class HomeActivity$fetchContacts$6 extends Lambda implements Function1<ArrayList<ContactRequest>, Unit> {
    public static final HomeActivity$fetchContacts$6 INSTANCE = new HomeActivity$fetchContacts$6();

    HomeActivity$fetchContacts$6() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ArrayList<ContactRequest>) (ArrayList) obj);
        return Unit.INSTANCE;
    }

    public final void invoke(ArrayList<ContactRequest> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "it");
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            User userProfile = UserManager.INSTANCE.getUserProfile();
            if (!Intrinsics.areEqual((Object) userProfile != null ? userProfile.getMobileNo() : null, (Object) arrayList.get(i).getMobileNo())) {
                arrayList2.add(arrayList.get(i));
            }
        }
        String json = new Gson().toJson((Object) arrayList2);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(contactList)");
        UserManager.INSTANCE.saveContacts(json);
    }
}
