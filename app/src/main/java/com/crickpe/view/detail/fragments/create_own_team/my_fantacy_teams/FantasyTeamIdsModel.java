package com.crickpe.view.detail.fragments.create_own_team.my_fantacy_teams;

import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(mo48221d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0005¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamIdsModel;", "Ljava/util/ArrayList;", "Lcom/crickpe/view/detail/fragments/create_own_team/my_fantacy_teams/FantasyTeamIdsModelItem;", "Lkotlin/collections/ArrayList;", "()V", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: FantasyTeamIdsModel.kt */
public final class FantasyTeamIdsModel extends ArrayList<FantasyTeamIdsModelItem> {
    public /* bridge */ boolean contains(FantasyTeamIdsModelItem fantasyTeamIdsModelItem) {
        return super.contains(fantasyTeamIdsModelItem);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof FantasyTeamIdsModelItem)) {
            return false;
        }
        return contains((FantasyTeamIdsModelItem) obj);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ int indexOf(FantasyTeamIdsModelItem fantasyTeamIdsModelItem) {
        return super.indexOf(fantasyTeamIdsModelItem);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof FantasyTeamIdsModelItem)) {
            return -1;
        }
        return indexOf((FantasyTeamIdsModelItem) obj);
    }

    public /* bridge */ int lastIndexOf(FantasyTeamIdsModelItem fantasyTeamIdsModelItem) {
        return super.lastIndexOf(fantasyTeamIdsModelItem);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof FantasyTeamIdsModelItem)) {
            return -1;
        }
        return lastIndexOf((FantasyTeamIdsModelItem) obj);
    }

    public final /* bridge */ FantasyTeamIdsModelItem remove(int i) {
        return removeAt(i);
    }

    public /* bridge */ boolean remove(FantasyTeamIdsModelItem fantasyTeamIdsModelItem) {
        return super.remove(fantasyTeamIdsModelItem);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof FantasyTeamIdsModelItem)) {
            return false;
        }
        return remove((FantasyTeamIdsModelItem) obj);
    }

    public /* bridge */ FantasyTeamIdsModelItem removeAt(int i) {
        return (FantasyTeamIdsModelItem) super.remove(i);
    }

    public final /* bridge */ int size() {
        return getSize();
    }
}
