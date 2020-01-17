package p213co.znly.models.services;

import java.io.IOException;
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
import p213co.znly.models.services.C8026d2.C8027a;

/* renamed from: co.znly.models.services.a6 */
public final class C7985a6 extends GeneratedMessageLite<C7985a6, C7986a> implements ZenlyProto$UsersGetPublicErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7985a6 f20267g = new C7985a6();

    /* renamed from: h */
    private static volatile Parser<C7985a6> f20268h;

    /* renamed from: e */
    private C8026d2 f20269e;

    /* renamed from: f */
    private int f20270f;

    /* renamed from: co.znly.models.services.a6$a */
    public static final class C7986a extends Builder<C7985a6, C7986a> implements ZenlyProto$UsersGetPublicErrorOrBuilder {
        /* synthetic */ C7986a(C8104i0 i0Var) {
            this();
        }

        public C7987b getCode() {
            return ((C7985a6) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C7985a6) this.instance).getCodeValue();
        }

        public C8026d2 getError() {
            return ((C7985a6) this.instance).getError();
        }

        public boolean hasError() {
            return ((C7985a6) this.instance).hasError();
        }

        private C7986a() {
            super(C7985a6.f20267g);
        }
    }

    /* renamed from: co.znly.models.services.a6$b */
    public enum C7987b implements EnumLite {
        UNKNOWN(0),
        WARNING(1),
        RATE_LIMIT(2),
        RATE_LIMIT_GLOBAL(3),
        ALREADY_FRIENDS(4),
        NOT_FOUND(5),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20279e;

        /* renamed from: co.znly.models.services.a6$b$a */
        class C7988a implements EnumLiteMap<C7987b> {
            C7988a() {
            }

            public C7987b findValueByNumber(int i) {
                return C7987b.m19051a(i);
            }
        }

        static {
            new C7988a();
        }

        private C7987b(int i) {
            this.f20279e = i;
        }

        /* renamed from: a */
        public static C7987b m19051a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return WARNING;
            }
            if (i == 2) {
                return RATE_LIMIT;
            }
            if (i == 3) {
                return RATE_LIMIT_GLOBAL;
            }
            if (i == 4) {
                return ALREADY_FRIENDS;
            }
            if (i != 5) {
                return null;
            }
            return NOT_FOUND;
        }

        public final int getNumber() {
            return this.f20279e;
        }
    }

    static {
        f20267g.makeImmutable();
    }

    private C7985a6() {
    }

    public static C7985a6 getDefaultInstance() {
        return f20267g;
    }

    public static Parser<C7985a6> parser() {
        return f20267g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7985a6();
            case 2:
                return f20267g;
            case 3:
                return null;
            case 4:
                return new C7986a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7985a6 a6Var = (C7985a6) obj2;
                this.f20269e = (C8026d2) visitor.visitMessage(this.f20269e, a6Var.f20269e);
                boolean z2 = this.f20270f != 0;
                int i = this.f20270f;
                if (a6Var.f20270f != 0) {
                    z = true;
                }
                this.f20270f = visitor.visitInt(z2, i, z, a6Var.f20270f);
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
                                Builder builder = this.f20269e != null ? (C8027a) this.f20269e.toBuilder() : null;
                                this.f20269e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20269e);
                                    this.f20269e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f20270f = codedInputStream.readEnum();
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
                if (f20268h == null) {
                    synchronized (C7985a6.class) {
                        if (f20268h == null) {
                            f20268h = new DefaultInstanceBasedParser(f20267g);
                        }
                    }
                }
                return f20268h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20267g;
    }

    public C7987b getCode() {
        C7987b a = C7987b.m19051a(this.f20270f);
        return a == null ? C7987b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20270f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20269e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20269e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f20270f != C7987b.UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20270f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20269e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20269e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f20270f != C7987b.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20270f);
        }
    }
}
