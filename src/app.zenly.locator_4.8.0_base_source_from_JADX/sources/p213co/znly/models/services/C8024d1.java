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

/* renamed from: co.znly.models.services.d1 */
public final class C8024d1 extends GeneratedMessageLite<C8024d1, C8025a> implements ZenlyProto$ChatDeleteMessageRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8024d1 f20365h = new C8024d1();

    /* renamed from: i */
    private static volatile Parser<C8024d1> f20366i;

    /* renamed from: e */
    private String f20367e;

    /* renamed from: f */
    private String f20368f;

    /* renamed from: g */
    private String f20369g;

    /* renamed from: co.znly.models.services.d1$a */
    public static final class C8025a extends Builder<C8024d1, C8025a> implements ZenlyProto$ChatDeleteMessageRequestOrBuilder {
        /* synthetic */ C8025a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8025a mo22057a(String str) {
            copyOnWrite();
            ((C8024d1) this.instance).m19078a(str);
            return this;
        }

        /* renamed from: b */
        public C8025a mo22058b(String str) {
            copyOnWrite();
            ((C8024d1) this.instance).m19080b(str);
            return this;
        }

        public String getConversationUuidDeprecated() {
            return ((C8024d1) this.instance).getConversationUuidDeprecated();
        }

        public ByteString getConversationUuidDeprecatedBytes() {
            return ((C8024d1) this.instance).getConversationUuidDeprecatedBytes();
        }

        public String getMessageUuid() {
            return ((C8024d1) this.instance).getMessageUuid();
        }

        public ByteString getMessageUuidBytes() {
            return ((C8024d1) this.instance).getMessageUuidBytes();
        }

        public String getTargetUuid() {
            return ((C8024d1) this.instance).getTargetUuid();
        }

        public ByteString getTargetUuidBytes() {
            return ((C8024d1) this.instance).getTargetUuidBytes();
        }

        private C8025a() {
            super(C8024d1.f20365h);
        }
    }

    static {
        f20365h.makeImmutable();
    }

    private C8024d1() {
        String str = "";
        this.f20367e = str;
        this.f20368f = str;
        this.f20369g = str;
    }

    public static C8025a newBuilder() {
        return (C8025a) f20365h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8024d1();
            case 2:
                return f20365h;
            case 3:
                return null;
            case 4:
                return new C8025a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8024d1 d1Var = (C8024d1) obj2;
                this.f20367e = visitor.visitString(!this.f20367e.isEmpty(), this.f20367e, !d1Var.f20367e.isEmpty(), d1Var.f20367e);
                this.f20368f = visitor.visitString(!this.f20368f.isEmpty(), this.f20368f, !d1Var.f20368f.isEmpty(), d1Var.f20368f);
                this.f20369g = visitor.visitString(!this.f20369g.isEmpty(), this.f20369g, true ^ d1Var.f20369g.isEmpty(), d1Var.f20369g);
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
                                this.f20367e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20368f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20369g = codedInputStream.readStringRequireUtf8();
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
                if (f20366i == null) {
                    synchronized (C8024d1.class) {
                        if (f20366i == null) {
                            f20366i = new DefaultInstanceBasedParser(f20365h);
                        }
                    }
                }
                return f20366i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20365h;
    }

    public String getConversationUuidDeprecated() {
        return this.f20367e;
    }

    public ByteString getConversationUuidDeprecatedBytes() {
        return ByteString.copyFromUtf8(this.f20367e);
    }

    public String getMessageUuid() {
        return this.f20368f;
    }

    public ByteString getMessageUuidBytes() {
        return ByteString.copyFromUtf8(this.f20368f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20367e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuidDeprecated());
        }
        if (!this.f20368f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessageUuid());
        }
        if (!this.f20369g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getTargetUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getTargetUuid() {
        return this.f20369g;
    }

    public ByteString getTargetUuidBytes() {
        return ByteString.copyFromUtf8(this.f20369g);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20367e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuidDeprecated());
        }
        if (!this.f20368f.isEmpty()) {
            codedOutputStream.writeString(2, getMessageUuid());
        }
        if (!this.f20369g.isEmpty()) {
            codedOutputStream.writeString(3, getTargetUuid());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19080b(String str) {
        if (str != null) {
            this.f20369g = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19078a(String str) {
        if (str != null) {
            this.f20368f = str;
            return;
        }
        throw new NullPointerException();
    }
}
