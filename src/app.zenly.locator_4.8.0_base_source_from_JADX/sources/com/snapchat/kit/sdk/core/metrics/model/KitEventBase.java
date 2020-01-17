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

public final class KitEventBase extends Message<KitEventBase, Builder> {
    public static final ProtoAdapter<KitEventBase> ADAPTER = new ProtoAdapter_KitEventBase();
    public static final Long DEFAULT_CLIENT_SEQUENCE_ID;
    public static final String DEFAULT_IP_ADDRESS = "";
    public static final Long DEFAULT_KIT_CLIENT_TIMESTAMP_MILLIS;
    public static final String DEFAULT_KIT_USER_AGENT = "";
    public static final KitType DEFAULT_KIT_VARIANT = KitType.UNKNOWN_KIT_TYPE;
    public static final String DEFAULT_KIT_VARIANT_VERSION = "";
    public static final String DEFAULT_LOCALE = "";
    public static final Long DEFAULT_MAX_CLIENT_SEQUENCE_ID_ON_INSTANCE;
    public static final String DEFAULT_OAUTH_CLIENT_ID = "";
    public static final String DEFAULT_OS_MINOR_VERSION = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 9)
    public final Long client_sequence_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String ip_address;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 8)
    public final Long kit_client_timestamp_millis;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String kit_user_agent;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.KitType#ADAPTER", tag = 6)
    public final KitType kit_variant;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String kit_variant_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String locale;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 10)
    public final Long max_client_sequence_id_on_instance;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String oauth_client_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String os_minor_version;

    public static final class Builder extends com.squareup.wire.Message.Builder<KitEventBase, Builder> {
        public Long client_sequence_id;
        public String ip_address;
        public Long kit_client_timestamp_millis;
        public String kit_user_agent;
        public KitType kit_variant;
        public String kit_variant_version;
        public String locale;
        public Long max_client_sequence_id_on_instance;
        public String oauth_client_id;
        public String os_minor_version;

        public Builder client_sequence_id(Long l) {
            this.client_sequence_id = l;
            return this;
        }

        public Builder ip_address(String str) {
            this.ip_address = str;
            return this;
        }

        public Builder kit_client_timestamp_millis(Long l) {
            this.kit_client_timestamp_millis = l;
            return this;
        }

        public Builder kit_user_agent(String str) {
            this.kit_user_agent = str;
            return this;
        }

        public Builder kit_variant(KitType kitType) {
            this.kit_variant = kitType;
            return this;
        }

        public Builder kit_variant_version(String str) {
            this.kit_variant_version = str;
            return this;
        }

        public Builder locale(String str) {
            this.locale = str;
            return this;
        }

        public Builder max_client_sequence_id_on_instance(Long l) {
            this.max_client_sequence_id_on_instance = l;
            return this;
        }

        public Builder oauth_client_id(String str) {
            this.oauth_client_id = str;
            return this;
        }

        public Builder os_minor_version(String str) {
            this.os_minor_version = str;
            return this;
        }

        public KitEventBase build() {
            KitEventBase kitEventBase = new KitEventBase(this.oauth_client_id, this.locale, this.kit_user_agent, this.ip_address, this.os_minor_version, this.kit_variant, this.kit_variant_version, this.kit_client_timestamp_millis, this.client_sequence_id, this.max_client_sequence_id_on_instance, super.buildUnknownFields());
            return kitEventBase;
        }
    }

    private static final class ProtoAdapter_KitEventBase extends ProtoAdapter<KitEventBase> {
        public ProtoAdapter_KitEventBase() {
            super(FieldEncoding.LENGTH_DELIMITED, KitEventBase.class);
        }

        public KitEventBase decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.oauth_client_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.locale((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.kit_user_agent((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 4:
                            builder.ip_address((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.os_minor_version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            try {
                                builder.kit_variant((KitType) KitType.ADAPTER.decode(protoReader));
                                break;
                            } catch (EnumConstantNotFoundException e) {
                                builder.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf((long) e.value));
                                break;
                            }
                        case 7:
                            builder.kit_variant_version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.kit_client_timestamp_millis((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case 9:
                            builder.client_sequence_id((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case 10:
                            builder.max_client_sequence_id_on_instance((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }

        public void encode(ProtoWriter protoWriter, KitEventBase kitEventBase) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, kitEventBase.oauth_client_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, kitEventBase.locale);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 3, kitEventBase.kit_user_agent);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, kitEventBase.ip_address);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, kitEventBase.os_minor_version);
            KitType.ADAPTER.encodeWithTag(protoWriter, 6, kitEventBase.kit_variant);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, kitEventBase.kit_variant_version);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 8, kitEventBase.kit_client_timestamp_millis);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 9, kitEventBase.client_sequence_id);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 10, kitEventBase.max_client_sequence_id_on_instance);
            protoWriter.writeBytes(kitEventBase.unknownFields());
        }

        public int encodedSize(KitEventBase kitEventBase) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, kitEventBase.oauth_client_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, kitEventBase.locale) + ProtoAdapter.STRING.encodedSizeWithTag(3, kitEventBase.kit_user_agent) + ProtoAdapter.STRING.encodedSizeWithTag(4, kitEventBase.ip_address) + ProtoAdapter.STRING.encodedSizeWithTag(5, kitEventBase.os_minor_version) + KitType.ADAPTER.encodedSizeWithTag(6, kitEventBase.kit_variant) + ProtoAdapter.STRING.encodedSizeWithTag(7, kitEventBase.kit_variant_version) + ProtoAdapter.UINT64.encodedSizeWithTag(8, kitEventBase.kit_client_timestamp_millis) + ProtoAdapter.UINT64.encodedSizeWithTag(9, kitEventBase.client_sequence_id) + ProtoAdapter.UINT64.encodedSizeWithTag(10, kitEventBase.max_client_sequence_id_on_instance) + kitEventBase.unknownFields().mo38528g();
        }

        public KitEventBase redact(KitEventBase kitEventBase) {
            Builder newBuilder = kitEventBase.newBuilder();
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    static {
        Long valueOf = Long.valueOf(0);
        DEFAULT_KIT_CLIENT_TIMESTAMP_MILLIS = valueOf;
        DEFAULT_CLIENT_SEQUENCE_ID = valueOf;
        DEFAULT_MAX_CLIENT_SEQUENCE_ID_ON_INSTANCE = valueOf;
    }

    public KitEventBase(String str, String str2, String str3, String str4, String str5, KitType kitType, String str6, Long l, Long l2, Long l3) {
        this(str, str2, str3, str4, str5, kitType, str6, l, l2, l3, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof KitEventBase)) {
            return false;
        }
        KitEventBase kitEventBase = (KitEventBase) obj;
        if (!unknownFields().equals(kitEventBase.unknownFields()) || !Internal.equals(this.oauth_client_id, kitEventBase.oauth_client_id) || !Internal.equals(this.locale, kitEventBase.locale) || !Internal.equals(this.kit_user_agent, kitEventBase.kit_user_agent) || !Internal.equals(this.ip_address, kitEventBase.ip_address) || !Internal.equals(this.os_minor_version, kitEventBase.os_minor_version) || !Internal.equals(this.kit_variant, kitEventBase.kit_variant) || !Internal.equals(this.kit_variant_version, kitEventBase.kit_variant_version) || !Internal.equals(this.kit_client_timestamp_millis, kitEventBase.kit_client_timestamp_millis) || !Internal.equals(this.client_sequence_id, kitEventBase.client_sequence_id) || !Internal.equals(this.max_client_sequence_id_on_instance, kitEventBase.max_client_sequence_id_on_instance)) {
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
        String str = this.oauth_client_id;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.locale;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.kit_user_agent;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.ip_address;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.os_minor_version;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        KitType kitType = this.kit_variant;
        int hashCode7 = (hashCode6 + (kitType != null ? kitType.hashCode() : 0)) * 37;
        String str6 = this.kit_variant_version;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        Long l = this.kit_client_timestamp_millis;
        int hashCode9 = (hashCode8 + (l != null ? l.hashCode() : 0)) * 37;
        Long l2 = this.client_sequence_id;
        int hashCode10 = (hashCode9 + (l2 != null ? l2.hashCode() : 0)) * 37;
        Long l3 = this.max_client_sequence_id_on_instance;
        if (l3 != null) {
            i2 = l3.hashCode();
        }
        int i3 = hashCode10 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.oauth_client_id != null) {
            sb.append(", oauth_client_id=");
            sb.append(this.oauth_client_id);
        }
        if (this.locale != null) {
            sb.append(", locale=");
            sb.append(this.locale);
        }
        if (this.kit_user_agent != null) {
            sb.append(", kit_user_agent=");
            sb.append(this.kit_user_agent);
        }
        if (this.ip_address != null) {
            sb.append(", ip_address=");
            sb.append(this.ip_address);
        }
        if (this.os_minor_version != null) {
            sb.append(", os_minor_version=");
            sb.append(this.os_minor_version);
        }
        if (this.kit_variant != null) {
            sb.append(", kit_variant=");
            sb.append(this.kit_variant);
        }
        if (this.kit_variant_version != null) {
            sb.append(", kit_variant_version=");
            sb.append(this.kit_variant_version);
        }
        if (this.kit_client_timestamp_millis != null) {
            sb.append(", kit_client_timestamp_millis=");
            sb.append(this.kit_client_timestamp_millis);
        }
        if (this.client_sequence_id != null) {
            sb.append(", client_sequence_id=");
            sb.append(this.client_sequence_id);
        }
        if (this.max_client_sequence_id_on_instance != null) {
            sb.append(", max_client_sequence_id_on_instance=");
            sb.append(this.max_client_sequence_id_on_instance);
        }
        StringBuilder replace = sb.replace(0, 2, "KitEventBase{");
        replace.append('}');
        return replace.toString();
    }

    public KitEventBase(String str, String str2, String str3, String str4, String str5, KitType kitType, String str6, Long l, Long l2, Long l3, C13346d dVar) {
        super(ADAPTER, dVar);
        this.oauth_client_id = str;
        this.locale = str2;
        this.kit_user_agent = str3;
        this.ip_address = str4;
        this.os_minor_version = str5;
        this.kit_variant = kitType;
        this.kit_variant_version = str6;
        this.kit_client_timestamp_millis = l;
        this.client_sequence_id = l2;
        this.max_client_sequence_id_on_instance = l3;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.oauth_client_id = this.oauth_client_id;
        builder.locale = this.locale;
        builder.kit_user_agent = this.kit_user_agent;
        builder.ip_address = this.ip_address;
        builder.os_minor_version = this.os_minor_version;
        builder.kit_variant = this.kit_variant;
        builder.kit_variant_version = this.kit_variant_version;
        builder.kit_client_timestamp_millis = this.kit_client_timestamp_millis;
        builder.client_sequence_id = this.client_sequence_id;
        builder.max_client_sequence_id_on_instance = this.max_client_sequence_id_on_instance;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
