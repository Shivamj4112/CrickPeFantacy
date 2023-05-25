package com.crickpe.view.detail.fragments.player_reward_fragment;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JY\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\nHÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015¨\u0006%"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/RewardPlayerData;", "", "countryId", "", "countryName", "playerId", "playerName", "flagImage", "playerImage", "selectedCountryPosition", "", "selectedPlayerPosition", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getCountryId", "()Ljava/lang/String;", "getCountryName", "getFlagImage", "getPlayerId", "getPlayerImage", "getPlayerName", "getSelectedCountryPosition", "()I", "getSelectedPlayerPosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RewardPlayerData.kt */
public final class RewardPlayerData {
    private final String countryId;
    private final String countryName;
    private final String flagImage;
    private final String playerId;
    private final String playerImage;
    private final String playerName;
    private final int selectedCountryPosition;
    private final int selectedPlayerPosition;

    public static /* synthetic */ RewardPlayerData copy$default(RewardPlayerData rewardPlayerData, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, Object obj) {
        RewardPlayerData rewardPlayerData2 = rewardPlayerData;
        int i4 = i3;
        return rewardPlayerData.copy((i4 & 1) != 0 ? rewardPlayerData2.countryId : str, (i4 & 2) != 0 ? rewardPlayerData2.countryName : str2, (i4 & 4) != 0 ? rewardPlayerData2.playerId : str3, (i4 & 8) != 0 ? rewardPlayerData2.playerName : str4, (i4 & 16) != 0 ? rewardPlayerData2.flagImage : str5, (i4 & 32) != 0 ? rewardPlayerData2.playerImage : str6, (i4 & 64) != 0 ? rewardPlayerData2.selectedCountryPosition : i, (i4 & 128) != 0 ? rewardPlayerData2.selectedPlayerPosition : i2);
    }

    public final String component1() {
        return this.countryId;
    }

    public final String component2() {
        return this.countryName;
    }

    public final String component3() {
        return this.playerId;
    }

    public final String component4() {
        return this.playerName;
    }

    public final String component5() {
        return this.flagImage;
    }

    public final String component6() {
        return this.playerImage;
    }

    public final int component7() {
        return this.selectedCountryPosition;
    }

    public final int component8() {
        return this.selectedPlayerPosition;
    }

    public final RewardPlayerData copy(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "countryId");
        Intrinsics.checkNotNullParameter(str2, "countryName");
        Intrinsics.checkNotNullParameter(str3, "playerId");
        Intrinsics.checkNotNullParameter(str4, "playerName");
        Intrinsics.checkNotNullParameter(str5, "flagImage");
        String str7 = str6;
        Intrinsics.checkNotNullParameter(str7, "playerImage");
        return new RewardPlayerData(str, str2, str3, str4, str5, str7, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardPlayerData)) {
            return false;
        }
        RewardPlayerData rewardPlayerData = (RewardPlayerData) obj;
        return Intrinsics.areEqual((Object) this.countryId, (Object) rewardPlayerData.countryId) && Intrinsics.areEqual((Object) this.countryName, (Object) rewardPlayerData.countryName) && Intrinsics.areEqual((Object) this.playerId, (Object) rewardPlayerData.playerId) && Intrinsics.areEqual((Object) this.playerName, (Object) rewardPlayerData.playerName) && Intrinsics.areEqual((Object) this.flagImage, (Object) rewardPlayerData.flagImage) && Intrinsics.areEqual((Object) this.playerImage, (Object) rewardPlayerData.playerImage) && this.selectedCountryPosition == rewardPlayerData.selectedCountryPosition && this.selectedPlayerPosition == rewardPlayerData.selectedPlayerPosition;
    }

    public int hashCode() {
        return (((((((((((((this.countryId.hashCode() * 31) + this.countryName.hashCode()) * 31) + this.playerId.hashCode()) * 31) + this.playerName.hashCode()) * 31) + this.flagImage.hashCode()) * 31) + this.playerImage.hashCode()) * 31) + this.selectedCountryPosition) * 31) + this.selectedPlayerPosition;
    }

    public String toString() {
        return "RewardPlayerData(countryId=" + this.countryId + ", countryName=" + this.countryName + ", playerId=" + this.playerId + ", playerName=" + this.playerName + ", flagImage=" + this.flagImage + ", playerImage=" + this.playerImage + ", selectedCountryPosition=" + this.selectedCountryPosition + ", selectedPlayerPosition=" + this.selectedPlayerPosition + ')';
    }

    public RewardPlayerData(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "countryId");
        Intrinsics.checkNotNullParameter(str2, "countryName");
        Intrinsics.checkNotNullParameter(str3, "playerId");
        Intrinsics.checkNotNullParameter(str4, "playerName");
        Intrinsics.checkNotNullParameter(str5, "flagImage");
        Intrinsics.checkNotNullParameter(str6, "playerImage");
        this.countryId = str;
        this.countryName = str2;
        this.playerId = str3;
        this.playerName = str4;
        this.flagImage = str5;
        this.playerImage = str6;
        this.selectedCountryPosition = i;
        this.selectedPlayerPosition = i2;
    }

    public final String getCountryId() {
        return this.countryId;
    }

    public final String getCountryName() {
        return this.countryName;
    }

    public final String getPlayerId() {
        return this.playerId;
    }

    public final String getPlayerName() {
        return this.playerName;
    }

    public final String getFlagImage() {
        return this.flagImage;
    }

    public final String getPlayerImage() {
        return this.playerImage;
    }

    public final int getSelectedCountryPosition() {
        return this.selectedCountryPosition;
    }

    public final int getSelectedPlayerPosition() {
        return this.selectedPlayerPosition;
    }
}
