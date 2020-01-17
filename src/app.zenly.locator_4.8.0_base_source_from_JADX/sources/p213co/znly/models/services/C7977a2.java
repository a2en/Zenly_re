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

/* renamed from: co.znly.models.services.a2 */
public final class C7977a2 extends GeneratedMessageLite<C7977a2, C7978a> implements ZenlyProto$DescendantWorldRankRequestOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7977a2 f20254f = new C7977a2();

    /* renamed from: g */
    private static volatile Parser<C7977a2> f20255g;

    /* renamed from: e */
    private int f20256e;

    /* renamed from: co.znly.models.services.a2$a */
    public static final class C7978a extends Builder<C7977a2, C7978a> implements ZenlyProto$DescendantWorldRankRequestOrBuilder {
        private C7978a() {
            super(C7977a2.f20254f);
        }

        /* synthetic */ C7978a(C8104i0 i0Var) {
            this();
        }

        /* renamed from: a */
        public C7978a mo22053a(int i) {
            copyOnWrite();
            ((C7977a2) this.instance).m19044a(i);
            return this;
        }

        public int getNumberOfDescendant() {
            return ((C7977a2) this.instance).getNumberOfDescendant();
        }
    }

    static {
        f20254f.makeImmutable();
    }

    private C7977a2() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19044a(int i) {
        this.f20256e = i;
    }

    public static C7978a newBuilder() {
        return (C7978a) f20254f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7977a2();
            case 2:
                return f20254f;
            case 3:
                return null;
            case 4:
                return new C7978a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7977a2 a2Var = (C7977a2) obj2;
                boolean z2 = this.f20256e != 0;
                int i = this.f20256e;
                if (a2Var.f20256e != 0) {
                    z = true;
                }
                this.f20256e = visitor.visitInt(z2, i, z, a2Var.f20256e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f20256e = codedInputStream.readInt32();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z = true;
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
                if (f20255g == null) {
                    synchronized (C7977a2.class) {
                        if (f20255g == null) {
                            f20255g = new DefaultInstanceBasedParser(f20254f);
                        }
                    }
                }
                return f20255g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20254f;
    }

    public int getNumberOfDescendant() {
        return this.f20256e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f20256e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f20256e;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
    }
}
