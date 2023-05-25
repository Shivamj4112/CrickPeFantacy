package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BattingOrder;
import com.crickpe.view.detail.fragments.my_matches_detail.tabs.live_score.models.BattingScore;

public class AdapterBatterScoreBindingImpl extends AdapterBatterScoreBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final LinearLayout mboundView0;
    private final TextView mboundView1;
    private final TextView mboundView2;
    private final TextView mboundView3;
    private final TextView mboundView4;
    private final TextView mboundView5;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.onItemClick, 6);
        sparseIntArray.put(C1188R.C1192id.view2, 7);
        sparseIntArray.put(C1188R.C1192id.rlPlayer, 8);
        sparseIntArray.put(C1188R.C1192id.tvName, 9);
        sparseIntArray.put(C1188R.C1192id.tvStrikeRate, 10);
    }

    public AdapterBatterScoreBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, sIncludes, sViewsWithIds));
    }

    private AdapterBatterScoreBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[6], objArr[8], objArr[9], objArr[10], objArr[7]);
        this.mDirtyFlags = -1;
        LinearLayout linearLayout = objArr[0];
        this.mboundView0 = linearLayout;
        linearLayout.setTag((Object) null);
        TextView textView = objArr[1];
        this.mboundView1 = textView;
        textView.setTag((Object) null);
        TextView textView2 = objArr[2];
        this.mboundView2 = textView2;
        textView2.setTag((Object) null);
        TextView textView3 = objArr[3];
        this.mboundView3 = textView3;
        textView3.setTag((Object) null);
        TextView textView4 = objArr[4];
        this.mboundView4 = textView4;
        textView4.setTag((Object) null);
        TextView textView5 = objArr[5];
        this.mboundView5 = textView5;
        textView5.setTag((Object) null);
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
        setModel((BattingOrder) obj);
        return true;
    }

    public void setModel(BattingOrder battingOrder) {
        this.mModel = battingOrder;
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
        int i2;
        int i3;
        int i4;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        BattingOrder battingOrder = this.mModel;
        boolean z = false;
        String str6 = null;
        int i5 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i5 != 0) {
            BattingScore battingScore = battingOrder != null ? battingOrder.getBattingScore() : null;
            if (battingScore != null) {
                i3 = battingScore.getFours();
                i2 = battingScore.getBalls();
                i = battingScore.getRuns();
                str = battingScore.getDismissal();
                i4 = battingScore.getSixes();
            } else {
                str = null;
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            }
            str4 = Integer.toString(i3);
            str3 = Integer.toString(i2);
            str2 = Integer.toString(i);
            if (str == null) {
                z = true;
            }
            str5 = Integer.toString(i4);
            if (i5 != 0) {
                j |= z ? 8 : 4;
            }
        } else {
            str5 = null;
            str4 = null;
            str3 = null;
            str2 = null;
            str = null;
        }
        int i6 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i6 != 0) {
            str6 = z ? "Not out" : str;
        }
        if (i6 != 0) {
            TextViewBindingAdapter.setText(this.mboundView1, str6);
            TextViewBindingAdapter.setText(this.mboundView2, str2);
            TextViewBindingAdapter.setText(this.mboundView3, str3);
            TextViewBindingAdapter.setText(this.mboundView4, str4);
            TextViewBindingAdapter.setText(this.mboundView5, str5);
        }
    }
}
