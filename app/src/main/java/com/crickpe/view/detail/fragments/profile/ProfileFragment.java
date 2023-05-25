package com.crickpe.view.detail.fragments.profile;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.RecyclerView;
import coil.util.Utils;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.databinding.FragmentProfileBinding;
import com.crickpe.databinding.LayoutAvatarBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.GetSampledImage;
import com.crickpe.utils.ImagePicker;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.RecentPlayedMatchesAdapter;
import com.crickpe.view.detail.fragments.settings.models.ProfileModelNew;
import com.crickpe.view.intro.adapters.ProfileAvtarAdapter;
import com.crickpe.view.intro.fragments.User;
import com.crickpe.view.intro.fragments.login_signup.ProfileAvtar;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import com.yalantis.ucrop.UCrop;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p019de.hdodenhof.circleimageview.CircleImageView;

@Metadata(mo48221d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010&\u001a\u00020'H\u0007J\b\u0010(\u001a\u00020'H\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020'H\u0002J\b\u0010,\u001a\u00020'H\u0002J\"\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00102\u001a\u00020'2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020'2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0012\u00106\u001a\u00020'2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u00107\u001a\u00020'2\u0006\u00108\u001a\u00020\u000bH\u0016J\b\u00109\u001a\u00020'H\u0016J\u001a\u0010:\u001a\u00020'2\u0006\u00103\u001a\u0002042\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010=\u001a\u00020'H\u0007J\b\u0010>\u001a\u00020'H\u0002J\b\u0010?\u001a\u00020'H\u0002J\b\u0010@\u001a\u00020'H\u0007R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X.¢\u0006\u0002\n\u0000¨\u0006A"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/profile/ProfileFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/utils/GetSampledImage$OnImageSampledListener;", "Lcom/crickpe/utils/ImagePicker$ImagePickerListener;", "Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter$OnItemClicked;", "()V", "adapter", "Lcom/crickpe/view/detail/adapters/RecentPlayedMatchesAdapter;", "avatarList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/intro/fragments/login_signup/ProfileAvtar;", "Lkotlin/collections/ArrayList;", "getAvatarList", "()Ljava/util/ArrayList;", "setAvatarList", "(Ljava/util/ArrayList;)V", "binding", "Lcom/crickpe/databinding/FragmentProfileBinding;", "body", "Lokhttp3/MultipartBody$Part;", "getBody", "()Lokhttp3/MultipartBody$Part;", "setBody", "(Lokhttp3/MultipartBody$Part;)V", "imageFile", "Ljava/io/File;", "imageFileName", "imagePicker", "Lcom/crickpe/utils/ImagePicker;", "updateProfilePic", "", "getUpdateProfilePic", "()Z", "setUpdateProfilePic", "(Z)V", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "cameraStoragePermission", "", "dismissAvatars", "getFragmentLayoutResId", "", "listeners", "observeData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "view", "Landroid/view/View;", "onImageSampled", "onImageSelectedFromPicker", "onItemClicked", "profileAvtar", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "permissionDenied", "setAdapter", "setImagesAdapter", "showNeverAskForCamera", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileFragment.kt */
public final class ProfileFragment extends BaseFragment implements View.OnClickListener, GetSampledImage.OnImageSampledListener, ImagePicker.ImagePickerListener, ProfileAvtarAdapter.OnItemClicked {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private RecentPlayedMatchesAdapter adapter;
    private ArrayList<ProfileAvtar> avatarList = new ArrayList<>();
    private FragmentProfileBinding binding;
    private MultipartBody.Part body;
    private File imageFile;
    private File imageFileName;
    private ImagePicker imagePicker;
    private boolean updateProfilePic;
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ProfileFragment.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.SUCCESS.ordinal()] = 1;
            iArr[Status.ERROR.ordinal()] = 2;
            iArr[Status.LOADING.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public int getFragmentLayoutResId() {
        return C1188R.C1193layout.fragment_profile;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final MultipartBody.Part getBody() {
        return this.body;
    }

    public final void setBody(MultipartBody.Part part) {
        this.body = part;
    }

    public final ArrayList<ProfileAvtar> getAvatarList() {
        return this.avatarList;
    }

    public final void setAvatarList(ArrayList<ProfileAvtar> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.avatarList = arrayList;
    }

    public final boolean getUpdateProfilePic() {
        return this.updateProfilePic;
    }

    public final void setUpdateProfilePic(boolean z) {
        this.updateProfilePic = z;
    }

    public void onResume() {
        super.onResume();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            String string = getResources().getString(C1188R.string.profile);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.profile)");
            ((DetailActivity) activity).setTopBar(string, true, false, false, false, false, false, false);
            DetailViewModel detailViewModel = this.viewModel;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            detailViewModel.getProfileApi();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    public final void cameraStoragePermission() {
        ImagePicker imagePicker2 = this.imagePicker;
        if (imagePicker2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
            imagePicker2 = null;
        }
        imagePicker2.showImagePicker(0);
    }

    public final void permissionDenied() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        ExtensionsKt.showToast((Context) requireActivity, (int) C1188R.string.permission_required);
    }

    public final void showNeverAskForCamera() {
        CommonMethodsKt.openSettingDialog(requireActivity());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        LayoutAvatarBinding layoutAvatarBinding;
        RelativeLayout relativeLayout;
        LayoutAvatarBinding layoutAvatarBinding2;
        RelativeLayout relativeLayout2;
        super.onActivityResult(i, i2, intent);
        String str = null;
        if (i == 1033) {
            FragmentProfileBinding fragmentProfileBinding = this.binding;
            if (!(fragmentProfileBinding == null || (layoutAvatarBinding2 = fragmentProfileBinding.avatars) == null || (relativeLayout2 = layoutAvatarBinding2.rlAvatarLayout) == null)) {
                CommonMethodsKt.visible(relativeLayout2);
            }
            Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_in_up);
            Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_in_up)");
            FragmentProfileBinding fragmentProfileBinding2 = this.binding;
            if (!(fragmentProfileBinding2 == null || (layoutAvatarBinding = fragmentProfileBinding2.avatars) == null || (relativeLayout = layoutAvatarBinding.rlAvatarLayout) == null)) {
                relativeLayout.startAnimation(loadAnimation);
            }
        } else if (i == 101 && i2 == -1) {
            ImagePicker imagePicker2 = this.imagePicker;
            if (imagePicker2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
                imagePicker2 = null;
            }
            imagePicker2.callCamera();
        } else if (intent != null) {
            ImagePicker imagePicker3 = this.imagePicker;
            if (imagePicker3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
                imagePicker3 = null;
            }
            imagePicker3.onActivityResult(i, i2, intent);
        }
        if (i == 69 && i2 == -1) {
            if (intent == null) {
                intent = new Intent();
            }
            Uri output = UCrop.getOutput(intent);
            if (output != null) {
                str = output.getPath();
            }
            onImageSampled(new File(str));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentProfileBinding.bind(view);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        listeners();
        setAdapter();
        observeData();
        setImagesAdapter();
    }

    private final void listeners() {
        LayoutAvatarBinding layoutAvatarBinding;
        ImageView imageView;
        ImagePicker imagePicker2 = new ImagePicker((Fragment) this, true);
        this.imagePicker = imagePicker2;
        imagePicker2.setImagePickerListener(this);
        View.OnClickListener onClickListener = this;
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivSettings)).setOnClickListener(onClickListener);
        ((CardView) _$_findCachedViewById(C1188R.C1192id.cvPenProfile)).setOnClickListener(onClickListener);
        ((LinearLayout) _$_findCachedViewById(C1188R.C1192id.llKyc)).setOnClickListener(onClickListener);
        FragmentProfileBinding fragmentProfileBinding = this.binding;
        if (fragmentProfileBinding != null && (layoutAvatarBinding = fragmentProfileBinding.avatars) != null && (imageView = layoutAvatarBinding.btnClose) != null) {
            imageView.setOnClickListener(new ProfileFragment$$ExternalSyntheticLambda0(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-0  reason: not valid java name */
    public static final void m3599listeners$lambda0(ProfileFragment profileFragment, View view) {
        Intrinsics.checkNotNullParameter(profileFragment, "this$0");
        profileFragment.dismissAvatars();
    }

    private final void dismissAvatars() {
        LayoutAvatarBinding layoutAvatarBinding;
        RelativeLayout relativeLayout;
        LayoutAvatarBinding layoutAvatarBinding2;
        RelativeLayout relativeLayout2;
        FragmentProfileBinding fragmentProfileBinding = this.binding;
        if (!(fragmentProfileBinding == null || (layoutAvatarBinding2 = fragmentProfileBinding.avatars) == null || (relativeLayout2 = layoutAvatarBinding2.rlAvatarLayout) == null)) {
            CommonMethodsKt.hide(relativeLayout2);
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C1188R.anim.slide_out_down);
        Intrinsics.checkNotNullExpressionValue(loadAnimation, "loadAnimation(context, R.anim.slide_out_down)");
        FragmentProfileBinding fragmentProfileBinding2 = this.binding;
        if (fragmentProfileBinding2 != null && (layoutAvatarBinding = fragmentProfileBinding2.avatars) != null && (relativeLayout = layoutAvatarBinding.rlAvatarLayout) != null) {
            relativeLayout.startAnimation(loadAnimation);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0111, code lost:
        r1 = r1.avatars;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setImagesAdapter() {
        /*
            r7 = this;
            java.util.ArrayList<com.crickpe.view.intro.fragments.login_signup.ProfileAvtar> r0 = r7.avatarList
            r0.clear()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165834(0x7f07028a, float:1.7945896E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165840(0x7f070290, float:1.7945908E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165839(0x7f07028f, float:1.7945906E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165832(0x7f070288, float:1.7945892E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165831(0x7f070287, float:1.794589E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165837(0x7f07028d, float:1.7945902E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165836(0x7f07028c, float:1.79459E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165828(0x7f070284, float:1.7945884E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165833(0x7f070289, float:1.7945894E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165838(0x7f07028e, float:1.7945904E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            android.content.Context r1 = (android.content.Context) r1
            r2 = 2131165829(0x7f070285, float:1.7945886E38)
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            r0.add(r1)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        L_0x00e1:
            if (r3 >= r1) goto L_0x00fb
            com.crickpe.view.intro.fragments.login_signup.ProfileAvtar r4 = new com.crickpe.view.intro.fragments.login_signup.ProfileAvtar
            java.lang.Object r5 = r0.get(r3)
            java.lang.String r6 = "myImageList[i]"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
            r4.<init>(r5, r2)
            java.util.ArrayList<com.crickpe.view.intro.fragments.login_signup.ProfileAvtar> r5 = r7.avatarList
            r5.add(r4)
            int r3 = r3 + 1
            goto L_0x00e1
        L_0x00fb:
            com.crickpe.view.intro.adapters.ProfileAvtarAdapter r0 = new com.crickpe.view.intro.adapters.ProfileAvtarAdapter
            r1 = r7
            com.crickpe.view.intro.adapters.ProfileAvtarAdapter$OnItemClicked r1 = (com.crickpe.view.intro.adapters.ProfileAvtarAdapter.OnItemClicked) r1
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            java.lang.String r4 = "requireActivity()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r0.<init>(r1, r3)
            com.crickpe.databinding.FragmentProfileBinding r1 = r7.binding
            r3 = 0
            if (r1 == 0) goto L_0x0118
            com.crickpe.databinding.LayoutAvatarBinding r1 = r1.avatars
            if (r1 == 0) goto L_0x0118
            androidx.recyclerview.widget.RecyclerView r1 = r1.rvProfileAvtar
            goto L_0x0119
        L_0x0118:
            r1 = r3
        L_0x0119:
            if (r1 != 0) goto L_0x011c
            goto L_0x0122
        L_0x011c:
            r4 = r0
            androidx.recyclerview.widget.RecyclerView$Adapter r4 = (androidx.recyclerview.widget.RecyclerView.Adapter) r4
            r1.setAdapter(r4)
        L_0x0122:
            com.crickpe.databinding.FragmentProfileBinding r1 = r7.binding
            if (r1 == 0) goto L_0x012d
            com.crickpe.databinding.LayoutAvatarBinding r1 = r1.avatars
            if (r1 == 0) goto L_0x012d
            androidx.recyclerview.widget.RecyclerView r1 = r1.rvProfileAvtar
            goto L_0x012e
        L_0x012d:
            r1 = r3
        L_0x012e:
            if (r1 != 0) goto L_0x0131
            goto L_0x013f
        L_0x0131:
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            android.content.Context r5 = r7.getContext()
            r4.<init>(r5, r2, r2)
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = (androidx.recyclerview.widget.RecyclerView.LayoutManager) r4
            r1.setLayoutManager(r4)
        L_0x013f:
            com.crickpe.databinding.FragmentProfileBinding r1 = r7.binding
            if (r1 == 0) goto L_0x0149
            com.crickpe.databinding.LayoutAvatarBinding r1 = r1.avatars
            if (r1 == 0) goto L_0x0149
            androidx.recyclerview.widget.RecyclerView r3 = r1.rvProfileAvtar
        L_0x0149:
            if (r3 != 0) goto L_0x014c
            goto L_0x0152
        L_0x014c:
            r1 = r0
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = (androidx.recyclerview.widget.RecyclerView.Adapter) r1
            r3.setAdapter(r1)
        L_0x0152:
            java.util.ArrayList<com.crickpe.view.intro.fragments.login_signup.ProfileAvtar> r1 = r7.avatarList
            r0.addList(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.profile.ProfileFragment.setImagesAdapter():void");
    }

    public void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        int id = view.getId();
        if (id != C1188R.C1192id.cvPenProfile) {
            if (id == C1188R.C1192id.ivSettings) {
                try {
                    FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_profileFragment_to_settingsFragment);
                } catch (Exception e) {
                    Log.v("EXCEPTION4", e.toString());
                }
            } else if (id == C1188R.C1192id.llKyc) {
                FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_profileFragment_to_kycFragment2);
            }
        } else if (Build.VERSION.SDK_INT >= 33) {
            ImagePicker imagePicker2 = this.imagePicker;
            if (imagePicker2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imagePicker");
                imagePicker2 = null;
            }
            imagePicker2.showImagePicker(1);
        } else {
            ProfileFragmentPermissionsDispatcher.cameraStoragePermissionWithPermissionCheck(this);
        }
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ProfileModelNew>> getUserProfle = detailViewModel.getGetUserProfle();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getUserProfle.observe(viewLifecycleOwner, new ProfileFragment$$ExternalSyntheticLambda1(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel3;
        }
        SingleLiveEvent<ApiResponseHandler<User>> updateProfilePic2 = detailViewModel2.getUpdateProfilePic();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        updateProfilePic2.observe(viewLifecycleOwner2, new ProfileFragment$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-1  reason: not valid java name */
    public static final void m3600observeData$lambda1(ProfileFragment profileFragment, ApiResponseHandler apiResponseHandler) {
        Object obj;
        Intrinsics.checkNotNullParameter(profileFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            boolean z = true;
            if (i == 1) {
                ProfileModelNew profileModelNew = (ProfileModelNew) apiResponseHandler.getData();
                ProgressBar progressBar = (ProgressBar) profileFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (profileModelNew != null) {
                    try {
                        if (!profileFragment.updateProfilePic) {
                            profileFragment.updateProfilePic = false;
                            FragmentProfileBinding fragmentProfileBinding = profileFragment.binding;
                            Intrinsics.checkNotNull(fragmentProfileBinding);
                            fragmentProfileBinding.setVm(profileModelNew);
                            UserManager.INSTANCE.saveProfile(profileModelNew.getUserProfile());
                            if (Build.VERSION.SDK_INT >= 26) {
                                obj = profileFragment.modifyDateLayout(profileModelNew.getUserProfile().getCreatedAt(), "dd MMM, yyyy");
                            } else {
                                obj = Integer.valueOf(Log.v("VERSION", "Below_oreo"));
                            }
                            FragmentProfileBinding fragmentProfileBinding2 = profileFragment.binding;
                            Intrinsics.checkNotNull(fragmentProfileBinding2);
                            RecentPlayedMatchesAdapter recentPlayedMatchesAdapter = null;
                            fragmentProfileBinding2.tvJoinIndiawinVal.setText(obj != null ? obj.toString() : null);
                            if (!profileModelNew.getRecentlyPlayed().isEmpty()) {
                                RecentPlayedMatchesAdapter recentPlayedMatchesAdapter2 = profileFragment.adapter;
                                if (recentPlayedMatchesAdapter2 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                                } else {
                                    recentPlayedMatchesAdapter = recentPlayedMatchesAdapter2;
                                }
                                recentPlayedMatchesAdapter.addList(true, profileModelNew.getRecentlyPlayed());
                                TextView textView = (TextView) profileFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                                Intrinsics.checkNotNullExpressionValue(textView, "tvNoData");
                                CommonMethodsKt.hide(textView);
                            } else {
                                TextView textView2 = (TextView) profileFragment._$_findCachedViewById(C1188R.C1192id.tvNoData);
                                Intrinsics.checkNotNullExpressionValue(textView2, "tvNoData");
                                CommonMethodsKt.visible(textView2);
                            }
                        }
                        LinearLayout linearLayout = (LinearLayout) profileFragment._$_findCachedViewById(C1188R.C1192id.llKyc);
                        if (profileModelNew.getUserProfile().getKycStatus() == 1) {
                            z = false;
                        }
                        linearLayout.setEnabled(z);
                    } catch (Exception unused) {
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = profileFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                profileFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                ProgressBar progressBar2 = (ProgressBar) profileFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) profileFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3601observeData$lambda2(ProfileFragment profileFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(profileFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) profileFragment._$_findCachedViewById(C1188R.C1192id.progressBarProfile);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBarProfile");
                CommonMethodsKt.hide(progressBar);
                User user = (User) apiResponseHandler.getData();
                if (user != null) {
                    User userProfile = UserManager.INSTANCE.getUserProfile();
                    Double valueOf = userProfile != null ? Double.valueOf(userProfile.getTotalAmount()) : null;
                    UserManager.INSTANCE.saveProfile(user);
                    Log.v("KYC_HOME4_profile", String.valueOf(user.getKycStatus()));
                    if (valueOf != null) {
                        user.setTotalAmount(valueOf.doubleValue());
                    }
                }
            } else if (i == 2) {
                ProgressBar progressBar2 = (ProgressBar) profileFragment._$_findCachedViewById(C1188R.C1192id.progressBarProfile);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBarProfile");
                CommonMethodsKt.hide(progressBar2);
                FragmentActivity requireActivity = profileFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                profileFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) profileFragment._$_findCachedViewById(C1188R.C1192id.progressBarProfile);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBarProfile");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    private final void setAdapter() {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.adapter = new RecentPlayedMatchesAdapter(requireActivity);
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvRecentMatchs);
        RecentPlayedMatchesAdapter recentPlayedMatchesAdapter = this.adapter;
        if (recentPlayedMatchesAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            recentPlayedMatchesAdapter = null;
        }
        recyclerView.setAdapter(recentPlayedMatchesAdapter);
    }

    public void onImageSelectedFromPicker(File file) {
        try {
            this.imageFileName = file;
        } catch (Exception e) {
            Log.v("from_picker", e.toString());
        }
        UCrop.Options options = new UCrop.Options();
        options.setHideBottomControls(false);
        UCrop.m266of(Uri.fromFile(file), Uri.fromFile(new File(requireActivity().getCacheDir(), String.valueOf(System.currentTimeMillis())))).withAspectRatio(1.0f, 0.8f).withMaxResultSize(1200, 1200).withOptions(options).start(requireActivity(), this, 69);
    }

    public void onImageSampled(File file) {
        Intrinsics.checkNotNullParameter(file, "imageFile");
        this.updateProfilePic = true;
        this.imageFile = file;
        Glide.with(requireActivity()).load(file).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.ic_add)).into((ImageView) (CircleImageView) _$_findCachedViewById(C1188R.C1192id.profileImage));
        ArrayList arrayList = new ArrayList();
        arrayList.add(file);
        if (true ^ arrayList.isEmpty()) {
            try {
                MultipartBody.Part createFormData = MultipartBody.Part.Companion.createFormData("profileImage", String.valueOf(this.imageFileName), RequestBody.Companion.create(file, MediaType.Companion.parse(Utils.MIME_TYPE_JPEG)));
                this.body = createFormData;
                if (createFormData != null) {
                    DetailViewModel detailViewModel = this.viewModel;
                    if (detailViewModel == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                        detailViewModel = null;
                    }
                    MultipartBody.Part part = this.body;
                    Intrinsics.checkNotNull(part);
                    detailViewModel.updateProfilePicApi(part);
                    return;
                }
                Log.v("NULLLL", "BODY");
            } catch (Exception e) {
                Log.e("onImageSampled", e.toString());
            }
        }
    }

    public void onItemClicked(ProfileAvtar profileAvtar) {
        CircleImageView circleImageView;
        Intrinsics.checkNotNullParameter(profileAvtar, "profileAvtar");
        Bitmap convertToBitmap = convertToBitmap(profileAvtar.getImage_id(), 100, 100);
        FragmentProfileBinding fragmentProfileBinding = this.binding;
        if (!(fragmentProfileBinding == null || (circleImageView = fragmentProfileBinding.profileImage) == null)) {
            circleImageView.setImageBitmap(convertToBitmap);
        }
        this.imageFile = bitmapToFile(convertToBitmap);
        Log.e("FILEEonItemClicked", new Gson().toJson((Object) this.imageFile));
        File file = this.imageFile;
        Intrinsics.checkNotNull(file);
        onImageSampled(file);
        dismissAvatars();
    }
}
