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

/* renamed from: co.znly.models.services.e3 */
public final class C8046e3 extends GeneratedMessageLite<C8046e3, C8047a> implements ZenlyProto$GetAnnouncementsRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8046e3 f20412e = new C8046e3();

    /* renamed from: f */
    private static volatile Parser<C8046e3> f20413f;

    /* renamed from: co.znly.models.services.e3$a */
    public static final class C8047a extends Builder<C8046e3, C8047a> implements ZenlyProto$GetAnnouncementsRequestOrBuilder {
        private C8047a() {
            super(C8046e3.f20412e);
        }

        /* synthetic */ C8047a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20412e.makeImmutable();
    }

    private C8046e3() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8046e3();
            case 2:
                return f20412e;
            case 3:
                return null;
            case 4:
                return new C8047a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8046e3 e3Var = (C8046e3) obj2;
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
                if (f20413f == null) {
                    synchronized (C8046e3.class) {
                        if (f20413f == null) {
                            f20413f = new DefaultInstanceBasedParser(f20412e);
                        }
                    }
                }
                return f20413f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20412e;
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
