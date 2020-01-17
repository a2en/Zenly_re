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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.l2 */
public final class C7384l2 extends GeneratedMessageLite<C7384l2, C7385a> implements RequestMediaProto$RequestMediaOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7384l2 f18409k = new C7384l2();

    /* renamed from: l */
    private static volatile Parser<C7384l2> f18410l;

    /* renamed from: e */
    private String f18411e;

    /* renamed from: f */
    private String f18412f;

    /* renamed from: g */
    private String f18413g;

    /* renamed from: h */
    private Timestamp f18414h;

    /* renamed from: i */
    private Timestamp f18415i;

    /* renamed from: j */
    private boolean f18416j;

    /* renamed from: co.znly.models.l2$a */
    public static final class C7385a extends Builder<C7384l2, C7385a> implements RequestMediaProto$RequestMediaOrBuilder {
        /* synthetic */ C7385a(C7375k2 k2Var) {
            this();
        }

        public String getConversationUuid() {
            return ((C7384l2) this.instance).getConversationUuid();
        }

        public ByteString getConversationUuidBytes() {
            return ((C7384l2) this.instance).getConversationUuidBytes();
        }

        public Timestamp getCreatedAt() {
            return ((C7384l2) this.instance).getCreatedAt();
        }

        public boolean getRead() {
            return ((C7384l2) this.instance).getRead();
        }

        public String getSenderUuid() {
            return ((C7384l2) this.instance).getSenderUuid();
        }

        public ByteString getSenderUuidBytes() {
            return ((C7384l2) this.instance).getSenderUuidBytes();
        }

        public String getUuid() {
            return ((C7384l2) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7384l2) this.instance).getUuidBytes();
        }

        public Timestamp getValidUntil() {
            return ((C7384l2) this.instance).getValidUntil();
        }

        public boolean hasCreatedAt() {
            return ((C7384l2) this.instance).hasCreatedAt();
        }

        public boolean hasValidUntil() {
            return ((C7384l2) this.instance).hasValidUntil();
        }

        private C7385a() {
            super(C7384l2.f18409k);
        }
    }

    static {
        f18409k.makeImmutable();
    }

    private C7384l2() {
        String str = "";
        this.f18411e = str;
        this.f18412f = str;
        this.f18413g = str;
    }

    public static C7384l2 getDefaultInstance() {
        return f18409k;
    }

    public static Parser<C7384l2> parser() {
        return f18409k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7375k2.f18383a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7384l2();
            case 2:
                return f18409k;
            case 3:
                return null;
            case 4:
                return new C7385a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7384l2 l2Var = (C7384l2) obj2;
                this.f18411e = visitor.visitString(!this.f18411e.isEmpty(), this.f18411e, !l2Var.f18411e.isEmpty(), l2Var.f18411e);
                this.f18412f = visitor.visitString(!this.f18412f.isEmpty(), this.f18412f, !l2Var.f18412f.isEmpty(), l2Var.f18412f);
                this.f18413g = visitor.visitString(!this.f18413g.isEmpty(), this.f18413g, true ^ l2Var.f18413g.isEmpty(), l2Var.f18413g);
                this.f18414h = (Timestamp) visitor.visitMessage(this.f18414h, l2Var.f18414h);
                this.f18415i = (Timestamp) visitor.visitMessage(this.f18415i, l2Var.f18415i);
                boolean z = this.f18416j;
                boolean z2 = l2Var.f18416j;
                this.f18416j = visitor.visitBoolean(z, z, z2, z2);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f18411e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18412f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f18413g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                Builder builder = this.f18414h != null ? (Timestamp.Builder) this.f18414h.toBuilder() : null;
                                this.f18414h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18414h);
                                    this.f18414h = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 40) {
                                this.f18416j = codedInputStream.readBool();
                            } else if (readTag == 50) {
                                Builder builder2 = this.f18415i != null ? (Timestamp.Builder) this.f18415i.toBuilder() : null;
                                this.f18415i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18415i);
                                    this.f18415i = (Timestamp) builder2.buildPartial();
                                }
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f18410l == null) {
                    synchronized (C7384l2.class) {
                        if (f18410l == null) {
                            f18410l = new DefaultInstanceBasedParser(f18409k);
                        }
                    }
                }
                return f18410l;
            default:
                throw new UnsupportedOperationException();
        }
        return f18409k;
    }

    public String getConversationUuid() {
        return this.f18413g;
    }

    public ByteString getConversationUuidBytes() {
        return ByteString.copyFromUtf8(this.f18413g);
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f18415i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean getRead() {
        return this.f18416j;
    }

    public String getSenderUuid() {
        return this.f18412f;
    }

    public ByteString getSenderUuidBytes() {
        return ByteString.copyFromUtf8(this.f18412f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18411e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        if (!this.f18412f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getSenderUuid());
        }
        if (!this.f18413g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getConversationUuid());
        }
        if (this.f18414h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getValidUntil());
        }
        boolean z = this.f18416j;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(5, z);
        }
        if (this.f18415i != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getCreatedAt());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUuid() {
        return this.f18411e;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f18411e);
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f18414h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasCreatedAt() {
        return this.f18415i != null;
    }

    public boolean hasValidUntil() {
        return this.f18414h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18411e.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (!this.f18412f.isEmpty()) {
            codedOutputStream.writeString(2, getSenderUuid());
        }
        if (!this.f18413g.isEmpty()) {
            codedOutputStream.writeString(3, getConversationUuid());
        }
        if (this.f18414h != null) {
            codedOutputStream.writeMessage(4, getValidUntil());
        }
        boolean z = this.f18416j;
        if (z) {
            codedOutputStream.writeBool(5, z);
        }
        if (this.f18415i != null) {
            codedOutputStream.writeMessage(6, getCreatedAt());
        }
    }
}
