package com.snapchat.kit.sdk.core.metrics.model;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.C13346d;

public final class ServerEvent extends Message<ServerEvent, Builder> {
    public static final ProtoAdapter<ServerEvent> ADAPTER = new ProtoAdapter_ServerEvent();
    public static final String DEFAULT_APP_BUILD = "";
    public static final String DEFAULT_APP_VERSION = "";
    public static final String DEFAULT_CITY = "";
    public static final String DEFAULT_COUNTRY = "";
    public static final String DEFAULT_EVENT_ID = "";
    public static final String DEFAULT_EVENT_NAME = "";
    public static final String DEFAULT_INSTANCE_ID = "";
    public static final String DEFAULT_OS_TYPE = "";
    public static final String DEFAULT_OS_VERSION = "";
    public static final String DEFAULT_REGION = "";
    public static final String DEFAULT_REQUEST_ID = "";
    public static final Long DEFAULT_SEQUENCE_ID = Long.valueOf(0);
    public static final Double DEFAULT_SERVER_TS = Double.valueOf(0.0d);
    public static final String DEFAULT_USER_AGENT = "";
    public static final String DEFAULT_USER_ID = "";
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final String app_build;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 14)
    public final String app_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String city;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String country;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.ServerEventData#ADAPTER", tag = 100)
    public final ServerEventData event_data;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final String event_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String event_name;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final String instance_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 12)
    public final String os_type;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 13)
    public final String os_version;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String region;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String request_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", tag = 11)
    public final Long sequence_id;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", tag = 3)
    public final Double server_ts;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String user_agent;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String user_id;

    public static final class Builder extends com.squareup.wire.Message.Builder<ServerEvent, Builder> {
        public String app_build;
        public String app_version;
        public String city;
        public String country;
        public ServerEventData event_data;
        public String event_id;
        public String event_name;
        public String instance_id;
        public String os_type;
        public String os_version;
        public String region;
        public String request_id;
        public Long sequence_id;
        public Double server_ts;
        public String user_agent;
        public String user_id;

        public Builder app_build(String str) {
            this.app_build = str;
            return this;
        }

        public Builder app_version(String str) {
            this.app_version = str;
            return this;
        }

        public Builder city(String str) {
            this.city = str;
            return this;
        }

        public Builder country(String str) {
            this.country = str;
            return this;
        }

        public Builder event_data(ServerEventData serverEventData) {
            this.event_data = serverEventData;
            return this;
        }

        public Builder event_id(String str) {
            this.event_id = str;
            return this;
        }

        public Builder event_name(String str) {
            this.event_name = str;
            return this;
        }

        public Builder instance_id(String str) {
            this.instance_id = str;
            return this;
        }

        public Builder os_type(String str) {
            this.os_type = str;
            return this;
        }

        public Builder os_version(String str) {
            this.os_version = str;
            return this;
        }

        public Builder region(String str) {
            this.region = str;
            return this;
        }

        public Builder request_id(String str) {
            this.request_id = str;
            return this;
        }

        public Builder sequence_id(Long l) {
            this.sequence_id = l;
            return this;
        }

        public Builder server_ts(Double d) {
            this.server_ts = d;
            return this;
        }

        public Builder user_agent(String str) {
            this.user_agent = str;
            return this;
        }

        public Builder user_id(String str) {
            this.user_id = str;
            return this;
        }

        public ServerEvent build() {
            ServerEvent serverEvent = new ServerEvent(this.event_name, this.request_id, this.server_ts, this.user_id, this.user_agent, this.country, this.city, this.region, this.event_id, this.instance_id, this.sequence_id, this.os_type, this.os_version, this.app_version, this.app_build, this.event_data, super.buildUnknownFields());
            return serverEvent;
        }
    }

    private static final class ProtoAdapter_ServerEvent extends ProtoAdapter<ServerEvent> {
        public ProtoAdapter_ServerEvent() {
            super(FieldEncoding.LENGTH_DELIMITED, ServerEvent.class);
        }

        public ServerEvent decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 100) {
                    switch (nextTag) {
                        case 1:
                            builder.event_name((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.request_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 3:
                            builder.server_ts((Double) ProtoAdapter.DOUBLE.decode(protoReader));
                            break;
                        case 4:
                            builder.user_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.user_agent((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            builder.country((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 7:
                            builder.city((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 8:
                            builder.region((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 9:
                            builder.event_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 10:
                            builder.instance_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 11:
                            builder.sequence_id((Long) ProtoAdapter.UINT64.decode(protoReader));
                            break;
                        case 12:
                            builder.os_type((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 13:
                            builder.os_version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 14:
                            builder.app_version((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 15:
                            builder.app_build((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                            builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            break;
                    }
                } else {
                    builder.event_data((ServerEventData) ServerEventData.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, ServerEvent serverEvent) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, serverEvent.event_name);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, serverEvent.request_id);
            ProtoAdapter.DOUBLE.encodeWithTag(protoWriter, 3, serverEvent.server_ts);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, serverEvent.user_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 5, serverEvent.user_agent);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 6, serverEvent.country);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, serverEvent.city);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 8, serverEvent.region);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 9, serverEvent.event_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 10, serverEvent.instance_id);
            ProtoAdapter.UINT64.encodeWithTag(protoWriter, 11, serverEvent.sequence_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 12, serverEvent.os_type);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 13, serverEvent.os_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 14, serverEvent.app_version);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 15, serverEvent.app_build);
            ServerEventData.ADAPTER.encodeWithTag(protoWriter, 100, serverEvent.event_data);
            protoWriter.writeBytes(serverEvent.unknownFields());
        }

        public int encodedSize(ServerEvent serverEvent) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, serverEvent.event_name) + ProtoAdapter.STRING.encodedSizeWithTag(2, serverEvent.request_id) + ProtoAdapter.DOUBLE.encodedSizeWithTag(3, serverEvent.server_ts) + ProtoAdapter.STRING.encodedSizeWithTag(4, serverEvent.user_id) + ProtoAdapter.STRING.encodedSizeWithTag(5, serverEvent.user_agent) + ProtoAdapter.STRING.encodedSizeWithTag(6, serverEvent.country) + ProtoAdapter.STRING.encodedSizeWithTag(7, serverEvent.city) + ProtoAdapter.STRING.encodedSizeWithTag(8, serverEvent.region) + ProtoAdapter.STRING.encodedSizeWithTag(9, serverEvent.event_id) + ProtoAdapter.STRING.encodedSizeWithTag(10, serverEvent.instance_id) + ProtoAdapter.UINT64.encodedSizeWithTag(11, serverEvent.sequence_id) + ProtoAdapter.STRING.encodedSizeWithTag(12, serverEvent.os_type) + ProtoAdapter.STRING.encodedSizeWithTag(13, serverEvent.os_version) + ProtoAdapter.STRING.encodedSizeWithTag(14, serverEvent.app_version) + ProtoAdapter.STRING.encodedSizeWithTag(15, serverEvent.app_build) + ServerEventData.ADAPTER.encodedSizeWithTag(100, serverEvent.event_data) + serverEvent.unknownFields().mo38528g();
        }

        public ServerEvent redact(ServerEvent serverEvent) {
            Builder newBuilder = serverEvent.newBuilder();
            ServerEventData serverEventData = newBuilder.event_data;
            if (serverEventData != null) {
                newBuilder.event_data = (ServerEventData) ServerEventData.ADAPTER.redact(serverEventData);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public ServerEvent(String str, String str2, Double d, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, String str10, String str11, String str12, String str13, ServerEventData serverEventData) {
        this(str, str2, d, str3, str4, str5, str6, str7, str8, str9, l, str10, str11, str12, str13, serverEventData, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ServerEvent)) {
            return false;
        }
        ServerEvent serverEvent = (ServerEvent) obj;
        if (!unknownFields().equals(serverEvent.unknownFields()) || !Internal.equals(this.event_name, serverEvent.event_name) || !Internal.equals(this.request_id, serverEvent.request_id) || !Internal.equals(this.server_ts, serverEvent.server_ts) || !Internal.equals(this.user_id, serverEvent.user_id) || !Internal.equals(this.user_agent, serverEvent.user_agent) || !Internal.equals(this.country, serverEvent.country) || !Internal.equals(this.city, serverEvent.city) || !Internal.equals(this.region, serverEvent.region) || !Internal.equals(this.event_id, serverEvent.event_id) || !Internal.equals(this.instance_id, serverEvent.instance_id) || !Internal.equals(this.sequence_id, serverEvent.sequence_id) || !Internal.equals(this.os_type, serverEvent.os_type) || !Internal.equals(this.os_version, serverEvent.os_version) || !Internal.equals(this.app_version, serverEvent.app_version) || !Internal.equals(this.app_build, serverEvent.app_build) || !Internal.equals(this.event_data, serverEvent.event_data)) {
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
        String str = this.event_name;
        int i2 = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.request_id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Double d = this.server_ts;
        int hashCode4 = (hashCode3 + (d != null ? d.hashCode() : 0)) * 37;
        String str3 = this.user_id;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.user_agent;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.country;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.city;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.region;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.event_id;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.instance_id;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 37;
        Long l = this.sequence_id;
        int hashCode12 = (hashCode11 + (l != null ? l.hashCode() : 0)) * 37;
        String str10 = this.os_type;
        int hashCode13 = (hashCode12 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.os_version;
        int hashCode14 = (hashCode13 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.app_version;
        int hashCode15 = (hashCode14 + (str12 != null ? str12.hashCode() : 0)) * 37;
        String str13 = this.app_build;
        int hashCode16 = (hashCode15 + (str13 != null ? str13.hashCode() : 0)) * 37;
        ServerEventData serverEventData = this.event_data;
        if (serverEventData != null) {
            i2 = serverEventData.hashCode();
        }
        int i3 = hashCode16 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.event_name != null) {
            sb.append(", event_name=");
            sb.append(this.event_name);
        }
        if (this.request_id != null) {
            sb.append(", request_id=");
            sb.append(this.request_id);
        }
        if (this.server_ts != null) {
            sb.append(", server_ts=");
            sb.append(this.server_ts);
        }
        if (this.user_id != null) {
            sb.append(", user_id=");
            sb.append(this.user_id);
        }
        if (this.user_agent != null) {
            sb.append(", user_agent=");
            sb.append(this.user_agent);
        }
        if (this.country != null) {
            sb.append(", country=");
            sb.append(this.country);
        }
        if (this.city != null) {
            sb.append(", city=");
            sb.append(this.city);
        }
        if (this.region != null) {
            sb.append(", region=");
            sb.append(this.region);
        }
        if (this.event_id != null) {
            sb.append(", event_id=");
            sb.append(this.event_id);
        }
        if (this.instance_id != null) {
            sb.append(", instance_id=");
            sb.append(this.instance_id);
        }
        if (this.sequence_id != null) {
            sb.append(", sequence_id=");
            sb.append(this.sequence_id);
        }
        if (this.os_type != null) {
            sb.append(", os_type=");
            sb.append(this.os_type);
        }
        if (this.os_version != null) {
            sb.append(", os_version=");
            sb.append(this.os_version);
        }
        if (this.app_version != null) {
            sb.append(", app_version=");
            sb.append(this.app_version);
        }
        if (this.app_build != null) {
            sb.append(", app_build=");
            sb.append(this.app_build);
        }
        if (this.event_data != null) {
            sb.append(", event_data=");
            sb.append(this.event_data);
        }
        StringBuilder replace = sb.replace(0, 2, "ServerEvent{");
        replace.append('}');
        return replace.toString();
    }

    public ServerEvent(String str, String str2, Double d, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Long l, String str10, String str11, String str12, String str13, ServerEventData serverEventData, C13346d dVar) {
        super(ADAPTER, dVar);
        this.event_name = str;
        this.request_id = str2;
        this.server_ts = d;
        this.user_id = str3;
        this.user_agent = str4;
        this.country = str5;
        this.city = str6;
        this.region = str7;
        this.event_id = str8;
        this.instance_id = str9;
        this.sequence_id = l;
        this.os_type = str10;
        this.os_version = str11;
        this.app_version = str12;
        this.app_build = str13;
        this.event_data = serverEventData;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.event_name = this.event_name;
        builder.request_id = this.request_id;
        builder.server_ts = this.server_ts;
        builder.user_id = this.user_id;
        builder.user_agent = this.user_agent;
        builder.country = this.country;
        builder.city = this.city;
        builder.region = this.region;
        builder.event_id = this.event_id;
        builder.instance_id = this.instance_id;
        builder.sequence_id = this.sequence_id;
        builder.os_type = this.os_type;
        builder.os_version = this.os_version;
        builder.app_version = this.app_version;
        builder.app_build = this.app_build;
        builder.event_data = this.event_data;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
