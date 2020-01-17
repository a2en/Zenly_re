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

/* renamed from: co.znly.models.services.j0 */
public final class C8117j0 extends GeneratedMessageLite<C8117j0, C8118a> implements ZenlyProto$ACLErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8117j0 f20573f = new C8117j0();

    /* renamed from: g */
    private static volatile Parser<C8117j0> f20574g;

    /* renamed from: e */
    private int f20575e;

    /* renamed from: co.znly.models.services.j0$a */
    public static final class C8118a extends Builder<C8117j0, C8118a> implements ZenlyProto$ACLErrorOrBuilder {
        /* synthetic */ C8118a(C8104i0 i0Var) {
            this();
        }

        public C8119b getCode() {
            return ((C8117j0) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8117j0) this.instance).getCodeValue();
        }

        private C8118a() {
            super(C8117j0.f20573f);
        }
    }

    /* renamed from: co.znly.models.services.j0$b */
    public enum C8119b implements EnumLite {
        NO_ACL_ERROR(0),
        BLOCK(1),
        PRIVATE(2),
        RATE_LIMIT_EXCEEDED(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20582e;

        /* renamed from: co.znly.models.services.j0$b$a */
        class C8120a implements EnumLiteMap<C8119b> {
            C8120a() {
            }

            public C8119b findValueByNumber(int i) {
                return C8119b.m19196a(i);
            }
        }

        static {
            new C8120a();
        }

        private C8119b(int i) {
            this.f20582e = i;
        }

        /* renamed from: a */
        public static C8119b m19196a(int i) {
            if (i == 0) {
                return NO_ACL_ERROR;
            }
            if (i == 1) {
                return BLOCK;
            }
            if (i == 2) {
                return PRIVATE;
            }
            if (i != 3) {
                return null;
            }
            return RATE_LIMIT_EXCEEDED;
        }

        public final int getNumber() {
            return this.f20582e;
        }
    }

    static {
        f20573f.makeImmutable();
    }

    private C8117j0() {
    }

    public static C8117j0 getDefaultInstance() {
        return f20573f;
    }

    public static Parser<C8117j0> parser() {
        return f20573f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8117j0();
            case 2:
                return f20573f;
            case 3:
                return null;
            case 4:
                return new C8118a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8117j0 j0Var = (C8117j0) obj2;
                boolean z2 = this.f20575e != 0;
                int i = this.f20575e;
                if (j0Var.f20575e != 0) {
                    z = true;
                }
                this.f20575e = visitor.visitInt(z2, i, z, j0Var.f20575e);
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
                                this.f20575e = codedInputStream.readEnum();
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
                if (f20574g == null) {
                    synchronized (C8117j0.class) {
                        if (f20574g == null) {
                            f20574g = new DefaultInstanceBasedParser(f20573f);
                        }
                    }
                }
                return f20574g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20573f;
    }

    public C8119b getCode() {
        C8119b a = C8119b.m19196a(this.f20575e);
        return a == null ? C8119b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20575e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20575e != C8119b.NO_ACL_ERROR.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f20575e);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20575e != C8119b.NO_ACL_ERROR.getNumber()) {
            codedOutputStream.writeEnum(1, this.f20575e);
        }
    }
}
