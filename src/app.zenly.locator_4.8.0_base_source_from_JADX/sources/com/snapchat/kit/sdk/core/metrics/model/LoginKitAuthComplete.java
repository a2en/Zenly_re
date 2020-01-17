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

public final class LoginKitAuthComplete extends Message<LoginKitAuthComplete, Builder> {
    public static final ProtoAdapter<LoginKitAuthComplete> ADAPTER = new ProtoAdapter_LoginKitAuthComplete();
    public static final Boolean DEFAULT_IS_SUCCESS = Boolean.valueOf(false);
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 2)
    public final Boolean is_success;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase#ADAPTER", tag = 1)
    public final LoginKitEventBase log_kit_event_base;

    public static final class Builder extends com.squareup.wire.Message.Builder<LoginKitAuthComplete, Builder> {
        public Boolean is_success;
        public LoginKitEventBase log_kit_event_base;

        public Builder is_success(Boolean bool) {
            this.is_success = bool;
            return this;
        }

        public Builder log_kit_event_base(LoginKitEventBase loginKitEventBase) {
            this.log_kit_event_base = loginKitEventBase;
            return this;
        }

        public LoginKitAuthComplete build() {
            return new LoginKitAuthComplete(this.log_kit_event_base, this.is_success, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_LoginKitAuthComplete extends ProtoAdapter<LoginKitAuthComplete> {
        public ProtoAdapter_LoginKitAuthComplete() {
            super(FieldEncoding.LENGTH_DELIMITED, LoginKitAuthComplete.class);
        }

        public LoginKitAuthComplete decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag == 1) {
                    builder.log_kit_event_base((LoginKitEventBase) LoginKitEventBase.ADAPTER.decode(protoReader));
                } else if (nextTag != 2) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.is_success((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, LoginKitAuthComplete loginKitAuthComplete) throws IOException {
            LoginKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, loginKitAuthComplete.log_kit_event_base);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 2, loginKitAuthComplete.is_success);
            protoWriter.writeBytes(loginKitAuthComplete.unknownFields());
        }

        public int encodedSize(LoginKitAuthComplete loginKitAuthComplete) {
            return LoginKitEventBase.ADAPTER.encodedSizeWithTag(1, loginKitAuthComplete.log_kit_event_base) + ProtoAdapter.BOOL.encodedSizeWithTag(2, loginKitAuthComplete.is_success) + loginKitAuthComplete.unknownFields().mo38528g();
        }

        public LoginKitAuthComplete redact(LoginKitAuthComplete loginKitAuthComplete) {
            Builder newBuilder = loginKitAuthComplete.newBuilder();
            LoginKitEventBase loginKitEventBase = newBuilder.log_kit_event_base;
            if (loginKitEventBase != null) {
                newBuilder.log_kit_event_base = (LoginKitEventBase) LoginKitEventBase.ADAPTER.redact(loginKitEventBase);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public LoginKitAuthComplete(LoginKitEventBase loginKitEventBase, Boolean bool) {
        this(loginKitEventBase, bool, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginKitAuthComplete)) {
            return false;
        }
        LoginKitAuthComplete loginKitAuthComplete = (LoginKitAuthComplete) obj;
        if (!unknownFields().equals(loginKitAuthComplete.unknownFields()) || !Internal.equals(this.log_kit_event_base, loginKitAuthComplete.log_kit_event_base) || !Internal.equals(this.is_success, loginKitAuthComplete.is_success)) {
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
        LoginKitEventBase loginKitEventBase = this.log_kit_event_base;
        int i2 = 0;
        int hashCode2 = (hashCode + (loginKitEventBase != null ? loginKitEventBase.hashCode() : 0)) * 37;
        Boolean bool = this.is_success;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        int i3 = hashCode2 + i2;
        this.hashCode = i3;
        return i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.log_kit_event_base != null) {
            sb.append(", log_kit_event_base=");
            sb.append(this.log_kit_event_base);
        }
        if (this.is_success != null) {
            sb.append(", is_success=");
            sb.append(this.is_success);
        }
        StringBuilder replace = sb.replace(0, 2, "LoginKitAuthComplete{");
        replace.append('}');
        return replace.toString();
    }

    public LoginKitAuthComplete(LoginKitEventBase loginKitEventBase, Boolean bool, C13346d dVar) {
        super(ADAPTER, dVar);
        this.log_kit_event_base = loginKitEventBase;
        this.is_success = bool;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.log_kit_event_base = this.log_kit_event_base;
        builder.is_success = this.is_success;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
