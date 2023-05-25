package com.crickpe.view.detail.adapters;

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
import com.crickpe.view.detail.fragments.create_contest.models.PreviousContactsModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002'(B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013J\b\u0010\u001f\u001a\u00020\u0019H\u0016J\u001c\u0010 \u001a\u00020\u001b2\n\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020\u0019H\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0019H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter$DialogItemClick;", "context", "Landroid/content/Context;", "(Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter$DialogItemClick;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter$DialogItemClick;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter$DialogItemClick;)V", "productsList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/models/PreviousContactsModel;", "Lkotlin/collections/ArrayList;", "getProductsList", "()Ljava/util/ArrayList;", "setProductsList", "(Ljava/util/ArrayList;)V", "selectedPosition", "", "addList", "", "firstPage", "", "list", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "DialogItemClick", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PreviousContactsDialogAdapter.kt */
public final class PreviousContactsDialogAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private DialogItemClick onItemClicked;
    private ArrayList<PreviousContactsModel> productsList = new ArrayList<>();
    private int selectedPosition = -1;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter$DialogItemClick;", "", "onClick", "", "teamCountryData", "Lcom/crickpe/view/detail/fragments/create_contest/models/PreviousContactsModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PreviousContactsDialogAdapter.kt */
    public interface DialogItemClick {
        void onClick(PreviousContactsModel previousContactsModel);
    }

    public final Context getContext() {
        return this.context;
    }

    public final DialogItemClick getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setOnItemClicked(DialogItemClick dialogItemClick) {
        Intrinsics.checkNotNullParameter(dialogItemClick, "<set-?>");
        this.onItemClicked = dialogItemClick;
    }

    public PreviousContactsDialogAdapter(DialogItemClick dialogItemClick, Context context2) {
        Intrinsics.checkNotNullParameter(dialogItemClick, "onItemClicked");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.onItemClicked = dialogItemClick;
        this.context = context2;
    }

    public final ArrayList<PreviousContactsModel> getProductsList() {
        return this.productsList;
    }

    public final void setProductsList(ArrayList<PreviousContactsModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.productsList = arrayList;
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
        PreviousContactsModel previousContactsModel = this.productsList.get(i);
        Intrinsics.checkNotNullExpressionValue(previousContactsModel, "productsList[position]");
        viewHolder.onBind(previousContactsModel);
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTitle)).setText(this.productsList.get(i).getUser().getName());
        CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivFlag);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivFlag");
        ImageView imageView = circleImageView;
        String profilePic = this.productsList.get(i).getUser().getProfilePic();
        if (profilePic == null) {
            profilePic = "";
        }
        ExtensionsKt.loadImage(imageView, profilePic, C1188R.C1190drawable.profile_placeholder, true);
        if (this.selectedPosition == i) {
            viewHolder.itemView.setSelected(true);
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_selected_check));
        } else {
            viewHolder.itemView.setSelected(false);
            ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivSelection)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.player_unselected_check));
        }
        viewHolder.itemView.setOnClickListener(new PreviousContactsDialogAdapter$$ExternalSyntheticLambda0(this, viewHolder, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m3464onBindViewHolder$lambda0(PreviousContactsDialogAdapter previousContactsDialogAdapter, ViewHolder viewHolder, int i, View view) {
        Intrinsics.checkNotNullParameter(previousContactsDialogAdapter, "this$0");
        Intrinsics.checkNotNullParameter(viewHolder, "$holder");
        int i2 = previousContactsDialogAdapter.selectedPosition;
        if (i2 >= 0) {
            previousContactsDialogAdapter.notifyItemChanged(i2);
        }
        int adapterPosition = viewHolder.getAdapterPosition();
        previousContactsDialogAdapter.selectedPosition = adapterPosition;
        previousContactsDialogAdapter.notifyItemChanged(adapterPosition);
        DialogItemClick dialogItemClick = previousContactsDialogAdapter.onItemClicked;
        PreviousContactsModel previousContactsModel = previousContactsDialogAdapter.productsList.get(i);
        Intrinsics.checkNotNullExpressionValue(previousContactsModel, "productsList[position]");
        dialogItemClick.onClick(previousContactsModel);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter;Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "teamCountryData", "Lcom/crickpe/view/detail/fragments/create_contest/models/PreviousContactsModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PreviousContactsDialogAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        final /* synthetic */ PreviousContactsDialogAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(PreviousContactsDialogAdapter previousContactsDialogAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = previousContactsDialogAdapter;
            this.context = view.getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(PreviousContactsModel previousContactsModel) {
            Intrinsics.checkNotNullParameter(previousContactsModel, "teamCountryData");
            View view = this.itemView;
        }
    }

    public final void addList(boolean z, ArrayList<PreviousContactsModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.productsList.clear();
        }
        this.productsList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
