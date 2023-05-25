package com.crickpe.view.intro.fragments.splash.models;

import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, mo48222d2 = {"Lcom/crickpe/view/intro/fragments/splash/models/AppFlow;", "", "scorecardFlow", "", "teamFlow", "iplFlow", "trainingFlow", "(ZZZZ)V", "getIplFlow", "()Z", "getScorecardFlow", "getTeamFlow", "getTrainingFlow", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: AppFlow.kt */
public final class AppFlow {
    private final boolean iplFlow;
    private final boolean scorecardFlow;
    private final boolean teamFlow;
    private final boolean trainingFlow;

    public static /* synthetic */ AppFlow copy$default(AppFlow appFlow, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = appFlow.scorecardFlow;
        }
        if ((i & 2) != 0) {
            z2 = appFlow.teamFlow;
        }
        if ((i & 4) != 0) {
            z3 = appFlow.iplFlow;
        }
        if ((i & 8) != 0) {
            z4 = appFlow.trainingFlow;
        }
        return appFlow.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.scorecardFlow;
    }

    public final boolean component2() {
        return this.teamFlow;
    }

    public final boolean component3() {
        return this.iplFlow;
    }

    public final boolean component4() {
        return this.trainingFlow;
    }

    public final AppFlow copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new AppFlow(z, z2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppFlow)) {
            return false;
        }
        AppFlow appFlow = (AppFlow) obj;
        return this.scorecardFlow == appFlow.scorecardFlow && this.teamFlow == appFlow.teamFlow && this.iplFlow == appFlow.iplFlow && this.trainingFlow == appFlow.trainingFlow;
    }

    public int hashCode() {
        boolean z = this.scorecardFlow;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.teamFlow;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.iplFlow;
        if (z4) {
            z4 = true;
        }
        int i3 = (i2 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.trainingFlow;
        if (!z5) {
            z2 = z5;
        }
        return i3 + (z2 ? 1 : 0);
    }

    public String toString() {
        return "AppFlow(scorecardFlow=" + this.scorecardFlow + ", teamFlow=" + this.teamFlow + ", iplFlow=" + this.iplFlow + ", trainingFlow=" + this.trainingFlow + ')';
    }

    public AppFlow(boolean z, boolean z2, boolean z3, boolean z4) {
        this.scorecardFlow = z;
        this.teamFlow = z2;
        this.iplFlow = z3;
        this.trainingFlow = z4;
    }

    public final boolean getScorecardFlow() {
        return this.scorecardFlow;
    }

    public final boolean getTeamFlow() {
        return this.teamFlow;
    }

    public final boolean getIplFlow() {
        return this.iplFlow;
    }

    public final boolean getTrainingFlow() {
        return this.trainingFlow;
    }
}
