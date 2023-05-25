package com.crickpe.databinding;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.settings.models.ProfileModelNew;
import com.crickpe.view.intro.fragments.User;

public class FragmentProfileBindingImpl extends FragmentProfileBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final NestedScrollView mboundView0;
    private final RelativeLayout mboundView1;
    private final ImageView mboundView5;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.avatars, 6);
        sparseIntArray.put(C1188R.C1192id.llProfile, 7);
        sparseIntArray.put(C1188R.C1192id.progressBarProfile, 8);
        sparseIntArray.put(C1188R.C1192id.cvPenProfile, 9);
        sparseIntArray.put(C1188R.C1192id.ivSettings, 10);
        sparseIntArray.put(C1188R.C1192id.llKyc, 11);
        sparseIntArray.put(C1188R.C1192id.tvCreerStats, 12);
        sparseIntArray.put(C1188R.C1192id.llCareerStats, 13);
        sparseIntArray.put(C1188R.C1192id.imageView9, 14);
        sparseIntArray.put(C1188R.C1192id.tvJoinIndiawin, 15);
        sparseIntArray.put(C1188R.C1192id.tvJoinIndiawinVal, 16);
        sparseIntArray.put(C1188R.C1192id.tvUpcoming, 17);
        sparseIntArray.put(C1188R.C1192id.rvRecentMatchs, 18);
        sparseIntArray.put(C1188R.C1192id.tvNoData, 19);
        sparseIntArray.put(C1188R.C1192id.progressBar, 20);
    }

    public FragmentProfileBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 21, sIncludes, sViewsWithIds));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private FragmentProfileBindingImpl(androidx.databinding.DataBindingComponent r24, View r25, Object[] r26) {
        /*
            r23 = this;
            r4 = r23
            r0 = 6
            r0 = r26[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0011
            android.view.View r0 = (android.view.View) r0
            com.crickpe.databinding.LayoutAvatarBinding r0 = com.crickpe.databinding.LayoutAvatarBinding.bind(r0)
            r22 = r0
            goto L_0x0013
        L_0x0011:
            r22 = r2
        L_0x0013:
            r0 = 9
            r0 = r26[r0]
            r5 = r0
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            r0 = 14
            r0 = r26[r0]
            r6 = r0
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r0 = 10
            r0 = r26[r0]
            r7 = r0
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0 = 13
            r0 = r26[r0]
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 11
            r0 = r26[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 7
            r0 = r26[r0]
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 2
            r0 = r26[r0]
            r11 = r0
            de.hdodenhof.circleimageview.CircleImageView r11 = (p019de.hdodenhof.circleimageview.CircleImageView) r11
            r0 = 20
            r0 = r26[r0]
            r12 = r0
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
            r0 = 8
            r0 = r26[r0]
            r13 = r0
            android.widget.ProgressBar r13 = (android.widget.ProgressBar) r13
            r0 = 18
            r0 = r26[r0]
            r14 = r0
            androidx.recyclerview.widget.RecyclerView r14 = (androidx.recyclerview.widget.RecyclerView) r14
            r0 = 12
            r0 = r26[r0]
            r15 = r0
            android.widget.TextView r15 = (android.widget.TextView) r15
            r0 = 15
            r0 = r26[r0]
            r16 = r0
            android.widget.TextView r16 = (android.widget.TextView) r16
            r0 = 16
            r0 = r26[r0]
            r17 = r0
            android.widget.TextView r17 = (android.widget.TextView) r17
            r0 = 4
            r0 = r26[r0]
            r18 = r0
            android.widget.TextView r18 = (android.widget.TextView) r18
            r0 = 3
            r0 = r26[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = 19
            r0 = r26[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 17
            r0 = r26[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r3 = 0
            r0 = r23
            r1 = r24
            r2 = r25
            r4 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = -1
            r2 = r23
            r2.mDirtyFlags = r0
            r0 = 0
            r0 = r26[r0]
            androidx.core.widget.NestedScrollView r0 = (androidx.core.widget.NestedScrollView) r0
            r2.mboundView0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 1
            r0 = r26[r0]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r2.mboundView1 = r0
            r0.setTag(r1)
            r0 = 5
            r0 = r26[r0]
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r2.mboundView5 = r0
            r0.setTag(r1)
            de.hdodenhof.circleimageview.CircleImageView r0 = r2.profileImage
            r0.setTag(r1)
            android.widget.TextView r0 = r2.tvKyc
            r0.setTag(r1)
            android.widget.TextView r0 = r2.tvName
            r0.setTag(r1)
            r0 = r25
            r2.setRootTag((android.view.View) r0)
            r23.invalidateAll()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.FragmentProfileBindingImpl.<init>(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[]):void");
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
        if (4 != i) {
            return false;
        }
        setVm((ProfileModelNew) obj);
        return true;
    }

    public void setVm(ProfileModelNew profileModelNew) {
        this.mVm = profileModelNew;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        Drawable drawable;
        String str;
        int i;
        String str2;
        String str3;
        int i2;
        int i3;
        Resources resources;
        long j2;
        long j3;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ProfileModelNew profileModelNew = this.mVm;
        boolean z = false;
        int i4 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i4 != 0) {
            User userProfile = profileModelNew != null ? profileModelNew.getUserProfile() : null;
            if (userProfile != null) {
                str2 = userProfile.getProfilePic();
                i2 = userProfile.getKycStatus();
                str3 = userProfile.getName();
            } else {
                str3 = null;
                str2 = null;
                i2 = 0;
            }
            if (i2 == 1) {
                z = true;
            }
            if (i4 != 0) {
                if (z) {
                    j3 = j | 8 | 32;
                    j2 = 128;
                } else {
                    j3 = j | 4 | 16;
                    j2 = 64;
                }
                j = j3 | j2;
            }
            i = getColorFromResource(this.tvKyc, z ? C1188R.C1189color.grey_text : C1188R.C1189color.red_dark);
            drawable = AppCompatResources.getDrawable(this.mboundView5.getContext(), z ? C1188R.C1190drawable.ic_kyc_done : C1188R.C1190drawable.icon_alert);
            if (z) {
                resources = this.tvKyc.getResources();
                i3 = C1188R.string.kyc_completed;
            } else {
                resources = this.tvKyc.getResources();
                i3 = C1188R.string.kyc_not_verified;
            }
            str = resources.getString(i3);
        } else {
            str3 = null;
            str2 = null;
            str = null;
            drawable = null;
            i = 0;
        }
        if ((j & 3) != 0) {
            ImageViewBindingAdapter.setImageDrawable(this.mboundView5, drawable);
            Drawable drawable2 = null;
            BindingAdapters.setImageUrl(this.profileImage, str2, (Drawable) null);
            TextViewBindingAdapter.setText(this.tvKyc, str);
            this.tvKyc.setTextColor(i);
            TextViewBindingAdapter.setText(this.tvName, str3);
        }
    }
}
