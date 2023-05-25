package com.crickpe.utils.apiHandling;

import com.crickpe.utils.recycler.AbstractModel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\f\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0007R\u0015\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\t¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/PagingResult;", "T", "Lcom/crickpe/utils/recycler/AbstractModel;", "isFirstPage", "", "result", "(ZLjava/lang/Object;)V", "()Z", "getResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ZLjava/lang/Object;)Lcom/crickpe/utils/apiHandling/PagingResult;", "equals", "other", "", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PagingResult.kt */
public final class PagingResult<T> extends AbstractModel {
    private final boolean isFirstPage;
    private final T result;

    public static /* synthetic */ PagingResult copy$default(PagingResult pagingResult, boolean z, T t, int i, Object obj) {
        if ((i & 1) != 0) {
            z = pagingResult.isFirstPage;
        }
        if ((i & 2) != 0) {
            t = pagingResult.result;
        }
        return pagingResult.copy(z, t);
    }

    public final boolean component1() {
        return this.isFirstPage;
    }

    public final T component2() {
        return this.result;
    }

    public final PagingResult<T> copy(boolean z, T t) {
        return new PagingResult<>(z, t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagingResult)) {
            return false;
        }
        PagingResult pagingResult = (PagingResult) obj;
        return this.isFirstPage == pagingResult.isFirstPage && Intrinsics.areEqual((Object) this.result, (Object) pagingResult.result);
    }

    public int hashCode() {
        boolean z = this.isFirstPage;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        T t = this.result;
        return i + (t == null ? 0 : t.hashCode());
    }

    public String toString() {
        return "PagingResult(isFirstPage=" + this.isFirstPage + ", result=" + this.result + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PagingResult(boolean z, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : obj);
    }

    public final boolean isFirstPage() {
        return this.isFirstPage;
    }

    public PagingResult(boolean z, T t) {
        this.isFirstPage = z;
        this.result = t;
    }

    public final T getResult() {
        return this.result;
    }
}
