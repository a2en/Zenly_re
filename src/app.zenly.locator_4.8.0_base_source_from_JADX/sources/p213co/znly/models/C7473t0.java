package p213co.znly.models;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
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

/* renamed from: co.znly.models.t0 */
public final class C7473t0 extends GeneratedMessageLite<C7473t0, C7474a> implements MetricProto$MetricFamilyOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C7473t0 f18745j = new C7473t0();

    /* renamed from: k */
    private static volatile Parser<C7473t0> f18746k;

    /* renamed from: e */
    private int f18747e;

    /* renamed from: f */
    private String f18748f;

    /* renamed from: g */
    private String f18749g;

    /* renamed from: h */
    private int f18750h;

    /* renamed from: i */
    private ProtobufList<C7462s0> f18751i = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: co.znly.models.t0$a */
    public static final class C7474a extends Builder<C7473t0, C7474a> implements MetricProto$MetricFamilyOrBuilder {
        /* synthetic */ C7474a(C7372k0 k0Var) {
            this();
        }

        public String getHelp() {
            return ((C7473t0) this.instance).getHelp();
        }

        public ByteString getHelpBytes() {
            return ((C7473t0) this.instance).getHelpBytes();
        }

        public C7462s0 getMetric(int i) {
            return ((C7473t0) this.instance).getMetric(i);
        }

        public int getMetricCount() {
            return ((C7473t0) this.instance).getMetricCount();
        }

        public List<C7462s0> getMetricList() {
            return Collections.unmodifiableList(((C7473t0) this.instance).getMetricList());
        }

        public String getName() {
            return ((C7473t0) this.instance).getName();
        }

        public ByteString getNameBytes() {
            return ((C7473t0) this.instance).getNameBytes();
        }

        public C7480u0 getType() {
            return ((C7473t0) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7473t0) this.instance).getTypeValue();
        }

        private C7474a() {
            super(C7473t0.f18745j);
        }
    }

    static {
        f18745j.makeImmutable();
    }

    private C7473t0() {
        String str = "";
        this.f18748f = str;
        this.f18749g = str;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7473t0();
            case 2:
                return f18745j;
            case 3:
                this.f18751i.makeImmutable();
                return null;
            case 4:
                return new C7474a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7473t0 t0Var = (C7473t0) obj2;
                this.f18748f = visitor.visitString(!this.f18748f.isEmpty(), this.f18748f, !t0Var.f18748f.isEmpty(), t0Var.f18748f);
                this.f18749g = visitor.visitString(!this.f18749g.isEmpty(), this.f18749g, !t0Var.f18749g.isEmpty(), t0Var.f18749g);
                boolean z2 = this.f18750h != 0;
                int i = this.f18750h;
                if (t0Var.f18750h != 0) {
                    z = true;
                }
                this.f18750h = visitor.visitInt(z2, i, z, t0Var.f18750h);
                this.f18751i = visitor.visitList(this.f18751i, t0Var.f18751i);
                if (visitor == MergeFromVisitor.INSTANCE) {
                    this.f18747e |= t0Var.f18747e;
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
                                this.f18748f = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 18) {
                                this.f18749g = codedInputStream.readStringRequireUtf8();
                            } else if (readTag == 24) {
                                this.f18750h = codedInputStream.readEnum();
                            } else if (readTag == 34) {
                                if (!this.f18751i.isModifiable()) {
                                    this.f18751i = GeneratedMessageLite.mutableCopy(this.f18751i);
                                }
                                this.f18751i.add(codedInputStream.readMessage(C7462s0.parser(), extensionRegistryLite));
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
                if (f18746k == null) {
                    synchronized (C7473t0.class) {
                        if (f18746k == null) {
                            f18746k = new DefaultInstanceBasedParser(f18745j);
                        }
                    }
                }
                return f18746k;
            default:
                throw new UnsupportedOperationException();
        }
        return f18745j;
    }

    public String getHelp() {
        return this.f18749g;
    }

    public ByteString getHelpBytes() {
        return ByteString.copyFromUtf8(this.f18749g);
    }

    public C7462s0 getMetric(int i) {
        return (C7462s0) this.f18751i.get(i);
    }

    public int getMetricCount() {
        return this.f18751i.size();
    }

    public List<C7462s0> getMetricList() {
        return this.f18751i;
    }

    public String getName() {
        return this.f18748f;
    }

    public ByteString getNameBytes() {
        return ByteString.copyFromUtf8(this.f18748f);
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int computeStringSize = !this.f18748f.isEmpty() ? CodedOutputStream.computeStringSize(1, getName()) + 0 : 0;
        if (!this.f18749g.isEmpty()) {
            computeStringSize += CodedOutputStream.computeStringSize(2, getHelp());
        }
        if (this.f18750h != C7480u0.COUNTER.getNumber()) {
            computeStringSize += CodedOutputStream.computeEnumSize(3, this.f18750h);
        }
        for (int i2 = 0; i2 < this.f18751i.size(); i2++) {
            computeStringSize += CodedOutputStream.computeMessageSize(4, (MessageLite) this.f18751i.get(i2));
        }
        this.memoizedSerializedSize = computeStringSize;
        return computeStringSize;
    }

    public C7480u0 getType() {
        C7480u0 a = C7480u0.m18112a(this.f18750h);
        return a == null ? C7480u0.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18750h;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18748f.isEmpty()) {
            codedOutputStream.writeString(1, getName());
        }
        if (!this.f18749g.isEmpty()) {
            codedOutputStream.writeString(2, getHelp());
        }
        if (this.f18750h != C7480u0.COUNTER.getNumber()) {
            codedOutputStream.writeEnum(3, this.f18750h);
        }
        for (int i = 0; i < this.f18751i.size(); i++) {
            codedOutputStream.writeMessage(4, (MessageLite) this.f18751i.get(i));
        }
    }
}
