package com.crickpe.view.intro.fragments.kyc.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J#\u0010\n\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\fHÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fHÖ\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/kyc/models/AllStatesModel;", "Landroid/os/Parcelable;", "data", "Ljava/util/ArrayList;", "Lcom/crickpe/view/intro/fragments/kyc/models/AllStatesData;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getData", "()Ljava/util/ArrayList;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AllStatesModel.kt */
public final class AllStatesModel implements Parcelable {
    public static final Parcelable.Creator<AllStatesModel> CREATOR = new Creator();
    @SerializedName("data")
    private final ArrayList<AllStatesData> data;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: AllStatesModel.kt */
    public static final class Creator implements Parcelable.Creator<AllStatesModel> {
        public final AllStatesModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(AllStatesData.CREATOR.createFromParcel(parcel));
            }
            return new AllStatesModel(arrayList);
        }

        public final AllStatesModel[] newArray(int i) {
            return new AllStatesModel[i];
        }
    }

    public static /* synthetic */ AllStatesModel copy$default(AllStatesModel allStatesModel, ArrayList<AllStatesData> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = allStatesModel.data;
        }
        return allStatesModel.copy(arrayList);
    }

    public final ArrayList<AllStatesData> component1() {
        return this.data;
    }

    public final AllStatesModel copy(ArrayList<AllStatesData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        return new AllStatesModel(arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AllStatesModel) && Intrinsics.areEqual((Object) this.data, (Object) ((AllStatesModel) obj).data);
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    public String toString() {
        return "AllStatesModel(data=" + this.data + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        ArrayList<AllStatesData> arrayList = this.data;
        parcel.writeInt(arrayList.size());
        Iterator<AllStatesData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public AllStatesModel(ArrayList<AllStatesData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        this.data = arrayList;
    }

    public final ArrayList<AllStatesData> getData() {
        return this.data;
    }
}
