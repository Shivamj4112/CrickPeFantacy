package com.crickpe.view.home;

import androidx.lifecycle.ViewModel;
import com.crickpe.data.EditProfileRequest;
import com.crickpe.data.RewardPlayerRequest;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.RetrofitClient;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerRewardModel;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel;
import com.crickpe.view.detail.fragments.profile.ProfileModel;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayersModel;
import com.crickpe.view.home.fragments.home.BannerListModelItem;
import com.crickpe.view.home.fragments.home.HomeDataModel;
import com.crickpe.view.home.fragments.home.NationalityModel;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import com.crickpe.view.home.fragments.rewards.my_reward_model.MyRewardModelItem;
import com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel;
import com.crickpe.view.home.fragments.winner.models.MegaWinnersM;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.kyc.models.TeamCountryData;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.microsoft.appcenter.analytics.ingestion.models.PageLog;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010;\u001a\u00020<2\"\u0010=\u001a\u001e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0>j\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?`@J\u0006\u0010A\u001a\u00020<J\u0006\u0010B\u001a\u00020<J\u0006\u0010\u0011\u001a\u00020<J\u000e\u0010C\u001a\u00020<2\u0006\u0010D\u001a\u00020?J\u000e\u0010E\u001a\u00020<2\u0006\u0010F\u001a\u00020?J\u0006\u0010G\u001a\u00020<J\u0006\u0010H\u001a\u00020<J\u000e\u0010I\u001a\u00020<2\u0006\u0010J\u001a\u00020?J\u000e\u0010K\u001a\u00020<2\u0006\u0010L\u001a\u00020?J\u000e\u0010M\u001a\u00020<2\u0006\u0010F\u001a\u00020NJ\u0006\u00105\u001a\u00020<J\u0006\u0010O\u001a\u00020<J*\u0010(\u001a\u00020<2\"\u0010P\u001a\u001e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?0>j\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020?`@J\u000e\u0010Q\u001a\u00020<2\u0006\u0010R\u001a\u00020SJ\u0016\u0010T\u001a\u00020<2\u0006\u0010U\u001a\u00020?2\u0006\u0010F\u001a\u00020NJ\u000e\u0010V\u001a\u00020<2\u0006\u0010W\u001a\u00020XR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR-\u0010\t\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR-\u0010\u000e\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR-\u0010\u0014\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00150\nj\b\u0012\u0004\u0012\u00020\u0015`\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR-\u0010\u0017\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\nj\b\u0012\u0004\u0012\u00020\u0018`\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR-\u0010\u001a\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b0\nj\b\u0012\u0004\u0012\u00020\u001b`\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR-\u0010\u001d\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000f0\nj\b\u0012\u0004\u0012\u00020\u000f`\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\bR-\u0010\u001f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020 0\nj\b\u0012\u0004\u0012\u00020 `\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\bR\u001d\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\bR\u001d\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\bR\u001d\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020)0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\bR-\u0010+\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020,0\nj\b\u0012\u0004\u0012\u00020,`\f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\bR\u001d\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\bR\u001d\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010\bR\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010\bR\u001d\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002070\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010\bR\u001d\u00109\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\b¨\u0006Y"}, mo48222d2 = {"Lcom/crickpe/view/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "checkDevice", "Lcom/crickpe/utils/SingleLiveEvent;", "Lcom/crickpe/utils/apiHandling/ApiResponseHandler;", "Lcom/crickpe/view/intro/fragments/User;", "getCheckDevice", "()Lcom/crickpe/utils/SingleLiveEvent;", "getBanner", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/home/BannerListModelItem;", "Lkotlin/collections/ArrayList;", "getGetBanner", "getCountryData", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "getGetCountryData", "getHomeDataApi", "Lcom/crickpe/view/home/fragments/home/HomeDataModel;", "getGetHomeDataApi", "getMegaWinners", "Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;", "getGetMegaWinners", "getMyReward", "Lcom/crickpe/view/home/fragments/rewards/my_reward_model/MyRewardModelItem;", "getGetMyReward", "getNationalityObs", "Lcom/crickpe/view/home/fragments/home/NationalityModel;", "getGetNationalityObs", "getPlayerData", "getGetPlayerData", "getPlayerTracker", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/TrackerModel;", "getGetPlayerTracker", "getUserProfle", "Lcom/crickpe/view/detail/fragments/profile/ProfileModel;", "getGetUserProfle", "healthApi", "Lcom/crickpe/view/intro/fragments/splash/models/boot_app_models/SettingsModel;", "getHealthApi", "logout", "", "getLogout", "mymatches", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "getMymatches", "playerReward", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerRewardModel;", "getPlayerReward", "playerStats", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerStatsModel;", "getPlayerStats", "settingsApi", "getSettingsApi", "topPlayers", "Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayersModel;", "getTopPlayers", "updateProfile", "getUpdateProfile", "checkDeviceApi", "", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "getBannerApi", "getHealth", "getMatchesApi", "type", "getMegaWinnerApi", "page", "getMyRewards", "getNationalityApi", "getPlayersByTeamId", "teamId", "getPlayersStat", "playerId", "getPlayersTracker", "", "getTeamsCountryApi", "fcmToken", "rewardPlayer", "rewardPlayerRequest", "Lcom/crickpe/data/RewardPlayerRequest;", "topPlayersApi", "filterId", "updateProfileApi", "value", "Lcom/crickpe/data/EditProfileRequest;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeViewModel.kt */
public final class HomeViewModel extends ViewModel {
    private final SingleLiveEvent<ApiResponseHandler<User>> checkDevice = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<BannerListModelItem>>> getBanner = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getCountryData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<HomeDataModel>> getHomeDataApi = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<MegaWinnersM>>> getMegaWinners = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<MyRewardModelItem>>> getMyReward = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<NationalityModel>>> getNationalityObs = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getPlayerData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<TrackerModel>>> getPlayerTracker = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ProfileModel>> getUserProfle = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<SettingsModel>> healthApi = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<Object>> logout = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<MyMatchesModel>>> mymatches = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<PlayerRewardModel>> playerReward = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<PlayerStatsModel>> playerStats = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<SettingsModel>> settingsApi = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<TopPlayersModel>> topPlayers = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<User>> updateProfile = new SingleLiveEvent<>();

    public final SingleLiveEvent<ApiResponseHandler<HomeDataModel>> getGetHomeDataApi() {
        return this.getHomeDataApi;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<MyMatchesModel>>> getMymatches() {
        return this.mymatches;
    }

    public final SingleLiveEvent<ApiResponseHandler<Object>> getLogout() {
        return this.logout;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<MegaWinnersM>>> getGetMegaWinners() {
        return this.getMegaWinners;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<NationalityModel>>> getGetNationalityObs() {
        return this.getNationalityObs;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getGetCountryData() {
        return this.getCountryData;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getGetPlayerData() {
        return this.getPlayerData;
    }

    public final SingleLiveEvent<ApiResponseHandler<PlayerStatsModel>> getPlayerStats() {
        return this.playerStats;
    }

    public final SingleLiveEvent<ApiResponseHandler<PlayerRewardModel>> getPlayerReward() {
        return this.playerReward;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<TrackerModel>>> getGetPlayerTracker() {
        return this.getPlayerTracker;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<MyRewardModelItem>>> getGetMyReward() {
        return this.getMyReward;
    }

    public final SingleLiveEvent<ApiResponseHandler<TopPlayersModel>> getTopPlayers() {
        return this.topPlayers;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<BannerListModelItem>>> getGetBanner() {
        return this.getBanner;
    }

    public final SingleLiveEvent<ApiResponseHandler<ProfileModel>> getGetUserProfle() {
        return this.getUserProfle;
    }

    public final SingleLiveEvent<ApiResponseHandler<User>> getUpdateProfile() {
        return this.updateProfile;
    }

    public final SingleLiveEvent<ApiResponseHandler<User>> getCheckDevice() {
        return this.checkDevice;
    }

    public final SingleLiveEvent<ApiResponseHandler<SettingsModel>> getSettingsApi() {
        return this.settingsApi;
    }

    public final SingleLiveEvent<ApiResponseHandler<SettingsModel>> getHealthApi() {
        return this.healthApi;
    }

    public final void getHealth() {
        this.healthApi.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getHealthApi().enqueue(new HomeViewModel$getHealth$1(this));
    }

    public final void checkDeviceApi(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.checkDevice.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().checkDevice(hashMap).enqueue(new HomeViewModel$checkDeviceApi$1(this));
    }

    public final void updateProfileApi(EditProfileRequest editProfileRequest) {
        Intrinsics.checkNotNullParameter(editProfileRequest, "value");
        this.updateProfile.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().updateProfileCall(editProfileRequest).enqueue(new HomeViewModel$updateProfileApi$1(this));
    }

    public final void getPlayersStat(String str) {
        Intrinsics.checkNotNullParameter(str, "playerId");
        this.playerStats.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getPlayerStats(str).enqueue(new HomeViewModel$getPlayersStat$1(this));
    }

    public final void rewardPlayer(RewardPlayerRequest rewardPlayerRequest) {
        Intrinsics.checkNotNullParameter(rewardPlayerRequest, "rewardPlayerRequest");
        this.playerReward.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().rewardPlayerApi(rewardPlayerRequest).enqueue(new HomeViewModel$rewardPlayer$1(this));
    }

    public final void getHomeDataApi() {
        this.getHomeDataApi.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getHomeDataApi().enqueue(new HomeViewModel$getHomeDataApi$1(this));
    }

    public final void getMyRewards() {
        this.getMyReward.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getMyRewardApi().enqueue(new HomeViewModel$getMyRewards$1(this));
    }

    public final void getPlayersTracker(int i) {
        this.getPlayerTracker.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getTrackerApi(i).enqueue(new HomeViewModel$getPlayersTracker$1(this));
    }

    public final void getTeamsCountryApi() {
        this.getCountryData.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getTeamCountryApi().enqueue(new HomeViewModel$getTeamsCountryApi$1(this));
    }

    public final void getPlayersByTeamId(String str) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        this.getPlayerData.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getPlayerByCountryApi(str).enqueue(new HomeViewModel$getPlayersByTeamId$1(this));
    }

    /* renamed from: getSettingsApi  reason: collision with other method in class */
    public final void m3678getSettingsApi() {
        this.settingsApi.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getSettingsApi().enqueue(new HomeViewModel$getSettingsApi$1(this));
    }

    public final void getBannerApi() {
        this.getBanner.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getBanners().enqueue(new HomeViewModel$getBannerApi$1(this));
    }

    public final void getNationalityApi() {
        this.getNationalityObs.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getNationalityApi().enqueue(new HomeViewModel$getNationalityApi$1(this));
    }

    public final void getMegaWinnerApi(String str) {
        Intrinsics.checkNotNullParameter(str, PageLog.TYPE);
        this.getMegaWinners.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getMegaWinners(str).enqueue(new HomeViewModel$getMegaWinnerApi$1(this));
    }

    public final void topPlayersApi(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "filterId");
        this.topPlayers.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getTopPlayersApi(str, i).enqueue(new HomeViewModel$topPlayersApi$1(this));
    }

    public final void getMatchesApi(String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        this.mymatches.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getMyMatches(str).enqueue(new HomeViewModel$getMatchesApi$1(this));
    }

    public final void logout(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "fcmToken");
        this.logout.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().logout(hashMap).enqueue(new HomeViewModel$logout$1(this));
    }
}
