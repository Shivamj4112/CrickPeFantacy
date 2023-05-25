package com.crickpe.view.intro.fragments.onborading;

import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0003H\u0016J\u0010\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0005\"\u0004\b\u0010\u0010\u0007R\u0014\u0010\u0011\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00128BX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013¨\u0006 "}, mo48222d2 = {"com/crickpe/view/intro/fragments/onborading/OnBoardingFragment$listeners$1", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "SCROLLING_LEFT", "", "getSCROLLING_LEFT", "()I", "setSCROLLING_LEFT", "(I)V", "SCROLLING_RIGHT", "getSCROLLING_RIGHT", "setSCROLLING_RIGHT", "SCROLLING_UNDETERMINED", "getSCROLLING_UNDETERMINED", "setSCROLLING_UNDETERMINED", "currentScrollDirection", "getCurrentScrollDirection", "setCurrentScrollDirection", "isScrollDirectionUndetermined", "", "()Z", "isScrollingLeft", "isScrollingRight", "onPageScrollStateChanged", "", "state", "onPageScrolled", "position", "positionOffset", "", "positionOffsetPixels", "onPageSelected", "setScrollingDirection", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: OnBoardingFragment.kt */
public final class OnBoardingFragment$listeners$1 implements ViewPager.OnPageChangeListener {
    private int SCROLLING_LEFT = 1;
    private int SCROLLING_RIGHT;
    private int SCROLLING_UNDETERMINED = 2;
    private int currentScrollDirection = 2;
    final /* synthetic */ OnBoardingFragment this$0;

    public void onPageSelected(int i) {
    }

    OnBoardingFragment$listeners$1(OnBoardingFragment onBoardingFragment) {
        this.this$0 = onBoardingFragment;
    }

    public final int getSCROLLING_RIGHT() {
        return this.SCROLLING_RIGHT;
    }

    public final void setSCROLLING_RIGHT(int i) {
        this.SCROLLING_RIGHT = i;
    }

    public final int getSCROLLING_LEFT() {
        return this.SCROLLING_LEFT;
    }

    public final void setSCROLLING_LEFT(int i) {
        this.SCROLLING_LEFT = i;
    }

    public final int getSCROLLING_UNDETERMINED() {
        return this.SCROLLING_UNDETERMINED;
    }

    public final void setSCROLLING_UNDETERMINED(int i) {
        this.SCROLLING_UNDETERMINED = i;
    }

    public final int getCurrentScrollDirection() {
        return this.currentScrollDirection;
    }

    public final void setCurrentScrollDirection(int i) {
        this.currentScrollDirection = i;
    }

    public void onPageScrolled(int i, float f, int i2) {
        if (isScrollDirectionUndetermined()) {
            setScrollingDirection(f);
        }
        if (isScrollingLeft()) {
            this.this$0.setI(i);
        }
        if (isScrollingRight()) {
            this.this$0.setI(i);
        }
    }

    private final void setScrollingDirection(float f) {
        double d = (double) (((float) 1) - f);
        if (d >= 0.5d) {
            this.currentScrollDirection = this.SCROLLING_RIGHT;
        } else if (d <= 0.5d) {
            this.currentScrollDirection = this.SCROLLING_LEFT;
        }
    }

    private final boolean isScrollDirectionUndetermined() {
        return this.currentScrollDirection == this.SCROLLING_UNDETERMINED;
    }

    private final boolean isScrollingRight() {
        return this.currentScrollDirection == this.SCROLLING_RIGHT;
    }

    private final boolean isScrollingLeft() {
        return this.currentScrollDirection == this.SCROLLING_LEFT;
    }

    public void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.currentScrollDirection = this.SCROLLING_UNDETERMINED;
        }
    }
}
