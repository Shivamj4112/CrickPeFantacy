package com.crickpe.data;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/data/UpdateTeamBody;", "", "playerIds", "Ljava/util/ArrayList;", "Lcom/crickpe/data/CreateFantasyTeamRequest;", "Lkotlin/collections/ArrayList;", "isFantasyCaptain", "", "isFantasyViceCaptain", "(Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/String;", "getPlayerIds", "()Ljava/util/ArrayList;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UpdateTeamBody.kt */
public final class UpdateTeamBody {
    private final String isFantasyCaptain;
    private final String isFantasyViceCaptain;
    private final ArrayList<CreateFantasyTeamRequest> playerIds;

    public UpdateTeamBody(ArrayList<CreateFantasyTeamRequest> arrayList, String str, String str2) {
        Intrinsics.checkNotNullParameter(arrayList, "playerIds");
        Intrinsics.checkNotNullParameter(str, "isFantasyCaptain");
        Intrinsics.checkNotNullParameter(str2, "isFantasyViceCaptain");
        this.playerIds = arrayList;
        this.isFantasyCaptain = str;
        this.isFantasyViceCaptain = str2;
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
