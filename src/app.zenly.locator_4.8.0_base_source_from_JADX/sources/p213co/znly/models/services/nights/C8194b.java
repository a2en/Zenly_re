package p213co.znly.models.services.nights;

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

/* renamed from: co.znly.models.services.nights.b */
public final class C8194b extends GeneratedMessageLite<C8194b, C8195a> implements FootstepsNightsProto$NightsErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8194b f20741g = new C8194b();

    /* renamed from: h */
    private static volatile Parser<C8194b> f20742h;

    /* renamed from: e */
    private int f20743e;

    /* renamed from: f */
    private String f20744f = "";

    /* renamed from: co.znly.models.services.nights.b$a */
    public static final class C8195a extends Builder<C8194b, C8195a> implements FootstepsNightsProto$NightsErrorOrBuilder {
        /* synthetic */ C8195a(C8193a aVar) {
            this();
        }

        public C8196b getCode() {
            return ((C8194b) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8194b) this.instance).getCodeValue();
        }

        public String getMessage() {
            return ((C8194b) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C8194b) this.instance).getMessageBytes();
        }

        private C8195a() {
            super(C8194b.f20741g);
        }
    }

    /* renamed from: co.znly.models.services.nights.b$b */
    public enum C8196b implements EnumLite {
        NO_ERROR(0),
        INVALID_REQUEST(1),
        INTERNAL_ERROR(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20750e;

        /* renamed from: co.znly.models.services.nights.b$b$a */
        class C8197a implements EnumLiteMap<C8196b> {
            C8197a() {
            }

            public C8196b findValueByNumber(int i) {
                return C8196b.m19284a(i);
            }
        }

        static {
            new C8197a();
        }

        private C8196b(int i) {
            this.f20750e = i;
        }

        /* renamed from: a */
        public static C8196b m19284a(int i) {
            if (i == 0) {
                return NO_ERROR;
            }
            if (i == 1) {
                return INVALID_REQUEST;
            }
            if (i != 2) {
                return null;
            }
            return INTERNAL_ERROR;
        }

        public final int getNumber() {
            return this.f20750e;
        }
    }

    static {
        f20741g.makeImmutable();
    }

    private C8194b() {
    }

    public static C8194b getDefaultInstance() {
        return f20741g;
    }

    public static Parser<C8194b> parser() {
        return f20741g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8193a.f20740a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8194b();
            case 2:
                return f20741g;
            case 3:
                return null;
            case 4:
                return new C8195a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8194b bVar = (C8194b) obj2;
                boolean z2 = this.f20743e != 0;
                int i = this.f20743e;
                if (bVar.f20743e != 0) {
                    z = true;
                }
                this.f20743e = visitor.visitInt(z2, i, z, bVar.f20743e);
                this.f20744f = visitor.visitString(!this.f20744f.isEmpty(), this.f20744f, !bVar.f20744f.isEmpty(), bVar.f20744f);
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
                                this.f20743e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20744f = codedInputStream.readStringRequireUtf8();
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
                if (f20742h == null) {
                    synchronized (C8194b.class) {
                        if (f20742h == null) {
                            f20742h = new DefaultInstanceBasedParser(f20741g);
                        }
                    }
                }
                return f20742h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20741g;
    }

    public C8196b getCode() {
        C8196b a = C8196b.m19284a(this.f20743e);
        return a == null ? C8196b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20743e;
    }

    public String getMessage() {
        return this.f20744f;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f20744f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20743e != C8196b.NO_ERROR.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20743e);
        }
        if (!this.f20744f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20743e != C8196b.NO_ERROR.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20743e);
        }
        if (!this.f20744f.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
    }
}
