package com.crickpe.view.detail.fragments.wallet;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.amplitude.android.Amplitude;
import com.amplitude.android.Configuration;
import com.amplitude.android.TrackingOptions;
import com.amplitude.core.LoggerProvider;
import com.amplitude.core.ServerZone;
import com.amplitude.core.StorageProvider;
import com.amplitude.core.events.EventOptions;
import com.amplitude.core.events.IngestionMetadata;
import com.amplitude.core.events.Plan;
import com.amplitude.p014id.FileIdentityStorage;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.data.TopUpRequest;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.TopupAmountAdapter;
import com.crickpe.view.detail.fragments.wallet.easybuzz_models.EasybuzzGatwayModel;
import com.crickpe.view.detail.fragments.wallet.payment_model.CreatePaymentLinkModel;
import com.crickpe.view.detail.fragments.wallet.payment_model.PaymentCheckModel;
import com.crickpe.view.home.fragments.home.HomeDataModel;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.easebuzz.payment.kit.PWECouponsActivity;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import datamodels.PWEStaticDataModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0006\u0010F\u001a\u00020GJ\b\u0010H\u001a\u00020IH\u0002J\b\u0010J\u001a\u00020IH\u0002J\b\u0010K\u001a\u00020\u0017H\u0016J\b\u0010L\u001a\u00020IH\u0002J\u0010\u0010M\u001a\u00020I2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020I2\u0006\u0010Q\u001a\u00020\tH\u0016J\b\u0010R\u001a\u00020IH\u0016J\u001a\u0010S\u001a\u00020I2\u0006\u0010N\u001a\u00020O2\b\u0010T\u001a\u0004\u0018\u00010UH\u0016J \u0010V\u001a\u00020I2\u0016\u0010W\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nH\u0002J\b\u0010X\u001a\u00020IH\u0002J\b\u0010Y\u001a\u00020IH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001a\u0010%\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u000e\u0010+\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u00020\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001f\"\u0004\b/\u0010!R\u001a\u00100\u001a\u00020&X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010(\"\u0004\b2\u0010*R\u000e\u00103\u001a\u00020,X\u0004¢\u0006\u0002\n\u0000R\u001a\u00104\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0019\"\u0004\b6\u0010\u001bR\u001a\u00107\u001a\u00020\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0019\"\u0004\b9\u0010\u001bR\u001a\u0010:\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u0010\u0013R\"\u0010=\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020EX.¢\u0006\u0002\n\u0000¨\u0006Z"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/TopUpFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/TopupAmountAdapter$OnClickAmount;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/TopupAmountAdapter;", "amountList", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getAmountList", "()Ljava/util/ArrayList;", "setAmountList", "(Ljava/util/ArrayList;)V", "amountStr", "getAmountStr", "()Ljava/lang/String;", "setAmountStr", "(Ljava/lang/String;)V", "amplitude", "Lcom/amplitude/android/Amplitude;", "apiCounter", "", "getApiCounter", "()I", "setApiCounter", "(I)V", "delay", "", "getDelay", "()J", "setDelay", "(J)V", "from", "getFrom", "setFrom", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "inputFinishChecker", "Ljava/lang/Runnable;", "last_text_edit", "getLast_text_edit", "setLast_text_edit", "mHandler", "getMHandler", "setMHandler", "mRunnableTask", "maxAmount", "getMaxAmount", "setMaxAmount", "minAmount", "getMinAmount", "setMinAmount", "orderId", "getOrderId", "setOrderId", "pweActivityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getPweActivityResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setPweActivityResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "backHandle", "", "failedDialog", "", "getArgument", "getFragmentLayoutResId", "observeData", "onClick", "view", "Landroid/view/View;", "onItemClicked", "amount", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "setAdapter", "list2", "successDialog", "textWatcher", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TopUpFragment.kt */
public final class TopUpFragment extends BaseFragment implements View.OnClickListener, TopupAmountAdapter.OnClickAmount {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    /* access modifiers changed from: private */
    public TopupAmountAdapter adapter;
    private ArrayList<String> amountList = new ArrayList<>();
    private String amountStr = "0";
    private Amplitude amplitude;
    private int apiCounter;
    private long delay;
    private String from = "";
    private Handler handler;
    /* access modifiers changed from: private */
    public final Runnable inputFinishChecker;
    private long last_text_edit;
    private Handler mHandler;
    private final Runnable mRunnableTask;
    private int maxAmount;
    private int minAmount;
    private String orderId = "";
    private ActivityResultLauncher<Intent> pweActivityResultLauncher;
    /* access modifiers changed from: private */
    public DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: TopUpFragment.kt */
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
        return C1188R.C1193layout.fragment_topup;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public TopUpFragment() {
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        this.mHandler = new Handler(myLooper);
        this.mRunnableTask = new TopUpFragment$mRunnableTask$1(this);
        this.delay = 1000;
        Looper myLooper2 = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper2);
        this.handler = new Handler(myLooper2);
        this.inputFinishChecker = new TopUpFragment$$ExternalSyntheticLambda8(this);
    }

    public final ArrayList<String> getAmountList() {
        return this.amountList;
    }

    public final void setAmountList(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.amountList = arrayList;
    }

    public final String getAmountStr() {
        return this.amountStr;
    }

    public final void setAmountStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.amountStr = str;
    }

    public final String getFrom() {
        return this.from;
    }

    public final void setFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.from = str;
    }

    public final String getOrderId() {
        return this.orderId;
    }

    public final void setOrderId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderId = str;
    }

    public final Handler getMHandler() {
        return this.mHandler;
    }

    public final void setMHandler(Handler handler2) {
        Intrinsics.checkNotNullParameter(handler2, "<set-?>");
        this.mHandler = handler2;
    }

    public final ActivityResultLauncher<Intent> getPweActivityResultLauncher() {
        return this.pweActivityResultLauncher;
    }

    public final void setPweActivityResultLauncher(ActivityResultLauncher<Intent> activityResultLauncher) {
        this.pweActivityResultLauncher = activityResultLauncher;
    }

    public final int getMinAmount() {
        return this.minAmount;
    }

    public final void setMinAmount(int i) {
        this.minAmount = i;
    }

    public final int getMaxAmount() {
        return this.maxAmount;
    }

    public final void setMaxAmount(int i) {
        this.maxAmount = i;
    }

    public final int getApiCounter() {
        return this.apiCounter;
    }

    public final void setApiCounter(int i) {
        this.apiCounter = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: com.crickpe.view.detail.adapters.TopupAmountAdapter} */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r10 = this;
            super.onResume()
            androidx.fragment.app.FragmentActivity r0 = r10.getActivity()
            if (r0 == 0) goto L_0x00e6
            r1 = r0
            com.crickpe.view.detail.DetailActivity r1 = (com.crickpe.view.detail.DetailActivity) r1
            android.content.res.Resources r0 = r10.getResources()
            r2 = 2131952278(0x7f130296, float:1.9540994E38)
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r0 = "resources.getString(R.string.top_up)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r3 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1.setTopBar(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList<java.lang.String> r0 = r10.amountList
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0038:
            boolean r3 = r0.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0072
            java.lang.Object r3 = r0.next()
            r5 = r3
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r6 = r10.amountStr
            java.lang.String r7 = r5.toString()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0066
            com.crickpe.view.detail.adapters.TopupAmountAdapter r6 = r10.adapter
            if (r6 != 0) goto L_0x005c
            java.lang.String r6 = "adapter"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r6)
            goto L_0x005d
        L_0x005c:
            r4 = r6
        L_0x005d:
            java.util.ArrayList<java.lang.String> r6 = r10.amountList
            int r5 = r6.indexOf(r5)
            r4.setRowIndex(r5)
        L_0x0066:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            boolean r4 = r1.add(r4)
            if (r4 == 0) goto L_0x0038
            r2.add(r3)
            goto L_0x0038
        L_0x0072:
            java.util.List r2 = (java.util.List) r2
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel r0 = r0.getAppSettings()
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r0.getMinTopupAmount()
            goto L_0x0082
        L_0x0081:
            r0 = r4
        L_0x0082:
            if (r0 == 0) goto L_0x00c0
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel r0 = r0.getAppSettings()
            if (r0 == 0) goto L_0x0091
            java.lang.String r0 = r0.getMinTopupAmount()
            goto L_0x0092
        L_0x0091:
            r0 = r4
        L_0x0092:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = java.lang.Integer.parseInt(r0)
            r10.minAmount = r0
            int r0 = com.crickpe.C1188R.C1192id.tvMinAmount
            android.view.View r0 = r10._$_findCachedViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "(Min ₹"
            r1.append(r2)
            int r2 = r10.minAmount
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
        L_0x00c0:
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel r0 = r0.getAppSettings()
            if (r0 == 0) goto L_0x00cd
            java.lang.String r0 = r0.getMaxTopupAmount()
            goto L_0x00ce
        L_0x00cd:
            r0 = r4
        L_0x00ce:
            if (r0 == 0) goto L_0x00e5
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel r0 = r0.getAppSettings()
            if (r0 == 0) goto L_0x00dc
            java.lang.String r4 = r0.getMaxTopupAmount()
        L_0x00dc:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            int r0 = java.lang.Integer.parseInt(r4)
            r10.maxAmount = r0
        L_0x00e5:
            return
        L_0x00e6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.wallet.TopUpFragment.onResume():void");
    }

    public void onViewCreated(View view, Bundle bundle) {
        SavedStateHandle savedStateHandle;
        MutableLiveData liveData;
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        Context applicationContext = requireActivity().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "requireActivity().applicationContext");
        Configuration configuration = r2;
        Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
        this.amplitude = new Amplitude(configuration);
        ArrayList<String> arrayList = new ArrayList<>();
        this.amountList = arrayList;
        arrayList.add("100");
        this.amountList.add("200");
        this.amountList.add("500");
        this.amountList.add("2000");
        setAdapter(this.amountList);
        getArgument();
        observeData();
        textWatcher();
        NavBackStackEntry currentBackStackEntry = FragmentKt.findNavController(this).getCurrentBackStackEntry();
        if (!(currentBackStackEntry == null || (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) == null || (liveData = savedStateHandle.getLiveData("return")) == null)) {
            liveData.observe(getViewLifecycleOwner(), new TopUpFragment$$ExternalSyntheticLambda10(this));
        }
        this.pweActivityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new TopUpFragment$$ExternalSyntheticLambda1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-1  reason: not valid java name */
    public static final void m3651onViewCreated$lambda1(TopUpFragment topUpFragment, Boolean bool) {
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        Intrinsics.checkNotNullExpressionValue(bool, "data");
        if (bool.booleanValue()) {
            topUpFragment.mHandler.postDelayed(topUpFragment.mRunnableTask, 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-2  reason: not valid java name */
    public static final void m3652onViewCreated$lambda2(TopUpFragment topUpFragment, ActivityResult activityResult) {
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        Intent data = activityResult.getData();
        if (data != null) {
            try {
                if (!Intrinsics.areEqual((Object) String.valueOf(data.getStringExtra("result")), (Object) PWEStaticDataModel.TXN_SUCCESS_CODE)) {
                    topUpFragment.failedDialog();
                    try {
                        if (UserManager.INSTANCE.getUserProfile() != null) {
                            FragmentActivity requireActivity = topUpFragment.requireActivity();
                            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                            User userProfile = UserManager.INSTANCE.getUserProfile();
                            String str = null;
                            CommonMethodsKt.callAppsFlyer(requireActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, "payment_failed");
                            Bundle bundle = new Bundle();
                            User userProfile2 = UserManager.INSTANCE.getUserProfile();
                            if (userProfile2 != null) {
                                str = userProfile2.get_id();
                            }
                            bundle.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str));
                            ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent("payment_failed", bundle);
                        }
                    } catch (Exception e) {
                        Log.e("Analytics", e.toString());
                    }
                } else {
                    Log.v("DATAAA", "ResultLauncher");
                    topUpFragment.successDialog();
                }
            } catch (Exception unused) {
            }
        }
    }

    private final void getArgument() {
        if (UserManager.getLowAmount() != null) {
            String lowAmount = UserManager.getLowAmount();
            if (lowAmount == null) {
                lowAmount = "0";
            }
            this.amountStr = lowAmount;
            ((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).setText(this.amountStr);
            UserManager.INSTANCE.saveLowAmount("");
        }
        Bundle arguments = getArguments();
        String str = null;
        if ((arguments != null ? arguments.getString("from") : null) != null) {
            Bundle arguments2 = getArguments();
            String string = arguments2 != null ? arguments2.getString("from") : null;
            if (string == null) {
                string = "";
            }
            this.from = string;
        }
        Bundle arguments3 = getArguments();
        if ((arguments3 != null ? arguments3.getString("from") : null) != null) {
            Bundle arguments4 = getArguments();
            String string2 = arguments4 != null ? arguments4.getString("from") : null;
            if (string2 == null) {
                string2 = "";
            }
            this.from = string2;
        }
        Bundle arguments5 = getArguments();
        if ((arguments5 != null ? arguments5.getString("topup_amount") : null) != null) {
            Bundle arguments6 = getArguments();
            if (arguments6 != null) {
                str = arguments6.getString("topup_amount");
            }
            if (str == null) {
                str = "0";
            }
            this.amountStr = str;
            ((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).setText(this.amountStr);
        }
        if (Intrinsics.areEqual((Object) this.amountStr, (Object) "")) {
            this.amountStr = "0";
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (view.getId() != C1188R.C1192id.tvProceedToPay) {
            return;
        }
        if (Integer.parseInt(this.amountStr) == 0 || Intrinsics.areEqual((Object) this.amountStr, (Object) "")) {
            String string = getResources().getString(C1188R.string.invalid_amount);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.invalid_amount)");
            showToast(string);
        } else if (Integer.parseInt(this.amountStr) < this.minAmount) {
            showToast("Minimum amount for top up is ₹" + this.minAmount);
        } else if (Integer.parseInt(this.amountStr) > this.maxAmount) {
            showToast("Maximum amount for top up is ₹" + this.maxAmount);
        } else if (UserManager.INSTANCE.getAppSettings() != null) {
            SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
            DetailViewModel detailViewModel = null;
            if (Intrinsics.areEqual((Object) appSettings != null ? appSettings.getOnTopUpKycChecks() : null, (Object) "true")) {
                User userProfile = UserManager.INSTANCE.getUserProfile();
                Intrinsics.checkNotNull(userProfile);
                if (userProfile.getKycStatus() != 1) {
                    FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_topUpFragment_to_kycFragment2);
                    return;
                }
                TopUpRequest topUpRequest = new TopUpRequest(String.valueOf(Integer.parseInt(this.amountStr)));
                SettingsModel appSettings2 = UserManager.INSTANCE.getAppSettings();
                if (Intrinsics.areEqual((Object) String.valueOf(appSettings2 != null ? appSettings2.isActivePaymentGateway() : null), (Object) "EASEBUZZ")) {
                    DetailViewModel detailViewModel2 = this.viewModel;
                    if (detailViewModel2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    } else {
                        detailViewModel = detailViewModel2;
                    }
                    detailViewModel.initiatePaymentGatway(topUpRequest);
                    return;
                }
                DetailViewModel detailViewModel3 = this.viewModel;
                if (detailViewModel3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel = detailViewModel3;
                }
                detailViewModel.createPayment(topUpRequest);
                return;
            }
            User userProfile2 = UserManager.INSTANCE.getUserProfile();
            if (Intrinsics.areEqual((Object) String.valueOf(userProfile2 != null ? userProfile2.get_id() : null), (Object) Constants.PROFILE_ID)) {
                User userProfile3 = UserManager.INSTANCE.getUserProfile();
                Intrinsics.checkNotNull(userProfile3);
                if (userProfile3.getKycStatus() != 1) {
                    FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_topUpFragment_to_kycFragment2);
                    return;
                }
            }
            TopUpRequest topUpRequest2 = new TopUpRequest(String.valueOf(Integer.parseInt(this.amountStr)));
            SettingsModel appSettings3 = UserManager.INSTANCE.getAppSettings();
            if (Intrinsics.areEqual((Object) String.valueOf(appSettings3 != null ? appSettings3.isActivePaymentGateway() : null), (Object) "EASEBUZZ")) {
                DetailViewModel detailViewModel4 = this.viewModel;
                if (detailViewModel4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    detailViewModel = detailViewModel4;
                }
                detailViewModel.initiatePaymentGatway(topUpRequest2);
                return;
            }
            DetailViewModel detailViewModel5 = this.viewModel;
            if (detailViewModel5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel = detailViewModel5;
            }
            detailViewModel.createPayment(topUpRequest2);
        }
    }

    public void onItemClicked(String str) {
        Intrinsics.checkNotNullParameter(str, "amount");
        try {
            ((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).setText(str);
            this.amountStr = str;
            ((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).setSelection(((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).length());
        } catch (Exception unused) {
        }
    }

    private final void failedDialog() {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_failed);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvDone);
        if (findViewById != null) {
            Window window = dialog.getWindow();
            Intrinsics.checkNotNull(window);
            window.setBackgroundDrawableResource(17170445);
            window.setLayout(-1, -1);
            ((TextView) findViewById).setOnClickListener(new TopUpFragment$$ExternalSyntheticLambda7(dialog));
            dialog.show();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: failedDialog$lambda-3  reason: not valid java name */
    public static final void m3644failedDialog$lambda3(Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        dialog.dismiss();
    }

    private final void successDialog() {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setContentView(C1188R.C1193layout.dialog_succses_topup);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvDone);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvTopupAmount);
            if (findViewById2 != null) {
                ((TextView) findViewById2).setText(8377 + this.amountStr);
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawableResource(17170445);
                window.setLayout(-1, -1);
                textView.setOnClickListener(new TopUpFragment$$ExternalSyntheticLambda9(dialog, this));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: successDialog$lambda-4  reason: not valid java name */
    public static final void m3653successDialog$lambda4(Dialog dialog, TopUpFragment topUpFragment, View view) {
        SavedStateHandle savedStateHandle;
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        dialog.dismiss();
        Fragment fragment = topUpFragment;
        NavBackStackEntry previousBackStackEntry = FragmentKt.findNavController(fragment).getPreviousBackStackEntry();
        if (!(previousBackStackEntry == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null)) {
            savedStateHandle.set("from", topUpFragment.from);
        }
        FragmentKt.findNavController(fragment).popBackStack();
        try {
            Amplitude amplitude2 = topUpFragment.amplitude;
            if (amplitude2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("amplitude");
                amplitude2 = null;
            }
            com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_WALLET_TOP_UP, (Map) null, (EventOptions) null, 6, (Object) null);
            HashMap hashMap = new HashMap();
            hashMap.put(AFInAppEventParameterName.REVENUE, topUpFragment.amountStr);
            AppsFlyerLib.getInstance().logEvent(topUpFragment.requireActivity().getApplicationContext(), Constants.EVENT_WALLET_TOP_UP, hashMap, new TopUpFragment$successDialog$1$1());
            Bundle bundle = new Bundle();
            bundle.putString("revenue", topUpFragment.amountStr.toString());
            ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_WALLET_TOP_UP, bundle);
        } catch (Exception e) {
            Log.e("Analytics", e.toString());
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<PaymentCheckModel>> checkPaymentStatusCall = detailViewModel.getCheckPaymentStatusCall();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        checkPaymentStatusCall.observe(viewLifecycleOwner, new TopUpFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<TopUpRequest>> topUpAmount = detailViewModel3.getTopUpAmount();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        topUpAmount.observe(viewLifecycleOwner2, new TopUpFragment$$ExternalSyntheticLambda2(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel4 = null;
        }
        SingleLiveEvent<ApiResponseHandler<CreatePaymentLinkModel>> createPaymentLink = detailViewModel4.getCreatePaymentLink();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        createPaymentLink.observe(viewLifecycleOwner3, new TopUpFragment$$ExternalSyntheticLambda3(this));
        DetailViewModel detailViewModel5 = this.viewModel;
        if (detailViewModel5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel5 = null;
        }
        SingleLiveEvent<ApiResponseHandler<EasybuzzGatwayModel>> initiatePaymentGatway = detailViewModel5.getInitiatePaymentGatway();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "viewLifecycleOwner");
        initiatePaymentGatway.observe(viewLifecycleOwner4, new TopUpFragment$$ExternalSyntheticLambda4(this));
        DetailViewModel detailViewModel6 = this.viewModel;
        if (detailViewModel6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel6;
        }
        SingleLiveEvent<ApiResponseHandler<HomeDataModel>> getHomeDataApi = detailViewModel2.getGetHomeDataApi();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "viewLifecycleOwner");
        getHomeDataApi.observe(viewLifecycleOwner5, new TopUpFragment$$ExternalSyntheticLambda5(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-5  reason: not valid java name */
    public static final void m3646observeData$lambda5(TopUpFragment topUpFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
        if (i != 1) {
            if (i == 2) {
                ProgressBar progressBar = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                topUpFragment.mHandler.removeCallbacks(topUpFragment.mRunnableTask);
                FragmentActivity requireActivity = topUpFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                topUpFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar2 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.visible(progressBar2);
            }
        } else if (apiResponseHandler.getData() != null && topUpFragment.apiCounter == 5) {
            ProgressBar progressBar3 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
            CommonMethodsKt.hide(progressBar3);
            int status = ((PaymentCheckModel) apiResponseHandler.getData()).getStatus();
            if (status == 1) {
                DetailViewModel detailViewModel = topUpFragment.viewModel;
                if (detailViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel = null;
                }
                detailViewModel.getHomeDataApi();
                topUpFragment.successDialog();
                topUpFragment.mHandler.removeCallbacks(topUpFragment.mRunnableTask);
            } else if (status == 2) {
                topUpFragment.mHandler.removeCallbacks(topUpFragment.mRunnableTask);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-6  reason: not valid java name */
    public static final void m3647observeData$lambda6(TopUpFragment topUpFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
        if (i == 1) {
            ProgressBar progressBar = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            CommonMethodsKt.hide(progressBar);
        } else if (i == 2) {
            ProgressBar progressBar2 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
            CommonMethodsKt.hide(progressBar2);
            FragmentActivity requireActivity = topUpFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            topUpFragment.handleApiError(requireActivity, apiResponseHandler.getError());
        } else if (i == 3) {
            ProgressBar progressBar3 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
            CommonMethodsKt.visible(progressBar3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-7  reason: not valid java name */
    public static final void m3648observeData$lambda7(TopUpFragment topUpFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
        if (i == 1) {
            ProgressBar progressBar = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            CommonMethodsKt.hide(progressBar);
            if (apiResponseHandler.getData() != null) {
                Bundle bundle = new Bundle();
                bundle.putString("web_url", ((CreatePaymentLinkModel) apiResponseHandler.getData()).getData().getPayload().getDefault());
                bundle.putString("from", "topup");
                topUpFragment.orderId = ((CreatePaymentLinkModel) apiResponseHandler.getData()).getOrderId();
                FragmentKt.findNavController(topUpFragment).navigate((int) C1188R.C1192id.action_topUpFragment_to_webViewFragment, bundle);
            }
        } else if (i == 2) {
            ProgressBar progressBar2 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
            CommonMethodsKt.hide(progressBar2);
            FragmentActivity requireActivity = topUpFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            topUpFragment.handleApiError(requireActivity, apiResponseHandler.getError());
        } else if (i == 3) {
            ProgressBar progressBar3 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
            CommonMethodsKt.visible(progressBar3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-8  reason: not valid java name */
    public static final void m3649observeData$lambda8(TopUpFragment topUpFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
        if (i == 1) {
            ProgressBar progressBar = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            CommonMethodsKt.hide(progressBar);
            if (apiResponseHandler.getData() != null) {
                Intent intent = new Intent(topUpFragment.requireContext(), PWECouponsActivity.class);
                intent.setFlags(131072);
                intent.putExtra("access_key", ((EasybuzzGatwayModel) apiResponseHandler.getData()).getKey());
                if (Intrinsics.areEqual((Object) ((EasybuzzGatwayModel) apiResponseHandler.getData()).isSandboxEasebuzz(), (Object) "true")) {
                    intent.putExtra("pay_mode", Constants.TEST);
                } else {
                    intent.putExtra("pay_mode", Constants.PRODUCTION);
                }
                ActivityResultLauncher<Intent> activityResultLauncher = topUpFragment.pweActivityResultLauncher;
                Intrinsics.checkNotNull(activityResultLauncher);
                activityResultLauncher.launch(intent);
            }
        } else if (i == 2) {
            ProgressBar progressBar2 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
            CommonMethodsKt.hide(progressBar2);
            FragmentActivity requireActivity = topUpFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            topUpFragment.handleApiError(requireActivity, apiResponseHandler.getError());
        } else if (i == 3) {
            ProgressBar progressBar3 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
            CommonMethodsKt.visible(progressBar3);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-9  reason: not valid java name */
    public static final void m3650observeData$lambda9(TopUpFragment topUpFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
        boolean z = true;
        if (i == 1) {
            HomeDataModel homeDataModel = (HomeDataModel) apiResponseHandler.getData();
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) topUpFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setRefreshing(false);
            }
            if (homeDataModel != null) {
                User userProfile = UserManager.INSTANCE.getUserProfile();
                if (userProfile != null) {
                    userProfile.setTotalAmount(homeDataModel.getUserInfo().getTotalAmount());
                }
                ApplicationActivity.Companion.setWalletBalance(homeDataModel.getUserInfo().getTotalAmount());
                ((DetailActivity) topUpFragment.requireActivity()).showWalletBal(homeDataModel.getUserInfo().getTotalAmount());
            }
            ProgressBar progressBar = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            CommonMethodsKt.hide(progressBar);
        } else if (i == 2) {
            SwipeRefreshLayout swipeRefreshLayout2 = (SwipeRefreshLayout) topUpFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.setRefreshing(false);
            }
            ProgressBar progressBar2 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
            CommonMethodsKt.hide(progressBar2);
            Log.v("getHomeDataApi_ERROR", new Gson().toJson((Object) apiResponseHandler.getError()));
        } else if (i == 3) {
            SwipeRefreshLayout swipeRefreshLayout3 = (SwipeRefreshLayout) topUpFragment._$_findCachedViewById(C1188R.C1192id.swipeRv);
            if (swipeRefreshLayout3 == null || swipeRefreshLayout3.isRefreshing()) {
                z = false;
            }
            if (z) {
                ProgressBar progressBar3 = (ProgressBar) topUpFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setAdapter(ArrayList<String> arrayList) {
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopupAmount)).setLayoutManager(new GridLayoutManager(requireActivity(), 4));
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new TopupAmountAdapter(requireActivity, this);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvTopupAmount);
        TopupAmountAdapter topupAmountAdapter = null;
        if (recyclerView != null) {
            TopupAmountAdapter topupAmountAdapter2 = this.adapter;
            if (topupAmountAdapter2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                topupAmountAdapter2 = null;
            }
            recyclerView.setAdapter(topupAmountAdapter2);
        }
        TopupAmountAdapter topupAmountAdapter3 = this.adapter;
        if (topupAmountAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            topupAmountAdapter = topupAmountAdapter3;
        }
        topupAmountAdapter.addList(true, arrayList);
    }

    private final void textWatcher() {
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvProceedToPay)).setOnClickListener(this);
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).addTextChangedListener(new TopUpFragment$textWatcher$1(this));
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etAmount)).setOnEditorActionListener(new TopUpFragment$$ExternalSyntheticLambda6(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: textWatcher$lambda-10  reason: not valid java name */
    public static final boolean m3654textWatcher$lambda10(TopUpFragment topUpFragment, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        if (i != 6) {
            return false;
        }
        Context requireContext = topUpFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        CommonMethodsKt.hideKeyboard(requireContext, (EditText) topUpFragment._$_findCachedViewById(C1188R.C1192id.etAmount));
        return true;
    }

    public final boolean backHandle() {
        SavedStateHandle savedStateHandle;
        NavBackStackEntry previousBackStackEntry = FragmentKt.findNavController(this).getPreviousBackStackEntry();
        if (previousBackStackEntry == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null) {
            return true;
        }
        savedStateHandle.set("from", "back_press");
        return true;
    }

    public final long getDelay() {
        return this.delay;
    }

    public final void setDelay(long j) {
        this.delay = j;
    }

    public final long getLast_text_edit() {
        return this.last_text_edit;
    }

    public final void setLast_text_edit(long j) {
        this.last_text_edit = j;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public final void setHandler(Handler handler2) {
        Intrinsics.checkNotNullParameter(handler2, "<set-?>");
        this.handler = handler2;
    }

    /* access modifiers changed from: private */
    /* renamed from: inputFinishChecker$lambda-11  reason: not valid java name */
    public static final void m3645inputFinishChecker$lambda11(TopUpFragment topUpFragment) {
        Intrinsics.checkNotNullParameter(topUpFragment, "this$0");
        if (System.currentTimeMillis() > (topUpFragment.last_text_edit + topUpFragment.delay) - ((long) 500)) {
            TopupAmountAdapter topupAmountAdapter = null;
            if (Intrinsics.areEqual((Object) topUpFragment.amountStr, (Object) "2000")) {
                TopupAmountAdapter topupAmountAdapter2 = topUpFragment.adapter;
                if (topupAmountAdapter2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    topupAmountAdapter2 = null;
                }
                topupAmountAdapter2.setRowIndex(3);
            } else if (Intrinsics.areEqual((Object) topUpFragment.amountStr, (Object) "200")) {
                TopupAmountAdapter topupAmountAdapter3 = topUpFragment.adapter;
                if (topupAmountAdapter3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    topupAmountAdapter3 = null;
                }
                topupAmountAdapter3.setRowIndex(1);
            } else if (Intrinsics.areEqual((Object) topUpFragment.amountStr, (Object) "500")) {
                TopupAmountAdapter topupAmountAdapter4 = topUpFragment.adapter;
                if (topupAmountAdapter4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    topupAmountAdapter4 = null;
                }
                topupAmountAdapter4.setRowIndex(2);
            } else if (Intrinsics.areEqual((Object) topUpFragment.amountStr, (Object) "100")) {
                TopupAmountAdapter topupAmountAdapter5 = topUpFragment.adapter;
                if (topupAmountAdapter5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    topupAmountAdapter5 = null;
                }
                topupAmountAdapter5.setRowIndex(0);
            } else {
                TopupAmountAdapter topupAmountAdapter6 = topUpFragment.adapter;
                if (topupAmountAdapter6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    topupAmountAdapter6 = null;
                }
                topupAmountAdapter6.setRowIndex(-1);
            }
            TopupAmountAdapter topupAmountAdapter7 = topUpFragment.adapter;
            if (topupAmountAdapter7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                topupAmountAdapter = topupAmountAdapter7;
            }
            topupAmountAdapter.notifyDataSetChanged();
        }
    }
}
