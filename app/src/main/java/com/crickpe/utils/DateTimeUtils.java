package com.crickpe.utils;

import com.google.firebase.database.core.ServerValues;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0010\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0007J\u0006\u0010\u0018\u001a\u00020\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001b\u001a\u00020\u0004H\u0007J\u0016\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J \u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004J\u0016\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0010J\u000e\u0010%\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\u0010J\u0018\u0010'\u001a\u0004\u0018\u00010(2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010(J\u0018\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u0016\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004J\u0012\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u0004H\u0007J\u0012\u00100\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u0004H\u0007J\u0012\u00101\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u0004H\u0007J\u000e\u00102\u001a\u00020\u00042\u0006\u00103\u001a\u000204J\u0010\u00105\u001a\u0002042\u0006\u00103\u001a\u00020\u0004H\u0007J\u0010\u00106\u001a\u0002042\u0006\u00103\u001a\u00020\u0004H\u0007J\u0006\u0010\u0011\u001a\u00020\u0004J\u000e\u00107\u001a\u00020(2\u0006\u00108\u001a\u000204J\u0015\u00109\u001a\u0004\u0018\u00010\u00102\u0006\u0010/\u001a\u00020\u0004¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020\u0004H\u0007J\b\u0010<\u001a\u00020\u0004H\u0007J\b\u0010=\u001a\u00020\u0004H\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006>"}, mo48222d2 = {"Lcom/crickpe/utils/DateTimeUtils;", "", "()V", "currentDate", "", "getCurrentDate", "()Ljava/lang/String;", "currentDateTime", "getCurrentDateTime", "dayName", "getDayName", "timeLocale", "Ljava/util/Locale;", "getTimeLocale", "()Ljava/util/Locale;", "timeOffset", "", "getTimeOffset", "()J", "timeStampInSeconds", "getTimeStampInSeconds", "Format12to24", "time", "Format24to12", "checkWeekOfMonday", "", "convertDate", "dat", "convertDateToTimeStamp", "dateToConvert", "dateFormat", "convertOrderOneDateToAnother", "formatFrom", "formatTo", "differenceDate", "current", "slot", "formatMillsToDate", "mills", "getCalendarFormat", "Ljava/util/Calendar;", "getDateFormat", "Ljava/util/Date;", "getDateFromTimestamp", "timestamp", "format", "getDateMinusSix", "date", "getDatePlusOne", "getDatePlusTwo", "getMonth", "month", "", "getMonthNumber", "getMonthNumberInc", "nextDayOfWeek", "dow", "parseDateToMills", "(Ljava/lang/String;)Ljava/lang/Long;", "sevenDayBackDate", "thirtyDayBackDate", "toDate", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: DateTimeUtils.kt */
public final class DateTimeUtils {
    public static final DateTimeUtils INSTANCE = new DateTimeUtils();

    private DateTimeUtils() {
    }

    public final long getTimeOffset() {
        long currentTimeMillis = System.currentTimeMillis();
        return (long) (TimeZone.getDefault().getOffset(currentTimeMillis) - TimeZone.getTimeZone("Your Time Zone").getOffset(currentTimeMillis));
    }

