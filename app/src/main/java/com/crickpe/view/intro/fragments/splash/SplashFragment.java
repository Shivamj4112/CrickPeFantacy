package com.crickpe.view.intro.fragments.splash;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.core.p004os.BundleKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.home.HomeActivity;
import com.crickpe.view.intro.IntroViewModel;
import com.crickpe.view.intro.IntroductoryActivity;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.ktx.FirebaseDynamicLinksKt;
import com.google.firebase.ktx.Firebase;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(mo48221d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\bH\u0002J\b\u0010\r\u001a\u00020\bH\u0016J\u001a\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0017J\b\u0010\u0013\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/splash/SplashFragment;", "Lcom/crickpe/base/BaseFragment;", "()V", "media_control", "Landroid/widget/MediaController;", "viewModel", "Lcom/crickpe/view/intro/IntroViewModel;", "checkAuth", "", "dialogError", "getFragmentLayoutResId", "", "observeData", "onResume", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "videoPlay", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: SplashFragment.kt */
public final class SplashFragment extends BaseFragment {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private MediaController media_control;
    private IntroViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: SplashFragment.kt */
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

    /* access modifiers changed from: private */
    /* renamed from: checkAuth$lambda-9$lambda-8  reason: not valid java name */
    public static final void m3790checkAuth$lambda9$lambda8(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "<anonymous parameter 0>");
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
        return C1188R.C1193layout.fragment_splash;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.viewModel = (IntroViewModel) new ViewModelProvider(this).get(IntroViewModel.class);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvOkay)).setOnClickListener(new SplashFragment$$ExternalSyntheticLambda2(this));
        observeData();
    }

    /* access modifiers changed from: private */
    /* renamed from: onViewCreated$lambda-0  reason: not valid java name */
    public static final void m3794onViewCreated$lambda0(SplashFragment splashFragment, View view) {
        Intrinsics.checkNotNullParameter(splashFragment, "this$0");
        if (Build.VERSION.SDK_INT >= 29) {
            splashFragment.requireActivity().startActivity(new Intent("android.settings.panel.action.INTERNET_CONNECTIVITY"));
        } else {
            splashFragment.requireActivity().finishAffinity();
        }
    }

    public void onResume() {
        super.onResume();
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlProgress);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlProgress");
        CommonMethodsKt.visible(relativeLayout);
        RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlInternet);
        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlInternet");
        CommonMethodsKt.hide(relativeLayout2);
        IntroViewModel introViewModel = this.viewModel;
        IntroViewModel introViewModel2 = null;
        if (introViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            introViewModel = null;
        }
        introViewModel.getHealth();
        IntroViewModel introViewModel3 = this.viewModel;
        if (introViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            introViewModel2 = introViewModel3;
        }
        introViewModel2.getSettingsApi();
    }

    private final void observeData() {
        IntroViewModel introViewModel = this.viewModel;
        IntroViewModel introViewModel2 = null;
        if (introViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            introViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<SettingsModel>> settingsApi = introViewModel.getSettingsApi();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        settingsApi.observe(viewLifecycleOwner, new SplashFragment$$ExternalSyntheticLambda5());
        IntroViewModel introViewModel3 = this.viewModel;
        if (introViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            introViewModel2 = introViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<SettingsModel>> healthApi = introViewModel2.getHealthApi();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        healthApi.observe(viewLifecycleOwner2, new SplashFragment$$ExternalSyntheticLambda6(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3792observeData$lambda1(ApiResponseHandler apiResponseHandler) {
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                SettingsModel settingsModel = (SettingsModel) apiResponseHandler.getData();
                if (settingsModel != null) {
                    UserManager.INSTANCE.saveAppSettings(settingsModel);
                }
            } else if (i == 2) {
                Log.i("ERROR", new Gson().toJson((Object) apiResponseHandler.getMessage()));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3793observeData$lambda2(SplashFragment splashFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(splashFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                RelativeLayout relativeLayout = (RelativeLayout) splashFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlProgress");
                CommonMethodsKt.hide(relativeLayout);
                splashFragment.checkAuth();
            } else if (i == 2) {
                RelativeLayout relativeLayout2 = (RelativeLayout) splashFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlProgress");
                CommonMethodsKt.hide(relativeLayout2);
                splashFragment.dialogError();
            } else if (i == 3) {
                splashFragment.videoPlay();
                RelativeLayout relativeLayout3 = (RelativeLayout) splashFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout3, "rlProgress");
                CommonMethodsKt.visible(relativeLayout3);
            }
        }
    }

    private final void dialogError() {
        Dialog dialog = new Dialog(requireActivity());
        dialog.requestWindowFeature(1);
        dialog.setCancelable(false);
        dialog.setCanceledOnTouchOutside(false);
        dialog.setContentView(C1188R.C1193layout.dialog_failed);
        View findViewById = dialog.findViewById(C1188R.C1192id.tvBody);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            View findViewById2 = dialog.findViewById(C1188R.C1192id.tvDone);
            if (findViewById2 != null) {
                textView.setText(getString(C1188R.string.restricted_app));
                Window window = dialog.getWindow();
                Intrinsics.checkNotNull(window);
                window.setBackgroundDrawableResource(17170445);
                window.setLayout(-1, -2);
                ((TextView) findViewById2).setOnClickListener(new SplashFragment$$ExternalSyntheticLambda3(this, dialog));
                dialog.show();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: dialogError$lambda-3  reason: not valid java name */
    public static final void m3791dialogError$lambda3(SplashFragment splashFragment, Dialog dialog, View view) {
        Intrinsics.checkNotNullParameter(splashFragment, "this$0");
        Intrinsics.checkNotNullParameter(dialog, "$dialog");
        splashFragment.requireActivity().finishAffinity();
        dialog.dismiss();
    }

    private final void checkAuth() {
        User userProfile = UserManager.INSTANCE.getUserProfile();
        String accessToken = UserManager.getAccessToken();
        try {
            Looper myLooper = Looper.myLooper();
            Intrinsics.checkNotNull(myLooper);
            new Handler(myLooper).postDelayed(new SplashFragment$$ExternalSyntheticLambda4(userProfile, accessToken, this), 3000);
        } catch (Exception e) {
            Log.v("Exception", e.toString());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: checkAuth$lambda-9  reason: not valid java name */
    public static final void m3788checkAuth$lambda9(User user, String str, SplashFragment splashFragment) {
        Intrinsics.checkNotNullParameter(str, "$token");
        Intrinsics.checkNotNullParameter(splashFragment, "this$0");
        if (user == null) {
            try {
                FragmentKt.findNavController(splashFragment).navigate((int) C1188R.C1192id.action_splashFragment_to_introFragment);
            } catch (Exception e) {
                Log.e("Splash", e.toString());
            }
        } else if (Intrinsics.areEqual((Object) str, (Object) "")) {
            LifecycleOwnerKt.getLifecycleScope(splashFragment).launchWhenResumed(new SplashFragment$checkAuth$1$1(splashFragment, (Continuation<? super SplashFragment$checkAuth$1$1>) null));
        } else if (user.getName() == null) {
            try {
                FragmentKt.findNavController(splashFragment).navigate((int) C1188R.C1192id.action_splashFragment_to_profileSetUpFragment2, BundleKt.bundleOf(TuplesKt.m276to("_id", user.get_id())));
            } catch (Exception e2) {
                Log.v("Exception", e2.toString());
            }
        } else {
            try {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                objectRef2.element = "";
                FirebaseDynamicLinksKt.getDynamicLinks(Firebase.INSTANCE).getDynamicLink(splashFragment.requireActivity().getIntent()).addOnSuccessListener((Activity) splashFragment.requireActivity(), new SplashFragment$$ExternalSyntheticLambda0(objectRef, objectRef2, splashFragment)).addOnFailureListener((Activity) splashFragment.requireActivity(), (OnFailureListener) new SplashFragment$$ExternalSyntheticLambda1());
            } catch (Exception e3) {
                Log.v("Exception_deeplink", e3.toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: checkAuth$lambda-9$lambda-7  reason: not valid java name */
    public static final void m3789checkAuth$lambda9$lambda7(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, SplashFragment splashFragment, PendingDynamicLinkData pendingDynamicLinkData) {
        Intrinsics.checkNotNullParameter(objectRef, "$deepLink");
        Intrinsics.checkNotNullParameter(objectRef2, "$referCode");
        Intrinsics.checkNotNullParameter(splashFragment, "this$0");
        if (pendingDynamicLinkData != null) {
            try {
                objectRef.element = pendingDynamicLinkData.getLink();
                Uri uri = (Uri) objectRef.element;
                String queryParameter = uri != null ? uri.getQueryParameter("code") : null;
                Intrinsics.checkNotNull(queryParameter);
                objectRef2.element = queryParameter.toString();
                UserManager.saveCode((String) objectRef2.element);
                Intent intent = new Intent(new Intent(splashFragment.requireActivity(), DetailActivity.class));
                intent.putExtra("open", "contest_detail");
                splashFragment.startActivity(intent);
            } catch (Exception e) {
                Log.v("deep_link", e.toString());
                if (UserManager.INSTANCE.getUserProfile() != null) {
                    splashFragment.startActivity(new Intent(splashFragment.requireActivity(), HomeActivity.class));
                    splashFragment.requireActivity().finish();
                    return;
                }
                splashFragment.startActivity(new Intent(splashFragment.requireActivity(), IntroductoryActivity.class));
                splashFragment.requireActivity().finish();
            }
        } else {
            splashFragment.startActivity(new Intent(splashFragment.requireActivity(), HomeActivity.class));
            splashFragment.requireActivity().finish();
        }
    }

    private final void videoPlay() {
        VideoView videoView = (VideoView) _$_findCachedViewById(C1188R.C1192id.vidView);
        Intrinsics.checkNotNullExpressionValue(videoView, "vidView");
        CommonMethodsKt.visible(videoView);
        Uri parse = Uri.parse("android.resource://" + requireActivity().getPackageName() + "/2131886084");
        this.media_control = new MediaController(requireContext());
        ((VideoView) _$_findCachedViewById(C1188R.C1192id.vidView)).setVideoURI(parse);
        ((VideoView) _$_findCachedViewById(C1188R.C1192id.vidView)).start();
    }
}
