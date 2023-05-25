package com.crickpe.utils.local;

import android.util.Log;
import com.crickpe.data.CreateContestRequest;
import com.crickpe.view.detail.fragments.player_reward_fragment.RewardPlayerData;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import com.crickpe.view.home.fragments.winner.models.MegaWinnersM;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\u0004J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\f\u001a\u00020\tJ\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u0006\u0010\u0011\u001a\u00020\u0004J\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\b\u0010\u0014\u001a\u00020\u0004H\u0007J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016J\u0006\u0010\u0017\u001a\u00020\u0004J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\tJ\u0010\u0010&\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020\u0004H\u0007J\u000e\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010*\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020\tJ\u000e\u0010+\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020\u000eJ\u0016\u0010-\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0004J\u000e\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020\u0013J\u000e\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u0004J\u000e\u00105\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u0016J\u000e\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u0004J\u0010\u00109\u001a\u00020\u001f2\b\u0010:\u001a\u0004\u0018\u00010\u0019J\u0010\u0010;\u001a\u00020\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010<\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u001bJ\u000e\u0010=\u001a\u00020\u001f2\u0006\u00104\u001a\u00020\u0004¨\u0006>"}, mo48222d2 = {"Lcom/crickpe/utils/local/UserManager;", "", "()V", "getAccessToken", "", "getAppSettings", "Lcom/crickpe/view/intro/fragments/splash/models/boot_app_models/SettingsModel;", "getCertificate", "getClick", "", "getCode", "getContacts", "getContestClick", "getContestData", "Lcom/crickpe/data/CreateContestRequest;", "getEvent", "event", "getFCMToken", "getLiveMatch", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "getLowAmount", "getMatch", "Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "getMatchId", "getMegaWinner", "Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;", "getRewardPlayerData", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/RewardPlayerData;", "getUserProfile", "Lcom/crickpe/view/intro/fragments/User;", "removeEvent", "", "saveAppSettings", "userProfile", "saveCertificate", "certificateUrl", "saveClick", "click", "saveCode", "code", "saveContacts", "contactList", "saveContestClick", "saveContestData", "createContestRequest", "saveEvent", "key", "saveFCMToken", "s", "saveLiveMatch", "liveMatchesModel", "saveLowAmount", "accessToken", "saveMatch", "upcomingMatchModel", "saveMatchId", "matchId", "saveMegaWinner", "megaWinnersM", "saveProfile", "saveRewardPlayerData", "saveToken", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UserManager.kt */
public final class UserManager {
    public static final UserManager INSTANCE = new UserManager();

    private UserManager() {
    }

    public final void saveProfile(User user) {
        try {
            PrefsManager prefsManager = PrefsManager.Companion.get();
            Intrinsics.checkNotNull(user);
            prefsManager.save(PrefsManager.PREF_PROFILE_DATA, (Object) user);
        } catch (Exception e) {
            Log.v("saveProfile", e.toString());
        }
    }

    public final User getUserProfile() {
        return (User) PrefsManager.Companion.get().getObject(PrefsManager.PREF_PROFILE_DATA, User.class);
    }

