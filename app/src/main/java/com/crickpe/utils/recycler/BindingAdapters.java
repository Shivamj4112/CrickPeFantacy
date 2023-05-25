package com.crickpe.utils.recycler;

import android.graphics.drawable.Drawable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.p002ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;
import androidx.databinding.ObservableField;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.intro.fragments.splash.models.boot_app_models.SettingsModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0018\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u001aH\u0007J\u0018\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$2\u0006\u0010\u0015\u001a\u00020%H\u0007J\u0018\u0010&\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020'2\u0006\u0010\u0015\u001a\u00020(H\u0007J\u001f\u0010)\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\u0010+J\u0018\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020!H\u0007J&\u00100\u001a\u00020\f2\u0006\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u00104\u001a\u0004\u0018\u000105H\u0007J\u0018\u00106\u001a\u00020\f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000207H\u0007J\u0018\u00108\u001a\u00020\f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000207H\u0007J)\u00109\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010:\u001a\u0004\u0018\u00010;2\b\u0010<\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0002\u0010=JA\u0010>\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00142\f\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u00010@2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010A\u001a\u0004\u0018\u00010\u00102\b\u0010B\u001a\u0004\u0018\u00010CH\u0007¢\u0006\u0002\u0010DJ\u0018\u0010E\u001a\u00020\f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000207H\u0007J\u0018\u0010F\u001a\u00020\f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000207H\u0007J\u0018\u0010G\u001a\u00020\f2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u000207H\u0007J\u001e\u0010H\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00120JH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006K"}, mo48222d2 = {"Lcom/crickpe/utils/recycler/BindingAdapters;", "", "()V", "df", "Ljava/text/DecimalFormat;", "simpleDateFormat", "Ljava/text/SimpleDateFormat;", "getSimpleDateFormat", "()Ljava/text/SimpleDateFormat;", "setSimpleDateFormat", "(Ljava/text/SimpleDateFormat;)V", "addPaddingToView", "", "recyclerView", "Landroid/view/View;", "boolean", "", "paddingToAdd", "", "addScrollListener", "Landroidx/recyclerview/widget/RecyclerView;", "listener", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "addTextWatcher", "view", "Landroid/widget/EditText;", "Landroid/text/TextWatcher;", "disableSeek", "seekBar", "Landroid/widget/SeekBar;", "getDateString", "", "time", "", "onCheckChange", "compoundButton", "Landroid/widget/CompoundButton;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "radioGroupListener", "Landroid/widget/RadioGroup;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "setBackground", "drawable", "(Landroid/view/View;Ljava/lang/Integer;)V", "setDate", "textView", "Landroid/widget/TextView;", "value", "setImageUrl", "imageView", "Landroid/widget/ImageView;", "url", "placeHolder", "Landroid/graphics/drawable/Drawable;", "setNumber", "", "setNumberWithoutDec", "setPaddingHorizontal", "paddingHorizontal", "", "paddingVertical", "(Landroid/view/View;Ljava/lang/Float;Ljava/lang/Float;)V", "setRecyclerAdapter", "adapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "chipLayout", "swipeListener", "Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;Ljava/lang/Boolean;Landroidx/recyclerview/widget/ItemTouchHelper$SimpleCallback;)V", "setWithDecimalPts", "setWithoutDecimalPts", "setWithoutDecimalPtsPer", "startTimer", "progress", "Landroidx/databinding/ObservableField;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BindingAdapters.kt */
public final class BindingAdapters {
    public static final BindingAdapters INSTANCE = new BindingAdapters();

    /* renamed from: df */
    private static DecimalFormat f463df;
    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM, yyyy", Locale.ENGLISH);

    private BindingAdapters() {
    }

