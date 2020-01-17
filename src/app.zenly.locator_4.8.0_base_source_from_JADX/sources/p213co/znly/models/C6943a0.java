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
import p213co.znly.models.C6950b0.C6951a;

/* renamed from: co.znly.models.a0 */
public final class C6943a0 extends GeneratedMessageLite<C6943a0, C6944a> implements GeometryProto$GeoCircleOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C6943a0 f17108g = new C6943a0();

    /* renamed from: h */
    private static volatile Parser<C6943a0> f17109h;

    /* renamed from: e */
    private C6950b0 f17110e;

    /* renamed from: f */
    private double f17111f;

    /* renamed from: co.znly.models.a0$a */
    public static final class C6944a extends Builder<C6943a0, C6944a> implements GeometryProto$GeoCircleOrBuilder {
        /* synthetic */ C6944a(C7514z zVar) {
            this();
        }

        public C6950b0 getCenter() {
            return ((C6943a0) this.instance).getCenter();
        }

        public double getRadius() {
            return ((C6943a0) this.instance).getRadius();
        }

        public boolean hasCenter() {
            return ((C6943a0) this.instance).hasCenter();
        }

        private C6944a() {
            super(C6943a0.f17108g);
        }
    }

    static {
        f17108g.makeImmutable();
    }

    private C6943a0() {
    }

    public static C6943a0 getDefaultInstance() {
        return f17108g;
    }

    public static Parser<C6943a0> parser() {
        return f17108g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7514z.f18877a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6943a0();
            case 2:
                return f17108g;
            case 3:
                return null;
            case 4:
                return new C6944a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C6943a0 a0Var = (C6943a0) obj2;
                this.f17110e = (C6950b0) visitor.visitMessage(this.f17110e, a0Var.f17110e);
                this.f17111f = visitor.visitDouble(this.f17111f != 0.0d, this.f17111f, a0Var.f17111f != 0.0d, a0Var.f17111f);
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
                                Builder builder = this.f17110e != null ? (C6951a) this.f17110e.toBuilder() : null;
                                this.f17110e = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17110e);
                                    this.f17110e = (C6950b0) builder.buildPartial();
                                }
                            } else if (readTag == 17) {
                                this.f17111f = codedInputStream.readDouble();
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
                if (f17109h == null) {
                    synchronized (C6943a0.class) {
                        if (f17109h == null) {
                            f17109h = new DefaultInstanceBasedParser(f17108g);
                        }
                    }
                }
                return f17109h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17108g;
    }

    public C6950b0 getCenter() {
        C6950b0 b0Var = this.f17110e;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public double getRadius() {
        return this.f17111f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17110e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getCenter());
        }
        double d = this.f17111f;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasCenter() {
        return this.f17110e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17110e != null) {
            codedOutputStream.writeMessage(1, getCenter());
        }
        double d = this.f17111f;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
    }
}
