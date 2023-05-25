package com.crickpe.view.detail.fragments.upcoming;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
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
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.UpcomingMatchesAdapter;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(mo48221d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 02\u00020\u00012\u00020\u00022\u00020\u0003:\u00010B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\bH\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0010\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0018H\u0002J\b\u0010!\u001a\u00020\u0018H\u0016J\b\u0010\"\u001a\u00020\u0018H\u0016J\u001a\u0010#\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\b\u0010&\u001a\u00020\u0018H\u0002J\u0016\u0010'\u001a\u00020\u00182\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u001f0)H\u0002J&\u0010*\u001a\u00020\u00182\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u0010/\u001a\u00020,R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\fR\u000e\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000¨\u00061"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter$OnItemClicked;", "()V", "amplitude", "Lcom/amplitude/android/Amplitude;", "clickItem", "", "getClickItem", "()I", "setClickItem", "(I)V", "moreData", "", "page", "getPage", "setPage", "upcomingMatchesAdapter", "Lcom/crickpe/view/detail/adapters/UpcomingMatchesAdapter;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "listeners", "", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClicked", "upcomingMatchModel", "Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "onRecyclerViewScrolled", "onResume", "onTimeFinish", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "setPagination", "data", "Ljava/util/ArrayList;", "setTextColor", "colorTv", "Landroid/widget/TextView;", "fadeTv1", "fadeTv2", "fadeTv3", "Companion", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UpcomingMatchFragment.kt */
public final class UpcomingMatchFragment extends BaseFragment implements View.OnClickListener, UpcomingMatchesAdapter.OnItemClicked {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static final String TAG = "UpcomingMatchFragment";
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Amplitude amplitude;
    private int clickItem;
    /* access modifiers changed from: private */
    public boolean moreData;
    private int page = 1;
    private UpcomingMatchesAdapter upcomingMatchesAdapter;
    /* access modifiers changed from: private */
    public DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: UpcomingMatchFragment.kt */
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
        return C1188R.C1193layout.fragment_upcoming_match;
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

    public final int getClickItem() {
        return this.clickItem;
    }

    public final void setClickItem(int i) {
        this.clickItem = i;
    }

    @Metadata(mo48221d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchFragment$Companion;", "", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: UpcomingMatchFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String getTAG() {
            return UpcomingMatchFragment.TAG;
        }
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getResources().getString(C1188R.string.upcoming_matches);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.upcoming_matches)");
            ((DetailActivity) activity).setTopBar(string, true, false, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Amplitude amplitude2;
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        listeners();
        this.page = 1;
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getUpcomingMatches(this.page);
        setAdapter();
        observeData();
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
        Configuration configuration = r5;
        Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
        this.amplitude = new Amplitude(configuration);
        if (UserManager.INSTANCE.getUserProfile() != null) {
            try {
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                User userProfile = UserManager.INSTANCE.getUserProfile();
                CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_UPCOMING_MATCH);
                Bundle bundle2 = new Bundle();
                User userProfile2 = UserManager.INSTANCE.getUserProfile();
                bundle2.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(userProfile2 != null ? userProfile2.get_id() : null));
                ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_UPCOMING_MATCH, bundle2);
                Amplitude amplitude3 = this.amplitude;
                if (amplitude3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                    amplitude2 = null;
                } else {
                    amplitude2 = amplitude3;
                }
                com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_UPCOMING_MATCH, (Map) null, (EventOptions) null, 6, (Object) null);
            } catch (Exception e) {
                Log.e("Analytics", e.toString());
            }
        }
    }

    private final void listeners() {
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvAll)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvLatest)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvInternational)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvDomestic)).setOnClickListener(onClickListener);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        switch (view.getId()) {
            case C1188R.C1192id.tvAll:
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAll);
                Intrinsics.checkNotNullExpressionValue(textView, "tvAll");
                TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvLatest);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvLatest");
                TextView textView3 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvInternational);
                Intrinsics.checkNotNullExpressionValue(textView3, "tvInternational");
                TextView textView4 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvDomestic);
                Intrinsics.checkNotNullExpressionValue(textView4, "tvDomestic");
                setTextColor(textView, textView2, textView3, textView4);
                return;
            case C1188R.C1192id.tvDomestic:
                TextView textView5 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvDomestic);
                Intrinsics.checkNotNullExpressionValue(textView5, "tvDomestic");
                TextView textView6 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvLatest);
                Intrinsics.checkNotNullExpressionValue(textView6, "tvLatest");
                TextView textView7 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvInternational);
                Intrinsics.checkNotNullExpressionValue(textView7, "tvInternational");
                TextView textView8 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAll);
                Intrinsics.checkNotNullExpressionValue(textView8, "tvAll");
                setTextColor(textView5, textView6, textView7, textView8);
                return;
            case C1188R.C1192id.tvInternational:
                TextView textView9 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvInternational);
                Intrinsics.checkNotNullExpressionValue(textView9, "tvInternational");
                TextView textView10 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvLatest);
                Intrinsics.checkNotNullExpressionValue(textView10, "tvLatest");
                TextView textView11 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAll);
                Intrinsics.checkNotNullExpressionValue(textView11, "tvAll");
                TextView textView12 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvDomestic);
                Intrinsics.checkNotNullExpressionValue(textView12, "tvDomestic");
                setTextColor(textView9, textView10, textView11, textView12);
                return;
            case C1188R.C1192id.tvLatest:
                TextView textView13 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvLatest);
                Intrinsics.checkNotNullExpressionValue(textView13, "tvLatest");
                TextView textView14 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAll);
                Intrinsics.checkNotNullExpressionValue(textView14, "tvAll");
                TextView textView15 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvInternational);
                Intrinsics.checkNotNullExpressionValue(textView15, "tvInternational");
                TextView textView16 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvDomestic);
                Intrinsics.checkNotNullExpressionValue(textView16, "tvDomestic");
                setTextColor(textView13, textView14, textView15, textView16);
                return;
            default:
                return;
        }
    }

    public final void setTextColor(TextView textView, TextView textView2, TextView textView3, TextView textView4) {
        Intrinsics.checkNotNullParameter(textView, "colorTv");
        Intrinsics.checkNotNullParameter(textView2, "fadeTv1");
        Intrinsics.checkNotNullParameter(textView3, "fadeTv2");
        Intrinsics.checkNotNullParameter(textView4, "fadeTv3");
        textView.setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.app_color_one));
        textView2.setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.grey_new));
        textView3.setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.grey_new));
        textView4.setTextColor(AppCompatResources.getColorStateList(requireContext(), C1188R.C1189color.grey_new));
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<UpcomingMatchModel>>> getUpcomingMatches = detailViewModel.getGetUpcomingMatches();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getUpcomingMatches.observe(viewLifecycleOwner, new UpcomingMatchFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3635observeData$lambda1(UpcomingMatchFragment upcomingMatchFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(upcomingMatchFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) upcomingMatchFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList == null) {
                    return;
                }
                if (arrayList.size() > 0) {
                    int i2 = 0;
                    int size = ((ArrayList) apiResponseHandler.getData()).size();
                    while (true) {
                        String str = null;
                        if (i2 < size) {
                            if (((UpcomingMatchModel) arrayList.get(i2)).getStartAtIST() != null) {
                                try {
                                    Long startAtIST = ((UpcomingMatchModel) arrayList.get(i2)).getStartAtIST();
                                    if (startAtIST != null) {
                                        str = upcomingMatchFragment.getDateString(startAtIST.longValue());
                                    }
                                    ((UpcomingMatchModel) arrayList.get(i2)).setRemainingTime(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault()).parse(str).getTime() - Calendar.getInstance().getTime().getTime());
                                } catch (Exception unused) {
                                }
                            } else {
                                ((UpcomingMatchModel) arrayList.get(i2)).setRemainingTime(0);
                            }
                            i2++;
                        } else {
                            Job unused2 = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(upcomingMatchFragment), (CoroutineContext) null, (CoroutineStart) null, new UpcomingMatchFragment$observeData$1$1(upcomingMatchFragment, arrayList, (Continuation<? super UpcomingMatchFragment$observeData$1$1>) null), 3, (Object) null);
                            return;
                        }
                    }
                } else if (upcomingMatchFragment.page == 1) {
                    TextView textView = (TextView) upcomingMatchFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                    Intrinsics.checkNotNullExpressionValue(textView, "tvNoData");
                    CommonMethodsKt.visible(textView);
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = upcomingMatchFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                upcomingMatchFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar2 = (ProgressBar) upcomingMatchFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) upcomingMatchFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.upcomingMatchesAdapter = new UpcomingMatchesAdapter(requireActivity, this, false);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvUpcomingMatch)).setLayoutManager(new GridLayoutManager(requireActivity(), 2));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvUpcomingMatch);
        UpcomingMatchesAdapter upcomingMatchesAdapter2 = this.upcomingMatchesAdapter;
        if (upcomingMatchesAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upcomingMatchesAdapter");
            upcomingMatchesAdapter2 = null;
        }
        recyclerView.setAdapter(upcomingMatchesAdapter2);
        onRecyclerViewScrolled();
    }

    public void onItemClicked(UpcomingMatchModel upcomingMatchModel) {
        Intrinsics.checkNotNullParameter(upcomingMatchModel, "upcomingMatchModel");
        upcomingMatchModel.setFrom(TAG);
        UserManager.INSTANCE.saveMatch(upcomingMatchModel);
        UserManager.INSTANCE.saveMatchId(upcomingMatchModel.get_id());
        FragmentActivity activity = getActivity();
        if (activity != null) {
            DetailActivity detailActivity = (DetailActivity) activity;
            String teamIconUrl = upcomingMatchModel.getTeam1().getTeamIconUrl();
            String str = "";
            if (teamIconUrl == null) {
                teamIconUrl = str;
            }
            String teamIconUrl2 = upcomingMatchModel.getTeam2().getTeamIconUrl();
            if (teamIconUrl2 != null) {
                str = teamIconUrl2;
            }
            detailActivity.setImageDynamically(teamIconUrl, str);
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_upcomingMatchFragment2_to_contestFragment);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    /* access modifiers changed from: private */
    public final void setPagination(ArrayList<UpcomingMatchModel> arrayList) {
        RecyclerView.LayoutManager layoutManager;
        boolean z = true;
        if (this.page == 1) {
            if (arrayList.isEmpty()) {
                Log.v("MORE_DATA", "NO");
            } else {
                Log.v("MORE_DATA", "YES");
            }
        }
        boolean z2 = this.page == 1;
        UpcomingMatchesAdapter upcomingMatchesAdapter2 = this.upcomingMatchesAdapter;
        if (upcomingMatchesAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("upcomingMatchesAdapter");
            upcomingMatchesAdapter2 = null;
        }
        upcomingMatchesAdapter2.addList(z2, arrayList);
        if (!(this.clickItem == 0 || (layoutManager = ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvUpcomingMatch)).getLayoutManager()) == null)) {
            layoutManager.scrollToPosition(this.clickItem);
        }
        if (arrayList.size() < 10) {
            z = false;
        }
        this.moreData = z;
    }

    private final void onRecyclerViewScrolled() {
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvUpcomingMatch)).addOnScrollListener(new UpcomingMatchFragment$onRecyclerViewScrolled$1(this));
    }

    public void onTimeFinish() {
        Log.d("onTimeFinish", "UpcomingMatchFragment");
    }
}
