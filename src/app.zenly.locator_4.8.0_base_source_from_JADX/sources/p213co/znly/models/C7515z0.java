package p213co.znly.models;

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
import p213co.znly.models.C6950b0.C6951a;

/* renamed from: co.znly.models.z0 */
public final class C7515z0 extends GeneratedMessageLite<C7515z0, C7516a> implements MotionProto$TrajectoryOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7515z0 f18878i = new C7515z0();

    /* renamed from: j */
    private static volatile Parser<C7515z0> f18879j;

    /* renamed from: e */
    private C6950b0 f18880e;

    /* renamed from: f */
    private C6950b0 f18881f;

    /* renamed from: g */
    private Duration f18882g;

    /* renamed from: h */
    private Duration f18883h;

    /* renamed from: co.znly.models.z0$a */
    public static final class C7516a extends Builder<C7515z0, C7516a> implements MotionProto$TrajectoryOrBuilder {
        /* synthetic */ C7516a(C7510y0 y0Var) {
            this();
        }

        public Duration getAverageDuration() {
            return ((C7515z0) this.instance).getAverageDuration();
        }

        public C6950b0 getDestination() {
            return ((C7515z0) this.instance).getDestination();
        }

        public Duration getMedianDuration() {
            return ((C7515z0) this.instance).getMedianDuration();
        }

        public C6950b0 getOrigin() {
            return ((C7515z0) this.instance).getOrigin();
        }

        public boolean hasAverageDuration() {
            return ((C7515z0) this.instance).hasAverageDuration();
        }

        public boolean hasDestination() {
            return ((C7515z0) this.instance).hasDestination();
        }

        public boolean hasMedianDuration() {
            return ((C7515z0) this.instance).hasMedianDuration();
        }

        public boolean hasOrigin() {
            return ((C7515z0) this.instance).hasOrigin();
        }

        private C7516a() {
            super(C7515z0.f18878i);
        }
    }

    static {
        f18878i.makeImmutable();
    }

    private C7515z0() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C7510y0.f18869a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7515z0();
            case 2:
                return f18878i;
            case 3:
                return null;
            case 4:
                return new C7516a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7515z0 z0Var = (C7515z0) obj2;
                this.f18880e = (C6950b0) visitor.visitMessage(this.f18880e, z0Var.f18880e);
                this.f18881f = (C6950b0) visitor.visitMessage(this.f18881f, z0Var.f18881f);
                this.f18882g = (Duration) visitor.visitMessage(this.f18882g, z0Var.f18882g);
                this.f18883h = (Duration) visitor.visitMessage(this.f18883h, z0Var.f18883h);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                Builder builder = this.f18880e != null ? (C6951a) this.f18880e.toBuilder() : null;
                                this.f18880e = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18880e);
                                    this.f18880e = (C6950b0) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f18881f != null ? (C6951a) this.f18881f.toBuilder() : null;
                                this.f18881f = (C6950b0) codedInputStream.readMessage(C6950b0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18881f);
                                    this.f18881f = (C6950b0) builder2.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder3 = this.f18882g != null ? (Duration.Builder) this.f18882g.toBuilder() : null;
                                this.f18882g = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f18882g);
                                    this.f18882g = (Duration) builder3.buildPartial();
                                }
                            } else if (readTag == 42) {
                                Builder builder4 = this.f18883h != null ? (Duration.Builder) this.f18883h.toBuilder() : null;
                                this.f18883h = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f18883h);
                                    this.f18883h = (Duration) builder4.buildPartial();
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
                if (f18879j == null) {
                    synchronized (C7515z0.class) {
                        if (f18879j == null) {
                            f18879j = new DefaultInstanceBasedParser(f18878i);
                        }
                    }
                }
                return f18879j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18878i;
    }

    public Duration getAverageDuration() {
        Duration duration = this.f18882g;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public C6950b0 getDestination() {
        C6950b0 b0Var = this.f18881f;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public Duration getMedianDuration() {
        Duration duration = this.f18883h;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public C6950b0 getOrigin() {
        C6950b0 b0Var = this.f18880e;
        return b0Var == null ? C6950b0.getDefaultInstance() : b0Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f18880e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getOrigin());
        }
        if (this.f18881f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDestination());
        }
        if (this.f18882g != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getAverageDuration());
        }
        if (this.f18883h != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getMedianDuration());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasAverageDuration() {
        return this.f18882g != null;
    }

    public boolean hasDestination() {
        return this.f18881f != null;
    }

    public boolean hasMedianDuration() {
        return this.f18883h != null;
    }

    public boolean hasOrigin() {
        return this.f18880e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f18880e != null) {
            codedOutputStream.writeMessage(1, getOrigin());
        }
        if (this.f18881f != null) {
            codedOutputStream.writeMessage(2, getDestination());
        }
        if (this.f18882g != null) {
            codedOutputStream.writeMessage(4, getAverageDuration());
        }
        if (this.f18883h != null) {
            codedOutputStream.writeMessage(5, getMedianDuration());
        }
    }
}
