package com.crickpe.view.detail.fragments.create_contest;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.databinding.FragmentCongratulationBinding;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import com.microsoft.appcenter.crashes.ingestion.models.ErrorAttachmentLog;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/CongratulationFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "binding", "Lcom/crickpe/databinding/FragmentCongratulationBinding;", "getBinding", "()Lcom/crickpe/databinding/FragmentCongratulationBinding;", "setBinding", "(Lcom/crickpe/databinding/FragmentCongratulationBinding;)V", "contestDetailData", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "getContestDetailData", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "setContestDetailData", "(Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "getFragmentLayoutResId", "", "onClick", "", "view", "Landroid/view/View;", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CongratulationFragment.kt */
public final class CongratulationFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private FragmentCongratulationBinding binding;
    private Contest contestDetailData;
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
        return C1188R.C1193layout.fragment_congratulation;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Contest getContestDetailData() {
        return this.contestDetailData;
    }

    public final void setContestDetailData(Contest contest) {
        this.contestDetailData = contest;
    }

    public final FragmentCongratulationBinding getBinding() {
        return this.binding;
    }

    public final void setBinding(FragmentCongratulationBinding fragmentCongratulationBinding) {
        this.binding = fragmentCongratulationBinding;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentCongratulationBinding.bind(view);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        View.OnClickListener onClickListener = this;
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llShareReferalCode)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setOnClickListener(onClickListener);
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llShareContestUrl)).setOnClickListener(onClickListener);
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llCopyCode)).setOnClickListener(onClickListener);
        Contest contest = (Contest) new Gson().fromJson(requireArguments().getString(PrefsManager.CONTEST_DATA), Contest.class);
        this.contestDetailData = contest;
        if (contest != null) {
            FragmentCongratulationBinding fragmentCongratulationBinding = this.binding;
            Intrinsics.checkNotNull(fragmentCongratulationBinding);
            fragmentCongratulationBinding.setModel(this.contestDetailData);
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        switch (view.getId()) {
            case C1188R.C1192id.llCopyCode:
                try {
                    Object systemService = requireActivity().getSystemService("clipboard");
                    if (systemService != null) {
                        Contest contest = this.contestDetailData;
                        Intrinsics.checkNotNull(contest);
                        ClipData newPlainText = ClipData.newPlainText(getString(C1188R.string.referral_codee), contest.getReferalCode());
                        Intrinsics.checkNotNullExpressionValue(newPlainText, "newPlainText(getString(R…DetailData!!.referalCode)");
                        ((ClipboardManager) systemService).setPrimaryClip(newPlainText);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
                } catch (Exception e) {
                    Log.i("Exception_copy", e.toString());
                    return;
                }
            case C1188R.C1192id.llShareContestUrl:
                try {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType(ErrorAttachmentLog.CONTENT_TYPE_TEXT_PLAIN);
                    Contest contest2 = this.contestDetailData;
                    Intrinsics.checkNotNull(contest2);
                    intent.putExtra("android.intent.extra.TEXT", contest2.getContestUrl());
                    startActivity(Intent.createChooser(intent, getString(C1188R.string.share_via)));
                    return;
                } catch (Exception e2) {
                    Log.i("Exception_share", e2.toString());
                    return;
                }
            case C1188R.C1192id.llShareReferalCode:
                try {
                    Intent intent2 = new Intent();
                    intent2.setAction("android.intent.action.SEND");
                    intent2.setType(ErrorAttachmentLog.CONTENT_TYPE_TEXT_PLAIN);
                    Contest contest3 = this.contestDetailData;
                    Intrinsics.checkNotNull(contest3);
                    intent2.putExtra("android.intent.extra.TEXT", contest3.getReferalCode());
                    startActivity(Intent.createChooser(intent2, getString(C1188R.string.share_via)));
                    return;
                } catch (Exception e3) {
                    Log.i("Exception_share", e3.toString());
                    return;
                }
            case C1188R.C1192id.tvContinue:
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_congratulationFragment_to_contestFragment);
                return;
            default:
                return;
        }
    }
}