    @JvmStatic
    @BindingAdapter(requireAll = true, value = {"setPaddingHorizontal", "setPaddingVertical"})
    public static final void setPaddingHorizontal(View view, Float f, Float f2) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int i = 0;
        int floatValue = f != null ? (int) f.floatValue() : 0;
        int floatValue2 = f2 != null ? (int) f2.floatValue() : 0;
        int floatValue3 = f != null ? (int) f.floatValue() : 0;
        if (f2 != null) {
            i = (int) f2.floatValue();
        }
        view.setPadding(floatValue, floatValue2, floatValue3, i);
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"addPaddingToView", "paddingToAdd"})
    public static final void addPaddingToView(View view, boolean z, int i) {
        Intrinsics.checkNotNullParameter(view, "recyclerView");
        if (z) {
            view.setPadding(0, 0, 0, i);
        }
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"onCheckChange"})
    public static final void onCheckChange(CompoundButton compoundButton, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkNotNullParameter(compoundButton, "compoundButton");
        Intrinsics.checkNotNullParameter(onCheckedChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        compoundButton.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public static /* synthetic */ void setImageUrl$default(ImageView imageView, String str, Drawable drawable, int i, Object obj) {
        if ((i & 4) != 0) {
            drawable = null;
        }
        setImageUrl(imageView, str, drawable);
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setImageUrl", "placeHolder"})
    public static final void setImageUrl(ImageView imageView, String str, Drawable drawable) {
        Intrinsics.checkNotNullParameter(imageView, "imageView");
        StringBuilder sb = new StringBuilder();
        SettingsModel appSettings = UserManager.INSTANCE.getAppSettings();
        sb.append(appSettings != null ? appSettings.getImageBaseUrl() : null);
        String str2 = "";
        sb.append(str == null ? str2 : str);
        String sb2 = sb.toString();
        boolean z = false;
        if (StringsKt.contains$default((CharSequence) str == null ? str2 : str, (CharSequence) "http", false, 2, (Object) null)) {
            if (str != null) {
                str2 = str;
            }
            sb2 = str2;
        }
        CharSequence charSequence = str;
        if (!(charSequence == null || charSequence.length() == 0) || drawable != null) {
            if (!(charSequence == null || charSequence.length() == 0) || drawable == null) {
                if ((charSequence == null || charSequence.length() == 0) || drawable != null) {
                    if (charSequence == null || charSequence.length() == 0) {
                        z = true;
                    }
                    if (!z && drawable != null) {
                        ((RequestBuilder) ((RequestBuilder) Glide.with((View) imageView).load(sb2).placeholder(drawable)).error(drawable)).into(imageView);
                        return;
                    }
                    return;
                }
                Glide.with((View) imageView).load(sb2).into(imageView);
                return;
            }
            Glide.with((View) imageView).load(drawable).into(imageView);
        }
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setNumber"})
    public static final void setNumber(TextView textView, double d) {
        String str;
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            double abs = Math.abs(d);
            if (abs >= 1.0E7d) {
                abs /= (double) 10000000;
                str = " Crores";
                f463df = new DecimalFormat("###,###,###,###,###.##");
            } else if (abs >= 100000.0d) {
                abs /= (double) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
                str = " Lakhs";
                f463df = new DecimalFormat("###,###,###,###,###.##");
            } else {
                str = " ";
                f463df = new DecimalFormat("###,###,###,###,###");
            }
            DecimalFormat decimalFormat = f463df;
            DecimalFormat decimalFormat2 = null;
            if (decimalFormat == null) {
                Intrinsics.throwUninitializedPropertyAccessException("df");
                decimalFormat = null;
            }
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            DecimalFormat decimalFormat3 = f463df;
            if (decimalFormat3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("df");
            } else {
                decimalFormat2 = decimalFormat3;
            }
            String format = decimalFormat2.format(abs);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
            textView.setText(8377 + format + str);
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setNumberWithoutDec"})
    public static final void setNumberWithoutDec(TextView textView, double d) {
        String str;
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            double abs = Math.abs(d);
            if (abs >= 1.0E7d) {
                abs /= (double) 10000000;
                str = " Crores";
            } else if (abs >= 100000.0d) {
                abs /= (double) AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength;
                str = " Lakhs";
            } else {
                str = " ";
            }
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(abs);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(a)");
            if (d < 0.0d) {
                textView.setText("-₹" + format + str);
                return;
            }
            textView.setText(8377 + format + str);
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setWithoutDecimalPts"})
    public static final void setWithoutDecimalPts(TextView textView, double d) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(d);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(value)");
            textView.setText(format.toString());
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setWithoutDecimalPtsPer"})
    public static final void setWithoutDecimalPtsPer(TextView textView, double d) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(d);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(value)");
            textView.setText(format + '%');
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setWithDecimalPts"})
    public static final void setWithDecimalPts(TextView textView, double d) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###,###.##");
            decimalFormat.setRoundingMode(RoundingMode.DOWN);
            String format = decimalFormat.format(d);
            Intrinsics.checkNotNullExpressionValue(format, "df.format(value)");
            textView.setText(format.toString());
        } catch (Exception e) {
            Log.v("numDifferentiation", e.toString());
        }
    }

    public final SimpleDateFormat getSimpleDateFormat() {
        return simpleDateFormat;
    }

    public final void setSimpleDateFormat(SimpleDateFormat simpleDateFormat2) {
        Intrinsics.checkNotNullParameter(simpleDateFormat2, "<set-?>");
        simpleDateFormat = simpleDateFormat2;
    }

    private final String getDateString(long j) {
        String format = simpleDateFormat.format(Long.valueOf(j * 1000));
        Intrinsics.checkNotNullExpressionValue(format, "simpleDateFormat.format(time * 1000L)");
        return format;
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setDate"})
    public static final void setDate(TextView textView, long j) {
        Intrinsics.checkNotNullParameter(textView, "textView");
        try {
            textView.setText(INSTANCE.getDateString(j));
        } catch (Exception e) {
            Log.v("setDateError", e.toString());
        }
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setBackground"})
    public static final void setBackground(View view, Integer num) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        if (num != null) {
            view.setBackground(ContextCompat.getDrawable(view.getContext(), num.intValue()));
        } else if (view instanceof AppCompatEditText) {
            view.setBackgroundColor(ContextCompat.getColor(((AppCompatEditText) view).getContext(), 17170445));
        }
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"radioGroupListener"})
    public static final void radioGroupListener(RadioGroup radioGroup, RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        Intrinsics.checkNotNullParameter(radioGroup, Promotion.ACTION_VIEW);
        Intrinsics.checkNotNullParameter(onCheckedChangeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"addTextWatcher"})
    public static final void addTextWatcher(EditText editText, TextWatcher textWatcher) {
        Intrinsics.checkNotNullParameter(editText, Promotion.ACTION_VIEW);
        Intrinsics.checkNotNullParameter(textWatcher, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        editText.addTextChangedListener(textWatcher);
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"addScrollListener"})
    public static final void addScrollListener(RecyclerView recyclerView, RecyclerView.OnScrollListener onScrollListener) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(onScrollListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        recyclerView.addOnScrollListener(onScrollListener);
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setRecyclerAdapter", "rvScrollListener", "chipLayout", "rvSwipe"})
    public static final void setRecyclerAdapter(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter, RecyclerView.OnScrollListener onScrollListener, Boolean bool, ItemTouchHelper.SimpleCallback simpleCallback) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        recyclerView.setOverScrollMode(2);
        if (adapter != null) {
            recyclerView.setAdapter(adapter);
        }
        if (onScrollListener != null) {
            recyclerView.addOnScrollListener(onScrollListener);
        }
        if (simpleCallback != null) {
            new ItemTouchHelper(simpleCallback).attachToRecyclerView(recyclerView);
        }
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"disableSeek"})
    public static final void disableSeek(SeekBar seekBar, boolean z) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        seekBar.setEnabled(z);
    }

    @JvmStatic
    @BindingAdapter(requireAll = false, value = {"setSeekbarProgress"})
    public static final void startTimer(SeekBar seekBar, ObservableField<Integer> observableField) {
        Intrinsics.checkNotNullParameter(seekBar, "seekBar");
        Intrinsics.checkNotNullParameter(observableField, "progress");
        int progress = seekBar.getProgress();
        Integer num = observableField.get();
        if (num == null || progress != num.intValue()) {
            Integer num2 = observableField.get();
            seekBar.setProgress(num2 == null ? 0 : num2.intValue());
            seekBar.setEnabled(false);
            seekBar.setOnSeekBarChangeListener(new BindingAdapters$startTimer$1());
        }
    }
}
