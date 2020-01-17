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

/* renamed from: co.znly.models.m0 */
public final class C7389m0 extends GeneratedMessageLite<C7389m0, C7390a> implements MetricProto$CounterOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7389m0 f18426f = new C7389m0();

    /* renamed from: g */
    private static volatile Parser<C7389m0> f18427g;

    /* renamed from: e */
    private double f18428e;

    /* renamed from: co.znly.models.m0$a */
    public static final class C7390a extends Builder<C7389m0, C7390a> implements MetricProto$CounterOrBuilder {
        /* synthetic */ C7390a(C7372k0 k0Var) {
            this();
        }

        public double getValue() {
            return ((C7389m0) this.instance).getValue();
        }

        private C7390a() {
            super(C7389m0.f18426f);
        }
    }

    static {
        f18426f.makeImmutable();
    }

    private C7389m0() {
    }

    public static C7389m0 getDefaultInstance() {
        return f18426f;
    }

    public static Parser<C7389m0> parser() {
        return f18426f.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7389m0();
            case 2:
                return f18426f;
            case 3:
                return null;
            case 4:
                return new C7390a(null);
            case 5:
                C7389m0 m0Var = (C7389m0) obj2;
                this.f18428e = ((Visitor) obj).visitDouble(this.f18428e != 0.0d, this.f18428e, m0Var.f18428e != 0.0d, m0Var.f18428e);
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
                                this.f18428e = codedInputStream.readDouble();
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
                if (f18427g == null) {
                    synchronized (C7389m0.class) {
                        if (f18427g == null) {
                            f18427g = new DefaultInstanceBasedParser(f18426f);
                        }
                    }
                }
                return f18427g;
            default:
                throw new UnsupportedOperationException();
        }
        return f18426f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f18428e;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public double getValue() {
        return this.f18428e;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f18428e;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
    }
}
