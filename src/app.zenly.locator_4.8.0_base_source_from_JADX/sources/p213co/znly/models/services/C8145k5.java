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

/* renamed from: co.znly.models.services.k5 */
public final class C8145k5 extends GeneratedMessageLite<C8145k5, C8146a> implements ZenlyProto$UserAnnotationRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8145k5 f20634e = new C8145k5();

    /* renamed from: f */
    private static volatile Parser<C8145k5> f20635f;

    /* renamed from: co.znly.models.services.k5$a */
    public static final class C8146a extends Builder<C8145k5, C8146a> implements ZenlyProto$UserAnnotationRequestOrBuilder {
        private C8146a() {
            super(C8145k5.f20634e);
        }

        /* synthetic */ C8146a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20634e.makeImmutable();
    }

    private C8145k5() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8145k5();
            case 2:
                return f20634e;
            case 3:
                return null;
            case 4:
                return new C8146a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8145k5 k5Var = (C8145k5) obj2;
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
                if (f20635f == null) {
                    synchronized (C8145k5.class) {
                        if (f20635f == null) {
                            f20635f = new DefaultInstanceBasedParser(f20634e);
                        }
                    }
                }
                return f20635f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20634e;
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
