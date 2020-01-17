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

/* renamed from: co.znly.models.services.o0 */
public final class C8202o0 extends GeneratedMessageLite<C8202o0, C8203a> implements ZenlyProto$BlockedUsersRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8202o0 f20763e = new C8202o0();

    /* renamed from: f */
    private static volatile Parser<C8202o0> f20764f;

    /* renamed from: co.znly.models.services.o0$a */
    public static final class C8203a extends Builder<C8202o0, C8203a> implements ZenlyProto$BlockedUsersRequestOrBuilder {
        /* synthetic */ C8203a(C8104i0 i0Var) {
            this();
        }

        private C8203a() {
            super(C8202o0.f20763e);
        }
    }

    static {
        f20763e.makeImmutable();
    }

    private C8202o0() {
    }

    public static C8202o0 getDefaultInstance() {
        return f20763e;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8202o0();
            case 2:
                return f20763e;
            case 3:
                return null;
            case 4:
                return new C8203a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8202o0 o0Var = (C8202o0) obj2;
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
                if (f20764f == null) {
                    synchronized (C8202o0.class) {
                        if (f20764f == null) {
                            f20764f = new DefaultInstanceBasedParser(f20763e);
                        }
                    }
                }
                return f20764f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20763e;
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
