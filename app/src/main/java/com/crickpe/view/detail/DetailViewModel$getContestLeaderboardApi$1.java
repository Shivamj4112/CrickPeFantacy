package com.crickpe.view.detail;

import androidx.core.app.NotificationCompat;
import com.crickpe.data.leaderboard.LeaderboardModel;
import com.crickpe.utils.apiHandling.ApiResponse;
import com.crickpe.utils.apiHandling.ApiResponseHandler;
import com.crickpe.utils.apiHandling.RetrofitUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(mo48221d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00020\u0001J6\u0010\u0006\u001a\u00020\u00072\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016JP\u0010\f\u001a\u00020\u00072\"\u0010\b\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00020\t2\"\u0010\r\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00020\u000eH\u0016¨\u0006\u000f"}, mo48222d2 = {"com/crickpe/view/detail/DetailViewModel$getContestLeaderboardApi$1", "Lretrofit2/Callback;", "Lcom/crickpe/utils/apiHandling/ApiResponse;", "Ljava/util/ArrayList;", "Lcom/crickpe/data/leaderboard/LeaderboardModel;", "Lkotlin/collections/ArrayList;", "onFailure", "", "call", "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: DetailViewModel.kt */
public final class DetailViewModel$getContestLeaderboardApi$1 implements Callback<ApiResponse<? extends ArrayList<LeaderboardModel>>> {
    final /* synthetic */ DetailViewModel this$0;

    DetailViewModel$getContestLeaderboardApi$1(DetailViewModel detailViewModel) {
        this.this$0 = detailViewModel;
    }

    public void onFailure(Call<ApiResponse<ArrayList<LeaderboardModel>>> call, Throwable th) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        this.this$0.getContestLeaderBoard().setValue(ApiResponseHandler.Companion.error(RetrofitUtils.INSTANCE.apiFailure(th)));
    }

    public void onResponse(Call<ApiResponse<ArrayList<LeaderboardModel>>> call, Response<ApiResponse<ArrayList<LeaderboardModel>>> response) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            ApiResponse body = response.body();
            this.this$0.getContestLeaderBoard().setValue(ApiResponseHandler.Companion.success$default(ApiResponseHandler.Companion, body != null ? (ArrayList) body.getData() : null, (String) null, 2, (Object) null));
            return;
        }
        this.this$0.getContestLeaderBoard().setValue(ApiResponseHandler.Companion.error(RetrofitUtils.INSTANCE.apiError(response.errorBody())));
    }
}
