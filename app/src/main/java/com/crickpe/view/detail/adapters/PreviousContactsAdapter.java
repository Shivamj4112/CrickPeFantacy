package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterPreviousContactsBinding;
import com.crickpe.view.detail.fragments.create_contest.models.PreviousContactsModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0012B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\r\u001a\u00020\tH\u0016J\u001c\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/PreviousContactsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/PreviousContactsAdapter$ViewHolder;", "selectedList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/models/PreviousContactsModel;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PreviousContactsAdapter.kt */
public final class PreviousContactsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<PreviousContactsModel> selectedList;

    public PreviousContactsAdapter(ArrayList<PreviousContactsModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "selectedList");
        this.selectedList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_previous_contacts, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterPreviousContactsBinding) inflate);
    }

    public int getItemCount() {
        return this.selectedList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        PreviousContactsModel previousContactsModel = this.selectedList.get(i);
        Intrinsics.checkNotNullExpressionValue(previousContactsModel, "selectedList[position]");
        viewHolder.onBind(previousContactsModel);
        if (i != 0) {
            CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContact);
            Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivContact");
            View view = circleImageView;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.LayoutParams layoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(-8, 0, 0, 0);
                view.setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/PreviousContactsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterPreviousContactsBinding;", "(Lcom/crickpe/view/detail/adapters/PreviousContactsAdapter;Lcom/crickpe/databinding/AdapterPreviousContactsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "list", "Lcom/crickpe/view/detail/fragments/create_contest/models/PreviousContactsModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PreviousContactsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterPreviousContactsBinding binding;
        private final Context context;
        final /* synthetic */ PreviousContactsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(PreviousContactsAdapter previousContactsAdapter, AdapterPreviousContactsBinding adapterPreviousContactsBinding) {
            super(adapterPreviousContactsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterPreviousContactsBinding, "binding");
            this.this$0 = previousContactsAdapter;
            this.binding = adapterPreviousContactsBinding;
            this.context = adapterPreviousContactsBinding.getRoot().getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(PreviousContactsModel previousContactsModel) {
            Intrinsics.checkNotNullParameter(previousContactsModel, "list");
            this.binding.setModel(previousContactsModel);
        }
    }
}
