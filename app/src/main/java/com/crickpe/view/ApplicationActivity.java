package com.crickpe.view;

import android.app.Application;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDelegate;
import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;
import com.crickpe.C1188R;
import com.crickpe.utils.Constants;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Players;
import com.crickpe.view.home.fragments.home.Team1;
import com.crickpe.view.home.fragments.home.Team2;
import com.crickpe.view.intro.fragments.kyc.models.TeamCountryData;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.ktx.Firebase;
import dagger.hilt.android.HiltAndroidApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import zendesk.android.Zendesk;
import zendesk.messaging.android.DefaultMessagingFactory;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\b\u0010\u0019\u001a\u00020\u0015H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0001X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/ApplicationActivity;", "Landroid/app/Application;", "()V", "databaseReference", "Lcom/google/firebase/database/DatabaseReference;", "getDatabaseReference", "()Lcom/google/firebase/database/DatabaseReference;", "setDatabaseReference", "(Lcom/google/firebase/database/DatabaseReference;)V", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "getFirebaseDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setFirebaseDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "sApplication", "getSApplication", "()Landroid/app/Application;", "setSApplication", "(Landroid/app/Application;)V", "checkAppVersion", "", "getApplication", "getContext", "Landroid/content/Context;", "onCreate", "openAppUpdateDialog", "isForceUpdate", "", "Companion", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@HiltAndroidApp
/* compiled from: ApplicationActivity.kt */
public final class ApplicationActivity extends Hilt_ApplicationActivity {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public static int allRounderCount;
    /* access modifiers changed from: private */
    public static int batsmanCount;
    /* access modifiers changed from: private */
    public static int bowlerCount;
    public static WeakReference<Context> context;
    /* access modifiers changed from: private */
    public static int counting;
    /* access modifiers changed from: private */
    public static float credit = 100.0f;
    /* access modifiers changed from: private */
    public static int currentTabPosition;
    /* access modifiers changed from: private */
    public static String fantasyTeamId = "";
    public static FirebaseAnalytics mFirebaseAnalytics;
    /* access modifiers changed from: private */
    public static ArrayList<Players> selectedPlayers = new ArrayList<>();
    /* access modifiers changed from: private */
    public static TeamCountryData selectedRandomPlayer;
    /* access modifiers changed from: private */
    public static TeamCountryData selectedTeam;
    /* access modifiers changed from: private */
    public static Team1 team1;
    /* access modifiers changed from: private */
    public static Team2 team2;
    /* access modifiers changed from: private */
    public static int teamOneCount;
    /* access modifiers changed from: private */
    public static int teamTwoCount;
    /* access modifiers changed from: private */
    public static double walletBalance;
    /* access modifiers changed from: private */
    public static int wkCount;
    private DatabaseReference databaseReference;
    private FirebaseDatabase firebaseDatabase;
    private Application sApplication;

    public final Application getSApplication() {
        return this.sApplication;
    }

