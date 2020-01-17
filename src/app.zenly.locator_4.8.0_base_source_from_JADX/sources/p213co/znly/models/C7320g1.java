package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.g1 */
public final class C7320g1 extends GeneratedMessageLite<C7320g1, C7321a> implements PinContextProto$LocExtraStrippedOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C7320g1 f18181k = new C7320g1();

    /* renamed from: l */
    private static volatile Parser<C7320g1> f18182l;

    /* renamed from: e */
    private double f18183e;

    /* renamed from: f */
    private double f18184f;

    /* renamed from: g */
    private float f18185g;

    /* renamed from: h */
    private int f18186h;

    /* renamed from: i */
    private Timestamp f18187i;

    /* renamed from: j */
    private float f18188j;

    /* renamed from: co.znly.models.g1$a */
    public static final class C7321a extends Builder<C7320g1, C7321a> implements PinContextProto$LocExtraStrippedOrBuilder {
        /* synthetic */ C7321a(C6977c1 c1Var) {
            this();
        }

        public C7322b getDynamic() {
            return ((C7320g1) this.instance).getDynamic();
        }

        public int getDynamicValue() {
            return ((C7320g1) this.instance).getDynamicValue();
        }

        public Timestamp getHereSince() {
            return ((C7320g1) this.instance).getHereSince();
        }

        public double getLatitude() {
            return ((C7320g1) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((C7320g1) this.instance).getLongitude();
        }

        public float getPrecision() {
            return ((C7320g1) this.instance).getPrecision();
        }

        public float getSpeed() {
            return ((C7320g1) this.instance).getSpeed();
        }

        public boolean hasHereSince() {
            return ((C7320g1) this.instance).hasHereSince();
        }

        private C7321a() {
            super(C7320g1.f18181k);
        }
    }

    /* renamed from: co.znly.models.g1$b */
    public enum C7322b implements EnumLite {
        DYNAMIC_STATE_UNKNOWN(0),
        DYNAMIC_STATE_MOVING(1),
        DYNAMIC_STATE_STATIC(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18194e;

        /* renamed from: co.znly.models.g1$b$a */
        class C7323a implements EnumLiteMap<C7322b> {
            C7323a() {
            }

            public C7322b findValueByNumber(int i) {
                return C7322b.m18008a(i);
            }
        }

        static {
            new C7323a();
        }

        private C7322b(int i) {
            this.f18194e = i;
        }

        /* renamed from: a */
        public static C7322b m18008a(int i) {
            if (i == 0) {
                return DYNAMIC_STATE_UNKNOWN;
            }
            if (i == 1) {
                return DYNAMIC_STATE_MOVING;
            }
            if (i != 2) {
                return null;
            }
            return DYNAMIC_STATE_STATIC;
        }

        public final int getNumber() {
            return this.f18194e;
        }
    }

    static {
        f18181k.makeImmutable();
    }

    private C7320g1() {
    }

    public static C7320g1 getDefaultInstance() {
        return f18181k;
    }

    public static Parser<C7320g1> parser() {
        return f18181k.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6977c1.f17211a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7320g1();
            case 2:
                return f18181k;
            case 3:
                return null;
            case 4:
                return new C7321a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7320g1 g1Var = (C7320g1) obj2;
                this.f18183e = visitor.visitDouble(this.f18183e != 0.0d, this.f18183e, g1Var.f18183e != 0.0d, g1Var.f18183e);
                this.f18184f = visitor.visitDouble(this.f18184f != 0.0d, this.f18184f, g1Var.f18184f != 0.0d, g1Var.f18184f);
                this.f18185g = visitor.visitFloat(this.f18185g != 0.0f, this.f18185g, g1Var.f18185g != 0.0f, g1Var.f18185g);
                this.f18186h = visitor.visitInt(this.f18186h != 0, this.f18186h, g1Var.f18186h != 0, g1Var.f18186h);
                this.f18187i = (Timestamp) visitor.visitMessage(this.f18187i, g1Var.f18187i);
                boolean z2 = this.f18188j != 0.0f;
                float f = this.f18188j;
                if (g1Var.f18188j != 0.0f) {
                    z = true;
                }
                this.f18188j = visitor.visitFloat(z2, f, z, g1Var.f18188j);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        if (readTag != 0) {
                            if (readTag == 9) {
                                this.f18183e = codedInputStream.readDouble();
                            } else if (readTag == 17) {
                                this.f18184f = codedInputStream.readDouble();
                            } else if (readTag == 37) {
                                this.f18185g = codedInputStream.readFloat();
                            } else if (readTag == 40) {
                                this.f18186h = codedInputStream.readEnum();
                            } else if (readTag == 50) {
                                Builder builder = this.f18187i != null ? (Timestamp.Builder) this.f18187i.toBuilder() : null;
                                this.f18187i = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder != null) {
                                    builder.mergeFrom(this.f18187i);
                                    this.f18187i = (Timestamp) builder.buildPartial();
                                }
                            } else if (readTag == 61) {
                                this.f18188j = codedInputStream.readFloat();
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
                if (f18182l == null) {
                    synchronized (C7320g1.class) {
                        if (f18182l == null) {
                            f18182l = new DefaultInstanceBasedParser(f18181k);
                        }
                    }
                }
                return f18182l;
            default:
                throw new UnsupportedOperationException();
        }
        return f18181k;
    }

    public C7322b getDynamic() {
        C7322b a = C7322b.m18008a(this.f18186h);
        return a == null ? C7322b.UNRECOGNIZED : a;
    }

    public int getDynamicValue() {
        return this.f18186h;
    }

    public Timestamp getHereSince() {
        Timestamp timestamp = this.f18187i;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public double getLatitude() {
        return this.f18183e;
    }

    public double getLongitude() {
        return this.f18184f;
    }

    public float getPrecision() {
        return this.f18185g;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f18183e;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        double d2 = this.f18184f;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d2);
        }
        float f = this.f18185g;
        if (f != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(4, f);
        }
        if (this.f18186h != C7322b.DYNAMIC_STATE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(5, this.f18186h);
        }
        if (this.f18187i != null) {
            i2 += CodedOutputStream.computeMessageSize(6, getHereSince());
        }
        float f2 = this.f18188j;
        if (f2 != 0.0f) {
            i2 += CodedOutputStream.computeFloatSize(7, f2);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public float getSpeed() {
        return this.f18188j;
    }

    public boolean hasHereSince() {
        return this.f18187i != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f18183e;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
        double d2 = this.f18184f;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(2, d2);
        }
        float f = this.f18185g;
        if (f != 0.0f) {
            codedOutputStream.writeFloat(4, f);
        }
        if (this.f18186h != C7322b.DYNAMIC_STATE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(5, this.f18186h);
        }
        if (this.f18187i != null) {
            codedOutputStream.writeMessage(6, getHereSince());
        }
        float f2 = this.f18188j;
        if (f2 != 0.0f) {
            codedOutputStream.writeFloat(7, f2);
        }
    }
}
