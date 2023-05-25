package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterMegaAmountBinding;
import com.crickpe.view.detail.fragments.contest_winners.models.model.MegaContestAmtModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002*+B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\"\u001a\u00020\u0018H\u0016J\u001c\u0010#\u001a\u00020\u001e2\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020\u0018H\u0016J\u001c\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0018H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006,"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "onclickListner", "Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter$OnClickAmount;", "(Landroidx/fragment/app/FragmentActivity;Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter$OnClickAmount;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "getOnclickListner", "()Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter$OnClickAmount;", "setOnclickListner", "(Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter$OnClickAmount;)V", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/MegaContestAmtModel;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "rowIndex", "", "getRowIndex", "()I", "setRowIndex", "(I)V", "addList", "", "firstPage", "", "list", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClickAmount", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MegaWinnerAmountAdapter.kt */
public final class MegaWinnerAmountAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private OnClickAmount onclickListner;
    private ArrayList<MegaContestAmtModel> playersList = new ArrayList<>();
    private int rowIndex;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter$OnClickAmount;", "", "onItemClicked", "", "amount", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/MegaContestAmtModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MegaWinnerAmountAdapter.kt */
    public interface OnClickAmount {
        void onItemClicked(MegaContestAmtModel megaContestAmtModel);
    }

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final OnClickAmount getOnclickListner() {
        return this.onclickListner;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public final void setOnclickListner(OnClickAmount onClickAmount) {
        Intrinsics.checkNotNullParameter(onClickAmount, "<set-?>");
        this.onclickListner = onClickAmount;
    }

    public MegaWinnerAmountAdapter(FragmentActivity fragmentActivity, OnClickAmount onClickAmount) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        Intrinsics.checkNotNullParameter(onClickAmount, "onclickListner");
        this.context = fragmentActivity;
        this.onclickListner = onClickAmount;
    }

    public final ArrayList<MegaContestAmtModel> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<MegaContestAmtModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public final int getRowIndex() {
        return this.rowIndex;
    }

    public final void setRowIndex(int i) {
        this.rowIndex = i;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_mega_amount, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterMegaAmountBinding) inflate);
    }

    public int getItemCount() {
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        if (this.rowIndex == i) {
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAmount)).setTextColor(AppCompatResources.getColorStateList(this.context, C1188R.C1189color.white));
            ((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlAmount)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.app_color_one));
        } else {
            ((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlAmount)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.grey_light_x));
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAmount)).setTextColor(AppCompatResources.getColorStateList(this.context, C1188R.C1189color.grey));
        }
        StringBuilder sb = new StringBuilder();
        sb.append(8377);
        sb.append(this.playersList.get(i).getWinningAmount());
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAmount)).setText(sb.toString());
    }

    @Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterMegaAmountBinding;", "(Lcom/crickpe/view/detail/adapters/MegaWinnerAmountAdapter;Lcom/crickpe/databinding/AdapterMegaAmountBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MegaWinnerAmountAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterMegaAmountBinding binding;
        private final Context context;
        final /* synthetic */ MegaWinnerAmountAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MegaWinnerAmountAdapter megaWinnerAmountAdapter, AdapterMegaAmountBinding adapterMegaAmountBinding) {
            super(adapterMegaAmountBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterMegaAmountBinding, "binding");
            this.this$0 = megaWinnerAmountAdapter;
            this.binding = adapterMegaAmountBinding;
            this.context = adapterMegaAmountBinding.getRoot().getContext();
            adapterMegaAmountBinding.getRoot().setOnClickListener(new MegaWinnerAmountAdapter$ViewHolder$$ExternalSyntheticLambda0(megaWinnerAmountAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3454_init_$lambda0(MegaWinnerAmountAdapter megaWinnerAmountAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(megaWinnerAmountAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            if (megaWinnerAmountAdapter.getRowIndex() != viewHolder.getAdapterPosition()) {
                OnClickAmount onclickListner = megaWinnerAmountAdapter.getOnclickListner();
                MegaContestAmtModel megaContestAmtModel = megaWinnerAmountAdapter.getPlayersList().get(viewHolder.getAdapterPosition());
                Intrinsics.checkNotNullExpressionValue(megaContestAmtModel, "playersList[adapterPosition]");
                onclickListner.onItemClicked(megaContestAmtModel);
                megaWinnerAmountAdapter.setRowIndex(viewHolder.getAdapterPosition());
                megaWinnerAmountAdapter.notifyDataSetChanged();
            }
        }
    }

    public final void addList(boolean z, ArrayList<MegaContestAmtModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.playersList.clear();
        }
        this.playersList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
