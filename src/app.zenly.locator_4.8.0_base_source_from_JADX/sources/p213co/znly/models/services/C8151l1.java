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

/* renamed from: co.znly.models.services.l1 */
public final class C8151l1 extends GeneratedMessageLite<C8151l1, C8152a> implements ZenlyProto$ChatReportMessageResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8151l1 f20643e = new C8151l1();

    /* renamed from: f */
    private static volatile Parser<C8151l1> f20644f;

    /* renamed from: co.znly.models.services.l1$a */
    public static final class C8152a extends Builder<C8151l1, C8152a> implements ZenlyProto$ChatReportMessageResponseOrBuilder {
        /* synthetic */ C8152a(C8104i0 i0Var) {
            this();
        }

        private C8152a() {
            super(C8151l1.f20643e);
        }
    }

    static {
        f20643e.makeImmutable();
    }

    private C8151l1() {
    }

    public static C8152a newBuilder() {
        return (C8152a) f20643e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8151l1();
            case 2:
                return f20643e;
            case 3:
                return null;
            case 4:
                return new C8152a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8151l1 l1Var = (C8151l1) obj2;
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
                if (f20644f == null) {
                    synchronized (C8151l1.class) {
                        if (f20644f == null) {
                            f20644f = new DefaultInstanceBasedParser(f20643e);
                        }
                    }
                }
                return f20644f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20643e;
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
