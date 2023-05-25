package com.crickpe.view.detail.fragments.my_matches_detail;

import com.crickpe.view.detail.fragments.create_own_team.my_contest.MyContestModel;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B)\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/MyMatchDetailModel;", "", "contest", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_contest/MyContestModel;", "Lkotlin/collections/ArrayList;", "liveScore", "Lcom/crickpe/view/detail/fragments/my_matches_detail/LiveScoreModel;", "(Ljava/util/ArrayList;Lcom/crickpe/view/detail/fragments/my_matches_detail/LiveScoreModel;)V", "getContest", "()Ljava/util/ArrayList;", "getLiveScore", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/LiveScoreModel;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyMatchDetailModel.kt */
public final class MyMatchDetailModel {
    @SerializedName("contest")
    private final ArrayList<MyContestModel> contest;
    @SerializedName("liveScore")
    private final LiveScoreModel liveScore;

    public static /* synthetic */ MyMatchDetailModel copy$default(MyMatchDetailModel myMatchDetailModel, ArrayList<MyContestModel> arrayList, LiveScoreModel liveScoreModel, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = myMatchDetailModel.contest;
        }
        if ((i & 2) != 0) {
            liveScoreModel = myMatchDetailModel.liveScore;
        }
        return myMatchDetailModel.copy(arrayList, liveScoreModel);
    }

    public final ArrayList<MyContestModel> component1() {
        return this.contest;
    }

    public final LiveScoreModel component2() {
        return this.liveScore;
    }

    public final MyMatchDetailModel copy(ArrayList<MyContestModel> arrayList, LiveScoreModel liveScoreModel) {
        Intrinsics.checkNotNullParameter(arrayList, "contest");
        return new MyMatchDetailModel(arrayList, liveScoreModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyMatchDetailModel)) {
            return false;
        }
        MyMatchDetailModel myMatchDetailModel = (MyMatchDetailModel) obj;
        return Intrinsics.areEqual((Object) this.contest, (Object) myMatchDetailModel.contest) && Intrinsics.areEqual((Object) this.liveScore, (Object) myMatchDetailModel.liveScore);
    }

    public int hashCode() {
        int hashCode = this.contest.hashCode() * 31;
        LiveScoreModel liveScoreModel = this.liveScore;
        return hashCode + (liveScoreModel == null ? 0 : liveScoreModel.hashCode());
    }

    public String toString() {
        return "MyMatchDetailModel(contest=" + this.contest + ", liveScore=" + this.liveScore + ')';
    }

    public MyMatchDetailModel(ArrayList<MyContestModel> arrayList, LiveScoreModel liveScoreModel) {
        Intrinsics.checkNotNullParameter(arrayList, "contest");
        this.contest = arrayList;
        this.liveScore = liveScoreModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MyMatchDetailModel(ArrayList arrayList, LiveScoreModel liveScoreModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, (i & 2) != 0 ? null : liveScoreModel);
    }

    public final ArrayList<MyContestModel> getContest() {
        return this.contest;
    }

    public final LiveScoreModel getLiveScore() {
        return this.liveScore;
    }
}
