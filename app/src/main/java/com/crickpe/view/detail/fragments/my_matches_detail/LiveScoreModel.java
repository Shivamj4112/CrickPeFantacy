package com.crickpe.view.detail.fragments.my_matches_detail;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b,\b\b\u0018\u00002\u00020\u0001B­\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012\u0012\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0010j\b\u0012\u0004\u0012\u00020\u0014`\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u00106\u001a\u00020\u0017HÆ\u0003J\t\u00107\u001a\u00020\u0017HÆ\u0003J\t\u00108\u001a\u00020\u000bHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\t\u0010:\u001a\u00020\u001cHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010=\u001a\u00020\tHÆ\u0003J\t\u0010>\u001a\u00020\u000bHÆ\u0003J\t\u0010?\u001a\u00020\u000bHÆ\u0003J\t\u0010@\u001a\u00020\u000eHÆ\u0003J\u0019\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012HÆ\u0003J\u0019\u0010B\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0010j\b\u0012\u0004\u0012\u00020\u0014`\u0012HÆ\u0003JÇ\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\u0018\b\u0002\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0010j\b\u0012\u0004\u0012\u00020\u0014`\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u001cHÆ\u0001J\u0013\u0010D\u001a\u00020\u00172\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u001cHÖ\u0001J\t\u0010G\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R!\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0010j\b\u0012\u0004\u0012\u00020\u0014`\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0019\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010!R!\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010,R\u0011\u0010\u0018\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010,R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b-\u0010!R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u001a\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!¨\u0006H"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/my_matches_detail/LiveScoreModel;", "", "result", "Lcom/crickpe/view/detail/fragments/my_matches_detail/ResultData;", "batsmanStriker", "Lcom/crickpe/view/detail/fragments/my_matches_detail/BatsmanStriker;", "batsmanNonStriker", "Lcom/crickpe/view/detail/fragments/my_matches_detail/BatsmanNonStriker;", "bowler", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Bowler;", "_id", "", "matchId", "over_number", "", "innings", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Innings;", "Lkotlin/collections/ArrayList;", "balls", "Lcom/crickpe/view/detail/fragments/my_matches_detail/Balls;", "playStatus", "isBlocked", "", "isDeleted", "createdAt", "updatedAt", "__v", "", "(Lcom/crickpe/view/detail/fragments/my_matches_detail/ResultData;Lcom/crickpe/view/detail/fragments/my_matches_detail/BatsmanStriker;Lcom/crickpe/view/detail/fragments/my_matches_detail/BatsmanNonStriker;Lcom/crickpe/view/detail/fragments/my_matches_detail/Bowler;Ljava/lang/String;Ljava/lang/String;FLjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;I)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getBalls", "()Ljava/util/ArrayList;", "getBatsmanNonStriker", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/BatsmanNonStriker;", "getBatsmanStriker", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/BatsmanStriker;", "getBowler", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/Bowler;", "getCreatedAt", "getInnings", "()Z", "getMatchId", "getOver_number", "()F", "getPlayStatus", "getResult", "()Lcom/crickpe/view/detail/fragments/my_matches_detail/ResultData;", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LiveScoreModel.kt */
public final class LiveScoreModel {
    private final int __v;
    private final String _id;
    private final ArrayList<Balls> balls;
    private final BatsmanNonStriker batsmanNonStriker;
    private final BatsmanStriker batsmanStriker;
    private final Bowler bowler;
    private final String createdAt;
    private final ArrayList<Innings> innings;
    private final boolean isBlocked;
    private final boolean isDeleted;
    private final String matchId;
    private final float over_number;
    private final String playStatus;
    private final ResultData result;
    private final String updatedAt;

