package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterSelectTeamBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000267B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J6\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"2\u0006\u0010,\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\tJ\b\u0010.\u001a\u00020\u0013H\u0016J\u001c\u0010/\u001a\u00020(2\n\u00100\u001a\u00060\u0002R\u00020\u00002\u0006\u00101\u001a\u00020\u0013H\u0016J\u001c\u00102\u001a\u00060\u0002R\u00020\u00002\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0013H\u0016R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00068"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/SelectTeamAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/SelectTeamAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/SelectTeamAdapter$OnItemClicked;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/detail/adapters/SelectTeamAdapter$OnItemClicked;Landroidx/fragment/app/FragmentActivity;)V", "contestType_Id", "", "getContestType_Id", "()Ljava/lang/String;", "setContestType_Id", "(Ljava/lang/String;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "countSelected", "", "getCountSelected", "()I", "setCountSelected", "(I)V", "lastSelectedPosition", "getLastSelectedPosition", "setLastSelectedPosition", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/SelectTeamAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/SelectTeamAdapter$OnItemClicked;)V", "topContestModel", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "Lkotlin/collections/ArrayList;", "getTopContestModel", "()Ljava/util/ArrayList;", "setTopContestModel", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "count", "contestTypeId", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SelectTeamAdapter.kt */
public final class SelectTeamAdapter extends RecyclerView.Adapter<ViewHolder> {
    private String contestType_Id = "";
    private FragmentActivity context;
    private int countSelected;
    private int lastSelectedPosition = -1;
    private OnItemClicked onItemClicked;
    private ArrayList<FantasyTeamListModel> topContestModel = new ArrayList<>();