    /* renamed from: getTimeOffset  reason: collision with other method in class */
    public final String m3415getTimeOffset() {
        String format = new SimpleDateFormat("ZZZZZ", getTimeLocale()).format(Long.valueOf(System.currentTimeMillis()));
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\n      …stem.currentTimeMillis())");
        return format;
    }

    public final String getCurrentDate() {
        String format = new SimpleDateFormat("yyyy-MM-dd", getTimeLocale()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"yyyy-M…timeLocale).format(cDate)");
        return format;
    }

    public final String getCurrentDateTime() {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm a", getTimeLocale()).format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"yyyy-M…timeLocale).format(cDate)");
        return format;
    }

    public final String getDayName() {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        return new String[]{"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"}[instance.get(7)];
    }

    public final String formatMillsToDate(long j) {
        String format = new SimpleDateFormat("yyyy-MM-dd", getTimeLocale()).format(Long.valueOf(j));
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"yyyy-M…timeLocale).format(mills)");
        return format;
    }

    public final Long parseDateToMills(String str) {
        Intrinsics.checkNotNullParameter(str, "date");
        Date parse = new SimpleDateFormat("yyyy-MM-dd", getTimeLocale()).parse(str);
        if (parse != null) {
            return Long.valueOf(parse.getTime());
        }
        return null;
    }

    public final String convertOrderOneDateToAnother(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "dateToConvert");
        Intrinsics.checkNotNullParameter(str2, "formatFrom");
        Intrinsics.checkNotNullParameter(str3, "formatTo");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.ENGLISH);
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(str3, Locale.ENGLISH);
        simpleDateFormat2.setTimeZone(TimeZone.getDefault());
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                parse = new Date();
            }
            return simpleDateFormat2.format(parse);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String getDateFromTimestamp(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, ServerValues.NAME_OP_TIMESTAMP);
        Intrinsics.checkNotNullParameter(str2, "format");
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(Long.parseLong(str));
        try {
            String format = new SimpleDateFormat(str2, getTimeLocale()).format(instance.getTime());
            Intrinsics.checkNotNullExpressionValue(format, "{\n            val sdf = …format(netDate)\n        }");
            return format;
        } catch (Exception unused) {
            return "xx xxxx xxxx";
        }
    }

    public final long convertDateToTimeStamp(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "dateToConvert");
        Intrinsics.checkNotNullParameter(str2, "dateFormat");
        try {
            Date parse = new SimpleDateFormat(str2, getTimeLocale()).parse(str);
            Intrinsics.checkNotNull(parse);
            return parse.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0;
        }
    }

    public final long differenceDate(long j, long j2) {
        long j3 = (j - j2) / ((long) 1000);
        long j4 = (long) 60;
        long j5 = (j3 / j4) / j4;
        long j6 = j5 / ((long) 24);
        return j5;
    }

    public final Calendar getCalendarFormat(String str, String str2) {
        Date date;
        Intrinsics.checkNotNullParameter(str, "dateToConvert");
        Intrinsics.checkNotNullParameter(str2, "dateFormat");
        try {
            date = new SimpleDateFormat(str2, getTimeLocale()).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        Calendar instance = Calendar.getInstance(Locale.getDefault());
        if (date == null) {
            date = new Date();
        }
        instance.setTime(date);
        return instance;
    }

    public final Date getDateFormat(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "dateToConvert");
        Intrinsics.checkNotNullParameter(str2, "dateFormat");
        try {
            return new SimpleDateFormat(str2, Locale.getDefault()).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String getDatePlusTwo(String str) {
        Intrinsics.checkNotNullParameter(str, "date");
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            instance.add(6, 2);
            return new SimpleDateFormat("EEEE yyyy-MM-dd").format(instance.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String getDateMinusSix(String str) {
        Intrinsics.checkNotNullParameter(str, "date");
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            instance.add(6, -6);
            return new SimpleDateFormat("yyyy-MM-dd").format(instance.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String getDatePlusOne(String str) {
        Intrinsics.checkNotNullParameter(str, "date");
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH).parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTime(parse);
            instance.add(6, 1);
            return new SimpleDateFormat("EEEE yyyy-MM-dd").format(instance.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String sevenDayBackDate() {
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(6, -7);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(instance.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"yyyy-MM-dd\").format(newDate)");
        return format;
    }

    public final String thirtyDayBackDate() {
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(6, -30);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(instance.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"yyyy-MM-dd\").format(newDate)");
        return format;
    }

    public final String toDate() {
        Date date = new Date();
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(1, -10);
        String format = new SimpleDateFormat("yyyy-MM-dd").format(instance.getTime());
        Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"yyyy-MM-dd\").format(newDate)");
        return format;
    }

    public final Calendar nextDayOfWeek(int i) {
        Calendar instance = Calendar.getInstance();
        int i2 = i - instance.get(7);
        if (i2 <= 0) {
            i2 += 7;
        }
        instance.add(5, i2);
        Intrinsics.checkNotNullExpressionValue(instance, "date");
        return instance;
    }

    public final String Format12to24(String str) {
        Intrinsics.checkNotNullParameter(str, "time");
        try {
            String format = new SimpleDateFormat("HH:mm").format(new SimpleDateFormat("hh:mm aa").parse(str));
            Intrinsics.checkNotNullExpressionValue(format, "displayFormat.format(date)");
            return format;
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public final String Format24to12(String str) {
        Intrinsics.checkNotNullParameter(str, "time");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        try {
            String format = new SimpleDateFormat("hh:mm aa").format(simpleDateFormat.parse(str));
            Intrinsics.checkNotNullExpressionValue(format, "parseFormat.format(date)");
            return format;
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public final String convertDate(String str) {
        Intrinsics.checkNotNullParameter(str, "dat");
        try {
            return new SimpleDateFormat("dd-MMM-yyyy").format(new SimpleDateFormat("yyyy-MM-dd").parse(str));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public final String getMonth(int i) {
        String str = new DateFormatSymbols().getMonths()[i];
        Intrinsics.checkNotNullExpressionValue(str, "DateFormatSymbols().months[month]");
        return str;
    }

    public final int getMonthNumber(String str) {
        Date date;
        Intrinsics.checkNotNullParameter(str, "month");
        try {
            date = new SimpleDateFormat("MMMM").parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.get(2);
    }

    public final int getMonthNumberInc(String str) {
        Date date;
        Intrinsics.checkNotNullParameter(str, "month");
        try {
            date = new SimpleDateFormat("MMMM").parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            date = null;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        return instance.get(2) + 1;
    }

    public final boolean checkWeekOfMonday() {
        return 2 == Calendar.getInstance().get(7);
    }

    public final long getTimeStampInSeconds() {
        return System.currentTimeMillis() / ((long) 1000);
    }

    public final Locale getTimeLocale() {
        return new Locale("en");
    }

    /* renamed from: getCurrentDate  reason: collision with other method in class */
    public final Calendar m3414getCurrentDate() {
        return Calendar.getInstance();
    }
}
