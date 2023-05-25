package com.crickpe.utils;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.core.content.FileProvider;
import androidx.fragment.app.Fragment;
import androidx.navigation.compose.DialogNavigator;
import com.crickpe.C1188R;
import com.karumi.dexter.Dexter;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u00017B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\tJ\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001cH\u0002J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\"H\u0002J\u001a\u0010#\u001a\u0004\u0018\u00010 2\u0006\u0010\n\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020\u001cH\u0002J\b\u0010(\u001a\u00020\u001cH\u0002J\u001e\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u00172\u0006\u0010+\u001a\u00020\u00172\u0006\u0010,\u001a\u00020\"J\b\u0010-\u001a\u00020\u001cH\u0002J\b\u0010.\u001a\u00020\u001cH\u0002J\b\u0010/\u001a\u00020\u001cH\u0002J\u000e\u00100\u001a\u00020\u001c2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u00101\u001a\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u000e\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u00020\u0017J\b\u00104\u001a\u00020\u001cH\u0002J\u0010\u00105\u001a\u00020\u001c2\u0006\u00106\u001a\u00020 H\u0002R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138BX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\u00178F@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00068"}, mo48222d2 = {"Lcom/crickpe/utils/ImagePicker;", "", "activity", "Landroid/app/Activity;", "needAvatarOption", "", "(Landroid/app/Activity;Z)V", "fragment", "Landroidx/fragment/app/Fragment;", "(Landroidx/fragment/app/Fragment;Z)V", "context", "<set-?>", "Ljava/io/File;", "imageFile", "getImageFile", "()Ljava/io/File;", "imagePickerListener", "Lcom/crickpe/utils/ImagePicker$ImagePickerListener;", "pickMedia", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/PickVisualMediaRequest;", "pickerDialog", "Landroidx/appcompat/app/AlertDialog;", "", "version", "getVersion", "()I", "callCamera", "", "checkListener", "createImageFile", "directory", "", "getCameraIntent", "Landroid/content/Intent;", "getImagePathFromGallery", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", "getPermission", "handlePhotoPickerLaunch", "onActivityResult", "requestCode", "resultCode", "data", "openCamera", "openGallery", "revokeUriPermission", "setImagePickerListener", "setupPickerDialog", "showImagePicker", "i", "startAvatarIntent", "startCameraIntent", "imageDirectory", "ImagePickerListener", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ImagePicker.kt */
public final class ImagePicker {
    private Activity context;
    private Fragment fragment;
    private File imageFile;
    private ImagePickerListener imagePickerListener;
    private ActivityResultLauncher<PickVisualMediaRequest> pickMedia;
    private AlertDialog pickerDialog;
    private int version;

    @Metadata(mo48221d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0006"}, mo48222d2 = {"Lcom/crickpe/utils/ImagePicker$ImagePickerListener;", "", "onImageSelectedFromPicker", "", "imageFile", "Ljava/io/File;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ImagePicker.kt */
    public interface ImagePickerListener {
        void onImageSelectedFromPicker(File file);
    }

    public final File getImageFile() throws NullPointerException {
        return this.imageFile;
    }

    public final int getVersion() throws NullPointerException {
        return this.version;
    }

    public ImagePicker(Activity activity, boolean z) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.context = activity;
        setupPickerDialog(z);
    }

    public ImagePicker(Fragment fragment2, boolean z) {
        Intrinsics.checkNotNullParameter(fragment2, "fragment");
        this.fragment = fragment2;
        this.context = fragment2.getActivity();
        ActivityResultLauncher<PickVisualMediaRequest> registerForActivityResult = fragment2.registerForActivityResult(new ActivityResultContracts.PickVisualMedia(), new ImagePicker$$ExternalSyntheticLambda0(this));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "fragment.registerForActi…          }\n            }");
        this.pickMedia = registerForActivityResult;
        setupPickerDialog(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m3419_init_$lambda0(ImagePicker imagePicker, Uri uri) {
        Intrinsics.checkNotNullParameter(imagePicker, "this$0");
        if (uri != null) {
            Activity activity = imagePicker.context;
            Intrinsics.checkNotNull(activity);
            String imagePathFromGallery = imagePicker.getImagePathFromGallery(activity, uri);
            if (imagePathFromGallery != null) {
                imagePicker.imageFile = new File(imagePathFromGallery);
                ImagePickerListener imagePickerListener2 = imagePicker.imagePickerListener;
                Intrinsics.checkNotNull(imagePickerListener2);
                imagePickerListener2.onImageSelectedFromPicker(imagePicker.imageFile);
                return;
            }
            return;
        }
        Log.d("PhotoPicker", "No media selected");
    }

    public final void setImagePickerListener(ImagePickerListener imagePickerListener2) {
        Intrinsics.checkNotNullParameter(imagePickerListener2, "imagePickerListener");
        this.imagePickerListener = imagePickerListener2;
    }

    private final void setupPickerDialog(boolean z) {
        String[] imagePickerOptions = CommonMethodsKt.getImagePickerOptions(z, this.context);
        Activity activity = this.context;
        Intrinsics.checkNotNull(activity);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        Activity activity2 = this.context;
        Intrinsics.checkNotNull(activity2);
        builder.setTitle((CharSequence) activity2.getString(C1188R.string.image_utils_dialog_select_your_choice));
        builder.setItems((CharSequence[]) imagePickerOptions, (DialogInterface.OnClickListener) new ImagePicker$$ExternalSyntheticLambda1(this));
        this.pickerDialog = builder.create();
    }

    /* access modifiers changed from: private */
    /* renamed from: setupPickerDialog$lambda-1  reason: not valid java name */
    public static final void m3420setupPickerDialog$lambda1(ImagePicker imagePicker, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(imagePicker, "this$0");
        Intrinsics.checkNotNullParameter(dialogInterface, DialogNavigator.NAME);
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    imagePicker.startAvatarIntent();
                }
            } else if (imagePicker.version == 1) {
                imagePicker.handlePhotoPickerLaunch();
            } else {
                imagePicker.openGallery();
            }
        } else if (imagePicker.version == 1) {
            imagePicker.getPermission();
        } else {
            imagePicker.openCamera();
        }
        dialogInterface.dismiss();
    }

    private final void getPermission() {
        Dexter.withContext(this.context).withPermissions("android.permission.CAMERA").withListener(new ImagePicker$getPermission$1(this)).check();
    }

    private final void startAvatarIntent() {
        Fragment fragment2 = this.fragment;
        if (fragment2 != null) {
            Intrinsics.checkNotNull(fragment2);
            fragment2.onActivityResult(Constants.REQ_CODE_AVATAR, -1, new Intent());
        }
    }

    private final void handlePhotoPickerLaunch() {
        if (ActivityResultContracts.PickVisualMedia.Companion.isPhotoPickerAvailable()) {
            ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncher = this.pickMedia;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("pickMedia");
                activityResultLauncher = null;
            }
            activityResultLauncher.launch(PickVisualMediaRequestKt.PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly.INSTANCE));
        }
    }

    public final void showImagePicker(int i) {
        this.version = i;
        AlertDialog alertDialog = this.pickerDialog;
        if (alertDialog != null) {
            Intrinsics.checkNotNull(alertDialog);
            alertDialog.show();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "data");
        Log.v("onActivityResult", String.valueOf(i));
        if (i == 102 && i2 == -1) {
            if (intent.getData() != null) {
                Activity activity = this.context;
                Intrinsics.checkNotNull(activity);
                Uri data = intent.getData();
                Intrinsics.checkNotNull(data);
                String imagePathFromGallery = getImagePathFromGallery(activity, data);
                if (imagePathFromGallery != null) {
                    Log.v("onActivityResult", "REQ_CODE_GALLERY_IMAGE");
                    this.imageFile = new File(imagePathFromGallery);
                    ImagePickerListener imagePickerListener2 = this.imagePickerListener;
                    Intrinsics.checkNotNull(imagePickerListener2);
                    imagePickerListener2.onImageSelectedFromPicker(this.imageFile);
                }
            }
        } else if (i == 101 && i2 == -1 && this.imageFile != null) {
            ImagePickerListener imagePickerListener3 = this.imagePickerListener;
            Intrinsics.checkNotNull(imagePickerListener3);
            imagePickerListener3.onImageSelectedFromPicker(this.imageFile);
            revokeUriPermission();
        }
    }

    public final void callCamera() {
        if (this.imageFile != null) {
            ImagePickerListener imagePickerListener2 = this.imagePickerListener;
            Intrinsics.checkNotNull(imagePickerListener2);
            imagePickerListener2.onImageSelectedFromPicker(this.imageFile);
            revokeUriPermission();
        }
    }

    /* access modifiers changed from: private */
    public final void openCamera() {
        checkListener();
        Activity activity = this.context;
        Intrinsics.checkNotNull(activity);
        File externalCacheDir = activity.getExternalCacheDir();
        Log.v("openCamera", String.valueOf(externalCacheDir));
        if (externalCacheDir != null) {
            String absolutePath = externalCacheDir.getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "imageDirectory.absolutePath");
            startCameraIntent(absolutePath);
        }
    }

    private final void startCameraIntent(String str) {
        try {
            this.imageFile = createImageFile(str);
            Fragment fragment2 = this.fragment;
            if (fragment2 == null) {
                Activity activity = this.context;
                Intrinsics.checkNotNull(activity);
                activity.startActivityForResult(getCameraIntent(), 101);
                return;
            }
            Intrinsics.checkNotNull(fragment2);
            fragment2.startActivityForResult(getCameraIntent(), 101);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private final Intent getCameraIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        Activity activity = this.context;
        Intrinsics.checkNotNull(activity);
        File file = this.imageFile;
        Intrinsics.checkNotNull(file);
        Uri uriForFile = FileProvider.getUriForFile(activity, "com.intuit.sdp.provider", file);
        intent.putExtra("output", uriForFile);
        Activity activity2 = this.context;
        Intrinsics.checkNotNull(activity2);
        List<ResolveInfo> queryIntentActivities = activity2.getPackageManager().queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "context!!.packageManager…nager.MATCH_DEFAULT_ONLY)");
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            String str = resolveInfo.activityInfo.packageName;
            Activity activity3 = this.context;
            Intrinsics.checkNotNull(activity3);
            activity3.grantUriPermission(str, uriForFile, 3);
        }
        return intent;
    }

    private final void openGallery() {
        checkListener();
        Intent intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        Fragment fragment2 = this.fragment;
        if (fragment2 == null) {
            Activity activity = this.context;
            Intrinsics.checkNotNull(activity);
            activity.startActivityForResult(intent, 102);
            return;
        }
        Intrinsics.checkNotNull(fragment2);
        fragment2.startActivityForResult(intent, 102);
    }

    private final String getImagePathFromGallery(Context context2, Uri uri) {
        String[] strArr = {"_data"};
        Cursor query = context2.getContentResolver().query(uri, strArr, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return null;
        }
        query.moveToFirst();
        String string = query.getString(query.getColumnIndex(strArr[0]));
        query.close();
        return string;
    }

    private final File createImageFile(String str) throws IOException {
        if (!Intrinsics.areEqual((Object) "mounted", (Object) Environment.getExternalStorageState())) {
            return null;
        }
        File file = new File(str);
        if (!file.mkdirs() && !file.exists()) {
            return null;
        }
        return File.createTempFile("IMG_" + System.currentTimeMillis() + '_', ".jpg", file);
    }

    private final void revokeUriPermission() {
        Activity activity = this.context;
        Intrinsics.checkNotNull(activity);
        Activity activity2 = this.context;
        Intrinsics.checkNotNull(activity2);
        File file = this.imageFile;
        Intrinsics.checkNotNull(file);
        activity.revokeUriPermission(FileProvider.getUriForFile(activity2, "com.intuit.sdp.provider", file), 3);
    }

    private final void checkListener() {
        if (this.imagePickerListener == null) {
            throw new RuntimeException("ImagePickerListener must be set before calling openCamera() or openGallery()");
        }
    }
}
