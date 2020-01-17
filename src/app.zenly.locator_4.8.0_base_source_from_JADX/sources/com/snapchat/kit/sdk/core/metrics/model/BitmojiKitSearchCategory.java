package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public enum BitmojiKitSearchCategory implements WireEnum {
    UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY(0),
    TEXT(1),
    AUTOCOMPLETE(2),
    PROGRAMMED_PILLS(3);
    
    public static final ProtoAdapter<BitmojiKitSearchCategory> ADAPTER = null;
    private final int value;

    private static final class ProtoAdapter_BitmojiKitSearchCategory extends EnumAdapter<BitmojiKitSearchCategory> {
        ProtoAdapter_BitmojiKitSearchCategory() {
            super(BitmojiKitSearchCategory.class);
        }

        /* access modifiers changed from: protected */
        public BitmojiKitSearchCategory fromValue(int i) {
            return BitmojiKitSearchCategory.fromValue(i);
        }
    }

    static {
        ADAPTER = new ProtoAdapter_BitmojiKitSearchCategory();
    }

    private BitmojiKitSearchCategory(int i) {
        this.value = i;
    }

    public static BitmojiKitSearchCategory fromValue(int i) {
        if (i == 0) {
            return UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY;
        }
        if (i == 1) {
            return TEXT;
        }
        if (i == 2) {
            return AUTOCOMPLETE;
        }
        if (i != 3) {
            return null;
        }
        return PROGRAMMED_PILLS;
    }

    public int getValue() {
        return this.value;
    }
}
