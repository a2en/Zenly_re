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

/* renamed from: co.znly.models.services.o */
public final class C8198o extends GeneratedMessageLite<C8198o, C8199a> implements ReverseGeoCoderProto$RgcErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8198o f20751g = new C8198o();

    /* renamed from: h */
    private static volatile Parser<C8198o> f20752h;

    /* renamed from: e */
    private int f20753e;

    /* renamed from: f */
    private String f20754f = "";

    /* renamed from: co.znly.models.services.o$a */
    public static final class C8199a extends Builder<C8198o, C8199a> implements ReverseGeoCoderProto$RgcErrorOrBuilder {
        /* synthetic */ C8199a(C8005c cVar) {
            this();
        }

        public C8200b getErrc() {
            return ((C8198o) this.instance).getErrc();
        }

        public int getErrcValue() {
            return ((C8198o) this.instance).getErrcValue();
        }

        public String getMessage() {
            return ((C8198o) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C8198o) this.instance).getMessageBytes();
        }

        private C8199a() {
            super(C8198o.f20751g);
        }
    }

    /* renamed from: co.znly.models.services.o$b */
    public enum C8200b implements EnumLite {
        NO_ERROR(0),
        INVALID_REQUEST(1),
        INTERNAL_ERROR(2),
        CANCELLED(3),
        TIMEOUT(4),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20762e;

        /* renamed from: co.znly.models.services.o$b$a */
        class C8201a implements EnumLiteMap<C8200b> {
            C8201a() {
            }

            public C8200b findValueByNumber(int i) {
                return C8200b.m19285a(i);
            }
        }

        static {
            new C8201a();
        }

        private C8200b(int i) {
            this.f20762e = i;
        }

        /* renamed from: a */
        public static C8200b m19285a(int i) {
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
                return CANCELLED;
            }
            if (i != 4) {
                return null;
            }
            return TIMEOUT;
        }

        public final int getNumber() {
            return this.f20762e;
        }
    }

    static {
        f20751g.makeImmutable();
    }

    private C8198o() {
    }

    public static C8198o getDefaultInstance() {
        return f20751g;
    }

    public static Parser<C8198o> parser() {
        return f20751g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8005c.f20316a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8198o();
            case 2:
                return f20751g;
            case 3:
                return null;
            case 4:
                return new C8199a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8198o oVar = (C8198o) obj2;
                boolean z2 = this.f20753e != 0;
                int i = this.f20753e;
                if (oVar.f20753e != 0) {
                    z = true;
                }
                this.f20753e = visitor.visitInt(z2, i, z, oVar.f20753e);
                this.f20754f = visitor.visitString(!this.f20754f.isEmpty(), this.f20754f, !oVar.f20754f.isEmpty(), oVar.f20754f);
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
                                this.f20753e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20754f = codedInputStream.readStringRequireUtf8();
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
                if (f20752h == null) {
                    synchronized (C8198o.class) {
                        if (f20752h == null) {
                            f20752h = new DefaultInstanceBasedParser(f20751g);
                        }
                    }
                }
                return f20752h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20751g;
    }

    public C8200b getErrc() {
        C8200b a = C8200b.m19285a(this.f20753e);
        return a == null ? C8200b.UNRECOGNIZED : a;
    }

    public int getErrcValue() {
        return this.f20753e;
    }

    public String getMessage() {
        return this.f20754f;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f20754f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20753e != C8200b.NO_ERROR.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20753e);
        }
        if (!this.f20754f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20753e != C8200b.NO_ERROR.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20753e);
        }
        if (!this.f20754f.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
    }
}
