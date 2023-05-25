package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.detail.fragments.create_contest.NumberOfWinnersModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002#$B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0014\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u00182\n\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001bH\u0016J\u001c\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001bH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006%"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WinnersCountAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/WinnersCountAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/WinnersCountAdapter$OnItemClicked;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/detail/adapters/WinnersCountAdapter$OnItemClicked;Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/WinnersCountAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/WinnersCountAdapter$OnItemClicked;)V", "productsList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/NumberOfWinnersModel;", "getProductsList", "()Ljava/util/ArrayList;", "setProductsList", "(Ljava/util/ArrayList;)V", "addList", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WinnersCountAdapter.kt */
public final class WinnersCountAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private OnItemClicked onItemClicked;
    private ArrayList<NumberOfWinnersModel> productsList = new ArrayList<>();

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WinnersCountAdapter$OnItemClicked;", "", "onItemClicked", "", "fa", "Lcom/crickpe/view/detail/fragments/create_contest/NumberOfWinnersModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WinnersCountAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(NumberOfWinnersModel numberOfWinnersModel);
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public WinnersCountAdapter(OnItemClicked onItemClicked2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = onItemClicked2;
        this.context = fragmentActivity;
    }

    public final ArrayList<NumberOfWinnersModel> getProductsList() {
        return this.productsList;
    }

    public final void setProductsList(ArrayList<NumberOfWinnersModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.productsList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new ViewHolder(this, CommonMethodsKt.inflate(viewGroup, C1188R.C1193layout.adapter_players_count));
    }

    public int getItemCount() {
        return this.productsList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvWinnerCount)).setText(String.valueOf(this.productsList.get(i).getCount()));
        if (this.productsList.get(i).isSelected()) {
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvWinnerCount)).setBackground(this.context.getResources().getDrawable(C1188R.C1190drawable.circle_bg_appcolor));
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvWinnerCount)).setTextColor(this.context.getResources().getColor(C1188R.C1189color.white));
        } else {
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvWinnerCount)).setBackground(this.context.getResources().getDrawable(C1188R.C1190drawable.circle_grey_border));
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvWinnerCount)).setTextColor(this.context.getResources().getColor(C1188R.C1189color.black));
        }
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvWinnerCount)).setOnClickListener(new WinnersCountAdapter$$ExternalSyntheticLambda0(this, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m3484onBindViewHolder$lambda0(WinnersCountAdapter winnersCountAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(winnersCountAdapter, "this$0");
        OnItemClicked onItemClicked2 = winnersCountAdapter.onItemClicked;
        NumberOfWinnersModel numberOfWinnersModel = winnersCountAdapter.productsList.get(i);
        Intrinsics.checkNotNullExpressionValue(numberOfWinnersModel, "productsList[position]");
        onItemClicked2.onItemClicked(numberOfWinnersModel);
        int size = winnersCountAdapter.productsList.size();
        int i2 = 0;
        while (i2 < size) {
            winnersCountAdapter.productsList.get(i2).setSelected(i2 == i);
            i2++;
        }
        winnersCountAdapter.notifyDataSetChanged();
    }

    @Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WinnersCountAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crickpe/view/detail/adapters/WinnersCountAdapter;Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WinnersCountAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        final /* synthetic */ WinnersCountAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(WinnersCountAdapter winnersCountAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = winnersCountAdapter;
            this.context = view.getContext();
        }

        public final Context getContext() {
            return this.context;
        }
    }

    public final void addList(ArrayList<NumberOfWinnersModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        this.productsList.clear();
        this.productsList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
