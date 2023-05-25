package com.crickpe.view.detail.fragments.top_players;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
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
import com.crickpe.databinding.FragmentTopPlayersBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.TopPlayersAdapter;
import com.crickpe.view.detail.fragments.top_players.models.Result;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayerFilter;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayersModel;
import com.crickpe.view.home.adapters.TopPlayerFilterAdapter;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\u0012H\u0016J\b\u0010*\u001a\u00020(H\u0002J\b\u0010+\u001a\u00020(H\u0002J\u0010\u0010,\u001a\u00020(2\u0006\u0010-\u001a\u00020.H\u0016J\u0010\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020\u0018H\u0016J\b\u00101\u001a\u00020(H\u0002J\b\u00102\u001a\u00020(H\u0016J\u001a\u00103\u001a\u00020(2\u0006\u0010-\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u000105H\u0016J\b\u00106\u001a\u00020(H\u0002J \u00107\u001a\u00020(2\u0016\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX.¢\u0006\u0002\n\u0000R.\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001ej\n\u0012\u0004\u0012\u00020\u001f\u0018\u0001` X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X.¢\u0006\u0002\n\u0000¨\u00069"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/top_players/TopPlayersFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter$OnItemClicked;", "()V", "amplitude", "Lcom/amplitude/android/Amplitude;", "binding", "Lcom/crickpe/databinding/FragmentTopPlayersBinding;", "filterId", "", "getFilterId", "()Ljava/lang/String;", "setFilterId", "(Ljava/lang/String;)V", "moreData", "", "page", "", "getPage", "()I", "setPage", "(I)V", "selectedFilter", "Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayerFilter;", "topPlayerFilterAdapter", "Lcom/crickpe/view/home/adapters/TopPlayerFilterAdapter;", "topPlayersAdapter", "Lcom/crickpe/view/detail/adapters/TopPlayersAdapter;", "topplayerList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/top_players/models/Result;", "Lkotlin/collections/ArrayList;", "getTopplayerList", "()Ljava/util/ArrayList;", "setTopplayerList", "(Ljava/util/ArrayList;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "callTrackers", "", "getFragmentLayoutResId", "listeners", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClicked", "topPlayerFilter", "onRecyclerViewScrolled", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setPagination", "data", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopPlayersFragment.kt */
public final class TopPlayersFragment extends BaseFragment implements View.OnClickListener, TopPlayerFilterAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Amplitude amplitude;
    private FragmentTopPlayersBinding binding;
    private String filterId = "";
    /* access modifiers changed from: private */
    public boolean moreData;
    private int page = 1;
    private TopPlayerFilter selectedFilter;
    private TopPlayerFilterAdapter topPlayerFilterAdapter;
    private TopPlayersAdapter topPlayersAdapter;
    private ArrayList<Result> topplayerList;
    /* access modifiers changed from: private */
    public DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopPlayersFragment.kt */
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
        return C1188R.C1193layout.fragment_top_players;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final int getPage() {
        return this.page;
    }

    public final void setPage(int i) {
        this.page = i;
    }

    public final String getFilterId() {
        return this.filterId;
    }

    public final void setFilterId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.filterId = str;
    }

    public final ArrayList<Result> getTopplayerList() {
        return this.topplayerList;
    }

    public final void setTopplayerList(ArrayList<Result> arrayList) {
        this.topplayerList = arrayList;
    }

    public void onItemClicked(TopPlayerFilter topPlayerFilter) {
        Intrinsics.checkNotNullParameter(topPlayerFilter, "topPlayerFilter");
        this.selectedFilter = topPlayerFilter;
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFilter);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlFilter");
        CommonMethodsKt.hide(relativeLayout);
        this.page = 1;
        this.filterId = String.valueOf(topPlayerFilter.getFilterId());
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.topPlayersApi(this.filterId, this.page);
    }

    public void onResume() {
        super.onResume();
        SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
        boolean z = !Intrinsics.areEqual((Object) String.valueOf(appSettings != null ? appSettings.isActiveTopPlayerSorting() : null), (Object) "iccRanking");
        if (z) {
            FragmentTopPlayersBinding fragmentTopPlayersBinding = this.binding;
            Intrinsics.checkNotNull(fragmentTopPlayersBinding);
            TextView textView = fragmentTopPlayersBinding.tvEarnings;
            Intrinsics.checkNotNullExpressionValue(textView, "binding!!.tvEarnings");
            CommonMethodsKt.visible(textView);
        } else {
            FragmentTopPlayersBinding fragmentTopPlayersBinding2 = this.binding;
            Intrinsics.checkNotNull(fragmentTopPlayersBinding2);
            TextView textView2 = fragmentTopPlayersBinding2.tvEarnings;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding!!.tvEarnings");
            CommonMethodsKt.hide(textView2);
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getResources().getString(C1188R.string.top_players);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.top_players)");
            ((DetailActivity) activity).setTopBar(string, true, false, false, z, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentTopPlayersBinding.bind(view);
        DetailViewModel detailViewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.viewModel = detailViewModel;
        this.page = 1;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.topPlayersApi("", this.page);
        this.topplayerList = new ArrayList<>();
        observeData();
        setAdapter();
        listeners();
        callTrackers();
    }

    private final void callTrackers() {
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
        Configuration configuration = r4;
        Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
        this.amplitude = new Amplitude(configuration);
        try {
            if (UserManager.INSTANCE.getUserProfile() != null) {
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                User userProfile = UserManager.INSTANCE.getUserProfile();
                Amplitude amplitude2 = null;
                CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_TOP_PLAYER_LISTING);
                Bundle bundle = new Bundle();
                User userProfile2 = UserManager.INSTANCE.getUserProfile();
                bundle.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(userProfile2 != null ? userProfile2.get_id() : null));
                ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_TOP_PLAYER_LISTING, bundle);
                Amplitude amplitude3 = this.amplitude;
                if (amplitude3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                } else {
                    amplitude2 = amplitude3;
                }
                com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_TOP_PLAYER_LISTING, (Map) null, (EventOptions) null, 6, (Object) null);
            }
        } catch (Exception e) {
            Log.e("Analytics", e.toString());
        }
    }

    private final void listeners() {
        FragmentTopPlayersBinding fragmentTopPlayersBinding = this.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding);
        fragmentTopPlayersBinding.rvTopPlayers.setOnClickListener(this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((ImageView) ((DetailActivity) activity)._$_findCachedViewById(C1188R.C1192id.ivFilterTopPlayer)).setOnClickListener(new TopPlayersFragment$$ExternalSyntheticLambda0(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-0  reason: not valid java name */
    public static final void m3633listeners$lambda0(TopPlayersFragment topPlayersFragment, View view) {
        Intrinsics.checkNotNullParameter(topPlayersFragment, "this$0");
        FragmentTopPlayersBinding fragmentTopPlayersBinding = topPlayersFragment.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding);
        RelativeLayout relativeLayout = fragmentTopPlayersBinding.rlFilter;
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding!!.rlFilter");
        if (relativeLayout.getVisibility() == 0) {
            FragmentTopPlayersBinding fragmentTopPlayersBinding2 = topPlayersFragment.binding;
            Intrinsics.checkNotNull(fragmentTopPlayersBinding2);
            RelativeLayout relativeLayout2 = fragmentTopPlayersBinding2.rlFilter;
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "binding!!.rlFilter");
            CommonMethodsKt.hide(relativeLayout2);
            return;
        }
        FragmentTopPlayersBinding fragmentTopPlayersBinding3 = topPlayersFragment.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding3);
        RelativeLayout relativeLayout3 = fragmentTopPlayersBinding3.rlFilter;
        Intrinsics.checkNotNullExpressionValue(relativeLayout3, "binding!!.rlFilter");
        CommonMethodsKt.visible(relativeLayout3);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() == C1188R.C1192id.rvTopPlayers) {
            FragmentTopPlayersBinding fragmentTopPlayersBinding = this.binding;
            Intrinsics.checkNotNull(fragmentTopPlayersBinding);
            RelativeLayout relativeLayout = fragmentTopPlayersBinding.rlFilter;
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding!!.rlFilter");
            if (relativeLayout.getVisibility() == 0) {
                FragmentTopPlayersBinding fragmentTopPlayersBinding2 = this.binding;
                Intrinsics.checkNotNull(fragmentTopPlayersBinding2);
                RelativeLayout relativeLayout2 = fragmentTopPlayersBinding2.rlFilter;
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "binding!!.rlFilter");
                CommonMethodsKt.hide(relativeLayout2);
            }
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<TopPlayersModel>> topPlayers = detailViewModel.getTopPlayers();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        topPlayers.observe(viewLifecycleOwner, new TopPlayersFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3634observeData$lambda1(TopPlayersFragment topPlayersFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(topPlayersFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                TopPlayersModel topPlayersModel = (TopPlayersModel) apiResponseHandler.getData();
                FragmentTopPlayersBinding fragmentTopPlayersBinding = topPlayersFragment.binding;
                Intrinsics.checkNotNull(fragmentTopPlayersBinding);
                ProgressBar progressBar = fragmentTopPlayersBinding.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar, "binding!!.progressBar");
                CommonMethodsKt.hide(progressBar);
                if (topPlayersModel != null) {
                    ArrayList<Result> result = topPlayersModel.getResult();
                    topPlayersFragment.topplayerList = result;
                    Intrinsics.checkNotNull(result);
                    topPlayersFragment.setPagination(result);
                    TopPlayerFilterAdapter topPlayerFilterAdapter2 = topPlayersFragment.topPlayerFilterAdapter;
                    TopPlayerFilterAdapter topPlayerFilterAdapter3 = null;
                    if (topPlayerFilterAdapter2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
                        topPlayerFilterAdapter2 = null;
                    }
                    topPlayerFilterAdapter2.getFilterModel().clear();
                    TopPlayerFilterAdapter topPlayerFilterAdapter4 = topPlayersFragment.topPlayerFilterAdapter;
                    if (topPlayerFilterAdapter4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
                    } else {
                        topPlayerFilterAdapter3 = topPlayerFilterAdapter4;
                    }
                    topPlayerFilterAdapter3.addList(topPlayersModel.getTopPlayerFilters(), topPlayersFragment.selectedFilter);
                }
            } else if (i == 2) {
                FragmentTopPlayersBinding fragmentTopPlayersBinding2 = topPlayersFragment.binding;
                Intrinsics.checkNotNull(fragmentTopPlayersBinding2);
                ProgressBar progressBar2 = fragmentTopPlayersBinding2.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar2, "binding!!.progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                FragmentTopPlayersBinding fragmentTopPlayersBinding3 = topPlayersFragment.binding;
                Intrinsics.checkNotNull(fragmentTopPlayersBinding3);
                ProgressBar progressBar3 = fragmentTopPlayersBinding3.progressBar;
                Intrinsics.checkNotNullExpressionValue(progressBar3, "binding!!.progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.topPlayersAdapter = new TopPlayersAdapter(requireActivity);
        FragmentTopPlayersBinding fragmentTopPlayersBinding = this.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding);
        RecyclerView recyclerView = fragmentTopPlayersBinding.rvTopPlayers;
        TopPlayersAdapter topPlayersAdapter2 = this.topPlayersAdapter;
        TopPlayerFilterAdapter topPlayerFilterAdapter2 = null;
        if (topPlayersAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayersAdapter");
            topPlayersAdapter2 = null;
        }
        recyclerView.setAdapter(topPlayersAdapter2);
        FragmentTopPlayersBinding fragmentTopPlayersBinding2 = this.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding2);
        fragmentTopPlayersBinding2.rvTopPlayers.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        FragmentTopPlayersBinding fragmentTopPlayersBinding3 = this.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding3);
        RecyclerView recyclerView2 = fragmentTopPlayersBinding3.rvTopPlayers;
        TopPlayersAdapter topPlayersAdapter3 = this.topPlayersAdapter;
        if (topPlayersAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayersAdapter");
            topPlayersAdapter3 = null;
        }
        recyclerView2.setAdapter(topPlayersAdapter3);
        onRecyclerViewScrolled();
        FragmentActivity requireActivity2 = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
        this.topPlayerFilterAdapter = new TopPlayerFilterAdapter(this, requireActivity2);
        FragmentTopPlayersBinding fragmentTopPlayersBinding4 = this.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding4);
        RecyclerView recyclerView3 = fragmentTopPlayersBinding4.rvFilter;
        TopPlayerFilterAdapter topPlayerFilterAdapter3 = this.topPlayerFilterAdapter;
        if (topPlayerFilterAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
            topPlayerFilterAdapter3 = null;
        }
        recyclerView3.setAdapter(topPlayerFilterAdapter3);
        FragmentTopPlayersBinding fragmentTopPlayersBinding5 = this.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding5);
        fragmentTopPlayersBinding5.rvFilter.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        FragmentTopPlayersBinding fragmentTopPlayersBinding6 = this.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding6);
        RecyclerView recyclerView4 = fragmentTopPlayersBinding6.rvFilter;
        TopPlayerFilterAdapter topPlayerFilterAdapter4 = this.topPlayerFilterAdapter;
        if (topPlayerFilterAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayerFilterAdapter");
        } else {
            topPlayerFilterAdapter2 = topPlayerFilterAdapter4;
        }
        recyclerView4.setAdapter(topPlayerFilterAdapter2);
    }

    private final void setPagination(ArrayList<Result> arrayList) {
        boolean z = true;
        if (this.page == 1) {
            if (arrayList.isEmpty()) {
                Log.v("MORE_DATA", "NO");
            } else {
                Log.v("MORE_DATA", "YES");
            }
        }
        boolean z2 = this.page == 1;
        TopPlayersAdapter topPlayersAdapter2 = this.topPlayersAdapter;
        if (topPlayersAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("topPlayersAdapter");
            topPlayersAdapter2 = null;
        }
        topPlayersAdapter2.addList(z2, arrayList);
        if (arrayList.size() < 10) {
            z = false;
        }
        this.moreData = z;
    }

    private final void onRecyclerViewScrolled() {
        FragmentTopPlayersBinding fragmentTopPlayersBinding = this.binding;
        Intrinsics.checkNotNull(fragmentTopPlayersBinding);
        fragmentTopPlayersBinding.rvTopPlayers.addOnScrollListener(new TopPlayersFragment$onRecyclerViewScrolled$1(this));
    }
}
