package com.crickpe.view.detail.fragments.settings.models;

import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/Ball;", "", "label", "", "_id", "(Ljava/lang/String;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "getLabel", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Ball.kt */
public final class Ball {
    private final String _id;
    private final String label;

    public static /* synthetic */ Ball copy$default(Ball ball, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ball.label;
        }
        if ((i & 2) != 0) {
            str2 = ball._id;
        }
        return ball.copy(str, str2);
    }

    public final String component1() {
        return this.label;
    }

    public final String component2() {
        return this._id;
    }

    public final Ball copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, Constants.ScionAnalytics.PARAM_LABEL);
        Intrinsics.checkNotNullParameter(str2, "_id");
        return new Ball(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ball)) {
            return false;
        }
        Ball ball = (Ball) obj;
        return Intrinsics.areEqual((Object) this.label, (Object) ball.label) && Intrinsics.areEqual((Object) this._id, (Object) ball._id);
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this._id.hashCode();
    }

    public String toString() {
        return "Ball(label=" + this.label + ", _id=" + this._id + ')';
    }

    public Ball(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, Constants.ScionAnalytics.PARAM_LABEL);
        Intrinsics.checkNotNullParameter(str2, "_id");
        this.label = str;
        this._id = str2;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String get_id() {
        return this._id;
    }
}
