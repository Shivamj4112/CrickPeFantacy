package com.crickpe.view.home.fragments;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0017"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/NavigationItemModel;", "", "icon", "", "title", "", "(ILjava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: NavigationItemModel.kt */
public final class NavigationItemModel {
    private int icon;
    private String title;

    public static /* synthetic */ NavigationItemModel copy$default(NavigationItemModel navigationItemModel, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = navigationItemModel.icon;
        }
        if ((i2 & 2) != 0) {
            str = navigationItemModel.title;
        }
        return navigationItemModel.copy(i, str);
    }

    public final int component1() {
        return this.icon;
    }

    public final String component2() {
        return this.title;
    }

    public final NavigationItemModel copy(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        return new NavigationItemModel(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavigationItemModel)) {
            return false;
        }
        NavigationItemModel navigationItemModel = (NavigationItemModel) obj;
        return this.icon == navigationItemModel.icon && Intrinsics.areEqual((Object) this.title, (Object) navigationItemModel.title);
    }

    public int hashCode() {
        return (this.icon * 31) + this.title.hashCode();
    }

    public String toString() {
        return "NavigationItemModel(icon=" + this.icon + ", title=" + this.title + ')';
    }

    public NavigationItemModel(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        this.icon = i;
        this.title = str;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }
}
