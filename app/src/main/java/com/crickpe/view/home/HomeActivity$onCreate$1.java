package com.crickpe.view.home;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.crickpe.C1188R;
import com.crickpe.utils.ClickListener;
import com.crickpe.utils.Constants;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.WebViewActivity;
import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, mo48222d2 = {"com/crickpe/view/home/HomeActivity$onCreate$1", "Lcom/crickpe/utils/ClickListener;", "onClick", "", "view", "Landroid/view/View;", "position", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeActivity.kt */
public final class HomeActivity$onCreate$1 implements ClickListener {
    final /* synthetic */ HomeActivity this$0;

    HomeActivity$onCreate$1(HomeActivity homeActivity) {
        this.this$0 = homeActivity;
    }

    public void onClick(View view, int i) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        switch (i) {
            case 0:
                Intent intent = new Intent(this.this$0, DetailActivity.class);
                intent.putExtra("open", "settings");
                this.this$0.startActivity(intent);
                break;
            case 1:
                Intent intent2 = new Intent(this.this$0, DetailActivity.class);
                intent2.putExtra("open", "wallet");
                this.this$0.startActivity(intent2);
                break;
            case 2:
                Intent intent3 = new Intent(this.this$0, DetailActivity.class);
                intent3.putExtra("open", "recent_earning");
                this.this$0.startActivity(intent3);
                break;
            case 3:
                Intent intent4 = new Intent(this.this$0, WebViewActivity.class);
                intent4.putExtra("web_url", Constants.TERMS_URL);
                intent4.putExtra("title", "Terms & Conditions");
                this.this$0.startActivity(intent4);
                break;
            case 4:
                Intent intent5 = new Intent(this.this$0, WebViewActivity.class);
                intent5.putExtra("web_url", Constants.POINT_SYSTEM_URL);
                intent5.putExtra("title", "Point System");
                this.this$0.startActivity(intent5);
                break;
            case 5:
                Intent intent6 = new Intent(this.this$0, DetailActivity.class);
                intent6.putExtra("open", "refer");
                this.this$0.startActivity(intent6);
                break;
            case 6:
                Intent intent7 = new Intent(this.this$0, WebViewActivity.class);
                intent7.putExtra("web_url", Constants.RESPONSIBLE_PAY);
                intent7.putExtra("title", "Responsible Play");
                this.this$0.startActivity(intent7);
                break;
            case 7:
                this.this$0.supportChatBox();
                break;
        }
        this.this$0.updateAdapter(i);
        Looper myLooper = Looper.myLooper();
        Intrinsics.checkNotNull(myLooper);
        new Handler(myLooper).postDelayed(new HomeActivity$onCreate$1$$ExternalSyntheticLambda0(this.this$0), 200);
    }

    /* access modifiers changed from: private */
    /* renamed from: onClick$lambda-0  reason: not valid java name */
    public static final void m3677onClick$lambda0(HomeActivity homeActivity) {
        Intrinsics.checkNotNullParameter(homeActivity, "this$0");
        ((DrawerLayout) homeActivity._$_findCachedViewById(C1188R.C1192id.drawerLayout)).closeDrawer((int) GravityCompat.START);
    }
}
