package com.crickpe.view.home.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.AdapterSelectCaptainVcBinding;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.fragments.create_own_team.create_team.FantasyPoint;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Players;
import com.crickpe.view.home.fragments.home.Team1;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002,-B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013J\b\u0010 \u001a\u00020\u0019H\u0016J\u001e\u0010!\u001a\u00020\u001c2\n\u0010\"\u001a\u00060\u0002R\u00020\u00002\b\b\u0001\u0010#\u001a\u00020\u0019H\u0016J\u001c\u0010$\u001a\u00060\u0002R\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0019H\u0016J\u0015\u0010(\u001a\u0004\u0018\u00010\u00192\u0006\u0010)\u001a\u00020*¢\u0006\u0002\u0010+R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006."}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/CaptainVcAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/home/adapters/CaptainVcAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/home/adapters/CaptainVcAdapter$OnItemClicked;", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/home/adapters/CaptainVcAdapter$OnItemClicked;Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "setActivity", "(Landroidx/fragment/app/FragmentActivity;)V", "getOnItemClicked", "()Lcom/crickpe/view/home/adapters/CaptainVcAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/home/adapters/CaptainVcAdapter$OnItemClicked;)V", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "selectedPosition", "", "selectedPosition1", "addList", "", "firstPage", "", "list", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "roundOffDecimal", "number", "", "(D)Ljava/lang/Integer;", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CaptainVcAdapter.kt */
public final class CaptainVcAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity activity;
    private OnItemClicked onItemClicked;
    private ArrayList<Players> playersList = new ArrayList<>();
    /* access modifiers changed from: private */
    public int selectedPosition = -1;
    /* access modifiers changed from: private */
    public int selectedPosition1 = -1;

    @Metadata(mo48221d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/CaptainVcAdapter$OnItemClicked;", "", "onSelectionCaptainVC", "", "players", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "selection", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: CaptainVcAdapter.kt */
    public interface OnItemClicked {
        void onSelectionCaptainVC(Players players, String str);
    }

    public final FragmentActivity getActivity() {
        return this.activity;
    }

    public final OnItemClicked getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setActivity(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<set-?>");
        this.activity = fragmentActivity;
    }

    public final void setOnItemClicked(OnItemClicked onItemClicked2) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "<set-?>");
        this.onItemClicked = onItemClicked2;
    }

    public CaptainVcAdapter(OnItemClicked onItemClicked2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        this.onItemClicked = onItemClicked2;
        this.activity = fragmentActivity;
    }

    public final ArrayList<Players> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<Players> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.adapter_select_captain_vc, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (AdapterSelectCaptainVcBinding) inflate);
    }

    public int getItemCount() {
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Players players = this.playersList.get(i);
        Intrinsics.checkNotNullExpressionValue(players, "playersList[position]");
        viewHolder.onBind(players);
        try {
            int roleId = this.playersList.get(i).getRole().getRoleId();
            if (roleId == 1) {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_bat);
            } else if (roleId == 2) {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_ball);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setPadding(15, 15, 15, 15);
            } else if (roleId != 3) {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_bat_ball);
            } else {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_wicket);
            }
            if (this.selectedPosition == i) {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptain)).setTextColor(ContextCompat.getColor(((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptain)).getContext(), C1188R.C1189color.white));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptain)).setBackground(ContextCompat.getDrawable(this.activity, C1188R.C1190drawable.circle_black_inner));
            } else {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptain)).setTextColor(ContextCompat.getColor(((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptain)).getContext(), C1188R.C1189color.black));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptain)).setBackground(ContextCompat.getDrawable(this.activity, C1188R.C1190drawable.circle_black_border));
            }
            if (this.selectedPosition1 == i) {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvVCaptain)).setTextColor(ContextCompat.getColor(((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptain)).getContext(), C1188R.C1189color.white));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvVCaptain)).setBackground(ContextCompat.getDrawable(this.activity, C1188R.C1190drawable.circle_black_inner));
            } else {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvVCaptain)).setTextColor(ContextCompat.getColor(((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvCaptain)).getContext(), C1188R.C1189color.black));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvVCaptain)).setBackground(ContextCompat.getDrawable(this.activity, C1188R.C1190drawable.circle_black_border));
            }
            String teamId = this.playersList.get(i).getTeamId();
            Team1 team1 = ApplicationActivity.Companion.getTeam1();
            if (Intrinsics.areEqual((Object) teamId, (Object) team1 != null ? team1.getTeamId() : null)) {
                ((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.relativeLayout)).setBackgroundColor(ContextCompat.getColor(((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.relativeLayout)).getContext(), C1188R.C1189color.app_color_one_faded_x));
            } else {
                ((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.relativeLayout)).setBackgroundColor(ContextCompat.getColor(((RelativeLayout) viewHolder.itemView.findViewById(C1188R.C1192id.relativeLayout)).getContext(), C1188R.C1189color.white));
            }
            Integer roundOffDecimal = roundOffDecimal(this.playersList.get(i).getViceCaptainSelPercentage());
            StringBuilder sb = new StringBuilder();
            sb.append(roundOffDecimal);
            sb.append('%');
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvVcPer)).setText(sb.toString());
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvBattingStyle)).setText(Intrinsics.areEqual((Object) this.playersList.get(i).getBatting_style(), (Object) "right_hand") ? "RHB" : "LHB");
            Integer roundOffDecimal2 = roundOffDecimal(this.playersList.get(i).getCaptainSelPercentage());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(roundOffDecimal2);
            sb2.append('%');
            ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.selectionPercentage)).setText(sb2.toString());
            CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivPlayerCVc);
            Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivPlayerCVc");
            ImageView imageView = circleImageView;
            String imageUrl = this.playersList.get(i).getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            ExtensionsKt.loadImageWithouLoader(imageView, imageUrl, C1188R.C1190drawable.profile_placeholder, true);
            if (this.playersList.get(i).getFantasyPoint() != null) {
                try {
                    StringBuilder sb3 = new StringBuilder();
                    FantasyPoint fantasyPoint = this.playersList.get(i).getFantasyPoint();
                    Intrinsics.checkNotNull(fantasyPoint);
                    sb3.append((int) fantasyPoint.getTotalFantasyPoints());
                    sb3.append('/');
                    FantasyPoint fantasyPoint2 = this.playersList.get(i).getFantasyPoint();
                    Intrinsics.checkNotNull(fantasyPoint2);
                    sb3.append(fantasyPoint2.getMatchCount());
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvPointsCaptainVc)).setText(sb3.toString());
                } catch (Exception e) {
                    Log.v("fantasyPoint", e.toString());
                }
            }
        } catch (Exception e2) {
            Log.v("Captain_vc", e2.toString());
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/CaptainVcAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/AdapterSelectCaptainVcBinding;", "(Lcom/crickpe/view/home/adapters/CaptainVcAdapter;Lcom/crickpe/databinding/AdapterSelectCaptainVcBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: CaptainVcAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final AdapterSelectCaptainVcBinding binding;
        private final Context context;
        final /* synthetic */ CaptainVcAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CaptainVcAdapter captainVcAdapter, AdapterSelectCaptainVcBinding adapterSelectCaptainVcBinding) {
            super(adapterSelectCaptainVcBinding.getRoot());
            Intrinsics.checkNotNullParameter(adapterSelectCaptainVcBinding, "binding");
            this.this$0 = captainVcAdapter;
            this.binding = adapterSelectCaptainVcBinding;
            this.context = adapterSelectCaptainVcBinding.getRoot().getContext();
            ((TextView) adapterSelectCaptainVcBinding.getRoot().findViewById(C1188R.C1192id.tvCaptain)).setOnClickListener(new CaptainVcAdapter$ViewHolder$$ExternalSyntheticLambda0(captainVcAdapter, this));
            ((TextView) adapterSelectCaptainVcBinding.getRoot().findViewById(C1188R.C1192id.tvVCaptain)).setOnClickListener(new CaptainVcAdapter$ViewHolder$$ExternalSyntheticLambda1(captainVcAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3682_init_$lambda0(CaptainVcAdapter captainVcAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(captainVcAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            int size = captainVcAdapter.getPlayersList().size();
            for (int i = 0; i < size; i++) {
                captainVcAdapter.getPlayersList().get(i).setCaptainSelected(false);
            }
            if (captainVcAdapter.selectedPosition1 == -1 || !Intrinsics.areEqual((Object) captainVcAdapter.getPlayersList().get(viewHolder.getPosition()).getPlayerId(), (Object) captainVcAdapter.getPlayersList().get(captainVcAdapter.selectedPosition1).getPlayerId())) {
                captainVcAdapter.getPlayersList().get(viewHolder.getPosition()).setCaptainSelected(!captainVcAdapter.getPlayersList().get(viewHolder.getPosition()).isCaptainSelected());
                captainVcAdapter.notifyItemChanged(viewHolder.getPosition());
                OnItemClicked onItemClicked = captainVcAdapter.getOnItemClicked();
                Players players = captainVcAdapter.getPlayersList().get(viewHolder.getPosition());
                Intrinsics.checkNotNullExpressionValue(players, "playersList[position]");
                onItemClicked.onSelectionCaptainVC(players, "c");
                if (captainVcAdapter.selectedPosition >= 0) {
                    captainVcAdapter.notifyItemChanged(captainVcAdapter.selectedPosition);
                }
                captainVcAdapter.selectedPosition = viewHolder.getPosition();
                captainVcAdapter.notifyItemChanged(captainVcAdapter.selectedPosition);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-1  reason: not valid java name */
        public static final void m3683_init_$lambda1(CaptainVcAdapter captainVcAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(captainVcAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            int size = captainVcAdapter.getPlayersList().size();
            for (int i = 0; i < size; i++) {
                captainVcAdapter.getPlayersList().get(i).setVCaptainSelected(false);
            }
            if (captainVcAdapter.selectedPosition == -1 || !Intrinsics.areEqual((Object) captainVcAdapter.getPlayersList().get(viewHolder.getPosition()).getPlayerId(), (Object) captainVcAdapter.getPlayersList().get(captainVcAdapter.selectedPosition).getPlayerId())) {
                captainVcAdapter.getPlayersList().get(viewHolder.getPosition()).setVCaptainSelected(!captainVcAdapter.getPlayersList().get(viewHolder.getPosition()).isVCaptainSelected());
                captainVcAdapter.notifyItemChanged(viewHolder.getPosition());
                OnItemClicked onItemClicked = captainVcAdapter.getOnItemClicked();
                Players players = captainVcAdapter.getPlayersList().get(viewHolder.getPosition());
                Intrinsics.checkNotNullExpressionValue(players, "playersList[position]");
                onItemClicked.onSelectionCaptainVC(players, "vc");
                if (captainVcAdapter.selectedPosition1 >= 0) {
                    captainVcAdapter.notifyItemChanged(captainVcAdapter.selectedPosition1);
                }
                captainVcAdapter.selectedPosition1 = viewHolder.getPosition();
                captainVcAdapter.notifyItemChanged(captainVcAdapter.selectedPosition1);
            }
        }

        public final void onBind(Players players) {
            Intrinsics.checkNotNullParameter(players, "players");
            this.binding.setModel(players);
        }
    }

    public final void addList(boolean z, ArrayList<Players> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        if (z) {
            this.playersList.clear();
        }
        this.playersList.addAll(arrayList);
        int size = this.playersList.size();
        for (int i = 0; i < size; i++) {
            if (this.playersList.get(i).isCaptainSelected()) {
                this.selectedPosition = i;
            }
            if (this.playersList.get(i).isVCaptainSelected()) {
                this.selectedPosition1 = i;
            }
        }
        notifyDataSetChanged();
    }

    public final Integer roundOffDecimal(double d) {
        DecimalFormat decimalFormat = new DecimalFormat("###");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        String format = decimalFormat.format(d);
        Intrinsics.checkNotNullExpressionValue(format, "df.format(number)");
        return Integer.valueOf(Integer.parseInt(format));
    }
}
