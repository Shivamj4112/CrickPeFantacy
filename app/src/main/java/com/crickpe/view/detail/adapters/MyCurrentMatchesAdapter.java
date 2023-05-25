package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterCurrentMatchesBinding;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J*\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00122\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyCurrentMatchesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/MyCurrentMatchesAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "myMatchesModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "Lkotlin/collections/ArrayList;", "getMyMatchesModels", "()Ljava/util/ArrayList;", "setMyMatchesModels", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyCurrentMatchesAdapter.kt */
public final class MyCurrentMatchesAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private ArrayList<MyMatchesModel> myMatchesModels = new ArrayList<>();

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public MyCurrentMatchesAdapter(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
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
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_current_matches, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterCurrentMatchesBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyCurrentMatchesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterCurrentMatchesBinding;", "(Lcom/crickpe/view/detail/adapters/MyCurrentMatchesAdapter;Lcom/crickpe/databinding/AdapterCurrentMatchesBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "upcmingMatchModel", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyCurrentMatchesAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterCurrentMatchesBinding binding;
        private final Context context;
        final /* synthetic */ MyCurrentMatchesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MyCurrentMatchesAdapter myCurrentMatchesAdapter, AdapterCurrentMatchesBinding adapterCurrentMatchesBinding) {
            super(adapterCurrentMatchesBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterCurrentMatchesBinding, "binding");
            this.this$0 = myCurrentMatchesAdapter;
            this.binding = adapterCurrentMatchesBinding;
            this.context = adapterCurrentMatchesBinding.getRoot().getContext();
            adapterCurrentMatchesBinding.getRoot().setOnClickListener(new MyCurrentMatchesAdapter$ViewHolder$$ExternalSyntheticLambda0(myCurrentMatchesAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3460_init_$lambda0(MyCurrentMatchesAdapter myCurrentMatchesAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(myCurrentMatchesAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            UserManager.INSTANCE.saveMatchId(myCurrentMatchesAdapter.getMyMatchesModels().get(viewHolder.getAdapterPosition()).get_id());
            UserManager.INSTANCE.saveContestClick(0);
            Intent intent = new Intent(new Intent(viewHolder.context, DetailActivity.class));
            intent.putExtra("open", "my_match_detail");
            Context context2 = viewHolder.context;
            if (context2 != null) {
                context2.startActivity(intent);
            }
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
        try {
            if (!this.myMatchesModels.get(i).getLivescoresInfo().getInnings().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.myMatchesModels.get(i).getLivescoresInfo().getInnings().get(0).getRuns());
                sb.append('/');
                sb.append(this.myMatchesModels.get(i).getLivescoresInfo().getInnings().get(0).getWickets());
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvScoreT1)).setText(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.myMatchesModels.get(i).getLivescoresInfo().getInnings().get(1).getRuns());
                sb2.append('/');
                sb2.append(this.myMatchesModels.get(i).getLivescoresInfo().getInnings().get(1).getWickets());
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvScoreT2)).setText(sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                sb3.append('(');
                sb3.append(this.myMatchesModels.get(i).getLivescoresInfo().getInnings().get(0).getOvers());
                sb3.append(')');
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvOverT1)).setText(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append('(');
                sb4.append(this.myMatchesModels.get(i).getLivescoresInfo().getInnings().get(1).getOvers());
                sb4.append(')');
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvOverT2)).setText(sb4.toString());
            }
        } catch (Exception e) {
            Log.v("MyCurrentMatchAdapter", e.toString());
        }
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
