package com.crickpe.view.detail.fragments.refer_to_earn;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.amplitude.p014id.FileIdentityStorage;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.databinding.FragmentReferToEarnBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.microsoft.appcenter.crashes.ingestion.models.ErrorAttachmentLog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u001a\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/refer_to_earn/ReferToEarnFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/crickpe/databinding/FragmentReferToEarnBinding;", "certificateUrl", "", "getCertificateUrl", "()Ljava/lang/String;", "setCertificateUrl", "(Ljava/lang/String;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "listeners", "", "onClick", "view", "Landroid/view/View;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ReferToEarnFragment.kt */
public final class ReferToEarnFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private FragmentReferToEarnBinding binding;
    private String certificateUrl = "";
    private DetailViewModel viewModel;

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
        return C1188R.C1193layout.fragment_refer_to_earn;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final String getCertificateUrl() {
        return this.certificateUrl;
    }

    public final void setCertificateUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.certificateUrl = str;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentReferToEarnBinding.bind(view);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        listeners();
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("Refer to Earn", true, false, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    private final void listeners() {
        FragmentReferToEarnBinding fragmentReferToEarnBinding = this.binding;
        Intrinsics.checkNotNull(fragmentReferToEarnBinding);
        View.OnClickListener onClickListener = this;
        fragmentReferToEarnBinding.ivShareWhatsapp.setOnClickListener(onClickListener);
        FragmentReferToEarnBinding fragmentReferToEarnBinding2 = this.binding;
        Intrinsics.checkNotNull(fragmentReferToEarnBinding2);
        fragmentReferToEarnBinding2.rlShare.setOnClickListener(onClickListener);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        String str = null;
        if (id == C1188R.C1192id.ivShareWhatsapp) {
            if (UserManager.INSTANCE.getUserProfile() != null) {
                try {
                    FragmentActivity requireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    User userProfile = UserManager.INSTANCE.getUserProfile();
                    CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_REFER_EARN);
                    Bundle bundle = new Bundle();
                    User userProfile2 = UserManager.INSTANCE.getUserProfile();
                    if (userProfile2 != null) {
                        str = userProfile2.get_id();
                    }
                    bundle.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str));
                    ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_REFER_EARN, bundle);
                } catch (Exception e) {
                    Log.e("Analytics", e.toString());
                }
            }
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType(ErrorAttachmentLog.CONTENT_TYPE_TEXT_PLAIN);
            intent.setPackage("com.whatsapp");
            intent.putExtra("android.intent.extra.TEXT", getString(C1188R.string.join_context_text));
            try {
                requireActivity().startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.setType(ErrorAttachmentLog.CONTENT_TYPE_TEXT_PLAIN);
                intent2.putExtra("android.intent.extra.SUBJECT", "CrickPe");
                intent2.putExtra("android.intent.extra.TEXT", "Hey Join me on crickpe to win crores in prizes. Give my mobile as referral to earn additional cashback on Joining. https://crickpe.page.link/share");
                startActivity(Intent.createChooser(intent2, "Share via"));
            }
        } else if (id == C1188R.C1192id.rlShare) {
            if (UserManager.INSTANCE.getUserProfile() != null) {
                try {
                    FragmentActivity requireActivity2 = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
                    User userProfile3 = UserManager.INSTANCE.getUserProfile();
                    CommonMethodsKt.callAppsFlyer(requireActivity2, String.valueOf(userProfile3 != null ? userProfile3.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_REFER_EARN);
                    Bundle bundle2 = new Bundle();
                    User userProfile4 = UserManager.INSTANCE.getUserProfile();
                    if (userProfile4 != null) {
                        str = userProfile4.get_id();
                    }
                    bundle2.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str));
                    ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_REFER_EARN, bundle2);
                } catch (Exception e2) {
                    Log.e("Analytics", e2.toString());
                }
            }
            Intent intent3 = new Intent("android.intent.action.SEND");
            intent3.setType(ErrorAttachmentLog.CONTENT_TYPE_TEXT_PLAIN);
            intent3.putExtra("android.intent.extra.SUBJECT", "CrickPe");
            intent3.putExtra("android.intent.extra.TEXT", "Hey Join me on crickpe to win crores in prizes. Give my mobile as referral to earn additional cashback on Joining. https://crickpe.page.link/share");
            startActivity(Intent.createChooser(intent3, "Share via"));
        }
    }
}
