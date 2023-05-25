package com.crickpe.view.detail.fragments.player_reward_fragment.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006 "}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerRewardModel;", "", "rewardAmount", "", "userId", "", "playerId", "_id", "totalAmount", "certificateUrl", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getCertificateUrl", "getPlayerId", "getRewardAmount", "()D", "getTotalAmount", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayerRewardModel.kt */
public final class PlayerRewardModel {
    private final String _id;
    private final String certificateUrl;
    private final String playerId;
    private final double rewardAmount;
    private final double totalAmount;
    private final String userId;

    public static /* synthetic */ PlayerRewardModel copy$default(PlayerRewardModel playerRewardModel, double d, String str, String str2, String str3, double d2, String str4, int i, Object obj) {
        PlayerRewardModel playerRewardModel2 = playerRewardModel;
        return playerRewardModel.copy((i & 1) != 0 ? playerRewardModel2.rewardAmount : d, (i & 2) != 0 ? playerRewardModel2.userId : str, (i & 4) != 0 ? playerRewardModel2.playerId : str2, (i & 8) != 0 ? playerRewardModel2._id : str3, (i & 16) != 0 ? playerRewardModel2.totalAmount : d2, (i & 32) != 0 ? playerRewardModel2.certificateUrl : str4);
    }

    public final double component1() {
        return this.rewardAmount;
    }

    public final String component2() {
        return this.userId;
    }

    public final String component3() {
        return this.playerId;
    }

    public final String component4() {
        return this._id;
    }

    public final double component5() {
        return this.totalAmount;
    }

    public final String component6() {
        return this.certificateUrl;
    }

    public final PlayerRewardModel copy(double d, String str, String str2, String str3, double d2, String str4) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        Intrinsics.checkNotNullParameter(str3, "_id");
        String str5 = str4;
        Intrinsics.checkNotNullParameter(str5, "certificateUrl");
        return new PlayerRewardModel(d, str, str2, str3, d2, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerRewardModel)) {
            return false;
        }
        PlayerRewardModel playerRewardModel = (PlayerRewardModel) obj;
        return Intrinsics.areEqual((Object) Double.valueOf(this.rewardAmount), (Object) Double.valueOf(playerRewardModel.rewardAmount)) && Intrinsics.areEqual((Object) this.userId, (Object) playerRewardModel.userId) && Intrinsics.areEqual((Object) this.playerId, (Object) playerRewardModel.playerId) && Intrinsics.areEqual((Object) this._id, (Object) playerRewardModel._id) && Intrinsics.areEqual((Object) Double.valueOf(this.totalAmount), (Object) Double.valueOf(playerRewardModel.totalAmount)) && Intrinsics.areEqual((Object) this.certificateUrl, (Object) playerRewardModel.certificateUrl);
    }

    public int hashCode() {
        return (((((((((Double.doubleToLongBits(this.rewardAmount) * 31) + this.userId.hashCode()) * 31) + this.playerId.hashCode()) * 31) + this._id.hashCode()) * 31) + Double.doubleToLongBits(this.totalAmount)) * 31) + this.certificateUrl.hashCode();
    }

    public String toString() {
        return "PlayerRewardModel(rewardAmount=" + this.rewardAmount + ", userId=" + this.userId + ", playerId=" + this.playerId + ", _id=" + this._id + ", totalAmount=" + this.totalAmount + ", certificateUrl=" + this.certificateUrl + ')';
    }

    public PlayerRewardModel(double d, String str, String str2, String str3, double d2, String str4) {
        Intrinsics.checkNotNullParameter(str, "userId");
        Intrinsics.checkNotNullParameter(str2, "playerId");
        Intrinsics.checkNotNullParameter(str3, "_id");
        Intrinsics.checkNotNullParameter(str4, "certificateUrl");
        this.rewardAmount = d;
        this.userId = str;
        this.playerId = str2;
        this._id = str3;
        this.totalAmount = d2;
        this.certificateUrl = str4;
    }

    public final double getRewardAmount() {
        return this.rewardAmount;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final String get_id() {
        return this._id;
    }

    public final double getTotalAmount() {
        return this.totalAmount;
    }

    public final String getCertificateUrl() {
        return this.certificateUrl;
    }
}
