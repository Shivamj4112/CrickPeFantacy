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
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterMyLiveContestsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.MyContestModel;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002&'B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fJ\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00192\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u001eH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006("}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter$OnItemClicked;", "context", "Landroid/content/Context;", "(Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter$OnItemClicked;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "myContestModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestModel;", "Lkotlin/collections/ArrayList;", "getMyContestModels", "()Ljava/util/ArrayList;", "setMyContestModels", "(Ljava/util/ArrayList;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter$OnItemClicked;)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyLiveContestAdapter.kt */
public final class MyLiveContestAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private ArrayList<MyContestModel> myContestModels = new ArrayList<>();
    private OnItemClicked onItemClicked;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter$OnItemClicked;", "", "onItemClicked", "", "MyContestModel", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyLiveContestAdapter.kt */
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

    public MyLiveContestAdapter(OnItemClicked onItemClicked2, Context context2) {
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
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_my_live_contests, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterMyLiveContestsBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterMyLiveContestsBinding;", "(Lcom/crickpe/view/detail/adapters/MyLiveContestAdapter;Lcom/crickpe/databinding/AdapterMyLiveContestsBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyLiveContestAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterMyLiveContestsBinding binding;
        private final Context context;
        final /* synthetic */ MyLiveContestAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MyLiveContestAdapter myLiveContestAdapter, AdapterMyLiveContestsBinding adapterMyLiveContestsBinding) {
            super(adapterMyLiveContestsBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterMyLiveContestsBinding, "binding");
            this.this$0 = myLiveContestAdapter;
            this.binding = adapterMyLiveContestsBinding;
            this.context = adapterMyLiveContestsBinding.getRoot().getContext();
            adapterMyLiveContestsBinding.getRoot().setOnClickListener(new MyLiveContestAdapter$ViewHolder$$ExternalSyntheticLambda0(myLiveContestAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3461_init_$lambda0(MyLiveContestAdapter myLiveContestAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(myLiveContestAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            if (myLiveContestAdapter.getMyContestModels().get(viewHolder.getPosition()).isReject()) {
                Toast.makeText(viewHolder.context, "No one has joined this contest!!", 0).show();
                return;
            }
            OnItemClicked onItemClicked = myLiveContestAdapter.getOnItemClicked();
            MyContestModel myContestModel = myLiveContestAdapter.getMyContestModels().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(myContestModel, "myContestModels[position]");
            onItemClicked.onItemClicked(myContestModel);
        }

        public final void onBind(MyContestModel myContestModel) {
            Intrinsics.checkNotNullParameter(myContestModel, "topContestMode");
            this.binding.setModel(myContestModel);
        }
    }

    public int getItemCount() {
        return this.myContestModels.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        MyContestModel myContestModel = this.myContestModels.get(i);
        Intrinsics.checkNotNullExpressionValue(myContestModel, "myContestModels[position]");
        viewHolder.onBind(myContestModel);
        try {
            if (this.myContestModels.get(i).getFantasyTeams().size() <= 1) {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvJoinWith)).setText(this.myContestModels.get(i).getFantasyTeams().size() + " team");
            } else {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvJoinWith)).setText(this.myContestModels.get(i).getFantasyTeams().size() + " teams");
            }
            if (this.myContestModels.get(i).getContestType() == null) {
                ((CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
            }
            int typeId = this.myContestModels.get(i).getContestType().getTypeId();
            if (typeId == 1) {
                if (this.myContestModels.get(i).getUser() != null) {
                    CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest);
                    Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivContest");
                    ImageView imageView = circleImageView;
                    String profilePic = this.myContestModels.get(i).getUser().getProfilePic();
                    if (profilePic == null) {
                        profilePic = "";
                    }
                    ExtensionsKt.loadImage$default(imageView, profilePic, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                    String printInitialOnly = CommonMethodsKt.printInitialOnly(this.myContestModels.get(i).getUser().getName().toString());
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setText(printInitialOnly + "'s Contest");
                } else {
                    ((CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.myContestModels.get(i).getName());
                }
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_private_contest));
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType), new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{0.2f, 1.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.2f})});
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(\n…fFloat(\"alpha\", 1f,0.2f))");
                ofPropertyValuesHolder.setDuration(800);
                ofPropertyValuesHolder.setRepeatCount(-1);
                ofPropertyValuesHolder.setRepeatMode(2);
                ofPropertyValuesHolder.start();
                ((FrameLayout) viewHolder.itemView.findViewById(C1188R.C1192id.flBorder)).setBackgroundResource(C1188R.C1190drawable.border_private);
            } else if (typeId == 2) {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.myContestModels.get(i).getName());
                ((FrameLayout) viewHolder.itemView.findViewById(C1188R.C1192id.flBorder)).setBackgroundResource(C1188R.C1190drawable.border_mega);
                ((CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_mega_pool);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_mega_contest));
            } else if (typeId != 4) {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.myContestModels.get(i).getName());
                ((CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.icon_one_one);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_one_one_contest));
                ((FrameLayout) viewHolder.itemView.findViewById(C1188R.C1192id.flBorder)).setBackgroundResource(C1188R.C1190drawable.border_one_one);
            } else {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvName)).setText(this.myContestModels.get(i).getName());
                ((FrameLayout) viewHolder.itemView.findViewById(C1188R.C1192id.flBorder)).setBackgroundResource(C1188R.C1190drawable.border_training);
                ((CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContest)).setImageResource(C1188R.C1190drawable.training_icon);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivContestType)).setImageDrawable(AppCompatResources.getDrawable(this.context, C1188R.C1190drawable.icon_training_contest));
            }
            int size = this.myContestModels.get(i).getFantasyTeams().size();
            int i2 = 0;
            while (i2 < size) {
                View inflate = LayoutInflater.from(this.context).inflate(C1188R.C1193layout.layout_team_sequence, (LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llTeamSequencee), false);
                Intrinsics.checkNotNullExpressionValue(inflate, "from(context)\n          …w.llTeamSequencee, false)");
                View findViewById = inflate.findViewById(C1188R.C1192id.tvTeamSequence);
                if (findViewById != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append('T');
                    sb.append(this.myContestModels.get(i).getFantasyTeams().get(i2).getSequence());
                    ((TextView) findViewById).setText(sb.toString());
                    ((LinearLayout) viewHolder.itemView.findViewById(C1188R.C1192id.llTeamSequencee)).addView(inflate);
                    i2++;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
            }
        } catch (Exception e) {
            Log.v("Exception", e.toString());
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
}
