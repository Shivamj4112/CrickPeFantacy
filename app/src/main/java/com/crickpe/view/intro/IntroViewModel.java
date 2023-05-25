package com.crickpe.view.intro;

import androidx.lifecycle.ViewModel;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.RetrofitClient;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.kyc.models.AllStatesData;
import com.crickpe.view.intro.fragments.splash.models.BootAppModel;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

@Metadata(mo48221d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u001a\u001a\u00020\u001b2\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e`\u001fJ\u001e\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$J*\u0010&\u001a\u00020\u001b2\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e0\u001dj\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001e`\u001fJ\u0006\u0010\t\u001a\u00020\u001bJ\u0006\u0010'\u001a\u00020\u001bJ\u0006\u0010\u0015\u001a\u00020\u001bR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR-\u0010\t\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\bR\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\b¨\u0006("}, mo48222d2 = {"Lcom/crickpe/view/intro/IntroViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "bootApp", "Lcom/crickpe/utils/SingleLiveEvent;", "Lcom/crickpe/utils/apiHandling/ApiResponseHandler;", "Lcom/crickpe/view/intro/fragments/splash/models/BootAppModel;", "getBootApp", "()Lcom/crickpe/utils/SingleLiveEvent;", "getAllStates", "Ljava/util/ArrayList;", "Lcom/crickpe/view/intro/fragments/kyc/models/AllStatesData;", "Lkotlin/collections/ArrayList;", "getGetAllStates", "healthApi", "Lcom/crickpe/view/intro/fragments/splash/models/boot_app_models/SettingsModel;", "getHealthApi", "login", "Lcom/crickpe/view/intro/fragments/User;", "getLogin", "settingsApi", "getSettingsApi", "setupProfile", "getSetupProfile", "submitOTP", "getSubmitOTP", "apiLogin", "", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "apiSetupProfile", "body", "Lokhttp3/MultipartBody$Part;", "name", "Lokhttp3/RequestBody;", "referralCode", "apiSubmitOtp", "getHealth", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: IntroViewModel.kt */
public final class IntroViewModel extends ViewModel {
    private final SingleLiveEvent<ApiResponseHandler<BootAppModel>> bootApp = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<AllStatesData>>> getAllStates = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<SettingsModel>> healthApi = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<User>> login = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<SettingsModel>> settingsApi = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<User>> setupProfile = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<User>> submitOTP = new SingleLiveEvent<>();

    public final SingleLiveEvent<ApiResponseHandler<User>> getLogin() {
        return this.login;
    }

    public final SingleLiveEvent<ApiResponseHandler<User>> getSubmitOTP() {
        return this.submitOTP;
    }

    public final SingleLiveEvent<ApiResponseHandler<User>> getSetupProfile() {
        return this.setupProfile;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<AllStatesData>>> getGetAllStates() {
        return this.getAllStates;
    }

    public final SingleLiveEvent<ApiResponseHandler<BootAppModel>> getBootApp() {
        return this.bootApp;
    }

    public final SingleLiveEvent<ApiResponseHandler<SettingsModel>> getSettingsApi() {
        return this.settingsApi;
    }

    public final SingleLiveEvent<ApiResponseHandler<SettingsModel>> getHealthApi() {
        return this.healthApi;
    }

    public final void getHealth() {
        this.healthApi.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getHealthApi().enqueue(new IntroViewModel$getHealth$1(this));
    }

    /* renamed from: getSettingsApi  reason: collision with other method in class */
    public final void m3747getSettingsApi() {
        this.settingsApi.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getSettingsApi().enqueue(new IntroViewModel$getSettingsApi$1(this));
    }

    public final void apiLogin(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.login.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().loginApi(hashMap).enqueue(new IntroViewModel$apiLogin$1(this));
    }

    public final void apiSubmitOtp(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.submitOTP.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().submitOTPApi(hashMap).enqueue(new IntroViewModel$apiSubmitOtp$1(this));
    }

    public final void getAllStates() {
        this.getAllStates.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getAllStates().enqueue(new IntroViewModel$getAllStates$1(this));
    }

    public final void apiSetupProfile(MultipartBody.Part part, RequestBody requestBody, RequestBody requestBody2) {
        Intrinsics.checkNotNullParameter(part, "body");
        Intrinsics.checkNotNullParameter(requestBody, "name");
        Intrinsics.checkNotNullParameter(requestBody2, "referralCode");
        this.setupProfile.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().submitProfileApi(part, requestBody, requestBody2).enqueue(new IntroViewModel$apiSetupProfile$1(this));
    }
}
