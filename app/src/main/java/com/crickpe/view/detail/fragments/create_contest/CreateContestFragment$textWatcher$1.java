package com.crickpe.view.detail.fragments.create_contest;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.crickpe.C1188R;
import com.crickpe.view.detail.DetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, mo48222d2 = {"com/crickpe/view/detail/fragments/create_contest/CreateContestFragment$textWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CreateContestFragment.kt */
public final class CreateContestFragment$textWatcher$1 implements TextWatcher {
    final /* synthetic */ CreateContestFragment this$0;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    CreateContestFragment$textWatcher$1(CreateContestFragment createContestFragment) {
        this.this$0 = createContestFragment;
    }

    public void afterTextChanged(Editable editable) {
        DetailViewModel detailViewModel = null;
        try {
            if (String.valueOf(editable).length() == 1 && StringsKt.startsWith$default(String.valueOf(editable), "0", false, 2, (Object) null) && editable != null) {
                editable.clear();
            }
        } catch (Exception unused) {
        }
        if (this.this$0.getNumberOfPlayer() != 0 && !Intrinsics.areEqual((Object) ((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etEntryFee)).getText().toString(), (Object) "")) {
            DetailViewModel access$getViewModel$p = this.this$0.viewModel;
            if (access$getViewModel$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = access$getViewModel$p;
            }
            detailViewModel.getCalculateWinApi(String.valueOf(this.this$0.getNumberOfPlayer()), StringsKt.trim((CharSequence) ((EditText) this.this$0._$_findCachedViewById(C1188R.C1192id.etEntryFee)).getText().toString()).toString(), "");
        }
    }
}
