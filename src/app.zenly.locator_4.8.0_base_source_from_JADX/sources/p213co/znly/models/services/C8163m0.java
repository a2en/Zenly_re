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

/* renamed from: co.znly.models.services.m0 */
public final class C8163m0 extends GeneratedMessageLite<C8163m0, C8164a> implements ZenlyProto$BestFriendsHideResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8163m0 f20670e = new C8163m0();

    /* renamed from: f */
    private static volatile Parser<C8163m0> f20671f;

    /* renamed from: co.znly.models.services.m0$a */
    public static final class C8164a extends Builder<C8163m0, C8164a> implements ZenlyProto$BestFriendsHideResponseOrBuilder {
        private C8164a() {
            super(C8163m0.f20670e);
        }

        /* synthetic */ C8164a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f20670e.makeImmutable();
    }

    private C8163m0() {
    }

    public static C8164a newBuilder() {
        return (C8164a) f20670e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8163m0();
            case 2:
                return f20670e;
            case 3:
                return null;
            case 4:
                return new C8164a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8163m0 m0Var = (C8163m0) obj2;
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
                if (f20671f == null) {
                    synchronized (C8163m0.class) {
                        if (f20671f == null) {
                            f20671f = new DefaultInstanceBasedParser(f20670e);
                        }
                    }
                }
                return f20671f;
            default:
                throw new UnsupportedOperationException();
        }
        return f20670e;
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
