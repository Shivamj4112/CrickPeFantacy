package com.crickpe.view.detail.fragments.settings.models;

import com.crickpe.view.intro.fragments.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/ProfileModelNew;", "", "userProfile", "Lcom/crickpe/view/intro/fragments/User;", "recentlyPlayed", "", "Lcom/crickpe/view/detail/fragments/settings/models/RecentlyPlayed;", "(Lcom/crickpe/view/intro/fragments/User;Ljava/util/List;)V", "getRecentlyPlayed", "()Ljava/util/List;", "getUserProfile", "()Lcom/crickpe/view/intro/fragments/User;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileModelNew.kt */
public final class ProfileModelNew {
    private final List<RecentlyPlayed> recentlyPlayed;
    private final User userProfile;

    public static /* synthetic */ ProfileModelNew copy$default(ProfileModelNew profileModelNew, User user, List<RecentlyPlayed> list, int i, Object obj) {
        if ((i & 1) != 0) {
            user = profileModelNew.userProfile;
        }
        if ((i & 2) != 0) {
            list = profileModelNew.recentlyPlayed;
        }
        return profileModelNew.copy(user, list);
    }

    public final User component1() {
        return this.userProfile;
    }

    public final List<RecentlyPlayed> component2() {
        return this.recentlyPlayed;
    }

    public final ProfileModelNew copy(User user, List<RecentlyPlayed> list) {
        Intrinsics.checkNotNullParameter(user, "userProfile");
        Intrinsics.checkNotNullParameter(list, "recentlyPlayed");
        return new ProfileModelNew(user, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileModelNew)) {
            return false;
        }
        ProfileModelNew profileModelNew = (ProfileModelNew) obj;
        return Intrinsics.areEqual((Object) this.userProfile, (Object) profileModelNew.userProfile) && Intrinsics.areEqual((Object) this.recentlyPlayed, (Object) profileModelNew.recentlyPlayed);
    }

    public int hashCode() {
        return (this.userProfile.hashCode() * 31) + this.recentlyPlayed.hashCode();
    }

    public String toString() {
        return "ProfileModelNew(userProfile=" + this.userProfile + ", recentlyPlayed=" + this.recentlyPlayed + ')';
    }

    public ProfileModelNew(User user, List<RecentlyPlayed> list) {
        Intrinsics.checkNotNullParameter(user, "userProfile");
        Intrinsics.checkNotNullParameter(list, "recentlyPlayed");
        this.userProfile = user;
        this.recentlyPlayed = list;
    }

    public final User getUserProfile() {
        return this.userProfile;
    }

    public final List<RecentlyPlayed> getRecentlyPlayed() {
        return this.recentlyPlayed;
    }
}
