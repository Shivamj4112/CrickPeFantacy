package com.crickpe.view.home.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterUserRewardsBinding;
import com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&'B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u001eH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006("}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/TrackRewardsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/TrackRewardsAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/home/adapters/TrackRewardsAdapter$OnItemClicked;", "context", "Landroid/content/Context;", "(Lcom/crickpe/view/home/adapters/TrackRewardsAdapter$OnItemClicked;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getOnItemClicked", "()Lcom/crickpe/view/home/adapters/TrackRewardsAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/home/adapters/TrackRewardsAdapter$OnItemClicked;)V", "trackerModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/TrackerModel;", "Lkotlin/collections/ArrayList;", "getTrackerModels", "()Ljava/util/ArrayList;", "setTrackerModels", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TrackRewardsAdapter.kt */
public final class TrackRewardsAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private OnItemClicked onItemClicked;
    private ArrayList<TrackerModel> trackerModels = new ArrayList<>();

    @Metadata(mo48221d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/TrackRewardsAdapter$OnItemClicked;", "", "onTrackerClick", "", "trackerModel", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/TrackerModel;", "position", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TrackRewardsAdapter.kt */
    public interface OnItemClicked {
        void onTrackerClick(TrackerModel trackerModel, int i);
    }

    public final Context getContext() {
        return this.context;
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public TrackRewardsAdapter(OnItemClicked onItemClicked2, Context context2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.onItemClicked = onItemClicked2;
        this.context = context2;
    }

    public final ArrayList<TrackerModel> getTrackerModels() {
        return this.trackerModels;
    }

    public final void setTrackerModels(ArrayList<TrackerModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.trackerModels = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_user_rewards, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterUserRewardsBinding) inflate);
    }

    public int getItemCount() {
        return this.trackerModels.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a6 A[SYNTHETIC, Splitter:B:18:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0121 A[Catch:{ Exception -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x01d5 A[SYNTHETIC, Splitter:B:32:0x01d5] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x02c7 A[Catch:{ Exception -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0398 A[Catch:{ Exception -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x039d A[Catch:{ Exception -> 0x05f3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x03ac A[SYNTHETIC, Splitter:B:45:0x03ac] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0534 A[Catch:{ Exception -> 0x05f3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(ViewHolder r14, int r15) {
        /*
            r13 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r1 = "trackerModels[position]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            r14.bind(r0)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.UserReward r0 = r0.getUserReward()     // Catch:{ Exception -> 0x05f3 }
            r1 = 35
            if (r0 == 0) goto L_0x005f
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r2 = com.crickpe.C1188R.C1192id.tvMyRank     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f3 }
            r2.<init>()     // Catch:{ Exception -> 0x05f3 }
            r2.append(r1)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r3 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r3 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r3     // Catch:{ Exception -> 0x05f3 }
            int r3 = r3.getUserRewardRank()     // Catch:{ Exception -> 0x05f3 }
            r2.append(r3)     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x05f3 }
            r0.setText(r2)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r2 = com.crickpe.C1188R.C1192id.ivUser     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x05f3 }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x05f3 }
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r2)     // Catch:{ Exception -> 0x05f3 }
            goto L_0x006e
        L_0x005f:
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r2 = com.crickpe.C1188R.C1192id.ivUser     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x05f3 }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x05f3 }
            r2 = 1056964608(0x3f000000, float:0.5)
            r0.setAlpha(r2)     // Catch:{ Exception -> 0x05f3 }
        L_0x006e:
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r2 = com.crickpe.C1188R.C1192id.ivUser     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x05f3 }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r2 = "holder.itemView.ivUser"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ Exception -> 0x05f3 }
            r3 = r0
            android.widget.ImageView r3 = (android.widget.ImageView) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.intro.fragments.User r0 = r0.getUserProfile()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x0093
            java.lang.String r0 = r0.getProfilePic()     // Catch:{ Exception -> 0x05f3 }
            if (r0 != 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r4 = r0
            goto L_0x0094
        L_0x0093:
            r4 = r2
        L_0x0094:
            r5 = 2131165835(0x7f07028b, float:1.7945898E38)
            r6 = 0
            r7 = 4
            r8 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r0 = "holder.itemView.rlTopPlayer"
            r3 = -2
            r4 = -1
            java.lang.String r5 = "holder.itemView.ivPlayer"
            r6 = 0
            if (r15 != 0) goto L_0x0121
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x05f3 }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x05f3 }
            r8.<init>(r4, r3)     // Catch:{ Exception -> 0x05f3 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x05f3 }
            r3 = 200(0xc8, float:2.8E-43)
            r7.setMargins(r6, r3, r6, r6)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.rlTop     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3     // Catch:{ Exception -> 0x05f3 }
            android.view.ViewGroup$LayoutParams r7 = (android.view.ViewGroup.LayoutParams) r7     // Catch:{ Exception -> 0x05f3 }
            r3.setLayoutParams(r7)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.rlTop     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3     // Catch:{ Exception -> 0x05f3 }
            r3.requestLayout()     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.ivPlayer     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            de.hdodenhof.circleimageview.CircleImageView r3 = (p019de.hdodenhof.circleimageview.CircleImageView) r3     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.hide(r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.rlTopPlayer     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.visible(r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.ivTopPlayer     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r0 = "holder.itemView.ivTopPlayer"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r0 = r0.getImageUrl()     // Catch:{ Exception -> 0x05f3 }
            if (r0 != 0) goto L_0x0115
            r8 = r2
            goto L_0x0116
        L_0x0115:
            r8 = r0
        L_0x0116:
            r9 = 2131165835(0x7f07028b, float:1.7945898E38)
            r10 = 0
            r11 = 4
            r12 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x05f3 }
            goto L_0x019a
        L_0x0121:
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x05f3 }
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams     // Catch:{ Exception -> 0x05f3 }
            r8.<init>(r4, r3)     // Catch:{ Exception -> 0x05f3 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x05f3 }
            r3 = 50
            r7.setMargins(r6, r3, r6, r6)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.rlTop     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3     // Catch:{ Exception -> 0x05f3 }
            android.view.ViewGroup$LayoutParams r7 = (android.view.ViewGroup.LayoutParams) r7     // Catch:{ Exception -> 0x05f3 }
            r3.setLayoutParams(r7)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.rlTop     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3     // Catch:{ Exception -> 0x05f3 }
            r3.requestLayout()     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.ivPlayer     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            de.hdodenhof.circleimageview.CircleImageView r3 = (p019de.hdodenhof.circleimageview.CircleImageView) r3     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.visible(r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.rlTopPlayer     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r3.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            android.widget.RelativeLayout r3 = (android.widget.RelativeLayout) r3     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.hide(r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.ivPlayer     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch:{ Exception -> 0x05f3 }
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r0 = r0.getImageUrl()     // Catch:{ Exception -> 0x05f3 }
            if (r0 != 0) goto L_0x0190
            r8 = r2
            goto L_0x0191
        L_0x0190:
            r8 = r0
        L_0x0191:
            r9 = 2131165835(0x7f07028b, float:1.7945898E38)
            r10 = 0
            r11 = 4
            r12 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x05f3 }
        L_0x019a:
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.tvRank     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f3 }
            r3.<init>()     // Catch:{ Exception -> 0x05f3 }
            r3.append(r1)     // Catch:{ Exception -> 0x05f3 }
            int r1 = r15 + 1
            r3.append(r1)     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x05f3 }
            r0.setText(r1)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r0 = r0.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            java.util.List r0 = r0.getList()     // Catch:{ Exception -> 0x05f3 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r1 = "holder.itemView.ivFirst"
            java.lang.String r3 = "holder.itemView.llFirstHighest"
            r4 = 1
            if (r0 <= r4) goto L_0x02c7
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r5 = com.crickpe.C1188R.C1192id.llFirstHighest     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r5)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.llSecondHighest     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r3 = "holder.itemView.llSecondHighest"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.tvPlayer1Name     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r3 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r3 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r3 = r3.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            java.util.List r3 = r3.getList()     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem r3 = (com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.Users r3 = r3.getUserInfo()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x05f3 }
            r0.setText(r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.tvPlayer2Name     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r3 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r3 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r3 = r3.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            java.util.List r3 = r3.getList()     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem r3 = (com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.Users r3 = r3.getUserInfo()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x05f3 }
            r0.setText(r3)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r0 = r0.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            java.util.List r0 = r0.getList()     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.Users r0 = r0.getUserInfo()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r8 = r0.getProfilePic()     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.ivFirst     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x05f3 }
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x05f3 }
            r9 = 2131165835(0x7f07028b, float:1.7945898E38)
            r10 = 0
            r11 = 4
            r12 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r0 = r0.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            java.util.List r0 = r0.getList()     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.Users r0 = r0.getUserInfo()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r8 = r0.getProfilePic()     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r1 = com.crickpe.C1188R.C1192id.ivSecond     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x05f3 }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r1 = "holder.itemView.ivSecond"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x05f3 }
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x05f3 }
            r9 = 2131165835(0x7f07028b, float:1.7945898E38)
            r10 = 0
            r11 = 4
            r12 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x05f3 }
            goto L_0x037c
        L_0x02c7:
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r0 = r0.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            java.util.List r0 = r0.getList()     // Catch:{ Exception -> 0x05f3 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x05f3 }
            r5 = 4
            if (r0 != r4) goto L_0x0362
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r7 = com.crickpe.C1188R.C1192id.llFirstHighest     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r7)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.llSecondHighest     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            r0.setVisibility(r5)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.tvPlayer1Name     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r3 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r3 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r3 = r3.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            java.util.List r3 = r3.getList()     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r3 = r3.get(r6)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem r3 = (com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.Users r3 = r3.getUserInfo()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x05f3 }
            r0.setText(r3)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r0 = r0.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            java.util.List r0 = r0.getList()     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.RewardItem) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.Users r0 = r0.getUserInfo()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r8 = r0.getProfilePic()     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.ivFirst     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x05f3 }
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x05f3 }
            r9 = 2131165835(0x7f07028b, float:1.7945898E38)
            r10 = 0
            r11 = 4
            r12 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x05f3 }
            goto L_0x037c
        L_0x0362:
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r1 = com.crickpe.C1188R.C1192id.llFirstHighest     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            r0.setVisibility(r5)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r1 = com.crickpe.C1188R.C1192id.llSecondHighest     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            r0.setVisibility(r5)     // Catch:{ Exception -> 0x05f3 }
        L_0x037c:
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel r0 = r0.getAppSettings()     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.adapters.TrackRewardsAdapter$onBindViewHolder$listener$1 r1 = new com.crickpe.view.home.adapters.TrackRewardsAdapter$onBindViewHolder$listener$1     // Catch:{ Exception -> 0x05f3 }
            r1.<init>(r14)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r5 = com.crickpe.C1188R.C1192id.seekBar     // Catch:{ Exception -> 0x05f3 }
            android.view.View r3 = r3.findViewById(r5)     // Catch:{ Exception -> 0x05f3 }
            android.widget.SeekBar r3 = (android.widget.SeekBar) r3     // Catch:{ Exception -> 0x05f3 }
            android.widget.SeekBar$OnSeekBarChangeListener r1 = (android.widget.SeekBar.OnSeekBarChangeListener) r1     // Catch:{ Exception -> 0x05f3 }
            r3.setOnSeekBarChangeListener(r1)     // Catch:{ Exception -> 0x05f3 }
            if (r0 == 0) goto L_0x039d
            java.lang.String r0 = r0.isCarReward()     // Catch:{ Exception -> 0x05f3 }
            goto L_0x039e
        L_0x039d:
            r0 = 0
        L_0x039e:
            java.lang.String r1 = "true"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r1 = "holder.itemView.llPLayers"
            java.lang.String r3 = "holder.itemView.tvHighestPays"
            java.lang.String r5 = "holder.itemView.llCarReward"
            if (r0 == 0) goto L_0x0534
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.llCarReward     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r4 = com.crickpe.C1188R.C1192id.tvHighestPays     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r4)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.llPLayers     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r1 = com.crickpe.C1188R.C1192id.seekBar     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x05f3 }
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r1 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r1 = r1.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r1 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r1     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.CarRewards r1 = r1.getCarRewards()     // Catch:{ Exception -> 0x05f3 }
            int r1 = r1.getAmount()     // Catch:{ Exception -> 0x05f3 }
            r0.setMax(r1)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            java.util.List r0 = r0.getPlayercarrewards()     // Catch:{ Exception -> 0x05f3 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ Exception -> 0x05f3 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x05f3 }
            r1.<init>()     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x05f3 }
            r3.<init>()     // Catch:{ Exception -> 0x05f3 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x05f3 }
            r4 = 0
        L_0x041c:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x05f3 }
            if (r5 == 0) goto L_0x043a
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x05f3 }
            r7 = r5
            com.crickpe.view.home.fragments.rewards.tracker_model.CarRewards r7 = (com.crickpe.view.home.fragments.rewards.tracker_model.CarRewards) r7     // Catch:{ Exception -> 0x05f3 }
            int r7 = r7.getAmount()     // Catch:{ Exception -> 0x05f3 }
            int r4 = r4 + r7
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch:{ Exception -> 0x05f3 }
            boolean r7 = r1.add(r7)     // Catch:{ Exception -> 0x05f3 }
            if (r7 == 0) goto L_0x041c
            r3.add(r5)     // Catch:{ Exception -> 0x05f3 }
            goto L_0x041c
        L_0x043a:
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            int r0 = r0.getTotalRewardEarning()     // Catch:{ Exception -> 0x05f3 }
            int r0 = r0 - r4
            android.view.View r1 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.seekBar     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r1.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1     // Catch:{ Exception -> 0x05f3 }
            r1.setProgress(r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.seekBar     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r1.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.SeekBar r1 = (android.widget.SeekBar) r1     // Catch:{ Exception -> 0x05f3 }
            r1.performClick()     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.tvRewardBy     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r1.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05f3 }
            android.content.Context r3 = r13.context     // Catch:{ Exception -> 0x05f3 }
            r4 = 2131951780(0x7f1300a4, float:1.9539984E38)
            java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x05f3 }
            r1.setText(r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.tvCarName     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r1.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r3 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r3 = r3.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r3 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r3     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.CarRewards r3 = r3.getCarRewards()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x05f3 }
            r1.setText(r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r3 = com.crickpe.C1188R.C1192id.ivThumb     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r1.findViewById(r3)     // Catch:{ Exception -> 0x05f3 }
            r7 = r1
            android.widget.ImageView r7 = (android.widget.ImageView) r7     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r1 = "holder.itemView.ivThumb"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r1)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r1 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r1 = r1.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r1 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r1     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.CarRewards r1 = r1.getCarRewards()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r1 = r1.getImageUrl()     // Catch:{ Exception -> 0x05f3 }
            if (r1 != 0) goto L_0x04be
            r8 = r2
            goto L_0x04bf
        L_0x04be:
            r8 = r1
        L_0x04bf:
            r9 = 2131165632(0x7f0701c0, float:1.7945487E38)
            r10 = 0
            r11 = 4
            r12 = 0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r2 = com.crickpe.C1188R.C1192id.tvRewardValueBal     // Catch:{ Exception -> 0x05f3 }
            android.view.View r1 = r1.findViewById(r2)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r1 = (android.widget.TextView) r1     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r2 = "holder.itemView.tvRewardValueBal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r2 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r2 = r2.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r2 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r2     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.CarRewards r2 = r2.getCarRewards()     // Catch:{ Exception -> 0x05f3 }
            int r2 = r2.getAmount()     // Catch:{ Exception -> 0x05f3 }
            int r2 = r2 - r0
            double r2 = (double) r2     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.recycler.BindingAdapters.setNumber(r1, r2)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r1 = com.crickpe.C1188R.C1192id.textView28     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r1 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r1 = r1.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r1 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r1     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r1 = r1.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            int r1 = r1.getTotalCount()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x05f3 }
            r0.setText(r1)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r1 = com.crickpe.C1188R.C1192id.tvTotal     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r1 = "holder.itemView.tvTotal"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r1 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r15 = r1.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r15 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r15     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.CarRewards r15 = r15.getCarRewards()     // Catch:{ Exception -> 0x05f3 }
            int r15 = r15.getAmount()     // Catch:{ Exception -> 0x05f3 }
            double r1 = (double) r15     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.recycler.BindingAdapters.setNumber(r0, r1)     // Catch:{ Exception -> 0x05f3 }
            goto L_0x05e5
        L_0x0534:
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r2 = com.crickpe.C1188R.C1192id.llCarReward     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x05f3 }
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r5)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r2 = com.crickpe.C1188R.C1192id.tvHighestPays     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r2 = com.crickpe.C1188R.C1192id.llPLayers     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x05f3 }
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0     // Catch:{ Exception -> 0x05f3 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r0 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r0 = r0.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r0 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r0     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r0 = r0.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            int r0 = r0.getTotalCount()     // Catch:{ Exception -> 0x05f3 }
            if (r0 > r4) goto L_0x05b1
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r1 = com.crickpe.C1188R.C1192id.tvRewardBy     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f3 }
            r1.<init>()     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r2 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r15 = r2.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r15 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r15     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r15 = r15.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            int r15 = r15.getTotalCount()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r15 = java.lang.Integer.toString(r15)     // Catch:{ Exception -> 0x05f3 }
            r1.append(r15)     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r15 = " fan"
            r1.append(r15)     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r15 = r1.toString()     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15     // Catch:{ Exception -> 0x05f3 }
            r0.setText(r15)     // Catch:{ Exception -> 0x05f3 }
            goto L_0x05e5
        L_0x05b1:
            android.view.View r0 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r1 = com.crickpe.C1188R.C1192id.tvRewardBy     // Catch:{ Exception -> 0x05f3 }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x05f3 }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x05f3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05f3 }
            r1.<init>()     // Catch:{ Exception -> 0x05f3 }
            java.util.ArrayList<com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel> r2 = r13.trackerModels     // Catch:{ Exception -> 0x05f3 }
            java.lang.Object r15 = r2.get(r15)     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel r15 = (com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel) r15     // Catch:{ Exception -> 0x05f3 }
            com.crickpe.view.home.fragments.rewards.tracker_model.HighestRewardPlayers r15 = r15.getHighestRewardPlayers()     // Catch:{ Exception -> 0x05f3 }
            int r15 = r15.getTotalCount()     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r15 = java.lang.Integer.toString(r15)     // Catch:{ Exception -> 0x05f3 }
            r1.append(r15)     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r15 = " fans"
            r1.append(r15)     // Catch:{ Exception -> 0x05f3 }
            java.lang.String r15 = r1.toString()     // Catch:{ Exception -> 0x05f3 }
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15     // Catch:{ Exception -> 0x05f3 }
            r0.setText(r15)     // Catch:{ Exception -> 0x05f3 }
        L_0x05e5:
            android.view.View r14 = r14.itemView     // Catch:{ Exception -> 0x05f3 }
            int r15 = com.crickpe.C1188R.C1192id.seekBar     // Catch:{ Exception -> 0x05f3 }
            android.view.View r14 = r14.findViewById(r15)     // Catch:{ Exception -> 0x05f3 }
            android.widget.SeekBar r14 = (android.widget.SeekBar) r14     // Catch:{ Exception -> 0x05f3 }
            r14.setEnabled(r6)     // Catch:{ Exception -> 0x05f3 }
            goto L_0x05fd
        L_0x05f3:
            r14 = move-exception
            java.lang.String r14 = r14.toString()
            java.lang.String r15 = "DATA_ERROR"
            android.util.Log.i(r15, r14)
        L_0x05fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.home.adapters.TrackRewardsAdapter.onBindViewHolder(com.crickpe.view.home.adapters.TrackRewardsAdapter$ViewHolder, int):void");
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/TrackRewardsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterUserRewardsBinding;", "(Lcom/crickpe/view/home/adapters/TrackRewardsAdapter;Lcom/crickpe/databinding/AdapterUserRewardsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "bind", "", "trackerModel", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/TrackerModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TrackRewardsAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterUserRewardsBinding binding;
        private final Context context;
        final /* synthetic */ TrackRewardsAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(TrackRewardsAdapter trackRewardsAdapter, AdapterUserRewardsBinding adapterUserRewardsBinding) {
            super(adapterUserRewardsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterUserRewardsBinding, "binding");
            this.this$0 = trackRewardsAdapter;
            this.binding = adapterUserRewardsBinding;
            this.context = adapterUserRewardsBinding.getRoot().getContext();
            ((LinearLayout) adapterUserRewardsBinding.getRoot().findViewById(C1188R.C1192id.llRewardPlayer)).setOnClickListener(new TrackRewardsAdapter$ViewHolder$$ExternalSyntheticLambda0(trackRewardsAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3692_init_$lambda0(TrackRewardsAdapter trackRewardsAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(trackRewardsAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            OnItemClicked onItemClicked = trackRewardsAdapter.getOnItemClicked();
            TrackerModel trackerModel = trackRewardsAdapter.getTrackerModels().get(viewHolder.getAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(trackerModel, "trackerModels[adapterPosition]");
            onItemClicked.onTrackerClick(trackerModel, viewHolder.getPosition());
        }

        public final void bind(TrackerModel trackerModel) {
            Intrinsics.checkNotNullParameter(trackerModel, "trackerModel");
            this.binding.setModel(trackerModel);
        }
    }

    public final void addList(boolean z, ArrayList<TrackerModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.trackerModels.clear();
        }
        this.trackerModels.addAll(arrayList);
        notifyDataSetChanged();
    }
}
