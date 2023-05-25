package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
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
import com.crickpe.C1188R;

public final class FragmentContestBinding implements ViewBinding {
    public final ConstraintLayout constraintJoinPool;
    public final EditText etReferCode;
    public final HorizontalScrollView horizontalScrollView;
    public final ImageView ivJoinContest;
    public final ImageView ivMyContest;
    public final ImageView ivMyteams;
    public final TextView joinContests;
    public final LinearLayout llCreate;
    public final LinearLayout llSortBy;
    public final TextView myContests;
    public final TextView myTeams;
    public final NestedScrollView nestedScrollView;
    public final ImageView noDataImage;
    public final ProgressBar progressBar;
    public final RelativeLayout rlCreateTeam;
    public final RelativeLayout rlJoinContest;
    public final RelativeLayout rlMyContest;
    public final RelativeLayout rlMyTeams;
    public final LinearLayout rlNoData;
    private final ConstraintLayout rootView;
    public final RecyclerView rvMyContest;
    public final RecyclerView rvMyTeams;
    public final RecyclerView rvTopContest;
    public final SwipeRefreshLayout swipeRefresh;
    public final TextView textView4;
    public final TextView textView5;
    public final TextView tvAll;
    public final TextView tvCreateContest;
    public final TextView tvCreateTeam;
    public final TextView tvCreateTeam2;
    public final TextView tvFriendsPool;
    public final TextView tvJoinPool;
    public final TextView tvMega;
    public final TextView tvNoData;
    public final TextView tvOneOne;
    public final TextView tvSortBy;

