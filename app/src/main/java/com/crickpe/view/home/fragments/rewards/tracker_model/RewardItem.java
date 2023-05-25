package com.crickpe.view.home.fragments.rewards.tracker_model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JY\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\u0005HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/rewards/tracker_model/RewardItem;", "", "_id", "", "rewardAmount", "", "userId", "playerId", "createdAt", "updatedAt", "__v", "userInfo", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/Users;", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILcom/crickpe/view/home/fragments/rewards/tracker_model/Users;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getCreatedAt", "getPlayerId", "getRewardAmount", "getUpdatedAt", "getUserId", "getUserInfo", "()Lcom/crickpe/view/home/fragments/rewards/tracker_model/Users;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RewardItem.kt */
public final class RewardItem {
    private final int __v;
    private final String _id;
    private final String createdAt;
    private final String playerId;
    private final int rewardAmount;
    private final String updatedAt;
    private final String userId;
    private final Users userInfo;

    public static /* synthetic */ RewardItem copy$default(RewardItem rewardItem, String str, int i, String str2, String str3, String str4, String str5, int i2, Users users, int i3, Object obj) {
        RewardItem rewardItem2 = rewardItem;
        int i4 = i3;
        return rewardItem.copy((i4 & 1) != 0 ? rewardItem2._id : str, (i4 & 2) != 0 ? rewardItem2.rewardAmount : i, (i4 & 4) != 0 ? rewardItem2.userId : str2, (i4 & 8) != 0 ? rewardItem2.playerId : str3, (i4 & 16) != 0 ? rewardItem2.createdAt : str4, (i4 & 32) != 0 ? rewardItem2.updatedAt : str5, (i4 & 64) != 0 ? rewardItem2.__v : i2, (i4 & 128) != 0 ? rewardItem2.userInfo : users);
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

    public final Users component8() {
        return this.userInfo;
    }

    public final RewardItem copy(String str, int i, String str2, String str3, String str4, String str5, int i2, Users users) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "userId");
        Intrinsics.checkNotNullParameter(str3, "playerId");
        Intrinsics.checkNotNullParameter(str4, "createdAt");
        String str6 = str5;
        Intrinsics.checkNotNullParameter(str6, "updatedAt");
        Users users2 = users;
        Intrinsics.checkNotNullParameter(users2, "userInfo");
        return new RewardItem(str, i, str2, str3, str4, str6, i2, users2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardItem)) {
            return false;
        }
        RewardItem rewardItem = (RewardItem) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) rewardItem._id) && this.rewardAmount == rewardItem.rewardAmount && Intrinsics.areEqual((Object) this.userId, (Object) rewardItem.userId) && Intrinsics.areEqual((Object) this.playerId, (Object) rewardItem.playerId) && Intrinsics.areEqual((Object) this.createdAt, (Object) rewardItem.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) rewardItem.updatedAt) && this.__v == rewardItem.__v && Intrinsics.areEqual((Object) this.userInfo, (Object) rewardItem.userInfo);
    }

    public int hashCode() {
        return (((((((((((((this._id.hashCode() * 31) + this.rewardAmount) * 31) + this.userId.hashCode()) * 31) + this.playerId.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v) * 31) + this.userInfo.hashCode();
    }

    public String toString() {
        return "RewardItem(_id=" + this._id + ", rewardAmount=" + this.rewardAmount + ", userId=" + this.userId + ", playerId=" + this.playerId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", userInfo=" + this.userInfo + ')';
    }

    public RewardItem(String str, int i, String str2, String str3, String str4, String str5, int i2, Users users) {
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

    public final Users getUserInfo() {
        return this.userInfo;
    }
}
