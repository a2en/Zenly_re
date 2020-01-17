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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.core.f2 */
public final class C7097f2 extends GeneratedMessageLite<C7097f2, C7098a> implements TypesProto$HeadingOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7097f2 f17546i = new C7097f2();

    /* renamed from: j */
    private static volatile Parser<C7097f2> f17547j;

    /* renamed from: e */
    private Timestamp f17548e;

    /* renamed from: f */
    private double f17549f;

    /* renamed from: g */
    private double f17550g;

    /* renamed from: h */
    private double f17551h;

    /* renamed from: co.znly.models.core.f2$a */
    public static final class C7098a extends Builder<C7097f2, C7098a> implements TypesProto$HeadingOrBuilder {
        /* synthetic */ C7098a(C7253x1 x1Var) {
            this();
        }

        public double getAccuracy() {
            return ((C7097f2) this.instance).getAccuracy();
        }

        public Timestamp getCreatedAt() {
            return ((C7097f2) this.instance).getCreatedAt();
        }

        public double getHeading() {
            return ((C7097f2) this.instance).getHeading();
        }

        public double getMagneticHeading() {
            return ((C7097f2) this.instance).getMagneticHeading();
        }

        public boolean hasCreatedAt() {
            return ((C7097f2) this.instance).hasCreatedAt();
        }

        private C7098a() {
            super(C7097f2.f17546i);
        }
    }

    static {
        f17546i.makeImmutable();
    }

    private C7097f2() {
    }

    public static C7098a newBuilder() {
        return (C7098a) f17546i.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7097f2();
            case 2:
                return f17546i;
            case 3:
                return null;
            case 4:
                return new C7098a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7097f2 f2Var = (C7097f2) obj2;
                this.f17548e = (Timestamp) visitor.visitMessage(this.f17548e, f2Var.f17548e);
                this.f17549f = visitor.visitDouble(this.f17549f != 0.0d, this.f17549f, f2Var.f17549f != 0.0d, f2Var.f17549f);
                this.f17550g = visitor.visitDouble(this.f17550g != 0.0d, this.f17550g, f2Var.f17550g != 0.0d, f2Var.f17550g);
                this.f17551h = visitor.visitDouble(this.f17551h != 0.0d, this.f17551h, f2Var.f17551h != 0.0d, f2Var.f17551h);
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
                                Builder builder = this.f17548e != null ? (Timestamp.Builder) this.f17548e.toBuilder() : null;
                                this.f17548e = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17548e);
                                    this.f17548e = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 17) {
                                this.f17549f = codedInputStream.readDouble();
                            } else if (readTag == 25) {
                                this.f17550g = codedInputStream.readDouble();
                            } else if (readTag == 33) {
                                this.f17551h = codedInputStream.readDouble();
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
                if (f17547j == null) {
                    synchronized (C7097f2.class) {
                        if (f17547j == null) {
                            f17547j = new DefaultInstanceBasedParser(f17546i);
                        }
                    }
                }
                return f17547j;
            default:
                throw new UnsupportedOperationException();
        }
        return f17546i;
    }

    public double getAccuracy() {
        return this.f17551h;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f17548e;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public double getHeading() {
        return this.f17549f;
    }

    public double getMagneticHeading() {
        return this.f17550g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17548e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getCreatedAt());
        }
        double d = this.f17549f;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d);
        }
        double d2 = this.f17550g;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d2);
        }
        double d3 = this.f17551h;
        if (d3 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(4, d3);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasCreatedAt() {
        return this.f17548e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17548e != null) {
            codedOutputStream.writeMessage(1, getCreatedAt());
        }
        double d = this.f17549f;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
        double d2 = this.f17550g;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(3, d2);
        }
        double d3 = this.f17551h;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(4, d3);
        }
    }
}
