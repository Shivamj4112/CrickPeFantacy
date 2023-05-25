package com.crickpe.view.detail.fragments.settings.models.profile_new;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\t\u00104\u001a\u00020\u0003HÆ\u0003J\u000f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\bHÆ\u0003J\t\u00106\u001a\u00020\u0015HÆ\u0003J\t\u00107\u001a\u00020\u0015HÆ\u0003J\t\u00108\u001a\u00020\u0015HÆ\u0003J\t\u00109\u001a\u00020\u0006HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u001cHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0006HÆ\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\t\u0010@\u001a\u00020\u000bHÆ\u0003J\t\u0010A\u001a\u00020\rHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J¿\u0001\u0010E\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\t\u0010F\u001a\u00020\u0006HÖ\u0001J\u0013\u0010G\u001a\u00020\u00152\b\u0010H\u001a\u0004\u0018\u00010IHÖ\u0003J\t\u0010J\u001a\u00020\u0006HÖ\u0001J\t\u0010K\u001a\u00020\u0003HÖ\u0001J\u0019\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010-R\u0016\u0010\u0016\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010-R\u0016\u0010\u0017\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010-R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0016\u0010\u0018\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0016\u0010\u001b\u001a\u00020\u001c8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!¨\u0006Q"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/settings/models/profile_new/LivescoresInfo;", "Landroid/os/Parcelable;", "_id", "", "matchId", "__v", "", "balls", "", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Balls;", "batsmanNonStriker", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/BatsmanNonStriker;", "batsmanStriker", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/BatsmanStriker;", "bowler", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Bowler;", "createdAt", "currentInning", "innings", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Innings;", "isBlocked", "", "isDeleted", "isResult", "overNumber", "updatedAt", "playStatus", "result", "Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Result;", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Lcom/crickpe/view/detail/fragments/settings/models/profile_new/BatsmanNonStriker;Lcom/crickpe/view/detail/fragments/settings/models/profile_new/BatsmanStriker;Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Bowler;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZZILjava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Result;)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getBalls", "()Ljava/util/List;", "getBatsmanNonStriker", "()Lcom/crickpe/view/detail/fragments/settings/models/profile_new/BatsmanNonStriker;", "getBatsmanStriker", "()Lcom/crickpe/view/detail/fragments/settings/models/profile_new/BatsmanStriker;", "getBowler", "()Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Bowler;", "getCreatedAt", "getCurrentInning", "getInnings", "()Z", "getMatchId", "getOverNumber", "getPlayStatus", "getResult", "()Lcom/crickpe/view/detail/fragments/settings/models/profile_new/Result;", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LivescoresInfo.kt */
public final class LivescoresInfo implements Parcelable {
    public static final Parcelable.Creator<LivescoresInfo> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("balls")
    private final List<Balls> balls;
    @SerializedName("batsmanNonStriker")
    private final BatsmanNonStriker batsmanNonStriker;
    @SerializedName("batsmanStriker")
    private final BatsmanStriker batsmanStriker;
    @SerializedName("bowler")
    private final Bowler bowler;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("currentInning")
    private final String currentInning;
    @SerializedName("innings")
    private final List<Innings> innings;
    @SerializedName("isBlocked")
    private final boolean isBlocked;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("isResult")
    private final boolean isResult;
    @SerializedName("matchId")
    private final String matchId;
    @SerializedName("overNumber")
    private final int overNumber;
    @SerializedName("playStatus")
    private final String playStatus;
    @SerializedName("result")
    private final Result result;
    @SerializedName("updatedAt")
    private final String updatedAt;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: LivescoresInfo.kt */
    public static final class Creator implements Parcelable.Creator<LivescoresInfo> {
        public final LivescoresInfo createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(Balls.CREATOR.createFromParcel(parcel2));
            }
            List list = arrayList;
            BatsmanNonStriker createFromParcel = BatsmanNonStriker.CREATOR.createFromParcel(parcel2);
            BatsmanStriker createFromParcel2 = BatsmanStriker.CREATOR.createFromParcel(parcel2);
            Bowler createFromParcel3 = Bowler.CREATOR.createFromParcel(parcel2);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            for (int i2 = 0; i2 != readInt3; i2++) {
                arrayList2.add(Innings.CREATOR.createFromParcel(parcel2));
            }
            return new LivescoresInfo(readString, readString2, readInt, list, createFromParcel, createFromParcel2, createFromParcel3, readString3, readString4, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readString(), parcel.readString(), Result.CREATOR.createFromParcel(parcel2));
        }

        public final LivescoresInfo[] newArray(int i) {
            return new LivescoresInfo[i];
        }
    }

    public static /* synthetic */ LivescoresInfo copy$default(LivescoresInfo livescoresInfo, String str, String str2, int i, List list, BatsmanNonStriker batsmanNonStriker2, BatsmanStriker batsmanStriker2, Bowler bowler2, String str3, String str4, List list2, boolean z, boolean z2, boolean z3, int i2, String str5, String str6, Result result2, int i3, Object obj) {
        LivescoresInfo livescoresInfo2 = livescoresInfo;
        int i4 = i3;
        return livescoresInfo.copy((i4 & 1) != 0 ? livescoresInfo2._id : str, (i4 & 2) != 0 ? livescoresInfo2.matchId : str2, (i4 & 4) != 0 ? livescoresInfo2.__v : i, (i4 & 8) != 0 ? livescoresInfo2.balls : list, (i4 & 16) != 0 ? livescoresInfo2.batsmanNonStriker : batsmanNonStriker2, (i4 & 32) != 0 ? livescoresInfo2.batsmanStriker : batsmanStriker2, (i4 & 64) != 0 ? livescoresInfo2.bowler : bowler2, (i4 & 128) != 0 ? livescoresInfo2.createdAt : str3, (i4 & 256) != 0 ? livescoresInfo2.currentInning : str4, (i4 & 512) != 0 ? livescoresInfo2.innings : list2, (i4 & 1024) != 0 ? livescoresInfo2.isBlocked : z, (i4 & 2048) != 0 ? livescoresInfo2.isDeleted : z2, (i4 & 4096) != 0 ? livescoresInfo2.isResult : z3, (i4 & 8192) != 0 ? livescoresInfo2.overNumber : i2, (i4 & 16384) != 0 ? livescoresInfo2.updatedAt : str5, (i4 & 32768) != 0 ? livescoresInfo2.playStatus : str6, (i4 & 65536) != 0 ? livescoresInfo2.result : result2);
    }

    public final String component1() {
        return this._id;
    }

    public final List<Innings> component10() {
        return this.innings;
    }

    public final boolean component11() {
        return this.isBlocked;
    }

    public final boolean component12() {
        return this.isDeleted;
    }

    public final boolean component13() {
        return this.isResult;
    }

    public final int component14() {
        return this.overNumber;
    }

    public final String component15() {
        return this.updatedAt;
    }

    public final String component16() {
        return this.playStatus;
    }

    public final Result component17() {
        return this.result;
    }

    public final String component2() {
        return this.matchId;
    }

    public final int component3() {
        return this.__v;
    }

    public final List<Balls> component4() {
        return this.balls;
    }

    public final BatsmanNonStriker component5() {
        return this.batsmanNonStriker;
    }

    public final BatsmanStriker component6() {
        return this.batsmanStriker;
    }

    public final Bowler component7() {
        return this.bowler;
    }

    public final String component8() {
        return this.createdAt;
    }

    public final String component9() {
        return this.currentInning;
    }

    public final LivescoresInfo copy(String str, String str2, int i, List<Balls> list, BatsmanNonStriker batsmanNonStriker2, BatsmanStriker batsmanStriker2, Bowler bowler2, String str3, String str4, List<Innings> list2, boolean z, boolean z2, boolean z3, int i2, String str5, String str6, Result result2) {
        String str7 = str;
        Intrinsics.checkNotNullParameter(str7, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(list, "balls");
        Intrinsics.checkNotNullParameter(batsmanNonStriker2, "batsmanNonStriker");
        Intrinsics.checkNotNullParameter(batsmanStriker2, "batsmanStriker");
        Intrinsics.checkNotNullParameter(bowler2, "bowler");
        Intrinsics.checkNotNullParameter(str3, "createdAt");
        Intrinsics.checkNotNullParameter(str4, "currentInning");
        Intrinsics.checkNotNullParameter(list2, "innings");
        Intrinsics.checkNotNullParameter(str5, "updatedAt");
        Intrinsics.checkNotNullParameter(str6, "playStatus");
        Intrinsics.checkNotNullParameter(result2, "result");
        return new LivescoresInfo(str7, str2, i, list, batsmanNonStriker2, batsmanStriker2, bowler2, str3, str4, list2, z, z2, z3, i2, str5, str6, result2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivescoresInfo)) {
            return false;
        }
        LivescoresInfo livescoresInfo = (LivescoresInfo) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) livescoresInfo._id) && Intrinsics.areEqual((Object) this.matchId, (Object) livescoresInfo.matchId) && this.__v == livescoresInfo.__v && Intrinsics.areEqual((Object) this.balls, (Object) livescoresInfo.balls) && Intrinsics.areEqual((Object) this.batsmanNonStriker, (Object) livescoresInfo.batsmanNonStriker) && Intrinsics.areEqual((Object) this.batsmanStriker, (Object) livescoresInfo.batsmanStriker) && Intrinsics.areEqual((Object) this.bowler, (Object) livescoresInfo.bowler) && Intrinsics.areEqual((Object) this.createdAt, (Object) livescoresInfo.createdAt) && Intrinsics.areEqual((Object) this.currentInning, (Object) livescoresInfo.currentInning) && Intrinsics.areEqual((Object) this.innings, (Object) livescoresInfo.innings) && this.isBlocked == livescoresInfo.isBlocked && this.isDeleted == livescoresInfo.isDeleted && this.isResult == livescoresInfo.isResult && this.overNumber == livescoresInfo.overNumber && Intrinsics.areEqual((Object) this.updatedAt, (Object) livescoresInfo.updatedAt) && Intrinsics.areEqual((Object) this.playStatus, (Object) livescoresInfo.playStatus) && Intrinsics.areEqual((Object) this.result, (Object) livescoresInfo.result);
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((this._id.hashCode() * 31) + this.matchId.hashCode()) * 31) + this.__v) * 31) + this.balls.hashCode()) * 31) + this.batsmanNonStriker.hashCode()) * 31) + this.batsmanStriker.hashCode()) * 31) + this.bowler.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.currentInning.hashCode()) * 31) + this.innings.hashCode()) * 31;
        boolean z = this.isBlocked;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isDeleted;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isResult;
        if (!z4) {
            z2 = z4;
        }
        return ((((((((i2 + (z2 ? 1 : 0)) * 31) + this.overNumber) * 31) + this.updatedAt.hashCode()) * 31) + this.playStatus.hashCode()) * 31) + this.result.hashCode();
    }

    public String toString() {
        return "LivescoresInfo(_id=" + this._id + ", matchId=" + this.matchId + ", __v=" + this.__v + ", balls=" + this.balls + ", batsmanNonStriker=" + this.batsmanNonStriker + ", batsmanStriker=" + this.batsmanStriker + ", bowler=" + this.bowler + ", createdAt=" + this.createdAt + ", currentInning=" + this.currentInning + ", innings=" + this.innings + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", isResult=" + this.isResult + ", overNumber=" + this.overNumber + ", updatedAt=" + this.updatedAt + ", playStatus=" + this.playStatus + ", result=" + this.result + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.matchId);
        parcel.writeInt(this.__v);
        List<Balls> list = this.balls;
        parcel.writeInt(list.size());
        for (Balls writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        this.batsmanNonStriker.writeToParcel(parcel, i);
        this.batsmanStriker.writeToParcel(parcel, i);
        this.bowler.writeToParcel(parcel, i);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.currentInning);
        List<Innings> list2 = this.innings;
        parcel.writeInt(list2.size());
        for (Innings writeToParcel2 : list2) {
            writeToParcel2.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeInt(this.isResult ? 1 : 0);
        parcel.writeInt(this.overNumber);
        parcel.writeString(this.updatedAt);
        parcel.writeString(this.playStatus);
        this.result.writeToParcel(parcel, i);
    }

    public LivescoresInfo(String str, String str2, int i, List<Balls> list, BatsmanNonStriker batsmanNonStriker2, BatsmanStriker batsmanStriker2, Bowler bowler2, String str3, String str4, List<Innings> list2, boolean z, boolean z2, boolean z3, int i2, String str5, String str6, Result result2) {
        String str7 = str2;
        List<Balls> list3 = list;
        BatsmanNonStriker batsmanNonStriker3 = batsmanNonStriker2;
        BatsmanStriker batsmanStriker3 = batsmanStriker2;
        Bowler bowler3 = bowler2;
        String str8 = str3;
        String str9 = str4;
        List<Innings> list4 = list2;
        String str10 = str5;
        String str11 = str6;
        Result result3 = result2;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str7, "matchId");
        Intrinsics.checkNotNullParameter(list3, "balls");
        Intrinsics.checkNotNullParameter(batsmanNonStriker3, "batsmanNonStriker");
        Intrinsics.checkNotNullParameter(batsmanStriker3, "batsmanStriker");
        Intrinsics.checkNotNullParameter(bowler3, "bowler");
        Intrinsics.checkNotNullParameter(str8, "createdAt");
        Intrinsics.checkNotNullParameter(str9, "currentInning");
        Intrinsics.checkNotNullParameter(list4, "innings");
        Intrinsics.checkNotNullParameter(str10, "updatedAt");
        Intrinsics.checkNotNullParameter(str11, "playStatus");
        Intrinsics.checkNotNullParameter(result3, "result");
        this._id = str;
        this.matchId = str7;
        this.__v = i;
        this.balls = list3;
        this.batsmanNonStriker = batsmanNonStriker3;
        this.batsmanStriker = batsmanStriker3;
        this.bowler = bowler3;
        this.createdAt = str8;
        this.currentInning = str9;
        this.innings = list4;
        this.isBlocked = z;
        this.isDeleted = z2;
        this.isResult = z3;
        this.overNumber = i2;
        this.updatedAt = str10;
        this.playStatus = str11;
        this.result = result3;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final int get__v() {
        return this.__v;
    }

    public final List<Balls> getBalls() {
        return this.balls;
    }

    public final BatsmanNonStriker getBatsmanNonStriker() {
        return this.batsmanNonStriker;
    }

    public final BatsmanStriker getBatsmanStriker() {
        return this.batsmanStriker;
    }

    public final Bowler getBowler() {
        return this.bowler;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getCurrentInning() {
        return this.currentInning;
    }

    public final List<Innings> getInnings() {
        return this.innings;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final boolean isResult() {
        return this.isResult;
    }

    public final int getOverNumber() {
        return this.overNumber;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getPlayStatus() {
        return this.playStatus;
    }

    public final Result getResult() {
        return this.result;
    }
}
