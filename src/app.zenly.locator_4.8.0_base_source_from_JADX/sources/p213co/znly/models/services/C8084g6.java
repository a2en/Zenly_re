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

/* renamed from: co.znly.models.services.g6 */
public final class C8084g6 extends GeneratedMessageLite<C8084g6, C8085a> implements ZenlyProto$ZenlyRoutingErrorOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8084g6 f20485f = new C8084g6();

    /* renamed from: g */
    private static volatile Parser<C8084g6> f20486g;

    /* renamed from: e */
    private C8026d2 f20487e;

    /* renamed from: co.znly.models.services.g6$a */
    public static final class C8085a extends Builder<C8084g6, C8085a> implements ZenlyProto$ZenlyRoutingErrorOrBuilder {
        private C8085a() {
            super(C8084g6.f20485f);
        }

        /* synthetic */ C8085a(C8104i0 i0Var) {
            this();
        }

        public C8026d2 getError() {
            return ((C8084g6) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8084g6) this.instance).hasError();
        }
    }

    static {
        f20485f.makeImmutable();
    }

    private C8084g6() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8084g6();
            case 2:
                return f20485f;
            case 3:
                return null;
            case 4:
                return new C8085a(null);
            case 5:
                this.f20487e = (C8026d2) ((Visitor) obj).visitMessage(this.f20487e, ((C8084g6) obj2).f20487e);
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
                                Builder builder = this.f20487e != null ? (C8027a) this.f20487e.toBuilder() : null;
                                this.f20487e = (C8026d2) codedInputStream.readMessage(C8026d2.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f20487e);
                                    this.f20487e = (C8026d2) builder.buildPartial();
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
                if (f20486g == null) {
                    synchronized (C8084g6.class) {
                        if (f20486g == null) {
                            f20486g = new DefaultInstanceBasedParser(f20485f);
                        }
                    }
                }
                return f20486g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20485f;
    }

    public C8026d2 getError() {
        C8026d2 d2Var = this.f20487e;
        return d2Var == null ? C8026d2.getDefaultInstance() : d2Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f20487e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f20487e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f20487e != null) {
            codedOutputStream.writeMessage(1, getError());
        }
    }
}
