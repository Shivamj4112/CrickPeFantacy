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
import com.crickpe.databinding.AdapterContestTeamsBinding;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003&'(B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u001a\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\n\u0012\u0004\u0012\u00020\u000e\u0018\u0001`\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u001eH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006)"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/ContestTeamAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnItemClicked;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnItemClicked;Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "fantasyTeamListModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "Lkotlin/collections/ArrayList;", "getFantasyTeamListModels", "()Ljava/util/ArrayList;", "setFantasyTeamListModels", "(Ljava/util/ArrayList;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnItemClicked;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnClick", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestTeamAdapter.kt */
public final class ContestTeamAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private ArrayList<FantasyTeamListModel> fantasyTeamListModels = new ArrayList<>();
    private OnItemClicked onItemClicked;

    @Metadata(mo48221d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnClick;", "", "onTeamClick", "", "FantasyTeamListModel", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "position", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestTeamAdapter.kt */
    public interface OnClick {
        void onTeamClick(FantasyTeamListModel fantasyTeamListModel, int i);
    }

    @Metadata(mo48221d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$OnItemClicked;", "", "onItemClicked", "", "fa", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "adapterPosition", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestTeamAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(FantasyTeamListModel fantasyTeamListModel, int i);
    }

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public ContestTeamAdapter(OnItemClicked onItemClicked2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = onItemClicked2;
        this.context = fragmentActivity;
    }

    public final ArrayList<FantasyTeamListModel> getFantasyTeamListModels() {
        return this.fantasyTeamListModels;
    }

    public final void setFantasyTeamListModels(ArrayList<FantasyTeamListModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.fantasyTeamListModels = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_contest_teams, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterContestTeamsBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/ContestTeamAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterContestTeamsBinding;", "(Lcom/crickpe/view/detail/adapters/ContestTeamAdapter;Lcom/crickpe/databinding/AdapterContestTeamsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestTeamAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterContestTeamsBinding binding;
        private final Context context;
        final /* synthetic */ ContestTeamAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ContestTeamAdapter contestTeamAdapter, AdapterContestTeamsBinding adapterContestTeamsBinding) {
            super(adapterContestTeamsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterContestTeamsBinding, "binding");
            this.this$0 = contestTeamAdapter;
            this.binding = adapterContestTeamsBinding;
            this.context = adapterContestTeamsBinding.getRoot().getContext();
            adapterContestTeamsBinding.getRoot().setOnClickListener(new ContestTeamAdapter$ViewHolder$$ExternalSyntheticLambda0(contestTeamAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3443_init_$lambda0(ContestTeamAdapter contestTeamAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(contestTeamAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            try {
                OnItemClicked onItemClicked = contestTeamAdapter.getOnItemClicked();
                FantasyTeamListModel fantasyTeamListModel = contestTeamAdapter.getFantasyTeamListModels().get(viewHolder.getAdapterPosition());
                Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "fantasyTeamListModels[adapterPosition]");
                onItemClicked.onItemClicked(fantasyTeamListModel, viewHolder.getAdapterPosition());
            } catch (Exception e) {
                Log.v("Exception", e.toString());
            }
        }

        public final void onBind(FantasyTeamListModel fantasyTeamListModel) {
            Intrinsics.checkNotNullParameter(fantasyTeamListModel, "topContestMode");
            this.binding.setModel(fantasyTeamListModel);
        }
    }

    public int getItemCount() {
        return this.fantasyTeamListModels.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        try {
            FantasyTeamListModel fantasyTeamListModel = this.fantasyTeamListModels.get(i);
            Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "fantasyTeamListModels[position]");
            viewHolder.onBind(fantasyTeamListModel);
            int size = this.fantasyTeamListModels.get(i).getPlayers().size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = "";
                if (this.fantasyTeamListModels.get(i).getPlayers().get(i2).isFantasyCaptain()) {
                    ImageView imageView = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.playerImageOne);
                    Intrinsics.checkNotNullExpressionValue(imageView, "holder.itemView.playerImageOne");
                    String imageUrl = this.fantasyTeamListModels.get(i).getPlayers().get(i2).getImageUrl();
                    if (imageUrl == null) {
                        imageUrl = str;
                    }
                    ExtensionsKt.loadImage(imageView, imageUrl, C1188R.C1190drawable.profile_placeholder, true);
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptainName)).setText(this.fantasyTeamListModels.get(i).getPlayers().get(i2).getName().toString());
                }
                if (this.fantasyTeamListModels.get(i).getPlayers().get(i2).isFantasyViceCaptain()) {
                    ImageView imageView2 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.playerImageTwo);
                    Intrinsics.checkNotNullExpressionValue(imageView2, "holder.itemView.playerImageTwo");
                    String imageUrl2 = this.fantasyTeamListModels.get(i).getPlayers().get(i2).getImageUrl();
                    if (imageUrl2 != null) {
                        str = imageUrl2;
                    }
                    ExtensionsKt.loadImage(imageView2, str, C1188R.C1190drawable.profile_placeholder, true);
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvVCaptainName)).setText(this.fantasyTeamListModels.get(i).getPlayers().get(i2).getName().toString());
                }
            }
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPoints)).setText(String.valueOf((int) this.fantasyTeamListModels.get(i).getTotalFantasyPoints()));
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeamSequence)).setText("Team " + this.fantasyTeamListModels.get(i).getSequence());
            int size2 = this.fantasyTeamListModels.get(i).getPlayers().size();
            int i3 = 1;
            int i4 = 1;
            int i5 = 1;
            int i6 = 1;
            for (int i7 = 0; i7 < size2; i7++) {
                int roleId = this.fantasyTeamListModels.get(i).getPlayers().get(i7).getRole().getRoleId();
                if (roleId == 1) {
                    int i8 = i3 + 1;
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvBat)).setText(String.valueOf(i3));
                    i3 = i8;
                } else if (roleId == 2) {
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvBowl)).setText(String.valueOf(i4));
                    i4++;
                } else if (roleId == 3) {
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvWk)).setText(String.valueOf(i5));
                    i5++;
                } else if (roleId == 4) {
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAR)).setText(String.valueOf(i6));
                    i6++;
                }
            }
        } catch (Exception e) {
            Log.v("EXCEPTION9", e.toString());
        }
    }

    public final void addList(boolean z, ArrayList<FantasyTeamListModel> arrayList) {
        if (z) {
            this.fantasyTeamListModels.clear();
        }
        ArrayList<FantasyTeamListModel> arrayList2 = this.fantasyTeamListModels;
        Intrinsics.checkNotNull(arrayList);
        arrayList2.addAll(arrayList);
        notifyDataSetChanged();
    }
}