    public final void setSApplication(Application application) {
        this.sApplication = application;
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

    @Metadata(mo48221d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001a\u0010\"\u001a\u00020#X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X.¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R*\u0010.\u001a\u0012\u0012\u0004\u0012\u0002000/j\b\u0012\u0004\u0012\u000200`1X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u000107X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00109\"\u0004\b>\u0010;R\u001c\u0010?\u001a\u0004\u0018\u00010@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001c\u0010E\u001a\u0004\u0018\u00010FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020RX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\b¨\u0006Z"}, mo48222d2 = {"Lcom/crickpe/view/ApplicationActivity$Companion;", "", "()V", "allRounderCount", "", "getAllRounderCount", "()I", "setAllRounderCount", "(I)V", "batsmanCount", "getBatsmanCount", "setBatsmanCount", "bowlerCount", "getBowlerCount", "setBowlerCount", "context", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "getContext", "()Ljava/lang/ref/WeakReference;", "setContext", "(Ljava/lang/ref/WeakReference;)V", "counting", "getCounting", "setCounting", "credit", "", "getCredit", "()F", "setCredit", "(F)V", "currentTabPosition", "getCurrentTabPosition", "setCurrentTabPosition", "fantasyTeamId", "", "getFantasyTeamId", "()Ljava/lang/String;", "setFantasyTeamId", "(Ljava/lang/String;)V", "mFirebaseAnalytics", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "getMFirebaseAnalytics", "()Lcom/google/firebase/analytics/FirebaseAnalytics;", "setMFirebaseAnalytics", "(Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "selectedPlayers", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/Players;", "Lkotlin/collections/ArrayList;", "getSelectedPlayers", "()Ljava/util/ArrayList;", "setSelectedPlayers", "(Ljava/util/ArrayList;)V", "selectedRandomPlayer", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "getSelectedRandomPlayer", "()Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "setSelectedRandomPlayer", "(Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;)V", "selectedTeam", "getSelectedTeam", "setSelectedTeam", "team1", "Lcom/crickpe/view/home/fragments/home/Team1;", "getTeam1", "()Lcom/crickpe/view/home/fragments/home/Team1;", "setTeam1", "(Lcom/crickpe/view/home/fragments/home/Team1;)V", "team2", "Lcom/crickpe/view/home/fragments/home/Team2;", "getTeam2", "()Lcom/crickpe/view/home/fragments/home/Team2;", "setTeam2", "(Lcom/crickpe/view/home/fragments/home/Team2;)V", "teamOneCount", "getTeamOneCount", "setTeamOneCount", "teamTwoCount", "getTeamTwoCount", "setTeamTwoCount", "walletBalance", "", "getWalletBalance", "()D", "setWalletBalance", "(D)V", "wkCount", "getWkCount", "setWkCount", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ApplicationActivity.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final WeakReference<Context> getContext() {
            WeakReference<Context> weakReference = ApplicationActivity.context;
            if (weakReference != null) {
                return weakReference;
            }
            Intrinsics.throwUninitializedPropertyAccessException("context");
            return null;
        }

        public final void setContext(WeakReference<Context> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            ApplicationActivity.context = weakReference;
        }

        public final int getCounting() {
            return ApplicationActivity.counting;
        }

        public final void setCounting(int i) {
            ApplicationActivity.counting = i;
        }

        public final float getCredit() {
            return ApplicationActivity.credit;
        }

        public final void setCredit(float f) {
            ApplicationActivity.credit = f;
        }

        public final int getBatsmanCount() {
            return ApplicationActivity.batsmanCount;
        }

        public final void setBatsmanCount(int i) {
            ApplicationActivity.batsmanCount = i;
        }

        public final int getBowlerCount() {
            return ApplicationActivity.bowlerCount;
        }

        public final void setBowlerCount(int i) {
            ApplicationActivity.bowlerCount = i;
        }

        public final double getWalletBalance() {
            return ApplicationActivity.walletBalance;
        }

        public final void setWalletBalance(double d) {
            ApplicationActivity.walletBalance = d;
        }

        public final int getWkCount() {
            return ApplicationActivity.wkCount;
        }

        public final void setWkCount(int i) {
            ApplicationActivity.wkCount = i;
        }

        public final int getAllRounderCount() {
            return ApplicationActivity.allRounderCount;
        }

        public final void setAllRounderCount(int i) {
            ApplicationActivity.allRounderCount = i;
        }

        public final TeamCountryData getSelectedTeam() {
            return ApplicationActivity.selectedTeam;
        }

        public final void setSelectedTeam(TeamCountryData teamCountryData) {
            ApplicationActivity.selectedTeam = teamCountryData;
        }

        public final TeamCountryData getSelectedRandomPlayer() {
            return ApplicationActivity.selectedRandomPlayer;
        }

        public final void setSelectedRandomPlayer(TeamCountryData teamCountryData) {
            ApplicationActivity.selectedRandomPlayer = teamCountryData;
        }

        public final ArrayList<Players> getSelectedPlayers() {
            return ApplicationActivity.selectedPlayers;
        }

        public final void setSelectedPlayers(ArrayList<Players> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
            ApplicationActivity.selectedPlayers = arrayList;
        }

        public final Team1 getTeam1() {
            return ApplicationActivity.team1;
        }

        public final void setTeam1(Team1 team1) {
            ApplicationActivity.team1 = team1;
        }

        public final Team2 getTeam2() {
            return ApplicationActivity.team2;
        }

        public final void setTeam2(Team2 team2) {
            ApplicationActivity.team2 = team2;
        }

        public final int getTeamOneCount() {
            return ApplicationActivity.teamOneCount;
        }

        public final void setTeamOneCount(int i) {
            ApplicationActivity.teamOneCount = i;
        }

        public final int getTeamTwoCount() {
            return ApplicationActivity.teamTwoCount;
        }

        public final void setTeamTwoCount(int i) {
            ApplicationActivity.teamTwoCount = i;
        }

        public final int getCurrentTabPosition() {
            return ApplicationActivity.currentTabPosition;
        }

        public final void setCurrentTabPosition(int i) {
            ApplicationActivity.currentTabPosition = i;
        }

        public final String getFantasyTeamId() {
            return ApplicationActivity.fantasyTeamId;
        }

        public final void setFantasyTeamId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            ApplicationActivity.fantasyTeamId = str;
        }

        public final FirebaseAnalytics getMFirebaseAnalytics() {
            FirebaseAnalytics firebaseAnalytics = ApplicationActivity.mFirebaseAnalytics;
            if (firebaseAnalytics != null) {
                return firebaseAnalytics;
            }
            Intrinsics.throwUninitializedPropertyAccessException("mFirebaseAnalytics");
            return null;
        }

