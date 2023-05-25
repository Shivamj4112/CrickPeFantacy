package com.crickpe.view.detail.fragments.create_own_team.join_contest;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.crickpe.utils.recycler.AbstractModel;
import com.crickpe.view.detail.fragments.contest_winners.models.model.Match$$ExternalSyntheticBackport0;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\bE\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002Bñ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010#\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020\u0004\u0012\u0006\u0010%\u001a\u00020\u0004\u0012\u0006\u0010&\u001a\u00020\n\u0012\u0006\u0010'\u001a\u00020\n\u0012\u0006\u0010(\u001a\u00020\n\u0012\u0006\u0010)\u001a\u00020*¢\u0006\u0002\u0010+J\t\u0010P\u001a\u00020\u0004HÆ\u0003J\t\u0010Q\u001a\u00020\u0004HÆ\u0003J\t\u0010R\u001a\u00020\u0010HÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012HÆ\u0003J\t\u0010T\u001a\u00020\u0004HÆ\u0003J\t\u0010U\u001a\u00020\u0015HÆ\u0003J\t\u0010V\u001a\u00020\u0017HÆ\u0003J\t\u0010W\u001a\u00020\u0019HÆ\u0003J\t\u0010X\u001a\u00020\u001bHÆ\u0003J\t\u0010Y\u001a\u00020\u001dHÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0012HÆ\u0003J\t\u0010[\u001a\u00020\u0004HÆ\u0003J\t\u0010\\\u001a\u00020!HÆ\u0003J\t\u0010]\u001a\u00020!HÆ\u0003J\t\u0010^\u001a\u00020!HÆ\u0003J\t\u0010_\u001a\u00020\u0004HÆ\u0003J\t\u0010`\u001a\u00020\u0004HÆ\u0003J\t\u0010a\u001a\u00020\nHÆ\u0003J\t\u0010b\u001a\u00020\nHÆ\u0003J\t\u0010c\u001a\u00020\nHÆ\u0003J\t\u0010d\u001a\u00020*HÆ\u0003J\t\u0010e\u001a\u00020\u0004HÆ\u0003J\t\u0010f\u001a\u00020\u0004HÆ\u0003J\t\u0010g\u001a\u00020\u0004HÆ\u0003J\t\u0010h\u001a\u00020\nHÆ\u0003J\t\u0010i\u001a\u00020\u0004HÆ\u0003J\t\u0010j\u001a\u00020\nHÆ\u0003J\t\u0010k\u001a\u00020\u0004HÆ\u0003J­\u0002\u0010l\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00122\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020\u00042\b\b\u0002\u0010%\u001a\u00020\u00042\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010(\u001a\u00020\n2\b\b\u0002\u0010)\u001a\u00020*HÆ\u0001J\t\u0010m\u001a\u00020\nHÖ\u0001J\u0013\u0010n\u001a\u00020!2\b\u0010o\u001a\u0004\u0018\u00010pHÖ\u0003J\t\u0010q\u001a\u00020\nHÖ\u0001J\t\u0010r\u001a\u00020\u0004HÖ\u0001J\u0019\u0010s\u001a\u00020t2\u0006\u0010u\u001a\u00020v2\u0006\u0010w\u001a\u00020\nHÖ\u0001R\u0016\u0010&\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0016\u0010$\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010/R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010-R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u0010/R\u0016\u0010\f\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u0010-R\u0016\u0010\"\u001a\u00020!8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u00106R\u0016\u0010#\u001a\u00020!8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u00106R\u0016\u0010 \u001a\u00020!8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u00106R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010/R\u0016\u0010(\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b8\u0010-R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010/R\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u0010/R\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u0010;R\u0016\u0010'\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010-R\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010/R\u0016\u0010)\u001a\u00020*8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bB\u0010/R\u0016\u0010\u001a\u001a\u00020\u001b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0016\u0010\u001c\u001a\u00020\u001d8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010/R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0016\u0010%\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u0010/R\u0016\u0010\u0018\u001a\u00020\u00198\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0016\u0010\u0013\u001a\u00020\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010/¨\u0006x"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Match;", "Lcom/crickpe/utils/recycler/AbstractModel;", "Landroid/os/Parcelable;", "_id", "", "key", "title", "name", "shortName", "estimatedEndDate", "", "status", "gender", "format", "playStatus", "toss", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Toss;", "notes", "", "weather", "tournament", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Tournament;", "association", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Association;", "venue", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Venue;", "team1", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Team1;", "team2", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Team2;", "players", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Players;", "isPublic", "", "isBlocked", "isDeleted", "createdAt", "updatedAt", "__v", "publishStatus", "matchStatus", "startAtIST", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Toss;Ljava/util/List;Ljava/lang/String;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Tournament;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Association;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Venue;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Team1;Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Team2;Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;IIIJ)V", "get__v", "()I", "get_id", "()Ljava/lang/String;", "getAssociation", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Association;", "getCreatedAt", "getEstimatedEndDate", "getFormat", "getGender", "()Z", "getKey", "getMatchStatus", "getName", "getNotes", "()Ljava/util/List;", "getPlayStatus", "getPlayers", "getPublishStatus", "getShortName", "getStartAtIST", "()J", "getStatus", "getTeam1", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Team1;", "getTeam2", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Team2;", "getTitle", "getToss", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Toss;", "getTournament", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Tournament;", "getUpdatedAt", "getVenue", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Venue;", "getWeather", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ContestDetailModel.kt */
public final class Match extends AbstractModel implements Parcelable {
    public static final Parcelable.Creator<Match> CREATOR = new Creator();
    @SerializedName("__v")
    private final int __v;
    @SerializedName("_id")
    private final String _id;
    @SerializedName("association")
    private final Association association;
    @SerializedName("createdAt")
    private final String createdAt;
    @SerializedName("estimatedEndDate")
    private final int estimatedEndDate;
    @SerializedName("format")
    private final String format;
    @SerializedName("gender")
    private final int gender;
    @SerializedName("isBlocked")
    private final boolean isBlocked;
    @SerializedName("isDeleted")
    private final boolean isDeleted;
    @SerializedName("isPublic")
    private final boolean isPublic;
    @SerializedName("key")
    private final String key;
    @SerializedName("matchStatus")
    private final int matchStatus;
    @SerializedName("name")
    private final String name;
    @SerializedName("notes")
    private final List<String> notes;
    @SerializedName("playStatus")
    private final String playStatus;
    @SerializedName("players")
    private final List<Players> players;
    @SerializedName("publishStatus")
    private final int publishStatus;
    @SerializedName("shortName")
    private final String shortName;
    @SerializedName("startAtIST")
    private final long startAtIST;
    @SerializedName("status")
    private final String status;
    @SerializedName("team1")
    private final Team1 team1;
    @SerializedName("team2")
    private final Team2 team2;
    @SerializedName("title")
    private final String title;
    @SerializedName("toss")
    private final Toss toss;
    @SerializedName("tournament")
    private final Tournament tournament;
    @SerializedName("updatedAt")
    private final String updatedAt;
    @SerializedName("venue")
    private final Venue venue;
    @SerializedName("weather")
    private final String weather;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ContestDetailModel.kt */
    public static final class Creator implements Parcelable.Creator<Match> {
        public final Match createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            Intrinsics.checkNotNullParameter(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            Toss createFromParcel = Toss.CREATOR.createFromParcel(parcel2);
            List createStringArrayList = parcel.createStringArrayList();
            String readString9 = parcel.readString();
            Tournament createFromParcel2 = Tournament.CREATOR.createFromParcel(parcel2);
            Association createFromParcel3 = Association.CREATOR.createFromParcel(parcel2);
            Venue createFromParcel4 = Venue.CREATOR.createFromParcel(parcel2);
            Team1 createFromParcel5 = Team1.CREATOR.createFromParcel(parcel2);
            Team2 createFromParcel6 = Team2.CREATOR.createFromParcel(parcel2);
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            String str = readString9;
            int i = 0;
            while (i != readInt3) {
                arrayList.add(Players.CREATOR.createFromParcel(parcel2));
                i++;
                readInt3 = readInt3;
            }
            return new Match(readString, readString2, readString3, readString4, readString5, readInt, readString6, readInt2, readString7, readString8, createFromParcel, createStringArrayList, str, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, arrayList, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readLong());
        }

