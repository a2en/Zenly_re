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

/* renamed from: co.znly.models.b0 */
public final class C6950b0 extends GeneratedMessageLite<C6950b0, C6951a> implements GeometryProto$GeoPointOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final C6950b0 f17122h = new C6950b0();

    /* renamed from: i */
    private static volatile Parser<C6950b0> f17123i;

    /* renamed from: e */
    private double f17124e;

    /* renamed from: f */
    private double f17125f;

    /* renamed from: g */
    private double f17126g;

    /* renamed from: co.znly.models.b0$a */
    public static final class C6951a extends Builder<C6950b0, C6951a> implements GeometryProto$GeoPointOrBuilder {
        /* synthetic */ C6951a(C7514z zVar) {
            this();
        }

        public double getAltitude() {
            return ((C6950b0) this.instance).getAltitude();
        }

        public double getLatitude() {
            return ((C6950b0) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((C6950b0) this.instance).getLongitude();
        }

        public C6951a setLatitude(double d) {
            copyOnWrite();
            ((C6950b0) this.instance).setLatitude(d);
            return this;
        }

        public C6951a setLongitude(double d) {
            copyOnWrite();
            ((C6950b0) this.instance).setLongitude(d);
            return this;
        }

        private C6951a() {
            super(C6950b0.f17122h);
        }
    }

    static {
        f17122h.makeImmutable();
    }

    private C6950b0() {
    }

    public static C6950b0 getDefaultInstance() {
        return f17122h;
    }

    public static C6951a newBuilder() {
        return (C6951a) f17122h.toBuilder();
    }

    public static Parser<C6950b0> parser() {
        return f17122h.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setLatitude(double d) {
        this.f17124e = d;
    }

    /* access modifiers changed from: private */
    public void setLongitude(double d) {
        this.f17125f = d;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7514z.f18877a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6950b0();
            case 2:
                return f17122h;
            case 3:
                return null;
            case 4:
                return new C6951a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C6950b0 b0Var = (C6950b0) obj2;
                this.f17124e = visitor.visitDouble(this.f17124e != 0.0d, this.f17124e, b0Var.f17124e != 0.0d, b0Var.f17124e);
                this.f17125f = visitor.visitDouble(this.f17125f != 0.0d, this.f17125f, b0Var.f17125f != 0.0d, b0Var.f17125f);
                this.f17126g = visitor.visitDouble(this.f17126g != 0.0d, this.f17126g, b0Var.f17126g != 0.0d, b0Var.f17126g);
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
                                this.f17124e = codedInputStream.readDouble();
                            } else if (readTag == 17) {
                                this.f17125f = codedInputStream.readDouble();
                            } else if (readTag == 25) {
                                this.f17126g = codedInputStream.readDouble();
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
                if (f17123i == null) {
                    synchronized (C6950b0.class) {
                        if (f17123i == null) {
                            f17123i = new DefaultInstanceBasedParser(f17122h);
                        }
                    }
                }
                return f17123i;
            default:
                throw new UnsupportedOperationException();
        }
        return f17122h;
    }

    public double getAltitude() {
        return this.f17126g;
    }

    public double getLatitude() {
        return this.f17124e;
    }

    public double getLongitude() {
        return this.f17125f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f17124e;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        double d2 = this.f17125f;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d2);
        }
        double d3 = this.f17126g;
        if (d3 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f17124e;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
        double d2 = this.f17125f;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(2, d2);
        }
        double d3 = this.f17126g;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(3, d3);
        }
    }
}
