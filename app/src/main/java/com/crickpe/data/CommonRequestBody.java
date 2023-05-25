package com.crickpe.data;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000bR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, mo48222d2 = {"Lcom/crickpe/data/CommonRequestBody;", "", "matchId", "", "playerIds", "Ljava/util/ArrayList;", "Lcom/crickpe/data/CreateFantasyTeamRequest;", "Lkotlin/collections/ArrayList;", "isFantasyCaptain", "isFantasyViceCaptain", "(Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "getMatchId", "getPlayerIds", "()Ljava/util/ArrayList;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CommonRequestBody.kt */
public final class CommonRequestBody {
    private final String isFantasyCaptain;
    private final String isFantasyViceCaptain;
    private final String matchId;
    private final ArrayList<CreateFantasyTeamRequest> playerIds;

    public CommonRequestBody(String str, ArrayList<CreateFantasyTeamRequest> arrayList, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        Intrinsics.checkNotNullParameter(arrayList, "playerIds");
        Intrinsics.checkNotNullParameter(str2, "isFantasyCaptain");
        Intrinsics.checkNotNullParameter(str3, "isFantasyViceCaptain");
        this.matchId = str;
        this.playerIds = arrayList;
        this.isFantasyCaptain = str2;
        this.isFantasyViceCaptain = str3;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final ArrayList<CreateFantasyTeamRequest> getPlayerIds() {
        return this.playerIds;
    }

    public final String isFantasyCaptain() {
        return this.isFantasyCaptain;
    }

    public final String isFantasyViceCaptain() {
        return this.isFantasyViceCaptain;
    }
}
