package com.crickpe.data.network;

import com.crickpe.data.models.ApiResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Response;

@Metadata(mo48221d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H@"}, mo48222d2 = {"<anonymous>", "Lcom/crickpe/data/network/Resource;", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.data.network.NetworkExtesnionKt$apiRequest$2", mo48886f = "NetworkExtesnion.kt", mo48887i = {}, mo48888l = {23}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
/* compiled from: NetworkExtesnion.kt */
final class NetworkExtesnionKt$apiRequest$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Resource<T>>, Object> {
    final /* synthetic */ Function1<Continuation<? super Response<ApiResponse<T>>>, Object> $call;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkExtesnionKt$apiRequest$2(Function1<? super Continuation<? super Response<ApiResponse<T>>>, ? extends Object> function1, Continuation<? super NetworkExtesnionKt$apiRequest$2> continuation) {
        super(2, continuation);
        this.$call = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkExtesnionKt$apiRequest$2(this.$call, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Resource<T>> continuation) {
        return ((NetworkExtesnionKt$apiRequest$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = NetworkExtesnionKt.createResource(this.$call, this);
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
