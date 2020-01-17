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

/* renamed from: co.znly.models.l0 */
public final class C7381l0 extends GeneratedMessageLite<C7381l0, C7382a> implements MetricProto$BucketOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7381l0 f18404g = new C7381l0();

    /* renamed from: h */
    private static volatile Parser<C7381l0> f18405h;

    /* renamed from: e */
    private long f18406e;

    /* renamed from: f */
    private double f18407f;

    /* renamed from: co.znly.models.l0$a */
    public static final class C7382a extends Builder<C7381l0, C7382a> implements MetricProto$BucketOrBuilder {
        /* synthetic */ C7382a(C7372k0 k0Var) {
            this();
        }

        public long getCumulativeCount() {
            return ((C7381l0) this.instance).getCumulativeCount();
        }

        public double getUpperBound() {
            return ((C7381l0) this.instance).getUpperBound();
        }

        private C7382a() {
            super(C7381l0.f18404g);
        }
    }

    static {
        f18404g.makeImmutable();
    }

    private C7381l0() {
    }

    public static Parser<C7381l0> parser() {
        return f18404g.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7372k0.f18376a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7381l0();
            case 2:
                return f18404g;
            case 3:
                return null;
            case 4:
                return new C7382a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7381l0 l0Var = (C7381l0) obj2;
                this.f18406e = visitor.visitLong(this.f18406e != 0, this.f18406e, l0Var.f18406e != 0, l0Var.f18406e);
                this.f18407f = visitor.visitDouble(this.f18407f != 0.0d, this.f18407f, l0Var.f18407f != 0.0d, l0Var.f18407f);
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
                                this.f18406e = codedInputStream.readUInt64();
                            } else if (readTag == 17) {
                                this.f18407f = codedInputStream.readDouble();
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
                if (f18405h == null) {
                    synchronized (C7381l0.class) {
                        if (f18405h == null) {
                            f18405h = new DefaultInstanceBasedParser(f18404g);
                        }
                    }
                }
                return f18405h;
            default:
                throw new UnsupportedOperationException();
        }
        return f18404g;
    }

    public long getCumulativeCount() {
        return this.f18406e;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f18406e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeUInt64Size(1, j);
        }
        double d = this.f18407f;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public double getUpperBound() {
        return this.f18407f;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f18406e;
        if (j != 0) {
            codedOutputStream.writeUInt64(1, j);
        }
        double d = this.f18407f;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(2, d);
        }
    }
}
