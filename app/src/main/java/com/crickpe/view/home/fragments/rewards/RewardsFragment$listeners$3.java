package com.crickpe.view.home.fragments.rewards;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.crickpe.C1188R;
import com.crickpe.databinding.FragmentRewardsBinding;
import com.crickpe.utils.CommonMethodsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo48222d2 = {"com/crickpe/view/home/fragments/rewards/RewardsFragment$listeners$3", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RewardsFragment.kt */
public final class RewardsFragment$listeners$3 implements TextWatcher {
    final /* synthetic */ RewardsFragment this$0;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    RewardsFragment$listeners$3(RewardsFragment rewardsFragment) {
        this.this$0 = rewardsFragment;
    }

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNull(editable);
        FragmentRewardsBinding fragmentRewardsBinding = null;
        if (editable.length() > 0) {
            RewardsFragment rewardsFragment = this.this$0;
            FragmentRewardsBinding access$getBinding$p = rewardsFragment.binding;
            if (access$getBinding$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                access$getBinding$p = null;
            }
            rewardsFragment.setRewardAmount(StringsKt.trim((CharSequence) access$getBinding$p.etRewardAmount.getText().toString()).toString());
            FragmentRewardsBinding access$getBinding$p2 = this.this$0.binding;
            if (access$getBinding$p2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentRewardsBinding = access$getBinding$p2;
            }
            TextView textView = fragmentRewardsBinding.currencySymbol;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.currencySymbol");
            CommonMethodsKt.visible(textView);
        } else {
            this.this$0.setRewardAmount("0");
            RewardsFragment rewardsFragment2 = this.this$0;
            rewardsFragment2.removeBg((RelativeLayout) rewardsFragment2._$_findCachedViewById(C1188R.C1192id.rlFifty), (RelativeLayout) this.this$0._$_findCachedViewById(C1188R.C1192id.rlHundred), (RelativeLayout) this.this$0._$_findCachedViewById(C1188R.C1192id.rlOneFifty));
            FragmentRewardsBinding access$getBinding$p3 = this.this$0.binding;
            if (access$getBinding$p3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                fragmentRewardsBinding = access$getBinding$p3;
            }
            TextView textView2 = fragmentRewardsBinding.currencySymbol;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.currencySymbol");
            CommonMethodsKt.hide(textView2);
        }
        try {
            this.this$0.setLast_text_edit(System.currentTimeMillis());
            this.this$0.getHandler().postDelayed(this.this$0.inputFinishChecker, this.this$0.getDelay());
        } catch (Exception unused) {
        }
    }
}
