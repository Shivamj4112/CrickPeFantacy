package com.crickpe.utils.apiHandling;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(mo48221d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo48222d2 = {"<anonymous>", "Lcom/crickpe/utils/apiHandling/AuctionAppApi;", "kotlin.jvm.PlatformType", "invoke"}, mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: RetrofitClient.kt */
final class RetrofitClient$auctionApi$2 extends Lambda implements Function0<AuctionAppApi> {
    public static final RetrofitClient$auctionApi$2 INSTANCE = new RetrofitClient$auctionApi$2();

    RetrofitClient$auctionApi$2() {
        super(0);
    }

    public final AuctionAppApi invoke() {
        return (AuctionAppApi) RetrofitClient.INSTANCE.getRETROFIT().create(AuctionAppApi.class);
    }
}
