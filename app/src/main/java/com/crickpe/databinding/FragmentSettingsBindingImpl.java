package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.view.intro.fragments.User;

public class FragmentSettingsBindingImpl extends FragmentSettingsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final NestedScrollView mboundView0;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.tvName, 5);
        sparseIntArray.put(C1188R.C1192id.ivPenName, 6);
        sparseIntArray.put(C1188R.C1192id.ivUpdateName, 7);
        sparseIntArray.put(C1188R.C1192id.tvMobile, 8);
        sparseIntArray.put(C1188R.C1192id.tvEmail, 9);
        sparseIntArray.put(C1188R.C1192id.ivPenEmail, 10);
        sparseIntArray.put(C1188R.C1192id.ivUpdateEmail, 11);
        sparseIntArray.put(C1188R.C1192id.rlDob, 12);
        sparseIntArray.put(C1188R.C1192id.tvDob, 13);
        sparseIntArray.put(C1188R.C1192id.ivDate, 14);
        sparseIntArray.put(C1188R.C1192id.tvState, 15);
        sparseIntArray.put(C1188R.C1192id.spinnerState, 16);
        sparseIntArray.put(C1188R.C1192id.ivDropdown, 17);
        sparseIntArray.put(C1188R.C1192id.tvCreerStats, 18);
        sparseIntArray.put(C1188R.C1192id.rgRadioGroup, 19);
        sparseIntArray.put(C1188R.C1192id.rbMale, 20);
        sparseIntArray.put(C1188R.C1192id.rbFemale, 21);
        sparseIntArray.put(C1188R.C1192id.rbOther, 22);
        sparseIntArray.put(C1188R.C1192id.smsSwitch, 23);
        sparseIntArray.put(C1188R.C1192id.whatsappSwitch, 24);
        sparseIntArray.put(C1188R.C1192id.rlTermsAndCondition, 25);
        sparseIntArray.put(C1188R.C1192id.ivTerms, 26);
        sparseIntArray.put(C1188R.C1192id.rlPrivacyPolicy, 27);
        sparseIntArray.put(C1188R.C1192id.ivPrivacy, 28);
        sparseIntArray.put(C1188R.C1192id.rlResPay, 29);
        sparseIntArray.put(C1188R.C1192id.ivResPay, 30);
        sparseIntArray.put(C1188R.C1192id.rlLogout, 31);
        sparseIntArray.put(C1188R.C1192id.ivLogout, 32);
        sparseIntArray.put(C1188R.C1192id.progressBar, 33);
    }

    public FragmentSettingsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 34, sIncludes, sViewsWithIds));
    }

    private FragmentSettingsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[4], objArr[3], objArr[2], objArr[1], objArr[14], objArr[17], objArr[32], objArr[10], objArr[6], objArr[28], objArr[30], objArr[26], objArr[11], objArr[7], objArr[33], objArr[21], objArr[20], objArr[22], objArr[19], objArr[12], objArr[31], objArr[27], objArr[29], objArr[25], objArr[23], objArr[16], objArr[18], objArr[13], objArr[9], objArr[8], objArr[5], objArr[15], objArr[24]);
        this.mDirtyFlags = -1;
        this.etDob.setTag((Object) null);
        this.etEmail.setTag((Object) null);
        this.etMobile.setTag((Object) null);
        this.etName.setTag((Object) null);
        NestedScrollView nestedScrollView = objArr[0];
        this.mboundView0 = nestedScrollView;
        nestedScrollView.setTag((Object) null);
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
        if (4 != i) {
            return false;
        }
        setVm((User) obj);
        return true;
    }

    public void setVm(User user) {
        this.mVm = user;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        User user = this.mVm;
        boolean z = false;
        String str5 = null;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            if (user != null) {
                str3 = user.getMobileNo();
                str2 = user.getDateOfBirth();
                str = user.getName();
                str4 = user.getEmail();
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (str4 != null) {
                z = true;
            }
            if (i != 0) {
                j |= z ? 8 : 4;
            }
        } else {
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        int i2 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i2 != 0) {
            str5 = z ? str4 : "";
        }
        if (i2 != 0) {
            TextViewBindingAdapter.setText(this.etDob, str2);
            TextViewBindingAdapter.setText(this.etEmail, str5);
            TextViewBindingAdapter.setText(this.etMobile, str3);
            TextViewBindingAdapter.setText(this.etName, str);
        }
    }
}
