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

/* renamed from: co.znly.models.services.q1 */
public final class C8241q1 extends GeneratedMessageLite<C8241q1, C8242a> implements ZenlyProto$ChatUpdateCursorResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8241q1 f20846e = new C8241q1();

    /* renamed from: f */
    private static volatile Parser<C8241q1> f20847f;

    /* renamed from: co.znly.models.services.q1$a */
    public static final class C8242a extends Builder<C8241q1, C8242a> implements ZenlyProto$ChatUpdateCursorResponseOrBuilder {
        /* synthetic */ C8242a(C8104i0 i0Var) {
            this();
        }

        private C8242a() {
            super(C8241q1.f20846e);
        }
    }

    static {
        f20846e.makeImmutable();
    }

    private C8241q1() {
    }

    public static C8242a newBuilder() {
        return (C8242a) f20846e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8241q1();
            case 2:
                return f20846e;
            case 3:
                return null;
            case 4:
                return new C8242a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8241q1 q1Var = (C8241q1) obj2;
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
                if (f20847f == null) {
                    synchronized (C8241q1.class) {
                        if (f20847f == null) {
                            f20847f = new DefaultInstanceBasedParser(f20846e);
                        }
                    }
                }
                return f20847f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20846e;
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
