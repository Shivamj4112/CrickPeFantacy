package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterRecentEarningsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB\u0005¢\u0006\u0002\u0010\u0003J&\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\r2\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0012H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0016R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/RecentEarningsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/RecentEarningsAdapter$ViewHolder;", "()V", "completedMatchList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "Lkotlin/collections/ArrayList;", "getCompletedMatchList", "()Ljava/util/ArrayList;", "setCompletedMatchList", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RecentEarningsAdapter.kt */
public final class RecentEarningsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<MyMatchesModel> completedMatchList = new ArrayList<>();

    public final ArrayList<MyMatchesModel> getCompletedMatchList() {
        return this.completedMatchList;
    }

    public final void setCompletedMatchList(ArrayList<MyMatchesModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.completedMatchList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_recent_earnings, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterRecentEarningsBinding) inflate);
    }

    public int getItemCount() {
        return this.completedMatchList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        MyMatchesModel myMatchesModel = this.completedMatchList.get(i);
        Intrinsics.checkNotNullExpressionValue(myMatchesModel, "completedMatchList[position]");
        viewHolder.onBind(myMatchesModel);
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMatch)).setText("Match " + (i + 1));
        if (((int) this.completedMatchList.get(i).getYouWon()) == 0) {
            TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvOverT2);
            Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvOverT2");
            CommonMethodsKt.hide(textView);
            return;
        }
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvOverT2);
        Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvOverT2");
        CommonMethodsKt.visible(textView2);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/RecentEarningsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterRecentEarningsBinding;", "(Lcom/crickpe/view/detail/adapters/RecentEarningsAdapter;Lcom/crickpe/databinding/AdapterRecentEarningsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: RecentEarningsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterRecentEarningsBinding binding;
        private final Context context;
        final /* synthetic */ RecentEarningsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(RecentEarningsAdapter recentEarningsAdapter, AdapterRecentEarningsBinding adapterRecentEarningsBinding) {
            super(adapterRecentEarningsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterRecentEarningsBinding, "binding");
            this.this$0 = recentEarningsAdapter;
            this.binding = adapterRecentEarningsBinding;
            this.context = adapterRecentEarningsBinding.getRoot().getContext();
            adapterRecentEarningsBinding.getRoot().setOnClickListener(new RecentEarningsAdapter$ViewHolder$$ExternalSyntheticLambda0(recentEarningsAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3465_init_$lambda0(RecentEarningsAdapter recentEarningsAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(recentEarningsAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            UserManager.INSTANCE.saveMatchId(recentEarningsAdapter.getCompletedMatchList().get(viewHolder.getAdapterPosition()).get_id());
            UserManager.INSTANCE.saveContestClick(2);
            Intent intent = new Intent(new Intent(viewHolder.context, DetailActivity.class));
            intent.putExtra("open", "my_match_detail");
            intent.putExtra("matchId", recentEarningsAdapter.getCompletedMatchList().get(viewHolder.getAdapterPosition()).get_id());
            Context context2 = viewHolder.context;
            if (context2 != null) {
                context2.startActivity(intent);
            }
        }

        public final void onBind(MyMatchesModel myMatchesModel) {
            Intrinsics.checkNotNullParameter(myMatchesModel, "players");
            this.binding.setModel(myMatchesModel);
        }
    }

    public final void addList(boolean z, ArrayList<MyMatchesModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.completedMatchList.clear();
        }
        this.completedMatchList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
