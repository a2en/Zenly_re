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

/* renamed from: co.znly.models.services.a5 */
public final class C7983a5 extends GeneratedMessageLite<C7983a5, C7984a> implements ZenlyProto$TimeTogetherMutualLoveHideResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C7983a5 f20265e = new C7983a5();

    /* renamed from: f */
    private static volatile Parser<C7983a5> f20266f;

    /* renamed from: co.znly.models.services.a5$a */
    public static final class C7984a extends Builder<C7983a5, C7984a> implements ZenlyProto$TimeTogetherMutualLoveHideResponseOrBuilder {
        private C7984a() {
            super(C7983a5.f20265e);
        }

        /* synthetic */ C7984a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20265e.makeImmutable();
    }

    private C7983a5() {
    }

    public static C7984a newBuilder() {
        return (C7984a) f20265e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7983a5();
            case 2:
                return f20265e;
            case 3:
                return null;
            case 4:
                return new C7984a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7983a5 a5Var = (C7983a5) obj2;
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
                if (f20266f == null) {
                    synchronized (C7983a5.class) {
                        if (f20266f == null) {
                            f20266f = new DefaultInstanceBasedParser(f20265e);
                        }
                    }
                }
                return f20266f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20265e;
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
