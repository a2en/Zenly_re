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

/* renamed from: co.znly.models.services.z0 */
public final class C8395z0 extends GeneratedMessageLite<C8395z0, C8396a> implements ZenlyProto$ChatConversationUnMuteResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8395z0 f21255e = new C8395z0();

    /* renamed from: f */
    private static volatile Parser<C8395z0> f21256f;

    /* renamed from: co.znly.models.services.z0$a */
    public static final class C8396a extends Builder<C8395z0, C8396a> implements ZenlyProto$ChatConversationUnMuteResponseOrBuilder {
        private C8396a() {
            super(C8395z0.f21255e);
        }

        /* synthetic */ C8396a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f21255e.makeImmutable();
    }

    private C8395z0() {
    }

    public static C8396a newBuilder() {
        return (C8396a) f21255e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8395z0();
            case 2:
                return f21255e;
            case 3:
                return null;
            case 4:
                return new C8396a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8395z0 z0Var = (C8395z0) obj2;
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
                if (f21256f == null) {
                    synchronized (C8395z0.class) {
                        if (f21256f == null) {
                            f21256f = new DefaultInstanceBasedParser(f21255e);
                        }
                    }
                }
                return f21256f;
            default:
                throw new UnsupportedOperationException();
        }
        return f21255e;
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
