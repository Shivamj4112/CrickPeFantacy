package com.crickpe.view.intro;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;
import com.amplitude.android.Amplitude;
import com.amplitude.android.Configuration;
import com.amplitude.android.TrackingOptions;
import com.amplitude.core.LoggerProvider;
import com.amplitude.core.ServerZone;
import com.amplitude.core.StorageProvider;
import com.amplitude.core.events.EventOptions;
import com.amplitude.core.events.IngestionMetadata;
import com.amplitude.core.events.Plan;
import com.crickpe.C1188R;
import com.crickpe.base.BaseActivity;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.home.HomeActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020$H\u0016J\u0012\u0010&\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010(H\u0014J\u0012\u0010)\u001a\u00020$2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\b\u0010,\u001a\u00020$H\u0014J\u0010\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u00060"}, mo48222d2 = {"Lcom/crickpe/view/intro/IntroductoryActivity;", "Lcom/crickpe/base/BaseActivity;", "()V", "amplitude", "Lcom/amplitude/android/Amplitude;", "calledFragment", "", "getCalledFragment", "()Ljava/lang/String;", "setCalledFragment", "(Ljava/lang/String;)V", "databaseReference", "Lcom/google/firebase/database/DatabaseReference;", "getDatabaseReference", "()Lcom/google/firebase/database/DatabaseReference;", "setDatabaseReference", "(Lcom/google/firebase/database/DatabaseReference;)V", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "getFirebaseDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setFirebaseDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "mFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getMFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setMFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "checkAppVersion", "", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNewIntent", "intent", "Landroid/content/Intent;", "onResume", "openAppUpdateDialog", "isForceUpdate", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: IntroductoryActivity.kt */
public final class IntroductoryActivity extends BaseActivity {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Amplitude amplitude;
    private String calledFragment = "";
    private DatabaseReference databaseReference;
    private Dialog dialog;
    private FirebaseDatabase firebaseDatabase;
    public FirebaseAnalytics mFirebaseAnalytics;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final String getCalledFragment() {
        return this.calledFragment;
    }

    public final void setCalledFragment(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.calledFragment = str;
    }

    public final FirebaseDatabase getFirebaseDatabase() {
        return this.firebaseDatabase;
    }

    public final void setFirebaseDatabase(FirebaseDatabase firebaseDatabase2) {
        this.firebaseDatabase = firebaseDatabase2;
    }

    public final DatabaseReference getDatabaseReference() {
        return this.databaseReference;
    }

    public final void setDatabaseReference(DatabaseReference databaseReference2) {
        this.databaseReference = databaseReference2;
    }

    public final Dialog getDialog() {
        return this.dialog;
    }

    public final void setDialog(Dialog dialog2) {
        this.dialog = dialog2;
    }

    public final FirebaseAnalytics getMFirebaseAnalytics() {
        FirebaseAnalytics firebaseAnalytics = this.mFirebaseAnalytics;
        if (firebaseAnalytics != null) {
            return firebaseAnalytics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mFirebaseAnalytics");
        return null;
    }

    public final void setMFirebaseAnalytics(FirebaseAnalytics firebaseAnalytics) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<set-?>");
        this.mFirebaseAnalytics = firebaseAnalytics;
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        checkAppVersion();
    }

    private final void checkAppVersion() {
        DatabaseReference databaseReference2 = this.databaseReference;
        if (databaseReference2 != null) {
            databaseReference2.addValueEventListener(new IntroductoryActivity$checkAppVersion$1(this));
        }
    }

