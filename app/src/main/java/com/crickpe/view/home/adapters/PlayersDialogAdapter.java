package com.crickpe.view.home.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.view.intro.fragments.kyc.models.TeamCountryData;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000245B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ&\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bJ\b\u0010,\u001a\u00020\bH\u0016J\u001c\u0010-\u001a\u00020(2\n\u0010.\u001a\u00060\u0002R\u00020\u00002\u0006\u0010/\u001a\u00020\bH\u0016J\u001c\u00100\u001a\u00060\u0002R\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\bH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u001a0\u0019j\b\u0012\u0004\u0012\u00020\u001a`\u001bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#¨\u00066"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/PlayersDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$OnItemClicked;", "context", "Landroid/content/Context;", "preselection", "", "(Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$OnItemClicked;Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getOnItemClicked", "()Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$OnItemClicked;)V", "playerId", "", "getPlayerId", "()Ljava/lang/String;", "setPlayerId", "(Ljava/lang/String;)V", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "getPreselection", "()I", "setPreselection", "(I)V", "selectedPosition", "getSelectedPosition", "setSelectedPosition", "addList", "", "firstPage", "", "list", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayersDialogAdapter.kt */
public final class PlayersDialogAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private OnItemClicked onItemClicked;
    private String playerId = "";
    private ArrayList<TeamCountryData> playersList = new ArrayList<>();
    private int preselection;
    private int selectedPosition = this.preselection;

    @Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$OnItemClicked;", "", "onItemClicked", "", "teamCountryData", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "position", "", "s", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersDialogAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(TeamCountryData teamCountryData, int i, String str);
    }

    public final Context getContext() {
        return this.context;
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final int getPreselection() {
        return this.preselection;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public final void setPreselection(int i) {
        this.preselection = i;
    }

    public PlayersDialogAdapter(OnItemClicked onItemClicked2, Context context2, int i) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.onItemClicked = onItemClicked2;
        this.context = context2;
        this.preselection = i;
    }

    public final ArrayList<TeamCountryData> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<TeamCountryData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition(int i) {
        this.selectedPosition = i;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final void setPlayerId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.playerId = str;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new ViewHolder(this, CommonMethodsKt.inflate(viewGroup, C1188R.C1193layout.adapter_dialog_home));
    }

    public int getItemCount() {
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        TeamCountryData teamCountryData = this.playersList.get(i);
        Intrinsics.checkNotNullExpressionValue(teamCountryData, "playersList[position]");
        viewHolder.onBind(teamCountryData);
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTitle)).setText(this.playersList.get(i).getName());
        CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivFlag);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivFlag");
        ImageView imageView = circleImageView;
        String imageUrl = this.playersList.get(i).getImageUrl();
        if (imageUrl == null) {
            imageUrl = "";
        }
        ExtensionsKt.loadImage$default(imageView, imageUrl, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
        if (this.selectedPosition == i) {
            viewHolder.itemView.setSelected(true);
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_selected_check));
        } else {
            viewHolder.itemView.setSelected(false);
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_unselected_check));
        }
        viewHolder.itemView.setOnClickListener(new PlayersDialogAdapter$$ExternalSyntheticLambda0(this, viewHolder, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m3690onBindViewHolder$lambda0(PlayersDialogAdapter playersDialogAdapter, ViewHolder viewHolder, int i, View view) {
        Intrinsics.checkNotNullParameter(playersDialogAdapter, "this$0");
        Intrinsics.checkNotNullParameter(viewHolder, "$holder");
        int i2 = playersDialogAdapter.selectedPosition;
        if (i2 >= 0) {
            playersDialogAdapter.notifyItemChanged(i2);
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        playersDialogAdapter.selectedPosition = adapterPosition;
        playersDialogAdapter.notifyItemChanged(adapterPosition);
        OnItemClicked onItemClicked2 = playersDialogAdapter.onItemClicked;
        TeamCountryData teamCountryData = playersDialogAdapter.playersList.get(i);
        Intrinsics.checkNotNullExpressionValue(teamCountryData, "playersList[position]");
        onItemClicked2.onItemClicked(teamCountryData, i, "adapter");
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/PlayersDialogAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crickpe/view/home/adapters/PlayersDialogAdapter;Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "teamCountryData", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PlayersDialogAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        final /* synthetic */ PlayersDialogAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(PlayersDialogAdapter playersDialogAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = playersDialogAdapter;
            this.context = view.getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(TeamCountryData teamCountryData) {
            Intrinsics.checkNotNullParameter(teamCountryData, "teamCountryData");
            View view = this.itemView;
        }
    }

    public final void addList(boolean z, ArrayList<TeamCountryData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.playersList.clear();
        }
        this.playersList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
