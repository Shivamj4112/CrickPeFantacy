package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.home.fragments.rewards.my_reward_model.MyRewardModelItem;

public class AdapterMyRewardBindingImpl extends AdapterMyRewardBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private final TextView mboundView2;
    private final TextView mboundView3;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.llMyRewards, 4);
        sparseIntArray.put(C1188R.C1192id.tvDate, 5);
    }

    public AdapterMyRewardBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 6, sIncludes, sViewsWithIds));
    }

    private AdapterMyRewardBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[1], objArr[4], objArr[5]);
        this.mDirtyFlags = -1;
        this.ivPlayer.setTag((Object) null);
        RelativeLayout relativeLayout = objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
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
        setModel((MyRewardModelItem) obj);
        return true;
    }

    public void setModel(MyRewardModelItem myRewardModelItem) {
        this.mModel = myRewardModelItem;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r8 = this;
            monitor-enter(r8)
            long r0 = r8.mDirtyFlags     // Catch:{ all -> 0x0042 }
            r2 = 0
            r8.mDirtyFlags = r2     // Catch:{ all -> 0x0042 }
            monitor-exit(r8)     // Catch:{ all -> 0x0042 }
            com.crickpe.view.home.fragments.rewards.my_reward_model.MyRewardModelItem r4 = r8.mModel
            r5 = 0
            r6 = 3
            long r0 = r0 & r6
            r6 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x002a
            if (r4 == 0) goto L_0x001e
            int r5 = r4.getRewardAmount()
            com.crickpe.view.home.fragments.rewards.my_reward_model.Player r0 = r4.getPlayer()
            goto L_0x001f
        L_0x001e:
            r0 = r6
        L_0x001f:
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = r0.getImageUrl()
            goto L_0x002c
        L_0x002a:
            r0 = r6
            r1 = r0
        L_0x002c:
            if (r7 == 0) goto L_0x0041
            de.hdodenhof.circleimageview.CircleImageView r2 = r8.ivPlayer
            r3 = r6
            android.graphics.drawable.Drawable r3 = (android.graphics.drawable.Drawable) r3
            com.crickpe.utils.recycler.BindingAdapters.setImageUrl(r2, r0, r6)
            android.widget.TextView r0 = r8.mboundView2
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r1)
            android.widget.TextView r0 = r8.mboundView3
            double r1 = (double) r5
            com.crickpe.utils.recycler.BindingAdapters.setNumber(r0, r1)
        L_0x0041:
            return
        L_0x0042:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0042 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.AdapterMyRewardBindingImpl.executeBindings():void");
    }
}
