package com.crickpe.view.detail.fragments.player_reward_fragment.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, mo48222d2 = {"Lcom/crickpe/view/detail/fragments/player_reward_fragment/models/Role;", "", "roleId", "", "roleName", "", "(ILjava/lang/String;)V", "getRoleId", "()I", "getRoleName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: Role.kt */
public final class Role {
    private final int roleId;
    private final String roleName;

    public static /* synthetic */ Role copy$default(Role role, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = role.roleId;
        }
        if ((i2 & 2) != 0) {
            str = role.roleName;
        }
        return role.copy(i, str);
    }

    public final int component1() {
        return this.roleId;
    }

    public final String component2() {
        return this.roleName;
    }

    public final Role copy(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "roleName");
        return new Role(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Role)) {
            return false;
        }
        Role role = (Role) obj;
        return this.roleId == role.roleId && Intrinsics.areEqual((Object) this.roleName, (Object) role.roleName);
    }

    public int hashCode() {
        return (this.roleId * 31) + this.roleName.hashCode();
    }

    public String toString() {
        return "Role(roleId=" + this.roleId + ", roleName=" + this.roleName + ')';
    }

    public Role(int i, String str) {
        Intrinsics.checkNotNullParameter(str, "roleName");
        this.roleId = i;
        this.roleName = str;
    }

    public final int getRoleId() {
        return this.roleId;
    }

    public final String getRoleName() {
        return this.roleName;
    }
}
