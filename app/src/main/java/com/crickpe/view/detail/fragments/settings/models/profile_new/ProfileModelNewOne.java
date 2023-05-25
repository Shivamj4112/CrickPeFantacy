package com.crickpe.view.detail.fragments.settings.models.profile_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.view.intro.fragments.User;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/profile_new/ProfileModelNewOne;", "Landroid/os/Parcelable;", "userProfile", "Lcom/crickpe/view/intro/fragments/User;", "recentlyPlayed", "", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/RecentlyPlayed;", "(Lcom/crickpe/view/intro/fragments/User;Ljava/util/List;)V", "getRecentlyPlayed", "()Ljava/util/List;", "getUserProfile", "()Lcom/crickpe/view/intro/fragments/User;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileModelNewOne.kt */
public final class ProfileModelNewOne implements Parcelable {
    public static final Parcelable.Creator<ProfileModelNewOne> CREATOR = new Creator();
    @SerializedName("recentlyPlayed")
    private final List<RecentlyPlayed> recentlyPlayed;
    @SerializedName("userProfile")
    private final User userProfile;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ProfileModelNewOne.kt */
    public static final class Creator implements Parcelable.Creator<ProfileModelNewOne> {
        public final ProfileModelNewOne createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            User createFromParcel = User.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(RecentlyPlayed.CREATOR.createFromParcel(parcel));
            }
            return new ProfileModelNewOne(createFromParcel, arrayList);
        }

        public final ProfileModelNewOne[] newArray(int i) {
            return new ProfileModelNewOne[i];
        }
    }

    public static /* synthetic */ ProfileModelNewOne copy$default(ProfileModelNewOne profileModelNewOne, User user, List<RecentlyPlayed> list, int i, Object obj) {
        if ((i & 1) != 0) {
            user = profileModelNewOne.userProfile;
        }
        if ((i & 2) != 0) {
            list = profileModelNewOne.recentlyPlayed;
        }
        return profileModelNewOne.copy(user, list);
    }

    public final User component1() {
        return this.userProfile;
    }

    public final List<RecentlyPlayed> component2() {
        return this.recentlyPlayed;
    }

    public final ProfileModelNewOne copy(User user, List<RecentlyPlayed> list) {
        Intrinsics.checkNotNullParameter(user, "userProfile");
        Intrinsics.checkNotNullParameter(list, "recentlyPlayed");
        return new ProfileModelNewOne(user, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileModelNewOne)) {
            return false;
        }
        ProfileModelNewOne profileModelNewOne = (ProfileModelNewOne) obj;
        return Intrinsics.areEqual((Object) this.userProfile, (Object) profileModelNewOne.userProfile) && Intrinsics.areEqual((Object) this.recentlyPlayed, (Object) profileModelNewOne.recentlyPlayed);
    }

    public int hashCode() {
        return (this.userProfile.hashCode() * 31) + this.recentlyPlayed.hashCode();
    }

    public String toString() {
        return "ProfileModelNewOne(userProfile=" + this.userProfile + ", recentlyPlayed=" + this.recentlyPlayed + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.userProfile.writeToParcel(parcel, i);
        List<RecentlyPlayed> list = this.recentlyPlayed;
        parcel.writeInt(list.size());
        for (RecentlyPlayed writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }

    public ProfileModelNewOne(User user, List<RecentlyPlayed> list) {
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
