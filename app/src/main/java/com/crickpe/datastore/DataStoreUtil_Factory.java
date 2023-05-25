package com.crickpe.datastore;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineExceptionHandler;

public final class DataStoreUtil_Factory implements Factory<DataStoreUtil> {
    private final Provider<CoroutineExceptionHandler> coRoutineExceptionHandlerProvider;
    private final Provider<DataStore<Preferences>> dataStoreProvider;

    public DataStoreUtil_Factory(Provider<DataStore<Preferences>> provider, Provider<CoroutineExceptionHandler> provider2) {
        this.dataStoreProvider = provider;
        this.coRoutineExceptionHandlerProvider = provider2;
    }

    public DataStoreUtil get() {
        return newInstance(this.dataStoreProvider.get(), this.coRoutineExceptionHandlerProvider.get());
    }

    public static DataStoreUtil_Factory create(Provider<DataStore<Preferences>> provider, Provider<CoroutineExceptionHandler> provider2) {
        return new DataStoreUtil_Factory(provider, provider2);
    }

    public static DataStoreUtil newInstance(DataStore<Preferences> dataStore, CoroutineExceptionHandler coroutineExceptionHandler) {
        return new DataStoreUtil(dataStore, coroutineExceptionHandler);
    }
}
