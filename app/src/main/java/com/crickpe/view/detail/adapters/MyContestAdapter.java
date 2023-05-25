package com.crickpe.view.detail.adapters;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterMyContestsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;
import com.crickpe.view.intro.fragments.User;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002()B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0014\u0010\u001f\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u0000H\u0002J\u001c\u0010!\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016J\u0014\u0010'\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u0000H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006*"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyContestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/MyContestAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/MyContestAdapter$MyContestClick;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/detail/adapters/MyContestAdapter$MyContestClick;Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "myContestModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "Lkotlin/collections/ArrayList;", "getMyContestModels", "()Ljava/util/ArrayList;", "setMyContestModels", "(Ljava/util/ArrayList;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/MyContestAdapter$MyContestClick;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/MyContestAdapter$MyContestClick;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "hidePrice", "holder", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showPrice", "MyContestClick", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyContestAdapter.kt */
public final class MyContestAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private ArrayList<TopContestModel> myContestModels = new ArrayList<>();
    private MyContestClick onItemClicked;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyContestAdapter$MyContestClick;", "", "myContestClick", "", "top", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyContestAdapter.kt */
    public interface MyContestClick {
        void myContestClick(TopContestModel topContestModel);
    }

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final MyContestClick getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public final void setOnItemClicked(MyContestClick myContestClick) {
        Intrinsics.checkNotNullParameter(myContestClick, "<set-?>");
        this.onItemClicked = myContestClick;
    }

    public MyContestAdapter(MyContestClick myContestClick, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(myContestClick, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = myContestClick;
        this.context = fragmentActivity;
    }

    public final ArrayList<TopContestModel> getMyContestModels() {
        return this.myContestModels;
    }

    public final void setMyContestModels(ArrayList<TopContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.myContestModels = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_my_contests, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterMyContestsBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyContestAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterMyContestsBinding;", "(Lcom/crickpe/view/detail/adapters/MyContestAdapter;Lcom/crickpe/databinding/AdapterMyContestsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyContestAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterMyContestsBinding binding;
        private final Context context;
        final /* synthetic */ MyContestAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MyContestAdapter myContestAdapter, AdapterMyContestsBinding adapterMyContestsBinding) {
            super(adapterMyContestsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterMyContestsBinding, "binding");
            this.this$0 = myContestAdapter;
            this.binding = adapterMyContestsBinding;
            this.context = adapterMyContestsBinding.getRoot().getContext();
            adapterMyContestsBinding.getRoot().setOnClickListener(new MyContestAdapter$ViewHolder$$ExternalSyntheticLambda0(myContestAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3459_init_$lambda0(MyContestAdapter myContestAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(myContestAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            MyContestClick onItemClicked = myContestAdapter.getOnItemClicked();
            TopContestModel topContestModel = myContestAdapter.getMyContestModels().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(topContestModel, "myContestModels[position]");
            onItemClicked.myContestClick(topContestModel);
        }

        public final void onBind(TopContestModel topContestModel) {
            Intrinsics.checkNotNullParameter(topContestModel, "topContestMode");
            this.binding.setModel(topContestModel);
        }
    }

    public int getItemCount() {
        return this.myContestModels.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        Intrinsics.checkNotNullParameter(viewHolder2, "holder");
        TopContestModel topContestModel = this.myContestModels.get(i2);
        Intrinsics.checkNotNullExpressionValue(topContestModel, "myContestModels[position]");
        viewHolder2.onBind(topContestModel);
        try {
            if (this.myContestModels.get(i2).getFantasyTeams().size() <= 1) {
                ((TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvJoinWith)).setText(this.myContestModels.get(i2).getFantasyTeams().size() + " team");
            } else {
                ((TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvJoinWith)).setText(this.myContestModels.get(i2).getFantasyTeams().size() + " teams");
            }
            int typeId = this.myContestModels.get(i2).getContestType().getTypeId();
            if (typeId == 1) {
                showPrice(viewHolder);
                String str = this.myContestModels.get(i2).getUser().get_id();
                User userProfile = UserManager.INSTANCE.getUserProfile();
                if (Intrinsics.areEqual((Object) str, (Object) String.valueOf(userProfile != null ? userProfile.get_id() : null))) {
                    ((TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.myContestModels.get(i2).getName());
                    RelativeLayout relativeLayout = (RelativeLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.rlMyContest);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout, "holder.itemView.rlMyContest");
                    CommonMethodsKt.visible(relativeLayout);
                } else {
                    String printInitialOnly = CommonMethodsKt.printInitialOnly(this.myContestModels.get(i2).getUser().getName().toString());
                    ((TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvName)).setText(printInitialOnly + "'s Contest");
                }
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderMyContest)).setBackgroundResource(C1188R.C1190drawable.border_private);
                LinearLayout linearLayout = (LinearLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.llProgress);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.llProgress");
                CommonMethodsKt.visible(linearLayout);
                if (this.myContestModels.get(i2).getUser() != null) {
                    CircleImageView circleImageView = (CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest);
                    Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivContest");
                    ImageView imageView = circleImageView;
                    String profilePic = this.myContestModels.get(i2).getUser().getProfilePic();
                    if (profilePic == null) {
                        profilePic = "";
                    }
                    ExtensionsKt.loadImage$default(imageView, profilePic, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                } else {
                    ((CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
                }
                ((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_private_contest));
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestType), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{0.2f, 1.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.2f})});
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…2f)\n                    )");
                ofPropertyValuesHolder.setDuration(800);
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.start();
            } else if (typeId == 2) {
                showPrice(viewHolder);
                ((TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.myContestModels.get(i2).getName());
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderMyContest)).setBackgroundResource(C1188R.C1190drawable.border_mega);
                ((CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
                LinearLayout linearLayout2 = (LinearLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.llProgress);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "holder.itemView.llProgress");
                CommonMethodsKt.visible(linearLayout2);
                ((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_mega_contest));
                RelativeLayout relativeLayout2 = (RelativeLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.rlMyContest);
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "holder.itemView.rlMyContest");
                CommonMethodsKt.hide(relativeLayout2);
            } else if (typeId != 4) {
                showPrice(viewHolder);
                ((TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.myContestModels.get(i2).getName());
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderMyContest)).setBackgroundResource(C1188R.C1190drawable.border_one_one);
                RelativeLayout relativeLayout3 = (RelativeLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.rlMyContest);
                Intrinsics.checkNotNullExpressionValue(relativeLayout3, "holder.itemView.rlMyContest");
                CommonMethodsKt.hide(relativeLayout3);
                LinearLayout linearLayout3 = (LinearLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.llProgress);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "holder.itemView.llProgress");
                CommonMethodsKt.hide(linearLayout3);
                ((CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_one_one);
                ((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_one_one_contest));
            } else {
                hidePrice(viewHolder);
                ((TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.myContestModels.get(i2).getName());
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderMyContest)).setBackgroundResource(C1188R.C1190drawable.border_training);
                ((CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.training_icon);
                LinearLayout linearLayout4 = (LinearLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.llProgress);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "holder.itemView.llProgress");
                CommonMethodsKt.visible(linearLayout4);
                ((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_training_contest));
                RelativeLayout relativeLayout4 = (RelativeLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.rlMyContest);
                Intrinsics.checkNotNullExpressionValue(relativeLayout4, "holder.itemView.rlMyContest");
                CommonMethodsKt.hide(relativeLayout4);
            }
        } catch (Exception e) {
            Log.v("Exception", e.toString());
        }
        ((LinearLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.llTeamSequence)).removeAllViews();
        int size = this.myContestModels.get(i2).getFantasyTeams().size();
        int i3 = 0;
        while (i3 < size) {
            View inflate = LayoutInflater.from(this.context).inflate(C1188R.C1193layout.layout_team_sequence, (LinearLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.llTeamSequence), false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(context)\n          …ew.llTeamSequence, false)");
            View findViewById = inflate.findViewById(C1188R.C1192id.tvTeamSequence);
            if (findViewById != null) {
                StringBuilder sb = new StringBuilder();
                sb.append('T');
                sb.append(this.myContestModels.get(i2).getFantasyTeams().get(i3).getSequence());
                ((TextView) findViewById).setText(sb.toString());
                ((LinearLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.llTeamSequence)).addView(inflate);
                i3++;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
        }
    }

    private final void showPrice(ViewHolder viewHolder) {
        TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMyTraining);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvMyTraining");
        CommonMethodsKt.hide(textView);
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMyGlory);
        Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvMyGlory");
        CommonMethodsKt.hide(textView2);
        TextView textView3 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMyPrice);
        Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.tvMyPrice");
        CommonMethodsKt.visible(textView3);
        TextView textView4 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAmount);
        Intrinsics.checkNotNullExpressionValue(textView4, "holder.itemView.tvAmount");
        CommonMethodsKt.visible(textView4);
        LinearLayout linearLayout = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llWinPercentagee);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.llWinPercentagee");
        CommonMethodsKt.visible(linearLayout);
        TextView textView5 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.rvMainWinnAmount);
        Intrinsics.checkNotNullExpressionValue(textView5, "holder.itemView.rvMainWinnAmount");
        CommonMethodsKt.visible(textView5);
    }

    private final void hidePrice(ViewHolder viewHolder) {
        TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMyTraining);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvMyTraining");
        CommonMethodsKt.visible(textView);
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMyGlory);
        Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvMyGlory");
        CommonMethodsKt.visible(textView2);
        TextView textView3 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMyPrice);
        Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.tvMyPrice");
        CommonMethodsKt.hide(textView3);
        TextView textView4 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAmount);
        Intrinsics.checkNotNullExpressionValue(textView4, "holder.itemView.tvAmount");
        CommonMethodsKt.hide(textView4);
        LinearLayout linearLayout = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llWinPercentagee);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.llWinPercentagee");
        CommonMethodsKt.hide(linearLayout);
        TextView textView5 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.rvMainWinnAmount);
        Intrinsics.checkNotNullExpressionValue(textView5, "holder.itemView.rvMainWinnAmount");
        CommonMethodsKt.hide(textView5);
    }

    public final void addList(boolean z, ArrayList<TopContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.myContestModels.clear();
        }
        this.myContestModels.addAll(arrayList);
        notifyDataSetChanged();
    }
}
