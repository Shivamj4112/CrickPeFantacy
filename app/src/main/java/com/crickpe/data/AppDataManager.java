package com.crickpe.data;

import com.crickpe.data.network.ApiService;
import com.crickpe.data.network.Resource;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.splash.models.BootAppModel;
import java.util.HashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(mo48221d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\tJC\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00070\u00062\"\u0010\f\u001a\u001e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e`\u000fH@ø\u0001\u0000¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo48222d2 = {"Lcom/crickpe/data/AppDataManager;", "", "mApiHelper", "Lcom/crickpe/data/network/ApiService;", "(Lcom/crickpe/data/network/ApiService;)V", "getBootApp", "Lkotlinx/coroutines/flow/Flow;", "Lcom/crickpe/data/network/Resource;", "Lcom/crickpe/view/intro/fragments/splash/models/BootAppModel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "Lcom/crickpe/view/intro/fragments/User;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "(Ljava/util/HashMap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AppDataManager.kt */
public final class AppDataManager {
    /* access modifiers changed from: private */
    public final ApiService mApiHelper;

    @Inject
    public AppDataManager(ApiService apiService) {
        Intrinsics.checkNotNullParameter(apiService, "mApiHelper");
        this.mApiHelper = apiService;
    }

    public final Object login(HashMap<String, String> hashMap, Continuation<? super Flow<? extends Resource<User>>> continuation) {
        return FlowKt.flow(new AppDataManager$login$2(this, hashMap, (Continuation<? super AppDataManager$login$2>) null));
    }

    public final Object getBootApp(Continuation<? super Flow<? extends Resource<BootAppModel>>> continuation) {
        return FlowKt.flow(new AppDataManager$getBootApp$2(this, (Continuation<? super AppDataManager$getBootApp$2>) null));
    }
}