    private FragmentContestBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, EditText editText, HorizontalScrollView horizontalScrollView2, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView2, TextView textView3, NestedScrollView nestedScrollView2, ImageView imageView4, ProgressBar progressBar2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, LinearLayout linearLayout3, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, SwipeRefreshLayout swipeRefreshLayout, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17) {
        this.rootView = constraintLayout;
        this.constraintJoinPool = constraintLayout2;
        this.etReferCode = editText;
        this.horizontalScrollView = horizontalScrollView2;
        this.ivJoinContest = imageView;
        this.ivMyContest = imageView2;
        this.ivMyteams = imageView3;
        this.joinContests = textView;
        this.llCreate = linearLayout;
        this.llSortBy = linearLayout2;
        this.myContests = textView2;
        this.myTeams = textView3;
        this.nestedScrollView = nestedScrollView2;
        this.noDataImage = imageView4;
        this.progressBar = progressBar2;
        this.rlCreateTeam = relativeLayout;
        this.rlJoinContest = relativeLayout2;
        this.rlMyContest = relativeLayout3;
        this.rlMyTeams = relativeLayout4;
        this.rlNoData = linearLayout3;
        this.rvMyContest = recyclerView;
        this.rvMyTeams = recyclerView2;
        this.rvTopContest = recyclerView3;
        this.swipeRefresh = swipeRefreshLayout;
        this.textView4 = textView6;
        this.textView5 = textView7;
        this.tvAll = textView8;
        this.tvCreateContest = textView9;
        this.tvCreateTeam = textView10;
        this.tvCreateTeam2 = textView11;
        this.tvFriendsPool = textView12;
        this.tvJoinPool = textView13;
        this.tvMega = textView14;
        this.tvNoData = textView15;
        this.tvOneOne = textView16;
        this.tvSortBy = textView17;
    }

    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static FragmentContestBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentContestBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_contest, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentContestBinding bind(View view) {
        View view2 = view;
        int i = C1188R.C1192id.constraintJoinPool;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.constraintJoinPool);
        if (constraintLayout != null) {
            i = C1188R.C1192id.etReferCode;
            EditText editText = (EditText) ViewBindings.findChildViewById(view2, C1188R.C1192id.etReferCode);
            if (editText != null) {
                i = C1188R.C1192id.horizontalScrollView;
                HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) ViewBindings.findChildViewById(view2, C1188R.C1192id.horizontalScrollView);
                if (horizontalScrollView2 != null) {
                    i = C1188R.C1192id.ivJoinContest;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivJoinContest);
                    if (imageView != null) {
                        i = C1188R.C1192id.ivMyContest;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivMyContest);
                        if (imageView2 != null) {
                            i = C1188R.C1192id.ivMyteams;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivMyteams);
                            if (imageView3 != null) {
                                i = C1188R.C1192id.joinContests;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.joinContests);
                                if (textView != null) {
                                    i = C1188R.C1192id.llCreate;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llCreate);
                                    if (linearLayout != null) {
                                        i = C1188R.C1192id.llSortBy;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.llSortBy);
                                        if (linearLayout2 != null) {
                                            i = C1188R.C1192id.myContests;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.myContests);
                                            if (textView2 != null) {
                                                i = C1188R.C1192id.myTeams;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.myTeams);
                                                if (textView3 != null) {
                                                    i = C1188R.C1192id.nestedScrollView;
                                                    NestedScrollView nestedScrollView2 = (NestedScrollView) ViewBindings.findChildViewById(view2, C1188R.C1192id.nestedScrollView);
                                                    if (nestedScrollView2 != null) {
                                                        i = C1188R.C1192id.noDataImage;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.noDataImage);
                                                        if (imageView4 != null) {
                                                            i = C1188R.C1192id.progressBar;
                                                            ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view2, C1188R.C1192id.progressBar);
                                                            if (progressBar2 != null) {
                                                                i = C1188R.C1192id.rlCreateTeam;
                                                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlCreateTeam);
                                                                if (relativeLayout != null) {
                                                                    i = C1188R.C1192id.rlJoinContest;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlJoinContest);
                                                                    if (relativeLayout2 != null) {
                                                                        i = C1188R.C1192id.rlMyContest;
                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlMyContest);
                                                                        if (relativeLayout3 != null) {
                                                                            i = C1188R.C1192id.rlMyTeams;
                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlMyTeams);
                                                                            if (relativeLayout4 != null) {
                                                                                i = C1188R.C1192id.rlNoData;
                                                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.rlNoData);
                                                                                if (linearLayout3 != null) {
                                                                                    i = C1188R.C1192id.rvMyContest;
                                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvMyContest);
                                                                                    if (recyclerView != null) {
                                                                                        i = C1188R.C1192id.rvMyTeams;
                                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvMyTeams);
                                                                                        if (recyclerView2 != null) {
                                                                                            i = C1188R.C1192id.rvTopContest;
                                                                                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view2, C1188R.C1192id.rvTopContest);
                                                                                            if (recyclerView3 != null) {
                                                                                                i = C1188R.C1192id.swipeRefresh;
                                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) ViewBindings.findChildViewById(view2, C1188R.C1192id.swipeRefresh);
                                                                                                if (swipeRefreshLayout != null) {
                                                                                                    i = C1188R.C1192id.textView4;
                                                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView4);
                                                                                                    if (textView6 != null) {
                                                                                                        i = C1188R.C1192id.textView5;
                                                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.textView5);
                                                                                                        if (textView7 != null) {
                                                                                                            i = C1188R.C1192id.tvAll;
                                                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvAll);
                                                                                                            if (textView8 != null) {
                                                                                                                i = C1188R.C1192id.tvCreateContest;
                                                                                                                TextView textView9 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCreateContest);
                                                                                                                if (textView9 != null) {
                                                                                                                    i = C1188R.C1192id.tvCreateTeam;
                                                                                                                    TextView textView10 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCreateTeam);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i = C1188R.C1192id.tvCreateTeam2;
                                                                                                                        TextView textView11 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvCreateTeam2);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i = C1188R.C1192id.tvFriendsPool;
                                                                                                                            TextView textView12 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvFriendsPool);
                                                                                                                            if (textView12 != null) {
                                                                                                                                i = C1188R.C1192id.tvJoinPool;
                                                                                                                                TextView textView13 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvJoinPool);
                                                                                                                                if (textView13 != null) {
                                                                                                                                    i = C1188R.C1192id.tvMega;
                                                                                                                                    TextView textView14 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvMega);
                                                                                                                                    if (textView14 != null) {
                                                                                                                                        i = C1188R.C1192id.tvNoData;
                                                                                                                                        TextView textView15 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvNoData);
                                                                                                                                        if (textView15 != null) {
                                                                                                                                            i = C1188R.C1192id.tvOneOne;
                                                                                                                                            TextView textView16 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvOneOne);
                                                                                                                                            if (textView16 != null) {
                                                                                                                                                i = C1188R.C1192id.tvSortBy;
                                                                                                                                                TextView textView17 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvSortBy);
                                                                                                                                                if (textView17 != null) {
                                                                                                                                                    return new FragmentContestBinding((ConstraintLayout) view2, constraintLayout, editText, horizontalScrollView2, imageView, imageView2, imageView3, textView, linearLayout, linearLayout2, textView2, textView3, nestedScrollView2, imageView4, progressBar2, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, linearLayout3, recyclerView, recyclerView2, recyclerView3, swipeRefreshLayout, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, textView17);
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
