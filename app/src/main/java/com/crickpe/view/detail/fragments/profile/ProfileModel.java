package com.crickpe.view.detail.fragments.profile;

import com.crickpe.view.intro.fragments.User;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\bHÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/profile/ProfileModel;", "", "userProfile", "Lcom/crickpe/view/intro/fragments/User;", "recentlyPlayed", "", "Lcom/crickpe/view/detail/fragments/profile/RecentlyPlayed;", "careerStats", "Lcom/crickpe/view/detail/fragments/profile/CareerStats;", "(Lcom/crickpe/view/intro/fragments/User;Ljava/util/List;Lcom/crickpe/view/detail/fragments/profile/CareerStats;)V", "getCareerStats", "()Lcom/crickpe/view/detail/fragments/profile/CareerStats;", "getRecentlyPlayed", "()Ljava/util/List;", "getUserProfile", "()Lcom/crickpe/view/intro/fragments/User;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileModel.kt */
public final class ProfileModel {
    private final CareerStats careerStats;
    private final List<RecentlyPlayed> recentlyPlayed;
    private final User userProfile;

    public static /* synthetic */ ProfileModel copy$default(ProfileModel profileModel, User user, List<RecentlyPlayed> list, CareerStats careerStats2, int i, Object obj) {
        if ((i & 1) != 0) {
            user = profileModel.userProfile;
        }
        if ((i & 2) != 0) {
            list = profileModel.recentlyPlayed;
        }
        if ((i & 4) != 0) {
            careerStats2 = profileModel.careerStats;
        }
        return profileModel.copy(user, list, careerStats2);
    }

    public final User component1() {
        return this.userProfile;
    }

    public final List<RecentlyPlayed> component2() {
        return this.recentlyPlayed;
    }

    public final CareerStats component3() {
        return this.careerStats;
    }

    public final ProfileModel copy(User user, List<RecentlyPlayed> list, CareerStats careerStats2) {
        Intrinsics.checkNotNullParameter(user, "userProfile");
        Intrinsics.checkNotNullParameter(list, "recentlyPlayed");
        Intrinsics.checkNotNullParameter(careerStats2, "careerStats");
        return new ProfileModel(user, list, careerStats2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileModel)) {
            return false;
        }
        ProfileModel profileModel = (ProfileModel) obj;
        return Intrinsics.areEqual((Object) this.userProfile, (Object) profileModel.userProfile) && Intrinsics.areEqual((Object) this.recentlyPlayed, (Object) profileModel.recentlyPlayed) && Intrinsics.areEqual((Object) this.careerStats, (Object) profileModel.careerStats);
    }

    public int hashCode() {
        return (((this.userProfile.hashCode() * 31) + this.recentlyPlayed.hashCode()) * 31) + this.careerStats.hashCode();
    }

    public String toString() {
        return "ProfileModel(userProfile=" + this.userProfile + ", recentlyPlayed=" + this.recentlyPlayed + ", careerStats=" + this.careerStats + ')';
    }

    public ProfileModel(User user, List<RecentlyPlayed> list, CareerStats careerStats2) {
        Intrinsics.checkNotNullParameter(user, "userProfile");
        Intrinsics.checkNotNullParameter(list, "recentlyPlayed");
        Intrinsics.checkNotNullParameter(careerStats2, "careerStats");
        this.userProfile = user;
        this.recentlyPlayed = list;
        this.careerStats = careerStats2;
    }

    public final User getUserProfile() {
        return this.userProfile;
    }

    public final List<RecentlyPlayed> getRecentlyPlayed() {
        return this.recentlyPlayed;
    }

    public final CareerStats getCareerStats() {
        return this.careerStats;
    }
}
