package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;
import com.facebook.shimmer.ShimmerFrameLayout;
import p019de.hdodenhof.circleimageview.CircleImageView;

public final class FragmentMyMatchDetailBinding implements ViewBinding {
    public final CoordinatorLayout coordLayout;
    public final CardView currentItemRoot;
    public final CardView cvPlayersPot;
    public final CircleImageView ivTeam1Flag;
    public final CircleImageView ivTeam2Flag;
    public final LinearLayout llBallsContainer;
    public final LinearLayout llLiveMatch;
    public final LinearLayout llMatchCompleted;
    public final LinearLayout llMatchLive;
    public final LinearLayout llMsg;
    public final LinearLayout llWon;
    public final CircleImageView playerImageOne;
    public final CircleImageView playerImageTwo;
    public final TextView playerNameOne;
    public final TextView playerNameTwo;
    public final RelativeLayout playerOne;
    public final RelativeLayout playerSecond;
    public final TextView points;
    public final ProgressBar progressBar;
    private final CoordinatorLayout rootView;
    public final RecyclerView rvCompletedContest;
    public final RecyclerView rvTopContest;
    public final ShimmerFrameLayout shimmerViewContainer;
    public final SwipeRefreshLayout swipeRv;
    public final TextView tvBatsman1;
    public final TextView tvBatsman2;
    public final TextView tvBowlerName;
    public final TextView tvBowlerOver;
    public final TextView tvBowlerStat;
    public final TextView tvCongratulation;
    public final TextView tvMsg;
    public final TextView tvMyContests;
    public final TextView tvOversT2;
    public final TextView tvPointss;
    public final TextView tvScoreTeam2;
    public final TextView tvT1Name;
    public final TextView tvT1Overs;
    public final TextView tvT1Score;
    public final TextView tvT2Name;
    public final TextView tvYouWon;

    private FragmentMyMatchDetailBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, CardView cardView, CardView cardView2, CircleImageView circleImageView, CircleImageView circleImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, CircleImageView circleImageView3, CircleImageView circleImageView4, TextView textView, TextView textView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView3, ProgressBar progressBar2, RecyclerView recyclerView, RecyclerView recyclerView2, ShimmerFrameLayout shimmerFrameLayout, SwipeRefreshLayout swipeRefreshLayout, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, TextView textView19) {
        this.rootView = coordinatorLayout;
        this.coordLayout = coordinatorLayout2;
        this.currentItemRoot = cardView;
        this.cvPlayersPot = cardView2;
        this.ivTeam1Flag = circleImageView;
        this.ivTeam2Flag = circleImageView2;
        this.llBallsContainer = linearLayout;
        this.llLiveMatch = linearLayout2;
        this.llMatchCompleted = linearLayout3;
        this.llMatchLive = linearLayout4;
        this.llMsg = linearLayout5;
        this.llWon = linearLayout6;
        this.playerImageOne = circleImageView3;
        this.playerImageTwo = circleImageView4;
        this.playerNameOne = textView;
        this.playerNameTwo = textView2;
        this.playerOne = relativeLayout;
        this.playerSecond = relativeLayout2;
        this.points = textView3;
        this.progressBar = progressBar2;
        this.rvCompletedContest = recyclerView;
        this.rvTopContest = recyclerView2;
        this.shimmerViewContainer = shimmerFrameLayout;
        this.swipeRv = swipeRefreshLayout;
        this.tvBatsman1 = textView4;
        this.tvBatsman2 = textView5;
        this.tvBowlerName = textView6;
        this.tvBowlerOver = textView7;
        this.tvBowlerStat = textView8;
        this.tvCongratulation = textView9;
        this.tvMsg = textView10;
        this.tvMyContests = textView11;
        this.tvOversT2 = textView12;
        this.tvPointss = textView13;
        this.tvScoreTeam2 = textView14;
        this.tvT1Name = textView15;
        this.tvT1Overs = textView16;
        this.tvT1Score = textView17;
        this.tvT2Name = textView18;
        this.tvYouWon = textView19;
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMyMatchDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentMyMatchDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_my_match_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMyMatchDetailBinding bind(View view) {
        View view2 = view;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view2;
        int i = C1188R.C1192id.currentItemRoot;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view2, C1188R.C1192id.currentItemRoot);
        if (cardView != null) {
            i = C1188R.C1192id.cvPlayersPot;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view2, C1188R.C1192id.cvPlayersPot);
            if (cardView2 != null) {
                i = C1188R.C1192id.ivTeam1Flag;
                CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivTeam1Flag);
                if (circleImageView != null) {
                    i = C1188R.C1192id.ivTeam2Flag;
                    CircleImageView circleImageView2 = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivTeam2Flag);
                    if (circleImageView2 != null) {
                        i = C1188R.C1192id.llBallsContainer;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llBallsContainer);
                        if (linearLayout != null) {
                            i = C1188R.C1192id.llLiveMatch;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llLiveMatch);
                            if (linearLayout2 != null) {
                                i = C1188R.C1192id.llMatchCompleted;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llMatchCompleted);
                                if (linearLayout3 != null) {
                                    i = C1188R.C1192id.llMatchLive;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llMatchLive);
                                    if (linearLayout4 != null) {
                                        i = C1188R.C1192id.llMsg;
                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llMsg);
                                        if (linearLayout5 != null) {
                                            i = C1188R.C1192id.llWon;
                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llWon);
                                            if (linearLayout6 != null) {
                                                i = C1188R.C1192id.playerImageOne;
                                                CircleImageView circleImageView3 = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerImageOne);
                                                if (circleImageView3 != null) {
                                                    i = C1188R.C1192id.playerImageTwo;
                                                    CircleImageView circleImageView4 = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerImageTwo);
                                                    if (circleImageView4 != null) {
                                                        i = C1188R.C1192id.playerNameOne;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerNameOne);
                                                        if (textView != null) {
                                                            i = C1188R.C1192id.playerNameTwo;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerNameTwo);
                                                            if (textView2 != null) {
                                                                i = C1188R.C1192id.playerOne;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerOne);
                                                                if (relativeLayout != null) {
                                                                    i = C1188R.C1192id.playerSecond;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerSecond);
                                                                    if (relativeLayout2 != null) {
                                                                        i = C1188R.C1192id.points;
                                                                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.points);
                                                                        if (textView3 != null) {
                                                                            i = C1188R.C1192id.progressBar;
                                                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progressBar);
                                                                            if (progressBar2 != null) {
                                                                                i = C1188R.C1192id.rvCompletedContest;
                                                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvCompletedContest);
                                                                                if (recyclerView != null) {
                                                                                    i = C1188R.C1192id.rvTopContest;
                                                                                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvTopContest);
                                                                                    if (recyclerView2 != null) {
                                                                                        i = C1188R.C1192id.shimmer_view_container;
                                                                                        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.shimmer_view_container);
                                                                                        if (shimmerFrameLayout != null) {
                                                                                            i = C1188R.C1192id.swipeRv;
                                                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.swipeRv);
                                                                                            if (swipeRefreshLayout != null) {
                                                                                                i = C1188R.C1192id.tvBatsman1;
                                                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvBatsman1);
                                                                                                if (textView4 != null) {
                                                                                                    i = C1188R.C1192id.tvBatsman2;
                                                                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvBatsman2);
                                                                                                    if (textView5 != null) {
                                                                                                        i = C1188R.C1192id.tvBowlerName;
                                                                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvBowlerName);
                                                                                                        if (textView6 != null) {
                                                                                                            i = C1188R.C1192id.tvBowlerOver;
                                                                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvBowlerOver);
                                                                                                            if (textView7 != null) {
                                                                                                                i = C1188R.C1192id.tvBowlerStat;
                                                                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvBowlerStat);
                                                                                                                if (textView8 != null) {
                                                                                                                    i = C1188R.C1192id.tvCongratulation;
                                                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCongratulation);
                                                                                                                    if (textView9 != null) {
                                                                                                                        i = C1188R.C1192id.tvMsg;
                                                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvMsg);
                                                                                                                        if (textView10 != null) {
                                                                                                                            i = C1188R.C1192id.tvMyContests;
                                                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvMyContests);
                                                                                                                            if (textView11 != null) {
                                                                                                                                i = C1188R.C1192id.tvOversT2;
                                                                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvOversT2);
                                                                                                                                if (textView12 != null) {
                                                                                                                                    i = C1188R.C1192id.tvPointss;
                                                                                                                                    TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvPointss);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i = C1188R.C1192id.tvScoreTeam2;
                                                                                                                                        TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvScoreTeam2);
                                                                                                                                        if (textView14 != null) {
                                                                                                                                            i = C1188R.C1192id.tvT1Name;
                                                                                                                                            TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvT1Name);
                                                                                                                                            if (textView15 != null) {
                                                                                                                                                i = C1188R.C1192id.tvT1Overs;
                                                                                                                                                TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvT1Overs);
                                                                                                                                                if (textView16 != null) {
                                                                                                                                                    i = C1188R.C1192id.tvT1Score;
                                                                                                                                                    TextView textView17 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvT1Score);
                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                        i = C1188R.C1192id.tvT2Name;
                                                                                                                                                        TextView textView18 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvT2Name);
                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                            i = C1188R.C1192id.tvYouWon;
                                                                                                                                                            TextView textView19 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvYouWon);
                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                return new FragmentMyMatchDetailBinding(coordinatorLayout, coordinatorLayout, cardView, cardView2, circleImageView, circleImageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, circleImageView3, circleImageView4, textView, textView2, relativeLayout, relativeLayout2, textView3, progressBar2, recyclerView, recyclerView2, shimmerFrameLayout, swipeRefreshLayout, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, textView18, textView19);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
