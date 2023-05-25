package com.crickpe.view.intro.fragments.splash;

import android.util.Log;
import androidx.navigation.fragment.FragmentKt;
import com.crickpe.C1188R;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(mo48221d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo48222d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.view.intro.fragments.splash.SplashFragment$checkAuth$1$1", mo48886f = "SplashFragment.kt", mo48887i = {}, mo48888l = {}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
/* compiled from: SplashFragment.kt */
final class SplashFragment$checkAuth$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SplashFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SplashFragment$checkAuth$1$1(SplashFragment splashFragment, Continuation<? super SplashFragment$checkAuth$1$1> continuation) {
        super(2, continuation);
        this.this$0 = splashFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SplashFragment$checkAuth$1$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SplashFragment$checkAuth$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                FragmentKt.findNavController(this.this$0).navigate((int) C1188R.C1192id.action_splashFragment_to_loginFragment);
            } catch (Exception e) {
                Log.v("Exception", e.toString());
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
