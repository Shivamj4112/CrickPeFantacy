package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterContactsBinding;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016J\u001e\u0010\u001c\u001a\u00020\u00152\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\bR.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00020\u0007\u0018\u0001`\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/ContactAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/ContactAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/ContactAdapter$OnItemClicked;", "list", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "Lkotlin/collections/ArrayList;", "(Lcom/crickpe/view/detail/adapters/ContactAdapter$OnItemClicked;Ljava/util/ArrayList;)V", "getList", "()Ljava/util/ArrayList;", "setList", "(Ljava/util/ArrayList;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/ContactAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/ContactAdapter$OnItemClicked;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "temp", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContactAdapter.kt */
public final class ContactAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<ContactRequest> list;
    private OnItemClicked onItemClicked;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/ContactAdapter$OnItemClicked;", "", "onItemClicked", "", "fa", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContactAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(ContactRequest contactRequest);
    }

    public final ArrayList<ContactRequest> getList() {
        return this.list;
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setList(ArrayList<ContactRequest> arrayList) {
        this.list = arrayList;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public ContactAdapter(OnItemClicked onItemClicked2, ArrayList<ContactRequest> arrayList) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        this.onItemClicked = onItemClicked2;
        this.list = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_contacts, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterContactsBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/ContactAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterContactsBinding;", "(Lcom/crickpe/view/detail/adapters/ContactAdapter;Lcom/crickpe/databinding/AdapterContactsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "user", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContactAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterContactsBinding binding;
        private final Context context;
        final /* synthetic */ ContactAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ContactAdapter contactAdapter, AdapterContactsBinding adapterContactsBinding) {
            super(adapterContactsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterContactsBinding, "binding");
            this.this$0 = contactAdapter;
            this.binding = adapterContactsBinding;
            this.context = adapterContactsBinding.getRoot().getContext();
            adapterContactsBinding.getRoot().setOnClickListener(new ContactAdapter$ViewHolder$$ExternalSyntheticLambda0(contactAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3441_init_$lambda0(ContactAdapter contactAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(contactAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            OnItemClicked onItemClicked = contactAdapter.getOnItemClicked();
            ArrayList<ContactRequest> list = contactAdapter.getList();
            Intrinsics.checkNotNull(list);
            ContactRequest contactRequest = list.get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(contactRequest, "list!![position]");
            onItemClicked.onItemClicked(contactRequest);
            ArrayList<ContactRequest> list2 = contactAdapter.getList();
            Intrinsics.checkNotNull(list2);
            ArrayList<ContactRequest> list3 = contactAdapter.getList();
            Intrinsics.checkNotNull(list3);
            list2.get(viewHolder.getPosition()).setSelected(!list3.get(viewHolder.getPosition()).isSelected());
            contactAdapter.notifyItemChanged(viewHolder.getPosition());
        }

        public final void onBind(ContactRequest contactRequest) {
            Intrinsics.checkNotNullParameter(contactRequest, "user");
            this.binding.setModel(contactRequest);
        }
    }

    public int getItemCount() {
        ArrayList<ContactRequest> arrayList = this.list;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        ArrayList<ContactRequest> arrayList = this.list;
        Intrinsics.checkNotNull(arrayList);
        ContactRequest contactRequest = arrayList.get(i);
        Intrinsics.checkNotNullExpressionValue(contactRequest, "list!![position]");
        viewHolder.onBind(contactRequest);
        ArrayList<ContactRequest> arrayList2 = this.list;
        Intrinsics.checkNotNull(arrayList2);
        String substring = arrayList2.get(i).getName().substring(0, 1);
        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFirstName)).setText(substring);
    }

    public final void updateList(ArrayList<ContactRequest> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "temp");
        this.list = arrayList;
        notifyDataSetChanged();
    }
}
