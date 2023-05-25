package com.crickpe.view.home.fragments.rewards.tracker_model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003J\u000f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013HÆ\u0003J\t\u0010.\u001a\u00020\u0015HÆ\u0003J\t\u0010/\u001a\u00020\u0003HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u000bHÆ\u0003J\t\u00105\u001a\u00020\rHÆ\u0003J\t\u00106\u001a\u00020\u000fHÆ\u0003J\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015HÆ\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010;\u001a\u00020\u0007HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0013¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'¨\u0006="}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/rewards/tracker_model/TrackerModel;", "", "_id", "", "name", "playerId", "totalRewardEarning", "", "userRewardRank", "imageUrl", "highestRewardPlayers", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/HighestRewardPlayers;", "userReward", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/UserReward;", "totalPotEarning", "", "carRewards", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/CarRewards;", "playercarrewards", "", "teamInfo", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/TeamInfo;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lcom/crickpe/view/home/fragments/rewards/tracker_model/HighestRewardPlayers;Lcom/crickpe/view/home/fragments/rewards/tracker_model/UserReward;DLcom/crickpe/view/home/fragments/rewards/tracker_model/CarRewards;Ljava/util/List;Lcom/crickpe/view/home/fragments/rewards/tracker_model/TeamInfo;)V", "get_id", "()Ljava/lang/String;", "getCarRewards", "()Lcom/crickpe/view/home/fragments/rewards/tracker_model/CarRewards;", "getHighestRewardPlayers", "()Lcom/crickpe/view/home/fragments/rewards/tracker_model/HighestRewardPlayers;", "getImageUrl", "getName", "getPlayerId", "getPlayercarrewards", "()Ljava/util/List;", "getTeamInfo", "()Lcom/crickpe/view/home/fragments/rewards/tracker_model/TeamInfo;", "getTotalPotEarning", "()D", "getTotalRewardEarning", "()I", "getUserReward", "()Lcom/crickpe/view/home/fragments/rewards/tracker_model/UserReward;", "getUserRewardRank", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: TrackerModel.kt */
public final class TrackerModel {
    private final String _id;
    private final CarRewards carRewards;
    private final HighestRewardPlayers highestRewardPlayers;
    private final String imageUrl;
    private final String name;
    private final String playerId;
    private final List<CarRewards> playercarrewards;
    private final TeamInfo teamInfo;
    private final double totalPotEarning;
    private final int totalRewardEarning;
    private final UserReward userReward;
    private final int userRewardRank;

    public static /* synthetic */ TrackerModel copy$default(TrackerModel trackerModel, String str, String str2, String str3, int i, int i2, String str4, HighestRewardPlayers highestRewardPlayers2, UserReward userReward2, double d, CarRewards carRewards2, List list, TeamInfo teamInfo2, int i3, Object obj) {
        TrackerModel trackerModel2 = trackerModel;
        int i4 = i3;
        return trackerModel.copy((i4 & 1) != 0 ? trackerModel2._id : str, (i4 & 2) != 0 ? trackerModel2.name : str2, (i4 & 4) != 0 ? trackerModel2.playerId : str3, (i4 & 8) != 0 ? trackerModel2.totalRewardEarning : i, (i4 & 16) != 0 ? trackerModel2.userRewardRank : i2, (i4 & 32) != 0 ? trackerModel2.imageUrl : str4, (i4 & 64) != 0 ? trackerModel2.highestRewardPlayers : highestRewardPlayers2, (i4 & 128) != 0 ? trackerModel2.userReward : userReward2, (i4 & 256) != 0 ? trackerModel2.totalPotEarning : d, (i4 & 512) != 0 ? trackerModel2.carRewards : carRewards2, (i4 & 1024) != 0 ? trackerModel2.playercarrewards : list, (i4 & 2048) != 0 ? trackerModel2.teamInfo : teamInfo2);
    }

    public final String component1() {
        return this._id;
    }

    public final CarRewards component10() {
        return this.carRewards;
    }

    public final List<CarRewards> component11() {
        return this.playercarrewards;
    }

    public final TeamInfo component12() {
        return this.teamInfo;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.playerId;
    }

    public final int component4() {
        return this.totalRewardEarning;
    }

    public final int component5() {
        return this.userRewardRank;
    }

    public final String component6() {
        return this.imageUrl;
    }

    public final HighestRewardPlayers component7() {
        return this.highestRewardPlayers;
    }

    public final UserReward component8() {
        return this.userReward;
    }

    public final double component9() {
        return this.totalPotEarning;
    }

