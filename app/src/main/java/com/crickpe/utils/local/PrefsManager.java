package com.crickpe.utils.local;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.gson.Gson;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.Retention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\rJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0013J)\u0010\u0014\u001a\u0004\u0018\u0001H\u0015\"\u0004\b\u0000\u0010\u00152\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0017¢\u0006\u0002\u0010\u0018J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0001J\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\rJ\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0011J\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0013J\u0016\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, mo48222d2 = {"Lcom/crickpe/utils/local/PrefsManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gson", "Lcom/google/gson/Gson;", "preferenceName", "", "preferences", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "getBoolean", "", "key", "defValue", "getFloat", "", "getInt", "", "getObject", "T", "objectClass", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "remove", "", "removeAll", "save", "object", "value", "Companion", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: PrefsManager.kt */
public final class PrefsManager {
    public static final String APP_SETTINGS = "APP_SETTINGS";
    public static final String CERTIFICATE_URL = "CERTIFICATE_URL";
    public static final String CONTEST_CLICK = "CONTEST_CLICK";
    public static final String CONTEST_DATA = "CONTEST_DATA";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final String EVENT_NOTIFY = "EVENT_NOTIFY";
    public static final String FCM_TOKEN = "FCM_TOKEN";
    public static final String GET_CONTACTS = "GET_CONTACTS";
    public static final String LIVE_MATCH = "LIVE_MATCH";
    public static final String LOW_BALANCE = "LOW_BALANCE";
    public static final String MATCH_ID = "MATCH_ID";
    public static final String MEGA_WINNER_MODEL = "MEGA_WINNER_MODEL";
    public static final String MY_TEAMS = "MY_TEAMS";
    public static final String PREF_ACCESS_TOKEN = "PREF_ACCESS_TOKEN";
    public static final String PREF_PROFILE_DATA = "PREF_PROFILE_DATA";
    public static final String PROFILE_DATA = "PROFILE_DATA";
    public static final String REFER_CODE = "REFER_CODE";
    public static final String REWARD_PLAYER = "REWARD_PLAYER";
    public static final String SAVE_NAV = "SAVE_NAV";
    public static final String STATES = "STATES";
    public static final String UPCOMING_MATCH_DATA = "UPCOMING_MATCH_DATA";
    /* access modifiers changed from: private */
    public static PrefsManager instance;
    /* access modifiers changed from: private */
    public static final AtomicBoolean isInitialized = new AtomicBoolean();
    private final Gson gson;
    private final String preferenceName;
    private final SharedPreferences preferences;

    public /* synthetic */ PrefsManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private PrefsManager(Context context) {
        this.preferenceName = "EliteMotors";
        this.gson = new Gson();
        this.preferences = context.getSharedPreferences("EliteMotors", 0);
    }

    @Metadata(mo48221d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001!B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u0019J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, mo48222d2 = {"Lcom/crickpe/utils/local/PrefsManager$Companion;", "", "()V", "APP_SETTINGS", "", "CERTIFICATE_URL", "CONTEST_CLICK", "CONTEST_DATA", "EVENT_NOTIFY", "FCM_TOKEN", "GET_CONTACTS", "LIVE_MATCH", "LOW_BALANCE", "MATCH_ID", "MEGA_WINNER_MODEL", "MY_TEAMS", "PREF_ACCESS_TOKEN", "PREF_PROFILE_DATA", "PROFILE_DATA", "REFER_CODE", "REWARD_PLAYER", "SAVE_NAV", "STATES", "UPCOMING_MATCH_DATA", "instance", "Lcom/crickpe/utils/local/PrefsManager;", "isInitialized", "Ljava/util/concurrent/atomic/AtomicBoolean;", "get", "initialize", "", "context", "Landroid/content/Context;", "PrefKey", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: PrefsManager.kt */
    public static final class Companion {

        @Metadata(mo48221d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, mo48222d2 = {"Lcom/crickpe/utils/local/PrefsManager$Companion$PrefKey;", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
        @Retention(AnnotationRetention.SOURCE)
        @java.lang.annotation.Retention(RetentionPolicy.SOURCE)
        /* compiled from: PrefsManager.kt */
        public @interface PrefKey {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void initialize(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (!PrefsManager.isInitialized.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "context.applicationContext");
                PrefsManager.instance = new PrefsManager(applicationContext, (DefaultConstructorMarker) null);
            }
        }

        public final PrefsManager get() {
            PrefsManager access$getInstance$cp = PrefsManager.instance;
            if (access$getInstance$cp != null) {
                return access$getInstance$cp;
            }
            Intrinsics.throwUninitializedPropertyAccessException("instance");
            return null;
        }
    }

    public final void save(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(str2, "value");
        this.preferences.edit().putString(str, str2).apply();
    }

    public final void save(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.preferences.edit().putInt(str, i).apply();
    }

    public final void save(String str, float f) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.preferences.edit().putFloat(str, f).apply();
    }

    public final void save(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.preferences.edit().putBoolean(str, z).apply();
    }

    public final void save(String str, Object obj) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(obj, "object");
        String json = this.gson.toJson(obj);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(`object`)");
        save(str, json);
    }

    public final String getString(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.preferences.getString(str, str2);
    }

    public final int getInt(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.preferences.getInt(str, i);
    }

    public final boolean getBoolean(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.preferences.getBoolean(str, z);
    }

    public final float getFloat(String str, float f) {
        Intrinsics.checkNotNullParameter(str, "key");
        return this.preferences.getFloat(str, f);
    }

    public final <T> T getObject(String str, Class<T> cls) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(cls, "objectClass");
        String string = this.preferences.getString(str, (String) null);
        if (string == null) {
            return null;
        }
        if (string.length() == 0) {
            return null;
        }
        try {
            return this.gson.fromJson(string, cls);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Object stored with key " + str + " is instance of other class");
        }
    }

    public final void remove(String str) {
        Intrinsics.checkNotNullParameter(str, "key");
        this.preferences.edit().remove(str).apply();
    }

    public final void removeAll() {
        this.preferences.edit().clear().apply();
    }
}
