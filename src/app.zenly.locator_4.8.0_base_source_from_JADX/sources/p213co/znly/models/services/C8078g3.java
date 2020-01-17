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

/* renamed from: co.znly.models.services.g3 */
public final class C8078g3 extends GeneratedMessageLite<C8078g3, C8079a> implements ZenlyProto$InboxHideResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8078g3 f20479e = new C8078g3();

    /* renamed from: f */
    private static volatile Parser<C8078g3> f20480f;

    /* renamed from: co.znly.models.services.g3$a */
    public static final class C8079a extends Builder<C8078g3, C8079a> implements ZenlyProto$InboxHideResponseOrBuilder {
        private C8079a() {
            super(C8078g3.f20479e);
        }

        /* synthetic */ C8079a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20479e.makeImmutable();
    }

    private C8078g3() {
    }

    public static C8079a newBuilder() {
        return (C8079a) f20479e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8078g3();
            case 2:
                return f20479e;
            case 3:
                return null;
            case 4:
                return new C8079a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8078g3 g3Var = (C8078g3) obj2;
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
                if (f20480f == null) {
                    synchronized (C8078g3.class) {
                        if (f20480f == null) {
                            f20480f = new DefaultInstanceBasedParser(f20479e);
                        }
                    }
                }
                return f20480f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20479e;
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
