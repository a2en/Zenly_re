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

/* renamed from: co.znly.models.core.b1 */
public final class C7060b1 extends GeneratedMessageLite<C7060b1, C7061a> implements GeoProto$RouteETAOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7060b1 f17460g = new C7060b1();

    /* renamed from: h */
    private static volatile Parser<C7060b1> f17461h;

    /* renamed from: e */
    private long f17462e;

    /* renamed from: f */
    private Duration f17463f;

    /* renamed from: co.znly.models.core.b1$a */
    public static final class C7061a extends Builder<C7060b1, C7061a> implements GeoProto$RouteETAOrBuilder {
        /* synthetic */ C7061a(C7051a1 a1Var) {
            this();
        }

        public long getDistance() {
            return ((C7060b1) this.instance).getDistance();
        }

        public Duration getDuration() {
            return ((C7060b1) this.instance).getDuration();
        }

        public boolean hasDuration() {
            return ((C7060b1) this.instance).hasDuration();
        }

        private C7061a() {
            super(C7060b1.f17460g);
        }
    }

    static {
        f17460g.makeImmutable();
    }

    private C7060b1() {
    }

    public static C7061a newBuilder() {
        return (C7061a) f17460g.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7051a1.f17440a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7060b1();
            case 2:
                return f17460g;
            case 3:
                return null;
            case 4:
                return new C7061a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7060b1 b1Var = (C7060b1) obj2;
                this.f17462e = visitor.visitLong(this.f17462e != 0, this.f17462e, b1Var.f17462e != 0, b1Var.f17462e);
                this.f17463f = (Duration) visitor.visitMessage(this.f17463f, b1Var.f17463f);
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
                                this.f17462e = codedInputStream.readInt64();
                            } else if (readTag == 18) {
                                Builder builder = this.f17463f != null ? (Duration.Builder) this.f17463f.toBuilder() : null;
                                this.f17463f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17463f);
                                    this.f17463f = (Duration) builder.buildPartial();
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
                if (f17461h == null) {
                    synchronized (C7060b1.class) {
                        if (f17461h == null) {
                            f17461h = new DefaultInstanceBasedParser(f17460g);
                        }
                    }
                }
                return f17461h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17460g;
    }

    public long getDistance() {
        return this.f17462e;
    }

    public Duration getDuration() {
        Duration duration = this.f17463f;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f17462e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        if (this.f17463f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getDuration());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasDuration() {
        return this.f17463f != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f17462e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        if (this.f17463f != null) {
            codedOutputStream.writeMessage(2, getDuration());
        }
    }
}
