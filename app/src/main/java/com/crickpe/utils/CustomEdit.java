package com.crickpe.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatEditText;

public class CustomEdit extends AppCompatEditText {
    private String mPrefix = Constants.CURRENCY_SYMBOL;
    private Rect mPrefixRect = new Rect();

    public CustomEdit(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        TextPaint paint = getPaint();
        String str = this.mPrefix;
        paint.getTextBounds(str, 0, str.length(), this.mPrefixRect);
        Rect rect = this.mPrefixRect;
        rect.right = (int) (((float) rect.right) + getPaint().measureText(" "));
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawText(this.mPrefix, (float) super.getCompoundPaddingLeft(), (float) getBaseline(), getPaint());
    }

    public int getCompoundPaddingLeft() {
        return super.getCompoundPaddingLeft() + this.mPrefixRect.width();
    }
}
