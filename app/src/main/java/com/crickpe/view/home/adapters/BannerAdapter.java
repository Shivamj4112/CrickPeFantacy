package com.crickpe.view.home.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.crickpe.utils.Constants;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.home.fragments.home.BannerListModelItem;
import com.crickpe.view.home.fragments.home.HomeFragment;
import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ \u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020 H\u0016J\u0018\u0010$\u001a\u00020\"2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010)\u001a\u00020\u00162\u0006\u0010*\u001a\u00020\u0016H\u0002R*\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006+"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/BannerAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "bannerList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/home/BannerListModelItem;", "Lkotlin/collections/ArrayList;", "homeFragment", "Lcom/crickpe/view/home/fragments/home/HomeFragment;", "(Landroid/content/Context;Ljava/util/ArrayList;Lcom/crickpe/view/home/fragments/home/HomeFragment;)V", "getBannerList", "()Ljava/util/ArrayList;", "setBannerList", "(Ljava/util/ArrayList;)V", "getHomeFragment", "()Lcom/crickpe/view/home/fragments/home/HomeFragment;", "setHomeFragment", "(Lcom/crickpe/view/home/fragments/home/HomeFragment;)V", "layoutInflater", "Landroid/view/LayoutInflater;", "videoLink", "", "getVideoLink", "()Ljava/lang/String;", "setVideoLink", "(Ljava/lang/String;)V", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "printInitials", "name", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BannerAdapter.kt */
public final class BannerAdapter extends PagerAdapter {
    private ArrayList<BannerListModelItem> bannerList;
    private final Context context;
    private HomeFragment homeFragment;
    private LayoutInflater layoutInflater;
    private String videoLink = "";

    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        Intrinsics.checkNotNullParameter(obj, "object");
        return view == obj;
    }

    public final ArrayList<BannerListModelItem> getBannerList() {
        return this.bannerList;
    }

    public final void setBannerList(ArrayList<BannerListModelItem> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.bannerList = arrayList;
    }

    public final HomeFragment getHomeFragment() {
        return this.homeFragment;
    }

    public final void setHomeFragment(HomeFragment homeFragment2) {
        Intrinsics.checkNotNullParameter(homeFragment2, "<set-?>");
        this.homeFragment = homeFragment2;
    }

    public BannerAdapter(Context context2, ArrayList<BannerListModelItem> arrayList, HomeFragment homeFragment2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(arrayList, "bannerList");
        Intrinsics.checkNotNullParameter(homeFragment2, "homeFragment");
        this.context = context2;
        this.bannerList = arrayList;
        this.homeFragment = homeFragment2;
    }

    public final String getVideoLink() {
        return this.videoLink;
    }

    public final void setVideoLink(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoLink = str;
    }

    public int getCount() {
        return this.bannerList.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0170, code lost:
        r4 = r11;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0176, code lost:
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, "rlHelpBanner");
        com.crickpe.utils.CommonMethodsKt.hide(r7);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, "rlEarnBanner");
        com.crickpe.utils.CommonMethodsKt.hide(r8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, "clPrivateBanner");
        com.crickpe.utils.CommonMethodsKt.hide(r9);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, "ivBanner");
        r0 = r1.bannerList.get(r0).getFileUrl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x019f, code lost:
        if (r0 != null) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01a1, code lost:
        r7 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01a3, code lost:
        r7 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01a4, code lost:
        r2 = 0;
        r4 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        com.crickpe.utils.ExtensionsKt.loadImage$default(r6, r7, com.crickpe.C1188R.C1190drawable.background_banner, false, 4, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01b1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x022a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Object instantiateItem(ViewGroup r22, int r23) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            r0 = r23
            java.lang.String r3 = ""
            java.lang.String r4 = "container"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)
            android.content.Context r4 = r1.context
            java.lang.String r5 = "layout_inflater"
            java.lang.Object r4 = r4.getSystemService(r5)
            if (r4 == 0) goto L_0x025c
            android.view.LayoutInflater r4 = (android.view.LayoutInflater) r4
            r1.layoutInflater = r4
            android.content.Context r4 = r1.context
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            r5 = 2131492949(0x7f0c0055, float:1.8609364E38)
            r6 = 0
            android.view.View r4 = r4.inflate(r5, r6)
            r5 = 2131296775(0x7f090207, float:1.8211476E38)
            android.view.View r5 = r4.findViewById(r5)
            r6 = r5
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5 = 2131297854(0x7f09063e, float:1.8213665E38)
            android.view.View r5 = r4.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r7 = 2131297331(0x7f090433, float:1.8212604E38)
            android.view.View r7 = r4.findViewById(r7)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r8 = 2131297038(0x7f09030e, float:1.821201E38)
            android.view.View r8 = r4.findViewById(r8)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r9 = 2131296487(0x7f0900e7, float:1.8210892E38)
            android.view.View r9 = r4.findViewById(r9)
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r10 = 2131296708(0x7f0901c4, float:1.821134E38)
            android.view.View r10 = r4.findViewById(r10)
            r12 = r10
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r10 = 2131296709(0x7f0901c5, float:1.8211342E38)
            android.view.View r10 = r4.findViewById(r10)
            r15 = r10
            android.widget.ImageView r15 = (android.widget.ImageView) r15
            r10 = 2131297944(0x7f090698, float:1.8213847E38)
            android.view.View r10 = r4.findViewById(r10)
            r14 = r10
            android.widget.TextView r14 = (android.widget.TextView) r14
            r10 = 2131297381(0x7f090465, float:1.8212705E38)
            android.view.View r10 = r4.findViewById(r10)
            r13 = r10
            android.widget.RelativeLayout r13 = (android.widget.RelativeLayout) r13
            r10 = 2131296836(0x7f090244, float:1.82116E38)
            android.view.View r10 = r4.findViewById(r10)
            r11 = r10
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r10 = 0
            r13.setEnabled(r10)
            r11.setEnabled(r10)
            java.util.ArrayList<com.crickpe.view.home.fragments.home.BannerListModelItem> r10 = r1.bannerList     // Catch:{ Exception -> 0x01b3 }
            java.lang.Object r10 = r10.get(r0)     // Catch:{ Exception -> 0x01b3 }
            com.crickpe.view.home.fragments.home.BannerListModelItem r10 = (com.crickpe.view.home.fragments.home.BannerListModelItem) r10     // Catch:{ Exception -> 0x01b3 }
            java.lang.String r10 = r10.getName()     // Catch:{ Exception -> 0x01b3 }
            if (r10 != 0) goto L_0x009f
            r10 = r3
        L_0x009f:
            int r17 = r10.hashCode()     // Catch:{ Exception -> 0x01b3 }
            r18 = r14
            java.lang.String r14 = "clPrivateBanner"
            r19 = r15
            java.lang.String r15 = "rlEarnBanner"
            r20 = r4
            java.lang.String r4 = "rlHelpBanner"
            switch(r17) {
                case -1907279605: goto L_0x0149;
                case -1907186572: goto L_0x010b;
                case -403641589: goto L_0x00e2;
                case 6971248: goto L_0x00b4;
                default: goto L_0x00b2;
            }
        L_0x00b2:
            goto L_0x0176
        L_0x00b4:
            java.lang.String r2 = "banner_private"
            boolean r2 = r10.equals(r2)     // Catch:{ Exception -> 0x0173 }
            if (r2 != 0) goto L_0x00be
            goto L_0x0176
        L_0x00be:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)     // Catch:{ Exception -> 0x0173 }
            android.view.View r7 = (android.view.View) r7     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r7)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r15)     // Catch:{ Exception -> 0x0173 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r8)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)     // Catch:{ Exception -> 0x0173 }
            android.view.View r9 = (android.view.View) r9     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.visible(r9)     // Catch:{ Exception -> 0x0173 }
            r0 = 2131165473(0x7f070121, float:1.7945164E38)
            r6.setImageResource(r0)     // Catch:{ Exception -> 0x0173 }
            r0 = 1
            r13.setEnabled(r0)     // Catch:{ Exception -> 0x0173 }
            goto L_0x0170
        L_0x00e2:
            java.lang.String r2 = "banner_cricketer"
            boolean r2 = r10.equals(r2)     // Catch:{ Exception -> 0x0173 }
            if (r2 != 0) goto L_0x00ec
            goto L_0x0176
        L_0x00ec:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)     // Catch:{ Exception -> 0x0173 }
            android.view.View r7 = (android.view.View) r7     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r7)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r15)     // Catch:{ Exception -> 0x0173 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r8)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)     // Catch:{ Exception -> 0x0173 }
            android.view.View r9 = (android.view.View) r9     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r9)     // Catch:{ Exception -> 0x0173 }
            r0 = 2131165470(0x7f07011e, float:1.7945158E38)
            r6.setImageResource(r0)     // Catch:{ Exception -> 0x0173 }
            goto L_0x0170
        L_0x010b:
            java.lang.String r2 = "banner_help"
            boolean r2 = r10.equals(r2)     // Catch:{ Exception -> 0x0173 }
            if (r2 != 0) goto L_0x0114
            goto L_0x0176
        L_0x0114:
            r2 = 1
            r11.setEnabled(r2)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)     // Catch:{ Exception -> 0x0173 }
            android.view.View r7 = (android.view.View) r7     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.visible(r7)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r15)     // Catch:{ Exception -> 0x0173 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r8)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)     // Catch:{ Exception -> 0x0173 }
            android.view.View r9 = (android.view.View) r9     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r9)     // Catch:{ Exception -> 0x0173 }
            r2 = 2131165472(0x7f070120, float:1.7945162E38)
            r6.setImageResource(r2)     // Catch:{ Exception -> 0x0173 }
            java.util.ArrayList<com.crickpe.view.home.fragments.home.BannerListModelItem> r2 = r1.bannerList     // Catch:{ Exception -> 0x0173 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x0173 }
            com.crickpe.view.home.fragments.home.BannerListModelItem r0 = (com.crickpe.view.home.fragments.home.BannerListModelItem) r0     // Catch:{ Exception -> 0x0173 }
            java.lang.String r0 = r0.getExternalLink()     // Catch:{ Exception -> 0x0173 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0173 }
            r1.videoLink = r0     // Catch:{ Exception -> 0x0173 }
            goto L_0x0170
        L_0x0149:
            java.lang.String r2 = "banner_earn"
            boolean r2 = r10.equals(r2)     // Catch:{ Exception -> 0x0173 }
            if (r2 != 0) goto L_0x0152
            goto L_0x0176
        L_0x0152:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)     // Catch:{ Exception -> 0x0173 }
            android.view.View r7 = (android.view.View) r7     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r7)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r15)     // Catch:{ Exception -> 0x0173 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.visible(r8)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)     // Catch:{ Exception -> 0x0173 }
            android.view.View r9 = (android.view.View) r9     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r9)     // Catch:{ Exception -> 0x0173 }
            r0 = 2131165471(0x7f07011f, float:1.794516E38)
            r6.setImageResource(r0)     // Catch:{ Exception -> 0x0173 }
        L_0x0170:
            r4 = r11
            r2 = 0
            goto L_0x01c5
        L_0x0173:
            r0 = move-exception
            r4 = r11
            goto L_0x01bb
        L_0x0176:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)     // Catch:{ Exception -> 0x0173 }
            android.view.View r7 = (android.view.View) r7     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r7)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r15)     // Catch:{ Exception -> 0x0173 }
            android.view.View r8 = (android.view.View) r8     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r8)     // Catch:{ Exception -> 0x0173 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r14)     // Catch:{ Exception -> 0x0173 }
            android.view.View r9 = (android.view.View) r9     // Catch:{ Exception -> 0x0173 }
            com.crickpe.utils.CommonMethodsKt.hide(r9)     // Catch:{ Exception -> 0x0173 }
            java.lang.String r2 = "ivBanner"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)     // Catch:{ Exception -> 0x0173 }
            java.util.ArrayList<com.crickpe.view.home.fragments.home.BannerListModelItem> r2 = r1.bannerList     // Catch:{ Exception -> 0x0173 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ Exception -> 0x0173 }
            com.crickpe.view.home.fragments.home.BannerListModelItem r0 = (com.crickpe.view.home.fragments.home.BannerListModelItem) r0     // Catch:{ Exception -> 0x0173 }
            java.lang.String r0 = r0.getFileUrl()     // Catch:{ Exception -> 0x0173 }
            if (r0 != 0) goto L_0x01a3
            r7 = r3
            goto L_0x01a4
        L_0x01a3:
            r7 = r0
        L_0x01a4:
            r8 = 2131165465(0x7f070119, float:1.7945148E38)
            r9 = 0
            r10 = 4
            r0 = 0
            r2 = 0
            r4 = r11
            r11 = r0
            com.crickpe.utils.ExtensionsKt.loadImage$default(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x01c5
        L_0x01b1:
            r0 = move-exception
            goto L_0x01bc
        L_0x01b3:
            r0 = move-exception
            r20 = r4
            r4 = r11
            r18 = r14
            r19 = r15
        L_0x01bb:
            r2 = 0
        L_0x01bc:
            java.lang.String r0 = r0.toString()
            java.lang.String r6 = "BannerCrash"
            android.util.Log.v(r6, r0)
        L_0x01c5:
            com.crickpe.view.home.adapters.BannerAdapter$$ExternalSyntheticLambda0 r0 = new com.crickpe.view.home.adapters.BannerAdapter$$ExternalSyntheticLambda0
            r0.<init>(r1)
            r13.setOnClickListener(r0)
            com.crickpe.view.home.adapters.BannerAdapter$$ExternalSyntheticLambda1 r0 = new com.crickpe.view.home.adapters.BannerAdapter$$ExternalSyntheticLambda1
            r0.<init>(r1)
            r4.setOnClickListener(r0)
            com.crickpe.utils.local.UserManager r0 = com.crickpe.utils.local.UserManager.INSTANCE
            com.crickpe.view.intro.fragments.User r0 = r0.getUserProfile()
            java.lang.String r4 = "imageProfile"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r4)
            if (r0 == 0) goto L_0x01e8
            java.lang.String r4 = r0.getProfilePic()
            if (r4 != 0) goto L_0x01e9
        L_0x01e8:
            r4 = r3
        L_0x01e9:
            r13 = 2131165835(0x7f07028b, float:1.7945898E38)
            r14 = 0
            r15 = 4
            r16 = 0
            r11 = r12
            r12 = r4
            r10 = r18
            r4 = r19
            com.crickpe.utils.ExtensionsKt.loadImage$default(r11, r12, r13, r14, r15, r16)
            java.lang.String r6 = "imageProfile4"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r6)
            if (r0 == 0) goto L_0x0209
            java.lang.String r6 = r0.getProfilePic()
            if (r6 != 0) goto L_0x0207
            goto L_0x0209
        L_0x0207:
            r14 = r6
            goto L_0x020a
        L_0x0209:
            r14 = r3
        L_0x020a:
            r15 = 2131165835(0x7f07028b, float:1.7945898E38)
            r16 = 0
            r17 = 4
            r18 = 0
            r13 = r4
            com.crickpe.utils.ExtensionsKt.loadImage$default(r13, r14, r15, r16, r17, r18)
            if (r0 == 0) goto L_0x0222
            java.lang.String r4 = r0.getName()
            if (r4 == 0) goto L_0x0222
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            goto L_0x0225
        L_0x0222:
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
        L_0x0225:
            r10.setText(r4)
            if (r0 == 0) goto L_0x024d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Hi "
            r3.append(r4)
            java.lang.String r0 = r0.getName()
            java.lang.String r0 = r1.printInitials(r0)
            r3.append(r0)
            java.lang.String r0 = " !"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r5.setText(r0)
        L_0x024d:
            r0 = r22
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r3 = r20
            r0.addView(r3, r2)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            return r3
        L_0x025c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r2 = "null cannot be cast to non-null type android.view.LayoutInflater"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.home.adapters.BannerAdapter.instantiateItem(android.view.ViewGroup, int):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* renamed from: instantiateItem$lambda-0  reason: not valid java name */
    public static final void m3679instantiateItem$lambda0(BannerAdapter bannerAdapter, View view) {
        Intrinsics.checkNotNullParameter(bannerAdapter, "this$0");
        Intent intent = new Intent(new Intent(bannerAdapter.context, DetailActivity.class));
        intent.putExtra("open", Constants.UPCOMING);
        bannerAdapter.context.startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: instantiateItem$lambda-1  reason: not valid java name */
    public static final void m3680instantiateItem$lambda1(BannerAdapter bannerAdapter, View view) {
        Intrinsics.checkNotNullParameter(bannerAdapter, "this$0");
        bannerAdapter.homeFragment.playVideo(bannerAdapter.videoLink);
    }

    private final String printInitials(String str) {
        Object[] array = StringsKt.split$default((CharSequence) str, new String[]{" "}, false, 0, 6, (Object) null).toArray(new String[0]);
        Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        return ((String[]) array)[0];
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "object");
        ((ViewPager) viewGroup).removeView((View) obj);
    }
}
