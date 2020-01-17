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

/* renamed from: co.znly.models.x0 */
public final class C7504x0 extends GeneratedMessageLite<C7504x0, C7505a> implements MetricProto$UntypedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7504x0 f18860f = new C7504x0();

    /* renamed from: g */
    private static volatile Parser<C7504x0> f18861g;

    /* renamed from: e */
    private double f18862e;

    /* renamed from: co.znly.models.x0$a */
    public static final class C7505a extends Builder<C7504x0, C7505a> implements MetricProto$UntypedOrBuilder {
        /* synthetic */ C7505a(C7372k0 k0Var) {
            this();
        }

        public double getValue() {
            return ((C7504x0) this.instance).getValue();
        }

        private C7505a() {
            super(C7504x0.f18860f);
        }
    }

    static {
        f18860f.makeImmutable();
    }

    private C7504x0() {
    }

    public static C7504x0 getDefaultInstance() {
        return f18860f;
    }

    public static Parser<C7504x0> parser() {
        return f18860f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7504x0();
            case 2:
                return f18860f;
            case 3:
                return null;
            case 4:
                return new C7505a(null);
            case 5:
                C7504x0 x0Var = (C7504x0) obj2;
                this.f18862e = ((Visitor) obj).visitDouble(this.f18862e != 0.0d, this.f18862e, x0Var.f18862e != 0.0d, x0Var.f18862e);
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
                                this.f18862e = codedInputStream.readDouble();
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
                if (f18861g == null) {
                    synchronized (C7504x0.class) {
                        if (f18861g == null) {
                            f18861g = new DefaultInstanceBasedParser(f18860f);
                        }
                    }
                }
                return f18861g;
            default:
                throw new UnsupportedOperationException();
        }
        return f18860f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f18862e;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public double getValue() {
        return this.f18862e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f18862e;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
    }
}
