package com.crickpe.view.home.adapters;

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
import com.crickpe.databinding.AdapterMyTeamsBinding;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0003+,-B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\b\u0010\"\u001a\u00020#H\u0016J\u001c\u0010$\u001a\u00020\u001e2\n\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020#H\u0016J\u001c\u0010'\u001a\u00060\u0002R\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020#H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006."}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/MyTeamsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/MyTeamsAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnItemClicked;", "onTeamUpdate", "Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnUpdate;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnItemClicked;Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnUpdate;Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "getOnItemClicked", "()Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnItemClicked;)V", "getOnTeamUpdate", "()Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnUpdate;", "setOnTeamUpdate", "(Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnUpdate;)V", "topContestModel", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "getTopContestModel", "()Ljava/util/ArrayList;", "setTopContestModel", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "OnUpdate", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyTeamsAdapter.kt */
public final class MyTeamsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private OnItemClicked onItemClicked;
    private OnUpdate onTeamUpdate;
    private ArrayList<FantasyTeamListModel> topContestModel = new ArrayList<>();

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnItemClicked;", "", "onItemClicked", "", "fa", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyTeamsAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(FantasyTeamListModel fantasyTeamListModel);
    }

    @Metadata(mo48221d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/MyTeamsAdapter$OnUpdate;", "", "onTeamUpate", "", "fa", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "action", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyTeamsAdapter.kt */
    public interface OnUpdate {
        void onTeamUpate(FantasyTeamListModel fantasyTeamListModel, int i);
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public final OnUpdate getOnTeamUpdate() {
        return this.onTeamUpdate;
    }

    public final void setOnTeamUpdate(OnUpdate onUpdate) {
        Intrinsics.checkNotNullParameter(onUpdate, "<set-?>");
        this.onTeamUpdate = onUpdate;
    }

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public MyTeamsAdapter(OnItemClicked onItemClicked2, OnUpdate onUpdate, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(onUpdate, "onTeamUpdate");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = onItemClicked2;
        this.onTeamUpdate = onUpdate;
        this.context = fragmentActivity;
    }

    public final ArrayList<FantasyTeamListModel> getTopContestModel() {
        return this.topContestModel;
    }

    public final void setTopContestModel(ArrayList<FantasyTeamListModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.topContestModel = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_my_teams, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterMyTeamsBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/MyTeamsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterMyTeamsBinding;", "(Lcom/crickpe/view/home/adapters/MyTeamsAdapter;Lcom/crickpe/databinding/AdapterMyTeamsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyTeamsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterMyTeamsBinding binding;
        private final Context context;
        final /* synthetic */ MyTeamsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MyTeamsAdapter myTeamsAdapter, AdapterMyTeamsBinding adapterMyTeamsBinding) {
            super(adapterMyTeamsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterMyTeamsBinding, "binding");
            this.this$0 = myTeamsAdapter;
            this.binding = adapterMyTeamsBinding;
            this.context = adapterMyTeamsBinding.getRoot().getContext();
            adapterMyTeamsBinding.cvMyTeams.setOnClickListener(new MyTeamsAdapter$ViewHolder$$ExternalSyntheticLambda0(myTeamsAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3687_init_$lambda0(MyTeamsAdapter myTeamsAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(myTeamsAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            OnItemClicked onItemClicked = myTeamsAdapter.getOnItemClicked();
            FantasyTeamListModel fantasyTeamListModel = myTeamsAdapter.getTopContestModel().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "topContestModel[position]");
            onItemClicked.onItemClicked(fantasyTeamListModel);
        }

        public final void onBind(FantasyTeamListModel fantasyTeamListModel) {
            Intrinsics.checkNotNullParameter(fantasyTeamListModel, "topContestMode");
            this.binding.setModel(fantasyTeamListModel);
        }
    }

    public int getItemCount() {
        return this.topContestModel.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        FantasyTeamListModel fantasyTeamListModel = this.topContestModel.get(i);
        Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "topContestModel[position]");
        viewHolder.onBind(fantasyTeamListModel);
        int size = this.topContestModel.get(i).getPlayers().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.topContestModel.get(i).getPlayers().get(i2).isFantasyCaptain()) {
                ImageView imageView = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.playerImageOne);
                Intrinsics.checkNotNullExpressionValue(imageView, "holder.itemView.playerImageOne");
                String imageUrl = this.topContestModel.get(i).getPlayers().get(i2).getImageUrl();
                if (imageUrl == null) {
                    str2 = "";
                } else {
                    str2 = imageUrl;
                }
                ExtensionsKt.loadImage$default(imageView, str2, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptainName)).setText(this.topContestModel.get(i).getPlayers().get(i2).getName().toString());
            }
            if (this.topContestModel.get(i).getPlayers().get(i2).isFantasyViceCaptain()) {
                ImageView imageView2 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.playerImageTwo);
                Intrinsics.checkNotNullExpressionValue(imageView2, "holder.itemView.playerImageTwo");
                String imageUrl2 = this.topContestModel.get(i).getPlayers().get(i2).getImageUrl();
                if (imageUrl2 == null) {
                    str = "";
                } else {
                    str = imageUrl2;
                }
                ExtensionsKt.loadImage$default(imageView2, str, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvVCaptainName)).setText(this.topContestModel.get(i).getPlayers().get(i2).getName().toString());
            }
        }
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPoints)).setText(String.valueOf(this.topContestModel.get(i).getTotalFantasyPoints()));
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeamSequence)).setText("Team " + this.topContestModel.get(i).getSequence());
        try {
            int size2 = this.topContestModel.get(i).getPlayers().size();
            int i3 = 1;
            int i4 = 1;
            int i5 = 1;
            int i6 = 1;
            for (int i7 = 0; i7 < size2; i7++) {
                int roleId = this.topContestModel.get(i).getPlayers().get(i7).getRole().getRoleId();
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
        } catch (Exception unused) {
            Log.v("ERROR_", "playersCountArr");
        }
        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.tvEditTeam)).setOnClickListener(new MyTeamsAdapter$$ExternalSyntheticLambda0(this, i));
        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivCopyTeam)).setOnClickListener(new MyTeamsAdapter$$ExternalSyntheticLambda1(this, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m3685onBindViewHolder$lambda0(MyTeamsAdapter myTeamsAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(myTeamsAdapter, "this$0");
        OnUpdate onUpdate = myTeamsAdapter.onTeamUpdate;
        FantasyTeamListModel fantasyTeamListModel = myTeamsAdapter.topContestModel.get(i);
        Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "topContestModel[position]");
        onUpdate.onTeamUpate(fantasyTeamListModel, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-1  reason: not valid java name */
    public static final void m3686onBindViewHolder$lambda1(MyTeamsAdapter myTeamsAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(myTeamsAdapter, "this$0");
        OnUpdate onUpdate = myTeamsAdapter.onTeamUpdate;
        FantasyTeamListModel fantasyTeamListModel = myTeamsAdapter.topContestModel.get(i);
        Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "topContestModel[position]");
        onUpdate.onTeamUpate(fantasyTeamListModel, 1);
    }

    public final void addList(boolean z, ArrayList<FantasyTeamListModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.topContestModel.clear();
        }
        this.topContestModel.addAll(arrayList);
        notifyDataSetChanged();
    }
}
