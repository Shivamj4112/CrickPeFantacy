package com.crickpe.view.home.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.data.RecentEarningModel;
import com.crickpe.utils.CommonMethodsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

@Metadata(mo48221d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001eB\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\u001c\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00062\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/AnalyticsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/AnalyticsAdapter$ViewHolder;", "onItemClick", "Lkotlin/reflect/KFunction1;", "Lcom/crickpe/data/RecentEarningModel;", "", "(Lkotlin/reflect/KFunction;)V", "getOnItemClick", "()Lkotlin/reflect/KFunction;", "productsList", "Ljava/util/ArrayList;", "getProductsList", "()Ljava/util/ArrayList;", "setProductsList", "(Ljava/util/ArrayList;)V", "addList", "firstPage", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AnalyticsAdapter.kt */
public final class AnalyticsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private final KFunction<Unit> onItemClick;
    private ArrayList<RecentEarningModel> productsList = new ArrayList<>();

    public int getItemCount() {
        return 7;
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
    }

    public final KFunction<Unit> getOnItemClick() {
        return this.onItemClick;
    }

    public AnalyticsAdapter(KFunction<Unit> kFunction) {
        Intrinsics.checkNotNullParameter(kFunction, "onItemClick");
        this.onItemClick = kFunction;
    }

    public final ArrayList<RecentEarningModel> getProductsList() {
        return this.productsList;
    }

    public final void setProductsList(ArrayList<RecentEarningModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.productsList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new ViewHolder(this, CommonMethodsKt.inflate(viewGroup, C1188R.C1193layout.adapter_players_stats));
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/AnalyticsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crickpe/view/home/adapters/AnalyticsAdapter;Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "bind", "", "recentEarningModel", "Lcom/crickpe/data/RecentEarningModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: AnalyticsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        final /* synthetic */ AnalyticsAdapter this$0;

        public final void bind(RecentEarningModel recentEarningModel) {
            Intrinsics.checkNotNullParameter(recentEarningModel, "recentEarningModel");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(AnalyticsAdapter analyticsAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = analyticsAdapter;
            this.context = view.getContext();
        }

        public final Context getContext() {
            return this.context;
        }
    }

    public final void addList(boolean z, List<RecentEarningModel> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (z) {
            this.productsList.clear();
        }
        this.productsList.addAll(list);
        notifyDataSetChanged();
    }
}
