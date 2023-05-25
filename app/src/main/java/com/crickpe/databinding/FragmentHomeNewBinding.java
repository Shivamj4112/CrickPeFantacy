package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.crickpe.C1188R;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;
import p019de.hdodenhof.circleimageview.CircleImageView;

public final class FragmentHomeNewBinding implements ViewBinding {
    public final ConstraintLayout clTopPlayers;
    public final TextView filter;
    public final ImageView imageView2;
    public final ImageView imageView3;
    public final ImageView imageView6;
    public final ImageView imageView7;
    public final ImageView ivDrop;
    public final ImageView ivFilterTopPlayers;
    public final CircleImageView ivFlagImage;
    public final CircleImageView ivPlayerImage;
    public final LinearLayout llContinue;
    public final LinearLayout llCurrentMatch;
    public final LinearLayout llTopPlayers;
    public final LinearLayout llUpcoming;
    public final ConstraintLayout navHostHome;
    public final NestedScrollView nestedScrollView;
    public final ProgressBar progressBar;
    public final RelativeLayout relativeLayout10;
    public final RelativeLayout rlBanner;
    public final RelativeLayout rlCountry;
    public final RelativeLayout rlCurrentMatches;
    public final RelativeLayout rlFilter;
    public final RelativeLayout rlProgressHome;
    public final RelativeLayout rlRewardPlayer;
    public final RelativeLayout rlRewards;
    public final RelativeLayout rlTopLayer;
    private final ConstraintLayout rootView;
    public final RecyclerView rvFilterTop;
    public final RecyclerView rvLiveMatch;
    public final RecyclerView rvTopPlayers;
    public final RecyclerView rvUpcomingMatch;
    public final SwipeRefreshLayout swipeRv;
    public final TextView textView14;
    public final TextView textView15;
    public final TextView textView16;
    public final TextView tvContinue;
    public final TextView tvCountryName;
    public final TextView tvCurrent;
    public final TextView tvCurrentMatch;
    public final TextView tvPlayerName;
    public final TextView tvUpcomingMatch;
    public final TextView tvViewTopPlayers;
    public final ViewPager viewPagerBanner;
    public final WormDotsIndicator wormDot;