        public final Match[] newArray(int i) {
            return new Match[i];
        }
    }

    public static /* synthetic */ Match copy$default(Match match, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, String str7, String str8, Toss toss2, List list, String str9, Tournament tournament2, Association association2, Venue venue2, Team1 team12, Team2 team22, List list2, boolean z, boolean z2, boolean z3, String str10, String str11, int i3, int i4, int i5, long j, int i6, Object obj) {
        Match match2 = match;
        int i7 = i6;
        return match.copy((i7 & 1) != 0 ? match2._id : str, (i7 & 2) != 0 ? match2.key : str2, (i7 & 4) != 0 ? match2.title : str3, (i7 & 8) != 0 ? match2.name : str4, (i7 & 16) != 0 ? match2.shortName : str5, (i7 & 32) != 0 ? match2.estimatedEndDate : i, (i7 & 64) != 0 ? match2.status : str6, (i7 & 128) != 0 ? match2.gender : i2, (i7 & 256) != 0 ? match2.format : str7, (i7 & 512) != 0 ? match2.playStatus : str8, (i7 & 1024) != 0 ? match2.toss : toss2, (i7 & 2048) != 0 ? match2.notes : list, (i7 & 4096) != 0 ? match2.weather : str9, (i7 & 8192) != 0 ? match2.tournament : tournament2, (i7 & 16384) != 0 ? match2.association : association2, (i7 & 32768) != 0 ? match2.venue : venue2, (i7 & 65536) != 0 ? match2.team1 : team12, (i7 & 131072) != 0 ? match2.team2 : team22, (i7 & 262144) != 0 ? match2.players : list2, (i7 & 524288) != 0 ? match2.isPublic : z, (i7 & 1048576) != 0 ? match2.isBlocked : z2, (i7 & 2097152) != 0 ? match2.isDeleted : z3, (i7 & 4194304) != 0 ? match2.createdAt : str10, (i7 & 8388608) != 0 ? match2.updatedAt : str11, (i7 & 16777216) != 0 ? match2.__v : i3, (i7 & 33554432) != 0 ? match2.publishStatus : i4, (i7 & 67108864) != 0 ? match2.matchStatus : i5, (i7 & 134217728) != 0 ? match2.startAtIST : j);
    }

