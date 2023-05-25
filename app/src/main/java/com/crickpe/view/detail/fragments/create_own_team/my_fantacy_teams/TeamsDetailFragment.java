package com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u0016\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020$H\u0002J\u0010\u0010(\u001a\u00020$2\u0006\u0010)\u001a\u00020*H\u0016J\u001a\u0010+\u001a\u00020$2\u0006\u0010)\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001e\u0010.\u001a\u00020$2\u0006\u0010/\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u00182\u0006\u00100\u001a\u000201R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR.\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0018\u0018\u0001`\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0007\"\u0004\b \u0010\tR\u000e\u0010!\u001a\u00020\"X.¢\u0006\u0002\n\u0000¨\u00062"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/TeamsDetailFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "fantasyTeamId", "", "getFantasyTeamId", "()Ljava/lang/String;", "setFantasyTeamId", "(Ljava/lang/String;)V", "fantasyTeamListModel", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "getFantasyTeamListModel", "()Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "setFantasyTeamListModel", "(Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;)V", "from", "getFrom", "setFrom", "matchId", "getMatchId", "setMatchId", "players", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamPlayers;", "Lkotlin/collections/ArrayList;", "getPlayers", "()Ljava/util/ArrayList;", "setPlayers", "(Ljava/util/ArrayList;)V", "totalPoints", "getTotalPoints", "setTotalPoints", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "addLayout", "", "getFragmentLayoutResId", "", "observeData", "onClick", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setLayout", "layout", "layoutContainer", "Landroid/widget/LinearLayout;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TeamsDetailFragment.kt */
public final class TeamsDetailFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private String fantasyTeamId = "";
    private FantasyTeamListModel fantasyTeamListModel;
    private String from = "";
    private String matchId = "";
    private ArrayList<FantasyTeamPlayers> players;
    private String totalPoints = "";
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TeamsDetailFragment.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            iArr[Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getFragmentLayoutResId() {
        return C1188R.C1193layout.fragment_my_teams_detail;
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }

    public final void setFantasyTeamId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fantasyTeamId = str;
    }

    public final FantasyTeamListModel getFantasyTeamListModel() {
        return this.fantasyTeamListModel;
    }

    public final void setFantasyTeamListModel(FantasyTeamListModel fantasyTeamListModel2) {
        this.fantasyTeamListModel = fantasyTeamListModel2;
    }

    public final ArrayList<FantasyTeamPlayers> getPlayers() {
        return this.players;
    }

    public final void setPlayers(ArrayList<FantasyTeamPlayers> arrayList) {
        this.players = arrayList;
    }

    public final String getFrom() {
        return this.from;
    }

    public final void setFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.from = str;
    }

    public final String getTotalPoints() {
        return this.totalPoints;
    }

    public final void setTotalPoints(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.totalPoints = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        observeData();
        if (UserManager.INSTANCE.getMatch() != null) {
            UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
            Intrinsics.checkNotNull(match);
            this.matchId = match.get_id();
        }
        if (getArguments() != null) {
            this.matchId = String.valueOf(requireArguments().getString("matchId"));
            this.fantasyTeamId = String.valueOf(requireArguments().getString("fantasyTeamId"));
            this.totalPoints = String.valueOf(requireArguments().getString("totalPoints"));
            this.from = String.valueOf(requireArguments().getString("from"));
            this.fantasyTeamListModel = (FantasyTeamListModel) new Gson().fromJson(String.valueOf(requireArguments().getString("TEAM")), FantasyTeamListModel.class);
            if (Intrinsics.areEqual((Object) this.from, (Object) "Leaderboard")) {
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTotalPoints);
                Intrinsics.checkNotNullExpressionValue(textView, "tvTotalPoints");
                CommonMethodsKt.visible(textView);
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTotalPoints)).setText(this.totalPoints + " pts");
            } else {
                TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTotalPoints);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvTotalPoints");
                CommonMethodsKt.hide(textView2);
            }
        }
        try {
            if (this.fantasyTeamListModel != null) {
                ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerWk)).removeAllViews();
                ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBat)).removeAllViews();
                ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBowlers)).removeAllViews();
                ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerAllRound)).removeAllViews();
                FantasyTeamListModel fantasyTeamListModel2 = this.fantasyTeamListModel;
                Intrinsics.checkNotNull(fantasyTeamListModel2);
                int size = fantasyTeamListModel2.getPlayers().size();
                for (int i = 0; i < size; i++) {
                    FantasyTeamListModel fantasyTeamListModel3 = this.fantasyTeamListModel;
                    Intrinsics.checkNotNull(fantasyTeamListModel3);
                    if (fantasyTeamListModel3.getPlayers().get(i).isFantasyCaptain()) {
                        FantasyTeamListModel fantasyTeamListModel4 = this.fantasyTeamListModel;
                        Intrinsics.checkNotNull(fantasyTeamListModel4);
                        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvCaptainn)).setText(fantasyTeamListModel4.getPlayers().get(i).getName());
                        ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivCaptain);
                        Intrinsics.checkNotNullExpressionValue(imageView, "ivCaptain");
                        FantasyTeamListModel fantasyTeamListModel5 = this.fantasyTeamListModel;
                        Intrinsics.checkNotNull(fantasyTeamListModel5);
                        String imageUrl = fantasyTeamListModel5.getPlayers().get(i).getImageUrl();
                        if (imageUrl == null) {
                            str2 = "";
                        } else {
                            str2 = imageUrl;
                        }
                        ExtensionsKt.loadImage$default(imageView, str2, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                    }
                    FantasyTeamListModel fantasyTeamListModel6 = this.fantasyTeamListModel;
                    Intrinsics.checkNotNull(fantasyTeamListModel6);
                    if (fantasyTeamListModel6.getPlayers().get(i).isFantasyViceCaptain()) {
                        FantasyTeamListModel fantasyTeamListModel7 = this.fantasyTeamListModel;
                        Intrinsics.checkNotNull(fantasyTeamListModel7);
                        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvVCaptainn)).setText(fantasyTeamListModel7.getPlayers().get(i).getName());
                        ImageView imageView2 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivVCaptain);
                        Intrinsics.checkNotNullExpressionValue(imageView2, "ivVCaptain");
                        FantasyTeamListModel fantasyTeamListModel8 = this.fantasyTeamListModel;
                        Intrinsics.checkNotNull(fantasyTeamListModel8);
                        String imageUrl2 = fantasyTeamListModel8.getPlayers().get(i).getImageUrl();
                        if (imageUrl2 == null) {
                            str = "";
                        } else {
                            str = imageUrl2;
                        }
                        ExtensionsKt.loadImage$default(imageView2, str, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                    }
                    FantasyTeamListModel fantasyTeamListModel9 = this.fantasyTeamListModel;
                    Intrinsics.checkNotNull(fantasyTeamListModel9);
                    int roleId = fantasyTeamListModel9.getPlayers().get(i).getRole().getRoleId();
                    if (roleId == 1) {
                        FantasyTeamListModel fantasyTeamListModel10 = this.fantasyTeamListModel;
                        Intrinsics.checkNotNull(fantasyTeamListModel10);
                        FantasyTeamPlayers fantasyTeamPlayers = fantasyTeamListModel10.getPlayers().get(i);
                        Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers, "fantasyTeamListModel!!.players[i]");
                        addLayout(fantasyTeamPlayers);
                    } else if (roleId == 2) {
                        FantasyTeamListModel fantasyTeamListModel11 = this.fantasyTeamListModel;
                        Intrinsics.checkNotNull(fantasyTeamListModel11);
                        FantasyTeamPlayers fantasyTeamPlayers2 = fantasyTeamListModel11.getPlayers().get(i);
                        Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers2, "fantasyTeamListModel!!.players[i]");
                        addLayout(fantasyTeamPlayers2);
                    } else if (roleId != 3) {
                        FantasyTeamListModel fantasyTeamListModel12 = this.fantasyTeamListModel;
                        Intrinsics.checkNotNull(fantasyTeamListModel12);
                        FantasyTeamPlayers fantasyTeamPlayers3 = fantasyTeamListModel12.getPlayers().get(i);
                        Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers3, "fantasyTeamListModel!!.players[i]");
                        addLayout(fantasyTeamPlayers3);
                    } else {
                        FantasyTeamListModel fantasyTeamListModel13 = this.fantasyTeamListModel;
                        Intrinsics.checkNotNull(fantasyTeamListModel13);
                        FantasyTeamPlayers fantasyTeamPlayers4 = fantasyTeamListModel13.getPlayers().get(i);
                        Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers4, "fantasyTeamListModel!!.players[i]");
                        addLayout(fantasyTeamPlayers4);
                    }
                }
            } else {
                DetailViewModel detailViewModel = this.viewModel;
                if (detailViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel = null;
                }
                detailViewModel.getFantasyTeam(this.fantasyTeamId);
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                DetailActivity.setTopBar$default((DetailActivity) activity, "", false, true, false, false, true, false, false, 192, (Object) null);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
        } catch (Exception e) {
            Log.v("Exception", e.toString());
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamPlayers>>> fantasyTeamById = detailViewModel.getFantasyTeamById();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        fantasyTeamById.observe(viewLifecycleOwner, new TeamsDetailFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3560observeData$lambda0(TeamsDetailFragment teamsDetailFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(teamsDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ArrayList<FantasyTeamPlayers> arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    teamsDetailFragment.players = arrayList;
                    Intrinsics.checkNotNull(arrayList);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ArrayList<FantasyTeamPlayers> arrayList2 = teamsDetailFragment.players;
                        Intrinsics.checkNotNull(arrayList2);
                        String str = null;
                        if (arrayList2.get(i2).isFantasyCaptain()) {
                            ArrayList<FantasyTeamPlayers> arrayList3 = teamsDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList3);
                            ((TextView) teamsDetailFragment._$_findCachedViewById(C1188R.C1192id.tvCaptainn)).setText(arrayList3.get(i2).getName());
                            RequestManager with = Glide.with(teamsDetailFragment.requireActivity());
                            StringBuilder sb = new StringBuilder();
                            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
                            sb.append(appSettings != null ? appSettings.getImageBaseUrl() : null);
                            ArrayList<FantasyTeamPlayers> arrayList4 = teamsDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList4);
                            sb.append(arrayList4.get(i2).getImageUrl());
                            with.load(sb.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) teamsDetailFragment._$_findCachedViewById(C1188R.C1192id.ivCaptain));
                        }
                        ArrayList<FantasyTeamPlayers> arrayList5 = teamsDetailFragment.players;
                        Intrinsics.checkNotNull(arrayList5);
                        if (arrayList5.get(i2).isFantasyViceCaptain()) {
                            ArrayList<FantasyTeamPlayers> arrayList6 = teamsDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList6);
                            ((TextView) teamsDetailFragment._$_findCachedViewById(C1188R.C1192id.tvVCaptainn)).setText(arrayList6.get(i2).getName());
                            RequestManager with2 = Glide.with(teamsDetailFragment.requireActivity());
                            StringBuilder sb2 = new StringBuilder();
                            SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                            if (appSettings2 != null) {
                                str = appSettings2.getImageBaseUrl();
                            }
                            sb2.append(str);
                            ArrayList<FantasyTeamPlayers> arrayList7 = teamsDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList7);
                            sb2.append(arrayList7.get(i2).getImageUrl());
                            with2.load(sb2.toString()).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.profile_placeholder)).into((ImageView) teamsDetailFragment._$_findCachedViewById(C1188R.C1192id.ivVCaptain));
                        }
                        ArrayList<FantasyTeamPlayers> arrayList8 = teamsDetailFragment.players;
                        Intrinsics.checkNotNull(arrayList8);
                        int roleId = arrayList8.get(i2).getRole().getRoleId();
                        if (roleId == 1) {
                            ArrayList<FantasyTeamPlayers> arrayList9 = teamsDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList9);
                            FantasyTeamPlayers fantasyTeamPlayers = arrayList9.get(i2);
                            Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers, "players!![i]");
                            teamsDetailFragment.addLayout(fantasyTeamPlayers);
                        } else if (roleId == 2) {
                            ArrayList<FantasyTeamPlayers> arrayList10 = teamsDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList10);
                            FantasyTeamPlayers fantasyTeamPlayers2 = arrayList10.get(i2);
                            Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers2, "players!![i]");
                            teamsDetailFragment.addLayout(fantasyTeamPlayers2);
                        } else if (roleId != 3) {
                            ArrayList<FantasyTeamPlayers> arrayList11 = teamsDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList11);
                            FantasyTeamPlayers fantasyTeamPlayers3 = arrayList11.get(i2);
                            Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers3, "players!![i]");
                            teamsDetailFragment.addLayout(fantasyTeamPlayers3);
                        } else {
                            ArrayList<FantasyTeamPlayers> arrayList12 = teamsDetailFragment.players;
                            Intrinsics.checkNotNull(arrayList12);
                            FantasyTeamPlayers fantasyTeamPlayers4 = arrayList12.get(i2);
                            Intrinsics.checkNotNullExpressionValue(fantasyTeamPlayers4, "players!![i]");
                            teamsDetailFragment.addLayout(fantasyTeamPlayers4);
                        }
                    }
                }
            } else if (i == 2) {
                Log.v("ErROR", String.valueOf(apiResponseHandler.getData()));
            }
        }
    }

    private final void addLayout(FantasyTeamPlayers fantasyTeamPlayers) {
        int roleId = fantasyTeamPlayers.getRole().getRoleId();
        if (roleId == 1) {
            View inflate = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBat), false);
            Intrinsics.checkNotNullExpressionValue(inflate, "from(requireActivity())\n…d, llContainerBat, false)");
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBat);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llContainerBat");
            setLayout(inflate, fantasyTeamPlayers, linearLayout);
        } else if (roleId == 2) {
            View inflate2 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBowlers), false);
            Intrinsics.checkNotNullExpressionValue(inflate2, "from(requireActivity())\n…lContainerBowlers, false)");
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerBowlers);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llContainerBowlers");
            setLayout(inflate2, fantasyTeamPlayers, linearLayout2);
        } else if (roleId == 3) {
            View inflate3 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerWk), false);
            Intrinsics.checkNotNullExpressionValue(inflate3, "from(requireActivity())\n…nd, llContainerWk, false)");
            LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerWk);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "llContainerWk");
            setLayout(inflate3, fantasyTeamPlayers, linearLayout3);
        } else if (roleId == 4) {
            View inflate4 = LayoutInflater.from(requireActivity()).inflate(C1188R.C1193layout.player_preview_on_ground, (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerAllRound), false);
            Intrinsics.checkNotNullExpressionValue(inflate4, "from(requireActivity())\n…ContainerAllRound, false)");
            LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llContainerAllRound);
            Intrinsics.checkNotNullExpressionValue(linearLayout4, "llContainerAllRound");
            setLayout(inflate4, fantasyTeamPlayers, linearLayout4);
        }
    }

    public final void setLayout(View view, FantasyTeamPlayers fantasyTeamPlayers, LinearLayout linearLayout) {
        String str;
        Intrinsics.checkNotNullParameter(view, "layout");
        Intrinsics.checkNotNullParameter(fantasyTeamPlayers, "players");
        Intrinsics.checkNotNullParameter(linearLayout, "layoutContainer");
        View findViewById = view.findViewById(C1188R.C1192id.ivPlayer);
        if (findViewById != null) {
            ImageView imageView = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C1188R.C1192id.tvPoints);
            if (findViewById2 != null) {
                TextView textView = (TextView) findViewById2;
                View findViewById3 = view.findViewById(C1188R.C1192id.tvType);
                if (findViewById3 != null) {
                    TextView textView2 = (TextView) findViewById3;
                    if (fantasyTeamPlayers.isFantasyCaptain()) {
                        String string = requireContext().getString(C1188R.string.f424c);
                        Intrinsics.checkNotNullExpressionValue(string, "requireContext().getString(R.string.c)");
                        textView2.setText(string);
                        CommonMethodsKt.visible(textView2);
                    } else if (fantasyTeamPlayers.isFantasyViceCaptain()) {
                        String string2 = requireContext().getString(C1188R.string.f428vc);
                        Intrinsics.checkNotNullExpressionValue(string2, "requireContext().getString(R.string.vc)");
                        textView2.setText(string2);
                        CommonMethodsKt.visible(textView2);
                    } else {
                        CommonMethodsKt.hide(textView2);
                    }
                    if (!Intrinsics.areEqual((Object) this.from, (Object) "Contest")) {
                        textView.setText(((int) fantasyTeamPlayers.getFantasyPoints()) + ' ' + getResources().getString(C1188R.string.pts));
                    } else {
                        textView.setText("");
                    }
                    View findViewById4 = view.findViewById(C1188R.C1192id.tvName);
                    if (findViewById4 != null) {
                        ((TextView) findViewById4).setText(printInitials(fantasyTeamPlayers.getName()));
                        String imageUrl = fantasyTeamPlayers.getImageUrl();
                        if (imageUrl == null) {
                            str = "";
                        } else {
                            str = imageUrl;
                        }
                        ExtensionsKt.loadImage$default(imageView, str, C1188R.C1190drawable.profile_placeholder, false, 4, (Object) null);
                        linearLayout.addView(view);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
    }
}
