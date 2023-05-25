package com.crickpe.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;

@Metadata(mo48221d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bJ0\u0010\r\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0012\u0004\u0012\u00020\t0\u000bJ>\u0010\u0011\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00142\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0012\u0004\u0012\u00020\t0\u000bJ.\u0010\u0015\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bJ'\u0010\u0017\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00102\u0006\u0010\u0018\u001a\u0002H\u000e¢\u0006\u0002\u0010\u0019J'\u0010\u001a\u001a\u00020\t\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0018\u001a\u0002H\u000e¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/datastore/DataStoreUtil;", "", "dataStore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "coRoutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "(Landroidx/datastore/core/DataStore;Lkotlinx/coroutines/CoroutineExceptionHandler;)V", "clearDataStore", "", "valueIs", "Lkotlin/Function1;", "", "readData", "T", "key", "Landroidx/datastore/preferences/core/Preferences$Key;", "readObject", "", "clazz", "Ljava/lang/Class;", "removeKey", "onRemove", "saveData", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "saveObject", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: DataStoreUtil.kt */
public class DataStoreUtil {
    private final CoroutineExceptionHandler coRoutineExceptionHandler;
    /* access modifiers changed from: private */
    public final DataStore<Preferences> dataStore;

    @Inject
    public DataStoreUtil(DataStore<Preferences> dataStore2, CoroutineExceptionHandler coroutineExceptionHandler) {
        Intrinsics.checkNotNullParameter(dataStore2, "dataStore");
        Intrinsics.checkNotNullParameter(coroutineExceptionHandler, "coRoutineExceptionHandler");
        this.dataStore = dataStore2;
        this.coRoutineExceptionHandler = coroutineExceptionHandler;
    }

    public final <T> void saveData(Preferences.Key<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(this.coRoutineExceptionHandler)), (CoroutineContext) null, (CoroutineStart) null, new DataStoreUtil$saveData$1(this, key, t, (Continuation<? super DataStoreUtil$saveData$1>) null), 3, (Object) null);
    }

    public final <T> void readData(Preferences.Key<T> key, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(function1, "valueIs");
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(this.coRoutineExceptionHandler)), (CoroutineContext) null, (CoroutineStart) null, new DataStoreUtil$readData$1(this, function1, key, (Continuation<? super DataStoreUtil$readData$1>) null), 3, (Object) null);
    }

    public final <T> void saveObject(Preferences.Key<String> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(this.coRoutineExceptionHandler)), (CoroutineContext) null, (CoroutineStart) null, new DataStoreUtil$saveObject$1(this, key, t, (Continuation<? super DataStoreUtil$saveObject$1>) null), 3, (Object) null);
    }

    public final <T> void readObject(Preferences.Key<String> key, Class<T> cls, Function1<? super T, Unit> function1) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(cls, "clazz");
        Intrinsics.checkNotNullParameter(function1, "valueIs");
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(this.coRoutineExceptionHandler)), (CoroutineContext) null, (CoroutineStart) null, new DataStoreUtil$readObject$1(this, function1, key, cls, (Continuation<? super DataStoreUtil$readObject$1>) null), 3, (Object) null);
    }

    public final void clearDataStore(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "valueIs");
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(this.coRoutineExceptionHandler)), (CoroutineContext) null, (CoroutineStart) null, new DataStoreUtil$clearDataStore$1(this, function1, (Continuation<? super DataStoreUtil$clearDataStore$1>) null), 3, (Object) null);
    }

    public final <T> void removeKey(Preferences.Key<T> key, Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(function1, "onRemove");
        Job unused = BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO().plus(this.coRoutineExceptionHandler)), (CoroutineContext) null, (CoroutineStart) null, new DataStoreUtil$removeKey$1(this, key, function1, (Continuation<? super DataStoreUtil$removeKey$1>) null), 3, (Object) null);
    }
}
