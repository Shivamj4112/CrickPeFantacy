package com.crickpe.view.intro.fragments.login_signup;

import com.crickpe.utils.ImagePicker;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, mo48222d2 = {"com/crickpe/view/intro/fragments/login_signup/ProfileSetUpFragment$openImage$1", "Lcom/karumi/dexter/listener/multi/MultiplePermissionsListener;", "onPermissionRationaleShouldBeShown", "", "permissions", "", "Lcom/karumi/dexter/listener/PermissionRequest;", "token", "Lcom/karumi/dexter/PermissionToken;", "onPermissionsChecked", "report", "Lcom/karumi/dexter/MultiplePermissionsReport;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileSetUpFragment.kt */
public final class ProfileSetUpFragment$openImage$1 implements MultiplePermissionsListener {
    final /* synthetic */ ProfileSetUpFragment this$0;

    ProfileSetUpFragment$openImage$1(ProfileSetUpFragment profileSetUpFragment) {
        this.this$0 = profileSetUpFragment;
    }

    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> list, PermissionToken permissionToken) {
        if (permissionToken != null) {
            permissionToken.continuePermissionRequest();
        }
    }

    public void onPermissionsChecked(MultiplePermissionsReport multiplePermissionsReport) {
        Intrinsics.checkNotNullParameter(multiplePermissionsReport, "report");
        if (multiplePermissionsReport.areAllPermissionsGranted()) {
            ImagePicker access$getImagePicker$p = this.this$0.imagePicker;
            if (access$getImagePicker$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
                access$getImagePicker$p = null;
            }
            access$getImagePicker$p.showImagePicker(0);
        }
    }
}
