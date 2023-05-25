package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterJoinedFriendsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Joined;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\"2\u0006\u0010\u0017\u001a\u00020\u0018J\b\u0010#\u001a\u00020$H\u0016J\u001c\u0010%\u001a\u00020\u001e2\n\u0010&\u001a\u00060\u0002R\u00020\u00002\u0006\u0010'\u001a\u00020$H\u0017J\u001c\u0010(\u001a\u00060\u0002R\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020$H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006."}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/JoinedAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/JoinedAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/JoinedAdapter$OnItemClicked;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/detail/adapters/JoinedAdapter$OnItemClicked;Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "joinedFriendsList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Joined;", "getJoinedFriendsList", "()Ljava/util/ArrayList;", "setJoinedFriendsList", "(Ljava/util/ArrayList;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/JoinedAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/JoinedAdapter$OnItemClicked;)V", "status", "", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "addList", "", "firstPage", "", "list", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: JoinedAdapter.kt */
public final class JoinedAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private ArrayList<Joined> joinedFriendsList = new ArrayList<>();
    private OnItemClicked onItemClicked;
    private String status = "";

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/JoinedAdapter$OnItemClicked;", "", "onItemClicked", "", "fa", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Joined;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: JoinedAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(Joined joined);
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

    public JoinedAdapter(OnItemClicked onItemClicked2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = onItemClicked2;
        this.context = fragmentActivity;
    }

    public final ArrayList<Joined> getJoinedFriendsList() {
        return this.joinedFriendsList;
    }

    public final void setJoinedFriendsList(ArrayList<Joined> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.joinedFriendsList = arrayList;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.status = str;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_joined_friends, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterJoinedFriendsBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/JoinedAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterJoinedFriendsBinding;", "(Lcom/crickpe/view/detail/adapters/JoinedAdapter;Lcom/crickpe/databinding/AdapterJoinedFriendsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Joined;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: JoinedAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterJoinedFriendsBinding binding;
        private final Context context;
        final /* synthetic */ JoinedAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(JoinedAdapter joinedAdapter, AdapterJoinedFriendsBinding adapterJoinedFriendsBinding) {
            super(adapterJoinedFriendsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterJoinedFriendsBinding, "binding");
            this.this$0 = joinedAdapter;
            this.binding = adapterJoinedFriendsBinding;
            this.context = adapterJoinedFriendsBinding.getRoot().getContext();
            adapterJoinedFriendsBinding.getRoot().setOnClickListener(new JoinedAdapter$ViewHolder$$ExternalSyntheticLambda0(joinedAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3450_init_$lambda0(JoinedAdapter joinedAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(joinedAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            OnItemClicked onItemClicked = joinedAdapter.getOnItemClicked();
            Joined joined = joinedAdapter.getJoinedFriendsList().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(joined, "joinedFriendsList[position]");
            onItemClicked.onItemClicked(joined);
        }

        public final void onBind(Joined joined) {
            Intrinsics.checkNotNullParameter(joined, "topContestMode");
            this.binding.setModel(joined);
        }
    }

    public int getItemCount() {
        return this.joinedFriendsList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Joined joined = this.joinedFriendsList.get(i);
        Intrinsics.checkNotNullExpressionValue(joined, "joinedFriendsList[position]");
        viewHolder.onBind(joined);
        int size = this.joinedFriendsList.get(i).getSequence().size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!this.joinedFriendsList.get(i).getSequence().isEmpty()) {
                StringJoiner stringJoiner = new StringJoiner(",");
                stringJoiner.add(String.valueOf(this.joinedFriendsList.get(i).getSequence().get(i2).intValue()));
                if (i2 == this.joinedFriendsList.get(i).getSequence().size() - 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('T');
                    sb.append(stringJoiner);
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeams)).append(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append('T');
                    sb2.append(stringJoiner);
                    sb2.append(',');
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeams)).append(sb2.toString());
                }
            }
        }
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvDateofJoin)).setText(String.valueOf(CommonMethodsKt.modifyDateLayout(this.joinedFriendsList.get(i).getJoinedDate(), "dd/MM/YY")));
    }

    public final void addList(boolean z, List<Joined> list, String str) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(str, NotificationCompat.CATEGORY_STATUS);
        this.status = str;
        if (z) {
            this.joinedFriendsList.clear();
        }
        this.joinedFriendsList.addAll(list);
        notifyDataSetChanged();
    }
}
