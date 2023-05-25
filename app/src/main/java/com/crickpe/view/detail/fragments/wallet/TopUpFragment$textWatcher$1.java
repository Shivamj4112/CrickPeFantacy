package com.crickpe.view.detail.fragments.wallet;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.crickpe.C1188R;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.detail.adapters.TopupAmountAdapter;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J(\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo48222d2 = {"com/crickpe/view/detail/fragments/wallet/TopUpFragment$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopUpFragment.kt */
public final class TopUpFragment$textWatcher$1 implements TextWatcher {
    final /* synthetic */ TopUpFragment this$0;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    TopUpFragment$textWatcher$1(TopUpFragment topUpFragment) {
        this.this$0 = topUpFragment;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
        try {
            boolean z = false;
            if (StringsKt.startsWith$default(((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount)).getText().toString(), "0", false, 2, (Object) null)) {
                ((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount)).setText("");
                ((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount)).setSelection(((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount)).getText().toString().length());
            }
            if (charSequence.toString().length() > 0) {
                z = true;
            }
            if (z && Integer.parseInt(charSequence.toString()) > this.this$0.getMaxAmount()) {
                FragmentActivity requireActivity = this.this$0.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                CommonMethodsKt.hideKeyboard(requireActivity, (EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount));
                Snackbar.make((View) (EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount), (CharSequence) "Maximum amount for top up is ₹" + this.this$0.getMaxAmount(), -1).show();
                EditText editText = (EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount);
                Editable delete = ((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount)).getText().delete(((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount)).length() - 1, ((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount)).length());
                if (delete != null) {
                    editText.setText(delete);
                    ((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount)).setSelection(((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etAmount)).getText().length());
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.text.Spanned");
            }
        } catch (Exception e) {
            Log.e("etAmountTextChanged", e.toString());
        }
    }

    public void afterTextChanged(Editable editable) {
        Intrinsics.checkNotNullParameter(editable, "s");
        this.this$0.setAmountStr(StringsKt.trim((CharSequence) editable.toString()).toString());
        if (editable.length() > 0) {
            TopUpFragment topUpFragment = this.this$0;
            topUpFragment.setAmountStr(StringsKt.trim((CharSequence) ((EditText) topUpFragment._$_findCachedViewById(C1188R.C1192id.etAmount)).getText().toString()).toString());
        } else {
            this.this$0.setAmountStr("0");
            TopupAmountAdapter access$getAdapter$p = this.this$0.adapter;
            if (access$getAdapter$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                access$getAdapter$p = null;
            }
            access$getAdapter$p.setRowIndex(-1);
        }
        try {
            this.this$0.setLast_text_edit(System.currentTimeMillis());
            this.this$0.getHandler().postDelayed(this.this$0.inputFinishChecker, this.this$0.getDelay());
        } catch (Exception unused) {
        }
    }
}
