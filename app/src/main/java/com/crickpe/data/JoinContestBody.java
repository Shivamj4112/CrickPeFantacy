package com.crickpe.data;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0005j\b\u0012\u0004\u0012\u00020\u0003`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/data/JoinContestBody;", "", "contestId", "", "fantasyTeamArray", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/String;Ljava/util/ArrayList;)V", "getContestId", "()Ljava/lang/String;", "getFantasyTeamArray", "()Ljava/util/ArrayList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: JoinContestBody.kt */
public final class JoinContestBody {
    private final String contestId;
    private final ArrayList<String> fantasyTeamArray;

    public static /* synthetic */ JoinContestBody copy$default(JoinContestBody joinContestBody, String str, ArrayList<String> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            str = joinContestBody.contestId;
        }
        if ((i & 2) != 0) {
            arrayList = joinContestBody.fantasyTeamArray;
        }
        return joinContestBody.copy(str, arrayList);
    }

    public final String component1() {
        return this.contestId;
    }

    public final ArrayList<String> component2() {
        return this.fantasyTeamArray;
    }

    public final JoinContestBody copy(String str, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        Intrinsics.checkNotNullParameter(arrayList, "fantasyTeamArray");
        return new JoinContestBody(str, arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinContestBody)) {
            return false;
        }
        JoinContestBody joinContestBody = (JoinContestBody) obj;
        return Intrinsics.areEqual((Object) this.contestId, (Object) joinContestBody.contestId) && Intrinsics.areEqual((Object) this.fantasyTeamArray, (Object) joinContestBody.fantasyTeamArray);
    }

    public int hashCode() {
        return (this.contestId.hashCode() * 31) + this.fantasyTeamArray.hashCode();
    }

    public String toString() {
        return "JoinContestBody(contestId=" + this.contestId + ", fantasyTeamArray=" + this.fantasyTeamArray + ')';
    }

    public JoinContestBody(String str, ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        Intrinsics.checkNotNullParameter(arrayList, "fantasyTeamArray");
        this.contestId = str;
        this.fantasyTeamArray = arrayList;
    }

    public final String getContestId() {
        return this.contestId;
    }

    public final ArrayList<String> getFantasyTeamArray() {
        return this.fantasyTeamArray;
    }
}