    public final TrackerModel copy(String str, String str2, String str3, int i, int i2, String str4, HighestRewardPlayers highestRewardPlayers2, UserReward userReward2, double d, CarRewards carRewards2, List<CarRewards> list, TeamInfo teamInfo2) {
        String str5 = str;
        Intrinsics.checkNotNullParameter(str5, "_id");
        String str6 = str2;
        Intrinsics.checkNotNullParameter(str6, "name");
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "playerId");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "imageUrl");
        HighestRewardPlayers highestRewardPlayers3 = highestRewardPlayers2;
        Intrinsics.checkNotNullParameter(highestRewardPlayers3, "highestRewardPlayers");
        UserReward userReward3 = userReward2;
        Intrinsics.checkNotNullParameter(userReward3, "userReward");
        CarRewards carRewards3 = carRewards2;
        Intrinsics.checkNotNullParameter(carRewards3, "carRewards");
        List<CarRewards> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "playercarrewards");
        TeamInfo teamInfo3 = teamInfo2;
        Intrinsics.checkNotNullParameter(teamInfo3, "teamInfo");
        return new TrackerModel(str5, str6, str7, i, i2, str8, highestRewardPlayers3, userReward3, d, carRewards3, list2, teamInfo3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrackerModel)) {
            return false;
        }
        TrackerModel trackerModel = (TrackerModel) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) trackerModel._id) && Intrinsics.areEqual((Object) this.name, (Object) trackerModel.name) && Intrinsics.areEqual((Object) this.playerId, (Object) trackerModel.playerId) && this.totalRewardEarning == trackerModel.totalRewardEarning && this.userRewardRank == trackerModel.userRewardRank && Intrinsics.areEqual((Object) this.imageUrl, (Object) trackerModel.imageUrl) && Intrinsics.areEqual((Object) this.highestRewardPlayers, (Object) trackerModel.highestRewardPlayers) && Intrinsics.areEqual((Object) this.userReward, (Object) trackerModel.userReward) && Intrinsics.areEqual((Object) Double.valueOf(this.totalPotEarning), (Object) Double.valueOf(trackerModel.totalPotEarning)) && Intrinsics.areEqual((Object) this.carRewards, (Object) trackerModel.carRewards) && Intrinsics.areEqual((Object) this.playercarrewards, (Object) trackerModel.playercarrewards) && Intrinsics.areEqual((Object) this.teamInfo, (Object) trackerModel.teamInfo);
    }

    public int hashCode() {
        return (((((((((((((((((((((this._id.hashCode() * 31) + this.name.hashCode()) * 31) + this.playerId.hashCode()) * 31) + this.totalRewardEarning) * 31) + this.userRewardRank) * 31) + this.imageUrl.hashCode()) * 31) + this.highestRewardPlayers.hashCode()) * 31) + this.userReward.hashCode()) * 31) + Double.doubleToLongBits(this.totalPotEarning)) * 31) + this.carRewards.hashCode()) * 31) + this.playercarrewards.hashCode()) * 31) + this.teamInfo.hashCode();
    }

    public String toString() {
        return "TrackerModel(_id=" + this._id + ", name=" + this.name + ", playerId=" + this.playerId + ", totalRewardEarning=" + this.totalRewardEarning + ", userRewardRank=" + this.userRewardRank + ", imageUrl=" + this.imageUrl + ", highestRewardPlayers=" + this.highestRewardPlayers + ", userReward=" + this.userReward + ", totalPotEarning=" + this.totalPotEarning + ", carRewards=" + this.carRewards + ", playercarrewards=" + this.playercarrewards + ", teamInfo=" + this.teamInfo + ')';
    }

    public TrackerModel(String str, String str2, String str3, int i, int i2, String str4, HighestRewardPlayers highestRewardPlayers2, UserReward userReward2, double d, CarRewards carRewards2, List<CarRewards> list, TeamInfo teamInfo2) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "playerId");
        Intrinsics.checkNotNullParameter(str4, "imageUrl");
        Intrinsics.checkNotNullParameter(highestRewardPlayers2, "highestRewardPlayers");
        Intrinsics.checkNotNullParameter(userReward2, "userReward");
        Intrinsics.checkNotNullParameter(carRewards2, "carRewards");
        Intrinsics.checkNotNullParameter(list, "playercarrewards");
        Intrinsics.checkNotNullParameter(teamInfo2, "teamInfo");
        this._id = str;
        this.name = str2;
        this.playerId = str3;
        this.totalRewardEarning = i;
        this.userRewardRank = i2;
        this.imageUrl = str4;
        this.highestRewardPlayers = highestRewardPlayers2;
        this.userReward = userReward2;
        this.totalPotEarning = d;
        this.carRewards = carRewards2;
        this.playercarrewards = list;
        this.teamInfo = teamInfo2;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final int getTotalRewardEarning() {
        return this.totalRewardEarning;
    }

    public final int getUserRewardRank() {
        return this.userRewardRank;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final HighestRewardPlayers getHighestRewardPlayers() {
        return this.highestRewardPlayers;
    }

    public final UserReward getUserReward() {
        return this.userReward;
    }

    public final double getTotalPotEarning() {
        return this.totalPotEarning;
    }

    public final CarRewards getCarRewards() {
        return this.carRewards;
    }

    public final List<CarRewards> getPlayercarrewards() {
        return this.playercarrewards;
    }

    public final TeamInfo getTeamInfo() {
        return this.teamInfo;
    }
}
