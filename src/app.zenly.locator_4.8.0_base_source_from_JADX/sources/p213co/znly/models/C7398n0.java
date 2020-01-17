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

/* renamed from: co.znly.models.n0 */
public final class C7398n0 extends GeneratedMessageLite<C7398n0, C7399a> implements MetricProto$GaugeOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7398n0 f18456f = new C7398n0();

    /* renamed from: g */
    private static volatile Parser<C7398n0> f18457g;

    /* renamed from: e */
    private double f18458e;

    /* renamed from: co.znly.models.n0$a */
    public static final class C7399a extends Builder<C7398n0, C7399a> implements MetricProto$GaugeOrBuilder {
        /* synthetic */ C7399a(C7372k0 k0Var) {
            this();
        }

        public double getValue() {
            return ((C7398n0) this.instance).getValue();
        }

        private C7399a() {
            super(C7398n0.f18456f);
        }
    }

    static {
        f18456f.makeImmutable();
    }

    private C7398n0() {
    }

    public static C7398n0 getDefaultInstance() {
        return f18456f;
    }

    public static Parser<C7398n0> parser() {
        return f18456f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7398n0();
            case 2:
                return f18456f;
            case 3:
                return null;
            case 4:
                return new C7399a(null);
            case 5:
                C7398n0 n0Var = (C7398n0) obj2;
                this.f18458e = ((Visitor) obj).visitDouble(this.f18458e != 0.0d, this.f18458e, n0Var.f18458e != 0.0d, n0Var.f18458e);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 9) {
                                this.f18458e = codedInputStream.readDouble();
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
                if (f18457g == null) {
                    synchronized (C7398n0.class) {
                        if (f18457g == null) {
                            f18457g = new DefaultInstanceBasedParser(f18456f);
                        }
                    }
                }
                return f18457g;
            default:
                throw new UnsupportedOperationException();
        }
        return f18456f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f18458e;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public double getValue() {
        return this.f18458e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f18458e;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
    }
}
