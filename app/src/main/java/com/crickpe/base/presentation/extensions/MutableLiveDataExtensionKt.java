package com.crickpe.base.presentation.extensions;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003¨\u0006\u0004"}, mo48222d2 = {"toLiveData", "Landroidx/lifecycle/LiveData;", "T", "Landroidx/lifecycle/MutableLiveData;", "app_release"}, mo48223k = 2, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MutableLiveDataExtension.kt */
public final class MutableLiveDataExtensionKt {
    public static final <T> LiveData<T> toLiveData(MutableLiveData<T> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<this>");
        return mutableLiveData;
    }
}
