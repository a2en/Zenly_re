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
import p213co.znly.models.services.C8347w1.C8348a;

/* renamed from: co.znly.models.services.v1 */
public final class C8334v1 extends GeneratedMessageLite<C8334v1, C8335a> implements ZenlyProto$ConversationCreateErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8334v1 f21108g = new C8334v1();

    /* renamed from: h */
    private static volatile Parser<C8334v1> f21109h;

    /* renamed from: e */
    private C8026d2 f21110e;

    /* renamed from: f */
    private C8347w1 f21111f;

    /* renamed from: co.znly.models.services.v1$a */
    public static final class C8335a extends Builder<C8334v1, C8335a> implements ZenlyProto$ConversationCreateErrorOrBuilder {
        /* synthetic */ C8335a(C8104i0 i0Var) {
            this();
        }

        public C8347w1 getConversationError() {
            return ((C8334v1) this.instance).getConversationError();
        }

        public C8026d2 getError() {
            return ((C8334v1) this.instance).getError();
        }

        public boolean hasConversationError() {
            return ((C8334v1) this.instance).hasConversationError();
        }

        public boolean hasError() {
            return ((C8334v1) this.instance).hasError();
        }

        private C8335a() {
            super(C8334v1.f21108g);
        }
    }

    static {
        f21108g.makeImmutable();
    }

    private C8334v1() {
    }

    public static C8334v1 getDefaultInstance() {
        return f21108g;
    }

    public static Parser<C8334v1> parser() {
        return f21108g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8334v1();
            case 2:
                return f21108g;
            case 3:
                return null;
            case 4:
                return new C8335a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8334v1 v1Var = (C8334v1) obj2;
                this.f21110e = (C8026d2) visitor.visitMessage(this.f21110e, v1Var.f21110e);
                this.f21111f = (C8347w1) visitor.visitMessage(this.f21111f, v1Var.f21111f);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f21110e != null ? (C8027a) this.f21110e.toBuilder() : null;
                                this.f21110e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21110e);
                                    this.f21110e = (C8026d2) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f21111f != null ? (C8348a) this.f21111f.toBuilder() : null;
                                this.f21111f = (C8347w1) codedInputStream.readMessage(C8347w1.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f21111f);
                                    this.f21111f = (C8347w1) builder2.buildPartial();
                                }
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
                if (f21109h == null) {
                    synchronized (C8334v1.class) {
                        if (f21109h == null) {
                            f21109h = new DefaultInstanceBasedParser(f21108g);
                        }
                    }
                }
                return f21109h;
            default:
                throw new UnsupportedOperationException();
        }
        return f21108g;
    }

    public C8347w1 getConversationError() {
        C8347w1 w1Var = this.f21111f;
        return w1Var == null ? C8347w1.getDefaultInstance() : w1Var;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f21110e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21110e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        if (this.f21111f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getConversationError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasConversationError() {
        return this.f21111f != null;
    }

    public boolean hasError() {
        return this.f21110e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21110e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
        if (this.f21111f != null) {
            codedOutputStream.writeMessage(2, getConversationError());
        }
    }
}
