package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Match;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Team1;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Team2;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Users;
import p019de.hdodenhof.circleimageview.CircleImageView;

public class FragmentPrivateContestDetailBindingImpl extends FragmentPrivateContestDetailBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final TextView mboundView1;
    private final ProgressBar mboundView2;
    private final TextView mboundView3;
    private final CircleImageView mboundView6;
    private final TextView mboundView7;
    private final CircleImageView mboundView8;
    private final TextView mboundView9;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.rlTop, 12);
        sparseIntArray.put(C1188R.C1192id.textView12, 13);
        sparseIntArray.put(C1188R.C1192id.llProgress, 14);
        sparseIntArray.put(C1188R.C1192id.currentItemRoot, 15);
        sparseIntArray.put(C1188R.C1192id.name, 16);
        sparseIntArray.put(C1188R.C1192id.tvScoreT1, 17);
        sparseIntArray.put(C1188R.C1192id.tvScoreT2, 18);
        sparseIntArray.put(C1188R.C1192id.nestedScrollView3, 19);
        sparseIntArray.put(C1188R.C1192id.tvJoined, 20);
        sparseIntArray.put(C1188R.C1192id.playerImageOne, 21);
        sparseIntArray.put(C1188R.C1192id.rvJoinedFriends, 22);
        sparseIntArray.put(C1188R.C1192id.rlInviteFrnd, 23);
        sparseIntArray.put(C1188R.C1192id.ivInvite, 24);
        sparseIntArray.put(C1188R.C1192id.tvInvite, 25);
        sparseIntArray.put(C1188R.C1192id.tvJoin, 26);
        sparseIntArray.put(C1188R.C1192id.rlProgress, 27);
        sparseIntArray.put(C1188R.C1192id.progressBar, 28);
    }

    public FragmentPrivateContestDetailBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 29, sIncludes, sViewsWithIds));
    }

    private FragmentPrivateContestDetailBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[15], objArr[24], objArr[14], objArr[16], objArr[19], objArr[21], objArr[28], objArr[23], objArr[27], objArr[12], objArr[22], objArr[13], objArr[25], objArr[26], objArr[20], objArr[5], objArr[10], objArr[11], objArr[17], objArr[18], objArr[4]);
        this.mDirtyFlags = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag((Object) null);
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        ProgressBar progressBar = objArr[2];
        this.mboundView2 = progressBar;
        progressBar.setTag((Object) null);
        TextView textView2 = objArr[3];
        this.mboundView3 = textView2;
        textView2.setTag((Object) null);
        CircleImageView circleImageView = objArr[6];
        this.mboundView6 = circleImageView;
        circleImageView.setTag((Object) null);
        TextView textView3 = objArr[7];
        this.mboundView7 = textView3;
        textView3.setTag((Object) null);
        CircleImageView circleImageView2 = objArr[8];
        this.mboundView8 = circleImageView2;
        circleImageView2.setTag((Object) null);
        TextView textView4 = objArr[9];
        this.mboundView9 = textView4;
        textView4.setTag((Object) null);
        this.tvName.setTag((Object) null);
        this.tvOverT1.setTag((Object) null);
        this.tvOverT2.setTag((Object) null);
        this.tvTotalSpots.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 2;
        }
        requestRebind();
    }

    public boolean hasPendingBindings() {
        synchronized (this) {
            if (this.mDirtyFlags != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean setVariable(int i, Object obj) {
        if (2 != i) {
            return false;
        }
        setModel((ContestDetailModel) obj);
        return true;
    }

    public void setModel(ContestDetailModel contestDetailModel) {
        this.mModel = contestDetailModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        int i;
        String str6;
        int i2;
        String str7;
        String str8;
        Contest contest;
        Match match;
        Users users;
        Team1 team1;
        Team2 team2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ContestDetailModel contestDetailModel = this.mModel;
        float f = 0.0f;
        int i3 = 0;
        int i4 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i4 != 0) {
            if (contestDetailModel != null) {
                contest = contestDetailModel.getContest();
                match = contestDetailModel.getMatch();
            } else {
                match = null;
                contest = null;
            }
            if (contest != null) {
                int joinedUserCount = contest.getJoinedUserCount();
                float winningAmount = contest.getWinningAmount();
                users = contest.getUser();
                int totalSpots = contest.getTotalSpots();
                String name = contest.getName();
                int i5 = totalSpots;
                i = contest.getEntryFee();
                str7 = name;
                f = winningAmount;
                i2 = joinedUserCount;
                i3 = i5;
            } else {
                str7 = null;
                users = null;
                i2 = 0;
                i = 0;
            }
            if (match != null) {
                team1 = match.getTeam1();
                team2 = match.getTeam2();
            } else {
                team2 = null;
                team1 = null;
            }
            str6 = users != null ? users.getName() : null;
            String num = Integer.toString(i3);
            int i6 = i3 - i2;
            if (team1 != null) {
                str2 = team1.getCode();
                str5 = team1.getTeamIconUrl();
            } else {
                str5 = null;
                str2 = null;
            }
            if (team2 != null) {
                str = team2.getCode();
                str8 = team2.getTeamIconUrl();
            } else {
                str8 = null;
                str = null;
            }
            str4 = num + " spots";
            str3 = Integer.toString(i6) + " spots left";
        } else {
            str8 = null;
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
            i2 = 0;
            i = 0;
        }
        if (i4 != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, str7);
            this.mboundView2.setMax(i3);
            this.mboundView2.setProgress(i2);
            TextViewBindingAdapter.setText(this.mboundView3, str3);
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView6, str5, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView7, str2);
            BindingAdapters.setImageUrl(this.mboundView8, str8, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView9, str);
            TextViewBindingAdapter.setText(this.tvName, str6);
            BindingAdapters.setNumber(this.tvOverT1, (double) f);
            BindingAdapters.setNumber(this.tvOverT2, (double) i);
            TextViewBindingAdapter.setText(this.tvTotalSpots, str4);
        }
    }
}
