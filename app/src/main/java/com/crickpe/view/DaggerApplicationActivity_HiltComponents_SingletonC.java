package com.crickpe.view;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.crickpe.datastore.DataStoreModule;
import com.crickpe.p015di.NetworkModule;
import com.crickpe.p015di.ProductionModule;
import com.crickpe.view.ApplicationActivity_HiltComponents;
import com.crickpe.view.detail.DetailActivity;
import dagger.hilt.android.ActivityRetainedLifecycle;
import dagger.hilt.android.flags.HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewModelComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories;
import dagger.hilt.android.internal.lifecycle.DefaultViewModelFactories_InternalFactoryFactory_Factory;
import dagger.hilt.android.internal.managers.ActivityRetainedComponentManager_Lifecycle_Factory;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import javax.inject.Provider;

public final class DaggerApplicationActivity_HiltComponents_SingletonC {
    private DaggerApplicationActivity_HiltComponents_SingletonC() {
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private ApplicationContextModule applicationContextModule;

        private Builder() {
        }

        public Builder applicationContextModule(ApplicationContextModule applicationContextModule2) {
            this.applicationContextModule = (ApplicationContextModule) Preconditions.checkNotNull(applicationContextModule2);
            return this;
        }

        @Deprecated
        public Builder dataStoreModule(DataStoreModule dataStoreModule) {
            Preconditions.checkNotNull(dataStoreModule);
            return this;
        }

        @Deprecated
        public Builder hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule(HiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule) {
            Preconditions.checkNotNull(hiltWrapper_FragmentGetContextFix_FragmentGetContextFixModule);
            return this;
        }

        @Deprecated
        public Builder networkModule(NetworkModule networkModule) {
            Preconditions.checkNotNull(networkModule);
            return this;
        }

        @Deprecated
        public Builder productionModule(ProductionModule productionModule) {
            Preconditions.checkNotNull(productionModule);
            return this;
        }

        public ApplicationActivity_HiltComponents.SingletonC build() {
            Preconditions.checkBuilderRequirement(this.applicationContextModule, ApplicationContextModule.class);
            return new SingletonCImpl(this.applicationContextModule);
        }
    }

    private static final class ActivityRetainedCBuilder implements ApplicationActivity_HiltComponents.ActivityRetainedC.Builder {
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCBuilder(SingletonCImpl singletonCImpl2) {
            this.singletonCImpl = singletonCImpl2;
        }

        public ApplicationActivity_HiltComponents.ActivityRetainedC build() {
            return new ActivityRetainedCImpl(this.singletonCImpl);
        }
    }

    private static final class ActivityCBuilder implements ApplicationActivity_HiltComponents.ActivityC.Builder {
        private Activity activity;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        private ActivityCBuilder(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2) {
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public ActivityCBuilder activity(Activity activity2) {
            this.activity = (Activity) Preconditions.checkNotNull(activity2);
            return this;
        }

        public ApplicationActivity_HiltComponents.ActivityC build() {
            Preconditions.checkBuilderRequirement(this.activity, Activity.class);
            return new ActivityCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activity);
        }
    }

    private static final class FragmentCBuilder implements ApplicationActivity_HiltComponents.FragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Fragment fragment;
        private final SingletonCImpl singletonCImpl;

        private FragmentCBuilder(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2) {
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
        }

        public FragmentCBuilder fragment(Fragment fragment2) {
            this.fragment = (Fragment) Preconditions.checkNotNull(fragment2);
            return this;
        }

