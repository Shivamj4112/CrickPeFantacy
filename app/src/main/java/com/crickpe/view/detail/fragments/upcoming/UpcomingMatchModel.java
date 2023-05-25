package com.crickpe.view.detail.fragments.upcoming;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.crickpe.view.home.fragments.home.Team1;
import com.crickpe.view.home.fragments.home.Team2;
import com.crickpe.view.home.fragments.home.Venue;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÑ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000e\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010#J\t\u0010K\u001a\u00020\nHÖ\u0001J\u0019\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\nHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0016\u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R \u0010\"\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\u0016\u0010\u0011\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010*R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010%R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010*R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0016\u0010\u001d\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010*R\u0016\u0010\u001e\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010*R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010%R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u0010%R\u001e\u0010\u001c\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010%R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\n\n\u0002\u0010>\u001a\u0004\b<\u0010=R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010%R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010%R\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010J¨\u0006Q"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/upcoming/UpcomingMatchModel;", "Landroid/os/Parcelable;", "_id", "", "key", "title", "customMatchName", "name", "shortName", "matchStartLocalTime", "", "estimatedEndDate", "status", "startAtIST", "", "winningPercentage", "", "gender", "format", "playStatus", "venue", "Lcom/crickpe/view/home/fragments/home/Venue;", "team1", "Lcom/crickpe/view/home/fragments/home/Team1;", "team2", "Lcom/crickpe/view/home/fragments/home/Team2;", "megaPrize", "", "remainingTime", "myContestCount", "myFantasyTeamCount", "vipList", "", "Lcom/crickpe/view/detail/fragments/upcoming/VipList;", "from", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Long;FILjava/lang/String;Ljava/lang/String;Lcom/crickpe/view/home/fragments/home/Venue;Lcom/crickpe/view/home/fragments/home/Team1;Lcom/crickpe/view/home/fragments/home/Team2;DJIILjava/util/List;Ljava/lang/String;)V", "get_id", "()Ljava/lang/String;", "set_id", "(Ljava/lang/String;)V", "getCustomMatchName", "getEstimatedEndDate", "()I", "getFormat", "getFrom", "setFrom", "getGender", "getKey", "getMatchStartLocalTime", "getMegaPrize", "()D", "getMyContestCount", "getMyFantasyTeamCount", "getName", "getPlayStatus", "getRemainingTime", "()J", "setRemainingTime", "(J)V", "getShortName", "getStartAtIST", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getStatus", "getTeam1", "()Lcom/crickpe/view/home/fragments/home/Team1;", "getTeam2", "()Lcom/crickpe/view/home/fragments/home/Team2;", "getTitle", "getVenue", "()Lcom/crickpe/view/home/fragments/home/Venue;", "getVipList", "()Ljava/util/List;", "getWinningPercentage", "()F", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: UpcomingMatchModel.kt */
public final class UpcomingMatchModel implements Parcelable {
    public static final Parcelable.Creator<UpcomingMatchModel> CREATOR = new Creator();
    @SerializedName("_id")
    private String _id;
    @SerializedName("customMatchName")
    private final String customMatchName;
    @SerializedName("estimatedEndDate")
    private final int estimatedEndDate;
    @SerializedName("format")
    private final String format;
    @SerializedName("from")
    private String from;
    @SerializedName("gender")
    private final int gender;
    @SerializedName("key")
    private final String key;
    @SerializedName("matchStartLocalTime")
    private final int matchStartLocalTime;
    @SerializedName("megaPrize")
    private final double megaPrize;
    @SerializedName("myContestCount")
    private final int myContestCount;
    @SerializedName("myFantasyTeamCount")
    private final int myFantasyTeamCount;
    @SerializedName("name")
    private final String name;
    @SerializedName("playStatus")
    private final String playStatus;
    @SerializedName("remainingTime")
    private long remainingTime;
    @SerializedName("shortName")
    private final String shortName;
    @SerializedName("startAtIST")
    private final Long startAtIST;
    @SerializedName("status")
    private final String status;
    @SerializedName("team1")
    private final Team1 team1;
    @SerializedName("team2")
    private final Team2 team2;
    @SerializedName("title")
    private final String title;
    @SerializedName("venue")
    private final Venue venue;
    @SerializedName("vipList")
    private final List<VipList> vipList;
    @SerializedName("winningPercentage")
    private final float winningPercentage;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: UpcomingMatchModel.kt */
    public static final class Creator implements Parcelable.Creator<UpcomingMatchModel> {
        public final UpcomingMatchModel createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString7 = parcel.readString();
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            float readFloat = parcel.readFloat();
            int readInt3 = parcel.readInt();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            Venue createFromParcel = Venue.CREATOR.createFromParcel(parcel2);
            Team1 createFromParcel2 = Team1.CREATOR.createFromParcel(parcel2);
            Team2 createFromParcel3 = Team2.CREATOR.createFromParcel(parcel2);
            double readDouble = parcel.readDouble();
            long readLong = parcel.readLong();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt6);
            String str = readString8;
            int i = 0;
            while (i != readInt6) {
                arrayList.add(VipList.CREATOR.createFromParcel(parcel2));
                i++;
                readInt6 = readInt6;
            }
            return new UpcomingMatchModel(readString, readString2, readString3, readString4, readString5, readString6, readInt, readInt2, readString7, valueOf, readFloat, readInt3, str, readString9, createFromParcel, createFromParcel2, createFromParcel3, readDouble, readLong, readInt4, readInt5, arrayList, parcel.readString());
        }

        public final UpcomingMatchModel[] newArray(int i) {
            return new UpcomingMatchModel[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        parcel.writeString(this.customMatchName);
        parcel.writeString(this.name);
        parcel.writeString(this.shortName);
        parcel.writeInt(this.matchStartLocalTime);
        parcel.writeInt(this.estimatedEndDate);
        parcel.writeString(this.status);
        Long l = this.startAtIST;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeFloat(this.winningPercentage);
        parcel.writeInt(this.gender);
        parcel.writeString(this.format);
        parcel.writeString(this.playStatus);
        this.venue.writeToParcel(parcel, i);
        this.team1.writeToParcel(parcel, i);
        this.team2.writeToParcel(parcel, i);
        parcel.writeDouble(this.megaPrize);
        parcel.writeLong(this.remainingTime);
        parcel.writeInt(this.myContestCount);
        parcel.writeInt(this.myFantasyTeamCount);
        List<VipList> list = this.vipList;
        parcel.writeInt(list.size());
        for (VipList writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.from);
    }

    public UpcomingMatchModel(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, String str7, Long l, float f, int i3, String str8, String str9, Venue venue2, Team1 team12, Team2 team22, double d, long j, int i4, int i5, List<VipList> list, String str10) {
        String str11 = str2;
        String str12 = str3;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        String str17 = str9;
        Venue venue3 = venue2;
        Team1 team13 = team12;
        Team2 team23 = team22;
        List<VipList> list2 = list;
        Intrinsics.checkNotNullParameter(str, "_id");
        Intrinsics.checkNotNullParameter(str11, "key");
        Intrinsics.checkNotNullParameter(str12, "title");
        Intrinsics.checkNotNullParameter(str13, "name");
        Intrinsics.checkNotNullParameter(str14, "shortName");
        Intrinsics.checkNotNullParameter(str15, NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkNotNullParameter(str16, "format");
        Intrinsics.checkNotNullParameter(str17, "playStatus");
        Intrinsics.checkNotNullParameter(venue3, "venue");
        Intrinsics.checkNotNullParameter(team13, "team1");
        Intrinsics.checkNotNullParameter(team23, "team2");
        Intrinsics.checkNotNullParameter(list2, "vipList");
        this._id = str;
        this.key = str11;
        this.title = str12;
        this.customMatchName = str4;
        this.name = str13;
        this.shortName = str14;
        this.matchStartLocalTime = i;
        this.estimatedEndDate = i2;
        this.status = str15;
        this.startAtIST = l;
        this.winningPercentage = f;
        this.gender = i3;
        this.format = str16;
        this.playStatus = str17;
        this.venue = venue3;
        this.team1 = team13;
        this.team2 = team23;
        this.megaPrize = d;
        this.remainingTime = j;
        this.myContestCount = i4;
        this.myFantasyTeamCount = i5;
        this.vipList = list2;
        this.from = str10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UpcomingMatchModel(String r30, String r31, String r32, String r33, String r34, String r35, int r36, int r37, String r38, Long r39, float r40, int r41, String r42, String r43, Venue r44, Team1 r45, Team2 r46, double r47, long r49, int r51, int r52, List r53, String r54, int r55, kotlin.jvm.internal.DefaultConstructorMarker r56) {
        /*
            r29 = this;
            r0 = r55
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r7 = r2
            goto L_0x000b
        L_0x0009:
            r7 = r33
        L_0x000b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0011
            r13 = r2
            goto L_0x0013
        L_0x0011:
            r13 = r39
        L_0x0013:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0020
            r3 = 1677899586306(0x186aa9bdb02, double:8.28992542765E-312)
            r23 = r3
            goto L_0x0022
        L_0x0020:
            r23 = r49
        L_0x0022:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x002a
            r28 = r2
            goto L_0x002c
        L_0x002a:
            r28 = r54
        L_0x002c:
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r8 = r34
            r9 = r35
            r10 = r36
            r11 = r37
            r12 = r38
            r14 = r40
            r15 = r41
            r16 = r42
            r17 = r43
            r18 = r44
            r19 = r45
            r20 = r46
            r21 = r47
            r25 = r51
            r26 = r52
            r27 = r53
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r23, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.upcoming.UpcomingMatchModel.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.Long, float, int, java.lang.String, java.lang.String, com.crickpe.view.home.fragments.home.Venue, com.crickpe.view.home.fragments.home.Team1, com.crickpe.view.home.fragments.home.Team2, double, long, int, int, java.util.List, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String get_id() {
        return this._id;
    }

    public final void set_id(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this._id = str;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getCustomMatchName() {
        return this.customMatchName;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final int getMatchStartLocalTime() {
        return this.matchStartLocalTime;
    }

    public final int getEstimatedEndDate() {
        return this.estimatedEndDate;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Long getStartAtIST() {
        return this.startAtIST;
    }

    public final float getWinningPercentage() {
        return this.winningPercentage;
    }

    public final int getGender() {
        return this.gender;
    }

    public final String getFormat() {
        return this.format;
    }

    public final String getPlayStatus() {
        return this.playStatus;
    }

    public final Venue getVenue() {
        return this.venue;
    }

    public final Team1 getTeam1() {
        return this.team1;
    }

    public final Team2 getTeam2() {
        return this.team2;
    }

    public final double getMegaPrize() {
        return this.megaPrize;
    }

    public final long getRemainingTime() {
        return this.remainingTime;
    }

    public final void setRemainingTime(long j) {
        this.remainingTime = j;
    }

    public final int getMyContestCount() {
        return this.myContestCount;
    }

    public final int getMyFantasyTeamCount() {
        return this.myFantasyTeamCount;
    }

    public final List<VipList> getVipList() {
        return this.vipList;
    }

    public final String getFrom() {
        return this.from;
    }

    public final void setFrom(String str) {
        this.from = str;
    }
}
