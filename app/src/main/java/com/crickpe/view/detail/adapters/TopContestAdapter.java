package com.crickpe.view.detail.adapters;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.Resources;
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
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterTopContestsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002()B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0014\u0010\u001f\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u0000H\u0002J\u001c\u0010!\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u001c\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001eH\u0016J\u0014\u0010'\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u0000H\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006*"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/TopContestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/TopContestAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/TopContestAdapter$OnItemClicked;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/detail/adapters/TopContestAdapter$OnItemClicked;Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/TopContestAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/TopContestAdapter$OnItemClicked;)V", "topContestModel", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "Lkotlin/collections/ArrayList;", "getTopContestModel", "()Ljava/util/ArrayList;", "setTopContestModel", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "hidePrice", "holder", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "showPrice", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopContestAdapter.kt */
public final class TopContestAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private OnItemClicked onItemClicked;
    private ArrayList<TopContestModel> topContestModel = new ArrayList<>();

    @Metadata(mo48221d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/TopContestAdapter$OnItemClicked;", "", "onItemClicked", "", "topContestModel", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "onPriceClicked", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopContestAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(TopContestModel topContestModel);

        void onPriceClicked(TopContestModel topContestModel);
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

    public TopContestAdapter(OnItemClicked onItemClicked2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = onItemClicked2;
        this.context = fragmentActivity;
    }

    public final ArrayList<TopContestModel> getTopContestModel() {
        return this.topContestModel;
    }

    public final void setTopContestModel(ArrayList<TopContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.topContestModel = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_top_contests, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterTopContestsBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/TopContestAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterTopContestsBinding;", "(Lcom/crickpe/view/detail/adapters/TopContestAdapter;Lcom/crickpe/databinding/AdapterTopContestsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopContestAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterTopContestsBinding binding;
        private final Context context;
        final /* synthetic */ TopContestAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(TopContestAdapter topContestAdapter, AdapterTopContestsBinding adapterTopContestsBinding) {
            super(adapterTopContestsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterTopContestsBinding, "binding");
            this.this$0 = topContestAdapter;
            this.binding = adapterTopContestsBinding;
            this.context = adapterTopContestsBinding.getRoot().getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(TopContestModel topContestModel) {
            Intrinsics.checkNotNullParameter(topContestModel, "topContestMode");
            this.binding.setModel(topContestModel);
        }
    }

    public int getItemCount() {
        return this.topContestModel.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        TopContestModel topContestModel2 = this.topContestModel.get(i);
        Intrinsics.checkNotNullExpressionValue(topContestModel2, "topContestModel[position]");
        viewHolder.onBind(topContestModel2);
        ((CardView) viewHolder.itemView.findViewById(C1188R.C1192id.cvContest)).setOnClickListener(new TopContestAdapter$$ExternalSyntheticLambda0(this, i));
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFee)).setOnClickListener(new TopContestAdapter$$ExternalSyntheticLambda1(this, i));
        try {
            int typeId = this.topContestModel.get(i).getContestType().getTypeId();
            if (typeId == 1) {
                showPrice(viewHolder);
                LinearLayout linearLayout = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llProgress);
                Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.llProgress");
                CommonMethodsKt.visible(linearLayout);
                String printInitialOnly = CommonMethodsKt.printInitialOnly(this.topContestModel.get(i).getUser().getName());
                if (printInitialOnly == null) {
                    printInitialOnly = "Contest";
                }
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvNamee)).setText(printInitialOnly + "'s Contest");
                DrawableCompat.setTint(((CardView) viewHolder.itemView.findViewById(C1188R.C1192id.cvContest)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.app_color_one_faded));
                DrawableCompat.setTint(((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBottom)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.white));
                if (this.topContestModel.get(i).getUser() != null) {
                    RequestManager with = Glide.with(this.context);
                    StringBuilder sb = new StringBuilder();
                    SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                    sb.append(appSettings != null ? appSettings.getImageBaseUrl() : null);
                    sb.append(this.topContestModel.get(i).getUser().getProfilePic());
                    with.load(sb.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest));
                }
                ImageView imageView = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivVipTag);
                Intrinsics.checkNotNullExpressionValue(imageView, "holder.itemView.ivVipTag");
                CommonMethodsKt.visible(imageView);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_private_contest));
                ((FrameLayout) viewHolder.itemView.findViewById(C1188R.C1192id.flBorderContest)).setBackgroundResource(C1188R.C1190drawable.border_private);
                DrawableCompat.setTint(((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFee)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.red_dark_l));
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{0.2f, 1.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.2f})});
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…2f)\n                    )");
                ofPropertyValuesHolder.setDuration(800);
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.start();
            } else if (typeId == 2) {
                showPrice(viewHolder);
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvNamee)).setText(this.topContestModel.get(i).getName());
                ((FrameLayout) viewHolder.itemView.findViewById(C1188R.C1192id.flBorderContest)).setBackgroundResource(C1188R.C1190drawable.border_mega);
                LinearLayout linearLayout2 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llProgress);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "holder.itemView.llProgress");
                CommonMethodsKt.visible(linearLayout2);
                DrawableCompat.setTint(((CardView) viewHolder.itemView.findViewById(C1188R.C1192id.cvContest)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.card_bg_));
                DrawableCompat.setTint(((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFee)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.green));
                DrawableCompat.setTint(((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBottom)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.app_color_one_faded));
                ImageView imageView2 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivVipTag);
                Intrinsics.checkNotNullExpressionValue(imageView2, "holder.itemView.ivVipTag");
                CommonMethodsKt.hide(imageView2);
                ((CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_mega_contest));
            } else if (typeId != 4) {
                showPrice(viewHolder);
                TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvNamee);
                String name = this.topContestModel.get(i).getName();
                if (name != null) {
                    charSequence2 = name;
                } else {
                    charSequence2 = "";
                }
                textView.setText(charSequence2);
                LinearLayout linearLayout3 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llProgress);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "holder.itemView.llProgress");
                CommonMethodsKt.hide(linearLayout3);
                DrawableCompat.setTint(((CardView) viewHolder.itemView.findViewById(C1188R.C1192id.cvContest)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.card_bg_));
                DrawableCompat.setTint(((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBottom)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.app_color_one_faded));
                ((CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_one_one);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_one_one_contest));
                ImageView imageView3 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivVipTag);
                Intrinsics.checkNotNullExpressionValue(imageView3, "holder.itemView.ivVipTag");
                CommonMethodsKt.hide(imageView3);
                ((FrameLayout) viewHolder.itemView.findViewById(C1188R.C1192id.flBorderContest)).setBackgroundResource(C1188R.C1190drawable.border_one_one);
                DrawableCompat.setTint(((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFee)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.yellow));
            } else {
                hidePrice(viewHolder);
                TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvNamee);
                String name2 = this.topContestModel.get(i).getName();
                if (name2 != null) {
                    charSequence = name2;
                } else {
                    charSequence = "";
                }
                textView2.setText(charSequence);
                ((FrameLayout) viewHolder.itemView.findViewById(C1188R.C1192id.flBorderContest)).setBackgroundResource(C1188R.C1190drawable.border_training);
                LinearLayout linearLayout4 = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llProgress);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "holder.itemView.llProgress");
                CommonMethodsKt.visible(linearLayout4);
                DrawableCompat.setTint(((CardView) viewHolder.itemView.findViewById(C1188R.C1192id.cvContest)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.card_bg_));
                DrawableCompat.setTint(((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFee)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.app_color_one));
                DrawableCompat.setTint(((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBottom)).getBackground(), ContextCompat.getColor(this.context, C1188R.C1189color.app_color_one_faded));
                ImageView imageView4 = (ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivVipTag);
                Intrinsics.checkNotNullExpressionValue(imageView4, "holder.itemView.ivVipTag");
                CommonMethodsKt.hide(imageView4);
                ((CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.training_icon);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_training_contest));
            }
            if (this.topContestModel.get(i).getCanJoinContest()) {
                TextView textView3 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFee);
                Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.tvFee");
                CommonMethodsKt.visible(textView3);
                TextView textView4 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFee2);
                Intrinsics.checkNotNullExpressionValue(textView4, "holder.itemView.tvFee2");
                CommonMethodsKt.hide(textView4);
                return;
            }
            TextView textView5 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFee);
            Intrinsics.checkNotNullExpressionValue(textView5, "holder.itemView.tvFee");
            CommonMethodsKt.hide(textView5);
            TextView textView6 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFee2);
            Intrinsics.checkNotNullExpressionValue(textView6, "holder.itemView.tvFee2");
            CommonMethodsKt.visible(textView6);
        } catch (Exception e) {
            Log.v("EXCEPTION8", e.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m3471onBindViewHolder$lambda0(TopContestAdapter topContestAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(topContestAdapter, "this$0");
        if (topContestAdapter.topContestModel.get(i).getTotalSpots() - topContestAdapter.topContestModel.get(i).getJoinedUserCount() <= 0) {
            FragmentActivity fragmentActivity = topContestAdapter.context;
            if (fragmentActivity != null) {
                Resources resources = fragmentActivity.getResources();
                Intrinsics.checkNotNull(resources);
                String string = resources.getString(C1188R.string.contest_full);
                Intrinsics.checkNotNullExpressionValue(string, "context.resources!!.getS…ng(R.string.contest_full)");
                ExtensionsKt.showToast((Context) fragmentActivity, (CharSequence) string);
                return;
            }
            return;
        }
        OnItemClicked onItemClicked2 = topContestAdapter.onItemClicked;
        TopContestModel topContestModel2 = topContestAdapter.topContestModel.get(i);
        Intrinsics.checkNotNullExpressionValue(topContestModel2, "topContestModel[position]");
        onItemClicked2.onItemClicked(topContestModel2);
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-1  reason: not valid java name */
    public static final void m3472onBindViewHolder$lambda1(TopContestAdapter topContestAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(topContestAdapter, "this$0");
        if (topContestAdapter.topContestModel.get(i).getTotalSpots() - topContestAdapter.topContestModel.get(i).getJoinedUserCount() <= 0) {
            FragmentActivity fragmentActivity = topContestAdapter.context;
            Resources resources = fragmentActivity.getResources();
            Intrinsics.checkNotNull(resources);
            String string = resources.getString(C1188R.string.contest_full);
            Intrinsics.checkNotNullExpressionValue(string, "context.resources!!.getS…ng(R.string.contest_full)");
            ExtensionsKt.showToast((Context) fragmentActivity, (CharSequence) string);
            return;
        }
        OnItemClicked onItemClicked2 = topContestAdapter.onItemClicked;
        TopContestModel topContestModel2 = topContestAdapter.topContestModel.get(i);
        Intrinsics.checkNotNullExpressionValue(topContestModel2, "topContestModel[position]");
        onItemClicked2.onPriceClicked(topContestModel2);
    }

    private final void showPrice(ViewHolder viewHolder) {
        TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvGlory);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvGlory");
        CommonMethodsKt.hide(textView);
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTraining);
        Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvTraining");
        CommonMethodsKt.hide(textView2);
        TextView textView3 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.megaAmount);
        Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.megaAmount");
        CommonMethodsKt.visible(textView3);
        TextView textView4 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPrice);
        Intrinsics.checkNotNullExpressionValue(textView4, "holder.itemView.tvPrice");
        CommonMethodsKt.visible(textView4);
        LinearLayout linearLayout = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llWinPercentage);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.llWinPercentage");
        CommonMethodsKt.visible(linearLayout);
        TextView textView5 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFirstWinningAmount);
        Intrinsics.checkNotNullExpressionValue(textView5, "holder.itemView.tvFirstWinningAmount");
        CommonMethodsKt.visible(textView5);
    }

    private final void hidePrice(ViewHolder viewHolder) {
        TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvGlory);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvGlory");
        CommonMethodsKt.visible(textView);
        TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTraining);
        Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvTraining");
        CommonMethodsKt.visible(textView2);
        TextView textView3 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.megaAmount);
        Intrinsics.checkNotNullExpressionValue(textView3, "holder.itemView.megaAmount");
        CommonMethodsKt.hide(textView3);
        TextView textView4 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPrice);
        Intrinsics.checkNotNullExpressionValue(textView4, "holder.itemView.tvPrice");
        CommonMethodsKt.hide(textView4);
        LinearLayout linearLayout = (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llWinPercentage);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "holder.itemView.llWinPercentage");
        CommonMethodsKt.hide(linearLayout);
        TextView textView5 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvFirstWinningAmount);
        Intrinsics.checkNotNullExpressionValue(textView5, "holder.itemView.tvFirstWinningAmount");
        CommonMethodsKt.hide(textView5);
    }

    public final void addList(boolean z, ArrayList<TopContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.topContestModel.clear();
        }
        this.topContestModel.addAll(arrayList);
        notifyDataSetChanged();
    }
}
