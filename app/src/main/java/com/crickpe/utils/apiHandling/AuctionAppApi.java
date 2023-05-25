package com.crickpe.utils.apiHandling;

import com.crickpe.data.CommonRequestBody;
import com.crickpe.data.CreateContestRequest;
import com.crickpe.data.EditProfileRequest;
import com.crickpe.data.JoinContestBody;
import com.crickpe.data.JoinContestWithCodeBody;
import com.crickpe.data.RewardPlayerRequest;
import com.crickpe.data.TopUpRequest;
import com.crickpe.data.UpdateTeamBody;
import com.crickpe.data.WithdrawRequest;
import com.crickpe.data.leaderboard.LeaderboardModel;
import com.crickpe.view.detail.fragments.contest_winners.models.model.ContestDetailWinnersModel;
import com.crickpe.view.detail.fragments.contest_winners.models.model.MegaContestAmtModel;
import com.crickpe.view.detail.fragments.create_contest.CalculateWinModel;
import com.crickpe.view.detail.fragments.create_contest.models.PreviousContactsModel;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.InviteSentModel;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.SendInviteRequest;
import com.crickpe.view.detail.fragments.create_own_team.create_team.CreateFantasyTeamModel;
import com.crickpe.view.detail.fragments.create_own_team.create_team.JoinContestModel;
import com.crickpe.view.detail.fragments.create_own_team.create_team.PlayersModel;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.TopContestModel;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamIdsModelItem;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamListModel;
import com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams.FantasyTeamPlayers;
import com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel;
import com.crickpe.view.detail.fragments.my_matches_detail.MyMatchDetailModel;
import com.crickpe.view.detail.fragments.my_matches_detail.PlayersPotModel;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.ScorecardModel;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.winnings.ContestWinningsModel;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerRewardModel;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerStatsModel;
import com.crickpe.view.detail.fragments.select_team.model.WalletInfoModel;
import com.crickpe.view.detail.fragments.settings.models.ProfileModelNew;
import com.crickpe.view.detail.fragments.top_players.models.TopPlayersModel;
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.detail.fragments.wallet.easybuzz_models.EasybuzzGatwayModel;
import com.crickpe.view.detail.fragments.wallet.models.WalletModal;
import com.crickpe.view.detail.fragments.wallet.my_banks_list.BankDetails;
import com.crickpe.view.detail.fragments.wallet.payment_model.CreatePaymentLinkModel;
import com.crickpe.view.detail.fragments.wallet.payment_model.PaymentCheckModel;
import com.crickpe.view.home.fragments.home.BannerListModelItem;
import com.crickpe.view.home.fragments.home.HomeDataModel;
import com.crickpe.view.home.fragments.home.NationalityModel;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import com.crickpe.view.home.fragments.rewards.my_reward_model.MyRewardModelItem;
import com.crickpe.view.home.fragments.rewards.tracker_model.TrackerModel;
import com.crickpe.view.home.fragments.winner.models.MegaWinnersM;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.kyc.models.AllStatesData;
import com.crickpe.view.intro.fragments.kyc.models.SubmitAadharModelX;
import com.crickpe.view.intro.fragments.kyc.models.TeamCountryData;
import com.crickpe.view.intro.fragments.splash.models.BootAppModel;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(mo48221d1 = {"\u0000\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00012\u00020\u0001:\u0002\u0001J:\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\bH'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J\u001e\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0013H'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0016H'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0019H'J$\u0010\u001a\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d0\u00040\u0003H'J\u0014\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u0003H'J$\u0010 \u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020!0\u001bj\b\u0012\u0004\u0012\u00020!`\u001d0\u00040\u0003H'J\u0014\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u00040\u0003H'J2\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\u00040\u00032\b\b\u0001\u0010&\u001a\u00020\b2\b\b\u0001\u0010'\u001a\u00020\b2\b\b\u0001\u0010(\u001a\u00020\bH'J\u001e\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00040\u00032\b\b\u0001\u0010+\u001a\u00020\bH'J8\u0010,\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020-0\u001bj\b\u0012\u0004\u0012\u00020-`\u001d0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010.\u001a\u00020/H'J.\u00100\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002010\u001bj\b\u0012\u0004\u0012\u000201`\u001d0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\bH'J2\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002030\u00040\u00032\b\b\u0001\u0010.\u001a\u00020/2\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u00104\u001a\u00020\bH'J\u001e\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\bH'J2\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u00108\u001a\u00020\b2\b\b\u0001\u00104\u001a\u00020\b2\b\b\u0001\u00109\u001a\u00020\bH'J.\u0010:\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020;0\u001bj\b\u0012\u0004\u0012\u00020;`\u001d0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\bH'J.\u0010<\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020=0\u001bj\b\u0012\u0004\u0012\u00020=`\u001d0\u00040\u00032\b\b\u0001\u0010>\u001a\u00020\bH'J.\u0010?\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002010\u001bj\b\u0012\u0004\u0012\u000201`\u001d0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J\u0014\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00040\u0003H'J\u0014\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020D0\u00040\u0003H'J\u001e\u0010E\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020F0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J\u001e\u0010G\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020H0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J\u001e\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J.\u0010K\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020L0\u001bj\b\u0012\u0004\u0012\u00020L`\u001d0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J.\u0010M\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020N0\u001bj\b\u0012\u0004\u0012\u00020N`\u001d0\u00040\u00032\b\b\u0001\u0010.\u001a\u00020\bH'J.\u0010O\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020P0\u001bj\b\u0012\u0004\u0012\u00020P`\u001d0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J.\u0010Q\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020R0\u001bj\b\u0012\u0004\u0012\u00020R`\u001d0\u00040\u00032\b\b\u0001\u00104\u001a\u00020\bH'J$\u0010S\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020T0\u001bj\b\u0012\u0004\u0012\u00020T`\u001d0\u00040\u0003H'J$\u0010U\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020V0\u001bj\b\u0012\u0004\u0012\u00020V`\u001d0\u00040\u0003H'J.\u0010W\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020X0\u001bj\b\u0012\u0004\u0012\u00020X`\u001d0\u00040\u00032\b\b\u0001\u0010>\u001a\u00020\bH'J\u001e\u0010Y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0\u00040\u00032\b\b\u0001\u0010[\u001a\u00020\bH'J\u001e\u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J\u001e\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J$\u0010`\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020a0\u001bj\b\u0012\u0004\u0012\u00020a`\u001d0\u00040\u0003H'J\u0014\u0010b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020c0\u00040\u0003H'J\u001e\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020e0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J\u0014\u0010f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020B0\u00040\u0003H'J$\u0010g\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020X0\u001bj\b\u0012\u0004\u0012\u00020X`\u001d0\u00040\u0003H'J.\u0010h\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020P0\u001bj\b\u0012\u0004\u0012\u00020P`\u001d0\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\bH'J(\u0010i\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020j0\u00040\u00032\b\b\u0001\u0010k\u001a\u00020\b2\b\b\u0001\u0010.\u001a\u00020/H'J.\u0010l\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020m0\u001bj\b\u0012\u0004\u0012\u00020m`\u001d0\u00040\u00032\b\b\u0001\u0010.\u001a\u00020/H'J.\u0010n\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020J0\u001bj\b\u0012\u0004\u0012\u00020J`\u001d0\u00040\u00032\b\b\u0001\u0010.\u001a\u00020/H'J(\u0010o\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\b2\b\b\u0001\u0010q\u001a\u00020\bH'J\u001e\u0010r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020s0\u00040\u00032\b\b\u0001\u0010.\u001a\u00020/H'J\u001e\u0010t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020u0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0016H'J\u001e\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020xH'J\u001e\u0010y\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020zH'J:\u0010{\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH'J:\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00040\u00032$\b\u0001\u0010\u000f\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH'J\u001e\u0010}\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020~0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020H'J2\u0010\u0001\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\u0005\u0012\u00030\u00010\u001bj\t\u0012\u0005\u0012\u00030\u0001`\u001d0\u00040\u00032\t\b\u0001\u0010\u000f\u001a\u00030\u0001H'J<\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH'JD\u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010\u00040\u00032\t\b\u0001\u0010\u0001\u001a\u00020\u00192\t\b\u0001\u0010\u0001\u001a\u00020\u00192\n\b\u0001\u0010\u0001\u001a\u00030\u00012\n\b\u0001\u0010\u0001\u001a\u00030\u0001H'J;\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH'J;\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH'J;\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH'J;\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032$\b\u0001\u0010\u0006\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`\tH'J7\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u00192\n\b\u0001\u0010\u0001\u001a\u00030\u00012\n\b\u0001\u0010\u0001\u001a\u00030\u0001H'J\u001f\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0016H'J*\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00040\u00032\b\b\u0001\u0010@\u001a\u00020\b2\t\b\u0001\u0010\u000f\u001a\u00030\u0001H'J \u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\t\b\u0001\u0010\u000f\u001a\u00030\u0001H'J \u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\t\b\u0001\u0010\u000f\u001a\u00030\u0001H'J \u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\t\b\u0001\u0010\u000f\u001a\u00030\u0001H'¨\u0006\u0001"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/AuctionAppApi;", "", "checkDevice", "Lretrofit2/Call;", "Lcom/crickpe/utils/apiHandling/ApiResponse;", "Lcom/crickpe/view/intro/fragments/User;", "hashMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "checkPaymentStatusApi", "Lcom/crickpe/view/detail/fragments/wallet/payment_model/PaymentCheckModel;", "contestId", "createContestApi", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "requestBody", "Lcom/crickpe/data/CreateContestRequest;", "createFantasyTeam", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateFantasyTeamModel;", "Lcom/crickpe/data/CommonRequestBody;", "createPaymentLink", "Lcom/crickpe/view/detail/fragments/wallet/payment_model/CreatePaymentLinkModel;", "Lcom/crickpe/data/TopUpRequest;", "editProfilePicApi", "body", "Lokhttp3/MultipartBody$Part;", "getAllStates", "Ljava/util/ArrayList;", "Lcom/crickpe/view/intro/fragments/kyc/models/AllStatesData;", "Lkotlin/collections/ArrayList;", "getBankListsApi", "Lcom/crickpe/view/detail/fragments/wallet/my_banks_list/BankDetails;", "getBanners", "Lcom/crickpe/view/home/fragments/home/BannerListModelItem;", "getBootApp", "Lcom/crickpe/view/intro/fragments/splash/models/BootAppModel;", "getCalculatedPrize", "Lcom/crickpe/view/detail/fragments/create_contest/CalculateWinModel;", "teams", "entryFee", "noOfWinner", "getContestDetailByCode", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestDetailModel;", "referalCode", "getContestLeaderboard", "Lcom/crickpe/data/leaderboard/LeaderboardModel;", "page", "", "getContestTeams", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "getContestWinnerDetail", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/ContestDetailWinnersModel;", "type", "getContestWinnings", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/winnings/ContestWinningsModel;", "getDigilockerDetail", "gateway", "client_id", "getFantasyTeamByContest", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamIdsModelItem;", "getFantasyTeamById", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamPlayers;", "teamId", "getFantasyTeamByMatch", "matchId", "getHealthApi", "Lcom/crickpe/view/intro/fragments/splash/models/boot_app_models/SettingsModel;", "getHomeDataApi", "Lcom/crickpe/view/home/fragments/home/HomeDataModel;", "getLiveScore", "Lcom/crickpe/view/detail/fragments/my_matches_detail/LiveScoreModel;", "getMatchDetail", "Lcom/crickpe/view/detail/fragments/my_matches_detail/MyMatchDetailModel;", "getMatchDetailByMatchId", "Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "getMegaContestAmount", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/MegaContestAmtModel;", "getMegaWinners", "Lcom/crickpe/view/home/fragments/winner/models/MegaWinnersM;", "getMyContestsApi", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "getMyMatches", "Lcom/crickpe/view/home/fragments/my_matches/MyMatchesModel;", "getMyRewardApi", "Lcom/crickpe/view/home/fragments/rewards/my_reward_model/MyRewardModelItem;", "getNationalityApi", "Lcom/crickpe/view/home/fragments/home/NationalityModel;", "getPlayerByCountryApi", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "getPlayerStats", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerStatsModel;", "playerId", "getPlayersByMatchApi", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/PlayersModel;", "getPlayersPot", "Lcom/crickpe/view/detail/fragments/my_matches_detail/PlayersPotModel;", "getPreviousContactsApi", "Lcom/crickpe/view/detail/fragments/create_contest/models/PreviousContactsModel;", "getProfile", "Lcom/crickpe/view/detail/fragments/settings/models/ProfileModelNew;", "getScorecard", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/ScorecardModel;", "getSettingsApi", "getTeamCountryApi", "getTopContestsApi", "getTopPlayersApi", "Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayersModel;", "filterId", "getTrackerApi", "Lcom/crickpe/view/home/fragments/rewards/tracker_model/TrackerModel;", "getUpcomingMatches", "getWalletInfoApi", "Lcom/crickpe/view/detail/fragments/select_team/model/WalletInfoModel;", "teamCount", "getWalletTransactionApi", "Lcom/crickpe/view/detail/fragments/wallet/models/WalletModal;", "initiatePaymentGatwayApi", "Lcom/crickpe/view/detail/fragments/wallet/easybuzz_models/EasybuzzGatwayModel;", "joinContestApi", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/JoinContestModel;", "Lcom/crickpe/data/JoinContestBody;", "joinContestWithCode", "Lcom/crickpe/data/JoinContestWithCodeBody;", "loginApi", "logout", "rewardPlayerApi", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerRewardModel;", "Lcom/crickpe/data/RewardPlayerRequest;", "sendInvite", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/InviteSentModel;", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/SendInviteRequest;", "submitAadhaarDetailApi", "Lcom/crickpe/view/intro/fragments/kyc/models/SubmitAadharModelX;", "submitAadhaarImages", "frontImage", "imageBack", "dateOfBirth", "Lokhttp3/RequestBody;", "stateId", "submitAadharOTPApi", "submitBankDetailApi", "submitOTPApi", "submitPanDetailApi", "submitProfileApi", "name", "referralCode", "topUp", "updateFantasyTeam", "Lcom/crickpe/data/UpdateTeamBody;", "updateProfileCall", "Lcom/crickpe/data/EditProfileRequest;", "withdrawAmountApi", "Lcom/crickpe/data/WithdrawRequest;", "withdrawAmountEaseBuzzApi", "Companion", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AuctionAppApi.kt */
public interface AuctionAppApi {
    public static final String APP_SETTINGS = "app/setting";
    public static final String BOOT_APP = "app/bootApp";
    public static final String CHECK_DEVICE = "user/checkDevice";
    public static final String CHECK_PAYMENT_STATUS = "payments/cashfree/checkPaymentStatus";
    public static final String CREATE_CONTEST = "contest/createContest";
    public static final String CREATE_FANTASY_TEAM = "match/createFantasyTeam";
    public static final String CREATE_PAYMENT_LINK = "payments/cashfree/createPaymentLink";
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String EDIT_PROFILE = "user/editProfile";
    public static final String EDIT_PROFILE_PIC = "user/editProfilePic";
    public static final String GET_BANKS_LIST = "user/getUserBank";
    public static final String GET_BANNER = "banner/getAllBanner";
    public static final String GET_CALCULATED_PRIZE = "user/calculatePrizeForUserContest";
    public static final String GET_CONTEST_DETAIL_BY_CODE = "contest/getContestDetailsByCode";
    public static final String GET_CONTEST_WINNER_DETAIL = "contest/winnersByContestId";
    public static final String GET_CONTEST_WINNINGS = "contest/winning";
    public static final String GET_FANTASY_TEAM = "match/getFantasyTeamById";
    public static final String GET_FANTASY_TEAM_BY_CONTEST_ID = "contest/getTeamByContestId";
    public static final String GET_FANTASY_TEAM_BY_MATCH_ID = "match/getFantasyTeams";
    public static final String GET_HOME_DATA = "match/homeApi";
    public static final String GET_LEADERBOARD = "contest/leaderboard";
    public static final String GET_LIVE_SCORE = "match/getLiveScore";
    public static final String GET_MATCH_DETAIL = "match/getMatchById";
    public static final String GET_MEGA_CONTEST_AMOUNT = "contest/getMegaContest";
    public static final String GET_MEGA_WINNERS = "contest/megaWinners";
    public static final String GET_MY_CONTEST_BY_MATCH_ID = "match/myContests";
    public static final String GET_MY_MATCH = "match/myMatches";
    public static final String GET_MY_MATCH_DETAIL = "match/matchDetails";
    public static final String GET_MY_REWARD = "reward/getMyReward";
    public static final String GET_NATIONALITY = "match/getNationality";
    public static final String GET_PLAYERS_BY_MATCH_ID = "match/getPlayers";
    public static final String GET_PLAYERS_POT = "match/getPlayerPots";
    public static final String GET_PLAYERS_STATS = "reward/getPlayerStats";
    public static final String GET_PLAYER_BY_COUNTRY = "reward/getPlayersByTeamId";
    public static final String GET_PREVIOUS_CONTACTS = "contest/getPreviousUsers";
    public static final String GET_PROFILE = "user/getProfile";
    public static final String GET_STATES = "auth/getAllStates";
    public static final String GET_TEAM_BY_CONTEST_ID = "contest/getTeamByContest";
    public static final String GET_TEAM_COUNTRY = "reward/getTeam";
    public static final String GET_TOP_CONTESTS_BY_MATCH_ID = "match/contests";
    public static final String GET_TOP_PLAYERS = "reward/getTopPlayers";
    public static final String GET_TRACKER = "reward/getRewardPlayers";
    public static final String GET_UPCOMING_MATCHES = "match/upcomingMatch";
    public static final String GET_WALLET_INFO = "contest/getWalletInfoByContest";
    public static final String HEALTH = "health";
    public static final String INITIATE_PAYMENT_GATWAY = "payments/easebuzz/initiateLink";
    public static final String JOIN_CONTEST = "contest/joinContest";
    public static final String JOIN_CONTEST_WITH_CODE = "contest/joinContestByReferalCode";
    public static final String LOGIN = "auth/loginRegister";
    public static final String LOGOUT = "user/logout";
    public static final String REWARD_PLAYER = "reward/rewardPlayer";
    public static final String SAVE_DIGI_LOCKER_DETAIL = "user/saveDigilockerDetails";
    public static final String SCORECARD = "match/getScoreCard";
    public static final String SEND_INVITE = "contest/sendContestInvite";
    public static final String SETUP_PROFILE = "user/setupProfile";
    public static final String SUBMIT_AADHAR = "user/submitAadhaarDetail";
    public static final String SUBMIT_AADHAR_IMAGES = "user/submitKyc";
    public static final String SUBMIT_AADHAR_OTP = "user/verifyAadhaarOtp";
    public static final String SUBMIT_BANK = "user/submitBankVerification";
    public static final String SUBMIT_OTP = "auth/submitOtp";
    public static final String SUBMIT_PAN = "user/submitPanCard";
    public static final String TOP_AMOUNT = "wallet/topUpAmount";
    public static final String UPDATE_TEAM = "match/editFantasyTeamByTeamId/{id}";
    public static final String WALLET_TRANSACTIONS = "wallet/getWallet";
    public static final String WITHDRAW_AMOUNT = "payments/cashfree/withdrawal";
    public static final String WITHDRAW_AMOUNT_EASEBUZZ = "payments/withdrawal";

    @FormUrlEncoded
    @POST("user/checkDevice")
    Call<ApiResponse<User>> checkDevice(@FieldMap HashMap<String, String> hashMap);

    @GET("payments/cashfree/checkPaymentStatus")
    Call<ApiResponse<PaymentCheckModel>> checkPaymentStatusApi(@Query("orderId") String str);

    @POST("contest/createContest")
    Call<ApiResponse<Contest>> createContestApi(@Body CreateContestRequest createContestRequest);

    @POST("match/createFantasyTeam")
    Call<ApiResponse<CreateFantasyTeamModel>> createFantasyTeam(@Body CommonRequestBody commonRequestBody);

    @POST("payments/cashfree/createPaymentLink")
    Call<ApiResponse<CreatePaymentLinkModel>> createPaymentLink(@Body TopUpRequest topUpRequest);

    @POST("user/editProfilePic")
    @Multipart
    Call<ApiResponse<User>> editProfilePicApi(@Part MultipartBody.Part part);

    @GET("auth/getAllStates")
    Call<ApiResponse<ArrayList<AllStatesData>>> getAllStates();

    @GET("user/getUserBank")
    Call<ApiResponse<BankDetails>> getBankListsApi();

    @GET("banner/getAllBanner")
    Call<ApiResponse<ArrayList<BannerListModelItem>>> getBanners();

    @GET("app/bootApp")
    Call<ApiResponse<BootAppModel>> getBootApp();

    @GET("user/calculatePrizeForUserContest")
    Call<ApiResponse<CalculateWinModel>> getCalculatedPrize(@Query("teams") String str, @Query("entryFee") String str2, @Query("noOfWinner") String str3);

    @GET("contest/getContestDetailsByCode")
    Call<ApiResponse<ContestDetailModel>> getContestDetailByCode(@Query("referalCode") String str);

    @GET("contest/leaderboard")
    Call<ApiResponse<ArrayList<LeaderboardModel>>> getContestLeaderboard(@Query("contestId") String str, @Query("page") int i);

    @GET("contest/getTeamByContest")
    Call<ApiResponse<ArrayList<FantasyTeamListModel>>> getContestTeams(@Query("contestId") String str);

    @GET("contest/winnersByContestId")
    Call<ApiResponse<ContestDetailWinnersModel>> getContestWinnerDetail(@Query("page") int i, @Query("contestId") String str, @Query("type") String str2);

    @GET("contest/winning")
    Call<ApiResponse<ContestWinningsModel>> getContestWinnings(@Query("contestId") String str);

    @GET("user/saveDigilockerDetails")
    Call<ApiResponse<User>> getDigilockerDetail(@Query("gateway") String str, @Query("type") String str2, @Query("client_id") String str3);

    @GET("contest/getTeamByContestId")
    Call<ApiResponse<ArrayList<FantasyTeamIdsModelItem>>> getFantasyTeamByContest(@Query("contestId") String str);

    @GET("match/getFantasyTeamById")
    Call<ApiResponse<ArrayList<FantasyTeamPlayers>>> getFantasyTeamById(@Query("teamId") String str);

    @GET("match/getFantasyTeams")
    Call<ApiResponse<ArrayList<FantasyTeamListModel>>> getFantasyTeamByMatch(@Query("matchId") String str);

    @GET("health")
    Call<ApiResponse<SettingsModel>> getHealthApi();

    @GET("match/homeApi")
    Call<ApiResponse<HomeDataModel>> getHomeDataApi();

    @GET("match/getLiveScore")
    Call<ApiResponse<LiveScoreModel>> getLiveScore(@Query("matchId") String str);

    @GET("match/matchDetails")
    Call<ApiResponse<MyMatchDetailModel>> getMatchDetail(@Query("matchId") String str);

    @GET("match/getMatchById")
    Call<ApiResponse<UpcomingMatchModel>> getMatchDetailByMatchId(@Query("matchId") String str);

    @GET("contest/getMegaContest")
        Call<ApiResponse<ArrayList<MegaContestAmtModel>>> getMegaContestAmount(@Query("matchId") String str);

    @GET("contest/megaWinners")
    Call<ApiResponse<ArrayList<MegaWinnersM>>> getMegaWinners(@Query("page") String str);

    @GET("match/myContests")
    Call<ApiResponse<ArrayList<TopContestModel>>> getMyContestsApi(@Query("matchId") String str);

    @GET("match/myMatches")
    Call<ApiResponse<ArrayList<MyMatchesModel>>> getMyMatches(@Query("type") String str);

    @GET("reward/getMyReward")
    Call<ApiResponse<ArrayList<MyRewardModelItem>>> getMyRewardApi();

    @GET("match/getNationality")
    Call<ApiResponse<ArrayList<NationalityModel>>> getNationalityApi();

    @GET("reward/getPlayersByTeamId")
    Call<ApiResponse<ArrayList<TeamCountryData>>> getPlayerByCountryApi(@Query("teamId") String str);

    @GET("reward/getPlayerStats")
    Call<ApiResponse<PlayerStatsModel>> getPlayerStats(@Query("playerId") String str);

    @GET("match/getPlayers")
    Call<ApiResponse<PlayersModel>> getPlayersByMatchApi(@Query("matchId") String str);

    @GET("match/getPlayerPots")
    Call<ApiResponse<PlayersPotModel>> getPlayersPot(@Query("matchId") String str);

    @GET("contest/getPreviousUsers")
    Call<ApiResponse<ArrayList<PreviousContactsModel>>> getPreviousContactsApi();

    @GET("user/getProfile")
    Call<ApiResponse<ProfileModelNew>> getProfile();

    @GET("match/getScoreCard")
    Call<ApiResponse<ScorecardModel>> getScorecard(@Query("matchId") String str);

    @GET("app/setting")
    Call<ApiResponse<SettingsModel>> getSettingsApi();

    @GET("reward/getTeam")
    Call<ApiResponse<ArrayList<TeamCountryData>>> getTeamCountryApi();

    @GET("match/contests")
    Call<ApiResponse<ArrayList<TopContestModel>>> getTopContestsApi(@Query("matchId") String str);

    @GET("reward/getTopPlayers")
    Call<ApiResponse<TopPlayersModel>> getTopPlayersApi(@Query("filterId") String str, @Query("page") int i);

    @GET("reward/getRewardPlayers")
    Call<ApiResponse<ArrayList<TrackerModel>>> getTrackerApi(@Query("page") int i);

    @GET("match/upcomingMatch")
    Call<ApiResponse<ArrayList<UpcomingMatchModel>>> getUpcomingMatches(@Query("page") int i);

    @GET("contest/getWalletInfoByContest")
    Call<ApiResponse<WalletInfoModel>> getWalletInfoApi(@Query("contestId") String str, @Query("teamCount") String str2);

    @GET("wallet/getWallet")
    Call<ApiResponse<WalletModal>> getWalletTransactionApi(@Query("page") int i);

    @POST("payments/easebuzz/initiateLink")
    Call<ApiResponse<EasybuzzGatwayModel>> initiatePaymentGatwayApi(@Body TopUpRequest topUpRequest);

    @POS ("contest/joinContest")
    Call<ApiResponse<JoinContestModel>> joinContestApi(@Body JoinContestBody joinContestBody);

    @POST("contest/joinContestByReferalCode")
    Call<ApiResponse<JoinContestModel>> joinContestWithCode(@Body JoinContestWithCodeBody joinContestWithCodeBody);

    @FormUrlEncoded
    @POST("auth/loginRegister")
    Call<ApiResponse<User>> loginApi(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("user/logout")
    Call<ApiResponse<Object>> logout(@FieldMap HashMap<String, String> hashMap);

    @POST("reward/rewardPlayer")
    Call<ApiResponse<PlayerRewardModel>> rewardPlayerApi(@Body RewardPlayerRequest rewardPlayerRequest);

    @POST("contest/sendContestInvite")
    Call<ApiResponse<ArrayList<InviteSentModel>>> sendInvite(@Body SendInviteRequest sendInviteRequest);

    @FormUrlEncoded
    @POST("user/submitAadhaarDetail")
    Call<ApiResponse<SubmitAadharModelX>> submitAadhaarDetailApi(@FieldMap HashMap<String, String> hashMap);

    @POST("user/submitKyc")
    @Multipart
    Call<ApiResponse<SubmitAadharModelX>> submitAadhaarImages(@Part MultipartBody.Part part, @Part MultipartBody.Part part2, @Part("dateOfBirth") RequestBody requestBody, @Part("stateId") RequestBody requestBody2);

    @FormUrlEncoded
    @POST("user/verifyAadhaarOtp")
    Call<ApiResponse<User>> submitAadharOTPApi(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("user/submitBankVerification")
    Call<ApiResponse<User>> submitBankDetailApi(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("auth/submitOtp")
    Call<ApiResponse<User>> submitOTPApi(@FieldMap HashMap<String, String> hashMap);

    @FormUrlEncoded
    @POST("user/submitPanCard")
    Call<ApiResponse<User>> submitPanDetailApi(@FieldMap HashMap<String, String> hashMap);

    @POST("user/setupProfile")
    @Multipart
    Call<ApiResponse<User>> submitProfileApi(@Part MultipartBody.Part part, @Part("name") RequestBody requestBody, @Part("referByNo") RequestBody requestBody2);

    @POST("wallet/topUpAmount")
    Call<ApiResponse<TopUpRequest>> topUp(@Body TopUpRequest topUpRequest);

    @PUT("match/editFantasyTeamByTeamId/{id}")
    Call<ApiResponse<CreateFantasyTeamModel>> updateFantasyTeam(@Path("id") String str, @Body UpdateTeamBody updateTeamBody);

    @POST("user/editProfile")
    Call<ApiResponse<User>> updateProfileCall(@Body EditProfileRequest editProfileRequest);

    @POST("payments/cashfree/withdrawal")
    Call<ApiResponse<TopUpRequest>> withdrawAmountApi(@Body WithdrawRequest withdrawRequest);

    @POST("payments/withdrawal")
    Call<ApiResponse<TopUpRequest>> withdrawAmountEaseBuzzApi(@Body WithdrawRequest withdrawRequest);

    @Metadata(mo48221d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bA\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006E"}, mo48222d2 = {"Lcom/crickpe/utils/apiHandling/AuctionAppApi$Companion;", "", "()V", "APP_SETTINGS", "", "BOOT_APP", "CHECK_DEVICE", "CHECK_PAYMENT_STATUS", "CREATE_CONTEST", "CREATE_FANTASY_TEAM", "CREATE_PAYMENT_LINK", "EDIT_PROFILE", "EDIT_PROFILE_PIC", "GET_BANKS_LIST", "GET_BANNER", "GET_CALCULATED_PRIZE", "GET_CONTEST_DETAIL_BY_CODE", "GET_CONTEST_WINNER_DETAIL", "GET_CONTEST_WINNINGS", "GET_FANTASY_TEAM", "GET_FANTASY_TEAM_BY_CONTEST_ID", "GET_FANTASY_TEAM_BY_MATCH_ID", "GET_HOME_DATA", "GET_LEADERBOARD", "GET_LIVE_SCORE", "GET_MATCH_DETAIL", "GET_MEGA_CONTEST_AMOUNT", "GET_MEGA_WINNERS", "GET_MY_CONTEST_BY_MATCH_ID", "GET_MY_MATCH", "GET_MY_MATCH_DETAIL", "GET_MY_REWARD", "GET_NATIONALITY", "GET_PLAYERS_BY_MATCH_ID", "GET_PLAYERS_POT", "GET_PLAYERS_STATS", "GET_PLAYER_BY_COUNTRY", "GET_PREVIOUS_CONTACTS", "GET_PROFILE", "GET_STATES", "GET_TEAM_BY_CONTEST_ID", "GET_TEAM_COUNTRY", "GET_TOP_CONTESTS_BY_MATCH_ID", "GET_TOP_PLAYERS", "GET_TRACKER", "GET_UPCOMING_MATCHES", "GET_WALLET_INFO", "HEALTH", "INITIATE_PAYMENT_GATWAY", "JOIN_CONTEST", "JOIN_CONTEST_WITH_CODE", "LOGIN", "LOGOUT", "REWARD_PLAYER", "SAVE_DIGI_LOCKER_DETAIL", "SCORECARD", "SEND_INVITE", "SETUP_PROFILE", "SUBMIT_AADHAR", "SUBMIT_AADHAR_IMAGES", "SUBMIT_AADHAR_OTP", "SUBMIT_BANK", "SUBMIT_OTP", "SUBMIT_PAN", "TOP_AMOUNT", "UPDATE_TEAM", "WALLET_TRANSACTIONS", "WITHDRAW_AMOUNT", "WITHDRAW_AMOUNT_EASEBUZZ", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: AuctionAppApi.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String APP_SETTINGS = "app/setting";
        public static final String BOOT_APP = "app/bootApp";
        public static final String CHECK_DEVICE = "user/checkDevice";
        public static final String CHECK_PAYMENT_STATUS = "payments/cashfree/checkPaymentStatus";
        public static final String CREATE_CONTEST = "contest/createContest";
        public static final String CREATE_FANTASY_TEAM = "match/createFantasyTeam";
        public static final String CREATE_PAYMENT_LINK = "payments/cashfree/createPaymentLink";
        public static final String EDIT_PROFILE = "user/editProfile";
        public static final String EDIT_PROFILE_PIC = "user/editProfilePic";
        public static final String GET_BANKS_LIST = "user/getUserBank";
        public static final String GET_BANNER = "banner/getAllBanner";
        public static final String GET_CALCULATED_PRIZE = "user/calculatePrizeForUserContest";
        public static final String GET_CONTEST_DETAIL_BY_CODE = "contest/getContestDetailsByCode";
        public static final String GET_CONTEST_WINNER_DETAIL = "contest/winnersByContestId";
        public static final String GET_CONTEST_WINNINGS = "contest/winning";
        public static final String GET_FANTASY_TEAM = "match/getFantasyTeamById";
        public static final String GET_FANTASY_TEAM_BY_CONTEST_ID = "contest/getTeamByContestId";
        public static final String GET_FANTASY_TEAM_BY_MATCH_ID = "match/getFantasyTeams";
        public static final String GET_HOME_DATA = "match/homeApi";
        public static final String GET_LEADERBOARD = "contest/leaderboard";
        public static final String GET_LIVE_SCORE = "match/getLiveScore";
        public static final String GET_MATCH_DETAIL = "match/getMatchById";
        public static final String GET_MEGA_CONTEST_AMOUNT = "contest/getMegaContest";
        public static final String GET_MEGA_WINNERS = "contest/megaWinners";
        public static final String GET_MY_CONTEST_BY_MATCH_ID = "match/myContests";
        public static final String GET_MY_MATCH = "match/myMatches";
        public static final String GET_MY_MATCH_DETAIL = "match/matchDetails";
        public static final String GET_MY_REWARD = "reward/getMyReward";
        public static final String GET_NATIONALITY = "match/getNationality";
        public static final String GET_PLAYERS_BY_MATCH_ID = "match/getPlayers";
        public static final String GET_PLAYERS_POT = "match/getPlayerPots";
        public static final String GET_PLAYERS_STATS = "reward/getPlayerStats";
        public static final String GET_PLAYER_BY_COUNTRY = "reward/getPlayersByTeamId";
        public static final String GET_PREVIOUS_CONTACTS = "contest/getPreviousUsers";
        public static final String GET_PROFILE = "user/getProfile";
        public static final String GET_STATES = "auth/getAllStates";
        public static final String GET_TEAM_BY_CONTEST_ID = "contest/getTeamByContest";
        public static final String GET_TEAM_COUNTRY = "reward/getTeam";
        public static final String GET_TOP_CONTESTS_BY_MATCH_ID = "match/contests";
        public static final String GET_TOP_PLAYERS = "reward/getTopPlayers";
        public static final String GET_TRACKER = "reward/getRewardPlayers";
        public static final String GET_UPCOMING_MATCHES = "match/upcomingMatch";
        public static final String GET_WALLET_INFO = "contest/getWalletInfoByContest";
        public static final String HEALTH = "health";
        public static final String INITIATE_PAYMENT_GATWAY = "payments/easebuzz/initiateLink";
        public static final String JOIN_CONTEST = "contest/joinContest";
        public static final String JOIN_CONTEST_WITH_CODE = "contest/joinContestByReferalCode";
        public static final String LOGIN = "auth/loginRegister";
        public static final String LOGOUT = "user/logout";
        public static final String REWARD_PLAYER = "reward/rewardPlayer";
        public static final String SAVE_DIGI_LOCKER_DETAIL = "user/saveDigilockerDetails";
        public static final String SCORECARD = "match/getScoreCard";
        public static final String SEND_INVITE = "contest/sendContestInvite";
        public static final String SETUP_PROFILE = "user/setupProfile";
        public static final String SUBMIT_AADHAR = "user/submitAadhaarDetail";
        public static final String SUBMIT_AADHAR_IMAGES = "user/submitKyc";
        public static final String SUBMIT_AADHAR_OTP = "user/verifyAadhaarOtp";
        public static final String SUBMIT_BANK = "user/submitBankVerification";
        public static final String SUBMIT_OTP = "auth/submitOtp";
        public static final String SUBMIT_PAN = "user/submitPanCard";
        public static final String TOP_AMOUNT = "wallet/topUpAmount";
        public static final String UPDATE_TEAM = "match/editFantasyTeamByTeamId/{id}";
        public static final String WALLET_TRANSACTIONS = "wallet/getWallet";
        public static final String WITHDRAW_AMOUNT = "payments/cashfree/withdrawal";
        public static final String WITHDRAW_AMOUNT_EASEBUZZ = "payments/withdrawal";

        private Companion() {
        }
    }
}
