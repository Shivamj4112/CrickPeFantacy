package com.crickpe.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.crickpe.C1188R;
import com.crickpe.view.detail.fragments.contest_winners.models.model.WinnersList;
import p019de.hdodenhof.circleimageview.CircleImageView;

public class AdapterWinnersListBindingImpl extends AdapterWinnersListBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final CircleImageView mboundView1;
    private final ImageView mboundView4;

    /* access modifiers changed from: protected */
    public boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(C1188R.C1192id.llProfile, 7);
        sparseIntArray.put(C1188R.C1192id.tvPoints, 8);
        sparseIntArray.put(C1188R.C1192id.llPrice, 9);
        sparseIntArray.put(C1188R.C1192id.llDuck, 10);
    }

    public AdapterWinnersListBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 11, sIncludes, sViewsWithIds));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdapterWinnersListBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, objArr[10], objArr[9], objArr[7], objArr[0], objArr[6], objArr[3], objArr[8], objArr[2], objArr[5]);
        this.mDirtyFlags = -1;
        CircleImageView circleImageView = objArr[1];
        this.mboundView1 = circleImageView;
        circleImageView.setTag((Object) null);
        ImageView imageView = objArr[4];
        this.mboundView4 = imageView;
        imageView.setTag((Object) null);
        this.rlMain.setTag((Object) null);
        this.tvAmount.setTag((Object) null);
        this.tvName.setTag((Object) null);
        this.tvRank.setTag((Object) null);
        this.tvWon.setTag((Object) null);
        setRootTag(view);
        invalidateAll();
    }

    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 4;
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
        if (2 == i) {
            setModel((WinnersList) obj);
        } else if (3 != i) {
            return false;
        } else {
            setPosi(((Integer) obj).intValue());
        }
        return true;
    }

    public void setModel(WinnersList winnersList) {
        this.mModel = winnersList;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(2);
        super.requestRebind();
    }

    public void setPosi(int i) {
        this.mPosi = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: java.lang.String} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void executeBindings() {
        /*
            r24 = this;
            r1 = r24
            monitor-enter(r24)
            long r2 = r1.mDirtyFlags     // Catch:{ all -> 0x0189 }
            r4 = 0
            r1.mDirtyFlags = r4     // Catch:{ all -> 0x0189 }
            monitor-exit(r24)     // Catch:{ all -> 0x0189 }
            com.crickpe.view.detail.fragments.contest_winners.models.model.WinnersList r0 = r1.mModel
            r8 = 5
            long r10 = r2 & r8
            r12 = 8
            r14 = 16384(0x4000, double:8.0948E-320)
            r16 = 8192(0x2000, double:4.0474E-320)
            r18 = 16
            r20 = 0
            int r7 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r7 == 0) goto L_0x00d2
            if (r0 == 0) goto L_0x002d
            int r10 = r0.getRank()
            int r11 = r0.getUserType()
            double r21 = r0.getAmount()
            goto L_0x0031
        L_0x002d:
            r10 = 0
            r11 = 0
            r21 = 0
        L_0x0031:
            java.lang.String r10 = java.lang.Integer.toString(r10)
            r6 = 1
            if (r11 != r6) goto L_0x003a
            r20 = 1
        L_0x003a:
            if (r7 == 0) goto L_0x0064
            if (r20 == 0) goto L_0x0051
            long r2 = r2 | r18
            r6 = 64
            long r2 = r2 | r6
            r6 = 256(0x100, double:1.265E-321)
            long r2 = r2 | r6
            r6 = 1024(0x400, double:5.06E-321)
            long r2 = r2 | r6
            r6 = 4096(0x1000, double:2.0237E-320)
            long r2 = r2 | r6
            long r2 = r2 | r14
            r6 = 65536(0x10000, double:3.2379E-319)
            goto L_0x0063
        L_0x0051:
            long r2 = r2 | r12
            r6 = 32
            long r2 = r2 | r6
            r6 = 128(0x80, double:6.32E-322)
            long r2 = r2 | r6
            r6 = 512(0x200, double:2.53E-321)
            long r2 = r2 | r6
            r6 = 2048(0x800, double:1.0118E-320)
            long r2 = r2 | r6
            long r2 = r2 | r16
            r6 = 32768(0x8000, double:1.61895E-319)
        L_0x0063:
            long r2 = r2 | r6
        L_0x0064:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Rank #"
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.widget.ImageView r7 = r1.mboundView4
            android.content.Context r7 = r7.getContext()
            if (r20 == 0) goto L_0x0081
            r10 = 2131166050(0x7f070362, float:1.7946334E38)
            goto L_0x0084
        L_0x0081:
            r10 = 2131166051(0x7f070363, float:1.7946336E38)
        L_0x0084:
            android.graphics.drawable.Drawable r7 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r7, r10)
            r10 = 2131034266(0x7f05009a, float:1.7679045E38)
            r11 = 2131034939(0x7f05033b, float:1.768041E38)
            android.widget.TextView r8 = r1.tvName
            if (r20 == 0) goto L_0x0097
            int r8 = getColorFromResource(r8, r10)
            goto L_0x009b
        L_0x0097:
            int r8 = getColorFromResource(r8, r11)
        L_0x009b:
            r9 = 2131034149(0x7f050025, float:1.7678807E38)
            android.widget.TextView r12 = r1.tvWon
            if (r20 == 0) goto L_0x00a7
            int r12 = getColorFromResource(r12, r9)
            goto L_0x00ab
        L_0x00a7:
            int r12 = getColorFromResource(r12, r11)
        L_0x00ab:
            if (r20 == 0) goto L_0x00b4
            android.widget.TextView r13 = r1.tvAmount
            int r9 = getColorFromResource(r13, r9)
            goto L_0x00ba
        L_0x00b4:
            android.widget.TextView r9 = r1.tvAmount
            int r9 = getColorFromResource(r9, r11)
        L_0x00ba:
            if (r20 == 0) goto L_0x00c3
            android.widget.TextView r11 = r1.tvRank
            int r10 = getColorFromResource(r11, r10)
            goto L_0x00c9
        L_0x00c3:
            android.widget.TextView r10 = r1.tvRank
            int r10 = getColorFromResource(r10, r11)
        L_0x00c9:
            r11 = r10
            r13 = r12
            r12 = r8
            r10 = r9
            r8 = r6
            r9 = r7
            r6 = r21
            goto L_0x00da
        L_0x00d2:
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x00da:
            r21 = 16400(0x4010, double:8.1027E-320)
            long r21 = r2 & r21
            int r23 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r23 == 0) goto L_0x0108
            if (r0 == 0) goto L_0x00e9
            com.crickpe.view.detail.fragments.contest_winners.models.model.UserInfo r21 = r0.getUserInfo()
            goto L_0x00eb
        L_0x00e9:
            r21 = 0
        L_0x00eb:
            long r18 = r2 & r18
            int r22 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r22 == 0) goto L_0x00f8
            if (r21 == 0) goto L_0x00f8
            java.lang.String r18 = r21.getProfilePic()
            goto L_0x00fa
        L_0x00f8:
            r18 = 0
        L_0x00fa:
            long r14 = r14 & r2
            int r19 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r19 == 0) goto L_0x0106
            if (r21 == 0) goto L_0x0106
            java.lang.String r14 = r21.getName()
            goto L_0x010b
        L_0x0106:
            r14 = 0
            goto L_0x010b
        L_0x0108:
            r14 = 0
            r18 = 0
        L_0x010b:
            r21 = 8200(0x2008, double:4.0513E-320)
            long r21 = r2 & r21
            int r15 = (r21 > r4 ? 1 : (r21 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x013a
            if (r0 == 0) goto L_0x011a
            com.crickpe.view.detail.fragments.contest_winners.models.model.PlayerInfo r0 = r0.getPlayerInfo()
            goto L_0x011b
        L_0x011a:
            r0 = 0
        L_0x011b:
            long r15 = r2 & r16
            int r17 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r17 == 0) goto L_0x0128
            if (r0 == 0) goto L_0x0128
            java.lang.String r15 = r0.getName()
            goto L_0x0129
        L_0x0128:
            r15 = 0
        L_0x0129:
            r16 = 8
            long r16 = r2 & r16
            int r19 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r19 == 0) goto L_0x0138
            if (r0 == 0) goto L_0x0138
            java.lang.Object r0 = r0.getImageUrl()
            goto L_0x013c
        L_0x0138:
            r0 = 0
            goto L_0x013c
        L_0x013a:
            r0 = 0
            r15 = 0
        L_0x013c:
            r16 = 5
            long r2 = r2 & r16
            int r16 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r16 == 0) goto L_0x014e
            if (r20 == 0) goto L_0x0147
            goto L_0x0149
        L_0x0147:
            r18 = r0
        L_0x0149:
            if (r20 == 0) goto L_0x014c
            goto L_0x0151
        L_0x014c:
            r14 = r15
            goto L_0x0151
        L_0x014e:
            r14 = 0
            r18 = 0
        L_0x0151:
            if (r16 == 0) goto L_0x0188
            de.hdodenhof.circleimageview.CircleImageView r0 = r1.mboundView1
            r2 = r18
            java.lang.String r2 = (java.lang.String) r2
            r3 = 0
            r4 = r3
            android.graphics.drawable.Drawable r4 = (android.graphics.drawable.Drawable) r4
            com.crickpe.utils.recycler.BindingAdapters.setImageUrl(r0, r2, r3)
            android.widget.ImageView r0 = r1.mboundView4
            androidx.databinding.adapters.ImageViewBindingAdapter.setImageDrawable(r0, r9)
            android.widget.TextView r0 = r1.tvAmount
            com.crickpe.utils.recycler.BindingAdapters.setNumberWithoutDec(r0, r6)
            android.widget.TextView r0 = r1.tvAmount
            r0.setTextColor(r10)
            android.widget.TextView r0 = r1.tvName
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r14)
            android.widget.TextView r0 = r1.tvName
            r0.setTextColor(r12)
            android.widget.TextView r0 = r1.tvRank
            androidx.databinding.adapters.TextViewBindingAdapter.setText(r0, r8)
            android.widget.TextView r0 = r1.tvRank
            r0.setTextColor(r11)
            android.widget.TextView r0 = r1.tvWon
            r0.setTextColor(r13)
        L_0x0188:
            return
        L_0x0189:
            r0 = move-exception
            monitor-exit(r24)     // Catch:{ all -> 0x0189 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.databinding.AdapterWinnersListBindingImpl.executeBindings():void");
    }
}
