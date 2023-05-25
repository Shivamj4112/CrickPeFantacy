package com.crickpe.view.intro.fragments.kyc;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p004os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import coil.util.Utils;
import com.amplitude.android.Amplitude;
import com.amplitude.android.Configuration;
import com.amplitude.android.TrackingOptions;
import com.amplitude.core.LoggerProvider;
import com.amplitude.core.ServerZone;
import com.amplitude.core.StorageProvider;
import com.amplitude.core.events.EventOptions;
import com.amplitude.core.events.Identify;
import com.amplitude.core.events.IngestionMetadata;
import com.amplitude.core.events.Plan;
import com.amplitude.p014id.FileIdentityStorage;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.EditProfileRequest;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.GetSampledImage;
import com.crickpe.utils.ImagePicker;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.fragments.settings.models.ProfileModelNew;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.kyc.models.AllStatesData;
import com.crickpe.view.intro.fragments.kyc.models.State;
import com.crickpe.view.intro.fragments.kyc.models.SubmitAadharModelX;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.karumi.dexter.Dexter;
import com.yalantis.ucrop.UCrop;
import java.io.File;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

@Metadata(mo48221d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010Q\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010U\u001a\u00020R2\u0006\u0010V\u001a\u00020\nH\u0002J\b\u0010W\u001a\u00020\nH\u0016J\u0018\u0010X\u001a\u0004\u0018\u00010\u00192\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00190ZH\u0002J\b\u0010[\u001a\u00020RH\u0002J\b\u0010\\\u001a\u00020RH\u0002J\"\u0010]\u001a\u00020R2\u0006\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020\n2\b\u0010S\u001a\u0004\u0018\u00010`H\u0017J\u0010\u0010a\u001a\u00020R2\u0006\u0010b\u001a\u00020cH\u0017J\u0010\u0010d\u001a\u00020R2\u0006\u0010!\u001a\u00020\"H\u0016J\u0012\u0010e\u001a\u00020R2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J0\u0010f\u001a\u00020R2\f\u0010g\u001a\b\u0012\u0002\b\u0003\u0018\u00010h2\b\u0010i\u001a\u0004\u0018\u00010c2\u0006\u0010j\u001a\u00020\n2\u0006\u0010k\u001a\u00020lH\u0016J\u0016\u0010m\u001a\u00020R2\f\u0010n\u001a\b\u0012\u0002\b\u0003\u0018\u00010hH\u0016J\b\u0010o\u001a\u00020RH\u0016J\b\u0010p\u001a\u00020RH\u0016J\u001a\u0010q\u001a\u00020R2\u0006\u0010b\u001a\u00020c2\b\u0010r\u001a\u0004\u0018\u00010sH\u0016J\b\u0010t\u001a\u00020RH\u0002J\b\u0010u\u001a\u00020RH\u0002J\u0010\u0010v\u001a\u00020R2\u0006\u0010w\u001a\u00020xH\u0002R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\f\"\u0004\b \u0010\u000eR\u0010\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X.¢\u0006\u0002\n\u0000R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0004¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\f\"\u0004\b9\u0010\u000eR\u001a\u0010:\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\f\"\u0004\b<\u0010\u000eR\u0016\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010>X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001b\"\u0004\bA\u0010\u001dR\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190CX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010D\u001a\n\u0012\u0004\u0012\u00020E\u0018\u00010CX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\f\"\u0004\bH\u0010\u000eR\u001a\u0010I\u001a\u00020\u0019X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u001b\"\u0004\bK\u0010\u001dR\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00190MX.¢\u0006\u0004\n\u0002\u0010NR\u000e\u0010O\u001a\u00020PX.¢\u0006\u0002\n\u0000¨\u0006y"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/kyc/KycFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "Lcom/crickpe/utils/ImagePicker$ImagePickerListener;", "Lcom/crickpe/utils/GetSampledImage$OnImageSampledListener;", "()V", "amplitude", "Lcom/amplitude/android/Amplitude;", "apiCounter", "", "getApiCounter", "()I", "setApiCounter", "(I)V", "body", "Lokhttp3/MultipartBody$Part;", "getBody", "()Lokhttp3/MultipartBody$Part;", "setBody", "(Lokhttp3/MultipartBody$Part;)V", "body2", "getBody2", "setBody2", "dob", "", "getDob", "()Ljava/lang/String;", "setDob", "(Ljava/lang/String;)V", "gender", "getGender", "setGender", "imageFile", "Ljava/io/File;", "imageFileBack", "imageFileName", "imageFileName2", "imagePickerBack", "Lcom/crickpe/utils/ImagePicker;", "imagePickerFont", "mBottomDialogNotificationAction", "Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "getMBottomDialogNotificationAction", "()Lcom/google/android/material/bottomsheet/BottomSheetDialog;", "setMBottomDialogNotificationAction", "(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V", "mHandler", "Landroid/os/Handler;", "getMHandler", "()Landroid/os/Handler;", "setMHandler", "(Landroid/os/Handler;)V", "mRunnableTask", "Ljava/lang/Runnable;", "npValue", "getNpValue", "setNpValue", "pick", "getPick", "setPick", "spinnerSelection", "Landroid/widget/ArrayAdapter;", "stateId", "getStateId", "setStateId", "stateStringList", "Ljava/util/ArrayList;", "statesDataArrayList", "Lcom/crickpe/view/intro/fragments/kyc/models/AllStatesData;", "topClick", "getTopClick", "setTopClick", "userName", "getUserName", "setUserName", "values", "", "[Ljava/lang/String;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "alertDialog", "", "data", "Lcom/crickpe/view/intro/fragments/User;", "changeColor", "position", "getFragmentLayoutResId", "getMonths", "str", "", "listeners", "observeData", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onClick", "view", "Landroid/view/View;", "onImageSampled", "onImageSelectedFromPicker", "onItemSelected", "p0", "Landroid/widget/AdapterView;", "p1", "p2", "p3", "", "onNothingSelected", "parent", "onResume", "onStop", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "openImage", "setCityList", "showDialogNotificationAction", "textView", "Landroid/widget/TextView;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: KycFragment.kt */
public final class KycFragment extends BaseFragment implements View.OnClickListener, AdapterView.OnItemSelectedListener, ImagePicker.ImagePickerListener, GetSampledImage.OnImageSampledListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Amplitude amplitude;
    private int apiCounter;
    private MultipartBody.Part body;
    private MultipartBody.Part body2;
    private String dob = "";
    private int gender;
    private File imageFile;
    private File imageFileBack;
    private File imageFileName;
    private File imageFileName2;
    /* access modifiers changed from: private */
    public ImagePicker imagePickerBack;
    /* access modifiers changed from: private */
    public ImagePicker imagePickerFont;
    private BottomSheetDialog mBottomDialogNotificationAction;
    private Handler mHandler;
    private final Runnable mRunnableTask;
    private int npValue = -1;
    private int pick;
    private ArrayAdapter<String> spinnerSelection;
    private String stateId = "";
    private ArrayList<String> stateStringList = new ArrayList<>();
    private ArrayList<AllStatesData> statesDataArrayList = new ArrayList<>();
    private int topClick;
    private String userName = "";
    private String[] values;
    /* access modifiers changed from: private */
    public DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: KycFragment.kt */
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
        return C1188R.C1193layout.fragment_kyc;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public KycFragment() {
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        this.mHandler = new Handler(myLooper);
        this.mRunnableTask = new KycFragment$mRunnableTask$1(this);
    }

    public final BottomSheetDialog getMBottomDialogNotificationAction() {
        return this.mBottomDialogNotificationAction;
    }

    public final void setMBottomDialogNotificationAction(BottomSheetDialog bottomSheetDialog) {
        this.mBottomDialogNotificationAction = bottomSheetDialog;
    }

    public final MultipartBody.Part getBody() {
        return this.body;
    }

    public final void setBody(MultipartBody.Part part) {
        this.body = part;
    }

    public final MultipartBody.Part getBody2() {
        return this.body2;
    }

    public final void setBody2(MultipartBody.Part part) {
        this.body2 = part;
    }

    public final String getStateId() {
        return this.stateId;
    }

    public final void setStateId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.stateId = str;
    }

    public final int getNpValue() {
        return this.npValue;
    }

    public final void setNpValue(int i) {
        this.npValue = i;
    }

    public final String getDob() {
        return this.dob;
    }

    public final void setDob(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dob = str;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void setUserName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }

    public final int getGender() {
        return this.gender;
    }

    public final void setGender(int i) {
        this.gender = i;
    }

    public final int getPick() {
        return this.pick;
    }

    public final void setPick(int i) {
        this.pick = i;
    }

    public final int getTopClick() {
        return this.topClick;
    }

    public final void setTopClick(int i) {
        this.topClick = i;
    }

    public final int getApiCounter() {
        return this.apiCounter;
    }

    public final void setApiCounter(int i) {
        this.apiCounter = i;
    }

    public final Handler getMHandler() {
        return this.mHandler;
    }

    public final void setMHandler(Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "<set-?>");
        this.mHandler = handler;
    }

    public void onStop() {
        super.onStop();
        this.mHandler.removeCallbacks(this.mRunnableTask);
    }

    public void onViewCreated(View view, Bundle bundle) {
        SavedStateHandle savedStateHandle;
        MutableLiveData liveData;
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Fragment fragment = this;
        ImagePicker imagePicker = new ImagePicker(fragment, false);
        this.imagePickerFont = imagePicker;
        ImagePicker.ImagePickerListener imagePickerListener = this;
        imagePicker.setImagePickerListener(imagePickerListener);
        ImagePicker imagePicker2 = new ImagePicker(fragment, false);
        this.imagePickerBack = imagePicker2;
        imagePicker2.setImagePickerListener(imagePickerListener);
        NavBackStackEntry currentBackStackEntry = FragmentKt.findNavController(fragment).getCurrentBackStackEntry();
        if (!(currentBackStackEntry == null || (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) == null || (liveData = savedStateHandle.getLiveData(ImagesContract.URL)) == null)) {
            liveData.observe(getViewLifecycleOwner(), new KycFragment$$ExternalSyntheticLambda10(this));
        }
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
        String str = Constants.KYC_MAIN_SCREEN;
        Configuration configuration = r4;
        Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
        this.amplitude = new Amplitude(configuration);
        String str2 = null;
        if (UserManager.INSTANCE.getUserProfile() != null) {
            try {
                FragmentActivity requireActivity = requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                User userProfile = UserManager.INSTANCE.getUserProfile();
                String str3 = str;
                CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, str3);
                Bundle bundle2 = new Bundle();
                User userProfile2 = UserManager.INSTANCE.getUserProfile();
                bundle2.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(userProfile2 != null ? userProfile2.get_id() : null));
                ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(str3, bundle2);
                Amplitude amplitude2 = this.amplitude;
                if (amplitude2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                    amplitude2 = null;
                }
                com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.KYC_MAIN_SCREEN, (Map) null, (EventOptions) null, 6, (Object) null);
            } catch (Exception e) {
                Log.e("Analytics", e.toString());
            }
        }
        listeners();
        DetailViewModel detailViewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        this.viewModel = detailViewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getAllStates();
        observeData();
        SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
        if (appSettings != null) {
            str2 = appSettings.isActiveKycMethod();
        }
        if (Intrinsics.areEqual((Object) str2, (Object) Constants.MANUAL)) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llActiveKycMethod);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llActiveKycMethod");
            CommonMethodsKt.visible(linearLayout);
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llActiveKycMethod);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "llActiveKycMethod");
        CommonMethodsKt.hide(linearLayout2);
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m3769onViewCreated$lambda0(KycFragment kycFragment, String str) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        try {
            if (Intrinsics.areEqual((Object) str.toString(), (Object) "failed")) {
                Log.e("RESULTTTT", "FAIL");
                kycFragment.showToast("KYC verification failed");
            } else if (Intrinsics.areEqual((Object) str.toString(), (Object) FirebaseAnalytics.Param.SUCCESS)) {
                Log.e("RESULTTTT", FirebaseAnalytics.Param.SUCCESS);
                kycFragment.mHandler.postDelayed(kycFragment.mRunnableTask, 1000);
            } else {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("gateway");
                String queryParameter2 = parse.getQueryParameter("type");
                String queryParameter3 = parse.getQueryParameter("client_id");
                DetailViewModel detailViewModel = kycFragment.viewModel;
                if (detailViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel = null;
                }
                detailViewModel.getDigilockerDetailApi(String.valueOf(queryParameter), String.valueOf(queryParameter2), String.valueOf(queryParameter3));
            }
        } catch (Exception e) {
            Log.v("kyc_test", e.toString());
        }
    }

    private final void listeners() {
        View.OnClickListener onClickListener = this;
        ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clAadhaarDetail)).setOnClickListener(onClickListener);
        ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clAadhaarDoc)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlFront)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlBack)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvDay)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvYear)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvMonth)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setOnClickListener(onClickListener);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etAadharNumber)).setOnEditorActionListener(new KycFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-1  reason: not valid java name */
    public static final boolean m3762listeners$lambda1(KycFragment kycFragment, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        if (i != 6) {
            return false;
        }
        FragmentActivity requireActivity = kycFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        CommonMethodsKt.hideKeyboard(requireActivity, (EditText) kycFragment._$_findCachedViewById(C1188R.C1192id.etAadharNumber));
        return true;
    }

    private final void changeColor(int i) {
        this.topClick = i;
        Log.v("POSTIONONN", String.valueOf(i));
        if (i == 0) {
            ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clAadhaarDetail)).setBackgroundResource(C1188R.C1190drawable.rectangle);
            ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clAadhaarDoc)).setBackgroundResource(0);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llAadhaarNo);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llAadhaarNo");
            CommonMethodsKt.visible(linearLayout);
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llDocImages);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llDocImages");
            CommonMethodsKt.hide(linearLayout2);
            return;
        }
        ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clAadhaarDoc)).setBackgroundResource(C1188R.C1190drawable.rectangle);
        ((ConstraintLayout) _$_findCachedViewById(C1188R.C1192id.clAadhaarDetail)).setBackgroundResource(0);
        LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llAadhaarNo);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "llAadhaarNo");
        CommonMethodsKt.hide(linearLayout3);
        LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llDocImages);
        Intrinsics.checkNotNullExpressionValue(linearLayout4, "llDocImages");
        CommonMethodsKt.visible(linearLayout4);
    }

    public void onClick(View view) {
        ImagePicker imagePicker;
        ImagePicker imagePicker2;
        DetailViewModel detailViewModel;
        DetailViewModel detailViewModel2;
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        switch (view.getId()) {
            case C1188R.C1192id.clAadhaarDetail:
                changeColor(0);
                return;
            case C1188R.C1192id.clAadhaarDoc:
                changeColor(1);
                return;
            case C1188R.C1192id.rlBack:
                this.pick = 1;
                if (Build.VERSION.SDK_INT >= 33) {
                    ImagePicker imagePicker3 = this.imagePickerBack;
                    if (imagePicker3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("imagePickerBack");
                        imagePicker = null;
                    } else {
                        imagePicker = imagePicker3;
                    }
                    imagePicker.showImagePicker(1);
                    return;
                }
                openImage();
                return;
            case C1188R.C1192id.rlFront:
                this.pick = 0;
                if (Build.VERSION.SDK_INT >= 33) {
                    ImagePicker imagePicker4 = this.imagePickerFont;
                    if (imagePicker4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("imagePickerFont");
                        imagePicker2 = null;
                    } else {
                        imagePicker2 = imagePicker4;
                    }
                    imagePicker2.showImagePicker(1);
                    return;
                }
                openImage();
                return;
            case C1188R.C1192id.tvContinue:
                try {
                    if (this.topClick == 0) {
                        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("MMM", Locale.ENGLISH);
                        ofPattern.parse(((TextView) _$_findCachedViewById(C1188R.C1192id.tvMonth)).getText().toString()).get(ChronoField.MONTH_OF_YEAR);
                        Month from = Month.from(ofPattern.parse(((TextView) _$_findCachedViewById(C1188R.C1192id.tvMonth)).getText().toString()));
                        StringBuilder sb = new StringBuilder();
                        sb.append(((TextView) _$_findCachedViewById(C1188R.C1192id.tvDay)).getText());
                        sb.append('-');
                        sb.append(from.getValue());
                        sb.append('-');
                        sb.append(((TextView) _$_findCachedViewById(C1188R.C1192id.tvYear)).getText());
                        this.dob = sb.toString();
                        if (((TextView) _$_findCachedViewById(C1188R.C1192id.tvMonth)).getText().toString().length() == 0) {
                            String string = getString(C1188R.string.select_month);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.select_month)");
                            showToast(string);
                            return;
                        }
                        if (((TextView) _$_findCachedViewById(C1188R.C1192id.tvDay)).getText().toString().length() == 0) {
                            String string2 = getString(C1188R.string.select_day);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.select_day)");
                            showToast(string2);
                            return;
                        }
                        if (((TextView) _$_findCachedViewById(C1188R.C1192id.tvYear)).getText().toString().length() == 0) {
                            String string3 = getString(C1188R.string.select_year);
                            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.select_year)");
                            showToast(string3);
                            return;
                        }
                        if (this.stateId.length() == 0) {
                            String string4 = getString(C1188R.string.select_state);
                            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.select_state)");
                            showToast(string4);
                            return;
                        }
                        if (((EditText) _$_findCachedViewById(C1188R.C1192id.etAadharNumber)).getText().toString().length() == 0) {
                            String string5 = getString(C1188R.string.enter_aadhaar_number);
                            Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.enter_aadhaar_number)");
                            showToast(string5);
                            return;
                        } else if (((EditText) _$_findCachedViewById(C1188R.C1192id.etAadharNumber)).getText().toString().length() < 12) {
                            String string6 = getString(C1188R.string.enter_correct_aadhaar);
                            Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.enter_correct_aadhaar)");
                            showToast(string6);
                            return;
                        } else {
                            HashMap hashMap = new HashMap();
                            hashMap.put("id_number", StringsKt.trim((CharSequence) ((EditText) _$_findCachedViewById(C1188R.C1192id.etAadharNumber)).getText().toString()).toString());
                            hashMap.put("dateOfBirth", this.dob);
                            hashMap.put("stateId", this.stateId);
                            EditProfileRequest editProfileRequest = new EditProfileRequest(this.userName, (String) null, this.gender, (String) null, (String) null, 26, (DefaultConstructorMarker) null);
                            if (this.dob.length() > 0) {
                                editProfileRequest.setDateOfBirth(this.dob);
                                editProfileRequest.setState(this.stateId);
                            }
                            DetailViewModel detailViewModel3 = this.viewModel;
                            if (detailViewModel3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                detailViewModel3 = null;
                            }
                            detailViewModel3.updateProfileApi(editProfileRequest);
                            DetailViewModel detailViewModel4 = this.viewModel;
                            if (detailViewModel4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                detailViewModel2 = null;
                            } else {
                                detailViewModel2 = detailViewModel4;
                            }
                            detailViewModel2.submitAadharDetail(hashMap);
                            return;
                        }
                    } else {
                        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("MMM", Locale.ENGLISH);
                        ofPattern2.parse(((TextView) _$_findCachedViewById(C1188R.C1192id.tvMonth)).getText().toString()).get(ChronoField.MONTH_OF_YEAR);
                        Month from2 = Month.from(ofPattern2.parse(((TextView) _$_findCachedViewById(C1188R.C1192id.tvMonth)).getText().toString()));
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(((TextView) _$_findCachedViewById(C1188R.C1192id.tvDay)).getText());
                        sb2.append('-');
                        sb2.append(from2.getValue());
                        sb2.append('-');
                        sb2.append(((TextView) _$_findCachedViewById(C1188R.C1192id.tvYear)).getText());
                        this.dob = sb2.toString();
                        if (((TextView) _$_findCachedViewById(C1188R.C1192id.tvMonth)).getText().toString().length() == 0) {
                            String string7 = getString(C1188R.string.select_month);
                            Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.select_month)");
                            showToast(string7);
                        } else {
                            if (((TextView) _$_findCachedViewById(C1188R.C1192id.tvDay)).getText().toString().length() == 0) {
                                String string8 = getString(C1188R.string.select_day);
                                Intrinsics.checkNotNullExpressionValue(string8, "getString(R.string.select_day)");
                                showToast(string8);
                            } else {
                                if (((TextView) _$_findCachedViewById(C1188R.C1192id.tvYear)).getText().toString().length() == 0) {
                                    String string9 = getString(C1188R.string.select_year);
                                    Intrinsics.checkNotNullExpressionValue(string9, "getString(R.string.select_year)");
                                    showToast(string9);
                                } else {
                                    if (this.stateId.length() == 0) {
                                        String string10 = getString(C1188R.string.select_state);
                                        Intrinsics.checkNotNullExpressionValue(string10, "getString(R.string.select_state)");
                                        showToast(string10);
                                    }
                                }
                            }
                        }
                        RequestBody create = RequestBody.Companion.create(this.dob.toString(), MediaType.Companion.parse("multipart/form-data"));
                        RequestBody create2 = RequestBody.Companion.create(this.stateId.toString(), MediaType.Companion.parse("multipart/form-data"));
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        File file = this.imageFile;
                        if (file != null) {
                            Boolean.valueOf(arrayList.add(file));
                        }
                        if (!arrayList.isEmpty()) {
                            File file2 = this.imageFile;
                            RequestBody create3 = file2 != null ? RequestBody.Companion.create(file2, MediaType.Companion.parse(Utils.MIME_TYPE_JPEG)) : null;
                            MultipartBody.Part.Companion companion = MultipartBody.Part.Companion;
                            String valueOf = String.valueOf(this.imageFileName);
                            Intrinsics.checkNotNull(create3);
                            this.body = companion.createFormData("frontImage", valueOf, create3);
                        }
                        File file3 = this.imageFileBack;
                        if (file3 != null) {
                            Boolean.valueOf(arrayList2.add(file3));
                        }
                        if (!arrayList2.isEmpty()) {
                            File file4 = this.imageFileBack;
                            RequestBody create4 = file4 != null ? RequestBody.Companion.create(file4, MediaType.Companion.parse(Utils.MIME_TYPE_JPEG)) : null;
                            MultipartBody.Part.Companion companion2 = MultipartBody.Part.Companion;
                            String valueOf2 = String.valueOf(this.imageFileName2);
                            Intrinsics.checkNotNull(create4);
                            this.body2 = companion2.createFormData("backImage", valueOf2, create4);
                        }
                        if (this.body == null) {
                            showToast("Please select Aadhaar front image");
                            return;
                        } else if (this.body2 == null) {
                            showToast("Please select Aadhaar back image");
                            return;
                        } else {
                            DetailViewModel detailViewModel5 = this.viewModel;
                            if (detailViewModel5 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                                detailViewModel = null;
                            } else {
                                detailViewModel = detailViewModel5;
                            }
                            MultipartBody.Part part = this.body;
                            Intrinsics.checkNotNull(part);
                            MultipartBody.Part part2 = this.body2;
                            Intrinsics.checkNotNull(part2);
                            detailViewModel.apiSubmitAadhaarImages(part, part2, create, create2);
                            return;
                        }
                    }
                } catch (Exception e) {
                    Log.v("KYC_EROR", e.toString());
                    return;
                }
            case C1188R.C1192id.tvDay:
                this.npValue = -1;
                if (Intrinsics.areEqual((Object) ((TextView) _$_findCachedViewById(C1188R.C1192id.tvMonth)).getText().toString(), (Object) "Feb")) {
                    this.values = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"};
                } else {
                    this.values = new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
                }
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvDay);
                Intrinsics.checkNotNullExpressionValue(textView, "tvDay");
                showDialogNotificationAction(textView);
                return;
            case C1188R.C1192id.tvMonth:
                this.npValue = -1;
                this.values = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
                TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvMonth);
                Intrinsics.checkNotNullExpressionValue(textView2, "tvMonth");
                showDialogNotificationAction(textView2);
                return;
            case C1188R.C1192id.tvYear:
                this.npValue = -1;
                this.values = new String[]{"2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960"};
                TextView textView3 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvYear);
                Intrinsics.checkNotNullExpressionValue(textView3, "tvYear");
                showDialogNotificationAction(textView3);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v12, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = -1
            r1 = 0
            r2 = 69
            if (r6 != r2) goto L_0x008c
            if (r7 != r0) goto L_0x008c
            if (r8 != 0) goto L_0x0012
            android.content.Intent r8 = new android.content.Intent
            r8.<init>()
        L_0x0012:
            android.net.Uri r6 = com.yalantis.ucrop.UCrop.getOutput(r8)
            int r7 = r5.pick
            r8 = 2131165835(0x7f07028b, float:1.7945898E38)
            if (r7 != 0) goto L_0x0055
            java.io.File r7 = new java.io.File
            if (r6 == 0) goto L_0x0025
            java.lang.String r1 = r6.getPath()
        L_0x0025:
            java.lang.String r6 = java.lang.String.valueOf(r1)
            r7.<init>(r6)
            r5.imageFile = r7
            r6 = r5
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            com.bumptech.glide.RequestManager r6 = com.bumptech.glide.Glide.with((androidx.fragment.app.Fragment) r6)
            java.io.File r7 = r5.imageFile
            com.bumptech.glide.RequestBuilder r6 = r6.load((java.io.File) r7)
            com.bumptech.glide.request.RequestOptions r7 = new com.bumptech.glide.request.RequestOptions
            r7.<init>()
            com.bumptech.glide.request.BaseRequestOptions r7 = r7.placeholder((int) r8)
            com.bumptech.glide.RequestBuilder r6 = r6.apply((com.bumptech.glide.request.BaseRequestOptions<?>) r7)
            int r7 = com.crickpe.C1188R.C1192id.ivFront
            android.view.View r7 = r5._$_findCachedViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.into((android.widget.ImageView) r7)
            goto L_0x00d3
        L_0x0055:
            java.io.File r7 = new java.io.File
            if (r6 == 0) goto L_0x005d
            java.lang.String r1 = r6.getPath()
        L_0x005d:
            java.lang.String r6 = java.lang.String.valueOf(r1)
            r7.<init>(r6)
            r5.imageFileBack = r7
            r6 = r5
            androidx.fragment.app.Fragment r6 = (androidx.fragment.app.Fragment) r6
            com.bumptech.glide.RequestManager r6 = com.bumptech.glide.Glide.with((androidx.fragment.app.Fragment) r6)
            java.io.File r7 = r5.imageFileBack
            com.bumptech.glide.RequestBuilder r6 = r6.load((java.io.File) r7)
            com.bumptech.glide.request.RequestOptions r7 = new com.bumptech.glide.request.RequestOptions
            r7.<init>()
            com.bumptech.glide.request.BaseRequestOptions r7 = r7.placeholder((int) r8)
            com.bumptech.glide.RequestBuilder r6 = r6.apply((com.bumptech.glide.request.BaseRequestOptions<?>) r7)
            int r7 = com.crickpe.C1188R.C1192id.ivBack
            android.view.View r7 = r5._$_findCachedViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.into((android.widget.ImageView) r7)
            goto L_0x00d3
        L_0x008c:
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r3 = "imagePickerFont"
            java.lang.String r4 = "imagePickerBack"
            if (r6 != r2) goto L_0x00b4
            if (r7 != r0) goto L_0x00b4
            int r6 = r5.pick
            if (r6 != 0) goto L_0x00a7
            com.crickpe.utils.ImagePicker r6 = r5.imagePickerFont
            if (r6 != 0) goto L_0x00a2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            goto L_0x00a3
        L_0x00a2:
            r1 = r6
        L_0x00a3:
            r1.callCamera()
            goto L_0x00d3
        L_0x00a7:
            com.crickpe.utils.ImagePicker r6 = r5.imagePickerBack
            if (r6 != 0) goto L_0x00af
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            goto L_0x00b0
        L_0x00af:
            r1 = r6
        L_0x00b0:
            r1.callCamera()
            goto L_0x00d3
        L_0x00b4:
            if (r8 == 0) goto L_0x00d3
            int r0 = r5.pick
            if (r0 != 0) goto L_0x00c7
            com.crickpe.utils.ImagePicker r0 = r5.imagePickerFont
            if (r0 != 0) goto L_0x00c2
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            goto L_0x00c3
        L_0x00c2:
            r1 = r0
        L_0x00c3:
            r1.onActivityResult(r6, r7, r8)
            goto L_0x00d3
        L_0x00c7:
            com.crickpe.utils.ImagePicker r0 = r5.imagePickerBack
            if (r0 != 0) goto L_0x00cf
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r4)
            goto L_0x00d0
        L_0x00cf:
            r1 = r0
        L_0x00d0:
            r1.onActivityResult(r6, r7, r8)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.intro.fragments.kyc.KycFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onImageSampled(File file) {
        Intrinsics.checkNotNullParameter(file, "imageFile");
        if (this.pick == 0) {
            this.imageFile = file;
            Glide.with(requireActivity()).load(file).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.ic_add)).into((ImageView) _$_findCachedViewById(C1188R.C1192id.ivFront));
            return;
        }
        this.imageFileBack = file;
        Glide.with(requireActivity()).load(this.imageFileBack).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.ic_add)).into((ImageView) _$_findCachedViewById(C1188R.C1192id.ivBack));
    }

    private final void openImage() {
        Dexter.withContext(requireActivity()).withPermissions("android.permission.READ_EXTERNAL_STORAGE", "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE").withListener(new KycFragment$openImage$1(this)).check();
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("", true, false, false, false, false, false, false);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    private final void observeData() {
        ArrayList<AllStatesData> arrayList = this.statesDataArrayList;
        if (arrayList != null) {
            arrayList.clear();
        }
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<User>> updateProfile = detailViewModel.getUpdateProfile();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        updateProfile.observe(viewLifecycleOwner, new KycFragment$$ExternalSyntheticLambda4(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ProfileModelNew>> getUserProfle = detailViewModel3.getGetUserProfle();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        getUserProfle.observe(viewLifecycleOwner2, new KycFragment$$ExternalSyntheticLambda5(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<AllStatesData>>> getAllStates = detailViewModel4.getGetAllStates();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        getAllStates.observe(viewLifecycleOwner3, new KycFragment$$ExternalSyntheticLambda6(this));
        DetailViewModel detailViewModel5 = this.viewModel;
        if (detailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel5 = null;
        }
        SingleLiveEvent<ApiResponseHandler<SubmitAadharModelX>> submitAadhar = detailViewModel5.getSubmitAadhar();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        submitAadhar.observe(viewLifecycleOwner4, new KycFragment$$ExternalSyntheticLambda7(this));
        DetailViewModel detailViewModel6 = this.viewModel;
        if (detailViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel6 = null;
        }
        SingleLiveEvent<ApiResponseHandler<SubmitAadharModelX>> submitAadharImages = detailViewModel6.getSubmitAadharImages();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "viewLifecycleOwner");
        submitAadharImages.observe(viewLifecycleOwner5, new KycFragment$$ExternalSyntheticLambda8(this));
        DetailViewModel detailViewModel7 = this.viewModel;
        if (detailViewModel7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel7;
        }
        SingleLiveEvent<ApiResponseHandler<User>> getDigiLocker = detailViewModel2.getGetDigiLocker();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "viewLifecycleOwner");
        getDigiLocker.observe(viewLifecycleOwner6, new KycFragment$$ExternalSyntheticLambda9(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-4  reason: not valid java name */
    public static final void m3763observeData$lambda4(KycFragment kycFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = kycFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                kycFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-5  reason: not valid java name */
    public static final void m3764observeData$lambda5(KycFragment kycFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                ProfileModelNew profileModelNew = (ProfileModelNew) apiResponseHandler.getData();
                if (profileModelNew != null) {
                    try {
                        if (profileModelNew.getUserProfile().getKycStatus() == 1) {
                            Handler handler = kycFragment.mHandler;
                            if (handler != null) {
                                handler.removeCallbacks(kycFragment.mRunnableTask);
                            }
                            String string = kycFragment.getString(C1188R.string.your_kyc_has_been_verified);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.your_kyc_has_been_verified)");
                            kycFragment.showToast(string);
                            kycFragment.alertDialog(profileModelNew.getUserProfile());
                            ProgressBar progressBar = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                            CommonMethodsKt.hide(progressBar);
                        } else if (kycFragment.apiCounter == 5) {
                            String string2 = kycFragment.getString(C1188R.string.taking_long_time);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.taking_long_time)");
                            kycFragment.showToast(string2);
                            kycFragment.mHandler.removeCallbacks(kycFragment.mRunnableTask);
                            ProgressBar progressBar2 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                            Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                            CommonMethodsKt.hide(progressBar2);
                        }
                        if (profileModelNew.getUserProfile().getState() != null) {
                            ArrayList<String> arrayList = kycFragment.stateStringList;
                            State state = profileModelNew.getUserProfile().getState();
                            arrayList.add(0, String.valueOf(state != null ? state.getStateName() : null));
                            kycFragment.setCityList();
                        }
                        CharSequence dateOfBirth = profileModelNew.getUserProfile().getDateOfBirth();
                        if (dateOfBirth != null) {
                            if (dateOfBirth.length() != 0) {
                                z = false;
                            }
                        }
                        if (!z) {
                            List split$default = StringsKt.split$default((CharSequence) profileModelNew.getUserProfile().getDateOfBirth(), new String[]{Identify.UNSET_VALUE}, false, 0, 6, (Object) null);
                            ((TextView) kycFragment._$_findCachedViewById(C1188R.C1192id.tvMonth)).setText(kycFragment.getMonths(split$default));
                            ((TextView) kycFragment._$_findCachedViewById(C1188R.C1192id.tvDay)).setText((CharSequence) split$default.get(0));
                            ((TextView) kycFragment._$_findCachedViewById(C1188R.C1192id.tvYear)).setText((CharSequence) split$default.get(2));
                        }
                        kycFragment.userName = profileModelNew.getUserProfile().getName();
                        kycFragment.gender = profileModelNew.getUserProfile().getGender();
                    } catch (Exception unused) {
                        kycFragment.mHandler.removeCallbacks(kycFragment.mRunnableTask);
                    }
                }
            } else if (i == 2) {
                kycFragment.mHandler.removeCallbacks(kycFragment.mRunnableTask);
                FragmentActivity requireActivity = kycFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                kycFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar3 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.hide(progressBar3);
            } else if (i == 3) {
                ProgressBar progressBar4 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar4, "progressBar");
                CommonMethodsKt.visible(progressBar4);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-6  reason: not valid java name */
    public static final void m3765observeData$lambda6(KycFragment kycFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            DetailViewModel detailViewModel = null;
            if (i == 1) {
                DetailViewModel detailViewModel2 = kycFragment.viewModel;
                if (detailViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel = detailViewModel2;
                }
                detailViewModel.getProfileApi();
                ProgressBar progressBar = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    kycFragment.statesDataArrayList = new ArrayList<>();
                    ArrayList<String> arrayList2 = new ArrayList<>();
                    kycFragment.stateStringList = arrayList2;
                    arrayList2.add(0, "Select State");
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ArrayList<AllStatesData> arrayList3 = kycFragment.statesDataArrayList;
                        if (arrayList3 != null) {
                            arrayList3.add(arrayList.get(i2));
                        }
                        kycFragment.stateStringList.add(((AllStatesData) arrayList.get(i2)).getName());
                    }
                    kycFragment.setCityList();
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
                DetailViewModel detailViewModel3 = kycFragment.viewModel;
                if (detailViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel = detailViewModel3;
                }
                detailViewModel.getProfileApi();
                Log.v("States_error", String.valueOf(apiResponseHandler.getError()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-7  reason: not valid java name */
    public static final void m3766observeData$lambda7(KycFragment kycFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                SubmitAadharModelX submitAadharModelX = (SubmitAadharModelX) apiResponseHandler.getData();
                if (submitAadharModelX != null && apiResponseHandler.getData() != null) {
                    if (submitAadharModelX.getUrl() != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("web_url", ((SubmitAadharModelX) apiResponseHandler.getData()).getUrl());
                        bundle.putString("from", "kyc");
                        if (Intrinsics.areEqual((Object) submitAadharModelX.getType(), (Object) Constants.IDFY)) {
                            String json = new Gson().toJson((Object) submitAadharModelX);
                            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(data)");
                            bundle.putString(Constants.IDFY, json);
                        }
                        FragmentKt.findNavController(kycFragment).navigate((int) C1188R.C1192id.action_kycFragment2_to_webViewFragment, bundle);
                        return;
                    }
                    FragmentKt.findNavController(kycFragment).navigate((int) C1188R.C1192id.action_kycFragment2_to_aadharOtpVerificationFragment, BundleKt.bundleOf(TuplesKt.m276to("from", "kyc"), TuplesKt.m276to("id_number", submitAadharModelX.getClient_id())));
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = kycFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                kycFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar2 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-8  reason: not valid java name */
    public static final void m3767observeData$lambda8(KycFragment kycFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (((SubmitAadharModelX) apiResponseHandler.getData()) != null && apiResponseHandler.getData() != null) {
                    kycFragment.showToast("Your verification status will be updated shortly");
                    FragmentKt.findNavController(kycFragment).popBackStack();
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = kycFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                kycFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar2 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-9  reason: not valid java name */
    public static final void m3768observeData$lambda9(KycFragment kycFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                User user = (User) apiResponseHandler.getData();
                if (user != null) {
                    kycFragment.alertDialog(user);
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = kycFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                kycFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
            } else if (i == 3) {
                ProgressBar progressBar2 = (ProgressBar) kycFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.visible(progressBar2);
            }
        }
    }

    private final String getMonths(List<String> list) {
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "01")) {
            return "Jan";
        }
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "02")) {
            return "Feb";
        }
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "03")) {
            return "Mar";
        }
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "04")) {
            return "Apr";
        }
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "05")) {
            return "May";
        }
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "06")) {
            return "Jun";
        }
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "07")) {
            return "Jul";
        }
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "08")) {
            return "Aug";
        }
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "09")) {
            return "Sep";
        }
        if (Intrinsics.areEqual((Object) list.get(1), (Object) "10")) {
            return "Oct";
        }
        return Intrinsics.areEqual((Object) list.get(1), (Object) "11") ? "Nov" : "Dec";
    }

    private final void alertDialog(User user) {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_kyc_alert);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvBody);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvTitle);
            if (findViewById2 != null) {
                TextView textView2 = (TextView) findViewById2;
                View findViewById3 = dialog.findViewById(C1188R.C1192id.tvNo);
                if (findViewById3 != null) {
                    TextView textView3 = (TextView) findViewById3;
                    if (UserManager.INSTANCE.getUserProfile() != null) {
                        try {
                            FragmentActivity requireActivity = requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                            User userProfile = UserManager.INSTANCE.getUserProfile();
                            String str = null;
                            CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_KYC_AADHAAR_VERIFY);
                            Bundle bundle = new Bundle();
                            User userProfile2 = UserManager.INSTANCE.getUserProfile();
                            if (userProfile2 != null) {
                                str = userProfile2.get_id();
                            }
                            bundle.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str));
                            ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_KYC_AADHAAR_VERIFY, bundle);
                        } catch (Exception e) {
                            Log.e("Analytics", e.toString());
                        }
                    }
                    textView2.setText(getString(C1188R.string.kyc_completed_));
                    textView.setText(getString(C1188R.string.details_updated_as_per_kyc));
                    Window window = dialog.getWindow();
                    Intrinsics.checkNotNull(window);
                    window.setBackgroundDrawableResource(17170445);
                    window.setLayout(-1, -2);
                    textView3.setOnClickListener(new KycFragment$$ExternalSyntheticLambda1(dialog, user, this));
                    dialog.show();
                    ProgressBar progressBar = (ProgressBar) _$_findCachedViewById(C1188R.C1192id.progressBar);
                    Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                    CommonMethodsKt.hide(progressBar);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: alertDialog$lambda-10  reason: not valid java name */
    public static final void m3761alertDialog$lambda10(Dialog dialog, User user, KycFragment kycFragment, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(user, "$data");
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        dialog.dismiss();
        try {
            UserManager.INSTANCE.saveProfile(user);
            FragmentKt.findNavController(kycFragment).popBackStack();
        } catch (Exception e) {
            Log.e("Kyc_dialog", e.toString());
        }
    }

    private final void setCityList() {
        Context context = getContext();
        if (context != null) {
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(context, 17367048, this.stateStringList);
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

    private final void showDialogNotificationAction(TextView textView) {
        try {
            String[] strArr = null;
            View inflate = requireActivity().getLayoutInflater().inflate(C1188R.C1193layout.dialog_bottom, (ViewGroup) null);
            Intrinsics.checkNotNullExpressionValue(inflate, "requireActivity().layout…yout.dialog_bottom, null)");
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireActivity());
            this.mBottomDialogNotificationAction = bottomSheetDialog;
            Intrinsics.checkNotNull(bottomSheetDialog);
            bottomSheetDialog.setContentView(inflate);
            BottomSheetDialog bottomSheetDialog2 = this.mBottomDialogNotificationAction;
            Intrinsics.checkNotNull(bottomSheetDialog2);
            bottomSheetDialog2.show();
            BottomSheetDialog bottomSheetDialog3 = this.mBottomDialogNotificationAction;
            Intrinsics.checkNotNull(bottomSheetDialog3);
            NumberPicker numberPicker = (NumberPicker) bottomSheetDialog3.findViewById(C1188R.C1192id.f419np);
            BottomSheetDialog bottomSheetDialog4 = this.mBottomDialogNotificationAction;
            Intrinsics.checkNotNull(bottomSheetDialog4);
            LinearLayout linearLayout = (LinearLayout) bottomSheetDialog4.findViewById(C1188R.C1192id.llConfirm);
            if (numberPicker != null) {
                numberPicker.setMinValue(0);
            }
            if (numberPicker != null) {
                String[] strArr2 = this.values;
                if (strArr2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("values");
                    strArr2 = null;
                }
                numberPicker.setMaxValue(strArr2.length - 1);
            }
            if (numberPicker != null) {
                String[] strArr3 = this.values;
                if (strArr3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("values");
                } else {
                    strArr = strArr3;
                }
                numberPicker.setDisplayedValues(strArr);
            }
            if (numberPicker != null) {
                numberPicker.setWrapSelectorWheel(true);
            }
            if (linearLayout != null) {
                linearLayout.setOnClickListener(new KycFragment$$ExternalSyntheticLambda2(this, textView));
            }
            if (numberPicker != null) {
                numberPicker.setOnValueChangedListener(new KycFragment$$ExternalSyntheticLambda3(this));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: showDialogNotificationAction$lambda-11  reason: not valid java name */
    public static final void m3770showDialogNotificationAction$lambda11(KycFragment kycFragment, TextView textView, View view) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        Intrinsics.checkNotNullParameter(textView, "$textView");
        String[] strArr = null;
        if (kycFragment.npValue == -1) {
            String[] strArr2 = kycFragment.values;
            if (strArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("values");
            } else {
                strArr = strArr2;
            }
            textView.setText(strArr[0].toString());
        } else {
            String[] strArr3 = kycFragment.values;
            if (strArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("values");
            } else {
                strArr = strArr3;
            }
            textView.setText(strArr[kycFragment.npValue]);
        }
        BottomSheetDialog bottomSheetDialog = kycFragment.mBottomDialogNotificationAction;
        Intrinsics.checkNotNull(bottomSheetDialog);
        bottomSheetDialog.cancel();
    }

    /* access modifiers changed from: private */
    /* renamed from: showDialogNotificationAction$lambda-12  reason: not valid java name */
    public static final void m3771showDialogNotificationAction$lambda12(KycFragment kycFragment, NumberPicker numberPicker, int i, int i2) {
        Intrinsics.checkNotNullParameter(kycFragment, "this$0");
        kycFragment.npValue = i2;
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        Integer valueOf = adapterView != null ? Integer.valueOf(adapterView.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C1188R.C1192id.spinnerState) {
            ArrayList<AllStatesData> arrayList = this.statesDataArrayList;
            Intrinsics.checkNotNull(arrayList);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ArrayList<AllStatesData> arrayList2 = this.statesDataArrayList;
                Intrinsics.checkNotNull(arrayList2);
                if (Intrinsics.areEqual((Object) arrayList2.get(i2).getName(), (Object) this.stateStringList.get(i))) {
                    ArrayList<AllStatesData> arrayList3 = this.statesDataArrayList;
                    Intrinsics.checkNotNull(arrayList3);
                    this.stateId = arrayList3.get(i2).get_id();
                }
                if (Intrinsics.areEqual((Object) this.stateStringList.get(i), (Object) "Select State")) {
                    this.stateId = "";
                }
            }
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.v("onNothingSelected", "onNothingSelected");
    }

    public void onImageSelectedFromPicker(File file) {
        try {
            if (this.pick == 0) {
                this.imageFileName = file;
            } else {
                this.imageFileName2 = file;
            }
        } catch (Exception e) {
            Log.v("from_picker", e.toString());
        }
        UCrop.Options options = new UCrop.Options();
        options.setHideBottomControls(false);
        UCrop.m266of(Uri.fromFile(file), Uri.fromFile(new File(requireActivity().getCacheDir(), String.valueOf(System.currentTimeMillis())))).withAspectRatio(1.0f, 0.8f).withMaxResultSize(1200, 1200).withOptions(options).start(requireActivity(), this, 69);
    }
}
