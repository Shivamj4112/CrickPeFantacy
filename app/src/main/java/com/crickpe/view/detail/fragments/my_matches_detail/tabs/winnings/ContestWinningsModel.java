package com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0019\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u001e"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/winnings/ContestWinningsModel;", "Landroid/os/Parcelable;", "contest", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "winning", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/winnings/Winning;", "Lkotlin/collections/ArrayList;", "(Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;Ljava/util/ArrayList;)V", "getContest", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "getWinning", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestWinningsModel.kt */
public final class ContestWinningsModel implements Parcelable {
    public static final Parcelable.Creator<ContestWinningsModel> CREATOR = new Creator();
    @SerializedName("contest")
    private final Contest contest;
    @SerializedName("winning")
    private final ArrayList<Winning> winning;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestWinningsModel.kt */
    public static final class Creator implements Parcelable.Creator<ContestWinningsModel> {
        public final ContestWinningsModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Contest createFromParcel = Contest.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Winning.CREATOR.createFromParcel(parcel));
            }
            return new ContestWinningsModel(createFromParcel, arrayList);
        }

        public final ContestWinningsModel[] newArray(int i) {
            return new ContestWinningsModel[i];
        }
    }

    public static /* synthetic */ ContestWinningsModel copy$default(ContestWinningsModel contestWinningsModel, Contest contest2, ArrayList<Winning> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            contest2 = contestWinningsModel.contest;
        }
        if ((i & 2) != 0) {
            arrayList = contestWinningsModel.winning;
        }
        return contestWinningsModel.copy(contest2, arrayList);
    }

    public final Contest component1() {
        return this.contest;
    }

    public final ArrayList<Winning> component2() {
        return this.winning;
    }

    public final ContestWinningsModel copy(Contest contest2, ArrayList<Winning> arrayList) {
        Intrinsics.checkNotNullParameter(contest2, "contest");
        Intrinsics.checkNotNullParameter(arrayList, "winning");
        return new ContestWinningsModel(contest2, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContestWinningsModel)) {
            return false;
        }
        ContestWinningsModel contestWinningsModel = (ContestWinningsModel) obj;
        return Intrinsics.areEqual((Object) this.contest, (Object) contestWinningsModel.contest) && Intrinsics.areEqual((Object) this.winning, (Object) contestWinningsModel.winning);
    }

    public int hashCode() {
        return (this.contest.hashCode() * 31) + this.winning.hashCode();
    }

    public String toString() {
        return "ContestWinningsModel(contest=" + this.contest + ", winning=" + this.winning + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.contest.writeToParcel(parcel, i);
        ArrayList<Winning> arrayList = this.winning;
        parcel.writeInt(arrayList.size());
        Iterator<Winning> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public ContestWinningsModel(Contest contest2, ArrayList<Winning> arrayList) {
        Intrinsics.checkNotNullParameter(contest2, "contest");
        Intrinsics.checkNotNullParameter(arrayList, "winning");
        this.contest = contest2;
        this.winning = arrayList;
    }

    public final Contest getContest() {
        return this.contest;
    }

    public final ArrayList<Winning> getWinning() {
        return this.winning;
    }
}
