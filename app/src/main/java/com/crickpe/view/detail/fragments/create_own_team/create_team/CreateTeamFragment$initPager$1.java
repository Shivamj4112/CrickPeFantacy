package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.crickpe.C1188R;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.view.ApplicationActivity;
import com.google.android.material.tabs.TabLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\b"}, mo48222d2 = {"com/crickpe/view/detail/fragments/create_own_team/create_team/CreateTeamFragment$initPager$1", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CreateTeamFragment.kt */
public final class CreateTeamFragment$initPager$1 implements TabLayout.OnTabSelectedListener {
    final /* synthetic */ CreateTeamFragment this$0;

    public void onTabReselected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    public void onTabUnselected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
    }

    CreateTeamFragment$initPager$1(CreateTeamFragment createTeamFragment) {
        this.this$0 = createTeamFragment;
    }

    public void onTabSelected(TabLayout.Tab tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        ViewPager viewPager = (ViewPager) this.this$0._$_findCachedViewById(C1188R.C1192id.viewPager);
        Intrinsics.checkNotNull(viewPager);
        viewPager.setCurrentItem(tab.getPosition());
        ApplicationActivity.Companion.setCurrentTabPosition(tab.getPosition());
        RelativeLayout relativeLayout = (RelativeLayout) this.this$0._$_findCachedViewById(C1188R.C1192id.rlPlayersFilter);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlPlayersFilter");
        if (relativeLayout.getVisibility() == 0) {
            this.this$0.setFilter(false);
            RelativeLayout relativeLayout2 = (RelativeLayout) this.this$0._$_findCachedViewById(C1188R.C1192id.rlPlayersFilter);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlPlayersFilter");
            CommonMethodsKt.hide(relativeLayout2);
            Animation loadAnimation = AnimationUtils.loadAnimation(this.this$0.getContext(), C1188R.anim.slide_out_down);
            Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_out_down)");
            ((RelativeLayout) this.this$0._$_findCachedViewById(C1188R.C1192id.rlPlayersFilter)).startAnimation(loadAnimation);
        }
    }
}
