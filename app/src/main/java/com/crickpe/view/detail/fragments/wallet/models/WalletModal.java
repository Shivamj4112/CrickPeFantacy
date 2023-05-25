package com.crickpe.view.detail.fragments.wallet.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u0019\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tHÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tHÆ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0019\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0016HÖ\u0001R!\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/wallet/models/WalletModal;", "Landroid/os/Parcelable;", "userWallet", "Lcom/crickpe/view/detail/fragments/wallet/models/UserWallet;", "transactions", "Lcom/crickpe/view/detail/fragments/wallet/models/Transactions;", "transactionList", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/wallet/models/Transaction;", "Lkotlin/collections/ArrayList;", "(Lcom/crickpe/view/detail/fragments/wallet/models/UserWallet;Lcom/crickpe/view/detail/fragments/wallet/models/Transactions;Ljava/util/ArrayList;)V", "getTransactionList", "()Ljava/util/ArrayList;", "getTransactions", "()Lcom/crickpe/view/detail/fragments/wallet/models/Transactions;", "getUserWallet", "()Lcom/crickpe/view/detail/fragments/wallet/models/UserWallet;", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: WalletModal.kt */
public final class WalletModal implements Parcelable {
    public static final Parcelable.Creator<WalletModal> CREATOR = new Creator();
    private final ArrayList<Transaction> transactionList;
    private final Transactions transactions;
    private final UserWallet userWallet;

    @Metadata(mo48223k = 3, mo48224mv = {1, 6, 0}, mo48226xi = 48)
    /* compiled from: WalletModal.kt */
    public static final class Creator implements Parcelable.Creator<WalletModal> {
        public final WalletModal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            UserWallet createFromParcel = UserWallet.CREATOR.createFromParcel(parcel);
            Transactions createFromParcel2 = Transactions.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(Transaction.CREATOR.createFromParcel(parcel));
            }
            return new WalletModal(createFromParcel, createFromParcel2, arrayList);
        }

        public final WalletModal[] newArray(int i) {
            return new WalletModal[i];
        }
    }

    public static /* synthetic */ WalletModal copy$default(WalletModal walletModal, UserWallet userWallet2, Transactions transactions2, ArrayList<Transaction> arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            userWallet2 = walletModal.userWallet;
        }
        if ((i & 2) != 0) {
            transactions2 = walletModal.transactions;
        }
        if ((i & 4) != 0) {
            arrayList = walletModal.transactionList;
        }
        return walletModal.copy(userWallet2, transactions2, arrayList);
    }

    public final UserWallet component1() {
        return this.userWallet;
    }

    public final Transactions component2() {
        return this.transactions;
    }

    public final ArrayList<Transaction> component3() {
        return this.transactionList;
    }

    public final WalletModal copy(UserWallet userWallet2, Transactions transactions2, ArrayList<Transaction> arrayList) {
        Intrinsics.checkNotNullParameter(userWallet2, "userWallet");
        Intrinsics.checkNotNullParameter(transactions2, "transactions");
        Intrinsics.checkNotNullParameter(arrayList, "transactionList");
        return new WalletModal(userWallet2, transactions2, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletModal)) {
            return false;
        }
        WalletModal walletModal = (WalletModal) obj;
        return Intrinsics.areEqual((Object) this.userWallet, (Object) walletModal.userWallet) && Intrinsics.areEqual((Object) this.transactions, (Object) walletModal.transactions) && Intrinsics.areEqual((Object) this.transactionList, (Object) walletModal.transactionList);
    }

    public int hashCode() {
        return (((this.userWallet.hashCode() * 31) + this.transactions.hashCode()) * 31) + this.transactionList.hashCode();
    }

    public String toString() {
        return "WalletModal(userWallet=" + this.userWallet + ", transactions=" + this.transactions + ", transactionList=" + this.transactionList + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        this.userWallet.writeToParcel(parcel, i);
        this.transactions.writeToParcel(parcel, i);
        ArrayList<Transaction> arrayList = this.transactionList;
        parcel.writeInt(arrayList.size());
        Iterator<Transaction> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public WalletModal(UserWallet userWallet2, Transactions transactions2, ArrayList<Transaction> arrayList) {
        Intrinsics.checkNotNullParameter(userWallet2, "userWallet");
        Intrinsics.checkNotNullParameter(transactions2, "transactions");
        Intrinsics.checkNotNullParameter(arrayList, "transactionList");
        this.userWallet = userWallet2;
        this.transactions = transactions2;
        this.transactionList = arrayList;
    }

    public final UserWallet getUserWallet() {
        return this.userWallet;
    }

    public final Transactions getTransactions() {
        return this.transactions;
    }

    public final ArrayList<Transaction> getTransactionList() {
        return this.transactionList;
    }
}
