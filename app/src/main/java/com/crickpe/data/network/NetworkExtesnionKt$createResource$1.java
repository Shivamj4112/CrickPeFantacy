package com.crickpe.data.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.data.network.NetworkExtesnionKt", mo48886f = "NetworkExtesnion.kt", mo48887i = {0}, mo48888l = {62}, mo48889m = "createResource", mo48890n = {"resource"}, mo48891s = {"L$0"})
/* compiled from: NetworkExtesnion.kt */
final class NetworkExtesnionKt$createResource$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    NetworkExtesnionKt$createResource$1(Continuation<? super NetworkExtesnionKt$createResource$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return NetworkExtesnionKt.createResource((Function1) null, this);
    }
}
