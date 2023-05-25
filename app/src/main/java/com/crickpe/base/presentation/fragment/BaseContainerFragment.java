package com.crickpe.base.presentation.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;
import androidx.core.app.NotificationCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.crickpe.C1188R;
import com.crickpe.data.AppDataManager;
import com.crickpe.data.models.ErrorModel;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.apiHandling.AppError;
import com.crickpe.view.intro.IntroductoryActivity;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\u001cJ\b\u0010 \u001a\u00020!H\u0016J\u0006\u0010\"\u001a\u00020\u001cJ&\u0010#\u001a\u0004\u0018\u00010\u00102\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\b\u0010*\u001a\u00020\u001cH\u0016J\u001a\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\u000e\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020/J\u0014\u00100\u001a\u000201*\u0002022\b\u00103\u001a\u0004\u0018\u000104R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8eX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u0012R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u00065"}, mo48222d2 = {"Lcom/crickpe/base/presentation/fragment/BaseContainerFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/Fragment;", "()V", "appDataManager", "Lcom/crickpe/data/AppDataManager;", "getAppDataManager", "()Lcom/crickpe/data/AppDataManager;", "setAppDataManager", "(Lcom/crickpe/data/AppDataManager;)V", "layoutResourceId", "", "getLayoutResourceId", "()I", "mRootView", "Landroid/view/View;", "mViewDataBinding", "Landroidx/databinding/ViewDataBinding;", "toast", "Landroid/widget/Toast;", "getToast", "()Landroid/widget/Toast;", "setToast", "(Landroid/widget/Toast;)V", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "handleError", "", "errorModel", "Lcom/crickpe/data/models/ErrorModel;", "hideKeyboard", "isNetworkConnected", "", "networkError", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "showToast", "msg", "", "handleApiError", "", "Landroid/app/Activity;", "error", "Lcom/crickpe/utils/apiHandling/AppError;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BaseContainerFragment.kt */
public abstract class BaseContainerFragment<T extends ViewDataBinding> extends Fragment {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    @Inject
    public AppDataManager appDataManager;
    private View mRootView;
    private T mViewDataBinding;
    private Toast toast;

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

    /* access modifiers changed from: protected */
    public abstract int getLayoutResourceId();

    public final void handleError(ErrorModel errorModel) {
        Intrinsics.checkNotNullParameter(errorModel, "errorModel");
    }

    public final void networkError() {
    }

    public final AppDataManager getAppDataManager() {
        AppDataManager appDataManager2 = this.appDataManager;
        if (appDataManager2 != null) {
            return appDataManager2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appDataManager");
        return null;
    }

    public final void setAppDataManager(AppDataManager appDataManager2) {
        Intrinsics.checkNotNullParameter(appDataManager2, "<set-?>");
        this.appDataManager = appDataManager2;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        T inflate = DataBindingUtil.inflate(layoutInflater, getLayoutResourceId(), viewGroup, false);
        this.mViewDataBinding = inflate;
        View root = inflate != null ? inflate.getRoot() : null;
        this.mRootView = root;
        return root;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.mRootView = null;
        T t = this.mViewDataBinding;
        if (t != null) {
            t.setLifecycleOwner((LifecycleOwner) null);
        }
        this.mViewDataBinding = null;
        System.gc();
        _$_clearFindViewByIdCache();
    }

    public final Toast getToast() {
        return this.toast;
    }

    public final void setToast(Toast toast2) {
        this.toast = toast2;
    }

    public final void showToast(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, NotificationCompat.CATEGORY_MESSAGE);
        Toast toast2 = this.toast;
        if (toast2 != null) {
            Intrinsics.checkNotNull(toast2);
            toast2.cancel();
        }
        Toast makeText = Toast.makeText(requireActivity(), charSequence.toString(), 0);
        this.toast = makeText;
        Intrinsics.checkNotNull(makeText);
        makeText.show();
    }

    public final String handleApiError(Activity activity, AppError appError) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Log.v("ERROR:: ", new Gson().toJson((Object) appError));
        if (appError instanceof AppError.ApiError) {
            AppError.ApiError apiError = (AppError.ApiError) appError;
            if (apiError.getMessage().length() > 0) {
                String message = apiError.getMessage();
                ExtensionsKt.showToast((Context) activity, (CharSequence) apiError.getMessage());
                return message;
            }
            String string = activity.getString(C1188R.string.something_went_wrong);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.something_went_wrong)");
            ExtensionsKt.showToast((Context) activity, (CharSequence) string);
        } else if (appError instanceof AppError.ApiFailure) {
            String string2 = activity.getString(C1188R.string.could_not_connect_to_server);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.could_not_connect_to_server)");
            String string3 = activity.getString(C1188R.string.could_not_connect_to_server);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.could_not_connect_to_server)");
            ExtensionsKt.showToast((Context) activity, (CharSequence) string3);
            return string2;
        } else if (appError instanceof AppError.ApiUnAuthorized) {
            Context context = activity;
            AppError.ApiUnAuthorized apiUnAuthorized = (AppError.ApiUnAuthorized) appError;
            ExtensionsKt.showToast(context, (CharSequence) apiUnAuthorized.getMessage());
            String message2 = apiUnAuthorized.getMessage();
            Intent intent = new Intent(context, IntroductoryActivity.class);
            intent.putExtra("open", FirebaseAnalytics.Event.LOGIN);
            activity.startActivity(intent);
            return message2;
        }
        return "";
    }

    public final void hideKeyboard() {
        InputMethodManager inputMethodManager;
        View currentFocus = requireActivity().getCurrentFocus();
        if (currentFocus != null && (inputMethodManager = (InputMethodManager) requireContext().getSystemService("input_method")) != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public boolean isNetworkConnected() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        return ExtensionsKt.isNetworkConnected(requireContext);
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        T t = this.mViewDataBinding;
        Intrinsics.checkNotNull(t);
        t.setLifecycleOwner(this);
        T t2 = this.mViewDataBinding;
        Intrinsics.checkNotNull(t2);
        t2.executePendingBindings();
    }

    public T getViewDataBinding() {
        T t = this.mViewDataBinding;
        Intrinsics.checkNotNull(t);
        return t;
    }
}
