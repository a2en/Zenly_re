package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum ServerTier implements WireEnum {
    OPS_TIER(0),
    CRITICAL_TIER(1),
    BUSINESS_TIER(2);
    
    public static final ProtoAdapter<ServerTier> ADAPTER = null;
    private final int value;

    private static final class ProtoAdapter_ServerTier extends EnumAdapter<ServerTier> {
        ProtoAdapter_ServerTier() {
            super(ServerTier.class);
        }

        /* access modifiers changed from: protected */
        public ServerTier fromValue(int i) {
            return ServerTier.fromValue(i);
        }
    }

    static {
        ADAPTER = new ProtoAdapter_ServerTier();
    }

    private ServerTier(int i) {
        this.value = i;
    }

    public static ServerTier fromValue(int i) {
        if (i == 0) {
            return OPS_TIER;
        }
        if (i == 1) {
            return CRITICAL_TIER;
        }
        if (i != 2) {
            return null;
        }
        return BUSINESS_TIER;
    }

    public int getValue() {
        return this.value;
    }
}
