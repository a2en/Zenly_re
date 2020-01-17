package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.C13346d;

public final class BitmojiKitSearchTerm extends Message<BitmojiKitSearchTerm, Builder> {
    public static final ProtoAdapter<BitmojiKitSearchTerm> ADAPTER = new ProtoAdapter_BitmojiKitSearchTerm();
    public static final BitmojiKitSearchCategory DEFAULT_CATEGORY = BitmojiKitSearchCategory.UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY;
    public static final String DEFAULT_VALUE = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchCategory#ADAPTER", tag = 1)
    public final BitmojiKitSearchCategory category;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String value;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitSearchTerm, Builder> {
        public BitmojiKitSearchCategory category;
        public String value;

        public Builder category(BitmojiKitSearchCategory bitmojiKitSearchCategory) {
            this.category = bitmojiKitSearchCategory;
            return this;
        }

        public Builder value(String str) {
            this.value = str;
            return this;
        }

        public BitmojiKitSearchTerm build() {
            return new BitmojiKitSearchTerm(this.category, this.value, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_BitmojiKitSearchTerm extends ProtoAdapter<BitmojiKitSearchTerm> {
        public ProtoAdapter_BitmojiKitSearchTerm() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitSearchTerm.class);
        }

        public BitmojiKitSearchTerm decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    try {
                        builder.category((BitmojiKitSearchCategory) BitmojiKitSearchCategory.ADAPTER.decode(protoReader));
                    } catch (EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.value((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, BitmojiKitSearchTerm bitmojiKitSearchTerm) throws IOException {
            BitmojiKitSearchCategory.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitSearchTerm.category);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, bitmojiKitSearchTerm.value);
            protoWriter.writeBytes(bitmojiKitSearchTerm.unknownFields());
        }

        public int encodedSize(BitmojiKitSearchTerm bitmojiKitSearchTerm) {
            return BitmojiKitSearchCategory.ADAPTER.encodedSizeWithTag(1, bitmojiKitSearchTerm.category) + ProtoAdapter.STRING.encodedSizeWithTag(2, bitmojiKitSearchTerm.value) + bitmojiKitSearchTerm.unknownFields().mo38528g();
        }

        public BitmojiKitSearchTerm redact(BitmojiKitSearchTerm bitmojiKitSearchTerm) {
            Builder newBuilder = bitmojiKitSearchTerm.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public BitmojiKitSearchTerm(BitmojiKitSearchCategory bitmojiKitSearchCategory, String str) {
        this(bitmojiKitSearchCategory, str, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitSearchTerm)) {
            return false;
        }
        BitmojiKitSearchTerm bitmojiKitSearchTerm = (BitmojiKitSearchTerm) obj;
        if (!unknownFields().equals(bitmojiKitSearchTerm.unknownFields()) || !Internal.equals(this.category, bitmojiKitSearchTerm.category) || !Internal.equals(this.value, bitmojiKitSearchTerm.value)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BitmojiKitSearchCategory bitmojiKitSearchCategory = this.category;
        int i2 = 0;
        int hashCode2 = (hashCode + (bitmojiKitSearchCategory != null ? bitmojiKitSearchCategory.hashCode() : 0)) * 37;
        String str = this.value;
        if (str != null) {
            i2 = str.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.category != null) {
            sb.append(", category=");
            sb.append(this.category);
        }
        if (this.value != null) {
            sb.append(", value=");
            sb.append(this.value);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitSearchTerm{");
        replace.append('}');
        return replace.toString();
    }

    public BitmojiKitSearchTerm(BitmojiKitSearchCategory bitmojiKitSearchCategory, String str, C13346d dVar) {
        super(ADAPTER, dVar);
        this.category = bitmojiKitSearchCategory;
        this.value = str;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.category = this.category;
        builder.value = this.value;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
