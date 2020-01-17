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

/* renamed from: co.znly.models.b2 */
public final class C6958b2 extends GeneratedMessageLite<C6958b2, C6959a> implements PlaceProto$PairDurationSinceMidnightOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C6958b2 f17150g = new C6958b2();

    /* renamed from: h */
    private static volatile Parser<C6958b2> f17151h;

    /* renamed from: e */
    private Duration f17152e;

    /* renamed from: f */
    private Duration f17153f;

    /* renamed from: co.znly.models.b2$a */
    public static final class C6959a extends Builder<C6958b2, C6959a> implements PlaceProto$PairDurationSinceMidnightOrBuilder {
        /* synthetic */ C6959a(C6946a2 a2Var) {
            this();
        }

        public Duration getHighBoundSecondsFromMidnight() {
            return ((C6958b2) this.instance).getHighBoundSecondsFromMidnight();
        }

        public Duration getLowBoundSecondsFromMidnight() {
            return ((C6958b2) this.instance).getLowBoundSecondsFromMidnight();
        }

        public boolean hasHighBoundSecondsFromMidnight() {
            return ((C6958b2) this.instance).hasHighBoundSecondsFromMidnight();
        }

        public boolean hasLowBoundSecondsFromMidnight() {
            return ((C6958b2) this.instance).hasLowBoundSecondsFromMidnight();
        }

        private C6959a() {
            super(C6958b2.f17150g);
        }
    }

    static {
        f17150g.makeImmutable();
    }

    private C6958b2() {
    }

    public static C6958b2 getDefaultInstance() {
        return f17150g;
    }

    public static Parser<C6958b2> parser() {
        return f17150g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6958b2();
            case 2:
                return f17150g;
            case 3:
                return null;
            case 4:
                return new C6959a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C6958b2 b2Var = (C6958b2) obj2;
                this.f17152e = (Duration) visitor.visitMessage(this.f17152e, b2Var.f17152e);
                this.f17153f = (Duration) visitor.visitMessage(this.f17153f, b2Var.f17153f);
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
                                Builder builder = this.f17152e != null ? (Duration.Builder) this.f17152e.toBuilder() : null;
                                this.f17152e = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17152e);
                                    this.f17152e = (Duration) builder.buildPartial();
                                }
                            } else if (readTag == 18) {
                                Builder builder2 = this.f17153f != null ? (Duration.Builder) this.f17153f.toBuilder() : null;
                                this.f17153f = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f17153f);
                                    this.f17153f = (Duration) builder2.buildPartial();
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
                if (f17151h == null) {
                    synchronized (C6958b2.class) {
                        if (f17151h == null) {
                            f17151h = new DefaultInstanceBasedParser(f17150g);
                        }
                    }
                }
                return f17151h;
            default:
                throw new UnsupportedOperationException();
        }
        return f17150g;
    }

    public Duration getHighBoundSecondsFromMidnight() {
        Duration duration = this.f17153f;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public Duration getLowBoundSecondsFromMidnight() {
        Duration duration = this.f17152e;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (this.f17152e != null) {
            i2 = 0 + CodedOutputStream.computeMessageSize(1, getLowBoundSecondsFromMidnight());
        }
        if (this.f17153f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getHighBoundSecondsFromMidnight());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasHighBoundSecondsFromMidnight() {
        return this.f17153f != null;
    }

    public boolean hasLowBoundSecondsFromMidnight() {
        return this.f17152e != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (this.f17152e != null) {
            codedOutputStream.writeMessage(1, getLowBoundSecondsFromMidnight());
        }
        if (this.f17153f != null) {
            codedOutputStream.writeMessage(2, getHighBoundSecondsFromMidnight());
        }
    }
}
