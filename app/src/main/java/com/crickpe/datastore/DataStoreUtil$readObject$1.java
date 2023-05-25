package com.crickpe.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(mo48221d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H@"}, mo48222d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
@DebugMetadata(mo48885c = "com.crickpe.datastore.DataStoreUtil$readObject$1", mo48886f = "DataStoreUtil.kt", mo48887i = {}, mo48888l = {47}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
/* compiled from: DataStoreUtil.kt */
final class DataStoreUtil$readObject$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Class<T> $clazz;
    final /* synthetic */ Preferences.Key<String> $key;
    final /* synthetic */ Function1<T, Unit> $valueIs;
    int label;
    final /* synthetic */ DataStoreUtil this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DataStoreUtil$readObject$1(DataStoreUtil dataStoreUtil, Function1<? super T, Unit> function1, Preferences.Key<String> key, Class<T> cls, Continuation<? super DataStoreUtil$readObject$1> continuation) {
        super(2, continuation);
        this.this$0 = dataStoreUtil;
        this.$valueIs = function1;
        this.$key = key;
        this.$clazz = cls;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DataStoreUtil$readObject$1(this.this$0, this.$valueIs, this.$key, this.$clazz, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DataStoreUtil$readObject$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Metadata(mo48221d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H@"}, mo48222d2 = {"<anonymous>", "", "T", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    @DebugMetadata(mo48885c = "com.crickpe.datastore.DataStoreUtil$readObject$1$1", mo48886f = "DataStoreUtil.kt", mo48887i = {}, mo48888l = {}, mo48889m = "invokeSuspend", mo48890n = {}, mo48891s = {})
    /* renamed from: com.crickpe.datastore.DataStoreUtil$readObject$1$1 */
    /* compiled from: DataStoreUtil.kt */
    static final class C12041 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C12041 r0 = new C12041(function1, key, cls, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((C12041) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                final MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
                CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
                final Function1<T, Unit> function1 = function1;
                final Preferences.Key<String> key = key;
                final Class<T> cls = cls;
                Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScope, (CoroutineContext) null, (CoroutineStart) null, new Function2<CoroutineScope, Continuation<? super Unit>, Object>((Continuation<? super C12051>) null) {
                    int label;

                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return 

                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i = this.label;
                            if (i == 0) {
                                ResultKt.throwOnFailure(obj);
                                DataStore access$getDataStore$p = this.this$0.dataStore;
                                final Function1<T, Unit> function1 = this.$valueIs;
                                final Preferences.Key<String> key = this.$key;
                                final Class<T> cls = this.$clazz;
                                this.label = 1;
                                if (PreferencesKt.edit(access$getDataStore$p, new C12041((Continuation<? super C12041>) null), this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else if (i == 1) {
                                ResultKt.throwOnFailure(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            return Unit.INSTANCE;
                        }
                    }
