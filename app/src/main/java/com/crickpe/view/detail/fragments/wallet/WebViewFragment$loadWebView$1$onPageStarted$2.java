package com.crickpe.view.detail.fragments.wallet;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.fragment.FragmentKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(mo48221d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo48222d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.view.detail.fragments.wallet.WebViewFragment$loadWebView$1$onPageStarted$2", mo48886f = "WebViewFragment.kt", mo48887i = {}, mo48888l = {}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
/* compiled from: WebViewFragment.kt */
final class WebViewFragment$loadWebView$1$onPageStarted$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WebViewFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewFragment$loadWebView$1$onPageStarted$2(WebViewFragment webViewFragment, Continuation<? super WebViewFragment$loadWebView$1$onPageStarted$2> continuation) {
        super(2, continuation);
        this.this$0 = webViewFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebViewFragment$loadWebView$1$onPageStarted$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebViewFragment$loadWebView$1$onPageStarted$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        SavedStateHandle savedStateHandle;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            NavBackStackEntry previousBackStackEntry = FragmentKt.findNavController(this.this$0).getPreviousBackStackEntry();
            if (!(previousBackStackEntry == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null)) {
                savedStateHandle.set("return", Boxing.boxBoolean(true));
            }
            FragmentKt.findNavController(this.this$0).popBackStack();
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
