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

/* renamed from: co.znly.models.services.d5 */
public final class C8034d5 extends GeneratedMessageLite<C8034d5, C8035a> implements ZenlyProto$TstResetMutualLoveResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8034d5 f20390e = new C8034d5();

    /* renamed from: f */
    private static volatile Parser<C8034d5> f20391f;

    /* renamed from: co.znly.models.services.d5$a */
    public static final class C8035a extends Builder<C8034d5, C8035a> implements ZenlyProto$TstResetMutualLoveResponseOrBuilder {
        private C8035a() {
            super(C8034d5.f20390e);
        }

        /* synthetic */ C8035a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20390e.makeImmutable();
    }

    private C8034d5() {
    }

    public static C8035a newBuilder() {
        return (C8035a) f20390e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8034d5();
            case 2:
                return f20390e;
            case 3:
                return null;
            case 4:
                return new C8035a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8034d5 d5Var = (C8034d5) obj2;
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
                if (f20391f == null) {
                    synchronized (C8034d5.class) {
                        if (f20391f == null) {
                            f20391f = new DefaultInstanceBasedParser(f20390e);
                        }
                    }
                }
                return f20391f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20390e;
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
