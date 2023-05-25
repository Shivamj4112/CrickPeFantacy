package com.crickpe.view.home.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterWinnersBinding;
import com.crickpe.view.detail.adapters.WinnerListAdapter;
import com.crickpe.view.detail.fragments.contest_winners.models.model.WinnersList;
import com.crickpe.view.home.fragments.winner.models.MegaWinnersM;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015J\b\u0010\u001f\u001a\u00020 H\u0016J\u001c\u0010!\u001a\u00020\u001b2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020 H\u0016J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020 H\u0016J(\u0010(\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020)2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020+0\u0013j\b\u0012\u0004\u0012\u00020+`\u0015H\u0002R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R*\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0013j\b\u0012\u0004\u0012\u00020\u0014`\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006."}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/WinnersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/WinnersAdapter$ViewHolder;", "context", "Landroid/content/Context;", "onClick", "Lcom/crickpe/view/home/adapters/WinnersAdapter$OnclickWinners;", "(Landroid/content/Context;Lcom/crickpe/view/home/adapters/WinnersAdapter$OnclickWinners;)V", "adapter", "Lcom/crickpe/view/detail/adapters/WinnerListAdapter;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getOnClick", "()Lcom/crickpe/view/home/adapters/WinnersAdapter$OnclickWinners;", "setOnClick", "(Lcom/crickpe/view/home/adapters/WinnersAdapter$OnclickWinners;)V", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAdapter", "Landroid/view/View;", "winning", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/WinnersList;", "OnclickWinners", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WinnersAdapter.kt */
public final class WinnersAdapter extends RecyclerView.Adapter<ViewHolder> {
    private WinnerListAdapter adapter;
    private Context context;
    private OnclickWinners onClick;
    private ArrayList<MegaWinnersM> playersList = new ArrayList<>();

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/WinnersAdapter$OnclickWinners;", "", "onItemClick", "", "amount", "Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WinnersAdapter.kt */
    public interface OnclickWinners {
        void onItemClick(MegaWinnersM megaWinnersM);
    }

    public final Context getContext() {
        return this.context;
    }

    public final OnclickWinners getOnClick() {
        return this.onClick;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setOnClick(OnclickWinners onclickWinners) {
        Intrinsics.checkNotNullParameter(onclickWinners, "<set-?>");
        this.onClick = onclickWinners;
    }

    public WinnersAdapter(Context context2, OnclickWinners onclickWinners) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(onclickWinners, "onClick");
        this.context = context2;
        this.onClick = onclickWinners;
    }

    public final ArrayList<MegaWinnersM> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<MegaWinnersM> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_winners, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterWinnersBinding) inflate);
    }

    public int getItemCount() {
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        MegaWinnersM megaWinnersM = this.playersList.get(i);
        Intrinsics.checkNotNullExpressionValue(megaWinnersM, "playersList[position]");
        viewHolder.onBind(megaWinnersM);
        try {
            View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
            setAdapter(view, this.playersList.get(i).getContest().getWinnersList());
        } catch (Exception e) {
            Log.v("EXC_WInnerAda", e.toString());
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/WinnersAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterWinnersBinding;", "(Lcom/crickpe/view/home/adapters/WinnersAdapter;Lcom/crickpe/databinding/AdapterWinnersBinding;)V", "getBinding", "()Lcom/crickpe/databinding/AdapterWinnersBinding;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WinnersAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterWinnersBinding binding;
        private final Context context;
        final /* synthetic */ WinnersAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(WinnersAdapter winnersAdapter, AdapterWinnersBinding adapterWinnersBinding) {
            super(adapterWinnersBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterWinnersBinding, "binding");
            this.this$0 = winnersAdapter;
            this.binding = adapterWinnersBinding;
            this.context = adapterWinnersBinding.getRoot().getContext();
            ((TextView) adapterWinnersBinding.getRoot().findViewById(C1188R.C1192id.tvViewAllWinners)).setOnClickListener(new WinnersAdapter$ViewHolder$$ExternalSyntheticLambda0(winnersAdapter, this));
        }

        public final AdapterWinnersBinding getBinding() {
            return this.binding;
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3694_init_$lambda0(WinnersAdapter winnersAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(winnersAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            OnclickWinners onClick = winnersAdapter.getOnClick();
            MegaWinnersM megaWinnersM = winnersAdapter.getPlayersList().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(megaWinnersM, "playersList[position]");
            onClick.onItemClick(megaWinnersM);
        }

        public final void onBind(MegaWinnersM megaWinnersM) {
            Intrinsics.checkNotNullParameter(megaWinnersM, "players");
            this.binding.setModel(megaWinnersM);
        }
    }

    public final void addList(boolean z, ArrayList<MegaWinnersM> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.playersList.clear();
        }
        this.playersList.addAll(arrayList);
        notifyDataSetChanged();
    }

    private final void setAdapter(View view, ArrayList<WinnersList> arrayList) {
        this.adapter = new WinnerListAdapter(this.context, true);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1188R.C1192id.rvWinnersList);
        WinnerListAdapter winnerListAdapter = null;
        if (recyclerView != null) {
            WinnerListAdapter winnerListAdapter2 = this.adapter;
            if (winnerListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                winnerListAdapter2 = null;
            }
            recyclerView.setAdapter(winnerListAdapter2);
        }
        WinnerListAdapter winnerListAdapter3 = this.adapter;
        if (winnerListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            winnerListAdapter = winnerListAdapter3;
        }
        winnerListAdapter.addList(true, arrayList);
    }
}
