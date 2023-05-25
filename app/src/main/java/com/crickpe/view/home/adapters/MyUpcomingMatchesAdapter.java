package com.crickpe.view.home.adapters;

import android.content.Context;
import android.content.Intent;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterUpcomingMatchNewBinding;
import com.crickpe.databinding.AdapterUpcomingMatchesBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(mo48221d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002)*B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u001c\u0010\u001f\u001a\u00020\u00152\n\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\u001eH\u0016J\u001c\u0010\"\u001a\u00060\u0002R\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001eH\u0016J\u0018\u0010&\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020(H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\u0002\n\u0000R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006+"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/MyUpcomingMatchesAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/MyUpcomingMatchesAdapter$ViewHolder;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "countDownTimer", "Landroid/os/CountDownTimer;", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "upcomingJoinedMatches", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "getUpcomingJoinedMatches", "()Ljava/util/ArrayList;", "setUpcomingJoinedMatches", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "getDateString", "", "time", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "printDifferenceDateForHours", "tvUpcomingTime", "Landroid/widget/TextView;", "MyViewHolder", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyUpcomingMatchesAdapter.kt */
public final class MyUpcomingMatchesAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private CountDownTimer countDownTimer;
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
    private ArrayList<MyMatchesModel> upcomingJoinedMatches = new ArrayList<>();

    public final FragmentActivity getContext() {
        return this.context;
    }

    public final void setContext(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.context = fragmentActivity;
    }

    public MyUpcomingMatchesAdapter(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.context = fragmentActivity;
    }

    public final ArrayList<MyMatchesModel> getUpcomingJoinedMatches() {
        return this.upcomingJoinedMatches;
    }

    public final void setUpcomingJoinedMatches(ArrayList<MyMatchesModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.upcomingJoinedMatches = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_upcoming_matches, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterUpcomingMatchesBinding) inflate);
    }

    public int getItemCount() {
        return this.upcomingJoinedMatches.size();
    }

    @Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/MyUpcomingMatchesAdapter$MyViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Lcom/crickpe/databinding/AdapterUpcomingMatchNewBinding;", "(Lcom/crickpe/databinding/AdapterUpcomingMatchNewBinding;)V", "binding", "getBinding", "()Lcom/crickpe/databinding/AdapterUpcomingMatchNewBinding;", "setBinding", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "setCountDownTimer", "(Landroid/os/CountDownTimer;)V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyUpcomingMatchesAdapter.kt */
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

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        MyMatchesModel myMatchesModel = this.upcomingJoinedMatches.get(i);
        Intrinsics.checkNotNullExpressionValue(myMatchesModel, "upcomingJoinedMatches[position]");
        viewHolder.onBind(myMatchesModel);
        String dateString = getDateString(this.upcomingJoinedMatches.get(i).getStartAtIST());
        TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvUpcomingTime);
        Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvUpcomingTime");
        printDifferenceDateForHours(dateString, textView);
        try {
            if (this.upcomingJoinedMatches.get(i).getCustomMatchName() != null) {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMatchName)).setText(CommonMethodsKt.UpperCase(this.upcomingJoinedMatches.get(i).getCustomMatchName()));
            } else {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMatchName)).setText(this.upcomingJoinedMatches.get(i).getName());
            }
        } catch (Exception unused) {
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvMatchName)).setText(this.upcomingJoinedMatches.get(i).getName());
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/MyUpcomingMatchesAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterUpcomingMatchesBinding;", "(Lcom/crickpe/view/home/adapters/MyUpcomingMatchesAdapter;Lcom/crickpe/databinding/AdapterUpcomingMatchesBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: MyUpcomingMatchesAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterUpcomingMatchesBinding binding;
        private final Context context;
        final /* synthetic */ MyUpcomingMatchesAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(MyUpcomingMatchesAdapter myUpcomingMatchesAdapter, AdapterUpcomingMatchesBinding adapterUpcomingMatchesBinding) {
            super(adapterUpcomingMatchesBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterUpcomingMatchesBinding, "binding");
            this.this$0 = myUpcomingMatchesAdapter;
            this.binding = adapterUpcomingMatchesBinding;
            this.context = adapterUpcomingMatchesBinding.getRoot().getContext();
            adapterUpcomingMatchesBinding.getRoot().setOnClickListener(new MyUpcomingMatchesAdapter$ViewHolder$$ExternalSyntheticLambda0(myUpcomingMatchesAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3688_init_$lambda0(MyUpcomingMatchesAdapter myUpcomingMatchesAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(myUpcomingMatchesAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            UserManager.INSTANCE.saveClick(0);
            UserManager.INSTANCE.saveMatchId(myUpcomingMatchesAdapter.getUpcomingJoinedMatches().get(viewHolder.getAdapterPosition()).get_id());
            Log.v("MATCHH_IDDD", myUpcomingMatchesAdapter.getUpcomingJoinedMatches().get(viewHolder.getAdapterPosition()).get_id());
            Intent intent = new Intent(new Intent(viewHolder.context, DetailActivity.class));
            intent.putExtra("open", "contest");
            intent.putExtra("matchId", myUpcomingMatchesAdapter.getUpcomingJoinedMatches().get(viewHolder.getAdapterPosition()).get_id().toString());
            Context context2 = viewHolder.context;
            if (context2 != null) {
                context2.startActivity(intent);
            }
        }

        public final void onBind(MyMatchesModel myMatchesModel) {
            Intrinsics.checkNotNullParameter(myMatchesModel, "players");
            this.binding.setModel(myMatchesModel);
        }
    }

    public final void addList(boolean z, ArrayList<MyMatchesModel> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.upcomingJoinedMatches.clear();
        }
        this.upcomingJoinedMatches.addAll(arrayList);
        notifyDataSetChanged();
    }

    private final String getDateString(long j) {
        String format = this.simpleDateFormat.format(Long.valueOf(j * 1000));
        Intrinsics.checkNotNullExpressionValue(format, "simpleDateFormat.format(time * 1000L)");
        return format;
    }

    private final void printDifferenceDateForHours(String str, TextView textView) {
        Date time = Calendar.getInstance().getTime();
        Date parse = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault()).parse(str);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = parse.getTime() - time.getTime();
        CountDownTimer start = new MyUpcomingMatchesAdapter$printDifferenceDateForHours$1(longRef, textView, this).start();
        Intrinsics.checkNotNullExpressionValue(start, "private fun printDiffere…}\n        }.start()\n    }");
        this.countDownTimer = start;
    }
}
