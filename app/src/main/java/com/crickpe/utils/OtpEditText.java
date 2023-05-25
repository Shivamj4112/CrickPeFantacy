package com.crickpe.utils;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import androidx.appcompat.widget.AppCompatEditText;

public class OtpEditText extends AppCompatEditText {
    /* access modifiers changed from: private */
    public OnClickListener mClickListener;
    private float mLineSpacing = 5.0f;
    private float mLineStroke = 2.0f;
    private Paint mLinesPaint;
    private int mMaxLength = 4;
    private float mNumChars = 4.0f;
    private float mSpace = 10.0f;

    public OtpEditText(Context context) {
        super(context);
    }

    public OtpEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public OtpEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    private void init(Context context, AttributeSet attributeSet) {
        float f = context.getResources().getDisplayMetrics().density;
        this.mLineStroke *= f;
        Paint paint = new Paint(getPaint());
        this.mLinesPaint = paint;
        paint.setStrokeWidth(this.mLineStroke);
        this.mSpace *= f;
        this.mLineSpacing = f * this.mLineSpacing;
        this.mNumChars = (float) this.mMaxLength;
        super.setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                OtpEditText otpEditText = OtpEditText.this;
                otpEditText.setSelection(otpEditText.getText().length());
                if (OtpEditText.this.mClickListener != null) {
                    OtpEditText.this.mClickListener.onClick(view);
                }
            }
        });
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.mClickListener = onClickListener;
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        int i;
        int width = (getWidth() - getPaddingRight()) - getPaddingLeft();
        float f2 = this.mSpace;
        if (f2 < 0.0f) {
            f = ((float) width) / ((this.mNumChars * 2.0f) - 1.0f);
        } else {
            float f3 = this.mNumChars;
            f = (((float) width) - (f2 * (f3 - 1.0f))) / f3;
        }
        int paddingLeft = getPaddingLeft();
        int height = getHeight() - getPaddingBottom();
        Editable text = getText();
        int length = text.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(getText(), 0, length, fArr);
        int i2 = 0;
        while (((float) i2) < this.mNumChars) {
            float f4 = (float) paddingLeft;
            float f5 = (float) height;
            canvas.drawLine(f4, f5, f4 + f, f5, this.mLinesPaint);
            if (getText().length() > i2) {
                i = i2;
                canvas.drawText(text, i2, i2 + 1, ((f / 2.0f) + f4) - (fArr[0] / 2.0f), f5 - this.mLineSpacing, getPaint());
            } else {
                i = i2;
            }
            float f6 = this.mSpace;
            paddingLeft = (int) (f4 + (f6 < 0.0f ? f * 2.0f : f6 + f));
            i2 = i + 1;
        }
    }
}
