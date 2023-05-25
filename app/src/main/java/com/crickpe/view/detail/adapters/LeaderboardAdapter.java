package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.data.leaderboard.LeaderboardModel;
import com.crickpe.databinding.AdapterLeaderboardBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.leadereboard.LeaderboardFragment;
import com.crickpe.view.intro.fragments.User;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J*\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u001a\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u0010\u0018\u0001`\u0011J\b\u0010\u001f\u001a\u00020 H\u0016J\u001c\u0010!\u001a\u00020\u001b2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020 H\u0016J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020 H\u0016J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006."}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/LeaderboardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/LeaderboardAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "onClick", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/leadereboard/LeaderboardFragment;", "(Landroidx/fragment/app/FragmentActivity;Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/leadereboard/LeaderboardFragment;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "df", "Ljava/text/DecimalFormat;", "leaderboardList", "Ljava/util/ArrayList;", "Lcom/crickpe/data/leaderboard/LeaderboardModel;", "Lkotlin/collections/ArrayList;", "getLeaderboardList", "()Ljava/util/ArrayList;", "setLeaderboardList", "(Ljava/util/ArrayList;)V", "getOnClick", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/leadereboard/LeaderboardFragment;", "setOnClick", "(Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/leadereboard/LeaderboardFragment;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNumber", "", "value", "", "OnClick", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LeaderboardAdapter.kt */
public final class LeaderboardAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;

    /* renamed from: df */
    private DecimalFormat f465df;
    private ArrayList<LeaderboardModel> leaderboardList = new ArrayList<>();
    private LeaderboardFragment onClick;

    @Metadata(mo48221d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/LeaderboardAdapter$OnClick;", "", "onItemClick", "", "leaderboardModel", "Lcom/crickpe/data/leaderboard/LeaderboardModel;", "position", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: LeaderboardAdapter.kt */
    public interface OnClick {
        void onItemClick(LeaderboardModel leaderboardModel, int i);
    }

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final LeaderboardFragment getOnClick() {
        return this.onClick;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public final void setOnClick(LeaderboardFragment leaderboardFragment) {
        Intrinsics.checkNotNullParameter(leaderboardFragment, "<set-?>");
        this.onClick = leaderboardFragment;
    }

    public LeaderboardAdapter(FragmentActivity fragmentActivity, LeaderboardFragment leaderboardFragment) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        Intrinsics.checkNotNullParameter(leaderboardFragment, "onClick");
        this.context = fragmentActivity;
        this.onClick = leaderboardFragment;
    }

    public final ArrayList<LeaderboardModel> getLeaderboardList() {
        return this.leaderboardList;
    }

    public final void setLeaderboardList(ArrayList<LeaderboardModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.leaderboardList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_leaderboard, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterLeaderboardBinding) inflate);
    }

    public int getItemCount() {
        return this.leaderboardList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        try {
            LeaderboardModel leaderboardModel = this.leaderboardList.get(i);
            Intrinsics.checkNotNullExpressionValue(leaderboardModel, "leaderboardList[position]");
            viewHolder.onBind(leaderboardModel, i);
            String str = "";
            boolean z = false;
            if (this.leaderboardList.get(i).getUserType() == 2) {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setTextColor(AppCompatResources.getColorStateList(this.context, C1188R.C1189color.white));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setTextColor(AppCompatResources.getColorStateList(this.context, C1188R.C1189color.white));
                TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank);
                Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvRank");
                CommonMethodsKt.hide(textView);
                ((LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlMain)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.app_color_one));
                CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivProfile);
                Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivProfile");
                ImageView imageView = circleImageView;
                String imageUrl = this.leaderboardList.get(i).getPlayerInfo().getImageUrl();
                if (imageUrl != null) {
                    str = imageUrl;
                }
                ExtensionsKt.loadImage(imageView, str, C1188R.C1190drawable.profile_placeholder, true);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.leaderboardList.get(i).getPlayerInfo().getName());
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPoints)).setVisibility(4);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeam)).setVisibility(8);
            } else {
                CircleImageView circleImageView2 = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivProfile);
                Intrinsics.checkNotNullExpressionValue(circleImageView2, "holder.itemView.ivProfile");
                ImageView imageView2 = circleImageView2;
                String profilePic = this.leaderboardList.get(i).getUserInfo().getProfilePic();
                if (profilePic != null) {
                    str = profilePic;
                }
                ExtensionsKt.loadImage(imageView2, str, C1188R.C1190drawable.profile_placeholder, true);
                TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank);
                Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvRank");
                CommonMethodsKt.visible(textView2);
                String str2 = this.leaderboardList.get(i).getUserInfo().get_id();
                User userProfile = UserManager.INSTANCE.getUserProfile();
                if (Intrinsics.areEqual((Object) str2, (Object) userProfile != null ? userProfile.get_id() : null)) {
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setTextColor(AppCompatResources.getColorStateList(this.context, C1188R.C1189color.white));
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setTextColor(AppCompatResources.getColorStateList(this.context, C1188R.C1189color.white));
                    ((LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlMain)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.green_light_main));
                } else {
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setTextColor(AppCompatResources.getColorStateList(this.context, C1188R.C1189color.grey_text));
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setTextColor(AppCompatResources.getColorStateList(this.context, C1188R.C1189color.grey_text));
                    ((LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlMain)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.white));
                }
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.leaderboardList.get(i).getUserInfo().getName());
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPoints)).setText(String.valueOf(this.leaderboardList.get(i).getTotalFantasyPoint()));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPoints)).setVisibility(0);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeam)).setVisibility(0);
            }
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAmount)).setText(setNumber(this.leaderboardList.get(i).getAmount()));
            CharSequence rank = this.leaderboardList.get(i).getRank();
            if (rank == null || rank.length() == 0) {
                z = true;
            }
            if (z) {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setText("Rank #0");
                return;
            }
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvRank)).setText("Rank #" + this.leaderboardList.get(i).getRank());
        } catch (Exception e) {
            Log.v("LEADER_ADAPTER", e.toString());
        }
    }

    @Metadata(mo48221d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/LeaderboardAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterLeaderboardBinding;", "(Lcom/crickpe/view/detail/adapters/LeaderboardAdapter;Lcom/crickpe/databinding/AdapterLeaderboardBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/data/leaderboard/LeaderboardModel;", "position", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: LeaderboardAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterLeaderboardBinding binding;
        private final Context context;
        final /* synthetic */ LeaderboardAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(LeaderboardAdapter leaderboardAdapter, AdapterLeaderboardBinding adapterLeaderboardBinding) {
            super(adapterLeaderboardBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterLeaderboardBinding, "binding");
            this.this$0 = leaderboardAdapter;
            this.binding = adapterLeaderboardBinding;
            this.context = adapterLeaderboardBinding.getRoot().getContext();
            adapterLeaderboardBinding.getRoot().setOnClickListener(new LeaderboardAdapter$ViewHolder$$ExternalSyntheticLambda0(leaderboardAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3451_init_$lambda0(LeaderboardAdapter leaderboardAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(leaderboardAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            try {
                if (leaderboardAdapter.getLeaderboardList().get(viewHolder.getAdapterPosition()).getUserType() == 1) {
                    LeaderboardFragment onClick = leaderboardAdapter.getOnClick();
                    LeaderboardModel leaderboardModel = leaderboardAdapter.getLeaderboardList().get(viewHolder.getAdapterPosition());
                    Intrinsics.checkNotNullExpressionValue(leaderboardModel, "leaderboardList[adapterPosition]");
                    onClick.onItemClick(leaderboardModel, viewHolder.getAdapterPosition());
                }
            } catch (Exception e) {
                Log.v("Exception", e.toString());
            }
        }

        public final void onBind(LeaderboardModel leaderboardModel, int i) {
            Intrinsics.checkNotNullParameter(leaderboardModel, "players");
            this.binding.setModel(leaderboardModel);
            this.binding.setPosi(i);
        }
    }

    public final void addList(boolean z, ArrayList<LeaderboardModel> arrayList) {
        if (z) {
            this.leaderboardList.clear();
        }
        ArrayList<LeaderboardModel> arrayList2 = this.leaderboardList;
        Intrinsics.checkNotNull(arrayList);
        arrayList2.addAll(arrayList);
        notifyDataSetChanged();
    }

    public final String setNumber(double d) {
        String str;
        String str2 = "";
        try {
            double abs = Math.abs(d);
            if (abs >= 1.0E7d) {
                abs /= (double) 10000000;
                str = " Cr";
                try {
                    this.f465df = new DecimalFormat("###,###,###,###,###.##");
                } catch (Exception e) {
                    e = e;
                }
            } else if (abs >= 100000.0d) {
                abs /= (double) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
                str = " L";
                this.f465df = new DecimalFormat("###,###,###,###,###.##");
            } else {
                str = " ";
                this.f465df = new DecimalFormat("###,###,###,###,###");
            }
            DecimalFormat decimalFormat = this.f465df;
            DecimalFormat decimalFormat2 = null;
            if (decimalFormat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("df");
                decimalFormat = null;
            }
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            DecimalFormat decimalFormat3 = this.f465df;
            if (decimalFormat3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("df");
            } else {
                decimalFormat2 = decimalFormat3;
            }
            String format = decimalFormat2.format(abs);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
            str2 = format;
        } catch (Exception e2) {
            e = e2;
            str = str2;
            Log.v("numDifferentiation", e.toString());
            return 8377 + str2 + str;
        }
        return 8377 + str2 + str;
    }
}
