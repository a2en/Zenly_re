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

public final class LoginKitAuthStart extends Message<LoginKitAuthStart, Builder> {
    public static final ProtoAdapter<LoginKitAuthStart> ADAPTER = new ProtoAdapter_LoginKitAuthStart();
    private static final long serialVersionUID = 0;
    @WireField(adapter = "com.snapchat.kit.sdk.core.metrics.model.LoginKitEventBase#ADAPTER", tag = 1)
    public final LoginKitEventBase log_kit_event_base;

    public static final class Builder extends com.squareup.wire.Message.Builder<LoginKitAuthStart, Builder> {
        public LoginKitEventBase log_kit_event_base;

        public Builder log_kit_event_base(LoginKitEventBase loginKitEventBase) {
            this.log_kit_event_base = loginKitEventBase;
            return this;
        }

        public LoginKitAuthStart build() {
            return new LoginKitAuthStart(this.log_kit_event_base, super.buildUnknownFields());
        }
    }

    private static final class ProtoAdapter_LoginKitAuthStart extends ProtoAdapter<LoginKitAuthStart> {
        public ProtoAdapter_LoginKitAuthStart() {
            super(FieldEncoding.LENGTH_DELIMITED, LoginKitAuthStart.class);
        }

        public LoginKitAuthStart decode(ProtoReader protoReader) throws IOException {
            Builder builder = new Builder();
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.log_kit_event_base((LoginKitEventBase) LoginKitEventBase.ADAPTER.decode(protoReader));
                }
            }
        }

        public void encode(ProtoWriter protoWriter, LoginKitAuthStart loginKitAuthStart) throws IOException {
            LoginKitEventBase.ADAPTER.encodeWithTag(protoWriter, 1, loginKitAuthStart.log_kit_event_base);
            protoWriter.writeBytes(loginKitAuthStart.unknownFields());
        }

        public int encodedSize(LoginKitAuthStart loginKitAuthStart) {
            return LoginKitEventBase.ADAPTER.encodedSizeWithTag(1, loginKitAuthStart.log_kit_event_base) + loginKitAuthStart.unknownFields().mo38528g();
        }

        public LoginKitAuthStart redact(LoginKitAuthStart loginKitAuthStart) {
            Builder newBuilder = loginKitAuthStart.newBuilder();
            LoginKitEventBase loginKitEventBase = newBuilder.log_kit_event_base;
            if (loginKitEventBase != null) {
                newBuilder.log_kit_event_base = (LoginKitEventBase) LoginKitEventBase.ADAPTER.redact(loginKitEventBase);
            }
            newBuilder.clearUnknownFields();
            return newBuilder.build();
        }
    }

    public LoginKitAuthStart(LoginKitEventBase loginKitEventBase) {
        this(loginKitEventBase, C13346d.f34617i);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoginKitAuthStart)) {
            return false;
        }
        LoginKitAuthStart loginKitAuthStart = (LoginKitAuthStart) obj;
        if (!unknownFields().equals(loginKitAuthStart.unknownFields()) || !Internal.equals(this.log_kit_event_base, loginKitAuthStart.log_kit_event_base)) {
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
        int hashCode2 = hashCode + (loginKitEventBase != null ? loginKitEventBase.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.log_kit_event_base != null) {
            sb.append(", log_kit_event_base=");
            sb.append(this.log_kit_event_base);
        }
        StringBuilder replace = sb.replace(0, 2, "LoginKitAuthStart{");
        replace.append('}');
        return replace.toString();
    }

    public LoginKitAuthStart(LoginKitEventBase loginKitEventBase, C13346d dVar) {
        super(ADAPTER, dVar);
        this.log_kit_event_base = loginKitEventBase;
    }

    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.log_kit_event_base = this.log_kit_event_base;
        builder.addUnknownFields(unknownFields());
        return builder;
    }
}
