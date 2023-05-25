package com.crickpe.view.detail.adapters;

import android.app.Dialog;
import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterUpcomingMatchNewBinding;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003123B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001c\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0017H\u0002J\u0018\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010&\u001a\u00020!H\u0016J\u0018\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020!H\u0016J\u0010\u0010+\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0002H\u0016J\u0016\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000200R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u00064"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$MyViewHolder;", "context", "Landroid/content/Context;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$OnItemClicked;", "isHome", "", "(Landroid/content/Context;Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$OnItemClicked;Z)V", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "()Z", "setHome", "(Z)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$OnItemClicked;)V", "upcomingMatchModels", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "getUpcomingMatchModels", "()Ljava/util/ArrayList;", "setUpcomingMatchModels", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "list", "getItemCount", "", "matchInfoDialog", "upcomingMatchModel", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewRecycled", "setNumber", "textView", "Landroid/widget/TextView;", "value", "", "MyViewHolder", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UpcomingMatchesAdapter.kt */
public final class UpcomingMatchesAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private Context context;
    private boolean isHome;
    private OnItemClicked onItemClicked;
    private ArrayList<UpcomingMatchModel> upcomingMatchModels = new ArrayList<>();

    @Metadata(mo48221d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$OnItemClicked;", "", "onItemClicked", "", "upcomingMatchModel", "Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "onTimeFinish", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: UpcomingMatchesAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(UpcomingMatchModel upcomingMatchModel);

        void onTimeFinish();
    }

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public final boolean isHome() {
        return this.isHome;
    }

    public final void setHome(boolean z) {
        this.isHome = z;
    }

    public UpcomingMatchesAdapter(Context context2, OnItemClicked onItemClicked2, boolean z) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        this.context = context2;
        this.onItemClicked = onItemClicked2;
        this.isHome = z;
    }

    public final ArrayList<UpcomingMatchModel> getUpcomingMatchModels() {
        return this.upcomingMatchModels;
    }

    public final void setUpcomingMatchModels(ArrayList<UpcomingMatchModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.upcomingMatchModels = arrayList;
    }

    @Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/crickpe/databinding/AdapterUpcomingMatchNewBinding;", "(Lcom/crickpe/databinding/AdapterUpcomingMatchNewBinding;)V", "binding", "getBinding", "()Lcom/crickpe/databinding/AdapterUpcomingMatchNewBinding;", "setBinding", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "setCountDownTimer", "(Landroid/os/CountDownTimer;)V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: UpcomingMatchesAdapter.kt */
    public static final class MyViewHolder extends RecyclerView.ViewHolder {
        private AdapterUpcomingMatchNewBinding binding;
        private CountDownTimer countDownTimer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MyViewHolder(AdapterUpcomingMatchNewBinding adapterUpcomingMatchNewBinding) {
            super(adapterUpcomingMatchNewBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterUpcomingMatchNewBinding, "itemView");
            this.binding = adapterUpcomingMatchNewBinding;
        }

        public final AdapterUpcomingMatchNewBinding getBinding() {
            return this.binding;
        }

        public final void setBinding(AdapterUpcomingMatchNewBinding adapterUpcomingMatchNewBinding) {
            Intrinsics.checkNotNullParameter(adapterUpcomingMatchNewBinding, "<set-?>");
            this.binding = adapterUpcomingMatchNewBinding;
        }

        public final CountDownTimer getCountDownTimer() {
            return this.countDownTimer;
        }

        public final void setCountDownTimer(CountDownTimer countDownTimer2) {
            this.countDownTimer = countDownTimer2;
        }
    }

    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_upcoming_match_new, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        AdapterUpcomingMatchNewBinding adapterUpcomingMatchNewBinding = (AdapterUpcomingMatchNewBinding) inflate;
        if (this.isHome) {
            adapterUpcomingMatchNewBinding.getRoot().setLayoutParams(new ViewGroup.LayoutParams((int) (((double) ExtensionsKt.getWidth(this.context)) * 0.6d), -2));
        }
        return new MyViewHolder(adapterUpcomingMatchNewBinding);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterUpcomingMatchNewBinding;", "(Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter;Lcom/crickpe/databinding/AdapterUpcomingMatchNewBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "upcmingMatchModel", "Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: UpcomingMatchesAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterUpcomingMatchNewBinding binding;
        private final Context context;
        final /* synthetic */ UpcomingMatchesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(UpcomingMatchesAdapter upcomingMatchesAdapter, AdapterUpcomingMatchNewBinding adapterUpcomingMatchNewBinding) {
            super(adapterUpcomingMatchNewBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterUpcomingMatchNewBinding, "binding");
            this.this$0 = upcomingMatchesAdapter;
            this.binding = adapterUpcomingMatchNewBinding;
            this.context = adapterUpcomingMatchNewBinding.getRoot().getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(UpcomingMatchModel upcomingMatchModel) {
            Intrinsics.checkNotNullParameter(upcomingMatchModel, "upcmingMatchModel");
            this.binding.setModel(upcomingMatchModel);
        }
    }

    public int getItemCount() {
        return this.upcomingMatchModels.size();
    }

    public void onViewRecycled(MyViewHolder myViewHolder) {
        Intrinsics.checkNotNullParameter(myViewHolder, "holder");
        super.onViewRecycled(myViewHolder);
        CountDownTimer countDownTimer = myViewHolder.getCountDownTimer();
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        myViewHolder.setCountDownTimer((CountDownTimer) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x008b A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00ab A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00f8 A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x010a A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0140 A[SYNTHETIC, Splitter:B:19:0x0140] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0185 A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0216 A[Catch:{ Exception -> 0x021c }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0217 A[Catch:{ Exception -> 0x021c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBindViewHolder(MyViewHolder r8, int r9) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r1 = com.crickpe.C1188R.C1192id.ivInfoMatch     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x021c }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.adapters.UpcomingMatchesAdapter$$ExternalSyntheticLambda0 r1 = new com.crickpe.view.detail.adapters.UpcomingMatchesAdapter$$ExternalSyntheticLambda0     // Catch:{ Exception -> 0x021c }
            r1.<init>(r7, r9)     // Catch:{ Exception -> 0x021c }
            r0.setOnClickListener(r1)     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r1 = com.crickpe.C1188R.C1192id.tvTeamCode1     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r1 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r1 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r1     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.home.fragments.home.Team1 r1 = r1.getTeam1()     // Catch:{ Exception -> 0x021c }
            java.lang.String r1 = r1.getCode()     // Catch:{ Exception -> 0x021c }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x021c }
            r0.setText(r1)     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r1 = com.crickpe.C1188R.C1192id.tvTeamCode2     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r1)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r1 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r1 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r1     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.home.fragments.home.Team2 r1 = r1.getTeam2()     // Catch:{ Exception -> 0x021c }
            java.lang.String r1 = r1.getCode()     // Catch:{ Exception -> 0x021c }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x021c }
            r0.setText(r1)     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r0 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r0 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r0     // Catch:{ Exception -> 0x021c }
            long r0 = r0.getRemainingTime()     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.adapters.UpcomingMatchesAdapter$onBindViewHolder$2 r2 = new com.crickpe.view.detail.adapters.UpcomingMatchesAdapter$onBindViewHolder$2     // Catch:{ Exception -> 0x021c }
            r2.<init>(r8, r7, r0)     // Catch:{ Exception -> 0x021c }
            android.os.CountDownTimer r0 = r2.start()     // Catch:{ Exception -> 0x021c }
            r8.setCountDownTimer(r0)     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r0 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r0 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r0     // Catch:{ Exception -> 0x021c }
            java.lang.String r0 = r0.getCustomMatchName()     // Catch:{ Exception -> 0x021c }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x021c }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0088
            int r0 = r0.length()     // Catch:{ Exception -> 0x021c }
            if (r0 != 0) goto L_0x0086
            goto L_0x0088
        L_0x0086:
            r0 = 0
            goto L_0x0089
        L_0x0088:
            r0 = 1
        L_0x0089:
            if (r0 != 0) goto L_0x00ab
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r3 = com.crickpe.C1188R.C1192id.textView17     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r3 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r3 = r3.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r3 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r3     // Catch:{ Exception -> 0x021c }
            java.lang.String r3 = r3.getCustomMatchName()     // Catch:{ Exception -> 0x021c }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x021c }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x021c }
            r0.setText(r3)     // Catch:{ Exception -> 0x021c }
            goto L_0x00e6
        L_0x00ab:
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r3 = com.crickpe.C1188R.C1192id.textView17     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x021c }
            r3.<init>()     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r4 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r4 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r4     // Catch:{ Exception -> 0x021c }
            java.lang.String r4 = r4.getFormat()     // Catch:{ Exception -> 0x021c }
            r3.append(r4)     // Catch:{ Exception -> 0x021c }
            java.lang.String r4 = " | "
            r3.append(r4)     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r4 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r4 = r4.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r4 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r4     // Catch:{ Exception -> 0x021c }
            java.lang.String r4 = r4.getTitle()     // Catch:{ Exception -> 0x021c }
            r3.append(r4)     // Catch:{ Exception -> 0x021c }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x021c }
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x021c }
            r0.setText(r3)     // Catch:{ Exception -> 0x021c }
        L_0x00e6:
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r0 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r0 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r0     // Catch:{ Exception -> 0x021c }
            double r3 = r0.getMegaPrize()     // Catch:{ Exception -> 0x021c }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x010a
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r3 = com.crickpe.C1188R.C1192id.textView19     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            java.lang.String r3 = "-"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x021c }
            r0.setText(r3)     // Catch:{ Exception -> 0x021c }
            goto L_0x0128
        L_0x010a:
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r3 = com.crickpe.C1188R.C1192id.textView19     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            java.lang.String r3 = "holder.itemView.textView19"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r3 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r3 = r3.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r3 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r3     // Catch:{ Exception -> 0x021c }
            double r3 = r3.getMegaPrize()     // Catch:{ Exception -> 0x021c }
            r7.setNumber(r0, r3)     // Catch:{ Exception -> 0x021c }
        L_0x0128:
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r0 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r0 = r0.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r0 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r0     // Catch:{ Exception -> 0x021c }
            java.util.List r0 = r0.getVipList()     // Catch:{ Exception -> 0x021c }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ Exception -> 0x021c }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x021c }
            r0 = r0 ^ r1
            java.lang.String r3 = "holder.itemView.ivVipTag"
            r4 = 0
            if (r0 == 0) goto L_0x0185
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r5 = com.crickpe.C1188R.C1192id.ivVipTag     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r5)     // Catch:{ Exception -> 0x021c }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x021c }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x021c }
            com.crickpe.utils.CommonMethodsKt.visible(r0)     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r3 = com.crickpe.C1188R.C1192id.textView17     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            if (r0 == 0) goto L_0x0163
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ Exception -> 0x021c }
            goto L_0x0164
        L_0x0163:
            r0 = r4
        L_0x0164:
            boolean r3 = r0 instanceof android.view.ViewGroup.MarginLayoutParams     // Catch:{ Exception -> 0x021c }
            if (r3 == 0) goto L_0x016b
            r4 = r0
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4     // Catch:{ Exception -> 0x021c }
        L_0x016b:
            if (r4 == 0) goto L_0x0172
            r0 = 40
            r4.setMargins(r0, r2, r2, r2)     // Catch:{ Exception -> 0x021c }
        L_0x0172:
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r2 = com.crickpe.C1188R.C1192id.textView17     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            if (r0 != 0) goto L_0x017f
            goto L_0x01c7
        L_0x017f:
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4     // Catch:{ Exception -> 0x021c }
            r0.setLayoutParams(r4)     // Catch:{ Exception -> 0x021c }
            goto L_0x01c7
        L_0x0185:
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r5 = com.crickpe.C1188R.C1192id.ivVipTag     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r5)     // Catch:{ Exception -> 0x021c }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x021c }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = (android.view.View) r0     // Catch:{ Exception -> 0x021c }
            com.crickpe.utils.CommonMethodsKt.hide(r0)     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r3 = com.crickpe.C1188R.C1192id.textView17     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r3)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            if (r0 == 0) goto L_0x01a8
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()     // Catch:{ Exception -> 0x021c }
            goto L_0x01a9
        L_0x01a8:
            r0 = r4
        L_0x01a9:
            boolean r3 = r0 instanceof android.view.ViewGroup.MarginLayoutParams     // Catch:{ Exception -> 0x021c }
            if (r3 == 0) goto L_0x01b0
            r4 = r0
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4     // Catch:{ Exception -> 0x021c }
        L_0x01b0:
            if (r4 == 0) goto L_0x01b5
            r4.setMargins(r2, r2, r2, r2)     // Catch:{ Exception -> 0x021c }
        L_0x01b5:
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r2 = com.crickpe.C1188R.C1192id.textView17     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x021c }
            android.widget.TextView r0 = (android.widget.TextView) r0     // Catch:{ Exception -> 0x021c }
            if (r0 != 0) goto L_0x01c2
            goto L_0x01c7
        L_0x01c2:
            android.view.ViewGroup$LayoutParams r4 = (android.view.ViewGroup.LayoutParams) r4     // Catch:{ Exception -> 0x021c }
            r0.setLayoutParams(r4)     // Catch:{ Exception -> 0x021c }
        L_0x01c7:
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r2 = com.crickpe.C1188R.C1192id.ivTeam1Flag     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x021c }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x021c }
            java.lang.String r2 = "holder.itemView.ivTeam1Flag"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ Exception -> 0x021c }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r2 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r2 = r2.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r2 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r2     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.home.fragments.home.Team1 r2 = r2.getTeam1()     // Catch:{ Exception -> 0x021c }
            java.lang.String r2 = r2.getTeamIconUrl()     // Catch:{ Exception -> 0x021c }
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x01ed
            r2 = r3
        L_0x01ed:
            r4 = 2131165585(0x7f070191, float:1.7945391E38)
            com.crickpe.utils.ExtensionsKt.loadImageWithouLoader(r0, r2, r4, r1)     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r8.itemView     // Catch:{ Exception -> 0x021c }
            int r2 = com.crickpe.C1188R.C1192id.ivTeam2Flag     // Catch:{ Exception -> 0x021c }
            android.view.View r0 = r0.findViewById(r2)     // Catch:{ Exception -> 0x021c }
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0     // Catch:{ Exception -> 0x021c }
            java.lang.String r2 = "holder.itemView.ivTeam2Flag"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch:{ Exception -> 0x021c }
            android.widget.ImageView r0 = (android.widget.ImageView) r0     // Catch:{ Exception -> 0x021c }
            java.util.ArrayList<com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel> r2 = r7.upcomingMatchModels     // Catch:{ Exception -> 0x021c }
            java.lang.Object r2 = r2.get(r9)     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel r2 = (com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel) r2     // Catch:{ Exception -> 0x021c }
            com.crickpe.view.home.fragments.home.Team2 r2 = r2.getTeam2()     // Catch:{ Exception -> 0x021c }
            java.lang.String r2 = r2.getTeamIconUrl()     // Catch:{ Exception -> 0x021c }
            if (r2 != 0) goto L_0x0217
            goto L_0x0218
        L_0x0217:
            r3 = r2
        L_0x0218:
            com.crickpe.utils.ExtensionsKt.loadImageWithouLoader(r0, r3, r4, r1)     // Catch:{ Exception -> 0x021c }
            goto L_0x0226
        L_0x021c:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "UpmAdap"
            android.util.Log.v(r1, r0)
        L_0x0226:
            android.view.View r8 = r8.itemView
            com.crickpe.view.detail.adapters.UpcomingMatchesAdapter$$ExternalSyntheticLambda1 r0 = new com.crickpe.view.detail.adapters.UpcomingMatchesAdapter$$ExternalSyntheticLambda1
            r0.<init>(r7, r9)
            r8.setOnClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.adapters.UpcomingMatchesAdapter.onBindViewHolder(com.crickpe.view.detail.adapters.UpcomingMatchesAdapter$MyViewHolder, int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-0  reason: not valid java name */
    public static final void m3478onBindViewHolder$lambda0(UpcomingMatchesAdapter upcomingMatchesAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(upcomingMatchesAdapter, "this$0");
        Context context2 = upcomingMatchesAdapter.context;
        UpcomingMatchModel upcomingMatchModel = upcomingMatchesAdapter.upcomingMatchModels.get(i);
        Intrinsics.checkNotNullExpressionValue(upcomingMatchModel, "upcomingMatchModels[position]");
        upcomingMatchesAdapter.matchInfoDialog(context2, upcomingMatchModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: onBindViewHolder$lambda-1  reason: not valid java name */
    public static final void m3479onBindViewHolder$lambda1(UpcomingMatchesAdapter upcomingMatchesAdapter, int i, View view) {
        Intrinsics.checkNotNullParameter(upcomingMatchesAdapter, "this$0");
        try {
            OnItemClicked onItemClicked2 = upcomingMatchesAdapter.onItemClicked;
            UpcomingMatchModel upcomingMatchModel = upcomingMatchesAdapter.upcomingMatchModels.get(i);
            Intrinsics.checkNotNullExpressionValue(upcomingMatchModel, "upcomingMatchModels[position]");
            onItemClicked2.onItemClicked(upcomingMatchModel);
        } catch (Exception e) {
            Log.v("clickUpcoming", e.toString());
        }
    }

    public final void addList(boolean z, ArrayList<UpcomingMatchModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.upcomingMatchModels.clear();
        }
        this.upcomingMatchModels.addAll(arrayList);
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

    private final void matchInfoDialog(Context context2, UpcomingMatchModel upcomingMatchModel) {
        String str;
        Dialog dialog = new Dialog(context2);
        boolean z = true;
        dialog.requestWindowFeature(1);
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        dialog.setContentView(C1188R.C1193layout.dialog_match_detail);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvMatchName);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvTeam1Name);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(C1188R.C1192id.tvTeam2Name);
                if (findViewById3 != null) {
                    TextView textView3 = (TextView) findViewById3;
                    View findViewById4 = dialog.findViewById(C1188R.C1192id.tvStadium);
                    if (findViewById4 != null) {
                        TextView textView4 = (TextView) findViewById4;
                        View findViewById5 = dialog.findViewById(C1188R.C1192id.tvTeamCode1);
                        if (findViewById5 != null) {
                            TextView textView5 = (TextView) findViewById5;
                            View findViewById6 = dialog.findViewById(C1188R.C1192id.tvTeamCode2);
                            if (findViewById6 != null) {
                                TextView textView6 = (TextView) findViewById6;
                                View findViewById7 = dialog.findViewById(C1188R.C1192id.ivTeam1Flag);
                                if (findViewById7 != null) {
                                    CircleImageView circleImageView = (CircleImageView) findViewById7;
                                    View findViewById8 = dialog.findViewById(C1188R.C1192id.ivTeam2Flag);
                                    if (findViewById8 != null) {
                                        CircleImageView circleImageView2 = (CircleImageView) findViewById8;
                                        try {
                                            textView2.setText(upcomingMatchModel.getTeam1().getTeamName().toString());
                                            textView3.setText(upcomingMatchModel.getTeam2().getTeamName().toString());
                                            textView5.setText(upcomingMatchModel.getTeam1().getCode().toString());
                                            textView6.setText(upcomingMatchModel.getTeam2().getCode().toString());
                                            ImageView imageView = circleImageView;
                                            String teamIconUrl = upcomingMatchModel.getTeam1().getTeamIconUrl();
                                            ExtensionsKt.loadImage$default(imageView, teamIconUrl == null ? "" : teamIconUrl, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                                            ImageView imageView2 = circleImageView2;
                                            String teamIconUrl2 = upcomingMatchModel.getTeam2().getTeamIconUrl();
                                            if (teamIconUrl2 == null) {
                                                str = "";
                                            } else {
                                                str = teamIconUrl2;
                                            }
                                            ExtensionsKt.loadImage$default(imageView2, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                                            CharSequence customMatchName = upcomingMatchModel.getCustomMatchName();
                                            if (customMatchName != null) {
                                                if (customMatchName.length() != 0) {
                                                    z = false;
                                                }
                                            }
                                            if (!z) {
                                                textView.setText(upcomingMatchModel.getCustomMatchName().toString());
                                            } else {
                                                textView.setText(upcomingMatchModel.getFormat() + " | " + upcomingMatchModel.getTitle());
                                            }
                                            if (upcomingMatchModel.getVenue() != null) {
                                                textView4.setText(upcomingMatchModel.getVenue().getVenueName() + ", " + upcomingMatchModel.getVenue().getVenueCity());
                                            } else {
                                                textView4.setText("Vanue");
                                            }
                                        } catch (Exception e) {
                                            Log.v("Dialog_pop", e.toString());
                                        }
                                        Window window = dialog.getWindow();
                                        Intrinsics.checkNotNull(window);
                                        window.setBackgroundDrawableResource(17170445);
                                        window.setLayout(-1, -2);
                                        dialog.show();
                                        return;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type de.hdodenhof.circleimageview.CircleImageView");
                                }
                                throw new NullPointerException("null cannot be cast to non-null type de.hdodenhof.circleimageview.CircleImageView");
                            }
                            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }
}
