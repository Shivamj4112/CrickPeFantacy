package com.crickpe.view.home.fragments.my_matches;

import com.crickpe.view.detail.fragments.my_matches_detail.Innings;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b(\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0015HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u001aHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\t\u00107\u001a\u00020\bHÆ\u0003J\t\u00108\u001a\u00020\nHÆ\u0003J\t\u00109\u001a\u00020\fHÆ\u0003J\u0019\u0010:\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\t\u0010<\u001a\u00020\u0015HÆ\u0003J¡\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0018\b\u0002\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u001aHÆ\u0001J\u0013\u0010>\u001a\u00020\u00152\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010@\u001a\u00020\u001aHÖ\u0001J\t\u0010A\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0019\u001a\u00020\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR!\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010+R\u0011\u0010\u0016\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010+R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001f¨\u0006B"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/my_matches/LivescoresInfo;", "", "_id", "", "matchId", "over_number", "", "batsmanStriker", "Lcom/crickpe/view/home/fragments/my_matches/BatsmanStriker;", "batsmanNonStriker", "Lcom/crickpe/view/home/fragments/my_matches/BatsmanNonStriker;", "bowler", "Lcom/crickpe/view/home/fragments/my_matches/Bowler;", "innings", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Innings;", "Lkotlin/collections/ArrayList;", "balls", "", "Lcom/crickpe/view/home/fragments/my_matches/Balls;", "isBlocked", "", "isDeleted", "createdAt", "updatedAt", "__v", "", "(Ljava/lang/String;Ljava/lang/String;FLcom/crickpe/view/home/fragments/my_matches/BatsmanStriker;Lcom/crickpe/view/home/fragments/my_matches/BatsmanNonStriker;Lcom/crickpe/view/home/fragments/my_matches/Bowler;Ljava/util/ArrayList;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getBalls", "()Ljava/util/List;", "getBatsmanNonStriker", "()Lcom/crickpe/view/home/fragments/my_matches/BatsmanNonStriker;", "getBatsmanStriker", "()Lcom/crickpe/view/home/fragments/my_matches/BatsmanStriker;", "getBowler", "()Lcom/crickpe/view/home/fragments/my_matches/Bowler;", "getCreatedAt", "getInnings", "()Ljava/util/ArrayList;", "()Z", "getMatchId", "getOver_number", "()F", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyMatchesModel.kt */
public final class LivescoresInfo {
    private final int __v;
    private final String _id;
    private final List<Balls> balls;
    private final BatsmanNonStriker batsmanNonStriker;
    private final BatsmanStriker batsmanStriker;
    private final Bowler bowler;
    private final String createdAt;
    private final ArrayList<Innings> innings;
    private final boolean isBlocked;
    private final boolean isDeleted;
    private final String matchId;
    private final float over_number;
    private final String updatedAt;

    public static /* synthetic */ LivescoresInfo copy$default(LivescoresInfo livescoresInfo, String str, String str2, float f, BatsmanStriker batsmanStriker2, BatsmanNonStriker batsmanNonStriker2, Bowler bowler2, ArrayList arrayList, List list, boolean z, boolean z2, String str3, String str4, int i, int i2, Object obj) {
        LivescoresInfo livescoresInfo2 = livescoresInfo;
        int i3 = i2;
        return livescoresInfo.copy((i3 & 1) != 0 ? livescoresInfo2._id : str, (i3 & 2) != 0 ? livescoresInfo2.matchId : str2, (i3 & 4) != 0 ? livescoresInfo2.over_number : f, (i3 & 8) != 0 ? livescoresInfo2.batsmanStriker : batsmanStriker2, (i3 & 16) != 0 ? livescoresInfo2.batsmanNonStriker : batsmanNonStriker2, (i3 & 32) != 0 ? livescoresInfo2.bowler : bowler2, (i3 & 64) != 0 ? livescoresInfo2.innings : arrayList, (i3 & 128) != 0 ? livescoresInfo2.balls : list, (i3 & 256) != 0 ? livescoresInfo2.isBlocked : z, (i3 & 512) != 0 ? livescoresInfo2.isDeleted : z2, (i3 & 1024) != 0 ? livescoresInfo2.createdAt : str3, (i3 & 2048) != 0 ? livescoresInfo2.updatedAt : str4, (i3 & 4096) != 0 ? livescoresInfo2.__v : i);
    }

    public final String component1() {
        return this._id;
    }

    public final boolean component10() {
        return this.isDeleted;
    }

    public final String component11() {
        return this.createdAt;
    }

    public final String component12() {
        return this.updatedAt;
    }

    public final int component13() {
        return this.__v;
    }

    public final String component2() {
        return this.matchId;
    }

    public final float component3() {
        return this.over_number;
    }

    public final BatsmanStriker component4() {
        return this.batsmanStriker;
    }

    public final BatsmanNonStriker component5() {
        return this.batsmanNonStriker;
    }

    public final Bowler component6() {
        return this.bowler;
    }

    public final ArrayList<Innings> component7() {
        return this.innings;
    }

    public final List<Balls> component8() {
        return this.balls;
    }

    public final boolean component9() {
        return this.isBlocked;
    }

    public final LivescoresInfo copy(String str, String str2, float f, BatsmanStriker batsmanStriker2, BatsmanNonStriker batsmanNonStriker2, Bowler bowler2, ArrayList<Innings> arrayList, List<Balls> list, boolean z, boolean z2, String str3, String str4, int i) {
        String str5 = str;
        Intrinsics.checkNotNullParameter(str5, "_id");
        String str6 = str2;
        Intrinsics.checkNotNullParameter(str6, "matchId");
        BatsmanStriker batsmanStriker3 = batsmanStriker2;
        Intrinsics.checkNotNullParameter(batsmanStriker3, "batsmanStriker");
        BatsmanNonStriker batsmanNonStriker3 = batsmanNonStriker2;
        Intrinsics.checkNotNullParameter(batsmanNonStriker3, "batsmanNonStriker");
        Bowler bowler3 = bowler2;
        Intrinsics.checkNotNullParameter(bowler3, "bowler");
        ArrayList<Innings> arrayList2 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList2, "innings");
        List<Balls> list2 = list;
        Intrinsics.checkNotNullParameter(list2, "balls");
        String str7 = str3;
        Intrinsics.checkNotNullParameter(str7, "createdAt");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "updatedAt");
        return new LivescoresInfo(str5, str6, f, batsmanStriker3, batsmanNonStriker3, bowler3, arrayList2, list2, z, z2, str7, str8, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LivescoresInfo)) {
            return false;
        }
        LivescoresInfo livescoresInfo = (LivescoresInfo) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) livescoresInfo._id) && Intrinsics.areEqual((Object) this.matchId, (Object) livescoresInfo.matchId) && Intrinsics.areEqual((Object) Float.valueOf(this.over_number), (Object) Float.valueOf(livescoresInfo.over_number)) && Intrinsics.areEqual((Object) this.batsmanStriker, (Object) livescoresInfo.batsmanStriker) && Intrinsics.areEqual((Object) this.batsmanNonStriker, (Object) livescoresInfo.batsmanNonStriker) && Intrinsics.areEqual((Object) this.bowler, (Object) livescoresInfo.bowler) && Intrinsics.areEqual((Object) this.innings, (Object) livescoresInfo.innings) && Intrinsics.areEqual((Object) this.balls, (Object) livescoresInfo.balls) && this.isBlocked == livescoresInfo.isBlocked && this.isDeleted == livescoresInfo.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) livescoresInfo.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) livescoresInfo.updatedAt) && this.__v == livescoresInfo.__v;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((this._id.hashCode() * 31) + this.matchId.hashCode()) * 31) + Float.floatToIntBits(this.over_number)) * 31) + this.batsmanStriker.hashCode()) * 31) + this.batsmanNonStriker.hashCode()) * 31) + this.bowler.hashCode()) * 31) + this.innings.hashCode()) * 31) + this.balls.hashCode()) * 31;
        boolean z = this.isBlocked;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isDeleted;
        if (!z3) {
            z2 = z3;
        }
        return ((((((i + (z2 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v;
    }

    public String toString() {
        return "LivescoresInfo(_id=" + this._id + ", matchId=" + this.matchId + ", over_number=" + this.over_number + ", batsmanStriker=" + this.batsmanStriker + ", batsmanNonStriker=" + this.batsmanNonStriker + ", bowler=" + this.bowler + ", innings=" + this.innings + ", balls=" + this.balls + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ')';
    }

    public LivescoresInfo(String str, String str2, float f, BatsmanStriker batsmanStriker2, BatsmanNonStriker batsmanNonStriker2, Bowler bowler2, ArrayList<Innings> arrayList, List<Balls> list, boolean z, boolean z2, String str3, String str4, int i) {
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(batsmanStriker2, "batsmanStriker");
        Intrinsics.checkNotNullParameter(batsmanNonStriker2, "batsmanNonStriker");
        Intrinsics.checkNotNullParameter(bowler2, "bowler");
        Intrinsics.checkNotNullParameter(arrayList, "innings");
        Intrinsics.checkNotNullParameter(list, "balls");
        Intrinsics.checkNotNullParameter(str3, "createdAt");
        Intrinsics.checkNotNullParameter(str4, "updatedAt");
        this._id = str;
        this.matchId = str2;
        this.over_number = f;
        this.batsmanStriker = batsmanStriker2;
        this.batsmanNonStriker = batsmanNonStriker2;
        this.bowler = bowler2;
        this.innings = arrayList;
        this.balls = list;
        this.isBlocked = z;
        this.isDeleted = z2;
        this.createdAt = str3;
        this.updatedAt = str4;
        this.__v = i;
    }

    public final String get_id() {
        return this._id;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final float getOver_number() {
        return this.over_number;
    }

    public final BatsmanStriker getBatsmanStriker() {
        return this.batsmanStriker;
    }

    public final BatsmanNonStriker getBatsmanNonStriker() {
        return this.batsmanNonStriker;
    }

    public final Bowler getBowler() {
        return this.bowler;
    }

    public final ArrayList<Innings> getInnings() {
        return this.innings;
    }

    public final List<Balls> getBalls() {
        return this.balls;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final boolean isDeleted() {
        return this.isDeleted;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int get__v() {
        return this.__v;
    }
}
