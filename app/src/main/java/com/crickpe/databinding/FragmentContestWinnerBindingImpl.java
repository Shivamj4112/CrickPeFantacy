package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.contest_winners.models.model.ContestDetailWinnersModel;
import com.crickpe.view.detail.fragments.contest_winners.models.model.Match;
import com.crickpe.view.detail.fragments.contest_winners.models.model.Team1;
import com.crickpe.view.detail.fragments.contest_winners.models.model.Winners;
import com.crickpe.view.home.fragments.home.Team2;

public class FragmentContestWinnerBindingImpl extends FragmentContestWinnerBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final ImageView mboundView3;
    private final TextView mboundView4;
    private final ImageView mboundView5;
    private final TextView mboundView6;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.recyclerView, 7);
        sparseIntArray.put(C1188R.C1192id.cvUpcomingMatches, 8);
        sparseIntArray.put(C1188R.C1192id.tvContestPrice, 9);
        sparseIntArray.put(C1188R.C1192id.onItemClick, 10);
        sparseIntArray.put(C1188R.C1192id.llProfile, 11);
        sparseIntArray.put(C1188R.C1192id.tvName, 12);
        sparseIntArray.put(C1188R.C1192id.tvPoints, 13);
        sparseIntArray.put(C1188R.C1192id.ivFiler, 14);
        sparseIntArray.put(C1188R.C1192id.rlFilterContest, 15);
        sparseIntArray.put(C1188R.C1192id.filter, 16);
        sparseIntArray.put(C1188R.C1192id.rvFilterWinners, 17);
        sparseIntArray.put(C1188R.C1192id.rvWinnersList, 18);
        sparseIntArray.put(C1188R.C1192id.progressBar, 19);
    }

    public FragmentContestWinnerBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 20, sIncludes, sViewsWithIds));
    }

    private FragmentContestWinnerBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[8], objArr[16], objArr[14], objArr[11], objArr[10], objArr[19], objArr[7], objArr[15], objArr[17], objArr[18], objArr[9], objArr[2], objArr[1], objArr[12], objArr[13]);
        this.mDirtyFlags = -1;
        ConstraintLayout constraintLayout = objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag((Object) null);
        ImageView imageView = objArr[3];
        this.mboundView3 = imageView;
        imageView.setTag((Object) null);
        TextView textView = objArr[4];
        this.mboundView4 = textView;
        textView.setTag((Object) null);
        ImageView imageView2 = objArr[5];
        this.mboundView5 = imageView2;
        imageView2.setTag((Object) null);
        TextView textView2 = objArr[6];
        this.mboundView6 = textView2;
        textView2.setTag((Object) null);
        this.tvDate.setTag((Object) null);
        this.tvMatchName.setTag((Object) null);
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
        setModel((ContestDetailWinnersModel) obj);
        return true;
    }

    public void setModel(ContestDetailWinnersModel contestDetailWinnersModel) {
        this.mModel = contestDetailWinnersModel;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        long j2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Team2 team2;
        Team1 team1;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ContestDetailWinnersModel contestDetailWinnersModel = this.mModel;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            Winners winners = contestDetailWinnersModel != null ? contestDetailWinnersModel.getWinners() : null;
            Match match = winners != null ? winners.getMatch() : null;
            if (match != null) {
                team1 = match.getTeam1();
                team2 = match.getTeam2();
                str2 = match.getTitle();
                j2 = match.getStartAtIST();
            } else {
                j2 = 0;
                team1 = null;
                team2 = null;
                str2 = null;
            }
            if (team1 != null) {
                str5 = team1.getTeamIconUrl();
                str4 = team1.getCode();
            } else {
                str5 = null;
                str4 = null;
            }
            if (team2 != null) {
                str = team2.getCode();
                str3 = team2.getTeamIconUrl();
            } else {
                str3 = null;
                str = null;
            }
        } else {
            j2 = 0;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView3, str5, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView4, str4);
            BindingAdapters.setImageUrl(this.mboundView5, str3, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView6, str);
            BindingAdapters.setDate(this.tvDate, j2);
            TextViewBindingAdapter.setText(this.tvMatchName, str2);
        }
    }
}
