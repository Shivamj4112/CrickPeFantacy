package com.crickpe.view.home;

import androidx.core.app.NotificationCompat;
import com.crickpe.utils.apiHandling.ApiResponse;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.RetrofitUtils;
import com.crickpe.view.detail.fragments.player_reward_fragment.models.PlayerRewardModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(mo48221d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J&\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J0\u0010\n\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016¨\u0006\r"}, mo48222d2 = {"com/crickpe/view/home/HomeViewModel$rewardPlayer$1", "Lretrofit2/Callback;", "Lcom/crickpe/utils/apiHandling/ApiResponse;", "Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/PlayerRewardModel;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$rewardPlayer$1 implements Callback<ApiResponse<? extends PlayerRewardModel>> {
    final /* synthetic */ HomeViewModel this$0;

    HomeViewModel$rewardPlayer$1(HomeViewModel homeViewModel) {
        this.this$0 = homeViewModel;
    }

    public void onFailure(Call<ApiResponse<PlayerRewardModel>> call, Throwable th) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        this.this$0.getPlayerReward().setValue(ApiResponseHandler.Companion.error(RetrofitUtils.INSTANCE.apiFailure(th)));
    }

    public void onResponse(Call<ApiResponse<PlayerRewardModel>> call, Response<ApiResponse<PlayerRewardModel>> response) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            ApiResponse body = response.body();
            this.this$0.getPlayerReward().setValue(ApiResponseHandler.Companion.success$default(ApiResponseHandler.Companion, body != null ? (PlayerRewardModel) body.getData() : null, (String) null, 2, (Object) null));
            return;
        }
        this.this$0.getPlayerReward().setValue(ApiResponseHandler.Companion.error(RetrofitUtils.INSTANCE.apiError(response.errorBody())));
    }
}
