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

/* renamed from: co.znly.models.services.t2 */
public final class C8292t2 extends GeneratedMessageLite<C8292t2, C8293a> implements ZenlyProto$FriendDeleteResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8292t2 f20961e = new C8292t2();

    /* renamed from: f */
    private static volatile Parser<C8292t2> f20962f;

    /* renamed from: co.znly.models.services.t2$a */
    public static final class C8293a extends Builder<C8292t2, C8293a> implements ZenlyProto$FriendDeleteResponseOrBuilder {
        /* synthetic */ C8293a(C8104i0 i0Var) {
            this();
        }

        private C8293a() {
            super(C8292t2.f20961e);
        }
    }

    static {
        f20961e.makeImmutable();
    }

    private C8292t2() {
    }

    public static C8293a newBuilder() {
        return (C8293a) f20961e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8292t2();
            case 2:
                return f20961e;
            case 3:
                return null;
            case 4:
                return new C8293a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8292t2 t2Var = (C8292t2) obj2;
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
                if (f20962f == null) {
                    synchronized (C8292t2.class) {
                        if (f20962f == null) {
                            f20962f = new DefaultInstanceBasedParser(f20961e);
                        }
                    }
                }
                return f20962f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20961e;
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
