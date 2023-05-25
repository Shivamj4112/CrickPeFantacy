package com.crickpe.view.detail.fragments.wallet;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.p004os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.TopUpRequest;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u001a\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/VerifyWithdrawFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "observeData", "", "onClick", "view", "Landroid/view/View;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: VerifyWithdrawFragment.kt */
public final class VerifyWithdrawFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: VerifyWithdrawFragment.kt */
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
        return C1188R.C1193layout.fragment_verify_withdraw;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getResources().getString(C1188R.string.verify_to_withdraw);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.verify_to_withdraw)");
            ((DetailActivity) activity).setTopBar(string, true, false, false, false, false, false, false);
            if (UserManager.INSTANCE.getUserProfile() != null) {
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvMobile);
                User userProfile = UserManager.INSTANCE.getUserProfile();
                textView.setText(userProfile != null ? userProfile.getMobileNo() : null);
                User userProfile2 = UserManager.INSTANCE.getUserProfile();
                Intrinsics.checkNotNull(userProfile2);
                if (userProfile2.getKycStatus() != 1) {
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvKyc)).setText(getString(C1188R.string.not_verified));
                    ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivKyc)).setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.icon_alert));
                } else {
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvKyc)).setText(getString(C1188R.string.verified));
                    ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivKyc)).setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.ic_kyc_done));
                }
                User userProfile3 = UserManager.INSTANCE.getUserProfile();
                Intrinsics.checkNotNull(userProfile3);
                if (userProfile3.getPanStatus() != 1) {
                    ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPanStatus)).setText(getString(C1188R.string.for_tax_purpose));
                    ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivPan);
                    Intrinsics.checkNotNullExpressionValue(imageView, "ivPan");
                    CommonMethodsKt.hide(imageView);
                    return;
                }
                ((TextView) _$_findCachedViewById(C1188R.C1192id.tvPanStatus)).setText(getString(C1188R.string.verified));
                ImageView imageView2 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivPan);
                Intrinsics.checkNotNullExpressionValue(imageView2, "ivPan");
                CommonMethodsKt.visible(imageView2);
                TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvVerifyPan);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvVerifyPan");
                CommonMethodsKt.hide(textView2);
                ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivPan)).setImageDrawable(AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.ic_kyc_done));
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        observeData();
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvVerifyPan)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvVerifyBank)).setOnClickListener(onClickListener);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        switch (view.getId()) {
            case C1188R.C1192id.tvVerifyBank:
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_verifyWithdrawFragment_to_bankFragment, BundleKt.bundleOf(TuplesKt.m276to("from", "verification")));
                return;
            case C1188R.C1192id.tvVerifyPan:
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_verifyWithdrawFragment_to_panFragment);
                return;
            default:
                return;
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<TopUpRequest>> withdrawAmount = detailViewModel.getWithdrawAmount();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        withdrawAmount.observe(viewLifecycleOwner, new VerifyWithdrawFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-0  reason: not valid java name */
    public static final void m3655observeData$lambda0(VerifyWithdrawFragment verifyWithdrawFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(verifyWithdrawFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) verifyWithdrawFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                verifyWithdrawFragment.showToast("Amount Withdraw successfully");
                FragmentKt.findNavController(verifyWithdrawFragment).popBackStack();
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) verifyWithdrawFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = verifyWithdrawFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                verifyWithdrawFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) verifyWithdrawFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }
}
