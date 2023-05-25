package com.crickpe.view.detail.fragments.settings;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.text.Editable;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.EditProfileRequest;
import com.crickpe.databinding.FragmentSettingsBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.DateSelectorListener;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.WebViewActivity;
import com.crickpe.view.detail.fragments.settings.models.ProfileModelNew;
import com.crickpe.view.intro.IntroductoryActivity;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.kyc.models.AllStatesData;
import com.crickpe.view.intro.fragments.kyc.models.State;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\b\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020\u0019H\u0002J\b\u00105\u001a\u00020\u0019H\u0002J\b\u00106\u001a\u00020\u0013H\u0016J\b\u00107\u001a\u000203H\u0002J\b\u00108\u001a\u000203H\u0002J\u0010\u00109\u001a\u0002032\u0006\u0010:\u001a\u00020;H\u0016J\u001c\u0010<\u001a\u0002032\b\u0010=\u001a\u0004\u0018\u00010\t2\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J0\u0010>\u001a\u0002032\f\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010;2\u0006\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020DH\u0016J\u0016\u0010E\u001a\u0002032\f\u0010F\u001a\b\u0012\u0002\b\u0003\u0018\u00010@H\u0016J\b\u0010G\u001a\u000203H\u0016J\u001a\u0010H\u001a\u0002032\u0006\u0010:\u001a\u00020;2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010K\u001a\u000203H\u0002J\b\u0010L\u001a\u000203H\u0002J\b\u0010M\u001a\u000203H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010\u000eR\u001c\u0010 \u001a\u0004\u0018\u00010!X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010&\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010'X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010\u000eR\u001e\u0010+\u001a\u0012\u0012\u0004\u0012\u00020\t0,j\b\u0012\u0004\u0012\u00020\t`-X\u000e¢\u0006\u0002\n\u0000R\"\u0010.\u001a\u0016\u0012\u0004\u0012\u00020/\u0018\u00010,j\n\u0012\u0004\u0012\u00020/\u0018\u0001`-X\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X.¢\u0006\u0002\n\u0000¨\u0006N"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/SettingsFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "Lcom/crickpe/utils/DateSelectorListener;", "()V", "binding", "Lcom/crickpe/databinding/FragmentSettingsBinding;", "deviceId", "", "dob", "getDob", "()Ljava/lang/String;", "setDob", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "gender", "", "getGender", "()I", "setGender", "(I)V", "isFirstTime", "", "()Z", "setFirstTime", "(Z)V", "name", "getName", "setName", "profileModelNew", "Lcom/crickpe/view/detail/fragments/settings/models/ProfileModelNew;", "getProfileModelNew", "()Lcom/crickpe/view/detail/fragments/settings/models/ProfileModelNew;", "setProfileModelNew", "(Lcom/crickpe/view/detail/fragments/settings/models/ProfileModelNew;)V", "spinnerSelection", "Landroid/widget/ArrayAdapter;", "stateId", "getStateId", "setStateId", "stateStringList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "statesDataArrayList", "Lcom/crickpe/view/intro/fragments/kyc/models/AllStatesData;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "callApi", "", "checkKyc", "checkValidation", "getFragmentLayoutResId", "listeners", "observeData", "onClick", "view", "Landroid/view/View;", "onDateSelected", "string", "onItemSelected", "p0", "Landroid/widget/AdapterView;", "p1", "p2", "p3", "", "onNothingSelected", "parent", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "resetView", "setCityList", "successLogout", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SettingsFragment.kt */
public final class SettingsFragment extends BaseFragment implements View.OnClickListener, AdapterView.OnItemSelectedListener, DateSelectorListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private FragmentSettingsBinding binding;
    private String deviceId = "";
    private String dob = "";
    private String email = "";
    private int gender = 1;
    private boolean isFirstTime = true;
    private String name = "";
    private ProfileModelNew profileModelNew;
    private ArrayAdapter<String> spinnerSelection;
    private String stateId = "";
    private ArrayList<String> stateStringList = new ArrayList<>();
    private ArrayList<AllStatesData> statesDataArrayList = new ArrayList<>();
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SettingsFragment.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            iArr[Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

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

    public int getFragmentLayoutResId() {
        return C1188R.C1193layout.fragment_settings;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final boolean isFirstTime() {
        return this.isFirstTime;
    }

    public final void setFirstTime(boolean z) {
        this.isFirstTime = z;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public final void setStateId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateId = str;
    }

    public final int getGender() {
        return this.gender;
    }

    public final void setGender(int i) {
        this.gender = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.email = str;
    }

    public final String getDob() {
        return this.dob;
    }

    public final void setDob(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dob = str;
    }

    public final ProfileModelNew getProfileModelNew() {
        return this.profileModelNew;
    }

    public final void setProfileModelNew(ProfileModelNew profileModelNew2) {
        this.profileModelNew = profileModelNew2;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getResources().getString(C1188R.string.settings);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.settings)");
            ((DetailActivity) activity).setTopBar(string, true, false, false, false, false, true, false);
            ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlLogout)).setOnClickListener(this);
            if (!checkKyc()) {
                ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivDate);
                Intrinsics.checkNotNullExpressionValue(imageView, "ivDate");
                CommonMethodsKt.visible(imageView);
                ((Spinner) _$_findCachedViewById(C1188R.C1192id.spinnerState)).setEnabled(true);
                ImageView imageView2 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivPenName);
                Intrinsics.checkNotNullExpressionValue(imageView2, "ivPenName");
                CommonMethodsKt.visible(imageView2);
                ImageView imageView3 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivDropdown);
                Intrinsics.checkNotNullExpressionValue(imageView3, "ivDropdown");
                CommonMethodsKt.visible(imageView3);
                return;
            }
            int childCount = ((RadioGroup) _$_findCachedViewById(C1188R.C1192id.rgRadioGroup)).getChildCount();
            for (int i = 0; i < childCount; i++) {
                ((RadioGroup) _$_findCachedViewById(C1188R.C1192id.rgRadioGroup)).getChildAt(i).setEnabled(false);
            }
            ImageView imageView4 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivDate);
            Intrinsics.checkNotNullExpressionValue(imageView4, "ivDate");
            CommonMethodsKt.hide(imageView4);
            ImageView imageView5 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivPenName);
            Intrinsics.checkNotNullExpressionValue(imageView5, "ivPenName");
            CommonMethodsKt.hide(imageView5);
            ImageView imageView6 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivDropdown);
            Intrinsics.checkNotNullExpressionValue(imageView6, "ivDropdown");
            CommonMethodsKt.hide(imageView6);
            ((Spinner) _$_findCachedViewById(C1188R.C1192id.spinnerState)).setEnabled(false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentSettingsBinding.bind(view);
        DetailViewModel detailViewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.viewModel = detailViewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getAllStates();
        String string = Settings.Secure.getString(requireActivity().getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(requireActivit…ttings.Secure.ANDROID_ID)");
        this.deviceId = string;
        observeData();
        listeners();
    }

    private final void listeners() {
        View.OnClickListener onClickListener = this;
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlTermsAndCondition)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPrivacyPolicy)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlResPay)).setOnClickListener(onClickListener);
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivPenName)).setOnClickListener(onClickListener);
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivUpdateName)).setOnClickListener(onClickListener);
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivPenEmail)).setOnClickListener(onClickListener);
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivUpdateEmail)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlDob)).setOnClickListener(onClickListener);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((TextView) ((DetailActivity) activity)._$_findCachedViewById(C1188R.C1192id.tvSave)).setOnClickListener(new SettingsFragment$$ExternalSyntheticLambda2(this));
            ((RadioGroup) _$_findCachedViewById(C1188R.C1192id.rgRadioGroup)).setOnCheckedChangeListener(new SettingsFragment$$ExternalSyntheticLambda3(this));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-0  reason: not valid java name */
    public static final void m3624listeners$lambda0(SettingsFragment settingsFragment, View view) {
        Intrinsics.checkNotNullParameter(settingsFragment, "this$0");
        if (settingsFragment.checkValidation()) {
            settingsFragment.callApi();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-1  reason: not valid java name */
    public static final void m3625listeners$lambda1(SettingsFragment settingsFragment, RadioGroup radioGroup, int i) {
        Intrinsics.checkNotNullParameter(settingsFragment, "this$0");
        switch (i) {
            case C1188R.C1192id.rbFemale:
                settingsFragment.gender = 2;
                return;
            case C1188R.C1192id.rbMale:
                settingsFragment.gender = 1;
                return;
            case C1188R.C1192id.rbOther:
                settingsFragment.gender = 3;
                return;
            default:
                return;
        }
    }

    private final boolean checkValidation() {
        boolean z = false;
        if (Intrinsics.areEqual((Object) this.name, (Object) "")) {
            String string = getString(C1188R.string.enter_name);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.enter_name)");
            showToast(string);
            return false;
        }
        CharSequence charSequence = this.dob;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (z) {
            this.dob = "";
        }
        return true;
    }

    private final void callApi() {
        this.name = ((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).getText().toString();
        this.email = ((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).getText().toString();
        EditProfileRequest editProfileRequest = new EditProfileRequest(this.name, (String) null, this.gender, (String) null, (String) null, 26, (DefaultConstructorMarker) null);
        boolean z = true;
        if (this.stateId.length() > 0) {
            editProfileRequest.setState(this.stateId);
        }
        CharSequence charSequence = this.email;
        if (!(charSequence == null || charSequence.length() == 0)) {
            editProfileRequest.setEmail(this.email);
        }
        if (this.dob.length() <= 0) {
            z = false;
        }
        if (z) {
            editProfileRequest.setDateOfBirth(this.dob);
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        FragmentSettingsBinding fragmentSettingsBinding = this.binding;
        Intrinsics.checkNotNull(fragmentSettingsBinding);
        CommonMethodsKt.hideKeyboard(requireActivity, fragmentSettingsBinding.etName);
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.updateProfileApi(editProfileRequest);
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        boolean z = false;
        boolean z2 = true;
        switch (view.getId()) {
            case C1188R.C1192id.ivPenEmail:
                ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivPenEmail);
                Intrinsics.checkNotNullExpressionValue(imageView, "ivPenEmail");
                CommonMethodsKt.hide(imageView);
                ImageView imageView2 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivUpdateEmail);
                Intrinsics.checkNotNullExpressionValue(imageView2, "ivUpdateEmail");
                CommonMethodsKt.visible(imageView2);
                ((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).setEnabled(true);
                ((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).requestFocus();
                Editable text = ((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).getText();
                Intrinsics.checkNotNullExpressionValue(text, "etEmail.text");
                if (text.length() > 0) {
                    z = true;
                }
                if (z) {
                    ((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).setSelection(((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).length());
                    return;
                }
                return;
            case C1188R.C1192id.ivPenName:
                ImageView imageView3 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivPenName);
                Intrinsics.checkNotNullExpressionValue(imageView3, "ivPenName");
                CommonMethodsKt.hide(imageView3);
                ImageView imageView4 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivUpdateName);
                Intrinsics.checkNotNullExpressionValue(imageView4, "ivUpdateName");
                CommonMethodsKt.visible(imageView4);
                ((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).setEnabled(true);
                ((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).requestFocus();
                Editable text2 = ((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).getText();
                Intrinsics.checkNotNullExpressionValue(text2, "etName.text");
                if (text2.length() > 0) {
                    z = true;
                }
                if (z) {
                    ((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).setSelection(((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).length());
                    return;
                }
                return;
            case C1188R.C1192id.ivUpdateEmail:
                if (((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).getText().toString().length() != 0) {
                    z2 = false;
                }
                if (z2 || !Patterns.EMAIL_ADDRESS.matcher(((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).getText().toString()).matches()) {
                    FragmentActivity requireActivity = requireActivity();
                    Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                    ExtensionsKt.showToast((Context) requireActivity, (CharSequence) "Please enter your valid email");
                    return;
                }
                ImageView imageView5 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivPenEmail);
                Intrinsics.checkNotNullExpressionValue(imageView5, "ivPenEmail");
                CommonMethodsKt.visible(imageView5);
                ImageView imageView6 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivUpdateEmail);
                Intrinsics.checkNotNullExpressionValue(imageView6, "ivUpdateEmail");
                CommonMethodsKt.hide(imageView6);
                ((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).setEnabled(false);
                ((EditText) _$_findCachedViewById(C1188R.C1192id.etEmail)).clearFocus();
                return;
            case C1188R.C1192id.ivUpdateName:
                if (((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).getText().toString().length() <= 0) {
                    z2 = false;
                }
                if (z2) {
                    ImageView imageView7 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivPenName);
                    Intrinsics.checkNotNullExpressionValue(imageView7, "ivPenName");
                    CommonMethodsKt.visible(imageView7);
                    ImageView imageView8 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivUpdateName);
                    Intrinsics.checkNotNullExpressionValue(imageView8, "ivUpdateName");
                    CommonMethodsKt.hide(imageView8);
                    ((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).setEnabled(false);
                    ((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).clearFocus();
                    return;
                }
                FragmentActivity requireActivity2 = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity2, "requireActivity()");
                ExtensionsKt.showToast((Context) requireActivity2, (CharSequence) "Please enter your name");
                return;
            case C1188R.C1192id.rlDob:
                if (!checkKyc()) {
                    CommonMethodsKt.pickDateBoth(requireContext(), this, (TextView) _$_findCachedViewById(C1188R.C1192id.etDob));
                    return;
                }
                return;
            case C1188R.C1192id.rlLogout:
                successLogout();
                return;
            case C1188R.C1192id.rlPrivacyPolicy:
                Intent intent = new Intent(requireActivity(), WebViewActivity.class);
                intent.putExtra("web_url", Constants.PRIVACY_POLICY);
                intent.putExtra("title", "Privacy Policy");
                startActivity(intent);
                return;
            case C1188R.C1192id.rlResPay:
                Intent intent2 = new Intent(requireActivity(), WebViewActivity.class);
                intent2.putExtra("web_url", Constants.RESPONSIBLE_PAY);
                intent2.putExtra("title", "Responsible Play");
                startActivity(intent2);
                return;
            case C1188R.C1192id.rlTermsAndCondition:
                Intent intent3 = new Intent(requireActivity(), WebViewActivity.class);
                intent3.putExtra("web_url", Constants.TERMS_URL);
                intent3.putExtra("title", "Terms & Conditions");
                startActivity(intent3);
                return;
            default:
                return;
        }
    }

    private final void successLogout() {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_logout);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvYes);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvNo);
            if (findViewById2 != null) {
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawableResource(17170445);
                window.setLayout(-1, -2);
                textView.setOnClickListener(new SettingsFragment$$ExternalSyntheticLambda0(this, dialog));
                ((TextView) findViewById2).setOnClickListener(new SettingsFragment$$ExternalSyntheticLambda1(dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: successLogout$lambda-2  reason: not valid java name */
    public static final void m3630successLogout$lambda2(SettingsFragment settingsFragment, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(settingsFragment, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        DetailViewModel detailViewModel = settingsFragment.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.logout(MapsKt.hashMapOf(TuplesKt.m276to("deviceId", settingsFragment.deviceId)));
        dialog.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: successLogout$lambda-3  reason: not valid java name */
    public static final void m3631successLogout$lambda3(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<User>> updateProfile = detailViewModel.getUpdateProfile();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        updateProfile.observe(viewLifecycleOwner, new SettingsFragment$$ExternalSyntheticLambda4(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<Object>> logout = detailViewModel3.getLogout();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        logout.observe(viewLifecycleOwner2, new SettingsFragment$$ExternalSyntheticLambda5(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<AllStatesData>>> getAllStates = detailViewModel4.getGetAllStates();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        getAllStates.observe(viewLifecycleOwner3, new SettingsFragment$$ExternalSyntheticLambda6(this));
        DetailViewModel detailViewModel5 = this.viewModel;
        if (detailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel5;
        }
        SingleLiveEvent<ApiResponseHandler<ProfileModelNew>> getUserProfle = detailViewModel2.getGetUserProfle();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        getUserProfle.observe(viewLifecycleOwner4, new SettingsFragment$$ExternalSyntheticLambda7(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-4  reason: not valid java name */
    public static final void m3626observeData$lambda4(SettingsFragment settingsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(settingsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) settingsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                User user = (User) apiResponseHandler.getData();
                settingsFragment.resetView();
                if (user != null) {
                    settingsFragment.showToast("Profile updated successfully");
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) settingsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = settingsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                settingsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) settingsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-5  reason: not valid java name */
    public static final void m3627observeData$lambda5(SettingsFragment settingsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(settingsFragment, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
        if (i == 1) {
            UserManager.INSTANCE.saveToken("");
            UserManager.INSTANCE.saveFCMToken("");
            Intent intent = new Intent(settingsFragment.requireContext(), IntroductoryActivity.class);
            intent.putExtra("open", FirebaseAnalytics.Event.LOGIN);
            settingsFragment.startActivity(intent);
            ProgressBar progressBar = (ProgressBar) settingsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            CommonMethodsKt.hide(progressBar);
        } else if (i == 2) {
            ProgressBar progressBar2 = (ProgressBar) settingsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
            CommonMethodsKt.hide(progressBar2);
            Log.v("logout", new Gson().toJson((Object) apiResponseHandler.getError()));
        } else if (i == 3) {
            ProgressBar progressBar3 = (ProgressBar) settingsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
            CommonMethodsKt.visible(progressBar3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-7  reason: not valid java name */
    public static final void m3628observeData$lambda7(SettingsFragment settingsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(settingsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            DetailViewModel detailViewModel = null;
            if (i == 1) {
                settingsFragment.stateStringList = new ArrayList<>();
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    ProfileModelNew profileModelNew2 = settingsFragment.profileModelNew;
                    if (profileModelNew2 != null) {
                        Intrinsics.checkNotNull(profileModelNew2);
                        if (profileModelNew2.getUserProfile().getState() != null) {
                            ProfileModelNew profileModelNew3 = settingsFragment.profileModelNew;
                            Intrinsics.checkNotNull(profileModelNew3);
                            State state = profileModelNew3.getUserProfile().getState();
                            settingsFragment.stateId = String.valueOf(state != null ? state.getStateId() : null);
                            Spinner spinner = (Spinner) settingsFragment._$_findCachedViewById(C1188R.C1192id.spinnerState);
                            ArrayList<String> arrayList2 = settingsFragment.stateStringList;
                            ProfileModelNew profileModelNew4 = settingsFragment.profileModelNew;
                            Intrinsics.checkNotNull(profileModelNew4);
                            State state2 = profileModelNew4.getUserProfile().getState();
                            spinner.setSelection(arrayList2.indexOf(String.valueOf(state2 != null ? state2.getStateName() : null)));
                        } else {
                            settingsFragment.stateStringList.add(0, "Select State");
                        }
                    } else {
                        settingsFragment.stateStringList.add(0, "Select State");
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object next : arrayList) {
                        AllStatesData allStatesData = (AllStatesData) next;
                        ArrayList<AllStatesData> arrayList4 = settingsFragment.statesDataArrayList;
                        if (arrayList4 != null) {
                            arrayList4.add(allStatesData);
                        }
                        if (hashSet.add(Boolean.valueOf(settingsFragment.stateStringList.add(allStatesData.getName())))) {
                            arrayList3.add(next);
                        }
                    }
                    List list = arrayList3;
                    settingsFragment.setCityList();
                }
                DetailViewModel detailViewModel2 = settingsFragment.viewModel;
                if (detailViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel = detailViewModel2;
                }
                detailViewModel.getProfileApi();
            } else if (i == 2) {
                DetailViewModel detailViewModel3 = settingsFragment.viewModel;
                if (detailViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel = detailViewModel3;
                }
                detailViewModel.getProfileApi();
                Log.v("DATA_CUNTRYYY", "ERRORRR1");
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-8  reason: not valid java name */
    public static final void m3629observeData$lambda8(SettingsFragment settingsFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(settingsFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                settingsFragment.profileModelNew = (ProfileModelNew) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) settingsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                FragmentSettingsBinding fragmentSettingsBinding = settingsFragment.binding;
                Intrinsics.checkNotNull(fragmentSettingsBinding);
                ProfileModelNew profileModelNew2 = settingsFragment.profileModelNew;
                Intrinsics.checkNotNull(profileModelNew2);
                fragmentSettingsBinding.setVm(profileModelNew2.getUserProfile());
                ProfileModelNew profileModelNew3 = settingsFragment.profileModelNew;
                if (profileModelNew3 != null) {
                    try {
                        Intrinsics.checkNotNull(profileModelNew3);
                        if (profileModelNew3.getUserProfile().getState() != null && (!settingsFragment.stateStringList.isEmpty())) {
                            ProfileModelNew profileModelNew4 = settingsFragment.profileModelNew;
                            Intrinsics.checkNotNull(profileModelNew4);
                            State state = profileModelNew4.getUserProfile().getState();
                            String str = null;
                            settingsFragment.stateId = String.valueOf(state != null ? state.getStateId() : null);
                            Spinner spinner = (Spinner) settingsFragment._$_findCachedViewById(C1188R.C1192id.spinnerState);
                            ArrayList<String> arrayList = settingsFragment.stateStringList;
                            ProfileModelNew profileModelNew5 = settingsFragment.profileModelNew;
                            Intrinsics.checkNotNull(profileModelNew5);
                            State state2 = profileModelNew5.getUserProfile().getState();
                            if (state2 != null) {
                                str = state2.getStateName();
                            }
                            spinner.setSelection(arrayList.indexOf(String.valueOf(str)));
                        }
                        ProfileModelNew profileModelNew6 = settingsFragment.profileModelNew;
                        Intrinsics.checkNotNull(profileModelNew6);
                        settingsFragment.name = profileModelNew6.getUserProfile().getName();
                        ProfileModelNew profileModelNew7 = settingsFragment.profileModelNew;
                        Intrinsics.checkNotNull(profileModelNew7);
                        settingsFragment.email = profileModelNew7.getUserProfile().getEmail();
                        ProfileModelNew profileModelNew8 = settingsFragment.profileModelNew;
                        Intrinsics.checkNotNull(profileModelNew8);
                        settingsFragment.dob = profileModelNew8.getUserProfile().getDateOfBirth();
                        try {
                            ProfileModelNew profileModelNew9 = settingsFragment.profileModelNew;
                            Intrinsics.checkNotNull(profileModelNew9);
                            int gender2 = profileModelNew9.getUserProfile().getGender();
                            if (gender2 == 1) {
                                ((RadioButton) settingsFragment._$_findCachedViewById(C1188R.C1192id.rbMale)).setChecked(true);
                                settingsFragment.gender = 1;
                            } else if (gender2 == 2) {
                                ((RadioButton) settingsFragment._$_findCachedViewById(C1188R.C1192id.rbFemale)).setChecked(true);
                                settingsFragment.gender = 2;
                            } else if (gender2 != 3) {
                                ((RadioButton) settingsFragment._$_findCachedViewById(C1188R.C1192id.rbMale)).setChecked(true);
                                settingsFragment.gender = 1;
                            } else {
                                ((RadioButton) settingsFragment._$_findCachedViewById(C1188R.C1192id.rbOther)).setChecked(true);
                                settingsFragment.gender = 3;
                            }
                        } catch (Exception e) {
                            Log.v("Exception", e.toString());
                        }
                    } catch (Exception e2) {
                        settingsFragment.showToast(e2.toString());
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = settingsFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                settingsFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar2 = (ProgressBar) settingsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) settingsFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void resetView() {
        if (checkKyc()) {
            FragmentSettingsBinding fragmentSettingsBinding = this.binding;
            Intrinsics.checkNotNull(fragmentSettingsBinding);
            ImageView imageView = fragmentSettingsBinding.ivPenName;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding!!.ivPenName");
            CommonMethodsKt.hide(imageView);
        } else {
            FragmentSettingsBinding fragmentSettingsBinding2 = this.binding;
            Intrinsics.checkNotNull(fragmentSettingsBinding2);
            ImageView imageView2 = fragmentSettingsBinding2.ivPenName;
            Intrinsics.checkNotNullExpressionValue(imageView2, "binding!!.ivPenName");
            CommonMethodsKt.visible(imageView2);
        }
        FragmentSettingsBinding fragmentSettingsBinding3 = this.binding;
        Intrinsics.checkNotNull(fragmentSettingsBinding3);
        ImageView imageView3 = fragmentSettingsBinding3.ivPenEmail;
        Intrinsics.checkNotNullExpressionValue(imageView3, "binding!!.ivPenEmail");
        CommonMethodsKt.visible(imageView3);
        FragmentSettingsBinding fragmentSettingsBinding4 = this.binding;
        Intrinsics.checkNotNull(fragmentSettingsBinding4);
        ImageView imageView4 = fragmentSettingsBinding4.ivUpdateName;
        Intrinsics.checkNotNullExpressionValue(imageView4, "binding!!.ivUpdateName");
        CommonMethodsKt.hide(imageView4);
        FragmentSettingsBinding fragmentSettingsBinding5 = this.binding;
        Intrinsics.checkNotNull(fragmentSettingsBinding5);
        ImageView imageView5 = fragmentSettingsBinding5.ivUpdateEmail;
        Intrinsics.checkNotNullExpressionValue(imageView5, "binding!!.ivUpdateEmail");
        CommonMethodsKt.hide(imageView5);
        FragmentSettingsBinding fragmentSettingsBinding6 = this.binding;
        Intrinsics.checkNotNull(fragmentSettingsBinding6);
        fragmentSettingsBinding6.etName.clearFocus();
        FragmentSettingsBinding fragmentSettingsBinding7 = this.binding;
        Intrinsics.checkNotNull(fragmentSettingsBinding7);
        fragmentSettingsBinding7.etEmail.clearFocus();
    }

    private final void setCityList() {
        Context context = getContext();
        if (context != null) {
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(context, C1188R.C1193layout.dummy, this.stateStringList);
            this.spinnerSelection = arrayAdapter;
            arrayAdapter.setDropDownViewResource(17367049);
            Spinner spinner = (Spinner) _$_findCachedViewById(C1188R.C1192id.spinnerState);
            if (spinner != null) {
                spinner.setAdapter(this.spinnerSelection);
            }
            Spinner spinner2 = (Spinner) _$_findCachedViewById(C1188R.C1192id.spinnerState);
            if (spinner2 != null) {
                spinner2.setOnItemSelectedListener(this);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.content.Context");
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Integer valueOf = adapterView != null ? Integer.valueOf(adapterView.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C1188R.C1192id.spinnerState) {
            if (this.isFirstTime) {
                this.isFirstTime = false;
                return;
            }
            ArrayList<AllStatesData> arrayList = this.statesDataArrayList;
            Intrinsics.checkNotNull(arrayList);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList<AllStatesData> arrayList2 = this.statesDataArrayList;
                Intrinsics.checkNotNull(arrayList2);
                if (Intrinsics.areEqual((Object) arrayList2.get(i2).getName().toString(), (Object) this.stateStringList.get(i).toString())) {
                    ArrayList<AllStatesData> arrayList3 = this.statesDataArrayList;
                    Intrinsics.checkNotNull(arrayList3);
                    this.stateId = arrayList3.get(i2).get_id();
                }
            }
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.v("onNothingSelected", "onNothingSelected");
    }

    public void onDateSelected(String str, View view) {
        if (view instanceof TextView) {
            ((TextView) view).setText(str);
            this.dob = String.valueOf(str);
        }
    }

    private final boolean checkKyc() {
        User userProfile = UserManager.INSTANCE.getUserProfile();
        boolean z = false;
        if (userProfile != null && userProfile.getKycStatus() == 0) {
            z = true;
        }
        return !z;
    }
}
