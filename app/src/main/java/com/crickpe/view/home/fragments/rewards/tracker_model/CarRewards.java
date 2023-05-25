package com.crickpe.view.home.fragments.rewards.tracker_model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JE\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/rewards/tracker_model/CarRewards;", "", "_id", "", "imageUrl", "name", "discription", "amount", "", "model", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getAmount", "()I", "getDiscription", "getImageUrl", "getModel", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CarRewards.kt */
public final class CarRewards {
    private final String _id;
    private final int amount;
    private final String discription;
    private final String imageUrl;
    private final String model;
    private final String name;

    public static /* synthetic */ CarRewards copy$default(CarRewards carRewards, String str, String str2, String str3, String str4, int i, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = carRewards._id;
        }
        if ((i2 & 2) != 0) {
            str2 = carRewards.imageUrl;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = carRewards.name;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            str4 = carRewards.discription;
        }
        String str8 = str4;
        if ((i2 & 16) != 0) {
            i = carRewards.amount;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            str5 = carRewards.model;
        }
        return carRewards.copy(str, str6, str7, str8, i3, str5);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.imageUrl;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.discription;
    }

    public final int component5() {
        return this.amount;
    }

    public final String component6() {
        return this.model;
    }

    public final CarRewards copy(String str, String str2, String str3, String str4, int i, String str5) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "imageUrl");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "discription");
        Intrinsics.checkNotNullParameter(str5, "model");
        return new CarRewards(str, str2, str3, str4, i, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CarRewards)) {
            return false;
        }
        CarRewards carRewards = (CarRewards) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) carRewards._id) && Intrinsics.areEqual((Object) this.imageUrl, (Object) carRewards.imageUrl) && Intrinsics.areEqual((Object) this.name, (Object) carRewards.name) && Intrinsics.areEqual((Object) this.discription, (Object) carRewards.discription) && this.amount == carRewards.amount && Intrinsics.areEqual((Object) this.model, (Object) carRewards.model);
    }

    public int hashCode() {
        return (((((((((this._id.hashCode() * 31) + this.imageUrl.hashCode()) * 31) + this.name.hashCode()) * 31) + this.discription.hashCode()) * 31) + this.amount) * 31) + this.model.hashCode();
    }

    public String toString() {
        return "CarRewards(_id=" + this._id + ", imageUrl=" + this.imageUrl + ", name=" + this.name + ", discription=" + this.discription + ", amount=" + this.amount + ", model=" + this.model + ')';
    }

    public CarRewards(String str, String str2, String str3, String str4, int i, String str5) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "imageUrl");
        Intrinsics.checkNotNullParameter(str3, "name");
        Intrinsics.checkNotNullParameter(str4, "discription");
        Intrinsics.checkNotNullParameter(str5, "model");
        this._id = str;
        this.imageUrl = str2;
        this.name = str3;
        this.discription = str4;
        this.amount = i;
        this.model = str5;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getDiscription() {
        return this.discription;
    }

    public final int getAmount() {
        return this.amount;
    }

    public final String getModel() {
        return this.model;
    }
}
