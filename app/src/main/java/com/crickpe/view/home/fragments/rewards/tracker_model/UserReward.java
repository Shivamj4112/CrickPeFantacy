package com.crickpe.view.home.fragments.rewards.tracker_model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003Jc\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006*"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/rewards/tracker_model/UserReward;", "", "_id", "", "rewardAmount", "", "userId", "playerId", "createdAt", "updatedAt", "__v", "userRewardRank", "userInfo", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/Users;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILcom/crickpe/view/home/fragments/rewards/tracker_model/Users;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getCreatedAt", "getPlayerId", "getRewardAmount", "getUpdatedAt", "getUserId", "getUserInfo", "()Lcom/crickpe/view/home/fragments/rewards/tracker_model/Users;", "getUserRewardRank", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UserReward.kt */
public final class UserReward {
    private final int __v;
    private final String _id;
    private final String createdAt;
    private final String playerId;
    private final int rewardAmount;
    private final String updatedAt;
    private final String userId;
    private final Users userInfo;
    private final int userRewardRank;

    public static /* synthetic */ UserReward copy$default(UserReward userReward, String str, int i, String str2, String str3, String str4, String str5, int i2, int i3, Users users, int i4, Object obj) {
        UserReward userReward2 = userReward;
        int i5 = i4;
        return userReward.copy((i5 & 1) != 0 ? userReward2._id : str, (i5 & 2) != 0 ? userReward2.rewardAmount : i, (i5 & 4) != 0 ? userReward2.userId : str2, (i5 & 8) != 0 ? userReward2.playerId : str3, (i5 & 16) != 0 ? userReward2.createdAt : str4, (i5 & 32) != 0 ? userReward2.updatedAt : str5, (i5 & 64) != 0 ? userReward2.__v : i2, (i5 & 128) != 0 ? userReward2.userRewardRank : i3, (i5 & 256) != 0 ? userReward2.userInfo : users);
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

    public final int component8() {
        return this.userRewardRank;
    }

    public final Users component9() {
        return this.userInfo;
    }

    public final UserReward copy(String str, int i, String str2, String str3, String str4, String str5, int i2, int i3, Users users) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "playerId");
        String str6 = str4;
        Intrinsics.checkNotNullParameter(str6, "createdAt");
        String str7 = str5;
        Intrinsics.checkNotNullParameter(str7, "updatedAt");
        Users users2 = users;
        Intrinsics.checkNotNullParameter(users2, "userInfo");
        return new UserReward(str, i, str2, str3, str6, str7, i2, i3, users2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserReward)) {
            return false;
        }
        UserReward userReward = (UserReward) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) userReward._id) && this.rewardAmount == userReward.rewardAmount && Intrinsics.areEqual((Object) this.userId, (Object) userReward.userId) && Intrinsics.areEqual((Object) this.playerId, (Object) userReward.playerId) && Intrinsics.areEqual((Object) this.createdAt, (Object) userReward.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) userReward.updatedAt) && this.__v == userReward.__v && this.userRewardRank == userReward.userRewardRank && Intrinsics.areEqual((Object) this.userInfo, (Object) userReward.userInfo);
    }

    public int hashCode() {
        return (((((((((((((((this._id.hashCode() * 31) + this.rewardAmount) * 31) + this.userId.hashCode()) * 31) + this.playerId.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v) * 31) + this.userRewardRank) * 31) + this.userInfo.hashCode();
    }

    public String toString() {
        return "UserReward(_id=" + this._id + ", rewardAmount=" + this.rewardAmount + ", userId=" + this.userId + ", playerId=" + this.playerId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", userRewardRank=" + this.userRewardRank + ", userInfo=" + this.userInfo + ')';
    }

    public UserReward(String str, int i, String str2, String str3, String str4, String str5, int i2, int i3, Users users) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "playerId");
        Intrinsics.checkNotNullParameter(str4, "createdAt");
        Intrinsics.checkNotNullParameter(str5, "updatedAt");
        Intrinsics.checkNotNullParameter(users, "userInfo");
        this._id = str;
        this.rewardAmount = i;
        this.userId = str2;
        this.playerId = str3;
        this.createdAt = str4;
        this.updatedAt = str5;
        this.__v = i2;
        this.userRewardRank = i3;
        this.userInfo = users;
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

    public final int getUserRewardRank() {
        return this.userRewardRank;
    }

    public final Users getUserInfo() {
        return this.userInfo;
    }
}
