package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterCompletedBinding;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u001c\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u001a"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyCompletedMatchesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/MyCompletedMatchesAdapter$ViewHolder;", "()V", "completedMatchList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "getCompletedMatchList", "()Ljava/util/ArrayList;", "setCompletedMatchList", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyCompletedMatchesAdapter.kt */
public final class MyCompletedMatchesAdapter extends RecyclerView.Adapter<ViewHolder> {
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
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_completed, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterCompletedBinding) inflate);
    }

    public int getItemCount() {
        return this.completedMatchList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        MyMatchesModel myMatchesModel = this.completedMatchList.get(i);
        Intrinsics.checkNotNullExpressionValue(myMatchesModel, "completedMatchList[position]");
        viewHolder.onBind(myMatchesModel);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyCompletedMatchesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterCompletedBinding;", "(Lcom/crickpe/view/detail/adapters/MyCompletedMatchesAdapter;Lcom/crickpe/databinding/AdapterCompletedBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyCompletedMatchesAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterCompletedBinding binding;
        private final Context context;
        final /* synthetic */ MyCompletedMatchesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MyCompletedMatchesAdapter myCompletedMatchesAdapter, AdapterCompletedBinding adapterCompletedBinding) {
            super(adapterCompletedBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterCompletedBinding, "binding");
            this.this$0 = myCompletedMatchesAdapter;
            this.binding = adapterCompletedBinding;
            this.context = adapterCompletedBinding.getRoot().getContext();
            adapterCompletedBinding.getRoot().setOnClickListener(new MyCompletedMatchesAdapter$ViewHolder$$ExternalSyntheticLambda0(myCompletedMatchesAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3458_init_$lambda0(MyCompletedMatchesAdapter myCompletedMatchesAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(myCompletedMatchesAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            UserManager.INSTANCE.saveMatchId(myCompletedMatchesAdapter.getCompletedMatchList().get(viewHolder.getAdapterPosition()).get_id());
            UserManager.INSTANCE.saveContestClick(2);
            try {
                myCompletedMatchesAdapter.getCompletedMatchList().get(viewHolder.getAdapterPosition()).getTeam2().getCode();
                myCompletedMatchesAdapter.getCompletedMatchList().get(viewHolder.getAdapterPosition()).getTeam1().getCode();
                Intent intent = new Intent(new Intent(viewHolder.context, DetailActivity.class));
                intent.putExtra("open", "my_match_detail");
                intent.putExtra("matchId", myCompletedMatchesAdapter.getCompletedMatchList().get(viewHolder.getAdapterPosition()).get_id());
                Context context2 = viewHolder.context;
                if (context2 != null) {
                    context2.startActivity(intent);
                }
            } catch (Exception e) {
                Log.e("ADAPTERR", e.toString());
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
