package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestDetailModel;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "contest", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "joined", "", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Joined;", "match", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;", "(Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;Ljava/util/List;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;)V", "getContest", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "getJoined", "()Ljava/util/List;", "getMatch", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestDetailModel.kt */
public final class ContestDetailModel extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<ContestDetailModel> CREATOR = new Creator();
    @SerializedName("contest")
    private final Contest contest;
    @SerializedName("joined")
    private final List<Joined> joined;
    @SerializedName("match")
    private final Match match;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestDetailModel.kt */
    public static final class Creator implements Parcelable.Creator<ContestDetailModel> {
        public final ContestDetailModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Contest createFromParcel = Contest.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Joined.CREATOR.createFromParcel(parcel));
            }
            return new ContestDetailModel(createFromParcel, arrayList, Match.CREATOR.createFromParcel(parcel));
        }

        public final ContestDetailModel[] newArray(int i) {
            return new ContestDetailModel[i];
        }
    }

    public static /* synthetic */ ContestDetailModel copy$default(ContestDetailModel contestDetailModel, Contest contest2, List<Joined> list, Match match2, int i, Object obj) {
        if ((i & 1) != 0) {
            contest2 = contestDetailModel.contest;
        }
        if ((i & 2) != 0) {
            list = contestDetailModel.joined;
        }
        if ((i & 4) != 0) {
            match2 = contestDetailModel.match;
        }
        return contestDetailModel.copy(contest2, list, match2);
    }

    public final Contest component1() {
        return this.contest;
    }

    public final List<Joined> component2() {
        return this.joined;
    }

    public final Match component3() {
        return this.match;
    }

    public final ContestDetailModel copy(Contest contest2, List<Joined> list, Match match2) {
        Intrinsics.checkNotNullParameter(contest2, "contest");
        Intrinsics.checkNotNullParameter(list, "joined");
        Intrinsics.checkNotNullParameter(match2, "match");
        return new ContestDetailModel(contest2, list, match2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContestDetailModel)) {
            return false;
        }
        ContestDetailModel contestDetailModel = (ContestDetailModel) obj;
        return Intrinsics.areEqual((Object) this.contest, (Object) contestDetailModel.contest) && Intrinsics.areEqual((Object) this.joined, (Object) contestDetailModel.joined) && Intrinsics.areEqual((Object) this.match, (Object) contestDetailModel.match);
    }

    public int hashCode() {
        return (((this.contest.hashCode() * 31) + this.joined.hashCode()) * 31) + this.match.hashCode();
    }

    public String toString() {
        return "ContestDetailModel(contest=" + this.contest + ", joined=" + this.joined + ", match=" + this.match + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.contest.writeToParcel(parcel, i);
        List<Joined> list = this.joined;
        parcel.writeInt(list.size());
        for (Joined writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        this.match.writeToParcel(parcel, i);
    }

    public final Contest getContest() {
        return this.contest;
    }

    public final List<Joined> getJoined() {
        return this.joined;
    }

    public final Match getMatch() {
        return this.match;
    }

    public ContestDetailModel(Contest contest2, List<Joined> list, Match match2) {
        Intrinsics.checkNotNullParameter(contest2, "contest");
        Intrinsics.checkNotNullParameter(list, "joined");
        Intrinsics.checkNotNullParameter(match2, "match");
        this.contest = contest2;
        this.joined = list;
        this.match = match2;
    }
}
