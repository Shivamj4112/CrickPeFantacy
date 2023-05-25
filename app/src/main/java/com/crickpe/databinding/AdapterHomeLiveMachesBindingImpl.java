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

public class AdapterHomeLiveMachesBindingImpl extends AdapterHomeLiveMachesBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final TextView mboundView1;
    private final TextView mboundView3;
    private final CircleImageView mboundView4;
    private final TextView mboundView5;
    private final TextView mboundView6;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.textView17, 9);
        sparseIntArray.put(C1188R.C1192id.rlLiveBox, 10);
        sparseIntArray.put(C1188R.C1192id.tvTimeRemaining, 11);
        sparseIntArray.put(C1188R.C1192id.relativeLayout7, 12);
        sparseIntArray.put(C1188R.C1192id.textView18, 13);
    }

    public AdapterHomeLiveMachesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 14, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdapterHomeLiveMachesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[2], objArr[12], objArr[10], objArr[7], objArr[9], objArr[13], objArr[8], objArr[11]);
        this.mDirtyFlags = -1;
        this.cvLivesocre.setTag((Object) null);
        this.ivTeam1Flag.setTag((Object) null);
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[3];
        this.mboundView3 = textView2;
        textView2.setTag((Object) null);
        CircleImageView circleImageView = objArr[4];
        this.mboundView4 = circleImageView;
        circleImageView.setTag((Object) null);
        TextView textView3 = objArr[5];
        this.mboundView5 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[6];
        this.mboundView6 = textView4;
        textView4.setTag((Object) null);
        this.teamTwo.setTag((Object) null);
        this.textView19.setTag((Object) null);
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
        double d;
        String str7;
        Team2 team2;
        Team1 team1;
        String str8;
        String str9;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        MyMatchesModel myMatchesModel = this.mModel;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            if (myMatchesModel != null) {
                str9 = myMatchesModel.getName();
                d = myMatchesModel.getMegaPrize();
                str8 = myMatchesModel.getTitle();
                team2 = myMatchesModel.getTeam2();
                team1 = myMatchesModel.getTeam1();
            } else {
                d = 0.0d;
                str9 = null;
                str8 = null;
                team1 = null;
                team2 = null;
            }
            String str10 = str9 + " | ";
            if (team2 != null) {
                str4 = team2.getCode();
                str3 = team2.getTeamIconUrl();
                str5 = team2.getTeamName();
            } else {
                str5 = null;
                str4 = null;
                str3 = null;
            }
            if (team1 != null) {
                str2 = team1.getTeamName();
                str = team1.getTeamIconUrl();
                str6 = team1.getCode();
            } else {
                str6 = null;
                str2 = null;
                str = null;
            }
            str7 = str10 + str8;
        } else {
            d = 0.0d;
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        if (i != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.ivTeam1Flag, str, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView1, str7);
            TextViewBindingAdapter.setText(this.mboundView3, str6);
            BindingAdapters.setImageUrl(this.mboundView4, str3, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView5, str4);
            TextViewBindingAdapter.setText(this.mboundView6, str2);
            TextViewBindingAdapter.setText(this.teamTwo, str5);
            BindingAdapters.setNumber(this.textView19, d);
        }
    }
}
