package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterHomeLiveMachesBinding;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001e\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u001c\u0010\u0017\u001a\u00020\u00112\n\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u0016H\u0016J\u001c\u0010\u001a\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0016H\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0005¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter$OnItemClicked;", "(Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter$OnItemClicked;)V", "myMatchesModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "getMyMatchesModels", "()Ljava/util/ArrayList;", "setMyMatchesModels", "(Ljava/util/ArrayList;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter$OnItemClicked;", "setOnItemClicked", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeLiveMachesAdapter.kt */
public final class HomeLiveMachesAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<MyMatchesModel> myMatchesModels = new ArrayList<>();
    private OnItemClicked onItemClicked;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter$OnItemClicked;", "", "onItemClicked", "", "upcomingMatchModel", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: HomeLiveMachesAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(MyMatchesModel myMatchesModel);
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public HomeLiveMachesAdapter(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        this.onItemClicked = onItemClicked2;
    }

    public final ArrayList<MyMatchesModel> getMyMatchesModels() {
        return this.myMatchesModels;
    }

    public final void setMyMatchesModels(ArrayList<MyMatchesModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.myMatchesModels = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_home_live_maches, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterHomeLiveMachesBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterHomeLiveMachesBinding;", "(Lcom/crickpe/view/detail/adapters/HomeLiveMachesAdapter;Lcom/crickpe/databinding/AdapterHomeLiveMachesBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "upcmingMatchModel", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: HomeLiveMachesAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterHomeLiveMachesBinding binding;
        private final Context context;
        final /* synthetic */ HomeLiveMachesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(HomeLiveMachesAdapter homeLiveMachesAdapter, AdapterHomeLiveMachesBinding adapterHomeLiveMachesBinding) {
            super(adapterHomeLiveMachesBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterHomeLiveMachesBinding, "binding");
            this.this$0 = homeLiveMachesAdapter;
            this.binding = adapterHomeLiveMachesBinding;
            this.context = adapterHomeLiveMachesBinding.getRoot().getContext();
            adapterHomeLiveMachesBinding.getRoot().setOnClickListener(new HomeLiveMachesAdapter$ViewHolder$$ExternalSyntheticLambda0(homeLiveMachesAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3448_init_$lambda0(HomeLiveMachesAdapter homeLiveMachesAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(homeLiveMachesAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            OnItemClicked onItemClicked = homeLiveMachesAdapter.getOnItemClicked();
            MyMatchesModel myMatchesModel = homeLiveMachesAdapter.getMyMatchesModels().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(myMatchesModel, "myMatchesModels[position]");
            onItemClicked.onItemClicked(myMatchesModel);
        }

        public final void onBind(MyMatchesModel myMatchesModel) {
            Intrinsics.checkNotNullParameter(myMatchesModel, "upcmingMatchModel");
            this.binding.setModel(myMatchesModel);
        }
    }

    public int getItemCount() {
        return this.myMatchesModels.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        MyMatchesModel myMatchesModel = this.myMatchesModels.get(i);
        Intrinsics.checkNotNullExpressionValue(myMatchesModel, "myMatchesModels[position]");
        viewHolder.onBind(myMatchesModel);
    }

    public final void addList(boolean z, ArrayList<MyMatchesModel> arrayList) {
        if (z) {
            this.myMatchesModels.clear();
        }
        ArrayList<MyMatchesModel> arrayList2 = this.myMatchesModels;
        Intrinsics.checkNotNull(arrayList);
        arrayList2.addAll(arrayList);
        notifyDataSetChanged();
    }
}