    public static /* synthetic */ LiveScoreModel copy$default(LiveScoreModel liveScoreModel, ResultData resultData, BatsmanStriker batsmanStriker2, BatsmanNonStriker batsmanNonStriker2, Bowler bowler2, String str, String str2, float f, ArrayList arrayList, ArrayList arrayList2, String str3, boolean z, boolean z2, String str4, String str5, int i, int i2, Object obj) {
        LiveScoreModel liveScoreModel2 = liveScoreModel;
        int i3 = i2;
        return liveScoreModel.copy((i3 & 1) != 0 ? liveScoreModel2.result : resultData, (i3 & 2) != 0 ? liveScoreModel2.batsmanStriker : batsmanStriker2, (i3 & 4) != 0 ? liveScoreModel2.batsmanNonStriker : batsmanNonStriker2, (i3 & 8) != 0 ? liveScoreModel2.bowler : bowler2, (i3 & 16) != 0 ? liveScoreModel2._id : str, (i3 & 32) != 0 ? liveScoreModel2.matchId : str2, (i3 & 64) != 0 ? liveScoreModel2.over_number : f, (i3 & 128) != 0 ? liveScoreModel2.innings : arrayList, (i3 & 256) != 0 ? liveScoreModel2.balls : arrayList2, (i3 & 512) != 0 ? liveScoreModel2.playStatus : str3, (i3 & 1024) != 0 ? liveScoreModel2.isBlocked : z, (i3 & 2048) != 0 ? liveScoreModel2.isDeleted : z2, (i3 & 4096) != 0 ? liveScoreModel2.createdAt : str4, (i3 & 8192) != 0 ? liveScoreModel2.updatedAt : str5, (i3 & 16384) != 0 ? liveScoreModel2.__v : i);
    }

    public final ResultData component1() {
        return this.result;
    }

    public final String component10() {
        return this.playStatus;
    }

    public final boolean component11() {
        return this.isBlocked;
    }

    public final boolean component12() {
        return this.isDeleted;
    }

    public final String component13() {
        return this.createdAt;
    }

    public final String component14() {
        return this.updatedAt;
    }

    public final int component15() {
        return this.__v;
    }

    public final BatsmanStriker component2() {
        return this.batsmanStriker;
    }

    public final BatsmanNonStriker component3() {
        return this.batsmanNonStriker;
    }

    public final Bowler component4() {
        return this.bowler;
    }

    public final String component5() {
        return this._id;
    }

    public final String component6() {
        return this.matchId;
    }

    public final float component7() {
        return this.over_number;
    }

    public final ArrayList<Innings> component8() {
        return this.innings;
    }

    public final ArrayList<Balls> component9() {
        return this.balls;
    }

