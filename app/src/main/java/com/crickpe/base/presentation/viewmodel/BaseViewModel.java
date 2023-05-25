package com.crickpe.base.presentation.viewmodel;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.crickpe.base.presentation.extensions.MutableLiveDataExtensionKt;
import com.crickpe.base.presentation.viewmodel.BaseAction;
import com.crickpe.base.presentation.viewmodel.BaseViewState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

@Metadata(mo48221d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0002\u0010\u0007J\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u001bH\u0014J\u0015\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u001e\u001a\u00028\u0001H$¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00028\u0001¢\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR+\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u00008D@DX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, mo48222d2 = {"Lcom/crickpe/base/presentation/viewmodel/BaseViewModel;", "ViewState", "Lcom/crickpe/base/presentation/viewmodel/BaseViewState;", "ViewAction", "Lcom/crickpe/base/presentation/viewmodel/BaseAction;", "Landroidx/lifecycle/ViewModel;", "initialState", "(Lcom/crickpe/base/presentation/viewmodel/BaseViewState;)V", "isLoading", "Landroidx/databinding/ObservableBoolean;", "()Landroidx/databinding/ObservableBoolean;", "<set-?>", "state", "getState", "()Lcom/crickpe/base/presentation/viewmodel/BaseViewState;", "setState", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "stateLiveData", "Landroidx/lifecycle/LiveData;", "getStateLiveData", "()Landroidx/lifecycle/LiveData;", "stateMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "stateTimeTravelDebugger", "Lcom/crickpe/base/presentation/viewmodel/StateTimeTravelDebugger;", "loadData", "", "onLoadData", "onReduceState", "viewAction", "(Lcom/crickpe/base/presentation/viewmodel/BaseAction;)Lcom/crickpe/base/presentation/viewmodel/BaseViewState;", "sendAction", "(Lcom/crickpe/base/presentation/viewmodel/BaseAction;)V", "setIsLoading", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BaseViewModel.kt */
public abstract class BaseViewModel<ViewState extends BaseViewState, ViewAction extends BaseAction> extends ViewModel {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseViewModel.class, "state", "getState()Lcom/crickpe/base/presentation/viewmodel/BaseViewState;", 0))};
    private final ObservableBoolean isLoading = new ObservableBoolean(false);
    private final ReadWriteProperty state$delegate;
    private final LiveData<ViewState> stateLiveData;
    /* access modifiers changed from: private */
    public final MutableLiveData<ViewState> stateMutableLiveData;
    /* access modifiers changed from: private */
    public StateTimeTravelDebugger stateTimeTravelDebugger;

    /* access modifiers changed from: protected */
    public void onLoadData() {
    }

    /* access modifiers changed from: protected */
    public abstract ViewState onReduceState(ViewAction viewaction);

    public BaseViewModel(ViewState viewstate) {
        Intrinsics.checkNotNullParameter(viewstate, "initialState");
        MutableLiveData<ViewState> mutableLiveData = new MutableLiveData<>();
        this.stateMutableLiveData = mutableLiveData;
        this.stateLiveData = MutableLiveDataExtensionKt.toLiveData(mutableLiveData);
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        this.stateTimeTravelDebugger = new StateTimeTravelDebugger(simpleName);
        Delegates delegates = Delegates.INSTANCE;
        this.state$delegate = new BaseViewModel$special$$inlined$observable$1(viewstate, this);
    }

    public final LiveData<ViewState> getStateLiveData() {
        return this.stateLiveData;
    }

    public final ObservableBoolean isLoading() {
        return this.isLoading;
    }

    /* access modifiers changed from: protected */
    public final ViewState getState() {
        return (BaseViewState) this.state$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* access modifiers changed from: protected */
    public final void setState(ViewState viewstate) {
        Intrinsics.checkNotNullParameter(viewstate, "<set-?>");
        this.state$delegate.setValue(this, $$delegatedProperties[0], viewstate);
    }

    public final void sendAction(ViewAction viewaction) {
        Intrinsics.checkNotNullParameter(viewaction, "viewAction");
        StateTimeTravelDebugger stateTimeTravelDebugger2 = this.stateTimeTravelDebugger;
        if (stateTimeTravelDebugger2 != null) {
            stateTimeTravelDebugger2.addAction(viewaction);
        }
        setState(onReduceState(viewaction));
    }

    public final void loadData() {
        onLoadData();
    }

    public final void setIsLoading(boolean z) {
        this.isLoading.set(z);
    }
}
