package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterPlayersPotBinding;
import com.crickpe.view.detail.fragments.my_matches_detail.Players;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0016\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u00020\u00122\n\u0010\u0019\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0017H\u0016J\u001c\u0010\u001b\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/PlayersPotAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/PlayersPotAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Players;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "players", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersPotAdapter.kt */
public final class PlayersPotAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private ArrayList<Players> playersList = new ArrayList<>();

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public PlayersPotAdapter(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.context = fragmentActivity;
    }

    public final ArrayList<Players> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<Players> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_players_pot, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterPlayersPotBinding) inflate);
    }

    public int getItemCount() {
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Players players = this.playersList.get(i);
        Intrinsics.checkNotNullExpressionValue(players, "playersList[position]");
        viewHolder.onBind(players);
        try {
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.battingStyle)).setText(Intrinsics.areEqual((Object) this.playersList.get(i).getBatting_style(), (Object) "left_hand") ? "LHB" : "RHB");
            int roleId = this.playersList.get(i).getRole().getRoleId();
            if (roleId == 1) {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_bat);
            } else if (roleId == 2) {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_ball);
            } else if (roleId != 3) {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_bat_ball);
            } else {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_wicket);
            }
        } catch (Exception e) {
            Log.v("Exception", e.toString());
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/PlayersPotAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterPlayersPotBinding;", "(Lcom/crickpe/view/detail/adapters/PlayersPotAdapter;Lcom/crickpe/databinding/AdapterPlayersPotBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Players;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersPotAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterPlayersPotBinding binding;
        private final Context context;
        final /* synthetic */ PlayersPotAdapter this$0;

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3463_init_$lambda0(View view) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(PlayersPotAdapter playersPotAdapter, AdapterPlayersPotBinding adapterPlayersPotBinding) {
            super(adapterPlayersPotBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterPlayersPotBinding, "binding");
            this.this$0 = playersPotAdapter;
            this.binding = adapterPlayersPotBinding;
            this.context = adapterPlayersPotBinding.getRoot().getContext();
            adapterPlayersPotBinding.getRoot().setOnClickListener(new PlayersPotAdapter$ViewHolder$$ExternalSyntheticLambda0());
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(Players players) {
            Intrinsics.checkNotNullParameter(players, "players");
            this.binding.setModel(players);
        }
    }

    public final void addList(boolean z, ArrayList<Players> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "players");
        if (z) {
            this.playersList.clear();
        }
        this.playersList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
