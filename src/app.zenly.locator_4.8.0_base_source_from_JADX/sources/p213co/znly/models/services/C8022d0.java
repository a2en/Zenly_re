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

/* renamed from: co.znly.models.services.d0 */
public final class C8022d0 extends GeneratedMessageLite<C8022d0, C8023a> implements ZendeskProto$ZendeskGetFeedbackCategoriesErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8022d0 f20361g = new C8022d0();

    /* renamed from: h */
    private static volatile Parser<C8022d0> f20362h;

    /* renamed from: e */
    private C8026d2 f20363e;

    /* renamed from: f */
    private int f20364f;

    /* renamed from: co.znly.models.services.d0$a */
    public static final class C8023a extends Builder<C8022d0, C8023a> implements ZendeskProto$ZendeskGetFeedbackCategoriesErrorOrBuilder {
        /* synthetic */ C8023a(C8344w wVar) {
            this();
        }

        public C8006c0 getCode() {
            return ((C8022d0) this.instance).getCode();
        }

        public int getCodeValue() {
            return ((C8022d0) this.instance).getCodeValue();
        }

        public C8026d2 getError() {
            return ((C8022d0) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8022d0) this.instance).hasError();
        }

        private C8023a() {
            super(C8022d0.f20361g);
        }
    }

    static {
        f20361g.makeImmutable();
    }

    private C8022d0() {
    }

    public static C8022d0 getDefaultInstance() {
        return f20361g;
    }

    public static Parser<C8022d0> parser() {
        return f20361g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8344w.f21131a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8022d0();
            case 2:
                return f20361g;
            case 3:
                return null;
            case 4:
                return new C8023a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8022d0 d0Var = (C8022d0) obj2;
                this.f20363e = (C8026d2) visitor.visitMessage(this.f20363e, d0Var.f20363e);
                boolean z2 = this.f20364f != 0;
                int i = this.f20364f;
                if (d0Var.f20364f != 0) {
                    z = true;
                }
                this.f20364f = visitor.visitInt(z2, i, z, d0Var.f20364f);
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
                                Builder builder = this.f20363e != null ? (C8027a) this.f20363e.toBuilder() : null;
                                this.f20363e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20363e);
                                    this.f20363e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 16) {
                                this.f20364f = codedInputStream.readEnum();
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
                if (f20362h == null) {
                    synchronized (C8022d0.class) {
                        if (f20362h == null) {
                            f20362h = new DefaultInstanceBasedParser(f20361g);
                        }
                    }
                }
                return f20362h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20361g;
    }

    public C8006c0 getCode() {
        C8006c0 a = C8006c0.m19063a(this.f20364f);
        return a == null ? C8006c0.UNRECOGNIZED : a;
    }

    public int getCodeValue() {
        return this.f20364f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20363e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20363e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f20364f != C8006c0.ZendeskGetCategoriesErrors_SUCCESS.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f20364f);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20363e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20363e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f20364f != C8006c0.ZendeskGetCategoriesErrors_SUCCESS.getNumber()) {
            codedOutputStream.writeEnum(2, this.f20364f);
        }
    }
}
