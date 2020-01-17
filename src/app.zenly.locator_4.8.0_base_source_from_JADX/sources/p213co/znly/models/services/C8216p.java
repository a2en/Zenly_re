package p213co.znly.models.services;

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

/* renamed from: co.znly.models.services.p */
public final class C8216p extends GeneratedMessageLite<C8216p, C8217a> implements ReverseGeoCoderProto$RgcExternalProviderErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8216p f20791g = new C8216p();

    /* renamed from: h */
    private static volatile Parser<C8216p> f20792h;

    /* renamed from: e */
    private int f20793e;

    /* renamed from: f */
    private String f20794f = "";

    /* renamed from: co.znly.models.services.p$a */
    public static final class C8217a extends Builder<C8216p, C8217a> implements ReverseGeoCoderProto$RgcExternalProviderErrorOrBuilder {
        /* synthetic */ C8217a(C8005c cVar) {
            this();
        }

        public C8218b getErrc() {
            return ((C8216p) this.instance).getErrc();
        }

        public int getErrcValue() {
            return ((C8216p) this.instance).getErrcValue();
        }

        public String getMessage() {
            return ((C8216p) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C8216p) this.instance).getMessageBytes();
        }

        private C8217a() {
            super(C8216p.f20791g);
        }
    }

    /* renamed from: co.znly.models.services.p$b */
    public enum C8218b implements EnumLite {
        NO_ERROR(0),
        INVALID_REQUEST(1),
        INTERNAL_ERROR(2),
        TIMEOUT(3),
        INVALID_RESPONSE(4),
        UNAUTHORIZED(5),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20803e;

        /* renamed from: co.znly.models.services.p$b$a */
        class C8219a implements EnumLiteMap<C8218b> {
            C8219a() {
            }

            public C8218b findValueByNumber(int i) {
                return C8218b.m19293a(i);
            }
        }

        static {
            new C8219a();
        }

        private C8218b(int i) {
            this.f20803e = i;
        }

        /* renamed from: a */
        public static C8218b m19293a(int i) {
            if (i == 0) {
                return NO_ERROR;
            }
            if (i == 1) {
                return INVALID_REQUEST;
            }
            if (i == 2) {
                return INTERNAL_ERROR;
            }
            if (i == 3) {
                return TIMEOUT;
            }
            if (i == 4) {
                return INVALID_RESPONSE;
            }
            if (i != 5) {
                return null;
            }
            return UNAUTHORIZED;
        }

        public final int getNumber() {
            return this.f20803e;
        }
    }

    static {
        f20791g.makeImmutable();
    }

    private C8216p() {
    }

    public static C8216p getDefaultInstance() {
        return f20791g;
    }

    public static Parser<C8216p> parser() {
        return f20791g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8216p();
            case 2:
                return f20791g;
            case 3:
                return null;
            case 4:
                return new C8217a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8216p pVar = (C8216p) obj2;
                boolean z2 = this.f20793e != 0;
                int i = this.f20793e;
                if (pVar.f20793e != 0) {
                    z = true;
                }
                this.f20793e = visitor.visitInt(z2, i, z, pVar.f20793e);
                this.f20794f = visitor.visitString(!this.f20794f.isEmpty(), this.f20794f, !pVar.f20794f.isEmpty(), pVar.f20794f);
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
                                this.f20793e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20794f = codedInputStream.readStringRequireUtf8();
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
                if (f20792h == null) {
                    synchronized (C8216p.class) {
                        if (f20792h == null) {
                            f20792h = new DefaultInstanceBasedParser(f20791g);
                        }
                    }
                }
                return f20792h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20791g;
    }

    public C8218b getErrc() {
        C8218b a = C8218b.m19293a(this.f20793e);
        return a == null ? C8218b.UNRECOGNIZED : a;
    }

    public int getErrcValue() {
        return this.f20793e;
    }

    public String getMessage() {
        return this.f20794f;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f20794f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20793e != C8218b.NO_ERROR.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20793e);
        }
        if (!this.f20794f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20793e != C8218b.NO_ERROR.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20793e);
        }
        if (!this.f20794f.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
    }
}
