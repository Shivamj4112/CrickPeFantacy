package com.crickpe.view.detail;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavBackStackEntry;
import com.crickpe.C1188R;
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
@DebugMetadata(mo48885c = "com.crickpe.view.detail.WebViewActivity$loadWebView$1$onPageStarted$1", mo48886f = "WebViewActivity.kt", mo48887i = {}, mo48888l = {}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
/* compiled from: WebViewActivity.kt */
final class WebViewActivity$loadWebView$1$onPageStarted$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ WebViewActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebViewActivity$loadWebView$1$onPageStarted$1(WebViewActivity webViewActivity, Continuation<? super WebViewActivity$loadWebView$1$onPageStarted$1> continuation) {
        super(2, continuation);
        this.this$0 = webViewActivity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebViewActivity$loadWebView$1$onPageStarted$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((WebViewActivity$loadWebView$1$onPageStarted$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        SavedStateHandle savedStateHandle;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            NavBackStackEntry previousBackStackEntry = ActivityKt.findNavController(this.this$0, C1188R.C1192id.webViewFragment).getPreviousBackStackEntry();
            if (!(previousBackStackEntry == null || (savedStateHandle = previousBackStackEntry.getSavedStateHandle()) == null)) {
                savedStateHandle.set("return", Boxing.boxBoolean(true));
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
