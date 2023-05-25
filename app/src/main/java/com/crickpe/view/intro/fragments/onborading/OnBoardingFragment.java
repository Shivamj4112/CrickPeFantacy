package com.crickpe.view.intro.fragments.onborading;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.fragment.FragmentKt;
import androidx.viewpager.widget.ViewPager;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.view.intro.adapters.ViewAdapter;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u0005H\u0016J\b\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\u001a\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0014"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/onborading/OnBoardingFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "()V", "i", "", "getI", "()I", "setI", "(I)V", "getFragmentLayoutResId", "listeners", "", "onClick", "view", "Landroid/view/View;", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: OnBoardingFragment.kt */
public final class OnBoardingFragment extends BaseFragment implements View.OnClickListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();

    /* renamed from: i */
    private int f466i;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getFragmentLayoutResId() {
        return C1188R.C1193layout.fragment_onboarding;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final int getI() {
        return this.f466i;
    }

    public final void setI(int i) {
        this.f466i = i;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ((ViewPager) _$_findCachedViewById(C1188R.C1192id.view_pager)).setAdapter(new ViewAdapter(requireActivity));
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(C1188R.C1192id.view_pager);
        Intrinsics.checkNotNullExpressionValue(viewPager, "view_pager");
        ((DotsIndicator) _$_findCachedViewById(C1188R.C1192id.dot3)).attachTo(viewPager);
        listeners();
    }

    public void onResume() {
        super.onResume();
    }

    private final void listeners() {
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvNext)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvGetStarted)).setOnClickListener(onClickListener);
        ((ViewPager) _$_findCachedViewById(C1188R.C1192id.view_pager)).addOnPageChangeListener(new OnBoardingFragment$listeners$1(this));
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id == C1188R.C1192id.tvGetStarted) {
            FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_introFragment_to_loginFragment);
        } else if (id == C1188R.C1192id.tvNext) {
            try {
                ((ViewPager) _$_findCachedViewById(C1188R.C1192id.view_pager)).setCurrentItem(((ViewPager) _$_findCachedViewById(C1188R.C1192id.view_pager)).getCurrentItem() + 1, true);
                if (this.f466i + 1 > 3) {
                    FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_introFragment_to_loginFragment);
                }
            } catch (Exception unused) {
            }
        }
    }
}
