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
import com.crickpe.databinding.AdapterWinnersRankBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.detail.fragments.create_contest.TeamWinnings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0014\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00112\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WinnersRankAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/WinnersRankAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "topContestModel", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/TeamWinnings;", "getTopContestModel", "()Ljava/util/ArrayList;", "setTopContestModel", "(Ljava/util/ArrayList;)V", "addList", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WinnersRankAdapter.kt */
public final class WinnersRankAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private ArrayList<TeamWinnings> topContestModel = new ArrayList<>();

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public WinnersRankAdapter(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.context = fragmentActivity;
    }

    public final ArrayList<TeamWinnings> getTopContestModel() {
        return this.topContestModel;
    }

    public final void setTopContestModel(ArrayList<TeamWinnings> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.topContestModel = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_winners_rank, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterWinnersRankBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WinnersRankAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterWinnersRankBinding;", "(Lcom/crickpe/view/detail/adapters/WinnersRankAdapter;Lcom/crickpe/databinding/AdapterWinnersRankBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_contest/TeamWinnings;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WinnersRankAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterWinnersRankBinding binding;
        private final Context context;
        final /* synthetic */ WinnersRankAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(WinnersRankAdapter winnersRankAdapter, AdapterWinnersRankBinding adapterWinnersRankBinding) {
            super(adapterWinnersRankBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterWinnersRankBinding, "binding");
            this.this$0 = winnersRankAdapter;
            this.binding = adapterWinnersRankBinding;
            this.context = adapterWinnersRankBinding.getRoot().getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(TeamWinnings teamWinnings) {
            Intrinsics.checkNotNullParameter(teamWinnings, "topContestMode");
            this.binding.setModel(teamWinnings);
        }
    }

    public int getItemCount() {
        return this.topContestModel.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        TeamWinnings teamWinnings = this.topContestModel.get(i);
        Intrinsics.checkNotNullExpressionValue(teamWinnings, "topContestModel[position]");
        viewHolder.onBind(teamWinnings);
        if (i == 0 || i == 1 || (i == 2 && this.topContestModel.get(i).getRankEnd() == 0)) {
            ImageView imageView = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCrown);
            Intrinsics.checkNotNullExpressionValue(imageView, "holder.itemView.ivCrown");
            CommonMethodsKt.visible(imageView);
        } else {
            ImageView imageView2 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCrown);
            Intrinsics.checkNotNullExpressionValue(imageView2, "holder.itemView.ivCrown");
            CommonMethodsKt.hide(imageView2);
        }
        if (this.topContestModel.get(i).getRankEnd() == 0) {
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvIndex)).setText(String.valueOf(this.topContestModel.get(i).getRankStart()));
        } else {
            ImageView imageView3 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCrown);
            Intrinsics.checkNotNullExpressionValue(imageView3, "holder.itemView.ivCrown");
            CommonMethodsKt.hide(imageView3);
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvIndex)).setText(this.topContestModel.get(i).getRankStart() + " - " + this.topContestModel.get(i).getRankEnd());
        }
        if (i == getItemCount() - 1) {
            View findViewById = viewHolder.itemView.findViewById(C1188R.C1192id.view);
            Intrinsics.checkNotNullExpressionValue(findViewById, "holder.itemView.view");
            CommonMethodsKt.hide(findViewById);
            return;
        }
        View findViewById2 = viewHolder.itemView.findViewById(C1188R.C1192id.view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "holder.itemView.view");
        CommonMethodsKt.visible(findViewById2);
    }

    public final void addList(List<TeamWinnings> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.topContestModel.clear();
        this.topContestModel.addAll(list);
        notifyDataSetChanged();
    }
}
