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

/* renamed from: co.znly.models.services.r0 */
public final class C8252r0 extends GeneratedMessageLite<C8252r0, C8253a> implements ZenlyProto$BrumpCountersRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8252r0 f20866e = new C8252r0();

    /* renamed from: f */
    private static volatile Parser<C8252r0> f20867f;

    /* renamed from: co.znly.models.services.r0$a */
    public static final class C8253a extends Builder<C8252r0, C8253a> implements ZenlyProto$BrumpCountersRequestOrBuilder {
        private C8253a() {
            super(C8252r0.f20866e);
        }

        /* synthetic */ C8253a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20866e.makeImmutable();
    }

    private C8252r0() {
    }

    public static C8252r0 getDefaultInstance() {
        return f20866e;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8252r0();
            case 2:
                return f20866e;
            case 3:
                return null;
            case 4:
                return new C8253a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8252r0 r0Var = (C8252r0) obj2;
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
                if (f20867f == null) {
                    synchronized (C8252r0.class) {
                        if (f20867f == null) {
                            f20867f = new DefaultInstanceBasedParser(f20866e);
                        }
                    }
                }
                return f20867f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20866e;
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
