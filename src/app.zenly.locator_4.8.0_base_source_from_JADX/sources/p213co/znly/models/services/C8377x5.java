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

/* renamed from: co.znly.models.services.x5 */
public final class C8377x5 extends GeneratedMessageLite<C8377x5, C8378a> implements ZenlyProto$UserUnblockResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8377x5 f21225e = new C8377x5();

    /* renamed from: f */
    private static volatile Parser<C8377x5> f21226f;

    /* renamed from: co.znly.models.services.x5$a */
    public static final class C8378a extends Builder<C8377x5, C8378a> implements ZenlyProto$UserUnblockResponseOrBuilder {
        /* synthetic */ C8378a(C8104i0 i0Var) {
            this();
        }

        private C8378a() {
            super(C8377x5.f21225e);
        }
    }

    static {
        f21225e.makeImmutable();
    }

    private C8377x5() {
    }

    public static C8378a newBuilder() {
        return (C8378a) f21225e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8377x5();
            case 2:
                return f21225e;
            case 3:
                return null;
            case 4:
                return new C8378a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8377x5 x5Var = (C8377x5) obj2;
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
                if (f21226f == null) {
                    synchronized (C8377x5.class) {
                        if (f21226f == null) {
                            f21226f = new DefaultInstanceBasedParser(f21225e);
                        }
                    }
                }
                return f21226f;
            default:
                throw new UnsupportedOperationException();
        }
        return f21225e;
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