        public ApplicationActivity_HiltComponents.FragmentC build() {
            Preconditions.checkBuilderRequirement(this.fragment, Fragment.class);
            return new FragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragment);
        }
    }

    private static final class ViewWithFragmentCBuilder implements ApplicationActivity_HiltComponents.ViewWithFragmentC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewWithFragmentCBuilder(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2, FragmentCImpl fragmentCImpl2) {
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
            this.fragmentCImpl = fragmentCImpl2;
        }

        public ViewWithFragmentCBuilder view(View view2) {
            this.view = (View) Preconditions.checkNotNull(view2);
            return this;
        }

        public ApplicationActivity_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewWithFragmentCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl, this.view);
        }
    }

    private static final class ViewCBuilder implements ApplicationActivity_HiltComponents.ViewC.Builder {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private View view;

        private ViewCBuilder(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2) {
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
        }

        public ViewCBuilder view(View view2) {
            this.view = (View) Preconditions.checkNotNull(view2);
            return this;
        }

        public ApplicationActivity_HiltComponents.ViewC build() {
            Preconditions.checkBuilderRequirement(this.view, View.class);
            return new ViewCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.view);
        }
    }

    private static final class ViewModelCBuilder implements ApplicationActivity_HiltComponents.ViewModelC.Builder {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private SavedStateHandle savedStateHandle;
        private final SingletonCImpl singletonCImpl;

        private ViewModelCBuilder(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2) {
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public ViewModelCBuilder savedStateHandle(SavedStateHandle savedStateHandle2) {
            this.savedStateHandle = (SavedStateHandle) Preconditions.checkNotNull(savedStateHandle2);
            return this;
        }

        public ApplicationActivity_HiltComponents.ViewModelC build() {
            Preconditions.checkBuilderRequirement(this.savedStateHandle, SavedStateHandle.class);
            return new ViewModelCImpl(this.singletonCImpl, this.activityRetainedCImpl, this.savedStateHandle);
        }
    }

    private static final class ServiceCBuilder implements ApplicationActivity_HiltComponents.ServiceC.Builder {
        private Service service;
        private final SingletonCImpl singletonCImpl;

        private ServiceCBuilder(SingletonCImpl singletonCImpl2) {
            this.singletonCImpl = singletonCImpl2;
        }

        public ServiceCBuilder service(Service service2) {
            this.service = (Service) Preconditions.checkNotNull(service2);
            return this;
        }

        public ApplicationActivity_HiltComponents.ServiceC build() {
            Preconditions.checkBuilderRequirement(this.service, Service.class);
            return new ServiceCImpl(this.singletonCImpl, this.service);
        }
    }

    private static final class ViewWithFragmentCImpl extends ApplicationActivity_HiltComponents.ViewWithFragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewWithFragmentCImpl viewWithFragmentCImpl;

        private ViewWithFragmentCImpl(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2, FragmentCImpl fragmentCImpl2, View view) {
            this.viewWithFragmentCImpl = this;
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
            this.fragmentCImpl = fragmentCImpl2;
        }
    }

    private static final class FragmentCImpl extends ApplicationActivity_HiltComponents.FragmentC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final FragmentCImpl fragmentCImpl;
        private final SingletonCImpl singletonCImpl;

        private FragmentCImpl(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2, Fragment fragment) {
            this.fragmentCImpl = this;
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
        }

        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return this.activityCImpl.getHiltInternalFactoryFactory();
        }

        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
            return new ViewWithFragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl, this.fragmentCImpl);
        }
    }

    private static final class ViewCImpl extends ApplicationActivity_HiltComponents.ViewC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewCImpl viewCImpl;

        private ViewCImpl(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, ActivityCImpl activityCImpl2, View view) {
            this.viewCImpl = this;
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
            this.activityCImpl = activityCImpl2;
        }
    }

    private static final class ActivityCImpl extends ApplicationActivity_HiltComponents.ActivityC {
        private final ActivityCImpl activityCImpl;
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;

        public void injectDetailActivity(DetailActivity detailActivity) {
        }

        private ActivityCImpl(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, Activity activity) {
            this.activityCImpl = this;
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public DefaultViewModelFactories.InternalFactoryFactory getHiltInternalFactoryFactory() {
            return DefaultViewModelFactories_InternalFactoryFactory_Factory.newInstance(ApplicationContextModule_ProvideApplicationFactory.provideApplication(this.singletonCImpl.applicationContextModule), Collections.emptySet(), new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl));
        }

        public Set<String> getViewModelKeys() {
            return Collections.emptySet();
        }

        public ViewModelComponentBuilder getViewModelComponentBuilder() {
            return new ViewModelCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        public FragmentComponentBuilder fragmentComponentBuilder() {
            return new FragmentCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }

        public ViewComponentBuilder viewComponentBuilder() {
            return new ViewCBuilder(this.singletonCImpl, this.activityRetainedCImpl, this.activityCImpl);
        }
    }

    private static final class ViewModelCImpl extends ApplicationActivity_HiltComponents.ViewModelC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private final SingletonCImpl singletonCImpl;
        private final ViewModelCImpl viewModelCImpl;

        private ViewModelCImpl(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, SavedStateHandle savedStateHandle) {
            this.viewModelCImpl = this;
            this.singletonCImpl = singletonCImpl2;
            this.activityRetainedCImpl = activityRetainedCImpl2;
        }

        public Map<String, Provider<ViewModel>> getHiltViewModelMap() {
            return Collections.emptyMap();
        }
    }

    private static final class ActivityRetainedCImpl extends ApplicationActivity_HiltComponents.ActivityRetainedC {
        private final ActivityRetainedCImpl activityRetainedCImpl;
        private Provider lifecycleProvider;
        private final SingletonCImpl singletonCImpl;

        private ActivityRetainedCImpl(SingletonCImpl singletonCImpl2) {
            this.activityRetainedCImpl = this;
            this.singletonCImpl = singletonCImpl2;
            initialize();
        }

        private void initialize() {
            this.lifecycleProvider = DoubleCheck.provider(new SwitchingProvider(this.singletonCImpl, this.activityRetainedCImpl, 0));
        }

        public ActivityComponentBuilder activityComponentBuilder() {
            return new ActivityCBuilder(this.singletonCImpl, this.activityRetainedCImpl);
        }

        public ActivityRetainedLifecycle getActivityRetainedLifecycle() {
            return (ActivityRetainedLifecycle) this.lifecycleProvider.get();
        }

        private static final class SwitchingProvider<T> implements Provider<T> {
            private final ActivityRetainedCImpl activityRetainedCImpl;

            /* renamed from: id */
            private final int f464id;
            private final SingletonCImpl singletonCImpl;

            SwitchingProvider(SingletonCImpl singletonCImpl2, ActivityRetainedCImpl activityRetainedCImpl2, int i) {
                this.singletonCImpl = singletonCImpl2;
                this.activityRetainedCImpl = activityRetainedCImpl2;
                this.f464id = i;
            }

            public T get() {
                if (this.f464id == 0) {
                    return ActivityRetainedComponentManager_Lifecycle_Factory.newInstance();
                }
                throw new AssertionError(this.f464id);
            }
        }
    }

    private static final class ServiceCImpl extends ApplicationActivity_HiltComponents.ServiceC {
        private final ServiceCImpl serviceCImpl;
        private final SingletonCImpl singletonCImpl;

        private ServiceCImpl(SingletonCImpl singletonCImpl2, Service service) {
            this.serviceCImpl = this;
            this.singletonCImpl = singletonCImpl2;
        }
    }

    private static final class SingletonCImpl extends ApplicationActivity_HiltComponents.SingletonC {
        /* access modifiers changed from: private */
        public final ApplicationContextModule applicationContextModule;
        private final SingletonCImpl singletonCImpl;

        public void injectApplicationActivity(ApplicationActivity applicationActivity) {
        }

        private SingletonCImpl(ApplicationContextModule applicationContextModule2) {
            this.singletonCImpl = this;
            this.applicationContextModule = applicationContextModule2;
        }

        public Set<Boolean> getDisableFragmentGetContextFix() {
            return Collections.emptySet();
        }

        public ActivityRetainedComponentBuilder retainedComponentBuilder() {
            return new ActivityRetainedCBuilder(this.singletonCImpl);
        }

        public ServiceComponentBuilder serviceComponentBuilder() {
            return new ServiceCBuilder(this.singletonCImpl);
        }
    }
}
