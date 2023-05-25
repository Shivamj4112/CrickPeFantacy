package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterWalletHistoryBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.detail.fragments.wallet.models.Transaction;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00122\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0017J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WalletHistoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/WalletHistoryAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "walletModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/wallet/models/Transaction;", "Lkotlin/collections/ArrayList;", "getWalletModels", "()Ljava/util/ArrayList;", "setWalletModels", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WalletHistoryAdapter.kt */
public final class WalletHistoryAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private ArrayList<Transaction> walletModels = new ArrayList<>();

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public WalletHistoryAdapter(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.context = fragmentActivity;
    }

    public final ArrayList<Transaction> getWalletModels() {
        return this.walletModels;
    }

    public final void setWalletModels(ArrayList<Transaction> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.walletModels = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_wallet_history, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterWalletHistoryBinding) inflate);
    }

    public int getItemCount() {
        return this.walletModels.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String str;
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Transaction transaction = this.walletModels.get(i);
        Intrinsics.checkNotNullExpressionValue(transaction, "walletModels[position]");
        viewHolder.onBind(transaction);
        if (this.walletModels.get(i).get_id() == null || this.walletModels.get(i).get_id().length() < 8) {
            str = this.walletModels.get(i).get_id();
        } else {
            str = this.walletModels.get(i).get_id().substring(this.walletModels.get(i).get_id().length() - 8);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String).substring(startIndex)");
        }
        if (i % 2 == 0) {
            ((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBody)).setBackgroundColor(this.context.getColor(C1188R.C1189color.grey_light_x));
        } else {
            ((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBody)).setBackgroundColor(this.context.getColor(C1188R.C1189color.white));
        }
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvId)).setText("ID: " + str);
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvDateTime)).setText(CommonMethodsKt.modifyDateLayout(this.walletModels.get(i).getCreatedAt(), "MMM dd HH:mm a"));
        switch (this.walletModels.get(i).getType()) {
            case 1:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.wallet_topup);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.wallet_topup));
                break;
            case 2:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.wallet_withdraw);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.wallet_withdraw));
                break;
            case 3:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.wallet_win);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.wallet_win));
                break;
            case 4:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.wallet_cashback);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.wallet_cashback));
                break;
            case 5:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.wallet_joining_bonus);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.wallet_joining_bonus));
                break;
            case 6:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.wallet_contest_join);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.wallet_contest_join));
                break;
            case 7:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.wallet_refund);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.wallet_refund));
                break;
            case 8:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.wallet_reward);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.wallet_reward));
                break;
            case 9:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.refreal_icon);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.wallet_referral_bonus));
                break;
            case 10:
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTransactionType)).setImageResource(C1188R.C1190drawable.tds);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvType)).setTextColor(ContextCompat.getColor(this.context, C1188R.C1189color.tds));
                break;
        }
        try {
            if (this.walletModels.get(i).getTransactionReference() != null) {
                RelativeLayout relativeLayout = (RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlReference);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "holder.itemView.rlReference");
                CommonMethodsKt.visible(relativeLayout);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvReference)).setText("Reference No- " + this.walletModels.get(i).getTransactionReference());
                return;
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlReference);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "holder.itemView.rlReference");
            CommonMethodsKt.hide(relativeLayout2);
        } catch (Exception e) {
            Log.v("TDSS", e.toString());
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WalletHistoryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterWalletHistoryBinding;", "(Lcom/crickpe/view/detail/adapters/WalletHistoryAdapter;Lcom/crickpe/databinding/AdapterWalletHistoryBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "walletModel", "Lcom/crickpe/view/detail/fragments/wallet/models/Transaction;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WalletHistoryAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterWalletHistoryBinding binding;
        private final Context context;
        final /* synthetic */ WalletHistoryAdapter this$0;

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3481_init_$lambda0(View view) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(WalletHistoryAdapter walletHistoryAdapter, AdapterWalletHistoryBinding adapterWalletHistoryBinding) {
            super(adapterWalletHistoryBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterWalletHistoryBinding, "binding");
            this.this$0 = walletHistoryAdapter;
            this.binding = adapterWalletHistoryBinding;
            this.context = adapterWalletHistoryBinding.getRoot().getContext();
            adapterWalletHistoryBinding.getRoot().setOnClickListener(new WalletHistoryAdapter$ViewHolder$$ExternalSyntheticLambda0());
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(Transaction transaction) {
            Intrinsics.checkNotNullParameter(transaction, "walletModel");
            this.binding.setModel(transaction);
            this.binding.setContext(this.context);
        }
    }

    public final void addList(boolean z, ArrayList<Transaction> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.walletModels.clear();
        }
        this.walletModels.addAll(arrayList);
        notifyDataSetChanged();
    }
}
