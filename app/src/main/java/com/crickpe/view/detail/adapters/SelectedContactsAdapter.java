package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterSelectedContactBinding;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001c\u001dB%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0013H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter$ViewHolder;", "selectedList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "Lkotlin/collections/ArrayList;", "onRemoveItem", "Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter$OnRemoveItem;", "(Ljava/util/ArrayList;Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter$OnRemoveItem;)V", "getOnRemoveItem", "()Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter$OnRemoveItem;", "setOnRemoveItem", "(Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter$OnRemoveItem;)V", "getSelectedList", "()Ljava/util/ArrayList;", "setSelectedList", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnRemoveItem", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SelectedContactsAdapter.kt */
public final class SelectedContactsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private OnRemoveItem onRemoveItem;
    private ArrayList<ContactRequest> selectedList;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter$OnRemoveItem;", "", "onRemoveItem", "", "user", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SelectedContactsAdapter.kt */
    public interface OnRemoveItem {
        void onRemoveItem(ContactRequest contactRequest);
    }

    public final OnRemoveItem getOnRemoveItem() {
        return this.onRemoveItem;
    }

    public final ArrayList<ContactRequest> getSelectedList() {
        return this.selectedList;
    }

    public final void setOnRemoveItem(OnRemoveItem onRemoveItem2) {
        Intrinsics.checkNotNullParameter(onRemoveItem2, "<set-?>");
        this.onRemoveItem = onRemoveItem2;
    }

    public final void setSelectedList(ArrayList<ContactRequest> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.selectedList = arrayList;
    }

    public SelectedContactsAdapter(ArrayList<ContactRequest> arrayList, OnRemoveItem onRemoveItem2) {
        Intrinsics.checkNotNullParameter(arrayList, "selectedList");
        Intrinsics.checkNotNullParameter(onRemoveItem2, "onRemoveItem");
        this.selectedList = arrayList;
        this.onRemoveItem = onRemoveItem2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_selected_contact, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterSelectedContactBinding) inflate);
    }

    public int getItemCount() {
        return this.selectedList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        ContactRequest contactRequest = this.selectedList.get(i);
        Intrinsics.checkNotNullExpressionValue(contactRequest, "selectedList[position]");
        viewHolder.onBind(contactRequest);
        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivUnselect)).setOnClickListener(new SelectedContactsAdapter$$ExternalSyntheticLambda0(this, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m3470onBindViewHolder$lambda0(SelectedContactsAdapter selectedContactsAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(selectedContactsAdapter, "this$0");
        OnRemoveItem onRemoveItem2 = selectedContactsAdapter.onRemoveItem;
        ContactRequest contactRequest = selectedContactsAdapter.selectedList.get(i);
        Intrinsics.checkNotNullExpressionValue(contactRequest, "selectedList[position]");
        onRemoveItem2.onRemoveItem(contactRequest);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterSelectedContactBinding;", "(Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter;Lcom/crickpe/databinding/AdapterSelectedContactBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "list", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SelectedContactsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterSelectedContactBinding binding;
        private final Context context;
        final /* synthetic */ SelectedContactsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(SelectedContactsAdapter selectedContactsAdapter, AdapterSelectedContactBinding adapterSelectedContactBinding) {
            super(adapterSelectedContactBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterSelectedContactBinding, "binding");
            this.this$0 = selectedContactsAdapter;
            this.binding = adapterSelectedContactBinding;
            this.context = adapterSelectedContactBinding.getRoot().getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(ContactRequest contactRequest) {
            Intrinsics.checkNotNullParameter(contactRequest, "list");
            this.binding.setModel(contactRequest);
        }
    }
}
