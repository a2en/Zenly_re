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

/* renamed from: co.znly.models.services.g4 */
public final class C8080g4 extends GeneratedMessageLite<C8080g4, C8081a> implements ZenlyProto$RecoAcknowledgeRecommendationResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8080g4 f20481e = new C8080g4();

    /* renamed from: f */
    private static volatile Parser<C8080g4> f20482f;

    /* renamed from: co.znly.models.services.g4$a */
    public static final class C8081a extends Builder<C8080g4, C8081a> implements ZenlyProto$RecoAcknowledgeRecommendationResponseOrBuilder {
        private C8081a() {
            super(C8080g4.f20481e);
        }

        /* synthetic */ C8081a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20481e.makeImmutable();
    }

    private C8080g4() {
    }

    public static C8081a newBuilder() {
        return (C8081a) f20481e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8080g4();
            case 2:
                return f20481e;
            case 3:
                return null;
            case 4:
                return new C8081a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8080g4 g4Var = (C8080g4) obj2;
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
                if (f20482f == null) {
                    synchronized (C8080g4.class) {
                        if (f20482f == null) {
                            f20482f = new DefaultInstanceBasedParser(f20481e);
                        }
                    }
                }
                return f20482f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20481e;
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
