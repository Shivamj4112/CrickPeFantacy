package com.crickpe.view.home.fragments.rewards.my_reward_model;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo48222d2 = {"Lcom/crickpe/view/home/fragments/rewards/my_reward_model/MyRewardModel;", "Ljava/util/ArrayList;", "Lcom/crickpe/view/home/fragments/rewards/my_reward_model/MyRewardModelItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: MyRewardModel.kt */
public final class MyRewardModel extends ArrayList<MyRewardModelItem> {
    public /* bridge */ boolean contains(MyRewardModelItem myRewardModelItem) {
        return super.contains(myRewardModelItem);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof MyRewardModelItem)) {
            return false;
        }
        return contains((MyRewardModelItem) obj);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(MyRewardModelItem myRewardModelItem) {
        return super.indexOf(myRewardModelItem);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof MyRewardModelItem)) {
            return -1;
        }
        return indexOf((MyRewardModelItem) obj);
    }

    public /* bridge */ int lastIndexOf(MyRewardModelItem myRewardModelItem) {
        return super.lastIndexOf(myRewardModelItem);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof MyRewardModelItem)) {
            return -1;
        }
        return lastIndexOf((MyRewardModelItem) obj);
    }

    public final /* bridge */ MyRewardModelItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(MyRewardModelItem myRewardModelItem) {
        return super.remove(myRewardModelItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof MyRewardModelItem)) {
            return false;
        }
        return remove((MyRewardModelItem) obj);
    }

    public /* bridge */ MyRewardModelItem removeAt(int i) {
        return (MyRewardModelItem) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
