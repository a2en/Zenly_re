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

/* renamed from: co.znly.models.services.s5 */
public final class C8279s5 extends GeneratedMessageLite<C8279s5, C8280a> implements ZenlyProto$UserReportResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8279s5 f20934e = new C8279s5();

    /* renamed from: f */
    private static volatile Parser<C8279s5> f20935f;

    /* renamed from: co.znly.models.services.s5$a */
    public static final class C8280a extends Builder<C8279s5, C8280a> implements ZenlyProto$UserReportResponseOrBuilder {
        /* synthetic */ C8280a(C8104i0 i0Var) {
            this();
        }

        private C8280a() {
            super(C8279s5.f20934e);
        }
    }

    static {
        f20934e.makeImmutable();
    }

    private C8279s5() {
    }

    public static C8280a newBuilder() {
        return (C8280a) f20934e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8279s5();
            case 2:
                return f20934e;
            case 3:
                return null;
            case 4:
                return new C8280a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8279s5 s5Var = (C8279s5) obj2;
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
                if (f20935f == null) {
                    synchronized (C8279s5.class) {
                        if (f20935f == null) {
                            f20935f = new DefaultInstanceBasedParser(f20934e);
                        }
                    }
                }
                return f20935f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20934e;
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
