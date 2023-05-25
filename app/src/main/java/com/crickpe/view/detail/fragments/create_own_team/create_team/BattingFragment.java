package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplitude.android.Amplitude;
import com.amplitude.android.Configuration;
import com.amplitude.android.TrackingOptions;
import com.amplitude.core.LoggerProvider;
import com.amplitude.core.ServerZone;
import com.amplitude.core.StorageProvider;
import com.amplitude.core.events.EventOptions;
import com.amplitude.core.events.IngestionMetadata;
import com.amplitude.core.events.Plan;
import com.amplitude.p014id.FileIdentityStorage;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.CreateTeamAdapter;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u00015B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020*H\u0002J\u0010\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010\u0004\u001a\u00020*2\u0006\u0010.\u001a\u00020\u001dH\u0016J\u001a\u0010/\u001a\u00020*2\u0006\u0010,\u001a\u00020-2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\"\u0010\u000f\u001a\u00020*2\u001a\u00102\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cj\n\u0012\u0004\u0012\u00020\u001d\u0018\u0001`\u001eJ\u001e\u00103\u001a\u00020*2\u0016\u00104\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR*\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u00066"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BattingFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/CreateTeamAdapter$OnItemClicked;", "onItemClicked", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BattingFragment$FragmentPlayer;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "createTeamFragment", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateTeamFragment;", "(Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BattingFragment$FragmentPlayer;Lcom/crickpe/view/detail/DetailViewModel;Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateTeamFragment;)V", "adapter", "Lcom/crickpe/view/detail/adapters/CreateTeamAdapter;", "getAdapter", "()Lcom/crickpe/view/detail/adapters/CreateTeamAdapter;", "setAdapter", "(Lcom/crickpe/view/detail/adapters/CreateTeamAdapter;)V", "amplitude", "Lcom/amplitude/android/Amplitude;", "getCreateTeamFragment", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateTeamFragment;", "setCreateTeamFragment", "(Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateTeamFragment;)V", "getOnItemClicked", "()Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BattingFragment$FragmentPlayer;", "setOnItemClicked", "(Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BattingFragment$FragmentPlayer;)V", "playersList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "Lkotlin/collections/ArrayList;", "getPlayersList", "()Ljava/util/ArrayList;", "setPlayersList", "(Ljava/util/ArrayList;)V", "getViewModel", "()Lcom/crickpe/view/detail/DetailViewModel;", "setViewModel", "(Lcom/crickpe/view/detail/DetailViewModel;)V", "getFragmentLayoutResId", "", "listeners", "", "onClick", "view", "Landroid/view/View;", "players", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "list", "updateData", "data", "FragmentPlayer", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BattingFragment.kt */
public final class BattingFragment extends BaseFragment implements View.OnClickListener, CreateTeamAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private CreateTeamAdapter adapter;
    private Amplitude amplitude;
    private CreateTeamFragment createTeamFragment;
    private FragmentPlayer onItemClicked;
    private ArrayList<Players> playersList;
    private DetailViewModel viewModel;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/create_team/BattingFragment$FragmentPlayer;", "", "onItemClicked", "", "players", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: BattingFragment.kt */
    public interface FragmentPlayer {
        void onItemClicked(Players players);
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
        return C1188R.C1193layout.fragment_batting;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public BattingFragment(FragmentPlayer fragmentPlayer, DetailViewModel detailViewModel, CreateTeamFragment createTeamFragment2) {
        Intrinsics.checkNotNullParameter(fragmentPlayer, "onItemClicked");
        Intrinsics.checkNotNullParameter(detailViewModel, "viewModel");
        Intrinsics.checkNotNullParameter(createTeamFragment2, "createTeamFragment");
        this.onItemClicked = fragmentPlayer;
        this.viewModel = detailViewModel;
        this.createTeamFragment = createTeamFragment2;
        this.playersList = new ArrayList<>();
    }

    public final FragmentPlayer getOnItemClicked() {
        return this.onItemClicked;
    }

    public final void setOnItemClicked(FragmentPlayer fragmentPlayer) {
        Intrinsics.checkNotNullParameter(fragmentPlayer, "<set-?>");
        this.onItemClicked = fragmentPlayer;
    }

    public final DetailViewModel getViewModel() {
        return this.viewModel;
    }

    public final void setViewModel(DetailViewModel detailViewModel) {
        Intrinsics.checkNotNullParameter(detailViewModel, "<set-?>");
        this.viewModel = detailViewModel;
    }

    public final CreateTeamFragment getCreateTeamFragment() {
        return this.createTeamFragment;
    }

    public final void setCreateTeamFragment(CreateTeamFragment createTeamFragment2) {
        Intrinsics.checkNotNullParameter(createTeamFragment2, "<set-?>");
        this.createTeamFragment = createTeamFragment2;
    }

    public final ArrayList<Players> getPlayersList() {
        return this.playersList;
    }

    public final void setPlayersList(ArrayList<Players> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.playersList = arrayList;
    }

    public final CreateTeamAdapter getAdapter() {
        return this.adapter;
    }

    public final void setAdapter(CreateTeamAdapter createTeamAdapter) {
        this.adapter = createTeamAdapter;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        try {
            Context applicationContext = requireActivity().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
            String str = Constants.EVENT_CREATE_TEAM_SELECT_PLAYER;
            Configuration configuration = r4;
            Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
            this.amplitude = new Amplitude(configuration);
            Bundle arguments = getArguments();
            Intrinsics.checkNotNull(arguments);
            ArrayList<Players> parcelableArrayList = arguments.getParcelableArrayList("arraylist");
            if (parcelableArrayList != null) {
                this.playersList = parcelableArrayList;
            }
            String string = arguments.getString("title", "");
            setAdapter(parcelableArrayList);
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle)).setText(string);
            if (UserManager.INSTANCE.getUserProfile() != null) {
                try {
                    Amplitude amplitude2 = this.amplitude;
                    String str2 = null;
                    if (amplitude2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                        amplitude2 = null;
                    }
                    com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_CREATE_TEAM_SELECT_PLAYER, (Map) null, (EventOptions) null, 6, (Object) null);
                    FragmentActivity requireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    User userProfile = UserManager.INSTANCE.getUserProfile();
                    String str3 = str;
                    CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, str3);
                    Bundle bundle2 = new Bundle();
                    User userProfile2 = UserManager.INSTANCE.getUserProfile();
                    if (userProfile2 != null) {
                        str2 = userProfile2.get_id();
                    }
                    bundle2.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str2));
                    ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(str3, bundle2);
                } catch (Exception e) {
                    Log.e("Analytics", e.toString());
                }
            }
        } catch (Exception e2) {
            Log.v("BattingFragment", e2.toString());
        }
        listeners();
    }

    private final void listeners() {
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivFilter)).setOnClickListener(this);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.ivFilter) {
            this.createTeamFragment.isVisibleCheck();
        }
    }

    public final void setAdapter(ArrayList<Players> arrayList) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new CreateTeamAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvCreateTeam);
        if (recyclerView != null) {
            recyclerView.setAdapter(this.adapter);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvCreateTeam)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvCreateTeam)).setAdapter(this.adapter);
        CreateTeamAdapter createTeamAdapter = this.adapter;
        if (createTeamAdapter != null) {
            Intrinsics.checkNotNull(arrayList);
            createTeamAdapter.addList(true, arrayList);
        }
    }

    public void onItemClicked(Players players) {
        Intrinsics.checkNotNullParameter(players, "players");
        try {
            if (players.isSelected()) {
                ApplicationActivity.Companion.getSelectedPlayers().add(players);
            } else {
                ApplicationActivity.Companion.getSelectedPlayers().remove(players);
            }
            this.onItemClicked.onItemClicked(players);
        } catch (Exception e) {
            Log.v("Exceptionnn", e.toString());
        }
    }

    public final void updateData(ArrayList<Players> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        CreateTeamAdapter createTeamAdapter = this.adapter;
        if (createTeamAdapter != null && createTeamAdapter != null) {
            createTeamAdapter.addList(true, arrayList);
        }
    }
}
