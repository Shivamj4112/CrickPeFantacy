package com.crickpe.base;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.crickpe.C1188R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0014J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0014J\n\u0010\r\u001a\u00020\u0006*\u00020\u000eJ\n\u0010\u000f\u001a\u00020\u0006*\u00020\u000eJ\n\u0010\u0010\u001a\u00020\u0006*\u00020\u000eR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo48222d2 = {"Lcom/crickpe/base/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "progressDialog", "Landroid/app/ProgressDialog;", "hideProgressDialog", "", "showAlertDialog", "messageId", "", "message", "", "showProgressDialog", "hide", "Landroid/view/View;", "invisible", "visible", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BaseActivity.kt */
public abstract class BaseActivity extends AppCompatActivity {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ProgressDialog progressDialog;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void showProgressDialog(int i) {
        ProgressDialog progressDialog2 = this.progressDialog;
        if (progressDialog2 != null) {
            Intrinsics.checkNotNull(progressDialog2);
            if (progressDialog2.isShowing()) {
                return;
            }
        }
        if (this.progressDialog == null) {
            ProgressDialog progressDialog3 = new ProgressDialog(this);
            this.progressDialog = progressDialog3;
            Intrinsics.checkNotNull(progressDialog3);
            progressDialog3.setCancelable(false);
        }
        ProgressDialog progressDialog4 = this.progressDialog;
        Intrinsics.checkNotNull(progressDialog4);
        progressDialog4.setMessage(getString(i));
        ProgressDialog progressDialog5 = this.progressDialog;
        Intrinsics.checkNotNull(progressDialog5);
        progressDialog5.show();
    }

    /* access modifiers changed from: protected */
    public void hideProgressDialog() {
        ProgressDialog progressDialog2 = this.progressDialog;
        if (progressDialog2 != null) {
            Intrinsics.checkNotNull(progressDialog2);
            progressDialog2.dismiss();
        }
    }

    public final void hide(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(8);
    }

    public final void visible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(0);
    }

    public final void invisible(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setVisibility(4);
    }

    /* access modifiers changed from: protected */
    public void showAlertDialog(String str) {
        new AlertDialog.Builder(this).setMessage(str).setPositiveButton(C1188R.string.f427ok, (DialogInterface.OnClickListener) null).setCancelable(false).show();
    }

    /* access modifiers changed from: protected */
    public void showAlertDialog(int i) {
        showAlertDialog(getString(i));
    }
}