    public final String component1() {
        return this._id;
    }

    public final String component10() {
        return this.playStatus;
    }

    public final Toss component11() {
        return this.toss;
    }

    public final List<String> component12() {
        return this.notes;
    }

    public final String component13() {
        return this.weather;
    }

    public final Tournament component14() {
        return this.tournament;
    }

    public final Association component15() {
        return this.association;
    }

    public final Venue component16() {
        return this.venue;
    }

    public final Team1 component17() {
        return this.team1;
    }

    public final Team2 component18() {
        return this.team2;
    }

    public final List<Players> component19() {
        return this.players;
    }

    public final String component2() {
        return this.key;
    }

    public final boolean component20() {
        return this.isPublic;
    }

    public final boolean component21() {
        return this.isBlocked;
    }

    public final boolean component22() {
        return this.isDeleted;
    }

    public final String component23() {
        return this.createdAt;
    }

    public final String component24() {
        return this.updatedAt;
    }

    public final int component25() {
        return this.__v;
    }

    public final int component26() {
        return this.publishStatus;
    }

    public final int component27() {
        return this.matchStatus;
    }

    public final long component28() {
        return this.startAtIST;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.shortName;
    }

    public final int component6() {
        return this.estimatedEndDate;
    }

    public final String component7() {
        return this.status;
    }

    public final int component8() {
        return this.gender;
    }

    public final String component9() {
        return this.format;
    }

