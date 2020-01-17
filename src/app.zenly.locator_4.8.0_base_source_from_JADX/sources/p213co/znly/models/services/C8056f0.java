package p213co.znly.models.services;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.services.C8026d2.C8027a;

/* renamed from: co.znly.models.services.f0 */
public final class C8056f0 extends GeneratedMessageLite<C8056f0, C8057a> implements ZendeskProto$ZendeskGetProblemCategoriesErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8056f0 f20427g = new C8056f0();

    /* renamed from: h */
    private static volatile Parser<C8056f0> f20428h;

    /* renamed from: e */
    private C8026d2 f20429e;

    /* renamed from: f */
    private int f20430f;

    /* renamed from: co.znly.models.services.f0$a */
    public static final class C8057a extends Builder<C8056f0, C8057a> implements ZendeskProto$ZendeskGetProblemCategoriesErrorOrBuilder {
        /* synthetic */ C8057a(C8344w wVar) {
            this();
        }

        public C8006c0 getCode() {
            return ((C8056f0) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8056f0) this.instance).getCodeValue();
        }

        public C8026d2 getError() {
            return ((C8056f0) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8056f0) this.instance).hasError();
        }

        private C8057a() {
            super(C8056f0.f20427g);
        }
    }

    static {
        f20427g.makeImmutable();
    }

    private C8056f0() {
    }

    public static C8056f0 getDefaultInstance() {
        return f20427g;
    }

    public static Parser<C8056f0> parser() {
        return f20427g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8056f0();
            case 2:
                return f20427g;
            case 3:
                return null;
            case 4:
                return new C8057a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8056f0 f0Var = (C8056f0) obj2;
                this.f20429e = (C8026d2) visitor.visitMessage(this.f20429e, f0Var.f20429e);
                boolean z2 = this.f20430f != 0;
                int i = this.f20430f;
                if (f0Var.f20430f != 0) {
                    z = true;
                }
                this.f20430f = visitor.visitInt(z2, i, z, f0Var.f20430f);
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
                                Builder builder = this.f20429e != null ? (C8027a) this.f20429e.toBuilder() : null;
                                this.f20429e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20429e);
                                    this.f20429e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f20430f = codedInputStream.readEnum();
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
                if (f20428h == null) {
                    synchronized (C8056f0.class) {
                        if (f20428h == null) {
                            f20428h = new DefaultInstanceBasedParser(f20427g);
                        }
                    }
                }
                return f20428h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20427g;
    }

    public C8006c0 getCode() {
        C8006c0 a = C8006c0.m19063a(this.f20430f);
        return a == null ? C8006c0.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20430f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20429e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20429e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f20430f != C8006c0.ZendeskGetCategoriesErrors_SUCCESS.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20430f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20429e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20429e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f20430f != C8006c0.ZendeskGetCategoriesErrors_SUCCESS.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20430f);
        }
    }
}
