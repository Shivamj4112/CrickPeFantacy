package com.crickpe.view.home;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.app.ActivityCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.amplitude.p014id.FileIdentityStorage;
import com.crickpe.C1188R;
import com.crickpe.base.BaseActivity;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.Constants;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.RecyclerTouchListener;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.ApplicationActivity;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.home.adapters.NavigationRVAdapter;
import com.crickpe.view.home.fragments.NavigationItemModel;
import com.crickpe.view.home.fragments.home.HomeDataModel;
import com.crickpe.view.intro.IntroductoryActivity;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.Scopes;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.gson.Gson;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.GlobalScope;
import p019de.hdodenhof.circleimageview.CircleImageView;
import pub.devrel.easypermissions.EasyPermissions;
import zendesk.android.Zendesk;

@Metadata(mo48221d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\b\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u000eJ\b\u0010%\u001a\u00020\"H\u0002J\b\u0010&\u001a\u00020\"H\u0002J\b\u0010'\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020\"H\u0016J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0016J\u0012\u0010,\u001a\u00020\"2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\u0010\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0016J\u0012\u00103\u001a\u00020\"2\b\u00104\u001a\u0004\u0018\u000105H\u0014J-\u00106\u001a\u00020\"2\u0006\u00107\u001a\u0002082\u000e\u00109\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0:2\u0006\u0010;\u001a\u00020<H\u0016¢\u0006\u0002\u0010=J\b\u0010>\u001a\u00020\"H\u0014J\u0010\u0010?\u001a\u00020\"2\u0006\u0010@\u001a\u000200H\u0002J\u0006\u0010A\u001a\u00020\"J\u0016\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FJ\u000e\u0010G\u001a\u00020\"2\u0006\u0010H\u001a\u00020\u000eJ\u000e\u0010I\u001a\u00020\"2\u0006\u0010J\u001a\u00020FJ\b\u0010K\u001a\u00020\"H\u0002J\b\u0010L\u001a\u00020\"H\u0002J\u0010\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u000208H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u001d0\u001cj\b\u0012\u0004\u0012\u00020\u001d`\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000¨\u0006O"}, mo48222d2 = {"Lcom/crickpe/view/home/HomeActivity;", "Lcom/crickpe/base/BaseActivity;", "Landroid/view/View$OnClickListener;", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "()V", "adapter", "Lcom/crickpe/view/home/adapters/NavigationRVAdapter;", "databaseReference", "Lcom/google/firebase/database/DatabaseReference;", "getDatabaseReference", "()Lcom/google/firebase/database/DatabaseReference;", "setDatabaseReference", "(Lcom/google/firebase/database/DatabaseReference;)V", "deviceId", "", "dialog", "Landroid/app/Dialog;", "getDialog", "()Landroid/app/Dialog;", "setDialog", "(Landroid/app/Dialog;)V", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "getFirebaseDatabase", "()Lcom/google/firebase/database/FirebaseDatabase;", "setFirebaseDatabase", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "items", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/NavigationItemModel;", "Lkotlin/collections/ArrayList;", "viewModel", "Lcom/crickpe/view/home/HomeViewModel;", "addObervers", "", "changeBottomNav", "changeTo", "checkAppVersion", "fetchContacts", "listeners", "onBackPressed", "onClick", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onNavigationItemSelected", "", "item", "Landroid/view/MenuItem;", "onNewIntent", "intent", "Landroid/content/Intent;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "openAppUpdateDialog", "isForceUpdate", "resetTitleBar", "setNumber", "textView", "Landroid/widget/TextView;", "value", "", "setTitleBar", "title", "showWalletBal", "toDouble", "successLogout", "supportChatBox", "updateAdapter", "highlightItemPos", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeActivity.kt */
public final class HomeActivity extends BaseActivity implements View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private NavigationRVAdapter adapter;
    private DatabaseReference databaseReference;
    private String deviceId = "";
    private Dialog dialog;
    private FirebaseDatabase firebaseDatabase;
    private ArrayList<NavigationItemModel> items = CollectionsKt.arrayListOf(new NavigationItemModel(C1188R.C1190drawable.nav_setting, "Settings"), new NavigationItemModel(C1188R.C1190drawable.nav_wallet, "Wallet"), new NavigationItemModel(C1188R.C1190drawable.nav_earning, "Recent Earnings"), new NavigationItemModel(C1188R.C1190drawable.nav_terms, "Terms & Conditions"), new NavigationItemModel(C1188R.C1190drawable.nav_ps, "Point System"), new NavigationItemModel(C1188R.C1190drawable.nav_refer, "Refer to Earn"), new NavigationItemModel(C1188R.C1190drawable.nav_responsibile_pay, "Responsible Play"), new NavigationItemModel(C1188R.C1190drawable.contact, "Contact Us"));
    private HomeViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: HomeActivity.kt */
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

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C1188R.C1193layout.activity_home);
        this.viewModel = (HomeViewModel) new ViewModelProvider(this).get(HomeViewModel.class);
        String string = Settings.Secure.getString(getContentResolver(), "android_id");
        Intrinsics.checkNotNullExpressionValue(string, "getString(\n            c…cure.ANDROID_ID\n        )");
        this.deviceId = string;
        AppCenter.start(getApplication(), "69487ba1-9083-4d5c-962f-baf374fb7c8b", Analytics.class, Crashes.class);
        Context context = this;
        this.dialog = new Dialog(context);
        FirebaseDatabase instance = FirebaseDatabase.getInstance();
        this.firebaseDatabase = instance;
        String str = null;
        this.databaseReference = instance != null ? instance.getReference("data") : null;
        if (UserManager.INSTANCE.getUserProfile() != null) {
            FragmentActivity fragmentActivity = this;
            User userProfile = UserManager.INSTANCE.getUserProfile();
            CommonMethodsKt.callAppsFlyer(fragmentActivity, String.valueOf(userProfile != null ? userProfile.get_id() : null), FileIdentityStorage.USER_ID_KEY, Constants.EVENT_HOME);
            Bundle bundle2 = new Bundle();
            User userProfile2 = UserManager.INSTANCE.getUserProfile();
            if (userProfile2 != null) {
                str = userProfile2.get_id();
            }
            bundle2.putString(FileIdentityStorage.USER_ID_KEY, String.valueOf(str));
            ApplicationActivity.Companion.getMFirebaseAnalytics().logEvent(Constants.EVENT_HOME, bundle2);
        }
        listeners();
        updateAdapter(0);
        fetchContacts();
        addObervers();
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.navigation_rv)).setLayoutManager(new LinearLayoutManager(context));
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.navigation_rv)).setHasFixedSize(true);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.navigation_rv)).addOnItemTouchListener(new RecyclerTouchListener(context, new HomeActivity$onCreate$1(this)));
        if (Intrinsics.areEqual((Object) UserManager.INSTANCE.getEvent(PrefsManager.EVENT_NOTIFY), (Object) "contest_detail")) {
            Intent intent = new Intent(context, DetailActivity.class);
            getIntent().putExtra("open", "contest_detail");
            getIntent().putExtra("referalCode", UserManager.INSTANCE.getCode());
            UserManager.INSTANCE.removeEvent(PrefsManager.EVENT_NOTIFY);
            startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    public final void supportChatBox() {
        Zendesk.Companion.getInstance().getMessaging().showMessaging(this);
    }

    private final void addObervers() {
        HomeViewModel homeViewModel = this.viewModel;
        HomeViewModel homeViewModel2 = null;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        LifecycleOwner lifecycleOwner = this;
        homeViewModel.getGetHomeDataApi().observe(lifecycleOwner, new HomeActivity$$ExternalSyntheticLambda3(this));
        HomeViewModel homeViewModel3 = this.viewModel;
        if (homeViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            homeViewModel2 = homeViewModel3;
        }
        homeViewModel2.getLogout().observe(lifecycleOwner, new HomeActivity$$ExternalSyntheticLambda4(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: addObervers$lambda-0  reason: not valid java name */
    public static final void m3670addObervers$lambda0(HomeActivity homeActivity, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(homeActivity, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
        if (i == 1) {
            HomeDataModel homeDataModel = (HomeDataModel) apiResponseHandler.getData();
            if (homeDataModel != null && homeDataModel.getUserInfo() != null) {
                homeDataModel.getUserInfo().setTotalAmount((double) ((int) homeDataModel.getUserInfo().getTotalAmount()));
                ApplicationActivity.Companion.setWalletBalance(homeDataModel.getUserInfo().getTotalAmount());
                homeActivity.showWalletBal(homeDataModel.getUserInfo().getTotalAmount());
            }
        } else if (i == 2) {
            Log.v("getHomeDataApi", new Gson().toJson((Object) apiResponseHandler.getError()));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: addObervers$lambda-1  reason: not valid java name */
    public static final void m3671addObervers$lambda1(HomeActivity homeActivity, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(homeActivity, "this$0");
        int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
        if (i == 1) {
            UserManager.INSTANCE.saveToken("");
            UserManager.INSTANCE.saveFCMToken("");
            Intent intent = new Intent(homeActivity, IntroductoryActivity.class);
            intent.putExtra("open", FirebaseAnalytics.Event.LOGIN);
            homeActivity.startActivity(intent);
            ProgressBar progressBar = (ProgressBar) homeActivity._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
            homeActivity.hide(progressBar);
        } else if (i == 2) {
            ProgressBar progressBar2 = (ProgressBar) homeActivity._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
            homeActivity.hide(progressBar2);
            Log.v("logout", new Gson().toJson((Object) apiResponseHandler.getError()));
        } else if (i == 3) {
            ProgressBar progressBar3 = (ProgressBar) homeActivity._$_findCachedViewById(C1188R.C1192id.progressBar);
            Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
            homeActivity.visible(progressBar3);
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Intrinsics.checkNotNullParameter(strArr, "permissions");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 112) {
            if (!(!(iArr.length == 0)) || iArr[0] != 0) {
                Toast.makeText(this, "The app was not allowed to read your contact", 0).show();
            } else {
                fetchContacts();
            }
        }
    }

    private final void fetchContacts() {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                String[] strArr = {"android.permission.READ_CONTACTS"};
                if (!EasyPermissions.hasPermissions(this, (String[]) Arrays.copyOf(strArr, 1))) {
                    Activity activity = this;
                    Intrinsics.checkNotNull(activity);
                    ActivityCompat.requestPermissions(activity, strArr, 112);
                    return;
                }
                CommonMethodsKt.executeAsyncTask(GlobalScope.INSTANCE, HomeActivity$fetchContacts$1.INSTANCE, new HomeActivity$fetchContacts$2(this), HomeActivity$fetchContacts$3.INSTANCE);
                return;
            }
            CommonMethodsKt.executeAsyncTask(GlobalScope.INSTANCE, HomeActivity$fetchContacts$4.INSTANCE, new HomeActivity$fetchContacts$5(this), HomeActivity$fetchContacts$6.INSTANCE);
        } catch (Exception e) {
            Log.v("fetchContacts", e.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        checkAppVersion();
        HomeViewModel homeViewModel = this.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.getHomeDataApi();
        User userProfile = UserManager.INSTANCE.getUserProfile();
        if (userProfile != null) {
            CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.profileImage);
            Intrinsics.checkNotNullExpressionValue(circleImageView, "profileImage");
            ImageView imageView = circleImageView;
            String profilePic = userProfile.getProfilePic();
            String str = "";
            if (profilePic == null) {
                profilePic = str;
            }
            ExtensionsKt.loadPiccasso(imageView, profilePic, C1188R.C1190drawable.profile_placeholder, true);
            CircleImageView circleImageView2 = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivProfile);
            Intrinsics.checkNotNullExpressionValue(circleImageView2, "ivProfile");
            ImageView imageView2 = circleImageView2;
            String profilePic2 = userProfile.getProfilePic();
            if (profilePic2 != null) {
                str = profilePic2;
            }
            ExtensionsKt.loadPiccasso(imageView2, str, C1188R.C1190drawable.profile_placeholder, true);
            ((TextView) _$_findCachedViewById(C1188R.C1192id.tvName)).setText(userProfile.getName().toString());
        }
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

    public void onBackPressed() {
        if (((DrawerLayout) _$_findCachedViewById(C1188R.C1192id.drawerLayout)).isDrawerOpen((int) GravityCompat.START)) {
            ((DrawerLayout) _$_findCachedViewById(C1188R.C1192id.drawerLayout)).closeDrawer((int) GravityCompat.START);
        } else if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
            getSupportFragmentManager().popBackStack();
        } else {
            moveTaskToBack(true);
        }
    }

    public boolean onNavigationItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "item");
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(C1188R.C1192id.nav_host_fragment);
        if (findFragmentById != null) {
            NavHostFragment navHostFragment = (NavHostFragment) findFragmentById;
            NavGraph inflate = navHostFragment.getNavController().getNavInflater().inflate(C1188R.C1195navigation.nav_graph_home);
            switch (menuItem.getItemId()) {
                case C1188R.C1192id.ivHome:
                    inflate.setStartDestination((int) C1188R.C1192id.homeFragment);
                    navHostFragment.getNavController().setGraph(inflate);
                    return true;
                case C1188R.C1192id.ivMyMatches:
                    inflate.setStartDestination((int) C1188R.C1192id.myMatchesFragment);
                    navHostFragment.getNavController().setGraph(inflate);
                    return true;
                case C1188R.C1192id.ivRewards:
                    inflate.setStartDestination((int) C1188R.C1192id.rewardsFragment);
                    navHostFragment.getNavController().setGraph(inflate);
                    return true;
                case C1188R.C1192id.ivWinners:
                    inflate.setStartDestination((int) C1188R.C1192id.winnerFragment);
                    navHostFragment.getNavController().setGraph(inflate);
                    return true;
                default:
                    return false;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        }
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        switch (view.getId()) {
            case C1188R.C1192id.ivMenu:
                ((DrawerLayout) _$_findCachedViewById(C1188R.C1192id.drawerLayout)).openDrawer((int) GravityCompat.START);
                ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivMenu)).setRotation(360.0f);
                return;
            case C1188R.C1192id.ivProfile:
                ((DrawerLayout) _$_findCachedViewById(C1188R.C1192id.drawerLayout)).openDrawer((int) GravityCompat.START);
                ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivMenu)).setRotation(360.0f);
                return;
            case C1188R.C1192id.llProfile:
                ((DrawerLayout) _$_findCachedViewById(C1188R.C1192id.drawerLayout)).closeDrawer((int) GravityCompat.START);
                Intent intent = new Intent(new Intent(this, DetailActivity.class));
                intent.putExtra("open", Scopes.PROFILE);
                startActivity(intent);
                return;
            case C1188R.C1192id.tvChat:
                ((DrawerLayout) _$_findCachedViewById(C1188R.C1192id.drawerLayout)).closeDrawer((int) GravityCompat.START);
                return;
            case C1188R.C1192id.tvLogout:
                ((DrawerLayout) _$_findCachedViewById(C1188R.C1192id.drawerLayout)).closeDrawer((int) GravityCompat.START);
                successLogout();
                return;
            default:
                return;
        }
    }

    private final void listeners() {
        ((BottomNavigationView) _$_findCachedViewById(C1188R.C1192id.bottomNav)).setOnNavigationItemSelectedListener(this);
        View.OnClickListener onClickListener = this;
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivMenu)).setOnClickListener(onClickListener);
        ((CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivProfile)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.llProfile)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvLogout)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvChat)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvChat)).setPaintFlags(((TextView) _$_findCachedViewById(C1188R.C1192id.tvChat)).getPaintFlags() | 8);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlWallet)).setOnClickListener(new HomeActivity$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-2  reason: not valid java name */
    public static final void m3672listeners$lambda2(HomeActivity homeActivity, View view) {
        Intrinsics.checkNotNullParameter(homeActivity, "this$0");
        Intent intent = new Intent(homeActivity, DetailActivity.class);
        intent.putExtra("open", "wallet");
        homeActivity.startActivity(intent);
    }

    /* access modifiers changed from: private */
    public final void updateAdapter(int i) {
        this.adapter = new NavigationRVAdapter(this.items, i);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.navigation_rv);
        NavigationRVAdapter navigationRVAdapter = this.adapter;
        NavigationRVAdapter navigationRVAdapter2 = null;
        if (navigationRVAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            navigationRVAdapter = null;
        }
        recyclerView.setAdapter(navigationRVAdapter);
        NavigationRVAdapter navigationRVAdapter3 = this.adapter;
        if (navigationRVAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            navigationRVAdapter2 = navigationRVAdapter3;
        }
        navigationRVAdapter2.notifyDataSetChanged();
    }

    public final void setTitleBar(String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivProfile);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "ivProfile");
        visible(circleImageView);
        ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivCrickpe);
        Intrinsics.checkNotNullExpressionValue(imageView, "ivCrickpe");
        hide(imageView);
        TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
        visible(textView);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle)).setText(str);
    }

    public final void changeBottomNav(String str) {
        Intrinsics.checkNotNullParameter(str, "changeTo");
        int hashCode = str.hashCode();
        if (hashCode != 3208415) {
            if (hashCode != 1191012704) {
                if (hashCode == 1415452175 && str.equals("my_matches_fragment")) {
                    MenuItem findItem = ((BottomNavigationView) _$_findCachedViewById(C1188R.C1192id.bottomNav)).getMenu().findItem(C1188R.C1192id.ivMyMatches);
                    Intrinsics.checkNotNullExpressionValue(findItem, "bottomNav.menu.findItem(R.id.ivMyMatches)");
                    onNavigationItemSelected(findItem);
                    ((BottomNavigationView) _$_findCachedViewById(C1188R.C1192id.bottomNav)).setSelectedItemId(C1188R.C1192id.ivMyMatches);
                }
            } else if (str.equals("reward_fragment")) {
                MenuItem findItem2 = ((BottomNavigationView) _$_findCachedViewById(C1188R.C1192id.bottomNav)).getMenu().findItem(C1188R.C1192id.ivRewards);
                Intrinsics.checkNotNullExpressionValue(findItem2, "bottomNav.menu.findItem(R.id.ivRewards)");
                onNavigationItemSelected(findItem2);
                ((BottomNavigationView) _$_findCachedViewById(C1188R.C1192id.bottomNav)).setSelectedItemId(C1188R.C1192id.ivRewards);
            }
        } else if (str.equals("home")) {
            MenuItem findItem3 = ((BottomNavigationView) _$_findCachedViewById(C1188R.C1192id.bottomNav)).getMenu().findItem(C1188R.C1192id.ivHome);
            Intrinsics.checkNotNullExpressionValue(findItem3, "bottomNav.menu.findItem(R.id.ivHome)");
            onNavigationItemSelected(findItem3);
            ((BottomNavigationView) _$_findCachedViewById(C1188R.C1192id.bottomNav)).setSelectedItemId(C1188R.C1192id.ivHome);
        }
    }

    public final void resetTitleBar() {
        CircleImageView circleImageView = (CircleImageView) _$_findCachedViewById(C1188R.C1192id.ivProfile);
        Intrinsics.checkNotNullExpressionValue(circleImageView, "ivProfile");
        visible(circleImageView);
        ImageView imageView = (ImageView) _$_findCachedViewById(C1188R.C1192id.ivCrickpe);
        Intrinsics.checkNotNullExpressionValue(imageView, "ivCrickpe");
        visible(imageView);
        TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle);
        Intrinsics.checkNotNullExpressionValue(textView, "tvTitle");
        hide(textView);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvTitle)).setText("");
    }

    private final void successLogout() {
        Dialog dialog2 = new Dialog(this);
        dialog2.requestWindowFeature(1);
        dialog2.setCancelable(false);
        dialog2.setContentView(C1188R.C1193layout.dialog_logout);
        View findViewById = dialog2.findViewById(C1188R.C1192id.tvYes);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog2.findViewById(C1188R.C1192id.tvNo);
            if (findViewById2 != null) {
                Window window = dialog2.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawableResource(17170445);
                window.setLayout(-1, -2);
                textView.setOnClickListener(new HomeActivity$$ExternalSyntheticLambda5(this, dialog2));
                ((TextView) findViewById2).setOnClickListener(new HomeActivity$$ExternalSyntheticLambda6(dialog2));
                dialog2.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: successLogout$lambda-3  reason: not valid java name */
    public static final void m3675successLogout$lambda3(HomeActivity homeActivity, Dialog dialog2, View view) {
        Intrinsics.checkNotNullParameter(homeActivity, "this$0");
        Intrinsics.checkNotNullParameter(dialog2, "$dialog");
        HomeViewModel homeViewModel = homeActivity.viewModel;
        if (homeViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            homeViewModel = null;
        }
        homeViewModel.logout(MapsKt.hashMapOf(TuplesKt.m276to("deviceId", homeActivity.deviceId)));
        dialog2.dismiss();
    }

    /* access modifiers changed from: private */
    /* renamed from: successLogout$lambda-4  reason: not valid java name */
    public static final void m3676successLogout$lambda4(Dialog dialog2, View view) {
        Intrinsics.checkNotNullParameter(dialog2, "$dialog");
        dialog2.dismiss();
    }

    public final void showWalletBal(double d) {
        TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvAmount);
        Intrinsics.checkNotNullExpressionValue(textView, "tvAmount");
        setNumber(textView, d);
    }

    private final void checkAppVersion() {
        DatabaseReference databaseReference2 = this.databaseReference;
        if (databaseReference2 != null) {
            databaseReference2.addValueEventListener(new HomeActivity$checkAppVersion$1(this));
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
            com.crickpe.view.home.HomeActivity$$ExternalSyntheticLambda0 r0 = new com.crickpe.view.home.HomeActivity$$ExternalSyntheticLambda0
            r0.<init>(r6)
            r7.setOnClickListener(r0)
        L_0x00f6:
            android.app.Dialog r7 = r6.dialog
            if (r7 == 0) goto L_0x010c
            int r0 = com.crickpe.C1188R.C1192id.tvAllow
            android.view.View r7 = r7.findViewById(r0)
            android.widget.TextView r7 = (android.widget.TextView) r7
            if (r7 == 0) goto L_0x010c
            com.crickpe.view.home.HomeActivity$$ExternalSyntheticLambda1 r0 = new com.crickpe.view.home.HomeActivity$$ExternalSyntheticLambda1
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
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.home.HomeActivity.openAppUpdateDialog(boolean):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: openAppUpdateDialog$lambda-5  reason: not valid java name */
    public static final void m3673openAppUpdateDialog$lambda5(HomeActivity homeActivity, View view) {
        Intrinsics.checkNotNullParameter(homeActivity, "this$0");
        Dialog dialog2 = homeActivity.dialog;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: openAppUpdateDialog$lambda-6  reason: not valid java name */
    public static final void m3674openAppUpdateDialog$lambda6(HomeActivity homeActivity, View view) {
        Intrinsics.checkNotNullParameter(homeActivity, "this$0");
        Dialog dialog2 = homeActivity.dialog;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        try {
            homeActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity.getPackageName())));
        } catch (ActivityNotFoundException unused) {
            homeActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + homeActivity.getPackageName())));
        }
    }
}