    /* JADX WARNING: type inference failed for: r7v13, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r7v17, types: [android.view.View] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void openAppUpdateDialog(boolean r7) {
        /*
            r6 = this;
            android.app.Dialog r0 = r6.dialog
            if (r0 == 0) goto L_0x000a
            r1 = 2131493188(0x7f0c0144, float:1.860985E38)
            r0.setContentView(r1)
        L_0x000a:
            android.app.Dialog r0 = r6.dialog
            r1 = 0
            if (r0 == 0) goto L_0x001f
            android.view.Window r0 = r0.getWindow()
            if (r0 == 0) goto L_0x001f
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r1)
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            r0.setBackgroundDrawable(r2)
        L_0x001f:
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            double r2 = (double) r0
            r4 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r2 = r2 * r4
            int r0 = (int) r2
            r2 = -2
            android.app.Dialog r3 = r6.dialog
            if (r3 == 0) goto L_0x0040
            android.view.Window r3 = r3.getWindow()
            if (r3 == 0) goto L_0x0040
            r3.setLayout(r0, r2)
        L_0x0040:
            android.app.Dialog r0 = r6.dialog
            r2 = 0
            if (r0 == 0) goto L_0x004e
            int r3 = com.crickpe.C1188R.C1192id.tvAppTitle
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x004f
        L_0x004e:
            r0 = r2
        L_0x004f:
            if (r0 != 0) goto L_0x0052
            goto L_0x005e
        L_0x0052:
            r3 = 2131952309(0x7f1302b5, float:1.9541057E38)
            java.lang.String r3 = r6.getString(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x005e:
            android.app.Dialog r0 = r6.dialog
            if (r0 == 0) goto L_0x006b
            int r3 = com.crickpe.C1188R.C1192id.tvDescription1
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x006c
        L_0x006b:
            r0 = r2
        L_0x006c:
            if (r0 != 0) goto L_0x006f
            goto L_0x007b
        L_0x006f:
            r3 = 2131952069(0x7f1301c5, float:1.954057E38)
            java.lang.String r3 = r6.getString(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x007b:
            android.app.Dialog r0 = r6.dialog
            if (r0 == 0) goto L_0x0088
            int r3 = com.crickpe.C1188R.C1192id.tvAllow
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0089
        L_0x0088:
            r0 = r2
        L_0x0089:
            if (r0 != 0) goto L_0x008c
            goto L_0x0098
        L_0x008c:
            r3 = 2131952308(0x7f1302b4, float:1.9541055E38)
            java.lang.String r3 = r6.getString(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x0098:
            if (r7 != 0) goto L_0x00bd
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00a7
            int r0 = com.crickpe.C1188R.C1192id.tvCancel
            android.view.View r7 = r7.findViewById(r0)
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
        L_0x00a7:
            if (r2 != 0) goto L_0x00aa
            goto L_0x00ad
        L_0x00aa:
            r2.setVisibility(r1)
        L_0x00ad:
            android.app.Dialog r7 = r6.dialog
            r0 = 1
            if (r7 == 0) goto L_0x00b5
            r7.setCancelable(r0)
        L_0x00b5:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00e0
            r7.setCanceledOnTouchOutside(r0)
            goto L_0x00e0
        L_0x00bd:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00ca
            int r0 = com.crickpe.C1188R.C1192id.tvCancel
            android.view.View r7 = r7.findViewById(r0)
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
        L_0x00ca:
            if (r2 != 0) goto L_0x00cd
            goto L_0x00d2
        L_0x00cd:
            r7 = 8
            r2.setVisibility(r7)
        L_0x00d2:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00d9
            r7.setCancelable(r1)
        L_0x00d9:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00e0
            r7.setCanceledOnTouchOutside(r1)
        L_0x00e0:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00f6
            int r0 = com.crickpe.C1188R.C1192id.tvCancel
            android.view.View r7 = r7.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00f6
            com.crickpe.view.intro.IntroductoryActivity$$ExternalSyntheticLambda0 r0 = new com.crickpe.view.intro.IntroductoryActivity$$ExternalSyntheticLambda0
            r0.<init>(r6)
            r7.setOnClickListener(r0)
        L_0x00f6:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x010c
            int r0 = com.crickpe.C1188R.C1192id.tvAllow
            android.view.View r7 = r7.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x010c
            com.crickpe.view.intro.IntroductoryActivity$$ExternalSyntheticLambda1 r0 = new com.crickpe.view.intro.IntroductoryActivity$$ExternalSyntheticLambda1
            r0.<init>(r6)
            r7.setOnClickListener(r0)
        L_0x010c:
            boolean r7 = r6.isFinishing()
            if (r7 != 0) goto L_0x0119
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x0119
            r7.show()
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.intro.IntroductoryActivity.openAppUpdateDialog(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: openAppUpdateDialog$lambda-0  reason: not valid java name */
    public static final void m3748openAppUpdateDialog$lambda0(IntroductoryActivity introductoryActivity, View view) {
        Intrinsics.checkNotNullParameter(introductoryActivity, "this$0");
        Dialog dialog2 = introductoryActivity.dialog;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: openAppUpdateDialog$lambda-1  reason: not valid java name */
    public static final void m3749openAppUpdateDialog$lambda1(IntroductoryActivity introductoryActivity, View view) {
        Intrinsics.checkNotNullParameter(introductoryActivity, "this$0");
        Dialog dialog2 = introductoryActivity.dialog;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        try {
            introductoryActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + introductoryActivity.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            introductoryActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + introductoryActivity.getPackageName())));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1188R.C1193layout.activity_introductory);
        FirebaseDatabase instance = FirebaseDatabase.getInstance();
        this.firebaseDatabase = instance;
        this.databaseReference = instance != null ? instance.getReference("data") : null;
        Context context = this;
        FirebaseAnalytics instance2 = FirebaseAnalytics.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(instance2, "getInstance(this)");
        setMFirebaseAnalytics(instance2);
        this.dialog = new Dialog(context);
        this.calledFragment = String.valueOf(getIntent().getStringExtra("open"));
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        Context context2 = context;
        Configuration configuration = r3;
        Configuration configuration2 = new Configuration(Constants.AMPLITUDE_API_KEY, applicationContext, 0, 0, (String) null, false, (StorageProvider) null, (LoggerProvider) null, (Integer) null, (String) null, (Function3) null, 0, false, (ServerZone) null, (String) null, (Plan) null, (IngestionMetadata) null, false, false, false, (TrackingOptions) null, false, false, false, 0, false, 0, (StorageProvider) null, 268435452, (DefaultConstructorMarker) null);
        Amplitude amplitude2 = new Amplitude(configuration);
        this.amplitude = amplitude2;
        com.amplitude.core.Amplitude.track$default((com.amplitude.core.Amplitude) amplitude2, Constants.EVENT_APP_LAUNCH, (Map) null, (EventOptions) null, 6, (Object) null);
        CommonMethodsKt.callAppsFlyer(this, "", "", Constants.EVENT_APP_LAUNCH);
        Bundle bundle2 = new Bundle();
        bundle2.putString(Constants.EVENT_APP_LAUNCH, Constants.EVENT_APP_LAUNCH);
        getMFirebaseAnalytics().logEvent(Constants.EVENT_APP_LAUNCH, bundle2);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C1188R.C1192id.nav_host_fragment);
        if (findFragmentById != null) {
            NavHostFragment navHostFragment = (NavHostFragment) findFragmentById;
            NavGraph inflate = navHostFragment.getNavController().getNavInflater().inflate(C1188R.C1195navigation.nav_graph_intro);
            String stringExtra = getIntent().getStringExtra("referalCode");
            if (stringExtra != null) {
                UserManager.saveCode(stringExtra);
                UserManager.INSTANCE.saveEvent(PrefsManager.EVENT_NOTIFY, "contest_detail");
                startActivity(new Intent(context2, HomeActivity.class));
                finish();
            }
            if (!Intrinsics.areEqual((Object) this.calledFragment, (Object) "null")) {
                Log.v("CALL_FRAG", this.calledFragment);
                if (Intrinsics.areEqual((Object) this.calledFragment, (Object) FirebaseAnalytics.Event.LOGIN)) {
                    inflate.setStartDestination((int) C1188R.C1192id.loginFragment);
                } else {
                    inflate.setStartDestination((int) C1188R.C1192id.splashFragment);
                }
                navHostFragment.getNavController().setGraph(inflate);
            } else {
                inflate.setStartDestination((int) C1188R.C1192id.splashFragment);
            }
            Object systemService = getSystemService(FirebaseAnalytics.Param.LOCATION);
            if (systemService != null) {
                LocationManager locationManager = (LocationManager) systemService;
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.location.LocationManager");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
    }

    public void onBackPressed() {
        moveTaskToBack(true);
    }
}
