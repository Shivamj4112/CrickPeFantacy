package com.crickpe.view.intro.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.crickpe.C1188R;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, mo48222d2 = {"Lcom/crickpe/view/intro/adapters/ViewAdapter;", "Landroidx/viewpager/widget/PagerAdapter;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "images", "", "", "[Ljava/lang/Integer;", "images2", "layoutInflater", "Landroid/view/LayoutInflater;", "destroyItem", "", "container", "Landroid/view/ViewGroup;", "position", "object", "", "getCount", "instantiateItem", "isViewFromObject", "", "view", "Landroid/view/View;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ViewAdapter.kt */
public final class ViewAdapter extends PagerAdapter {
    private final Context context;
    private final Integer[] images = {Integer.valueOf(C1188R.C1190drawable.intro_image_one), Integer.valueOf(C1188R.C1190drawable.intro_image_two), Integer.valueOf(C1188R.C1190drawable.intro_image_three), Integer.valueOf(C1188R.C1190drawable.intro_image_four)};
    private final Integer[] images2 = {Integer.valueOf(C1188R.C1190drawable.intro_text_one), Integer.valueOf(C1188R.C1190drawable.intro_text_two), Integer.valueOf(C1188R.C1190drawable.intro_text_three), Integer.valueOf(C1188R.C1190drawable.intro_text_four)};
    private LayoutInflater layoutInflater;

    public boolean isViewFromObject(View view, Object obj) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        Intrinsics.checkNotNullParameter(obj, "object");
        return view == obj;
    }

    public ViewAdapter(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    public int getCount() {
        return this.images.length;
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Object systemService = this.context.getSystemService("layout_inflater");
        if (systemService != null) {
            this.layoutInflater = (LayoutInflater) systemService;
            try {
                View inflate = LayoutInflater.from(this.context).inflate(C1188R.C1193layout.intro_slide_imageview, (ViewGroup) null);
                ((ImageView) inflate.findViewById(C1188R.C1192id.image_view)).setImageResource(this.images[i].intValue());
                ((ImageView) inflate.findViewById(C1188R.C1192id.intro_textt)).setImageResource(this.images2[i].intValue());
                ((ViewPager) viewGroup).addView(inflate, 0);
                Intrinsics.checkNotNullExpressionValue(inflate, Promotion.ACTION_VIEW);
                return inflate;
            } catch (Exception e) {
                Log.v("instantiateItem", e.toString());
                View inflate2 = LayoutInflater.from(this.context).inflate(C1188R.C1193layout.intro_slide_imageview, (ViewGroup) null);
                ((ViewPager) viewGroup).addView(inflate2, 0);
                Intrinsics.checkNotNullExpressionValue(inflate2, Promotion.ACTION_VIEW);
                return inflate2;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        Intrinsics.checkNotNullParameter(viewGroup, "container");
        Intrinsics.checkNotNullParameter(obj, "object");
        ((ViewPager) viewGroup).removeView((View) obj);
    }
}