    @Metadata(mo48221d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/SelectTeamAdapter$OnItemClicked;", "", "onItemClicked", "", "fa", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "onRootClicked", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SelectTeamAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(FantasyTeamListModel fantasyTeamListModel);

        void onRootClicked(FantasyTeamListModel fantasyTeamListModel);
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

    public SelectTeamAdapter(OnItemClicked onItemClicked2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = onItemClicked2;
        this.context = fragmentActivity;
    }

    public final ArrayList<FantasyTeamListModel> getTopContestModel() {
        return this.topContestModel;
    }

    public final void setTopContestModel(ArrayList<FantasyTeamListModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.topContestModel = arrayList;
    }

    public final int getLastSelectedPosition() {
        return this.lastSelectedPosition;
    }

    public final void setLastSelectedPosition(int i) {
        this.lastSelectedPosition = i;
    }

    public final int getCountSelected() {
        return this.countSelected;
    }

    public final void setCountSelected(int i) {
        this.countSelected = i;
    }

    public final String getContestType_Id() {
        return this.contestType_Id;
    }

    public final void setContestType_Id(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.contestType_Id = str;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_select_team, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterSelectTeamBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/SelectTeamAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterSelectTeamBinding;", "(Lcom/crickpe/view/detail/adapters/SelectTeamAdapter;Lcom/crickpe/databinding/AdapterSelectTeamBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SelectTeamAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterSelectTeamBinding binding;
        private final Context context;
        final /* synthetic */ SelectTeamAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(SelectTeamAdapter selectTeamAdapter, AdapterSelectTeamBinding adapterSelectTeamBinding) {
            super(adapterSelectTeamBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterSelectTeamBinding, "binding");
            this.this$0 = selectTeamAdapter;
            this.binding = adapterSelectTeamBinding;
            this.context = adapterSelectTeamBinding.getRoot().getContext();
            if (Intrinsics.areEqual((Object) selectTeamAdapter.getContestType_Id(), (Object) "2")) {
                ImageView imageView = (ImageView) adapterSelectTeamBinding.getRoot().findViewById(C1188R.C1192id.ivTeamSelection);
                Intrinsics.checkNotNullExpressionValue(imageView, "binding.root.ivTeamSelection");
                CommonMethodsKt.visible(imageView);
                RadioButton radioButton = (RadioButton) adapterSelectTeamBinding.getRoot().findViewById(C1188R.C1192id.radioBtn);
                Intrinsics.checkNotNullExpressionValue(radioButton, "binding.root.radioBtn");
                CommonMethodsKt.hide(radioButton);
            } else {
                ImageView imageView2 = (ImageView) adapterSelectTeamBinding.getRoot().findViewById(C1188R.C1192id.ivTeamSelection);
                Intrinsics.checkNotNullExpressionValue(imageView2, "binding.root.ivTeamSelection");
                CommonMethodsKt.hide(imageView2);
                RadioButton radioButton2 = (RadioButton) adapterSelectTeamBinding.getRoot().findViewById(C1188R.C1192id.radioBtn);
                Intrinsics.checkNotNullExpressionValue(radioButton2, "binding.root.radioBtn");
                CommonMethodsKt.visible(radioButton2);
            }
            ((RadioButton) adapterSelectTeamBinding.getRoot().findViewById(C1188R.C1192id.radioBtn)).setOnClickListener(new SelectTeamAdapter$ViewHolder$$ExternalSyntheticLambda0(selectTeamAdapter, this));
            ((ImageView) adapterSelectTeamBinding.getRoot().findViewById(C1188R.C1192id.ivTeamSelection)).setOnClickListener(new SelectTeamAdapter$ViewHolder$$ExternalSyntheticLambda1(selectTeamAdapter, this));
            ((RelativeLayout) adapterSelectTeamBinding.getRoot().findViewById(C1188R.C1192id.rlItemLayout)).setOnClickListener(new SelectTeamAdapter$ViewHolder$$ExternalSyntheticLambda2(selectTeamAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3467_init_$lambda0(SelectTeamAdapter selectTeamAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(selectTeamAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            selectTeamAdapter.setLastSelectedPosition(viewHolder.getAdapterPosition());
            OnItemClicked onItemClicked = selectTeamAdapter.getOnItemClicked();
            FantasyTeamListModel fantasyTeamListModel = selectTeamAdapter.getTopContestModel().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "topContestModel[position]");
            onItemClicked.onItemClicked(fantasyTeamListModel);
            selectTeamAdapter.notifyDataSetChanged();
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-1  reason: not valid java name */
        public static final void m3468_init_$lambda1(SelectTeamAdapter selectTeamAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(selectTeamAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            if (selectTeamAdapter.getTopContestModel().get(viewHolder.getPosition()).isSelected()) {
                selectTeamAdapter.getTopContestModel().get(viewHolder.getPosition()).setSelected(false);
                selectTeamAdapter.setCountSelected(selectTeamAdapter.getCountSelected() - 1);
                OnItemClicked onItemClicked = selectTeamAdapter.getOnItemClicked();
                FantasyTeamListModel fantasyTeamListModel = selectTeamAdapter.getTopContestModel().get(viewHolder.getPosition());
                Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "topContestModel[position]");
                onItemClicked.onItemClicked(fantasyTeamListModel);
                selectTeamAdapter.notifyItemChanged(viewHolder.getAdapterPosition());
            } else if (selectTeamAdapter.getCountSelected() <= 9) {
                selectTeamAdapter.getTopContestModel().get(viewHolder.getPosition()).setSelected(true);
                selectTeamAdapter.setCountSelected(selectTeamAdapter.getCountSelected() + 1);
                OnItemClicked onItemClicked2 = selectTeamAdapter.getOnItemClicked();
                FantasyTeamListModel fantasyTeamListModel2 = selectTeamAdapter.getTopContestModel().get(viewHolder.getPosition());
                Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel2, "topContestModel[position]");
                onItemClicked2.onItemClicked(fantasyTeamListModel2);
                selectTeamAdapter.notifyItemChanged(viewHolder.getAdapterPosition());
            } else {
                Toast.makeText(viewHolder.context, "You can join contest with maximum 10 teams", 0).show();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-2  reason: not valid java name */
        public static final void m3469_init_$lambda2(SelectTeamAdapter selectTeamAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(selectTeamAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            OnItemClicked onItemClicked = selectTeamAdapter.getOnItemClicked();
            FantasyTeamListModel fantasyTeamListModel = selectTeamAdapter.getTopContestModel().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "topContestModel[position]");
            onItemClicked.onRootClicked(fantasyTeamListModel);
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
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        FantasyTeamListModel fantasyTeamListModel = this.topContestModel.get(i);
        Intrinsics.checkNotNullExpressionValue(fantasyTeamListModel, "topContestModel[position]");
        viewHolder.onBind(fantasyTeamListModel);
        if (Intrinsics.areEqual((Object) this.contestType_Id, (Object) "2")) {
            if (this.topContestModel.get(i).isAlreadyJoin()) {
                TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAlreadySelected);
                Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvAlreadySelected");
                CommonMethodsKt.visible(textView);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeamSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_selected_check));
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeamSelection)).setEnabled(false);
            } else {
                TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAlreadySelected);
                Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvAlreadySelected");
                CommonMethodsKt.hide(textView2);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeamSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_unselected_check));
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeamSelection)).setEnabled(true);
            }
            if (this.topContestModel.get(i).isSelected()) {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeamSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_selected_check));
            } else {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivTeamSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_unselected_check));
            }
        } else if (this.topContestModel.get(i).isAlreadyJoin()) {
            ((RadioButton) viewHolder.itemView.findViewById(C1188R.C1192id.radioBtn)).setChecked(true);
            ((RadioButton) viewHolder.itemView.findViewById(C1188R.C1192id.radioBtn)).setEnabled(false);
            TextView textView3 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAlreadySelected);
            Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.tvAlreadySelected");
            CommonMethodsKt.visible(textView3);
        } else {
            ((RadioButton) viewHolder.itemView.findViewById(C1188R.C1192id.radioBtn)).setChecked(this.lastSelectedPosition == i);
            ((RadioButton) viewHolder.itemView.findViewById(C1188R.C1192id.radioBtn)).setChecked(((RadioButton) viewHolder.itemView.findViewById(C1188R.C1192id.radioBtn)).isChecked());
            TextView textView4 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAlreadySelected);
            Intrinsics.checkNotNullExpressionValue(textView4, "holder.itemView.tvAlreadySelected");
            CommonMethodsKt.hide(textView4);
        }
        int size = this.topContestModel.get(i).getPlayers().size();
        for (int i2 = 0; i2 < size; i2++) {
            String str = null;
            if (this.topContestModel.get(i).getPlayers().get(i2).isFantasyCaptain()) {
                RequestManager with = Glide.with(this.context);
                StringBuilder sb = new StringBuilder();
                SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                sb.append(appSettings != null ? appSettings.getImageBaseUrl() : null);
                sb.append(this.topContestModel.get(i).getPlayers().get(i2).getImageUrl());
                with.load(sb.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.playerImageOne));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptainName)).setText(this.topContestModel.get(i).getPlayers().get(i2).getName().toString());
            }
            if (this.topContestModel.get(i).getPlayers().get(i2).isFantasyViceCaptain()) {
                RequestManager with2 = Glide.with(this.context);
                StringBuilder sb2 = new StringBuilder();
                SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                if (appSettings2 != null) {
                    str = appSettings2.getImageBaseUrl();
                }
                sb2.append(str);
                sb2.append(this.topContestModel.get(i).getPlayers().get(i2).getImageUrl());
                with2.load(sb2.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.playerImageTwo));
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
    }

    public final void addList(boolean z, ArrayList<FantasyTeamListModel> arrayList, int i, String str) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        Intrinsics.checkNotNullParameter(str, "contestTypeId");
        if (z) {
            this.topContestModel.clear();
            this.countSelected = 0;
        }
        this.countSelected = i;
        this.contestType_Id = str;
        this.topContestModel.addAll(arrayList);
        notifyDataSetChanged();
    }
}
