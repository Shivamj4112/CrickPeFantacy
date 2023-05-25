package com.crickpe.data;

import com.crickpe.data.models.ApiResponse;
import com.crickpe.view.intro.fragments.splash.models.BootAppModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import retrofit2.Response;

@Metadata(mo48221d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001H@"}, mo48222d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/crickpe/data/models/ApiResponse;", "Lcom/crickpe/view/intro/fragments/splash/models/BootAppModel;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.data.AppDataManager$getBootApp$2$data$1", mo48886f = "AppDataManager.kt", mo48887i = {}, mo48888l = {34}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
/* compiled from: AppDataManager.kt */
final class AppDataManager$getBootApp$2$data$1 extends SuspendLambda implements Function1<Continuation<? super Response<ApiResponse<BootAppModel>>>, Object> {
    int label;
    final /* synthetic */ AppDataManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppDataManager$getBootApp$2$data$1(AppDataManager appDataManager, Continuation<? super AppDataManager$getBootApp$2$data$1> continuation) {
        super(1, continuation);
        this.this$0 = appDataManager;
    }

    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new AppDataManager$getBootApp$2$data$1(this.this$0, continuation);
    }

    public final Object invoke(Continuation<? super Response<ApiResponse<BootAppModel>>> continuation) {
        return ((AppDataManager$getBootApp$2$data$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.mApiHelper.getBootApp(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
