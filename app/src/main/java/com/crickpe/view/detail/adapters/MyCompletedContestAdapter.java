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
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterMyCompletedContestsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.FantasyTeams;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.MyContestModel;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000223B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011J\b\u0010\u001f\u001a\u00020 H\u0016J\u001c\u0010!\u001a\u00020\u001b2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020 H\u0017J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020 H\u0016J(\u0010(\u001a\u00020\u001b2\u0006\u0010)\u001a\u00020*2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020,0\u000fj\b\u0012\u0004\u0012\u00020,`\u0011H\u0002J\u0016\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00064"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter$OnItemClicked;", "context", "Landroid/content/Context;", "(Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter$OnItemClicked;Landroid/content/Context;)V", "adapter", "Lcom/crickpe/view/detail/adapters/SequenceAdapter;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "myContestModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestModel;", "Lkotlin/collections/ArrayList;", "getMyContestModels", "()Ljava/util/ArrayList;", "setMyContestModels", "(Ljava/util/ArrayList;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter$OnItemClicked;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAdapter", "binding", "Lcom/crickpe/databinding/AdapterMyCompletedContestsBinding;", "fantasyTeams", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/FantasyTeams;", "setNumber", "textView", "Landroid/widget/TextView;", "value", "", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyCompletedContestAdapter.kt */
public final class MyCompletedContestAdapter extends RecyclerView.Adapter<ViewHolder> {
    private SequenceAdapter adapter;
    private Context context;
    private ArrayList<MyContestModel> myContestModels = new ArrayList<>();
    private OnItemClicked onItemClicked;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter$OnItemClicked;", "", "onItemClicked", "", "MyContestModel", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyCompletedContestAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(MyContestModel myContestModel);
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

    public MyCompletedContestAdapter(OnItemClicked onItemClicked2, Context context2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(context2, "context");
        this.onItemClicked = onItemClicked2;
        this.context = context2;
    }

    public final ArrayList<MyContestModel> getMyContestModels() {
        return this.myContestModels;
    }

    public final void setMyContestModels(ArrayList<MyContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.myContestModels = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_my_completed_contests, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterMyCompletedContestsBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterMyCompletedContestsBinding;", "(Lcom/crickpe/view/detail/adapters/MyCompletedContestAdapter;Lcom/crickpe/databinding/AdapterMyCompletedContestsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyCompletedContestAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterMyCompletedContestsBinding binding;
        private final Context context;
        final /* synthetic */ MyCompletedContestAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MyCompletedContestAdapter myCompletedContestAdapter, AdapterMyCompletedContestsBinding adapterMyCompletedContestsBinding) {
            super(adapterMyCompletedContestsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterMyCompletedContestsBinding, "binding");
            this.this$0 = myCompletedContestAdapter;
            this.binding = adapterMyCompletedContestsBinding;
            this.context = adapterMyCompletedContestsBinding.getRoot().getContext();
            adapterMyCompletedContestsBinding.getRoot().setOnClickListener(new MyCompletedContestAdapter$ViewHolder$$ExternalSyntheticLambda0(myCompletedContestAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3456_init_$lambda0(MyCompletedContestAdapter myCompletedContestAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(myCompletedContestAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            if (myCompletedContestAdapter.getMyContestModels().get(viewHolder.getPosition()).isReject()) {
                Toast.makeText(viewHolder.context, "This contest has been rejected", 0).show();
                return;
            }
            OnItemClicked onItemClicked = myCompletedContestAdapter.getOnItemClicked();
            MyContestModel myContestModel = myCompletedContestAdapter.getMyContestModels().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(myContestModel, "myContestModels[position]");
            onItemClicked.onItemClicked(myContestModel);
        }

        public final void onBind(MyContestModel myContestModel) {
            Intrinsics.checkNotNullParameter(myContestModel, "topContestMode");
            this.binding.setModel(myContestModel);
            this.this$0.setAdapter(this.binding, myContestModel.getFantasyTeams());
        }
    }

    public int getItemCount() {
        return this.myContestModels.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        CharSequence charSequence;
        String str;
        ViewHolder viewHolder2 = viewHolder;
        int i2 = i;
        Intrinsics.checkNotNullParameter(viewHolder2, "holder");
        MyContestModel myContestModel = this.myContestModels.get(i2);
        Intrinsics.checkNotNullExpressionValue(myContestModel, "myContestModels[position]");
        viewHolder2.onBind(myContestModel);
        try {
            if (this.myContestModels.get(i2).isReject()) {
                TextView textView = (TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvRejectedMatch);
                Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvRejectedMatch");
                CommonMethodsKt.visible(textView);
            } else {
                TextView textView2 = (TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvRejectedMatch);
                Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvRejectedMatch");
                CommonMethodsKt.hide(textView2);
            }
            TextView textView3 = (TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvName);
            String name = this.myContestModels.get(i2).getName();
            textView3.setText(name != null ? name : "");
            if (this.myContestModels.get(i2).getContestType() == null) {
                ((CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
            }
            Log.v("TYEPPEPEPE", this.myContestModels.get(i2).getContestType().getTypeId() + this.myContestModels.get(i2).getName());
            int typeId = this.myContestModels.get(i2).getContestType().getTypeId();
            if (typeId == 1) {
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderCompleted)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.app_color_one_faded));
                ((RelativeLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.bottomLayout)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.white));
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderCompleted)).setBackgroundResource(C1188R.C1190drawable.border_private);
                if (this.myContestModels.get(i2).getUser() != null) {
                    CircleImageView circleImageView = (CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest);
                    Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivContest");
                    ImageView imageView = circleImageView;
                    String profilePic = this.myContestModels.get(i2).getUser().getProfilePic();
                    if (profilePic == null) {
                        str = "";
                    } else {
                        str = profilePic;
                    }
                    ExtensionsKt.loadImage$default(imageView, str, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                    ((TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvName)).setText(CommonMethodsKt.printInitialOnly(this.myContestModels.get(i2).getUser().getName().toString()) + "'s Contest");
                } else {
                    ((CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
                    TextView textView4 = (TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvName);
                    String name2 = this.myContestModels.get(i2).getName();
                    if (name2 != null) {
                        charSequence = name2;
                    } else {
                        charSequence = "";
                    }
                    textView4.setText(charSequence);
                }
                ((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestTypee)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_private_contest));
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestTypee), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{0.2f, 1.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.2f})});
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…2f)\n                    )");
                ofPropertyValuesHolder.setDuration(800);
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.start();
            } else if (typeId == 2) {
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderCompleted)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.white));
                ((RelativeLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.bottomLayout)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.app_color_one_faded));
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderCompleted)).setBackgroundResource(C1188R.C1190drawable.border_mega);
                ((CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
                ((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestTypee)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_mega_contest));
            } else if (typeId != 4) {
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderCompleted)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.white));
                ((RelativeLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.bottomLayout)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.app_color_one_faded));
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderCompleted)).setBackgroundResource(C1188R.C1190drawable.border_one_one);
                ((CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_one_one);
                ((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestTypee)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_one_one_contest));
            } else {
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderCompleted)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.white));
                ((RelativeLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.bottomLayout)).getBackground().setTint(this.context.getResources().getColor(C1188R.C1189color.app_color_one_faded));
                ((FrameLayout) viewHolder2.itemView.findViewById(C1188R.C1192id.flBorderCompleted)).setBackgroundResource(C1188R.C1190drawable.border_training);
                ((CircleImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.training_icon);
                ((ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivContestTypee)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_training_contest));
            }
            try {
                int size = this.myContestModels.get(i2).getFantasyTeams().size();
                double d = 0.0d;
                for (int i3 = 0; i3 < size; i3++) {
                    this.myContestModels.get(i2).getFantasyTeams().get(i3).getAmount();
                    d += (double) this.myContestModels.get(i2).getFantasyTeams().get(i3).getAmount();
                }
                if (d > 0.0d) {
                    ImageView imageView2 = (ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivDuck);
                    Intrinsics.checkNotNullExpressionValue(imageView2, "holder.itemView.ivDuck");
                    CommonMethodsKt.hide(imageView2);
                    TextView textView5 = (TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvIwon);
                    Intrinsics.checkNotNullExpressionValue(textView5, "holder.itemView.tvIwon");
                    CommonMethodsKt.visible(textView5);
                } else {
                    ImageView imageView3 = (ImageView) viewHolder2.itemView.findViewById(C1188R.C1192id.ivDuck);
                    Intrinsics.checkNotNullExpressionValue(imageView3, "holder.itemView.ivDuck");
                    CommonMethodsKt.visible(imageView3);
                    TextView textView6 = (TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvIwon);
                    Intrinsics.checkNotNullExpressionValue(textView6, "holder.itemView.tvIwon");
                    CommonMethodsKt.hide(textView6);
                }
                TextView textView7 = (TextView) viewHolder2.itemView.findViewById(C1188R.C1192id.tvIwon);
                Intrinsics.checkNotNullExpressionValue(textView7, "holder.itemView.tvIwon");
                setNumber(textView7, d);
            } catch (Exception e) {
                Log.v("EXC_WInnerAda", e.toString());
            }
        } catch (Exception e2) {
            Log.v("Exception", e2.toString());
        }
    }

    public final void addList(boolean z, ArrayList<MyContestModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.myContestModels.clear();
        }
        this.myContestModels.addAll(arrayList);
        notifyDataSetChanged();
    }

    public final void setNumber(TextView textView, double d) {
        String str;
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            double abs = Math.abs(d);
            if (abs >= 1.0E7d) {
                abs /= (double) 10000000;
                str = " Crores";
            } else if (abs >= 100000.0d) {
                abs /= (double) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
                str = " Lakhs";
            } else {
                str = " ";
            }
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###.##");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(abs);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
            textView.setText(8377 + format + str);
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    /* access modifiers changed from: private */
    public final void setAdapter(AdapterMyCompletedContestsBinding adapterMyCompletedContestsBinding, ArrayList<FantasyTeams> arrayList) {
        this.adapter = new SequenceAdapter(this.context);
        RecyclerView recyclerView = adapterMyCompletedContestsBinding.rvSequence;
        SequenceAdapter sequenceAdapter = this.adapter;
        SequenceAdapter sequenceAdapter2 = null;
        if (sequenceAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            sequenceAdapter = null;
        }
        recyclerView.setAdapter(sequenceAdapter);
        SequenceAdapter sequenceAdapter3 = this.adapter;
        if (sequenceAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            sequenceAdapter2 = sequenceAdapter3;
        }
        sequenceAdapter2.addList(true, arrayList);
    }
}
