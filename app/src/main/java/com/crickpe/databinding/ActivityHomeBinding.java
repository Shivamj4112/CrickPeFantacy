package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import p019de.hdodenhof.circleimageview.CircleImageView;

public final class ActivityHomeBinding implements ViewBinding {
    public final RelativeLayout activityMainContentId;
    public final BottomNavigationView bottomNav;
    public final DrawerLayout drawerLayout;
    public final ImageView ivCrickpe;
    public final ImageView ivMenu;
    public final CircleImageView ivProfile;
    public final ImageView ivRight;
    public final ImageView ivWallet;
    public final RelativeLayout llProfile;
    public final LinearLayout mainActivityContentId;
    public final FragmentContainerView navHostFragment;
    public final LinearLayout navigationLayout;
    public final RecyclerView navigationRv;
    public final CircleImageView profileImage;
    public final RelativeLayout rlName;
    public final RelativeLayout rlTop;
    public final RelativeLayout rlWallet;
    private final DrawerLayout rootView;
    public final TextView tvAmount;
    public final TextView tvChat;
    public final TextView tvLogout;
    public final TextView tvName;
    public final TextView tvSkillScore;
    public final TextView tvTitle;
    public final View view;

    private ActivityHomeBinding(DrawerLayout drawerLayout2, RelativeLayout relativeLayout, BottomNavigationView bottomNavigationView, DrawerLayout drawerLayout3, ImageView imageView, ImageView imageView2, CircleImageView circleImageView, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout2, LinearLayout linearLayout, FragmentContainerView fragmentContainerView, LinearLayout linearLayout2, RecyclerView recyclerView, CircleImageView circleImageView2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view2) {
        this.rootView = drawerLayout2;
        this.activityMainContentId = relativeLayout;
        this.bottomNav = bottomNavigationView;
        this.drawerLayout = drawerLayout3;
        this.ivCrickpe = imageView;
        this.ivMenu = imageView2;
        this.ivProfile = circleImageView;
        this.ivRight = imageView3;
        this.ivWallet = imageView4;
        this.llProfile = relativeLayout2;
        this.mainActivityContentId = linearLayout;
        this.navHostFragment = fragmentContainerView;
        this.navigationLayout = linearLayout2;
        this.navigationRv = recyclerView;
        this.profileImage = circleImageView2;
        this.rlName = relativeLayout3;
        this.rlTop = relativeLayout4;
        this.rlWallet = relativeLayout5;
        this.tvAmount = textView;
        this.tvChat = textView2;
        this.tvLogout = textView3;
        this.tvName = textView4;
        this.tvSkillScore = textView5;
        this.tvTitle = textView6;
        this.view = view2;
    }

    public DrawerLayout getRoot() {
        return this.rootView;
    }

    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static ActivityHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.activity_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ActivityHomeBinding bind(View view2) {
        View view3 = view2;
        int i = C1188R.C1192id.activity_main_content_id;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.activity_main_content_id);
        if (relativeLayout != null) {
            i = C1188R.C1192id.bottomNav;
            BottomNavigationView bottomNavigationView = (BottomNavigationView) ViewBindings.findChildViewById(view3, C1188R.C1192id.bottomNav);
            if (bottomNavigationView != null) {
                DrawerLayout drawerLayout2 = (DrawerLayout) view3;
                i = C1188R.C1192id.ivCrickpe;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivCrickpe);
                if (imageView != null) {
                    i = C1188R.C1192id.ivMenu;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivMenu);
                    if (imageView2 != null) {
                        i = C1188R.C1192id.ivProfile;
                        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivProfile);
                        if (circleImageView != null) {
                            i = C1188R.C1192id.ivRight;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivRight);
                            if (imageView3 != null) {
                                i = C1188R.C1192id.ivWallet;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.ivWallet);
                                if (imageView4 != null) {
                                    i = C1188R.C1192id.llProfile;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.llProfile);
                                    if (relativeLayout2 != null) {
                                        i = C1188R.C1192id.main_activity_content_id;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.main_activity_content_id);
                                        if (linearLayout != null) {
                                            i = C1188R.C1192id.nav_host_fragment;
                                            FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(view3, C1188R.C1192id.nav_host_fragment);
                                            if (fragmentContainerView != null) {
                                                i = C1188R.C1192id.navigation_layout;
                                                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.navigation_layout);
                                                if (linearLayout2 != null) {
                                                    i = C1188R.C1192id.navigation_rv;
                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view3, C1188R.C1192id.navigation_rv);
                                                    if (recyclerView != null) {
                                                        i = C1188R.C1192id.profileImage;
                                                        CircleImageView circleImageView2 = (CircleImageView) ViewBindings.findChildViewById(view3, C1188R.C1192id.profileImage);
                                                        if (circleImageView2 != null) {
                                                            i = C1188R.C1192id.rlName;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.rlName);
                                                            if (relativeLayout3 != null) {
                                                                i = C1188R.C1192id.rlTop;
                                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.rlTop);
                                                                if (relativeLayout4 != null) {
                                                                    i = C1188R.C1192id.rlWallet;
                                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view3, C1188R.C1192id.rlWallet);
                                                                    if (relativeLayout5 != null) {
                                                                        i = C1188R.C1192id.tvAmount;
                                                                        TextView textView = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvAmount);
                                                                        if (textView != null) {
                                                                            i = C1188R.C1192id.tvChat;
                                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvChat);
                                                                            if (textView2 != null) {
                                                                                i = C1188R.C1192id.tvLogout;
                                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvLogout);
                                                                                if (textView3 != null) {
                                                                                    i = C1188R.C1192id.tvName;
                                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvName);
                                                                                    if (textView4 != null) {
                                                                                        i = C1188R.C1192id.tvSkillScore;
                                                                                        TextView textView5 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvSkillScore);
                                                                                        if (textView5 != null) {
                                                                                            i = C1188R.C1192id.tvTitle;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(view3, C1188R.C1192id.tvTitle);
                                                                                            if (textView6 != null) {
                                                                                                i = C1188R.C1192id.view;
                                                                                                View findChildViewById = ViewBindings.findChildViewById(view3, C1188R.C1192id.view);
                                                                                                if (findChildViewById != null) {
                                                                                                    return new ActivityHomeBinding(drawerLayout2, relativeLayout, bottomNavigationView, drawerLayout2, imageView, imageView2, circleImageView, imageView3, imageView4, relativeLayout2, linearLayout, fragmentContainerView, linearLayout2, recyclerView, circleImageView2, relativeLayout3, relativeLayout4, relativeLayout5, textView, textView2, textView3, textView4, textView5, textView6, findChildViewById);
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
