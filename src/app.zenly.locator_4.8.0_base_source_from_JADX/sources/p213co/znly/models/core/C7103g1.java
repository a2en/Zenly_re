package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.core.g1 */
public final class C7103g1 extends GeneratedMessageLite<C7103g1, C7104a> implements GeofenceProto$GeofenceOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7103g1 f17559i = new C7103g1();

    /* renamed from: j */
    private static volatile Parser<C7103g1> f17560j;

    /* renamed from: e */
    private String f17561e = "";

    /* renamed from: f */
    private double f17562f;

    /* renamed from: g */
    private double f17563g;

    /* renamed from: h */
    private double f17564h;

    /* renamed from: co.znly.models.core.g1$a */
    public static final class C7104a extends Builder<C7103g1, C7104a> implements GeofenceProto$GeofenceOrBuilder {
        /* synthetic */ C7104a(C7096f1 f1Var) {
            this();
        }

        public double getLatitude() {
            return ((C7103g1) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((C7103g1) this.instance).getLongitude();
        }

        public double getRadius() {
            return ((C7103g1) this.instance).getRadius();
        }

        public String getUuid() {
            return ((C7103g1) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7103g1) this.instance).getUuidBytes();
        }

        private C7104a() {
            super(C7103g1.f17559i);
        }
    }

    static {
        f17559i.makeImmutable();
    }

    private C7103g1() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7096f1.f17545a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7103g1();
            case 2:
                return f17559i;
            case 3:
                return null;
            case 4:
                return new C7104a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7103g1 g1Var = (C7103g1) obj2;
                this.f17561e = visitor.visitString(!this.f17561e.isEmpty(), this.f17561e, !g1Var.f17561e.isEmpty(), g1Var.f17561e);
                this.f17562f = visitor.visitDouble(this.f17562f != 0.0d, this.f17562f, g1Var.f17562f != 0.0d, g1Var.f17562f);
                this.f17563g = visitor.visitDouble(this.f17563g != 0.0d, this.f17563g, g1Var.f17563g != 0.0d, g1Var.f17563g);
                this.f17564h = visitor.visitDouble(this.f17564h != 0.0d, this.f17564h, g1Var.f17564h != 0.0d, g1Var.f17564h);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                this.f17561e = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 17) {
                                this.f17562f = codedInputStream.readDouble();
                            } else if (readTag == 25) {
                                this.f17563g = codedInputStream.readDouble();
                            } else if (readTag == 33) {
                                this.f17564h = codedInputStream.readDouble();
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
                if (f17560j == null) {
                    synchronized (C7103g1.class) {
                        if (f17560j == null) {
                            f17560j = new DefaultInstanceBasedParser(f17559i);
                        }
                    }
                }
                return f17560j;
            default:
                throw new UnsupportedOperationException();
        }
        return f17559i;
    }

    public double getLatitude() {
        return this.f17562f;
    }

    public double getLongitude() {
        return this.f17563g;
    }

    public double getRadius() {
        return this.f17564h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f17561e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        double d = this.f17562f;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d);
        }
        double d2 = this.f17563g;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d2);
        }
        double d3 = this.f17564h;
        if (d3 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(4, d3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUuid() {
        return this.f17561e;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f17561e);
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f17561e.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        double d = this.f17562f;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
        double d2 = this.f17563g;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(3, d2);
        }
        double d3 = this.f17564h;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(4, d3);
        }
    }
}
