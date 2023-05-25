package com.crickpe.view.detail;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;
import com.crickpe.C1188R;
import com.crickpe.utils.Constants;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.fragments.create_own_team.ContestFragment;
import com.crickpe.view.detail.fragments.create_own_team.create_team.CreateTeamFragment;
import com.crickpe.view.detail.fragments.my_matches_detail.MatchDetailFragment;
import com.crickpe.view.detail.fragments.my_matches_detail.MyMatchDetailFragment;
import com.crickpe.view.detail.fragments.select_team.SelectTeamFragment;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.detail.fragments.wallet.TopUpFragment;
import com.crickpe.view.detail.fragments.wallet.WebViewFragment;
import com.crickpe.view.intro.fragments.bank.BankFragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import dagger.hilt.android.AndroidEntryPoint;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010%\u001a\u00020&H\u0002J\u0006\u0010'\u001a\u00020&J\u0010\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020*H\u0002J\b\u0010+\u001a\u00020&H\u0002J\b\u0010,\u001a\u00020&H\u0002J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0016J\u0012\u0010/\u001a\u00020&2\b\u00100\u001a\u0004\u0018\u000101H\u0014J\u0010\u00102\u001a\u00020&2\u0006\u00103\u001a\u000204H\u0002J\u0018\u00105\u001a\u00020&2\u0006\u0010)\u001a\u00020\u00042\u0006\u00106\u001a\u000207H\u0002J\u0016\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u0004J\u0016\u0010;\u001a\u00020&2\u0006\u0010<\u001a\u0002072\u0006\u0010=\u001a\u00020>JJ\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020\u00042\u0006\u0010A\u001a\u0002042\u0006\u0010B\u001a\u0002042\u0006\u0010C\u001a\u0002042\u0006\u0010D\u001a\u0002042\u0006\u0010E\u001a\u0002042\b\b\u0002\u0010F\u001a\u0002042\b\b\u0002\u0010)\u001a\u000204J\u000e\u0010G\u001a\u00020&2\u0006\u0010H\u001a\u000204J8\u0010I\u001a\u00020&2\u0006\u0010A\u001a\u0002042\u0006\u0010B\u001a\u0002042\u0006\u0010C\u001a\u0002042\u0006\u0010E\u001a\u0002042\u0006\u0010F\u001a\u0002042\u0006\u0010)\u001a\u000204H\u0002J\u000e\u0010J\u001a\u00020&2\u0006\u0010K\u001a\u00020>R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X.¢\u0006\u0002\n\u0000¨\u0006L"}, mo48222d2 = {"Lcom/crickpe/view/detail/DetailActivity;", "Lcom/crickpe/base/BaseActivity;", "()V", "calledFragment", "", "code", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "countDownTimer", "Landroid/os/CountDownTimer;", "getCountDownTimer", "()Landroid/os/CountDownTimer;", "setCountDownTimer", "(Landroid/os/CountDownTimer;)V", "databaseReference", "Lcom/google/firebase/database/DatabaseReference;", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "graph", "Landroidx/navigation/NavGraph;", "matchId", "getMatchId", "setMatchId", "navHostFragment", "Landroidx/navigation/fragment/NavHostFragment;", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "changeNavDestination", "", "checkAppVersion", "getDateString", "time", "", "getIntents", "listeners", "observeData", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "openAppUpdateDialog", "isForceUpdate", "", "printDifferenceDateForHours", "tvTimeRemaining", "Landroid/widget/TextView;", "setImageDynamically", "url1", "url2", "setNumber", "textView", "value", "", "setTopBar", "titleStr", "title", "matchFlags", "wallet", "filter", "pts", "save", "showDownloadIcon", "download", "showHide", "showWalletBal", "toDouble", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@AndroidEntryPoint
/* compiled from: DetailActivity.kt */
public final class DetailActivity extends Hilt_DetailActivity {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private String calledFragment = "";
    private String code = "";
    private CountDownTimer countDownTimer;
    private DatabaseReference databaseReference;
    private Dialog dialog;
    private FirebaseDatabase firebaseDatabase;
    private NavGraph graph;
    private String matchId = "";
    private NavHostFragment navHostFragment;
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.ENGLISH);
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: DetailActivity.kt */
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

    public final Dialog getDialog() {
        return this.dialog;
    }

    public final void setDialog(Dialog dialog2) {
        this.dialog = dialog2;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    private final String getDateString(long j) {
        String format = this.simpleDateFormat.format(Long.valueOf(j * 1000));
        Intrinsics.checkNotNullExpressionValue(format, "simpleDateFormat.format(time * 1000L)");
        return format;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1188R.C1193layout.activity_detail);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        FirebaseDatabase instance = FirebaseDatabase.getInstance();
        this.firebaseDatabase = instance;
        NavHostFragment navHostFragment2 = null;
        this.databaseReference = instance != null ? instance.getReference("data") : null;
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C1188R.C1192id.nav_host_fragment_detail);
        if (findFragmentById != null) {
            NavHostFragment navHostFragment3 = (NavHostFragment) findFragmentById;
            this.navHostFragment = navHostFragment3;
            if (navHostFragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("navHostFragment");
            } else {
                navHostFragment2 = navHostFragment3;
            }
            this.graph = navHostFragment2.getNavController().getNavInflater().inflate(C1188R.C1195navigation.nav_graph_detail);
            getIntents();
            listeners();
            observeData();
            checkAppVersion();
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlWallet);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlWallet");
            hide(relativeLayout);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
    }

    public final void checkAppVersion() {
        try {
            DatabaseReference databaseReference2 = this.databaseReference;
            if (databaseReference2 != null) {
                databaseReference2.addValueEventListener(new DetailActivity$checkAppVersion$1(this));
            }
        } catch (Exception e) {
            Log.v("version_excep", e.toString());
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
            goto L_0x0059
        L_0x0052:
            java.lang.String r3 = "Update App"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x0059:
            android.app.Dialog r0 = r6.dialog
            if (r0 == 0) goto L_0x0066
            int r3 = com.crickpe.C1188R.C1192id.tvDescription1
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x0067
        L_0x0066:
            r0 = r2
        L_0x0067:
            if (r0 != 0) goto L_0x006a
            goto L_0x0071
        L_0x006a:
            java.lang.String r3 = "Please update your app."
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x0071:
            android.app.Dialog r0 = r6.dialog
            if (r0 == 0) goto L_0x007e
            int r3 = com.crickpe.C1188R.C1192id.tvAllow
            android.view.View r0 = r0.findViewById(r3)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L_0x007f
        L_0x007e:
            r0 = r2
        L_0x007f:
            if (r0 != 0) goto L_0x0082
            goto L_0x0089
        L_0x0082:
            java.lang.String r3 = "Update"
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r0.setText(r3)
        L_0x0089:
            if (r7 != 0) goto L_0x00ae
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x0098
            int r0 = com.crickpe.C1188R.C1192id.tvCancel
            android.view.View r7 = r7.findViewById(r0)
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
        L_0x0098:
            if (r2 != 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            r2.setVisibility(r1)
        L_0x009e:
            android.app.Dialog r7 = r6.dialog
            r0 = 1
            if (r7 == 0) goto L_0x00a6
            r7.setCancelable(r0)
        L_0x00a6:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00d1
            r7.setCanceledOnTouchOutside(r0)
            goto L_0x00d1
        L_0x00ae:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00bb
            int r0 = com.crickpe.C1188R.C1192id.tvCancel
            android.view.View r7 = r7.findViewById(r0)
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
        L_0x00bb:
            if (r2 != 0) goto L_0x00be
            goto L_0x00c3
        L_0x00be:
            r7 = 8
            r2.setVisibility(r7)
        L_0x00c3:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00ca
            r7.setCancelable(r1)
        L_0x00ca:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00d1
            r7.setCanceledOnTouchOutside(r1)
        L_0x00d1:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00e7
            int r0 = com.crickpe.C1188R.C1192id.tvCancel
            android.view.View r7 = r7.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00e7
            com.crickpe.view.detail.DetailActivity$$ExternalSyntheticLambda4 r0 = new com.crickpe.view.detail.DetailActivity$$ExternalSyntheticLambda4
            r0.<init>(r6)
            r7.setOnClickListener(r0)
        L_0x00e7:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x00fd
            int r0 = com.crickpe.C1188R.C1192id.tvAllow
            android.view.View r7 = r7.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x00fd
            com.crickpe.view.detail.DetailActivity$$ExternalSyntheticLambda5 r0 = new com.crickpe.view.detail.DetailActivity$$ExternalSyntheticLambda5
            r0.<init>(r6)
            r7.setOnClickListener(r0)
        L_0x00fd:
            boolean r7 = r6.isFinishing()
            if (r7 != 0) goto L_0x010a
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x010a
            r7.show()
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.DetailActivity.openAppUpdateDialog(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: openAppUpdateDialog$lambda-0  reason: not valid java name */
    public static final void m3434openAppUpdateDialog$lambda0(DetailActivity detailActivity, View view) {
        Intrinsics.checkNotNullParameter(detailActivity, "this$0");
        Dialog dialog2 = detailActivity.dialog;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: openAppUpdateDialog$lambda-1  reason: not valid java name */
    public static final void m3435openAppUpdateDialog$lambda1(DetailActivity detailActivity, View view) {
        Intrinsics.checkNotNullParameter(detailActivity, "this$0");
        Dialog dialog2 = detailActivity.dialog;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        try {
            detailActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + detailActivity.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            detailActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + detailActivity.getPackageName())));
        }
    }

    private final void listeners() {
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivBack)).setOnClickListener(new DetailActivity$$ExternalSyntheticLambda1(this));
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPTS)).setOnClickListener(new DetailActivity$$ExternalSyntheticLambda2(this));
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlWallet)).setOnClickListener(new DetailActivity$$ExternalSyntheticLambda3(this));
        showWalletBal(ApplicationActivity.Companion.getWalletBalance());
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-2  reason: not valid java name */
    public static final void m3430listeners$lambda2(DetailActivity detailActivity, View view) {
        Intrinsics.checkNotNullParameter(detailActivity, "this$0");
        detailActivity.onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-3  reason: not valid java name */
    public static final void m3431listeners$lambda3(DetailActivity detailActivity, View view) {
        Intrinsics.checkNotNullParameter(detailActivity, "this$0");
        Intent intent = new Intent(detailActivity, WebViewActivity.class);
        intent.putExtra("web_url", Constants.POINT_SYSTEM_URL);
        intent.putExtra("title", "Point System");
        detailActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-4  reason: not valid java name */
    public static final void m3432listeners$lambda4(DetailActivity detailActivity, View view) {
        Intrinsics.checkNotNullParameter(detailActivity, "this$0");
        NavHostFragment navHostFragment2 = detailActivity.navHostFragment;
        if (navHostFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navHostFragment");
            navHostFragment2 = null;
        }
        navHostFragment2.getNavController().navigate((int) C1188R.C1192id.walletFragment);
    }

    private final void getIntents() {
        String str;
        if (getIntent() != null) {
            String valueOf = String.valueOf(getIntent().getStringExtra("matchId"));
            this.matchId = valueOf;
            if (valueOf == null) {
                this.matchId = UserManager.INSTANCE.getMatchId();
                this.calledFragment = "contest";
            }
        }
        if (getIntent() != null && String.valueOf(getIntent().getStringExtra("referalCode")) == null) {
            this.calledFragment = "contest_detail";
        }
        try {
            if (UserManager.INSTANCE.getMatch() != null) {
                CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam1);
                Intrinsics.checkNotNullExpressionValue(circleImageView, "ivTeam1");
                ImageView imageView = circleImageView;
                UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
                Intrinsics.checkNotNull(match);
                String teamIconUrl = match.getTeam1().getTeamIconUrl();
                ExtensionsKt.loadImage$default(imageView, teamIconUrl == null ? "" : teamIconUrl, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam2);
                Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivTeam2");
                ImageView imageView2 = circleImageView2;
                UpcomingMatchModel match2 = UserManager.INSTANCE.getMatch();
                Intrinsics.checkNotNull(match2);
                String teamIconUrl2 = match2.getTeam2().getTeamIconUrl();
                if (teamIconUrl2 == null) {
                    str = "";
                } else {
                    str = teamIconUrl2;
                }
                ExtensionsKt.loadImage$default(imageView2, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
                UpcomingMatchModel match3 = UserManager.INSTANCE.getMatch();
                Intrinsics.checkNotNull(match3);
                if (match3.getStartAtIST() != null) {
                    UpcomingMatchModel match4 = UserManager.INSTANCE.getMatch();
                    Intrinsics.checkNotNull(match4);
                    Long startAtIST = match4.getStartAtIST();
                    Intrinsics.checkNotNull(startAtIST);
                    String dateString = getDateString(startAtIST.longValue());
                    TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTime);
                    Intrinsics.checkNotNullExpressionValue(textView, "tvTime");
                    printDifferenceDateForHours(dateString, textView);
                }
            }
            changeNavDestination();
        } catch (Exception e) {
            Log.v("DetailActivity", e.toString());
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        detailViewModel.getGetMatchDetailByMatchId().observe(this, new DetailActivity$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-5  reason: not valid java name */
    public static final void m3433observeData$lambda5(DetailActivity detailActivity, ApiResponseHandler apiResponseHandler) {
        UpcomingMatchModel upcomingMatchModel;
        Intrinsics.checkNotNullParameter(detailActivity, "this$0");
        if (apiResponseHandler != null) {
            if (WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()] == 1 && (upcomingMatchModel = (UpcomingMatchModel) apiResponseHandler.getData()) != null) {
                try {
                    UserManager.INSTANCE.saveMatch(upcomingMatchModel);
                    detailActivity.setImageDynamically(upcomingMatchModel.getTeam1().getTeamIconUrl(), upcomingMatchModel.getTeam2().getTeamIconUrl());
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void setImageDynamically(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "url1");
        Intrinsics.checkNotNullParameter(str2, "url2");
        try {
            CountDownTimer countDownTimer2 = this.countDownTimer;
            if (!(countDownTimer2 == null || countDownTimer2 == null)) {
                countDownTimer2.cancel();
            }
            CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam1);
            Intrinsics.checkNotNullExpressionValue(circleImageView, "ivTeam1");
            ExtensionsKt.loadImage$default(circleImageView, str, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
            CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivTeam2);
            Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivTeam2");
            ExtensionsKt.loadImage$default(circleImageView2, str2, C1188R.C1190drawable.flag_placeholder, false, 4, (Object) null);
            UpcomingMatchModel match = UserManager.INSTANCE.getMatch();
            Intrinsics.checkNotNull(match);
            if (match.getStartAtIST() != null) {
                UpcomingMatchModel match2 = UserManager.INSTANCE.getMatch();
                Intrinsics.checkNotNull(match2);
                Long startAtIST = match2.getStartAtIST();
                Intrinsics.checkNotNull(startAtIST);
                String dateString = getDateString(startAtIST.longValue());
                TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTime);
                Intrinsics.checkNotNullExpressionValue(textView, "tvTime");
                printDifferenceDateForHours(dateString, textView);
            }
        } catch (Exception e) {
            Log.v("setImageDynamically", e.toString());
        }
    }

    private final void changeNavDestination() {
        TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTime);
        Intrinsics.checkNotNullExpressionValue(textView, "tvTime");
        hide(textView);
        checkAppVersion();
        this.calledFragment = String.valueOf(getIntent().getStringExtra("open"));
        int intExtra = getIntent().getIntExtra("amount", 0);
        NavGraph navGraph = null;
        try {
            if (!Intrinsics.areEqual((Object) this.matchId.toString(), (Object) "null") && !Intrinsics.areEqual((Object) this.matchId, (Object) "")) {
                DetailViewModel detailViewModel = this.viewModel;
                if (detailViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    detailViewModel = null;
                }
                detailViewModel.getMatchDetailByMatchIdApi(this.matchId);
            }
        } catch (Exception e) {
            Log.v("changeNavDestination1", e.toString());
        }
        if (intExtra > 0) {
            try {
                UserManager.INSTANCE.saveLowAmount(String.valueOf(intExtra));
            } catch (Exception e2) {
                Log.v("changeNavDestination2", e2.toString());
            }
        }
        Log.v("OPENNN", this.calledFragment);
        String str = this.calledFragment;
        switch (str.hashCode()) {
            case -1537677530:
                if (str.equals("recent_earning")) {
                    NavGraph navGraph2 = this.graph;
                    if (navGraph2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph2 = null;
                    }
                    navGraph2.setStartDestination((int) C1188R.C1192id.recentEarningsFragment);
                    break;
                }
                break;
            case -1361218025:
                if (str.equals("choose")) {
                    NavGraph navGraph3 = this.graph;
                    if (navGraph3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph3 = null;
                    }
                    navGraph3.setStartDestination((int) C1188R.C1192id.contestFragment);
                    TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTime);
                    Intrinsics.checkNotNullExpressionValue(textView2, "tvTime");
                    visible(textView2);
                    break;
                }
                break;
            case -1332869944:
                if (str.equals("top_players")) {
                    NavGraph navGraph4 = this.graph;
                    if (navGraph4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph4 = null;
                    }
                    navGraph4.setStartDestination((int) C1188R.C1192id.topPlayersFragment);
                    break;
                }
                break;
            case -985819202:
                if (str.equals("my_match_detail")) {
                    NavGraph navGraph5 = this.graph;
                    if (navGraph5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph5 = null;
                    }
                    navGraph5.setStartDestination((int) C1188R.C1192id.myMatchDetailFragment);
                    break;
                }
                break;
            case -934326481:
                if (str.equals("reward")) {
                    NavGraph navGraph6 = this.graph;
                    if (navGraph6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph6 = null;
                    }
                    navGraph6.setStartDestination((int) C1188R.C1192id.playerRewardsFragment);
                    break;
                }
                break;
            case -795192327:
                if (str.equals("wallet")) {
                    NavGraph navGraph7 = this.graph;
                    if (navGraph7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph7 = null;
                    }
                    navGraph7.setStartDestination((int) C1188R.C1192id.walletFragment);
                    break;
                }
                break;
            case -718398288:
                if (str.equals("web_view")) {
                    NavGraph navGraph8 = this.graph;
                    if (navGraph8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph8 = null;
                    }
                    navGraph8.setStartDestination((int) C1188R.C1192id.webViewFragment);
                    break;
                }
                break;
            case -383467044:
                if (str.equals("contest_detail")) {
                    NavGraph navGraph9 = this.graph;
                    if (navGraph9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph9 = null;
                    }
                    navGraph9.setStartDestination((int) C1188R.C1192id.privateContestDetailFragment);
                    break;
                }
                break;
            case -309425751:
                if (str.equals(Scopes.PROFILE)) {
                    NavGraph navGraph10 = this.graph;
                    if (navGraph10 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph10 = null;
                    }
                    navGraph10.setStartDestination((int) C1188R.C1192id.profileFragment);
                    break;
                }
                break;
            case 106677:
                if (str.equals("kyc")) {
                    NavGraph navGraph11 = this.graph;
                    if (navGraph11 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph11 = null;
                    }
                    navGraph11.setStartDestination((int) C1188R.C1192id.kycFragment2);
                    break;
                }
                break;
            case 108391552:
                if (str.equals("refer")) {
                    NavGraph navGraph12 = this.graph;
                    if (navGraph12 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph12 = null;
                    }
                    navGraph12.setStartDestination((int) C1188R.C1192id.referToEarnFragment);
                    break;
                }
                break;
            case 110545616:
                if (str.equals("topUp")) {
                    NavGraph navGraph13 = this.graph;
                    if (navGraph13 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph13 = null;
                    }
                    navGraph13.setStartDestination((int) C1188R.C1192id.topUpFragment);
                    break;
                }
                break;
            case 951530772:
                if (str.equals("contest")) {
                    NavGraph navGraph14 = this.graph;
                    if (navGraph14 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph14 = null;
                    }
                    navGraph14.setStartDestination((int) C1188R.C1192id.contestFragment);
                    TextView textView3 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTime);
                    Intrinsics.checkNotNullExpressionValue(textView3, "tvTime");
                    visible(textView3);
                    break;
                }
                break;
            case 1306691868:
                if (str.equals(Constants.UPCOMING)) {
                    NavGraph navGraph15 = this.graph;
                    if (navGraph15 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph15 = null;
                    }
                    navGraph15.setStartDestination((int) C1188R.C1192id.upcomingMatchFragment2);
                    break;
                }
                break;
            case 1434631203:
                if (str.equals("settings")) {
                    NavGraph navGraph16 = this.graph;
                    if (navGraph16 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph16 = null;
                    }
                    navGraph16.setStartDestination((int) C1188R.C1192id.settingsFragment);
                    break;
                }
                break;
            case 1952399767:
                if (str.equals("certificate")) {
                    NavGraph navGraph17 = this.graph;
                    if (navGraph17 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph17 = null;
                    }
                    navGraph17.setStartDestination((int) C1188R.C1192id.rewardCertificateFragment);
                    break;
                }
                break;
            case 2073447021:
                if (str.equals("reward_given")) {
                    NavGraph navGraph18 = this.graph;
                    if (navGraph18 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph18 = null;
                    }
                    navGraph18.setStartDestination((int) C1188R.C1192id.rewardGivenFragment);
                    break;
                }
                break;
            case 2112130780:
                if (str.equals("winners_detail")) {
                    NavGraph navGraph19 = this.graph;
                    if (navGraph19 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("graph");
                        navGraph19 = null;
                    }
                    navGraph19.setStartDestination((int) C1188R.C1192id.contestWinnersFragment);
                    break;
                }
                break;
        }
        NavHostFragment navHostFragment2 = this.navHostFragment;
        if (navHostFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("navHostFragment");
            navHostFragment2 = null;
        }
        NavController navController = navHostFragment2.getNavController();
        NavGraph navGraph20 = this.graph;
        if (navGraph20 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("graph");
        } else {
            navGraph = navGraph20;
        }
        navController.setGraph(navGraph);
    }

    public void onBackPressed() {
        try {
            Fragment primaryNavigationFragment = getSupportFragmentManager().getPrimaryNavigationFragment();
            Intrinsics.checkNotNull(primaryNavigationFragment);
            Fragment fragment = primaryNavigationFragment.getChildFragmentManager().getFragments().get(0);
            if (fragment instanceof CreateTeamFragment) {
                if (((CreateTeamFragment) fragment).backHandle()) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else if (fragment instanceof MyMatchDetailFragment) {
                if (((MyMatchDetailFragment) fragment).backHandle()) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else if (fragment instanceof MatchDetailFragment) {
                if (((MatchDetailFragment) fragment).backHandle()) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else if (fragment instanceof ContestFragment) {
                if (((ContestFragment) fragment).backHandle()) {
                    finish();
                }
            } else if (fragment instanceof WebViewFragment) {
                ((WebViewFragment) fragment).backHandle();
            } else if (fragment instanceof SelectTeamFragment) {
                if (((SelectTeamFragment) fragment).backHandle()) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else if (fragment instanceof TopUpFragment) {
                if (((TopUpFragment) fragment).backHandle()) {
                    getOnBackPressedDispatcher().onBackPressed();
                }
            } else if (fragment instanceof BankFragment) {
                ((BankFragment) fragment).backHandle();
            } else {
                getOnBackPressedDispatcher().onBackPressed();
            }
        } catch (Exception e) {
            Log.v("BackHandle_DetailAct", e.toString());
        }
    }

    public final void showDownloadIcon(boolean z) {
        if (z) {
            ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivDownload);
            Intrinsics.checkNotNullExpressionValue(imageView, "ivDownload");
            visible(imageView);
            return;
        }
        ImageView imageView2 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivDownload);
        Intrinsics.checkNotNullExpressionValue(imageView2, "ivDownload");
        hide(imageView2);
    }

    public static /* synthetic */ void setTopBar$default(DetailActivity detailActivity, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i, Object obj) {
        int i2 = i;
        detailActivity.setTopBar(str, z, z2, z3, z4, z5, (i2 & 64) != 0 ? false : z6, (i2 & 128) != 0 ? false : z7);
    }

    public final void setTopBar(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Intrinsics.checkNotNullParameter(str, "titleStr");
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle)).setText(str);
        showHide(z, z2, z3, z5, z6, z7);
        if (z4) {
            ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivFilterTopPlayer);
            Intrinsics.checkNotNullExpressionValue(imageView, "ivFilterTopPlayer");
            visible(imageView);
            return;
        }
        ImageView imageView2 = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivFilterTopPlayer);
        Intrinsics.checkNotNullExpressionValue(imageView2, "ivFilterTopPlayer");
        hide(imageView2);
    }

    private final void showHide(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        if (z) {
            TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
            visible(textView);
        } else {
            TextView textView2 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle);
            Intrinsics.checkNotNullExpressionValue(textView2, "tvTitle");
            hide(textView2);
        }
        if (z5) {
            TextView textView3 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvSave);
            Intrinsics.checkNotNullExpressionValue(textView3, "tvSave");
            visible(textView3);
        } else {
            TextView textView4 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvSave);
            Intrinsics.checkNotNullExpressionValue(textView4, "tvSave");
            hide(textView4);
        }
        if (z2) {
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMatchBetween);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "llMatchBetween");
            visible(linearLayout);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(C1188R.C1192id.llMatchBetween);
            Intrinsics.checkNotNullExpressionValue(linearLayout2, "llMatchBetween");
            hide(linearLayout2);
        }
        if (z3) {
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlWallet);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlWallet");
            visible(relativeLayout);
        } else {
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlWallet);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlWallet");
            hide(relativeLayout2);
        }
        if (z4) {
            RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPTS);
            Intrinsics.checkNotNullExpressionValue(relativeLayout3, "rlPTS");
            visible(relativeLayout3);
        } else {
            RelativeLayout relativeLayout4 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlPTS);
            Intrinsics.checkNotNullExpressionValue(relativeLayout4, "rlPTS");
            hide(relativeLayout4);
        }
        if (z6) {
            TextView textView5 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTime);
            Intrinsics.checkNotNullExpressionValue(textView5, "tvTime");
            visible(textView5);
        } else {
            TextView textView6 = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTime);
            Intrinsics.checkNotNullExpressionValue(textView6, "tvTime");
            hide(textView6);
        }
        if (z || z2 || z3 || z4) {
            RelativeLayout relativeLayout5 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlTop);
            Intrinsics.checkNotNullExpressionValue(relativeLayout5, "rlTop");
            visible(relativeLayout5);
            View _$_findCachedViewById = _$_findCachedViewById(C1188R.C1192id.view);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, Promotion.ACTION_VIEW);
            visible(_$_findCachedViewById);
            return;
        }
        RelativeLayout relativeLayout6 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlTop);
        Intrinsics.checkNotNullExpressionValue(relativeLayout6, "rlTop");
        hide(relativeLayout6);
        View _$_findCachedViewById2 = _$_findCachedViewById(C1188R.C1192id.view);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, Promotion.ACTION_VIEW);
        hide(_$_findCachedViewById2);
    }

    public final CountDownTimer getCountDownTimer() {
        return this.countDownTimer;
    }

    public final void setCountDownTimer(CountDownTimer countDownTimer2) {
        this.countDownTimer = countDownTimer2;
    }

    private final void printDifferenceDateForHours(String str, TextView textView) {
        textView.setText("");
        this.countDownTimer = new DetailActivity$printDifferenceDateForHours$1(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", Locale.getDefault()).parse(str).getTime() - Calendar.getInstance().getTime().getTime(), textView, this).start();
    }

    public final void setNumber(TextView textView, double d) {
        String str;
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            double abs = Math.abs(d);
            if (abs >= 1.0E7d) {
                abs /= (double) 10000000;
                str = " Cr";
            } else if (abs >= 100000.0d) {
                abs /= (double) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
                str = " L";
            } else {
                str = " ";
            }
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###.##");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(abs);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
            textView.setText(8377 + format + str);
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    public final void showWalletBal(double d) {
        TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAmount);
        Intrinsics.checkNotNullExpressionValue(textView, "tvAmount");
        setNumber(textView, d);
    }
}
