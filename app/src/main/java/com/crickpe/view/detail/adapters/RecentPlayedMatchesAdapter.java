package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterRecentMatchBinding;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.fragments.settings.models.RecentlyPlayed;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00112\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/RecentPlayedMatchesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/RecentPlayedMatchesAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "upcomingMatchModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/settings/models/RecentlyPlayed;", "getUpcomingMatchModels", "()Ljava/util/ArrayList;", "setUpcomingMatchModels", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RecentPlayedMatchesAdapter.kt */
public final class RecentPlayedMatchesAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private ArrayList<RecentlyPlayed> upcomingMatchModels = new ArrayList<>();

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public RecentPlayedMatchesAdapter(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public final ArrayList<RecentlyPlayed> getUpcomingMatchModels() {
        return this.upcomingMatchModels;
    }

    public final void setUpcomingMatchModels(ArrayList<RecentlyPlayed> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.upcomingMatchModels = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_recent_match, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        AdapterRecentMatchBinding adapterRecentMatchBinding = (AdapterRecentMatchBinding) inflate;
        adapterRecentMatchBinding.getRoot().setLayoutParams(new ViewGroup.LayoutParams((int) (((double) ExtensionsKt.getWidth(this.context)) * 0.47d), -2));
        return new ViewHolder(this, adapterRecentMatchBinding);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/RecentPlayedMatchesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterRecentMatchBinding;", "(Lcom/crickpe/view/detail/adapters/RecentPlayedMatchesAdapter;Lcom/crickpe/databinding/AdapterRecentMatchBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "recentlyPlayed", "Lcom/crickpe/view/detail/fragments/settings/models/RecentlyPlayed;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: RecentPlayedMatchesAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterRecentMatchBinding binding;
        private final Context context;
        final /* synthetic */ RecentPlayedMatchesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(RecentPlayedMatchesAdapter recentPlayedMatchesAdapter, AdapterRecentMatchBinding adapterRecentMatchBinding) {
            super(adapterRecentMatchBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterRecentMatchBinding, "binding");
            this.this$0 = recentPlayedMatchesAdapter;
            this.binding = adapterRecentMatchBinding;
            this.context = adapterRecentMatchBinding.getRoot().getContext();
            adapterRecentMatchBinding.getRoot().setOnClickListener(new RecentPlayedMatchesAdapter$ViewHolder$$ExternalSyntheticLambda0(recentPlayedMatchesAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3466_init_$lambda0(RecentPlayedMatchesAdapter recentPlayedMatchesAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(recentPlayedMatchesAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            UserManager.INSTANCE.saveMatchId(recentPlayedMatchesAdapter.getUpcomingMatchModels().get(viewHolder.getAdapterPosition()).get_id());
            UserManager.INSTANCE.saveContestClick(2);
            Intent intent = new Intent(new Intent(viewHolder.context, DetailActivity.class));
            intent.putExtra("open", "my_match_detail");
            intent.putExtra("matchId", recentPlayedMatchesAdapter.getUpcomingMatchModels().get(viewHolder.getAdapterPosition()).get_id());
            Context context2 = viewHolder.context;
            if (context2 != null) {
                context2.startActivity(intent);
            }
        }

        public final void onBind(RecentlyPlayed recentlyPlayed) {
            Intrinsics.checkNotNullParameter(recentlyPlayed, "recentlyPlayed");
            this.binding.setModel(recentlyPlayed);
        }
    }

    public int getItemCount() {
        return this.upcomingMatchModels.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String str;
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        RecentlyPlayed recentlyPlayed = this.upcomingMatchModels.get(i);
        Intrinsics.checkNotNullExpressionValue(recentlyPlayed, "upcomingMatchModels[position]");
        viewHolder.onBind(recentlyPlayed);
        try {
            CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeam1Flag);
            Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivTeam1Flag");
            ImageView imageView = circleImageView;
            String teamIconUrl = this.upcomingMatchModels.get(i).getTeam1().getTeamIconUrl();
            ExtensionsKt.loadImage$default(imageView, teamIconUrl == null ? "" : teamIconUrl, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
            CircleImageView circleImageView2 = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeam2Flag);
            Intrinsics.checkNotNullExpressionValue(circleImageView2, "holder.itemView.ivTeam2Flag");
            ImageView imageView2 = circleImageView2;
            String teamIconUrl2 = this.upcomingMatchModels.get(i).getTeam2().getTeamIconUrl();
            if (teamIconUrl2 == null) {
                str = "";
            } else {
                str = teamIconUrl2;
            }
            ExtensionsKt.loadImage$default(imageView2, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
        } catch (Exception e) {
            Log.v("RecentMatchAd", e.toString());
        }
    }

    public final void addList(boolean z, List<RecentlyPlayed> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        if (z) {
            this.upcomingMatchModels.clear();
        }
        this.upcomingMatchModels.addAll(list);
        notifyDataSetChanged();
    }
}
