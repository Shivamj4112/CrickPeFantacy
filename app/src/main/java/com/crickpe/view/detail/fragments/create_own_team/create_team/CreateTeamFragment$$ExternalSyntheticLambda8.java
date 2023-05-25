package com.crickpe.view.detail.fragments.create_own_team.create_team;

import android.app.Dialog;
import android.view.View;
import com.crickpe.view.detail.fragments.select_team.model.WalletInfoModel;
import kotlin.jvm.internal.Ref;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class CreateTeamFragment$$ExternalSyntheticLambda8 implements View.OnClickListener {
    public final /* synthetic */ Dialog f$0;
    public final /* synthetic */ WalletInfoModel f$1;
    public final /* synthetic */ CreateTeamFragment f$2;
    public final /* synthetic */ Ref.IntRef f$3;

    public /* synthetic */ CreateTeamFragment$$ExternalSyntheticLambda8(Dialog dialog, WalletInfoModel walletInfoModel, CreateTeamFragment createTeamFragment, Ref.IntRef intRef) {
        this.f$0 = dialog;
        this.f$1 = walletInfoModel;
        this.f$2 = createTeamFragment;
        this.f$3 = intRef;
    }

    public final void onClick(View view) {
        CreateTeamFragment.m3534joinContestDialog$lambda5(this.f$0, this.f$1, this.f$2, this.f$3, view);
    }
}
