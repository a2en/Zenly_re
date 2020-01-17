package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.u2 */
public final class C7230u2 extends GeneratedMessageLite<C7230u2, C7233b> implements TypesProto$WifiInfo$AccessPointOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7230u2 f17935j = new C7230u2();

    /* renamed from: k */
    private static volatile Parser<C7230u2> f17936k;

    /* renamed from: e */
    private String f17937e;

    /* renamed from: f */
    private String f17938f;

    /* renamed from: g */
    private boolean f17939g;

    /* renamed from: h */
    private int f17940h;

    /* renamed from: i */
    private int f17941i;

    /* renamed from: co.znly.models.core.u2$a */
    public enum C7231a implements EnumLite {
        BAND_UNKNOWN(0),
        BAND_2_4G(1),
        BAND_5G(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17947e;

        /* renamed from: co.znly.models.core.u2$a$a */
        class C7232a implements EnumLiteMap<C7231a> {
            C7232a() {
            }

            public C7231a findValueByNumber(int i) {
                return C7231a.m17963a(i);
            }
        }

        static {
            new C7232a();
        }

        private C7231a(int i) {
            this.f17947e = i;
        }

        /* renamed from: a */
        public static C7231a m17963a(int i) {
            if (i == 0) {
                return BAND_UNKNOWN;
            }
            if (i == 1) {
                return BAND_2_4G;
            }
            if (i != 2) {
                return null;
            }
            return BAND_5G;
        }

        public final int getNumber() {
            return this.f17947e;
        }
    }

    /* renamed from: co.znly.models.core.u2$b */
    public static final class C7233b extends Builder<C7230u2, C7233b> implements TypesProto$WifiInfo$AccessPointOrBuilder {
        /* synthetic */ C7233b(C7253x1 x1Var) {
            this();
        }

        public String getBSSID() {
            return ((C7230u2) this.instance).getBSSID();
        }

        public ByteString getBSSIDBytes() {
            return ((C7230u2) this.instance).getBSSIDBytes();
        }

        public C7231a getBand() {
            return ((C7230u2) this.instance).getBand();
        }

        public int getBandValue() {
            return ((C7230u2) this.instance).getBandValue();
        }

        public boolean getIsConnected() {
            return ((C7230u2) this.instance).getIsConnected();
        }

        public int getRssi() {
            return ((C7230u2) this.instance).getRssi();
        }

        public String getSSID() {
            return ((C7230u2) this.instance).getSSID();
        }

        public ByteString getSSIDBytes() {
            return ((C7230u2) this.instance).getSSIDBytes();
        }

        private C7233b() {
            super(C7230u2.f17935j);
        }
    }

    static {
        f17935j.makeImmutable();
    }

    private C7230u2() {
        String str = "";
        this.f17937e = str;
        this.f17938f = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7230u2();
            case 2:
                return f17935j;
            case 3:
                return null;
            case 4:
                return new C7233b(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7230u2 u2Var = (C7230u2) obj2;
                this.f17937e = visitor.visitString(!this.f17937e.isEmpty(), this.f17937e, !u2Var.f17937e.isEmpty(), u2Var.f17937e);
                this.f17938f = visitor.visitString(!this.f17938f.isEmpty(), this.f17938f, !u2Var.f17938f.isEmpty(), u2Var.f17938f);
                boolean z2 = this.f17939g;
                boolean z3 = u2Var.f17939g;
                this.f17939g = visitor.visitBoolean(z2, z2, z3, z3);
                this.f17940h = visitor.visitInt(this.f17940h != 0, this.f17940h, u2Var.f17940h != 0, u2Var.f17940h);
                boolean z4 = this.f17941i != 0;
                int i = this.f17941i;
                if (u2Var.f17941i != 0) {
                    z = true;
                }
                this.f17941i = visitor.visitInt(z4, i, z, u2Var.f17941i);
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
                                this.f17937e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f17938f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f17939g = codedInputStream.readBool();
                            } else if (readTag == 32) {
                                this.f17940h = codedInputStream.readInt32();
                            } else if (readTag == 40) {
                                this.f17941i = codedInputStream.readEnum();
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
                if (f17936k == null) {
                    synchronized (C7230u2.class) {
                        if (f17936k == null) {
                            f17936k = new DefaultInstanceBasedParser(f17935j);
                        }
                    }
                }
                return f17936k;
            default:
                throw new UnsupportedOperationException();
        }
        return f17935j;
    }

    public String getBSSID() {
        return this.f17937e;
    }

    public ByteString getBSSIDBytes() {
        return ByteString.copyFromUtf8(this.f17937e);
    }

    public C7231a getBand() {
        C7231a a = C7231a.m17963a(this.f17941i);
        return a == null ? C7231a.UNRECOGNIZED : a;
    }

    public int getBandValue() {
        return this.f17941i;
    }

    public boolean getIsConnected() {
        return this.f17939g;
    }

    public int getRssi() {
        return this.f17940h;
    }

    public String getSSID() {
        return this.f17938f;
    }

    public ByteString getSSIDBytes() {
        return ByteString.copyFromUtf8(this.f17938f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17937e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getBSSID());
        }
        if (!this.f17938f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getSSID());
        }
        boolean z = this.f17939g;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(3, z);
        }
        int i3 = this.f17940h;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i3);
        }
        if (this.f17941i != C7231a.BAND_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(5, this.f17941i);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17937e.isEmpty()) {
            codedOutputStream.writeString(1, getBSSID());
        }
        if (!this.f17938f.isEmpty()) {
            codedOutputStream.writeString(2, getSSID());
        }
        boolean z = this.f17939g;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        int i = this.f17940h;
        if (i != 0) {
            codedOutputStream.writeInt32(4, i);
        }
        if (this.f17941i != C7231a.BAND_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(5, this.f17941i);
        }
    }
}
