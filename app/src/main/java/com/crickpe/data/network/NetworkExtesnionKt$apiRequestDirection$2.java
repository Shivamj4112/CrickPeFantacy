package com.crickpe.data.network;

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

@Metadata(mo48221d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u0003H@"}, mo48222d2 = {"<anonymous>", "T", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.data.network.NetworkExtesnionKt$apiRequestDirection$2", mo48886f = "NetworkExtesnion.kt", mo48887i = {}, mo48888l = {35}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
/* compiled from: NetworkExtesnion.kt */
final class NetworkExtesnionKt$apiRequestDirection$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
    final /* synthetic */ Function1<Continuation<? super Response<T>>, Object> $call;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkExtesnionKt$apiRequestDirection$2(Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Continuation<? super NetworkExtesnionKt$apiRequestDirection$2> continuation) {
        super(2, continuation);
        this.$call = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetworkExtesnionKt$apiRequestDirection$2(this.$call, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super T> continuation) {
        return ((NetworkExtesnionKt$apiRequestDirection$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = NetworkExtesnionKt.createResourceDirection(this.$call, this);
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
