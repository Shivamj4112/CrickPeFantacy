package com.crickpe.utils;

import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

@Metadata(mo48221d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@"}, mo48222d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.utils.CommonMethodsKt$executeAsyncTask$1", mo48886f = "CommonMethods.kt", mo48887i = {}, mo48888l = {68}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
/* compiled from: CommonMethods.kt */
final class CommonMethodsKt$executeAsyncTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<ArrayList<ContactRequest>> $doInBackground;
    final /* synthetic */ Function1<ArrayList<ContactRequest>, R> $onPostExecute;
    final /* synthetic */ Function0<Unit> $onPreExecute;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonMethodsKt$executeAsyncTask$1(Function0<Unit> function0, Function1<? super ArrayList<ContactRequest>, ? extends R> function1, Function0<? extends ArrayList<ContactRequest>> function02, Continuation<? super CommonMethodsKt$executeAsyncTask$1> continuation) {
        super(2, continuation);
        this.$onPreExecute = function0;
        this.$onPostExecute = function1;
        this.$doInBackground = function02;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonMethodsKt$executeAsyncTask$1(this.$onPreExecute, this.$onPostExecute, this.$doInBackground, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CommonMethodsKt$executeAsyncTask$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.$onPreExecute.invoke();
            this.label = 1;
            obj = BuildersKt.withContext(Dispatchers.getIO(), new CommonMethodsKt$executeAsyncTask$1$result$1(this.$doInBackground, (Continuation<? super CommonMethodsKt$executeAsyncTask$1$result$1>) null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$onPostExecute.invoke((ArrayList) obj);
        return Unit.INSTANCE;
    }
}
