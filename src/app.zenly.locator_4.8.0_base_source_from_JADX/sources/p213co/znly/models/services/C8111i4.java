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

/* renamed from: co.znly.models.services.i4 */
public final class C8111i4 extends GeneratedMessageLite<C8111i4, C8112a> implements ZenlyProto$RecoSendRecommendationResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C8111i4 f20558g = new C8111i4();

    /* renamed from: h */
    private static volatile Parser<C8111i4> f20559h;

    /* renamed from: e */
    private boolean f20560e;

    /* renamed from: f */
    private boolean f20561f;

    /* renamed from: co.znly.models.services.i4$a */
    public static final class C8112a extends Builder<C8111i4, C8112a> implements ZenlyProto$RecoSendRecommendationResponseOrBuilder {
        private C8112a() {
            super(C8111i4.f20558g);
        }

        /* synthetic */ C8112a(C8104i0 i0Var) {
            this();
        }

        public boolean getSentToNewcomer() {
            return ((C8111i4) this.instance).getSentToNewcomer();
        }

        public boolean getSentToPotentialMatch() {
            return ((C8111i4) this.instance).getSentToPotentialMatch();
        }
    }

    static {
        f20558g.makeImmutable();
    }

    private C8111i4() {
    }

    public static C8112a newBuilder() {
        return (C8112a) f20558g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C8104i0.f20545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C8111i4();
            case 2:
                return f20558g;
            case 3:
                return null;
            case 4:
                return new C8112a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C8111i4 i4Var = (C8111i4) obj2;
                boolean z = this.f20560e;
                boolean z2 = i4Var.f20560e;
                this.f20560e = visitor.visitBoolean(z, z, z2, z2);
                boolean z3 = this.f20561f;
                boolean z4 = i4Var.f20561f;
                this.f20561f = visitor.visitBoolean(z3, z3, z4, z4);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z5 = false;
                while (!z5) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f20560e = codedInputStream.readBool();
                            } else if (readTag == 16) {
                                this.f20561f = codedInputStream.readBool();
                            } else if (!codedInputStream.skipField(readTag)) {
                            }
                        }
                        z5 = true;
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
                if (f20559h == null) {
                    synchronized (C8111i4.class) {
                        if (f20559h == null) {
                            f20559h = new DefaultInstanceBasedParser(f20558g);
                        }
                    }
                }
                return f20559h;
            default:
                throw new UnsupportedOperationException();
        }
        return f20558g;
    }

    public boolean getSentToNewcomer() {
        return this.f20560e;
    }

    public boolean getSentToPotentialMatch() {
        return this.f20561f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f20560e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        boolean z2 = this.f20561f;
        if (z2) {
            i2 += CodedOutputStream.computeBoolSize(2, z2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f20560e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
        boolean z2 = this.f20561f;
        if (z2) {
            codedOutputStream.writeBool(2, z2);
        }
    }
}
