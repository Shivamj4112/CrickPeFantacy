package com.crickpe.base.presentation.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;

@Metadata(mo48221d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J)\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\b¨\u0006\t¸\u0006\u0000"}, mo48222d2 = {"kotlin/properties/Delegates$observable$1", "Lkotlin/properties/ObservableProperty;", "afterChange", "", "property", "Lkotlin/reflect/KProperty;", "oldValue", "newValue", "(Lkotlin/reflect/KProperty;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Delegates.kt */
public final class BaseViewModel$special$$inlined$observable$1 extends ObservableProperty<ViewState> {
    final /* synthetic */ BaseViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseViewModel$special$$inlined$observable$1(Object obj, BaseViewModel baseViewModel) {
        super(obj);
        this.this$0 = baseViewModel;
    }

    /* access modifiers changed from: protected */
    public void afterChange(KProperty<?> kProperty, ViewState viewstate, ViewState viewstate2) {
        StateTimeTravelDebugger access$getStateTimeTravelDebugger$p;
        Intrinsics.checkNotNullParameter(kProperty, "property");
        BaseViewState baseViewState = (BaseViewState) viewstate2;
        BaseViewState baseViewState2 = (BaseViewState) viewstate;
        this.this$0.stateMutableLiveData.setValue(baseViewState);
        if (!Intrinsics.areEqual((Object) baseViewState, (Object) baseViewState2) && (access$getStateTimeTravelDebugger$p = this.this$0.stateTimeTravelDebugger) != null) {
            access$getStateTimeTravelDebugger$p.addStateTransition(baseViewState2, baseViewState);
            access$getStateTimeTravelDebugger$p.logLast();
        }
    }
}
