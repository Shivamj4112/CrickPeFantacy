package com.crickpe.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo48221d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, mo48222d2 = {"Lcom/crickpe/data/DeviceTypeRequest;", "", "deviceId", "", "deviceToken", "deviceType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDeviceId", "()Ljava/lang/String;", "getDeviceToken", "getDeviceType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, mo48223k = 1, mo48224mv = {1, 6, 0}, mo48226xi = 48)
/* compiled from: DeviceTypeRequest.kt */
public final class DeviceTypeRequest {
    private final String deviceId;
    private final String deviceToken;
    private final String deviceType;

    public static /* synthetic */ DeviceTypeRequest copy$default(DeviceTypeRequest deviceTypeRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceTypeRequest.deviceId;
        }
        if ((i & 2) != 0) {
            str2 = deviceTypeRequest.deviceToken;
        }
        if ((i & 4) != 0) {
            str3 = deviceTypeRequest.deviceType;
        }
        return deviceTypeRequest.copy(str, str2, str3);
    }

    public final String component1() {
        return this.deviceId;
    }

    public final String component2() {
        return this.deviceToken;
    }

    public final String component3() {
        return this.deviceType;
    }

    public final DeviceTypeRequest copy(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, "deviceToken");
        Intrinsics.checkNotNullParameter(str3, "deviceType");
        return new DeviceTypeRequest(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceTypeRequest)) {
            return false;
        }
        DeviceTypeRequest deviceTypeRequest = (DeviceTypeRequest) obj;
        return Intrinsics.areEqual((Object) this.deviceId, (Object) deviceTypeRequest.deviceId) && Intrinsics.areEqual((Object) this.deviceToken, (Object) deviceTypeRequest.deviceToken) && Intrinsics.areEqual((Object) this.deviceType, (Object) deviceTypeRequest.deviceType);
    }

    public int hashCode() {
        return (((this.deviceId.hashCode() * 31) + this.deviceToken.hashCode()) * 31) + this.deviceType.hashCode();
    }

    public String toString() {
        return "DeviceTypeRequest(deviceId=" + this.deviceId + ", deviceToken=" + this.deviceToken + ", deviceType=" + this.deviceType + ')';
    }

    public DeviceTypeRequest(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "deviceId");
        Intrinsics.checkNotNullParameter(str2, "deviceToken");
        Intrinsics.checkNotNullParameter(str3, "deviceType");
        this.deviceId = str;
        this.deviceToken = str2;
        this.deviceType = str3;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceToken() {
        return this.deviceToken;
    }

    public final String getDeviceType() {
        return this.deviceType;
    }
}
