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

/* renamed from: co.znly.models.services.q2 */
public final class C8243q2 extends GeneratedMessageLite<C8243q2, C8244a> implements ZenlyProto$FootstepsWebSetRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C8243q2 f20848f = new C8243q2();

    /* renamed from: g */
    private static volatile Parser<C8243q2> f20849g;

    /* renamed from: e */
    private boolean f20850e;

    /* renamed from: co.znly.models.services.q2$a */
    public static final class C8244a extends Builder<C8243q2, C8244a> implements ZenlyProto$FootstepsWebSetRequestOrBuilder {
        /* synthetic */ C8244a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C8244a mo22223a(boolean z) {
            copyOnWrite();
            ((C8243q2) this.instance).m19312a(z);
            return this;
        }

        public boolean getShareEnabled() {
            return ((C8243q2) this.instance).getShareEnabled();
        }

        private C8244a() {
            super(C8243q2.f20848f);
        }
    }

    static {
        f20848f.makeImmutable();
    }

    private C8243q2() {
    }

    public static C8244a newBuilder() {
        return (C8244a) f20848f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8243q2();
            case 2:
                return f20848f;
            case 3:
                return null;
            case 4:
                return new C8244a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8243q2 q2Var = (C8243q2) obj2;
                boolean z = this.f20850e;
                boolean z2 = q2Var.f20850e;
                this.f20850e = visitor.visitBoolean(z, z, z2, z2);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z3 = false;
                while (!z3) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f20850e = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z3 = true;
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
                if (f20849g == null) {
                    synchronized (C8243q2.class) {
                        if (f20849g == null) {
                            f20849g = new DefaultInstanceBasedParser(f20848f);
                        }
                    }
                }
                return f20849g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20848f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f20850e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean getShareEnabled() {
        return this.f20850e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f20850e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19312a(boolean z) {
        this.f20850e = z;
    }
}
