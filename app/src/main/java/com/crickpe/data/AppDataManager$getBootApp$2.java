package com.crickpe.data;

import com.crickpe.data.network.Resource;
import com.crickpe.view.intro.fragments.splash.models.BootAppModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(mo48221d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002H@"}, mo48222d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/crickpe/data/network/Resource;", "Lcom/crickpe/view/intro/fragments/splash/models/BootAppModel;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.data.AppDataManager$getBootApp$2", mo48886f = "AppDataManager.kt", mo48887i = {0}, mo48888l = {33, 36}, mo48889m = "invokeSuspend", mo48890n = {"$this$flow"}, mo48891s = {"L$0"})
/* compiled from: AppDataManager.kt */
final class AppDataManager$getBootApp$2 extends SuspendLambda implements Function2<FlowCollector<? super Resource<BootAppModel>>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AppDataManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AppDataManager$getBootApp$2(AppDataManager appDataManager, Continuation<? super AppDataManager$getBootApp$2> continuation) {
        super(2, continuation);
        this.this$0 = appDataManager;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AppDataManager$getBootApp$2 appDataManager$getBootApp$2 = new AppDataManager$getBootApp$2(this.this$0, continuation);
        appDataManager$getBootApp$2.L$0 = obj;
        return appDataManager$getBootApp$2;
    }

    public final Object invoke(FlowCollector<? super Resource<BootAppModel>> flowCollector, Continuation<? super Unit> continuation) {
        return ((AppDataManager$getBootApp$2) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.coroutines.flow.FlowCollector} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final Object invokeSuspend(Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001b
            if (r1 != r3) goto L_0x0013
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0056
        L_0x0013:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x001b:
            java.lang.Object r1 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0046
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            r1 = r8
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlinx.coroutines.CoroutineDispatcher r8 = kotlinx.coroutines.Dispatchers.getIO()
            com.crickpe.data.AppDataManager$getBootApp$2$data$1 r5 = new com.crickpe.data.AppDataManager$getBootApp$2$data$1
            com.crickpe.data.AppDataManager r6 = r7.this$0
            r5.<init>(r6, r2)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r6 = r7
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r7.L$0 = r1
            r7.label = r4
            java.lang.Object r8 = com.crickpe.data.network.NetworkExtesnionKt.apiRequest(r8, r5, r6)
            if (r8 != r0) goto L_0x0046
            return r0
        L_0x0046:
            com.crickpe.data.network.Resource r8 = (com.crickpe.data.network.Resource) r8
            r4 = r7
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r7.L$0 = r2
            r7.label = r3
            java.lang.Object r8 = r1.emit(r8, r4)
            if (r8 != r0) goto L_0x0056
            return r0
        L_0x0056:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.data.AppDataManager$getBootApp$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
