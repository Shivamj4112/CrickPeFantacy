package com.crickpe.view.detail.fragments.profile;

import androidx.fragment.app.Fragment;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import permissions.dispatcher.PermissionUtils;

@Metadata(mo48221d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a\u001a\u0010\t\u001a\u00020\u0007*\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f\"\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000¨\u0006\r"}, mo48222d2 = {"PERMISSION_CAMERASTORAGEPERMISSION", "", "", "[Ljava/lang/String;", "REQUEST_CAMERASTORAGEPERMISSION", "", "cameraStoragePermissionWithPermissionCheck", "", "Lcom/crickpe/view/detail/fragments/profile/ProfileFragment;", "onRequestPermissionsResult", "requestCode", "grantResults", "", "app_release"}, mo48223k = 2, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileFragmentPermissionsDispatcher.kt */
public final class ProfileFragmentPermissionsDispatcher {
    private static final String[] PERMISSION_CAMERASTORAGEPERMISSION = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
    private static final int REQUEST_CAMERASTORAGEPERMISSION = 0;

    public static final void cameraStoragePermissionWithPermissionCheck(ProfileFragment profileFragment) {
        Intrinsics.checkNotNullParameter(profileFragment, "<this>");
        String[] strArr = PERMISSION_CAMERASTORAGEPERMISSION;
        if (PermissionUtils.hasSelfPermissions(profileFragment.requireActivity(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            profileFragment.cameraStoragePermission();
        } else {
            profileFragment.requestPermissions(strArr, 0);
        }
    }

    public static final void onRequestPermissionsResult(ProfileFragment profileFragment, int i, int[] iArr) {
        Intrinsics.checkNotNullParameter(profileFragment, "<this>");
        Intrinsics.checkNotNullParameter(iArr, "grantResults");
        if (i != 0) {
            return;
        }
        if (PermissionUtils.verifyPermissions(Arrays.copyOf(iArr, iArr.length))) {
            profileFragment.cameraStoragePermission();
            return;
        }
        String[] strArr = PERMISSION_CAMERASTORAGEPERMISSION;
        if (!PermissionUtils.shouldShowRequestPermissionRationale((Fragment) profileFragment, (String[]) Arrays.copyOf(strArr, strArr.length))) {
            profileFragment.showNeverAskForCamera();
        } else {
            profileFragment.permissionDenied();
        }
    }
}
