package com.crickpe.utils;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.microsoft.appcenter.Constants;
import com.microsoft.appcenter.ingestion.models.CommonProperties;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(mo48221d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ9\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0010¢\u0006\u0002\u0010\u0011J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u0018\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\nJ\u000e\u0010\u001a\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u001b\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\n¨\u0006\u001c"}, mo48222d2 = {"Lcom/crickpe/utils/FilePath;", "", "()V", "bitmapToFile", "Ljava/io/File;", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "fileNameToSave", "", "getDataColumn", "uri", "Landroid/net/Uri;", "selection", "selectionArgs", "", "(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;", "getFilePath", "getPath", "isDownloadsDocument", "", "isExternalStorageDocument", "isGooglePhotosUri", "isImageFile", "path", "isMediaDocument", "isVideoFile", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: FilePath.kt */
public final class FilePath {
    public static final FilePath INSTANCE = new FilePath();

    private FilePath() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public String getFilePath(Context r9, Uri r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ all -> 0x0038 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch:{ all -> 0x0038 }
            r4 = 0
            r5 = 0
            r6 = 0
            r2 = r10
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0038 }
            if (r9 == 0) goto L_0x0032
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x002f }
            if (r10 == 0) goto L_0x0032
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002f }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x002f }
            r9.close()
            return r10
        L_0x002f:
            r10 = move-exception
            r7 = r9
            goto L_0x0039
        L_0x0032:
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r7
        L_0x0038:
            r10 = move-exception
        L_0x0039:
            if (r7 == 0) goto L_0x003e
            r7.close()
        L_0x003e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.utils.FilePath.getFilePath(android.content.Context, android.net.Uri):java.lang.String");
    }

    public final boolean isImageFile(String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        Intrinsics.checkNotNullExpressionValue(guessContentTypeFromName, "guessContentTypeFromName(path)");
        return StringsKt.startsWith$default(guessContentTypeFromName, "image", false, 2, (Object) null);
    }

    public final boolean isVideoFile(String str) {
        String guessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        if (guessContentTypeFromName == null || !StringsKt.startsWith$default(guessContentTypeFromName, "video", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }

    public final File bitmapToFile(Context context, Bitmap bitmap, String str) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(str, "fileNameToSave");
        File file = null;
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(context != null ? context.getCacheDir() : null);
            sb.append(File.separator);
            sb.append(str);
            File file2 = new File(sb.toString());
            try {
                file2.createNewFile();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "bos.toByteArray()");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(byteArray);
                fileOutputStream.flush();
                fileOutputStream.close();
                return file2;
            } catch (Exception e) {
                e = e;
                file = file2;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return file;
        }
    }

    public final String getPath(Context context, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Uri uri2 = null;
        if (!(Build.VERSION.SDK_INT >= 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if (StringsKt.equals(FirebaseAnalytics.Param.CONTENT, uri.getScheme(), true)) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, (String) null, (String[]) null);
            }
            if (StringsKt.equals("file", uri.getScheme(), true)) {
                return uri.getPath();
            }
        } else if (isExternalStorageDocument(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            Intrinsics.checkNotNullExpressionValue(documentId, "docId");
            Object[] array = StringsKt.split$default((CharSequence) documentId, new String[]{Constants.COMMON_SCHEMA_PREFIX_SEPARATOR}, false, 0, 6, (Object) null).toArray(new String[0]);
            Intrinsics.checkNotNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            String str = strArr[0];
            return Environment.getExternalStorageDirectory().toString() + '/' + strArr[1];
        } else if (isDownloadsDocument(uri)) {
            String filePath = getFilePath(context, uri);
            if (filePath != null) {
                return Environment.getExternalStorageDirectory().toString() + "/Download/" + filePath;
            }
            String documentId2 = DocumentsContract.getDocumentId(uri);
            Intrinsics.checkNotNullExpressionValue(documentId2, CommonProperties.f597ID);
            if (StringsKt.startsWith$default(documentId2, "raw:", false, 2, (Object) null)) {
                Intrinsics.checkNotNullExpressionValue(documentId2, CommonProperties.f597ID);
                documentId2 = new Regex("raw:").replaceFirst(documentId2, "");
                if (new File(documentId2).exists()) {
                    return documentId2;
                }
            }
            Uri parse = Uri.parse("content://downloads/public_downloads");
            Long valueOf = Long.valueOf(documentId2);
            Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(id)");
            Uri withAppendedId = ContentUris.withAppendedId(parse, valueOf.longValue());
            Intrinsics.checkNotNullExpressionValue(withAppendedId, "withAppendedId(\n        …eOf(id)\n                )");
            return getDataColumn(context, withAppendedId, (String) null, (String[]) null);
        } else if (isMediaDocument(uri)) {
            String documentId3 = DocumentsContract.getDocumentId(uri);
            Intrinsics.checkNotNullExpressionValue(documentId3, "docId");
            Object[] array2 = StringsKt.split$default((CharSequence) documentId3, new String[]{Constants.COMMON_SCHEMA_PREFIX_SEPARATOR}, false, 0, 6, (Object) null).toArray(new String[0]);
            Intrinsics.checkNotNull(array2, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr2 = (String[]) array2;
            String str2 = strArr2[0];
            if (Intrinsics.areEqual((Object) "image", (Object) str2)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if (Intrinsics.areEqual((Object) "video", (Object) str2)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if (Intrinsics.areEqual((Object) "audio", (Object) str2)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return getDataColumn(context, uri2, "_id=?", new String[]{strArr2[1]});
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final String getDataColumn(Context r9, Uri r10, String r11, String[] r12) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch:{ all -> 0x0038 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10)     // Catch:{ all -> 0x0038 }
            r6 = 0
            r2 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0038 }
            if (r9 == 0) goto L_0x0032
            boolean r10 = r9.moveToFirst()     // Catch:{ all -> 0x002f }
            if (r10 == 0) goto L_0x0032
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x002f }
            java.lang.String r10 = r9.getString(r10)     // Catch:{ all -> 0x002f }
            r9.close()
            return r10
        L_0x002f:
            r10 = move-exception
            r7 = r9
            goto L_0x0039
        L_0x0032:
            if (r9 == 0) goto L_0x0037
            r9.close()
        L_0x0037:
            return r7
        L_0x0038:
            r10 = move-exception
        L_0x0039:
            if (r7 == 0) goto L_0x003e
            r7.close()
        L_0x003e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.utils.FilePath.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public final boolean isExternalStorageDocument(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual((Object) "com.android.externalstorage.documents", (Object) uri.getAuthority());
    }

    public final boolean isDownloadsDocument(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual((Object) "com.android.providers.downloads.documents", (Object) uri.getAuthority());
    }

    public final boolean isMediaDocument(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual((Object) "com.android.providers.media.documents", (Object) uri.getAuthority());
    }

    public final boolean isGooglePhotosUri(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return Intrinsics.areEqual((Object) "com.google.android.apps.photos.content", (Object) uri.getAuthority());
    }
}
