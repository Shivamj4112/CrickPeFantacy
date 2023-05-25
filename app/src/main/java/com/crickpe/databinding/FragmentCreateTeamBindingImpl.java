package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.create_own_team.create_team.Match;
import com.crickpe.view.home.fragments.home.Team1;
import com.crickpe.view.home.fragments.home.Team2;
import p019de.hdodenhof.circleimageview.CircleImageView;

public class FragmentCreateTeamBindingImpl extends FragmentCreateTeamBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final NestedScrollView mboundView0;
    private final ConstraintLayout mboundView1;
    private final FragmentSelectCaptainVcBinding mboundView11;
    private final LayoutSelectedPalyerPreviewBinding mboundView12;
    private final CircleImageView mboundView2;
    private final CircleImageView mboundView3;
    private final LinearLayout mboundView4;
    private final LayoutProgressBarCountBinding mboundView41;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.linearLayout7, 8);
        sparseIntArray.put(C1188R.C1192id.rlTop, 9);
        sparseIntArray.put(C1188R.C1192id.ivBack, 10);
        sparseIntArray.put(C1188R.C1192id.tvTitle, 11);
        sparseIntArray.put(C1188R.C1192id.rlPTS, 12);
        sparseIntArray.put(C1188R.C1192id.tvPlayerSelected, 13);
        sparseIntArray.put(C1188R.C1192id.llTeams, 14);
        sparseIntArray.put(C1188R.C1192id.teamOne, 15);
        sparseIntArray.put(C1188R.C1192id.teamTwo, 16);
        sparseIntArray.put(C1188R.C1192id.tvCreditLeft, 17);
        sparseIntArray.put(C1188R.C1192id.tabLayout, 18);
        sparseIntArray.put(C1188R.C1192id.viewPager, 19);
        sparseIntArray.put(C1188R.C1192id.progressBar, 20);
        sparseIntArray.put(C1188R.C1192id.llBottomButton, 21);
        sparseIntArray.put(C1188R.C1192id.tvPreview, 22);
        sparseIntArray.put(C1188R.C1192id.tvContinue, 23);
        sparseIntArray.put(C1188R.C1192id.rlPlayersFilter, 24);
        sparseIntArray.put(C1188R.C1192id.rlTitle, 25);
        sparseIntArray.put(C1188R.C1192id.ivCancel, 26);
        sparseIntArray.put(C1188R.C1192id.rlTeam1, 27);
        sparseIntArray.put(C1188R.C1192id.ivFlagTeam1, 28);
        sparseIntArray.put(C1188R.C1192id.filterTeamOne, 29);
        sparseIntArray.put(C1188R.C1192id.rbTeam1, 30);
        sparseIntArray.put(C1188R.C1192id.rlTeam2, 31);
        sparseIntArray.put(C1188R.C1192id.ivFlagTeam2, 32);
        sparseIntArray.put(C1188R.C1192id.filterTeamTwo, 33);
        sparseIntArray.put(C1188R.C1192id.rbTeam2, 34);
        sparseIntArray.put(C1188R.C1192id.rlBoth, 35);
        sparseIntArray.put(C1188R.C1192id.ivFlagBothTeam1, 36);
        sparseIntArray.put(C1188R.C1192id.ivFlagBothTeam2, 37);
        sparseIntArray.put(C1188R.C1192id.filterBoth, 38);
        sparseIntArray.put(C1188R.C1192id.rbTeam3, 39);
    }

    public FragmentCreateTeamBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 40, sIncludes, sViewsWithIds));
    }

    private FragmentCreateTeamBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[38], objArr[29], objArr[33], objArr[10], objArr[26], objArr[36], objArr[37], objArr[28], objArr[32], objArr[8], objArr[21], objArr[14], objArr[20], objArr[30], objArr[34], objArr[39], objArr[35], objArr[12], objArr[24], objArr[27], objArr[31], objArr[25], objArr[9], objArr[18], objArr[15], objArr[16], objArr[23], objArr[17], objArr[13], objArr[22], objArr[11], objArr[19]);
        this.mDirtyFlags = -1;
        NestedScrollView nestedScrollView = objArr[0];
        this.mboundView0 = nestedScrollView;
        LayoutProgressBarCountBinding layoutProgressBarCountBinding = null;
        nestedScrollView.setTag((Object) null);
        ConstraintLayout constraintLayout = objArr[1];
        this.mboundView1 = constraintLayout;
        constraintLayout.setTag((Object) null);
        View view2 = objArr[6];
        this.mboundView11 = view2 != null ? FragmentSelectCaptainVcBinding.bind(view2) : null;
        View view3 = objArr[7];
        this.mboundView12 = view3 != null ? LayoutSelectedPalyerPreviewBinding.bind(view3) : null;
        CircleImageView circleImageView = objArr[2];
        this.mboundView2 = circleImageView;
        circleImageView.setTag((Object) null);
        CircleImageView circleImageView2 = objArr[3];
        this.mboundView3 = circleImageView2;
        circleImageView2.setTag((Object) null);
        LinearLayout linearLayout = objArr[4];
        this.mboundView4 = linearLayout;
        linearLayout.setTag((Object) null);
        View view4 = objArr[5];
        this.mboundView41 = view4 != null ? LayoutProgressBarCountBinding.bind(view4) : layoutProgressBarCountBinding;
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
        if (4 != i) {
            return false;
        }
        setVm((Match) obj);
        return true;
    }

    public void setVm(Match match) {
        this.mVm = match;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(4);
        super.requestRebind();
    }

    /* access modifiers changed from: protected */
    public void executeBindings() {
        long j;
        String str;
        String str2;
        Team2 team2;
        Team1 team1;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        Match match = this.mVm;
        int i = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i != 0) {
            if (match != null) {
                team1 = match.getTeam1();
                team2 = match.getTeam2();
            } else {
                team1 = null;
                team2 = null;
            }
            str2 = team1 != null ? team1.getTeamIconUrl() : null;
            str = team2 != null ? team2.getTeamIconUrl() : null;
        } else {
            str2 = null;
            str = null;
        }
        if (i != 0) {
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView2, str2, (Drawable) null);
            BindingAdapters.setImageUrl(this.mboundView3, str, (Drawable) null);
        }
    }
}
