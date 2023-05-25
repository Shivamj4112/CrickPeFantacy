package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;

public class AdapterContactsBindingImpl extends AdapterContactsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final TextView mboundView2;
    private final TextView mboundView3;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.rlShortName, 4);
        sparseIntArray.put(C1188R.C1192id.tvFirstName, 5);
    }

    public AdapterContactsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private AdapterContactsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[1], objArr[4], objArr[5]);
        this.mDirtyFlags = -1;
        this.checkbox.setTag((Object) null);
        ConstraintLayout constraintLayout = objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag((Object) null);
        TextView textView = objArr[2];
        this.mboundView2 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[3];
        this.mboundView3 = textView2;
        textView2.setTag((Object) null);
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
        setModel((ContactRequest) obj);
        return true;
    }

    public void setModel(ContactRequest contactRequest) {
        this.mModel = contactRequest;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r10v4, types: [java.lang.String] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r13 = this;
            monitor-enter(r13)
            long r0 = r13.mDirtyFlags     // Catch:{ all -> 0x0063 }
            r2 = 0
            r13.mDirtyFlags = r2     // Catch:{ all -> 0x0063 }
            monitor-exit(r13)     // Catch:{ all -> 0x0063 }
            com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest r4 = r13.mModel
            r5 = 0
            r6 = 3
            long r8 = r0 & r6
            r10 = 0
            int r11 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r11 == 0) goto L_0x004c
            if (r4 == 0) goto L_0x0023
            boolean r5 = r4.isSelected()
            java.lang.String r10 = r4.getName()
            java.lang.String r4 = r4.getMobileNo()
            goto L_0x0024
        L_0x0023:
            r4 = r10
        L_0x0024:
            if (r11 == 0) goto L_0x002e
            if (r5 == 0) goto L_0x002b
            r8 = 8
            goto L_0x002d
        L_0x002b:
            r8 = 4
        L_0x002d:
            long r0 = r0 | r8
        L_0x002e:
            if (r5 == 0) goto L_0x003a
            android.widget.ImageView r5 = r13.checkbox
            android.content.Context r5 = r5.getContext()
            r8 = 2131165822(0x7f07027e, float:1.7945872E38)
            goto L_0x0043
        L_0x003a:
            android.widget.ImageView r5 = r13.checkbox
            android.content.Context r5 = r5.getContext()
            r8 = 2131165823(0x7f07027f, float:1.7945874E38)
        L_0x0043:
            android.graphics.drawable.Drawable r5 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r5, r8)
            r12 = r5
            r5 = r4
            r4 = r10
            r10 = r12
            goto L_0x004e
        L_0x004c:
            r4 = r10
            r5 = r4
        L_0x004e:
            long r0 = r0 & r6
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0062
            android.widget.ImageView r0 = r13.checkbox
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(r0, r10)
            android.widget.TextView r0 = r13.mboundView2
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r4)
            android.widget.TextView r0 = r13.mboundView3
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r5)
        L_0x0062:
            return
        L_0x0063:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0063 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.AdapterContactsBindingImpl.executeBindings():void");
    }
}
