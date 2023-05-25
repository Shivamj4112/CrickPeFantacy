package com.crickpe.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

@Singleton
@Metadata(mo48221d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0007J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011J\u0016\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, mo48222d2 = {"Lcom/crickpe/utils/ImageUtility;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "checksize", "", "uri", "Landroid/net/Uri;", "compressImage", "", "filePath", "getBase64Image", "getCompressedImage", "getImageUri", "inContext", "inImage", "Landroid/graphics/Bitmap;", "getRealPathFromURI", "Landroid/app/Activity;", "contentUri", "getRequestBodyImage", "Lokhttp3/RequestBody;", "file", "Ljava/io/File;", "hasPermissionInManifest", "permissionName", "Companion", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ImageUtility.kt */
public final class ImageUtility {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */
    public final Context context;

    @Inject
    public ImageUtility(Context context2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        this.context = context2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x016b, code lost:
        if (r15 == null) goto L_0x016e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final String compressImage(String r17) {
        /*
            r16 = this;
            r1 = r17
            java.lang.String r2 = "Exif: "
            java.lang.String r3 = "EXIF"
            java.lang.String r0 = "filePath"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.graphics.BitmapFactory$Options r4 = new android.graphics.BitmapFactory$Options
            r4.<init>()
            r0 = 1
            r4.inJustDecodeBounds = r0
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r1, r4)
            int r6 = r4.outHeight
            int r7 = r4.outWidth
            int r8 = r7 / r6
            float r8 = (float) r8
            float r9 = (float) r6
            r10 = 1149239296(0x44800000, float:1024.0)
            r11 = 1145765888(0x444b0000, float:812.0)
            int r12 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r12 > 0) goto L_0x002c
            float r12 = (float) r7
            int r12 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r12 <= 0) goto L_0x0047
        L_0x002c:
            r6 = 1061879808(0x3f4b0000, float:0.79296875)
            int r12 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r12 >= 0) goto L_0x003a
            float r6 = r10 / r9
            float r7 = (float) r7
            float r6 = r6 * r7
            int r7 = (int) r6
            int r6 = (int) r10
            goto L_0x0047
        L_0x003a:
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0045
            float r6 = (float) r7
            float r6 = r11 / r6
            float r6 = r6 * r9
            int r6 = (int) r6
            goto L_0x0046
        L_0x0045:
            int r6 = (int) r10
        L_0x0046:
            int r7 = (int) r11
        L_0x0047:
            com.crickpe.utils.ImageUtility$Companion r8 = Companion
            int r8 = r8.calculateInSampleSize(r4, r7, r6)
            r4.inSampleSize = r8
            r8 = 0
            r4.inJustDecodeBounds = r8
            r4.inDither = r8
            r4.inPurgeable = r0
            r4.inInputShareable = r0
            r0 = 16384(0x4000, float:2.2959E-41)
            byte[] r0 = new byte[r0]
            r4.inTempStorage = r0
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r1, r4)     // Catch:{ Exception -> 0x0063 }
            goto L_0x0068
        L_0x0063:
            r0 = move-exception
            r9 = r0
            r9.printStackTrace()
        L_0x0068:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ OutOfMemoryError -> 0x006f }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r7, r6, r0)     // Catch:{ OutOfMemoryError -> 0x006f }
            goto L_0x0074
        L_0x006f:
            r0 = move-exception
            r0.printStackTrace()
            r0 = 0
        L_0x0074:
            r15 = r0
            float r0 = (float) r7
            int r7 = r4.outWidth
            float r7 = (float) r7
            float r7 = r0 / r7
            float r6 = (float) r6
            int r4 = r4.outHeight
            float r4 = (float) r4
            float r4 = r6 / r4
            r9 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r9
            float r6 = r6 / r9
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            r9.setScale(r7, r4, r0, r6)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            r4.<init>(r15)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r7 = r5.getWidth()
            r9 = 2
            int r7 = r7 / r9
            float r7 = (float) r7
            float r0 = r0 - r7
            int r7 = r5.getHeight()
            int r7 = r7 / r9
            float r7 = (float) r7
            float r6 = r6 - r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r9)
            r4.drawBitmap(r5, r0, r6, r7)
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x0138 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0138 }
            java.lang.String r1 = "Orientation"
            int r0 = r0.getAttributeInt(r1, r8)     // Catch:{ IOException -> 0x0138 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0138 }
            r1.<init>()     // Catch:{ IOException -> 0x0138 }
            r1.append(r2)     // Catch:{ IOException -> 0x0138 }
            r1.append(r0)     // Catch:{ IOException -> 0x0138 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0138 }
            android.util.Log.v(r3, r1)     // Catch:{ IOException -> 0x0138 }
            android.graphics.Matrix r14 = new android.graphics.Matrix     // Catch:{ IOException -> 0x0138 }
            r14.<init>()     // Catch:{ IOException -> 0x0138 }
            r1 = 3
            if (r0 == r1) goto L_0x010c
            r1 = 6
            if (r0 == r1) goto L_0x00f4
            r1 = 8
            if (r0 == r1) goto L_0x00dc
            goto L_0x0123
        L_0x00dc:
            r1 = 1132920832(0x43870000, float:270.0)
            r14.postRotate(r1)     // Catch:{ IOException -> 0x0138 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0138 }
            r1.<init>()     // Catch:{ IOException -> 0x0138 }
            r1.append(r2)     // Catch:{ IOException -> 0x0138 }
            r1.append(r0)     // Catch:{ IOException -> 0x0138 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0138 }
            android.util.Log.v(r3, r0)     // Catch:{ IOException -> 0x0138 }
            goto L_0x0123
        L_0x00f4:
            r1 = 1119092736(0x42b40000, float:90.0)
            r14.postRotate(r1)     // Catch:{ IOException -> 0x0138 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0138 }
            r1.<init>()     // Catch:{ IOException -> 0x0138 }
            r1.append(r2)     // Catch:{ IOException -> 0x0138 }
            r1.append(r0)     // Catch:{ IOException -> 0x0138 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0138 }
            android.util.Log.v(r3, r0)     // Catch:{ IOException -> 0x0138 }
            goto L_0x0123
        L_0x010c:
            r1 = 1127481344(0x43340000, float:180.0)
            r14.postRotate(r1)     // Catch:{ IOException -> 0x0138 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0138 }
            r1.<init>()     // Catch:{ IOException -> 0x0138 }
            r1.append(r2)     // Catch:{ IOException -> 0x0138 }
            r1.append(r0)     // Catch:{ IOException -> 0x0138 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0138 }
            android.util.Log.v(r3, r0)     // Catch:{ IOException -> 0x0138 }
        L_0x0123:
            r10 = 0
            r11 = 0
            int r12 = r15.getWidth()     // Catch:{ IOException -> 0x0138 }
            int r13 = r15.getHeight()     // Catch:{ IOException -> 0x0138 }
            r0 = 1
            r9 = r15
            r1 = r15
            r15 = r0
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createBitmap(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x0136 }
            goto L_0x013e
        L_0x0136:
            r0 = move-exception
            goto L_0x013a
        L_0x0138:
            r0 = move-exception
            r1 = r15
        L_0x013a:
            r0.printStackTrace()
            r15 = r1
        L_0x013e:
            com.crickpe.utils.ImageUtility$Companion r0 = Companion
            r1 = r16
            java.io.File r0 = r0.filename(r1)
            java.lang.String r2 = r0.getAbsolutePath()
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0164 }
            r0.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0164 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)     // Catch:{ FileNotFoundException -> 0x0164 }
            android.graphics.Bitmap$CompressFormat r3 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ FileNotFoundException -> 0x0164 }
            r4 = 90
            java.io.OutputStream r0 = (java.io.OutputStream) r0     // Catch:{ FileNotFoundException -> 0x0164 }
            r15.compress(r3, r4, r0)     // Catch:{ FileNotFoundException -> 0x0164 }
            r5.recycle()
        L_0x015e:
            r15.recycle()
            goto L_0x016e
        L_0x0162:
            r0 = move-exception
            goto L_0x0174
        L_0x0164:
            r0 = move-exception
            r0.printStackTrace()     // Catch:{ all -> 0x0162 }
            r5.recycle()
            if (r15 == 0) goto L_0x016e
            goto L_0x015e
        L_0x016e:
            java.lang.String r0 = "filename"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
        L_0x0174:
            r5.recycle()
            if (r15 == 0) goto L_0x017c
            r15.recycle()
        L_0x017c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.utils.ImageUtility.compressImage(java.lang.String):java.lang.String");
    }

    public final Uri getImageUri(Context context2, Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(context2, "inContext");
        Intrinsics.checkNotNullParameter(bitmap, "inImage");
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, new ByteArrayOutputStream());
        Uri parse = Uri.parse(MediaStore.Images.Media.insertImage(context2.getContentResolver(), bitmap, "Title", (String) null));
        Intrinsics.checkNotNullExpressionValue(parse, "parse(path)");
        return parse;
    }

    public final String getRealPathFromURI(Activity activity, Uri uri) {
        Intrinsics.checkNotNullParameter(activity, "context");
        Intrinsics.checkNotNullParameter(uri, "contentUri");
        Cursor managedQuery = activity.managedQuery(uri, new String[]{"_data"}, (String) null, (String[]) null, (String) null);
        int columnIndexOrThrow = managedQuery.getColumnIndexOrThrow("_data");
        managedQuery.moveToFirst();
        String string = managedQuery.getString(columnIndexOrThrow);
        Intrinsics.checkNotNullExpressionValue(string, "cursor.getString(column_index)");
        return string;
    }

    public final RequestBody getRequestBodyImage(File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return RequestBody.Companion.create(MediaType.Companion.parse("image/jpg"), file);
    }

    public final String getBase64Image(String str) {
        Intrinsics.checkNotNullParameter(str, "filePath");
        Bitmap decodeFile = BitmapFactory.decodeFile(getCompressedImage(str));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        decodeFile.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(b, Base64.DEFAULT)");
        return encodeToString;
    }

    private final String getCompressedImage(String str) {
        if (Integer.parseInt(String.valueOf(new File(str).length() >> 10)) >= 120) {
            compressImage(str);
        }
        return str;
    }

    public final boolean hasPermissionInManifest(Context context2, String str) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(str, "permissionName");
        try {
            String[] strArr = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 4096).requestedPermissions;
            if (strArr != null && strArr.length > 0) {
                for (String areEqual : strArr) {
                    if (Intrinsics.areEqual((Object) areEqual, (Object) str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final boolean checksize(Uri uri, Context context2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(context2, "context");
        String path = uri.getPath();
        Intrinsics.checkNotNull(path);
        new File(path);
        long j = 0;
        try {
            Cursor query = context2.getContentResolver().query(uri, (String[]) null, (String) null, (String[]) null, (String) null);
            Intrinsics.checkNotNull(query);
            query.moveToFirst();
            j = query.getLong(query.getColumnIndex("_size"));
            query.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return j / ((long) 1048576) < 12;
    }

    @Metadata(mo48221d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\u000f"}, mo48222d2 = {"Lcom/crickpe/utils/ImageUtility$Companion;", "", "()V", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "file", "", "imageUtility", "Lcom/crickpe/utils/ImageUtility;", "filename", "Ljava/io/File;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ImageUtility.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
            Intrinsics.checkNotNullParameter(options, "options");
            int i3 = options.outHeight;
            int i4 = options.outWidth;
            if (i3 <= i2 && i4 <= i) {
                return 1;
            }
            if (i4 > i3) {
                return Math.round(((float) i3) / ((float) i2));
            }
            return Math.round(((float) i4) / ((float) i));
        }

        public final File filename(ImageUtility imageUtility) {
            Intrinsics.checkNotNullParameter(imageUtility, "imageUtility");
            return new File(file(imageUtility));
        }

        public final String file(ImageUtility imageUtility) {
            Intrinsics.checkNotNullParameter(imageUtility, "imageUtility");
            String format = new SimpleDateFormat("yyyyMMdd_HHmmss", DateTimeUtils.INSTANCE.getTimeLocale()).format(new Date());
            Intrinsics.checkNotNullExpressionValue(format, "SimpleDateFormat(\"yyyyMM…     Date()\n            )");
            File externalFilesDir = imageUtility.context.getExternalFilesDir(Environment.DIRECTORY_PICTURES);
            Intrinsics.checkNotNull(externalFilesDir);
            String absolutePath = File.createTempFile("JPEG_" + format + '_', ".jpg", externalFilesDir).getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "absolutePath");
            if (absolutePath != null) {
                return absolutePath;
            }
            Intrinsics.throwUninitializedPropertyAccessException("currentPhotoPath");
            return null;
        }
    }
}
