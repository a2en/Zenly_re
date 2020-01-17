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

/* renamed from: co.znly.models.t */
public final class C7471t extends GeneratedMessageLite<C7471t, C7472a> implements DeviceProto$DeviceInfoOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C7471t f18735m = new C7471t();

    /* renamed from: n */
    private static volatile Parser<C7471t> f18736n;

    /* renamed from: e */
    private String f18737e;

    /* renamed from: f */
    private String f18738f;

    /* renamed from: g */
    private int f18739g;

    /* renamed from: h */
    private String f18740h;

    /* renamed from: i */
    private String f18741i;

    /* renamed from: j */
    private String f18742j;

    /* renamed from: k */
    private String f18743k;

    /* renamed from: l */
    private String f18744l;

    /* renamed from: co.znly.models.t$a */
    public static final class C7472a extends Builder<C7471t, C7472a> implements DeviceProto$DeviceInfoOrBuilder {
        /* synthetic */ C7472a(C7444q qVar) {
            this();
        }

        public String getAcceptLanguages() {
            return ((C7471t) this.instance).getAcceptLanguages();
        }

        public ByteString getAcceptLanguagesBytes() {
            return ((C7471t) this.instance).getAcceptLanguagesBytes();
        }

        public String getAppBundle() {
            return ((C7471t) this.instance).getAppBundle();
        }

        public ByteString getAppBundleBytes() {
            return ((C7471t) this.instance).getAppBundleBytes();
        }

        public String getAppFlavor() {
            return ((C7471t) this.instance).getAppFlavor();
        }

        public ByteString getAppFlavorBytes() {
            return ((C7471t) this.instance).getAppFlavorBytes();
        }

        public String getAppVersion() {
            return ((C7471t) this.instance).getAppVersion();
        }

        public ByteString getAppVersionBytes() {
            return ((C7471t) this.instance).getAppVersionBytes();
        }

        public String getCoreVersion() {
            return ((C7471t) this.instance).getCoreVersion();
        }

        public ByteString getCoreVersionBytes() {
            return ((C7471t) this.instance).getCoreVersionBytes();
        }

        public String getModel() {
            return ((C7471t) this.instance).getModel();
        }

        public ByteString getModelBytes() {
            return ((C7471t) this.instance).getModelBytes();
        }

        public String getOsVersion() {
            return ((C7471t) this.instance).getOsVersion();
        }

        public ByteString getOsVersionBytes() {
            return ((C7471t) this.instance).getOsVersionBytes();
        }

        public C7486v getType() {
            return ((C7471t) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7471t) this.instance).getTypeValue();
        }

        private C7472a() {
            super(C7471t.f18735m);
        }
    }

    static {
        f18735m.makeImmutable();
    }

    private C7471t() {
        String str = "";
        this.f18737e = str;
        this.f18738f = str;
        this.f18740h = str;
        this.f18741i = str;
        this.f18742j = str;
        this.f18743k = str;
        this.f18744l = str;
    }

    public static C7471t getDefaultInstance() {
        return f18735m;
    }

    public static Parser<C7471t> parser() {
        return f18735m.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7444q.f18621a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7471t();
            case 2:
                return f18735m;
            case 3:
                return null;
            case 4:
                return new C7472a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7471t tVar = (C7471t) obj2;
                this.f18737e = visitor.visitString(!this.f18737e.isEmpty(), this.f18737e, !tVar.f18737e.isEmpty(), tVar.f18737e);
                this.f18738f = visitor.visitString(!this.f18738f.isEmpty(), this.f18738f, !tVar.f18738f.isEmpty(), tVar.f18738f);
                boolean z2 = this.f18739g != 0;
                int i = this.f18739g;
                if (tVar.f18739g != 0) {
                    z = true;
                }
                this.f18739g = visitor.visitInt(z2, i, z, tVar.f18739g);
                this.f18740h = visitor.visitString(!this.f18740h.isEmpty(), this.f18740h, !tVar.f18740h.isEmpty(), tVar.f18740h);
                this.f18741i = visitor.visitString(!this.f18741i.isEmpty(), this.f18741i, !tVar.f18741i.isEmpty(), tVar.f18741i);
                this.f18742j = visitor.visitString(!this.f18742j.isEmpty(), this.f18742j, !tVar.f18742j.isEmpty(), tVar.f18742j);
                this.f18743k = visitor.visitString(!this.f18743k.isEmpty(), this.f18743k, !tVar.f18743k.isEmpty(), tVar.f18743k);
                this.f18744l = visitor.visitString(!this.f18744l.isEmpty(), this.f18744l, !tVar.f18744l.isEmpty(), tVar.f18744l);
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
                                this.f18737e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18738f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f18739g = codedInputStream.readEnum();
                            } else if (readTag == 34) {
                                this.f18740h = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 42) {
                                this.f18741i = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 50) {
                                this.f18742j = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 58) {
                                this.f18743k = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 66) {
                                this.f18744l = codedInputStream.readStringRequireUtf8();
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
                if (f18736n == null) {
                    synchronized (C7471t.class) {
                        if (f18736n == null) {
                            f18736n = new DefaultInstanceBasedParser(f18735m);
                        }
                    }
                }
                return f18736n;
            default:
                throw new UnsupportedOperationException();
        }
        return f18735m;
    }

    public String getAcceptLanguages() {
        return this.f18742j;
    }

    public ByteString getAcceptLanguagesBytes() {
        return ByteString.copyFromUtf8(this.f18742j);
    }

    public String getAppBundle() {
        return this.f18744l;
    }

    public ByteString getAppBundleBytes() {
        return ByteString.copyFromUtf8(this.f18744l);
    }

    public String getAppFlavor() {
        return this.f18738f;
    }

    public ByteString getAppFlavorBytes() {
        return ByteString.copyFromUtf8(this.f18738f);
    }

    public String getAppVersion() {
        return this.f18737e;
    }

    public ByteString getAppVersionBytes() {
        return ByteString.copyFromUtf8(this.f18737e);
    }

    public String getCoreVersion() {
        return this.f18743k;
    }

    public ByteString getCoreVersionBytes() {
        return ByteString.copyFromUtf8(this.f18743k);
    }

    public String getModel() {
        return this.f18741i;
    }

    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.f18741i);
    }

    public String getOsVersion() {
        return this.f18740h;
    }

    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.f18740h);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18737e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getAppVersion());
        }
        if (!this.f18738f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getAppFlavor());
        }
        if (this.f18739g != C7486v.dt_none.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f18739g);
        }
        if (!this.f18740h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getOsVersion());
        }
        if (!this.f18741i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(5, getModel());
        }
        if (!this.f18742j.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(6, getAcceptLanguages());
        }
        if (!this.f18743k.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(7, getCoreVersion());
        }
        if (!this.f18744l.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(8, getAppBundle());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7486v getType() {
        C7486v a = C7486v.m18115a(this.f18739g);
        return a == null ? C7486v.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18739g;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18737e.isEmpty()) {
            codedOutputStream.writeString(1, getAppVersion());
        }
        if (!this.f18738f.isEmpty()) {
            codedOutputStream.writeString(2, getAppFlavor());
        }
        if (this.f18739g != C7486v.dt_none.getNumber()) {
            codedOutputStream.writeEnum(3, this.f18739g);
        }
        if (!this.f18740h.isEmpty()) {
            codedOutputStream.writeString(4, getOsVersion());
        }
        if (!this.f18741i.isEmpty()) {
            codedOutputStream.writeString(5, getModel());
        }
        if (!this.f18742j.isEmpty()) {
            codedOutputStream.writeString(6, getAcceptLanguages());
        }
        if (!this.f18743k.isEmpty()) {
            codedOutputStream.writeString(7, getCoreVersion());
        }
        if (!this.f18744l.isEmpty()) {
            codedOutputStream.writeString(8, getAppBundle());
        }
    }
}
