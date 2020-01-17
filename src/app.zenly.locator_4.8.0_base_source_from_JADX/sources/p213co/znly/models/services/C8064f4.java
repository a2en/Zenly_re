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
import p213co.znly.models.recommendations.C7888c;

/* renamed from: co.znly.models.services.f4 */
public final class C8064f4 extends GeneratedMessageLite<C8064f4, C8065a> implements ZenlyProto$RecoAcknowledgeRecommendationRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8064f4 f20447h = new C8064f4();

    /* renamed from: i */
    private static volatile Parser<C8064f4> f20448i;

    /* renamed from: e */
    private int f20449e;

    /* renamed from: f */
    private String f20450f;

    /* renamed from: g */
    private String f20451g;

    /* renamed from: co.znly.models.services.f4$a */
    public static final class C8065a extends Builder<C8064f4, C8065a> implements ZenlyProto$RecoAcknowledgeRecommendationRequestOrBuilder {
        private C8065a() {
            super(C8064f4.f20447h);
        }

        /* synthetic */ C8065a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8065a mo22066a(C7888c cVar) {
            copyOnWrite();
            ((C8064f4) this.instance).m19125a(cVar);
            return this;
        }

        /* renamed from: a */
        public C8065a mo22067a(String str) {
            copyOnWrite();
            ((C8064f4) this.instance).m19128a(str);
            return this;
        }

        public C7888c getAck() {
            return ((C8064f4) this.instance).getAck();
        }

        public int getAckValue() {
            return ((C8064f4) this.instance).getAckValue();
        }

        public String getAcknowledgedUserUuid() {
            return ((C8064f4) this.instance).getAcknowledgedUserUuid();
        }

        public ByteString getAcknowledgedUserUuidBytes() {
            return ((C8064f4) this.instance).getAcknowledgedUserUuidBytes();
        }

        public String getRecommendationUuid() {
            return ((C8064f4) this.instance).getRecommendationUuid();
        }

        public ByteString getRecommendationUuidBytes() {
            return ((C8064f4) this.instance).getRecommendationUuidBytes();
        }
    }

    static {
        f20447h.makeImmutable();
    }

    private C8064f4() {
        String str = "";
        this.f20450f = str;
        this.f20451g = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19125a(C7888c cVar) {
        if (cVar != null) {
            this.f20449e = cVar.getNumber();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19128a(String str) {
        if (str != null) {
            this.f20450f = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C8065a newBuilder() {
        return (C8065a) f20447h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8064f4();
            case 2:
                return f20447h;
            case 3:
                return null;
            case 4:
                return new C8065a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8064f4 f4Var = (C8064f4) obj2;
                boolean z2 = this.f20449e != 0;
                int i = this.f20449e;
                if (f4Var.f20449e != 0) {
                    z = true;
                }
                this.f20449e = visitor.visitInt(z2, i, z, f4Var.f20449e);
                this.f20450f = visitor.visitString(!this.f20450f.isEmpty(), this.f20450f, !f4Var.f20450f.isEmpty(), f4Var.f20450f);
                this.f20451g = visitor.visitString(!this.f20451g.isEmpty(), this.f20451g, !f4Var.f20451g.isEmpty(), f4Var.f20451g);
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
                                this.f20449e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20450f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20451g = codedInputStream.readStringRequireUtf8();
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
                if (f20448i == null) {
                    synchronized (C8064f4.class) {
                        if (f20448i == null) {
                            f20448i = new DefaultInstanceBasedParser(f20447h);
                        }
                    }
                }
                return f20448i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20447h;
    }

    public C7888c getAck() {
        C7888c a = C7888c.m18946a(this.f20449e);
        return a == null ? C7888c.UNRECOGNIZED : a;
    }

    public int getAckValue() {
        return this.f20449e;
    }

    public String getAcknowledgedUserUuid() {
        return this.f20450f;
    }

    public ByteString getAcknowledgedUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f20450f);
    }

    public String getRecommendationUuid() {
        return this.f20451g;
    }

    public ByteString getRecommendationUuidBytes() {
        return ByteString.copyFromUtf8(this.f20451g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20449e != C7888c.ACK_RECO_UNKNOWN.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20449e);
        }
        if (!this.f20450f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getAcknowledgedUserUuid());
        }
        if (!this.f20451g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getRecommendationUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20449e != C7888c.ACK_RECO_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20449e);
        }
        if (!this.f20450f.isEmpty()) {
            codedOutputStream.writeString(2, getAcknowledgedUserUuid());
        }
        if (!this.f20451g.isEmpty()) {
            codedOutputStream.writeString(3, getRecommendationUuid());
        }
    }
}
