package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;

public final class FragmentProfileSetupBinding implements ViewBinding {
    public final CardView cvProfile;
    public final EditText etName;
    public final EditText etReferralCode;
    public final ImageView ivAdd;
    public final ImageView ivCancel;
    public final ImageView ivProfile;
    public final ProgressBar progressBar;
    public final RelativeLayout rlProgress;
    private final RelativeLayout rootView;
    public final RecyclerView rvProfileAvtar;
    public final TextView tvContinue;
    public final TextView tvLogin;

    private FragmentProfileSetupBinding(RelativeLayout relativeLayout, CardView cardView, EditText editText, EditText editText2, ImageView imageView, ImageView imageView2, ImageView imageView3, ProgressBar progressBar2, RelativeLayout relativeLayout2, RecyclerView recyclerView, TextView textView, TextView textView2) {
        this.rootView = relativeLayout;
        this.cvProfile = cardView;
        this.etName = editText;
        this.etReferralCode = editText2;
        this.ivAdd = imageView;
        this.ivCancel = imageView2;
        this.ivProfile = imageView3;
        this.progressBar = progressBar2;
        this.rlProgress = relativeLayout2;
        this.rvProfileAvtar = recyclerView;
        this.tvContinue = textView;
        this.tvLogin = textView2;
    }

    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static FragmentProfileSetupBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static FragmentProfileSetupBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.fragment_profile_setup, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static FragmentProfileSetupBinding bind(View view) {
        int i = C1188R.C1192id.cvProfile;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, C1188R.C1192id.cvProfile);
        if (cardView != null) {
            i = C1188R.C1192id.etName;
            EditText editText = (EditText) ViewBindings.findChildViewById(view, C1188R.C1192id.etName);
            if (editText != null) {
                i = C1188R.C1192id.etReferralCode;
                EditText editText2 = (EditText) ViewBindings.findChildViewById(view, C1188R.C1192id.etReferralCode);
                if (editText2 != null) {
                    i = C1188R.C1192id.ivAdd;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivAdd);
                    if (imageView != null) {
                        i = C1188R.C1192id.ivCancel;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivCancel);
                        if (imageView2 != null) {
                            i = C1188R.C1192id.ivProfile;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, C1188R.C1192id.ivProfile);
                            if (imageView3 != null) {
                                i = C1188R.C1192id.progressBar;
                                ProgressBar progressBar2 = (ProgressBar) ViewBindings.findChildViewById(view, C1188R.C1192id.progressBar);
                                if (progressBar2 != null) {
                                    i = C1188R.C1192id.rlProgress;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, C1188R.C1192id.rlProgress);
                                    if (relativeLayout != null) {
                                        i = C1188R.C1192id.rvProfileAvtar;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, C1188R.C1192id.rvProfileAvtar);
                                        if (recyclerView != null) {
                                            i = C1188R.C1192id.tvContinue;
                                            TextView textView = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvContinue);
                                            if (textView != null) {
                                                i = C1188R.C1192id.tvLogin;
                                                TextView textView2 = (TextView) ViewBindings.findChildViewById(view, C1188R.C1192id.tvLogin);
                                                if (textView2 != null) {
                                                    return new FragmentProfileSetupBinding((RelativeLayout) view, cardView, editText, editText2, imageView, imageView2, imageView3, progressBar2, relativeLayout, recyclerView, textView, textView2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
