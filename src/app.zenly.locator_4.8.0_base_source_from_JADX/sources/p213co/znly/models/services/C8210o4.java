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

/* renamed from: co.znly.models.services.o4 */
public final class C8210o4 extends GeneratedMessageLite<C8210o4, C8211a> implements ZenlyProto$SessionCreateErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8210o4 f20780g = new C8210o4();

    /* renamed from: h */
    private static volatile Parser<C8210o4> f20781h;

    /* renamed from: e */
    private C8026d2 f20782e;

    /* renamed from: f */
    private int f20783f;

    /* renamed from: co.znly.models.services.o4$a */
    public static final class C8211a extends Builder<C8210o4, C8211a> implements ZenlyProto$SessionCreateErrorOrBuilder {
        /* synthetic */ C8211a(C8104i0 i0Var) {
            this();
        }

        public C8212b getCode() {
            return ((C8210o4) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8210o4) this.instance).getCodeValue();
        }

        public C8026d2 getError() {
            return ((C8210o4) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8210o4) this.instance).hasError();
        }

        private C8211a() {
            super(C8210o4.f20780g);
        }
    }

    /* renamed from: co.znly.models.services.o4$b */
    public enum C8212b implements EnumLite {
        CODE_SUCCESS(0),
        CODE_INVALID_PHONE_NUMBER(1),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f20788e;

        /* renamed from: co.znly.models.services.o4$b$a */
        class C8213a implements EnumLiteMap<C8212b> {
            C8213a() {
            }

            public C8212b findValueByNumber(int i) {
                return C8212b.m19291a(i);
            }
        }

        static {
            new C8213a();
        }

        private C8212b(int i) {
            this.f20788e = i;
        }

        /* renamed from: a */
        public static C8212b m19291a(int i) {
            if (i == 0) {
                return CODE_SUCCESS;
            }
            if (i != 1) {
                return null;
            }
            return CODE_INVALID_PHONE_NUMBER;
        }

        public final int getNumber() {
            return this.f20788e;
        }
    }

    static {
        f20780g.makeImmutable();
    }

    private C8210o4() {
    }

    public static C8210o4 getDefaultInstance() {
        return f20780g;
    }

    public static Parser<C8210o4> parser() {
        return f20780g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8210o4();
            case 2:
                return f20780g;
            case 3:
                return null;
            case 4:
                return new C8211a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8210o4 o4Var = (C8210o4) obj2;
                this.f20782e = (C8026d2) visitor.visitMessage(this.f20782e, o4Var.f20782e);
                boolean z2 = this.f20783f != 0;
                int i = this.f20783f;
                if (o4Var.f20783f != 0) {
                    z = true;
                }
                this.f20783f = visitor.visitInt(z2, i, z, o4Var.f20783f);
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
                                Builder builder = this.f20782e != null ? (C8027a) this.f20782e.toBuilder() : null;
                                this.f20782e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20782e);
                                    this.f20782e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f20783f = codedInputStream.readEnum();
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
                if (f20781h == null) {
                    synchronized (C8210o4.class) {
                        if (f20781h == null) {
                            f20781h = new DefaultInstanceBasedParser(f20780g);
                        }
                    }
                }
                return f20781h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20780g;
    }

    public C8212b getCode() {
        C8212b a = C8212b.m19291a(this.f20783f);
        return a == null ? C8212b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20783f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20782e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20782e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f20783f != C8212b.CODE_SUCCESS.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20783f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20782e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20782e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f20783f != C8212b.CODE_SUCCESS.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20783f);
        }
    }
}
