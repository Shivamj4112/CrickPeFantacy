package com.crickpe.base.presentation.fragment;

import androidx.databinding.ViewDataBinding;
import com.crickpe.data.AppDataManager;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class BaseContainerFragment_MembersInjector<T extends ViewDataBinding> implements MembersInjector<BaseContainerFragment<T>> {
    private final Provider<AppDataManager> appDataManagerProvider;

    public BaseContainerFragment_MembersInjector(Provider<AppDataManager> provider) {
        this.appDataManagerProvider = provider;
    }

    public static <T extends ViewDataBinding> MembersInjector<BaseContainerFragment<T>> create(Provider<AppDataManager> provider) {
        return new BaseContainerFragment_MembersInjector(provider);
    }

    public void injectMembers(BaseContainerFragment<T> baseContainerFragment) {
        injectAppDataManager(baseContainerFragment, this.appDataManagerProvider.get());
    }

    public static <T extends ViewDataBinding> void injectAppDataManager(BaseContainerFragment<T> baseContainerFragment, AppDataManager appDataManager) {
        baseContainerFragment.appDataManager = appDataManager;
    }
}
