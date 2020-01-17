package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.n0 */
public final class C7170n0 extends GeneratedMessageLite<C7170n0, C7171a> implements CoreUserMonitorProto$UserMonitoringExistResponseOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7170n0 f17757f = new C7170n0();

    /* renamed from: g */
    private static volatile Parser<C7170n0> f17758g;

    /* renamed from: e */
    private boolean f17759e;

    /* renamed from: co.znly.models.core.n0$a */
    public static final class C7171a extends Builder<C7170n0, C7171a> implements CoreUserMonitorProto$UserMonitoringExistResponseOrBuilder {
        /* synthetic */ C7171a(C7158m0 m0Var) {
            this();
        }

        public boolean getIsExist() {
            return ((C7170n0) this.instance).getIsExist();
        }

        private C7171a() {
            super(C7170n0.f17757f);
        }
    }

    static {
        f17757f.makeImmutable();
    }

    private C7170n0() {
    }

    public static C7171a newBuilder() {
        return (C7171a) f17757f.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7158m0.f17731a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7170n0();
            case 2:
                return f17757f;
            case 3:
                return null;
            case 4:
                return new C7171a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7170n0 n0Var = (C7170n0) obj2;
                boolean z = this.f17759e;
                boolean z2 = n0Var.f17759e;
                this.f17759e = visitor.visitBoolean(z, z, z2, z2);
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
                                this.f17759e = codedInputStream.readBool();
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
                if (f17758g == null) {
                    synchronized (C7170n0.class) {
                        if (f17758g == null) {
                            f17758g = new DefaultInstanceBasedParser(f17757f);
                        }
                    }
                }
                return f17758g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17757f;
    }

    public boolean getIsExist() {
        return this.f17759e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f17759e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f17759e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
    }
}
