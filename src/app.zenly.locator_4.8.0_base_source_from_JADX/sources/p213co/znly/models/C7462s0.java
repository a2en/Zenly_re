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
import p213co.znly.models.C7389m0.C7390a;
import p213co.znly.models.C7398n0.C7399a;
import p213co.znly.models.C7429o0.C7430a;
import p213co.znly.models.C7496w0.C7497a;
import p213co.znly.models.C7504x0.C7505a;

/* renamed from: co.znly.models.s0 */
public final class C7462s0 extends GeneratedMessageLite<C7462s0, C7463a> implements MetricProto$MetricOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final C7462s0 f18694m = new C7462s0();

    /* renamed from: n */
    private static volatile Parser<C7462s0> f18695n;

    /* renamed from: e */
    private int f18696e;

    /* renamed from: f */
    private ProtobufList<C7438p0> f18697f = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: g */
    private C7398n0 f18698g;

    /* renamed from: h */
    private C7389m0 f18699h;

    /* renamed from: i */
    private C7496w0 f18700i;

    /* renamed from: j */
    private C7504x0 f18701j;

    /* renamed from: k */
    private C7429o0 f18702k;

    /* renamed from: l */
    private long f18703l;

    /* renamed from: co.znly.models.s0$a */
    public static final class C7463a extends Builder<C7462s0, C7463a> implements MetricProto$MetricOrBuilder {
        /* synthetic */ C7463a(C7372k0 k0Var) {
            this();
        }

        public C7389m0 getCounter() {
            return ((C7462s0) this.instance).getCounter();
        }

        public C7398n0 getGauge() {
            return ((C7462s0) this.instance).getGauge();
        }

        public C7429o0 getHistogram() {
            return ((C7462s0) this.instance).getHistogram();
        }

        public C7438p0 getLabel(int i) {
            return ((C7462s0) this.instance).getLabel(i);
        }

        public int getLabelCount() {
            return ((C7462s0) this.instance).getLabelCount();
        }

        public List<C7438p0> getLabelList() {
            return Collections.unmodifiableList(((C7462s0) this.instance).getLabelList());
        }

        public C7496w0 getSummary() {
            return ((C7462s0) this.instance).getSummary();
        }

        public long getTimestampMs() {
            return ((C7462s0) this.instance).getTimestampMs();
        }

        public C7504x0 getUntyped() {
            return ((C7462s0) this.instance).getUntyped();
        }

        public boolean hasCounter() {
            return ((C7462s0) this.instance).hasCounter();
        }

        public boolean hasGauge() {
            return ((C7462s0) this.instance).hasGauge();
        }

        public boolean hasHistogram() {
            return ((C7462s0) this.instance).hasHistogram();
        }

        public boolean hasSummary() {
            return ((C7462s0) this.instance).hasSummary();
        }

        public boolean hasUntyped() {
            return ((C7462s0) this.instance).hasUntyped();
        }

        private C7463a() {
            super(C7462s0.f18694m);
        }
    }

    static {
        f18694m.makeImmutable();
    }

    private C7462s0() {
    }

    public static Parser<C7462s0> parser() {
        return f18694m.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7462s0();
            case 2:
                return f18694m;
            case 3:
                this.f18697f.makeImmutable();
                return null;
            case 4:
                return new C7463a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7462s0 s0Var = (C7462s0) obj2;
                this.f18697f = visitor.visitList(this.f18697f, s0Var.f18697f);
                this.f18698g = (C7398n0) visitor.visitMessage(this.f18698g, s0Var.f18698g);
                this.f18699h = (C7389m0) visitor.visitMessage(this.f18699h, s0Var.f18699h);
                this.f18700i = (C7496w0) visitor.visitMessage(this.f18700i, s0Var.f18700i);
                this.f18701j = (C7504x0) visitor.visitMessage(this.f18701j, s0Var.f18701j);
                this.f18702k = (C7429o0) visitor.visitMessage(this.f18702k, s0Var.f18702k);
                this.f18703l = visitor.visitLong(this.f18703l != 0, this.f18703l, s0Var.f18703l != 0, s0Var.f18703l);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18696e |= s0Var.f18696e;
                }
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 10) {
                                if (!this.f18697f.isModifiable()) {
                                    this.f18697f = GeneratedMessageLite.mutableCopy(this.f18697f);
                                }
                                this.f18697f.add(codedInputStream.readMessage(C7438p0.parser(), extensionRegistryLite));
                            } else if (readTag == 18) {
                                Builder builder = this.f18698g != null ? (C7399a) this.f18698g.toBuilder() : null;
                                this.f18698g = (C7398n0) codedInputStream.readMessage(C7398n0.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18698g);
                                    this.f18698g = (C7398n0) builder.buildPartial();
                                }
                            } else if (readTag == 26) {
                                Builder builder2 = this.f18699h != null ? (C7390a) this.f18699h.toBuilder() : null;
                                this.f18699h = (C7389m0) codedInputStream.readMessage(C7389m0.parser(), extensionRegistryLite);
                                if (builder2 != null) {
                                    builder2.mergeFrom(this.f18699h);
                                    this.f18699h = (C7389m0) builder2.buildPartial();
                                }
                            } else if (readTag == 34) {
                                Builder builder3 = this.f18700i != null ? (C7497a) this.f18700i.toBuilder() : null;
                                this.f18700i = (C7496w0) codedInputStream.readMessage(C7496w0.parser(), extensionRegistryLite);
                                if (builder3 != null) {
                                    builder3.mergeFrom(this.f18700i);
                                    this.f18700i = (C7496w0) builder3.buildPartial();
                                }
                            } else if (readTag == 42) {
                                Builder builder4 = this.f18701j != null ? (C7505a) this.f18701j.toBuilder() : null;
                                this.f18701j = (C7504x0) codedInputStream.readMessage(C7504x0.parser(), extensionRegistryLite);
                                if (builder4 != null) {
                                    builder4.mergeFrom(this.f18701j);
                                    this.f18701j = (C7504x0) builder4.buildPartial();
                                }
                            } else if (readTag == 48) {
                                this.f18703l = codedInputStream.readInt64();
                            } else if (readTag == 58) {
                                Builder builder5 = this.f18702k != null ? (C7430a) this.f18702k.toBuilder() : null;
                                this.f18702k = (C7429o0) codedInputStream.readMessage(C7429o0.parser(), extensionRegistryLite);
                                if (builder5 != null) {
                                    builder5.mergeFrom(this.f18702k);
                                    this.f18702k = (C7429o0) builder5.buildPartial();
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
                if (f18695n == null) {
                    synchronized (C7462s0.class) {
                        if (f18695n == null) {
                            f18695n = new DefaultInstanceBasedParser(f18694m);
                        }
                    }
                }
                return f18695n;
            default:
                throw new UnsupportedOperationException();
        }
        return f18694m;
    }

    public C7389m0 getCounter() {
        C7389m0 m0Var = this.f18699h;
        return m0Var == null ? C7389m0.getDefaultInstance() : m0Var;
    }

    public C7398n0 getGauge() {
        C7398n0 n0Var = this.f18698g;
        return n0Var == null ? C7398n0.getDefaultInstance() : n0Var;
    }

    public C7429o0 getHistogram() {
        C7429o0 o0Var = this.f18702k;
        return o0Var == null ? C7429o0.getDefaultInstance() : o0Var;
    }

    public C7438p0 getLabel(int i) {
        return (C7438p0) this.f18697f.get(i);
    }

    public int getLabelCount() {
        return this.f18697f.size();
    }

    public List<C7438p0> getLabelList() {
        return this.f18697f;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f18697f.size(); i3++) {
            i2 += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f18697f.get(i3));
        }
        if (this.f18698g != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getGauge());
        }
        if (this.f18699h != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getCounter());
        }
        if (this.f18700i != null) {
            i2 += CodedOutputStream.computeMessageSize(4, getSummary());
        }
        if (this.f18701j != null) {
            i2 += CodedOutputStream.computeMessageSize(5, getUntyped());
        }
        long j = this.f18703l;
        if (j != 0) {
            i2 += CodedOutputStream.computeInt64Size(6, j);
        }
        if (this.f18702k != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getHistogram());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7496w0 getSummary() {
        C7496w0 w0Var = this.f18700i;
        return w0Var == null ? C7496w0.getDefaultInstance() : w0Var;
    }

    public long getTimestampMs() {
        return this.f18703l;
    }

    public C7504x0 getUntyped() {
        C7504x0 x0Var = this.f18701j;
        return x0Var == null ? C7504x0.getDefaultInstance() : x0Var;
    }

    public boolean hasCounter() {
        return this.f18699h != null;
    }

    public boolean hasGauge() {
        return this.f18698g != null;
    }

    public boolean hasHistogram() {
        return this.f18702k != null;
    }

    public boolean hasSummary() {
        return this.f18700i != null;
    }

    public boolean hasUntyped() {
        return this.f18701j != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.f18697f.size(); i++) {
            codedOutputStream.writeMessage(1, (MessageLite) this.f18697f.get(i));
        }
        if (this.f18698g != null) {
            codedOutputStream.writeMessage(2, getGauge());
        }
        if (this.f18699h != null) {
            codedOutputStream.writeMessage(3, getCounter());
        }
        if (this.f18700i != null) {
            codedOutputStream.writeMessage(4, getSummary());
        }
        if (this.f18701j != null) {
            codedOutputStream.writeMessage(5, getUntyped());
        }
        long j = this.f18703l;
        if (j != 0) {
            codedOutputStream.writeInt64(6, j);
        }
        if (this.f18702k != null) {
            codedOutputStream.writeMessage(7, getHistogram());
        }
    }
}
