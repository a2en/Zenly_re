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

/* renamed from: co.znly.models.services.u5 */
public final class C8311u5 extends GeneratedMessageLite<C8311u5, C8312a> implements ZenlyProto$UserStartDeletionProcessErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8311u5 f21015g = new C8311u5();

    /* renamed from: h */
    private static volatile Parser<C8311u5> f21016h;

    /* renamed from: e */
    private C8026d2 f21017e;

    /* renamed from: f */
    private int f21018f;

    /* renamed from: co.znly.models.services.u5$a */
    public static final class C8312a extends Builder<C8311u5, C8312a> implements ZenlyProto$UserStartDeletionProcessErrorOrBuilder {
        private C8312a() {
            super(C8311u5.f21015g);
        }

        /* synthetic */ C8312a(C8104i0 i0Var) {
            this();
        }

        public C8313b getCode() {
            return ((C8311u5) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8311u5) this.instance).getCodeValue();
        }

        public C8026d2 getError() {
            return ((C8311u5) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8311u5) this.instance).hasError();
        }
    }

    /* renamed from: co.znly.models.services.u5$b */
    public enum C8313b implements EnumLite {
        CODE_SUCCESS(0),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21022e;

        /* renamed from: co.znly.models.services.u5$b$a */
        class C8314a implements EnumLiteMap<C8313b> {
            C8314a() {
            }

            public C8313b findValueByNumber(int i) {
                return C8313b.m19406a(i);
            }
        }

        static {
            new C8314a();
        }

        private C8313b(int i) {
            this.f21022e = i;
        }

        /* renamed from: a */
        public static C8313b m19406a(int i) {
            if (i != 0) {
                return null;
            }
            return CODE_SUCCESS;
        }

        public final int getNumber() {
            return this.f21022e;
        }
    }

    static {
        f21015g.makeImmutable();
    }

    private C8311u5() {
    }

    public static C8311u5 getDefaultInstance() {
        return f21015g;
    }

    public static Parser<C8311u5> parser() {
        return f21015g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8311u5();
            case 2:
                return f21015g;
            case 3:
                return null;
            case 4:
                return new C8312a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8311u5 u5Var = (C8311u5) obj2;
                this.f21017e = (C8026d2) visitor.visitMessage(this.f21017e, u5Var.f21017e);
                boolean z2 = this.f21018f != 0;
                int i = this.f21018f;
                if (u5Var.f21018f != 0) {
                    z = true;
                }
                this.f21018f = visitor.visitInt(z2, i, z, u5Var.f21018f);
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
                                Builder builder = this.f21017e != null ? (C8027a) this.f21017e.toBuilder() : null;
                                this.f21017e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21017e);
                                    this.f21017e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f21018f = codedInputStream.readEnum();
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
                if (f21016h == null) {
                    synchronized (C8311u5.class) {
                        if (f21016h == null) {
                            f21016h = new DefaultInstanceBasedParser(f21015g);
                        }
                    }
                }
                return f21016h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21015g;
    }

    public C8313b getCode() {
        C8313b a = C8313b.m19406a(this.f21018f);
        return a == null ? C8313b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f21018f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f21017e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21017e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f21018f != C8313b.CODE_SUCCESS.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f21018f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f21017e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21017e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f21018f != C8313b.CODE_SUCCESS.getNumber()) {
            codedOutputStream.writeEnum(2, this.f21018f);
        }
    }
}
