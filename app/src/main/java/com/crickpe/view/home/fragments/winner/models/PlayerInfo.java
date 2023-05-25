package com.crickpe.view.home.fragments.winner.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0001¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0001HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\b¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/winner/models/PlayerInfo;", "", "_id", "", "name", "imageUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "get_id", "()Ljava/lang/String;", "getImageUrl", "()Ljava/lang/Object;", "getName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PlayerInfo.kt */
public final class PlayerInfo {
    private final String _id;
    private final Object imageUrl;
    private final String name;

    public static /* synthetic */ PlayerInfo copy$default(PlayerInfo playerInfo, String str, String str2, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = playerInfo._id;
        }
        if ((i & 2) != 0) {
            str2 = playerInfo.name;
        }
        if ((i & 4) != 0) {
            obj = playerInfo.imageUrl;
        }
        return playerInfo.copy(str, str2, obj);
    }

    public final String component1() {
        return this._id;
    }

    public final String component2() {
        return this.name;
    }

    public final Object component3() {
        return this.imageUrl;
    }

    public final PlayerInfo copy(String str, String str2, Object obj) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(obj, "imageUrl");
        return new PlayerInfo(str, str2, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerInfo)) {
            return false;
        }
        PlayerInfo playerInfo = (PlayerInfo) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) playerInfo._id) && Intrinsics.areEqual((Object) this.name, (Object) playerInfo.name) && Intrinsics.areEqual(this.imageUrl, playerInfo.imageUrl);
    }

    public int hashCode() {
        return (((this._id.hashCode() * 31) + this.name.hashCode()) * 31) + this.imageUrl.hashCode();
    }

    public String toString() {
        return "PlayerInfo(_id=" + this._id + ", name=" + this.name + ", imageUrl=" + this.imageUrl + ')';
    }

    public PlayerInfo(String str, String str2, Object obj) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(obj, "imageUrl");
        this._id = str;
        this.name = str2;
        this.imageUrl = obj;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getName() {
        return this.name;
    }

    public final Object getImageUrl() {
        return this.imageUrl;
    }
}
