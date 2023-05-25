package com.crickpe.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\n\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, mo48222d2 = {"Lcom/crickpe/data/CreateContestRequest;", "", "matchId", "", "name", "totalSpots", "entryFee", "noOfWinner", "isMultipleTeamAllowed", "", "fantasyTeamId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getEntryFee", "()Ljava/lang/String;", "setEntryFee", "(Ljava/lang/String;)V", "getFantasyTeamId", "setFantasyTeamId", "()Z", "setMultipleTeamAllowed", "(Z)V", "getMatchId", "setMatchId", "getName", "setName", "getNoOfWinner", "setNoOfWinner", "getTotalSpots", "setTotalSpots", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CreateContestRequest.kt */
public final class CreateContestRequest {
    private String entryFee;
    private String fantasyTeamId;
    private boolean isMultipleTeamAllowed;
    private String matchId;
    private String name;
    private String noOfWinner;
    private String totalSpots;

    public CreateContestRequest(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "totalSpots");
        Intrinsics.checkNotNullParameter(str4, "entryFee");
        Intrinsics.checkNotNullParameter(str5, "noOfWinner");
        Intrinsics.checkNotNullParameter(str6, "fantasyTeamId");
        this.matchId = str;
        this.name = str2;
        this.totalSpots = str3;
        this.entryFee = str4;
        this.noOfWinner = str5;
        this.isMultipleTeamAllowed = z;
        this.fantasyTeamId = str6;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final void setMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.matchId = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getTotalSpots() {
        return this.totalSpots;
    }

    public final void setTotalSpots(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.totalSpots = str;
    }

    public final String getEntryFee() {
        return this.entryFee;
    }

    public final void setEntryFee(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.entryFee = str;
    }

    public final String getNoOfWinner() {
        return this.noOfWinner;
    }

    public final void setNoOfWinner(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.noOfWinner = str;
    }

    public final boolean isMultipleTeamAllowed() {
        return this.isMultipleTeamAllowed;
    }

    public final void setMultipleTeamAllowed(boolean z) {
        this.isMultipleTeamAllowed = z;
    }

    public final String getFantasyTeamId() {
        return this.fantasyTeamId;
    }

    public final void setFantasyTeamId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fantasyTeamId = str;
    }
}
