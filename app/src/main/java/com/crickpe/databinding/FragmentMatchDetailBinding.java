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
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.crickpe.C1188R;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.tabs.TabLayout;
import p019de.hdodenhof.circleimageview.CircleImageView;

public final class FragmentMatchDetailBinding implements ViewBinding {
    public final CoordinatorLayout coordLayout;
    public final CardView currentItemRoot;
    public final CardView cvPlayersPot;
    public final CircleImageView ivTeam1Flag;
    public final CircleImageView ivTeam2Flag;
    public final LinearLayout llBallsContainer;
    public final LinearLayout llLiveMatch;
    public final LinearLayout llMatch;
    public final LinearLayout llMatchCompleted;
    public final LinearLayout llMatchLive;
    public final LinearLayout llMsg;
    public final CircleImageView playerImageOne;
    public final CircleImageView playerImageTwo;
    public final TextView playerName1;
    public final TextView playerName2;
    public final RelativeLayout playerOne;
    public final RelativeLayout playerSecond;
    public final TextView points;
    public final ProgressBar progressBar;
    private final CoordinatorLayout rootView;
    public final ShimmerFrameLayout shimmerViewContainer;
    public final TabLayout tabLayout;
    public final TextView tvBatsman1;
    public final TextView tvBatsman2;
    public final TextView tvBowlerName;
    public final TextView tvBowlerOver;
    public final TextView tvBowlerStat;
    public final TextView tvMatchStatus;
    public final TextView tvMsg;
    public final TextView tvOversT2;
    public final TextView tvPointss;
    public final TextView tvScoreTeam2;
    public final TextView tvT1Name;
    public final TextView tvT1Overs;
    public final TextView tvT1Score;
    public final TextView tvT2Name;
    public final ViewPager viewPager;

    private FragmentMatchDetailBinding(CoordinatorLayout coordinatorLayout, CoordinatorLayout coordinatorLayout2, CardView cardView, CardView cardView2, CircleImageView circleImageView, CircleImageView circleImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, CircleImageView circleImageView3, CircleImageView circleImageView4, TextView textView, TextView textView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextView textView3, ProgressBar progressBar2, ShimmerFrameLayout shimmerFrameLayout, TabLayout tabLayout2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, ViewPager viewPager2) {
        this.rootView = coordinatorLayout;
        this.coordLayout = coordinatorLayout2;
        this.currentItemRoot = cardView;
        this.cvPlayersPot = cardView2;
        this.ivTeam1Flag = circleImageView;
        this.ivTeam2Flag = circleImageView2;
        this.llBallsContainer = linearLayout;
        this.llLiveMatch = linearLayout2;
        this.llMatch = linearLayout3;
        this.llMatchCompleted = linearLayout4;
        this.llMatchLive = linearLayout5;
        this.llMsg = linearLayout6;
        this.playerImageOne = circleImageView3;
        this.playerImageTwo = circleImageView4;
        this.playerName1 = textView;
        this.playerName2 = textView2;
        this.playerOne = relativeLayout;
        this.playerSecond = relativeLayout2;
        this.points = textView3;
        this.progressBar = progressBar2;
        this.shimmerViewContainer = shimmerFrameLayout;
        this.tabLayout = tabLayout2;
        this.tvBatsman1 = textView4;
        this.tvBatsman2 = textView5;
        this.tvBowlerName = textView6;
        this.tvBowlerOver = textView7;
        this.tvBowlerStat = textView8;
        this.tvMatchStatus = textView9;
        this.tvMsg = textView10;
        this.tvOversT2 = textView11;
        this.tvPointss = textView12;
        this.tvScoreTeam2 = textView13;
        this.tvT1Name = textView14;
        this.tvT1Overs = textView15;
        this.tvT1Score = textView16;
        this.tvT2Name = textView17;
        this.viewPager = viewPager2;
    }

    public CoordinatorLayout getRoot() {
        return this.rootView;
    }

    public static FragmentMatchDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentMatchDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_match_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentMatchDetailBinding bind(View view) {
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
                                i = C1188R.C1192id.llMatch;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llMatch);
                                if (linearLayout3 != null) {
                                    i = C1188R.C1192id.llMatchCompleted;
                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llMatchCompleted);
                                    if (linearLayout4 != null) {
                                        i = C1188R.C1192id.llMatchLive;
                                        LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llMatchLive);
                                        if (linearLayout5 != null) {
                                            i = C1188R.C1192id.llMsg;
                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llMsg);
                                            if (linearLayout6 != null) {
                                                i = C1188R.C1192id.playerImageOne;
                                                CircleImageView circleImageView3 = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerImageOne);
                                                if (circleImageView3 != null) {
                                                    i = C1188R.C1192id.playerImageTwo;
                                                    CircleImageView circleImageView4 = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerImageTwo);
                                                    if (circleImageView4 != null) {
                                                        i = C1188R.C1192id.playerName1;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerName1);
                                                        if (textView != null) {
                                                            i = C1188R.C1192id.playerName2;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.playerName2);
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
                                                                                i = C1188R.C1192id.shimmer_view_container;
                                                                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.shimmer_view_container);
                                                                                if (shimmerFrameLayout != null) {
                                                                                    i = C1188R.C1192id.tabLayout;
                                                                                    TabLayout tabLayout2 = (TabLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.tabLayout);
                                                                                    if (tabLayout2 != null) {
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
                                                                                                            i = C1188R.C1192id.tvMatchStatus;
                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvMatchStatus);
                                                                                                            if (textView9 != null) {
                                                                                                                i = C1188R.C1192id.tvMsg;
                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvMsg);
                                                                                                                if (textView10 != null) {
                                                                                                                    i = C1188R.C1192id.tvOversT2;
                                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvOversT2);
                                                                                                                    if (textView11 != null) {
                                                                                                                        i = C1188R.C1192id.tvPointss;
                                                                                                                        TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvPointss);
                                                                                                                        if (textView12 != null) {
                                                                                                                            i = C1188R.C1192id.tvScoreTeam2;
                                                                                                                            TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvScoreTeam2);
                                                                                                                            if (textView13 != null) {
                                                                                                                                i = C1188R.C1192id.tvT1Name;
                                                                                                                                TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvT1Name);
                                                                                                                                if (textView14 != null) {
                                                                                                                                    i = C1188R.C1192id.tvT1Overs;
                                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvT1Overs);
                                                                                                                                    if (textView15 != null) {
                                                                                                                                        i = C1188R.C1192id.tvT1Score;
                                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvT1Score);
                                                                                                                                        if (textView16 != null) {
                                                                                                                                            i = C1188R.C1192id.tvT2Name;
                                                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvT2Name);
                                                                                                                                            if (textView17 != null) {
                                                                                                                                                i = C1188R.C1192id.viewPager;
                                                                                                                                                ViewPager viewPager2 = (ViewPager) ViewBindings.findChildViewById(view2, C1188R.C1192id.viewPager);
                                                                                                                                                if (viewPager2 != null) {
                                                                                                                                                    return new FragmentMatchDetailBinding(coordinatorLayout, coordinatorLayout, cardView, cardView2, circleImageView, circleImageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, circleImageView3, circleImageView4, textView, textView2, relativeLayout, relativeLayout2, textView3, progressBar2, shimmerFrameLayout, tabLayout2, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17, viewPager2);
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
