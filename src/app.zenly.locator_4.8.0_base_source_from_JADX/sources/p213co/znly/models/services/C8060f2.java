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
import p213co.znly.models.C6950b0;
import p213co.znly.models.C6950b0.C6951a;
import p213co.znly.models.reversegeocoder.C7917e;

/* renamed from: co.znly.models.services.f2 */
public final class C8060f2 extends GeneratedMessageLite<C8060f2, C8061a> implements ZenlyProto$FootstepsContextualLabelingResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C8060f2 f20436j = new C8060f2();

    /* renamed from: k */
    private static volatile Parser<C8060f2> f20437k;

    /* renamed from: e */
    private long f20438e;

    /* renamed from: f */
    private String f20439f;

    /* renamed from: g */
    private int f20440g;

    /* renamed from: h */
    private String f20441h;

    /* renamed from: i */
    private C6950b0 f20442i;

    /* renamed from: co.znly.models.services.f2$a */
    public static final class C8061a extends Builder<C8060f2, C8061a> implements ZenlyProto$FootstepsContextualLabelingResponseOrBuilder {
        private C8061a() {
            super(C8060f2.f20436j);
        }

        /* synthetic */ C8061a(C8104i0 i0Var) {
            this();
        }

        public C6950b0 getCentroid() {
            return ((C8060f2) this.instance).getCentroid();
        }

        public String getCountryIso() {
            return ((C8060f2) this.instance).getCountryIso();
        }

        public ByteString getCountryIsoBytes() {
            return ((C8060f2) this.instance).getCountryIsoBytes();
        }

        public long getId() {
            return ((C8060f2) this.instance).getId();
        }

        public String getLocalizedLabel() {
            return ((C8060f2) this.instance).getLocalizedLabel();
        }

        public ByteString getLocalizedLabelBytes() {
            return ((C8060f2) this.instance).getLocalizedLabelBytes();
        }

        public C7917e getType() {
            return ((C8060f2) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C8060f2) this.instance).getTypeValue();
        }

        public boolean hasCentroid() {
            return ((C8060f2) this.instance).hasCentroid();
        }
    }

    static {
        f20436j.makeImmutable();
    }

    private C8060f2() {
        String str = "";
        this.f20439f = str;
        this.f20441h = str;
    }

    public static C8061a newBuilder() {
        return (C8061a) f20436j.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8060f2();
            case 2:
                return f20436j;
            case 3:
                return null;
            case 4:
                return new C8061a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8060f2 f2Var = (C8060f2) obj2;
                this.f20438e = visitor.visitLong(this.f20438e != 0, this.f20438e, f2Var.f20438e != 0, f2Var.f20438e);
                this.f20439f = visitor.visitString(!this.f20439f.isEmpty(), this.f20439f, !f2Var.f20439f.isEmpty(), f2Var.f20439f);
                boolean z2 = this.f20440g != 0;
                int i = this.f20440g;
                if (f2Var.f20440g != 0) {
                    z = true;
                }
                this.f20440g = visitor.visitInt(z2, i, z, f2Var.f20440g);
                this.f20441h = visitor.visitString(!this.f20441h.isEmpty(), this.f20441h, !f2Var.f20441h.isEmpty(), f2Var.f20441h);
                this.f20442i = (C6950b0) visitor.visitMessage(this.f20442i, f2Var.f20442i);
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
                                this.f20438e = codedInputStream.readUInt64();
                            } else if (readTag == 18) {
                                this.f20439f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f20440g = codedInputStream.readEnum();
                            } else if (readTag == 34) {
                                this.f20441h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                Builder builder = this.f20442i != null ? (C6951a) this.f20442i.toBuilder() : null;
                                this.f20442i = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20442i);
                                    this.f20442i = (C6950b0) builder.buildPartial();
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
                if (f20437k == null) {
                    synchronized (C8060f2.class) {
                        if (f20437k == null) {
                            f20437k = new DefaultInstanceBasedParser(f20436j);
                        }
                    }
                }
                return f20437k;
            default:
                throw new UnsupportedOperationException();
        }
        return f20436j;
    }

    public C6950b0 getCentroid() {
        C6950b0 b0Var = this.f20442i;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public String getCountryIso() {
        return this.f20441h;
    }

    public ByteString getCountryIsoBytes() {
        return ByteString.copyFromUtf8(this.f20441h);
    }

    public long getId() {
        return this.f20438e;
    }

    public String getLocalizedLabel() {
        return this.f20439f;
    }

    public ByteString getLocalizedLabelBytes() {
        return ByteString.copyFromUtf8(this.f20439f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f20438e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeUInt64Size(1, j);
        }
        if (!this.f20439f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getLocalizedLabel());
        }
        if (this.f20440g != C7917e.UNUSED.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f20440g);
        }
        if (!this.f20441h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getCountryIso());
        }
        if (this.f20442i != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getCentroid());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7917e getType() {
        C7917e a = C7917e.m18960a(this.f20440g);
        return a == null ? C7917e.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f20440g;
    }

    public boolean hasCentroid() {
        return this.f20442i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f20438e;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        if (!this.f20439f.isEmpty()) {
            codedOutputStream.writeString(2, getLocalizedLabel());
        }
        if (this.f20440g != C7917e.UNUSED.getNumber()) {
            codedOutputStream.writeEnum(3, this.f20440g);
        }
        if (!this.f20441h.isEmpty()) {
            codedOutputStream.writeString(4, getCountryIso());
        }
        if (this.f20442i != null) {
            codedOutputStream.writeMessage(5, getCentroid());
        }
    }
}