        public final void setMFirebaseAnalytics(FirebaseAnalytics firebaseAnalytics) {
            Intrinsics.checkNotNullParameter(firebaseAnalytics, "<set-?>");
            ApplicationActivity.mFirebaseAnalytics = firebaseAnalytics;
        }
    }

    private final void checkAppVersion() {
        DatabaseReference databaseReference2 = this.databaseReference;
        if (databaseReference2 != null) {
            databaseReference2.addValueEventListener(new ApplicationActivity$checkAppVersion$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void openAppUpdateDialog(boolean z) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new Dialog(this);
        ((Dialog) objectRef.element).setContentView(C1188R.C1193layout.update_app_dialog);
        Window window = ((Dialog) objectRef.element).getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        int i = (int) (((double) getResources().getDisplayMetrics().widthPixels) * 0.9d);
        Window window2 = ((Dialog) objectRef.element).getWindow();
        if (window2 != null) {
            window2.setLayout(i, -2);
        }
        TextView textView = (TextView) ((Dialog) objectRef.element).findViewById(C1188R.C1192id.tvAppTitle);
        if (textView != null) {
            textView.setText(getString(C1188R.string.update_required));
        }
        TextView textView2 = (TextView) ((Dialog) objectRef.element).findViewById(C1188R.C1192id.tvDescription1);
        if (textView2 != null) {
            textView2.setText(getString(C1188R.string.new_version_of_app_avail));
        }
        TextView textView3 = (TextView) ((Dialog) objectRef.element).findViewById(C1188R.C1192id.tvAllow);
        if (textView3 != null) {
            textView3.setText(getString(C1188R.string.update_now));
        }
        if (!z) {
            TextView textView4 = (TextView) ((Dialog) objectRef.element).findViewById(C1188R.C1192id.tvCancel);
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
            ((Dialog) objectRef.element).setCancelable(true);
            ((Dialog) objectRef.element).setCanceledOnTouchOutside(true);
        } else {
            TextView textView5 = (TextView) ((Dialog) objectRef.element).findViewById(C1188R.C1192id.tvCancel);
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            ((Dialog) objectRef.element).setCancelable(false);
            ((Dialog) objectRef.element).setCanceledOnTouchOutside(false);
        }
        TextView textView6 = (TextView) ((Dialog) objectRef.element).findViewById(C1188R.C1192id.tvCancel);
        if (textView6 != null) {
            textView6.setOnClickListener(new ApplicationActivity$$ExternalSyntheticLambda2(objectRef));
        }
        TextView textView7 = (TextView) ((Dialog) objectRef.element).findViewById(C1188R.C1192id.tvAllow);
        if (textView7 != null) {
            textView7.setOnClickListener(new ApplicationActivity$$ExternalSyntheticLambda3(objectRef, this));
        }
        ((Dialog) objectRef.element).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: openAppUpdateDialog$lambda-0  reason: not valid java name */
    public static final void m3427openAppUpdateDialog$lambda0(Ref.ObjectRef objectRef, View view) {
        Intrinsics.checkNotNullParameter(objectRef, "$dialog");
        ((Dialog) objectRef.element).dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: openAppUpdateDialog$lambda-1  reason: not valid java name */
    public static final void m3428openAppUpdateDialog$lambda1(Ref.ObjectRef objectRef, ApplicationActivity applicationActivity, View view) {
        Intrinsics.checkNotNullParameter(objectRef, "$dialog");
        Intrinsics.checkNotNullParameter(applicationActivity, "this$0");
        ((Dialog) objectRef.element).dismiss();
        try {
            applicationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + applicationActivity.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            applicationActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + applicationActivity.getPackageName())));
        }
    }

    private final Application getApplication() {
        return this.sApplication;
    }

    public final Context getContext() {
        Application application = getApplication();
        Intrinsics.checkNotNull(application);
        return application.getApplicationContext();
    }

    public void onCreate() {
        super.onCreate();
        Context context2 = this;
        PrefsManager.Companion.initialize(context2);
        this.sApplication = this;
        Companion companion = Companion;
        companion.setContext(new WeakReference(this));
        companion.setMFirebaseAnalytics(AnalyticsKt.getAnalytics(Firebase.INSTANCE));
        AppCompatDelegate.setDefaultNightMode(1);
        FirebaseDatabase instance = FirebaseDatabase.getInstance();
        this.firebaseDatabase = instance;
        this.databaseReference = instance != null ? instance.getReference("data") : null;
        checkAppVersion();
        Zendesk.Companion.initialize(context2, Constants.ZENDESK_KEY, new ApplicationActivity$$ExternalSyntheticLambda0(), new ApplicationActivity$$ExternalSyntheticLambda1(), new DefaultMessagingFactory());
        AppsFlyerLib.getInstance().init(Constants.APPSFLYER_DEV_KEY, (AppsFlyerConversionListener) null, context2);
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-2  reason: not valid java name */
    public static final void m3425onCreate$lambda2(Zendesk zendesk2) {
        Intrinsics.checkNotNullParameter(zendesk2, "zendesk");
        Log.i("IntegrationApplication", "Initialization successful");
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreate$lambda-3  reason: not valid java name */
    public static final void m3426onCreate$lambda3(Throwable th) {
        Intrinsics.checkNotNullParameter(th, com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Log.v("IntegrationApplication", "Initialization failed", th);
    }
}
