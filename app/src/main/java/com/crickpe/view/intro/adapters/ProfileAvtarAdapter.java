package com.crickpe.view.intro.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.intro.fragments.login_signup.ProfileAvtar;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002$%B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0018\u001a\u00020\u00192\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bJ\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u001c\u0010\u001d\u001a\u00020\u00192\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001cH\u0016R*\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006&"}, mo48222d2 = {"Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter$OnItemClicked;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter$OnItemClicked;Landroidx/fragment/app/FragmentActivity;)V", "avatarList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/intro/fragments/login_signup/ProfileAvtar;", "Lkotlin/collections/ArrayList;", "getAvatarList", "()Ljava/util/ArrayList;", "setAvatarList", "(Ljava/util/ArrayList;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "getOnItemClicked", "()Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter$OnItemClicked;)V", "addList", "", "profileAvtar", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileAvtarAdapter.kt */
public final class ProfileAvtarAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<ProfileAvtar> avatarList = new ArrayList<>();
    private FragmentActivity context;
    private OnItemClicked onItemClicked;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter$OnItemClicked;", "", "onItemClicked", "", "id", "Lcom/crickpe/view/intro/fragments/login_signup/ProfileAvtar;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ProfileAvtarAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(ProfileAvtar profileAvtar);
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

    public ProfileAvtarAdapter(OnItemClicked onItemClicked2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = onItemClicked2;
        this.context = fragmentActivity;
    }

    public final ArrayList<ProfileAvtar> getAvatarList() {
        return this.avatarList;
    }

    public final void setAvatarList(ArrayList<ProfileAvtar> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.avatarList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return new ViewHolder(this, CommonMethodsKt.inflate(viewGroup, C1188R.C1193layout.adapter_profile_avatar));
    }

    public int getItemCount() {
        return this.avatarList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        ProfileAvtar profileAvtar = this.avatarList.get(i);
        Intrinsics.checkNotNullExpressionValue(profileAvtar, "avatarList[position]");
        viewHolder.onBind(profileAvtar);
        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivProfile)).setImageDrawable(this.avatarList.get(i).getImage_id());
        if (this.avatarList.get(i).isSelected()) {
            ((ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.constrainLayout)).setBackground(ContextCompat.getDrawable(this.context, C1188R.C1190drawable.circle_app_color_border));
        } else {
            ((ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.constrainLayout)).setBackgroundResource(0);
        }
        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivProfile)).setOnClickListener(new ProfileAvtarAdapter$$ExternalSyntheticLambda0(this, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m3751onBindViewHolder$lambda0(ProfileAvtarAdapter profileAvtarAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(profileAvtarAdapter, "this$0");
        OnItemClicked onItemClicked2 = profileAvtarAdapter.onItemClicked;
        ProfileAvtar profileAvtar = profileAvtarAdapter.avatarList.get(i);
        Intrinsics.checkNotNullExpressionValue(profileAvtar, "avatarList[position]");
        onItemClicked2.onItemClicked(profileAvtar);
        int size = profileAvtarAdapter.avatarList.size();
        int i2 = 0;
        while (i2 < size) {
            profileAvtarAdapter.avatarList.get(i2).setSelected(i2 == i);
            i2++;
        }
        profileAvtarAdapter.notifyDataSetChanged();
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter;Landroid/view/View;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "address", "Lcom/crickpe/view/intro/fragments/login_signup/ProfileAvtar;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ProfileAvtarAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        final /* synthetic */ ProfileAvtarAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(ProfileAvtarAdapter profileAvtarAdapter, View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.this$0 = profileAvtarAdapter;
            this.context = view.getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(ProfileAvtar profileAvtar) {
            Intrinsics.checkNotNullParameter(profileAvtar, "address");
            View view = this.itemView;
        }
    }

    public final void addList(ArrayList<ProfileAvtar> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "profileAvtar");
        this.avatarList.clear();
        this.avatarList.addAll(arrayList);
        notifyDataSetChanged();
    }
}
