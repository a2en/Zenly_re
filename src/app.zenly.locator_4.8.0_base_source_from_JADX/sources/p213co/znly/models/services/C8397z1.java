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

/* renamed from: co.znly.models.services.z1 */
public final class C8397z1 extends GeneratedMessageLite<C8397z1, C8398a> implements ZenlyProto$DebugUserResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8397z1 f21257e = new C8397z1();

    /* renamed from: f */
    private static volatile Parser<C8397z1> f21258f;

    /* renamed from: co.znly.models.services.z1$a */
    public static final class C8398a extends Builder<C8397z1, C8398a> implements ZenlyProto$DebugUserResponseOrBuilder {
        private C8398a() {
            super(C8397z1.f21257e);
        }

        /* synthetic */ C8398a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f21257e.makeImmutable();
    }

    private C8397z1() {
    }

    public static C8398a newBuilder() {
        return (C8398a) f21257e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8397z1();
            case 2:
                return f21257e;
            case 3:
                return null;
            case 4:
                return new C8398a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8397z1 z1Var = (C8397z1) obj2;
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag == 0 || !codedInputStream.skipField(readTag)) {
                            z = true;
                        }
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
                if (f21258f == null) {
                    synchronized (C8397z1.class) {
                        if (f21258f == null) {
                            f21258f = new DefaultInstanceBasedParser(f21257e);
                        }
                    }
                }
                return f21258f;
            default:
                throw new UnsupportedOperationException();
        }
        return f21257e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        this.memoizedSerializedSize = 0;
        return 0;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
    }
}
