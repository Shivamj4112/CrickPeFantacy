package com.crickpe.view.home.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterFilterTopPlayersBinding;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayerFilter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002*+B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J(\u0010\u001d\u001a\u00020\u001e2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f2\b\u0010 \u001a\u0004\u0018\u00010\u000eJ\b\u0010!\u001a\u00020\"H\u0016J\u001c\u0010#\u001a\u00020\u001e2\n\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020\"H\u0016J\u001c\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\"H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006,"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter$OnItemClicked;", "context", "Landroid/content/Context;", "(Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter$OnItemClicked;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "filterModel", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayerFilter;", "Lkotlin/collections/ArrayList;", "getFilterModel", "()Ljava/util/ArrayList;", "setFilterModel", "(Ljava/util/ArrayList;)V", "getOnItemClicked", "()Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter$OnItemClicked;)V", "selectedFilterItem", "getSelectedFilterItem", "()Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayerFilter;", "setSelectedFilterItem", "(Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayerFilter;)V", "addList", "", "list", "selectedFilter", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopPlayerFilterAdapter.kt */
public final class TopPlayerFilterAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private ArrayList<TopPlayerFilter> filterModel = new ArrayList<>();
    private OnItemClicked onItemClicked;
    private TopPlayerFilter selectedFilterItem;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter$OnItemClicked;", "", "onItemClicked", "", "fa", "Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayerFilter;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopPlayerFilterAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(TopPlayerFilter topPlayerFilter);
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public TopPlayerFilterAdapter(OnItemClicked onItemClicked2, Context context2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.onItemClicked = onItemClicked2;
        this.context = context2;
    }

    public final ArrayList<TopPlayerFilter> getFilterModel() {
        return this.filterModel;
    }

    public final void setFilterModel(ArrayList<TopPlayerFilter> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.filterModel = arrayList;
    }

    public final TopPlayerFilter getSelectedFilterItem() {
        return this.selectedFilterItem;
    }

    public final void setSelectedFilterItem(TopPlayerFilter topPlayerFilter) {
        this.selectedFilterItem = topPlayerFilter;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_filter_top_players, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterFilterTopPlayersBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterFilterTopPlayersBinding;", "(Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter;Lcom/crickpe/databinding/AdapterFilterTopPlayersBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayerFilter;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopPlayerFilterAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterFilterTopPlayersBinding binding;
        private final Context context;
        final /* synthetic */ TopPlayerFilterAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(TopPlayerFilterAdapter topPlayerFilterAdapter, AdapterFilterTopPlayersBinding adapterFilterTopPlayersBinding) {
            super(adapterFilterTopPlayersBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterFilterTopPlayersBinding, "binding");
            this.this$0 = topPlayerFilterAdapter;
            this.binding = adapterFilterTopPlayersBinding;
            this.context = adapterFilterTopPlayersBinding.getRoot().getContext();
            adapterFilterTopPlayersBinding.getRoot().setOnClickListener(new TopPlayerFilterAdapter$ViewHolder$$ExternalSyntheticLambda0(topPlayerFilterAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3691_init_$lambda0(TopPlayerFilterAdapter topPlayerFilterAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(topPlayerFilterAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            OnItemClicked onItemClicked = topPlayerFilterAdapter.getOnItemClicked();
            TopPlayerFilter topPlayerFilter = topPlayerFilterAdapter.getFilterModel().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(topPlayerFilter, "filterModel[position]");
            onItemClicked.onItemClicked(topPlayerFilter);
            topPlayerFilterAdapter.getFilterModel().get(viewHolder.getPosition()).setSelected(true);
        }

        public final void onBind(TopPlayerFilter topPlayerFilter) {
            Intrinsics.checkNotNullParameter(topPlayerFilter, "topContestMode");
            if (this.this$0.getSelectedFilterItem() != null) {
                TopPlayerFilter selectedFilterItem = this.this$0.getSelectedFilterItem();
                Intrinsics.checkNotNull(selectedFilterItem);
                topPlayerFilter.setSelected(Intrinsics.areEqual((Object) topPlayerFilter, (Object) selectedFilterItem));
            }
            this.binding.setModel(topPlayerFilter);
        }
    }

    public int getItemCount() {
        return this.filterModel.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        TopPlayerFilter topPlayerFilter = this.filterModel.get(i);
        Intrinsics.checkNotNullExpressionValue(topPlayerFilter, "filterModel[position]");
        viewHolder.onBind(topPlayerFilter);
    }

    public final void addList(ArrayList<TopPlayerFilter> arrayList, TopPlayerFilter topPlayerFilter) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        this.filterModel.addAll(arrayList);
        this.selectedFilterItem = topPlayerFilter;
        notifyDataSetChanged();
    }
}
