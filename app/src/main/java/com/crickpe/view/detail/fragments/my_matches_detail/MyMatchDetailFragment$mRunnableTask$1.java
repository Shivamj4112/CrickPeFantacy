package com.crickpe.view.detail.fragments.my_matches_detail;

import com.crickpe.view.detail.DetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo48222d2 = {"com/crickpe/view/detail/fragments/my_matches_detail/MyMatchDetailFragment$mRunnableTask$1", "Ljava/lang/Runnable;", "run", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyMatchDetailFragment.kt */
public final class MyMatchDetailFragment$mRunnableTask$1 implements Runnable {
    final /* synthetic */ MyMatchDetailFragment this$0;

    MyMatchDetailFragment$mRunnableTask$1(MyMatchDetailFragment myMatchDetailFragment) {
        this.this$0 = myMatchDetailFragment;
    }

    public void run() {
        DetailViewModel access$getViewModel$p = this.this$0.viewModel;
        DetailViewModel detailViewModel = null;
        if (access$getViewModel$p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            access$getViewModel$p = null;
        }
        access$getViewModel$p.getLiveScoreApi(this.this$0.getMatchId());
        DetailViewModel access$getViewModel$p2 = this.this$0.viewModel;
        if (access$getViewModel$p2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
        } else {
            detailViewModel = access$getViewModel$p2;
        }
        detailViewModel.getPlayersPotApi(this.this$0.getMatchId());
        this.this$0.getMHandler().postDelayed(this, 20000);
    }
}
