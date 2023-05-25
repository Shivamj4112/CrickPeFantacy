package com.crickpe.view.detail.fragments.wallet.my_banks_list;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/my_banks_list/BankDetails;", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/wallet/my_banks_list/BankDetailsItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: BankDetails.kt */
public final class BankDetails extends ArrayList<BankDetailsItem> {
    public /* bridge */ boolean contains(BankDetailsItem bankDetailsItem) {
        return super.contains(bankDetailsItem);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof BankDetailsItem)) {
            return false;
        }
        return contains((BankDetailsItem) obj);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(BankDetailsItem bankDetailsItem) {
        return super.indexOf(bankDetailsItem);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof BankDetailsItem)) {
            return -1;
        }
        return indexOf((BankDetailsItem) obj);
    }

    public /* bridge */ int lastIndexOf(BankDetailsItem bankDetailsItem) {
        return super.lastIndexOf(bankDetailsItem);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof BankDetailsItem)) {
            return -1;
        }
        return lastIndexOf((BankDetailsItem) obj);
    }

    public final /* bridge */ BankDetailsItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(BankDetailsItem bankDetailsItem) {
        return super.remove(bankDetailsItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof BankDetailsItem)) {
            return false;
        }
        return remove((BankDetailsItem) obj);
    }

    public /* bridge */ BankDetailsItem removeAt(int i) {
        return (BankDetailsItem) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
