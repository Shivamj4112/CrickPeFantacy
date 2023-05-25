package com.crickpe.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.crickpe.C1188R;
import com.crickpe.utils.recycler.BindingAdapters;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Match;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Team1;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Team2;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Users;
import p019de.hdodenhof.circleimageview.CircleImageView;

public class FragmentShareContestBindingImpl extends FragmentShareContestBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final CircleImageView mboundView2;
    private final TextView mboundView3;
    private final CircleImageView mboundView4;
    private final TextView mboundView5;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.bottomSheetContact, 10);
        sparseIntArray.put(C1188R.C1192id.nestedScrollView2, 11);
        sparseIntArray.put(C1188R.C1192id.currentItemRoot, 12);
        sparseIntArray.put(C1188R.C1192id.name, 13);
        sparseIntArray.put(C1188R.C1192id.tvScoreT1, 14);
        sparseIntArray.put(C1188R.C1192id.tvScoreT2, 15);
        sparseIntArray.put(C1188R.C1192id.rlShare1, 16);
        sparseIntArray.put(C1188R.C1192id.tvInvitee, 17);
        sparseIntArray.put(C1188R.C1192id.llCopyCode, 18);
        sparseIntArray.put(C1188R.C1192id.llShareReferalCode, 19);
        sparseIntArray.put(C1188R.C1192id.tvJoinPeople, 20);
        sparseIntArray.put(C1188R.C1192id.rlShare2, 21);
        sparseIntArray.put(C1188R.C1192id.tvShare, 22);
        sparseIntArray.put(C1188R.C1192id.llCopyLink, 23);
        sparseIntArray.put(C1188R.C1192id.llShareReferalLink, 24);
        sparseIntArray.put(C1188R.C1192id.rlContactLayout, 25);
        sparseIntArray.put(C1188R.C1192id.tvContact, 26);
        sparseIntArray.put(C1188R.C1192id.tvInvitePeople, 27);
        sparseIntArray.put(C1188R.C1192id.tvNumberOfInvitation, 28);
        sparseIntArray.put(C1188R.C1192id.rvSelectedContacts, 29);
        sparseIntArray.put(C1188R.C1192id.rlInviteFrnd, 30);
        sparseIntArray.put(C1188R.C1192id.tvInvite, 31);
        sparseIntArray.put(C1188R.C1192id.rvPreviousContacts, 32);
        sparseIntArray.put(C1188R.C1192id.tvDone, 33);
        sparseIntArray.put(C1188R.C1192id.progressBar, 34);
    }

    public FragmentShareContestBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 35, sIncludes, sViewsWithIds));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private FragmentShareContestBindingImpl(androidx.databinding.DataBindingComponent r36, View r37, Object[] r38) {
        /*
            r35 = this;
            r4 = r35
            r0 = 10
            r0 = r38[r0]
            r2 = 0
            if (r0 == 0) goto L_0x0012
            android.view.View r0 = (android.view.View) r0
            com.crickpe.databinding.BottomSheetContactsBinding r0 = com.crickpe.databinding.BottomSheetContactsBinding.bind(r0)
            r34 = r0
            goto L_0x0014
        L_0x0012:
            r34 = r2
        L_0x0014:
            r0 = 12
            r0 = r38[r0]
            r5 = r0
            androidx.cardview.widget.CardView r5 = (androidx.cardview.widget.CardView) r5
            r0 = 18
            r0 = r38[r0]
            r6 = r0
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r0 = 23
            r0 = r38[r0]
            r7 = r0
            android.widget.LinearLayout r7 = (android.widget.LinearLayout) r7
            r0 = 19
            r0 = r38[r0]
            r8 = r0
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 24
            r0 = r38[r0]
            r9 = r0
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r0 = 13
            r0 = r38[r0]
            r10 = r0
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 11
            r0 = r38[r0]
            r11 = r0
            androidx.core.widget.NestedScrollView r11 = (androidx.core.widget.NestedScrollView) r11
            r0 = 34
            r0 = r38[r0]
            r12 = r0
            android.widget.ProgressBar r12 = (android.widget.ProgressBar) r12
            r0 = 25
            r0 = r38[r0]
            r13 = r0
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r0 = 30
            r0 = r38[r0]
            r14 = r0
            android.widget.RelativeLayout r14 = (android.widget.RelativeLayout) r14
            r0 = 16
            r0 = r38[r0]
            r15 = r0
            android.widget.RelativeLayout r15 = (android.widget.RelativeLayout) r15
            r0 = 21
            r0 = r38[r0]
            r16 = r0
            android.widget.RelativeLayout r16 = (android.widget.RelativeLayout) r16
            r0 = 32
            r0 = r38[r0]
            r17 = r0
            androidx.recyclerview.widget.RecyclerView r17 = (androidx.recyclerview.widget.RecyclerView) r17
            r0 = 29
            r0 = r38[r0]
            r18 = r0
            androidx.recyclerview.widget.RecyclerView r18 = (androidx.recyclerview.widget.RecyclerView) r18
            r0 = 26
            r0 = r38[r0]
            r19 = r0
            android.widget.TextView r19 = (android.widget.TextView) r19
            r0 = 8
            r0 = r38[r0]
            r20 = r0
            android.widget.TextView r20 = (android.widget.TextView) r20
            r0 = 9
            r0 = r38[r0]
            r21 = r0
            android.widget.TextView r21 = (android.widget.TextView) r21
            r0 = 33
            r0 = r38[r0]
            r22 = r0
            android.widget.TextView r22 = (android.widget.TextView) r22
            r0 = 31
            r0 = r38[r0]
            r23 = r0
            android.widget.TextView r23 = (android.widget.TextView) r23
            r0 = 27
            r0 = r38[r0]
            r24 = r0
            android.widget.TextView r24 = (android.widget.TextView) r24
            r0 = 17
            r0 = r38[r0]
            r25 = r0
            android.widget.TextView r25 = (android.widget.TextView) r25
            r0 = 20
            r0 = r38[r0]
            r26 = r0
            android.widget.TextView r26 = (android.widget.TextView) r26
            r0 = 1
            r0 = r38[r0]
            r27 = r0
            android.widget.TextView r27 = (android.widget.TextView) r27
            r0 = 28
            r0 = r38[r0]
            r28 = r0
            android.widget.TextView r28 = (android.widget.TextView) r28
            r0 = 6
            r0 = r38[r0]
            r29 = r0
            android.widget.TextView r29 = (android.widget.TextView) r29
            r0 = 7
            r0 = r38[r0]
            r30 = r0
            android.widget.TextView r30 = (android.widget.TextView) r30
            r0 = 14
            r0 = r38[r0]
            r31 = r0
            android.widget.TextView r31 = (android.widget.TextView) r31
            r0 = 15
            r0 = r38[r0]
            r32 = r0
            android.widget.TextView r32 = (android.widget.TextView) r32
            r0 = 22
            r0 = r38[r0]
            r33 = r0
            android.widget.TextView r33 = (android.widget.TextView) r33
            r3 = 0
            r0 = r35
            r1 = r36
            r2 = r37
            r4 = r34
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r0 = -1
            r2 = r35
            r2.mDirtyFlags = r0
            r0 = 0
            r0 = r38[r0]
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r2.mboundView0 = r0
            r1 = 0
            r0.setTag(r1)
            r0 = 2
            r0 = r38[r0]
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0
            r2.mboundView2 = r0
            r0.setTag(r1)
            r0 = 3
            r0 = r38[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.mboundView3 = r0
            r0.setTag(r1)
            r0 = 4
            r0 = r38[r0]
            de.hdodenhof.circleimageview.CircleImageView r0 = (p019de.hdodenhof.circleimageview.CircleImageView) r0
            r2.mboundView4 = r0
            r0.setTag(r1)
            r0 = 5
            r0 = r38[r0]
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.mboundView5 = r0
            r0.setTag(r1)
            android.widget.TextView r0 = r2.tvContestCode
            r0.setTag(r1)
            android.widget.TextView r0 = r2.tvContestLink
            r0.setTag(r1)
            android.widget.TextView r0 = r2.tvName
            r0.setTag(r1)
            android.widget.TextView r0 = r2.tvOverT1
            r0.setTag(r1)
            android.widget.TextView r0 = r2.tvOverT2
            r0.setTag(r1)
            r0 = r37
            r2.setRootTag((android.view.View) r0)
            r35.invalidateAll()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.FragmentShareContestBindingImpl.<init>(androidx.databinding.DataBindingComponent, android.view.View, java.lang.Object[]):void");
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
        setModel((ContestDetailModel) obj);
        return true;
    }

    public void setModel(ContestDetailModel contestDetailModel) {
        this.mModel = contestDetailModel;
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
        Match match;
        Contest contest;
        Users users;
        Team2 team2;
        Team1 team1;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0;
        }
        ContestDetailModel contestDetailModel = this.mModel;
        float f = 0.0f;
        int i = 0;
        int i2 = ((j & 3) > 0 ? 1 : ((j & 3) == 0 ? 0 : -1));
        if (i2 != 0) {
            if (contestDetailModel != null) {
                contest = contestDetailModel.getContest();
                match = contestDetailModel.getMatch();
            } else {
                contest = null;
                match = null;
            }
            if (contest != null) {
                str5 = contest.getReferalCode();
                f = contest.getWinningAmount();
                str4 = contest.getContestUrl();
                users = contest.getUser();
                i = contest.getEntryFee();
            } else {
                str5 = null;
                str4 = null;
                users = null;
            }
            if (match != null) {
                team1 = match.getTeam1();
                team2 = match.getTeam2();
            } else {
                team1 = null;
                team2 = null;
            }
            str3 = users != null ? users.getName() : null;
            if (team1 != null) {
                str2 = team1.getCode();
                str7 = team1.getTeamIconUrl();
            } else {
                str7 = null;
                str2 = null;
            }
            if (team2 != null) {
                str = team2.getCode();
                str6 = team2.getTeamIconUrl();
            } else {
                str6 = null;
                str = null;
            }
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
            Drawable drawable = null;
            BindingAdapters.setImageUrl(this.mboundView2, str7, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView3, str2);
            BindingAdapters.setImageUrl(this.mboundView4, str6, (Drawable) null);
            TextViewBindingAdapter.setText(this.mboundView5, str);
            TextViewBindingAdapter.setText(this.tvContestCode, str5);
            TextViewBindingAdapter.setText(this.tvContestLink, str4);
            TextViewBindingAdapter.setText(this.tvName, str3);
            BindingAdapters.setNumber(this.tvOverT1, (double) f);
            BindingAdapters.setNumber(this.tvOverT2, (double) i);
        }
    }
}
