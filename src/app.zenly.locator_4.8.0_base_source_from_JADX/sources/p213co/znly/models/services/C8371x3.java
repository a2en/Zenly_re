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

/* renamed from: co.znly.models.services.x3 */
public final class C8371x3 extends GeneratedMessageLite<C8371x3, C8372a> implements ZenlyProto$PingSendErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8371x3 f21210g = new C8371x3();

    /* renamed from: h */
    private static volatile Parser<C8371x3> f21211h;

    /* renamed from: e */
    private C8026d2 f21212e;

    /* renamed from: f */
    private int f21213f;

    /* renamed from: co.znly.models.services.x3$a */
    public static final class C8372a extends Builder<C8371x3, C8372a> implements ZenlyProto$PingSendErrorOrBuilder {
        private C8372a() {
            super(C8371x3.f21210g);
        }

        /* synthetic */ C8372a(C8104i0 i0Var) {
            this();
        }

        public C8373b getCode() {
            return ((C8371x3) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8371x3) this.instance).getCodeValue();
        }

        public C8026d2 getError() {
            return ((C8371x3) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8371x3) this.instance).hasError();
        }
    }

    /* renamed from: co.znly.models.services.x3$b */
    public enum C8373b implements EnumLite {
        CODE_SUCCESS(0),
        CODE_TALK_TO_STRANGER_QUARANTINE(1),
        CODE_BLOCKED(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21219e;

        /* renamed from: co.znly.models.services.x3$b$a */
        class C8374a implements EnumLiteMap<C8373b> {
            C8374a() {
            }

            public C8373b findValueByNumber(int i) {
                return C8373b.m19461a(i);
            }
        }

        static {
            new C8374a();
        }

        private C8373b(int i) {
            this.f21219e = i;
        }

        /* renamed from: a */
        public static C8373b m19461a(int i) {
            if (i == 0) {
                return CODE_SUCCESS;
            }
            if (i == 1) {
                return CODE_TALK_TO_STRANGER_QUARANTINE;
            }
            if (i != 2) {
                return null;
            }
            return CODE_BLOCKED;
        }

        public final int getNumber() {
            return this.f21219e;
        }
    }

    static {
        f21210g.makeImmutable();
    }

    private C8371x3() {
    }

    public static C8371x3 getDefaultInstance() {
        return f21210g;
    }

    public static Parser<C8371x3> parser() {
        return f21210g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8371x3();
            case 2:
                return f21210g;
            case 3:
                return null;
            case 4:
                return new C8372a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8371x3 x3Var = (C8371x3) obj2;
                this.f21212e = (C8026d2) visitor.visitMessage(this.f21212e, x3Var.f21212e);
                boolean z2 = this.f21213f != 0;
                int i = this.f21213f;
                if (x3Var.f21213f != 0) {
                    z = true;
                }
                this.f21213f = visitor.visitInt(z2, i, z, x3Var.f21213f);
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
                                Builder builder = this.f21212e != null ? (C8027a) this.f21212e.toBuilder() : null;
                                this.f21212e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21212e);
                                    this.f21212e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f21213f = codedInputStream.readEnum();
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
                if (f21211h == null) {
                    synchronized (C8371x3.class) {
                        if (f21211h == null) {
                            f21211h = new DefaultInstanceBasedParser(f21210g);
                        }
                    }
                }
                return f21211h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21210g;
    }

    public C8373b getCode() {
        C8373b a = C8373b.m19461a(this.f21213f);
        return a == null ? C8373b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f21213f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f21212e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21212e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f21213f != C8373b.CODE_SUCCESS.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f21213f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f21212e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21212e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f21213f != C8373b.CODE_SUCCESS.getNumber()) {
            codedOutputStream.writeEnum(2, this.f21213f);
        }
    }
}
