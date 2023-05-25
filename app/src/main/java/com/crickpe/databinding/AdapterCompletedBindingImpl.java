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

public class AdapterCompletedBindingImpl extends AdapterCompletedBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final CircleImageView mboundView2;
    private final TextView mboundView3;
    private final CircleImageView mboundView4;
    private final TextView mboundView5;
    private final TextView mboundView8;
    private final TextView mboundView9;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.tvScoreT1, 10);
        sparseIntArray.put(C1188R.C1192id.tvScoreT2, 11);
    }

    public AdapterCompletedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private AdapterCompletedBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[1], objArr[6], objArr[7], objArr[10], objArr[11]);
        this.mDirtyFlags = -1;
        CircleImageView circleImageView = objArr[2];
        this.mboundView2 = circleImageView;
        circleImageView.setTag((Object) null);
        TextView textView = objArr[3];
        this.mboundView3 = textView;
        textView.setTag((Object) null);
        CircleImageView circleImageView2 = objArr[4];
        this.mboundView4 = circleImageView2;
        circleImageView2.setTag((Object) null);
        TextView textView2 = objArr[5];
        this.mboundView5 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = objArr[8];
        this.mboundView8 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[9];
        this.mboundView9 = textView4;
        textView4.setTag((Object) null);
        this.onItemClick.setTag((Object) null);
        this.tvMatchName.setTag((Object) null);
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
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        double d;
        String str8;
        int i;
        int i2;
        Team1 team1;
        Team2 team2;
        int i3;
        String str9;
        String str10;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        MyMatchesModel myMatchesModel = this.mModel;
        int i4 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i4 != 0) {
            if (myMatchesModel != null) {
                str10 = myMatchesModel.getName();
                d = myMatchesModel.getYouWon();
                str9 = myMatchesModel.getTitle();
                team2 = myMatchesModel.getTeam2();
                team1 = myMatchesModel.getTeam1();
                i2 = myMatchesModel.getParticipants();
                i = myMatchesModel.getMyFantasyTeamCount();
                i3 = myMatchesModel.getMyContestCount();
            } else {
                d = 0.0d;
                str10 = null;
                str9 = null;
                team2 = null;
                team1 = null;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            String str11 = str10 + "|";
            str4 = Integer.toString(i2);
            str3 = Integer.toString(i);
            str7 = Integer.toString(i3);
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
            str8 = str11 + str9;
        } else {
            d = 0.0d;
            str8 = null;
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i4 != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView2, str, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView3, str5);
            BindingAdapters.setImageUrl(this.mboundView4, str6, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView5, str2);
            TextViewBindingAdapter.setText(this.mboundView8, str3);
            TextViewBindingAdapter.setText(this.mboundView9, str7);
            TextViewBindingAdapter.setText(this.tvMatchName, str8);
            TextViewBindingAdapter.setText(this.tvOverT1, str4);
            BindingAdapters.setNumberWithoutDec(this.tvOverT2, d);
        }
    }
}
