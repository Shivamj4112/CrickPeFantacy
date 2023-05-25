package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import com.crickpe.utils.recycler.AbstractModel;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\tHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\tHÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Joined;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "name", "", "image", "joinedDate", "sequence", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getImage", "()Ljava/lang/String;", "getJoinedDate", "getName", "getSequence", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestDetailModel.kt */
public final class Joined extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<Joined> CREATOR = new Creator();
    @SerializedName("image")
    private final String image;
    @SerializedName("joinedDate")
    private final String joinedDate;
    @SerializedName("name")
    private final String name;
    @SerializedName("sequence")
    private final List<Integer> sequence;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestDetailModel.kt */
    public static final class Creator implements Parcelable.Creator<Joined> {
        public final Joined createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new Joined(readString, readString2, readString3, arrayList);
        }

        public final Joined[] newArray(int i) {
            return new Joined[i];
        }
    }

    public static /* synthetic */ Joined copy$default(Joined joined, String str, String str2, String str3, List<Integer> list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = joined.name;
        }
        if ((i & 2) != 0) {
            str2 = joined.image;
        }
        if ((i & 4) != 0) {
            str3 = joined.joinedDate;
        }
        if ((i & 8) != 0) {
            list = joined.sequence;
        }
        return joined.copy(str, str2, str3, list);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.image;
    }

    public final String component3() {
        return this.joinedDate;
    }

    public final List<Integer> component4() {
        return this.sequence;
    }

    public final Joined copy(String str, String str2, String str3, List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "image");
        Intrinsics.checkNotNullParameter(str3, "joinedDate");
        Intrinsics.checkNotNullParameter(list, "sequence");
        return new Joined(str, str2, str3, list);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Joined)) {
            return false;
        }
        Joined joined = (Joined) obj;
        return Intrinsics.areEqual((Object) this.name, (Object) joined.name) && Intrinsics.areEqual((Object) this.image, (Object) joined.image) && Intrinsics.areEqual((Object) this.joinedDate, (Object) joined.joinedDate) && Intrinsics.areEqual((Object) this.sequence, (Object) joined.sequence);
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.image.hashCode()) * 31) + this.joinedDate.hashCode()) * 31) + this.sequence.hashCode();
    }

    public String toString() {
        return "Joined(name=" + this.name + ", image=" + this.image + ", joinedDate=" + this.joinedDate + ", sequence=" + this.sequence + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.name);
        parcel.writeString(this.image);
        parcel.writeString(this.joinedDate);
        List<Integer> list = this.sequence;
        parcel.writeInt(list.size());
        for (Integer intValue : list) {
            parcel.writeInt(intValue.intValue());
        }
    }

    public final String getName() {
        return this.name;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getJoinedDate() {
        return this.joinedDate;
    }

    public final List<Integer> getSequence() {
        return this.sequence;
    }

    public Joined(String str, String str2, String str3, List<Integer> list) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(str2, "image");
        Intrinsics.checkNotNullParameter(str3, "joinedDate");
        Intrinsics.checkNotNullParameter(list, "sequence");
        this.name = str;
        this.image = str2;
        this.joinedDate = str3;
        this.sequence = list;
    }
}
