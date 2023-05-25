package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.view.detail.fragments.create_contest.models.PreviousContactsModel;

public class AdapterPreviousContactsBindingImpl extends AdapterPreviousContactsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds = null;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    public AdapterPreviousContactsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 2, sIncludes, sViewsWithIds));
    }

    private AdapterPreviousContactsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[1]);
        this.mDirtyFlags = -1;
        this.ivContact.setTag((Object) null);
        RelativeLayout relativeLayout = objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int i, Object obj) {
        if (2 != i) {
            return false;
        }
        setModel((PreviousContactsModel) obj);
        return true;
    }

    public void setModel(PreviousContactsModel previousContactsModel) {
        this.mModel = previousContactsModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r7 = this;
            monitor-enter(r7)
            long r0 = r7.mDirtyFlags     // Catch:{ all -> 0x002d }
            r2 = 0
            r7.mDirtyFlags = r2     // Catch:{ all -> 0x002d }
            monitor-exit(r7)     // Catch:{ all -> 0x002d }
            com.crickpe.view.detail.fragments.create_contest.models.PreviousContactsModel r4 = r7.mModel
            r5 = 3
            long r0 = r0 & r5
            r5 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0021
            if (r4 == 0) goto L_0x0019
            com.crickpe.view.detail.fragments.create_contest.models.User r0 = r4.getUser()
            goto L_0x001a
        L_0x0019:
            r0 = r5
        L_0x001a:
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.getProfilePic()
            goto L_0x0022
        L_0x0021:
            r0 = r5
        L_0x0022:
            if (r6 == 0) goto L_0x002c
            de.hdodenhof.circleimageview.CircleImageView r1 = r7.ivContact
            r2 = r5
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            com.crickpe.utils.recycler.BindingAdapters.setImageUrl(r1, r0, r5)
        L_0x002c:
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.AdapterPreviousContactsBindingImpl.executeBindings():void");
    }
}
