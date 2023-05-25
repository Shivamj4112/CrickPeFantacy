package com.crickpe.view.detail.fragments.create_contest;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.fragment.FragmentKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.C1188R;
import com.crickpe.base.BaseFragment;
import com.crickpe.databinding.FragmentShareContestBinding;
import com.crickpe.utils.CommonMethodsKt;
import com.crickpe.utils.SingleLiveEvent;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.Status;
import com.crickpe.utils.local.PrefsManager;
import com.crickpe.utils.local.UserManager;
import com.crickpe.view.detail.DetailActivity;
import com.crickpe.view.detail.DetailViewModel;
import com.crickpe.view.detail.adapters.ContactAdapter;
import com.crickpe.view.detail.adapters.PreviousContactsAdapter;
import com.crickpe.view.detail.adapters.PreviousContactsDialogAdapter;
import com.crickpe.view.detail.adapters.SelectedContactsAdapter;
import com.crickpe.view.detail.fragments.create_contest.models.PreviousContactsModel;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.Contact;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.InviteSentModel;
import com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.SendInviteRequest;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest;
import com.crickpe.view.detail.fragments.create_own_team.join_contest.ContestDetailModel;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.GlobalScope;
import pub.devrel.easypermissions.EasyPermissions;

@Metadata(mo48221d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006J\b\u0010I\u001a\u00020JH\u0002J\b\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u00020L2\b\u0010N\u001a\u0004\u0018\u00010$J\b\u0010O\u001a\u00020LH\u0002J\b\u0010P\u001a\u00020QH\u0016J\b\u0010R\u001a\u00020LH\u0002J\b\u0010S\u001a\u00020LH\u0002J\b\u0010T\u001a\u00020LH\u0002J\u0010\u0010U\u001a\u00020L2\u0006\u0010V\u001a\u00020\bH\u0016J\u0010\u0010W\u001a\u00020L2\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010W\u001a\u00020L2\u0006\u0010Z\u001a\u000208H\u0016J\u0010\u0010[\u001a\u00020L2\u0006\u0010\\\u001a\u00020\u0011H\u0016J\u0010\u0010]\u001a\u00020L2\u0006\u0010^\u001a\u00020\u0011H\u0016J\u001a\u0010_\u001a\u00020L2\u0006\u0010X\u001a\u00020Y2\b\u0010`\u001a\u0004\u0018\u00010aH\u0016J$\u0010b\u001a\u00020L2\u001a\u0010A\u001a\u0016\u0012\u0004\u0012\u000208\u0018\u00010\u0010j\n\u0012\u0004\u0012\u000208\u0018\u0001`\u0012H\u0002J\b\u0010/\u001a\u00020LH\u0002J\u001e\u0010c\u001a\u00020L2\u0016\u0010d\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012J\u0010\u0010e\u001a\u00020L2\u0006\u0010f\u001a\u00020gH\u0002J0\u0010h\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u00122\u0016\u0010i\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012H\u0002R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R.\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u000100X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X.¢\u0006\u0002\n\u0000R.\u00107\u001a\u0016\u0012\u0004\u0012\u000208\u0018\u00010\u0010j\n\u0012\u0004\u0012\u000208\u0018\u0001`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0014\"\u0004\b:\u0010\u0016R\u001c\u0010;\u001a\u0004\u0018\u00010<X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R.\u0010A\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0014\"\u0004\bC\u0010\u0016R.\u0010D\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u0014\"\u0004\bF\u0010\u0016R\u000e\u0010G\u001a\u00020HX.¢\u0006\u0002\n\u0000¨\u0006j"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_contest/ShareContestFragment;", "Lcom/crickpe/base/BaseFragment;", "Landroid/view/View$OnClickListener;", "Lcom/crickpe/view/detail/adapters/ContactAdapter$OnItemClicked;", "Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter$DialogItemClick;", "Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter$OnRemoveItem;", "()V", "appContext", "Landroid/content/Context;", "getAppContext", "()Landroid/content/Context;", "setAppContext", "(Landroid/content/Context;)V", "binding", "Lcom/crickpe/databinding/FragmentShareContestBinding;", "contactListMain", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_contest/send_invite_friend_request/ContactRequest;", "Lkotlin/collections/ArrayList;", "getContactListMain", "()Ljava/util/ArrayList;", "setContactListMain", "(Ljava/util/ArrayList;)V", "contactsAdapter", "Lcom/crickpe/view/detail/adapters/ContactAdapter;", "getContactsAdapter", "()Lcom/crickpe/view/detail/adapters/ContactAdapter;", "setContactsAdapter", "(Lcom/crickpe/view/detail/adapters/ContactAdapter;)V", "contestDetailData", "Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "getContestDetailData", "()Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;", "setContestDetailData", "(Lcom/crickpe/view/detail/fragments/create_own_team/join_contest/Contest;)V", "from", "", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "previousContactsAdapter", "Lcom/crickpe/view/detail/adapters/PreviousContactsAdapter;", "getPreviousContactsAdapter", "()Lcom/crickpe/view/detail/adapters/PreviousContactsAdapter;", "setPreviousContactsAdapter", "(Lcom/crickpe/view/detail/adapters/PreviousContactsAdapter;)V", "previousContactsDialog", "Landroid/app/Dialog;", "getPreviousContactsDialog", "()Landroid/app/Dialog;", "setPreviousContactsDialog", "(Landroid/app/Dialog;)V", "previousContactsDialogAdapter", "Lcom/crickpe/view/detail/adapters/PreviousContactsDialogAdapter;", "previousContactsList", "Lcom/crickpe/view/detail/fragments/create_contest/models/PreviousContactsModel;", "getPreviousContactsList", "setPreviousContactsList", "selectedContactsAdapter", "Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter;", "getSelectedContactsAdapter", "()Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter;", "setSelectedContactsAdapter", "(Lcom/crickpe/view/detail/adapters/SelectedContactsAdapter;)V", "selectedList", "getSelectedList", "setSelectedList", "selectedListFinal", "getSelectedListFinal", "setSelectedListFinal", "viewModel", "Lcom/crickpe/view/detail/DetailViewModel;", "checkWriteExternalPermission", "", "fetchContacts", "", "filter", "text", "getContact", "getFragmentLayoutResId", "", "goToContestCongratulation", "listeners", "observeData", "onAttach", "context", "onClick", "view", "Landroid/view/View;", "pre", "onItemClicked", "user", "onRemoveItem", "contact", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "previousContactAdapter", "setAdapter", "list", "setDialogAdapter", "rvDialog", "Landroidx/recyclerview/widget/RecyclerView;", "sortAlphabetically", "arrayList", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: ShareContestFragment.kt */
public final class ShareContestFragment extends BaseFragment implements View.OnClickListener, ContactAdapter.OnItemClicked, PreviousContactsDialogAdapter.DialogItemClick, SelectedContactsAdapter.OnRemoveItem {
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Context appContext;
    private FragmentShareContestBinding binding;
    private ArrayList<ContactRequest> contactListMain = new ArrayList<>();
    private ContactAdapter contactsAdapter;
    private Contest contestDetailData;
    private String from = "";
    private PreviousContactsAdapter previousContactsAdapter;
    private Dialog previousContactsDialog;
    private PreviousContactsDialogAdapter previousContactsDialogAdapter;
    private ArrayList<PreviousContactsModel> previousContactsList;
    private SelectedContactsAdapter selectedContactsAdapter;
    private ArrayList<ContactRequest> selectedList;
    private ArrayList<ContactRequest> selectedListFinal;
    private DetailViewModel viewModel;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: ShareContestFragment.kt */
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
        return C1188R.C1193layout.fragment_share_contest;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Contest getContestDetailData() {
        return this.contestDetailData;
    }

    public final void setContestDetailData(Contest contest) {
        this.contestDetailData = contest;
    }

    public final String getFrom() {
        return this.from;
    }

    public final void setFrom(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.from = str;
    }

    public final ArrayList<ContactRequest> getContactListMain() {
        return this.contactListMain;
    }

    public final void setContactListMain(ArrayList<ContactRequest> arrayList) {
        this.contactListMain = arrayList;
    }

    public final SelectedContactsAdapter getSelectedContactsAdapter() {
        return this.selectedContactsAdapter;
    }

    public final void setSelectedContactsAdapter(SelectedContactsAdapter selectedContactsAdapter2) {
        this.selectedContactsAdapter = selectedContactsAdapter2;
    }

    public final PreviousContactsAdapter getPreviousContactsAdapter() {
        return this.previousContactsAdapter;
    }

    public final void setPreviousContactsAdapter(PreviousContactsAdapter previousContactsAdapter2) {
        this.previousContactsAdapter = previousContactsAdapter2;
    }

    public final ContactAdapter getContactsAdapter() {
        return this.contactsAdapter;
    }

    public final void setContactsAdapter(ContactAdapter contactAdapter) {
        this.contactsAdapter = contactAdapter;
    }

    public final Dialog getPreviousContactsDialog() {
        return this.previousContactsDialog;
    }

    public final void setPreviousContactsDialog(Dialog dialog) {
        this.previousContactsDialog = dialog;
    }

    public final ArrayList<ContactRequest> getSelectedList() {
        return this.selectedList;
    }

    public final void setSelectedList(ArrayList<ContactRequest> arrayList) {
        this.selectedList = arrayList;
    }

    public final ArrayList<ContactRequest> getSelectedListFinal() {
        return this.selectedListFinal;
    }

    public final void setSelectedListFinal(ArrayList<ContactRequest> arrayList) {
        this.selectedListFinal = arrayList;
    }

    public final ArrayList<PreviousContactsModel> getPreviousContactsList() {
        return this.previousContactsList;
    }

    public final void setPreviousContactsList(ArrayList<PreviousContactsModel> arrayList) {
        this.previousContactsList = arrayList;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        this.binding = FragmentShareContestBinding.bind(view);
        this.viewModel = (DetailViewModel) new ViewModelProvider(this).get(DetailViewModel.class);
        if (getArguments() != null) {
            String string = requireArguments().getString(PrefsManager.CONTEST_DATA);
            String string2 = requireArguments().getString("from", "");
            Intrinsics.checkNotNullExpressionValue(string2, "requireArguments().getString(\"from\", \"\")");
            this.from = string2;
            this.contestDetailData = (Contest) new Gson().fromJson(string, Contest.class);
            DetailViewModel detailViewModel = this.viewModel;
            DetailViewModel detailViewModel2 = null;
            if (detailViewModel == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                detailViewModel = null;
            }
            Contest contest = this.contestDetailData;
            Intrinsics.checkNotNull(contest);
            detailViewModel.getContestDetailApiByCode(contest.getReferalCode());
            DetailViewModel detailViewModel3 = this.viewModel;
            if (detailViewModel3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            } else {
                detailViewModel2 = detailViewModel3;
            }
            detailViewModel2.getPreviousContacts();
        }
        if (Intrinsics.areEqual((Object) this.from, (Object) "watch")) {
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlShare1);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "rlShare1");
            CommonMethodsKt.visible(relativeLayout);
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(C1188R.C1192id.rlShare2);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "rlShare2");
            CommonMethodsKt.visible(relativeLayout2);
        } else {
            TextView textView = (TextView) _$_findCachedViewById(C1188R.C1192id.tvJoinPeople);
            Intrinsics.checkNotNullExpressionValue(textView, "tvJoinPeople");
            CommonMethodsKt.visible(textView);
        }
        listeners();
        observeData();
        this.selectedList = new ArrayList<>();
        this.selectedListFinal = new ArrayList<>();
        this.previousContactsList = new ArrayList<>();
        previousContactsDialog();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ((DetailActivity) activity).setTopBar("Invite Friends", true, false, false, false, false, false, false);
            getContact();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.crickpe.view.detail.DetailActivity");
    }

    private final void getContact() {
        this.contactListMain = new ArrayList<>();
        Gson gson = new Gson();
        String valueOf = String.valueOf(UserManager.INSTANCE.getContacts());
        Type type = new ShareContestFragment$getContact$type$1().getType();
        Intrinsics.checkNotNullExpressionValue(type, "object : TypeToken<List<…tactRequest?>?>() {}.type");
        ArrayList<ContactRequest> arrayList = (ArrayList) gson.fromJson(valueOf, type);
        this.contactListMain = arrayList;
        if (arrayList != null) {
            HashSet hashSet = new HashSet();
            ArrayList<ContactRequest> arrayList2 = this.contactListMain;
            Intrinsics.checkNotNull(arrayList2);
            hashSet.addAll(arrayList2);
            ArrayList<ContactRequest> arrayList3 = this.contactListMain;
            Intrinsics.checkNotNull(arrayList3);
            arrayList3.clear();
            ArrayList<ContactRequest> arrayList4 = this.contactListMain;
            Intrinsics.checkNotNull(arrayList4);
            arrayList4.addAll(hashSet);
        }
        ArrayList<ContactRequest> arrayList5 = this.contactListMain;
        Log.v("List_Updated0", String.valueOf(arrayList5 != null ? Integer.valueOf(arrayList5.size()) : null));
        if (this.contactListMain == null) {
            fetchContacts();
        }
    }

    private final void previousContactsDialog() {
        Dialog dialog = new Dialog(requireActivity());
        this.previousContactsDialog = dialog;
        Intrinsics.checkNotNull(dialog);
        dialog.requestWindowFeature(1);
        Dialog dialog2 = this.previousContactsDialog;
        Intrinsics.checkNotNull(dialog2);
        dialog2.setCancelable(false);
        Dialog dialog3 = this.previousContactsDialog;
        Intrinsics.checkNotNull(dialog3);
        dialog3.setContentView(C1188R.C1193layout.dialog_recycler_view);
        Dialog dialog4 = this.previousContactsDialog;
        Intrinsics.checkNotNull(dialog4);
        View findViewById = dialog4.findViewById(C1188R.C1192id.tvSelect);
        if (findViewById != null) {
            TextView textView = (TextView) findViewById;
            Dialog dialog5 = this.previousContactsDialog;
            Intrinsics.checkNotNull(dialog5);
            View findViewById2 = dialog5.findViewById(C1188R.C1192id.rvDialog);
            if (findViewById2 != null) {
                RecyclerView recyclerView = (RecyclerView) findViewById2;
                Dialog dialog6 = this.previousContactsDialog;
                Intrinsics.checkNotNull(dialog6);
                View findViewById3 = dialog6.findViewById(C1188R.C1192id.ivCloseCountry);
                if (findViewById3 != null) {
                    ImageView imageView = (ImageView) findViewById3;
                    Dialog dialog7 = this.previousContactsDialog;
                    Intrinsics.checkNotNull(dialog7);
                    View findViewById4 = dialog7.findViewById(C1188R.C1192id.tvTitle);
                    if (findViewById4 != null) {
                        imageView.setOnClickListener(this);
                        ((TextView) findViewById4).setText(getString(C1188R.string.previous_contacts));
                        textView.setText(getString(C1188R.string.send_invitation));
                        Dialog dialog8 = this.previousContactsDialog;
                        Intrinsics.checkNotNull(dialog8);
                        Window window = dialog8.getWindow();
                        Intrinsics.checkNotNull(window);
                        window.setBackgroundDrawableResource(17170445);
                        CommonMethodsKt.visible(textView);
                        window.setLayout(-1, -1);
                        setDialogAdapter(recyclerView);
                        textView.setOnClickListener(new ShareContestFragment$$ExternalSyntheticLambda3(this));
                        imageView.setOnClickListener(new ShareContestFragment$$ExternalSyntheticLambda4(this));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* access modifiers changed from: private */
    /* renamed from: previousContactsDialog$lambda-0  reason: not valid java name */
    public static final void m3512previousContactsDialog$lambda0(ShareContestFragment shareContestFragment, View view) {
        Intrinsics.checkNotNullParameter(shareContestFragment, "this$0");
        Dialog dialog = shareContestFragment.previousContactsDialog;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
        ArrayList arrayList = new ArrayList();
        ArrayList<PreviousContactsModel> arrayList2 = shareContestFragment.previousContactsList;
        Intrinsics.checkNotNull(arrayList2);
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            ArrayList<PreviousContactsModel> arrayList3 = shareContestFragment.previousContactsList;
            Intrinsics.checkNotNull(arrayList3);
            String name = arrayList3.get(i).getUser().getName();
            ArrayList<PreviousContactsModel> arrayList4 = shareContestFragment.previousContactsList;
            Intrinsics.checkNotNull(arrayList4);
            arrayList.add(new Contact(name, arrayList4.get(i).getUser().getMobileNo()));
        }
        Contest contest = shareContestFragment.contestDetailData;
        DetailViewModel detailViewModel = null;
        String valueOf = String.valueOf(contest != null ? contest.get_id() : null);
        Contest contest2 = shareContestFragment.contestDetailData;
        SendInviteRequest sendInviteRequest = new SendInviteRequest(valueOf, String.valueOf(contest2 != null ? contest2.getMatchId() : null), arrayList);
        DetailViewModel detailViewModel2 = shareContestFragment.viewModel;
        if (detailViewModel2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel = detailViewModel2;
        }
        detailViewModel.sendInviteApi(sendInviteRequest);
    }

    /* access modifiers changed from: private */
    /* renamed from: previousContactsDialog$lambda-1  reason: not valid java name */
    public static final void m3513previousContactsDialog$lambda1(ShareContestFragment shareContestFragment, View view) {
        Intrinsics.checkNotNullParameter(shareContestFragment, "this$0");
        Dialog dialog = shareContestFragment.previousContactsDialog;
        Intrinsics.checkNotNull(dialog);
        dialog.dismiss();
    }

    private final void setDialogAdapter(RecyclerView recyclerView) {
        FragmentActivity requireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
        PreviousContactsDialogAdapter previousContactsDialogAdapter2 = new PreviousContactsDialogAdapter(this, requireActivity);
        this.previousContactsDialogAdapter = previousContactsDialogAdapter2;
        recyclerView.setAdapter(previousContactsDialogAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        PreviousContactsDialogAdapter previousContactsDialogAdapter3 = this.previousContactsDialogAdapter;
        if (previousContactsDialogAdapter3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("previousContactsDialogAdapter");
            previousContactsDialogAdapter3 = null;
        }
        recyclerView.setAdapter(previousContactsDialogAdapter3);
    }

    private final void listeners() {
        FragmentShareContestBinding fragmentShareContestBinding = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding);
        View.OnClickListener onClickListener = this;
        fragmentShareContestBinding.rlInviteFrnd.setOnClickListener(onClickListener);
        FragmentShareContestBinding fragmentShareContestBinding2 = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding2);
        fragmentShareContestBinding2.llShareReferalCode.setOnClickListener(onClickListener);
        FragmentShareContestBinding fragmentShareContestBinding3 = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding3);
        fragmentShareContestBinding3.llShareReferalLink.setOnClickListener(onClickListener);
        FragmentShareContestBinding fragmentShareContestBinding4 = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding4);
        fragmentShareContestBinding4.tvDone.setOnClickListener(onClickListener);
        FragmentShareContestBinding fragmentShareContestBinding5 = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding5);
        fragmentShareContestBinding5.llCopyLink.setOnClickListener(onClickListener);
        FragmentShareContestBinding fragmentShareContestBinding6 = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding6);
        fragmentShareContestBinding6.llCopyCode.setOnClickListener(onClickListener);
        FragmentShareContestBinding fragmentShareContestBinding7 = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding7);
        fragmentShareContestBinding7.tvInvitePeople.setOnClickListener(onClickListener);
        FragmentShareContestBinding fragmentShareContestBinding8 = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding8);
        fragmentShareContestBinding8.bottomSheetContact.ivBack.setOnClickListener(onClickListener);
        FragmentShareContestBinding fragmentShareContestBinding9 = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding9);
        fragmentShareContestBinding9.bottomSheetContact.tvDoneSheet.setOnClickListener(onClickListener);
        FragmentShareContestBinding fragmentShareContestBinding10 = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding10);
        fragmentShareContestBinding10.bottomSheetContact.etSearch.addTextChangedListener(new ShareContestFragment$listeners$1(this));
    }

    public final void filter(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            if (!Intrinsics.areEqual((Object) str, (Object) "")) {
                ArrayList<ContactRequest> arrayList2 = this.contactListMain;
                if (arrayList2 != null) {
                    Intrinsics.checkNotNull(arrayList2);
                    Iterator<ContactRequest> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ContactRequest next = it.next();
                        String lowerCase = next.getName().toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                        String lowerCase2 = String.valueOf(str).toLowerCase();
                        Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase()");
                        if (StringsKt.contains$default((CharSequence) lowerCase, (CharSequence) lowerCase2, false, 2, (Object) null)) {
                            arrayList.add(next);
                        }
                    }
                }
                ContactAdapter contactAdapter = this.contactsAdapter;
                Intrinsics.checkNotNull(contactAdapter);
                contactAdapter.updateList(arrayList);
            } else if (this.contactListMain != null) {
                ContactAdapter contactAdapter2 = this.contactsAdapter;
                Intrinsics.checkNotNull(contactAdapter2);
                ArrayList<ContactRequest> arrayList3 = this.contactListMain;
                Intrinsics.checkNotNull(arrayList3);
                contactAdapter2.updateList(arrayList3);
            }
        } catch (Exception e) {
            Log.v("CATCH_EXE", e.toString());
        }
    }

    private final boolean checkWriteExternalPermission() {
        return requireActivity().checkCallingOrSelfPermission("android.permission.READ_CONTACTS") == 0;
    }

    private final void observeData() {
        DetailViewModel detailViewModel = this.viewModel;
        DetailViewModel detailViewModel2 = null;
        if (detailViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel = null;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<PreviousContactsModel>>> getPreviousContacts = detailViewModel.getGetPreviousContacts();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "viewLifecycleOwner");
        getPreviousContacts.observe(viewLifecycleOwner, new ShareContestFragment$$ExternalSyntheticLambda0(this));
        DetailViewModel detailViewModel3 = this.viewModel;
        if (detailViewModel3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            detailViewModel3 = null;
        }
        SingleLiveEvent<ApiResponseHandler<ContestDetailModel>> contestDetailModel = detailViewModel3.getContestDetailModel();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "viewLifecycleOwner");
        contestDetailModel.observe(viewLifecycleOwner2, new ShareContestFragment$$ExternalSyntheticLambda1(this));
        DetailViewModel detailViewModel4 = this.viewModel;
        if (detailViewModel4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel2 = detailViewModel4;
        }
        SingleLiveEvent<ApiResponseHandler<ArrayList<InviteSentModel>>> sendInvite = detailViewModel2.getSendInvite();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "viewLifecycleOwner");
        sendInvite.observe(viewLifecycleOwner3, new ShareContestFragment$$ExternalSyntheticLambda2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-2  reason: not valid java name */
    public static final void m3509observeData$lambda2(ShareContestFragment shareContestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(shareContestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) shareContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ArrayList arrayList = (ArrayList) apiResponseHandler.getData();
                if (arrayList != null) {
                    if (arrayList.size() > 0) {
                        FragmentShareContestBinding fragmentShareContestBinding = shareContestFragment.binding;
                        Intrinsics.checkNotNull(fragmentShareContestBinding);
                        RelativeLayout relativeLayout = fragmentShareContestBinding.rlInviteFrnd;
                        Intrinsics.checkNotNullExpressionValue(relativeLayout, "binding!!.rlInviteFrnd");
                        CommonMethodsKt.visible(relativeLayout);
                    } else {
                        FragmentShareContestBinding fragmentShareContestBinding2 = shareContestFragment.binding;
                        Intrinsics.checkNotNull(fragmentShareContestBinding2);
                        RelativeLayout relativeLayout2 = fragmentShareContestBinding2.rlInviteFrnd;
                        Intrinsics.checkNotNullExpressionValue(relativeLayout2, "binding!!.rlInviteFrnd");
                        CommonMethodsKt.hide(relativeLayout2);
                    }
                    shareContestFragment.previousContactAdapter(arrayList);
                    try {
                        PreviousContactsDialogAdapter previousContactsDialogAdapter2 = shareContestFragment.previousContactsDialogAdapter;
                        if (previousContactsDialogAdapter2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("previousContactsDialogAdapter");
                            previousContactsDialogAdapter2 = null;
                        }
                        previousContactsDialogAdapter2.addList(true, arrayList);
                    } catch (Exception unused) {
                    }
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = shareContestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                shareContestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ErROR", String.valueOf(apiResponseHandler.getData()));
                ProgressBar progressBar2 = (ProgressBar) shareContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) shareContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-3  reason: not valid java name */
    public static final void m3510observeData$lambda3(ShareContestFragment shareContestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(shareContestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) shareContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                ContestDetailModel contestDetailModel = (ContestDetailModel) apiResponseHandler.getData();
                if (contestDetailModel != null) {
                    FragmentShareContestBinding fragmentShareContestBinding = shareContestFragment.binding;
                    Intrinsics.checkNotNull(fragmentShareContestBinding);
                    fragmentShareContestBinding.setModel(contestDetailModel);
                }
            } else if (i == 2) {
                FragmentActivity requireActivity = shareContestFragment.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity()");
                shareContestFragment.handleApiError(requireActivity, apiResponseHandler.getError());
                Log.v("ErROR", String.valueOf(apiResponseHandler.getData()));
                ProgressBar progressBar2 = (ProgressBar) shareContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) shareContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: observeData$lambda-4  reason: not valid java name */
    public static final void m3511observeData$lambda4(ShareContestFragment shareContestFragment, ApiResponseHandler apiResponseHandler) {
        Intrinsics.checkNotNullParameter(shareContestFragment, "this$0");
        if (apiResponseHandler != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[apiResponseHandler.getStatus().ordinal()];
            if (i == 1) {
                ProgressBar progressBar = (ProgressBar) shareContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar, "progressBar");
                CommonMethodsKt.hide(progressBar);
                if (((ArrayList) apiResponseHandler.getData()) != null) {
                    shareContestFragment.showToast("Invite sent successfully");
                    if (Intrinsics.areEqual((Object) shareContestFragment.from, (Object) "watch")) {
                        shareContestFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                        shareContestFragment.requireActivity().getOnBackPressedDispatcher().onBackPressed();
                    }
                }
            } else if (i == 2) {
                Log.v("ErROR", String.valueOf(apiResponseHandler.getData()));
                ProgressBar progressBar2 = (ProgressBar) shareContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar2, "progressBar");
                CommonMethodsKt.hide(progressBar2);
            } else if (i == 3) {
                ProgressBar progressBar3 = (ProgressBar) shareContestFragment._$_findCachedViewById(C1188R.C1192id.progressBar);
                Intrinsics.checkNotNullExpressionValue(progressBar3, "progressBar");
                CommonMethodsKt.visible(progressBar3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x00ea A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(View r15) {
        /*
            r14 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            int r15 = r15.getId()
            r0 = 2131952236(0x7f13026c, float:1.954091E38)
            java.lang.String r1 = "android.intent.extra.TEXT"
            java.lang.String r2 = "null cannot be cast to non-null type android.content.ClipboardManager"
            r3 = 2131951667(0x7f130033, float:1.9539755E38)
            java.lang.String r4 = "text/plain"
            java.lang.String r5 = "android.intent.action.SEND"
            java.lang.String r6 = "clipboard"
            java.lang.String r7 = "loadAnimation(context, R.anim.slide_out_down)"
            r8 = 2130772025(0x7f010039, float:1.7147157E38)
            java.lang.String r9 = ""
            java.lang.String r10 = "requireActivity()"
            java.lang.String r11 = "binding!!.bottomSheetContact.rlContacts"
            java.lang.String r12 = "Exception_share"
            r13 = 0
            switch(r15) {
                case 2131296773: goto L_0x0374;
                case 2131297010: goto L_0x032a;
                case 2131297011: goto L_0x02de;
                case 2131297043: goto L_0x02ae;
                case 2131297044: goto L_0x027e;
                case 2131297336: goto L_0x026e;
                case 2131297790: goto L_0x01a3;
                case 2131297791: goto L_0x0116;
                case 2131297819: goto L_0x002c;
                default: goto L_0x002a;
            }
        L_0x002a:
            goto L_0x03c1
        L_0x002c:
            com.crickpe.databinding.FragmentShareContestBinding r15 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            com.crickpe.databinding.BottomSheetContactsBinding r15 = r15.bottomSheetContact
            android.widget.RelativeLayout r15 = r15.rlContacts
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r11)
            android.view.View r15 = (android.view.View) r15
            com.crickpe.utils.CommonMethodsKt.visible(r15)
            android.content.Context r15 = r14.getContext()
            r0 = 2130772023(0x7f010037, float:1.7147153E38)
            android.view.animation.Animation r15 = android.view.animation.AnimationUtils.loadAnimation(r15, r0)
            java.lang.String r0 = "loadAnimation(context, R.anim.slide_in_up)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)
            com.crickpe.databinding.FragmentShareContestBinding r0 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.crickpe.databinding.BottomSheetContactsBinding r0 = r0.bottomSheetContact
            android.widget.RelativeLayout r0 = r0.rlContacts
            r0.startAnimation(r15)
            java.util.ArrayList<com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest> r15 = r14.contactListMain
            if (r15 == 0) goto L_0x03c1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            java.util.ArrayList r15 = r14.sortAlphabetically(r15)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r1 = (java.util.List) r1
            int r2 = r15.size()
            r3 = 0
        L_0x0075:
            if (r3 >= r2) goto L_0x00ed
            java.util.ArrayList<com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest> r4 = r14.contactListMain
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            java.lang.Object r4 = r4.get(r3)
            com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest r4 = (com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest) r4
            java.lang.String r4 = r4.getName()
            if (r4 == 0) goto L_0x00ea
            r5 = r4
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r6 = r5.length()
            r7 = 1
            int r6 = r6 - r7
            r8 = 0
            r9 = 0
        L_0x0093:
            if (r8 > r6) goto L_0x00b8
            if (r9 != 0) goto L_0x0099
            r10 = r8
            goto L_0x009a
        L_0x0099:
            r10 = r6
        L_0x009a:
            char r10 = r5.charAt(r10)
            r11 = 32
            int r10 = kotlin.jvm.internal.Intrinsics.compare((int) r10, (int) r11)
            if (r10 > 0) goto L_0x00a8
            r10 = 1
            goto L_0x00a9
        L_0x00a8:
            r10 = 0
        L_0x00a9:
            if (r9 != 0) goto L_0x00b2
            if (r10 != 0) goto L_0x00af
            r9 = 1
            goto L_0x0093
        L_0x00af:
            int r8 = r8 + 1
            goto L_0x0093
        L_0x00b2:
            if (r10 != 0) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            int r6 = r6 + -1
            goto L_0x0093
        L_0x00b8:
            int r6 = r6 + 1
            java.lang.CharSequence r5 = r5.subSequence(r8, r6)
            java.lang.String r5 = r5.toString()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 != 0) goto L_0x00cc
            r5 = 1
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            if (r5 == 0) goto L_0x00d0
            goto L_0x00ea
        L_0x00d0:
            java.lang.String r4 = r4.substring(r13, r7)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            boolean r5 = r1.contains(r4)
            if (r5 != 0) goto L_0x00ea
            r1.add(r4)
            com.viethoa.models.AlphabetItem r5 = new com.viethoa.models.AlphabetItem
            r5.<init>(r3, r4, r13)
            r0.add(r5)
        L_0x00ea:
            int r3 = r3 + 1
            goto L_0x0075
        L_0x00ed:
            int r0 = r15.size()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "LISTTT"
            android.util.Log.v(r1, r0)
            com.crickpe.view.detail.adapters.ContactAdapter r0 = new com.crickpe.view.detail.adapters.ContactAdapter
            r1 = r14
            com.crickpe.view.detail.adapters.ContactAdapter$OnItemClicked r1 = (com.crickpe.view.detail.adapters.ContactAdapter.OnItemClicked) r1
            r0.<init>(r1, r15)
            r14.contactsAdapter = r0
            com.crickpe.databinding.FragmentShareContestBinding r15 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            com.crickpe.databinding.BottomSheetContactsBinding r15 = r15.bottomSheetContact
            androidx.recyclerview.widget.RecyclerView r15 = r15.rvContacts
            com.crickpe.view.detail.adapters.ContactAdapter r0 = r14.contactsAdapter
            androidx.recyclerview.widget.RecyclerView$Adapter r0 = (androidx.recyclerview.widget.RecyclerView.Adapter) r0
            r15.setAdapter(r0)
            goto L_0x03c1
        L_0x0116:
            androidx.fragment.app.FragmentActivity r15 = r14.requireActivity()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r10)
            android.content.Context r15 = (android.content.Context) r15
            com.crickpe.databinding.FragmentShareContestBinding r0 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.crickpe.databinding.BottomSheetContactsBinding r0 = r0.bottomSheetContact
            android.widget.TextView r0 = r0.tvDoneSheet
            android.view.View r0 = (android.view.View) r0
            com.crickpe.utils.CommonMethodsKt.hideKeyboard(r15, r0)
            com.crickpe.databinding.FragmentShareContestBinding r15 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            com.crickpe.databinding.BottomSheetContactsBinding r15 = r15.bottomSheetContact
            android.widget.EditText r15 = r15.etSearch
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r15.setText(r9)
            com.crickpe.databinding.FragmentShareContestBinding r15 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            com.crickpe.databinding.BottomSheetContactsBinding r15 = r15.bottomSheetContact
            android.widget.RelativeLayout r15 = r15.rlContacts
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r11)
            android.view.View r15 = (android.view.View) r15
            com.crickpe.utils.CommonMethodsKt.hide(r15)
            android.content.Context r15 = r14.getContext()
            android.view.animation.Animation r15 = android.view.animation.AnimationUtils.loadAnimation(r15, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r7)
            com.crickpe.databinding.FragmentShareContestBinding r0 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.crickpe.databinding.BottomSheetContactsBinding r0 = r0.bottomSheetContact
            android.widget.RelativeLayout r0 = r0.rlContacts
            r0.startAnimation(r15)
            java.util.ArrayList<com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest> r15 = r14.selectedList
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            r14.setAdapter(r15)
            java.util.ArrayList<com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest> r15 = r14.selectedList
            r14.selectedListFinal = r15
            com.crickpe.databinding.FragmentShareContestBinding r15 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            androidx.core.widget.NestedScrollView r15 = r15.nestedScrollView2
            r0 = 130(0x82, float:1.82E-43)
            r15.fullScroll(r0)
            com.crickpe.databinding.FragmentShareContestBinding r15 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            android.widget.TextView r15 = r15.tvNumberOfInvitation
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.ArrayList<com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest> r1 = r14.selectedListFinal
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r1 = " people from your contacts are invited"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r15.setText(r0)
            goto L_0x03c1
        L_0x01a3:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList<com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest> r0 = r14.selectedListFinal
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.size()
        L_0x01b1:
            if (r13 >= r0) goto L_0x01dc
            com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.Contact r1 = new com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.Contact
            java.util.ArrayList<com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest> r2 = r14.selectedListFinal
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            java.lang.Object r2 = r2.get(r13)
            com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest r2 = (com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest) r2
            java.lang.String r2 = r2.getName()
            java.util.ArrayList<com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest> r3 = r14.selectedListFinal
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
            java.lang.Object r3 = r3.get(r13)
            com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest r3 = (com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.ContactRequest) r3
            java.lang.String r3 = r3.getMobileNo()
            r1.<init>(r2, r3)
            r15.add(r1)
            int r13 = r13 + 1
            goto L_0x01b1
        L_0x01dc:
            java.lang.String r0 = r14.from
            java.lang.String r1 = "watch"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)
            java.lang.String r1 = "viewModel"
            r2 = 0
            if (r0 == 0) goto L_0x0236
            com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.SendInviteRequest r0 = new com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.SendInviteRequest
            com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest r3 = r14.contestDetailData
            if (r3 == 0) goto L_0x01f4
            java.lang.String r3 = r3.get_id()
            goto L_0x01f5
        L_0x01f4:
            r3 = r2
        L_0x01f5:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest r4 = r14.contestDetailData
            if (r4 == 0) goto L_0x0202
            java.lang.String r4 = r4.getMatchId()
            goto L_0x0203
        L_0x0202:
            r4 = r2
        L_0x0203:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.<init>(r3, r4, r15)
            int r15 = r15.size()
            if (r15 <= 0) goto L_0x021e
            com.crickpe.view.detail.DetailViewModel r15 = r14.viewModel
            if (r15 != 0) goto L_0x0218
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x0219
        L_0x0218:
            r2 = r15
        L_0x0219:
            r2.sendInviteApi(r0)
            goto L_0x03c1
        L_0x021e:
            androidx.fragment.app.FragmentActivity r15 = r14.requireActivity()
            androidx.activity.OnBackPressedDispatcher r15 = r15.getOnBackPressedDispatcher()
            r15.onBackPressed()
            androidx.fragment.app.FragmentActivity r15 = r14.requireActivity()
            androidx.activity.OnBackPressedDispatcher r15 = r15.getOnBackPressedDispatcher()
            r15.onBackPressed()
            goto L_0x03c1
        L_0x0236:
            int r0 = r15.size()
            if (r0 <= 0) goto L_0x0269
            com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.SendInviteRequest r0 = new com.crickpe.view.detail.fragments.create_contest.send_invite_friend_request.SendInviteRequest
            com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest r3 = r14.contestDetailData
            if (r3 == 0) goto L_0x0247
            java.lang.String r3 = r3.get_id()
            goto L_0x0248
        L_0x0247:
            r3 = r2
        L_0x0248:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest r4 = r14.contestDetailData
            if (r4 == 0) goto L_0x0255
            java.lang.String r4 = r4.getMatchId()
            goto L_0x0256
        L_0x0255:
            r4 = r2
        L_0x0256:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.<init>(r3, r4, r15)
            com.crickpe.view.detail.DetailViewModel r15 = r14.viewModel
            if (r15 != 0) goto L_0x0265
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
            goto L_0x0266
        L_0x0265:
            r2 = r15
        L_0x0266:
            r2.sendInviteApi(r0)
        L_0x0269:
            r14.goToContestCongratulation()
            goto L_0x03c1
        L_0x026e:
            boolean r15 = r14.checkWriteExternalPermission()
            if (r15 == 0) goto L_0x03c1
            android.app.Dialog r15 = r14.previousContactsDialog
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            r15.show()
            goto L_0x03c1
        L_0x027e:
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x02a4 }
            r15.<init>()     // Catch:{ Exception -> 0x02a4 }
            r15.setAction(r5)     // Catch:{ Exception -> 0x02a4 }
            r15.setType(r4)     // Catch:{ Exception -> 0x02a4 }
            com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest r2 = r14.contestDetailData     // Catch:{ Exception -> 0x02a4 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r2 = r2.getContestUrl()     // Catch:{ Exception -> 0x02a4 }
            r15.putExtra(r1, r2)     // Catch:{ Exception -> 0x02a4 }
            java.lang.String r0 = r14.getString(r0)     // Catch:{ Exception -> 0x02a4 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x02a4 }
            android.content.Intent r15 = android.content.Intent.createChooser(r15, r0)     // Catch:{ Exception -> 0x02a4 }
            r14.startActivity(r15)     // Catch:{ Exception -> 0x02a4 }
            goto L_0x03c1
        L_0x02a4:
            r15 = move-exception
            java.lang.String r15 = r15.toString()
            android.util.Log.i(r12, r15)
            goto L_0x03c1
        L_0x02ae:
            android.content.Intent r15 = new android.content.Intent     // Catch:{ Exception -> 0x02d4 }
            r15.<init>()     // Catch:{ Exception -> 0x02d4 }
            r15.setAction(r5)     // Catch:{ Exception -> 0x02d4 }
            r15.setType(r4)     // Catch:{ Exception -> 0x02d4 }
            com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest r2 = r14.contestDetailData     // Catch:{ Exception -> 0x02d4 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch:{ Exception -> 0x02d4 }
            java.lang.String r2 = r2.getReferalCode()     // Catch:{ Exception -> 0x02d4 }
            r15.putExtra(r1, r2)     // Catch:{ Exception -> 0x02d4 }
            java.lang.String r0 = r14.getString(r0)     // Catch:{ Exception -> 0x02d4 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x02d4 }
            android.content.Intent r15 = android.content.Intent.createChooser(r15, r0)     // Catch:{ Exception -> 0x02d4 }
            r14.startActivity(r15)     // Catch:{ Exception -> 0x02d4 }
            goto L_0x03c1
        L_0x02d4:
            r15 = move-exception
            java.lang.String r15 = r15.toString()
            android.util.Log.i(r12, r15)
            goto L_0x03c1
        L_0x02de:
            androidx.fragment.app.FragmentActivity r15 = r14.requireActivity()     // Catch:{ Exception -> 0x0320 }
            java.lang.Object r15 = r15.getSystemService(r6)     // Catch:{ Exception -> 0x0320 }
            if (r15 == 0) goto L_0x031a
            android.content.ClipboardManager r15 = (android.content.ClipboardManager) r15     // Catch:{ Exception -> 0x0320 }
            java.lang.String r0 = r14.getString(r3)     // Catch:{ Exception -> 0x0320 }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x0320 }
            com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest r1 = r14.contestDetailData     // Catch:{ Exception -> 0x0320 }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ Exception -> 0x0320 }
            java.lang.String r1 = r1.getContestUrl()     // Catch:{ Exception -> 0x0320 }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x0320 }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r1)     // Catch:{ Exception -> 0x0320 }
            java.lang.String r1 = "newPlainText(getString(R…tDetailData!!.contestUrl)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x0320 }
            r15.setPrimaryClip(r0)     // Catch:{ Exception -> 0x0320 }
            r15 = 2131951931(0x7f13013b, float:1.954029E38)
            java.lang.String r15 = r14.getString(r15)     // Catch:{ Exception -> 0x0320 }
            java.lang.String r0 = "getString(R.string.link_copy)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)     // Catch:{ Exception -> 0x0320 }
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15     // Catch:{ Exception -> 0x0320 }
            r14.showToast(r15)     // Catch:{ Exception -> 0x0320 }
            goto L_0x03c1
        L_0x031a:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x0320 }
            r15.<init>(r2)     // Catch:{ Exception -> 0x0320 }
            throw r15     // Catch:{ Exception -> 0x0320 }
        L_0x0320:
            r15 = move-exception
            java.lang.String r15 = r15.toString()
            android.util.Log.i(r12, r15)
            goto L_0x03c1
        L_0x032a:
            androidx.fragment.app.FragmentActivity r15 = r14.requireActivity()     // Catch:{ Exception -> 0x036b }
            java.lang.Object r15 = r15.getSystemService(r6)     // Catch:{ Exception -> 0x036b }
            if (r15 == 0) goto L_0x0365
            android.content.ClipboardManager r15 = (android.content.ClipboardManager) r15     // Catch:{ Exception -> 0x036b }
            java.lang.String r0 = r14.getString(r3)     // Catch:{ Exception -> 0x036b }
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0     // Catch:{ Exception -> 0x036b }
            com.crickpe.view.detail.fragments.create_own_team.join_contest.Contest r1 = r14.contestDetailData     // Catch:{ Exception -> 0x036b }
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch:{ Exception -> 0x036b }
            java.lang.String r1 = r1.getReferalCode()     // Catch:{ Exception -> 0x036b }
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch:{ Exception -> 0x036b }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r1)     // Catch:{ Exception -> 0x036b }
            java.lang.String r1 = "newPlainText(getString(R…DetailData!!.referalCode)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ Exception -> 0x036b }
            r15.setPrimaryClip(r0)     // Catch:{ Exception -> 0x036b }
            r15 = 2131951730(0x7f130072, float:1.9539883E38)
            java.lang.String r15 = r14.getString(r15)     // Catch:{ Exception -> 0x036b }
            java.lang.String r0 = "getString(R.string.code_copy)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r0)     // Catch:{ Exception -> 0x036b }
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15     // Catch:{ Exception -> 0x036b }
            r14.showToast(r15)     // Catch:{ Exception -> 0x036b }
            goto L_0x03c1
        L_0x0365:
            java.lang.NullPointerException r15 = new java.lang.NullPointerException     // Catch:{ Exception -> 0x036b }
            r15.<init>(r2)     // Catch:{ Exception -> 0x036b }
            throw r15     // Catch:{ Exception -> 0x036b }
        L_0x036b:
            r15 = move-exception
            java.lang.String r15 = r15.toString()
            android.util.Log.i(r12, r15)
            goto L_0x03c1
        L_0x0374:
            androidx.fragment.app.FragmentActivity r15 = r14.requireActivity()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r10)
            android.content.Context r15 = (android.content.Context) r15
            com.crickpe.databinding.FragmentShareContestBinding r0 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.crickpe.databinding.BottomSheetContactsBinding r0 = r0.bottomSheetContact
            android.widget.TextView r0 = r0.tvDoneSheet
            android.view.View r0 = (android.view.View) r0
            com.crickpe.utils.CommonMethodsKt.hideKeyboard(r15, r0)
            com.crickpe.databinding.FragmentShareContestBinding r15 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            com.crickpe.databinding.BottomSheetContactsBinding r15 = r15.bottomSheetContact
            android.widget.EditText r15 = r15.etSearch
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            r15.setText(r9)
            com.crickpe.databinding.FragmentShareContestBinding r15 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            com.crickpe.databinding.BottomSheetContactsBinding r15 = r15.bottomSheetContact
            android.widget.RelativeLayout r15 = r15.rlContacts
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r11)
            android.view.View r15 = (android.view.View) r15
            com.crickpe.utils.CommonMethodsKt.hide(r15)
            android.content.Context r15 = r14.getContext()
            android.view.animation.Animation r15 = android.view.animation.AnimationUtils.loadAnimation(r15, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r7)
            com.crickpe.databinding.FragmentShareContestBinding r0 = r14.binding
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            com.crickpe.databinding.BottomSheetContactsBinding r0 = r0.bottomSheetContact
            android.widget.RelativeLayout r0 = r0.rlContacts
            r0.startAnimation(r15)
        L_0x03c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crickpe.view.detail.fragments.create_contest.ShareContestFragment.onClick(android.view.View):void");
    }

    private final void fetchContacts() {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                String[] strArr = {"android.permission.READ_CONTACTS"};
                if (!EasyPermissions.hasPermissions(requireActivity(), (String[]) Arrays.copyOf(strArr, 1))) {
                    ActivityCompat.requestPermissions(requireActivity(), strArr, 112);
                } else {
                    CommonMethodsKt.executeAsyncTask(GlobalScope.INSTANCE, ShareContestFragment$fetchContacts$1.INSTANCE, new ShareContestFragment$fetchContacts$2(this), new ShareContestFragment$fetchContacts$3(this));
                }
            } else {
                CommonMethodsKt.executeAsyncTask(GlobalScope.INSTANCE, ShareContestFragment$fetchContacts$4.INSTANCE, new ShareContestFragment$fetchContacts$5(this), new ShareContestFragment$fetchContacts$6(this));
            }
        } catch (Exception e) {
            Log.v("fetchContacts", e.toString());
        }
    }

    private final ArrayList<ContactRequest> sortAlphabetically(ArrayList<ContactRequest> arrayList) {
        ArrayList<ContactRequest> arrayList2 = new ArrayList<>();
        try {
            List asMutableList = TypeIntrinsics.asMutableList(arrayList);
            CollectionsKt.sortWith(asMutableList, new ShareContestFragment$$ExternalSyntheticLambda5());
            return (ArrayList) asMutableList;
        } catch (Exception e) {
            Log.v("sortAlphabetically", e.toString());
            return arrayList2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: sortAlphabetically$lambda-6  reason: not valid java name */
    public static final int m3514sortAlphabetically$lambda6(ContactRequest contactRequest, ContactRequest contactRequest2) {
        Intrinsics.checkNotNullParameter(contactRequest, "o1");
        Intrinsics.checkNotNullParameter(contactRequest2, "o2");
        return contactRequest.getName().compareTo(contactRequest2.getName());
    }

    private final void goToContestCongratulation() {
        Bundle bundle = new Bundle();
        String json = new Gson().toJson((Object) this.contestDetailData);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(contestDetailData)");
        bundle.putString(PrefsManager.CONTEST_DATA, json);
        FragmentKt.findNavController(this).navigate((int) C1188R.C1192id.action_shareContestFragment_to_congratulationFragment, bundle);
    }

    public final Context getAppContext() {
        return this.appContext;
    }

    public final void setAppContext(Context context) {
        this.appContext = context;
    }

    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.appContext == null) {
            this.appContext = context.getApplicationContext();
        }
    }

    public final void setAdapter(ArrayList<ContactRequest> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "list");
        this.selectedContactsAdapter = new SelectedContactsAdapter(arrayList, this);
        FragmentShareContestBinding fragmentShareContestBinding = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding);
        fragmentShareContestBinding.rvSelectedContacts.setAdapter(this.selectedContactsAdapter);
    }

    private final void previousContactAdapter(ArrayList<PreviousContactsModel> arrayList) {
        Intrinsics.checkNotNull(arrayList);
        this.previousContactsAdapter = new PreviousContactsAdapter(arrayList);
        FragmentShareContestBinding fragmentShareContestBinding = this.binding;
        Intrinsics.checkNotNull(fragmentShareContestBinding);
        fragmentShareContestBinding.rvPreviousContacts.setAdapter(this.previousContactsAdapter);
    }

    public void onItemClicked(ContactRequest contactRequest) {
        Intrinsics.checkNotNullParameter(contactRequest, "user");
        if (!contactRequest.isSelected()) {
            contactRequest.setMobileNo(StringsKt.removePrefix(contactRequest.getMobileNo(), (CharSequence) "+91"));
            ArrayList<ContactRequest> arrayList = this.selectedList;
            if (arrayList != null) {
                arrayList.add(contactRequest);
                return;
            }
            return;
        }
        ArrayList<ContactRequest> arrayList2 = this.selectedList;
        if (arrayList2 != null) {
            arrayList2.remove(contactRequest);
        }
    }

    public void onRemoveItem(ContactRequest contactRequest) {
        Intrinsics.checkNotNullParameter(contactRequest, "contact");
        ArrayList<ContactRequest> arrayList = this.selectedList;
        Integer valueOf = arrayList != null ? Integer.valueOf(arrayList.size()) : null;
        Intrinsics.checkNotNull(valueOf);
        if (valueOf.intValue() > 0) {
            ArrayList<ContactRequest> arrayList2 = this.selectedList;
            if (arrayList2 != null) {
                arrayList2.remove(contactRequest);
            }
            SelectedContactsAdapter selectedContactsAdapter2 = this.selectedContactsAdapter;
            if (selectedContactsAdapter2 != null) {
                selectedContactsAdapter2.notifyDataSetChanged();
            }
            ArrayList<ContactRequest> arrayList3 = this.selectedList;
            Intrinsics.checkNotNull(arrayList3);
            if (arrayList3.size() > 0) {
                FragmentShareContestBinding fragmentShareContestBinding = this.binding;
                Intrinsics.checkNotNull(fragmentShareContestBinding);
                TextView textView = fragmentShareContestBinding.tvNumberOfInvitation;
                StringBuilder sb = new StringBuilder();
                ArrayList<ContactRequest> arrayList4 = this.selectedList;
                Intrinsics.checkNotNull(arrayList4);
                sb.append(arrayList4.size());
                sb.append(" people from your contacts are invited");
                textView.setText(sb.toString());
                return;
            }
            FragmentShareContestBinding fragmentShareContestBinding2 = this.binding;
            Intrinsics.checkNotNull(fragmentShareContestBinding2);
            fragmentShareContestBinding2.tvNumberOfInvitation.setText("");
        }
    }

    public void onClick(PreviousContactsModel previousContactsModel) {
        Intrinsics.checkNotNullParameter(previousContactsModel, "pre");
        if (!previousContactsModel.isSelected()) {
            ArrayList<PreviousContactsModel> arrayList = this.previousContactsList;
            if (arrayList != null) {
                arrayList.add(previousContactsModel);
                return;
            }
            return;
        }
        ArrayList<PreviousContactsModel> arrayList2 = this.previousContactsList;
        if (arrayList2 != null) {
            arrayList2.remove(previousContactsModel);
        }
    }
}
