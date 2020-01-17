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
import p213co.znly.models.recommendations.C7886b;

/* renamed from: co.znly.models.services.d4 */
public final class C8032d4 extends GeneratedMessageLite<C8032d4, C8033a> implements ZenlyProto$RecoAcknowledgePotentialMatchRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C8032d4 f20384i = new C8032d4();

    /* renamed from: j */
    private static volatile Parser<C8032d4> f20385j;

    /* renamed from: e */
    private int f20386e;

    /* renamed from: f */
    private String f20387f;

    /* renamed from: g */
    private String f20388g;

    /* renamed from: h */
    private String f20389h;

    /* renamed from: co.znly.models.services.d4$a */
    public static final class C8033a extends Builder<C8032d4, C8033a> implements ZenlyProto$RecoAcknowledgePotentialMatchRequestOrBuilder {
        private C8033a() {
            super(C8032d4.f20384i);
        }

        /* synthetic */ C8033a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8033a mo22059a(C7886b bVar) {
            copyOnWrite();
            ((C8032d4) this.instance).m19087a(bVar);
            return this;
        }

        /* renamed from: a */
        public C8033a mo22060a(String str) {
            copyOnWrite();
            ((C8032d4) this.instance).m19090a(str);
            return this;
        }

        /* renamed from: b */
        public C8033a mo22061b(String str) {
            copyOnWrite();
            ((C8032d4) this.instance).m19092b(str);
            return this;
        }

        public C7886b getAck() {
            return ((C8032d4) this.instance).getAck();
        }

        public int getAckValue() {
            return ((C8032d4) this.instance).getAckValue();
        }

        public String getNewcomerUuid() {
            return ((C8032d4) this.instance).getNewcomerUuid();
        }

        public ByteString getNewcomerUuidBytes() {
            return ((C8032d4) this.instance).getNewcomerUuidBytes();
        }

        public String getPotentialMatchUuid() {
            return ((C8032d4) this.instance).getPotentialMatchUuid();
        }

        public ByteString getPotentialMatchUuidBytes() {
            return ((C8032d4) this.instance).getPotentialMatchUuidBytes();
        }

        public String getRecommendationUuid() {
            return ((C8032d4) this.instance).getRecommendationUuid();
        }

        public ByteString getRecommendationUuidBytes() {
            return ((C8032d4) this.instance).getRecommendationUuidBytes();
        }
    }

    static {
        f20384i.makeImmutable();
    }

    private C8032d4() {
        String str = "";
        this.f20387f = str;
        this.f20388g = str;
        this.f20389h = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19087a(C7886b bVar) {
        if (bVar != null) {
            this.f20386e = bVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19090a(String str) {
        if (str != null) {
            this.f20387f = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19092b(String str) {
        if (str != null) {
            this.f20388g = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C8033a newBuilder() {
        return (C8033a) f20384i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8032d4();
            case 2:
                return f20384i;
            case 3:
                return null;
            case 4:
                return new C8033a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8032d4 d4Var = (C8032d4) obj2;
                boolean z2 = this.f20386e != 0;
                int i = this.f20386e;
                if (d4Var.f20386e != 0) {
                    z = true;
                }
                this.f20386e = visitor.visitInt(z2, i, z, d4Var.f20386e);
                this.f20387f = visitor.visitString(!this.f20387f.isEmpty(), this.f20387f, !d4Var.f20387f.isEmpty(), d4Var.f20387f);
                this.f20388g = visitor.visitString(!this.f20388g.isEmpty(), this.f20388g, !d4Var.f20388g.isEmpty(), d4Var.f20388g);
                this.f20389h = visitor.visitString(!this.f20389h.isEmpty(), this.f20389h, !d4Var.f20389h.isEmpty(), d4Var.f20389h);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f20386e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20387f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20388g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 34) {
                                this.f20389h = codedInputStream.readStringRequireUtf8();
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
                if (f20385j == null) {
                    synchronized (C8032d4.class) {
                        if (f20385j == null) {
                            f20385j = new DefaultInstanceBasedParser(f20384i);
                        }
                    }
                }
                return f20385j;
            default:
                throw new UnsupportedOperationException();
        }
        return f20384i;
    }

    public C7886b getAck() {
        C7886b a = C7886b.m18945a(this.f20386e);
        return a == null ? C7886b.UNRECOGNIZED : a;
    }

    public int getAckValue() {
        return this.f20386e;
    }

    public String getNewcomerUuid() {
        return this.f20387f;
    }

    public ByteString getNewcomerUuidBytes() {
        return ByteString.copyFromUtf8(this.f20387f);
    }

    public String getPotentialMatchUuid() {
        return this.f20388g;
    }

    public ByteString getPotentialMatchUuidBytes() {
        return ByteString.copyFromUtf8(this.f20388g);
    }

    public String getRecommendationUuid() {
        return this.f20389h;
    }

    public ByteString getRecommendationUuidBytes() {
        return ByteString.copyFromUtf8(this.f20389h);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20386e != C7886b.ACK_MATCH_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20386e);
        }
        if (!this.f20387f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getNewcomerUuid());
        }
        if (!this.f20388g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getPotentialMatchUuid());
        }
        if (!this.f20389h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getRecommendationUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20386e != C7886b.ACK_MATCH_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20386e);
        }
        if (!this.f20387f.isEmpty()) {
            codedOutputStream.writeString(2, getNewcomerUuid());
        }
        if (!this.f20388g.isEmpty()) {
            codedOutputStream.writeString(3, getPotentialMatchUuid());
        }
        if (!this.f20389h.isEmpty()) {
            codedOutputStream.writeString(4, getRecommendationUuid());
        }
    }
}
