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

/* renamed from: co.znly.models.services.j1 */
public final class C8121j1 extends GeneratedMessageLite<C8121j1, C8122a> implements ZenlyProto$ChatGroupConversationUpdateResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8121j1 f20583e = new C8121j1();

    /* renamed from: f */
    private static volatile Parser<C8121j1> f20584f;

    /* renamed from: co.znly.models.services.j1$a */
    public static final class C8122a extends Builder<C8121j1, C8122a> implements ZenlyProto$ChatGroupConversationUpdateResponseOrBuilder {
        private C8122a() {
            super(C8121j1.f20583e);
        }

        /* synthetic */ C8122a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20583e.makeImmutable();
    }

    private C8121j1() {
    }

    public static C8122a newBuilder() {
        return (C8122a) f20583e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8121j1();
            case 2:
                return f20583e;
            case 3:
                return null;
            case 4:
                return new C8122a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8121j1 j1Var = (C8121j1) obj2;
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
                if (f20584f == null) {
                    synchronized (C8121j1.class) {
                        if (f20584f == null) {
                            f20584f = new DefaultInstanceBasedParser(f20583e);
                        }
                    }
                }
                return f20584f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20583e;
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
