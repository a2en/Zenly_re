package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.PingProto$Ping2;
import p213co.znly.models.PingProto$Ping2.C6823a;

/* renamed from: co.znly.models.services.o1 */
public final class C8204o1 extends GeneratedMessageLite<C8204o1, C8205a> implements ZenlyProto$ChatSendMessageRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8204o1 f20765g = new C8204o1();

    /* renamed from: h */
    private static volatile Parser<C8204o1> f20766h;

    /* renamed from: e */
    private String f20767e = "";

    /* renamed from: f */
    private PingProto$Ping2 f20768f;

    /* renamed from: co.znly.models.services.o1$a */
    public static final class C8205a extends Builder<C8204o1, C8205a> implements ZenlyProto$ChatSendMessageRequestOrBuilder {
        /* synthetic */ C8205a(C8104i0 i0Var) {
            this();
        }

        public String getConversationUuidDeprecated() {
            return ((C8204o1) this.instance).getConversationUuidDeprecated();
        }

        public ByteString getConversationUuidDeprecatedBytes() {
            return ((C8204o1) this.instance).getConversationUuidDeprecatedBytes();
        }

        public PingProto$Ping2 getMessage() {
            return ((C8204o1) this.instance).getMessage();
        }

        public boolean hasMessage() {
            return ((C8204o1) this.instance).hasMessage();
        }

        private C8205a() {
            super(C8204o1.f20765g);
        }
    }

    static {
        f20765g.makeImmutable();
    }

    private C8204o1() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8204o1();
            case 2:
                return f20765g;
            case 3:
                return null;
            case 4:
                return new C8205a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8204o1 o1Var = (C8204o1) obj2;
                this.f20767e = visitor.visitString(!this.f20767e.isEmpty(), this.f20767e, true ^ o1Var.f20767e.isEmpty(), o1Var.f20767e);
                this.f20768f = (PingProto$Ping2) visitor.visitMessage(this.f20768f, o1Var.f20768f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f20767e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f20768f != null ? (C6823a) this.f20768f.toBuilder() : null;
                                this.f20768f = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20768f);
                                    this.f20768f = (PingProto$Ping2) builder.buildPartial();
                                }
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e) {
                        throw new RuntimeException(e.setUnfinishedMessage(this));
                    } catch (IOException e2) {
                        throw new RuntimeException(new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this));
                    }
                }
                break;
            case 7:
                break;
            case 8:
                if (f20766h == null) {
                    synchronized (C8204o1.class) {
                        if (f20766h == null) {
                            f20766h = new DefaultInstanceBasedParser(f20765g);
                        }
                    }
                }
                return f20766h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20765g;
    }

    public String getConversationUuidDeprecated() {
        return this.f20767e;
    }

    public ByteString getConversationUuidDeprecatedBytes() {
        return ByteString.copyFromUtf8(this.f20767e);
    }

    public PingProto$Ping2 getMessage() {
        PingProto$Ping2 pingProto$Ping2 = this.f20768f;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20767e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuidDeprecated());
        }
        if (this.f20768f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasMessage() {
        return this.f20768f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20767e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuidDeprecated());
        }
        if (this.f20768f != null) {
            codedOutputStream.writeMessage(2, getMessage());
        }
    }
}
