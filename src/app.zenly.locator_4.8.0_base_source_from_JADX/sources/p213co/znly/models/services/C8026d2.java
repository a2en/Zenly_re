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

/* renamed from: co.znly.models.services.d2 */
public final class C8026d2 extends GeneratedMessageLite<C8026d2, C8027a> implements ZenlyProto$ErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8026d2 f20370g = new C8026d2();

    /* renamed from: h */
    private static volatile Parser<C8026d2> f20371h;

    /* renamed from: e */
    private int f20372e;

    /* renamed from: f */
    private String f20373f = "";

    /* renamed from: co.znly.models.services.d2$a */
    public static final class C8027a extends Builder<C8026d2, C8027a> implements ZenlyProto$ErrorOrBuilder {
        /* synthetic */ C8027a(C8104i0 i0Var) {
            this();
        }

        public C8028b getCode() {
            return ((C8026d2) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8026d2) this.instance).getCodeValue();
        }

        public String getMessage() {
            return ((C8026d2) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C8026d2) this.instance).getMessageBytes();
        }

        private C8027a() {
            super(C8026d2.f20370g);
        }
    }

    /* renamed from: co.znly.models.services.d2$b */
    public enum C8028b implements EnumLite {
        NO_ERROR(0),
        NOT_FOUND(5),
        PERMISSION_DENIED(7),
        INTERNAL(13),
        SPECIFIC(50),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20381e;

        /* renamed from: co.znly.models.services.d2$b$a */
        class C8029a implements EnumLiteMap<C8028b> {
            C8029a() {
            }

            public C8028b findValueByNumber(int i) {
                return C8028b.m19084a(i);
            }
        }

        static {
            new C8029a();
        }

        private C8028b(int i) {
            this.f20381e = i;
        }

        /* renamed from: a */
        public static C8028b m19084a(int i) {
            if (i == 0) {
                return NO_ERROR;
            }
            if (i == 5) {
                return NOT_FOUND;
            }
            if (i == 7) {
                return PERMISSION_DENIED;
            }
            if (i == 13) {
                return INTERNAL;
            }
            if (i != 50) {
                return null;
            }
            return SPECIFIC;
        }

        public final int getNumber() {
            return this.f20381e;
        }
    }

    static {
        f20370g.makeImmutable();
    }

    private C8026d2() {
    }

    public static C8026d2 getDefaultInstance() {
        return f20370g;
    }

    public static Parser<C8026d2> parser() {
        return f20370g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8026d2();
            case 2:
                return f20370g;
            case 3:
                return null;
            case 4:
                return new C8027a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8026d2 d2Var = (C8026d2) obj2;
                boolean z2 = this.f20372e != 0;
                int i = this.f20372e;
                if (d2Var.f20372e != 0) {
                    z = true;
                }
                this.f20372e = visitor.visitInt(z2, i, z, d2Var.f20372e);
                this.f20373f = visitor.visitString(!this.f20373f.isEmpty(), this.f20373f, !d2Var.f20373f.isEmpty(), d2Var.f20373f);
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
                                this.f20372e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f20373f = codedInputStream.readStringRequireUtf8();
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
                if (f20371h == null) {
                    synchronized (C8026d2.class) {
                        if (f20371h == null) {
                            f20371h = new DefaultInstanceBasedParser(f20370g);
                        }
                    }
                }
                return f20371h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20370g;
    }

    public C8028b getCode() {
        C8028b a = C8028b.m19084a(this.f20372e);
        return a == null ? C8028b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20372e;
    }

    public String getMessage() {
        return this.f20373f;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f20373f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20372e != C8028b.NO_ERROR.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20372e);
        }
        if (!this.f20373f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20372e != C8028b.NO_ERROR.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20372e);
        }
        if (!this.f20373f.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
    }
}
