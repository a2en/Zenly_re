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
import p213co.znly.models.C7354j0;
import p213co.znly.models.C7354j0.C7357c;

/* renamed from: co.znly.models.core.r */
public final class C7201r extends GeneratedMessageLite<C7201r, C7202a> implements ChatProto$MediaReceivedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7201r f17845j = new C7201r();

    /* renamed from: k */
    private static volatile Parser<C7201r> f17846k;

    /* renamed from: e */
    private String f17847e = "";

    /* renamed from: f */
    private C7354j0 f17848f;

    /* renamed from: g */
    private boolean f17849g;

    /* renamed from: h */
    private boolean f17850h;

    /* renamed from: i */
    private Timestamp f17851i;

    /* renamed from: co.znly.models.core.r$a */
    public static final class C7202a extends Builder<C7201r, C7202a> implements ChatProto$MediaReceivedOrBuilder {
        /* synthetic */ C7202a(C7066c cVar) {
            this();
        }

        public Timestamp getCreatedAt() {
            return ((C7201r) this.instance).getCreatedAt();
        }

        public C7354j0 getMedia() {
            return ((C7201r) this.instance).getMedia();
        }

        public String getMessageUuid() {
            return ((C7201r) this.instance).getMessageUuid();
        }

        public ByteString getMessageUuidBytes() {
            return ((C7201r) this.instance).getMessageUuidBytes();
        }

        public boolean getRead() {
            return ((C7201r) this.instance).getRead();
        }

        public boolean getReplied() {
            return ((C7201r) this.instance).getReplied();
        }

        public boolean hasCreatedAt() {
            return ((C7201r) this.instance).hasCreatedAt();
        }

        public boolean hasMedia() {
            return ((C7201r) this.instance).hasMedia();
        }

        private C7202a() {
            super(C7201r.f17845j);
        }
    }

    static {
        f17845j.makeImmutable();
    }

    private C7201r() {
    }

    public static Parser<C7201r> parser() {
        return f17845j.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7201r();
            case 2:
                return f17845j;
            case 3:
                return null;
            case 4:
                return new C7202a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7201r rVar = (C7201r) obj2;
                this.f17847e = visitor.visitString(!this.f17847e.isEmpty(), this.f17847e, true ^ rVar.f17847e.isEmpty(), rVar.f17847e);
                this.f17848f = (C7354j0) visitor.visitMessage(this.f17848f, rVar.f17848f);
                boolean z = this.f17849g;
                boolean z2 = rVar.f17849g;
                this.f17849g = visitor.visitBoolean(z, z, z2, z2);
                boolean z3 = this.f17850h;
                boolean z4 = rVar.f17850h;
                this.f17850h = visitor.visitBoolean(z3, z3, z4, z4);
                this.f17851i = (Timestamp) visitor.visitMessage(this.f17851i, rVar.f17851i);
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
                                this.f17847e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f17848f != null ? (C7357c) this.f17848f.toBuilder() : null;
                                this.f17848f = (C7354j0) codedInputStream.readMessage(C7354j0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17848f);
                                    this.f17848f = (C7354j0) builder.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f17849g = codedInputStream.readBool();
                            } else if (readTag == 32) {
                                this.f17850h = codedInputStream.readBool();
                            } else if (readTag == 42) {
                                Builder builder2 = this.f17851i != null ? (Timestamp.Builder) this.f17851i.toBuilder() : null;
                                this.f17851i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17851i);
                                    this.f17851i = (Timestamp) builder2.buildPartial();
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
                if (f17846k == null) {
                    synchronized (C7201r.class) {
                        if (f17846k == null) {
                            f17846k = new DefaultInstanceBasedParser(f17845j);
                        }
                    }
                }
                return f17846k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17845j;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17851i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C7354j0 getMedia() {
        C7354j0 j0Var = this.f17848f;
        return j0Var == null ? C7354j0.getDefaultInstance() : j0Var;
    }

    public String getMessageUuid() {
        return this.f17847e;
    }

    public ByteString getMessageUuidBytes() {
        return ByteString.copyFromUtf8(this.f17847e);
    }

    public boolean getRead() {
        return this.f17849g;
    }

    public boolean getReplied() {
        return this.f17850h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17847e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getMessageUuid());
        }
        if (this.f17848f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getMedia());
        }
        boolean z = this.f17849g;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(3, z);
        }
        boolean z2 = this.f17850h;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(4, z2);
        }
        if (this.f17851i != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getCreatedAt());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasCreatedAt() {
        return this.f17851i != null;
    }

    public boolean hasMedia() {
        return this.f17848f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17847e.isEmpty()) {
            codedOutputStream.writeString(1, getMessageUuid());
        }
        if (this.f17848f != null) {
            codedOutputStream.writeMessage(2, getMedia());
        }
        boolean z = this.f17849g;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        boolean z2 = this.f17850h;
        if (z2) {
            codedOutputStream.writeBool(4, z2);
        }
        if (this.f17851i != null) {
            codedOutputStream.writeMessage(5, getCreatedAt());
        }
    }
}