    public final Match copy(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, String str7, String str8, Toss toss2, List<String> list, String str9, Tournament tournament2, Association association2, Venue venue2, Team1 team12, Team2 team22, List<Players> list2, boolean z, boolean z2, boolean z3, String str10, String str11, int i3, int i4, int i5, long j) {
        String str12 = str;
        Intrinsics.checkNotNullParameter(str12, "_id");
        Intrinsics.checkNotNullParameter(str2, "key");
        Intrinsics.checkNotNullParameter(str3, "title");
        Intrinsics.checkNotNullParameter(str4, "name");
        Intrinsics.checkNotNullParameter(str5, "shortName");
        Intrinsics.checkNotNullParameter(str6, NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkNotNullParameter(str7, "format");
        Intrinsics.checkNotNullParameter(str8, "playStatus");
        Intrinsics.checkNotNullParameter(toss2, "toss");
        Intrinsics.checkNotNullParameter(list, "notes");
        Intrinsics.checkNotNullParameter(str9, "weather");
        Intrinsics.checkNotNullParameter(tournament2, "tournament");
        Intrinsics.checkNotNullParameter(association2, "association");
        Intrinsics.checkNotNullParameter(venue2, "venue");
        Intrinsics.checkNotNullParameter(team12, "team1");
        Intrinsics.checkNotNullParameter(team22, "team2");
        Intrinsics.checkNotNullParameter(list2, "players");
        Intrinsics.checkNotNullParameter(str10, "createdAt");
        Intrinsics.checkNotNullParameter(str11, "updatedAt");
        return new Match(str12, str2, str3, str4, str5, i, str6, i2, str7, str8, toss2, list, str9, tournament2, association2, venue2, team12, team22, list2, z, z2, z3, str10, str11, i3, i4, i5, j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Match)) {
            return false;
        }
        Match match = (Match) obj;
        return Intrinsics.areEqual((Object) this._id, (Object) match._id) && Intrinsics.areEqual((Object) this.key, (Object) match.key) && Intrinsics.areEqual((Object) this.title, (Object) match.title) && Intrinsics.areEqual((Object) this.name, (Object) match.name) && Intrinsics.areEqual((Object) this.shortName, (Object) match.shortName) && this.estimatedEndDate == match.estimatedEndDate && Intrinsics.areEqual((Object) this.status, (Object) match.status) && this.gender == match.gender && Intrinsics.areEqual((Object) this.format, (Object) match.format) && Intrinsics.areEqual((Object) this.playStatus, (Object) match.playStatus) && Intrinsics.areEqual((Object) this.toss, (Object) match.toss) && Intrinsics.areEqual((Object) this.notes, (Object) match.notes) && Intrinsics.areEqual((Object) this.weather, (Object) match.weather) && Intrinsics.areEqual((Object) this.tournament, (Object) match.tournament) && Intrinsics.areEqual((Object) this.association, (Object) match.association) && Intrinsics.areEqual((Object) this.venue, (Object) match.venue) && Intrinsics.areEqual((Object) this.team1, (Object) match.team1) && Intrinsics.areEqual((Object) this.team2, (Object) match.team2) && Intrinsics.areEqual((Object) this.players, (Object) match.players) && this.isPublic == match.isPublic && this.isBlocked == match.isBlocked && this.isDeleted == match.isDeleted && Intrinsics.areEqual((Object) this.createdAt, (Object) match.createdAt) && Intrinsics.areEqual((Object) this.updatedAt, (Object) match.updatedAt) && this.__v == match.__v && this.publishStatus == match.publishStatus && this.matchStatus == match.matchStatus && this.startAtIST == match.startAtIST;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((((((((((((((this._id.hashCode() * 31) + this.key.hashCode()) * 31) + this.title.hashCode()) * 31) + this.name.hashCode()) * 31) + this.shortName.hashCode()) * 31) + this.estimatedEndDate) * 31) + this.status.hashCode()) * 31) + this.gender) * 31) + this.format.hashCode()) * 31) + this.playStatus.hashCode()) * 31) + this.toss.hashCode()) * 31) + this.notes.hashCode()) * 31) + this.weather.hashCode()) * 31) + this.tournament.hashCode()) * 31) + this.association.hashCode()) * 31) + this.venue.hashCode()) * 31) + this.team1.hashCode()) * 31) + this.team2.hashCode()) * 31) + this.players.hashCode()) * 31;
        boolean z = this.isPublic;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        boolean z3 = this.isBlocked;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.isDeleted;
        if (!z4) {
            z2 = z4;
        }
        return ((((((((((((i2 + (z2 ? 1 : 0)) * 31) + this.createdAt.hashCode()) * 31) + this.updatedAt.hashCode()) * 31) + this.__v) * 31) + this.publishStatus) * 31) + this.matchStatus) * 31) + Match$$ExternalSyntheticBackport0.m111m(this.startAtIST);
    }

    public String toString() {
        return "Match(_id=" + this._id + ", key=" + this.key + ", title=" + this.title + ", name=" + this.name + ", shortName=" + this.shortName + ", estimatedEndDate=" + this.estimatedEndDate + ", status=" + this.status + ", gender=" + this.gender + ", format=" + this.format + ", playStatus=" + this.playStatus + ", toss=" + this.toss + ", notes=" + this.notes + ", weather=" + this.weather + ", tournament=" + this.tournament + ", association=" + this.association + ", venue=" + this.venue + ", team1=" + this.team1 + ", team2=" + this.team2 + ", players=" + this.players + ", isPublic=" + this.isPublic + ", isBlocked=" + this.isBlocked + ", isDeleted=" + this.isDeleted + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", __v=" + this.__v + ", publishStatus=" + this.publishStatus + ", matchStatus=" + this.matchStatus + ", startAtIST=" + this.startAtIST + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this._id);
        parcel.writeString(this.key);
        parcel.writeString(this.title);
        parcel.writeString(this.name);
        parcel.writeString(this.shortName);
        parcel.writeInt(this.estimatedEndDate);
        parcel.writeString(this.status);
        parcel.writeInt(this.gender);
        parcel.writeString(this.format);
        parcel.writeString(this.playStatus);
        this.toss.writeToParcel(parcel, i);
        parcel.writeStringList(this.notes);
        parcel.writeString(this.weather);
        this.tournament.writeToParcel(parcel, i);
        this.association.writeToParcel(parcel, i);
        this.venue.writeToParcel(parcel, i);
        this.team1.writeToParcel(parcel, i);
        this.team2.writeToParcel(parcel, i);
        List<Players> list = this.players;
        parcel.writeInt(list.size());
        for (Players writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.isPublic ? 1 : 0);
        parcel.writeInt(this.isBlocked ? 1 : 0);
        parcel.writeInt(this.isDeleted ? 1 : 0);
        parcel.writeString(this.createdAt);
        parcel.writeString(this.updatedAt);
        parcel.writeInt(this.__v);
        parcel.writeInt(this.publishStatus);
        parcel.writeInt(this.matchStatus);
        parcel.writeLong(this.startAtIST);
    }

    public final String get_id() {
        return this._id;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final int getEstimatedEndDate() {
        return this.estimatedEndDate;
    }

    public final String getStatus() {
        return this.status;
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

    public final Toss getToss() {
        return this.toss;
    }

    public final List<String> getNotes() {
        return this.notes;
    }

    public final String getWeather() {
        return this.weather;
    }

    public final Tournament getTournament() {
        return this.tournament;
    }

    public final Association getAssociation() {
        return this.association;
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

    public final List<Players> getPlayers() {
        return this.players;
    }

    public final boolean isPublic() {
        return this.isPublic;
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

    public final int getPublishStatus() {
        return this.publishStatus;
    }

    public final int getMatchStatus() {
        return this.matchStatus;
    }

    public final long getStartAtIST() {
        return this.startAtIST;
    }

    public Match(String str, String str2, String str3, String str4, String str5, int i, String str6, int i2, String str7, String str8, Toss toss2, List<String> list, String str9, Tournament tournament2, Association association2, Venue venue2, Team1 team12, Team2 team22, List<Players> list2, boolean z, boolean z2, boolean z3, String str10, String str11, int i3, int i4, int i5, long j) {
        String str12 = str;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        String str18 = str7;
        String str19 = str8;
        Toss toss3 = toss2;
        List<String> list3 = list;
        String str20 = str9;
        Tournament tournament3 = tournament2;
        Association association3 = association2;
        Venue venue3 = venue2;
        Team2 team23 = team22;
        Intrinsics.checkNotNullParameter(str12, "_id");
        Intrinsics.checkNotNullParameter(str13, "key");
        Intrinsics.checkNotNullParameter(str14, "title");
        Intrinsics.checkNotNullParameter(str15, "name");
        Intrinsics.checkNotNullParameter(str16, "shortName");
        Intrinsics.checkNotNullParameter(str17, NotificationCompat.CATEGORY_STATUS);
        Intrinsics.checkNotNullParameter(str18, "format");
        Intrinsics.checkNotNullParameter(str19, "playStatus");
        Intrinsics.checkNotNullParameter(toss3, "toss");
        Intrinsics.checkNotNullParameter(list3, "notes");
        Intrinsics.checkNotNullParameter(str20, "weather");
        Intrinsics.checkNotNullParameter(tournament3, "tournament");
        Intrinsics.checkNotNullParameter(association3, "association");
        Intrinsics.checkNotNullParameter(venue3, "venue");
        Intrinsics.checkNotNullParameter(team12, "team1");
        Intrinsics.checkNotNullParameter(team22, "team2");
        Intrinsics.checkNotNullParameter(list2, "players");
        Intrinsics.checkNotNullParameter(str10, "createdAt");
        Intrinsics.checkNotNullParameter(str11, "updatedAt");
        this._id = str12;
        this.key = str13;
        this.title = str14;
        this.name = str15;
        this.shortName = str16;
        this.estimatedEndDate = i;
        this.status = str17;
        this.gender = i2;
        this.format = str18;
        this.playStatus = str19;
        this.toss = toss3;
        this.notes = list3;
        this.weather = str20;
        this.tournament = tournament3;
        this.association = association3;
        this.venue = venue3;
        this.team1 = team12;
        this.team2 = team22;
        this.players = list2;
        this.isPublic = z;
        this.isBlocked = z2;
        this.isDeleted = z3;
        this.createdAt = str10;
        this.updatedAt = str11;
        this.__v = i3;
        this.publishStatus = i4;
        this.matchStatus = i5;
        this.startAtIST = j;
    }
}
