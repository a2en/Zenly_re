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

/* renamed from: co.znly.models.services.h4 */
public final class C8096h4 extends GeneratedMessageLite<C8096h4, C8097a> implements ZenlyProto$RecoSendRecommendationRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8096h4 f20511h = new C8096h4();

    /* renamed from: i */
    private static volatile Parser<C8096h4> f20512i;

    /* renamed from: e */
    private String f20513e;

    /* renamed from: f */
    private String f20514f;

    /* renamed from: g */
    private String f20515g;

    /* renamed from: co.znly.models.services.h4$a */
    public static final class C8097a extends Builder<C8096h4, C8097a> implements ZenlyProto$RecoSendRecommendationRequestOrBuilder {
        private C8097a() {
            super(C8096h4.f20511h);
        }

        /* synthetic */ C8097a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8097a mo22143a(String str) {
            copyOnWrite();
            ((C8096h4) this.instance).m19168a(str);
            return this;
        }

        /* renamed from: b */
        public C8097a mo22144b(String str) {
            copyOnWrite();
            ((C8096h4) this.instance).m19170b(str);
            return this;
        }

        public String getNewcomerUuid() {
            return ((C8096h4) this.instance).getNewcomerUuid();
        }

        public ByteString getNewcomerUuidBytes() {
            return ((C8096h4) this.instance).getNewcomerUuidBytes();
        }

        public String getPotentialMatchUuid() {
            return ((C8096h4) this.instance).getPotentialMatchUuid();
        }

        public ByteString getPotentialMatchUuidBytes() {
            return ((C8096h4) this.instance).getPotentialMatchUuidBytes();
        }

        public String getRecommendationUuid() {
            return ((C8096h4) this.instance).getRecommendationUuid();
        }

        public ByteString getRecommendationUuidBytes() {
            return ((C8096h4) this.instance).getRecommendationUuidBytes();
        }
    }

    static {
        f20511h.makeImmutable();
    }

    private C8096h4() {
        String str = "";
        this.f20513e = str;
        this.f20514f = str;
        this.f20515g = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19168a(String str) {
        if (str != null) {
            this.f20513e = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m19170b(String str) {
        if (str != null) {
            this.f20514f = str;
            return;
        }
        throw new NullPointerException();
    }

    public static C8097a newBuilder() {
        return (C8097a) f20511h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8096h4();
            case 2:
                return f20511h;
            case 3:
                return null;
            case 4:
                return new C8097a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8096h4 h4Var = (C8096h4) obj2;
                this.f20513e = visitor.visitString(!this.f20513e.isEmpty(), this.f20513e, !h4Var.f20513e.isEmpty(), h4Var.f20513e);
                this.f20514f = visitor.visitString(!this.f20514f.isEmpty(), this.f20514f, !h4Var.f20514f.isEmpty(), h4Var.f20514f);
                this.f20515g = visitor.visitString(!this.f20515g.isEmpty(), this.f20515g, true ^ h4Var.f20515g.isEmpty(), h4Var.f20515g);
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
                                this.f20513e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f20514f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 26) {
                                this.f20515g = codedInputStream.readStringRequireUtf8();
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
                if (f20512i == null) {
                    synchronized (C8096h4.class) {
                        if (f20512i == null) {
                            f20512i = new DefaultInstanceBasedParser(f20511h);
                        }
                    }
                }
                return f20512i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20511h;
    }

    public String getNewcomerUuid() {
        return this.f20513e;
    }

    public ByteString getNewcomerUuidBytes() {
        return ByteString.copyFromUtf8(this.f20513e);
    }

    public String getPotentialMatchUuid() {
        return this.f20514f;
    }

    public ByteString getPotentialMatchUuidBytes() {
        return ByteString.copyFromUtf8(this.f20514f);
    }

    public String getRecommendationUuid() {
        return this.f20515g;
    }

    public ByteString getRecommendationUuidBytes() {
        return ByteString.copyFromUtf8(this.f20515g);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20513e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getNewcomerUuid());
        }
        if (!this.f20514f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getPotentialMatchUuid());
        }
        if (!this.f20515g.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getRecommendationUuid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20513e.isEmpty()) {
            codedOutputStream.writeString(1, getNewcomerUuid());
        }
        if (!this.f20514f.isEmpty()) {
            codedOutputStream.writeString(2, getPotentialMatchUuid());
        }
        if (!this.f20515g.isEmpty()) {
            codedOutputStream.writeString(3, getRecommendationUuid());
        }
    }
}
