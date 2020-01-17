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

/* renamed from: co.znly.models.services.e4 */
public final class C8048e4 extends GeneratedMessageLite<C8048e4, C8049a> implements ZenlyProto$RecoAcknowledgePotentialMatchResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8048e4 f20414e = new C8048e4();

    /* renamed from: f */
    private static volatile Parser<C8048e4> f20415f;

    /* renamed from: co.znly.models.services.e4$a */
    public static final class C8049a extends Builder<C8048e4, C8049a> implements ZenlyProto$RecoAcknowledgePotentialMatchResponseOrBuilder {
        private C8049a() {
            super(C8048e4.f20414e);
        }

        /* synthetic */ C8049a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20414e.makeImmutable();
    }

    private C8048e4() {
    }

    public static C8049a newBuilder() {
        return (C8049a) f20414e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8048e4();
            case 2:
                return f20414e;
            case 3:
                return null;
            case 4:
                return new C8049a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8048e4 e4Var = (C8048e4) obj2;
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
                if (f20415f == null) {
                    synchronized (C8048e4.class) {
                        if (f20415f == null) {
                            f20415f = new DefaultInstanceBasedParser(f20414e);
                        }
                    }
                }
                return f20415f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20414e;
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
