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

/* renamed from: co.znly.models.core.f0 */
public final class C7094f0 extends GeneratedMessageLite<C7094f0, C7095a> implements CoreExperimentalProto$UserActionsFetchStreamRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C7094f0 f17543e = new C7094f0();

    /* renamed from: f */
    private static volatile Parser<C7094f0> f17544f;

    /* renamed from: co.znly.models.core.f0$a */
    public static final class C7095a extends Builder<C7094f0, C7095a> implements CoreExperimentalProto$UserActionsFetchStreamRequestOrBuilder {
        /* synthetic */ C7095a(C7067c0 c0Var) {
            this();
        }

        private C7095a() {
            super(C7094f0.f17543e);
        }
    }

    static {
        f17543e.makeImmutable();
    }

    private C7094f0() {
    }

    public static C7095a newBuilder() {
        return (C7095a) f17543e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7067c0.f17477a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7094f0();
            case 2:
                return f17543e;
            case 3:
                return null;
            case 4:
                return new C7095a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7094f0 f0Var = (C7094f0) obj2;
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
                if (f17544f == null) {
                    synchronized (C7094f0.class) {
                        if (f17544f == null) {
                            f17544f = new DefaultInstanceBasedParser(f17543e);
                        }
                    }
                }
                return f17544f;
            default:
                throw new UnsupportedOperationException();
        }
        return f17543e;
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
