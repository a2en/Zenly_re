package p213co.znly.models;

import java.io.IOException;
import p213co.znly.core.vendor.com.google.protobuf.ByteString;
import p213co.znly.core.vendor.com.google.protobuf.CodedInputStream;
import p213co.znly.core.vendor.com.google.protobuf.CodedOutputStream;
import p213co.znly.core.vendor.com.google.protobuf.Duration;
import p213co.znly.core.vendor.com.google.protobuf.ExtensionRegistryLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.Builder;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite.MethodToInvoke;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLite;
import p213co.znly.core.vendor.com.google.protobuf.Internal.EnumLiteMap;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.core.vendor.com.google.protobuf.Parser;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;

/* renamed from: co.znly.models.s */
public final class C7458s extends GeneratedMessageLite<C7458s, C7459a> implements DeviceProto$DeviceOrBuilder {
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final C7458s f18662C = new C7458s();

    /* renamed from: D */
    private static volatile Parser<C7458s> f18663D;

    /* renamed from: A */
    private String f18664A;

    /* renamed from: B */
    private String f18665B;

    /* renamed from: e */
    private String f18666e;

    /* renamed from: f */
    private Timestamp f18667f;

    /* renamed from: g */
    private Timestamp f18668g;

    /* renamed from: h */
    private String f18669h;

    /* renamed from: i */
    private String f18670i;

    /* renamed from: j */
    private int f18671j;

    /* renamed from: k */
    private String f18672k;

    /* renamed from: l */
    private String f18673l;

    /* renamed from: m */
    private String f18674m;

    /* renamed from: n */
    private String f18675n;

    /* renamed from: o */
    private String f18676o;

    /* renamed from: p */
    private String f18677p;

    /* renamed from: q */
    private String f18678q;

    /* renamed from: r */
    private String f18679r;

    /* renamed from: s */
    private int f18680s;

    /* renamed from: t */
    private int f18681t;

    /* renamed from: u */
    private int f18682u;

    /* renamed from: v */
    private int f18683v;

    /* renamed from: w */
    private Duration f18684w;

    /* renamed from: x */
    private Duration f18685x;

    /* renamed from: y */
    private int f18686y;

    /* renamed from: z */
    private String f18687z;

    /* renamed from: co.znly.models.s$a */
    public static final class C7459a extends Builder<C7458s, C7459a> implements DeviceProto$DeviceOrBuilder {
        /* synthetic */ C7459a(C7444q qVar) {
            this();
        }

        public String getAdvertisingId() {
            return ((C7458s) this.instance).getAdvertisingId();
        }

        public ByteString getAdvertisingIdBytes() {
            return ((C7458s) this.instance).getAdvertisingIdBytes();
        }

        public String getAppBundle() {
            return ((C7458s) this.instance).getAppBundle();
        }

        public ByteString getAppBundleBytes() {
            return ((C7458s) this.instance).getAppBundleBytes();
        }

        public String getAppFlavor() {
            return ((C7458s) this.instance).getAppFlavor();
        }

        public ByteString getAppFlavorBytes() {
            return ((C7458s) this.instance).getAppFlavorBytes();
        }

        public String getAppVersion() {
            return ((C7458s) this.instance).getAppVersion();
        }

        public ByteString getAppVersionBytes() {
            return ((C7458s) this.instance).getAppVersionBytes();
        }

        public String getAppsflyerId() {
            return ((C7458s) this.instance).getAppsflyerId();
        }

        public ByteString getAppsflyerIdBytes() {
            return ((C7458s) this.instance).getAppsflyerIdBytes();
        }

        public C7450r getContactsAuthorizationStatus() {
            return ((C7458s) this.instance).getContactsAuthorizationStatus();
        }

        public int getContactsAuthorizationStatusValue() {
            return ((C7458s) this.instance).getContactsAuthorizationStatusValue();
        }

        public String getCoreVersion() {
            return ((C7458s) this.instance).getCoreVersion();
        }

        public ByteString getCoreVersionBytes() {
            return ((C7458s) this.instance).getCoreVersionBytes();
        }

        public Timestamp getCreatedAt() {
            return ((C7458s) this.instance).getCreatedAt();
        }

        public String getLocale() {
            return ((C7458s) this.instance).getLocale();
        }

        public ByteString getLocaleBytes() {
            return ((C7458s) this.instance).getLocaleBytes();
        }

        public C7450r getLocationAuthorizationStatus() {
            return ((C7458s) this.instance).getLocationAuthorizationStatus();
        }

