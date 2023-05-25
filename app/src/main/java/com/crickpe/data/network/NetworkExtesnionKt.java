package com.crickpe.data.network;

import com.crickpe.data.models.ApiResponse;
import com.crickpe.utils.GenericErrors;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.ResponseBody;
import retrofit2.HttpException;
import retrofit2.Response;

@Metadata(mo48221d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052(\u0010\u0006\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aI\u0010\f\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0012\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001aM\u0010\u0011\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032(\u0010\u0006\u001a$\b\u0001\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\n0\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001aA\u0010\u0013\u001a\u0004\u0018\u0001H\u0002\"\b\b\u0000\u0010\u0002*\u00020\u00032\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007H@ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo48222d2 = {"apiRequest", "Lcom/crickpe/data/network/Resource;", "T", "", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "call", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lretrofit2/Response;", "Lcom/crickpe/data/models/ApiResponse;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apiRequestDirection", "convertErrorBody", "", "throwable", "Lretrofit2/HttpException;", "createResource", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createResourceDirection", "app_release"}, mo48223k = 2, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: NetworkExtesnion.kt */
public final class NetworkExtesnionKt {
    public static final <T> Object apiRequest(CoroutineDispatcher coroutineDispatcher, Function1<? super Continuation<? super Response<ApiResponse<T>>>, ? extends Object> function1, Continuation<? super Resource<T>> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new NetworkExtesnionKt$apiRequest$2(function1, (Continuation<? super NetworkExtesnionKt$apiRequest$2>) null), continuation);
    }

    public static final <T> Object apiRequestDirection(CoroutineDispatcher coroutineDispatcher, Function1<? super Continuation<? super Response<T>>, ? extends Object> function1, Continuation<? super T> continuation) {
        return BuildersKt.withContext(coroutineDispatcher, new NetworkExtesnionKt$apiRequestDirection$2(function1, (Continuation<? super NetworkExtesnionKt$apiRequestDirection$2>) null), continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> Object createResourceDirection(Function1<? super Continuation<? super retrofit2.Response<T>>, ? extends Object> r5, Continuation<? super T> r6) {
        /*
            boolean r0 = r6 instanceof com.crickpe.data.network.NetworkExtesnionKt$createResourceDirection$1
            if (r0 == 0) goto L_0x0014
            r0 = r6
            com.crickpe.data.network.NetworkExtesnionKt$createResourceDirection$1 r0 = (com.crickpe.data.network.NetworkExtesnionKt$createResourceDirection$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L_0x0019
        L_0x0014:
            com.crickpe.data.network.NetworkExtesnionKt$createResourceDirection$1 r0 = new com.crickpe.data.network.NetworkExtesnionKt$createResourceDirection$1
            r0.<init>(r6)
        L_0x0019:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L_0x004c
        L_0x002e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0036:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r5 = r5.invoke(r0)
            if (r5 != r1) goto L_0x0049
            return r1
        L_0x0049:
            r4 = r6
            r6 = r5
            r5 = r4
        L_0x004c:
            retrofit2.Response r6 = (retrofit2.Response) r6
            boolean r0 = r6.isSuccessful()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r6 = r6.body()
            if (r6 == 0) goto L_0x005c
            r5.element = r6
        L_0x005c:
            T r5 = r5.element
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.data.network.NetworkExtesnionKt.createResourceDirection(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r2.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0140, code lost:
        if (r9.code() == 401) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0142, code lost:
        r1 = r2.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, "message.toString()");
        r9 = new com.crickpe.data.network.Resource.Error(r1, com.crickpe.data.network.Status.UNAUTHROZIED);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0151, code lost:
        r9 = r9.message();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "response.message()");
        r9 = new com.crickpe.data.network.Resource.Error(r9, com.crickpe.data.network.Status.ERROR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0162, code lost:
        r4 = (com.crickpe.data.network.Resource) r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0139 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d9 A[Catch:{ all -> 0x0030 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> Object createResource(Function1<? super Continuation<? super retrofit2.Response<ApiResponse<T>>>, ? extends Object> r8, Continuation<? super Resource<T>> r9) {
        /*
            java.lang.String r0 = "message.toString()"
            boolean r1 = r9 instanceof com.crickpe.data.network.NetworkExtesnionKt$createResource$1
            if (r1 == 0) goto L_0x0016
            r1 = r9
            com.crickpe.data.network.NetworkExtesnionKt$createResource$1 r1 = (com.crickpe.data.network.NetworkExtesnionKt$createResource$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x0016
            int r9 = r1.label
            int r9 = r9 - r3
            r1.label = r9
            goto L_0x001b
        L_0x0016:
            com.crickpe.data.network.NetworkExtesnionKt$createResource$1 r1 = new com.crickpe.data.network.NetworkExtesnionKt$createResource$1
            r1.<init>(r9)
        L_0x001b:
            java.lang.Object r9 = r1.result
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            if (r3 == 0) goto L_0x003b
            if (r3 != r4) goto L_0x0033
            java.lang.Object r8 = r1.L$0
            kotlin.jvm.internal.Ref$ObjectRef r8 = (kotlin.jvm.internal.Ref.ObjectRef) r8
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x0030 }
            goto L_0x0051
        L_0x0030:
            r9 = move-exception
            goto L_0x016c
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x003b:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r1.L$0 = r9     // Catch:{ all -> 0x0168 }
            r1.label = r4     // Catch:{ all -> 0x0168 }
            java.lang.Object r8 = r8.invoke(r1)     // Catch:{ all -> 0x0168 }
            if (r8 != r2) goto L_0x004e
            return r2
        L_0x004e:
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x0051:
            retrofit2.Response r9 = (retrofit2.Response) r9     // Catch:{ all -> 0x0030 }
            boolean r1 = r9.isSuccessful()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x00d9
            java.lang.Object r0 = r9.body()     // Catch:{ all -> 0x0030 }
            com.crickpe.data.models.ApiResponse r0 = (com.crickpe.data.models.ApiResponse) r0     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x01c3
            int r1 = r9.code()     // Catch:{ all -> 0x0030 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 0
            if (r1 != r2) goto L_0x0094
            java.lang.Object r1 = r9.body()     // Catch:{ all -> 0x0030 }
            com.crickpe.data.models.ApiResponse r1 = (com.crickpe.data.models.ApiResponse) r1     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x007f
            java.lang.Boolean r1 = r1.getStatus()     // Catch:{ all -> 0x0030 }
            java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r4)     // Catch:{ all -> 0x0030 }
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r4)     // Catch:{ all -> 0x0030 }
            goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            if (r1 == 0) goto L_0x0094
            com.crickpe.data.network.Resource$Success r9 = new com.crickpe.data.network.Resource$Success     // Catch:{ all -> 0x0030 }
            java.lang.Object r1 = r0.getData()     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = r0.getMsg()     // Catch:{ all -> 0x0030 }
            com.crickpe.data.network.Status r2 = com.crickpe.data.network.Status.SUCCESS     // Catch:{ all -> 0x0030 }
            r9.<init>(r1, r0, r2)     // Catch:{ all -> 0x0030 }
            com.crickpe.data.network.Resource r9 = (com.crickpe.data.network.Resource) r9     // Catch:{ all -> 0x0030 }
            goto L_0x00d5
        L_0x0094:
            int r1 = r9.code()     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = "Unknown error"
            if (r1 != r2) goto L_0x00c4
            java.lang.Object r9 = r9.body()     // Catch:{ all -> 0x0030 }
            com.crickpe.data.models.ApiResponse r9 = (com.crickpe.data.models.ApiResponse) r9     // Catch:{ all -> 0x0030 }
            if (r9 == 0) goto L_0x00b0
            java.lang.Boolean r9 = r9.getStatus()     // Catch:{ all -> 0x0030 }
            java.lang.Boolean r1 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)     // Catch:{ all -> 0x0030 }
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r1)     // Catch:{ all -> 0x0030 }
        L_0x00b0:
            if (r3 == 0) goto L_0x00c4
            com.crickpe.data.network.Resource$Error r9 = new com.crickpe.data.network.Resource$Error     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = r0.getMsg()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x00bb
            goto L_0x00bc
        L_0x00bb:
            r4 = r0
        L_0x00bc:
            com.crickpe.data.network.Status r0 = com.crickpe.data.network.Status.UNAUTHROZIED     // Catch:{ all -> 0x0030 }
            r9.<init>(r4, r0)     // Catch:{ all -> 0x0030 }
            com.crickpe.data.network.Resource r9 = (com.crickpe.data.network.Resource) r9     // Catch:{ all -> 0x0030 }
            goto L_0x00d5
        L_0x00c4:
            com.crickpe.data.network.Resource$Error r9 = new com.crickpe.data.network.Resource$Error     // Catch:{ all -> 0x0030 }
            java.lang.String r0 = r0.getMsg()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x00cd
            goto L_0x00ce
        L_0x00cd:
            r4 = r0
        L_0x00ce:
            com.crickpe.data.network.Status r0 = com.crickpe.data.network.Status.ERROR     // Catch:{ all -> 0x0030 }
            r9.<init>(r4, r0)     // Catch:{ all -> 0x0030 }
            com.crickpe.data.network.Resource r9 = (com.crickpe.data.network.Resource) r9     // Catch:{ all -> 0x0030 }
        L_0x00d5:
            r8.element = r9     // Catch:{ all -> 0x0030 }
            goto L_0x01c3
        L_0x00d9:
            okhttp3.ResponseBody r1 = r9.errorBody()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x00e4
            java.lang.String r1 = r1.string()     // Catch:{ all -> 0x0030 }
            goto L_0x00e5
        L_0x00e4:
            r1 = 0
        L_0x00e5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0030 }
            r2.<init>()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x01c3
            r3 = 401(0x191, float:5.62E-43)
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0139 }
            r4.<init>((java.lang.String) r1)     // Catch:{ JSONException -> 0x0139 }
            java.lang.String r5 = "message"
            java.lang.String r4 = r4.getString(r5)     // Catch:{ JSONException -> 0x0139 }
            r2.append(r4)     // Catch:{ JSONException -> 0x0139 }
            int r4 = r9.code()     // Catch:{ JSONException -> 0x0139 }
            if (r4 != r3) goto L_0x0111
            com.crickpe.data.network.Resource$Error r4 = new com.crickpe.data.network.Resource$Error     // Catch:{ JSONException -> 0x0139 }
            java.lang.String r5 = r2.toString()     // Catch:{ JSONException -> 0x0139 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch:{ JSONException -> 0x0139 }
            com.crickpe.data.network.Status r6 = com.crickpe.data.network.Status.UNAUTHROZIED     // Catch:{ JSONException -> 0x0139 }
            r4.<init>(r5, r6)     // Catch:{ JSONException -> 0x0139 }
            goto L_0x0136
        L_0x0111:
            int r4 = r9.code()     // Catch:{ JSONException -> 0x0139 }
            r5 = 404(0x194, float:5.66E-43)
            if (r4 != r5) goto L_0x0128
            com.crickpe.data.network.Resource$Error r4 = new com.crickpe.data.network.Resource$Error     // Catch:{ JSONException -> 0x0139 }
            java.lang.String r5 = r2.toString()     // Catch:{ JSONException -> 0x0139 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch:{ JSONException -> 0x0139 }
            com.crickpe.data.network.Status r6 = com.crickpe.data.network.Status.NOTFOUND     // Catch:{ JSONException -> 0x0139 }
            r4.<init>(r5, r6)     // Catch:{ JSONException -> 0x0139 }
            goto L_0x0136
        L_0x0128:
            com.crickpe.data.network.Resource$Error r4 = new com.crickpe.data.network.Resource$Error     // Catch:{ JSONException -> 0x0139 }
            java.lang.String r5 = r2.toString()     // Catch:{ JSONException -> 0x0139 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch:{ JSONException -> 0x0139 }
            com.crickpe.data.network.Status r6 = com.crickpe.data.network.Status.ERROR     // Catch:{ JSONException -> 0x0139 }
            r4.<init>(r5, r6)     // Catch:{ JSONException -> 0x0139 }
        L_0x0136:
            com.crickpe.data.network.Resource r4 = (com.crickpe.data.network.Resource) r4     // Catch:{ JSONException -> 0x0139 }
            goto L_0x0165
        L_0x0139:
            r2.append(r1)     // Catch:{ all -> 0x0030 }
            int r1 = r9.code()     // Catch:{ all -> 0x0030 }
            if (r1 != r3) goto L_0x0151
            com.crickpe.data.network.Resource$Error r9 = new com.crickpe.data.network.Resource$Error     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0030 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch:{ all -> 0x0030 }
            com.crickpe.data.network.Status r0 = com.crickpe.data.network.Status.UNAUTHROZIED     // Catch:{ all -> 0x0030 }
            r9.<init>(r1, r0)     // Catch:{ all -> 0x0030 }
            goto L_0x0162
        L_0x0151:
            com.crickpe.data.network.Resource$Error r0 = new com.crickpe.data.network.Resource$Error     // Catch:{ all -> 0x0030 }
            java.lang.String r9 = r9.message()     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = "response.message()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r1)     // Catch:{ all -> 0x0030 }
            com.crickpe.data.network.Status r1 = com.crickpe.data.network.Status.ERROR     // Catch:{ all -> 0x0030 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x0030 }
            r9 = r0
        L_0x0162:
            r4 = r9
            com.crickpe.data.network.Resource r4 = (com.crickpe.data.network.Resource) r4     // Catch:{ all -> 0x0030 }
        L_0x0165:
            r8.element = r4     // Catch:{ all -> 0x0030 }
            goto L_0x01c3
        L_0x0168:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L_0x016c:
            r9.printStackTrace()
            boolean r0 = r9 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r0 == 0) goto L_0x017f
            com.crickpe.data.network.Resource$Error r9 = new com.crickpe.data.network.Resource$Error
            com.crickpe.data.network.Status r0 = com.crickpe.data.network.Status.ERROR
            java.lang.String r1 = "Network timeout"
            r9.<init>(r1, r0)
            com.crickpe.data.network.Resource r9 = (com.crickpe.data.network.Resource) r9
            goto L_0x01c1
        L_0x017f:
            boolean r0 = r9 instanceof java.io.IOException
            java.lang.String r1 = "Please connect to Internet!"
            if (r0 == 0) goto L_0x018f
            com.crickpe.data.network.Resource$NetworkError r9 = new com.crickpe.data.network.Resource$NetworkError
            com.crickpe.data.network.Status r0 = com.crickpe.data.network.Status.ERROR
            r9.<init>(r1, r0)
            com.crickpe.data.network.Resource r9 = (com.crickpe.data.network.Resource) r9
            goto L_0x01c1
        L_0x018f:
            boolean r0 = r9 instanceof java.net.UnknownHostException
            if (r0 == 0) goto L_0x019d
            com.crickpe.data.network.Resource$NetworkError r9 = new com.crickpe.data.network.Resource$NetworkError
            com.crickpe.data.network.Status r0 = com.crickpe.data.network.Status.ERROR
            r9.<init>(r1, r0)
            com.crickpe.data.network.Resource r9 = (com.crickpe.data.network.Resource) r9
            goto L_0x01c1
        L_0x019d:
            boolean r0 = r9 instanceof retrofit2.HttpException
            java.lang.String r1 = "Something went wrong"
            if (r0 == 0) goto L_0x01b8
            retrofit2.HttpException r9 = (retrofit2.HttpException) r9
            java.lang.String r9 = convertErrorBody(r9)
            com.crickpe.data.network.Resource$Error r0 = new com.crickpe.data.network.Resource$Error
            if (r9 != 0) goto L_0x01ae
            goto L_0x01af
        L_0x01ae:
            r1 = r9
        L_0x01af:
            com.crickpe.data.network.Status r9 = com.crickpe.data.network.Status.ERROR
            r0.<init>(r1, r9)
            r9 = r0
            com.crickpe.data.network.Resource r9 = (com.crickpe.data.network.Resource) r9
            goto L_0x01c1
        L_0x01b8:
            com.crickpe.data.network.Resource$Error r9 = new com.crickpe.data.network.Resource$Error
            com.crickpe.data.network.Status r0 = com.crickpe.data.network.Status.ERROR
            r9.<init>(r1, r0)
            com.crickpe.data.network.Resource r9 = (com.crickpe.data.network.Resource) r9
        L_0x01c1:
            r8.element = r9
        L_0x01c3:
            T r8 = r8.element
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.data.network.NetworkExtesnionKt.createResource(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final String convertErrorBody(HttpException httpException) {
        ResponseBody errorBody;
        try {
            Response<?> response = httpException.response();
            if (response == null || (errorBody = response.errorBody()) == null) {
                return null;
            }
            return errorBody.string();
        } catch (Exception unused) {
            return GenericErrors.ERROR_UNKNOWN;
        }
    }
}
