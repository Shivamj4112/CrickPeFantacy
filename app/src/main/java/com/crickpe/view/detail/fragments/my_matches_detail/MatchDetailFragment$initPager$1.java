package com.crickpe.view.detail.fragments.my_matches_detail;

import androidx.viewpager.widget.ViewPager;
import com.crickpe.C1188R;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo48222d2 = {"com/crickpe/view/detail/fragments/my_matches_detail/MatchDetailFragment$initPager$1", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MatchDetailFragment.kt */
public final class MatchDetailFragment$initPager$1 implements TabLayout.OnTabSelectedListener {
    final /* synthetic */ MatchDetailFragment this$0;

    public void onTabReselected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    MatchDetailFragment$initPager$1(MatchDetailFragment matchDetailFragment) {
        this.this$0 = matchDetailFragment;
    }

    public void onTabSelected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        ViewPager viewPager = (ViewPager) this.this$0._$_findCachedViewById(C1188R.C1192id.viewPager);
        Intrinsics.checkNotNull(viewPager);
        viewPager.setCurrentItem(tab.getPosition());
        this.this$0.setCurrentTabPosition(tab.getPosition());
    }
}
