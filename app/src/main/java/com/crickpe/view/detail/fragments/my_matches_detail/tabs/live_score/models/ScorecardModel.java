package com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0006HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\""}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/ScorecardModel;", "", "_id", "", "matchId", "__v", "", "createdAt", "inningsArr", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/InningsArr;", "updatedAt", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getCreatedAt", "getInningsArr", "()Ljava/util/ArrayList;", "getMatchId", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ScorecardModel.kt */
public final class ScorecardModel {
    private final int __v;
    private final String _id;
    private final String createdAt;
    private final ArrayList<InningsArr> inningsArr;
    private final String matchId;
    private final String updatedAt;

    public static /* synthetic */ ScorecardModel copy$default(ScorecardModel scorecardModel, String str, String str2, int i, String str3, ArrayList<InningsArr> arrayList, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = scorecardModel._id;
        }
        if ((i2 & 2) != 0) {
            str2 = scorecardModel.matchId;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            i = scorecardModel.__v;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str3 = scorecardModel.createdAt;
        }
        String str6 = str3;
        if ((i2 & 16) != 0) {
            arrayList = scorecardModel.inningsArr;
        }
        ArrayList<InningsArr> arrayList2 = arrayList;
        if ((i2 & 32) != 0) {
            str4 = scorecardModel.updatedAt;
        }
        return scorecardModel.copy(str, str5, i3, str6, arrayList2, str4);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.matchId;
    }

    public final int component3() {
        return this.__v;
    }

    public final String component4() {
        return this.createdAt;
    }

    public final ArrayList<InningsArr> component5() {
        return this.inningsArr;
    }

    public final String component6() {
        return this.updatedAt;
    }

    public final ScorecardModel copy(String str, String str2, int i, String str3, ArrayList<InningsArr> arrayList, String str4) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(str3, "createdAt");
        Intrinsics.checkNotNullParameter(arrayList, "inningsArr");
        Intrinsics.checkNotNullParameter(str4, "updatedAt");
        return new ScorecardModel(str, str2, i, str3, arrayList, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScorecardModel)) {
            return false;
        }
        ScorecardModel scorecardModel = (ScorecardModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) scorecardModel._id) && Intrinsics.areEqual((Object) this.matchId, (Object) scorecardModel.matchId) && this.__v == scorecardModel.__v && Intrinsics.areEqual((Object) this.createdAt, (Object) scorecardModel.createdAt) && Intrinsics.areEqual((Object) this.inningsArr, (Object) scorecardModel.inningsArr) && Intrinsics.areEqual((Object) this.updatedAt, (Object) scorecardModel.updatedAt);
    }

    public int hashCode() {
        return (((((((((this._id.hashCode() * 31) + this.matchId.hashCode()) * 31) + this.__v) * 31) + this.createdAt.hashCode()) * 31) + this.inningsArr.hashCode()) * 31) + this.updatedAt.hashCode();
    }

    public String toString() {
        return "ScorecardModel(_id=" + this._id + ", matchId=" + this.matchId + ", __v=" + this.__v + ", createdAt=" + this.createdAt + ", inningsArr=" + this.inningsArr + ", updatedAt=" + this.updatedAt + ')';
    }

    public ScorecardModel(String str, String str2, int i, String str3, ArrayList<InningsArr> arrayList, String str4) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(str3, "createdAt");
        Intrinsics.checkNotNullParameter(arrayList, "inningsArr");
        Intrinsics.checkNotNullParameter(str4, "updatedAt");
        this._id = str;
        this.matchId = str2;
        this.__v = i;
        this.createdAt = str3;
        this.inningsArr = arrayList;
        this.updatedAt = str4;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final int get__v() {
        return this.__v;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final ArrayList<InningsArr> getInningsArr() {
        return this.inningsArr;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }
}
