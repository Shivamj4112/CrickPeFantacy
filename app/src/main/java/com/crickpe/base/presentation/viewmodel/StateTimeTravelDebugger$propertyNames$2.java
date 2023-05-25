package com.crickpe.base.presentation.viewmodel;

import com.crickpe.base.presentation.viewmodel.StateTimeTravelDebugger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KProperty1;
import kotlin.reflect.full.KClasses;

@Metadata(mo48221d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, mo48222d2 = {"<anonymous>", "", "", "invoke"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: StateTimeTravelDebugger.kt */
final class StateTimeTravelDebugger$propertyNames$2 extends Lambda implements Function0<List<? extends String>> {
    final /* synthetic */ StateTimeTravelDebugger this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StateTimeTravelDebugger$propertyNames$2(StateTimeTravelDebugger stateTimeTravelDebugger) {
        super(0);
        this.this$0 = stateTimeTravelDebugger;
    }

    public final List<String> invoke() {
        Iterable<KProperty1> memberProperties = KClasses.getMemberProperties(JvmClassMappingKt.getKotlinClass(((StateTimeTravelDebugger.StateTransition) CollectionsKt.first(this.this$0.stateTimeline)).getOldState().getClass()));
        Collection arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(memberProperties, 10));
        for (KProperty1 name : memberProperties) {
            arrayList.add(name.getName());
        }
        return (List) arrayList;
    }
}