    private FragmentHomeNewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, ImageView imageView, ImageView imageView4, ImageView imageView5, ImageView imageView8, ImageView imageView9, ImageView imageView10, CircleImageView circleImageView, CircleImageView circleImageView2, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ConstraintLayout constraintLayout3, NestedScrollView nestedScrollView2, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, RelativeLayout relativeLayout8, RelativeLayout relativeLayout9, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, SwipeRefreshLayout swipeRefreshLayout, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, ViewPager viewPager, WormDotsIndicator wormDotsIndicator) {
        this.rootView = constraintLayout;
        this.clTopPlayers = constraintLayout2;
        this.filter = textView;
        this.imageView2 = imageView;
        this.imageView3 = imageView4;
        this.imageView6 = imageView5;
        this.imageView7 = imageView8;
        this.ivDrop = imageView9;
        this.ivFilterTopPlayers = imageView10;
        this.ivFlagImage = circleImageView;
        this.ivPlayerImage = circleImageView2;
        this.llContinue = linearLayout;
        this.llCurrentMatch = linearLayout2;
        this.llTopPlayers = linearLayout3;
        this.llUpcoming = linearLayout4;
        this.navHostHome = constraintLayout3;
        this.nestedScrollView = nestedScrollView2;
        this.progressBar = progressBar2;
        this.relativeLayout10 = relativeLayout;
        this.rlBanner = relativeLayout2;
        this.rlCountry = relativeLayout3;
        this.rlCurrentMatches = relativeLayout4;
        this.rlFilter = relativeLayout5;
        this.rlProgressHome = relativeLayout6;
        this.rlRewardPlayer = relativeLayout7;
        this.rlRewards = relativeLayout8;
        this.rlTopLayer = relativeLayout9;
        this.rvFilterTop = recyclerView;
        this.rvLiveMatch = recyclerView2;
        this.rvTopPlayers = recyclerView3;
        this.rvUpcomingMatch = recyclerView4;
        this.swipeRv = swipeRefreshLayout;
        this.textView14 = textView2;
        this.textView15 = textView3;
        this.textView16 = textView4;
        this.tvContinue = textView5;
        this.tvCountryName = textView6;
        this.tvCurrent = textView7;
        this.tvCurrentMatch = textView8;
        this.tvPlayerName = textView9;
        this.tvUpcomingMatch = textView10;
        this.tvViewTopPlayers = textView11;
        this.viewPagerBanner = viewPager;
        this.wormDot = wormDotsIndicator;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentHomeNewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentHomeNewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_home_new, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentHomeNewBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.clTopPlayers;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.clTopPlayers);
        if (constraintLayout != null) {
            i = C1188R.C1192id.filter;
            TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.filter);
            if (textView != null) {
                i = C1188R.C1192id.imageView2;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.imageView2);
                if (imageView != null) {
                    i = C1188R.C1192id.imageView3;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.imageView3);
                    if (imageView4 != null) {
                        i = C1188R.C1192id.imageView6;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.imageView6);
                        if (imageView5 != null) {
                            i = C1188R.C1192id.imageView7;
                            ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.imageView7);
                            if (imageView8 != null) {
                                i = C1188R.C1192id.ivDrop;
                                ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivDrop);
                                if (imageView9 != null) {
                                    i = C1188R.C1192id.ivFilterTopPlayers;
                                    ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivFilterTopPlayers);
                                    if (imageView10 != null) {
                                        i = C1188R.C1192id.ivFlagImage;
                                        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivFlagImage);
                                        if (circleImageView != null) {
                                            i = C1188R.C1192id.ivPlayerImage;
                                            CircleImageView circleImageView2 = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivPlayerImage);
                                            if (circleImageView2 != null) {
                                                i = C1188R.C1192id.llContinue;
                                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llContinue);
                                                if (linearLayout != null) {
                                                    i = C1188R.C1192id.llCurrentMatch;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llCurrentMatch);
                                                    if (linearLayout2 != null) {
                                                        i = C1188R.C1192id.llTopPlayers;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llTopPlayers);
                                                        if (linearLayout3 != null) {
                                                            i = C1188R.C1192id.llUpcoming;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llUpcoming);
                                                            if (linearLayout4 != null) {
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view2;
                                                                i = C1188R.C1192id.nestedScrollView;
                                                                NestedScrollView nestedScrollView2 = (NestedScrollView) ViewBindings.findChildViewById(view2, C1188R.C1192id.nestedScrollView);
                                                                if (nestedScrollView2 != null) {
                                                                    i = C1188R.C1192id.progressBar;
                                                                    ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progressBar);
                                                                    if (progressBar2 != null) {
                                                                        i = C1188R.C1192id.relativeLayout10;
                                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.relativeLayout10);
                                                                        if (relativeLayout != null) {
                                                                            i = C1188R.C1192id.rlBanner;
                                                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlBanner);
                                                                            if (relativeLayout2 != null) {
                                                                                i = C1188R.C1192id.rlCountry;
                                                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlCountry);
                                                                                if (relativeLayout3 != null) {
                                                                                    i = C1188R.C1192id.rlCurrentMatches;
                                                                                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlCurrentMatches);
                                                                                    if (relativeLayout4 != null) {
                                                                                        i = C1188R.C1192id.rlFilter;
                                                                                        RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlFilter);
                                                                                        if (relativeLayout5 != null) {
                                                                                            i = C1188R.C1192id.rlProgressHome;
                                                                                            RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlProgressHome);
                                                                                            if (relativeLayout6 != null) {
                                                                                                i = C1188R.C1192id.rlRewardPlayer;
                                                                                                RelativeLayout relativeLayout7 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlRewardPlayer);
                                                                                                if (relativeLayout7 != null) {
                                                                                                    i = C1188R.C1192id.rlRewards;
                                                                                                    RelativeLayout relativeLayout8 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlRewards);
                                                                                                    if (relativeLayout8 != null) {
                                                                                                        i = C1188R.C1192id.rlTopLayer;
                                                                                                        RelativeLayout relativeLayout9 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlTopLayer);
                                                                                                        if (relativeLayout9 != null) {
                                                                                                            i = C1188R.C1192id.rvFilterTop;
                                                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvFilterTop);
                                                                                                            if (recyclerView != null) {
                                                                                                                i = C1188R.C1192id.rvLiveMatch;
                                                                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvLiveMatch);
                                                                                                                if (recyclerView2 != null) {
                                                                                                                    i = C1188R.C1192id.rvTopPlayers;
                                                                                                                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvTopPlayers);
                                                                                                                    if (recyclerView3 != null) {
                                                                                                                        i = C1188R.C1192id.rvUpcomingMatch;
                                                                                                                        RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvUpcomingMatch);
                                                                                                                        if (recyclerView4 != null) {
                                                                                                                            i = C1188R.C1192id.swipeRv;
                                                                                                                            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.swipeRv);
                                                                                                                            if (swipeRefreshLayout != null) {
                                                                                                                                i = C1188R.C1192id.textView14;
                                                                                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView14);
                                                                                                                                if (textView2 != null) {
                                                                                                                                    i = C1188R.C1192id.textView15;
                                                                                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView15);
                                                                                                                                    if (textView3 != null) {
                                                                                                                                        i = C1188R.C1192id.textView16;
                                                                                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView16);
                                                                                                                                        if (textView4 != null) {
                                                                                                                                            i = C1188R.C1192id.tvContinue;
                                                                                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvContinue);
                                                                                                                                            if (textView5 != null) {
                                                                                                                                                i = C1188R.C1192id.tvCountryName;
                                                                                                                                                TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCountryName);
                                                                                                                                                if (textView6 != null) {
                                                                                                                                                    i = C1188R.C1192id.tvCurrent;
                                                                                                                                                    TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCurrent);
                                                                                                                                                    if (textView7 != null) {
                                                                                                                                                        i = C1188R.C1192id.tvCurrentMatch;
                                                                                                                                                        TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCurrentMatch);
                                                                                                                                                        if (textView8 != null) {
                                                                                                                                                            i = C1188R.C1192id.tvPlayerName;
                                                                                                                                                            TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvPlayerName);
                                                                                                                                                            if (textView9 != null) {
                                                                                                                                                                i = C1188R.C1192id.tvUpcomingMatch;
                                                                                                                                                                TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvUpcomingMatch);
                                                                                                                                                                if (textView10 != null) {
                                                                                                                                                                    i = C1188R.C1192id.tvViewTopPlayers;
                                                                                                                                                                    TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvViewTopPlayers);
                                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                                        i = C1188R.C1192id.view_pager_banner;
                                                                                                                                                                        ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view2, C1188R.C1192id.view_pager_banner);
                                                                                                                                                                        if (viewPager != null) {
                                                                                                                                                                            i = C1188R.C1192id.worm_dot;
                                                                                                                                                                            WormDotsIndicator wormDotsIndicator = (WormDotsIndicator) ViewBindings.findChildViewById(view2, C1188R.C1192id.worm_dot);
                                                                                                                                                                            if (wormDotsIndicator != null) {
                                                                                                                                                                                return new FragmentHomeNewBinding(constraintLayout2, constraintLayout, textView, imageView, imageView4, imageView5, imageView8, imageView9, imageView10, circleImageView, circleImageView2, linearLayout, linearLayout2, linearLayout3, linearLayout4, constraintLayout2, nestedScrollView2, progressBar2, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, relativeLayout7, relativeLayout8, relativeLayout9, recyclerView, recyclerView2, recyclerView3, recyclerView4, swipeRefreshLayout, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, viewPager, wormDotsIndicator);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
