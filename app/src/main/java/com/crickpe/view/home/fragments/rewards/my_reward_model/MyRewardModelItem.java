package com.crickpe.view.home.fragments.rewards.my_reward_model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011¨\u0006'"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/rewards/my_reward_model/MyRewardModelItem;", "", "_id", "", "rewardAmount", "", "userId", "playerId", "createdAt", "updatedAt", "__v", "player", "Lcom/crickpe/view/home/fragments/rewards/my_reward_model/Player;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/crickpe/view/home/fragments/rewards/my_reward_model/Player;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getCreatedAt", "getPlayer", "()Lcom/crickpe/view/home/fragments/rewards/my_reward_model/Player;", "getPlayerId", "getRewardAmount", "getUpdatedAt", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyRewardModelItem.kt */
public final class MyRewardModelItem {
    private final int __v;
    private final String _id;
    private final String createdAt;
    private final Player player;
    private final String playerId;
    private final int rewardAmount;
    private final String updatedAt;
    private final String userId;

    public static /* synthetic */ MyRewardModelItem copy$default(MyRewardModelItem myRewardModelItem, String str, int i, String str2, String str3, String str4, String str5, int i2, Player player2, int i3, Object obj) {
        MyRewardModelItem myRewardModelItem2 = myRewardModelItem;
        int i4 = i3;
        return myRewardModelItem.copy((i4 & 1) != 0 ? myRewardModelItem2._id : str, (i4 & 2) != 0 ? myRewardModelItem2.rewardAmount : i, (i4 & 4) != 0 ? myRewardModelItem2.userId : str2, (i4 & 8) != 0 ? myRewardModelItem2.playerId : str3, (i4 & 16) != 0 ? myRewardModelItem2.createdAt : str4, (i4 & 32) != 0 ? myRewardModelItem2.updatedAt : str5, (i4 & 64) != 0 ? myRewardModelItem2.__v : i2, (i4 & 128) != 0 ? myRewardModelItem2.player : player2);
    }

    public final String component1() {
        return this._id;
    }

    public final int component2() {
        return this.rewardAmount;
    }

    public final String component3() {
        return this.userId;
    }

    public final String component4() {
        return this.playerId;
    }

    public final String component5() {
        return this.createdAt;
    }

    public final String component6() {
        return this.updatedAt;
    }

    public final int component7() {
        return this.__v;
    }

    public final Player component8() {
        return this.player;
    }

    public final MyRewardModelItem copy(String str, int i, String str2, String str3, String str4, String str5, int i2, Player player2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "playerId");
        Intrinsics.checkNotNullParameter(str4, "createdAt");
        String str6 = str5;
        Intrinsics.checkNotNullParameter(str6, "updatedAt");
        Player player3 = player2;
        Intrinsics.checkNotNullParameter(player3, "player");
        return new MyRewardModelItem(str, i, str2, str3, str4, str6, i2, player3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyRewardModelItem)) {
            return false;
        }
        MyRewardModelItem myRewardModelItem = (MyRewardModelItem) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) myRewardModelItem._id) && this.rewardAmount == myRewardModelItem.rewardAmount && Intrinsics.areEqual((Object) this.userId, (Object) myRewardModelItem.userId) && Intrinsics.areEqual((Object) this.playerId, (Object) myRewardModelItem.playerId) && Intrinsics.areEqual((Object) this.createdAt, (Object) myRewardModelItem.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) myRewardModelItem.updatedAt) && this.__v == myRewardModelItem.__v && Intrinsics.areEqual((Object) this.player, (Object) myRewardModelItem.player);
    }

    public int hashCode() {
        return (((((((((((((this._id.hashCode() * 31) + this.rewardAmount) * 31) + this.userId.hashCode()) * 31) + this.playerId.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v) * 31) + this.player.hashCode();
    }

    public String toString() {
        return "MyRewardModelItem(_id=" + this._id + ", rewardAmount=" + this.rewardAmount + ", userId=" + this.userId + ", playerId=" + this.playerId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", player=" + this.player + ')';
    }

    public MyRewardModelItem(String str, int i, String str2, String str3, String str4, String str5, int i2, Player player2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "playerId");
        Intrinsics.checkNotNullParameter(str4, "createdAt");
        Intrinsics.checkNotNullParameter(str5, "updatedAt");
        Intrinsics.checkNotNullParameter(player2, "player");
        this._id = str;
        this.rewardAmount = i;
        this.userId = str2;
        this.playerId = str3;
        this.createdAt = str4;
        this.updatedAt = str5;
        this.__v = i2;
        this.player = player2;
    }

    public final String get_id() {
        return this._id;
    }

    public final int getRewardAmount() {
        return this.rewardAmount;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int get__v() {
        return this.__v;
    }

    public final Player getPlayer() {
        return this.player;
    }
}
