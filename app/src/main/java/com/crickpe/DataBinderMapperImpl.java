package com.crickpe;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.databinding.AdapterBallCountBindingImpl;
import com.crickpe.databinding.AdapterBankLinkedBindingImpl;
import com.crickpe.databinding.AdapterBatterScoreBindingImpl;
import com.crickpe.databinding.AdapterBowlerScoreBindingImpl;
import com.crickpe.databinding.AdapterCompletedBindingImpl;
import com.crickpe.databinding.AdapterContactsBindingImpl;
import com.crickpe.databinding.AdapterContestTeamsBindingImpl;
import com.crickpe.databinding.AdapterCurrentMatchesBindingImpl;
import com.crickpe.databinding.AdapterFilterContestWinnersBindingImpl;
import com.crickpe.databinding.AdapterFilterTopPlayersBindingImpl;
import com.crickpe.databinding.AdapterFlagsBindingImpl;
import com.crickpe.databinding.AdapterHomeLiveMachesBindingImpl;
import com.crickpe.databinding.AdapterJoinedFriendsBindingImpl;
import com.crickpe.databinding.AdapterLeaderboardBindingImpl;
import com.crickpe.databinding.AdapterLivescoreBarBindingImpl;
import com.crickpe.databinding.AdapterMegaAmountBindingImpl;
import com.crickpe.databinding.AdapterMyCompletedContestsBindingImpl;
import com.crickpe.databinding.AdapterMyContestsBindingImpl;
import com.crickpe.databinding.AdapterMyLiveContestsBindingImpl;
import com.crickpe.databinding.AdapterMyRewardBindingImpl;
import com.crickpe.databinding.AdapterMyTeamsBindingImpl;
import com.crickpe.databinding.AdapterPlayersPotBindingImpl;
import com.crickpe.databinding.AdapterPlayersStatsBindingImpl;
import com.crickpe.databinding.AdapterPreviousContactsBindingImpl;
import com.crickpe.databinding.AdapterRecentEarningsBindingImpl;
import com.crickpe.databinding.AdapterRecentMatchBindingImpl;
import com.crickpe.databinding.AdapterSelectCaptainVcBindingImpl;
import com.crickpe.databinding.AdapterSelectTeamBindingImpl;
import com.crickpe.databinding.AdapterSelectedContactBindingImpl;
import com.crickpe.databinding.AdapterSequenceBindingImpl;
import com.crickpe.databinding.AdapterTopContestsBindingImpl;
import com.crickpe.databinding.AdapterTopPlayersBindingImpl;
import com.crickpe.databinding.AdapterTopPlayersHomePageBindingImpl;
import com.crickpe.databinding.AdapterTopupBindingImpl;
import com.crickpe.databinding.AdapterUpcomingMatchBindingImpl;
import com.crickpe.databinding.AdapterUpcomingMatchNewBindingImpl;
import com.crickpe.databinding.AdapterUpcomingMatchesBindingImpl;
import com.crickpe.databinding.AdapterUserRewardsBindingImpl;
import com.crickpe.databinding.AdapterWalletHistoryBindingImpl;
import com.crickpe.databinding.AdapterWinnersBindingImpl;
import com.crickpe.databinding.AdapterWinnersListBindingImpl;
import com.crickpe.databinding.AdapterWinnersRankBindingImpl;
import com.crickpe.databinding.AdapterWinningsBindingImpl;
import com.crickpe.databinding.FragmentCongratulationBindingImpl;
import com.crickpe.databinding.FragmentContestDetailBindingImpl;
import com.crickpe.databinding.FragmentContestWinnerBindingImpl;
import com.crickpe.databinding.FragmentCreateTeamBindingImpl;
import com.crickpe.databinding.FragmentJoinContestDetailBindingImpl;
import com.crickpe.databinding.FragmentPlayerRewardsBindingImpl;
import com.crickpe.databinding.FragmentPrivateContestDetailBindingImpl;
import com.crickpe.databinding.FragmentProfileBindingImpl;
import com.crickpe.databinding.FragmentReferToEarnBindingImpl;
import com.crickpe.databinding.FragmentRewardsBindingImpl;
import com.crickpe.databinding.FragmentSelectTeamBindingImpl;
import com.crickpe.databinding.FragmentSettingsBindingImpl;
import com.crickpe.databinding.FragmentShareContestBindingImpl;
import com.crickpe.databinding.FragmentShareRequestBindingImpl;
import com.crickpe.databinding.FragmentTopPlayersBindingImpl;
import com.crickpe.databinding.FragmentWalletBindingImpl;
import com.crickpe.databinding.LayoutSelectTeamBindingImpl;
import com.crickpe.databinding.ProgressLayoutBindingImpl;
import com.crickpe.databinding.SampleDesignBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_ADAPTERBALLCOUNT = 1;
    private static final int LAYOUT_ADAPTERBANKLINKED = 2;
    private static final int LAYOUT_ADAPTERBATTERSCORE = 3;
    private static final int LAYOUT_ADAPTERBOWLERSCORE = 4;
    private static final int LAYOUT_ADAPTERCOMPLETED = 5;
    private static final int LAYOUT_ADAPTERCONTACTS = 6;
    private static final int LAYOUT_ADAPTERCONTESTTEAMS = 7;
    private static final int LAYOUT_ADAPTERCURRENTMATCHES = 8;
    private static final int LAYOUT_ADAPTERFILTERCONTESTWINNERS = 9;
    private static final int LAYOUT_ADAPTERFILTERTOPPLAYERS = 10;
    private static final int LAYOUT_ADAPTERFLAGS = 11;
    private static final int LAYOUT_ADAPTERHOMELIVEMACHES = 12;
    private static final int LAYOUT_ADAPTERJOINEDFRIENDS = 13;
    private static final int LAYOUT_ADAPTERLEADERBOARD = 14;
    private static final int LAYOUT_ADAPTERLIVESCOREBAR = 15;
    private static final int LAYOUT_ADAPTERMEGAAMOUNT = 16;
    private static final int LAYOUT_ADAPTERMYCOMPLETEDCONTESTS = 17;
    private static final int LAYOUT_ADAPTERMYCONTESTS = 18;
    private static final int LAYOUT_ADAPTERMYLIVECONTESTS = 19;
    private static final int LAYOUT_ADAPTERMYREWARD = 20;
    private static final int LAYOUT_ADAPTERMYTEAMS = 21;
    private static final int LAYOUT_ADAPTERPLAYERSPOT = 22;
    private static final int LAYOUT_ADAPTERPLAYERSSTATS = 23;
    private static final int LAYOUT_ADAPTERPREVIOUSCONTACTS = 24;
    private static final int LAYOUT_ADAPTERRECENTEARNINGS = 25;
    private static final int LAYOUT_ADAPTERRECENTMATCH = 26;
    private static final int LAYOUT_ADAPTERSELECTCAPTAINVC = 27;
    private static final int LAYOUT_ADAPTERSELECTEDCONTACT = 29;
    private static final int LAYOUT_ADAPTERSELECTTEAM = 28;
    private static final int LAYOUT_ADAPTERSEQUENCE = 30;
    private static final int LAYOUT_ADAPTERTOPCONTESTS = 31;
    private static final int LAYOUT_ADAPTERTOPPLAYERS = 32;
    private static final int LAYOUT_ADAPTERTOPPLAYERSHOMEPAGE = 33;
    private static final int LAYOUT_ADAPTERTOPUP = 34;
    private static final int LAYOUT_ADAPTERUPCOMINGMATCH = 35;
    private static final int LAYOUT_ADAPTERUPCOMINGMATCHES = 37;
    private static final int LAYOUT_ADAPTERUPCOMINGMATCHNEW = 36;
    private static final int LAYOUT_ADAPTERUSERREWARDS = 38;
    private static final int LAYOUT_ADAPTERWALLETHISTORY = 39;
    private static final int LAYOUT_ADAPTERWINNERS = 40;
    private static final int LAYOUT_ADAPTERWINNERSLIST = 41;
    private static final int LAYOUT_ADAPTERWINNERSRANK = 42;
    private static final int LAYOUT_ADAPTERWINNINGS = 43;
    private static final int LAYOUT_FRAGMENTCONGRATULATION = 44;
    private static final int LAYOUT_FRAGMENTCONTESTDETAIL = 45;
    private static final int LAYOUT_FRAGMENTCONTESTWINNER = 46;
    private static final int LAYOUT_FRAGMENTCREATETEAM = 47;
    private static final int LAYOUT_FRAGMENTJOINCONTESTDETAIL = 48;
    private static final int LAYOUT_FRAGMENTPLAYERREWARDS = 49;
    private static final int LAYOUT_FRAGMENTPRIVATECONTESTDETAIL = 50;
    private static final int LAYOUT_FRAGMENTPROFILE = 51;
    private static final int LAYOUT_FRAGMENTREFERTOEARN = 52;
    private static final int LAYOUT_FRAGMENTREWARDS = 53;
    private static final int LAYOUT_FRAGMENTSELECTTEAM = 54;
    private static final int LAYOUT_FRAGMENTSETTINGS = 55;
    private static final int LAYOUT_FRAGMENTSHARECONTEST = 56;
    private static final int LAYOUT_FRAGMENTSHAREREQUEST = 57;
    private static final int LAYOUT_FRAGMENTTOPPLAYERS = 58;
    private static final int LAYOUT_FRAGMENTWALLET = 59;
    private static final int LAYOUT_LAYOUTSELECTTEAM = 60;
    private static final int LAYOUT_PROGRESSLAYOUT = 61;
    private static final int LAYOUT_SAMPLEDESIGN = 62;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(62);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(C1188R.C1193layout.adapter_ball_count, 1);
        sparseIntArray.put(C1188R.C1193layout.adapter_bank_linked, 2);
        sparseIntArray.put(C1188R.C1193layout.adapter_batter_score, 3);
        sparseIntArray.put(C1188R.C1193layout.adapter_bowler_score, 4);
        sparseIntArray.put(C1188R.C1193layout.adapter_completed, 5);
        sparseIntArray.put(C1188R.C1193layout.adapter_contacts, 6);
        sparseIntArray.put(C1188R.C1193layout.adapter_contest_teams, 7);
        sparseIntArray.put(C1188R.C1193layout.adapter_current_matches, 8);
        sparseIntArray.put(C1188R.C1193layout.adapter_filter_contest_winners, 9);
        sparseIntArray.put(C1188R.C1193layout.adapter_filter_top_players, 10);
        sparseIntArray.put(C1188R.C1193layout.adapter_flags, 11);
        sparseIntArray.put(C1188R.C1193layout.adapter_home_live_maches, 12);
        sparseIntArray.put(C1188R.C1193layout.adapter_joined_friends, 13);
        sparseIntArray.put(C1188R.C1193layout.adapter_leaderboard, 14);
        sparseIntArray.put(C1188R.C1193layout.adapter_livescore_bar, 15);
        sparseIntArray.put(C1188R.C1193layout.adapter_mega_amount, 16);
        sparseIntArray.put(C1188R.C1193layout.adapter_my_completed_contests, 17);
        sparseIntArray.put(C1188R.C1193layout.adapter_my_contests, 18);
        sparseIntArray.put(C1188R.C1193layout.adapter_my_live_contests, 19);
        sparseIntArray.put(C1188R.C1193layout.adapter_my_reward, 20);
        sparseIntArray.put(C1188R.C1193layout.adapter_my_teams, 21);
        sparseIntArray.put(C1188R.C1193layout.adapter_players_pot, 22);
        sparseIntArray.put(C1188R.C1193layout.adapter_players_stats, 23);
        sparseIntArray.put(C1188R.C1193layout.adapter_previous_contacts, 24);
        sparseIntArray.put(C1188R.C1193layout.adapter_recent_earnings, 25);
        sparseIntArray.put(C1188R.C1193layout.adapter_recent_match, 26);
        sparseIntArray.put(C1188R.C1193layout.adapter_select_captain_vc, 27);
        sparseIntArray.put(C1188R.C1193layout.adapter_select_team, 28);
        sparseIntArray.put(C1188R.C1193layout.adapter_selected_contact, 29);
        sparseIntArray.put(C1188R.C1193layout.adapter_sequence, 30);
        sparseIntArray.put(C1188R.C1193layout.adapter_top_contests, 31);
        sparseIntArray.put(C1188R.C1193layout.adapter_top_players, 32);
        sparseIntArray.put(C1188R.C1193layout.adapter_top_players_home_page, 33);
        sparseIntArray.put(C1188R.C1193layout.adapter_topup, 34);
        sparseIntArray.put(C1188R.C1193layout.adapter_upcoming_match, 35);
        sparseIntArray.put(C1188R.C1193layout.adapter_upcoming_match_new, 36);
        sparseIntArray.put(C1188R.C1193layout.adapter_upcoming_matches, 37);
        sparseIntArray.put(C1188R.C1193layout.adapter_user_rewards, 38);
        sparseIntArray.put(C1188R.C1193layout.adapter_wallet_history, 39);
        sparseIntArray.put(C1188R.C1193layout.adapter_winners, 40);
        sparseIntArray.put(C1188R.C1193layout.adapter_winners_list, 41);
        sparseIntArray.put(C1188R.C1193layout.adapter_winners_rank, 42);
        sparseIntArray.put(C1188R.C1193layout.adapter_winnings, 43);
        sparseIntArray.put(C1188R.C1193layout.fragment_congratulation, 44);
        sparseIntArray.put(C1188R.C1193layout.fragment_contest_detail, 45);
        sparseIntArray.put(C1188R.C1193layout.fragment_contest_winner, 46);
        sparseIntArray.put(C1188R.C1193layout.fragment_create_team, 47);
        sparseIntArray.put(C1188R.C1193layout.fragment_join_contest_detail, 48);
        sparseIntArray.put(C1188R.C1193layout.fragment_player_rewards, 49);
        sparseIntArray.put(C1188R.C1193layout.fragment_private_contest_detail, 50);
        sparseIntArray.put(C1188R.C1193layout.fragment_profile, 51);
        sparseIntArray.put(C1188R.C1193layout.fragment_refer_to_earn, 52);
        sparseIntArray.put(C1188R.C1193layout.fragment_rewards, 53);
        sparseIntArray.put(C1188R.C1193layout.fragment_select_team, 54);
        sparseIntArray.put(C1188R.C1193layout.fragment_settings, 55);
        sparseIntArray.put(C1188R.C1193layout.fragment_share_contest, 56);
        sparseIntArray.put(C1188R.C1193layout.fragment_share_request, 57);
        sparseIntArray.put(C1188R.C1193layout.fragment_top_players, 58);
        sparseIntArray.put(C1188R.C1193layout.fragment_wallet, 59);
        sparseIntArray.put(C1188R.C1193layout.layout_select_team, 60);
        sparseIntArray.put(C1188R.C1193layout.progress_layout, 61);
        sparseIntArray.put(C1188R.C1193layout.sample_design, 62);
    }

    private final ViewDataBinding internalGetViewDataBinding0(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 1:
                if ("layout/adapter_ball_count_0".equals(obj)) {
                    return new AdapterBallCountBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_ball_count is invalid. Received: " + obj);
            case 2:
                if ("layout/adapter_bank_linked_0".equals(obj)) {
                    return new AdapterBankLinkedBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bank_linked is invalid. Received: " + obj);
            case 3:
                if ("layout/adapter_batter_score_0".equals(obj)) {
                    return new AdapterBatterScoreBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_batter_score is invalid. Received: " + obj);
            case 4:
                if ("layout/adapter_bowler_score_0".equals(obj)) {
                    return new AdapterBowlerScoreBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_bowler_score is invalid. Received: " + obj);
            case 5:
                if ("layout/adapter_completed_0".equals(obj)) {
                    return new AdapterCompletedBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_completed is invalid. Received: " + obj);
            case 6:
                if ("layout/adapter_contacts_0".equals(obj)) {
                    return new AdapterContactsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_contacts is invalid. Received: " + obj);
            case 7:
                if ("layout/adapter_contest_teams_0".equals(obj)) {
                    return new AdapterContestTeamsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_contest_teams is invalid. Received: " + obj);
            case 8:
                if ("layout/adapter_current_matches_0".equals(obj)) {
                    return new AdapterCurrentMatchesBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_current_matches is invalid. Received: " + obj);
            case 9:
                if ("layout/adapter_filter_contest_winners_0".equals(obj)) {
                    return new AdapterFilterContestWinnersBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_filter_contest_winners is invalid. Received: " + obj);
            case 10:
                if ("layout/adapter_filter_top_players_0".equals(obj)) {
                    return new AdapterFilterTopPlayersBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_filter_top_players is invalid. Received: " + obj);
            case 11:
                if ("layout/adapter_flags_0".equals(obj)) {
                    return new AdapterFlagsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_flags is invalid. Received: " + obj);
            case 12:
                if ("layout/adapter_home_live_maches_0".equals(obj)) {
                    return new AdapterHomeLiveMachesBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_home_live_maches is invalid. Received: " + obj);
            case 13:
                if ("layout/adapter_joined_friends_0".equals(obj)) {
                    return new AdapterJoinedFriendsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_joined_friends is invalid. Received: " + obj);
            case 14:
                if ("layout/adapter_leaderboard_0".equals(obj)) {
                    return new AdapterLeaderboardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_leaderboard is invalid. Received: " + obj);
            case 15:
                if ("layout/adapter_livescore_bar_0".equals(obj)) {
                    return new AdapterLivescoreBarBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_livescore_bar is invalid. Received: " + obj);
            case 16:
                if ("layout/adapter_mega_amount_0".equals(obj)) {
                    return new AdapterMegaAmountBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_mega_amount is invalid. Received: " + obj);
            case 17:
                if ("layout/adapter_my_completed_contests_0".equals(obj)) {
                    return new AdapterMyCompletedContestsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_my_completed_contests is invalid. Received: " + obj);
            case 18:
                if ("layout/adapter_my_contests_0".equals(obj)) {
                    return new AdapterMyContestsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_my_contests is invalid. Received: " + obj);
            case 19:
                if ("layout/adapter_my_live_contests_0".equals(obj)) {
                    return new AdapterMyLiveContestsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_my_live_contests is invalid. Received: " + obj);
            case 20:
                if ("layout/adapter_my_reward_0".equals(obj)) {
                    return new AdapterMyRewardBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_my_reward is invalid. Received: " + obj);
            case 21:
                if ("layout/adapter_my_teams_0".equals(obj)) {
                    return new AdapterMyTeamsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_my_teams is invalid. Received: " + obj);
            case 22:
                if ("layout/adapter_players_pot_0".equals(obj)) {
                    return new AdapterPlayersPotBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_players_pot is invalid. Received: " + obj);
            case 23:
                if ("layout/adapter_players_stats_0".equals(obj)) {
                    return new AdapterPlayersStatsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_players_stats is invalid. Received: " + obj);
            case 24:
                if ("layout/adapter_previous_contacts_0".equals(obj)) {
                    return new AdapterPreviousContactsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_previous_contacts is invalid. Received: " + obj);
            case 25:
                if ("layout/adapter_recent_earnings_0".equals(obj)) {
                    return new AdapterRecentEarningsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_recent_earnings is invalid. Received: " + obj);
            case 26:
                if ("layout/adapter_recent_match_0".equals(obj)) {
                    return new AdapterRecentMatchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_recent_match is invalid. Received: " + obj);
            case 27:
                if ("layout/adapter_select_captain_vc_0".equals(obj)) {
                    return new AdapterSelectCaptainVcBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_select_captain_vc is invalid. Received: " + obj);
            case 28:
                if ("layout/adapter_select_team_0".equals(obj)) {
                    return new AdapterSelectTeamBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_select_team is invalid. Received: " + obj);
            case 29:
                if ("layout/adapter_selected_contact_0".equals(obj)) {
                    return new AdapterSelectedContactBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_selected_contact is invalid. Received: " + obj);
            case 30:
                if ("layout/adapter_sequence_0".equals(obj)) {
                    return new AdapterSequenceBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_sequence is invalid. Received: " + obj);
            case 31:
                if ("layout/adapter_top_contests_0".equals(obj)) {
                    return new AdapterTopContestsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_top_contests is invalid. Received: " + obj);
            case 32:
                if ("layout/adapter_top_players_0".equals(obj)) {
                    return new AdapterTopPlayersBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_top_players is invalid. Received: " + obj);
            case 33:
                if ("layout/adapter_top_players_home_page_0".equals(obj)) {
                    return new AdapterTopPlayersHomePageBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_top_players_home_page is invalid. Received: " + obj);
            case 34:
                if ("layout/adapter_topup_0".equals(obj)) {
                    return new AdapterTopupBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_topup is invalid. Received: " + obj);
            case 35:
                if ("layout/adapter_upcoming_match_0".equals(obj)) {
                    return new AdapterUpcomingMatchBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_upcoming_match is invalid. Received: " + obj);
            case 36:
                if ("layout/adapter_upcoming_match_new_0".equals(obj)) {
                    return new AdapterUpcomingMatchNewBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_upcoming_match_new is invalid. Received: " + obj);
            case 37:
                if ("layout/adapter_upcoming_matches_0".equals(obj)) {
                    return new AdapterUpcomingMatchesBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_upcoming_matches is invalid. Received: " + obj);
            case 38:
                if ("layout/adapter_user_rewards_0".equals(obj)) {
                    return new AdapterUserRewardsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_user_rewards is invalid. Received: " + obj);
            case 39:
                if ("layout/adapter_wallet_history_0".equals(obj)) {
                    return new AdapterWalletHistoryBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_wallet_history is invalid. Received: " + obj);
            case 40:
                if ("layout/adapter_winners_0".equals(obj)) {
                    return new AdapterWinnersBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_winners is invalid. Received: " + obj);
            case 41:
                if ("layout/adapter_winners_list_0".equals(obj)) {
                    return new AdapterWinnersListBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_winners_list is invalid. Received: " + obj);
            case 42:
                if ("layout/adapter_winners_rank_0".equals(obj)) {
                    return new AdapterWinnersRankBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_winners_rank is invalid. Received: " + obj);
            case 43:
                if ("layout/adapter_winnings_0".equals(obj)) {
                    return new AdapterWinningsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for adapter_winnings is invalid. Received: " + obj);
            case 44:
                if ("layout/fragment_congratulation_0".equals(obj)) {
                    return new FragmentCongratulationBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_congratulation is invalid. Received: " + obj);
            case 45:
                if ("layout/fragment_contest_detail_0".equals(obj)) {
                    return new FragmentContestDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contest_detail is invalid. Received: " + obj);
            case 46:
                if ("layout/fragment_contest_winner_0".equals(obj)) {
                    return new FragmentContestWinnerBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_contest_winner is invalid. Received: " + obj);
            case 47:
                if ("layout/fragment_create_team_0".equals(obj)) {
                    return new FragmentCreateTeamBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_create_team is invalid. Received: " + obj);
            case 48:
                if ("layout/fragment_join_contest_detail_0".equals(obj)) {
                    return new FragmentJoinContestDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_join_contest_detail is invalid. Received: " + obj);
            case 49:
                if ("layout/fragment_player_rewards_0".equals(obj)) {
                    return new FragmentPlayerRewardsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_player_rewards is invalid. Received: " + obj);
            case 50:
                if ("layout/fragment_private_contest_detail_0".equals(obj)) {
                    return new FragmentPrivateContestDetailBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_private_contest_detail is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    private final ViewDataBinding internalGetViewDataBinding1(DataBindingComponent dataBindingComponent, View view, int i, Object obj) {
        switch (i) {
            case 51:
                if ("layout/fragment_profile_0".equals(obj)) {
                    return new FragmentProfileBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + obj);
            case 52:
                if ("layout/fragment_refer_to_earn_0".equals(obj)) {
                    return new FragmentReferToEarnBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_refer_to_earn is invalid. Received: " + obj);
            case 53:
                if ("layout/fragment_rewards_0".equals(obj)) {
                    return new FragmentRewardsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_rewards is invalid. Received: " + obj);
            case 54:
                if ("layout/fragment_select_team_0".equals(obj)) {
                    return new FragmentSelectTeamBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_select_team is invalid. Received: " + obj);
            case 55:
                if ("layout/fragment_settings_0".equals(obj)) {
                    return new FragmentSettingsBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_settings is invalid. Received: " + obj);
            case 56:
                if ("layout/fragment_share_contest_0".equals(obj)) {
                    return new FragmentShareContestBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_share_contest is invalid. Received: " + obj);
            case 57:
                if ("layout/fragment_share_request_0".equals(obj)) {
                    return new FragmentShareRequestBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_share_request is invalid. Received: " + obj);
            case 58:
                if ("layout/fragment_top_players_0".equals(obj)) {
                    return new FragmentTopPlayersBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_top_players is invalid. Received: " + obj);
            case 59:
                if ("layout/fragment_wallet_0".equals(obj)) {
                    return new FragmentWalletBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for fragment_wallet is invalid. Received: " + obj);
            case 60:
                if ("layout/layout_select_team_0".equals(obj)) {
                    return new LayoutSelectTeamBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for layout_select_team is invalid. Received: " + obj);
            case 61:
                if ("layout/progress_layout_0".equals(obj)) {
                    return new ProgressLayoutBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for progress_layout is invalid. Received: " + obj);
            case 62:
                if ("layout/sample_design_0".equals(obj)) {
                    return new SampleDesignBindingImpl(dataBindingComponent, view);
                }
                throw new IllegalArgumentException("The tag for sample_design is invalid. Received: " + obj);
            default:
                return null;
        }
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            int i3 = (i2 - 1) / 50;
            if (i3 == 0) {
                return internalGetViewDataBinding0(dataBindingComponent, view, i2, tag);
            }
            if (i3 != 1) {
                return null;
            }
            return internalGetViewDataBinding1(dataBindingComponent, view, i2, tag);
        }
        throw new RuntimeException("view must have a tag");
    }

    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(5);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "context");
            sparseArray.put(2, "model");
            sparseArray.put(3, "posi");
            sparseArray.put(4, "vm");
        }
    }

    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(62);
            sKeys = hashMap;
            hashMap.put("layout/adapter_ball_count_0", Integer.valueOf(C1188R.C1193layout.adapter_ball_count));
            hashMap.put("layout/adapter_bank_linked_0", Integer.valueOf(C1188R.C1193layout.adapter_bank_linked));
            hashMap.put("layout/adapter_batter_score_0", Integer.valueOf(C1188R.C1193layout.adapter_batter_score));
            hashMap.put("layout/adapter_bowler_score_0", Integer.valueOf(C1188R.C1193layout.adapter_bowler_score));
            hashMap.put("layout/adapter_completed_0", Integer.valueOf(C1188R.C1193layout.adapter_completed));
            hashMap.put("layout/adapter_contacts_0", Integer.valueOf(C1188R.C1193layout.adapter_contacts));
            hashMap.put("layout/adapter_contest_teams_0", Integer.valueOf(C1188R.C1193layout.adapter_contest_teams));
            hashMap.put("layout/adapter_current_matches_0", Integer.valueOf(C1188R.C1193layout.adapter_current_matches));
            hashMap.put("layout/adapter_filter_contest_winners_0", Integer.valueOf(C1188R.C1193layout.adapter_filter_contest_winners));
            hashMap.put("layout/adapter_filter_top_players_0", Integer.valueOf(C1188R.C1193layout.adapter_filter_top_players));
            hashMap.put("layout/adapter_flags_0", Integer.valueOf(C1188R.C1193layout.adapter_flags));
            hashMap.put("layout/adapter_home_live_maches_0", Integer.valueOf(C1188R.C1193layout.adapter_home_live_maches));
            hashMap.put("layout/adapter_joined_friends_0", Integer.valueOf(C1188R.C1193layout.adapter_joined_friends));
            hashMap.put("layout/adapter_leaderboard_0", Integer.valueOf(C1188R.C1193layout.adapter_leaderboard));
            hashMap.put("layout/adapter_livescore_bar_0", Integer.valueOf(C1188R.C1193layout.adapter_livescore_bar));
            hashMap.put("layout/adapter_mega_amount_0", Integer.valueOf(C1188R.C1193layout.adapter_mega_amount));
            hashMap.put("layout/adapter_my_completed_contests_0", Integer.valueOf(C1188R.C1193layout.adapter_my_completed_contests));
            hashMap.put("layout/adapter_my_contests_0", Integer.valueOf(C1188R.C1193layout.adapter_my_contests));
            hashMap.put("layout/adapter_my_live_contests_0", Integer.valueOf(C1188R.C1193layout.adapter_my_live_contests));
            hashMap.put("layout/adapter_my_reward_0", Integer.valueOf(C1188R.C1193layout.adapter_my_reward));
            hashMap.put("layout/adapter_my_teams_0", Integer.valueOf(C1188R.C1193layout.adapter_my_teams));
            hashMap.put("layout/adapter_players_pot_0", Integer.valueOf(C1188R.C1193layout.adapter_players_pot));
            hashMap.put("layout/adapter_players_stats_0", Integer.valueOf(C1188R.C1193layout.adapter_players_stats));
            hashMap.put("layout/adapter_previous_contacts_0", Integer.valueOf(C1188R.C1193layout.adapter_previous_contacts));
            hashMap.put("layout/adapter_recent_earnings_0", Integer.valueOf(C1188R.C1193layout.adapter_recent_earnings));
            hashMap.put("layout/adapter_recent_match_0", Integer.valueOf(C1188R.C1193layout.adapter_recent_match));
            hashMap.put("layout/adapter_select_captain_vc_0", Integer.valueOf(C1188R.C1193layout.adapter_select_captain_vc));
            hashMap.put("layout/adapter_select_team_0", Integer.valueOf(C1188R.C1193layout.adapter_select_team));
            hashMap.put("layout/adapter_selected_contact_0", Integer.valueOf(C1188R.C1193layout.adapter_selected_contact));
            hashMap.put("layout/adapter_sequence_0", Integer.valueOf(C1188R.C1193layout.adapter_sequence));
            hashMap.put("layout/adapter_top_contests_0", Integer.valueOf(C1188R.C1193layout.adapter_top_contests));
            hashMap.put("layout/adapter_top_players_0", Integer.valueOf(C1188R.C1193layout.adapter_top_players));
            hashMap.put("layout/adapter_top_players_home_page_0", Integer.valueOf(C1188R.C1193layout.adapter_top_players_home_page));
            hashMap.put("layout/adapter_topup_0", Integer.valueOf(C1188R.C1193layout.adapter_topup));
            hashMap.put("layout/adapter_upcoming_match_0", Integer.valueOf(C1188R.C1193layout.adapter_upcoming_match));
            hashMap.put("layout/adapter_upcoming_match_new_0", Integer.valueOf(C1188R.C1193layout.adapter_upcoming_match_new));
            hashMap.put("layout/adapter_upcoming_matches_0", Integer.valueOf(C1188R.C1193layout.adapter_upcoming_matches));
            hashMap.put("layout/adapter_user_rewards_0", Integer.valueOf(C1188R.C1193layout.adapter_user_rewards));
            hashMap.put("layout/adapter_wallet_history_0", Integer.valueOf(C1188R.C1193layout.adapter_wallet_history));
            hashMap.put("layout/adapter_winners_0", Integer.valueOf(C1188R.C1193layout.adapter_winners));
            hashMap.put("layout/adapter_winners_list_0", Integer.valueOf(C1188R.C1193layout.adapter_winners_list));
            hashMap.put("layout/adapter_winners_rank_0", Integer.valueOf(C1188R.C1193layout.adapter_winners_rank));
            hashMap.put("layout/adapter_winnings_0", Integer.valueOf(C1188R.C1193layout.adapter_winnings));
            hashMap.put("layout/fragment_congratulation_0", Integer.valueOf(C1188R.C1193layout.fragment_congratulation));
            hashMap.put("layout/fragment_contest_detail_0", Integer.valueOf(C1188R.C1193layout.fragment_contest_detail));
            hashMap.put("layout/fragment_contest_winner_0", Integer.valueOf(C1188R.C1193layout.fragment_contest_winner));
            hashMap.put("layout/fragment_create_team_0", Integer.valueOf(C1188R.C1193layout.fragment_create_team));
            hashMap.put("layout/fragment_join_contest_detail_0", Integer.valueOf(C1188R.C1193layout.fragment_join_contest_detail));
            hashMap.put("layout/fragment_player_rewards_0", Integer.valueOf(C1188R.C1193layout.fragment_player_rewards));
            hashMap.put("layout/fragment_private_contest_detail_0", Integer.valueOf(C1188R.C1193layout.fragment_private_contest_detail));
            hashMap.put("layout/fragment_profile_0", Integer.valueOf(C1188R.C1193layout.fragment_profile));
            hashMap.put("layout/fragment_refer_to_earn_0", Integer.valueOf(C1188R.C1193layout.fragment_refer_to_earn));
            hashMap.put("layout/fragment_rewards_0", Integer.valueOf(C1188R.C1193layout.fragment_rewards));
            hashMap.put("layout/fragment_select_team_0", Integer.valueOf(C1188R.C1193layout.fragment_select_team));
            hashMap.put("layout/fragment_settings_0", Integer.valueOf(C1188R.C1193layout.fragment_settings));
            hashMap.put("layout/fragment_share_contest_0", Integer.valueOf(C1188R.C1193layout.fragment_share_contest));
            hashMap.put("layout/fragment_share_request_0", Integer.valueOf(C1188R.C1193layout.fragment_share_request));
            hashMap.put("layout/fragment_top_players_0", Integer.valueOf(C1188R.C1193layout.fragment_top_players));
            hashMap.put("layout/fragment_wallet_0", Integer.valueOf(C1188R.C1193layout.fragment_wallet));
            hashMap.put("layout/layout_select_team_0", Integer.valueOf(C1188R.C1193layout.layout_select_team));
            hashMap.put("layout/progress_layout_0", Integer.valueOf(C1188R.C1193layout.progress_layout));
            hashMap.put("layout/sample_design_0", Integer.valueOf(C1188R.C1193layout.sample_design));
        }
    }
}
