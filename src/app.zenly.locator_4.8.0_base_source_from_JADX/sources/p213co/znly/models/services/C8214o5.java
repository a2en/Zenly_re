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

/* renamed from: co.znly.models.services.o5 */
public final class C8214o5 extends GeneratedMessageLite<C8214o5, C8215a> implements ZenlyProto$UserBlockResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8214o5 f20789e = new C8214o5();

    /* renamed from: f */
    private static volatile Parser<C8214o5> f20790f;

    /* renamed from: co.znly.models.services.o5$a */
    public static final class C8215a extends Builder<C8214o5, C8215a> implements ZenlyProto$UserBlockResponseOrBuilder {
        /* synthetic */ C8215a(C8104i0 i0Var) {
            this();
        }

        private C8215a() {
            super(C8214o5.f20789e);
        }
    }

    static {
        f20789e.makeImmutable();
    }

    private C8214o5() {
    }

    public static C8215a newBuilder() {
        return (C8215a) f20789e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8214o5();
            case 2:
                return f20789e;
            case 3:
                return null;
            case 4:
                return new C8215a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8214o5 o5Var = (C8214o5) obj2;
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
                if (f20790f == null) {
                    synchronized (C8214o5.class) {
                        if (f20790f == null) {
                            f20790f = new DefaultInstanceBasedParser(f20789e);
                        }
                    }
                }
                return f20790f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20789e;
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
