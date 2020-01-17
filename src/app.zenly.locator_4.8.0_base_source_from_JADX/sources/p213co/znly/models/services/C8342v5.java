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
import p213co.znly.models.services.C8311u5.C8312a;

/* renamed from: co.znly.models.services.v5 */
public final class C8342v5 extends GeneratedMessageLite<C8342v5, C8343a> implements ZenlyProto$UserStartDeletionProcessResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8342v5 f21128f = new C8342v5();

    /* renamed from: g */
    private static volatile Parser<C8342v5> f21129g;

    /* renamed from: e */
    private C8311u5 f21130e;

    /* renamed from: co.znly.models.services.v5$a */
    public static final class C8343a extends Builder<C8342v5, C8343a> implements ZenlyProto$UserStartDeletionProcessResponseOrBuilder {
        private C8343a() {
            super(C8342v5.f21128f);
        }

        /* synthetic */ C8343a(C8104i0 i0Var) {
            this();
        }

        public C8311u5 getError() {
            return ((C8342v5) this.instance).getError();
        }

        public boolean hasError() {
            return ((C8342v5) this.instance).hasError();
        }
    }

    static {
        f21128f.makeImmutable();
    }

    private C8342v5() {
    }

    public static C8343a newBuilder() {
        return (C8343a) f21128f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8342v5();
            case 2:
                return f21128f;
            case 3:
                return null;
            case 4:
                return new C8343a(null);
            case 5:
                this.f21130e = (C8311u5) ((Visitor) obj).visitMessage(this.f21130e, ((C8342v5) obj2).f21130e);
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
                            if (readTag == 1010) {
                                Builder builder = this.f21130e != null ? (C8312a) this.f21130e.toBuilder() : null;
                                this.f21130e = (C8311u5) codedInputStream.readMessage(C8311u5.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f21130e);
                                    this.f21130e = (C8311u5) builder.buildPartial();
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
                if (f21129g == null) {
                    synchronized (C8342v5.class) {
                        if (f21129g == null) {
                            f21129g = new DefaultInstanceBasedParser(f21128f);
                        }
                    }
                }
                return f21129g;
            default:
                throw new UnsupportedOperationException();
        }
        return f21128f;
    }

    public C8311u5 getError() {
        C8311u5 u5Var = this.f21130e;
        return u5Var == null ? C8311u5.getDefaultInstance() : u5Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f21130e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(126, getError());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasError() {
        return this.f21130e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f21130e != null) {
            codedOutputStream.writeMessage(126, getError());
        }
    }
}
