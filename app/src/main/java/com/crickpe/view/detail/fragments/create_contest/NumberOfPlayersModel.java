package com.crickpe.view.detail.fragments.create_contest;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0014"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/NumberOfPlayersModel;", "", "count", "", "isSelected", "", "(IZ)V", "getCount", "()I", "()Z", "setSelected", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: NumberOfPlayerModel.kt */
public final class NumberOfPlayersModel {
    @SerializedName("count")
    private final int count;
    @SerializedName("isSelected")
    private boolean isSelected;

    public static /* synthetic */ NumberOfPlayersModel copy$default(NumberOfPlayersModel numberOfPlayersModel, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = numberOfPlayersModel.count;
        }
        if ((i2 & 2) != 0) {
            z = numberOfPlayersModel.isSelected;
        }
        return numberOfPlayersModel.copy(i, z);
    }

    public final int component1() {
        return this.count;
    }

    public final boolean component2() {
        return this.isSelected;
    }

    public final NumberOfPlayersModel copy(int i, boolean z) {
        return new NumberOfPlayersModel(i, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NumberOfPlayersModel)) {
            return false;
        }
        NumberOfPlayersModel numberOfPlayersModel = (NumberOfPlayersModel) obj;
        return this.count == numberOfPlayersModel.count && this.isSelected == numberOfPlayersModel.isSelected;
    }

    public int hashCode() {
        int i = this.count * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return i + (z ? 1 : 0);
    }

    public String toString() {
        return "NumberOfPlayersModel(count=" + this.count + ", isSelected=" + this.isSelected + ')';
    }

    public NumberOfPlayersModel(int i, boolean z) {
        this.count = i;
        this.isSelected = z;
    }

    public final int getCount() {
        return this.count;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
