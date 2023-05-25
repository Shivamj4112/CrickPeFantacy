package com.crickpe.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.crickpe.C1188R;
import p019de.hdodenhof.circleimageview.CircleImageView;

public final class DialogMatchDetailBinding implements ViewBinding {
    public final CircleImageView ivTeam1Flag;
    public final CircleImageView ivTeam2Flag;
    private final CardView rootView;
    public final TextView tvMatchName;
    public final TextView tvStadium;
    public final TextView tvTeam1Name;
    public final TextView tvTeam2Name;
    public final TextView tvTeamCode1;
    public final TextView tvTeamCode2;
    public final View view;

    private DialogMatchDetailBinding(CardView cardView, CircleImageView circleImageView, CircleImageView circleImageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, View view2) {
        this.rootView = cardView;
        this.ivTeam1Flag = circleImageView;
        this.ivTeam2Flag = circleImageView2;
        this.tvMatchName = textView;
        this.tvStadium = textView2;
        this.tvTeam1Name = textView3;
        this.tvTeam2Name = textView4;
        this.tvTeamCode1 = textView5;
        this.tvTeamCode2 = textView6;
        this.view = view2;
    }

    public CardView getRoot() {
        return this.rootView;
    }

    public static DialogMatchDetailBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, (ViewGroup) null, false);
    }

    public static DialogMatchDetailBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C1188R.C1193layout.dialog_match_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogMatchDetailBinding bind(View view2) {
        int i = C1188R.C1192id.ivTeam1Flag;
        CircleImageView circleImageView = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivTeam1Flag);
        if (circleImageView != null) {
            i = C1188R.C1192id.ivTeam2Flag;
            CircleImageView circleImageView2 = (CircleImageView) ViewBindings.findChildViewById(view2, C1188R.C1192id.ivTeam2Flag);
            if (circleImageView2 != null) {
                i = C1188R.C1192id.tvMatchName;
                TextView textView = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvMatchName);
                if (textView != null) {
                    i = C1188R.C1192id.tvStadium;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvStadium);
                    if (textView2 != null) {
                        i = C1188R.C1192id.tvTeam1Name;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTeam1Name);
                        if (textView3 != null) {
                            i = C1188R.C1192id.tvTeam2Name;
                            TextView textView4 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTeam2Name);
                            if (textView4 != null) {
                                i = C1188R.C1192id.tvTeamCode1;
                                TextView textView5 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTeamCode1);
                                if (textView5 != null) {
                                    i = C1188R.C1192id.tvTeamCode2;
                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(view2, C1188R.C1192id.tvTeamCode2);
                                    if (textView6 != null) {
                                        i = C1188R.C1192id.view;
                                        View findChildViewById = ViewBindings.findChildViewById(view2, C1188R.C1192id.view);
                                        if (findChildViewById != null) {
                                            return new DialogMatchDetailBinding((CardView) view2, circleImageView, circleImageView2, textView, textView2, textView3, textView4, textView5, textView6, findChildViewById);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view2.getResources().getResourceName(i)));
    }
}
