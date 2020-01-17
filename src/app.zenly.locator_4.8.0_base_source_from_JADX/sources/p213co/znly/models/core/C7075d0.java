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

/* renamed from: co.znly.models.core.d0 */
public final class C7075d0 extends GeneratedMessageLite<C7075d0, C7076a> implements C6985x9aaf4067 {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7075d0 f17502f = new C7075d0();

    /* renamed from: g */
    private static volatile Parser<C7075d0> f17503g;

    /* renamed from: e */
    private boolean f17504e;

    /* renamed from: co.znly.models.core.d0$a */
    public static final class C7076a extends Builder<C7075d0, C7076a> implements C6985x9aaf4067 {
        /* synthetic */ C7076a(C7067c0 c0Var) {
            this();
        }

        public boolean getNotEligible() {
            return ((C7075d0) this.instance).getNotEligible();
        }

        private C7076a() {
            super(C7075d0.f17502f);
        }
    }

    static {
        f17502f.makeImmutable();
    }

    private C7075d0() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7067c0.f17477a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7075d0();
            case 2:
                return f17502f;
            case 3:
                return null;
            case 4:
                return new C7076a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7075d0 d0Var = (C7075d0) obj2;
                boolean z = this.f17504e;
                boolean z2 = d0Var.f17504e;
                this.f17504e = visitor.visitBoolean(z, z, z2, z2);
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
                                this.f17504e = codedInputStream.readBool();
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
                if (f17503g == null) {
                    synchronized (C7075d0.class) {
                        if (f17503g == null) {
                            f17503g = new DefaultInstanceBasedParser(f17502f);
                        }
                    }
                }
                return f17503g;
            default:
                throw new UnsupportedOperationException();
        }
        return f17502f;
    }

    public boolean getNotEligible() {
        return this.f17504e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        boolean z = this.f17504e;
        if (z) {
            i2 = 0 + CodedOutputStream.computeBoolSize(1, z);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        boolean z = this.f17504e;
        if (z) {
            codedOutputStream.writeBool(1, z);
        }
    }
}