        public int getLocationAuthorizationStatusValue() {
            return ((C7458s) this.instance).getLocationAuthorizationStatusValue();
        }

        public String getModel() {
            return ((C7458s) this.instance).getModel();
        }

        public ByteString getModelBytes() {
            return ((C7458s) this.instance).getModelBytes();
        }

        public String getOsUuid() {
            return ((C7458s) this.instance).getOsUuid();
        }

        public ByteString getOsUuidBytes() {
            return ((C7458s) this.instance).getOsUuidBytes();
        }

        public String getOsVersion() {
            return ((C7458s) this.instance).getOsVersion();
        }

        public ByteString getOsVersionBytes() {
            return ((C7458s) this.instance).getOsVersionBytes();
        }

        public Duration getPingInterval() {
            return ((C7458s) this.instance).getPingInterval();
        }

        public C7450r getPushAuthorizationStatus() {
            return ((C7458s) this.instance).getPushAuthorizationStatus();
        }

        public int getPushAuthorizationStatusValue() {
            return ((C7458s) this.instance).getPushAuthorizationStatusValue();
        }

        public String getPushToken() {
            return ((C7458s) this.instance).getPushToken();
        }

        public ByteString getPushTokenBytes() {
            return ((C7458s) this.instance).getPushTokenBytes();
        }

        public String getPushkitToken() {
            return ((C7458s) this.instance).getPushkitToken();
        }

        public ByteString getPushkitTokenBytes() {
            return ((C7458s) this.instance).getPushkitTokenBytes();
        }

        public Duration getReachableTimeout() {
            return ((C7458s) this.instance).getReachableTimeout();
        }

        public C7460b getTamperState() {
            return ((C7458s) this.instance).getTamperState();
        }

        public int getTamperStateValue() {
            return ((C7458s) this.instance).getTamperStateValue();
        }

        public C7486v getType() {
            return ((C7458s) this.instance).getType();
        }

        public int getTypeValue() {
            return ((C7458s) this.instance).getTypeValue();
        }

        public Timestamp getUpdatedAt() {
            return ((C7458s) this.instance).getUpdatedAt();
        }

        public String getUserUuid() {
            return ((C7458s) this.instance).getUserUuid();
        }

        public ByteString getUserUuidBytes() {
            return ((C7458s) this.instance).getUserUuidBytes();
        }

        public String getUuid() {
            return ((C7458s) this.instance).getUuid();
        }

        public ByteString getUuidBytes() {
            return ((C7458s) this.instance).getUuidBytes();
        }

        public C7478u getZenlyStatus() {
            return ((C7458s) this.instance).getZenlyStatus();
        }

        public int getZenlyStatusValue() {
            return ((C7458s) this.instance).getZenlyStatusValue();
        }

        public boolean hasCreatedAt() {
            return ((C7458s) this.instance).hasCreatedAt();
        }

        public boolean hasPingInterval() {
            return ((C7458s) this.instance).hasPingInterval();
        }

        public boolean hasReachableTimeout() {
            return ((C7458s) this.instance).hasReachableTimeout();
        }

        public boolean hasUpdatedAt() {
            return ((C7458s) this.instance).hasUpdatedAt();
        }

        private C7459a() {
            super(C7458s.f18662C);
        }
    }

    /* renamed from: co.znly.models.s$b */
    public enum C7460b implements EnumLite {
        TAMPER_STATE_UNKNOWN(0),
        TAMPER_STATE_UNTAMPERED(1),
        TAMPER_STATE_TAMPERED(2),
        UNRECOGNIZED(-1);
        

        /* renamed from: e */
        private final int f18693e;

        /* renamed from: co.znly.models.s$b$a */
        class C7461a implements EnumLiteMap<C7460b> {
            C7461a() {
            }

            public C7460b findValueByNumber(int i) {
                return C7460b.m18104a(i);
            }
        }

        static {
            new C7461a();
        }

        private C7460b(int i) {
            this.f18693e = i;
        }

        /* renamed from: a */
        public static C7460b m18104a(int i) {
            if (i == 0) {
                return TAMPER_STATE_UNKNOWN;
            }
            if (i == 1) {
                return TAMPER_STATE_UNTAMPERED;
            }
            if (i != 2) {
                return null;
            }
            return TAMPER_STATE_TAMPERED;
        }

        public final int getNumber() {
            return this.f18693e;
        }
    }

    static {
        f18662C.makeImmutable();
    }

