package com.crickpe.view.home.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\nH\u0016R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, mo48222d2 = {"Lcom/crickpe/view/home/adapters/HomeTabAdapter;", "Landroidx/fragment/app/FragmentStatePagerAdapter;", "fm", "Landroidx/fragment/app/FragmentManager;", "fragList", "Ljava/util/ArrayList;", "Landroidx/fragment/app/Fragment;", "Lkotlin/collections/ArrayList;", "(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;)V", "getCount", "", "getItem", "position", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeTabAdapter.kt */
public final class HomeTabAdapter extends FragmentStatePagerAdapter {
    private ArrayList<Fragment> fragList;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeTabAdapter(FragmentManager fragmentManager, ArrayList<Fragment> arrayList) {
        super(fragmentManager);
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(arrayList, "fragList");
        this.fragList = arrayList;
    }

    public int getCount() {
        return this.fragList.size();
    }

    public Fragment getItem(int i) {
        Fragment fragment = this.fragList.get(i);
        Intrinsics.checkNotNullExpressionValue(fragment, "fragList[position]");
        return fragment;
    }
}
