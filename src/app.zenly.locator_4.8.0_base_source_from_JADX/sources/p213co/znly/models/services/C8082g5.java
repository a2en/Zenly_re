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

/* renamed from: co.znly.models.services.g5 */
public final class C8082g5 extends GeneratedMessageLite<C8082g5, C8083a> implements ZenlyProto$UniversitiesCampaignsSubscriptionRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8082g5 f20483e = new C8082g5();

    /* renamed from: f */
    private static volatile Parser<C8082g5> f20484f;

    /* renamed from: co.znly.models.services.g5$a */
    public static final class C8083a extends Builder<C8082g5, C8083a> implements ZenlyProto$UniversitiesCampaignsSubscriptionRequestOrBuilder {
        private C8083a() {
            super(C8082g5.f20483e);
        }

        /* synthetic */ C8083a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20483e.makeImmutable();
    }

    private C8082g5() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8082g5();
            case 2:
                return f20483e;
            case 3:
                return null;
            case 4:
                return new C8083a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8082g5 g5Var = (C8082g5) obj2;
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
                if (f20484f == null) {
                    synchronized (C8082g5.class) {
                        if (f20484f == null) {
                            f20484f = new DefaultInstanceBasedParser(f20483e);
                        }
                    }
                }
                return f20484f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20483e;
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
