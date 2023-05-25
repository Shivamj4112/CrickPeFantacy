package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterSequenceBinding;
import com.crickpe.view.detail.fragments.create_own_team.my_contest.FantasyTeams;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001)B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J&\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010\u001e\u001a\u00020\u00182\n\u0010\u001f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010 \u001a\u00020\u001dH\u0016J\u001c\u0010!\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001dH\u0016J\u0016\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0012R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006*"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/SequenceAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/SequenceAdapter$ViewHolder;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "fantasyTeamsArrayList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/FantasyTeams;", "Lkotlin/collections/ArrayList;", "getFantasyTeamsArrayList", "()Ljava/util/ArrayList;", "setFantasyTeamsArrayList", "(Ljava/util/ArrayList;)V", "sum", "", "getSum", "()D", "setSum", "(D)V", "addList", "", "firstPage", "", "list", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setNumber", "textView", "Landroid/widget/TextView;", "value", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SequenceAdapter.kt */
public final class SequenceAdapter extends RecyclerView.Adapter<ViewHolder> {
    private Context context;
    private ArrayList<FantasyTeams> fantasyTeamsArrayList = new ArrayList<>();
    private double sum;

    public final Context getContext() {
        return this.context;
    }

    public final void setContext(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "<set-?>");
        this.context = context2;
    }

    public SequenceAdapter(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public final ArrayList<FantasyTeams> getFantasyTeamsArrayList() {
        return this.fantasyTeamsArrayList;
    }

    public final void setFantasyTeamsArrayList(ArrayList<FantasyTeams> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.fantasyTeamsArrayList = arrayList;
    }

    public final double getSum() {
        return this.sum;
    }

    public final void setSum(double d) {
        this.sum = d;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_sequence, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterSequenceBinding) inflate);
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/SequenceAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterSequenceBinding;", "(Lcom/crickpe/view/detail/adapters/SequenceAdapter;Lcom/crickpe/databinding/AdapterSequenceBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "topContestMode", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/FantasyTeams;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SequenceAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterSequenceBinding binding;
        private final Context context;
        final /* synthetic */ SequenceAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(SequenceAdapter sequenceAdapter, AdapterSequenceBinding adapterSequenceBinding) {
            super(adapterSequenceBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterSequenceBinding, "binding");
            this.this$0 = sequenceAdapter;
            this.binding = adapterSequenceBinding;
            this.context = adapterSequenceBinding.getRoot().getContext();
        }

        public final Context getContext() {
            return this.context;
        }

        public final void onBind(FantasyTeams fantasyTeams) {
            Intrinsics.checkNotNullParameter(fantasyTeams, "topContestMode");
            this.binding.setModel(fantasyTeams);
        }
    }

    public int getItemCount() {
        return this.fantasyTeamsArrayList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        FantasyTeams fantasyTeams = this.fantasyTeamsArrayList.get(i);
        Intrinsics.checkNotNullExpressionValue(fantasyTeams, "fantasyTeamsArrayList[position]");
        viewHolder.onBind(fantasyTeams);
        try {
            StringBuilder sb = new StringBuilder();
            sb.append('T');
            sb.append(this.fantasyTeamsArrayList.get(i).getSequence());
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvLabel)).setText(sb.toString());
        } catch (Exception e) {
            Log.v("SequenceAdapter", e.toString());
        }
    }

    public final void addList(boolean z, ArrayList<FantasyTeams> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.fantasyTeamsArrayList.clear();
        }
        this.fantasyTeamsArrayList.addAll(arrayList);
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
}
