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
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(mo48221d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003*\u00020\u0004H@"}, mo48222d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "R", "Lkotlinx/coroutines/CoroutineScope;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.utils.CommonMethodsKt$executeAsyncTask$1$result$1", mo48886f = "CommonMethods.kt", mo48887i = {}, mo48888l = {}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
/* compiled from: CommonMethods.kt */
final class CommonMethodsKt$executeAsyncTask$1$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ArrayList<ContactRequest>>, Object> {
    final /* synthetic */ Function0<ArrayList<ContactRequest>> $doInBackground;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonMethodsKt$executeAsyncTask$1$result$1(Function0<? extends ArrayList<ContactRequest>> function0, Continuation<? super CommonMethodsKt$executeAsyncTask$1$result$1> continuation) {
        super(2, continuation);
        this.$doInBackground = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonMethodsKt$executeAsyncTask$1$result$1(this.$doInBackground, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ArrayList<ContactRequest>> continuation) {
        return ((CommonMethodsKt$executeAsyncTask$1$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return this.$doInBackground.invoke();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
