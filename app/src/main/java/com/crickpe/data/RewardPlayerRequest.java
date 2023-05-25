package com.crickpe.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/data/RewardPlayerRequest;", "", "rewardAmount", "", "playerId", "(Ljava/lang/String;Ljava/lang/String;)V", "getPlayerId", "()Ljava/lang/String;", "setPlayerId", "(Ljava/lang/String;)V", "getRewardAmount", "setRewardAmount", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RewardPlayerRequest.kt */
public final class RewardPlayerRequest {
    @SerializedName("playerId")
    private String playerId;
    @SerializedName("rewardAmount")
    private String rewardAmount;

    public static /* synthetic */ RewardPlayerRequest copy$default(RewardPlayerRequest rewardPlayerRequest, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardPlayerRequest.rewardAmount;
        }
        if ((i & 2) != 0) {
            str2 = rewardPlayerRequest.playerId;
        }
        return rewardPlayerRequest.copy(str, str2);
    }

    public final String component1() {
        return this.rewardAmount;
    }

    public final String component2() {
        return this.playerId;
    }

    public final RewardPlayerRequest copy(String str, String str2) {
        return new RewardPlayerRequest(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardPlayerRequest)) {
            return false;
        }
        RewardPlayerRequest rewardPlayerRequest = (RewardPlayerRequest) obj;
        return Intrinsics.areEqual((Object) this.rewardAmount, (Object) rewardPlayerRequest.rewardAmount) && Intrinsics.areEqual((Object) this.playerId, (Object) rewardPlayerRequest.playerId);
    }

    public int hashCode() {
        String str = this.rewardAmount;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.playerId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RewardPlayerRequest(rewardAmount=" + this.rewardAmount + ", playerId=" + this.playerId + ')';
    }

    public RewardPlayerRequest(String str, String str2) {
        this.rewardAmount = str;
        this.playerId = str2;
    }

    public final String getRewardAmount() {
        return this.rewardAmount;
    }

    public final void setRewardAmount(String str) {
        this.rewardAmount = str;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final void setPlayerId(String str) {
        this.playerId = str;
    }
}
