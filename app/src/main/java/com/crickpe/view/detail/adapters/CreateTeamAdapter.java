package com.crickpe.view.detail.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.databinding.LayoutSelectTeamBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.fragments.create_own_team.create_team.BowlingStyle;
import com.crickpe.view.detail.fragments.create_own_team.create_team.FantasyPoint;
import com.crickpe.view.detail.fragments.create_own_team.create_team.LastPlayedMatches;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Players;
import com.crickpe.view.home.fragments.home.Team1;
import com.crickpe.view.home.fragments.home.Team2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u000234B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013J8\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020 H\u0002J\b\u0010%\u001a\u00020 H\u0016J\u0010\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020(H\u0002J\u001c\u0010)\u001a\u00020\u00192\n\u0010*\u001a\u00060\u0002R\u00020\u00002\u0006\u0010+\u001a\u00020 H\u0016J\u001c\u0010,\u001a\u00060\u0002R\u00020\u00002\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020 H\u0016J\u001f\u00100\u001a\u00020\u00192\b\u00101\u001a\u0004\u0018\u00010 2\u0006\u0010'\u001a\u00020(H\u0002¢\u0006\u0002\u00102R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u00065"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/CreateTeamAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/crickpe/view/detail/adapters/CreateTeamAdapter$ViewHolder;", "onItemClicked", "Lcom/crickpe/view/detail/adapters/CreateTeamAdapter$OnItemClicked;", "context", "Landroidx/fragment/app/FragmentActivity;", "(Lcom/crickpe/view/detail/adapters/CreateTeamAdapter$OnItemClicked;Landroidx/fragment/app/FragmentActivity;)V", "getContext", "()Landroidx/fragment/app/FragmentActivity;", "setContext", "(Landroidx/fragment/app/FragmentActivity;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/adapters/CreateTeamAdapter$OnItemClicked;", "setOnItemClicked", "(Lcom/crickpe/view/detail/adapters/CreateTeamAdapter$OnItemClicked;)V", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "addList", "", "firstPage", "", "list", "checkValidation", "player", "counting", "", "batsmanCount", "bowlerCount", "wkCount", "allRounderCount", "getItemCount", "hideCup", "itemView", "Landroid/view/View;", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setCup", "index", "(Ljava/lang/Integer;Landroid/view/View;)V", "OnItemClicked", "ViewHolder", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CreateTeamAdapter.kt */
public final class CreateTeamAdapter extends RecyclerView.Adapter<ViewHolder> {
    private FragmentActivity context;
    private OnItemClicked onItemClicked;
    private ArrayList<Players> playersList = new ArrayList<>();

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/CreateTeamAdapter$OnItemClicked;", "", "onItemClicked", "", "players", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: CreateTeamAdapter.kt */
    public interface OnItemClicked {
        void onItemClicked(Players players);
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

    public CreateTeamAdapter(OnItemClicked onItemClicked2, FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(onItemClicked2, "onItemClicked");
        Intrinsics.checkNotNullParameter(fragmentActivity, "context");
        this.onItemClicked = onItemClicked2;
        this.context = fragmentActivity;
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
        ViewDataBinding inflate = DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), C1188R.C1193layout.layout_select_team, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(\n            Lay…, parent, false\n        )");
        return new ViewHolder(this, (LayoutSelectTeamBinding) inflate);
    }

