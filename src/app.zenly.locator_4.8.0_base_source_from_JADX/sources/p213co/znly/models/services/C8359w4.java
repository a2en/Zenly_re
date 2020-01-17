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

/* renamed from: co.znly.models.services.w4 */
public final class C8359w4 extends GeneratedMessageLite<C8359w4, C8360a> implements ZenlyProto$SuggestedDismissErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8359w4 f21176f = new C8359w4();

    /* renamed from: g */
    private static volatile Parser<C8359w4> f21177g;

    /* renamed from: e */
    private C8026d2 f21178e;

    /* renamed from: co.znly.models.services.w4$a */
    public static final class C8360a extends Builder<C8359w4, C8360a> implements ZenlyProto$SuggestedDismissErrorOrBuilder {
        private C8360a() {
            super(C8359w4.f21176f);
        }

        /* synthetic */ C8360a(C8104i0 i0Var) {
            this();
        }

        public C8026d2 getError() {
            return ((C8359w4) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8359w4) this.instance).hasError();
        }
    }

    static {
        f21176f.makeImmutable();
    }

    private C8359w4() {
    }

    public static C8359w4 getDefaultInstance() {
        return f21176f;
    }

    public static Parser<C8359w4> parser() {
        return f21176f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8359w4();
            case 2:
                return f21176f;
            case 3:
                return null;
            case 4:
                return new C8360a(null);
            case 5:
                this.f21178e = (C8026d2) ((Visitor) obj).visitMessage(this.f21178e, ((C8359w4) obj2).f21178e);
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
                                Builder builder = this.f21178e != null ? (C8027a) this.f21178e.toBuilder() : null;
                                this.f21178e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21178e);
                                    this.f21178e = (C8026d2) builder.buildPartial();
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
                if (f21177g == null) {
                    synchronized (C8359w4.class) {
                        if (f21177g == null) {
                            f21177g = new DefaultInstanceBasedParser(f21176f);
                        }
                    }
                }
                return f21177g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21176f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f21178e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21178e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f21178e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21178e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
