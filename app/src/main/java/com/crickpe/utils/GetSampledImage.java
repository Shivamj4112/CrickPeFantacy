package com.crickpe.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.os.AsyncTask;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0005J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0002J#\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0010\"\u00020\u0002H\u0014¢\u0006\u0002\u0010\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0019\u001a\u00020\u0017J\u001a\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001c\u001a\u00020\tH\u0002J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u0002H\u0002J\u001e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\tJ\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006$"}, mo48222d2 = {"Lcom/crickpe/utils/GetSampledImage;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Ljava/io/File;", "()V", "listener", "Lcom/crickpe/utils/GetSampledImage$OnImageSampledListener;", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "requiredWidth", "requiredHeight", "doInBackground", "params", "", "([Ljava/lang/String;)Ljava/io/File;", "getImageFile", "bitmap", "Landroid/graphics/Bitmap;", "imageDirectory", "onPostExecute", "", "file", "removeListener", "rotateImage", "img", "degree", "rotateImageIfRequired", "selectedImage", "sampleImage", "imagePath", "requiredImageSize", "setListener", "OnImageSampledListener", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: GetSampledImage.kt */
public final class GetSampledImage extends AsyncTask<String, Void, File> {
    private OnImageSampledListener listener;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/utils/GetSampledImage$OnImageSampledListener;", "", "onImageSampled", "", "imageFile", "Ljava/io/File;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: GetSampledImage.kt */
    public interface OnImageSampledListener {
        void onImageSampled(File file);
    }

    public final void setListener(OnImageSampledListener onImageSampledListener) {
        Intrinsics.checkNotNullParameter(onImageSampledListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.listener = onImageSampledListener;
    }

    public final void removeListener() {
        this.listener = null;
    }

    public final void sampleImage(String str, String str2, int i) {
        Intrinsics.checkNotNullParameter(str, "imagePath");
        Intrinsics.checkNotNullParameter(str2, "imageDirectory");
        execute(new String[]{str, str2, String.valueOf(i)});
    }

    /* access modifiers changed from: protected */
    public File doInBackground(String... strArr) {
        Intrinsics.checkNotNullParameter(strArr, "params");
        try {
            String str = strArr[0];
            String str2 = strArr[1];
            int parseInt = Integer.parseInt(strArr[2]);
            if (str == null) {
                return null;
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = calculateInSampleSize(options, parseInt, parseInt);
            options.inJustDecodeBounds = false;
            Bitmap rotateImageIfRequired = rotateImageIfRequired(BitmapFactory.decodeFile(str, options), str);
            if (rotateImageIfRequired != null) {
                return getImageFile(rotateImageIfRequired, str2);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private final int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        if (i3 <= i2 && i4 <= i) {
            return 1;
        }
        int round = Math.round(((float) i3) / ((float) i2));
        int round2 = Math.round(((float) i4) / ((float) i));
        if (round >= round2) {
            round = round2;
        }
        while (((float) (i4 * i3)) / ((float) (round * round)) > ((float) (i * i2 * 2))) {
            round++;
        }
        return round;
    }

    private final Bitmap rotateImageIfRequired(Bitmap bitmap, String str) throws IOException {
        int attributeInt = new ExifInterface(str).getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
        if (attributeInt == 3) {
            return rotateImage(bitmap, 180);
        }
        if (attributeInt == 6) {
            return rotateImage(bitmap, 90);
        }
        if (attributeInt != 8) {
            return bitmap;
        }
        return rotateImage(bitmap, 270);
    }

    private final Bitmap rotateImage(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        Intrinsics.checkNotNull(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        Intrinsics.checkNotNullExpressionValue(createBitmap, "rotatedImg");
        return createBitmap;
    }

    private final File getImageFile(Bitmap bitmap, String str) {
        try {
            File file = new File(str);
            if (!file.exists() && !file.mkdirs()) {
                return null;
            }
            File file2 = new File(file.getPath() + File.separator + "IMG_" + System.nanoTime() + ".jpg");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return file2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(File file) {
        super.onPostExecute(file);
        OnImageSampledListener onImageSampledListener = this.listener;
        if (onImageSampledListener != null && file != null) {
            Intrinsics.checkNotNull(onImageSampledListener);
            onImageSampledListener.onImageSampled(file);
        }
    }
}
