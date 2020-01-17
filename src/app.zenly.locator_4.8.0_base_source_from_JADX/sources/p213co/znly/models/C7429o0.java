package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.ProtobufList;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.Parser;

/* renamed from: co.znly.models.o0 */
public final class C7429o0 extends GeneratedMessageLite<C7429o0, C7430a> implements MetricProto$HistogramOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7429o0 f18576i = new C7429o0();

    /* renamed from: j */
    private static volatile Parser<C7429o0> f18577j;

    /* renamed from: e */
    private int f18578e;

    /* renamed from: f */
    private long f18579f;

    /* renamed from: g */
    private double f18580g;

    /* renamed from: h */
    private ProtobufList<C7381l0> f18581h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.o0$a */
    public static final class C7430a extends Builder<C7429o0, C7430a> implements MetricProto$HistogramOrBuilder {
        /* synthetic */ C7430a(C7372k0 k0Var) {
            this();
        }

        public C7381l0 getBucket(int i) {
            return ((C7429o0) this.instance).getBucket(i);
        }

        public int getBucketCount() {
            return ((C7429o0) this.instance).getBucketCount();
        }

        public List<C7381l0> getBucketList() {
            return Collections.unmodifiableList(((C7429o0) this.instance).getBucketList());
        }

        public long getSampleCount() {
            return ((C7429o0) this.instance).getSampleCount();
        }

        public double getSampleSum() {
            return ((C7429o0) this.instance).getSampleSum();
        }

        private C7430a() {
            super(C7429o0.f18576i);
        }
    }

    static {
        f18576i.makeImmutable();
    }

    private C7429o0() {
    }

    public static C7429o0 getDefaultInstance() {
        return f18576i;
    }

    public static Parser<C7429o0> parser() {
        return f18576i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7429o0();
            case 2:
                return f18576i;
            case 3:
                this.f18581h.makeImmutable();
                return null;
            case 4:
                return new C7430a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7429o0 o0Var = (C7429o0) obj2;
                this.f18579f = visitor.visitLong(this.f18579f != 0, this.f18579f, o0Var.f18579f != 0, o0Var.f18579f);
                this.f18580g = visitor.visitDouble(this.f18580g != 0.0d, this.f18580g, o0Var.f18580g != 0.0d, o0Var.f18580g);
                this.f18581h = visitor.visitList(this.f18581h, o0Var.f18581h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18578e |= o0Var.f18578e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 8) {
                                this.f18579f = codedInputStream.readUInt64();
                            } else if (readTag == 17) {
                                this.f18580g = codedInputStream.readDouble();
                            } else if (readTag == 26) {
                                if (!this.f18581h.isModifiable()) {
                                    this.f18581h = GeneratedMessageLite.mutableCopy(this.f18581h);
                                }
                                this.f18581h.add(codedInputStream.readMessage(C7381l0.parser(), extensionRegistryLite));
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
                if (f18577j == null) {
                    synchronized (C7429o0.class) {
                        if (f18577j == null) {
                            f18577j = new DefaultInstanceBasedParser(f18576i);
                        }
                    }
                }
                return f18577j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18576i;
    }

    public C7381l0 getBucket(int i) {
        return (C7381l0) this.f18581h.get(i);
    }

    public int getBucketCount() {
        return this.f18581h.size();
    }

    public List<C7381l0> getBucketList() {
        return this.f18581h;
    }

    public long getSampleCount() {
        return this.f18579f;
    }

    public double getSampleSum() {
        return this.f18580g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f18579f;
        int computeUInt64Size = j != 0 ? CodedOutputStream.computeUInt64Size(1, j) + 0 : 0;
        double d = this.f18580g;
        if (d != 0.0d) {
            computeUInt64Size += CodedOutputStream.computeDoubleSize(2, d);
        }
        for (int i2 = 0; i2 < this.f18581h.size(); i2++) {
            computeUInt64Size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f18581h.get(i2));
        }
        this.memoizedSerializedSize = computeUInt64Size;
        return computeUInt64Size;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f18579f;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        double d = this.f18580g;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
        for (int i = 0; i < this.f18581h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f18581h.get(i));
        }
    }
}
