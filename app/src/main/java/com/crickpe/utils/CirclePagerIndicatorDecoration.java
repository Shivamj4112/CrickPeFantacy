package com.crickpe.utils;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CirclePagerIndicatorDecoration extends RecyclerView.ItemDecoration {

    /* renamed from: DP */
    private static final float f461DP = Resources.getSystem().getDisplayMetrics().density;
    private int colorActive = -570399565;
    private int colorInactive = 855638016;
    private final int mIndicatorHeight;
    private final float mIndicatorItemLength;
    private final float mIndicatorItemPadding;
    private final float mIndicatorStrokeWidth;
    private final Interpolator mInterpolator;
    private final Paint mPaint;

    public CirclePagerIndicatorDecoration() {
        float f = f461DP;
        this.mIndicatorHeight = (int) (14.0f * f);
        float f2 = f * 3.0f;
        this.mIndicatorStrokeWidth = f2;
        this.mIndicatorItemLength = 3.0f * f;
        this.mIndicatorItemPadding = f * 9.0f;
        this.mInterpolator = new AccelerateDecelerateInterpolator();
        Paint paint = new Paint();
        this.mPaint = paint;
        paint.setStrokeWidth(f2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        int itemCount = recyclerView.getAdapter().getItemCount();
        float width = (((float) recyclerView.getWidth()) - ((this.mIndicatorItemLength * ((float) itemCount)) + (((float) Math.max(0, itemCount - 1)) * this.mIndicatorItemPadding))) / 2.0f;
        float height = ((float) recyclerView.getHeight()) - (((float) this.mIndicatorHeight) / 2.0f);
        drawInactiveIndicators(canvas, width, height, itemCount);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != -1) {
            View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
            int left = findViewByPosition.getLeft();
            int width2 = findViewByPosition.getWidth();
            findViewByPosition.getRight();
            drawHighlights(canvas, width, height, findFirstVisibleItemPosition, this.mInterpolator.getInterpolation(((float) (left * -1)) / ((float) width2)));
        }
    }

    private void drawInactiveIndicators(Canvas canvas, float f, float f2, int i) {
        this.mPaint.setColor(this.colorInactive);
        float f3 = this.mIndicatorItemLength + this.mIndicatorItemPadding;
        for (int i2 = 0; i2 < i; i2++) {
            canvas.drawCircle(f, f2, this.mIndicatorItemLength / 2.0f, this.mPaint);
            f += f3;
        }
    }

    private void drawHighlights(Canvas canvas, float f, float f2, int i, float f3) {
        this.mPaint.setColor(this.colorActive);
        float f4 = this.mIndicatorItemLength;
        float f5 = this.mIndicatorItemPadding;
        float f6 = f4 + f5;
        if (f3 == 0.0f) {
            canvas.drawCircle(f + (f6 * ((float) i)), f2, f4 / 2.0f, this.mPaint);
        } else {
            canvas.drawCircle(f + (f6 * ((float) i)) + (f4 * f3) + (f5 * f3), f2, f4 / 2.0f, this.mPaint);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.bottom = this.mIndicatorHeight;
    }
}
