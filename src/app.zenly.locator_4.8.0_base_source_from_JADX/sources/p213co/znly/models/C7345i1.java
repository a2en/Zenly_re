package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.C7274d1.C7275a;
import p213co.znly.models.C7284e1.C7285a;
import p213co.znly.models.C7299f1.C7300a;
import p213co.znly.models.C7320g1.C7321a;
import p213co.znly.models.C7333h1.C7334a;
import p213co.znly.models.C7373k1.C7374a;
import p213co.znly.models.PinContextProto$HeadingStripped.C6814a;

/* renamed from: co.znly.models.i1 */
public final class C7345i1 extends GeneratedMessageLite<C7345i1, C7346a> implements PinContextProto$PinContextOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final C7345i1 f18265y = new C7345i1();

    /* renamed from: z */
    private static volatile Parser<C7345i1> f18266z;

    /* renamed from: e */
    private String f18267e = "";

    /* renamed from: f */
    private Timestamp f18268f;

    /* renamed from: g */
    private double f18269g;

    /* renamed from: h */
    private double f18270h;

    /* renamed from: i */
    private int f18271i;

    /* renamed from: j */
    private int f18272j;

    /* renamed from: k */
    private int f18273k;

    /* renamed from: l */
    private C7274d1 f18274l;

    /* renamed from: m */
    private int f18275m;

    /* renamed from: n */
    private C7284e1 f18276n;

    /* renamed from: o */
    private int f18277o;

    /* renamed from: p */
    private C7320g1 f18278p;

    /* renamed from: q */
    private int f18279q;

    /* renamed from: r */
    private C7299f1 f18280r;

    /* renamed from: s */
    private int f18281s;

    /* renamed from: t */
    private C7373k1 f18282t;

    /* renamed from: u */
    private int f18283u;

    /* renamed from: v */
    private C7333h1 f18284v;

    /* renamed from: w */
    private int f18285w;

    /* renamed from: x */
    private PinContextProto$HeadingStripped f18286x;

    /* renamed from: co.znly.models.i1$a */
    public static final class C7346a extends Builder<C7345i1, C7346a> implements PinContextProto$PinContextOrBuilder {
        /* synthetic */ C7346a(C6977c1 c1Var) {
            this();
        }

        public C7364j1 getActivityResult() {
            return ((C7345i1) this.instance).getActivityResult();
        }

        public int getActivityResultValue() {
            return ((C7345i1) this.instance).getActivityResultValue();
        }

        public C7274d1 getActivityStripped() {
            return ((C7345i1) this.instance).getActivityStripped();
        }

        public C7364j1 getBatteryResult() {
            return ((C7345i1) this.instance).getBatteryResult();
        }

        public int getBatteryResultValue() {
            return ((C7345i1) this.instance).getBatteryResultValue();
        }

        public C7284e1 getBatteryStripped() {
            return ((C7345i1) this.instance).getBatteryStripped();
        }

        public Timestamp getCreatedAt() {
            return ((C7345i1) this.instance).getCreatedAt();
        }

        public C7364j1 getElevationResult() {
            return ((C7345i1) this.instance).getElevationResult();
        }

        public int getElevationResultValue() {
            return ((C7345i1) this.instance).getElevationResultValue();
        }

        public C7299f1 getElevationStripped() {
            return ((C7345i1) this.instance).getElevationStripped();
        }

        public C7492v2 getGhostType() {
            return ((C7345i1) this.instance).getGhostType();
        }

        public int getGhostTypeValue() {
            return ((C7345i1) this.instance).getGhostTypeValue();
        }

        public C7364j1 getHeadingResult() {
            return ((C7345i1) this.instance).getHeadingResult();
        }

        public int getHeadingResultValue() {
            return ((C7345i1) this.instance).getHeadingResultValue();
        }

        public PinContextProto$HeadingStripped getHeadingStripped() {
            return ((C7345i1) this.instance).getHeadingStripped();
        }

        public int getHpRaw() {
            return ((C7345i1) this.instance).getHpRaw();
        }

        public double getLatRaw() {
            return ((C7345i1) this.instance).getLatRaw();
        }

        public double getLngRaw() {
            return ((C7345i1) this.instance).getLngRaw();
        }

        public C7364j1 getLocExtraResult() {
            return ((C7345i1) this.instance).getLocExtraResult();
        }

        public int getLocExtraResultValue() {
            return ((C7345i1) this.instance).getLocExtraResultValue();
        }

        public C7320g1 getLocExtraStripped() {
            return ((C7345i1) this.instance).getLocExtraStripped();
        }

        public C7364j1 getPersonalPlaceResult() {
            return ((C7345i1) this.instance).getPersonalPlaceResult();
        }

        public int getPersonalPlaceResultValue() {
            return ((C7345i1) this.instance).getPersonalPlaceResultValue();
        }

        public C7333h1 getPersonalPlaceStripped() {
            return ((C7345i1) this.instance).getPersonalPlaceStripped();
        }

        public String getUserUuid() {
            return ((C7345i1) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7345i1) this.instance).getUserUuidBytes();
        }

        public C7364j1 getWeatherResult() {
            return ((C7345i1) this.instance).getWeatherResult();
        }

        public int getWeatherResultValue() {
            return ((C7345i1) this.instance).getWeatherResultValue();
        }

        public C7373k1 getWeatherStripped() {
            return ((C7345i1) this.instance).getWeatherStripped();
        }

        public boolean hasActivityStripped() {
            return ((C7345i1) this.instance).hasActivityStripped();
        }

        public boolean hasBatteryStripped() {
            return ((C7345i1) this.instance).hasBatteryStripped();
        }

        public boolean hasCreatedAt() {
            return ((C7345i1) this.instance).hasCreatedAt();
        }

        public boolean hasElevationStripped() {
            return ((C7345i1) this.instance).hasElevationStripped();
        }

        public boolean hasHeadingStripped() {
            return ((C7345i1) this.instance).hasHeadingStripped();
        }

        public boolean hasLocExtraStripped() {
            return ((C7345i1) this.instance).hasLocExtraStripped();
        }

        public boolean hasPersonalPlaceStripped() {
            return ((C7345i1) this.instance).hasPersonalPlaceStripped();
        }

        public boolean hasWeatherStripped() {
            return ((C7345i1) this.instance).hasWeatherStripped();
        }

        private C7346a() {
            super(C7345i1.f18265y);
        }
    }

    static {
        f18265y.makeImmutable();
    }

    private C7345i1() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C6977c1.f17211a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7345i1();
            case 2:
                return f18265y;
            case 3:
                return null;
            case 4:
                return new C7346a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7345i1 i1Var = (C7345i1) obj2;
                this.f18267e = visitor.visitString(!this.f18267e.isEmpty(), this.f18267e, !i1Var.f18267e.isEmpty(), i1Var.f18267e);
                this.f18268f = (Timestamp) visitor.visitMessage(this.f18268f, i1Var.f18268f);
                this.f18269g = visitor.visitDouble(this.f18269g != 0.0d, this.f18269g, i1Var.f18269g != 0.0d, i1Var.f18269g);
                this.f18270h = visitor.visitDouble(this.f18270h != 0.0d, this.f18270h, i1Var.f18270h != 0.0d, i1Var.f18270h);
                this.f18271i = visitor.visitInt(this.f18271i != 0, this.f18271i, i1Var.f18271i != 0, i1Var.f18271i);
                this.f18272j = visitor.visitInt(this.f18272j != 0, this.f18272j, i1Var.f18272j != 0, i1Var.f18272j);
                this.f18273k = visitor.visitInt(this.f18273k != 0, this.f18273k, i1Var.f18273k != 0, i1Var.f18273k);
                this.f18274l = (C7274d1) visitor.visitMessage(this.f18274l, i1Var.f18274l);
                this.f18275m = visitor.visitInt(this.f18275m != 0, this.f18275m, i1Var.f18275m != 0, i1Var.f18275m);
                this.f18276n = (C7284e1) visitor.visitMessage(this.f18276n, i1Var.f18276n);
                this.f18277o = visitor.visitInt(this.f18277o != 0, this.f18277o, i1Var.f18277o != 0, i1Var.f18277o);
                this.f18278p = (C7320g1) visitor.visitMessage(this.f18278p, i1Var.f18278p);
                this.f18279q = visitor.visitInt(this.f18279q != 0, this.f18279q, i1Var.f18279q != 0, i1Var.f18279q);
                this.f18280r = (C7299f1) visitor.visitMessage(this.f18280r, i1Var.f18280r);
                this.f18281s = visitor.visitInt(this.f18281s != 0, this.f18281s, i1Var.f18281s != 0, i1Var.f18281s);
                this.f18282t = (C7373k1) visitor.visitMessage(this.f18282t, i1Var.f18282t);
                this.f18283u = visitor.visitInt(this.f18283u != 0, this.f18283u, i1Var.f18283u != 0, i1Var.f18283u);
                this.f18284v = (C7333h1) visitor.visitMessage(this.f18284v, i1Var.f18284v);
                boolean z2 = this.f18285w != 0;
                int i = this.f18285w;
                if (i1Var.f18285w != 0) {
                    z = true;
                }
                this.f18285w = visitor.visitInt(z2, i, z, i1Var.f18285w);
                this.f18286x = (PinContextProto$HeadingStripped) visitor.visitMessage(this.f18286x, i1Var.f18286x);
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
                            case 18:
                                this.f18267e = codedInputStream.readStringRequireUtf8();
                                break;
                            case 26:
                                Builder builder = this.f18268f != null ? (Timestamp.Builder) this.f18268f.toBuilder() : null;
                                this.f18268f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f18268f);
                                    this.f18268f = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 33:
                                this.f18269g = codedInputStream.readDouble();
                                break;
                            case 41:
                                this.f18270h = codedInputStream.readDouble();
                                break;
                            case 48:
                                this.f18271i = codedInputStream.readInt32();
                                break;
                            case 56:
                                this.f18272j = codedInputStream.readEnum();
                                break;
                            case 800:
                                this.f18273k = codedInputStream.readEnum();
                                break;
                            case 810:
                                Builder builder2 = this.f18274l != null ? (C7275a) this.f18274l.toBuilder() : null;
                                this.f18274l = (C7274d1) codedInputStream.readMessage(C7274d1.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f18274l);
                                    this.f18274l = (C7274d1) builder2.buildPartial();
                                    break;
                                }
                            case 880:
                                this.f18275m = codedInputStream.readEnum();
                                break;
                            case 890:
                                Builder builder3 = this.f18276n != null ? (C7285a) this.f18276n.toBuilder() : null;
                                this.f18276n = (C7284e1) codedInputStream.readMessage(C7284e1.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f18276n);
                                    this.f18276n = (C7284e1) builder3.buildPartial();
                                    break;
                                }
                            case 960:
                                this.f18277o = codedInputStream.readEnum();
                                break;
                            case 970:
                                Builder builder4 = this.f18278p != null ? (C7321a) this.f18278p.toBuilder() : null;
                                this.f18278p = (C7320g1) codedInputStream.readMessage(C7320g1.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f18278p);
                                    this.f18278p = (C7320g1) builder4.buildPartial();
                                    break;
                                }
                            case 1040:
                                this.f18279q = codedInputStream.readEnum();
                                break;
                            case 1050:
                                Builder builder5 = this.f18280r != null ? (C7300a) this.f18280r.toBuilder() : null;
                                this.f18280r = (C7299f1) codedInputStream.readMessage(C7299f1.parser(), extensionRegistryLite);
                                if (builder5 == null) {
                                    break;
                                } else {
                                    builder5.mergeFrom(this.f18280r);
                                    this.f18280r = (C7299f1) builder5.buildPartial();
                                    break;
                                }
                            case 1280:
                                this.f18281s = codedInputStream.readEnum();
                                break;
                            case 1290:
                                Builder builder6 = this.f18282t != null ? (C7374a) this.f18282t.toBuilder() : null;
                                this.f18282t = (C7373k1) codedInputStream.readMessage(C7373k1.parser(), extensionRegistryLite);
                                if (builder6 == null) {
                                    break;
                                } else {
                                    builder6.mergeFrom(this.f18282t);
                                    this.f18282t = (C7373k1) builder6.buildPartial();
                                    break;
                                }
                            case 1360:
                                this.f18283u = codedInputStream.readEnum();
                                break;
                            case 1370:
                                Builder builder7 = this.f18284v != null ? (C7334a) this.f18284v.toBuilder() : null;
                                this.f18284v = (C7333h1) codedInputStream.readMessage(C7333h1.parser(), extensionRegistryLite);
                                if (builder7 == null) {
                                    break;
                                } else {
                                    builder7.mergeFrom(this.f18284v);
                                    this.f18284v = (C7333h1) builder7.buildPartial();
                                    break;
                                }
                            case 1440:
                                this.f18285w = codedInputStream.readEnum();
                                break;
                            case 1450:
                                Builder builder8 = this.f18286x != null ? (C6814a) this.f18286x.toBuilder() : null;
                                this.f18286x = (PinContextProto$HeadingStripped) codedInputStream.readMessage(PinContextProto$HeadingStripped.parser(), extensionRegistryLite);
                                if (builder8 == null) {
                                    break;
                                } else {
                                    builder8.mergeFrom(this.f18286x);
                                    this.f18286x = (PinContextProto$HeadingStripped) builder8.buildPartial();
                                    break;
                                }
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
                if (f18266z == null) {
                    synchronized (C7345i1.class) {
                        if (f18266z == null) {
                            f18266z = new DefaultInstanceBasedParser(f18265y);
                        }
                    }
                }
                return f18266z;
            default:
                throw new UnsupportedOperationException();
        }
        return f18265y;
    }

    public C7364j1 getActivityResult() {
        C7364j1 a = C7364j1.m18059a(this.f18273k);
        return a == null ? C7364j1.UNRECOGNIZED : a;
    }

    public int getActivityResultValue() {
        return this.f18273k;
    }

    public C7274d1 getActivityStripped() {
        C7274d1 d1Var = this.f18274l;
        return d1Var == null ? C7274d1.getDefaultInstance() : d1Var;
    }

    public C7364j1 getBatteryResult() {
        C7364j1 a = C7364j1.m18059a(this.f18275m);
        return a == null ? C7364j1.UNRECOGNIZED : a;
    }

    public int getBatteryResultValue() {
        return this.f18275m;
    }

    public C7284e1 getBatteryStripped() {
        C7284e1 e1Var = this.f18276n;
        return e1Var == null ? C7284e1.getDefaultInstance() : e1Var;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f18268f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public C7364j1 getElevationResult() {
        C7364j1 a = C7364j1.m18059a(this.f18279q);
        return a == null ? C7364j1.UNRECOGNIZED : a;
    }

    public int getElevationResultValue() {
        return this.f18279q;
    }

    public C7299f1 getElevationStripped() {
        C7299f1 f1Var = this.f18280r;
        return f1Var == null ? C7299f1.getDefaultInstance() : f1Var;
    }

    public C7492v2 getGhostType() {
        C7492v2 a = C7492v2.m18118a(this.f18272j);
        return a == null ? C7492v2.UNRECOGNIZED : a;
    }

    public int getGhostTypeValue() {
        return this.f18272j;
    }

    public C7364j1 getHeadingResult() {
        C7364j1 a = C7364j1.m18059a(this.f18285w);
        return a == null ? C7364j1.UNRECOGNIZED : a;
    }

    public int getHeadingResultValue() {
        return this.f18285w;
    }

    public PinContextProto$HeadingStripped getHeadingStripped() {
        PinContextProto$HeadingStripped pinContextProto$HeadingStripped = this.f18286x;
        return pinContextProto$HeadingStripped == null ? PinContextProto$HeadingStripped.getDefaultInstance() : pinContextProto$HeadingStripped;
    }

    public int getHpRaw() {
        return this.f18271i;
    }

    public double getLatRaw() {
        return this.f18269g;
    }

    public double getLngRaw() {
        return this.f18270h;
    }

    public C7364j1 getLocExtraResult() {
        C7364j1 a = C7364j1.m18059a(this.f18277o);
        return a == null ? C7364j1.UNRECOGNIZED : a;
    }

    public int getLocExtraResultValue() {
        return this.f18277o;
    }

    public C7320g1 getLocExtraStripped() {
        C7320g1 g1Var = this.f18278p;
        return g1Var == null ? C7320g1.getDefaultInstance() : g1Var;
    }

    public C7364j1 getPersonalPlaceResult() {
        C7364j1 a = C7364j1.m18059a(this.f18283u);
        return a == null ? C7364j1.UNRECOGNIZED : a;
    }

    public int getPersonalPlaceResultValue() {
        return this.f18283u;
    }

    public C7333h1 getPersonalPlaceStripped() {
        C7333h1 h1Var = this.f18284v;
        return h1Var == null ? C7333h1.getDefaultInstance() : h1Var;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18267e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(2, getUserUuid());
        }
        if (this.f18268f != null) {
            i2 += CodedOutputStream.computeMessageSize(3, getCreatedAt());
        }
        double d = this.f18269g;
        if (d != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(4, d);
        }
        double d2 = this.f18270h;
        if (d2 != 0.0d) {
            i2 += CodedOutputStream.computeDoubleSize(5, d2);
        }
        int i3 = this.f18271i;
        if (i3 != 0) {
            i2 += CodedOutputStream.computeInt32Size(6, i3);
        }
        if (this.f18272j != C7492v2.noghost.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(7, this.f18272j);
        }
        if (this.f18273k != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(100, this.f18273k);
        }
        if (this.f18274l != null) {
            i2 += CodedOutputStream.computeMessageSize(101, getActivityStripped());
        }
        if (this.f18275m != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(110, this.f18275m);
        }
        if (this.f18276n != null) {
            i2 += CodedOutputStream.computeMessageSize(111, getBatteryStripped());
        }
        if (this.f18277o != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(120, this.f18277o);
        }
        if (this.f18278p != null) {
            i2 += CodedOutputStream.computeMessageSize(121, getLocExtraStripped());
        }
        if (this.f18279q != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(130, this.f18279q);
        }
        if (this.f18280r != null) {
            i2 += CodedOutputStream.computeMessageSize(131, getElevationStripped());
        }
        if (this.f18281s != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(160, this.f18281s);
        }
        if (this.f18282t != null) {
            i2 += CodedOutputStream.computeMessageSize(161, getWeatherStripped());
        }
        if (this.f18283u != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(170, this.f18283u);
        }
        if (this.f18284v != null) {
            i2 += CodedOutputStream.computeMessageSize(171, getPersonalPlaceStripped());
        }
        if (this.f18285w != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(180, this.f18285w);
        }
        if (this.f18286x != null) {
            i2 += CodedOutputStream.computeMessageSize(181, getHeadingStripped());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public String getUserUuid() {
        return this.f18267e;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18267e);
    }

    public C7364j1 getWeatherResult() {
        C7364j1 a = C7364j1.m18059a(this.f18281s);
        return a == null ? C7364j1.UNRECOGNIZED : a;
    }

    public int getWeatherResultValue() {
        return this.f18281s;
    }

    public C7373k1 getWeatherStripped() {
        C7373k1 k1Var = this.f18282t;
        return k1Var == null ? C7373k1.getDefaultInstance() : k1Var;
    }

    public boolean hasActivityStripped() {
        return this.f18274l != null;
    }

    public boolean hasBatteryStripped() {
        return this.f18276n != null;
    }

    public boolean hasCreatedAt() {
        return this.f18268f != null;
    }

    public boolean hasElevationStripped() {
        return this.f18280r != null;
    }

    public boolean hasHeadingStripped() {
        return this.f18286x != null;
    }

    public boolean hasLocExtraStripped() {
        return this.f18278p != null;
    }

    public boolean hasPersonalPlaceStripped() {
        return this.f18284v != null;
    }

    public boolean hasWeatherStripped() {
        return this.f18282t != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18267e.isEmpty()) {
            codedOutputStream.writeString(2, getUserUuid());
        }
        if (this.f18268f != null) {
            codedOutputStream.writeMessage(3, getCreatedAt());
        }
        double d = this.f18269g;
        if (d != 0.0d) {
            codedOutputStream.writeDouble(4, d);
        }
        double d2 = this.f18270h;
        if (d2 != 0.0d) {
            codedOutputStream.writeDouble(5, d2);
        }
        int i = this.f18271i;
        if (i != 0) {
            codedOutputStream.writeInt32(6, i);
        }
        if (this.f18272j != C7492v2.noghost.getNumber()) {
            codedOutputStream.writeEnum(7, this.f18272j);
        }
        if (this.f18273k != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(100, this.f18273k);
        }
        if (this.f18274l != null) {
            codedOutputStream.writeMessage(101, getActivityStripped());
        }
        if (this.f18275m != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(110, this.f18275m);
        }
        if (this.f18276n != null) {
            codedOutputStream.writeMessage(111, getBatteryStripped());
        }
        if (this.f18277o != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(120, this.f18277o);
        }
        if (this.f18278p != null) {
            codedOutputStream.writeMessage(121, getLocExtraStripped());
        }
        if (this.f18279q != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(130, this.f18279q);
        }
        if (this.f18280r != null) {
            codedOutputStream.writeMessage(131, getElevationStripped());
        }
        if (this.f18281s != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(160, this.f18281s);
        }
        if (this.f18282t != null) {
            codedOutputStream.writeMessage(161, getWeatherStripped());
        }
        if (this.f18283u != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(170, this.f18283u);
        }
        if (this.f18284v != null) {
            codedOutputStream.writeMessage(171, getPersonalPlaceStripped());
        }
        if (this.f18285w != C7364j1.PIN_CONTEXT_RESULT_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(180, this.f18285w);
        }
        if (this.f18286x != null) {
            codedOutputStream.writeMessage(181, getHeadingStripped());
        }
    }
}
