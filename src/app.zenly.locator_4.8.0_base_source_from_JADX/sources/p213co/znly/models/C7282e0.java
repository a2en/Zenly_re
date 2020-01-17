package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.e0 */
public final class C7282e0 extends GeneratedMessageLite<C7282e0, C7283a> implements GeometryProto$PointOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7282e0 f18079g = new C7282e0();

    /* renamed from: h */
    private static volatile Parser<C7282e0> f18080h;

    /* renamed from: e */
    private int f18081e;

    /* renamed from: f */
    private int f18082f;

    /* renamed from: co.znly.models.e0$a */
    public static final class C7283a extends Builder<C7282e0, C7283a> implements GeometryProto$PointOrBuilder {
        /* synthetic */ C7283a(C7514z zVar) {
            this();
        }

        public int getX() {
            return ((C7282e0) this.instance).getX();
        }

        public int getY() {
            return ((C7282e0) this.instance).getY();
        }

        private C7283a() {
            super(C7282e0.f18079g);
        }
    }

    static {
        f18079g.makeImmutable();
    }

    private C7282e0() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7514z.f18877a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7282e0();
            case 2:
                return f18079g;
            case 3:
                return null;
            case 4:
                return new C7283a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7282e0 e0Var = (C7282e0) obj2;
                this.f18081e = visitor.visitInt(this.f18081e != 0, this.f18081e, e0Var.f18081e != 0, e0Var.f18081e);
                boolean z2 = this.f18082f != 0;
                int i = this.f18082f;
                if (e0Var.f18082f != 0) {
                    z = true;
                }
                this.f18082f = visitor.visitInt(z2, i, z, e0Var.f18082f);
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
                                this.f18081e = codedInputStream.readInt32();
                            } else if (readTag == 16) {
                                this.f18082f = codedInputStream.readInt32();
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
                if (f18080h == null) {
                    synchronized (C7282e0.class) {
                        if (f18080h == null) {
                            f18080h = new DefaultInstanceBasedParser(f18079g);
                        }
                    }
                }
                return f18080h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18079g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        int i3 = this.f18081e;
        if (i3 != 0) {
            i2 = 0 + CodedOutputStream.computeInt32Size(1, i3);
        }
        int i4 = this.f18082f;
        if (i4 != 0) {
            i2 += CodedOutputStream.computeInt32Size(2, i4);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getX() {
        return this.f18081e;
    }

    public int getY() {
        return this.f18082f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        int i = this.f18081e;
        if (i != 0) {
            codedOutputStream.writeInt32(1, i);
        }
        int i2 = this.f18082f;
        if (i2 != 0) {
            codedOutputStream.writeInt32(2, i2);
        }
    }
}
