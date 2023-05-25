package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterPlayersStatsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStat;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.gson.Gson;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u0011\u001a\u00020\u00122\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0015H\u0016J\u001c\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0016R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0005¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/PlayerStatsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/PlayerStatsAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "batterScoreList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerStat;", "Lkotlin/collections/ArrayList;", "getBatterScoreList", "()Ljava/util/ArrayList;", "setBatterScoreList", "(Ljava/util/ArrayList;)V", "getContext", "()Landroid/content/Context;", "setContext", "addList", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayerStatsAdapter.kt */
public final class PlayerStatsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<PlayerStat> batterScoreList = new ArrayList<>();
    private Context context;

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public PlayerStatsAdapter(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public final ArrayList<PlayerStat> getBatterScoreList() {
        return this.batterScoreList;
    }

    public final void setBatterScoreList(ArrayList<PlayerStat> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.batterScoreList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_players_stats, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterPlayersStatsBinding) inflate);
    }

    public int getItemCount() {
        return this.batterScoreList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        PlayerStat playerStat = this.batterScoreList.get(i);
        Intrinsics.checkNotNullExpressionValue(playerStat, "batterScoreList[position]");
        viewHolder.onBind(playerStat);
        try {
            RequestManager with = Glide.with(this.context);
            StringBuilder sb = new StringBuilder();
            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
            String str = null;
            sb.append(appSettings != null ? appSettings.getImageBaseUrl() : null);
            sb.append(this.batterScoreList.get(i).getMatch().getTeam1().getTeamIconUrl());
            with.load(sb.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.flag_placeholder)).into((ImageView) (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeam1Flag));
            RequestManager with2 = Glide.with(this.context);
            StringBuilder sb2 = new StringBuilder();
            SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
            if (appSettings2 != null) {
                str = appSettings2.getImageBaseUrl();
            }
            sb2.append(str);
            sb2.append(this.batterScoreList.get(i).getMatch().getTeam2().getTeamIconUrl());
            with2.load(sb2.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.flag_placeholder)).into((ImageView) (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeam2Flag));
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvDate)).setText(CommonMethodsKt.getDateString(this.batterScoreList.get(i).getMatch().getStartAtIST()));
        } catch (Exception e) {
            Log.v("STATsAdapter", e.toString());
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/PlayerStatsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterPlayersStatsBinding;", "(Lcom/crickpe/view/detail/adapters/PlayerStatsAdapter;Lcom/crickpe/databinding/AdapterPlayersStatsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "list", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerStat;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayerStatsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterPlayersStatsBinding binding;
        private final Context context;
        final /* synthetic */ PlayerStatsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(PlayerStatsAdapter playerStatsAdapter, AdapterPlayersStatsBinding adapterPlayersStatsBinding) {
            super(adapterPlayersStatsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterPlayersStatsBinding, "binding");
            this.this$0 = playerStatsAdapter;
            this.binding = adapterPlayersStatsBinding;
            this.context = adapterPlayersStatsBinding.getRoot().getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(PlayerStat playerStat) {
            Intrinsics.checkNotNullParameter(playerStat, "list");
            this.binding.setModel(playerStat);
        }
    }

    public final void addList(ArrayList<PlayerStat> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        Log.v("battingOrders", new Gson().toJson((Object) arrayList));
        this.batterScoreList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
