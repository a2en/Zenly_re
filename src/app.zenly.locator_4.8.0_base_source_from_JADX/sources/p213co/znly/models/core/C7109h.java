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

/* renamed from: co.znly.models.core.h */
public final class C7109h extends GeneratedMessageLite<C7109h, C7110a> implements ChatProto$ChatStoreConversation$PeerOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7109h f17590j = new C7109h();

    /* renamed from: k */
    private static volatile Parser<C7109h> f17591k;

    /* renamed from: e */
    private String f17592e;

    /* renamed from: f */
    private String f17593f;

    /* renamed from: g */
    private String f17594g;

    /* renamed from: h */
    private Timestamp f17595h;

    /* renamed from: i */
    private Timestamp f17596i;

    /* renamed from: co.znly.models.core.h$a */
    public static final class C7110a extends Builder<C7109h, C7110a> implements ChatProto$ChatStoreConversation$PeerOrBuilder {
        /* synthetic */ C7110a(C7066c cVar) {
            this();
        }

        public Timestamp getJoinedAt() {
            return ((C7109h) this.instance).getJoinedAt();
        }

        public Timestamp getLeftAt() {
            return ((C7109h) this.instance).getLeftAt();
        }

        public String getNickname() {
            return ((C7109h) this.instance).getNickname();
        }

        public ByteString getNicknameBytes() {
            return ((C7109h) this.instance).getNicknameBytes();
        }

        public String getRead() {
            return ((C7109h) this.instance).getRead();
        }

        public ByteString getReadBytes() {
            return ((C7109h) this.instance).getReadBytes();
        }

        public String getUserUuid() {
            return ((C7109h) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7109h) this.instance).getUserUuidBytes();
        }

        public boolean hasJoinedAt() {
            return ((C7109h) this.instance).hasJoinedAt();
        }

        public boolean hasLeftAt() {
            return ((C7109h) this.instance).hasLeftAt();
        }

        private C7110a() {
            super(C7109h.f17590j);
        }
    }

    static {
        f17590j.makeImmutable();
    }

    private C7109h() {
        String str = "";
        this.f17592e = str;
        this.f17593f = str;
        this.f17594g = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7066c.f17476a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7109h();
            case 2:
                return f17590j;
            case 3:
                return null;
            case 4:
                return new C7110a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7109h hVar = (C7109h) obj2;
                this.f17592e = visitor.visitString(!this.f17592e.isEmpty(), this.f17592e, !hVar.f17592e.isEmpty(), hVar.f17592e);
                this.f17593f = visitor.visitString(!this.f17593f.isEmpty(), this.f17593f, !hVar.f17593f.isEmpty(), hVar.f17593f);
                this.f17594g = visitor.visitString(!this.f17594g.isEmpty(), this.f17594g, true ^ hVar.f17594g.isEmpty(), hVar.f17594g);
                this.f17595h = (Timestamp) visitor.visitMessage(this.f17595h, hVar.f17595h);
                this.f17596i = (Timestamp) visitor.visitMessage(this.f17596i, hVar.f17596i);
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
                                this.f17592e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f17593f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f17594g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                Builder builder = this.f17595h != null ? (Timestamp.Builder) this.f17595h.toBuilder() : null;
                                this.f17595h = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17595h);
                                    this.f17595h = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 42) {
                                Builder builder2 = this.f17596i != null ? (Timestamp.Builder) this.f17596i.toBuilder() : null;
                                this.f17596i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17596i);
                                    this.f17596i = (Timestamp) builder2.buildPartial();
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
                if (f17591k == null) {
                    synchronized (C7109h.class) {
                        if (f17591k == null) {
                            f17591k = new DefaultInstanceBasedParser(f17590j);
                        }
                    }
                }
                return f17591k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17590j;
    }

    public Timestamp getJoinedAt() {
        Timestamp timestamp = this.f17596i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Timestamp getLeftAt() {
        Timestamp timestamp = this.f17595h;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getNickname() {
        return this.f17592e;
    }

    public ByteString getNicknameBytes() {
        return ByteString.copyFromUtf8(this.f17592e);
    }

    public String getRead() {
        return this.f17594g;
    }

    public ByteString getReadBytes() {
        return ByteString.copyFromUtf8(this.f17594g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17592e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getNickname());
        }
        if (!this.f17593f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getUserUuid());
        }
        if (!this.f17594g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getRead());
        }
        if (this.f17595h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getLeftAt());
        }
        if (this.f17596i != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getJoinedAt());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUserUuid() {
        return this.f17593f;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f17593f);
    }

    public boolean hasJoinedAt() {
        return this.f17596i != null;
    }

    public boolean hasLeftAt() {
        return this.f17595h != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17592e.isEmpty()) {
            codedOutputStream.writeString(1, getNickname());
        }
        if (!this.f17593f.isEmpty()) {
            codedOutputStream.writeString(2, getUserUuid());
        }
        if (!this.f17594g.isEmpty()) {
            codedOutputStream.writeString(3, getRead());
        }
        if (this.f17595h != null) {
            codedOutputStream.writeMessage(4, getLeftAt());
        }
        if (this.f17596i != null) {
            codedOutputStream.writeMessage(5, getJoinedAt());
        }
    }
}
