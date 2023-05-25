package com.crickpe.view;

import android.widget.Toast;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.messaging.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, mo48222d2 = {"com/crickpe/view/ApplicationActivity$checkAppVersion$1", "Lcom/google/firebase/database/ValueEventListener;", "onCancelled", "", "error", "Lcom/google/firebase/database/DatabaseError;", "onDataChange", "snapshot", "Lcom/google/firebase/database/DataSnapshot;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ApplicationActivity.kt */
public final class ApplicationActivity$checkAppVersion$1 implements ValueEventListener {
    final /* synthetic */ ApplicationActivity this$0;

    ApplicationActivity$checkAppVersion$1(ApplicationActivity applicationActivity) {
        this.this$0 = applicationActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        r2 = java.lang.Boolean.parseBoolean(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0069, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r0.length() <= 0) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        if (r0 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        if (r6.length() <= 0) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r3 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        if (r1 <= 7) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0086, code lost:
        r5.this$0.openAppUpdateDialog(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDataChange(com.google.firebase.database.DataSnapshot r6) {
        /*
            r5 = this;
            java.lang.String r0 = "snapshot"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.Object r6 = r6.getValue()
            if (r6 == 0) goto L_0x0092
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r0 = "appVersionInfo"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "isForceUpdate"
            java.lang.Object r6 = r6.get(r1)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x008c }
            int r2 = r6.hashCode()     // Catch:{ Exception -> 0x008c }
            r3 = 0
            switch(r2) {
                case 2583950: goto L_0x005b;
                case 2615726: goto L_0x0052;
                case 3569038: goto L_0x0049;
                case 66658563: goto L_0x0040;
                case 67643651: goto L_0x0037;
                case 97196323: goto L_0x002e;
                default: goto L_0x002d;
            }     // Catch:{ Exception -> 0x008c }
        L_0x002d:
            goto L_0x0069
        L_0x002e:
            java.lang.String r2 = "false"
            boolean r2 = r6.equals(r2)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0037:
            java.lang.String r2 = "False"
            boolean r2 = r6.equals(r2)     // Catch:{ Exception -> 0x008c }
            if (r2 == 0) goto L_0x0069
            goto L_0x0064
        L_0x0040:
            java.lang.String r2 = "FALSE"
            boolean r2 = r6.equals(r2)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0049:
            java.lang.String r2 = "true"
            boolean r2 = r6.equals(r2)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0052:
            java.lang.String r2 = "True"
            boolean r2 = r6.equals(r2)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x0064
            goto L_0x0069
        L_0x005b:
            java.lang.String r2 = "TRUE"
            boolean r2 = r6.equals(r2)     // Catch:{ Exception -> 0x008c }
            if (r2 != 0) goto L_0x0064
            goto L_0x0069
        L_0x0064:
            boolean r2 = java.lang.Boolean.parseBoolean(r6)     // Catch:{ Exception -> 0x008c }
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x008c }
            int r0 = r0.length()     // Catch:{ Exception -> 0x008c }
            r4 = 1
            if (r0 <= 0) goto L_0x0075
            r0 = 1
            goto L_0x0076
        L_0x0075:
            r0 = 0
        L_0x0076:
            if (r0 == 0) goto L_0x0091
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x008c }
            int r6 = r6.length()     // Catch:{ Exception -> 0x008c }
            if (r6 <= 0) goto L_0x0081
            r3 = 1
        L_0x0081:
            if (r3 == 0) goto L_0x0091
            r6 = 7
            if (r1 <= r6) goto L_0x0091
            com.crickpe.view.ApplicationActivity r6 = r5.this$0     // Catch:{ Exception -> 0x008c }
            r6.openAppUpdateDialog(r2)     // Catch:{ Exception -> 0x008c }
            goto L_0x0091
        L_0x008c:
            java.lang.String r6 = ""
            android.util.Log.d(r6, r6)
        L_0x0091:
            return
        L_0x0092:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, com.crickpe.view.FirebaseData>"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.ApplicationActivity$checkAppVersion$1.onDataChange(com.google.firebase.database.DataSnapshot):void");
    }

    public void onCancelled(DatabaseError databaseError) {
        Intrinsics.checkNotNullParameter(databaseError, Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        Toast.makeText(this.this$0, "Fail to get data.", 0).show();
    }
}
