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

/* renamed from: co.znly.models.v0 */
public final class C7488v0 extends GeneratedMessageLite<C7488v0, C7489a> implements MetricProto$QuantileOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7488v0 f18807g = new C7488v0();

    /* renamed from: h */
    private static volatile Parser<C7488v0> f18808h;

    /* renamed from: e */
    private double f18809e;

    /* renamed from: f */
    private double f18810f;

    /* renamed from: co.znly.models.v0$a */
    public static final class C7489a extends Builder<C7488v0, C7489a> implements MetricProto$QuantileOrBuilder {
        /* synthetic */ C7489a(C7372k0 k0Var) {
            this();
        }

        public double getQuantile() {
            return ((C7488v0) this.instance).getQuantile();
        }

        public double getValue() {
            return ((C7488v0) this.instance).getValue();
        }

        private C7489a() {
            super(C7488v0.f18807g);
        }
    }

    static {
        f18807g.makeImmutable();
    }

    private C7488v0() {
    }

    public static Parser<C7488v0> parser() {
        return f18807g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7488v0();
            case 2:
                return f18807g;
            case 3:
                return null;
            case 4:
                return new C7489a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7488v0 v0Var = (C7488v0) obj2;
                this.f18809e = visitor.visitDouble(this.f18809e != 0.0d, this.f18809e, v0Var.f18809e != 0.0d, v0Var.f18809e);
                this.f18810f = visitor.visitDouble(this.f18810f != 0.0d, this.f18810f, v0Var.f18810f != 0.0d, v0Var.f18810f);
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
                                this.f18809e = codedInputStream.readDouble();
                            } else if (readTag == 17) {
                                this.f18810f = codedInputStream.readDouble();
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
                if (f18808h == null) {
                    synchronized (C7488v0.class) {
                        if (f18808h == null) {
                            f18808h = new DefaultInstanceBasedParser(f18807g);
                        }
                    }
                }
                return f18808h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18807g;
    }

    public double getQuantile() {
        return this.f18809e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f18809e;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        double d2 = this.f18810f;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public double getValue() {
        return this.f18810f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f18809e;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
        double d2 = this.f18810f;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(2, d2);
        }
    }
}
