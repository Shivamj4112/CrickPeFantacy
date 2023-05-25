package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterWinnersListBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.contest_winners.models.model.WinnersList;
import com.crickpe.view.intro.fragments.User;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001%B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00062\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001cH\u0016J\u001c\u0010\u001e\u001a\u00020\u00182\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u001cH\u0016J\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001cH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006&"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WinnerListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/WinnerListAdapter$ViewHolder;", "context", "Landroid/content/Context;", "isWonShow", "", "(Landroid/content/Context;Z)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "()Z", "setWonShow", "(Z)V", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/WinnersList;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "list", "getCount", "", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WinnerListAdapter.kt */
public final class WinnerListAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private boolean isWonShow;
    private ArrayList<WinnersList> playersList = new ArrayList<>();

    public final Context getContext() {
        return this.context;
    }

    public final boolean isWonShow() {
        return this.isWonShow;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setWonShow(boolean z) {
        this.isWonShow = z;
    }

    public WinnerListAdapter(Context context2, boolean z) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
        this.isWonShow = z;
    }

    public final ArrayList<WinnersList> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<WinnersList> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_winners_list, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterWinnersListBinding) inflate);
    }

    public int getItemCount() {
        return getCount();
    }

    private final int getCount() {
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        try {
            WinnersList winnersList = this.playersList.get(i);
            Intrinsics.checkNotNullExpressionValue(winnersList, "playersList[position]");
            viewHolder.onBind(winnersList);
            if (this.isWonShow) {
                TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvWon);
                Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvWon");
                CommonMethodsKt.visible(textView);
            } else {
                TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvWon);
                Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvWon");
                CommonMethodsKt.hide(textView2);
            }
            if (((int) this.playersList.get(i).getAmount()) > 0) {
                LinearLayout linearLayout = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llPrice);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.llPrice");
                CommonMethodsKt.visible(linearLayout);
                LinearLayout linearLayout2 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llDuck);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "holder.itemView.llDuck");
                CommonMethodsKt.hide(linearLayout2);
            } else {
                LinearLayout linearLayout3 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llPrice);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "holder.itemView.llPrice");
                CommonMethodsKt.hide(linearLayout3);
                LinearLayout linearLayout4 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llDuck);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "holder.itemView.llDuck");
                CommonMethodsKt.visible(linearLayout4);
            }
            if (this.playersList.get(i).getUserType() == 1) {
                User userProfile = UserManager.INSTANCE.getUserProfile();
                if (Intrinsics.areEqual((Object) userProfile != null ? userProfile.get_id() : null, (Object) this.playersList.get(i).getUserInfo().get_id())) {
                    DrawableCompat.setTint(((LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlMain)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.green_light_xx));
                    LinearLayout linearLayout5 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlMain);
                } else {
                    DrawableCompat.setTint(((LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlMain)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.white));
                }
                if (this.isWonShow) {
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPoints)).setVisibility(4);
                } else {
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPoints)).setVisibility(0);
                }
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setVisibility(0);
            } else {
                DrawableCompat.setTint(((LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlMain)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.app_color_one));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPoints)).setVisibility(4);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setVisibility(8);
            }
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPoints)).setText(String.valueOf(this.playersList.get(i).getTotalFantasyPoint()));
        } catch (Exception e) {
            Log.v("WinnnerListError", e.toString());
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/WinnerListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterWinnersListBinding;", "(Lcom/crickpe/view/detail/adapters/WinnerListAdapter;Lcom/crickpe/databinding/AdapterWinnersListBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/WinnersList;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WinnerListAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterWinnersListBinding binding;
        private final Context context;
        final /* synthetic */ WinnerListAdapter this$0;

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3483_init_$lambda0(View view) {
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(WinnerListAdapter winnerListAdapter, AdapterWinnersListBinding adapterWinnersListBinding) {
            super(adapterWinnersListBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterWinnersListBinding, "binding");
            this.this$0 = winnerListAdapter;
            this.binding = adapterWinnersListBinding;
            this.context = adapterWinnersListBinding.getRoot().getContext();
            adapterWinnersListBinding.getRoot().setOnClickListener(new WinnerListAdapter$ViewHolder$$ExternalSyntheticLambda0());
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(WinnersList winnersList) {
            Intrinsics.checkNotNullParameter(winnersList, "players");
            this.binding.setModel(winnersList);
        }
    }

    public final void addList(boolean z, ArrayList<WinnersList> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.playersList.clear();
        }
        this.playersList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
