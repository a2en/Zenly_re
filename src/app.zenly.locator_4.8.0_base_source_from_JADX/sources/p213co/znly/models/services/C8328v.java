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

/* renamed from: co.znly.models.services.v */
public final class C8328v extends GeneratedMessageLite<C8328v, C8329a> implements VerifyProto$VerifyErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8328v f21088g = new C8328v();

    /* renamed from: h */
    private static volatile Parser<C8328v> f21089h;

    /* renamed from: e */
    private int f21090e;

    /* renamed from: f */
    private String f21091f = "";

    /* renamed from: co.znly.models.services.v$a */
    public static final class C8329a extends Builder<C8328v, C8329a> implements VerifyProto$VerifyErrorOrBuilder {
        /* synthetic */ C8329a(C8300u uVar) {
            this();
        }

        public C8330b getCode() {
            return ((C8328v) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8328v) this.instance).getCodeValue();
        }

        public String getMessage() {
            return ((C8328v) this.instance).getMessage();
        }

        public ByteString getMessageBytes() {
            return ((C8328v) this.instance).getMessageBytes();
        }

        private C8329a() {
            super(C8328v.f21088g);
        }
    }

    /* renamed from: co.znly.models.services.v$b */
    public enum C8330b implements EnumLite {
        CODE_OTHER(0),
        CODE_BLACK_LISTED(1),
        CODE_CONCURRENT_CALL_FORBIDDEN(2),
        CODE_TOO_MANY_TRIES(3),
        CODE_INVALID_CODE(4),
        CODE_EXPIRED_CODE(5),
        CODE_NO_ACTION(6),
        CODE_INVALID_AUTH(7),
        CODE_NOT_FOUND(8),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21103e;

        /* renamed from: co.znly.models.services.v$b$a */
        class C8331a implements EnumLiteMap<C8330b> {
            C8331a() {
            }

            public C8330b findValueByNumber(int i) {
                return C8330b.m19412a(i);
            }
        }

        static {
            new C8331a();
        }

        private C8330b(int i) {
            this.f21103e = i;
        }

        /* renamed from: a */
        public static C8330b m19412a(int i) {
            switch (i) {
                case 0:
                    return CODE_OTHER;
                case 1:
                    return CODE_BLACK_LISTED;
                case 2:
                    return CODE_CONCURRENT_CALL_FORBIDDEN;
                case 3:
                    return CODE_TOO_MANY_TRIES;
                case 4:
                    return CODE_INVALID_CODE;
                case 5:
                    return CODE_EXPIRED_CODE;
                case 6:
                    return CODE_NO_ACTION;
                case 7:
                    return CODE_INVALID_AUTH;
                case 8:
                    return CODE_NOT_FOUND;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f21103e;
        }
    }

    static {
        f21088g.makeImmutable();
    }

    private C8328v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8300u.f20981a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8328v();
            case 2:
                return f21088g;
            case 3:
                return null;
            case 4:
                return new C8329a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8328v vVar = (C8328v) obj2;
                boolean z2 = this.f21090e != 0;
                int i = this.f21090e;
                if (vVar.f21090e != 0) {
                    z = true;
                }
                this.f21090e = visitor.visitInt(z2, i, z, vVar.f21090e);
                this.f21091f = visitor.visitString(!this.f21091f.isEmpty(), this.f21091f, !vVar.f21091f.isEmpty(), vVar.f21091f);
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
                                this.f21090e = codedInputStream.readEnum();
                            } else if (readTag == 18) {
                                this.f21091f = codedInputStream.readStringRequireUtf8();
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
                if (f21089h == null) {
                    synchronized (C8328v.class) {
                        if (f21089h == null) {
                            f21089h = new DefaultInstanceBasedParser(f21088g);
                        }
                    }
                }
                return f21089h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21088g;
    }

    public C8330b getCode() {
        C8330b a = C8330b.m19412a(this.f21090e);
        return a == null ? C8330b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f21090e;
    }

    public String getMessage() {
        return this.f21091f;
    }

    public ByteString getMessageBytes() {
        return ByteString.copyFromUtf8(this.f21091f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21090e != C8330b.CODE_OTHER.getNumber()) {
            i2 = 0 + CodedOutputStream.computeEnumSize(1, this.f21090e);
        }
        if (!this.f21091f.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(2, getMessage());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21090e != C8330b.CODE_OTHER.getNumber()) {
            codedOutputStream.writeEnum(1, this.f21090e);
        }
        if (!this.f21091f.isEmpty()) {
            codedOutputStream.writeString(2, getMessage());
        }
    }
}
