package com.crickpe.data.network;

import com.crickpe.utils.local.UserManager;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.Job;
import okhttp3.Interceptor;

@Metadata(mo48221d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001a"}, mo48222d2 = {"Lcom/crickpe/data/network/AuthenticationInterceptor;", "Lokhttp3/Interceptor;", "()V", "accessToken", "", "getAccessToken", "()Ljava/lang/String;", "setAccessToken", "(Ljava/lang/String;)V", "cartId", "getCartId", "setCartId", "secret_key", "getSecret_key", "setSecret_key", "userLoggedIn", "", "getUserLoggedIn", "()Z", "setUserLoggedIn", "(Z)V", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "setSecret", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AuthenticationInterceptor.kt */
public final class AuthenticationInterceptor implements Interceptor {
    private String accessToken;
    private String cartId;
    private volatile String secret_key;
    private boolean userLoggedIn;

    @Inject
    public AuthenticationInterceptor() {
        Job unused = BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, (CoroutineContext) null, (CoroutineStart) null, new C11991(this, (Continuation<? super C11991>) null), 3, (Object) null);
    }

    public final boolean getUserLoggedIn() {
        return this.userLoggedIn;
    }

    public final void setUserLoggedIn(boolean z) {
        this.userLoggedIn = z;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final void setAccessToken(String str) {
        this.accessToken = str;
    }

    public final String getCartId() {
        return this.cartId;
    }

    public final void setCartId(String str) {
        this.cartId = str;
    }

    @Metadata(mo48221d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@"}, mo48222d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    @DebugMetadata(mo48885c = "com.crickpe.data.network.AuthenticationInterceptor$1", mo48886f = "AuthenticationInterceptor.kt", mo48887i = {}, mo48888l = {}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
    /* renamed from: com.crickpe.data.network.AuthenticationInterceptor$1 */
    /* compiled from: AuthenticationInterceptor.kt */
    static final class C11991 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ AuthenticationInterceptor this$0;

        {
            this.this$0 = r1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C11991(this.this$0, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C11991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.setAccessToken(UserManager.getAccessToken());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final String getSecret_key() {
        return this.secret_key;
    }

    public final void setSecret_key(String str) {
        this.secret_key = str;
    }

    public final String setSecret(String str) {
        Intrinsics.checkNotNullParameter(str, "secret_key");
        this.secret_key = str;
        return this.secret_key;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if ((r1 == null || r1.length() == 0) == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public okhttp3.Response intercept(okhttp3.Interceptor.Chain r4) {
        /*
            r3 = this;
            java.lang.String r0 = "chain"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r4.request()
            okhttp3.Request r0 = r4.request()
            okhttp3.Request$Builder r0 = r0.newBuilder()
            boolean r1 = r3.userLoggedIn
            if (r1 != 0) goto L_0x0026
            java.lang.String r1 = r3.accessToken
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L_0x0023
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 0
            goto L_0x0024
        L_0x0023:
            r1 = 1
        L_0x0024:
            if (r1 != 0) goto L_0x004b
        L_0x0026:
            java.lang.String r1 = r3.accessToken
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            java.lang.String r2 = "ACCESS :: "
            android.util.Log.v(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Bearer "
            r1.append(r2)
            java.lang.String r2 = r3.accessToken
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Authorization"
            r0.addHeader(r2, r1)
        L_0x004b:
            okhttp3.Request r0 = r0.build()
            okhttp3.Response r4 = r4.proceed(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.data.network.AuthenticationInterceptor.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
