package com.crickpe.datastore;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DataStoreModule_GetDataStoreFactory implements Factory<DataStore<Preferences>> {
    private final Provider<Context> contextProvider;
    private final DataStoreModule module;

    public DataStoreModule_GetDataStoreFactory(DataStoreModule dataStoreModule, Provider<Context> provider) {
        this.module = dataStoreModule;
        this.contextProvider = provider;
    }

    public DataStore<Preferences> get() {
        return getDataStore(this.module, this.contextProvider.get());
    }

    public static DataStoreModule_GetDataStoreFactory create(DataStoreModule dataStoreModule, Provider<Context> provider) {
        return new DataStoreModule_GetDataStoreFactory(dataStoreModule, provider);
    }

    public static DataStore<Preferences> getDataStore(DataStoreModule dataStoreModule, Context context) {
        return (DataStore) Preconditions.checkNotNullFromProvides(dataStoreModule.getDataStore(context));
    }
}
