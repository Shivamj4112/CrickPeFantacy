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
import com.crickpe.view.detail.fragments.my_matches_detail.Innings;
import com.crickpe.view.home.fragments.my_matches.LivescoresInfo;
import com.crickpe.view.home.fragments.my_matches.MyMatchesModel;
import java.util.ArrayList;
import p019de.hdodenhof.circleimageview.CircleImageView;

public class AdapterCurrentMatchesBindingImpl extends AdapterCurrentMatchesBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final CircleImageView mboundView2;
    private final TextView mboundView3;
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
        sparseIntArray.put(C1188R.C1192id.tvScoreT1, 8);
        sparseIntArray.put(C1188R.C1192id.tvOverT1, 9);
        sparseIntArray.put(C1188R.C1192id.tvScoreT2, 10);
        sparseIntArray.put(C1188R.C1192id.tvOverT2, 11);
    }

    public AdapterCurrentMatchesBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 12, sIncludes, sViewsWithIds));
    }

    private AdapterCurrentMatchesBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[0], objArr[1], objArr[9], objArr[11], objArr[8], objArr[10]);
        this.mDirtyFlags = -1;
        this.currentItemRoot.setTag((Object) null);
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
        TextView textView3 = objArr[6];
        this.mboundView6 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[7];
        this.mboundView7 = textView4;
        textView4.setTag((Object) null);
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
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        int i;
        String str10;
        LivescoresInfo livescoresInfo;
        String str11;
        int i2;
        Innings innings;
        Innings innings2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        MyMatchesModel myMatchesModel = this.mModel;
        boolean z2 = false;
        int i3 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i3 != 0) {
            if (myMatchesModel != null) {
                str11 = myMatchesModel.getName();
                livescoresInfo = myMatchesModel.getLivescoresInfo();
                str10 = myMatchesModel.getTitle();
                i = myMatchesModel.getMyFantasyTeamCount();
                i2 = myMatchesModel.getMyContestCount();
            } else {
                str11 = null;
                livescoresInfo = null;
                str10 = null;
                i2 = 0;
                i = 0;
            }
            String str12 = str11 + "|";
            str4 = Integer.toString(i);
            str7 = Integer.toString(i2);
            ArrayList<Innings> innings3 = livescoresInfo != null ? livescoresInfo.getInnings() : null;
            str6 = str12 + str10;
            if (innings3 != null) {
                innings = (Innings) getFromList(innings3, 1);
                innings2 = (Innings) getFromList(innings3, 0);
            } else {
                innings2 = null;
                innings = null;
            }
            if (innings != null) {
                str2 = innings.getCode();
                str3 = innings.getTeamIconUrl();
            } else {
                str3 = null;
                str2 = null;
            }
            if (innings2 != null) {
                str = innings2.getCode();
                str5 = innings2.getTeamIconUrl();
            } else {
                str5 = null;
                str = null;
            }
            z = str2 != null;
            if (str != null) {
                z2 = true;
            }
            if (i3 != 0) {
                j |= z ? 32 : 16;
            }
            if ((j & 3) != 0) {
                j |= z2 ? 8 : 4;
            }
        } else {
            str7 = null;
            str6 = null;
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
            z = false;
        }
        int i4 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i4 != 0) {
            if (!z2) {
                str = "";
            }
            if (!z) {
                str2 = "";
            }
            str9 = str2;
            str8 = str;
        } else {
            str9 = null;
            str8 = null;
        }
        if (i4 != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView2, str5, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView3, str8);
            BindingAdapters.setImageUrl(this.mboundView4, str3, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView5, str9);
            TextViewBindingAdapter.setText(this.mboundView6, str4);
            TextViewBindingAdapter.setText(this.mboundView7, str7);
            TextViewBindingAdapter.setText(this.tvMatchName, str6);
        }
    }
}
