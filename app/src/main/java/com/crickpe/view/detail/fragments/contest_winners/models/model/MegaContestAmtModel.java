package com.crickpe.view.detail.fragments.contest_winners.models.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/contest_winners/models/model/MegaContestAmtModel;", "", "_id", "", "winningAmount", "", "(Ljava/lang/String;I)V", "get_id", "()Ljava/lang/String;", "getWinningAmount", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MegaContestAmtModel.kt */
public final class MegaContestAmtModel {
    private final String _id;
    private final int winningAmount;

    public static /* synthetic */ MegaContestAmtModel copy$default(MegaContestAmtModel megaContestAmtModel, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = megaContestAmtModel._id;
        }
        if ((i2 & 2) != 0) {
            i = megaContestAmtModel.winningAmount;
        }
        return megaContestAmtModel.copy(str, i);
    }

    public final String component1() {
        return this._id;
    }

    public final int component2() {
        return this.winningAmount;
    }

    public final MegaContestAmtModel copy(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "_id");
        return new MegaContestAmtModel(str, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MegaContestAmtModel)) {
            return false;
        }
        MegaContestAmtModel megaContestAmtModel = (MegaContestAmtModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) megaContestAmtModel._id) && this.winningAmount == megaContestAmtModel.winningAmount;
    }

    public int hashCode() {
        return (this._id.hashCode() * 31) + this.winningAmount;
    }

    public String toString() {
        return "MegaContestAmtModel(_id=" + this._id + ", winningAmount=" + this.winningAmount + ')';
    }

    public MegaContestAmtModel(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "_id");
        this._id = str;
        this.winningAmount = i;
    }

    public final String get_id() {
        return this._id;
    }

    public final int getWinningAmount() {
        return this.winningAmount;
    }
}
