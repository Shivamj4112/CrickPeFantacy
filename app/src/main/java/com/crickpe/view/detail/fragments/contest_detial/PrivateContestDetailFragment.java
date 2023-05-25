package com.crickpe.view.detail.fragments.contest_detial;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.databinding.FragmentPrivateContestDetailBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.JoinedAdapter;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Joined;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u001fH\u0016J\u001a\u0010'\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001fH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000¨\u0006+"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_detial/PrivateContestDetailFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/JoinedAdapter$OnItemClicked;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/JoinedAdapter;", "binding", "Lcom/crickpe/databinding/FragmentPrivateContestDetailBinding;", "contestDetailModel", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestDetailModel;", "getContestDetailModel", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestDetailModel;", "setContestDetailModel", "(Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestDetailModel;)V", "isValidCode", "", "()Z", "setValidCode", "(Z)V", "referalCode", "", "getReferalCode", "()Ljava/lang/String;", "setReferalCode", "(Ljava/lang/String;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "observeData", "", "onClick", "view", "Landroid/view/View;", "onItemClicked", "fa", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Joined;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PrivateContestDetailFragment.kt */
public final class PrivateContestDetailFragment extends BaseFragment implements View.OnClickListener, JoinedAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private JoinedAdapter adapter;
    private FragmentPrivateContestDetailBinding binding;
    private ContestDetailModel contestDetailModel;
    private boolean isValidCode;
    private String referalCode = "";
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PrivateContestDetailFragment.kt */
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
        return C1188R.C1193layout.fragment_private_contest_detail;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onItemClicked(Joined joined) {
        Intrinsics.checkNotNullParameter(joined, "fa");
    }

    public final String getReferalCode() {
        return this.referalCode;
    }

    public final void setReferalCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.referalCode = str;
    }

    public final ContestDetailModel getContestDetailModel() {
        return this.contestDetailModel;
    }

    public final void setContestDetailModel(ContestDetailModel contestDetailModel2) {
        this.contestDetailModel = contestDetailModel2;
    }

    public final boolean isValidCode() {
        return this.isValidCode;
    }

    public final void setValidCode(boolean z) {
        this.isValidCode = z;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("", false, true, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentPrivateContestDetailBinding.bind(view);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvJoin)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlInviteFrnd)).setOnClickListener(onClickListener);
        setAdapter();
        DetailViewModel detailViewModel = null;
        if (getArguments() != null) {
            String string = requireArguments().getString("referalCode", "");
            Intrinsics.checkNotNullExpressionValue(string, "requireArguments().getString(\"referalCode\", \"\")");
            this.referalCode = string;
            DetailViewModel detailViewModel2 = this.viewModel;
            if (detailViewModel2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel2;
            }
            detailViewModel.getContestDetailApiByCode(this.referalCode);
            Log.v("getCodeee_argu", this.referalCode);
        } else if (UserManager.INSTANCE.getCode() != null) {
            String str = UserManager.INSTANCE.getCode().toString();
            this.referalCode = str;
            Log.v("getCodeee_pref", str);
            DetailViewModel detailViewModel3 = this.viewModel;
            if (detailViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel3;
            }
            detailViewModel.getContestDetailApiByCode(this.referalCode);
        }
        observeData();
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id != C1188R.C1192id.rlInviteFrnd) {
            if (id == C1188R.C1192id.tvJoin) {
                if (this.isValidCode) {
                    Bundle bundle = new Bundle();
                    String json = new Gson().toJson((Object) this.contestDetailModel);
                    Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(contestDetailModel)");
                    bundle.putString(PrefsManager.CONTEST_DATA, json);
                    FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_privateContestDetailFragment_to_joinContestDetailFragment, bundle);
                    return;
                }
                String string = getResources().getString(C1188R.string.invalid_referral_code);
                Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…ng.invalid_referral_code)");
                showToast(string);
            }
        } else if (!this.isValidCode) {
        } else {
            if (this.contestDetailModel != null) {
                Bundle bundle2 = new Bundle();
                Gson gson = new Gson();
                ContestDetailModel contestDetailModel2 = this.contestDetailModel;
                Intrinsics.checkNotNull(contestDetailModel2);
                String json2 = gson.toJson((Object) contestDetailModel2.getContest());
                Intrinsics.checkNotNullExpressionValue(json2, "Gson().toJson(contestDetailModel!!.contest)");
                bundle2.putString(PrefsManager.CONTEST_DATA, json2);
                bundle2.putString("from", "watch");
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_privateContestDetailFragment_to_shareContestFragment, bundle2);
                return;
            }
            String string2 = getResources().getString(C1188R.string.invalid_referral_code);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…ng.invalid_referral_code)");
            showToast(string2);
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ContestDetailModel>> contestDetailModel2 = detailViewModel.getContestDetailModel();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        contestDetailModel2.observe(viewLifecycleOwner, new PrivateContestDetailFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3493observeData$lambda0(PrivateContestDetailFragment privateContestDetailFragment, ApiResponseHandler apiResponseHandler) {
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        Intrinsics.checkNotNullParameter(privateContestDetailFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ContestDetailModel contestDetailModel2 = (ContestDetailModel) apiResponseHandler.getData();
                if (contestDetailModel2 != null) {
                    RelativeLayout relativeLayout3 = (RelativeLayout) privateContestDetailFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                    Intrinsics.checkNotNullExpressionValue(relativeLayout3, "rlProgress");
                    CommonMethodsKt.hide(relativeLayout3);
                    FragmentPrivateContestDetailBinding fragmentPrivateContestDetailBinding = privateContestDetailFragment.binding;
                    Intrinsics.checkNotNull(fragmentPrivateContestDetailBinding);
                    fragmentPrivateContestDetailBinding.setModel(contestDetailModel2);
                    privateContestDetailFragment.contestDetailModel = contestDetailModel2;
                    JoinedAdapter joinedAdapter = privateContestDetailFragment.adapter;
                    String str = null;
                    if (joinedAdapter == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        joinedAdapter = null;
                    }
                    joinedAdapter.addList(true, contestDetailModel2.getJoined(), contestDetailModel2.getMatch().getStatus());
                    FragmentActivity activity = privateContestDetailFragment.getActivity();
                    if (activity != null) {
                        DetailActivity detailActivity = (DetailActivity) activity;
                        String teamIconUrl = contestDetailModel2.getMatch().getTeam1().getTeamIconUrl();
                        String str2 = "";
                        if (teamIconUrl == null) {
                            teamIconUrl = str2;
                        }
                        String teamIconUrl2 = contestDetailModel2.getMatch().getTeam2().getTeamIconUrl();
                        if (teamIconUrl2 != null) {
                            str2 = teamIconUrl2;
                        }
                        detailActivity.setImageDynamically(teamIconUrl, str2);
                        String str3 = contestDetailModel2.getContest().getUser().get_id();
                        User userProfile = UserManager.INSTANCE.getUserProfile();
                        if (userProfile != null) {
                            str = userProfile.get_id();
                        }
                        if (!Intrinsics.areEqual((Object) str3, (Object) str)) {
                            FragmentPrivateContestDetailBinding fragmentPrivateContestDetailBinding2 = privateContestDetailFragment.binding;
                            if (!(fragmentPrivateContestDetailBinding2 == null || (relativeLayout2 = fragmentPrivateContestDetailBinding2.rlInviteFrnd) == null)) {
                                CommonMethodsKt.hide(relativeLayout2);
                            }
                        } else {
                            FragmentPrivateContestDetailBinding fragmentPrivateContestDetailBinding3 = privateContestDetailFragment.binding;
                            if (!(fragmentPrivateContestDetailBinding3 == null || (relativeLayout = fragmentPrivateContestDetailBinding3.rlInviteFrnd) == null)) {
                                CommonMethodsKt.visible(relativeLayout);
                            }
                        }
                        if (contestDetailModel2.getContest().getTotalSpots() - contestDetailModel2.getContest().getJoinedUserCount() <= 0) {
                            ((TextView) privateContestDetailFragment._$_findCachedViewById(C1188R.C1192id.tvJoin)).setText(privateContestDetailFragment.getResources().getString(C1188R.string.contest_full));
                            ((TextView) privateContestDetailFragment._$_findCachedViewById(C1188R.C1192id.tvJoin)).setAlpha(0.5f);
                            ((TextView) privateContestDetailFragment._$_findCachedViewById(C1188R.C1192id.tvJoin)).setEnabled(false);
                        }
                        privateContestDetailFragment.isValidCode = true;
                        CardView cardView = (CardView) privateContestDetailFragment._$_findCachedViewById(C1188R.C1192id.currentItemRoot);
                        Intrinsics.checkNotNullExpressionValue(cardView, "currentItemRoot");
                        CommonMethodsKt.visible(cardView);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
                }
            } else if (i == 2) {
                privateContestDetailFragment.isValidCode = false;
                RelativeLayout relativeLayout4 = (RelativeLayout) privateContestDetailFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout4, "rlProgress");
                CommonMethodsKt.hide(relativeLayout4);
                CardView cardView2 = (CardView) privateContestDetailFragment._$_findCachedViewById(C1188R.C1192id.currentItemRoot);
                Intrinsics.checkNotNullExpressionValue(cardView2, "currentItemRoot");
                CommonMethodsKt.hide(cardView2);
                FragmentActivity requireActivity = privateContestDetailFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                privateContestDetailFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                FragmentKt.findNavController(privateContestDetailFragment).popBackStack();
            } else if (i == 3) {
                RelativeLayout relativeLayout5 = (RelativeLayout) privateContestDetailFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout5, "rlProgress");
                CommonMethodsKt.visible(relativeLayout5);
                CardView cardView3 = (CardView) privateContestDetailFragment._$_findCachedViewById(C1188R.C1192id.currentItemRoot);
                Intrinsics.checkNotNullExpressionValue(cardView3, "currentItemRoot");
                CommonMethodsKt.hide(cardView3);
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new JoinedAdapter(this, requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvJoinedFriends);
        JoinedAdapter joinedAdapter = null;
        if (recyclerView != null) {
            JoinedAdapter joinedAdapter2 = this.adapter;
            if (joinedAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                joinedAdapter2 = null;
            }
            recyclerView.setAdapter(joinedAdapter2);
        }
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvJoinedFriends)).setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvJoinedFriends);
        JoinedAdapter joinedAdapter3 = this.adapter;
        if (joinedAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            joinedAdapter = joinedAdapter3;
        }
        recyclerView2.setAdapter(joinedAdapter);
    }
}
