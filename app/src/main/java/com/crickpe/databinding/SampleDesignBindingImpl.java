package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
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

public class SampleDesignBindingImpl extends SampleDesignBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final RelativeLayout mboundView0;
    private final ImageView mboundView2;
    private final TextView mboundView3;
    private final ImageView mboundView4;
    private final TextView mboundView5;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.currentItemRoot, 10);
        sparseIntArray.put(C1188R.C1192id.name, 11);
        sparseIntArray.put(C1188R.C1192id.tvScoreT1, 12);
        sparseIntArray.put(C1188R.C1192id.tvScoreT2, 13);
        sparseIntArray.put(C1188R.C1192id.tvInvitee, 14);
        sparseIntArray.put(C1188R.C1192id.llShareReferalCode, 15);
        sparseIntArray.put(C1188R.C1192id.tvShare, 16);
        sparseIntArray.put(C1188R.C1192id.tvContact, 17);
        sparseIntArray.put(C1188R.C1192id.tvDone, 18);
        sparseIntArray.put(C1188R.C1192id.progressBar, 19);
    }

    public SampleDesignBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 20, sIncludes, sViewsWithIds));
    }

    private SampleDesignBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[10], objArr[15], objArr[11], objArr[19], objArr[17], objArr[8], objArr[9], objArr[18], objArr[14], objArr[1], objArr[6], objArr[7], objArr[12], objArr[13], objArr[16]);
        this.mDirtyFlags = -1;
        RelativeLayout relativeLayout = objArr[0];
        this.mboundView0 = relativeLayout;
        relativeLayout.setTag((Object) null);
        ImageView imageView = objArr[2];
        this.mboundView2 = imageView;
        imageView.setTag((Object) null);
        TextView textView = objArr[3];
        this.mboundView3 = textView;
        textView.setTag((Object) null);
        ImageView imageView2 = objArr[4];
        this.mboundView4 = imageView2;
        imageView2.setTag((Object) null);
        TextView textView2 = objArr[5];
        this.mboundView5 = textView2;
        textView2.setTag((Object) null);
        this.tvContestCode.setTag((Object) null);
        this.tvContestLink.setTag((Object) null);
        this.tvName.setTag((Object) null);
        this.tvOverT1.setTag((Object) null);
        this.tvOverT2.setTag((Object) null);
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
        String str6;
        String str7;
        Match match;
        Contest contest;
        Users users;
        Team2 team2;
        Team1 team1;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ContestDetailModel contestDetailModel = this.mModel;
        float f = 0.0f;
        int i = 0;
        int i2 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (contestDetailModel != null) {
                contest = contestDetailModel.getContest();
                match = contestDetailModel.getMatch();
            } else {
                contest = null;
                match = null;
            }
            if (contest != null) {
                str5 = contest.getReferalCode();
                f = contest.getWinningAmount();
                str4 = contest.getContestUrl();
                users = contest.getUsers();
                i = contest.getEntryFee();
            } else {
                str5 = null;
                str4 = null;
                users = null;
            }
            if (match != null) {
                team1 = match.getTeam1();
                team2 = match.getTeam2();
            } else {
                team1 = null;
                team2 = null;
            }
            str3 = users != null ? users.getName() : null;
            if (team1 != null) {
                str2 = team1.getCode();
                str7 = team1.getTeamIconUrl();
            } else {
                str7 = null;
                str2 = null;
            }
            if (team2 != null) {
                str = team2.getCode();
                str6 = team2.getTeamIconUrl();
            } else {
                str6 = null;
                str = null;
            }
        } else {
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i2 != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView2, str7, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView3, str2);
            BindingAdapters.setImageUrl(this.mboundView4, str6, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView5, str);
            TextViewBindingAdapter.setText(this.tvContestCode, str5);
            TextViewBindingAdapter.setText(this.tvContestLink, str4);
            TextViewBindingAdapter.setText(this.tvName, str3);
            BindingAdapters.setNumber(this.tvOverT1, (double) f);
            BindingAdapters.setNumber(this.tvOverT2, (double) i);
        }
    }
}
