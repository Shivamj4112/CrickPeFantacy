package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.intro.fragments.User;

public abstract class FragmentSettingsBinding extends ViewDataBinding {
    public final TextView etDob;
    public final EditText etEmail;
    public final TextView etMobile;
    public final EditText etName;
    public final ImageView ivDate;
    public final ImageView ivDropdown;
    public final ImageView ivLogout;
    public final ImageView ivPenEmail;
    public final ImageView ivPenName;
    public final ImageView ivPrivacy;
    public final ImageView ivResPay;
    public final ImageView ivTerms;
    public final ImageView ivUpdateEmail;
    public final ImageView ivUpdateName;
    @Bindable
    protected User mVm;
    public final ProgressBar progressBar;
    public final RadioButton rbFemale;
    public final RadioButton rbMale;
    public final RadioButton rbOther;
    public final RadioGroup rgRadioGroup;
    public final RelativeLayout rlDob;
    public final RelativeLayout rlLogout;
    public final RelativeLayout rlPrivacyPolicy;
    public final RelativeLayout rlResPay;
    public final RelativeLayout rlTermsAndCondition;
    public final SwitchCompat smsSwitch;
    public final Spinner spinnerState;
    public final TextView tvCreerStats;
    public final TextView tvDob;
    public final TextView tvEmail;
    public final TextView tvMobile;
    public final TextView tvName;
    public final TextView tvState;
    public final SwitchCompat whatsappSwitch;

    public abstract void setVm(User user);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected FragmentSettingsBinding(Object obj, View view, int i, TextView textView, EditText editText, TextView textView2, EditText editText2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, ImageView imageView10, ProgressBar progressBar2, RadioButton radioButton, RadioButton radioButton2, RadioButton radioButton3, RadioGroup radioGroup, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, SwitchCompat switchCompat, Spinner spinner, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, SwitchCompat switchCompat2) {
        super(obj, view, i);
        this.etDob = textView;
        this.etEmail = editText;
        this.etMobile = textView2;
        this.etName = editText2;
        this.ivDate = imageView;
        this.ivDropdown = imageView2;
        this.ivLogout = imageView3;
        this.ivPenEmail = imageView4;
        this.ivPenName = imageView5;
        this.ivPrivacy = imageView6;
        this.ivResPay = imageView7;
        this.ivTerms = imageView8;
        this.ivUpdateEmail = imageView9;
        this.ivUpdateName = imageView10;
        this.progressBar = progressBar2;
        this.rbFemale = radioButton;
        this.rbMale = radioButton2;
        this.rbOther = radioButton3;
        this.rgRadioGroup = radioGroup;
        this.rlDob = relativeLayout;
        this.rlLogout = relativeLayout2;
        this.rlPrivacyPolicy = relativeLayout3;
        this.rlResPay = relativeLayout4;
        this.rlTermsAndCondition = relativeLayout5;
        this.smsSwitch = switchCompat;
        this.spinnerState = spinner;
        this.tvCreerStats = textView3;
        this.tvDob = textView4;
        this.tvEmail = textView5;
        this.tvMobile = textView6;
        this.tvName = textView7;
        this.tvState = textView8;
        this.whatsappSwitch = switchCompat2;
    }

    public User getVm() {
        return this.mVm;
    }

    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentSettingsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_settings, viewGroup, z, obj);
    }

    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSettingsBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentSettingsBinding) ViewDataBinding.inflateInternal(layoutInflater, C1188R.C1193layout.fragment_settings, (ViewGroup) null, false, obj);
    }

    public static FragmentSettingsBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentSettingsBinding bind(View view, Object obj) {
        return (FragmentSettingsBinding) bind(obj, view, C1188R.C1193layout.fragment_settings);
    }
}