    private C7458s() {
        String str = "";
        this.f18666e = str;
        this.f18669h = str;
        this.f18670i = str;
        this.f18672k = str;
        this.f18673l = str;
        this.f18674m = str;
        this.f18675n = str;
        this.f18676o = str;
        this.f18677p = str;
        this.f18678q = str;
        this.f18679r = str;
        this.f18687z = str;
        this.f18664A = str;
        this.f18665B = str;
    }

    public static C7458s getDefaultInstance() {
        return f18662C;
    }

    public static C7459a newBuilder() {
        return (C7459a) f18662C.toBuilder();
    }

    public static Parser<C7458s> parser() {
        return f18662C.getParserForType();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        boolean z = false;
        switch (C7444q.f18621a[methodToInvoke.ordinal()]) {
            case 1:
                return new C7458s();
            case 2:
                return f18662C;
            case 3:
                return null;
            case 4:
                return new C7459a(null);
            case 5:
                Visitor visitor = (Visitor) obj;
                C7458s sVar = (C7458s) obj2;
                this.f18666e = visitor.visitString(!this.f18666e.isEmpty(), this.f18666e, !sVar.f18666e.isEmpty(), sVar.f18666e);
                this.f18667f = (Timestamp) visitor.visitMessage(this.f18667f, sVar.f18667f);
                this.f18668g = (Timestamp) visitor.visitMessage(this.f18668g, sVar.f18668g);
                this.f18669h = visitor.visitString(!this.f18669h.isEmpty(), this.f18669h, !sVar.f18669h.isEmpty(), sVar.f18669h);
                this.f18670i = visitor.visitString(!this.f18670i.isEmpty(), this.f18670i, !sVar.f18670i.isEmpty(), sVar.f18670i);
                this.f18671j = visitor.visitInt(this.f18671j != 0, this.f18671j, sVar.f18671j != 0, sVar.f18671j);
                this.f18672k = visitor.visitString(!this.f18672k.isEmpty(), this.f18672k, !sVar.f18672k.isEmpty(), sVar.f18672k);
                this.f18673l = visitor.visitString(!this.f18673l.isEmpty(), this.f18673l, !sVar.f18673l.isEmpty(), sVar.f18673l);
                this.f18674m = visitor.visitString(!this.f18674m.isEmpty(), this.f18674m, !sVar.f18674m.isEmpty(), sVar.f18674m);
                this.f18675n = visitor.visitString(!this.f18675n.isEmpty(), this.f18675n, !sVar.f18675n.isEmpty(), sVar.f18675n);
                this.f18676o = visitor.visitString(!this.f18676o.isEmpty(), this.f18676o, !sVar.f18676o.isEmpty(), sVar.f18676o);
                this.f18677p = visitor.visitString(!this.f18677p.isEmpty(), this.f18677p, !sVar.f18677p.isEmpty(), sVar.f18677p);
                this.f18678q = visitor.visitString(!this.f18678q.isEmpty(), this.f18678q, !sVar.f18678q.isEmpty(), sVar.f18678q);
                this.f18679r = visitor.visitString(!this.f18679r.isEmpty(), this.f18679r, !sVar.f18679r.isEmpty(), sVar.f18679r);
                this.f18680s = visitor.visitInt(this.f18680s != 0, this.f18680s, sVar.f18680s != 0, sVar.f18680s);
                this.f18681t = visitor.visitInt(this.f18681t != 0, this.f18681t, sVar.f18681t != 0, sVar.f18681t);
                this.f18682u = visitor.visitInt(this.f18682u != 0, this.f18682u, sVar.f18682u != 0, sVar.f18682u);
                this.f18683v = visitor.visitInt(this.f18683v != 0, this.f18683v, sVar.f18683v != 0, sVar.f18683v);
                this.f18684w = (Duration) visitor.visitMessage(this.f18684w, sVar.f18684w);
                this.f18685x = (Duration) visitor.visitMessage(this.f18685x, sVar.f18685x);
                boolean z2 = this.f18686y != 0;
                int i = this.f18686y;
                if (sVar.f18686y != 0) {
                    z = true;
                }
                this.f18686y = visitor.visitInt(z2, i, z, sVar.f18686y);
                this.f18687z = visitor.visitString(!this.f18687z.isEmpty(), this.f18687z, !sVar.f18687z.isEmpty(), sVar.f18687z);
                this.f18664A = visitor.visitString(!this.f18664A.isEmpty(), this.f18664A, !sVar.f18664A.isEmpty(), sVar.f18664A);
                this.f18665B = visitor.visitString(!this.f18665B.isEmpty(), this.f18665B, !sVar.f18665B.isEmpty(), sVar.f18665B);
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
                            case 10:
                                this.f18666e = codedInputStream.readStringRequireUtf8();
                                break;
                            case 18:
                                Builder builder = this.f18667f != null ? (Timestamp.Builder) this.f18667f.toBuilder() : null;
                                this.f18667f = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder == null) {
                                    break;
                                } else {
                                    builder.mergeFrom(this.f18667f);
                                    this.f18667f = (Timestamp) builder.buildPartial();
                                    break;
                                }
                            case 26:
                                this.f18669h = codedInputStream.readStringRequireUtf8();
                                break;
                            case 34:
                                this.f18670i = codedInputStream.readStringRequireUtf8();
                                break;
                            case 40:
                                this.f18671j = codedInputStream.readEnum();
                                break;
                            case 50:
                                this.f18672k = codedInputStream.readStringRequireUtf8();
                                break;
                            case 58:
                                this.f18673l = codedInputStream.readStringRequireUtf8();
                                break;
                            case 66:
                                this.f18674m = codedInputStream.readStringRequireUtf8();
                                break;
                            case 74:
                                this.f18675n = codedInputStream.readStringRequireUtf8();
                                break;
                            case 82:
                                this.f18676o = codedInputStream.readStringRequireUtf8();
                                break;
                            case 90:
                                this.f18678q = codedInputStream.readStringRequireUtf8();
                                break;
                            case 98:
                                this.f18679r = codedInputStream.readStringRequireUtf8();
                                break;
                            case 104:
                                this.f18680s = codedInputStream.readEnum();
                                break;
                            case 112:
                                this.f18681t = codedInputStream.readEnum();
                                break;
                            case 120:
                                this.f18683v = codedInputStream.readEnum();
                                break;
                            case 130:
                                Builder builder2 = this.f18684w != null ? (Duration.Builder) this.f18684w.toBuilder() : null;
                                this.f18684w = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder2 == null) {
                                    break;
                                } else {
                                    builder2.mergeFrom(this.f18684w);
                                    this.f18684w = (Duration) builder2.buildPartial();
                                    break;
                                }
                            case 138:
                                Builder builder3 = this.f18685x != null ? (Duration.Builder) this.f18685x.toBuilder() : null;
                                this.f18685x = (Duration) codedInputStream.readMessage(Duration.parser(), extensionRegistryLite);
                                if (builder3 == null) {
                                    break;
                                } else {
                                    builder3.mergeFrom(this.f18685x);
                                    this.f18685x = (Duration) builder3.buildPartial();
                                    break;
                                }
                            case 144:
                                this.f18682u = codedInputStream.readEnum();
                                break;
                            case 154:
                                Builder builder4 = this.f18668g != null ? (Timestamp.Builder) this.f18668g.toBuilder() : null;
                                this.f18668g = (Timestamp) codedInputStream.readMessage(Timestamp.parser(), extensionRegistryLite);
                                if (builder4 == null) {
                                    break;
                                } else {
                                    builder4.mergeFrom(this.f18668g);
                                    this.f18668g = (Timestamp) builder4.buildPartial();
                                    break;
                                }
                            case 162:
                                this.f18677p = codedInputStream.readStringRequireUtf8();
                                break;
                            case 168:
                                this.f18686y = codedInputStream.readEnum();
                                break;
                            case 178:
                                this.f18687z = codedInputStream.readStringRequireUtf8();
                                break;
                            case 186:
                                this.f18664A = codedInputStream.readStringRequireUtf8();
                                break;
                            case 194:
                                this.f18665B = codedInputStream.readStringRequireUtf8();
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
                if (f18663D == null) {
                    synchronized (C7458s.class) {
                        if (f18663D == null) {
                            f18663D = new DefaultInstanceBasedParser(f18662C);
                        }
                    }
                }
                return f18663D;
            default:
                throw new UnsupportedOperationException();
        }
        return f18662C;
    }

    public String getAdvertisingId() {
        return this.f18664A;
    }

    public ByteString getAdvertisingIdBytes() {
        return ByteString.copyFromUtf8(this.f18664A);
    }

    public String getAppBundle() {
        return this.f18687z;
    }

    public ByteString getAppBundleBytes() {
        return ByteString.copyFromUtf8(this.f18687z);
    }

    public String getAppFlavor() {
        return this.f18679r;
    }

    public ByteString getAppFlavorBytes() {
        return ByteString.copyFromUtf8(this.f18679r);
    }

    public String getAppVersion() {
        return this.f18678q;
    }

    public ByteString getAppVersionBytes() {
        return ByteString.copyFromUtf8(this.f18678q);
    }

    public String getAppsflyerId() {
        return this.f18665B;
    }

    public ByteString getAppsflyerIdBytes() {
        return ByteString.copyFromUtf8(this.f18665B);
    }

    public C7450r getContactsAuthorizationStatus() {
        C7450r a = C7450r.m18099a(this.f18681t);
        return a == null ? C7450r.UNRECOGNIZED : a;
    }

    public int getContactsAuthorizationStatusValue() {
        return this.f18681t;
    }

    public String getCoreVersion() {
        return this.f18677p;
    }

    public ByteString getCoreVersionBytes() {
        return ByteString.copyFromUtf8(this.f18677p);
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.f18667f;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getLocale() {
        return this.f18673l;
    }

    public ByteString getLocaleBytes() {
        return ByteString.copyFromUtf8(this.f18673l);
    }

    public C7450r getLocationAuthorizationStatus() {
        C7450r a = C7450r.m18099a(this.f18680s);
        return a == null ? C7450r.UNRECOGNIZED : a;
    }

    public int getLocationAuthorizationStatusValue() {
        return this.f18680s;
    }

    public String getModel() {
        return this.f18672k;
    }

    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.f18672k);
    }

    public String getOsUuid() {
        return this.f18670i;
    }

    public ByteString getOsUuidBytes() {
        return ByteString.copyFromUtf8(this.f18670i);
    }

    public String getOsVersion() {
        return this.f18676o;
    }

    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.f18676o);
    }

    public Duration getPingInterval() {
        Duration duration = this.f18684w;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public C7450r getPushAuthorizationStatus() {
        C7450r a = C7450r.m18099a(this.f18682u);
        return a == null ? C7450r.UNRECOGNIZED : a;
    }

    public int getPushAuthorizationStatusValue() {
        return this.f18682u;
    }

    public String getPushToken() {
        return this.f18674m;
    }

    public ByteString getPushTokenBytes() {
        return ByteString.copyFromUtf8(this.f18674m);
    }

    public String getPushkitToken() {
        return this.f18675n;
    }

    public ByteString getPushkitTokenBytes() {
        return ByteString.copyFromUtf8(this.f18675n);
    }

    public Duration getReachableTimeout() {
        Duration duration = this.f18685x;
        return duration == null ? Duration.getDefaultInstance() : duration;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if (!this.f18666e.isEmpty()) {
            i2 = 0 + CodedOutputStream.computeStringSize(1, getUuid());
        }
        if (this.f18667f != null) {
            i2 += CodedOutputStream.computeMessageSize(2, getCreatedAt());
        }
        if (!this.f18669h.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(3, getUserUuid());
        }
        if (!this.f18670i.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(4, getOsUuid());
        }
        if (this.f18671j != C7486v.dt_none.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(5, this.f18671j);
        }
        if (!this.f18672k.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(6, getModel());
        }
        if (!this.f18673l.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(7, getLocale());
        }
        if (!this.f18674m.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(8, getPushToken());
        }
        if (!this.f18675n.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(9, getPushkitToken());
        }
        if (!this.f18676o.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(10, getOsVersion());
        }
        if (!this.f18678q.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(11, getAppVersion());
        }
        if (!this.f18679r.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(12, getAppFlavor());
        }
        if (this.f18680s != C7450r.none.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(13, this.f18680s);
        }
        if (this.f18681t != C7450r.none.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(14, this.f18681t);
        }
        if (this.f18683v != C7478u.unknown.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(15, this.f18683v);
        }
        if (this.f18684w != null) {
            i2 += CodedOutputStream.computeMessageSize(16, getPingInterval());
        }
        if (this.f18685x != null) {
            i2 += CodedOutputStream.computeMessageSize(17, getReachableTimeout());
        }
        if (this.f18682u != C7450r.none.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(18, this.f18682u);
        }
        if (this.f18668g != null) {
            i2 += CodedOutputStream.computeMessageSize(19, getUpdatedAt());
        }
        if (!this.f18677p.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(20, getCoreVersion());
        }
        if (this.f18686y != C7460b.TAMPER_STATE_UNKNOWN.getNumber()) {
            i2 += CodedOutputStream.computeEnumSize(21, this.f18686y);
        }
        if (!this.f18687z.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(22, getAppBundle());
        }
        if (!this.f18664A.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(23, getAdvertisingId());
        }
        if (!this.f18665B.isEmpty()) {
            i2 += CodedOutputStream.computeStringSize(24, getAppsflyerId());
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public C7460b getTamperState() {
        C7460b a = C7460b.m18104a(this.f18686y);
        return a == null ? C7460b.UNRECOGNIZED : a;
    }

    public int getTamperStateValue() {
        return this.f18686y;
    }

    public C7486v getType() {
        C7486v a = C7486v.m18115a(this.f18671j);
        return a == null ? C7486v.UNRECOGNIZED : a;
    }

    public int getTypeValue() {
        return this.f18671j;
    }

    public Timestamp getUpdatedAt() {
        Timestamp timestamp = this.f18668g;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUserUuid() {
        return this.f18669h;
    }

    public ByteString getUserUuidBytes() {
        return ByteString.copyFromUtf8(this.f18669h);
    }

    public String getUuid() {
        return this.f18666e;
    }

    public ByteString getUuidBytes() {
        return ByteString.copyFromUtf8(this.f18666e);
    }

    public C7478u getZenlyStatus() {
        C7478u a = C7478u.m18111a(this.f18683v);
        return a == null ? C7478u.UNRECOGNIZED : a;
    }

    public int getZenlyStatusValue() {
        return this.f18683v;
    }

    public boolean hasCreatedAt() {
        return this.f18667f != null;
    }

    public boolean hasPingInterval() {
        return this.f18684w != null;
    }

    public boolean hasReachableTimeout() {
        return this.f18685x != null;
    }

    public boolean hasUpdatedAt() {
        return this.f18668g != null;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        if (!this.f18666e.isEmpty()) {
            codedOutputStream.writeString(1, getUuid());
        }
        if (this.f18667f != null) {
            codedOutputStream.writeMessage(2, getCreatedAt());
        }
        if (!this.f18669h.isEmpty()) {
            codedOutputStream.writeString(3, getUserUuid());
        }
        if (!this.f18670i.isEmpty()) {
            codedOutputStream.writeString(4, getOsUuid());
        }
        if (this.f18671j != C7486v.dt_none.getNumber()) {
            codedOutputStream.writeEnum(5, this.f18671j);
        }
        if (!this.f18672k.isEmpty()) {
            codedOutputStream.writeString(6, getModel());
        }
        if (!this.f18673l.isEmpty()) {
            codedOutputStream.writeString(7, getLocale());
        }
        if (!this.f18674m.isEmpty()) {
            codedOutputStream.writeString(8, getPushToken());
        }
        if (!this.f18675n.isEmpty()) {
            codedOutputStream.writeString(9, getPushkitToken());
        }
        if (!this.f18676o.isEmpty()) {
            codedOutputStream.writeString(10, getOsVersion());
        }
        if (!this.f18678q.isEmpty()) {
            codedOutputStream.writeString(11, getAppVersion());
        }
        if (!this.f18679r.isEmpty()) {
            codedOutputStream.writeString(12, getAppFlavor());
        }
        if (this.f18680s != C7450r.none.getNumber()) {
            codedOutputStream.writeEnum(13, this.f18680s);
        }
        if (this.f18681t != C7450r.none.getNumber()) {
            codedOutputStream.writeEnum(14, this.f18681t);
        }
        if (this.f18683v != C7478u.unknown.getNumber()) {
            codedOutputStream.writeEnum(15, this.f18683v);
        }
        if (this.f18684w != null) {
            codedOutputStream.writeMessage(16, getPingInterval());
        }
        if (this.f18685x != null) {
            codedOutputStream.writeMessage(17, getReachableTimeout());
        }
        if (this.f18682u != C7450r.none.getNumber()) {
            codedOutputStream.writeEnum(18, this.f18682u);
        }
        if (this.f18668g != null) {
            codedOutputStream.writeMessage(19, getUpdatedAt());
        }
        if (!this.f18677p.isEmpty()) {
            codedOutputStream.writeString(20, getCoreVersion());
        }
        if (this.f18686y != C7460b.TAMPER_STATE_UNKNOWN.getNumber()) {
            codedOutputStream.writeEnum(21, this.f18686y);
        }
        if (!this.f18687z.isEmpty()) {
            codedOutputStream.writeString(22, getAppBundle());
        }
        if (!this.f18664A.isEmpty()) {
            codedOutputStream.writeString(23, getAdvertisingId());
        }
        if (!this.f18665B.isEmpty()) {
            codedOutputStream.writeString(24, getAppsflyerId());
        }
    }
}
