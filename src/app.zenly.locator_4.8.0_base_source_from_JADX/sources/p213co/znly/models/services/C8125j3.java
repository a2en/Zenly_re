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

/* renamed from: co.znly.models.services.j3 */
public final class C8125j3 extends GeneratedMessageLite<C8125j3, C8126a> implements ZenlyProto$MeUpdateErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8125j3 f20588g = new C8125j3();

    /* renamed from: h */
    private static volatile Parser<C8125j3> f20589h;

    /* renamed from: e */
    private C8026d2 f20590e;

    /* renamed from: f */
    private int f20591f;

    /* renamed from: co.znly.models.services.j3$a */
    public static final class C8126a extends Builder<C8125j3, C8126a> implements ZenlyProto$MeUpdateErrorOrBuilder {
        /* synthetic */ C8126a(C8104i0 i0Var) {
            this();
        }

        public C8127b getCode() {
            return ((C8125j3) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8125j3) this.instance).getCodeValue();
        }

        public C8026d2 getError() {
            return ((C8125j3) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8125j3) this.instance).hasError();
        }

        private C8126a() {
            super(C8125j3.f20588g);
        }
    }

    /* renamed from: co.znly.models.services.j3$b */
    public enum C8127b implements EnumLite {
        UNKNOWN(0),
        USERNAME_UNAVAILABLE(1),
        USERNAME_INVALID(2),
        RATE_LIMIT(3),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20598e;

        /* renamed from: co.znly.models.services.j3$b$a */
        class C8128a implements EnumLiteMap<C8127b> {
            C8128a() {
            }

            public C8127b findValueByNumber(int i) {
                return C8127b.m19200a(i);
            }
        }

        static {
            new C8128a();
        }

        private C8127b(int i) {
            this.f20598e = i;
        }

        /* renamed from: a */
        public static C8127b m19200a(int i) {
            if (i == 0) {
                return UNKNOWN;
            }
            if (i == 1) {
                return USERNAME_UNAVAILABLE;
            }
            if (i == 2) {
                return USERNAME_INVALID;
            }
            if (i != 3) {
                return null;
            }
            return RATE_LIMIT;
        }

        public final int getNumber() {
            return this.f20598e;
        }
    }

    static {
        f20588g.makeImmutable();
    }

    private C8125j3() {
    }

    public static C8125j3 getDefaultInstance() {
        return f20588g;
    }

    public static Parser<C8125j3> parser() {
        return f20588g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8125j3();
            case 2:
                return f20588g;
            case 3:
                return null;
            case 4:
                return new C8126a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8125j3 j3Var = (C8125j3) obj2;
                this.f20590e = (C8026d2) visitor.visitMessage(this.f20590e, j3Var.f20590e);
                boolean z2 = this.f20591f != 0;
                int i = this.f20591f;
                if (j3Var.f20591f != 0) {
                    z = true;
                }
                this.f20591f = visitor.visitInt(z2, i, z, j3Var.f20591f);
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
                                Builder builder = this.f20590e != null ? (C8027a) this.f20590e.toBuilder() : null;
                                this.f20590e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20590e);
                                    this.f20590e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f20591f = codedInputStream.readEnum();
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
                if (f20589h == null) {
                    synchronized (C8125j3.class) {
                        if (f20589h == null) {
                            f20589h = new DefaultInstanceBasedParser(f20588g);
                        }
                    }
                }
                return f20589h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20588g;
    }

    public C8127b getCode() {
        C8127b a = C8127b.m19200a(this.f20591f);
        return a == null ? C8127b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20591f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20590e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20590e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f20591f != C8127b.UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20591f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20590e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20590e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f20591f != C8127b.UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20591f);
        }
    }
}
