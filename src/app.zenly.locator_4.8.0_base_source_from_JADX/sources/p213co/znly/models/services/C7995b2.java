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

/* renamed from: co.znly.models.services.b2 */
public final class C7995b2 extends GeneratedMessageLite<C7995b2, C7996a> implements ZenlyProto$DescendantWorldRankResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7995b2 f20292f = new C7995b2();

    /* renamed from: g */
    private static volatile Parser<C7995b2> f20293g;

    /* renamed from: e */
    private int f20294e;

    /* renamed from: co.znly.models.services.b2$a */
    public static final class C7996a extends Builder<C7995b2, C7996a> implements ZenlyProto$DescendantWorldRankResponseOrBuilder {
        private C7996a() {
            super(C7995b2.f20292f);
        }

        /* synthetic */ C7996a(C8104i0 i0Var) {
            this();
        }

        public int getRank() {
            return ((C7995b2) this.instance).getRank();
        }
    }

    static {
        f20292f.makeImmutable();
    }

    private C7995b2() {
    }

    public static C7996a newBuilder() {
        return (C7996a) f20292f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7995b2();
            case 2:
                return f20292f;
            case 3:
                return null;
            case 4:
                return new C7996a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7995b2 b2Var = (C7995b2) obj2;
                boolean z2 = this.f20294e != 0;
                int i = this.f20294e;
                if (b2Var.f20294e != 0) {
                    z = true;
                }
                this.f20294e = visitor.visitInt(z2, i, z, b2Var.f20294e);
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
                                this.f20294e = codedInputStream.readInt32();
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
                if (f20293g == null) {
                    synchronized (C7995b2.class) {
                        if (f20293g == null) {
                            f20293g = new DefaultInstanceBasedParser(f20292f);
                        }
                    }
                }
                return f20293g;
            default:
                throw new UnsupportedOperationException();
        }
        return f20292f;
    }

    public int getRank() {
        return this.f20294e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f20294e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f20294e;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
    }
}
