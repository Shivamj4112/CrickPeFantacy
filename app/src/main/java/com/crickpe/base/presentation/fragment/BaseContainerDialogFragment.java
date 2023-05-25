package com.crickpe.base.presentation.fragment;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ&\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0014\u0010\u0005\u001a\u00020\u00068eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00018\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\f¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/base/presentation/fragment/BaseContainerDialogFragment;", "T", "Landroidx/databinding/ViewDataBinding;", "Landroidx/fragment/app/DialogFragment;", "()V", "layoutResourceId", "", "getLayoutResourceId", "()I", "mRootView", "Landroid/view/View;", "mViewDataBinding", "Landroidx/databinding/ViewDataBinding;", "getViewDataBinding", "()Landroidx/databinding/ViewDataBinding;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "onResume", "onViewCreated", "view", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BaseContainerDialogFragment.kt */
public abstract class BaseContainerDialogFragment<T extends ViewDataBinding> extends DialogFragment {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private View mRootView;
    private T mViewDataBinding;

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

    public void onResume() {
        super.onResume();
        Dialog dialog = getDialog();
        Intrinsics.checkNotNull(dialog);
        Window window = dialog.getWindow();
        Intrinsics.checkNotNull(window);
        window.setGravity(17);
        Dialog dialog2 = getDialog();
        Intrinsics.checkNotNull(dialog2);
        Window window2 = dialog2.getWindow();
        Intrinsics.checkNotNull(window2);
        window2.setBackgroundDrawableResource(17170445);
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
