package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitPermissionUpdateStatus implements WireEnum {
    UNKNOWN_BITMOJI_KIT_PERMISSION_UPDATE_STATUS(0),
    BITMOJI_PERMISSION_ON(1),
    BITMOJI_PERMISSION_OFF(2),
    BITMOJI_REAUTH_ERROR(3);
    
    public static final ProtoAdapter<BitmojiKitPermissionUpdateStatus> ADAPTER = null;
    private final int value;

    private static final class ProtoAdapter_BitmojiKitPermissionUpdateStatus extends EnumAdapter<BitmojiKitPermissionUpdateStatus> {
        ProtoAdapter_BitmojiKitPermissionUpdateStatus() {
            super(BitmojiKitPermissionUpdateStatus.class);
        }

        /* access modifiers changed from: protected */
        public BitmojiKitPermissionUpdateStatus fromValue(int i) {
            return BitmojiKitPermissionUpdateStatus.fromValue(i);
        }
    }

    static {
        ADAPTER = new ProtoAdapter_BitmojiKitPermissionUpdateStatus();
    }

    private BitmojiKitPermissionUpdateStatus(int i) {
        this.value = i;
    }

    public static BitmojiKitPermissionUpdateStatus fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_BITMOJI_KIT_PERMISSION_UPDATE_STATUS;
        }
        if (i == 1) {
            return BITMOJI_PERMISSION_ON;
        }
        if (i == 2) {
            return BITMOJI_PERMISSION_OFF;
        }
        if (i != 3) {
            return null;
        }
        return BITMOJI_REAUTH_ERROR;
    }

    public int getValue() {
        return this.value;
    }
}
