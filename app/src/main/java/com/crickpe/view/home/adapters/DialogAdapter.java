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

@Metadata(mo48221d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002./B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ&\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019J\b\u0010&\u001a\u00020\bH\u0016J\u001c\u0010'\u001a\u00020\"2\n\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020\bH\u0016J\u001c\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\bH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0013\"\u0004\b \u0010\u0015¨\u00060"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/DialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/DialogAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/home/adapters/DialogAdapter$OnCountryDialog;", "context", "Landroid/content/Context;", "preselection", "", "(Lcom/crickpe/view/home/adapters/DialogAdapter$OnCountryDialog;Landroid/content/Context;I)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getOnItemClicked", "()Lcom/crickpe/view/home/adapters/DialogAdapter$OnCountryDialog;", "setOnItemClicked", "(Lcom/crickpe/view/home/adapters/DialogAdapter$OnCountryDialog;)V", "getPreselection", "()I", "setPreselection", "(I)V", "productsList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "Lkotlin/collections/ArrayList;", "getProductsList", "()Ljava/util/ArrayList;", "setProductsList", "(Ljava/util/ArrayList;)V", "selectedPosition", "getSelectedPosition", "setSelectedPosition", "addList", "", "firstPage", "", "list", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnCountryDialog", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: DialogAdapter.kt */
public final class DialogAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private OnCountryDialog onItemClicked;
    private int preselection;
    private ArrayList<TeamCountryData> productsList = new ArrayList<>();
    private int selectedPosition = this.preselection;

    public final Context getContext() {
        return this.context;
    }

    public final OnCountryDialog getOnItemClicked() {
        return this.onItemClicked;
    }

    public final int getPreselection() {
        return this.preselection;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setOnItemClicked(OnCountryDialog onCountryDialog) {
        Intrinsics.checkNotNullParameter(onCountryDialog, "<set-?>");
        this.onItemClicked = onCountryDialog;
    }

    public final void setPreselection(int i) {
        this.preselection = i;
    }

    public DialogAdapter(OnCountryDialog onCountryDialog, Context context2, int i) {
        Intrinsics.checkNotNullParameter(onCountryDialog, "onItemClicked");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.onItemClicked = onCountryDialog;
        this.context = context2;
        this.preselection = i;
    }

    public final ArrayList<TeamCountryData> getProductsList() {
        return this.productsList;
    }

    public final void setProductsList(ArrayList<TeamCountryData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.productsList = arrayList;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void setSelectedPosition(int i) {
        this.selectedPosition = i;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new ViewHolder(this, CommonMethodsKt.inflate(viewGroup, C1188R.C1193layout.adapter_dialog_home));
    }

    public int getItemCount() {
        return this.productsList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        TeamCountryData teamCountryData = this.productsList.get(i);
        Intrinsics.checkNotNullExpressionValue(teamCountryData, "productsList[position]");
        viewHolder.onBind(teamCountryData);
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTitle)).setText(this.productsList.get(i).getName());
        CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivFlag);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivFlag");
        ImageView imageView = circleImageView;
        String teamIconUrl = this.productsList.get(i).getTeamIconUrl();
        if (teamIconUrl == null) {
            teamIconUrl = "";
        }
        ExtensionsKt.loadImage(imageView, teamIconUrl, C1188R.C1190drawable.flag_placeholder, true);
        if (this.selectedPosition == i) {
            viewHolder.itemView.setSelected(true);
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_selected_check));
        } else {
            viewHolder.itemView.setSelected(false);
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_unselected_check));
        }
        viewHolder.itemView.setOnClickListener(new DialogAdapter$$ExternalSyntheticLambda0(this, viewHolder, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m3684onBindViewHolder$lambda0(DialogAdapter dialogAdapter, ViewHolder viewHolder, int i, View view) {
        Intrinsics.checkNotNullParameter(dialogAdapter, "this$0");
        Intrinsics.checkNotNullParameter(viewHolder, "$holder");
        int i2 = dialogAdapter.selectedPosition;
        if (i2 >= 0) {
            dialogAdapter.notifyItemChanged(i2);
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        dialogAdapter.selectedPosition = adapterPosition;
        dialogAdapter.notifyItemChanged(adapterPosition);
        OnCountryDialog onCountryDialog = dialogAdapter.onItemClicked;
        TeamCountryData teamCountryData = dialogAdapter.productsList.get(i);
        Intrinsics.checkNotNullExpressionValue(teamCountryData, "productsList[position]");
        onCountryDialog.onCountryClick(teamCountryData, i, true);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/DialogAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crickpe/view/home/adapters/DialogAdapter;Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "teamCountryData", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: DialogAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        final /* synthetic */ DialogAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(DialogAdapter dialogAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = dialogAdapter;
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
            this.productsList.clear();
        }
        this.productsList.addAll(arrayList);
        notifyDataSetChanged();
    }

    @Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH&¨\u0006\n"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/DialogAdapter$OnCountryDialog;", "", "onCountryClick", "", "teamCountryData", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "position", "", "fromDialog", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: DialogAdapter.kt */
    public interface OnCountryDialog {
        void onCountryClick(TeamCountryData teamCountryData, int i, boolean z);

        @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
        /* compiled from: DialogAdapter.kt */
        public static final class DefaultImpls {
            public static /* synthetic */ void onCountryClick$default(OnCountryDialog onCountryDialog, TeamCountryData teamCountryData, int i, boolean z, int i2, Object obj) {
                if (obj == null) {
                    if ((i2 & 4) != 0) {
                        z = false;
                    }
                    onCountryDialog.onCountryClick(teamCountryData, i, z);
                    return;
                }
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCountryClick");
            }
        }
    }
}
