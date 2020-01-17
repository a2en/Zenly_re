package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.h0 */
public final class C7111h0 extends GeneratedMessageLite<C7111h0, C7112a> implements CoreExperimentalProto$UserActionsUpdateResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C7111h0 f17597e = new C7111h0();

    /* renamed from: f */
    private static volatile Parser<C7111h0> f17598f;

    /* renamed from: co.znly.models.core.h0$a */
    public static final class C7112a extends Builder<C7111h0, C7112a> implements CoreExperimentalProto$UserActionsUpdateResponseOrBuilder {
        /* synthetic */ C7112a(C7067c0 c0Var) {
            this();
        }

        private C7112a() {
            super(C7111h0.f17597e);
        }
    }

    static {
        f17597e.makeImmutable();
    }

    private C7111h0() {
    }

    public static C7112a newBuilder() {
        return (C7112a) f17597e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7067c0.f17477a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7111h0();
            case 2:
                return f17597e;
            case 3:
                return null;
            case 4:
                return new C7112a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7111h0 h0Var = (C7111h0) obj2;
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
                if (f17598f == null) {
                    synchronized (C7111h0.class) {
                        if (f17598f == null) {
                            f17598f = new DefaultInstanceBasedParser(f17597e);
                        }
                    }
                }
                return f17598f;
            default:
                throw new UnsupportedOperationException();
        }
        return f17597e;
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
