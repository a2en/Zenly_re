package p213co.znly.models.core;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.models.C6975c0;
import p213co.znly.models.C6975c0.C6976a;

/* renamed from: co.znly.models.core.c1 */
public final class C7068c1 extends GeneratedMessageLite<C7068c1, C7069a> implements GeoProto$RouteInfoOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7068c1 f17478i = new C7068c1();

    /* renamed from: j */
    private static volatile Parser<C7068c1> f17479j;

    /* renamed from: e */
    private long f17480e;

    /* renamed from: f */
    private Duration f17481f;

    /* renamed from: g */
    private C6975c0 f17482g;

    /* renamed from: h */
    private C6975c0 f17483h;

    /* renamed from: co.znly.models.core.c1$a */
    public static final class C7069a extends Builder<C7068c1, C7069a> implements GeoProto$RouteInfoOrBuilder {
        /* synthetic */ C7069a(C7051a1 a1Var) {
            this();
        }

        public long getDistance() {
            return ((C7068c1) this.instance).getDistance();
        }

        public Duration getDuration() {
            return ((C7068c1) this.instance).getDuration();
        }

        public C6975c0 getHigh() {
            return ((C7068c1) this.instance).getHigh();
        }

        public C6975c0 getLow() {
            return ((C7068c1) this.instance).getLow();
        }

        public boolean hasDuration() {
            return ((C7068c1) this.instance).hasDuration();
        }

        public boolean hasHigh() {
            return ((C7068c1) this.instance).hasHigh();
        }

        public boolean hasLow() {
            return ((C7068c1) this.instance).hasLow();
        }

        private C7069a() {
            super(C7068c1.f17478i);
        }
    }

    static {
        f17478i.makeImmutable();
    }

    private C7068c1() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7051a1.f17440a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7068c1();
            case 2:
                return f17478i;
            case 3:
                return null;
            case 4:
                return new C7069a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7068c1 c1Var = (C7068c1) obj2;
                this.f17480e = visitor.visitLong(this.f17480e != 0, this.f17480e, c1Var.f17480e != 0, c1Var.f17480e);
                this.f17481f = (Duration) visitor.visitMessage(this.f17481f, c1Var.f17481f);
                this.f17482g = (C6975c0) visitor.visitMessage(this.f17482g, c1Var.f17482g);
                this.f17483h = (C6975c0) visitor.visitMessage(this.f17483h, c1Var.f17483h);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f17480e = codedInputStream.readInt64();
                            } else if (readTag == 18) {
                                Builder builder = this.f17481f != null ? (Duration.Builder) this.f17481f.toBuilder() : null;
                                this.f17481f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17481f);
                                    this.f17481f = (Duration) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder2 = this.f17482g != null ? (C6976a) this.f17482g.toBuilder() : null;
                                this.f17482g = (C6975c0) codedInputStream.readMessage(C6975c0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17482g);
                                    this.f17482g = (C6975c0) builder2.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder3 = this.f17483h != null ? (C6976a) this.f17483h.toBuilder() : null;
                                this.f17483h = (C6975c0) codedInputStream.readMessage(C6975c0.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f17483h);
                                    this.f17483h = (C6975c0) builder3.buildPartial();
                                }
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
                if (f17479j == null) {
                    synchronized (C7068c1.class) {
                        if (f17479j == null) {
                            f17479j = new DefaultInstanceBasedParser(f17478i);
                        }
                    }
                }
                return f17479j;
            default:
                throw new UnsupportedOperationException();
        }
        return f17478i;
    }

    public long getDistance() {
        return this.f17480e;
    }

    public Duration getDuration() {
        Duration duration = this.f17481f;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public C6975c0 getHigh() {
        C6975c0 c0Var = this.f17483h;
        return c0Var == null ? C6975c0.getDefaultInstance() : c0Var;
    }

    public C6975c0 getLow() {
        C6975c0 c0Var = this.f17482g;
        return c0Var == null ? C6975c0.getDefaultInstance() : c0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f17480e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        if (this.f17481f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDuration());
        }
        if (this.f17482g != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getLow());
        }
        if (this.f17483h != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getHigh());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasDuration() {
        return this.f17481f != null;
    }

    public boolean hasHigh() {
        return this.f17483h != null;
    }

    public boolean hasLow() {
        return this.f17482g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f17480e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        if (this.f17481f != null) {
            codedOutputStream.writeMessage(2, getDuration());
        }
        if (this.f17482g != null) {
            codedOutputStream.writeMessage(3, getLow());
        }
        if (this.f17483h != null) {
            codedOutputStream.writeMessage(4, getHigh());
        }
    }
}
