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
import p213co.znly.models.services.C8117j0.C8118a;

/* renamed from: co.znly.models.services.w2 */
public final class C8351w2 extends GeneratedMessageLite<C8351w2, C8352a> implements ZenlyProto$FriendRequestCreateErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C8351w2 f21146h = new C8351w2();

    /* renamed from: i */
    private static volatile Parser<C8351w2> f21147i;

    /* renamed from: e */
    private C8026d2 f21148e;

    /* renamed from: f */
    private C8117j0 f21149f;

    /* renamed from: g */
    private int f21150g;

    /* renamed from: co.znly.models.services.w2$a */
    public static final class C8352a extends Builder<C8351w2, C8352a> implements ZenlyProto$FriendRequestCreateErrorOrBuilder {
        /* synthetic */ C8352a(C8104i0 i0Var) {
            this();
        }

        public C8117j0 getAclError() {
            return ((C8351w2) this.instance).getAclError();
        }

        public C8353b getCode() {
            return ((C8351w2) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8351w2) this.instance).getCodeValue();
        }

        public C8026d2 getError() {
            return ((C8351w2) this.instance).getError();
        }

        public boolean hasAclError() {
            return ((C8351w2) this.instance).hasAclError();
        }

        public boolean hasError() {
            return ((C8351w2) this.instance).hasError();
        }

        private C8352a() {
            super(C8351w2.f21146h);
        }
    }

    /* renamed from: co.znly.models.services.w2$b */
    public enum C8353b implements EnumLite {
        NO_ERROR(0),
        ALREADY_FRIENDS(1),
        ALREADY_INVITED(2),
        CANNOT_COERCED_PHONENUMBER(3),
        SAME_AUTHOR_TARGET(4),
        UNKNOWN_USERNAME(5),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f21159e;

        /* renamed from: co.znly.models.services.w2$b$a */
        class C8354a implements EnumLiteMap<C8353b> {
            C8354a() {
            }

            public C8353b findValueByNumber(int i) {
                return C8353b.m19429a(i);
            }
        }

        static {
            new C8354a();
        }

        private C8353b(int i) {
            this.f21159e = i;
        }

        /* renamed from: a */
        public static C8353b m19429a(int i) {
            if (i == 0) {
                return NO_ERROR;
            }
            if (i == 1) {
                return ALREADY_FRIENDS;
            }
            if (i == 2) {
                return ALREADY_INVITED;
            }
            if (i == 3) {
                return CANNOT_COERCED_PHONENUMBER;
            }
            if (i == 4) {
                return SAME_AUTHOR_TARGET;
            }
            if (i != 5) {
                return null;
            }
            return UNKNOWN_USERNAME;
        }

        public final int getNumber() {
            return this.f21159e;
        }
    }

    static {
        f21146h.makeImmutable();
    }

    private C8351w2() {
    }

    public static C8351w2 getDefaultInstance() {
        return f21146h;
    }

    public static Parser<C8351w2> parser() {
        return f21146h.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8351w2();
            case 2:
                return f21146h;
            case 3:
                return null;
            case 4:
                return new C8352a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8351w2 w2Var = (C8351w2) obj2;
                this.f21148e = (C8026d2) visitor.visitMessage(this.f21148e, w2Var.f21148e);
                this.f21149f = (C8117j0) visitor.visitMessage(this.f21149f, w2Var.f21149f);
                boolean z2 = this.f21150g != 0;
                int i = this.f21150g;
                if (w2Var.f21150g != 0) {
                    z = true;
                }
                this.f21150g = visitor.visitInt(z2, i, z, w2Var.f21150g);
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
                                Builder builder = this.f21148e != null ? (C8027a) this.f21148e.toBuilder() : null;
                                this.f21148e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21148e);
                                    this.f21148e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f21149f != null ? (C8118a) this.f21149f.toBuilder() : null;
                                this.f21149f = (C8117j0) codedInputStream.readMessage(C8117j0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f21149f);
                                    this.f21149f = (C8117j0) builder2.buildPartial();
                                }
                            } else if (readTag == 24) {
                                this.f21150g = codedInputStream.readEnum();
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
                if (f21147i == null) {
                    synchronized (C8351w2.class) {
                        if (f21147i == null) {
                            f21147i = new DefaultInstanceBasedParser(f21146h);
                        }
                    }
                }
                return f21147i;
            default:
                throw new UnsupportedOperationException();
        }
        return f21146h;
    }

    public C8117j0 getAclError() {
        C8117j0 j0Var = this.f21149f;
        return j0Var == null ? C8117j0.getDefaultInstance() : j0Var;
    }

    public C8353b getCode() {
        C8353b a = C8353b.m19429a(this.f21150g);
        return a == null ? C8353b.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f21150g;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f21148e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21148e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f21149f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getAclError());
        }
        if (this.f21150g != C8353b.NO_ERROR.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(3, this.f21150g);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasAclError() {
        return this.f21149f != null;
    }

    public boolean hasError() {
        return this.f21148e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21148e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f21149f != null) {
            codedOutputStream.writeMessage(2, getAclError());
        }
        if (this.f21150g != C8353b.NO_ERROR.getNumber()) {
            codedOutputStream.writeEnum(3, this.f21150g);
        }
    }
}
