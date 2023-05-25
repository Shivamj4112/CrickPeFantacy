package com.crickpe.view.intro.fragments.login_signup;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.request.RequestOptions;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.ExtensionsKt;
import com.crickpe.utils.GetSampledImage;
import com.crickpe.utils.ImagePicker;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.home.HomeActivity;
import com.crickpe.view.intro.IntroViewModel;
import com.crickpe.view.intro.adapters.ProfileAvtarAdapter;
import com.crickpe.view.intro.fragments.User;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.karumi.dexter.Dexter;
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

@Metadata(mo48221d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020#H\u0002J\b\u0010%\u001a\u00020#H\u0002J\"\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010*H\u0017J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010/\u001a\u00020#2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020\tH\u0016J\u001a\u00102\u001a\u00020#2\u0006\u0010,\u001a\u00020-2\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020#H\u0002J\b\u00106\u001a\u00020#H\u0002R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000¨\u00067"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/login_signup/ProfileSetUpFragment;", "Lcom/crickpe/base/BaseFragment;", "Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter$OnItemClicked;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/utils/GetSampledImage$OnImageSampledListener;", "Lcom/crickpe/utils/ImagePicker$ImagePickerListener;", "()V", "avatarList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/intro/fragments/login_signup/ProfileAvtar;", "Lkotlin/collections/ArrayList;", "getAvatarList", "()Ljava/util/ArrayList;", "setAvatarList", "(Ljava/util/ArrayList;)V", "body", "Lokhttp3/MultipartBody$Part;", "getBody", "()Lokhttp3/MultipartBody$Part;", "setBody", "(Lokhttp3/MultipartBody$Part;)V", "imageFile", "Ljava/io/File;", "imageFileName", "imagePicker", "Lcom/crickpe/utils/ImagePicker;", "profileAvtarAdapter", "Lcom/crickpe/view/intro/adapters/ProfileAvtarAdapter;", "userId", "", "viewModel", "Lcom/crickpe/view/intro/IntroViewModel;", "getFragmentLayoutResId", "", "hitApi", "", "listeners", "observeData", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onClick", "view", "Landroid/view/View;", "onImageSampled", "onImageSelectedFromPicker", "onItemClicked", "profileAvtar", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "openImage", "setImagesAdapter", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ProfileSetUpFragment.kt */
public final class ProfileSetUpFragment extends BaseFragment implements ProfileAvtarAdapter.OnItemClicked, View.OnClickListener, GetSampledImage.OnImageSampledListener, ImagePicker.ImagePickerListener {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private ArrayList<ProfileAvtar> avatarList = new ArrayList<>();
    private MultipartBody.Part body;
    private File imageFile;
    private File imageFileName;
    /* access modifiers changed from: private */
    public ImagePicker imagePicker;
    private ProfileAvtarAdapter profileAvtarAdapter;
    private String userId = "";
    private IntroViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ProfileSetUpFragment.kt */
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
        return C1188R.C1193layout.fragment_profile_setup;
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

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ImagePicker imagePicker2 = new ImagePicker((Fragment) this, false);
        this.imagePicker = imagePicker2;
        imagePicker2.setImagePickerListener(this);
        this.viewModel = (IntroViewModel) new ViewModelProvider(this).get(IntroViewModel.class);
        listeners();
        if (getArguments() != null) {
            this.userId = String.valueOf(requireArguments().getString("mobile"));
        }
        setImagesAdapter();
        observeData();
    }

    private final void listeners() {
        View.OnClickListener onClickListener = this;
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setOnClickListener(onClickListener);
        ((CardView) _$_findCachedViewById(C1188R.C1192id.cvProfile)).setOnClickListener(onClickListener);
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivAdd)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvLogin)).setOnClickListener(onClickListener);
        ((RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlProgress)).setOnClickListener(onClickListener);
        ((TextView) _$_findCachedViewById(C1188R.C1192id.tvContinue)).setOnEditorActionListener(new ProfileSetUpFragment$$ExternalSyntheticLambda1(this));
        ((EditText) _$_findCachedViewById(C1188R.C1192id.etReferralCode)).addTextChangedListener(new ProfileSetUpFragment$listeners$2());
    }

    /* access modifiers changed from: private */
    /* renamed from: listeners$lambda-0  reason: not valid java name */
    public static final boolean m3784listeners$lambda0(ProfileSetUpFragment profileSetUpFragment, TextView textView, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(profileSetUpFragment, "this$0");
        if (i != 6) {
            return false;
        }
        Context requireContext = profileSetUpFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        CommonMethodsKt.hideKeyboard(requireContext, (TextView) profileSetUpFragment._$_findCachedViewById(C1188R.C1192id.tvContinue));
        return true;
    }

    private final void setImagesAdapter() {
        this.avatarList.clear();
        ArrayList arrayList = new ArrayList();
        Drawable drawable = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_one);
        Intrinsics.checkNotNull(drawable);
        arrayList.add(drawable);
        Drawable drawable2 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_two);
        Intrinsics.checkNotNull(drawable2);
        arrayList.add(drawable2);
        Drawable drawable3 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_three);
        Intrinsics.checkNotNull(drawable3);
        arrayList.add(drawable3);
        Drawable drawable4 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_four);
        Intrinsics.checkNotNull(drawable4);
        arrayList.add(drawable4);
        Drawable drawable5 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_five);
        Intrinsics.checkNotNull(drawable5);
        arrayList.add(drawable5);
        Drawable drawable6 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_six);
        Intrinsics.checkNotNull(drawable6);
        arrayList.add(drawable6);
        Drawable drawable7 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_seven);
        Intrinsics.checkNotNull(drawable7);
        arrayList.add(drawable7);
        Drawable drawable8 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_eight);
        Intrinsics.checkNotNull(drawable8);
        arrayList.add(drawable8);
        Drawable drawable9 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_nine);
        Intrinsics.checkNotNull(drawable9);
        arrayList.add(drawable9);
        Drawable drawable10 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_ten);
        Intrinsics.checkNotNull(drawable10);
        arrayList.add(drawable10);
        Drawable drawable11 = AppCompatResources.getDrawable(requireActivity(), C1188R.C1190drawable.profile_eleven);
        Intrinsics.checkNotNull(drawable11);
        arrayList.add(drawable11);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayList.get(i);
            Intrinsics.checkNotNullExpressionValue(obj, "myImageList[i]");
            this.avatarList.add(new ProfileAvtar((Drawable) obj, false));
        }
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        this.profileAvtarAdapter = new ProfileAvtarAdapter(this, requireActivity);
        ((RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvProfileAvtar)).setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(C1188R.C1192id.rvProfileAvtar);
        ProfileAvtarAdapter profileAvtarAdapter2 = this.profileAvtarAdapter;
        ProfileAvtarAdapter profileAvtarAdapter3 = null;
        if (profileAvtarAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileAvtarAdapter");
            profileAvtarAdapter2 = null;
        }
        recyclerView.setAdapter(profileAvtarAdapter2);
        ProfileAvtarAdapter profileAvtarAdapter4 = this.profileAvtarAdapter;
        if (profileAvtarAdapter4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("profileAvtarAdapter");
        } else {
            profileAvtarAdapter3 = profileAvtarAdapter4;
        }
        profileAvtarAdapter3.addList(this.avatarList);
    }

    private final void openImage() {
        Dexter.withContext(requireActivity()).withPermissions("android.permission.READ_EXTERNAL_STORAGE", "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE").withListener(new ProfileSetUpFragment$openImage$1(this)).check();
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [java.lang.String] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r5, int r6, Intent r7) {
        /*
            r4 = this;
            super.onActivityResult(r5, r6, r7)
            r0 = -1
            r1 = 0
            r2 = 69
            if (r5 != r2) goto L_0x0053
            if (r6 != r0) goto L_0x0053
            if (r7 != 0) goto L_0x0012
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
        L_0x0012:
            android.net.Uri r5 = com.yalantis.ucrop.UCrop.getOutput(r7)
            r4.setImagesAdapter()
            java.io.File r6 = new java.io.File
            if (r5 == 0) goto L_0x0021
            java.lang.String r1 = r5.getPath()
        L_0x0021:
            java.lang.String r5 = java.lang.String.valueOf(r1)
            r6.<init>(r5)
            r4.imageFile = r6
            r5 = r4
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            com.bumptech.glide.RequestManager r5 = com.bumptech.glide.Glide.with((androidx.fragment.app.Fragment) r5)
            java.io.File r6 = r4.imageFile
            com.bumptech.glide.RequestBuilder r5 = r5.load((java.io.File) r6)
            com.bumptech.glide.request.RequestOptions r6 = new com.bumptech.glide.request.RequestOptions
            r6.<init>()
            r7 = 2131165835(0x7f07028b, float:1.7945898E38)
            com.bumptech.glide.request.BaseRequestOptions r6 = r6.placeholder((int) r7)
            com.bumptech.glide.RequestBuilder r5 = r5.apply((com.bumptech.glide.request.BaseRequestOptions<?>) r6)
            int r6 = com.crickpe.C1188R.C1192id.ivProfile
            android.view.View r6 = r4._$_findCachedViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.into((android.widget.ImageView) r6)
            goto L_0x0076
        L_0x0053:
            r2 = 101(0x65, float:1.42E-43)
            java.lang.String r3 = "imagePicker"
            if (r5 != r2) goto L_0x0068
            if (r6 != r0) goto L_0x0068
            com.crickpe.utils.ImagePicker r5 = r4.imagePicker
            if (r5 != 0) goto L_0x0063
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            goto L_0x0064
        L_0x0063:
            r1 = r5
        L_0x0064:
            r1.callCamera()
            goto L_0x0076
        L_0x0068:
            if (r7 == 0) goto L_0x0076
            com.crickpe.utils.ImagePicker r0 = r4.imagePicker
            if (r0 != 0) goto L_0x0072
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
            goto L_0x0073
        L_0x0072:
            r1 = r0
        L_0x0073:
            r1.onActivityResult(r5, r6, r7)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.intro.fragments.login_signup.ProfileSetUpFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    private final void observeData() {
        IntroViewModel introViewModel = this.viewModel;
        if (introViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            introViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<User>> setupProfile = introViewModel.getSetupProfile();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        setupProfile.observe(viewLifecycleOwner, new ProfileSetUpFragment$$ExternalSyntheticLambda0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3785observeData$lambda2(ProfileSetUpFragment profileSetUpFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(profileSetUpFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                User user = (User) apiResponseHandler.getData();
                if (user != null) {
                    try {
                        UserManager userManager = UserManager.INSTANCE;
                        userManager.saveToken("Bearer " + ((User) apiResponseHandler.getData()).getAccessToken());
                        UserManager.INSTANCE.saveProfile(user);
                        profileSetUpFragment.startActivity(new Intent(profileSetUpFragment.requireActivity(), HomeActivity.class));
                    } catch (Exception e) {
                        Log.v("myMatchesdetail", e.toString());
                    }
                }
            } else if (i == 2) {
                RelativeLayout relativeLayout = (RelativeLayout) profileSetUpFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlProgress");
                CommonMethodsKt.hide(relativeLayout);
                FragmentActivity requireActivity = profileSetUpFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                profileSetUpFragment.handleApiError(requireActivity, apiResponseHandler.getError());
            } else if (i == 3) {
                RelativeLayout relativeLayout2 = (RelativeLayout) profileSetUpFragment._$_findCachedViewById(C1188R.C1192id.rlProgress);
                Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlProgress");
                CommonMethodsKt.visible(relativeLayout2);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: com.crickpe.utils.ImagePicker} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.crickpe.utils.ImagePicker} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.lang.Object, okhttp3.RequestBody] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(View r7) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r7 = r7.getId()
            java.lang.String r0 = "imagePicker"
            r1 = 33
            r2 = 0
            r3 = 1
            switch(r7) {
                case 2131296542: goto L_0x011a;
                case 2131296770: goto L_0x0105;
                case 2131297760: goto L_0x0023;
                case 2131297837: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x012e
        L_0x0014:
            r7 = r6
            androidx.fragment.app.Fragment r7 = (androidx.fragment.app.Fragment) r7
            androidx.navigation.NavController r7 = androidx.navigation.fragment.FragmentKt.findNavController(r7)
            r0 = 2131296365(0x7f09006d, float:1.8210645E38)
            r7.navigate((int) r0)
            goto L_0x012e
        L_0x0023:
            java.lang.String r7 = "CLICKKKK"
            android.util.Log.e(r7, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.io.File r0 = r6.imageFile
            if (r0 == 0) goto L_0x0034
            r7.add(r0)
        L_0x0034:
            java.util.Collection r7 = (java.util.Collection) r7     // Catch:{ Exception -> 0x0063 }
            boolean r7 = r7.isEmpty()     // Catch:{ Exception -> 0x0063 }
            r7 = r7 ^ r3
            if (r7 == 0) goto L_0x006d
            java.io.File r7 = r6.imageFile     // Catch:{ Exception -> 0x0063 }
            if (r7 == 0) goto L_0x004f
            okhttp3.RequestBody$Companion r0 = okhttp3.RequestBody.Companion     // Catch:{ Exception -> 0x0063 }
            okhttp3.MediaType$Companion r1 = okhttp3.MediaType.Companion     // Catch:{ Exception -> 0x0063 }
            java.lang.String r2 = "image/jpeg"
            okhttp3.MediaType r1 = r1.parse(r2)     // Catch:{ Exception -> 0x0063 }
            okhttp3.RequestBody r2 = r0.create((java.io.File) r7, (okhttp3.MediaType) r1)     // Catch:{ Exception -> 0x0063 }
        L_0x004f:
            okhttp3.MultipartBody$Part$Companion r7 = okhttp3.MultipartBody.Part.Companion     // Catch:{ Exception -> 0x0063 }
            java.lang.String r0 = "profileImage"
            java.io.File r1 = r6.imageFileName     // Catch:{ Exception -> 0x0063 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ Exception -> 0x0063 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ Exception -> 0x0063 }
            okhttp3.MultipartBody$Part r7 = r7.createFormData(r0, r1, r2)     // Catch:{ Exception -> 0x0063 }
            r6.body = r7     // Catch:{ Exception -> 0x0063 }
            goto L_0x006d
        L_0x0063:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "onClick"
            android.util.Log.e(r0, r7)
        L_0x006d:
            int r7 = com.crickpe.C1188R.C1192id.etName
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.EditText r7 = (android.widget.EditText) r7
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            int r7 = r7.length()
            r0 = 3
            if (r7 >= r0) goto L_0x0097
            androidx.fragment.app.FragmentActivity r7 = r6.requireActivity()
            java.lang.String r0 = "requireActivity()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            android.content.Context r7 = (android.content.Context) r7
            java.lang.String r0 = "Name should contain more than 3 chars!"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            com.crickpe.utils.ExtensionsKt.showToast((android.content.Context) r7, (java.lang.CharSequence) r0)
            return
        L_0x0097:
            int r7 = com.crickpe.C1188R.C1192id.etReferralCode
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.EditText r7 = (android.widget.EditText) r7
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.CharSequence r7 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r7)
            java.lang.String r7 = r7.toString()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x00ba
            goto L_0x00bb
        L_0x00ba:
            r3 = 0
        L_0x00bb:
            if (r3 == 0) goto L_0x0101
            int r7 = com.crickpe.C1188R.C1192id.etReferralCode
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.EditText r7 = (android.widget.EditText) r7
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            int r7 = r7.length()
            r0 = 10
            java.lang.String r1 = "Invalid Referral Phone Number!"
            if (r7 != r0) goto L_0x00fb
            int r7 = com.crickpe.C1188R.C1192id.etReferralCode
            android.view.View r7 = r6._$_findCachedViewById(r7)
            android.widget.EditText r7 = (android.widget.EditText) r7
            android.text.Editable r7 = r7.getText()
            java.lang.String r7 = r7.toString()
            long r2 = java.lang.Long.parseLong(r7)
            r4 = 1
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x00f5
            r6.hitApi()
            goto L_0x012e
        L_0x00f5:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r6.showToast(r1)
            goto L_0x012e
        L_0x00fb:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r6.showToast(r1)
            goto L_0x012e
        L_0x0101:
            r6.hitApi()
            goto L_0x012e
        L_0x0105:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r1) goto L_0x0116
            com.crickpe.utils.ImagePicker r7 = r6.imagePicker
            if (r7 != 0) goto L_0x0111
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L_0x0112
        L_0x0111:
            r2 = r7
        L_0x0112:
            r2.showImagePicker(r3)
            goto L_0x012e
        L_0x0116:
            r6.openImage()
            goto L_0x012e
        L_0x011a:
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r1) goto L_0x012b
            com.crickpe.utils.ImagePicker r7 = r6.imagePicker
            if (r7 != 0) goto L_0x0126
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)
            goto L_0x0127
        L_0x0126:
            r2 = r7
        L_0x0127:
            r2.showImagePicker(r3)
            goto L_0x012e
        L_0x012b:
            r6.openImage()
        L_0x012e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.intro.fragments.login_signup.ProfileSetUpFragment.onClick(android.view.View):void");
    }

    private final void hitApi() {
        RequestBody create = RequestBody.Companion.create(((EditText) _$_findCachedViewById(C1188R.C1192id.etReferralCode)).getText().toString(), MediaType.Companion.parse("multipart/form-data"));
        RequestBody create2 = RequestBody.Companion.create(((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).getText().toString(), MediaType.Companion.parse("multipart/form-data"));
        if (((EditText) _$_findCachedViewById(C1188R.C1192id.etName)).getText().toString().length() == 0) {
            FragmentActivity requireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
            String string = getResources().getString(C1188R.string.please_enter_your_name);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.st…g.please_enter_your_name)");
            ExtensionsKt.showToast((Context) requireActivity, (CharSequence) string);
        } else if (this.body != null) {
            IntroViewModel introViewModel = this.viewModel;
            if (introViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                introViewModel = null;
            }
            MultipartBody.Part part = this.body;
            Intrinsics.checkNotNull(part);
            introViewModel.apiSetupProfile(part, create2, create);
        } else {
            String string2 = getResources().getString(C1188R.string.please_set_your_profile_picture);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.st…set_your_profile_picture)");
            showToast(string2);
        }
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
        this.imageFile = file;
        Glide.with(requireActivity()).load(file).apply((BaseRequestOptions<?>) new RequestOptions().placeholder((int) C1188R.C1190drawable.ic_add)).into((ImageView) _$_findCachedViewById(C1188R.C1192id.ivProfile));
    }

    public void onItemClicked(ProfileAvtar profileAvtar) {
        Intrinsics.checkNotNullParameter(profileAvtar, "profileAvtar");
        Bitmap convertToBitmap = convertToBitmap(profileAvtar.getImage_id(), 100, 100);
        ((ImageView) _$_findCachedViewById(C1188R.C1192id.ivProfile)).setImageBitmap(convertToBitmap);
        this.imageFile = bitmapToFile(convertToBitmap);
    }
}
