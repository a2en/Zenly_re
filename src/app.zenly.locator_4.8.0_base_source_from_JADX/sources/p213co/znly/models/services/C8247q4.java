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
import p213co.znly.models.C7471t;
import p213co.znly.models.C7471t.C7472a;
import p213co.znly.models.verify.C8449b;

/* renamed from: co.znly.models.services.q4 */
public final class C8247q4 extends GeneratedMessageLite<C8247q4, C8248a> implements ZenlyProto$SessionRequestCallRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8247q4 f20857h = new C8247q4();

    /* renamed from: i */
    private static volatile Parser<C8247q4> f20858i;

    /* renamed from: e */
    private String f20859e = "";

    /* renamed from: f */
    private C7471t f20860f;

    /* renamed from: g */
    private int f20861g;

    /* renamed from: co.znly.models.services.q4$a */
    public static final class C8248a extends Builder<C8247q4, C8248a> implements ZenlyProto$SessionRequestCallRequestOrBuilder {
        /* synthetic */ C8248a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8248a mo22224a(String str) {
            copyOnWrite();
            ((C8247q4) this.instance).m19317a(str);
            return this;
        }

        public C7471t getDevice() {
            return ((C8247q4) this.instance).getDevice();
        }

        public String getSessionUuid() {
            return ((C8247q4) this.instance).getSessionUuid();
        }

        public ByteString getSessionUuidBytes() {
            return ((C8247q4) this.instance).getSessionUuidBytes();
        }

        public C8449b getType() {
            return ((C8247q4) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C8247q4) this.instance).getTypeValue();
        }

        public boolean hasDevice() {
            return ((C8247q4) this.instance).hasDevice();
        }

        private C8248a() {
            super(C8247q4.f20857h);
        }
    }

    static {
        f20857h.makeImmutable();
    }

    private C8247q4() {
    }

    public static C8248a newBuilder() {
        return (C8248a) f20857h.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8247q4();
            case 2:
                return f20857h;
            case 3:
                return null;
            case 4:
                return new C8248a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8247q4 q4Var = (C8247q4) obj2;
                this.f20859e = visitor.visitString(!this.f20859e.isEmpty(), this.f20859e, !q4Var.f20859e.isEmpty(), q4Var.f20859e);
                this.f20860f = (C7471t) visitor.visitMessage(this.f20860f, q4Var.f20860f);
                boolean z2 = this.f20861g != 0;
                int i = this.f20861g;
                if (q4Var.f20861g != 0) {
                    z = true;
                }
                this.f20861g = visitor.visitInt(z2, i, z, q4Var.f20861g);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f20859e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                Builder builder = this.f20860f != null ? (C7472a) this.f20860f.toBuilder() : null;
                                this.f20860f = (C7471t) codedInputStream.readMessage(C7471t.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20860f);
                                    this.f20860f = (C7471t) builder.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f20861g = codedInputStream.readEnum();
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
                if (f20858i == null) {
                    synchronized (C8247q4.class) {
                        if (f20858i == null) {
                            f20858i = new DefaultInstanceBasedParser(f20857h);
                        }
                    }
                }
                return f20858i;
            default:
                throw new UnsupportedOperationException();
        }
        return f20857h;
    }

    public C7471t getDevice() {
        C7471t tVar = this.f20860f;
        return tVar == null ? C7471t.getDefaultInstance() : tVar;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f20859e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getSessionUuid());
        }
        if (this.f20860f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDevice());
        }
        if (this.f20861g != C8449b.CAPABILITY_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f20861g);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getSessionUuid() {
        return this.f20859e;
    }

    public ByteString getSessionUuidBytes() {
        return ByteString.copyFromUtf8(this.f20859e);
    }

    public C8449b getType() {
        C8449b a = C8449b.m19513a(this.f20861g);
        return a == null ? C8449b.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f20861g;
    }

    public boolean hasDevice() {
        return this.f20860f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f20859e.isEmpty()) {
            codedOutputStream.writeString(1, getSessionUuid());
        }
        if (this.f20860f != null) {
            codedOutputStream.writeMessage(2, getDevice());
        }
        if (this.f20861g != C8449b.CAPABILITY_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(3, this.f20861g);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19317a(String str) {
        if (str != null) {
            this.f20859e = str;
            return;
        }
        throw new NullPointerException();
    }
}
