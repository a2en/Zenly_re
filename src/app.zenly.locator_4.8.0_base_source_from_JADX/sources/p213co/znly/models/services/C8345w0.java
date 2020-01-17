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

/* renamed from: co.znly.models.services.w0 */
public final class C8345w0 extends GeneratedMessageLite<C8345w0, C8346a> implements ZenlyProto$ChatConversationMuteResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C8345w0 f21132e = new C8345w0();

    /* renamed from: f */
    private static volatile Parser<C8345w0> f21133f;

    /* renamed from: co.znly.models.services.w0$a */
    public static final class C8346a extends Builder<C8345w0, C8346a> implements ZenlyProto$ChatConversationMuteResponseOrBuilder {
        private C8346a() {
            super(C8345w0.f21132e);
        }

        /* synthetic */ C8346a(C8104i0 i0Var) {
            this();
        }
    }

    static {
        f21132e.makeImmutable();
    }

    private C8345w0() {
    }

    public static C8346a newBuilder() {
        return (C8346a) f21132e.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8345w0();
            case 2:
                return f21132e;
            case 3:
                return null;
            case 4:
                return new C8346a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8345w0 w0Var = (C8345w0) obj2;
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
                if (f21133f == null) {
                    synchronized (C8345w0.class) {
                        if (f21133f == null) {
                            f21133f = new DefaultInstanceBasedParser(f21132e);
                        }
                    }
                }
                return f21133f;
            default:
                throw new UnsupportedOperationException();
        }
        return f21132e;
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
