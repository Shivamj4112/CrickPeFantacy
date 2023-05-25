package com.crickpe.view.intro.fragments.splash.models;

import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/splash/models/KycChecks;", "", "onWithdrawl", "", "onJoiningMatch", "onGivingReward", "onTopUp", "(ZZZZ)V", "getOnGivingReward", "()Z", "getOnJoiningMatch", "getOnTopUp", "getOnWithdrawl", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: KycChecks.kt */
public final class KycChecks {
    private final boolean onGivingReward;
    private final boolean onJoiningMatch;
    private final boolean onTopUp;
    private final boolean onWithdrawl;

    public static /* synthetic */ KycChecks copy$default(KycChecks kycChecks, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = kycChecks.onWithdrawl;
        }
        if ((i & 2) != 0) {
            z2 = kycChecks.onJoiningMatch;
        }
        if ((i & 4) != 0) {
            z3 = kycChecks.onGivingReward;
        }
        if ((i & 8) != 0) {
            z4 = kycChecks.onTopUp;
        }
        return kycChecks.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.onWithdrawl;
    }

    public final boolean component2() {
        return this.onJoiningMatch;
    }

    public final boolean component3() {
        return this.onGivingReward;
    }

    public final boolean component4() {
        return this.onTopUp;
    }

    public final KycChecks copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new KycChecks(z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KycChecks)) {
            return false;
        }
        KycChecks kycChecks = (KycChecks) obj;
        return this.onWithdrawl == kycChecks.onWithdrawl && this.onJoiningMatch == kycChecks.onJoiningMatch && this.onGivingReward == kycChecks.onGivingReward && this.onTopUp == kycChecks.onTopUp;
    }

    public int hashCode() {
        boolean z = this.onWithdrawl;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.onJoiningMatch;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.onGivingReward;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.onTopUp;
        if (!z5) {
            z2 = z5;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "KycChecks(onWithdrawl=" + this.onWithdrawl + ", onJoiningMatch=" + this.onJoiningMatch + ", onGivingReward=" + this.onGivingReward + ", onTopUp=" + this.onTopUp + ')';
    }

    public KycChecks(boolean z, boolean z2, boolean z3, boolean z4) {
        this.onWithdrawl = z;
        this.onJoiningMatch = z2;
        this.onGivingReward = z3;
        this.onTopUp = z4;
    }

    public final boolean getOnWithdrawl() {
        return this.onWithdrawl;
    }

    public final boolean getOnJoiningMatch() {
        return this.onJoiningMatch;
    }

    public final boolean getOnGivingReward() {
        return this.onGivingReward;
    }

    public final boolean getOnTopUp() {
        return this.onTopUp;
    }
}