    public final LiveScoreModel copy(ResultData resultData, BatsmanStriker batsmanStriker2, BatsmanNonStriker batsmanNonStriker2, Bowler bowler2, String str, String str2, float f, ArrayList<Innings> arrayList, ArrayList<Balls> arrayList2, String str3, boolean z, boolean z2, String str4, String str5, int i) {
        Bowler bowler3 = bowler2;
        Intrinsics.checkNotNullParameter(bowler3, "bowler");
        String str6 = str;
        Intrinsics.checkNotNullParameter(str6, "_id");
        String str7 = str2;
        Intrinsics.checkNotNullParameter(str7, "matchId");
        ArrayList<Innings> arrayList3 = arrayList;
        Intrinsics.checkNotNullParameter(arrayList3, "innings");
        ArrayList<Balls> arrayList4 = arrayList2;
        Intrinsics.checkNotNullParameter(arrayList4, "balls");
        String str8 = str4;
        Intrinsics.checkNotNullParameter(str8, "createdAt");
        String str9 = str5;
        Intrinsics.checkNotNullParameter(str9, "updatedAt");
        return new LiveScoreModel(resultData, batsmanStriker2, batsmanNonStriker2, bowler3, str6, str7, f, arrayList3, arrayList4, str3, z, z2, str8, str9, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LiveScoreModel)) {
            return false;
        }
        LiveScoreModel liveScoreModel = (LiveScoreModel) obj;
        return Intrinsics.areEqual((Object) this.result, (Object) liveScoreModel.result) && Intrinsics.areEqual((Object) this.batsmanStriker, (Object) liveScoreModel.batsmanStriker) && Intrinsics.areEqual((Object) this.batsmanNonStriker, (Object) liveScoreModel.batsmanNonStriker) && Intrinsics.areEqual((Object) this.bowler, (Object) liveScoreModel.bowler) && Intrinsics.areEqual((Object) this._id, (Object) liveScoreModel._id) && Intrinsics.areEqual((Object) this.matchId, (Object) liveScoreModel.matchId) && Intrinsics.areEqual((Object) Float.valueOf(this.over_number), (Object) Float.valueOf(liveScoreModel.over_number)) && Intrinsics.areEqual((Object) this.innings, (Object) liveScoreModel.innings) && Intrinsics.areEqual((Object) this.balls, (Object) liveScoreModel.balls) && Intrinsics.areEqual((Object) this.playStatus, (Object) liveScoreModel.playStatus) && this.isBlocked == liveScoreModel.isBlocked && this.isDeleted == liveScoreModel.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) liveScoreModel.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) liveScoreModel.updatedAt) && this.__v == liveScoreModel.__v;
    }

    public int hashCode() {
        ResultData resultData = this.result;
        int i = 0;
        int hashCode = (resultData == null ? 0 : resultData.hashCode()) * 31;
        BatsmanStriker batsmanStriker2 = this.batsmanStriker;
        int hashCode2 = (hashCode + (batsmanStriker2 == null ? 0 : batsmanStriker2.hashCode())) * 31;
        BatsmanNonStriker batsmanNonStriker2 = this.batsmanNonStriker;
        int hashCode3 = (((((((((((((hashCode2 + (batsmanNonStriker2 == null ? 0 : batsmanNonStriker2.hashCode())) * 31) + this.bowler.hashCode()) * 31) + this._id.hashCode()) * 31) + this.matchId.hashCode()) * 31) + Float.floatToIntBits(this.over_number)) * 31) + this.innings.hashCode()) * 31) + this.balls.hashCode()) * 31;
        String str = this.playStatus;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (hashCode3 + i) * 31;
        boolean z = this.isBlocked;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isDeleted;
        if (!z3) {
            z2 = z3;
        }
        return ((((((i3 + (z2 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v;
    }

    public String toString() {
        return "LiveScoreModel(result=" + this.result + ", batsmanStriker=" + this.batsmanStriker + ", batsmanNonStriker=" + this.batsmanNonStriker + ", bowler=" + this.bowler + ", _id=" + this._id + ", matchId=" + this.matchId + ", over_number=" + this.over_number + ", innings=" + this.innings + ", balls=" + this.balls + ", playStatus=" + this.playStatus + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ')';
    }

    public LiveScoreModel(ResultData resultData, BatsmanStriker batsmanStriker2, BatsmanNonStriker batsmanNonStriker2, Bowler bowler2, String str, String str2, float f, ArrayList<Innings> arrayList, ArrayList<Balls> arrayList2, String str3, boolean z, boolean z2, String str4, String str5, int i) {
        ArrayList<Innings> arrayList3 = arrayList;
        ArrayList<Balls> arrayList4 = arrayList2;
        String str6 = str4;
        String str7 = str5;
        Intrinsics.checkNotNullParameter(bowler2, "bowler");
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str2, "matchId");
        Intrinsics.checkNotNullParameter(arrayList3, "innings");
        Intrinsics.checkNotNullParameter(arrayList4, "balls");
        Intrinsics.checkNotNullParameter(str6, "createdAt");
        Intrinsics.checkNotNullParameter(str7, "updatedAt");
        this.result = resultData;
        this.batsmanStriker = batsmanStriker2;
        this.batsmanNonStriker = batsmanNonStriker2;
        this.bowler = bowler2;
        this._id = str;
        this.matchId = str2;
        this.over_number = f;
        this.innings = arrayList3;
        this.balls = arrayList4;
        this.playStatus = str3;
        this.isBlocked = z;
        this.isDeleted = z2;
        this.createdAt = str6;
        this.updatedAt = str7;
        this.__v = i;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ LiveScoreModel(ResultData r20, BatsmanStriker r21, BatsmanNonStriker r22, Bowler r23, String r24, String r25, float r26, ArrayList r27, ArrayList r28, String r29, boolean r30, boolean r31, String r32, String r33, int r34, int r35, kotlin.jvm.internal.DefaultConstructorMarker r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r20
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r21
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r22
        L_0x001b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0021
            r13 = r2
            goto L_0x0023
        L_0x0021:
            r13 = r29
        L_0x0023:
            r3 = r19
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r14 = r30
            r15 = r31
            r16 = r32
            r17 = r33
            r18 = r34
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.my_matches_detail.LiveScoreModel.<init>(com.crickpe.view.detail.fragments.my_matches_detail.ResultData, com.crickpe.view.detail.fragments.my_matches_detail.BatsmanStriker, com.crickpe.view.detail.fragments.my_matches_detail.BatsmanNonStriker, com.crickpe.view.detail.fragments.my_matches_detail.Bowler, java.lang.String, java.lang.String, float, java.util.ArrayList, java.util.ArrayList, java.lang.String, boolean, boolean, java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ResultData getResult() {
        return this.result;
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

    public final String get_id() {
        return this._id;
    }

    public final String getMatchId() {
        return this.matchId;
    }

    public final float getOver_number() {
        return this.over_number;
    }

    public final ArrayList<Innings> getInnings() {
        return this.innings;
    }

    public final ArrayList<Balls> getBalls() {
        return this.balls;
    }

    public final String getPlayStatus() {
        return this.playStatus;
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
