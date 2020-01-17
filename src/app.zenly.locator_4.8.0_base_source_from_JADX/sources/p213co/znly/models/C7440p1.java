package p213co.znly.models;

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
import p213co.znly.models.C7511y1.C7512a;
import p213co.znly.models.PingProto$Ping2.C6823a;

/* renamed from: co.znly.models.p1 */
public final class C7440p1 extends GeneratedMessageLite<C7440p1, C7441a> implements PingProto$ChatInsertOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7440p1 f18606i = new C7440p1();

    /* renamed from: j */
    private static volatile Parser<C7440p1> f18607j;

    /* renamed from: e */
    private String f18608e;

    /* renamed from: f */
    private String f18609f;

    /* renamed from: g */
    private PingProto$Ping2 f18610g;

    /* renamed from: h */
    private C7511y1 f18611h;

    /* renamed from: co.znly.models.p1$a */
    public static final class C7441a extends Builder<C7440p1, C7441a> implements PingProto$ChatInsertOrBuilder {
        /* synthetic */ C7441a(C7383l1 l1Var) {
            this();
        }

        public String getConversationUuid() {
            return ((C7440p1) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7440p1) this.instance).getConversationUuidBytes();
        }

        public String getHash() {
            return ((C7440p1) this.instance).getHash();
        }

        public ByteString getHashBytes() {
            return ((C7440p1) this.instance).getHashBytes();
        }

        public PingProto$Ping2 getMessage() {
            return ((C7440p1) this.instance).getMessage();
        }

        public C7511y1 getMetadata() {
            return ((C7440p1) this.instance).getMetadata();
        }

        public boolean hasMessage() {
            return ((C7440p1) this.instance).hasMessage();
        }

        public boolean hasMetadata() {
            return ((C7440p1) this.instance).hasMetadata();
        }

        private C7441a() {
            super(C7440p1.f18606i);
        }
    }

    static {
        f18606i.makeImmutable();
    }

    private C7440p1() {
        String str = "";
        this.f18608e = str;
        this.f18609f = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7383l1.f18408a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7440p1();
            case 2:
                return f18606i;
            case 3:
                return null;
            case 4:
                return new C7441a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7440p1 p1Var = (C7440p1) obj2;
                this.f18608e = visitor.visitString(!this.f18608e.isEmpty(), this.f18608e, !p1Var.f18608e.isEmpty(), p1Var.f18608e);
                this.f18609f = visitor.visitString(!this.f18609f.isEmpty(), this.f18609f, true ^ p1Var.f18609f.isEmpty(), p1Var.f18609f);
                this.f18610g = (PingProto$Ping2) visitor.visitMessage(this.f18610g, p1Var.f18610g);
                this.f18611h = (C7511y1) visitor.visitMessage(this.f18611h, p1Var.f18611h);
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
                                this.f18608e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f18610g != null ? (C6823a) this.f18610g.toBuilder() : null;
                                this.f18610g = (PingProto$Ping2) codedInputStream.readMessage(PingProto$Ping2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18610g);
                                    this.f18610g = (PingProto$Ping2) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                this.f18609f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                Builder builder2 = this.f18611h != null ? (C7512a) this.f18611h.toBuilder() : null;
                                this.f18611h = (C7511y1) codedInputStream.readMessage(C7511y1.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18611h);
                                    this.f18611h = (C7511y1) builder2.buildPartial();
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
                if (f18607j == null) {
                    synchronized (C7440p1.class) {
                        if (f18607j == null) {
                            f18607j = new DefaultInstanceBasedParser(f18606i);
                        }
                    }
                }
                return f18607j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18606i;
    }

    public String getConversationUuid() {
        return this.f18608e;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f18608e);
    }

    public String getHash() {
        return this.f18609f;
    }

    public ByteString getHashBytes() {
        return ByteString.copyFromUtf8(this.f18609f);
    }

    public PingProto$Ping2 getMessage() {
        PingProto$Ping2 pingProto$Ping2 = this.f18610g;
        return pingProto$Ping2 == null ? PingProto$Ping2.getDefaultInstance() : pingProto$Ping2;
    }

    public C7511y1 getMetadata() {
        C7511y1 y1Var = this.f18611h;
        return y1Var == null ? C7511y1.getDefaultInstance() : y1Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18608e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getConversationUuid());
        }
        if (this.f18610g != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMessage());
        }
        if (!this.f18609f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getHash());
        }
        if (this.f18611h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getMetadata());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasMessage() {
        return this.f18610g != null;
    }

    public boolean hasMetadata() {
        return this.f18611h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18608e.isEmpty()) {
            codedOutputStream.writeString(1, getConversationUuid());
        }
        if (this.f18610g != null) {
            codedOutputStream.writeMessage(2, getMessage());
        }
        if (!this.f18609f.isEmpty()) {
            codedOutputStream.writeString(3, getHash());
        }
        if (this.f18611h != null) {
            codedOutputStream.writeMessage(4, getMetadata());
        }
    }
}
