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
import com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel;
import com.crickpe.view.home.fragments.home.Team1;
import com.crickpe.view.home.fragments.home.Team2;
import com.crickpe.view.home.fragments.home.Venue;

public class AdapterUpcomingMatchBindingImpl extends AdapterUpcomingMatchBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView2;
    private final ImageView mboundView3;
    private final TextView mboundView4;
    private final ImageView mboundView5;
    private final TextView mboundView6;
    private final TextView mboundView7;
    private final TextView mboundView8;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.rlStart, 10);
        sparseIntArray.put(C1188R.C1192id.textView, 11);
        sparseIntArray.put(C1188R.C1192id.imageView, 12);
    }

    public AdapterUpcomingMatchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 13, sIncludes, sViewsWithIds));
    }

    private AdapterUpcomingMatchBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[12], objArr[0], objArr[10], objArr[11], objArr[9], objArr[1]);
        this.mDirtyFlags = -1;
        TextView textView = objArr[2];
        this.mboundView2 = textView;
        textView.setTag((Object) null);
        ImageView imageView = objArr[3];
        this.mboundView3 = imageView;
        imageView.setTag((Object) null);
        TextView textView2 = objArr[4];
        this.mboundView4 = textView2;
        textView2.setTag((Object) null);
        ImageView imageView2 = objArr[5];
        this.mboundView5 = imageView2;
        imageView2.setTag((Object) null);
        TextView textView3 = objArr[6];
        this.mboundView6 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[7];
        this.mboundView7 = textView4;
        textView4.setTag((Object) null);
        TextView textView5 = objArr[8];
        this.mboundView8 = textView5;
        textView5.setTag((Object) null);
        this.onItemClick.setTag((Object) null);
        this.tvContest.setTag((Object) null);
        this.tvVanue.setTag((Object) null);
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
        setModel((UpcomingMatchModel) obj);
        return true;
    }

    public void setModel(UpcomingMatchModel upcomingMatchModel) {
        this.mModel = upcomingMatchModel;
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
        String str8;
        Team1 team1;
        Team2 team2;
        Venue venue;
        String str9;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        UpcomingMatchModel upcomingMatchModel = this.mModel;
        double d = 0.0d;
        int i = 0;
        int i2 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (upcomingMatchModel != null) {
                venue = upcomingMatchModel.getVenue();
                double megaPrize = upcomingMatchModel.getMegaPrize();
                str8 = upcomingMatchModel.getName();
                String title = upcomingMatchModel.getTitle();
                Team2 team22 = upcomingMatchModel.getTeam2();
                Team1 team12 = upcomingMatchModel.getTeam1();
                i = upcomingMatchModel.getMyContestCount();
                str9 = title;
                double d2 = megaPrize;
                team2 = team22;
                d = d2;
                team1 = team12;
            } else {
                str9 = null;
                venue = null;
                team2 = null;
                team1 = null;
                str8 = null;
            }
            str6 = venue != null ? venue.getVenueCity() : null;
            String str10 = str8 + "|";
            str3 = Integer.toString(i);
            if (team2 != null) {
                str2 = team2.getCode();
                str5 = team2.getTeamIconUrl();
            } else {
                str5 = null;
                str2 = null;
            }
            if (team1 != null) {
                str = team1.getTeamIconUrl();
                str4 = team1.getCode();
            } else {
                str4 = null;
                str = null;
            }
            str7 = str10 + str9;
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
            BindingAdapters.setNumber(this.mboundView2, d);
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView3, str, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView4, str4);
            BindingAdapters.setImageUrl(this.mboundView5, str5, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView6, str2);
            TextViewBindingAdapter.setText(this.mboundView7, str7);
            TextViewBindingAdapter.setText(this.mboundView8, str3);
            TextViewBindingAdapter.setText(this.tvContest, str3);
            TextViewBindingAdapter.setText(this.tvVanue, str6);
        }
    }
}
