package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.v */
public final class C7234v extends GeneratedMessageLite<C7234v, C7235a> implements ChatProto$RequestMediaReceivedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7234v f17948k = new C7234v();

    /* renamed from: l */
    private static volatile Parser<C7234v> f17949l;

    /* renamed from: e */
    private String f17950e;

    /* renamed from: f */
    private String f17951f;

    /* renamed from: g */
    private Timestamp f17952g;

    /* renamed from: h */
    private Timestamp f17953h;

    /* renamed from: i */
    private boolean f17954i;

    /* renamed from: j */
    private boolean f17955j;

    /* renamed from: co.znly.models.core.v$a */
    public static final class C7235a extends Builder<C7234v, C7235a> implements ChatProto$RequestMediaReceivedOrBuilder {
        /* synthetic */ C7235a(C7066c cVar) {
            this();
        }

        public String getAuthor() {
            return ((C7234v) this.instance).getAuthor();
        }

        public ByteString getAuthorBytes() {
            return ((C7234v) this.instance).getAuthorBytes();
        }

        public Timestamp getCreatedAt() {
            return ((C7234v) this.instance).getCreatedAt();
        }

        public boolean getExpired() {
            return ((C7234v) this.instance).getExpired();
        }

        public boolean getRead() {
            return ((C7234v) this.instance).getRead();
        }

        public String getUuid() {
            return ((C7234v) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7234v) this.instance).getUuidBytes();
        }

        public Timestamp getValidUntil() {
            return ((C7234v) this.instance).getValidUntil();
        }

        public boolean hasCreatedAt() {
            return ((C7234v) this.instance).hasCreatedAt();
        }

        public boolean hasValidUntil() {
            return ((C7234v) this.instance).hasValidUntil();
        }

        private C7235a() {
            super(C7234v.f17948k);
        }
    }

    static {
        f17948k.makeImmutable();
    }

    private C7234v() {
        String str = "";
        this.f17950e = str;
        this.f17951f = str;
    }

    public static C7234v parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (C7234v) GeneratedMessageLite.parseFrom(f17948k, bArr);
    }

    public static Parser<C7234v> parser() {
        return f17948k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7234v();
            case 2:
                return f17948k;
            case 3:
                return null;
            case 4:
                return new C7235a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7234v vVar = (C7234v) obj2;
                this.f17950e = visitor.visitString(!this.f17950e.isEmpty(), this.f17950e, !vVar.f17950e.isEmpty(), vVar.f17950e);
                this.f17951f = visitor.visitString(!this.f17951f.isEmpty(), this.f17951f, true ^ vVar.f17951f.isEmpty(), vVar.f17951f);
                this.f17952g = (Timestamp) visitor.visitMessage(this.f17952g, vVar.f17952g);
                this.f17953h = (Timestamp) visitor.visitMessage(this.f17953h, vVar.f17953h);
                boolean z = this.f17954i;
                boolean z2 = vVar.f17954i;
                this.f17954i = visitor.visitBoolean(z, z, z2, z2);
                boolean z3 = this.f17955j;
                boolean z4 = vVar.f17955j;
                this.f17955j = visitor.visitBoolean(z3, z3, z4, z4);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f17950e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f17951f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                Builder builder = this.f17952g != null ? (Timestamp.Builder) this.f17952g.toBuilder() : null;
                                this.f17952g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17952g);
                                    this.f17952g = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 32) {
                                this.f17954i = codedInputStream.readBool();
                            } else if (readTag == 40) {
                                this.f17955j = codedInputStream.readBool();
                            } else if (readTag == 50) {
                                Builder builder2 = this.f17953h != null ? (Timestamp.Builder) this.f17953h.toBuilder() : null;
                                this.f17953h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17953h);
                                    this.f17953h = (Timestamp) builder2.buildPartial();
                                }
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z5 = true;
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
                if (f17949l == null) {
                    synchronized (C7234v.class) {
                        if (f17949l == null) {
                            f17949l = new DefaultInstanceBasedParser(f17948k);
                        }
                    }
                }
                return f17949l;
            default:
                throw new UnsupportedOperationException();
        }
        return f17948k;
    }

    public String getAuthor() {
        return this.f17950e;
    }

    public ByteString getAuthorBytes() {
        return ByteString.copyFromUtf8(this.f17950e);
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17953h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean getExpired() {
        return this.f17955j;
    }

    public boolean getRead() {
        return this.f17954i;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17950e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getAuthor());
        }
        if (!this.f17951f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getUuid());
        }
        if (this.f17952g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getValidUntil());
        }
        boolean z = this.f17954i;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(4, z);
        }
        boolean z2 = this.f17955j;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(5, z2);
        }
        if (this.f17953h != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getCreatedAt());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUuid() {
        return this.f17951f;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f17951f);
    }

    public Timestamp getValidUntil() {
        Timestamp timestamp = this.f17952g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasCreatedAt() {
        return this.f17953h != null;
    }

    public boolean hasValidUntil() {
        return this.f17952g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17950e.isEmpty()) {
            codedOutputStream.writeString(1, getAuthor());
        }
        if (!this.f17951f.isEmpty()) {
            codedOutputStream.writeString(2, getUuid());
        }
        if (this.f17952g != null) {
            codedOutputStream.writeMessage(3, getValidUntil());
        }
        boolean z = this.f17954i;
        if (z) {
            codedOutputStream.writeBool(4, z);
        }
        boolean z2 = this.f17955j;
        if (z2) {
            codedOutputStream.writeBool(5, z2);
        }
        if (this.f17953h != null) {
            codedOutputStream.writeMessage(6, getCreatedAt());
        }
    }
}
