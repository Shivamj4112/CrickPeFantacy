package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterWinningsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings.Winning;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00122\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WinningsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/WinningsAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/winnings/Winning;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WinningsAdapter.kt */
public final class WinningsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private ArrayList<Winning> playersList = new ArrayList<>();

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public WinningsAdapter(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.context = fragmentActivity;
    }

    public final ArrayList<Winning> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<Winning> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_winnings, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterWinningsBinding) inflate);
    }

    public int getItemCount() {
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Winning winning = this.playersList.get(i);
        Intrinsics.checkNotNullExpressionValue(winning, "playersList[position]");
        viewHolder.onBind(winning);
        if (i != 0 && i != 1 && (i != 2 || this.playersList.get(i).getRankEnd() != 0)) {
            ImageView imageView = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCrown);
            Intrinsics.checkNotNullExpressionValue(imageView, "holder.itemView.ivCrown");
            CommonMethodsKt.hide(imageView);
        } else if (this.playersList.get(i).getRankEnd() == 0) {
            ImageView imageView2 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCrown);
            Intrinsics.checkNotNullExpressionValue(imageView2, "holder.itemView.ivCrown");
            CommonMethodsKt.visible(imageView2);
        } else {
            ImageView imageView3 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCrown);
            Intrinsics.checkNotNullExpressionValue(imageView3, "holder.itemView.ivCrown");
            CommonMethodsKt.hide(imageView3);
        }
        if (this.playersList.get(i).getRankEnd() == 0) {
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setText(String.valueOf(this.playersList.get(i).getRankStart()));
            return;
        }
        ImageView imageView4 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCrown);
        Intrinsics.checkNotNullExpressionValue(imageView4, "holder.itemView.ivCrown");
        CommonMethodsKt.hide(imageView4);
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setText(this.playersList.get(i).getRankStart() + " - " + this.playersList.get(i).getRankEnd());
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WinningsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterWinningsBinding;", "(Lcom/crickpe/view/detail/adapters/WinningsAdapter;Lcom/crickpe/databinding/AdapterWinningsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/winnings/Winning;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WinningsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterWinningsBinding binding;
        private final Context context;
        final /* synthetic */ WinningsAdapter this$0;

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3485_init_$lambda0(View view) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(WinningsAdapter winningsAdapter, AdapterWinningsBinding adapterWinningsBinding) {
            super(adapterWinningsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterWinningsBinding, "binding");
            this.this$0 = winningsAdapter;
            this.binding = adapterWinningsBinding;
            this.context = adapterWinningsBinding.getRoot().getContext();
            adapterWinningsBinding.getRoot().setOnClickListener(new WinningsAdapter$ViewHolder$$ExternalSyntheticLambda0());
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(Winning winning) {
            Intrinsics.checkNotNullParameter(winning, "players");
            this.binding.setModel(winning);
        }
    }

    public final void addList(boolean z, ArrayList<Winning> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.playersList.clear();
        }
        this.playersList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
