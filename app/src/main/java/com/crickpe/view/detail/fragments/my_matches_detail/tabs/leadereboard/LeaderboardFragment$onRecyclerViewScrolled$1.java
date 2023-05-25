package com.crickpe.view.detail.fragments.my_matches_detail.tabs.leadereboard;

import androidx.recyclerview.widget.RecyclerView;
import com.crickpe.view.detail.DetailViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, mo48222d2 = {"com/crickpe/view/detail/fragments/my_matches_detail/tabs/leadereboard/LeaderboardFragment$onRecyclerViewScrolled$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: LeaderboardFragment.kt */
public final class LeaderboardFragment$onRecyclerViewScrolled$1 extends RecyclerView.OnScrollListener {
    final /* synthetic */ LeaderboardFragment this$0;

    LeaderboardFragment$onRecyclerViewScrolled$1(LeaderboardFragment leaderboardFragment) {
        this.this$0 = leaderboardFragment;
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (this.this$0.moreData && !recyclerView.canScrollVertically(1)) {
            LeaderboardFragment leaderboardFragment = this.this$0;
            leaderboardFragment.setPage(leaderboardFragment.getPage() + 1);
            DetailViewModel access$getViewModel$p = this.this$0.viewModel;
            if (access$getViewModel$p == null) {
                Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                access$getViewModel$p = null;
            }
            access$getViewModel$p.getContestLeaderboardApi(this.this$0.getContestId(), this.this$0.getPage());
        }
    }
}
