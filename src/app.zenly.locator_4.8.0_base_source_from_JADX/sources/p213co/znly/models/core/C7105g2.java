package p213co.znly.models.core;

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

/* renamed from: co.znly.models.core.g2 */
public final class C7105g2 extends GeneratedMessageLite<C7105g2, C7106a> implements TypesProto$LocationOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static final C7105g2 f17565o = new C7105g2();

    /* renamed from: p */
    private static volatile Parser<C7105g2> f17566p;

    /* renamed from: e */
    private double f17567e;

    /* renamed from: f */
    private double f17568f;

    /* renamed from: g */
    private double f17569g;

    /* renamed from: h */
    private int f17570h;

    /* renamed from: i */
    private double f17571i;

    /* renamed from: j */
    private double f17572j;

    /* renamed from: k */
    private Timestamp f17573k;

    /* renamed from: l */
    private double f17574l;

    /* renamed from: m */
    private double f17575m;

    /* renamed from: n */
    private int f17576n;

    /* renamed from: co.znly.models.core.g2$a */
    public static final class C7106a extends Builder<C7105g2, C7106a> implements TypesProto$LocationOrBuilder {
        /* synthetic */ C7106a(C7253x1 x1Var) {
            this();
        }

        public double getAltitude() {
            return ((C7105g2) this.instance).getAltitude();
        }

        public double getBearing() {
            return ((C7105g2) this.instance).getBearing();
        }

        public int getFloor() {
            return ((C7105g2) this.instance).getFloor();
        }

        public double getHorizontalPrecision() {
            return ((C7105g2) this.instance).getHorizontalPrecision();
        }

        public double getLatitude() {
            return ((C7105g2) this.instance).getLatitude();
        }

        public double getLongitude() {
            return ((C7105g2) this.instance).getLongitude();
        }

        public C7107b getProvider() {
            return ((C7105g2) this.instance).getProvider();
        }

        public int getProviderValue() {
            return ((C7105g2) this.instance).getProviderValue();
        }

        public double getSpeed() {
            return ((C7105g2) this.instance).getSpeed();
        }

        public Timestamp getTimestamp() {
            return ((C7105g2) this.instance).getTimestamp();
        }

        public double getVerticalPrecision() {
            return ((C7105g2) this.instance).getVerticalPrecision();
        }

        public boolean hasTimestamp() {
            return ((C7105g2) this.instance).hasTimestamp();
        }

        private C7106a() {
            super(C7105g2.f17565o);
        }
    }

    /* renamed from: co.znly.models.core.g2$b */
    public enum C7107b implements EnumLite {
        PROVIDER_UNKNOWN(0),
        PROVIDER_CORELOCATION(1),
        PROVIDER_GOOGLEPLAY_FUSED(2),
        PROVIDER_ANDROID_PASSIVE(3),
        PROVIDER_ANDROID_NETWORK(4),
        PROVIDER_ANDROID_GPS(5),
        PROVIDER_MAPZEN(6),
        PROVIDER_APWLS(7),
        PROVIDER_CORELOCATION_NETWORK(8),
        PROVIDER_CORELOCATION_GPS(9),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f17589e;

        /* renamed from: co.znly.models.core.g2$b$a */
        class C7108a implements EnumLiteMap<C7107b> {
            C7108a() {
            }

            public C7107b findValueByNumber(int i) {
                return C7107b.m17800a(i);
            }
        }

        static {
            new C7108a();
        }

        private C7107b(int i) {
            this.f17589e = i;
        }

        /* renamed from: a */
        public static C7107b m17800a(int i) {
            switch (i) {
                case 0:
                    return PROVIDER_UNKNOWN;
                case 1:
                    return PROVIDER_CORELOCATION;
                case 2:
                    return PROVIDER_GOOGLEPLAY_FUSED;
                case 3:
                    return PROVIDER_ANDROID_PASSIVE;
                case 4:
                    return PROVIDER_ANDROID_NETWORK;
                case 5:
                    return PROVIDER_ANDROID_GPS;
                case 6:
                    return PROVIDER_MAPZEN;
                case 7:
                    return PROVIDER_APWLS;
                case 8:
                    return PROVIDER_CORELOCATION_NETWORK;
                case 9:
                    return PROVIDER_CORELOCATION_GPS;
                default:
                    return null;
            }
        }

        public final int getNumber() {
            return this.f17589e;
        }
    }

    static {
        f17565o.makeImmutable();
    }

    private C7105g2() {
    }

    public static C7106a newBuilder() {
        return (C7106a) f17565o.toBuilder();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7253x1.f17990a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7105g2();
            case 2:
                return f17565o;
            case 3:
                return null;
            case 4:
                return new C7106a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7105g2 g2Var = (C7105g2) obj2;
                this.f17567e = visitor.visitDouble(this.f17567e != 0.0d, this.f17567e, g2Var.f17567e != 0.0d, g2Var.f17567e);
                this.f17568f = visitor.visitDouble(this.f17568f != 0.0d, this.f17568f, g2Var.f17568f != 0.0d, g2Var.f17568f);
                this.f17569g = visitor.visitDouble(this.f17569g != 0.0d, this.f17569g, g2Var.f17569g != 0.0d, g2Var.f17569g);
                this.f17570h = visitor.visitInt(this.f17570h != 0, this.f17570h, g2Var.f17570h != 0, g2Var.f17570h);
                this.f17571i = visitor.visitDouble(this.f17571i != 0.0d, this.f17571i, g2Var.f17571i != 0.0d, g2Var.f17571i);
                this.f17572j = visitor.visitDouble(this.f17572j != 0.0d, this.f17572j, g2Var.f17572j != 0.0d, g2Var.f17572j);
                this.f17573k = (Timestamp) visitor.visitMessage(this.f17573k, g2Var.f17573k);
                this.f17574l = visitor.visitDouble(this.f17574l != 0.0d, this.f17574l, g2Var.f17574l != 0.0d, g2Var.f17574l);
                this.f17575m = visitor.visitDouble(this.f17575m != 0.0d, this.f17575m, g2Var.f17575m != 0.0d, g2Var.f17575m);
                boolean z2 = this.f17576n != 0;
                int i = this.f17576n;
                if (g2Var.f17576n != 0) {
                    z = true;
                }
                this.f17576n = visitor.visitInt(z2, i, z, g2Var.f17576n);
                MergeFromVisitor mergeFromVisitor = MergeFromVisitor.INSTANCE;
                return this;
            case 6:
                CodedInputStream codedInputStream = (CodedInputStream) obj;
                ExtensionRegistryLite extensionRegistryLite = (ExtensionRegistryLite) obj2;
                while (!z) {
                    try {
                        int readTag = codedInputStream.readTag();
                        switch (readTag) {
                            case 0:
                                z = true;
                                break;
                            case 9:
                                this.f17567e = codedInputStream.readDouble();
                                break;
                            case 17:
                                this.f17568f = codedInputStream.readDouble();
                                break;
                            case 25:
                                this.f17569g = codedInputStream.readDouble();
                                break;
                            case 32:
                                this.f17570h = codedInputStream.readInt32();
                                break;
                            case 41:
                                this.f17571i = codedInputStream.readDouble();
                                break;
                            case 49:
                                this.f17572j = codedInputStream.readDouble();
                                break;
                            case 58:
                                Builder builder = this.f17573k != null ? (Timestamp.Builder) this.f17573k.toBuilder() : null;
                                this.f17573k = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f17573k);
                                    this.f17573k = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 65:
                                this.f17574l = codedInputStream.readDouble();
                                break;
                            case 73:
                                this.f17575m = codedInputStream.readDouble();
                                break;
                            case 80:
                                this.f17576n = codedInputStream.readEnum();
                                break;
                            default:
                                if (codedInputStream.skipField(readTag)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
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
                if (f17566p == null) {
                    synchronized (C7105g2.class) {
                        if (f17566p == null) {
                            f17566p = new DefaultInstanceBasedParser(f17565o);
                        }
                    }
                }
                return f17566p;
            default:
                throw new UnsupportedOperationException();
        }
        return f17565o;
    }

    public double getAltitude() {
        return this.f17569g;
    }

    public double getBearing() {
        return this.f17575m;
    }

    public int getFloor() {
        return this.f17570h;
    }

    public double getHorizontalPrecision() {
        return this.f17571i;
    }

    public double getLatitude() {
        return this.f17567e;
    }

    public double getLongitude() {
        return this.f17568f;
    }

    public C7107b getProvider() {
        C7107b a = C7107b.m17800a(this.f17576n);
        return a == null ? C7107b.UNRECOGNIZED : a;
    }

    public int getProviderValue() {
        return this.f17576n;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        double d = this.f17567e;
        if (d != 0.0d) {
            i2 = 0 + CodedOutputStream.computeDoubleSize(1, d);
        }
        double d2 = this.f17568f;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(2, d2);
        }
        double d3 = this.f17569g;
        if (d3 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(3, d3);
        }
        int i3 = this.f17570h;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(4, i3);
        }
        double d4 = this.f17571i;
        if (d4 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(5, d4);
        }
        double d5 = this.f17572j;
        if (d5 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(6, d5);
        }
        if (this.f17573k != null) {
            i2 += CodedOutputStream.computeMessageSize(7, getTimestamp());
        }
        double d6 = this.f17574l;
        if (d6 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(8, d6);
        }
        double d7 = this.f17575m;
        if (d7 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(9, d7);
        }
        if (this.f17576n != C7107b.PROVIDER_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(10, this.f17576n);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public double getSpeed() {
        return this.f17574l;
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.f17573k;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public double getVerticalPrecision() {
        return this.f17572j;
    }

    public boolean hasTimestamp() {
        return this.f17573k != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        double d = this.f17567e;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(1, d);
        }
        double d2 = this.f17568f;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(2, d2);
        }
        double d3 = this.f17569g;
        if (d3 != 0.0d) {
            codedOutputStream.writeDouble(3, d3);
        }
        int i = this.f17570h;
        if (i != 0) {
            codedOutputStream.writeInt32(4, i);
        }
        double d4 = this.f17571i;
        if (d4 != 0.0d) {
            codedOutputStream.writeDouble(5, d4);
        }
        double d5 = this.f17572j;
        if (d5 != 0.0d) {
            codedOutputStream.writeDouble(6, d5);
        }
        if (this.f17573k != null) {
            codedOutputStream.writeMessage(7, getTimestamp());
        }
        double d6 = this.f17574l;
        if (d6 != 0.0d) {
            codedOutputStream.writeDouble(8, d6);
        }
        double d7 = this.f17575m;
        if (d7 != 0.0d) {
            codedOutputStream.writeDouble(9, d7);
        }
        if (this.f17576n != C7107b.PROVIDER_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(10, this.f17576n);
        }
    }
}
