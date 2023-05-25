package com.crickpe.data.network;

import com.crickpe.data.models.ApiResponse;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.splash.models.BootAppModel;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.Response;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(mo48221d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0006JC\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032$\b\u0001\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b`\fH§@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, mo48222d2 = {"Lcom/crickpe/data/network/ApiService;", "", "getBootApp", "Lretrofit2/Response;", "Lcom/crickpe/data/models/ApiResponse;", "Lcom/crickpe/view/intro/fragments/splash/models/BootAppModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/crickpe/view/intro/fragments/User;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ApiService.kt */
public interface ApiService {
    @FormUrlEncoded
    @POST("app/bootApp")
    Object getBootApp(Continuation<? super Response<ApiResponse<BootAppModel>>> continuation);

    @FormUrlEncoded
    @POST("auth/loginRegister")
    Object login(@FieldMap HashMap<String, String> hashMap, Continuation<? super Response<ApiResponse<User>>> continuation);
}