    public int getItemCount() {
        return this.playersList.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        ArrayList<LastPlayedMatches> lastPlayedMatches;
        Intrinsics.checkNotNullParameter(viewHolder, "holder");
        Players players = this.playersList.get(i);
        Intrinsics.checkNotNullExpressionValue(players, "playersList[position]");
        viewHolder.onBind(players);
        ConstraintLayout constraintLayout = (ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBowlingStyle);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "holder.itemView.rlBowlingStyle");
        CommonMethodsKt.hide(constraintLayout);
        try {
            if (i == this.playersList.size() - 1) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.onItemClick);
                Intrinsics.checkNotNullExpressionValue(constraintLayout2, "holder.itemView.onItemClick");
                View view = constraintLayout2;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.LayoutParams layoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 170;
                    view.setLayoutParams(layoutParams2);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.onItemClick);
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "holder.itemView.onItemClick");
                View view2 = constraintLayout3;
                ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.LayoutParams layoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = 0;
                    view2.setLayoutParams(layoutParams4);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            }
            int roleId = this.playersList.get(i).getRole().getRoleId();
            if (roleId == 1) {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_bat);
            } else if (roleId == 2) {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_ball);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setPadding(15, 15, 15, 15);
                if (this.playersList.get(i).getBowling_style() != null) {
                    BowlingStyle bowling_style = this.playersList.get(i).getBowling_style();
                    if (Intrinsics.areEqual((Object) bowling_style != null ? bowling_style.getPace() : null, (Object) "slow")) {
                        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvBowlingStyle)).setText("Spinner");
                        ((ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBowlingStyle)).setBackground(this.context.getDrawable(C1188R.C1190drawable.rectangle_spinner));
                        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivBowlingStyle)).setImageResource(C1188R.C1190drawable.ic_spinner);
                        ConstraintLayout constraintLayout4 = (ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBowlingStyle);
                        Intrinsics.checkNotNullExpressionValue(constraintLayout4, "holder.itemView.rlBowlingStyle");
                        CommonMethodsKt.visible(constraintLayout4);
                    }
                }
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvBowlingStyle)).setText("Pacer");
                ((ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBowlingStyle)).setBackground(this.context.getDrawable(C1188R.C1190drawable.rectangle_pacer));
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivBowlingStyle)).setImageResource(C1188R.C1190drawable.ic_pacer);
                ConstraintLayout constraintLayout42 = (ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBowlingStyle);
                Intrinsics.checkNotNullExpressionValue(constraintLayout42, "holder.itemView.rlBowlingStyle");
                CommonMethodsKt.visible(constraintLayout42);
            } else if (roleId != 3) {
                if (this.playersList.get(i).getBowling_style() != null) {
                    BowlingStyle bowling_style2 = this.playersList.get(i).getBowling_style();
                    if (Intrinsics.areEqual((Object) bowling_style2 != null ? bowling_style2.getPace() : null, (Object) "slow")) {
                        ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvBowlingStyle)).setText("Spinner");
                        ((ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBowlingStyle)).setBackground(this.context.getDrawable(C1188R.C1190drawable.rectangle_spinner));
                        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivBowlingStyle)).setImageResource(C1188R.C1190drawable.ic_spinner);
                        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_bat_ball);
                        ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setPadding(15, 15, 15, 15);
                        ConstraintLayout constraintLayout5 = (ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBowlingStyle);
                        Intrinsics.checkNotNullExpressionValue(constraintLayout5, "holder.itemView.rlBowlingStyle");
                        CommonMethodsKt.visible(constraintLayout5);
                    }
                }
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvBowlingStyle)).setText("Pacer");
                ((ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBowlingStyle)).setBackground(this.context.getDrawable(C1188R.C1190drawable.rectangle_pacer));
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivBowlingStyle)).setImageResource(C1188R.C1190drawable.ic_pacer);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_bat_ball);
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setPadding(15, 15, 15, 15);
                ConstraintLayout constraintLayout52 = (ConstraintLayout) viewHolder.itemView.findViewById(C1188R.C1192id.rlBowlingStyle);
                Intrinsics.checkNotNullExpressionValue(constraintLayout52, "holder.itemView.rlBowlingStyle");
                CommonMethodsKt.visible(constraintLayout52);
            } else {
                ((ImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivRole)).setImageResource(C1188R.C1190drawable.icon_wicket);
            }
            String teamId = this.playersList.get(i).getTeamId();
            Team1 team1 = ApplicationActivity.Companion.getTeam1();
            if (Intrinsics.areEqual((Object) teamId, (Object) team1 != null ? team1.getTeamId() : null)) {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeamCode)).setTextColor(this.context.getResources().getColor(C1188R.C1189color.black));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeamCode)).setBackgroundColor(this.context.getResources().getColor(C1188R.C1189color.white));
            } else {
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeamCode)).setTextColor(this.context.getResources().getColor(C1188R.C1189color.white));
                ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvTeamCode)).setBackgroundColor(this.context.getResources().getColor(C1188R.C1189color.black));
            }
            if (!(this.playersList.get(i).getLastPlayedMatches() == null || (lastPlayedMatches = this.playersList.get(i).getLastPlayedMatches()) == null)) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object next : lastPlayedMatches) {
                    LastPlayedMatches lastPlayedMatches2 = (LastPlayedMatches) next;
                    if (lastPlayedMatches2.isPlaying()) {
                        ArrayList<LastPlayedMatches> lastPlayedMatches3 = this.playersList.get(i).getLastPlayedMatches();
                        Integer valueOf = lastPlayedMatches3 != null ? Integer.valueOf(lastPlayedMatches3.indexOf(lastPlayedMatches2)) : null;
                        View view3 = viewHolder.itemView;
                        Intrinsics.checkNotNullExpressionValue(view3, "holder.itemView");
                        setCup(valueOf, view3);
                    } else {
                        View view4 = viewHolder.itemView;
                        Intrinsics.checkNotNullExpressionValue(view4, "holder.itemView");
                        hideCup(view4);
                    }
                    if (hashSet.add(Unit.INSTANCE)) {
                        arrayList.add(next);
                    }
                }
                List list = arrayList;
            }
            if (this.playersList.get(i).getPlaying_xi()) {
                TextView textView = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAnnouced);
                Intrinsics.checkNotNullExpressionValue(textView, "holder.itemView.tvAnnouced");
                CommonMethodsKt.visible(textView);
            } else {
                TextView textView2 = (TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvAnnouced);
                Intrinsics.checkNotNullExpressionValue(textView2, "holder.itemView.tvAnnouced");
                CommonMethodsKt.hide(textView2);
            }
            CircleImageView circleImageView = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivPlayer);
            Intrinsics.checkNotNullExpressionValue(circleImageView, "holder.itemView.ivPlayer");
            ImageView imageView = circleImageView;
            String imageUrl = this.playersList.get(i).getImageUrl();
            String str = "";
            if (imageUrl == null) {
                imageUrl = str;
            }
            ExtensionsKt.loadImageWithouLoader(imageView, imageUrl, C1188R.C1190drawable.profile_placeholder, true);
            CircleImageView circleImageView2 = (CircleImageView) viewHolder.itemView.findViewById(C1188R.C1192id.ivFlag);
            Intrinsics.checkNotNullExpressionValue(circleImageView2, "holder.itemView.ivFlag");
            ImageView imageView2 = circleImageView2;
            String teamIconUrl = this.playersList.get(i).getTeam().getTeamIconUrl();
            if (teamIconUrl != null) {
                str = teamIconUrl;
            }
            ExtensionsKt.loadImageWithouLoader(imageView2, str, C1188R.C1190drawable.flag_placeholder, true);
            if (this.playersList.get(i).getFantasyPoint() != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    FantasyPoint fantasyPoint = this.playersList.get(i).getFantasyPoint();
                    Intrinsics.checkNotNull(fantasyPoint);
                    sb.append((int) fantasyPoint.getTotalFantasyPoints());
                    sb.append('/');
                    FantasyPoint fantasyPoint2 = this.playersList.get(i).getFantasyPoint();
                    Intrinsics.checkNotNull(fantasyPoint2);
                    sb.append(fantasyPoint2.getMatchCount());
                    ((TextView) viewHolder.itemView.findViewById(C1188R.C1192id.tvpoints)).setText(sb.toString());
                } catch (Exception e) {
                    Log.v("fantasyPoint", e.toString());
                }
            }
        } catch (Exception e2) {
            Log.v("ISPLAYING", e2.toString());
        }
    }

    private final void hideCup(View view) {
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup1);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "itemView.rlCup1");
        CommonMethodsKt.hide(relativeLayout);
        RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup2);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "itemView.rlCup2");
        CommonMethodsKt.hide(relativeLayout2);
        RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup3);
        Intrinsics.checkNotNullExpressionValue(relativeLayout3, "itemView.rlCup3");
        CommonMethodsKt.hide(relativeLayout3);
        RelativeLayout relativeLayout4 = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup4);
        Intrinsics.checkNotNullExpressionValue(relativeLayout4, "itemView.rlCup4");
        CommonMethodsKt.hide(relativeLayout4);
        RelativeLayout relativeLayout5 = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup5);
        Intrinsics.checkNotNullExpressionValue(relativeLayout5, "itemView.rlCup5");
        CommonMethodsKt.hide(relativeLayout5);
        ImageView imageView = (ImageView) view.findViewById(C1188R.C1192id.ivCup1);
        Intrinsics.checkNotNullExpressionValue(imageView, "itemView.ivCup1");
        CommonMethodsKt.hide(imageView);
        ImageView imageView2 = (ImageView) view.findViewById(C1188R.C1192id.ivCup2);
        Intrinsics.checkNotNullExpressionValue(imageView2, "itemView.ivCup2");
        CommonMethodsKt.hide(imageView2);
        ImageView imageView3 = (ImageView) view.findViewById(C1188R.C1192id.ivCup3);
        Intrinsics.checkNotNullExpressionValue(imageView3, "itemView.ivCup3");
        CommonMethodsKt.hide(imageView3);
        ImageView imageView4 = (ImageView) view.findViewById(C1188R.C1192id.ivCup4);
        Intrinsics.checkNotNullExpressionValue(imageView4, "itemView.ivCup4");
        CommonMethodsKt.hide(imageView4);
        ImageView imageView5 = (ImageView) view.findViewById(C1188R.C1192id.ivCup5);
        Intrinsics.checkNotNullExpressionValue(imageView5, "itemView.ivCup5");
        CommonMethodsKt.hide(imageView5);
    }

    private final void setCup(Integer num, View view) {
        if (num != null && num.intValue() == 0) {
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup1);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "itemView.rlCup1");
            CommonMethodsKt.visible(relativeLayout);
            ImageView imageView = (ImageView) view.findViewById(C1188R.C1192id.ivCup1);
            Intrinsics.checkNotNullExpressionValue(imageView, "itemView.ivCup1");
            CommonMethodsKt.visible(imageView);
        } else if (num != null && num.intValue() == 1) {
            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup2);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "itemView.rlCup2");
            CommonMethodsKt.visible(relativeLayout2);
            ImageView imageView2 = (ImageView) view.findViewById(C1188R.C1192id.ivCup2);
            Intrinsics.checkNotNullExpressionValue(imageView2, "itemView.ivCup2");
            CommonMethodsKt.visible(imageView2);
        } else if (num != null && num.intValue() == 2) {
            RelativeLayout relativeLayout3 = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup3);
            Intrinsics.checkNotNullExpressionValue(relativeLayout3, "itemView.rlCup3");
            CommonMethodsKt.visible(relativeLayout3);
            ImageView imageView3 = (ImageView) view.findViewById(C1188R.C1192id.ivCup3);
            Intrinsics.checkNotNullExpressionValue(imageView3, "itemView.ivCup3");
            CommonMethodsKt.visible(imageView3);
        } else if (num != null && num.intValue() == 3) {
            RelativeLayout relativeLayout4 = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup4);
            Intrinsics.checkNotNullExpressionValue(relativeLayout4, "itemView.rlCup4");
            CommonMethodsKt.visible(relativeLayout4);
            ImageView imageView4 = (ImageView) view.findViewById(C1188R.C1192id.ivCup4);
            Intrinsics.checkNotNullExpressionValue(imageView4, "itemView.ivCup4");
            CommonMethodsKt.visible(imageView4);
        } else if (num != null && num.intValue() == 4) {
            RelativeLayout relativeLayout5 = (RelativeLayout) view.findViewById(C1188R.C1192id.rlCup5);
            Intrinsics.checkNotNullExpressionValue(relativeLayout5, "itemView.rlCup5");
            CommonMethodsKt.visible(relativeLayout5);
            ImageView imageView5 = (ImageView) view.findViewById(C1188R.C1192id.ivCup5);
            Intrinsics.checkNotNullExpressionValue(imageView5, "itemView.ivCup5");
            CommonMethodsKt.visible(imageView5);
        }
    }

    @Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/detail/adapters/CreateTeamAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/crickpe/databinding/LayoutSelectTeamBinding;", "(Lcom/crickpe/view/detail/adapters/CreateTeamAdapter;Lcom/crickpe/databinding/LayoutSelectTeamBinding;)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "onBind", "", "players", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: CreateTeamAdapter.kt */
    public final class ViewHolder extends RecyclerView.ViewHolder {
        private final LayoutSelectTeamBinding binding;
        private final Context context;
        final /* synthetic */ CreateTeamAdapter this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(CreateTeamAdapter createTeamAdapter, LayoutSelectTeamBinding layoutSelectTeamBinding) {
            super(layoutSelectTeamBinding.getRoot());
            Intrinsics.checkNotNullParameter(layoutSelectTeamBinding, "binding");
            this.this$0 = createTeamAdapter;
            this.binding = layoutSelectTeamBinding;
            this.context = layoutSelectTeamBinding.getRoot().getContext();
            layoutSelectTeamBinding.getRoot().setOnClickListener(new CreateTeamAdapter$ViewHolder$$ExternalSyntheticLambda0(createTeamAdapter, this));
        }

        public final Context getContext() {
            return this.context;
        }

        /* access modifiers changed from: private */
        /* renamed from: _init_$lambda-0  reason: not valid java name */
        public static final void m3447_init_$lambda0(CreateTeamAdapter createTeamAdapter, ViewHolder viewHolder, View view) {
            Intrinsics.checkNotNullParameter(createTeamAdapter, "this$0");
            Intrinsics.checkNotNullParameter(viewHolder, "this$1");
            String str = null;
            if (createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).isSelected()) {
                String teamId = createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).getTeamId();
                Team1 team1 = ApplicationActivity.Companion.getTeam1();
                if (Intrinsics.areEqual((Object) teamId, (Object) team1 != null ? team1.getTeamId() : null)) {
                    ApplicationActivity.Companion companion = ApplicationActivity.Companion;
                    companion.setTeamOneCount(companion.getTeamOneCount() - 1);
                }
                String teamId2 = createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).getTeamId();
                Team2 team2 = ApplicationActivity.Companion.getTeam2();
                if (team2 != null) {
                    str = team2.getTeamId();
                }
                if (Intrinsics.areEqual((Object) teamId2, (Object) str)) {
                    ApplicationActivity.Companion companion2 = ApplicationActivity.Companion;
                    companion2.setTeamTwoCount(companion2.getTeamTwoCount() - 1);
                }
                createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).setSelected(false);
                ApplicationActivity.Companion companion3 = ApplicationActivity.Companion;
                companion3.setCredit(companion3.getCredit() + createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).getCreditPoints());
                int roleId = createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).getRole().getRoleId();
                if (roleId == 1) {
                    ApplicationActivity.Companion companion4 = ApplicationActivity.Companion;
                    companion4.setBatsmanCount(companion4.getBatsmanCount() - 1);
                } else if (roleId == 2) {
                    ApplicationActivity.Companion companion5 = ApplicationActivity.Companion;
                    companion5.setBowlerCount(companion5.getBowlerCount() - 1);
                } else if (roleId != 3) {
                    ApplicationActivity.Companion companion6 = ApplicationActivity.Companion;
                    companion6.setAllRounderCount(companion6.getAllRounderCount() - 1);
                } else {
                    ApplicationActivity.Companion companion7 = ApplicationActivity.Companion;
                    companion7.setWkCount(companion7.getWkCount() - 1);
                }
                ApplicationActivity.Companion companion8 = ApplicationActivity.Companion;
                companion8.setCounting(companion8.getCounting() - 1);
            } else {
                Players players = createTeamAdapter.getPlayersList().get(viewHolder.getPosition());
                Intrinsics.checkNotNullExpressionValue(players, "playersList[position]");
                boolean access$checkValidation = createTeamAdapter.checkValidation(players, ApplicationActivity.Companion.getCounting(), ApplicationActivity.Companion.getBatsmanCount(), ApplicationActivity.Companion.getBowlerCount(), ApplicationActivity.Companion.getWkCount(), ApplicationActivity.Companion.getAllRounderCount());
                if (!access$checkValidation) {
                    Log.v("CHECK", String.valueOf(access$checkValidation));
                    return;
                }
                String teamId3 = createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).getTeamId();
                Team1 team12 = ApplicationActivity.Companion.getTeam1();
                if (Intrinsics.areEqual((Object) teamId3, (Object) team12 != null ? team12.getTeamId() : null)) {
                    if (ApplicationActivity.Companion.getTeamOneCount() == 7) {
                        Context context2 = viewHolder.context;
                        if (context2 != null) {
                            Resources resources = context2.getResources();
                            Intrinsics.checkNotNull(resources);
                            String string = resources.getString(C1188R.string.you_can_select_max_seven_players_from_a_team);
                            Intrinsics.checkNotNullExpressionValue(string, "context.resources!!.getS…even_players_from_a_team)");
                            ExtensionsKt.showToast(context2, (CharSequence) string);
                            return;
                        }
                        return;
                    }
                    ApplicationActivity.Companion companion9 = ApplicationActivity.Companion;
                    companion9.setTeamOneCount(companion9.getTeamOneCount() + 1);
                }
                String teamId4 = createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).getTeamId();
                Team2 team22 = ApplicationActivity.Companion.getTeam2();
                if (team22 != null) {
                    str = team22.getTeamId();
                }
                if (Intrinsics.areEqual((Object) teamId4, (Object) str)) {
                    if (ApplicationActivity.Companion.getTeamTwoCount() == 7) {
                        Context context3 = viewHolder.context;
                        if (context3 != null) {
                            Resources resources2 = context3.getResources();
                            Intrinsics.checkNotNull(resources2);
                            String string2 = resources2.getString(C1188R.string.you_can_select_max_seven_players_from_a_team);
                            Intrinsics.checkNotNullExpressionValue(string2, "context.resources!!.getS…even_players_from_a_team)");
                            ExtensionsKt.showToast(context3, (CharSequence) string2);
                            return;
                        }
                        return;
                    }
                    ApplicationActivity.Companion companion10 = ApplicationActivity.Companion;
                    companion10.setTeamTwoCount(companion10.getTeamTwoCount() + 1);
                }
                ApplicationActivity.Companion companion11 = ApplicationActivity.Companion;
                companion11.setCredit(companion11.getCredit() - createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).getCreditPoints());
                createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).setSelected(true);
                int roleId2 = createTeamAdapter.getPlayersList().get(viewHolder.getPosition()).getRole().getRoleId();
                if (roleId2 == 1) {
                    ApplicationActivity.Companion companion12 = ApplicationActivity.Companion;
                    companion12.setBatsmanCount(companion12.getBatsmanCount() + 1);
                } else if (roleId2 == 2) {
                    ApplicationActivity.Companion companion13 = ApplicationActivity.Companion;
                    companion13.setBowlerCount(companion13.getBowlerCount() + 1);
                } else if (roleId2 != 3) {
                    ApplicationActivity.Companion companion14 = ApplicationActivity.Companion;
                    companion14.setAllRounderCount(companion14.getAllRounderCount() + 1);
                } else {
                    ApplicationActivity.Companion companion15 = ApplicationActivity.Companion;
                    companion15.setWkCount(companion15.getWkCount() + 1);
                }
                ApplicationActivity.Companion companion16 = ApplicationActivity.Companion;
                companion16.setCounting(companion16.getCounting() + 1);
            }
            createTeamAdapter.notifyItemChanged(viewHolder.getAdapterPosition());
            OnItemClicked onItemClicked = createTeamAdapter.getOnItemClicked();
            Players players2 = createTeamAdapter.getPlayersList().get(viewHolder.getPosition());
            Intrinsics.checkNotNullExpressionValue(players2, "playersList[position]");
            onItemClicked.onItemClicked(players2);
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
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    public final boolean checkValidation(Players players, int i, int i2, int i3, int i4, int i5) {
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        int i10 = 11 - i;
        int i11 = i6 < 3 ? 3 - i6 : 0;
        int i12 = i7 < 3 ? 3 - i7 : 0;
        int i13 = i8 < 1 ? 1 - i8 : 0;
        int i14 = i9 < 1 ? 1 - i9 : 0;
        int roleId = players.getRole().getRoleId();
        if (roleId != 1) {
            if (roleId != 2) {
                if (roleId != 3) {
                    if (roleId == 4) {
                        if (i9 + 1 > 4) {
                            FragmentActivity fragmentActivity = this.context;
                            Resources resources = fragmentActivity.getResources();
                            Intrinsics.checkNotNull(resources);
                            String string = resources.getString(C1188R.string.you_can_select_four_allrounder);
                            Intrinsics.checkNotNullExpressionValue(string, "context.resources!!.getS…n_select_four_allrounder)");
                            ExtensionsKt.showToast((Context) fragmentActivity, (CharSequence) string);
                            return false;
                        } else if (i11 + i12 + i13 < i10) {
                            return true;
                        } else {
                            if (i11 > 0) {
                                FragmentActivity fragmentActivity2 = this.context;
                                Resources resources2 = fragmentActivity2.getResources();
                                Intrinsics.checkNotNull(resources2);
                                String string2 = resources2.getString(C1188R.string.please_select_atleast_three_batters);
                                Intrinsics.checkNotNullExpressionValue(string2, "context.resources!!.getS…ct_atleast_three_batters)");
                                ExtensionsKt.showToast((Context) fragmentActivity2, (CharSequence) string2);
                                return false;
                            } else if (i12 > 0) {
                                FragmentActivity fragmentActivity3 = this.context;
                                Resources resources3 = fragmentActivity3.getResources();
                                Intrinsics.checkNotNull(resources3);
                                String string3 = resources3.getString(C1188R.string.please_select_atleast_three_bowlers);
                                Intrinsics.checkNotNullExpressionValue(string3, "context.resources!!.getS…ct_atleast_three_bowlers)");
                                ExtensionsKt.showToast((Context) fragmentActivity3, (CharSequence) string3);
                                return false;
                            } else if (i13 > 0) {
                                FragmentActivity fragmentActivity4 = this.context;
                                Resources resources4 = fragmentActivity4.getResources();
                                Intrinsics.checkNotNull(resources4);
                                String string4 = resources4.getString(C1188R.string.please_select_atleast_one_wk);
                                Intrinsics.checkNotNullExpressionValue(string4, "context.resources!!.getS…se_select_atleast_one_wk)");
                                ExtensionsKt.showToast((Context) fragmentActivity4, (CharSequence) string4);
                                return false;
                            }
                        }
                    }
                } else if (i8 + 1 > 4) {
                    FragmentActivity fragmentActivity5 = this.context;
                    Resources resources5 = fragmentActivity5.getResources();
                    Intrinsics.checkNotNull(resources5);
                    String string5 = resources5.getString(C1188R.string.you_can_only_select_four_wk);
                    Intrinsics.checkNotNullExpressionValue(string5, "context.resources!!.getS…_can_only_select_four_wk)");
                    ExtensionsKt.showToast((Context) fragmentActivity5, (CharSequence) string5);
                    return false;
                } else if (i11 + i12 + i14 < i10) {
                    return true;
                } else {
                    if (i11 > 0) {
                        FragmentActivity fragmentActivity6 = this.context;
                        Resources resources6 = fragmentActivity6.getResources();
                        Intrinsics.checkNotNull(resources6);
                        String string6 = resources6.getString(C1188R.string.please_select_atleast_three_batters);
                        Intrinsics.checkNotNullExpressionValue(string6, "context.resources!!.getS…ct_atleast_three_batters)");
                        ExtensionsKt.showToast((Context) fragmentActivity6, (CharSequence) string6);
                        return false;
                    } else if (i12 > 0) {
                        FragmentActivity fragmentActivity7 = this.context;
                        Resources resources7 = fragmentActivity7.getResources();
                        Intrinsics.checkNotNull(resources7);
                        String string7 = resources7.getString(C1188R.string.please_select_atleast_three_bowlers);
                        Intrinsics.checkNotNullExpressionValue(string7, "context.resources!!.getS…ct_atleast_three_bowlers)");
                        ExtensionsKt.showToast((Context) fragmentActivity7, (CharSequence) string7);
                        return false;
                    } else if (i14 > 0) {
                        FragmentActivity fragmentActivity8 = this.context;
                        Resources resources8 = fragmentActivity8.getResources();
                        Intrinsics.checkNotNull(resources8);
                        String string8 = resources8.getString(C1188R.string.please_select_atleast_one_allrounder);
                        Intrinsics.checkNotNullExpressionValue(string8, "context.resources!!.getS…t_atleast_one_allrounder)");
                        ExtensionsKt.showToast((Context) fragmentActivity8, (CharSequence) string8);
                        return false;
                    }
                }
            } else if (i7 + 1 > 6) {
                FragmentActivity fragmentActivity9 = this.context;
                Resources resources9 = fragmentActivity9.getResources();
                Intrinsics.checkNotNull(resources9);
                String string9 = resources9.getString(C1188R.string.you_can_select_only_six_bowler);
                Intrinsics.checkNotNullExpressionValue(string9, "context.resources!!.getS…n_select_only_six_bowler)");
                ExtensionsKt.showToast((Context) fragmentActivity9, (CharSequence) string9);
                return false;
            } else if (i11 + i13 + i14 < i10) {
                return true;
            } else {
                if (i11 > 0) {
                    FragmentActivity fragmentActivity10 = this.context;
                    Resources resources10 = fragmentActivity10.getResources();
                    Intrinsics.checkNotNull(resources10);
                    String string10 = resources10.getString(C1188R.string.please_select_atleast_three_batters);
                    Intrinsics.checkNotNullExpressionValue(string10, "context.resources!!.getS…ct_atleast_three_batters)");
                    ExtensionsKt.showToast((Context) fragmentActivity10, (CharSequence) string10);
                    return false;
                } else if (i13 > 0) {
                    FragmentActivity fragmentActivity11 = this.context;
                    Resources resources11 = fragmentActivity11.getResources();
                    Intrinsics.checkNotNull(resources11);
                    String string11 = resources11.getString(C1188R.string.please_select_atleast_one_wk);
                    Intrinsics.checkNotNullExpressionValue(string11, "context.resources!!.getS…se_select_atleast_one_wk)");
                    ExtensionsKt.showToast((Context) fragmentActivity11, (CharSequence) string11);
                    return false;
                } else if (i14 > 0) {
                    FragmentActivity fragmentActivity12 = this.context;
                    Resources resources12 = fragmentActivity12.getResources();
                    Intrinsics.checkNotNull(resources12);
                    String string12 = resources12.getString(C1188R.string.please_select_atleast_one_allrounder);
                    Intrinsics.checkNotNullExpressionValue(string12, "context.resources!!.getS…t_atleast_one_allrounder)");
                    ExtensionsKt.showToast((Context) fragmentActivity12, (CharSequence) string12);
                    return false;
                }
            }
        } else if (i6 + 1 > 6) {
            FragmentActivity fragmentActivity13 = this.context;
            Resources resources13 = fragmentActivity13.getResources();
            Intrinsics.checkNotNull(resources13);
            String string13 = resources13.getString(C1188R.string.you_can_only_select_six_batters);
            Intrinsics.checkNotNullExpressionValue(string13, "context.resources!!.getS…_only_select_six_batters)");
            ExtensionsKt.showToast((Context) fragmentActivity13, (CharSequence) string13);
            return false;
        } else if (i12 + i13 + i14 < i10) {
            return true;
        } else {
            if (i12 > 0) {
                FragmentActivity fragmentActivity14 = this.context;
                Resources resources14 = fragmentActivity14.getResources();
                Intrinsics.checkNotNull(resources14);
                String string14 = resources14.getString(C1188R.string.please_select_atleast_three_bowlers);
                Intrinsics.checkNotNullExpressionValue(string14, "context.resources!!.getS…ct_atleast_three_bowlers)");
                ExtensionsKt.showToast((Context) fragmentActivity14, (CharSequence) string14);
                return false;
            } else if (i13 > 0) {
                FragmentActivity fragmentActivity15 = this.context;
                Resources resources15 = fragmentActivity15.getResources();
                Intrinsics.checkNotNull(resources15);
                String string15 = resources15.getString(C1188R.string.please_select_atleast_one_wk);
                Intrinsics.checkNotNullExpressionValue(string15, "context.resources!!.getS…se_select_atleast_one_wk)");
                ExtensionsKt.showToast((Context) fragmentActivity15, (CharSequence) string15);
                return false;
            } else if (i14 > 0) {
                FragmentActivity fragmentActivity16 = this.context;
                Resources resources16 = fragmentActivity16.getResources();
                Intrinsics.checkNotNull(resources16);
                String string16 = resources16.getString(C1188R.string.please_select_atleast_one_allrounder);
                Intrinsics.checkNotNullExpressionValue(string16, "context.resources!!.getS…t_atleast_one_allrounder)");
                ExtensionsKt.showToast((Context) fragmentActivity16, (CharSequence) string16);
                return false;
            }
        }
        if (i10 > 0) {
            return true;
        }
        FragmentActivity fragmentActivity17 = this.context;
        Resources resources17 = fragmentActivity17.getResources();
        Intrinsics.checkNotNull(resources17);
        String string17 = resources17.getString(C1188R.string.eleven_players_selected_please_continue);
        Intrinsics.checkNotNullExpressionValue(string17, "context.resources!!.getS…selected_please_continue)");
        ExtensionsKt.showToast((Context) fragmentActivity17, (CharSequence) string17);
        return false;
    }
}
