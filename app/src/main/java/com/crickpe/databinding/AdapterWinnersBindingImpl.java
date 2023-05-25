package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.home.fragments.winner.models.Contest;
import com.crickpe.view.home.fragments.winner.models.MegaWinnersM;
import com.crickpe.view.home.fragments.winner.models.Team1;

public class AdapterWinnersBindingImpl extends AdapterWinnersBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
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
        sparseIntArray.put(C1188R.C1192id.rvWinnersList, 8);
        sparseIntArray.put(C1188R.C1192id.tvViewAllWinners, 9);
    }

    public AdapterWinnersBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private AdapterWinnersBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[8], objArr[7], objArr[2], objArr[1], objArr[9]);
        this.mDirtyFlags = -1;
        this.cvUpcomingMatches.setTag((Object) null);
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
        this.tvContestPrice.setTag((Object) null);
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
        setModel((MegaWinnersM) obj);
        return true;
    }

    public void setModel(MegaWinnersM megaWinnersM) {
        this.mModel = megaWinnersM;
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
        Team1 team1;
        Team1 team12;
        Contest contest;
        synchronized (this) {
            j = this.mDirtyFlags;
            j2 = 0;
            this.mDirtyFlags = 0;
        }
        MegaWinnersM megaWinnersM = this.mModel;
        int i = 0;
        int i2 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (megaWinnersM != null) {
                contest = megaWinnersM.getContest();
                str4 = megaWinnersM.getTitle();
                j2 = megaWinnersM.getStartAtIST();
                team1 = megaWinnersM.getTeam2();
                team12 = megaWinnersM.getTeam1();
            } else {
                contest = null;
                str4 = null;
                team12 = null;
                team1 = null;
            }
            if (contest != null) {
                i = contest.getWinningAmount();
            }
            if (team1 != null) {
                str5 = team1.getCode();
                str2 = team1.getTeamIconUrl();
            } else {
                str5 = null;
                str2 = null;
            }
            if (team12 != null) {
                str = team12.getTeamIconUrl();
                str3 = team12.getCode();
            } else {
                str3 = null;
                str = null;
            }
        } else {
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i2 != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView3, str, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView4, str3);
            BindingAdapters.setImageUrl(this.mboundView5, str2, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView6, str5);
            BindingAdapters.setNumber(this.tvContestPrice, (double) i);
            BindingAdapters.setDate(this.tvDate, j2);
            TextViewBindingAdapter.setText(this.tvMatchName, str4);
        }
    }
}
