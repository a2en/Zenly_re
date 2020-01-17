package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoAdapter.EnumConstantNotFoundException;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.WireField.Label;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.List;
import okio.C13346d;

public final class BitmojiKitShare extends Message<BitmojiKitShare, Builder> {
    public static final ProtoAdapter<BitmojiKitShare> ADAPTER = new ProtoAdapter_BitmojiKitShare();
    public static final BitmojiKitSearchCategory DEFAULT_SEARCH_CATEGORY = BitmojiKitSearchCategory.UNKNOWN_BITMOJI_KIT_SEARCH_CATEGORY;
    public static final BitmojiKitShareCategory DEFAULT_SHARE_CATEGORY = BitmojiKitShareCategory.UNKNOWN_BITMOJI_KIT_SHARE_CATEGORY;
    public static final String DEFAULT_STICKER_ID = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitEventBase#ADAPTER", tag = 1)
    public final BitmojiKitEventBase bitmoji_kit_event_base;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitSearchCategory#ADAPTER", tag = 5)
    public final BitmojiKitSearchCategory search_category;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.BitmojiKitShareCategory#ADAPTER", tag = 4)
    public final BitmojiKitShareCategory share_category;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String sticker_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = Label.REPEATED, tag = 2)
    public final List<String> subject_user_ids;

    public static final class Builder extends com.squareup.wire.Message.Builder<BitmojiKitShare, Builder> {
        public BitmojiKitEventBase bitmoji_kit_event_base;
        public BitmojiKitSearchCategory search_category;
        public BitmojiKitShareCategory share_category;
        public String sticker_id;
        public List<String> subject_user_ids = Internal.newMutableList();

        public Builder bitmoji_kit_event_base(BitmojiKitEventBase bitmojiKitEventBase) {
            this.bitmoji_kit_event_base = bitmojiKitEventBase;
            return this;
        }

        public Builder search_category(BitmojiKitSearchCategory bitmojiKitSearchCategory) {
            this.search_category = bitmojiKitSearchCategory;
            return this;
        }

        public Builder share_category(BitmojiKitShareCategory bitmojiKitShareCategory) {
            this.share_category = bitmojiKitShareCategory;
            return this;
        }

        public Builder sticker_id(String str) {
            this.sticker_id = str;
            return this;
        }

        public Builder subject_user_ids(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.subject_user_ids = list;
            return this;
        }

        public BitmojiKitShare build() {
            BitmojiKitShare bitmojiKitShare = new BitmojiKitShare(this.bitmoji_kit_event_base, this.subject_user_ids, this.sticker_id, this.share_category, this.search_category, super.buildUnknownFields());
            return bitmojiKitShare;
        }
    }

    private static final class ProtoAdapter_BitmojiKitShare extends ProtoAdapter<BitmojiKitShare> {
        public ProtoAdapter_BitmojiKitShare() {
            super(FieldEncoding.LENGTH_DELIMITED, BitmojiKitShare.class);
        }

        public BitmojiKitShare decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.bitmoji_kit_event_base((BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag == 2) {
                    builder.subject_user_ids.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 3) {
                    builder.sticker_id((String) ProtoAdapter.STRING.decode(protoReader));
                } else if (nextTag == 4) {
                    try {
                        builder.share_category((BitmojiKitShareCategory) BitmojiKitShareCategory.ADAPTER.decode(protoReader));
                    } catch (EnumConstantNotFoundException e) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                    }
                } else if (nextTag != 5) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    try {
                        builder.search_category((BitmojiKitSearchCategory) BitmojiKitSearchCategory.ADAPTER.decode(protoReader));
                    } catch (EnumConstantNotFoundException e2) {
                        builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e2.value));
                    }
                }
            }
        }

        public void encode(ProtoWriter protoWriter, BitmojiKitShare bitmojiKitShare) throws IOException {
            BitmojiKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, bitmojiKitShare.bitmoji_kit_event_base);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, bitmojiKitShare.subject_user_ids);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, bitmojiKitShare.sticker_id);
            BitmojiKitShareCategory.ADAPTER.encodeWithTag(protoWriter, 4, bitmojiKitShare.share_category);
            BitmojiKitSearchCategory.ADAPTER.encodeWithTag(protoWriter, 5, bitmojiKitShare.search_category);
            protoWriter.writeBytes(bitmojiKitShare.unknownFields());
        }

        public int encodedSize(BitmojiKitShare bitmojiKitShare) {
            return BitmojiKitEventBase.ADAPTER.encodedSizeWithTag(1, bitmojiKitShare.bitmoji_kit_event_base) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, bitmojiKitShare.subject_user_ids) + ProtoAdapter.STRING.encodedSizeWithTag(3, bitmojiKitShare.sticker_id) + BitmojiKitShareCategory.ADAPTER.encodedSizeWithTag(4, bitmojiKitShare.share_category) + BitmojiKitSearchCategory.ADAPTER.encodedSizeWithTag(5, bitmojiKitShare.search_category) + bitmojiKitShare.unknownFields().mo38528g();
        }

        public BitmojiKitShare redact(BitmojiKitShare bitmojiKitShare) {
            Builder newBuilder = bitmojiKitShare.newBuilder();
            BitmojiKitEventBase bitmojiKitEventBase = newBuilder.bitmoji_kit_event_base;
            if (bitmojiKitEventBase != null) {
                newBuilder.bitmoji_kit_event_base = (BitmojiKitEventBase) BitmojiKitEventBase.ADAPTER.redact(bitmojiKitEventBase);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public BitmojiKitShare(BitmojiKitEventBase bitmojiKitEventBase, List<String> list, String str, BitmojiKitShareCategory bitmojiKitShareCategory, BitmojiKitSearchCategory bitmojiKitSearchCategory) {
        this(bitmojiKitEventBase, list, str, bitmojiKitShareCategory, bitmojiKitSearchCategory, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitmojiKitShare)) {
            return false;
        }
        BitmojiKitShare bitmojiKitShare = (BitmojiKitShare) obj;
        if (!unknownFields().equals(bitmojiKitShare.unknownFields()) || !Internal.equals(this.bitmoji_kit_event_base, bitmojiKitShare.bitmoji_kit_event_base) || !this.subject_user_ids.equals(bitmojiKitShare.subject_user_ids) || !Internal.equals(this.sticker_id, bitmojiKitShare.sticker_id) || !Internal.equals(this.share_category, bitmojiKitShare.share_category) || !Internal.equals(this.search_category, bitmojiKitShare.search_category)) {
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
        BitmojiKitEventBase bitmojiKitEventBase = this.bitmoji_kit_event_base;
        int i2 = 0;
        int hashCode2 = (((hashCode + (bitmojiKitEventBase != null ? bitmojiKitEventBase.hashCode() : 0)) * 37) + this.subject_user_ids.hashCode()) * 37;
        String str = this.sticker_id;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        BitmojiKitShareCategory bitmojiKitShareCategory = this.share_category;
        int hashCode4 = (hashCode3 + (bitmojiKitShareCategory != null ? bitmojiKitShareCategory.hashCode() : 0)) * 37;
        BitmojiKitSearchCategory bitmojiKitSearchCategory = this.search_category;
        if (bitmojiKitSearchCategory != null) {
            i2 = bitmojiKitSearchCategory.hashCode();
        }
        int i3 = hashCode4 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bitmoji_kit_event_base != null) {
            sb.append(", bitmoji_kit_event_base=");
            sb.append(this.bitmoji_kit_event_base);
        }
        if (!this.subject_user_ids.isEmpty()) {
            sb.append(", subject_user_ids=");
            sb.append(this.subject_user_ids);
        }
        if (this.sticker_id != null) {
            sb.append(", sticker_id=");
            sb.append(this.sticker_id);
        }
        if (this.share_category != null) {
            sb.append(", share_category=");
            sb.append(this.share_category);
        }
        if (this.search_category != null) {
            sb.append(", search_category=");
            sb.append(this.search_category);
        }
        StringBuilder replace = sb.replace(0, 2, "BitmojiKitShare{");
        replace.append('}');
        return replace.toString();
    }

    public BitmojiKitShare(BitmojiKitEventBase bitmojiKitEventBase, List<String> list, String str, BitmojiKitShareCategory bitmojiKitShareCategory, BitmojiKitSearchCategory bitmojiKitSearchCategory, C13346d dVar) {
        super(ADAPTER, dVar);
        this.bitmoji_kit_event_base = bitmojiKitEventBase;
        this.subject_user_ids = Internal.immutableCopyOf("subject_user_ids", list);
        this.sticker_id = str;
        this.share_category = bitmojiKitShareCategory;
        this.search_category = bitmojiKitSearchCategory;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.bitmoji_kit_event_base = this.bitmoji_kit_event_base;
        builder.subject_user_ids = Internal.copyOf("subject_user_ids", this.subject_user_ids);
        builder.sticker_id = this.sticker_id;
        builder.share_category = this.share_category;
        builder.search_category = this.search_category;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
