package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import com.crickpe.view.home.fragments.my_matches.Team1;
import com.crickpe.view.home.fragments.my_matches.Team2;
import p019de.hdodenhof.circleimageview.CircleImageView;

public class AdapterUpcomingMatchesBindingImpl extends AdapterUpcomingMatchesBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final CircleImageView mboundView1;
    private final TextView mboundView2;
    private final CircleImageView mboundView4;
    private final TextView mboundView5;
    private final TextView mboundView6;
    private final TextView mboundView7;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.tvMatchName, 8);
        sparseIntArray.put(C1188R.C1192id.tvUpcomingTime, 9);
    }

    public AdapterUpcomingMatchesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 10, sIncludes, sViewsWithIds));
    }

    private AdapterUpcomingMatchesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[3], objArr[8], objArr[9]);
        this.mDirtyFlags = -1;
        this.cvUpcomingMatches.setTag((Object) null);
        CircleImageView circleImageView = objArr[1];
        this.mboundView1 = circleImageView;
        circleImageView.setTag((Object) null);
        TextView textView = objArr[2];
        this.mboundView2 = textView;
        textView.setTag((Object) null);
        CircleImageView circleImageView2 = objArr[4];
        this.mboundView4 = circleImageView2;
        circleImageView2.setTag((Object) null);
        TextView textView2 = objArr[5];
        this.mboundView5 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = objArr[6];
        this.mboundView6 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[7];
        this.mboundView7 = textView4;
        textView4.setTag((Object) null);
        this.tvContestPrice.setTag((Object) null);
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
        setModel((MyMatchesModel) obj);
        return true;
    }

    public void setModel(MyMatchesModel myMatchesModel) {
        this.mModel = myMatchesModel;
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
        int i;
        int i2;
        Team1 team1;
        Team2 team2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        MyMatchesModel myMatchesModel = this.mModel;
        double d = 0.0d;
        int i3 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i3 != 0) {
            if (myMatchesModel != null) {
                team2 = myMatchesModel.getTeam2();
                team1 = myMatchesModel.getTeam1();
                i2 = myMatchesModel.getMyFantasyTeamCount();
                d = myMatchesModel.getMegaPrize();
                i = myMatchesModel.getMyContestCount();
            } else {
                team2 = null;
                team1 = null;
                i2 = 0;
                i = 0;
            }
            if (team2 != null) {
                str2 = team2.getCode();
                str6 = team2.getTeamIconUrl();
            } else {
                str6 = null;
                str2 = null;
            }
            if (team1 != null) {
                str = team1.getTeamIconUrl();
                str5 = team1.getCode();
            } else {
                str5 = null;
                str = null;
            }
            str4 = Integer.toString(i2);
            str3 = Integer.toString(i);
        } else {
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i3 != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView1, str, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView2, str5);
            BindingAdapters.setImageUrl(this.mboundView4, str6, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView5, str2);
            TextViewBindingAdapter.setText(this.mboundView6, str4);
            TextViewBindingAdapter.setText(this.mboundView7, str3);
            BindingAdapters.setNumber(this.tvContestPrice, d);
        }
    }
}
