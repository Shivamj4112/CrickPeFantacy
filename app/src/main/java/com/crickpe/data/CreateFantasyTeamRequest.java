package com.crickpe.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, mo48222d2 = {"Lcom/crickpe/data/CreateFantasyTeamRequest;", "", "teamId", "", "playerId", "(Ljava/lang/String;Ljava/lang/String;)V", "getPlayerId", "()Ljava/lang/String;", "getTeamId", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CreateFantasyTeamRequest.kt */
public final class CreateFantasyTeamRequest {
    private final String playerId;
    private final String teamId;

    public CreateFantasyTeamRequest(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        this.teamId = str;
        this.playerId = str2;
    }

    public final String getTeamId() {
        return this.teamId;
    }

    public final String getPlayerId() {
        return this.playerId;
    }
}
