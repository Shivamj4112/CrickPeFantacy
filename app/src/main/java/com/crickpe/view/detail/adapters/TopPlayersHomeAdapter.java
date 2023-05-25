package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterTopPlayersHomePageBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.top_players.models.PlayerInfo;
import com.crickpe.view.detail.fragments.top_players.models.Result;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00122\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/TopPlayersHomeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/TopPlayersHomeAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/top_players/models/Result;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "players", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopPlayersHomeAdapter.kt */
public final class TopPlayersHomeAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private ArrayList<Result> playersList = new ArrayList<>();

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public TopPlayersHomeAdapter(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.context = fragmentActivity;
    }

    public final ArrayList<Result> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<Result> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_top_players_home_page, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        AdapterTopPlayersHomePageBinding adapterTopPlayersHomePageBinding = (AdapterTopPlayersHomePageBinding) inflate;
        adapterTopPlayersHomePageBinding.getRoot().setLayoutParams(new ViewGroup.LayoutParams((int) (((double) ExtensionsKt.getWidth(this.context)) * 0.7d), -2));
        return new ViewHolder(this, adapterTopPlayersHomePageBinding);
    }

    public int getItemCount() {
        if (this.playersList.size() > 9) {
            return 9;
        }
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        try {
            Result result = this.playersList.get(i);
            Intrinsics.checkNotNullExpressionValue(result, "playersList[position]");
            viewHolder.onBind(result);
            int i2 = i + 1;
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRankT)).setText(String.valueOf(i2));
            PlayerInfo playerInfo = this.playersList.get(i).getPlayerInfo();
            String str = null;
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setText(CommonMethodsKt.printInitials(String.valueOf(playerInfo != null ? playerInfo.getName() : null)));
            if (this.playersList.get(i).getTotalAmount() <= 0.0d) {
                LinearLayout linearLayout = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llTotalAmount);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.llTotalAmount");
                CommonMethodsKt.hide(linearLayout);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llTotalAmount);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "holder.itemView.llTotalAmount");
                CommonMethodsKt.visible(linearLayout2);
            }
            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
            if (appSettings != null) {
                str = appSettings.isActiveTopPlayerSorting();
            }
            if (Intrinsics.areEqual((Object) String.valueOf(str), (Object) "iccRanking")) {
                LinearLayout linearLayout3 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llTotalAmount);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "holder.itemView.llTotalAmount");
                CommonMethodsKt.hide(linearLayout3);
            } else {
                LinearLayout linearLayout4 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llTotalAmount);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "holder.itemView.llTotalAmount");
                CommonMethodsKt.visible(linearLayout4);
            }
            TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTotalAmount);
            Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvTotalAmount");
            CommonMethodsKt.setNumberWithoutDec(textView, this.playersList.get(i).getTotalAmount());
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRank)).setText(String.valueOf(i2));
            CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivFlag);
            Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivFlag");
            ImageView imageView = circleImageView;
            String teamIconUrl = this.playersList.get(i).getTeams().get(0).getTeamIconUrl();
            if (teamIconUrl == null) {
                teamIconUrl = "";
            }
            ExtensionsKt.loadImage$default(imageView, teamIconUrl, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
        } catch (Exception e) {
            Log.v("TOP_PLAYERR", e.toString());
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/TopPlayersHomeAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterTopPlayersHomePageBinding;", "(Lcom/crickpe/view/detail/adapters/TopPlayersHomeAdapter;Lcom/crickpe/databinding/AdapterTopPlayersHomePageBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/detail/fragments/top_players/models/Result;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopPlayersHomeAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterTopPlayersHomePageBinding binding;
        private final Context context;
        final /* synthetic */ TopPlayersHomeAdapter this$0;

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3473_init_$lambda0(View view) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(TopPlayersHomeAdapter topPlayersHomeAdapter, AdapterTopPlayersHomePageBinding adapterTopPlayersHomePageBinding) {
            super(adapterTopPlayersHomePageBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterTopPlayersHomePageBinding, "binding");
            this.this$0 = topPlayersHomeAdapter;
            this.binding = adapterTopPlayersHomePageBinding;
            this.context = adapterTopPlayersHomePageBinding.getRoot().getContext();
            adapterTopPlayersHomePageBinding.getRoot().setOnClickListener(new TopPlayersHomeAdapter$ViewHolder$$ExternalSyntheticLambda0());
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(Result result) {
            Intrinsics.checkNotNullParameter(result, "players");
            this.binding.setModel(result);
        }
    }

    public final void addList(boolean z, ArrayList<Result> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "players");
        if (z) {
            this.playersList.clear();
        }
        this.playersList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
