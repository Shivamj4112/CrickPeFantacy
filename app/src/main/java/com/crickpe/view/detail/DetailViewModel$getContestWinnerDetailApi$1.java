package com.crickpe.view.detail;

import androidx.core.app.NotificationCompat;
import com.crickpe.utils.apiHandling.ApiResponse;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.RetrofitUtils;
import com.crickpe.view.detail.fragments.contest_winners.models.model.ContestDetailWinnersModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(mo48221d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J&\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J0\u0010\n\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\fH\u0016¨\u0006\r"}, mo48222d2 = {"com/crickpe/view/detail/DetailViewModel$getContestWinnerDetailApi$1", "Lretrofit2/Callback;", "Lcom/crickpe/utils/apiHandling/ApiResponse;", "Lcom/crickpe/view/detail/fragments/contest_winners/models/model/ContestDetailWinnersModel;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: DetailViewModel.kt */
public final class DetailViewModel$getContestWinnerDetailApi$1 implements Callback<ApiResponse<? extends ContestDetailWinnersModel>> {
    final /* synthetic */ DetailViewModel this$0;

    DetailViewModel$getContestWinnerDetailApi$1(DetailViewModel detailViewModel) {
        this.this$0 = detailViewModel;
    }

    public void onFailure(Call<ApiResponse<ContestDetailWinnersModel>> call, Throwable th) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        this.this$0.getGetContestWinnerDetails().setValue(ApiResponseHandler.Companion.error(RetrofitUtils.INSTANCE.apiFailure(th)));
    }

    public void onResponse(Call<ApiResponse<ContestDetailWinnersModel>> call, Response<ApiResponse<ContestDetailWinnersModel>> response) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            ApiResponse body = response.body();
            this.this$0.getGetContestWinnerDetails().setValue(ApiResponseHandler.Companion.success$default(ApiResponseHandler.Companion, body != null ? (ContestDetailWinnersModel) body.getData() : null, (String) null, 2, (Object) null));
            return;
        }
        this.this$0.getGetContestWinnerDetails().setValue(ApiResponseHandler.Companion.error(RetrofitUtils.INSTANCE.apiError(response.errorBody())));
    }
}
