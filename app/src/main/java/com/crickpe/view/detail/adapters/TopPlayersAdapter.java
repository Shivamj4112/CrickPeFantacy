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
import com.crickpe.databinding.AdapterTopPlayersBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Role;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.Teams;
import com.crickpe.view.detail.fragments.top_players.models.PlayerInfo;
import com.crickpe.view.detail.fragments.top_players.models.Result;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001&B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u00142\n\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0019H\u0016J\u001c\u0010\u001d\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0019H\u0016J\u001e\u0010!\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005R*\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fj\b\u0012\u0004\u0012\u00020\r`\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006'"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/TopPlayersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/TopPlayersAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "adapter", "Lcom/crickpe/view/detail/adapters/FlagListAdapter;", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/top_players/models/Result;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "players", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAdapter", "Landroid/view/View;", "teams", "", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Teams;", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopPlayersAdapter.kt */
public final class TopPlayersAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FlagListAdapter adapter;
    private FragmentActivity context;
    private ArrayList<Result> playersList = new ArrayList<>();

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public TopPlayersAdapter(FragmentActivity fragmentActivity) {
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
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_top_players, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterTopPlayersBinding) inflate);
    }

    public int getItemCount() {
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String str;
        Role role;
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Result result = this.playersList.get(i);
        Intrinsics.checkNotNullExpressionValue(result, "playersList[position]");
        viewHolder.onBind(result);
        PlayerInfo playerInfo = this.playersList.get(i).getPlayerInfo();
        String str2 = null;
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setText(CommonMethodsKt.printInitials(String.valueOf(playerInfo != null ? playerInfo.getName() : null)));
        CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivPlayer);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivPlayer");
        ImageView imageView = circleImageView;
        PlayerInfo playerInfo2 = this.playersList.get(i).getPlayerInfo();
        if (playerInfo2 == null || (str = playerInfo2.getImageUrl()) == null) {
            str = "";
        }
        ExtensionsKt.loadImage$default(imageView, str, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
        PlayerInfo playerInfo3 = this.playersList.get(i).getPlayerInfo();
        Integer valueOf = (playerInfo3 == null || (role = playerInfo3.getRole()) == null) ? null : Integer.valueOf(role.getRoleId());
        if (valueOf != null && valueOf.intValue() == 1) {
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_bat);
        } else if (valueOf != null && valueOf.intValue() == 2) {
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_ball);
        } else if (valueOf != null && valueOf.intValue() == 3) {
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_wicket);
        } else {
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_bat_ball);
        }
        if (i == 0 || i == 1 || i == 2) {
            ImageView imageView2 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCrown);
            Intrinsics.checkNotNullExpressionValue(imageView2, "holder.itemView.ivCrown");
            CommonMethodsKt.visible(imageView2);
        } else {
            ImageView imageView3 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCrown);
            Intrinsics.checkNotNullExpressionValue(imageView3, "holder.itemView.ivCrown");
            CommonMethodsKt.hide(imageView3);
        }
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setText(String.valueOf(i + 1));
        View view = viewHolder.itemView;
        Intrinsics.checkNotNullExpressionValue(view, "holder.itemView");
        setAdapter(view, this.playersList.get(i).getTeams());
        try {
            if (this.playersList.get(i).getTotalAmount() <= 0.99d) {
                TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTotalAmountt);
                Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvTotalAmountt");
                CommonMethodsKt.hide(textView);
            } else {
                TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTotalAmountt);
                Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvTotalAmountt");
                CommonMethodsKt.visible(textView2);
            }
            TextView textView3 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTotalAmountt);
            Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.tvTotalAmountt");
            CommonMethodsKt.setNumberWithoutDec(textView3, this.playersList.get(i).getTotalAmount());
            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
            if (appSettings != null) {
                str2 = appSettings.isActiveTopPlayerSorting();
            }
            if (Intrinsics.areEqual((Object) String.valueOf(str2), (Object) "iccRanking")) {
                LinearLayout linearLayout = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llEarnings);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.llEarnings");
                CommonMethodsKt.hide(linearLayout);
                return;
            }
            LinearLayout linearLayout2 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llEarnings);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "holder.itemView.llEarnings");
            CommonMethodsKt.visible(linearLayout2);
        } catch (Exception e) {
            Log.v("EXC_WInnerAda", e.toString());
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/TopPlayersAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterTopPlayersBinding;", "(Lcom/crickpe/view/detail/adapters/TopPlayersAdapter;Lcom/crickpe/databinding/AdapterTopPlayersBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/detail/fragments/top_players/models/Result;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopPlayersAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterTopPlayersBinding binding;
        private final Context context;
        final /* synthetic */ TopPlayersAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(TopPlayersAdapter topPlayersAdapter, AdapterTopPlayersBinding adapterTopPlayersBinding) {
            super(adapterTopPlayersBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterTopPlayersBinding, "binding");
            this.this$0 = topPlayersAdapter;
            this.binding = adapterTopPlayersBinding;
            this.context = adapterTopPlayersBinding.getRoot().getContext();
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

    private final void setAdapter(View view, List<Teams> list) {
        this.adapter = new FlagListAdapter(this.context);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(C1188R.C1192id.rvFlags);
        FlagListAdapter flagListAdapter = null;
        if (recyclerView != null) {
            FlagListAdapter flagListAdapter2 = this.adapter;
            if (flagListAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                flagListAdapter2 = null;
            }
            recyclerView.setAdapter(flagListAdapter2);
        }
        FlagListAdapter flagListAdapter3 = this.adapter;
        if (flagListAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            flagListAdapter = flagListAdapter3;
        }
        flagListAdapter.addList(true, list);
    }
}
