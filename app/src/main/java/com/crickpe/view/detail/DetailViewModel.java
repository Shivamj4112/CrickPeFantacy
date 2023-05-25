package com.crickpe.view.detail;

import androidx.lifecycle.ViewModel;
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
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.RetrofitClient;
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
import com.crickpe.view.home.fragments.home.HomeDataModel;
import com.crickpe.view.home.fragments.rewards.my_reward_model.MyRewardModelItem;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.kyc.models.AllStatesData;
import com.crickpe.view.intro.fragments.kyc.models.SubmitAadharModelX;
import com.crickpe.view.intro.fragments.kyc.models.TeamCountryData;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

@Metadata(mo48221d1 = {"\u0000Æ\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u0001J\u0011\u0010\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020!J\u0012\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030 \u0001J\u0012\u0010¡\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030¢\u0001J\u0012\u0010£\u0001\u001a\u00030\u00012\b\u0010¤\u0001\u001a\u00030\u0001J\u001b\u0010¥\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!2\b\u0010\u0001\u001a\u00030§\u0001J\u0007\u0010#\u001a\u00030\u0001J\b\u0010¨\u0001\u001a\u00030\u0001J#\u0010©\u0001\u001a\u00030\u00012\u0007\u0010ª\u0001\u001a\u00020!2\u0007\u0010«\u0001\u001a\u00020!2\u0007\u0010¬\u0001\u001a\u00020!J\u0011\u0010­\u0001\u001a\u00030\u00012\u0007\u0010®\u0001\u001a\u00020!J\u001b\u0010¯\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020!2\b\u0010°\u0001\u001a\u00030±\u0001J\u0010\u0010,\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020!J$\u0010²\u0001\u001a\u00030\u00012\b\u0010°\u0001\u001a\u00030±\u00012\u0007\u0010\u0001\u001a\u00020!2\u0007\u0010³\u0001\u001a\u00020!J\u0010\u0010\u0013\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020!J#\u0010´\u0001\u001a\u00030\u00012\u0007\u0010µ\u0001\u001a\u00020!2\u0007\u0010³\u0001\u001a\u00020!2\u0007\u0010¶\u0001\u001a\u00020!J\u0010\u00108\u001a\u00030\u00012\u0007\u0010·\u0001\u001a\u00020!J\u0011\u0010¸\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020!J\u0011\u0010¹\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\u0007\u0010=\u001a\u00030\u0001J\u0011\u0010º\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\u0011\u0010»\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\u0011\u0010¼\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\u0011\u0010½\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\u0011\u0010¾\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\b\u0010¿\u0001\u001a\u00030\u0001J\u0011\u0010À\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\u0011\u0010Á\u0001\u001a\u00030\u00012\u0007\u0010·\u0001\u001a\u00020!J\u0011\u0010Â\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\u0011\u0010Ã\u0001\u001a\u00030\u00012\u0007\u0010Ä\u0001\u001a\u00020!J\u0007\u0010Q\u001a\u00030\u0001J\b\u0010Å\u0001\u001a\u00030\u0001J\u0011\u0010Æ\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\b\u0010Ç\u0001\u001a\u00030\u0001J\u0011\u0010È\u0001\u001a\u00030\u00012\u0007\u0010¦\u0001\u001a\u00020!J\u0011\u0010V\u001a\u00030\u00012\b\u0010°\u0001\u001a\u00030±\u0001J\u0012\u0010É\u0001\u001a\u00030\u00012\b\u0010°\u0001\u001a\u00030±\u0001J\u001a\u0010Ê\u0001\u001a\u00030\u00012\u0007\u0010\u0001\u001a\u00020!2\u0007\u0010Ë\u0001\u001a\u00020!J\u0011\u0010^\u001a\u00030\u00012\b\u0010¤\u0001\u001a\u00030\u0001J\u0012\u0010Ì\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030Í\u0001J\u0012\u0010Î\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030Ï\u0001J.\u0010g\u001a\u00030\u00012%\u0010Ð\u0001\u001a \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0Ñ\u0001j\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!`Ò\u0001J\u0012\u0010Ó\u0001\u001a\u00030\u00012\b\u0010Ô\u0001\u001a\u00030Õ\u0001J\u0012\u0010Ö\u0001\u001a\u00030\u00012\b\u0010¤\u0001\u001a\u00030×\u0001J/\u0010Ø\u0001\u001a\u00030\u00012%\u0010Ù\u0001\u001a \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0Ñ\u0001j\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!`Ò\u0001J/\u0010Ú\u0001\u001a\u00030\u00012%\u0010Ù\u0001\u001a \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0Ñ\u0001j\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!`Ò\u0001J/\u0010Û\u0001\u001a\u00030\u00012%\u0010Ù\u0001\u001a \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0Ñ\u0001j\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!`Ò\u0001J/\u0010Ü\u0001\u001a\u00030\u00012%\u0010Ù\u0001\u001a \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!0Ñ\u0001j\u000f\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020!`Ò\u0001J\u001b\u0010Ý\u0001\u001a\u00030\u00012\u0007\u0010Þ\u0001\u001a\u00020!2\b\u0010°\u0001\u001a\u00030±\u0001J\u0012\u0010ß\u0001\u001a\u00030\u00012\b\u0010¤\u0001\u001a\u00030\u0001J\u0011\u0010à\u0001\u001a\u00030\u00012\u0007\u0010á\u0001\u001a\u00020!J\u0012\u0010â\u0001\u001a\u00030\u00012\b\u0010¤\u0001\u001a\u00030ã\u0001J\u0012\u0010ä\u0001\u001a\u00030\u00012\b\u0010å\u0001\u001a\u00030\u0001J\u0012\u0010\u0001\u001a\u00030\u00012\b\u0010¤\u0001\u001a\u00030æ\u0001J\u0012\u0010ç\u0001\u001a\u00030\u00012\b\u0010¤\u0001\u001a\u00030æ\u0001R\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR-\u0010\f\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\bR-\u0010\u001d\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001e0\rj\b\u0012\u0004\u0012\u00020\u001e`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\bR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\bR-\u0010#\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020$0\rj\b\u0012\u0004\u0012\u00020$`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\bR\u001d\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\bR\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\bR-\u0010,\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020-0\rj\b\u0012\u0004\u0012\u00020-`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\bR\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002000\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\bR-\u00102\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002030\rj\b\u0012\u0004\u0012\u000203`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010\bR\u001d\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\bR-\u00108\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020-0\rj\b\u0012\u0004\u0012\u00020-`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010\bR-\u0010:\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020;0\rj\b\u0012\u0004\u0012\u00020;`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010\bR\u001d\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010\bR\u001d\u0010@\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020A0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010\bR-\u0010C\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020D0\rj\b\u0012\u0004\u0012\u00020D`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010\bR-\u0010F\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020G0\rj\b\u0012\u0004\u0012\u00020G`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010\bR-\u0010I\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020J0\rj\b\u0012\u0004\u0012\u00020J`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u0010\bR-\u0010L\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u0002030\rj\b\u0012\u0004\u0012\u000203`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010\bR\u001d\u0010N\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020O0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u0010\bR-\u0010Q\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020R0\rj\b\u0012\u0004\u0012\u00020R`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010\bR-\u0010T\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020G0\rj\b\u0012\u0004\u0012\u00020G`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010\bR-\u0010V\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020A0\rj\b\u0012\u0004\u0012\u00020A`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010\bR\u001d\u0010X\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010\bR\u001d\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\\0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010\bR\u001d\u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020_0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b`\u0010\bR\u001d\u0010a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020b0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bc\u0010\bR\u001d\u0010d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020e0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bf\u0010\bR\u001d\u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020h0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bi\u0010\bR\u001d\u0010j\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020k0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010\bR\u001d\u0010m\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020n0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bo\u0010\bR\u001d\u0010p\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\br\u0010\bR\u001d\u0010s\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020t0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bu\u0010\bR\u001d\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020w0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\bx\u0010\bR-\u0010y\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020z0\rj\b\u0012\u0004\u0012\u00020z`\u000f0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b{\u0010\bR\u001d\u0010|\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\bR\u001e\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020}0\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR\u001f\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR\u001f\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR \u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR \u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR\u001f\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR\u001f\u0010\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR \u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\bR \u0010\u0001\u001a\u000f\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u00010\u00050\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u0001\u0010\b¨\u0006è\u0001"}, mo48222d2 = {"Lcom/crickpe/view/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "checkPaymentStatusCall", "Lcom/crickpe/utils/SingleLiveEvent;", "Lcom/crickpe/utils/apiHandling/ApiResponseHandler;", "Lcom/crickpe/view/detail/fragments/wallet/payment_model/PaymentCheckModel;", "getCheckPaymentStatusCall", "()Lcom/crickpe/utils/SingleLiveEvent;", "contestDetailModel", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/ContestDetailModel;", "getContestDetailModel", "contestLeaderBoard", "Ljava/util/ArrayList;", "Lcom/crickpe/data/leaderboard/LeaderboardModel;", "Lkotlin/collections/ArrayList;", "getContestLeaderBoard", "contestWinnings", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/winnings/ContestWinningsModel;", "getContestWinnings", "createContest", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "getCreateContest", "createFantasy", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/CreateFantasyTeamModel;", "getCreateFantasy", "createPaymentLink", "Lcom/crickpe/view/detail/fragments/wallet/payment_model/CreatePaymentLinkModel;", "getCreatePaymentLink", "fantasyTeamById", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamPlayers;", "getFantasyTeamById", "filterPlayers", "", "getFilterPlayers", "getAllStates", "Lcom/crickpe/view/intro/fragments/kyc/models/AllStatesData;", "getGetAllStates", "getBankLists", "Lcom/crickpe/view/detail/fragments/wallet/my_banks_list/BankDetails;", "getGetBankLists", "getCalculateWin", "Lcom/crickpe/view/detail/fragments/create_contest/CalculateWinModel;", "getGetCalculateWin", "getContestTeam", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamListModel;", "getGetContestTeam", "getContestWinnerDetails", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/ContestDetailWinnersModel;", "getGetContestWinnerDetails", "getCountryData", "Lcom/crickpe/view/intro/fragments/kyc/models/TeamCountryData;", "getGetCountryData", "getDigiLocker", "Lcom/crickpe/view/intro/fragments/User;", "getGetDigiLocker", "getFantasyTeam", "getGetFantasyTeam", "getFantasyTeamIds", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamIdsModelItem;", "getGetFantasyTeamIds", "getHomeDataApi", "Lcom/crickpe/view/home/fragments/home/HomeDataModel;", "getGetHomeDataApi", "getMatchDetailByMatchId", "Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "getGetMatchDetailByMatchId", "getMegaContestAmount", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/MegaContestAmtModel;", "getGetMegaContestAmount", "getMyContests", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/TopContestModel;", "getGetMyContests", "getMyReward", "Lcom/crickpe/view/home/fragments/rewards/my_reward_model/MyRewardModelItem;", "getGetMyReward", "getPlayerData", "getGetPlayerData", "getPlayersByMatchId", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/PlayersModel;", "getGetPlayersByMatchId", "getPreviousContacts", "Lcom/crickpe/view/detail/fragments/create_contest/models/PreviousContactsModel;", "getGetPreviousContacts", "getTopContests", "getGetTopContests", "getUpcomingMatches", "getGetUpcomingMatches", "getUserProfle", "Lcom/crickpe/view/detail/fragments/settings/models/ProfileModelNew;", "getGetUserProfle", "getWalletTransaction", "Lcom/crickpe/view/detail/fragments/wallet/models/WalletModal;", "getGetWalletTransaction", "initiatePaymentGatway", "Lcom/crickpe/view/detail/fragments/wallet/easybuzz_models/EasybuzzGatwayModel;", "getInitiatePaymentGatway", "joinContest", "Lcom/crickpe/view/detail/fragments/create_own_team/create_team/JoinContestModel;", "getJoinContest", "liveScore", "Lcom/crickpe/view/detail/fragments/my_matches_detail/LiveScoreModel;", "getLiveScore", "logout", "", "getLogout", "myMatchesdetail", "Lcom/crickpe/view/detail/fragments/my_matches_detail/MyMatchDetailModel;", "getMyMatchesdetail", "playerReward", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerRewardModel;", "getPlayerReward", "playerStats", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerStatsModel;", "getPlayerStats", "playersPot", "Lcom/crickpe/view/detail/fragments/my_matches_detail/PlayersPotModel;", "getPlayersPot", "scorecard", "Lcom/crickpe/view/detail/fragments/my_matches_detail/tabs/live_score/models/ScorecardModel;", "getScorecard", "sendInvite", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/InviteSentModel;", "getSendInvite", "submitAadhar", "Lcom/crickpe/view/intro/fragments/kyc/models/SubmitAadharModelX;", "getSubmitAadhar", "submitAadharImages", "getSubmitAadharImages", "submitAadharOtp", "getSubmitAadharOtp", "submitBank", "getSubmitBank", "topPlayers", "Lcom/crickpe/view/detail/fragments/top_players/models/TopPlayersModel;", "getTopPlayers", "topUpAmount", "Lcom/crickpe/data/TopUpRequest;", "getTopUpAmount", "updateProfile", "getUpdateProfile", "updateProfilePic", "getUpdateProfilePic", "walletInfo", "Lcom/crickpe/view/detail/fragments/select_team/model/WalletInfoModel;", "getWalletInfo", "withdrawAmount", "getWithdrawAmount", "apiSubmitAadhaarImages", "", "frontImage", "Lokhttp3/MultipartBody$Part;", "backImage", "dateOfBirth", "Lokhttp3/RequestBody;", "stateId", "checkPaymentStatus", "contestId", "createContestApi", "requestBody", "Lcom/crickpe/data/CreateContestRequest;", "createFantasyTeam", "Lcom/crickpe/data/CommonRequestBody;", "createPayment", "value", "editFantasyTeam", "matchId", "Lcom/crickpe/data/UpdateTeamBody;", "getBanksList", "getCalculateWinApi", "teams", "entryFee", "noOfWinner", "getContestDetailApiByCode", "referalCode", "getContestLeaderboardApi", "page", "", "getContestWinnerDetailApi", "type", "getDigilockerDetailApi", "gateway", "client_id", "teamId", "getFantasyTeamByContestApi", "getFantasyTeamByMatchApi", "getLiveScoreApi", "getMatchDetailApi", "getMatchDetailByMatchIdApi", "getMegaContestAmountApi", "getMyContest", "getMyRewards", "getPlayersByMatch", "getPlayersByTeamId", "getPlayersPotApi", "getPlayersStat", "playerId", "getProfileApi", "getScoreCardApi", "getTeamsCountryApi", "getTopContest", "getWalletTransection", "getWalletinfo", "teamCount", "joinContestApi", "Lcom/crickpe/data/JoinContestBody;", "joinContestWithCodeApi", "Lcom/crickpe/data/JoinContestWithCodeBody;", "fcmToken", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "rewardPlayer", "rewardPlayerRequest", "Lcom/crickpe/data/RewardPlayerRequest;", "sendInviteApi", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/SendInviteRequest;", "submitAadharDetail", "hashMap", "submitAadharOTP", "submitBankDetail", "submitPanDetail", "topPlayersApi", "filterId", "topupApi", "updatePlayerFilter", "filter", "updateProfileApi", "Lcom/crickpe/data/EditProfileRequest;", "updateProfilePicApi", "body", "Lcom/crickpe/data/WithdrawRequest;", "withdrawAmountEaseBuzz", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: DetailViewModel.kt */
public final class DetailViewModel extends ViewModel {
    private final SingleLiveEvent<ApiResponseHandler<PaymentCheckModel>> checkPaymentStatusCall = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ContestDetailModel>> contestDetailModel = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<LeaderboardModel>>> contestLeaderBoard = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ContestWinningsModel>> contestWinnings = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<Contest>> createContest = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<CreateFantasyTeamModel>> createFantasy = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<CreatePaymentLinkModel>> createPaymentLink = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamPlayers>>> fantasyTeamById = new SingleLiveEvent<>();
    private final SingleLiveEvent<String> filterPlayers = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<AllStatesData>>> getAllStates = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<BankDetails>> getBankLists = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<CalculateWinModel>> getCalculateWin = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getContestTeam = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ContestDetailWinnersModel>> getContestWinnerDetails = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getCountryData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<User>> getDigiLocker = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getFantasyTeam = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamIdsModelItem>>> getFantasyTeamIds = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<HomeDataModel>> getHomeDataApi = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<UpcomingMatchModel>> getMatchDetailByMatchId = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<MegaContestAmtModel>>> getMegaContestAmount = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<TopContestModel>>> getMyContests = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<MyRewardModelItem>>> getMyReward = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getPlayerData = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<PlayersModel>> getPlayersByMatchId = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<PreviousContactsModel>>> getPreviousContacts = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<TopContestModel>>> getTopContests = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<UpcomingMatchModel>>> getUpcomingMatches = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ProfileModelNew>> getUserProfle = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<WalletModal>> getWalletTransaction = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<EasybuzzGatwayModel>> initiatePaymentGatway = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<JoinContestModel>> joinContest = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<LiveScoreModel>> liveScore = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<Object>> logout = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<MyMatchDetailModel>> myMatchesdetail = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<PlayerRewardModel>> playerReward = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<PlayerStatsModel>> playerStats = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<PlayersPotModel>> playersPot = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ScorecardModel>> scorecard = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<ArrayList<InviteSentModel>>> sendInvite = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<SubmitAadharModelX>> submitAadhar = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<SubmitAadharModelX>> submitAadharImages = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<User>> submitAadharOtp = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<User>> submitBank = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<TopPlayersModel>> topPlayers = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<TopUpRequest>> topUpAmount = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<User>> updateProfile = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<User>> updateProfilePic = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<WalletInfoModel>> walletInfo = new SingleLiveEvent<>();
    private final SingleLiveEvent<ApiResponseHandler<TopUpRequest>> withdrawAmount = new SingleLiveEvent<>();

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<UpcomingMatchModel>>> getGetUpcomingMatches() {
        return this.getUpcomingMatches;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<TopContestModel>>> getGetTopContests() {
        return this.getTopContests;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<TopContestModel>>> getGetMyContests() {
        return this.getMyContests;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getGetFantasyTeam() {
        return this.getFantasyTeam;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamIdsModelItem>>> getGetFantasyTeamIds() {
        return this.getFantasyTeamIds;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<LeaderboardModel>>> getContestLeaderBoard() {
        return this.contestLeaderBoard;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamPlayers>>> getFantasyTeamById() {
        return this.fantasyTeamById;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<MegaContestAmtModel>>> getGetMegaContestAmount() {
        return this.getMegaContestAmount;
    }

    public final SingleLiveEvent<ApiResponseHandler<ContestDetailWinnersModel>> getGetContestWinnerDetails() {
        return this.getContestWinnerDetails;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<FantasyTeamListModel>>> getGetContestTeam() {
        return this.getContestTeam;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<PreviousContactsModel>>> getGetPreviousContacts() {
        return this.getPreviousContacts;
    }

    public final SingleLiveEvent<ApiResponseHandler<ProfileModelNew>> getGetUserProfle() {
        return this.getUserProfle;
    }

    public final SingleLiveEvent<ApiResponseHandler<PlayersModel>> getGetPlayersByMatchId() {
        return this.getPlayersByMatchId;
    }

    public final SingleLiveEvent<ApiResponseHandler<UpcomingMatchModel>> getGetMatchDetailByMatchId() {
        return this.getMatchDetailByMatchId;
    }

    public final SingleLiveEvent<ApiResponseHandler<CreateFantasyTeamModel>> getCreateFantasy() {
        return this.createFantasy;
    }

    public final SingleLiveEvent<ApiResponseHandler<JoinContestModel>> getJoinContest() {
        return this.joinContest;
    }

    public final SingleLiveEvent<ApiResponseHandler<Contest>> getCreateContest() {
        return this.createContest;
    }

    public final SingleLiveEvent<ApiResponseHandler<Object>> getLogout() {
        return this.logout;
    }

    public final SingleLiveEvent<ApiResponseHandler<WalletInfoModel>> getWalletInfo() {
        return this.walletInfo;
    }

    public final SingleLiveEvent<ApiResponseHandler<PaymentCheckModel>> getCheckPaymentStatusCall() {
        return this.checkPaymentStatusCall;
    }

    public final SingleLiveEvent<ApiResponseHandler<User>> getGetDigiLocker() {
        return this.getDigiLocker;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<InviteSentModel>>> getSendInvite() {
        return this.sendInvite;
    }

    public final SingleLiveEvent<ApiResponseHandler<MyMatchDetailModel>> getMyMatchesdetail() {
        return this.myMatchesdetail;
    }

    public final SingleLiveEvent<ApiResponseHandler<ScorecardModel>> getScorecard() {
        return this.scorecard;
    }

    public final SingleLiveEvent<ApiResponseHandler<LiveScoreModel>> getLiveScore() {
        return this.liveScore;
    }

    public final SingleLiveEvent<ApiResponseHandler<PlayerStatsModel>> getPlayerStats() {
        return this.playerStats;
    }

    public final SingleLiveEvent<ApiResponseHandler<PlayerRewardModel>> getPlayerReward() {
        return this.playerReward;
    }

    public final SingleLiveEvent<ApiResponseHandler<PlayersPotModel>> getPlayersPot() {
        return this.playersPot;
    }

    public final SingleLiveEvent<ApiResponseHandler<ContestWinningsModel>> getContestWinnings() {
        return this.contestWinnings;
    }

    public final SingleLiveEvent<ApiResponseHandler<ContestDetailModel>> getContestDetailModel() {
        return this.contestDetailModel;
    }

    public final SingleLiveEvent<ApiResponseHandler<CalculateWinModel>> getGetCalculateWin() {
        return this.getCalculateWin;
    }

    public final SingleLiveEvent<ApiResponseHandler<User>> getUpdateProfile() {
        return this.updateProfile;
    }

    public final SingleLiveEvent<ApiResponseHandler<User>> getUpdateProfilePic() {
        return this.updateProfilePic;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<AllStatesData>>> getGetAllStates() {
        return this.getAllStates;
    }

    public final SingleLiveEvent<ApiResponseHandler<WalletModal>> getGetWalletTransaction() {
        return this.getWalletTransaction;
    }

    public final SingleLiveEvent<ApiResponseHandler<BankDetails>> getGetBankLists() {
        return this.getBankLists;
    }

    public final SingleLiveEvent<ApiResponseHandler<TopUpRequest>> getTopUpAmount() {
        return this.topUpAmount;
    }

    public final SingleLiveEvent<ApiResponseHandler<TopUpRequest>> getWithdrawAmount() {
        return this.withdrawAmount;
    }

    public final SingleLiveEvent<ApiResponseHandler<CreatePaymentLinkModel>> getCreatePaymentLink() {
        return this.createPaymentLink;
    }

    public final SingleLiveEvent<ApiResponseHandler<EasybuzzGatwayModel>> getInitiatePaymentGatway() {
        return this.initiatePaymentGatway;
    }

    public final SingleLiveEvent<ApiResponseHandler<TopPlayersModel>> getTopPlayers() {
        return this.topPlayers;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getGetCountryData() {
        return this.getCountryData;
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<TeamCountryData>>> getGetPlayerData() {
        return this.getPlayerData;
    }

    public final SingleLiveEvent<ApiResponseHandler<SubmitAadharModelX>> getSubmitAadhar() {
        return this.submitAadhar;
    }

    public final SingleLiveEvent<ApiResponseHandler<SubmitAadharModelX>> getSubmitAadharImages() {
        return this.submitAadharImages;
    }

    public final SingleLiveEvent<ApiResponseHandler<User>> getSubmitBank() {
        return this.submitBank;
    }

    public final SingleLiveEvent<ApiResponseHandler<User>> getSubmitAadharOtp() {
        return this.submitAadharOtp;
    }

    public final SingleLiveEvent<ApiResponseHandler<HomeDataModel>> getGetHomeDataApi() {
        return this.getHomeDataApi;
    }

    public final SingleLiveEvent<String> getFilterPlayers() {
        return this.filterPlayers;
    }

    public final void updatePlayerFilter(String str) {
        Intrinsics.checkNotNullParameter(str, "filter");
        this.filterPlayers.setValue(str);
    }

    public final SingleLiveEvent<ApiResponseHandler<ArrayList<MyRewardModelItem>>> getGetMyReward() {
        return this.getMyReward;
    }

    public final void getMyRewards() {
        this.getMyReward.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getMyRewardApi().enqueue(new DetailViewModel$getMyRewards$1(this));
    }

    public final void getHomeDataApi() {
        this.getHomeDataApi.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getHomeDataApi().enqueue(new DetailViewModel$getHomeDataApi$1(this));
    }

    public final void apiSubmitAadhaarImages(MultipartBody.Part part, MultipartBody.Part part2, RequestBody requestBody, RequestBody requestBody2) {
        Intrinsics.checkNotNullParameter(part, "frontImage");
        Intrinsics.checkNotNullParameter(part2, "backImage");
        Intrinsics.checkNotNullParameter(requestBody, "dateOfBirth");
        Intrinsics.checkNotNullParameter(requestBody2, "stateId");
        this.submitAadharImages.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().submitAadhaarImages(part, part2, requestBody, requestBody2).enqueue(new DetailViewModel$apiSubmitAadhaarImages$1(this));
    }

    public final void submitAadharDetail(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.submitAadhar.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().submitAadhaarDetailApi(hashMap).enqueue(new DetailViewModel$submitAadharDetail$1(this));
    }

    public final void submitPanDetail(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.submitBank.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().submitPanDetailApi(hashMap).enqueue(new DetailViewModel$submitPanDetail$1(this));
    }

    public final void submitBankDetail(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.submitBank.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().submitBankDetailApi(hashMap).enqueue(new DetailViewModel$submitBankDetail$1(this));
    }

    public final void submitAadharOTP(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "hashMap");
        this.submitAadharOtp.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().submitAadharOTPApi(hashMap).enqueue(new DetailViewModel$submitAadharOTP$1(this));
    }

    public final void getAllStates() {
        this.getAllStates.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getAllStates().enqueue(new DetailViewModel$getAllStates$1(this));
    }

    public final void getTeamsCountryApi() {
        this.getCountryData.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getTeamCountryApi().enqueue(new DetailViewModel$getTeamsCountryApi$1(this));
    }

    public final void getPlayersByTeamId(String str) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        this.getPlayerData.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getPlayerByCountryApi(str).enqueue(new DetailViewModel$getPlayersByTeamId$1(this));
    }

    public final void getBanksList() {
        this.getBankLists.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getBankListsApi().enqueue(new DetailViewModel$getBanksList$1(this));
    }

    public final void getWalletTransection(int i) {
        this.getWalletTransaction.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getWalletTransactionApi(i).enqueue(new DetailViewModel$getWalletTransection$1(this));
    }

    public final void getUpcomingMatches(int i) {
        this.getUpcomingMatches.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getUpcomingMatches(i).enqueue(new DetailViewModel$getUpcomingMatches$1(this));
    }

    public final void getProfileApi() {
        this.getUserProfle.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getProfile().enqueue(new DetailViewModel$getProfileApi$1(this));
    }

    public final void sendInviteApi(SendInviteRequest sendInviteRequest) {
        Intrinsics.checkNotNullParameter(sendInviteRequest, "value");
        this.sendInvite.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().sendInvite(sendInviteRequest).enqueue(new DetailViewModel$sendInviteApi$1(this));
    }

    public final void topupApi(TopUpRequest topUpRequest) {
        Intrinsics.checkNotNullParameter(topUpRequest, "value");
        this.topUpAmount.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().topUp(topUpRequest).enqueue(new DetailViewModel$topupApi$1(this));
    }

    public final void withdrawAmount(WithdrawRequest withdrawRequest) {
        Intrinsics.checkNotNullParameter(withdrawRequest, "value");
        this.withdrawAmount.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().withdrawAmountApi(withdrawRequest).enqueue(new DetailViewModel$withdrawAmount$1(this));
    }

    public final void withdrawAmountEaseBuzz(WithdrawRequest withdrawRequest) {
        Intrinsics.checkNotNullParameter(withdrawRequest, "value");
        this.withdrawAmount.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().withdrawAmountEaseBuzzApi(withdrawRequest).enqueue(new DetailViewModel$withdrawAmountEaseBuzz$1(this));
    }

    public final void createPayment(TopUpRequest topUpRequest) {
        Intrinsics.checkNotNullParameter(topUpRequest, "value");
        this.createPaymentLink.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().createPaymentLink(topUpRequest).enqueue(new DetailViewModel$createPayment$1(this));
    }

    public final void initiatePaymentGatway(TopUpRequest topUpRequest) {
        Intrinsics.checkNotNullParameter(topUpRequest, "value");
        this.initiatePaymentGatway.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().initiatePaymentGatwayApi(topUpRequest).enqueue(new DetailViewModel$initiatePaymentGatway$1(this));
    }

    public final void topPlayersApi(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "filterId");
        this.topPlayers.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getTopPlayersApi(str, i).enqueue(new DetailViewModel$topPlayersApi$1(this));
    }

    public final void updateProfileApi(EditProfileRequest editProfileRequest) {
        Intrinsics.checkNotNullParameter(editProfileRequest, "value");
        this.updateProfile.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().updateProfileCall(editProfileRequest).enqueue(new DetailViewModel$updateProfileApi$1(this));
    }

    public final void updateProfilePicApi(MultipartBody.Part part) {
        Intrinsics.checkNotNullParameter(part, "body");
        this.updateProfilePic.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().editProfilePicApi(part).enqueue(new DetailViewModel$updateProfilePicApi$1(this));
    }

    public final void getPlayersByMatch(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.getPlayersByMatchId.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getPlayersByMatchApi(str).enqueue(new DetailViewModel$getPlayersByMatch$1(this));
    }

    public final void getMatchDetailByMatchIdApi(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.getMatchDetailByMatchId.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getMatchDetailByMatchId(str).enqueue(new DetailViewModel$getMatchDetailByMatchIdApi$1(this));
    }

    public final void getTopContest(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.getTopContests.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getTopContestsApi(str).enqueue(new DetailViewModel$getTopContest$1(this));
    }

    public final void getMyContest(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.getMyContests.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getMyContestsApi(str).enqueue(new DetailViewModel$getMyContest$1(this));
    }

    public final void getFantasyTeamByMatchApi(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.getFantasyTeam.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getFantasyTeamByMatch(str).enqueue(new DetailViewModel$getFantasyTeamByMatchApi$1(this));
    }

    public final void getFantasyTeamByContestApi(String str) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        this.getFantasyTeamIds.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getFantasyTeamByContest(str).enqueue(new DetailViewModel$getFantasyTeamByContestApi$1(this));
    }

    public final void createFantasyTeam(CommonRequestBody commonRequestBody) {
        Intrinsics.checkNotNullParameter(commonRequestBody, "requestBody");
        this.createFantasy.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().createFantasyTeam(commonRequestBody).enqueue(new DetailViewModel$createFantasyTeam$1(this));
    }

    public final void editFantasyTeam(String str, UpdateTeamBody updateTeamBody) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        Intrinsics.checkNotNullParameter(updateTeamBody, "requestBody");
        this.createFantasy.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().updateFantasyTeam(str, updateTeamBody).enqueue(new DetailViewModel$editFantasyTeam$1(this));
    }

    public final void joinContestApi(JoinContestBody joinContestBody) {
        Intrinsics.checkNotNullParameter(joinContestBody, "requestBody");
        this.joinContest.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().joinContestApi(joinContestBody).enqueue(new DetailViewModel$joinContestApi$1(this));
    }

    public final void joinContestWithCodeApi(JoinContestWithCodeBody joinContestWithCodeBody) {
        Intrinsics.checkNotNullParameter(joinContestWithCodeBody, "requestBody");
        this.joinContest.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().joinContestWithCode(joinContestWithCodeBody).enqueue(new DetailViewModel$joinContestWithCodeApi$1(this));
    }

    public final void createContestApi(CreateContestRequest createContestRequest) {
        Intrinsics.checkNotNullParameter(createContestRequest, "requestBody");
        this.createContest.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().createContestApi(createContestRequest).enqueue(new DetailViewModel$createContestApi$1(this));
    }

    public final void getWalletinfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        Intrinsics.checkNotNullParameter(str2, "teamCount");
        this.walletInfo.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getWalletInfoApi(str, str2).enqueue(new DetailViewModel$getWalletinfo$1(this));
    }

    public final void checkPaymentStatus(String str) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        this.checkPaymentStatusCall.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().checkPaymentStatusApi(str).enqueue(new DetailViewModel$checkPaymentStatus$1(this));
    }

    public final void getDigilockerDetailApi(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "gateway");
        Intrinsics.checkNotNullParameter(str2, "type");
        Intrinsics.checkNotNullParameter(str3, "client_id");
        this.getDigiLocker.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getDigilockerDetail(str, str2, str3).enqueue(new DetailViewModel$getDigilockerDetailApi$1(this));
    }

    public final void getScoreCardApi(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.scorecard.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getScorecard(str).enqueue(new DetailViewModel$getScoreCardApi$1(this));
    }

    public final void getMatchDetailApi(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.myMatchesdetail.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getMatchDetail(str).enqueue(new DetailViewModel$getMatchDetailApi$1(this));
    }

    public final void rewardPlayer(RewardPlayerRequest rewardPlayerRequest) {
        Intrinsics.checkNotNullParameter(rewardPlayerRequest, "rewardPlayerRequest");
        this.playerReward.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().rewardPlayerApi(rewardPlayerRequest).enqueue(new DetailViewModel$rewardPlayer$1(this));
    }

    public final void getPlayersStat(String str) {
        Intrinsics.checkNotNullParameter(str, "playerId");
        this.playerStats.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getPlayerStats(str).enqueue(new DetailViewModel$getPlayersStat$1(this));
    }

    public final void getLiveScoreApi(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.liveScore.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getLiveScore(str).enqueue(new DetailViewModel$getLiveScoreApi$1(this));
    }

    public final void getPlayersPotApi(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.playersPot.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getPlayersPot(str).enqueue(new DetailViewModel$getPlayersPotApi$1(this));
    }

    public final void getContestWinnings(String str) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        this.contestWinnings.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getContestWinnings(str).enqueue(new DetailViewModel$getContestWinnings$1(this));
    }

    public final void getFantasyTeam(String str) {
        Intrinsics.checkNotNullParameter(str, "teamId");
        this.fantasyTeamById.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getFantasyTeamById(str).enqueue(new DetailViewModel$getFantasyTeam$1(this));
    }

    public final void getMegaContestAmountApi(String str) {
        Intrinsics.checkNotNullParameter(str, "matchId");
        this.getMegaContestAmount.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getMegaContestAmount(str).enqueue(new DetailViewModel$getMegaContestAmountApi$1(this));
    }

    public final void getContestLeaderboardApi(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        this.contestLeaderBoard.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getContestLeaderboard(str, i).enqueue(new DetailViewModel$getContestLeaderboardApi$1(this));
    }

    public final void getContestDetailApiByCode(String str) {
        Intrinsics.checkNotNullParameter(str, "referalCode");
        this.contestDetailModel.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getContestDetailByCode(str).enqueue(new DetailViewModel$getContestDetailApiByCode$1(this));
    }

    public final void getCalculateWinApi(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "teams");
        Intrinsics.checkNotNullParameter(str2, "entryFee");
        Intrinsics.checkNotNullParameter(str3, "noOfWinner");
        this.getCalculateWin.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getCalculatedPrize(str, str2, str3).enqueue(new DetailViewModel$getCalculateWinApi$1(this));
    }

    public final void getContestWinnerDetailApi(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        Intrinsics.checkNotNullParameter(str2, "type");
        this.getContestWinnerDetails.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getContestWinnerDetail(i, str, str2).enqueue(new DetailViewModel$getContestWinnerDetailApi$1(this));
    }

    public final void getContestTeam(String str) {
        Intrinsics.checkNotNullParameter(str, "contestId");
        this.getContestTeam.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getContestTeams(str).enqueue(new DetailViewModel$getContestTeam$1(this));
    }

    public final void getPreviousContacts() {
        this.getPreviousContacts.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().getPreviousContactsApi().enqueue(new DetailViewModel$getPreviousContacts$1(this));
    }

    public final void logout(HashMap<String, String> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "fcmToken");
        this.logout.setValue(ApiResponseHandler.Companion.loading());
        RetrofitClient.INSTANCE.getAuctionApi().logout(hashMap).enqueue(new DetailViewModel$logout$1(this));
    }
}
