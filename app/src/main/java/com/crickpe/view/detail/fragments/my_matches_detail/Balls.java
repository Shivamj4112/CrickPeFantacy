package com.crickpe.view.detail.fragments.my_matches_detail;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/Balls;", "", "desc", "", "label", "_id", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getDesc", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LiveScoreModel.kt */
public final class Balls {
    private final String _id;
    private final String desc;
    private final String label;

    public static /* synthetic */ Balls copy$default(Balls balls, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = balls.desc;
        }
        if ((i & 2) != 0) {
            str2 = balls.label;
        }
        if ((i & 4) != 0) {
            str3 = balls._id;
        }
        return balls.copy(str, str2, str3);
    }

    public final String component1() {
        return this.desc;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this._id;
    }

    public final Balls copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, Constants.ScionAnalytics.PARAM_LABEL);
        Intrinsics.checkNotNullParameter(str3, "_id");
        return new Balls(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Balls)) {
            return false;
        }
        Balls balls = (Balls) obj;
        return Intrinsics.areEqual((Object) this.desc, (Object) balls.desc) && Intrinsics.areEqual((Object) this.label, (Object) balls.label) && Intrinsics.areEqual((Object) this._id, (Object) balls._id);
    }

    public int hashCode() {
        return (((this.desc.hashCode() * 31) + this.label.hashCode()) * 31) + this._id.hashCode();
    }

    public String toString() {
        return "Balls(desc=" + this.desc + ", label=" + this.label + ", _id=" + this._id + ')';
    }

    public Balls(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "desc");
        Intrinsics.checkNotNullParameter(str2, Constants.ScionAnalytics.PARAM_LABEL);
        Intrinsics.checkNotNullParameter(str3, "_id");
        this.desc = str;
        this.label = str2;
        this._id = str3;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String get_id() {
        return this._id;
    }
}
