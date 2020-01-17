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

/* renamed from: co.znly.models.w0 */
public final class C7496w0 extends GeneratedMessageLite<C7496w0, C7497a> implements MetricProto$SummaryOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C7496w0 f18828i = new C7496w0();

    /* renamed from: j */
    private static volatile Parser<C7496w0> f18829j;

    /* renamed from: e */
    private int f18830e;

    /* renamed from: f */
    private long f18831f;

    /* renamed from: g */
    private double f18832g;

    /* renamed from: h */
    private ProtobufList<C7488v0> f18833h = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.w0$a */
    public static final class C7497a extends Builder<C7496w0, C7497a> implements MetricProto$SummaryOrBuilder {
        /* synthetic */ C7497a(C7372k0 k0Var) {
            this();
        }

        public C7488v0 getQuantile(int i) {
            return ((C7496w0) this.instance).getQuantile(i);
        }

        public int getQuantileCount() {
            return ((C7496w0) this.instance).getQuantileCount();
        }

        public List<C7488v0> getQuantileList() {
            return Collections.unmodifiableList(((C7496w0) this.instance).getQuantileList());
        }

        public long getSampleCount() {
            return ((C7496w0) this.instance).getSampleCount();
        }

        public double getSampleSum() {
            return ((C7496w0) this.instance).getSampleSum();
        }

        private C7497a() {
            super(C7496w0.f18828i);
        }
    }

    static {
        f18828i.makeImmutable();
    }

    private C7496w0() {
    }

    public static C7496w0 getDefaultInstance() {
        return f18828i;
    }

    public static Parser<C7496w0> parser() {
        return f18828i.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7496w0();
            case 2:
                return f18828i;
            case 3:
                this.f18833h.makeImmutable();
                return null;
            case 4:
                return new C7497a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7496w0 w0Var = (C7496w0) obj2;
                this.f18831f = visitor.visitLong(this.f18831f != 0, this.f18831f, w0Var.f18831f != 0, w0Var.f18831f);
                this.f18832g = visitor.visitDouble(this.f18832g != 0.0d, this.f18832g, w0Var.f18832g != 0.0d, w0Var.f18832g);
                this.f18833h = visitor.visitList(this.f18833h, w0Var.f18833h);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18830e |= w0Var.f18830e;
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
                                this.f18831f = codedInputStream.readUInt64();
                            } else if (readTag == 17) {
                                this.f18832g = codedInputStream.readDouble();
                            } else if (readTag == 26) {
                                if (!this.f18833h.isModifiable()) {
                                    this.f18833h = GeneratedMessageLite.mutableCopy(this.f18833h);
                                }
                                this.f18833h.add(codedInputStream.readMessage(C7488v0.parser(), extensionRegistryLite));
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
                if (f18829j == null) {
                    synchronized (C7496w0.class) {
                        if (f18829j == null) {
                            f18829j = new DefaultInstanceBasedParser(f18828i);
                        }
                    }
                }
                return f18829j;
            default:
                throw new UnsupportedOperationException();
        }
        return f18828i;
    }

    public C7488v0 getQuantile(int i) {
        return (C7488v0) this.f18833h.get(i);
    }

    public int getQuantileCount() {
        return this.f18833h.size();
    }

    public List<C7488v0> getQuantileList() {
        return this.f18833h;
    }

    public long getSampleCount() {
        return this.f18831f;
    }

    public double getSampleSum() {
        return this.f18832g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        long j = this.f18831f;
        int computeUInt64Size = j != 0 ? CodedOutputStream.computeUInt64Size(1, j) + 0 : 0;
        double d = this.f18832g;
        if (d != 0.0d) {
            computeUInt64Size += CodedOutputStream.computeDoubleSize(2, d);
        }
        for (int i2 = 0; i2 < this.f18833h.size(); i2++) {
            computeUInt64Size += CodedOutputStream.computeMessageSize(3, (MessageLite) this.f18833h.get(i2));
        }
        this.memoizedSerializedSize = computeUInt64Size;
        return computeUInt64Size;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f18831f;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        double d = this.f18832g;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
        for (int i = 0; i < this.f18833h.size(); i++) {
            codedOutputStream.writeMessage(3, (MessageLite) this.f18833h.get(i));
        }
    }
}
