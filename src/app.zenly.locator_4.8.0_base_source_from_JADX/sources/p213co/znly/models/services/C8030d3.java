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

/* renamed from: co.znly.models.services.d3 */
public final class C8030d3 extends GeneratedMessageLite<C8030d3, C8031a> implements ZenlyProto$FriendSubscribeResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8030d3 f20382e = new C8030d3();

    /* renamed from: f */
    private static volatile Parser<C8030d3> f20383f;

    /* renamed from: co.znly.models.services.d3$a */
    public static final class C8031a extends Builder<C8030d3, C8031a> implements ZenlyProto$FriendSubscribeResponseOrBuilder {
        /* synthetic */ C8031a(C8104i0 i0Var) {
            this();
        }

        private C8031a() {
            super(C8030d3.f20382e);
        }
    }

    static {
        f20382e.makeImmutable();
    }

    private C8030d3() {
    }

    public static C8031a newBuilder() {
        return (C8031a) f20382e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8030d3();
            case 2:
                return f20382e;
            case 3:
                return null;
            case 4:
                return new C8031a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8030d3 d3Var = (C8030d3) obj2;
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
                if (f20383f == null) {
                    synchronized (C8030d3.class) {
                        if (f20383f == null) {
                            f20383f = new DefaultInstanceBasedParser(f20382e);
                        }
                    }
                }
                return f20383f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20382e;
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
