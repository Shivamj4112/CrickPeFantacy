package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.crickpe.C1188R;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public final class FragmentAnalyticsBinding implements ViewBinding {
    public final ConstraintLayout awardBoard;
    public final CardView cvProfileImage;
    public final ImageView imageView2;
    public final ImageView imageView3;
    public final ImageView ivAnalyticsFilter;
    public final LinearLayout linearLayout;
    public final LinearLayout linearLayout2;
    public final LinearLayout linearLayout3;
    public final LinearLayout llTop;
    public final TextView llTopPlayers;
    public final ConstraintLayout navHostHome;
    public final RelativeLayout rlPlayerCard;
    public final RelativeLayout rlRecentEarning;
    private final ConstraintLayout rootView;
    public final RecyclerView rvMatchAnalytic;
    public final RecyclerView rvRecentEarnings;
    public final TextView tvAnalytics;
    public final TextView tvRecentEarnings;
    public final TextView tvUpcoming;
    public final TextView tvUpcomingMatch;
    public final View view;
    public final ViewPager viewPagerBanner;
    public final ViewPager vpUpcomingMatch;
    public final WormDotsIndicator wormDot;
    public final WormDotsIndicator wormDotTwo;

    private FragmentAnalyticsBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CardView cardView, ImageView imageView, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, TextView textView, ConstraintLayout constraintLayout3, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RecyclerView recyclerView, RecyclerView recyclerView2, TextView textView2, TextView textView3, TextView textView4, TextView textView5, View view2, ViewPager viewPager, ViewPager viewPager2, WormDotsIndicator wormDotsIndicator, WormDotsIndicator wormDotsIndicator2) {
        this.rootView = constraintLayout;
        this.awardBoard = constraintLayout2;
        this.cvProfileImage = cardView;
        this.imageView2 = imageView;
        this.imageView3 = imageView4;
        this.ivAnalyticsFilter = imageView5;
        this.linearLayout = linearLayout4;
        this.linearLayout2 = linearLayout5;
        this.linearLayout3 = linearLayout6;
        this.llTop = linearLayout7;
        this.llTopPlayers = textView;
        this.navHostHome = constraintLayout3;
        this.rlPlayerCard = relativeLayout;
        this.rlRecentEarning = relativeLayout2;
        this.rvMatchAnalytic = recyclerView;
        this.rvRecentEarnings = recyclerView2;
        this.tvAnalytics = textView2;
        this.tvRecentEarnings = textView3;
        this.tvUpcoming = textView4;
        this.tvUpcomingMatch = textView5;
        this.view = view2;
        this.viewPagerBanner = viewPager;
        this.vpUpcomingMatch = viewPager2;
        this.wormDot = wormDotsIndicator;
        this.wormDotTwo = wormDotsIndicator2;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentAnalyticsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentAnalyticsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_analytics, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentAnalyticsBinding bind(View view2) {
        View view3 = view2;
        int i = C1188R.C1192id.awardBoard;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.awardBoard);
        if (constraintLayout != null) {
            i = C1188R.C1192id.cvProfileImage;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view3, C1188R.C1192id.cvProfileImage);
            if (cardView != null) {
                i = C1188R.C1192id.imageView2;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.imageView2);
                if (imageView != null) {
                    i = C1188R.C1192id.imageView3;
                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.imageView3);
                    if (imageView4 != null) {
                        i = C1188R.C1192id.ivAnalyticsFilter;
                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivAnalyticsFilter);
                        if (imageView5 != null) {
                            i = C1188R.C1192id.linearLayout;
                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.linearLayout);
                            if (linearLayout4 != null) {
                                i = C1188R.C1192id.linearLayout2;
                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.linearLayout2);
                                if (linearLayout5 != null) {
                                    i = C1188R.C1192id.linearLayout3;
                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.linearLayout3);
                                    if (linearLayout6 != null) {
                                        i = C1188R.C1192id.llTop;
                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.llTop);
                                        if (linearLayout7 != null) {
                                            i = C1188R.C1192id.llTopPlayers;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.llTopPlayers);
                                            if (textView != null) {
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view3;
                                                i = C1188R.C1192id.rlPlayerCard;
                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.rlPlayerCard);
                                                if (relativeLayout != null) {
                                                    i = C1188R.C1192id.rlRecentEarning;
                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.rlRecentEarning);
                                                    if (relativeLayout2 != null) {
                                                        i = C1188R.C1192id.rvMatchAnalytic;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view3, C1188R.C1192id.rvMatchAnalytic);
                                                        if (recyclerView != null) {
                                                            i = C1188R.C1192id.rvRecentEarnings;
                                                            RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view3, C1188R.C1192id.rvRecentEarnings);
                                                            if (recyclerView2 != null) {
                                                                i = C1188R.C1192id.tvAnalytics;
                                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvAnalytics);
                                                                if (textView2 != null) {
                                                                    i = C1188R.C1192id.tvRecentEarnings;
                                                                    TextView textView3 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvRecentEarnings);
                                                                    if (textView3 != null) {
                                                                        i = C1188R.C1192id.tvUpcoming;
                                                                        TextView textView4 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvUpcoming);
                                                                        if (textView4 != null) {
                                                                            i = C1188R.C1192id.tvUpcomingMatch;
                                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvUpcomingMatch);
                                                                            if (textView5 != null) {
                                                                                i = C1188R.C1192id.view;
                                                                                View findChildViewById = ViewBindings.findChildViewById(view3, C1188R.C1192id.view);
                                                                                if (findChildViewById != null) {
                                                                                    i = C1188R.C1192id.view_pager_banner;
                                                                                    ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view3, C1188R.C1192id.view_pager_banner);
                                                                                    if (viewPager != null) {
                                                                                        i = C1188R.C1192id.vpUpcomingMatch;
                                                                                        ViewPager viewPager2 = (ViewPager) ViewBindings.findChildViewById(view3, C1188R.C1192id.vpUpcomingMatch);
                                                                                        if (viewPager2 != null) {
                                                                                            i = C1188R.C1192id.worm_dot;
                                                                                            WormDotsIndicator wormDotsIndicator = (WormDotsIndicator) ViewBindings.findChildViewById(view3, C1188R.C1192id.worm_dot);
                                                                                            if (wormDotsIndicator != null) {
                                                                                                i = C1188R.C1192id.worm_dot_two;
                                                                                                WormDotsIndicator wormDotsIndicator2 = (WormDotsIndicator) ViewBindings.findChildViewById(view3, C1188R.C1192id.worm_dot_two);
                                                                                                if (wormDotsIndicator2 != null) {
                                                                                                    return new FragmentAnalyticsBinding(constraintLayout2, constraintLayout, cardView, imageView, imageView4, imageView5, linearLayout4, linearLayout5, linearLayout6, linearLayout7, textView, constraintLayout2, relativeLayout, relativeLayout2, recyclerView, recyclerView2, textView2, textView3, textView4, textView5, findChildViewById, viewPager, viewPager2, wormDotsIndicator, wormDotsIndicator2);
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
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
