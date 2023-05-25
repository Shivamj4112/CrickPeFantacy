package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterLivescoreBarBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BattingOrder;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BowlingOrder;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.InningsArr;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u00011B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\b\u0010!\u001a\u00020\u000fH\u0016J\u001c\u0010\"\u001a\u00020\u001e2\n\u0010#\u001a\u00060\u0002R\u00020\u00002\u0006\u0010$\u001a\u00020\u000fH\u0016J\u001c\u0010%\u001a\u00060\u0002R\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u000fH\u0016J4\u0010)\u001a\u00020\u001e2\u0006\u0010*\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020-0\u00172\u0006\u0010.\u001a\u00020+2\f\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u0017H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\u0005R6\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010`\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u00062"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/LiveScoreAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/LiveScoreAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "batterAdapter", "Lcom/crickpe/view/detail/adapters/LiveScoreBatterAdapter;", "bowlerAdapter", "Lcom/crickpe/view/detail/adapters/LiveScoreBowlerAdapter;", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "hashMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "getHashMap", "()Ljava/util/HashMap;", "setHashMap", "(Ljava/util/HashMap;)V", "inningsArr", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/InningsArr;", "getInningsArr", "()Ljava/util/ArrayList;", "setInningsArr", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "list", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAdapter", "rvScore", "Landroidx/recyclerview/widget/RecyclerView;", "battingOrders", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BattingOrder;", "rvBowling", "bowlingOrders", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/BowlingOrder;", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LiveScoreAdapter.kt */
public final class LiveScoreAdapter extends RecyclerView.Adapter<ViewHolder> {
    private LiveScoreBatterAdapter batterAdapter;
    private LiveScoreBowlerAdapter bowlerAdapter;
    private FragmentActivity context;
    private HashMap<Integer, Boolean> hashMap = new HashMap<>();
    private ArrayList<InningsArr> inningsArr = new ArrayList<>();

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public LiveScoreAdapter(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.context = fragmentActivity;
    }

    public final ArrayList<InningsArr> getInningsArr() {
        return this.inningsArr;
    }

    public final void setInningsArr(ArrayList<InningsArr> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.inningsArr = arrayList;
    }

    public final HashMap<Integer, Boolean> getHashMap() {
        return this.hashMap;
    }

