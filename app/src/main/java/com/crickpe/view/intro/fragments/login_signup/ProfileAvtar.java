package com.crickpe.view.intro.fragments.login_signup;

import android.graphics.drawable.Drawable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/login_signup/ProfileAvtar;", "", "image_id", "Landroid/graphics/drawable/Drawable;", "isSelected", "", "(Landroid/graphics/drawable/Drawable;Z)V", "getImage_id", "()Landroid/graphics/drawable/Drawable;", "()Z", "setSelected", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileAvtar.kt */
public final class ProfileAvtar {
    @SerializedName("image_id")
    private final Drawable image_id;
    @SerializedName("isSelected")
    private boolean isSelected;

    public static /* synthetic */ ProfileAvtar copy$default(ProfileAvtar profileAvtar, Drawable drawable, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = profileAvtar.image_id;
        }
        if ((i & 2) != 0) {
            z = profileAvtar.isSelected;
        }
        return profileAvtar.copy(drawable, z);
    }

    public final Drawable component1() {
        return this.image_id;
    }

    public final boolean component2() {
        return this.isSelected;
    }

    public final ProfileAvtar copy(Drawable drawable, boolean z) {
        Intrinsics.checkNotNullParameter(drawable, "image_id");
        return new ProfileAvtar(drawable, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileAvtar)) {
            return false;
        }
        ProfileAvtar profileAvtar = (ProfileAvtar) obj;
        return Intrinsics.areEqual((Object) this.image_id, (Object) profileAvtar.image_id) && this.isSelected == profileAvtar.isSelected;
    }

    public int hashCode() {
        int hashCode = this.image_id.hashCode() * 31;
        boolean z = this.isSelected;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "ProfileAvtar(image_id=" + this.image_id + ", isSelected=" + this.isSelected + ')';
    }

    public ProfileAvtar(Drawable drawable, boolean z) {
        Intrinsics.checkNotNullParameter(drawable, "image_id");
        this.image_id = drawable;
        this.isSelected = z;
    }

    public final Drawable getImage_id() {
        return this.image_id;
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }
}
