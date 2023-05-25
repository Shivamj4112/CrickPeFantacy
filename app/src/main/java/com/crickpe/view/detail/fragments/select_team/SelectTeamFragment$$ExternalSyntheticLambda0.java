package com.crickpe.view.detail.fragments.select_team;

import android.app.Dialog;
import android.view.View;
import com.crickpe.view.detail.fragments.select_team.model.WalletInfoModel;
import kotlin.jvm.internal.Ref;

/* compiled from: D8$$SyntheticClass */
public final /* synthetic */ class SelectTeamFragment$$ExternalSyntheticLambda0 implements View.OnClickListener {
    public final /* synthetic */ Dialog f$0;
    public final /* synthetic */ SelectTeamFragment f$1;
    public final /* synthetic */ WalletInfoModel f$2;
    public final /* synthetic */ Ref.IntRef f$3;

    public /* synthetic */ SelectTeamFragment$$ExternalSyntheticLambda0(Dialog dialog, SelectTeamFragment selectTeamFragment, WalletInfoModel walletInfoModel, Ref.IntRef intRef) {
        this.f$0 = dialog;
        this.f$1 = selectTeamFragment;
        this.f$2 = walletInfoModel;
        this.f$3 = intRef;
    }

    public final void onClick(View view) {
        SelectTeamFragment.m3611joinContestDialog$lambda9(this.f$0, this.f$1, this.f$2, this.f$3, view);
    }
}
