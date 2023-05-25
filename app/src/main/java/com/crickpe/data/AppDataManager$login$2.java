package com.crickpe.data;

import com.crickpe.data.network.Resource;
import com.crickpe.view.intro.fragments.User;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(mo48221d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H@"}, mo48222d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/crickpe/data/network/Resource;", "Lcom/crickpe/view/intro/fragments/User;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.data.AppDataManager$login$2", mo48886f = "AppDataManager.kt", mo48887i = {0}, mo48888l = {24, 27}, mo48889m = "invokeSuspend", mo48890n = {"$this$flow"}, mo48891s = {"L$0"})
/* compiled from: AppDataManager.kt */
final class AppDataManager$login$2 extends SuspendLambda implements Function2<FlowCollector<? super Resource<User>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ HashMap<String, String> $hashMap;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppDataManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppDataManager$login$2(AppDataManager appDataManager, HashMap<String, String> hashMap, Continuation<? super AppDataManager$login$2> continuation) {
        super(2, continuation);
        this.this$0 = appDataManager;
        this.$hashMap = hashMap;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppDataManager$login$2 appDataManager$login$2 = new AppDataManager$login$2(this.this$0, this.$hashMap, continuation);
        appDataManager$login$2.L$0 = obj;
        return appDataManager$login$2;
    }

    public final Object invoke(FlowCollector<? super Resource<User>> flowCollector, Continuation<? super Unit> continuation) {
        return ((AppDataManager$login$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.FlowCollector} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Object invokeSuspend(Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001b
            if (r1 != r3) goto L_0x0013
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0058
        L_0x0013:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001b:
            java.lang.Object r1 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0048
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.L$0
            r1 = r9
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
            com.crickpe.data.AppDataManager$login$2$data$1 r5 = new com.crickpe.data.AppDataManager$login$2$data$1
            com.crickpe.data.AppDataManager r6 = r8.this$0
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r8.$hashMap
            r5.<init>(r6, r7, r2)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r6 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r8.L$0 = r1
            r8.label = r4
            java.lang.Object r9 = com.crickpe.data.network.NetworkExtesnionKt.apiRequest(r9, r5, r6)
            if (r9 != r0) goto L_0x0048
            return r0
        L_0x0048:
            com.crickpe.data.network.Resource r9 = (com.crickpe.data.network.Resource) r9
            r4 = r8
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r8.L$0 = r2
            r8.label = r3
            java.lang.Object r9 = r1.emit(r9, r4)
            if (r9 != r0) goto L_0x0058
            return r0
        L_0x0058:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.data.AppDataManager$login$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
