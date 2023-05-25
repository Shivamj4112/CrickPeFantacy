package com.crickpe.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\b\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, mo48222d2 = {"Lcom/crickpe/utils/ConnectionDetector;", "", "_context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "isConnectingToInternet", "", "()Z", "networkConnectivity", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: CommonMethods.kt */
public final class ConnectionDetector {
    private final Context _context;

    public ConnectionDetector(Context context) {
        Intrinsics.checkNotNullParameter(context, "_context");
        this._context = context;
    }

    public final boolean isConnectingToInternet() {
        if (!networkConnectivity()) {
            return false;
        }
        try {
            URLConnection openConnection = new URL("http://www.google.com").openConnection();
            if (openConnection != null) {
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestProperty("User-Agent", "Test");
                httpURLConnection.setRequestProperty("Connection", "close");
                httpURLConnection.setConnectTimeout(3000);
                httpURLConnection.setReadTimeout(4000);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    return true;
                }
                return false;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
        } catch (IOException unused) {
            return false;
        }
    }

    private final boolean networkConnectivity() {
        Object systemService = this._context.getSystemService("connectivity");
        if (systemService != null) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
    }
}