    public final void saveLowAmount(String str) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        PrefsManager.Companion.get().save(PrefsManager.LOW_BALANCE, str);
    }

    @JvmStatic
    public static final String getLowAmount() {
        String string = PrefsManager.Companion.get().getString(PrefsManager.LOW_BALANCE, "");
        return string == null ? "" : string;
    }

    public final void saveLiveMatch(MyMatchesModel myMatchesModel) {
        Intrinsics.checkNotNullParameter(myMatchesModel, "liveMatchesModel");
        PrefsManager.Companion.get().save(PrefsManager.LIVE_MATCH, (Object) myMatchesModel);
    }

    public final MyMatchesModel getLiveMatch() {
        return (MyMatchesModel) PrefsManager.Companion.get().getObject(PrefsManager.LIVE_MATCH, MyMatchesModel.class);
    }

    public final void saveMegaWinner(MegaWinnersM megaWinnersM) {
        PrefsManager prefsManager = PrefsManager.Companion.get();
        Intrinsics.checkNotNull(megaWinnersM);
        prefsManager.save(PrefsManager.MEGA_WINNER_MODEL, (Object) megaWinnersM);
    }

    public final MegaWinnersM getMegaWinner() {
        return (MegaWinnersM) PrefsManager.Companion.get().getObject(PrefsManager.MEGA_WINNER_MODEL, MegaWinnersM.class);
    }

    public final void saveMatch(UpcomingMatchModel upcomingMatchModel) {
        Intrinsics.checkNotNullParameter(upcomingMatchModel, "upcomingMatchModel");
        PrefsManager.Companion.get().save(PrefsManager.UPCOMING_MATCH_DATA, (Object) upcomingMatchModel);
    }

    public final UpcomingMatchModel getMatch() {
        return (UpcomingMatchModel) PrefsManager.Companion.get().getObject(PrefsManager.UPCOMING_MATCH_DATA, UpcomingMatchModel.class);
    }

    public final void saveRewardPlayerData(RewardPlayerData rewardPlayerData) {
        Intrinsics.checkNotNullParameter(rewardPlayerData, "upcomingMatchModel");
        PrefsManager.Companion.get().save(PrefsManager.REWARD_PLAYER, (Object) rewardPlayerData);
    }

    public final RewardPlayerData getRewardPlayerData() {
        return (RewardPlayerData) PrefsManager.Companion.get().getObject(PrefsManager.REWARD_PLAYER, RewardPlayerData.class);
    }

    public final void saveAppSettings(SettingsModel settingsModel) {
        Intrinsics.checkNotNullParameter(settingsModel, "userProfile");
        PrefsManager.Companion.get().save(PrefsManager.APP_SETTINGS, (Object) settingsModel);
    }

    public final SettingsModel getAppSettings() {
        return (SettingsModel) PrefsManager.Companion.get().getObject(PrefsManager.APP_SETTINGS, SettingsModel.class);
    }

    public final void saveClick(int i) {
        PrefsManager.Companion.get().save(PrefsManager.SAVE_NAV, i);
    }

    public final int getClick() {
        return PrefsManager.Companion.get().getInt(PrefsManager.SAVE_NAV, 0);
    }

    public final void saveContestClick(int i) {
        PrefsManager.Companion.get().save(PrefsManager.SAVE_NAV, i);
    }

    public final int getContestClick() {
        return PrefsManager.Companion.get().getInt(PrefsManager.SAVE_NAV, 0);
    }

    public final void saveToken(String str) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        PrefsManager.Companion.get().save(PrefsManager.PREF_ACCESS_TOKEN, str);
    }

    @JvmStatic
    public static final String getAccessToken() {
        String string = PrefsManager.Companion.get().getString(PrefsManager.PREF_ACCESS_TOKEN, "");
        return string == null ? "" : string;
    }

    public final void saveContacts(String str) {
        Intrinsics.checkNotNullParameter(str, "contactList");
        PrefsManager.Companion.get().save(PrefsManager.GET_CONTACTS, str);
    }

    public final String getContacts() {
        String string = PrefsManager.Companion.get().getString(PrefsManager.GET_CONTACTS, "");
        return string == null ? "" : string;
    }

    public final void saveCertificate(String str) {
        Intrinsics.checkNotNullParameter(str, "certificateUrl");
        PrefsManager.Companion.get().save(PrefsManager.CERTIFICATE_URL, str);
    }

    public final String getCertificate() {
        String string = PrefsManager.Companion.get().getString(PrefsManager.CERTIFICATE_URL, "");
        return string == null ? "" : string;
    }

    @JvmStatic
    public static final void saveCode(String str) {
        Intrinsics.checkNotNullParameter(str, "code");
        PrefsManager.Companion.get().save(PrefsManager.REFER_CODE, str);
    }

    public final String getCode() {
        String string = PrefsManager.Companion.get().getString(PrefsManager.REFER_CODE, "");
        return string == null ? "" : string;
    }

    public final void saveEvent(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "event");
        PrefsManager.Companion.get().save(str, str2);
    }

    public final String getEvent(String str) {
        Intrinsics.checkNotNullParameter(str, "event");
        String string = PrefsManager.Companion.get().getString(str, "");
        return string == null ? "" : string;
    }

    public final void removeEvent(String str) {
        Intrinsics.checkNotNullParameter(str, "event");
        PrefsManager.Companion.get().remove(str);
    }

    public final void saveMatchId(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        PrefsManager.Companion.get().save(PrefsManager.MATCH_ID, str);
    }

    public final String getMatchId() {
        String string = PrefsManager.Companion.get().getString(PrefsManager.MATCH_ID, "");
        return string == null ? "" : string;
    }

    public final void saveContestData(CreateContestRequest createContestRequest) {
        Intrinsics.checkNotNullParameter(createContestRequest, "createContestRequest");
        PrefsManager.Companion.get().save(PrefsManager.CONTEST_DATA, (Object) createContestRequest);
    }

    public final CreateContestRequest getContestData() {
        return (CreateContestRequest) PrefsManager.Companion.get().getObject(PrefsManager.CONTEST_DATA, CreateContestRequest.class);
    }

    public final void saveFCMToken(String str) {
        Intrinsics.checkNotNullParameter(str, "s");
        PrefsManager.Companion.get().save(PrefsManager.FCM_TOKEN, str);
    }

    public final String getFCMToken() {
        String string = PrefsManager.Companion.get().getString(PrefsManager.FCM_TOKEN, "");
        return string == null ? "" : string;
    }
}
