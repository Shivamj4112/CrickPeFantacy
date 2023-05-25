package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterBankLinkedBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.wallet.my_banks_list.BankDetailsItem;
import com.crickpe.view.intro.fragments.User;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&'B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u001eH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006("}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/BankLinkedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/BankLinkedAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/BankLinkedAdapter$OnItemClicked;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/detail/adapters/BankLinkedAdapter$OnItemClicked;Landroidx/fragment/app/FragmentActivity;)V", "banksList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/wallet/my_banks_list/BankDetailsItem;", "Lkotlin/collections/ArrayList;", "getBanksList", "()Ljava/util/ArrayList;", "setBanksList", "(Ljava/util/ArrayList;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/BankLinkedAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/BankLinkedAdapter$OnItemClicked;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BankLinkedAdapter.kt */
public final class BankLinkedAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<BankDetailsItem> banksList = new ArrayList<>();
    private FragmentActivity context;
    private OnItemClicked onItemClicked;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/BankLinkedAdapter$OnItemClicked;", "", "onItemClicked", "", "bank", "Lcom/crickpe/view/detail/fragments/wallet/my_banks_list/BankDetailsItem;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: BankLinkedAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(BankDetailsItem bankDetailsItem);
    }

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public BankLinkedAdapter(OnItemClicked onItemClicked2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = onItemClicked2;
        this.context = fragmentActivity;
    }

    public final ArrayList<BankDetailsItem> getBanksList() {
        return this.banksList;
    }

    public final void setBanksList(ArrayList<BankDetailsItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.banksList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_bank_linked, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterBankLinkedBinding) inflate);
    }

    public int getItemCount() {
        return this.banksList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        BankDetailsItem bankDetailsItem = this.banksList.get(i);
        Intrinsics.checkNotNullExpressionValue(bankDetailsItem, "banksList[position]");
        viewHolder.onBind(bankDetailsItem);
        if (i == 0) {
            try {
                View findViewById = viewHolder.itemView.findViewById(C1188R.C1192id.view);
                Intrinsics.checkNotNullExpressionValue(findViewById, "holder.itemView.view");
                CommonMethodsKt.hide(findViewById);
            } catch (Exception e) {
                Log.v("TESTT", e.toString());
                TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAccountName);
                User userProfile = UserManager.INSTANCE.getUserProfile();
                textView.setText(String.valueOf(userProfile != null ? userProfile.getName() : null));
                return;
            }
        } else {
            View findViewById2 = viewHolder.itemView.findViewById(C1188R.C1192id.view);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "holder.itemView.view");
            CommonMethodsKt.visible(findViewById2);
        }
        String str = this.banksList.get(i).getIfsc().toString();
        if (this.banksList.get(i).getAccountNumber().length() > 4) {
            String substring = this.banksList.get(i).getAccountNumber().substring(this.banksList.get(i).getAccountNumber().length() - 4);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAccountNo)).setText(str + " - ********" + substring);
        }
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAccountName)).setText(this.banksList.get(i).getAccountName().toString());
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/BankLinkedAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterBankLinkedBinding;", "(Lcom/crickpe/view/detail/adapters/BankLinkedAdapter;Lcom/crickpe/databinding/AdapterBankLinkedBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "banksModel", "Lcom/crickpe/view/detail/fragments/wallet/my_banks_list/BankDetailsItem;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: BankLinkedAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterBankLinkedBinding binding;
        private final Context context;
        final /* synthetic */ BankLinkedAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(BankLinkedAdapter bankLinkedAdapter, AdapterBankLinkedBinding adapterBankLinkedBinding) {
            super(adapterBankLinkedBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterBankLinkedBinding, "binding");
            this.this$0 = bankLinkedAdapter;
            this.binding = adapterBankLinkedBinding;
            this.context = adapterBankLinkedBinding.getRoot().getContext();
            adapterBankLinkedBinding.getRoot().setOnClickListener(new BankLinkedAdapter$ViewHolder$$ExternalSyntheticLambda0(bankLinkedAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3440_init_$lambda0(BankLinkedAdapter bankLinkedAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(bankLinkedAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            OnItemClicked onItemClicked = bankLinkedAdapter.getOnItemClicked();
            BankDetailsItem bankDetailsItem = bankLinkedAdapter.getBanksList().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(bankDetailsItem, "banksList[position]");
            onItemClicked.onItemClicked(bankDetailsItem);
            int size = bankLinkedAdapter.getBanksList().size();
            int i = 0;
            while (i < size) {
                bankLinkedAdapter.getBanksList().get(i).setSelected(i == viewHolder.getPosition());
                i++;
            }
            bankLinkedAdapter.notifyDataSetChanged();
        }

        public final void onBind(BankDetailsItem bankDetailsItem) {
            Intrinsics.checkNotNullParameter(bankDetailsItem, "banksModel");
            this.binding.setModel(bankDetailsItem);
        }
    }

    public final void addList(boolean z, ArrayList<BankDetailsItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.banksList.clear();
        }
        this.banksList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