    public final void setHashMap(HashMap<Integer, Boolean> hashMap2) {
        Intrinsics.checkNotNullParameter(hashMap2, "<set-?>");
        this.hashMap = hashMap2;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_livescore_bar, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterLivescoreBarBinding) inflate);
    }

    public int getItemCount() {
        return this.inningsArr.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        InningsArr inningsArr2 = this.inningsArr.get(i);
        Intrinsics.checkNotNullExpressionValue(inningsArr2, "inningsArr[position]");
        viewHolder.onBind(inningsArr2);
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvExtras)).setText(" (nb " + this.inningsArr.get(i).getInnings().getExtra_runs().getNo_ball() + ", wd " + this.inningsArr.get(i).getInnings().getExtra_runs().getWide() + ", b " + this.inningsArr.get(i).getInnings().getExtra_runs().getBye() + ", pen " + this.inningsArr.get(i).getInnings().getExtra_runs().getPenalty() + ')');
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTotalRuns)).setText(String.valueOf(this.inningsArr.get(i).getInnings().getScore().getRuns()));
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.inningsArr.get(i).getInnings().getWickets());
        sb.append(" wickets, ");
        sb.append(this.inningsArr.get(i).getInnings().getOvers());
        sb.append(" overs)");
        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTotal)).setText(sb.toString());
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/LiveScoreAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterLivescoreBarBinding;", "(Lcom/crickpe/view/detail/adapters/LiveScoreAdapter;Lcom/crickpe/databinding/AdapterLivescoreBarBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "list", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/InningsArr;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: LiveScoreAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterLivescoreBarBinding binding;
        private final Context context;
        final /* synthetic */ LiveScoreAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(LiveScoreAdapter liveScoreAdapter, AdapterLivescoreBarBinding adapterLivescoreBarBinding) {
            super(adapterLivescoreBarBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterLivescoreBarBinding, "binding");
            this.this$0 = liveScoreAdapter;
            this.binding = adapterLivescoreBarBinding;
            this.context = adapterLivescoreBarBinding.getRoot().getContext();
            adapterLivescoreBarBinding.relativeLayout6.setOnClickListener(new LiveScoreAdapter$ViewHolder$$ExternalSyntheticLambda0(liveScoreAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3453_init_$lambda0(LiveScoreAdapter liveScoreAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(liveScoreAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            if (liveScoreAdapter.getInningsArr().get(viewHolder.getAdapterPosition()).getBattingOrders().size() > 0) {
                LinearLayout linearLayout = viewHolder.binding.llBody;
                Intrinsics.checkNotNullExpressionValue(linearLayout, "binding.llBody");
                if (!(linearLayout.getVisibility() == 0)) {
                    liveScoreAdapter.getHashMap().put(Integer.valueOf(viewHolder.getAdapterPosition()), false);
                    LinearLayout linearLayout2 = viewHolder.binding.llBody;
                    Intrinsics.checkNotNullExpressionValue(linearLayout2, "binding.llBody");
                    CommonMethodsKt.visible(linearLayout2);
                    viewHolder.binding.ivDropdown.setRotation(0.0f);
                } else {
                    liveScoreAdapter.getHashMap().put(Integer.valueOf(viewHolder.getAdapterPosition()), true);
                    LinearLayout linearLayout3 = viewHolder.binding.llBody;
                    Intrinsics.checkNotNullExpressionValue(linearLayout3, "binding.llBody");
                    CommonMethodsKt.hide(linearLayout3);
                    viewHolder.binding.ivDropdown.setRotation(-90.0f);
                }
                RecyclerView recyclerView = viewHolder.binding.rvScore;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvScore");
                ArrayList<BattingOrder> battingOrders = liveScoreAdapter.getInningsArr().get(viewHolder.getAdapterPosition()).getBattingOrders();
                RecyclerView recyclerView2 = viewHolder.binding.rvBowling;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "binding.rvBowling");
                liveScoreAdapter.setAdapter(recyclerView, battingOrders, recyclerView2, liveScoreAdapter.getInningsArr().get(viewHolder.getAdapterPosition()).getBowlingOrders());
            }
        }

        public final void onBind(InningsArr inningsArr) {
            Intrinsics.checkNotNullParameter(inningsArr, "list");
            this.binding.setModel(inningsArr);
        }
    }

    public final void addList(boolean z, ArrayList<InningsArr> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.inningsArr.clear();
        }
        this.inningsArr.addAll(arrayList);
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public final void setAdapter(RecyclerView recyclerView, ArrayList<BattingOrder> arrayList, RecyclerView recyclerView2, ArrayList<BowlingOrder> arrayList2) {
        Log.v("battingOrders", new Gson().toJson((Object) arrayList));
        LiveScoreBatterAdapter liveScoreBatterAdapter = new LiveScoreBatterAdapter(this.context);
        this.batterAdapter = liveScoreBatterAdapter;
        recyclerView.setAdapter(liveScoreBatterAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.context, 1, false));
        Collection collection = arrayList;
        LiveScoreBowlerAdapter liveScoreBowlerAdapter = null;
        if (!collection.isEmpty()) {
            LiveScoreBatterAdapter liveScoreBatterAdapter2 = this.batterAdapter;
            if (liveScoreBatterAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("batterAdapter");
                liveScoreBatterAdapter2 = null;
            }
            liveScoreBatterAdapter2.addList(arrayList);
        }
        LiveScoreBowlerAdapter liveScoreBowlerAdapter2 = new LiveScoreBowlerAdapter(this.context);
        this.bowlerAdapter = liveScoreBowlerAdapter2;
        recyclerView2.setAdapter(liveScoreBowlerAdapter2);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this.context, 1, false));
        LiveScoreBowlerAdapter liveScoreBowlerAdapter3 = this.bowlerAdapter;
        if (liveScoreBowlerAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bowlerAdapter");
            liveScoreBowlerAdapter3 = null;
        }
        recyclerView2.setAdapter(liveScoreBowlerAdapter3);
        if (!collection.isEmpty()) {
            LiveScoreBowlerAdapter liveScoreBowlerAdapter4 = this.bowlerAdapter;
            if (liveScoreBowlerAdapter4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("bowlerAdapter");
            } else {
                liveScoreBowlerAdapter = liveScoreBowlerAdapter4;
            }
            liveScoreBowlerAdapter.addList(arrayList2);
        }
    }
}
