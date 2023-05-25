package com.crickpe.view.home.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.view.home.fragments.NavigationItemModel;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\b\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0016R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/NavigationRVAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/NavigationRVAdapter$NavigationItemViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/NavigationItemModel;", "Lkotlin/collections/ArrayList;", "currentPos", "", "(Ljava/util/ArrayList;I)V", "context", "Landroid/content/Context;", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "NavigationItemViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: NavigationRVAdapter.kt */
public final class NavigationRVAdapter extends RecyclerView.Adapter<NavigationItemViewHolder> {
    private Context context;
    private int currentPos;
    private ArrayList<NavigationItemModel> items;

    public NavigationRVAdapter(ArrayList<NavigationItemModel> arrayList, int i) {
        Intrinsics.checkNotNullParameter(arrayList, FirebaseAnalytics.Param.ITEMS);
        this.items = arrayList;
        this.currentPos = i;
    }

    @Metadata(mo48221d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/NavigationRVAdapter$NavigationItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: NavigationRVAdapter.kt */
    public static final class NavigationItemViewHolder extends RecyclerView.ViewHolder {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NavigationItemViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
        }
    }

    public NavigationItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "parent.context");
        this.context = context2;
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C1188R.C1193layout.row_nav_drawer, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "navItem");
        return new NavigationItemViewHolder(inflate);
    }

    public int getItemCount() {
        return this.items.size();
    }

    public void onBindViewHolder(NavigationItemViewHolder navigationItemViewHolder, int i) {
        Intrinsics.checkNotNullParameter(navigationItemViewHolder, "holder");
        ((TextView) navigationItemViewHolder.itemView.findViewById(C1188R.C1192id.navigation_title)).setText(this.items.get(i).getTitle());
        ((ImageView) navigationItemViewHolder.itemView.findViewById(C1188R.C1192id.navigation_icon)).setImageResource(this.items.get(i).getIcon());
    }
}
