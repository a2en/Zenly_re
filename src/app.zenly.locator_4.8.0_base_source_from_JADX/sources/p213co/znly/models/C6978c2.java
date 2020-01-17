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
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.c2 */
public final class C6978c2 extends GeneratedMessageLite<C6978c2, C6979a> implements PlaceProto$PersonalPlaceOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final C6978c2 f17212l = new C6978c2();

    /* renamed from: m */
    private static volatile Parser<C6978c2> f17213m;

    /* renamed from: e */
    private long f17214e;

    /* renamed from: f */
    private int f17215f;

    /* renamed from: g */
    private boolean f17216g;

    /* renamed from: h */
    private double f17217h;

    /* renamed from: i */
    private double f17218i;

    /* renamed from: j */
    private double f17219j;

    /* renamed from: k */
    private Timestamp f17220k;

    /* renamed from: co.znly.models.c2$a */
    public static final class C6979a extends Builder<C6978c2, C6979a> implements PlaceProto$PersonalPlaceOrBuilder {
        /* synthetic */ C6979a(C6946a2 a2Var) {
            this();
        }

        public long getId() {
            return ((C6978c2) this.instance).getId();
        }

        public boolean getIsMain() {
            return ((C6978c2) this.instance).getIsMain();
        }

        public C7276d2 getLabel() {
            return ((C6978c2) this.instance).getLabel();
        }

        public int getLabelValue() {
            return ((C6978c2) this.instance).getLabelValue();
        }

        public Timestamp getLastVisitedAt() {
            return ((C6978c2) this.instance).getLastVisitedAt();
        }

        public double getLatitude() {
            return ((C6978c2) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((C6978c2) this.instance).getLongitude();
        }

        public double getRadius() {
            return ((C6978c2) this.instance).getRadius();
        }

        public boolean hasLastVisitedAt() {
            return ((C6978c2) this.instance).hasLastVisitedAt();
        }

        private C6979a() {
            super(C6978c2.f17212l);
        }
    }

    static {
        f17212l.makeImmutable();
    }

    private C6978c2() {
    }

    public static Parser<C6978c2> parser() {
        return f17212l.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6946a2.f17113a[methodToInvoke.ordinal()]) {
            case 1:
                return new C6978c2();
            case 2:
                return f17212l;
            case 3:
                return null;
            case 4:
                return new C6979a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C6978c2 c2Var = (C6978c2) obj2;
                this.f17214e = visitor.visitLong(this.f17214e != 0, this.f17214e, c2Var.f17214e != 0, c2Var.f17214e);
                this.f17215f = visitor.visitInt(this.f17215f != 0, this.f17215f, c2Var.f17215f != 0, c2Var.f17215f);
                boolean z2 = this.f17216g;
                boolean z3 = c2Var.f17216g;
                this.f17216g = visitor.visitBoolean(z2, z2, z3, z3);
                this.f17217h = visitor.visitDouble(this.f17217h != 0.0d, this.f17217h, c2Var.f17217h != 0.0d, c2Var.f17217h);
                this.f17218i = visitor.visitDouble(this.f17218i != 0.0d, this.f17218i, c2Var.f17218i != 0.0d, c2Var.f17218i);
                this.f17219j = visitor.visitDouble(this.f17219j != 0.0d, this.f17219j, c2Var.f17219j != 0.0d, c2Var.f17219j);
                this.f17220k = (Timestamp) visitor.visitMessage(this.f17220k, c2Var.f17220k);
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
                                this.f17214e = codedInputStream.readInt64();
                            } else if (readTag == 16) {
                                this.f17215f = codedInputStream.readEnum();
                            } else if (readTag == 24) {
                                this.f17216g = codedInputStream.readBool();
                            } else if (readTag == 33) {
                                this.f17217h = codedInputStream.readDouble();
                            } else if (readTag == 41) {
                                this.f17218i = codedInputStream.readDouble();
                            } else if (readTag == 49) {
                                this.f17219j = codedInputStream.readDouble();
                            } else if (readTag == 58) {
                                Builder builder = this.f17220k != null ? (Timestamp.Builder) this.f17220k.toBuilder() : null;
                                this.f17220k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f17220k);
                                    this.f17220k = (Timestamp) builder.buildPartial();
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
                if (f17213m == null) {
                    synchronized (C6978c2.class) {
                        if (f17213m == null) {
                            f17213m = new DefaultInstanceBasedParser(f17212l);
                        }
                    }
                }
                return f17213m;
            default:
                throw new UnsupportedOperationException();
        }
        return f17212l;
    }

    public long getId() {
        return this.f17214e;
    }

    public boolean getIsMain() {
        return this.f17216g;
    }

    public C7276d2 getLabel() {
        C7276d2 a = C7276d2.m17988a(this.f17215f);
        return a == null ? C7276d2.UNRECOGNIZED : a;
    }

    public int getLabelValue() {
        return this.f17215f;
    }

    public Timestamp getLastVisitedAt() {
        Timestamp timestamp = this.f17220k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public double getLatitude() {
        return this.f17218i;
    }

    public double getLongitude() {
        return this.f17219j;
    }

    public double getRadius() {
        return this.f17217h;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        long j = this.f17214e;
        if (j != 0) {
            i2 = 0 + CodedOutputStream.computeInt64Size(1, j);
        }
        if (this.f17215f != C7276d2.NOLABEL.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(2, this.f17215f);
        }
        boolean z = this.f17216g;
        if (z) {
            i2 += CodedOutputStream.computeBoolSize(3, z);
        }
        double d = this.f17217h;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(4, d);
        }
        double d2 = this.f17218i;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(5, d2);
        }
        double d3 = this.f17219j;
        if (d3 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(6, d3);
        }
        if (this.f17220k != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getLastVisitedAt());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public boolean hasLastVisitedAt() {
        return this.f17220k != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        long j = this.f17214e;
        if (j != 0) {
            codedOutputStream.writeInt64(1, j);
        }
        if (this.f17215f != C7276d2.NOLABEL.getNumber()) {
            codedOutputStream.writeEnum(2, this.f17215f);
        }
        boolean z = this.f17216g;
        if (z) {
            codedOutputStream.writeBool(3, z);
        }
        double d = this.f17217h;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(4, d);
        }
        double d2 = this.f17218i;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(5, d2);
        }
        double d3 = this.f17219j;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(6, d3);
        }
        if (this.f17220k != null) {
            codedOutputStream.writeMessage(7, getLastVisitedAt());
        }
    }
}
