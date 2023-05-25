package com.crickpe.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.ImageViewBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import com.crickpe.view.home.fragments.my_matches.Team1;
import com.crickpe.view.home.fragments.my_matches.Team2;
import com.crickpe.view.home.fragments.my_matches.Venue;
import p019de.hdodenhof.circleimageview.CircleImageView;

public class AdapterRecentEarningsBindingImpl extends AdapterRecentEarningsBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private final CircleImageView mboundView1;
    private final TextView mboundView2;
    private final CircleImageView mboundView3;
    private final TextView mboundView4;
    private final ImageView mboundView6;
    private final TextView mboundView8;
    private final TextView mboundView9;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.tvMatch, 10);
        sparseIntArray.put(C1188R.C1192id.currentItemRoot, 11);
        sparseIntArray.put(C1188R.C1192id.tvMatchName, 12);
        sparseIntArray.put(C1188R.C1192id.tvScoreT1, 13);
    }

    public AdapterRecentEarningsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 14, sIncludes, sViewsWithIds));
    }

    private AdapterRecentEarningsBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[11], objArr[10], objArr[12], objArr[5], objArr[7], objArr[13]);
        this.mDirtyFlags = -1;
        LinearLayout linearLayout = objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
        CircleImageView circleImageView = objArr[1];
        this.mboundView1 = circleImageView;
        circleImageView.setTag((Object) null);
        TextView textView = objArr[2];
        this.mboundView2 = textView;
        textView.setTag((Object) null);
        CircleImageView circleImageView2 = objArr[3];
        this.mboundView3 = circleImageView2;
        circleImageView2.setTag((Object) null);
        TextView textView2 = objArr[4];
        this.mboundView4 = textView2;
        textView2.setTag((Object) null);
        ImageView imageView = objArr[6];
        this.mboundView6 = imageView;
        imageView.setTag((Object) null);
        TextView textView3 = objArr[8];
        this.mboundView8 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[9];
        this.mboundView9 = textView4;
        textView4.setTag((Object) null);
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
        double d;
        double d2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        Drawable drawable;
        String str6;
        Team1 team1;
        Team2 team2;
        Venue venue;
        int i;
        String str7;
        String str8;
        String str9;
        int i2;
        Context context;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        MyMatchesModel myMatchesModel = this.mModel;
        int i3 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i3 != 0) {
            boolean z = false;
            if (myMatchesModel != null) {
                venue = myMatchesModel.getVenue();
                d2 = myMatchesModel.getMegaPrize();
                d = myMatchesModel.getYouWon();
                team2 = myMatchesModel.getTeam2();
                team1 = myMatchesModel.getTeam1();
                i = myMatchesModel.getMyContestCount();
            } else {
                d2 = 0.0d;
                d = 0.0d;
                i = 0;
                venue = null;
                team2 = null;
                team1 = null;
            }
            str5 = venue != null ? venue.getVenueCity() : null;
            if (d == 0.0d) {
                z = true;
            }
            str6 = Integer.toString(i);
            if (i3 != 0) {
                j |= z ? 8 : 4;
            }
            if (team2 != null) {
                str4 = team2.getCode();
                str7 = team2.getTeamIconUrl();
            } else {
                str4 = null;
                str7 = null;
            }
            if (team1 != null) {
                str9 = team1.getTeamIconUrl();
                str8 = team1.getCode();
            } else {
                str9 = null;
                str8 = null;
            }
            if (z) {
                context = this.mboundView6.getContext();
                i2 = C1188R.C1190drawable.duck;
            } else {
                context = this.mboundView6.getContext();
                i2 = C1188R.C1190drawable.winner_contest_cup;
            }
            drawable = AppCompatResources.getDrawable(context, i2);
            str2 = str8;
            String str10 = str9;
            str = str7;
            str3 = str10;
        } else {
            d2 = 0.0d;
            d = 0.0d;
            str6 = null;
            drawable = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if ((j & 3) != 0) {
            Drawable drawable2 = null;
            BindingAdapters.setImageUrl(this.mboundView1, str3, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView2, str2);
            BindingAdapters.setImageUrl(this.mboundView3, str, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView4, str4);
            ImageViewBindingAdapter.setImageDrawable(this.mboundView6, drawable);
            BindingAdapters.setNumber(this.mboundView8, d2);
            TextViewBindingAdapter.setText(this.mboundView9, str5);
            TextViewBindingAdapter.setText(this.tvOverT1, str6);
            BindingAdapters.setNumber(this.tvOverT2, d);
        }
    }
}
