package com.crickpe.view.detail.fragments.contest_winners.models.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_winners/models/model/WinnerFilter;", "", "filterId", "", "filterName", "", "isSelected", "", "(ILjava/lang/String;Z)V", "getFilterId", "()I", "getFilterName", "()Ljava/lang/String;", "()Z", "setSelected", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WinnerFilter.kt */
public final class WinnerFilter {
    private final int filterId;
    private final String filterName;
    private boolean isSelected;

    public static /* synthetic */ WinnerFilter copy$default(WinnerFilter winnerFilter, int i, String str, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = winnerFilter.filterId;
        }
        if ((i2 & 2) != 0) {
            str = winnerFilter.filterName;
        }
        if ((i2 & 4) != 0) {
            z = winnerFilter.isSelected;
        }
        return winnerFilter.copy(i, str, z);
    }

    public final int component1() {
        return this.filterId;
    }

    public final String component2() {
        return this.filterName;
    }

    public final boolean component3() {
        return this.isSelected;
    }

    public final WinnerFilter copy(int i, String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "filterName");
        return new WinnerFilter(i, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WinnerFilter)) {
            return false;
        }
        WinnerFilter winnerFilter = (WinnerFilter) obj;
        return this.filterId == winnerFilter.filterId && Intrinsics.areEqual((Object) this.filterName, (Object) winnerFilter.filterName) && this.isSelected == winnerFilter.isSelected;
    }

    public int hashCode() {
        int hashCode = ((this.filterId * 31) + this.filterName.hashCode()) * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "WinnerFilter(filterId=" + this.filterId + ", filterName=" + this.filterName + ", isSelected=" + this.isSelected + ')';
    }

    public WinnerFilter(int i, String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "filterName");
        this.filterId = i;
        this.filterName = str;
        this.isSelected = z;
    }

    public final int getFilterId() {
        return this.filterId;
    }

    public final String getFilterName() {
        return this.filterName;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
